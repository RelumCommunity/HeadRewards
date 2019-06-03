package com.vaincecraft.headrewards.main;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.vaincecraft.headrewards.commands.Command;
import com.vaincecraft.headrewards.commands.GUICommand;
import com.vaincecraft.headrewards.commands.Particles1102;
import com.vaincecraft.headrewards.commands.Particles1112;
import com.vaincecraft.headrewards.commands.Particles1122;
import com.vaincecraft.headrewards.commands.Particles113;
import com.vaincecraft.headrewards.commands.Particles1132;
import com.vaincecraft.headrewards.commands.Particles18;
import com.vaincecraft.headrewards.commands.Particles183;
import com.vaincecraft.headrewards.commands.Particles188;
import com.vaincecraft.headrewards.commands.Particles192;
import com.vaincecraft.headrewards.commands.Particles194;
import com.vaincecraft.headrewards.events.GUIEvent;
import com.vaincecraft.headrewards.events.HEvent;
import com.vaincecraft.headrewards.events.OnClickHead18;
import com.vaincecraft.headrewards.events.OnClickHead192;
import com.vaincecraft.headrewards.head.giftboxyml;
import com.vaincecraft.headrewards.messages.LanguageFile;
import com.vaincecraft.headrewards.messages.messages;

import net.md_5.bungee.api.ChatColor;

