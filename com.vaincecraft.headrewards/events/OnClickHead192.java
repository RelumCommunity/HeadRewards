package com.vaincecraft.headrewards.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;

import com.vaincecraft.headrewards.head.giftboxyml;
import com.vaincecraft.headrewards.main.Main;

public class OnClickHead192 implements Listener{
	
	  @EventHandler
	  public void onUse(PlayerInteractEvent b)
	  {
	    if (b.getAction().equals(Action.RIGHT_CLICK_BLOCK))
	    {
	      if (b.getHand().equals(EquipmentSlot.HAND)) {
	      int clickedX = b.getClickedBlock().getX();
	      int clickedY = b.getClickedBlock().getY();
	      int clickedZ = b.getClickedBlock().getZ();
	      
	      int total = Integer.parseInt(Main.getGift().getString("GiftBoxPos.total"));
	      while (total > 0)
	      {
	        int saveX = Integer.parseInt(Main.getGift().getString("GiftBoxPos.gift" + total + ".x"));
	        int saveY = Integer.parseInt(Main.getGift().getString("GiftBoxPos.gift" + total + ".y"));
	        int saveZ = Integer.parseInt(Main.getGift().getString("GiftBoxPos.gift" + total + ".z"));
	        if (saveX == clickedX && saveY == clickedY && saveZ == clickedZ)
	        {
	          if (Main.getInstance().getServer().getPlayer(b.getPlayer().getName()).hasPermission("headrewards.use"))
	          {
	            String controlP = (String)Main.getGift().get("PlayerInfo." + b.getPlayer().getName() + ".OpenedGift.open");
	            if (controlP == null)
	            {
	              giftboxyml.Update(clickedX, clickedY, clickedZ, b.getPlayer().getName(), false, 0, total, "");
	            }
	            else
	            {
	            	int openedgift = Integer.parseInt(Main.getGift().getString("PlayerInfo." + b.getPlayer().getName() + ".OpenedGift.open"));
	            	while (openedgift > 0)
	            	{
	            		int openX = Integer.parseInt(Main.getGift().getString("PlayerInfo." + b.getPlayer().getName() + ".OpenedGift.gift" + openedgift + ".x"));
	            		int openY = Integer.parseInt(Main.getGift().getString("PlayerInfo." + b.getPlayer().getName() + ".OpenedGift.gift" + openedgift + ".y"));
	            		int openZ = Integer.parseInt(Main.getGift().getString("PlayerInfo." + b.getPlayer().getName() + ".OpenedGift.gift" + openedgift + ".z"));
	            		if (openX == clickedX && openY == clickedY && openZ == clickedZ)
	            		{
	            			String getmsg = Main.getLangFile().getString("Messages.Already_Opened");
	            			String colormsg = getmsg.replaceAll("&", "§");
	            			b.getPlayer().sendMessage(colormsg);
	            			break;
	            		}
	            		if (openedgift == 1 && openX != clickedX) {
	            			giftboxyml.Update(clickedX, clickedY, clickedZ, b.getPlayer().getName(), false, 0, total, "");
	            		} else if (openedgift == 1 && openY != clickedY) {
	            			giftboxyml.Update(clickedX, clickedY, clickedZ, b.getPlayer().getName(), false, 0, total, "");
	            		} else if (openedgift == 1 && openZ != clickedZ) {
	            			giftboxyml.Update(clickedX, clickedY, clickedZ, b.getPlayer().getName(), false, 0, total, "");
	            		}
	            		openedgift--;
	            	}
	            }
	            
	          }
	          else
	          {
	        	  String getmsg = Main.getLangFile().getString("Messages.No_Permission");
	              String colormsg = getmsg.replaceAll("&", "§");
	              b.getPlayer().sendMessage(colormsg);
	          }
	          break;
	        }
	        total--;
	      }
	    }
	    else {
	    	b.setCancelled(true);
		  }
	    }
	  }

}
