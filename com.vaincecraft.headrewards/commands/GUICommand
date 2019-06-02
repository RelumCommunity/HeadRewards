package com.vaincecraft.headrewards.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.vaincecraft.headrewards.gui.christmas;
import com.vaincecraft.headrewards.gui.easter;
import com.vaincecraft.headrewards.gui.halloween;
import com.vaincecraft.headrewards.gui.headmain;
import com.vaincecraft.headrewards.gui.summer;
import com.vaincecraft.headrewards.main.Main;

public class GUICommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	    if (sender instanceof Player)
	    {
	      if (cmd.getName().equalsIgnoreCase("headrewardsgui")) { //Comando HeadRewards lista comandi
	        if (args.length == 0)
	        {
	          if (sender.hasPermission("headrewards.gui"))
	          {
	        	  Player p = (Player) sender;
	        	  headmain gui = new headmain(p);
	        	  gui.open();
	          }
	          else
	          {
	        		String getmsg = Main.getLangFile().getString("Messages.No_Permission");
	            	String colormsg = getmsg.replaceAll("&", "§");
	            	sender.sendMessage(colormsg); 
	          }
	        }
	        else if (args.length == 1){
	        	if (args[0].equalsIgnoreCase("easter"))
	        	{
	        		if (sender.hasPermission("headrewards.gui"))
	        		{
	        			Player p = (Player) sender;
	        			easter gui = new easter(p);
	        			gui.open();
	        		}
	        		else
	            	{
	            		String getmsg = Main.getLangFile().getString("Messages.No_Permission");
	                	String colormsg = getmsg.replaceAll("&", "§");
	                    sender.sendMessage(colormsg); 
	            	}
	        	}
	        	else if (args[0].equalsIgnoreCase("summer"))
	        	{
	        		if (sender.hasPermission("headrewards.gui"))
	        		{
	        			Player p = (Player) sender;
	        			summer gui = new summer(p);
	        			gui.open();
	        		}
	        		else
	            	{
	            		String getmsg = Main.getLangFile().getString("Messages.No_Permission");
	                	String colormsg = getmsg.replaceAll("&", "§");
	                    sender.sendMessage(colormsg); 
	            	}
	        	}
	        	else if (args[0].equalsIgnoreCase("halloween"))
	        	{
	        		if (sender.hasPermission("headrewards.gui"))
	        		{
	        			Player p = (Player) sender;
	        			halloween gui = new halloween(p);
	        			gui.open();
	        		}
	        		else
	            	{
	            		String getmsg = Main.getLangFile().getString("Messages.No_Permission");
	                	String colormsg = getmsg.replaceAll("&", "§");
	                    sender.sendMessage(colormsg); 
	            	}
	        	}
	        	else if (args[0].equalsIgnoreCase("christams"))
	        	{
	        		if (sender.hasPermission("headrewards.gui"))
	        		{
	        			Player p = (Player) sender;
	        			christmas gui = new christmas(p);
	        			gui.open();
	        		}
	        		else
	            	{
	            		String getmsg = Main.getLangFile().getString("Messages.No_Permission");
	                	String colormsg = getmsg.replaceAll("&", "§");
	                    sender.sendMessage(colormsg); 
	            	}
	        	}
	        }
	      }
	    }
		return false;
	}
	
}
