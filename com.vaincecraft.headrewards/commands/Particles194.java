package com.vaincecraft.headrewards.commands;

import com.vaincecraft.headrewards.main.Main;

import net.minecraft.server.v1_9_R2.EnumParticle;
import net.minecraft.server.v1_9_R2.PacketPlayOutWorldParticles;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.craftbukkit.v1_9_R2.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class Particles194
   implements CommandExecutor
{
  @Override
  public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String cmdlabel, String[] args)
  {
	  if (sender instanceof Player || sender instanceof ConsoleCommandSender) {
		  if (cmd.getName().equalsIgnoreCase("particles")) { 
			  if (sender.hasPermission("headrewards.particles"))
			  { //PERMESSO PER IL COMANDO PARTICELLE
				  String getmsg = Main.getLangFile().getString("Messages.Particles");
	              String colormsg = getmsg.replaceAll("&", "§");
	    		  sender.sendMessage(colormsg);
				  float OX = Float.parseFloat(Main.getGift().getString("Particles.OffsetX"));
				  float OY = Float.parseFloat(Main.getGift().getString("Particles.OffsetY"));
				  float OZ = Float.parseFloat(Main.getGift().getString("Particles.OffsetZ"));
				  float V = Float.parseFloat(Main.getGift().getString("Particles.Velocity"));
				  int QT = Integer.parseInt(Main.getGift().getString("Particles.Amount"));
        
				  Bukkit.getServer().getScheduler().runTaskTimer(Main.getInstance(), new Runnable()
				  {
    			  @Override
    			  public void run()
    			  {
    				  int total = Integer.parseInt(Main.getGift().getString("GiftBoxPos.total"));
    				  while (total > 0)
    				  {
    					  float savedX = (float)(Float.parseFloat(Main.getGift().getString("GiftBoxPos.gift" + total + ".x")) + 0.500);
    					  float savedY = (float)(Float.parseFloat(Main.getGift().getString("GiftBoxPos.gift" + total + ".y")) + 0.250);
    					  float savedZ = (float)(Float.parseFloat(Main.getGift().getString("GiftBoxPos.gift" + total + ".z")) + 0.500);
              
    					  PacketPlayOutWorldParticles packet = CreatePacket(savedX, savedY, savedZ, OX, OY, OZ, V, QT);
    					  for (Player p : Bukkit.getOnlinePlayers())
    					  {
    						  String Username = p.getName();
    						  String controlP = (String)Main.getGift().get("PlayerInfo." + Username + ".OpenedGift.open");
    						  if (controlP == null)
    						  {
    							  ((CraftPlayer)p).getHandle().playerConnection.sendPacket(packet);
    						  }
    						  else
    						  {
    							  int openedgift = Integer.parseInt(Main.getGift().getString("PlayerInfo." + Username + ".OpenedGift.open"));
    							  int openedgiftt = Integer.parseInt(Main.getGift().getString("PlayerInfo." + Username + ".OpenedGift.open"));
    							  int test = 0;
    							  while (openedgift > 0)
    							  {
    								  float openX = (float)(Float.parseFloat(Main.getGift().getString("PlayerInfo." + Username + ".OpenedGift.gift" + openedgift + ".x")) + 0.500);
    								  float openY = (float)(Float.parseFloat(Main.getGift().getString("PlayerInfo." + Username + ".OpenedGift.gift" + openedgift + ".y")) + 0.250);
    								  float openZ = (float)(Float.parseFloat(Main.getGift().getString("PlayerInfo." + Username + ".OpenedGift.gift" + openedgift + ".z")) + 0.500);
    								  if (openX != savedX) {
    									  test++;
    								  } else if (openY != savedY) {
    									  test++;
    								  } else if (openZ != savedZ) {
    									  test++;
    								  }
    								  if (test == openedgiftt) {
    									  ((CraftPlayer)p).getHandle().playerConnection.sendPacket(packet);
    								  }
    								  openedgift--;
    							  }
    						  }
    					  }
    					  total--;
    				  }
    			  }
    		  }, 40, 40);
    	   }
      }
	}
    return false;
  }
  
  public static PacketPlayOutWorldParticles CreatePacket(float X, float Y, float Z, float OX, float OY, float OZ, float V, int QT)
  {
    PacketPlayOutWorldParticles CPacket = new PacketPlayOutWorldParticles(EnumParticle.VILLAGER_HAPPY, true, X, Y, Z, OX, OY, OZ, V, QT);
    
    return CPacket;
  }
}
