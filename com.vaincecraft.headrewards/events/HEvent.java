package com.vaincecraft.headrewards.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import com.vaincecraft.headrewards.head.giftboxyml;
import com.vaincecraft.headrewards.main.Main;

public class HEvent implements Listener {
  @SuppressWarnings("deprecation")
@EventHandler
  public void onPlace(BlockPlaceEvent e)
  {
    if (e.getItemInHand().getItemMeta().getDisplayName() == null) {
      return;
    }
    if (e.getPlayer().getItemInHand() == null) {
      return;
    }
    
    //Easter
    String headeastername =  Main.getLangFile().getString("Gui.Heads.easter_head_name");
	String eastercolormsg1 = headeastername.replaceAll("&", "§");
	if (e.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(eastercolormsg1))
    {
        if (e.getPlayer().hasPermission("headrewards.place.easter"))
        { //Permesso piazza blocco
        	String getmsg = Main.getLangFile().getString("Messages.Place_Easter");
            String colormsg = getmsg.replaceAll("&", "§");
          e.getPlayer().sendMessage(colormsg);
          int X = e.getBlockPlaced().getLocation().getBlockX();
          int Y = e.getBlockPlaced().getLocation().getBlockY();
          int Z = e.getBlockPlaced().getLocation().getBlockZ();
          giftboxyml.Update(X, Y, Z, null, false, 0, 0, "");
        }
        else
        {
          e.setCancelled(true);
          String getmsg = Main.getLangFile().getString("Messages.No_Permission");
          String colormsg = getmsg.replaceAll("&", "§");
          e.getPlayer().sendMessage(colormsg);
          
        }
    }
	
	//Summer
	String headsummername =  Main.getLangFile().getString("Gui.Heads.summer_head_name");
	String summercolormsg1 = headsummername.replaceAll("&", "§");
	if (e.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(summercolormsg1))
    {
        if (e.getPlayer().hasPermission("headrewards.place.summer"))
        { //Permesso piazza blocco
        	String getmsg = Main.getLangFile().getString("Messages.Place_Summer");
            String colormsg = getmsg.replaceAll("&", "§");
          e.getPlayer().sendMessage(colormsg);
          int X = e.getBlockPlaced().getLocation().getBlockX();
          int Y = e.getBlockPlaced().getLocation().getBlockY();
          int Z = e.getBlockPlaced().getLocation().getBlockZ();
          giftboxyml.Update(X, Y, Z, null, false, 0, 0, "");
        }
        else
        {
          e.setCancelled(true);
          String getmsg = Main.getLangFile().getString("Messages.No_Permission");
          String colormsg = getmsg.replaceAll("&", "§");
          e.getPlayer().sendMessage(colormsg);
        }
    }
	
	//Halloween
	String headhalloweenname =  Main.getLangFile().getString("Gui.Heads.halloween_head_name");
	String halloweencolormsg1 = headhalloweenname.replaceAll("&", "§");
	if (e.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(halloweencolormsg1))
    {
        if (e.getPlayer().hasPermission("headrewards.place.halloween"))
        { //Permesso piazza blocco
        	String getmsg = Main.getLangFile().getString("Messages.Place_Halloween");
            String colormsg = getmsg.replaceAll("&", "§");
          e.getPlayer().sendMessage(colormsg);
          int X = e.getBlockPlaced().getLocation().getBlockX();
          int Y = e.getBlockPlaced().getLocation().getBlockY();
          int Z = e.getBlockPlaced().getLocation().getBlockZ();
          giftboxyml.Update(X, Y, Z, null, false, 0, 0, "");
        }
        else
        {
          e.setCancelled(true);
          String getmsg = Main.getLangFile().getString("Messages.No_Permission");
          String colormsg = getmsg.replaceAll("&", "§");
          e.getPlayer().sendMessage(colormsg);
        }
    }
	
	//Christmas
	String headchristmasname =  Main.getLangFile().getString("Gui.Heads.christma_head_sname");
	String christmascolormsg1 = headchristmasname.replaceAll("&", "§");
    if (e.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(christmascolormsg1))
    {
        if (e.getPlayer().hasPermission("headrewards.place.christmas"))
        { //Permesso piazza blocco
        	String getmsg = Main.getLangFile().getString("Messages.Place_Christmas");
            String colormsg = getmsg.replaceAll("&", "§");
          e.getPlayer().sendMessage(colormsg);
          int X = e.getBlockPlaced().getLocation().getBlockX();
          int Y = e.getBlockPlaced().getLocation().getBlockY();
          int Z = e.getBlockPlaced().getLocation().getBlockZ();
          giftboxyml.Update(X, Y, Z, null, false, 0, 0, "");
        }
        else
        {
        	String getmsg = Main.getLangFile().getString("Messages.No_Permission");
        	String colormsg = getmsg.replaceAll("&", "§");
        	 e.setCancelled(true);
        	 e.getPlayer().sendMessage(colormsg);
        }
    }
    
    //Special
    String mainmenuname =  Main.getLangFile().getString("Gui.Heads.main_menu_name");
    String colormsg1 = mainmenuname.replaceAll("&", "§");
	String nextpagename =  Main.getLangFile().getString("Gui.Heads.next_page_name");
	String colormsg2 = nextpagename.replaceAll("&", "§");
	String previouspagename =  Main.getLangFile().getString("Gui.Heads.previous_page_name");
	String colormsg3 = previouspagename.replaceAll("&", "§");
	String eastername =  Main.getLangFile().getString("Gui.Heads.easter_name");
	String colormsg4 = eastername.replaceAll("&", "§");
	String summername =  Main.getLangFile().getString("Gui.Heads.summer_name");
	String colormsg5 = summername.replaceAll("&", "§");
	String halloweenname =  Main.getLangFile().getString("Gui.Heads.halloween_name");
	String colormsg6 = halloweenname.replaceAll("&", "§");
	String christmasname =  Main.getLangFile().getString("Gui.Heads.christmas_name");
	String colormsg7 = christmasname.replaceAll("&", "§");
    if (e.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(colormsg1) || e.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(colormsg2) || e.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(colormsg3) || e.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(colormsg4) || e.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(colormsg5) || e.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(colormsg6) || e.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(colormsg7))
    {
    	if(e.getPlayer().isOp()) {
    		
    	}
    	else {
    		if (e.getPlayer().hasPermission("*") || e.getPlayer().hasPermission("testagui.*") || e.getPlayer().hasPermission("testagui.questacosaedadenuncia")) {
    			
    		}
    		else {
    			if (e.getPlayer().hasPermission("testagui.questacosaedadenuncia"))
    			{ //Permesso piazza blocco
    				e.getPlayer().sendMessage(e.getPlayer().getItemInHand().getItemMeta().getDisplayName() + ChatColor.GREEN + " Head placed!");
    				int X = e.getBlockPlaced().getLocation().getBlockX();
    				int Y = e.getBlockPlaced().getLocation().getBlockY();
    				int Z = e.getBlockPlaced().getLocation().getBlockZ();
    				giftboxyml.Update(X, Y, Z, null, false, 0, 0, "");
    			}
    			else
    			{
    				e.setCancelled(true);
    				String getmsg = Main.getLangFile().getString("Messages.No_Permission");
    		          String colormsg = getmsg.replaceAll("&", "§");
    		          e.getPlayer().sendMessage(colormsg);
    			}
    		}
        }
    }
  }
  
