package com.vaincecraft.headrewards.main;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Level;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import net.md_5.bungee.api.ChatColor;

public class VersionChecker implements Listener{
	
	public String pluginVersion = "1.9 [1.8-1.13.2 NO 1.9]";
	
	public VersionChecker()
	  {
		if (Main.getInstance().getConfig().getBoolean("CheckUpdate")){
			try
			{
				HttpURLConnection connection = (HttpURLConnection)new URL("https://api.spigotmc.org/legacy/update.php?resource=67366").openConnection();
				connection.setDoOutput(true);
				connection.setRequestMethod("POST");
				String version = new BufferedReader(new InputStreamReader(connection.getInputStream())).readLine();
				if (!pluginVersion.equals(version))
				{
					Main.getInstance().getLogger().log(Level.WARNING, " ");
					Main.getInstance().getLogger().log(Level.WARNING, "         -= HeadRewards =-");
					Main.getInstance().getLogger().log(Level.WARNING, "You do not have the latest version!");
					Main.getInstance().getLogger().log(Level.WARNING, " ");
					Main.getInstance().getLogger().log(Level.WARNING, "Current: " + pluginVersion);
					Main.getInstance().getLogger().log(Level.WARNING, "Latest: " + version);
					Main.getInstance().getLogger().log(Level.WARNING, " ");
				}
				else
				{
					Main.getInstance().getLogger().log(Level.INFO, " ");
					Main.getInstance().getLogger().log(Level.INFO, "         -= HeadRewards =-");
					Main.getInstance().getLogger().log(Level.INFO, "You are running the latest version!");
					Main.getInstance().getLogger().log(Level.INFO, " ");
				}
			}
			catch (IOException e)
			{
				Main.getInstance().getLogger().log(Level.SEVERE, " ");
				Main.getInstance().getLogger().log(Level.SEVERE, "         -= HeadRewards =-");
				Main.getInstance().getLogger().log(Level.SEVERE, "Could not make connection to SpigotMC.org!");
				Main.getInstance().getLogger().log(Level.SEVERE, " ");
				e.printStackTrace();
			}
		}
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent j) {
		Player p = j.getPlayer();
		if(p.hasPermission("headrewards.updates") && Main.getInstance().getConfig().getBoolean("CheckUpdate")) {
			try
		    {
		      HttpURLConnection connection = (HttpURLConnection)new URL("https://api.spigotmc.org/legacy/update.php?resource=67366").openConnection();
		      connection.setDoOutput(true);
		      connection.setRequestMethod("POST");
		      String version = new BufferedReader(new InputStreamReader(connection.getInputStream())).readLine();
		      if (!pluginVersion.equals(version)) {
		    	  p.sendMessage(ChatColor.GRAY + "[HeadRewards]" + ChatColor.RED + "You are not in the latest version, please update the plugin from our spigot page: https://www.spigotmc.org/resources/head-rewards.67366/");
		      }
		    }
		    catch (IOException e)
		    {
		    	e.printStackTrace();
			}
		}
	}

}
