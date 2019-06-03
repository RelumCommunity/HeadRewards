package com.vaincecraft.headrewards.messages;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import com.vaincecraft.headrewards.main.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class LanguageFile
{
  private static final String[] LANG_FILES = { "en_US", "it_IT", "es_ES" };
  private final String FILE_NAME = Main.getInstance().getConfig().getString("Language") + ".yml";
  private FileConfiguration lang;
  private File langFile;
  
  public LanguageFile()
  {
    for (String fileName : LANG_FILES) {
      try
      {
        copyFile(fileName);
      }
      catch (IOException exception)
      {
        System.out.println(exception);
        Bukkit.getServer().getConsoleSender().sendMessage("[HeadRewards INFO] " + ChatColor.RED + "Error occured while initializing '" + fileName + "'!");
      }
    }
    setup();
  }
  
  public void setup()
  {
    langFile = new File(Main.getInstance().getDataFolder() + "/lang/", FILE_NAME);
    lang = YamlConfiguration.loadConfiguration(langFile);
  }
  
  public FileConfiguration get()
  {
    return lang;
  }
  
  private void copyFile(String fileName)
    throws IOException
  {
    File file = new File(Main.getInstance().getDataFolder() + "/lang/", fileName + ".yml");
    InputStream in = getClass().getResourceAsStream("/lang/" + fileName + ".yml");
    if (!file.exists())
    {
      Main.getInstance().getDataFolder().mkdirs();
      file.getParentFile().mkdirs();
      file.createNewFile();
      Bukkit.getServer().getConsoleSender().sendMessage("[HeadRewards INFO] " + ChatColor.YELLOW + "Creating language file '" + fileName + "'.");
    }
    else
    {
      return;
    }
    OutputStream out = new FileOutputStream(file);
    byte[] buffer = new byte['?'];
    int current = 0;
    while ((current = in.read(buffer)) > -1) {
      out.write(buffer, 0, current);
    }
    out.close();
    in.close();
  }
}