public class Main
  extends JavaPlugin
{

	
  public static Main plugin;
  public String pluginVersion = "1.9";
  
  public void onEnable() {
	  plugin = this;
	  
	  String versioncheck = Bukkit.getVersion();
	  String version[] = versioncheck.split(" ");
	  if (Bukkit.getVersion().contains("Spigot")) {
		  String servercheck = Bukkit.getVersion();
		  String server[] = servercheck.split("-");
		  plugin.getServer().getConsoleSender().sendMessage("[HeadRewards INFO] " + ChatColor.YELLOW + "HeadRewards using: " + server[1] + " version " + version[1] + version[2]);
	  }
	  else plugin.getServer().getConsoleSender().sendMessage("[HeadRewards INFO] " + ChatColor.YELLOW + "HeadRewards using: " + Bukkit.getVersion() + ChatColor.RED + ("UNTESTED VERSION"));
	  
	  plugin.getServer().getConsoleSender().sendMessage("[HeadRewards] " + ChatColor.GREEN + "HeadRewards has been enabled (V.1.9)");
	  
	  Bukkit.getPluginManager().registerEvents(new GUIEvent(), this);
	  Bukkit.getPluginManager().registerEvents(new HEvent(), this);
	  Bukkit.getPluginManager().registerEvents(new VersionChecker(), this);
	  getCommand("headrewardsgui").setExecutor(new GUICommand());
	  getCommand("headrewards").setExecutor(new Command());
	  if (Bukkit.getVersion().contains("1.8.3")) {
		  getCommand("particles").setExecutor(new Particles183());
		  Bukkit.getPluginManager().registerEvents(new OnClickHead18(), this);
		}
	  else if (Bukkit.getVersion().contains("1.8.4")) {
		  getCommand("particles").setExecutor(new Particles188());
		  Bukkit.getPluginManager().registerEvents(new OnClickHead18(), this);
		}
	  else if (Bukkit.getVersion().contains("1.8.5")) {
		  getCommand("particles").setExecutor(new Particles188());
		  Bukkit.getPluginManager().registerEvents(new OnClickHead18(), this);
		}
	  else if (Bukkit.getVersion().contains("1.8.6")) {
		  getCommand("particles").setExecutor(new Particles188());
		  Bukkit.getPluginManager().registerEvents(new OnClickHead18(), this);
		}
	  else if (Bukkit.getVersion().contains("1.8.7")) {
		  getCommand("particles").setExecutor(new Particles188());
		  Bukkit.getPluginManager().registerEvents(new OnClickHead18(), this);
		}
	  else if (Bukkit.getVersion().contains("1.8.8")) {
		  getCommand("particles").setExecutor(new Particles188());
		  Bukkit.getPluginManager().registerEvents(new OnClickHead18(), this);
		}
	  else if (Bukkit.getVersion().contains("1.8")) {
		  getCommand("particles").setExecutor(new Particles18());
		  Bukkit.getPluginManager().registerEvents(new OnClickHead18(), this);
		}
	  else if (Bukkit.getVersion().contains("1.9.2")) {
		  getCommand("particles").setExecutor(new Particles192());
		  Bukkit.getPluginManager().registerEvents(new OnClickHead192(), this);
		}
	  else if (Bukkit.getVersion().contains("1.9.4")) {
		  getCommand("particles").setExecutor(new Particles194());
		  Bukkit.getPluginManager().registerEvents(new OnClickHead192(), this);
		}
	  else if (Bukkit.getVersion().contains("1.9")) {
		  plugin.getServer().getConsoleSender().sendMessage("[HeadRewards ERROR] " + ChatColor.RED + "HeadRewards does not support this spigot version!");
		  plugin.getServer().getConsoleSender().sendMessage("[HeadRewards ERROR] " + ChatColor.GREEN + "Head open function: Enabled");
		  plugin.getServer().getConsoleSender().sendMessage("[HeadRewards ERROR] " + ChatColor.GREEN + "Head break function: Enabled");
		  plugin.getServer().getConsoleSender().sendMessage("[HeadRewards ERROR] " + ChatColor.GREEN + "Head message function: Enabled");
		  plugin.getServer().getConsoleSender().sendMessage("[HeadRewards ERROR] " + ChatColor.GREEN + "Head commands function: Enabled");
		  plugin.getServer().getConsoleSender().sendMessage("[HeadRewards ERROR] " + ChatColor.RED + "Head open function: Disabled");
		  plugin.getServer().getConsoleSender().sendMessage("[HeadRewards ERROR] " + ChatColor.RED + "Particles function: Disabled");
		}
	  else if (Bukkit.getVersion().contains("1.10.2")) {
		  getCommand("particles").setExecutor(new Particles1102());
		  Bukkit.getPluginManager().registerEvents(new OnClickHead192(), this);
		}
	  else if (Bukkit.getVersion().contains("1.10")) {
		  getCommand("particles").setExecutor(new Particles1102());
		  Bukkit.getPluginManager().registerEvents(new OnClickHead192(), this);
		}
	  else if (Bukkit.getVersion().contains("1.11.1")) {
		  getCommand("particles").setExecutor(new Particles1112());
		  Bukkit.getPluginManager().registerEvents(new OnClickHead192(), this);
		}
	  else if (Bukkit.getVersion().contains("1.11.2")) {
		  getCommand("particles").setExecutor(new Particles1112());
		  Bukkit.getPluginManager().registerEvents(new OnClickHead192(), this);
		}
	  else if (Bukkit.getVersion().contains("1.11")) {
		  getCommand("particles").setExecutor(new Particles1112());
		  Bukkit.getPluginManager().registerEvents(new OnClickHead192(), this);
		}
	  else if (Bukkit.getVersion().contains("1.12.2")) {
		  getCommand("particles").setExecutor(new Particles1122());
		  Bukkit.getPluginManager().registerEvents(new OnClickHead192(), this);
		}
	  else if (Bukkit.getVersion().contains("1.12.1")) {
		  getCommand("particles").setExecutor(new Particles1122());
		  Bukkit.getPluginManager().registerEvents(new OnClickHead192(), this);
		}
	  else if (Bukkit.getVersion().contains("1.12")) {
		  getCommand("particles").setExecutor(new Particles1122());
		  Bukkit.getPluginManager().registerEvents(new OnClickHead192(), this);
		}
	  else if (Bukkit.getVersion().contains("1.13.1")) {
		  getCommand("particles").setExecutor(new Particles1132());
		  Bukkit.getPluginManager().registerEvents(new OnClickHead192(), this);
		}
	  else if (Bukkit.getVersion().contains("1.13.2")) {
		  getCommand("particles").setExecutor(new Particles1132());
		  Bukkit.getPluginManager().registerEvents(new OnClickHead192(), this);
		}
	  else if (Bukkit.getVersion().contains("1.13")) {
		  getCommand("particles").setExecutor(new Particles113());
		  Bukkit.getPluginManager().registerEvents(new OnClickHead192(), this);
		}
	  else 	plugin.getServer().getConsoleSender().sendMessage("[HeadRewards ERROR] " + ChatColor.RED + "HeadRewards does not fully support this spigot version!");

	  getCommand("headreload").setExecutor(new Command());
	  
	  saveDefaultConfig();
	  
	  new giftboxyml();
	  new LanguageFile();
	  new messages();
	  
	  plugin.getServer().dispatchCommand(plugin.getServer().getConsoleSender(), "particles");
  }
  
  public void onDisable() {
	  plugin.getServer().getConsoleSender().sendMessage("[HeadRewards] " + ChatColor.RED + "HeadRewards has been disabled (V.1.9)");
  
  }
  
  public static Main getInstance()
  {
    return plugin;
  }
  
  public static FileConfiguration getGift()
  {
    giftboxyml test = new giftboxyml();
    return test.getFile();
  }
  
  public static void onReload()
  {
	  plugin.reloadConfig();
      plugin.getServer().getPluginManager().disablePlugin(plugin);
      plugin.getServer().getPluginManager().enablePlugin(plugin);
  }
  
  public static FileConfiguration getLangFile() {
	  messages lang = new messages();
	  return lang.getFile();
  }
  
  public static String getLang() {
	  String Lang = Main.getInstance().getConfig().getString("Language");
	  return Lang;
  }
  public static String getParticle() {
	  String Particle = Main.getInstance().getConfig().getString("Particle");
	  return Particle;
  }
  
}
