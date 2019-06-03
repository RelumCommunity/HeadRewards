package com.vaincecraft.headrewards.gui;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import com.vaincecraft.headrewards.commands.Command;
import com.vaincecraft.headrewards.main.Main;

public class halloween3 {
	
	private Player p;
	
	public halloween3(Player p) {
		this.p = p;
	}
	
	public void open() {
		
		Random rand = new Random();
		int subid1 = rand.nextInt(7);
		int subid2 = rand.nextInt(7);
		int subid3 = rand.nextInt(7);
		int subid4 = rand.nextInt(7);
		int subid5 = rand.nextInt(7);
		int subid6 = rand.nextInt(7);
		int subid7 = rand.nextInt(7);
		int subid8 = rand.nextInt(7);
		int subid9 = rand.nextInt(7);
		int subid10 = rand.nextInt(7);
		int subid11 = rand.nextInt(7);
		int subid12 = rand.nextInt(7);
		int subid13 = rand.nextInt(7);
		int subid14 = rand.nextInt(7);
		int subid15 = rand.nextInt(7);
		int subid16 = rand.nextInt(7);
		int subid17 = rand.nextInt(7);
		int subid18 = rand.nextInt(7);
		int subid19 = rand.nextInt(7);
		int subid20 = rand.nextInt(7);
		int subid21 = rand.nextInt(7);
		
		ItemStack vetro1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) subid1);
		ItemStack vetro2 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) subid2);
		ItemStack vetro3 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) subid3);
		ItemStack vetro4 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) subid4);
		ItemStack vetro5 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) subid5);
		ItemStack vetro6 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) subid6);
		ItemStack vetro7 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) subid7);
		ItemStack vetro8 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) subid8);
		ItemStack vetro9 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) subid9);
		ItemStack vetro10 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) subid10);
		ItemStack vetro11 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) subid11);
		ItemStack vetro12 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) subid12);
		ItemStack vetro13 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) subid13);
		ItemStack vetro14 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) subid14);
		ItemStack vetro15 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) subid15);
		ItemStack vetro16 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) subid16);
		ItemStack vetro17 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) subid17);
		ItemStack vetro18 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) subid18);
		ItemStack vetro19 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) subid19);
		ItemStack vetro20 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) subid20);
		ItemStack vetro21 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) subid21);
		
		String halloween3 =  Main.getLangFile().getString("Gui.halloween_page_3");
		Inventory inv = Bukkit.createInventory(null, 36, halloween3);
		
		inv.setItem(0, vetro1);
		inv.setItem(1, vetro2);
		inv.setItem(2, vetro3);
		inv.setItem(3, vetro4);
		inv.setItem(4, vetro5);
		inv.setItem(5, vetro6);
		inv.setItem(6, vetro7);
		inv.setItem(7, vetro8);
		inv.setItem(8, vetro9);
		inv.setItem(9, vetro10);
		inv.setItem(17, vetro11);
		inv.setItem(18, vetro12);
		inv.setItem(26, vetro13);
		inv.setItem(28, vetro14);
		inv.setItem(29, vetro15);
		inv.setItem(30, vetro16);
		inv.setItem(31, vetro17);
		inv.setItem(32, vetro18);
		inv.setItem(33, vetro19);
		inv.setItem(34, vetro20);
		inv.setItem(35, vetro21);
		
		inv.setItem(10, Command.gethead("halloween29"));
		inv.setItem(11, Command.gethead("halloween30"));
		inv.setItem(12, Command.gethead("halloween31"));
		inv.setItem(13, Command.gethead("halloween32"));
		inv.setItem(14, Command.gethead("halloween33"));
		inv.setItem(15, Command.gethead("halloween34"));
		inv.setItem(27, Command.gethead("testaguileft"));
		this.p.openInventory(inv);
	}
}