  @EventHandler
  public void onBreak(BlockBreakEvent r)
  {
    int breakX = r.getBlock().getX();
    int breakY = r.getBlock().getY();
    int breakZ = r.getBlock().getZ();
    
    int total = Integer.parseInt(Main.getGift().getString("GiftBoxPos.total"));
    while (total > 0)
    {
      int savedX = Integer.parseInt(Main.getGift().getString("GiftBoxPos.gift" + total + ".x"));
      int savedY = Integer.parseInt(Main.getGift().getString("GiftBoxPos.gift" + total + ".y"));
      int savedZ = Integer.parseInt(Main.getGift().getString("GiftBoxPos.gift" + total + ".z"));
      if (savedX == breakX && savedY == breakY && savedZ == breakZ)
      {
        if (Main.getInstance().getServer().getPlayer(r.getPlayer().getName()).hasPermission("headrewards.remove")) //Permesso rimozione teste
        {
          giftboxyml.Update(breakX, breakY, breakZ, r.getPlayer().getName(), true, total, 0, "");
        }
        else
        {
        r.setCancelled(true);
        String getmsg = Main.getLangFile().getString("Messages.No_Permission");
        String colormsg = getmsg.replaceAll("&", "§");
        r.getPlayer().sendMessage(colormsg);
        }
        break;
      }
      total--;
    }
  }
  
  public void onJoin(PlayerJoinEvent j) {}
}

