package com.vaincecraft.headrewards.commands;

import com.vaincecraft.headrewards.main.Main;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class Particles1132
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
    					  World w = Bukkit.getServer().getWorld("world");
    					  Location loc = new Location(w, savedX, savedY, savedZ);

    					  for (Player p : Bukkit.getOnlinePlayers())
    					  {
    						  String Username = p.getName();
    						  String controlP = (String)Main.getGift().get("PlayerInfo." + Username + ".OpenedGift.open");
    						  if (controlP == null)
    						  {
    						   	  ((CraftPlayer) p).spawnParticle(Particle.VILLAGER_HAPPY, loc, QT, OX, OY, OZ);
    							  
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
    									  ((CraftPlayer) p).spawnParticle(Particle.VILLAGER_HAPPY, loc, QT, OX, OY, OZ);
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
}
