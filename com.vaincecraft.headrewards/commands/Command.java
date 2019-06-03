package com.vaincecraft.headrewards.commands;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.vaincecraft.headrewards.head.Heads;
import com.vaincecraft.headrewards.main.Main;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class Command
   implements CommandExecutor
{
  @Override
  public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String cmdlabel, String[] args)
  {
    if (sender instanceof Player || sender instanceof ConsoleCommandSender)
    {
      if (cmd.getName().equalsIgnoreCase("headrewards")) { //Comando HeadRewards lista comandi
        if (args.length == 0)
        {
          if (sender.hasPermission("headrewards.help"))
          {
        	  List<?> help = new ArrayList<String>();
        	  help.clear();
        	  help = Main.getLangFile().getList("Messages.Help");
        	  int size = help.size();
        	  int i = 0;
        	  while(i < size) { 
        		  String getmsg = ""+help.get(i);
        		  String colormsg = getmsg.replaceAll("&", "§");
        		  sender.sendMessage(colormsg);
        		  i++;
        	  }
          }
          else
          {
        	String getmsg = Main.getLangFile().getString("Messages.No_Permission");
        	String colormsg = getmsg.replaceAll("&", "§");
            sender.sendMessage(colormsg);
          }
        }
        // /hr head nometesta
        else if (args.length == 2) { 
          if (args[0].equalsIgnoreCase("head")) { //Comando give testa
        	if (sender.hasPermission("headrewards.head"))
        	{
        		Player p = (Player)sender;
        		p.getInventory().addItem(gethead(args[1]));
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
    if (sender instanceof Player || sender instanceof ConsoleCommandSender) {
      if (cmd.getName().equalsIgnoreCase("headreload")) {
    	  if (sender.hasPermission("headrewards.reload")) {
    		  String getmsg = Main.getLangFile().getString("Messages.Plugin_Reload");
    		  if(!(getmsg == null)) {
    			  String colormsg = getmsg.replaceAll("&", "§");
        		  sender.sendMessage(colormsg);
    		  }else {
    			  sender.sendMessage(ChatColor.GRAY + "[HeadRewards] " + ChatColor.RED + "HeadRewards Reloaded!");
    		  }
    		  Main.onReload();
    	  }
      }
    }
    return false;
  }
//FUNZIONI DA ASSOCIARE AI COMANDI
  public static ItemStack gethead(String name) { // Funzione per prenere la testa
	int a = 0;
	for(Heads head : Heads.values()) {
		if(head.getName().equals(name)) {
			return head.getItemStack();
		}else if(a == 131){
			return head.ErrorItem();
		}else {
			a = a + 1;
		}
	}
	
	return null;
    
  }
  
  public static ItemStack customhead(String url, String name)
  { //Funzione per creare teste per l'apposito comando
    ItemStack head = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
    if (url.isEmpty()) {
      return head;
    }
    SkullMeta headmeta = (SkullMeta)head.getItemMeta();
    GameProfile profile = new GameProfile(UUID.randomUUID(), null);
    
    profile.getProperties().put("textures", new Property("textures", url));
    try
    {
      Field profileField = headmeta.getClass().getDeclaredField("profile");
      profileField.setAccessible(true);
      profileField.set(headmeta, profile);
    }
    catch (IllegalArgumentException|NoSuchFieldException|SecurityException|IllegalAccessException error)
    {
      error.printStackTrace();
    }
    List<String> customlore = new ArrayList<String>();

    int contoeaster = 0;
    int contosummer = 0;
    int contohalloween = 0;
	int contochristmas = 0;
	
	//Easter
	String headeastername =  Main.getLangFile().getString("Gui.Heads.easter_head_name");
	String eastercolormsg1 = headeastername.replaceAll("&", "§");
	String headeasterlore =  Main.getLangFile().getString("Gui.Heads.easter_head_lore");
	String eastercolormsg2 = headeasterlore.replaceAll("&", "§");
	while(true) {
		contoeaster++;
		
		if (name.equalsIgnoreCase("easter" + contoeaster)) {
			customlore.clear();
		    customlore.add(eastercolormsg2 + " " + contoeaster);
		    headmeta.setDisplayName(eastercolormsg1);
			break;
		}
		
		if (contoeaster == 23) {
			break;
		}
	}
	
	//Summer
	String headsummername =  Main.getLangFile().getString("Gui.Heads.summer_head_name");
	String summercolormsg1 = headsummername.replaceAll("&", "§");
	String headsummerlore =  Main.getLangFile().getString("Gui.Heads.summer_head_lore");
	String summercolormsg2 = headsummerlore.replaceAll("&", "§");
	while(true) {
		contosummer++;
		
		if (name.equalsIgnoreCase("summer" + contosummer)) {
			customlore.clear();
		    customlore.add(summercolormsg2 + " " + contosummer);
		    headmeta.setDisplayName(summercolormsg1);
			break;
		}
		
		if (contosummer == 27) {
			break;
		}
	}
	
	//Halloween
	String headhalloweenname =  Main.getLangFile().getString("Gui.Heads.halloween_head_name");
	String halloweencolormsg1 = headhalloweenname.replaceAll("&", "§");
	String headhalloweenlore =  Main.getLangFile().getString("Gui.Heads.halloween_head_lore");
	String halloweencolormsg2 = headhalloweenlore.replaceAll("&", "§");
	while(true) {
		contohalloween++;
		
		if (name.equalsIgnoreCase("halloween" + contohalloween)) {
			customlore.clear();
		    customlore.add(halloweencolormsg2+ " " + contohalloween);
		    headmeta.setDisplayName(halloweencolormsg1);
			break;
		}
		
		if (contohalloween == 34) {
			break;
		}
	}
	
	//Christmas
	String headchristmasname =  Main.getLangFile().getString("Gui.Heads.christmas_head_name");
	String christmascolormsg1 = headchristmasname.replaceAll("&", "§");
	String headchristmaslore =  Main.getLangFile().getString("Gui.Heads.christmas_head_lore");
	String christmascolormsg2 = headchristmaslore.replaceAll("&", "§");
	while(true) {
		contochristmas++;
		
		if (name.equalsIgnoreCase("christmas" + contochristmas)) {
			customlore.clear();
		    customlore.add(christmascolormsg2 + " " + contochristmas);
		    headmeta.setDisplayName(christmascolormsg1);
			break;
		}
		
		if (contochristmas == 41) {
			break;
		}
	}
    
    //Special
	String mainmenuname =  Main.getLangFile().getString("Gui.Heads.main_menu_name");
	String colormsg1 = mainmenuname.replaceAll("&", "§");
	String mainmenulore =  Main.getLangFile().getString("Gui.Heads.main_menu_lore");
	String colormsg2 = mainmenulore.replaceAll("&", "§");
	String nextpagename =  Main.getLangFile().getString("Gui.Heads.next_page_name");
	String colormsg3 = nextpagename.replaceAll("&", "§");
	String nextpagelore =  Main.getLangFile().getString("Gui.Heads.next_page_lore");
	String colormsg4 = nextpagelore.replaceAll("&", "§");
	String previouspagename =  Main.getLangFile().getString("Gui.Heads.previous_page_name");
	String colormsg5 = previouspagename.replaceAll("&", "§");
	String previouspagelore =  Main.getLangFile().getString("Gui.Heads.previous_page_lore");
	String colormsg6 = previouspagelore.replaceAll("&", "§");
	String eastername =  Main.getLangFile().getString("Gui.Heads.easter_name");
	String colormsg7 = eastername.replaceAll("&", "§");
	String easterlore =  Main.getLangFile().getString("Gui.Heads.easter_lore");
	String colormsg8 = easterlore.replaceAll("&", "§");
	String summername =  Main.getLangFile().getString("Gui.Heads.summer_name");
	String colormsg9 = summername.replaceAll("&", "§");
	String summerlore =  Main.getLangFile().getString("Gui.Heads.summer_lore");
	String colormsg10 = summerlore.replaceAll("&", "§");
	String halloweenname =  Main.getLangFile().getString("Gui.Heads.halloween_name");
	String colormsg11 = halloweenname.replaceAll("&", "§");
	String halloweenlore =  Main.getLangFile().getString("Gui.Heads.halloween_lore");
	String colormsg12 = halloweenlore.replaceAll("&", "§");
	String christmasname =  Main.getLangFile().getString("Gui.Heads.christmas_name");
	String colormsg13 = christmasname.replaceAll("&", "§");
	String christmaslore =  Main.getLangFile().getString("Gui.Heads.christmas_lore");
	String colormsg14 = christmaslore.replaceAll("&", "§");
    if (name.equalsIgnoreCase("testaguiback")) {
    	customlore.clear();
    	customlore.add(colormsg2);
    	headmeta.setDisplayName(colormsg1);
    }
    else if (name.equalsIgnoreCase("testaguiright")) {
    	customlore.clear();
    	customlore.add(colormsg4);
    	headmeta.setDisplayName(colormsg3);
    }
    else if (name.equalsIgnoreCase("testaguileft")) {
    	customlore.clear();
    	customlore.add(colormsg6);
    	headmeta.setDisplayName(colormsg5);
    }
    else if (name.equalsIgnoreCase("testaguieaster")) {
    	customlore.clear();
    	customlore.add(colormsg8);
    	headmeta.setDisplayName(colormsg7);
    }
    else if (name.equalsIgnoreCase("testaguisummer")) {
    	customlore.clear();
    	customlore.add(colormsg10);
    	headmeta.setDisplayName(colormsg9);
    }
    else if (name.equalsIgnoreCase("testaguihalloween")) {
    	customlore.clear();
    	customlore.add(colormsg12);
    	headmeta.setDisplayName(colormsg11);
    }
    else if (name.equalsIgnoreCase("testaguichristmas")) {
    	customlore.clear();
    	customlore.add(colormsg14);
    	headmeta.setDisplayName(colormsg13);
    }
    headmeta.setLore(customlore);
    head.setItemMeta(headmeta);
    
    return head;
  }
}
