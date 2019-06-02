package com.vaincecraft.headrewards.head;

import java.io.File;
import java.io.IOException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import com.vaincecraft.headrewards.main.Main;

public class giftboxyml
{
  private File file = new File(Main.getInstance().getDataFolder() + "/giftbox.yml");
  private FileConfiguration conf;
  private static File filee = new File(Main.getInstance().getDataFolder() + "/giftbox.yml");
  private static FileConfiguration conff;
  
  public giftboxyml()
  {
    if (!file.exists())
    {
      try
      {
        file.createNewFile();
        conf = YamlConfiguration.loadConfiguration(file);
        conf.createSection("GiftBoxPos");
        conf.createSection("PlayerInfo");
        conf.set("GiftBoxPos.total", "0");
        conf.createSection("Particles");
        conf.set("Particles.OffsetX", "0.30f");
        conf.set("Particles.OffsetY", "0.25f");
        conf.set("Particles.OffsetZ", "0.30f");
        conf.set("Particles.Velocity", "1f");
        conf.set("Particles.Amount", "50");
        conf.save(file);
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
      return;
    }
    conf = YamlConfiguration.loadConfiguration(file);
  }
  
  public static void Update(Integer X, Integer Y, Integer Z, String Username, boolean Remove, int numRemove, int numBox, String rmsg)
  {
    try
    {
      conff = YamlConfiguration.loadConfiguration(filee);
      if (Username == null && !Remove)
      {
        int conto = 1;
        while (true)
        {
          String control = (String)conff.get("GiftBoxPos.gift" + conto + ".x");
          if (control == null) {
            break;
          }
          conto++;
        }
        conff.set("GiftBoxPos.total", "" + conto);
        conff.set("GiftBoxPos.gift" + conto + ".command1", "1");
        conff.set("GiftBoxPos.gift" + conto + ".command2", "2");
        conff.set("GiftBoxPos.gift" + conto + ".command3", "3");
        conff.set("GiftBoxPos.gift" + conto + ".message1", "1");
        conff.set("GiftBoxPos.gift" + conto + ".message2", "2");
        conff.set("GiftBoxPos.gift" + conto + ".x", "" + X);
        conff.set("GiftBoxPos.gift" + conto + ".y", "" + Y);
        conff.set("GiftBoxPos.gift" + conto + ".z", "" + Z);
      }
      else if (Username != null && !Remove)
      {
        int total = Integer.parseInt(conff.getString("GiftBoxPos.total"));
        while (total > 0)
        {
          int savedX = Integer.parseInt(conff.getString("GiftBoxPos.gift" + total + ".x"));
          int savedY = Integer.parseInt(conff.getString("GiftBoxPos.gift" + total + ".y"));
          int savedZ = Integer.parseInt(conff.getString("GiftBoxPos.gift" + total + ".z"));
          if (savedX == X && savedY == Y && savedZ == Z)
          {
            if (Main.getInstance().getServer().getPlayer(Username).hasPermission("headrewards.use"))
            {
              String controlP = (String)conff.get("PlayerInfo." + Username + ".OpenedGift.open");
              if (controlP == null)
              {
                conff.set("PlayerInfo." + Username + ".OpenedGift.open", "1");
                conff.set("PlayerInfo." + Username + ".OpenedGift.gift1.x", "" + X);
                conff.set("PlayerInfo." + Username + ".OpenedGift.gift1.y", "" + Y);
                conff.set("PlayerInfo." + Username + ".OpenedGift.gift1.z", "" + Z);
              }
              else
              {
                int giftopenum = Integer.parseInt(conff.getString("PlayerInfo." + Username + ".OpenedGift.open"));
                giftopenum++;
                conff.set("PlayerInfo." + Username + ".OpenedGift.open", "" + giftopenum);
                conff.set("PlayerInfo." + Username + ".OpenedGift.gift" + giftopenum + ".x", "" + X);
                conff.set("PlayerInfo." + Username + ".OpenedGift.gift" + giftopenum + ".y", "" + Y);
                conff.set("PlayerInfo." + Username + ".OpenedGift.gift" + giftopenum + ".z", "" + Z);
              }
              //Messaggio conf
              String msg = conff.getString("GiftBoxPos.gift"+numBox+".message1");
              msg = msg.replaceAll("&", "§");
              Main.getInstance().getServer().getPlayerExact(Username).sendMessage(msg);
              //Messaggio conf
              String msg1 = conff.getString("GiftBoxPos.gift"+numBox+".message2");
              msg1 = msg1.replaceAll("&", "§");
              Main.getInstance().getServer().getPlayerExact(Username).sendMessage(msg1);
              //Comando conf
              String cmd = conff.getString("GiftBoxPos.gift" + numBox + ".command1");
              cmd = cmd.replaceAll("%player%", Username);
              Main.getInstance().getServer().dispatchCommand(Main.getInstance().getServer().getConsoleSender(), cmd);
              //Comando conf
              String cmd1 = conff.getString("GiftBoxPos.gift" + numBox + ".command2");
              cmd1 = cmd1.replaceAll("%player%", Username);
              Main.getInstance().getServer().dispatchCommand(Main.getInstance().getServer().getConsoleSender(), cmd1);
              //Comando conf
              String cmd2 = conff.getString("GiftBoxPos.gift" + numBox + ".command3");
              cmd2 = cmd2.replaceAll("%player%", Username);
              Main.getInstance().getServer().dispatchCommand(Main.getInstance().getServer().getConsoleSender(), cmd2);
              String totalbox = conff.getString("GiftBoxPos.total");
              String yourbox = conff.getString("PlayerInfo." + Username + ".OpenedGift.open");
              int yourboxint = Integer.parseInt(conff.getString("PlayerInfo." + Username + ".OpenedGift.open"));
              if (yourboxint == 1)
              {
            	String getmsg = Main.getLangFile().getString("Messages.Opened_One");
            	String colormsg = getmsg.replaceAll("&", "§");
              	String ybox = colormsg.replaceAll("%yourbox%", yourbox);
              	String tbox = ybox.replaceAll("%totalbox%", totalbox);
              	Main.getInstance().getServer().getPlayer(Username).sendMessage(tbox);
              }
              else {
            	  	String getmsg = Main.getLangFile().getString("Messages.Opened_More");
            	  	String colormsg = getmsg.replaceAll("&", "§");
                  	String ybox = colormsg.replaceAll("%yourbox%", yourbox);
                  	String tbox = ybox.replaceAll("%totalbox%", totalbox);
                  	Main.getInstance().getServer().getPlayer(Username).sendMessage(tbox);
                }
            }
            else {
            	String getmsg = Main.getLangFile().getString("Messages.No_Permission");
                String colormsg = getmsg.replaceAll("&", "§");
                Main.getInstance().getServer().getPlayer(Username).sendMessage(colormsg);
            }
            break;
          }
          total--;
        }
      }
      else
      {
        conff.set("GiftBoxPos.gift" + numRemove, null);
        numRemove--;
        conff.set("GiftBoxPos.total", "" + numRemove);
        if(!rmsg.isEmpty()) {
        	Main.getInstance().getServer().getPlayer(Username).sendMessage(rmsg);
        }else {
        	String getmsg = Main.getLangFile().getString("Messages.Break");
            String colormsg = getmsg.replaceAll("&", "§");
            Main.getInstance().getServer().getPlayer(Username).sendMessage(colormsg);
        }
      }
      conff.save(filee);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
  
  public FileConfiguration getFile()
  {
    return conf;
  }
}
