package com.vaincecraft.headrewards.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import com.vaincecraft.headrewards.commands.Command;
import com.vaincecraft.headrewards.gui.christmas;
import com.vaincecraft.headrewards.gui.christmas2;
import com.vaincecraft.headrewards.gui.christmas3;
import com.vaincecraft.headrewards.gui.easter;
import com.vaincecraft.headrewards.gui.easter2;
import com.vaincecraft.headrewards.gui.halloween;
import com.vaincecraft.headrewards.gui.halloween2;
import com.vaincecraft.headrewards.gui.halloween3;
import com.vaincecraft.headrewards.gui.headmain;
import com.vaincecraft.headrewards.gui.mobegg;
import com.vaincecraft.headrewards.gui.mobegg2;
import com.vaincecraft.headrewards.gui.mobegg3;
import com.vaincecraft.headrewards.gui.mobegg4;
import com.vaincecraft.headrewards.gui.mobegg5;
import com.vaincecraft.headrewards.gui.summer;
import com.vaincecraft.headrewards.gui.summer2;
import com.vaincecraft.headrewards.main.Main;

public class GUIEvent implements Listener{
	
	@EventHandler
	public void onClick(InventoryClickEvent ic) {
		
		//Menu
		String mainmenu =  Main.getLangFile().getString("Gui.main_menu");
		//Easter
		String easter1 =  Main.getLangFile().getString("Gui.easter_page_1");
		String easter2 =  Main.getLangFile().getString("Gui.easter_page_2");
		//Summer
		String summer1 =  Main.getLangFile().getString("Gui.summer_page_1");
		String summer2 =  Main.getLangFile().getString("Gui.summer_page_2");
		//Halloween
		String halloween1 =  Main.getLangFile().getString("Gui.halloween_page_1");
		String halloween2 =  Main.getLangFile().getString("Gui.halloween_page_2");
		String halloween3 =  Main.getLangFile().getString("Gui.halloween_page_3");
		//Christmas
		String christmas1 =  Main.getLangFile().getString("Gui.christmas_page_1");
		String christmas2 =  Main.getLangFile().getString("Gui.christmas_page_2");
		String christmas3 =  Main.getLangFile().getString("Gui.christmas_page_3");
		//MobEgg
		String mobegg1 = Main.getLangFile().getString("Gui.mobegg_page_1");
		String mobegg2 = Main.getLangFile().getString("Gui.mobegg_page_2");
		String mobegg3 = Main.getLangFile().getString("Gui.mobegg_page_3");
		String mobegg4 = Main.getLangFile().getString("Gui.mobegg_page_4");
		String mobegg5 = Main.getLangFile().getString("Gui.mobegg_page_5");
		
		if (ic.getCurrentItem() == null) {
			return;
		}
		
		if (ic.getClickedInventory().getTitle().equals(mainmenu)) {
			
			if (ic.getCurrentItem().equals(Command.gethead("testaguieaster"))) {
				Player p = (Player) ic.getWhoClicked();
				easter gui = new easter(p);
				gui.open();
			}
			else if (ic.getCurrentItem().equals(Command.gethead("testaguisummer"))) {
				Player p = (Player) ic.getWhoClicked();
				summer gui = new summer(p);
				gui.open();
			}
			else if (ic.getCurrentItem().equals(Command.gethead("testaguihalloween"))) {
				Player p = (Player) ic.getWhoClicked();
				halloween gui = new halloween(p);
				gui.open();
				
			}
			else if (ic.getCurrentItem().equals(Command.gethead("testaguichristmas"))) {
				Player p = (Player) ic.getWhoClicked();
				christmas gui = new christmas(p);
				gui.open();
				
			}
			else if(ic.getCurrentItem().equals(Command.gethead("testaguimobegg"))) {
				Player p = (Player) ic.getWhoClicked();
				mobegg gui = new mobegg(p);
				gui.open();
			}
			
			ic.setCancelled(true);
		}
		else if (ic.getClickedInventory().getTitle().equals(easter1)) {
			
			int conto = 0;
			while(true) {
				conto++;
				
				if (ic.getCurrentItem().equals(Command.gethead("easter" + conto))) {
					ic.getWhoClicked().getInventory().addItem(Command.gethead("easter" + conto));
					break;
				}
				
				if (conto == 14) {
					break;
				}
			}
			if (ic.getCurrentItem().equals(Command.gethead("testaguiback"))) {
				Player p = (Player) ic.getWhoClicked();
				headmain gui = new headmain(p);
				gui.open();
			}
			else if (ic.getCurrentItem().equals(Command.gethead("testaguiright"))) {
				Player p = (Player) ic.getWhoClicked();
				easter2 gui = new easter2(p);
				gui.open();
			}
			
			ic.setCancelled(true);
		}
		else if (ic.getClickedInventory().getTitle().equals(easter2)) {
			
			int conto = 14;
			
			while(true) {
				conto++;
				
				if (ic.getCurrentItem().equals(Command.gethead("easter" + conto))) {
					ic.getWhoClicked().getInventory().addItem(Command.gethead("easter" + conto));
					break;
				}
				
				if (conto == 23) {
					break;
				}
			}
			if (ic.getCurrentItem().equals(Command.gethead("testaguileft"))) {
				Player p = (Player) ic.getWhoClicked();
				easter gui = new easter(p);
				gui.open();
			}
			
			ic.setCancelled(true);
		}
		
		//Summer
		else if (ic.getClickedInventory().getTitle().equals(summer1)) {
			
			int conto = 0;
			
			while(true) {
				conto++;
				
				if (ic.getCurrentItem().equals(Command.gethead("summer" + conto))) {
					ic.getWhoClicked().getInventory().addItem(Command.gethead("summer" + conto));
					break;
				}
				
				if (conto == 14) {
					break;
				}
			}
			if (ic.getCurrentItem().equals(Command.gethead("testaguiback"))) {
				Player p = (Player) ic.getWhoClicked();
				headmain gui = new headmain(p);
				gui.open();
			}
			else if (ic.getCurrentItem().equals(Command.gethead("testaguiright"))) {
				Player p = (Player) ic.getWhoClicked();
				summer2 gui = new summer2(p);
				gui.open();
			}
			ic.setCancelled(true);
		}
		else if (ic.getClickedInventory().getTitle().equals(summer2)) {
			
			
			int conto = 14;
			
			while(true) {
				conto++;
				
				if (ic.getCurrentItem().equals(Command.gethead("summer" + conto))) {
					ic.getWhoClicked().getInventory().addItem(Command.gethead("summer" + conto));
					break;
				}
				
				if (conto == 27) {
					break;
				}
			}
			if (ic.getCurrentItem().equals(Command.gethead("testaguileft"))) {
				Player p = (Player) ic.getWhoClicked();
				summer gui = new summer(p);
				gui.open();
			}
			
			ic.setCancelled(true);
		}
		
		//Halloween
		else if (ic.getClickedInventory().getTitle().equals(halloween1)) {
			
			int conto = 0;
			
			while(true) {
				conto++;
				
				if (ic.getCurrentItem().equals(Command.gethead("halloween" + conto))) {
					ic.getWhoClicked().getInventory().addItem(Command.gethead("halloween" + conto));
					break;
				}
				
				if (conto == 14) {
					break;
				}
			}
			if (ic.getCurrentItem().equals(Command.gethead("testaguiback"))) {
				Player p = (Player) ic.getWhoClicked();
				headmain gui = new headmain(p);
				gui.open();
			}
			else if (ic.getCurrentItem().equals(Command.gethead("testaguiright"))) {
				Player p = (Player) ic.getWhoClicked();
				halloween2 gui = new halloween2(p);
				gui.open();
			}
			
			ic.setCancelled(true);
		}
		else if (ic.getClickedInventory().getTitle().equals(halloween2)) {
			
			int conto = 14;
			
			while(true) {
				conto++;
				
				if (ic.getCurrentItem().equals(Command.gethead("halloween" + conto))) {
					ic.getWhoClicked().getInventory().addItem(Command.gethead("halloween" + conto));
					break;
				}
				
				if (conto == 28) {
					break;
				}
			}
			if (ic.getCurrentItem().equals(Command.gethead("testaguileft"))) {
				Player p = (Player) ic.getWhoClicked();
				halloween gui = new halloween(p);
				gui.open();
			}
			else if (ic.getCurrentItem().equals(Command.gethead("testaguiright"))) {
				Player p = (Player) ic.getWhoClicked();
				halloween3 gui = new halloween3(p);
				gui.open();
			}
			
			ic.setCancelled(true);
		}
		else if (ic.getClickedInventory().getTitle().equals(halloween3)) {
			
			int conto = 28;
			
			while(true) {
				conto++;
				
				if (ic.getCurrentItem().equals(Command.gethead("halloween" + conto))) {
					ic.getWhoClicked().getInventory().addItem(Command.gethead("halloween" + conto));
					break;
				}
				
				if (conto == 34) {
					break;
				}
			}
			if (ic.getCurrentItem().equals(Command.gethead("testaguileft"))) {
				Player p = (Player) ic.getWhoClicked();
				halloween2 gui = new halloween2(p);
				gui.open();
			}
			
			ic.setCancelled(true);
		}
		
		//Christmas
		else if (ic.getClickedInventory().getTitle().equals(christmas1)) {
			
			int conto = 0;
			
			while(true) {
				conto++;
				
				if (ic.getCurrentItem().equals(Command.gethead("christmas" + conto))) {
					ic.getWhoClicked().getInventory().addItem(Command.gethead("christmas" + conto));
					break;
				}
				
				if (conto == 14) {
					break;
				}
			}
			if (ic.getCurrentItem().equals(Command.gethead("testaguiback"))) {
				Player p = (Player) ic.getWhoClicked();
				headmain gui = new headmain(p);
				gui.open();
			}
			else if (ic.getCurrentItem().equals(Command.gethead("testaguiright"))) {
				Player p = (Player) ic.getWhoClicked();
				christmas2 gui = new christmas2(p);
				gui.open();
			}
			
			ic.setCancelled(true);
		}
		else if (ic.getClickedInventory().getTitle().equals(christmas2)) {

			int conto = 14;
			
			while(true) {
				conto++;
				
				if (ic.getCurrentItem().equals(Command.gethead("christmas" + conto))) {
					ic.getWhoClicked().getInventory().addItem(Command.gethead("christmas" + conto));
					break;
				}
				
				if (conto == 28) {
					break;
				}
			}
			if (ic.getCurrentItem().equals(Command.gethead("testaguileft"))) {
				Player p = (Player) ic.getWhoClicked();
				christmas gui = new christmas(p);
				gui.open();
			}
			else if (ic.getCurrentItem().equals(Command.gethead("testaguiright"))) {
				Player p = (Player) ic.getWhoClicked();
				christmas3 gui = new christmas3(p);
				gui.open();
			}
			
			ic.setCancelled(true);
		}
		else if (ic.getClickedInventory().getTitle().equals(christmas3)) {

			int conto = 28;
			
			while(true) {
				conto++;
				
				if (ic.getCurrentItem().equals(Command.gethead("christmas" + conto))) {
					ic.getWhoClicked().getInventory().addItem(Command.gethead("christmas" + conto));
					break;
				}
				
				if (conto == 41) {
					break;
				}
			}
			if (ic.getCurrentItem().equals(Command.gethead("testaguileft"))) {
				Player p = (Player) ic.getWhoClicked();
				christmas2 gui = new christmas2(p);
				gui.open();
			}
			
			ic.setCancelled(true);
		}
		
		//MobEgg
		else if (ic.getClickedInventory().getTitle().equals(mobegg1)) {
			
			int conto = 0;
			
			while(true) {
				conto++;
				
				if (ic.getCurrentItem().equals(Command.gethead("mobegg" + conto))) {
					ic.getWhoClicked().getInventory().addItem(Command.gethead("mobegg" + conto));
					break;
				}
				
				if (conto == 14) {
					break;
				}
			}
			if (ic.getCurrentItem().equals(Command.gethead("testaguiback"))) {
				Player p = (Player) ic.getWhoClicked();
				headmain gui = new headmain(p);
				gui.open();
			}
			else if (ic.getCurrentItem().equals(Command.gethead("testaguiright"))) {
				Player p = (Player) ic.getWhoClicked();
				mobegg2 gui = new mobegg2(p);
				gui.open();
			}
			
			ic.setCancelled(true);
		}
		else if (ic.getClickedInventory().getTitle().equals(mobegg2)) {

			int conto = 14;
			
			while(true) {
				conto++;
				
				if (ic.getCurrentItem().equals(Command.gethead("mobegg" + conto))) {
					ic.getWhoClicked().getInventory().addItem(Command.gethead("mobegg" + conto));
					break;
				}
				
				if (conto == 28) {
					break;
				}
			}
			if (ic.getCurrentItem().equals(Command.gethead("testaguileft"))) {
				Player p = (Player) ic.getWhoClicked();
				mobegg gui = new mobegg(p);
				gui.open();
			}
			else if (ic.getCurrentItem().equals(Command.gethead("testaguiright"))) {
				Player p = (Player) ic.getWhoClicked();
				mobegg3 gui = new mobegg3(p);
				gui.open();
			}
			
			ic.setCancelled(true);
		}
		else if (ic.getClickedInventory().getTitle().equals(mobegg3)) {

			int conto = 28;
			
			while(true) {
				conto++;
				
				if (ic.getCurrentItem().equals(Command.gethead("mobegg" + conto))) {
					ic.getWhoClicked().getInventory().addItem(Command.gethead("mobegg" + conto));
					break;
				}
				
				if (conto == 42) {
					break;
				}
			}
			if (ic.getCurrentItem().equals(Command.gethead("testaguileft"))) {
				Player p = (Player) ic.getWhoClicked();
				mobegg2 gui = new mobegg2(p);
				gui.open();
			}
			else if (ic.getCurrentItem().equals(Command.gethead("testaguiright"))) {
				Player p = (Player) ic.getWhoClicked();
				mobegg4 gui = new mobegg4(p);
				gui.open();
			}
			
			ic.setCancelled(true);
		}
		else if (ic.getClickedInventory().getTitle().equals(mobegg4)) {

			int conto = 42;
			
			while(true) {
				conto++;
				
				if (ic.getCurrentItem().equals(Command.gethead("mobegg" + conto))) {
					ic.getWhoClicked().getInventory().addItem(Command.gethead("mobegg" + conto));
					break;
				}
				
				if (conto == 56) {
					break;
				}
			}
			if (ic.getCurrentItem().equals(Command.gethead("testaguileft"))) {
				Player p = (Player) ic.getWhoClicked();
				mobegg3 gui = new mobegg3(p);
				gui.open();
			}
			else if (ic.getCurrentItem().equals(Command.gethead("testaguiright"))) {
				Player p = (Player) ic.getWhoClicked();
				mobegg5 gui = new mobegg5(p);
				gui.open();
			}
			
			ic.setCancelled(true);
		}
		else if (ic.getClickedInventory().getTitle().equals(mobegg5)) {

			int conto = 56;
			
			while(true) {
				conto++;
				
				if (ic.getCurrentItem().equals(Command.gethead("mobegg" + conto))) {
					ic.getWhoClicked().getInventory().addItem(Command.gethead("mobegg" + conto));
					break;
				}
				
				if (conto == 57) {
					break;
				}
			}
			if (ic.getCurrentItem().equals(Command.gethead("testaguileft"))) {
				Player p = (Player) ic.getWhoClicked();
				mobegg4 gui = new mobegg4(p);
				gui.open();
			}
			
			ic.setCancelled(true);
		}
		
		
	}

}
