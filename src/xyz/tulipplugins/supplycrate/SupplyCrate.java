package xyz.tulipplugins.supplycrate;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

import com.sk89q.worldguard.protection.managers.RegionManager;

public class SupplyCrate extends JavaPlugin {

	public void onEnable(){
		
		saveDefaultConfig();
		
	}

	public void onDisable() {

	}
	
	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args){
		Player player = (Player) sender;
		if (command.getName().equalsIgnoreCase("testdrop")){
			if (player.hasPermission("supplycrate.testdrop")){
			Location loc = player.getLocation();
			Block block = loc.getBlock();
			 loc.getBlock().setType(Material.CHEST);
			Chest chest = (Chest)block.getState();
	        Inventory inv = chest.getInventory();
	        int itema = getConfig().getInt("itema");
	        int itemaq = getConfig().getInt("itemaq");
	        int itemacolon = getConfig().getInt("itemacolon");
	        int itemb = getConfig().getInt("itemb");
	        int itembq = getConfig().getInt("itembq");
	        int itembcolon = getConfig().getInt("itembcolon");
	        int itemc = getConfig().getInt("itemc");
	        int itemcq = getConfig().getInt("itemcq");
	        int itemccolon = getConfig().getInt("itemccolon");
	        int itemd = getConfig().getInt("itemd");
	        int itemdq = getConfig().getInt("itemdq");
	        int itemdcolon = getConfig().getInt("itemdcolon");
	        int iteme = getConfig().getInt("iteme");
	        int itemeq = getConfig().getInt("itemeq");
	        int itemecolon = getConfig().getInt("itemecolon");
	        int itemf = getConfig().getInt("itemf");
	        int itemfq = getConfig().getInt("itemfq");
	        int itemfcolon = getConfig().getInt("itemfcolon");
	        int itemg = getConfig().getInt("itemg");
	        int itemgq = getConfig().getInt("itemgq");
	        int itemgcolon = getConfig().getInt("itemgcolon");
	        int itemh = getConfig().getInt("itemh");
	        int itemhq = getConfig().getInt("itemhq");
	        int itemhcolon = getConfig().getInt("itemhcolon");
	        int itemi = getConfig().getInt("itemi");
	        int itemiq = getConfig().getInt("itemiq");
	        int itemicolon = getConfig().getInt("itemicolon");
	        int itemj = getConfig().getInt("itemj");
	        int itemjq = getConfig().getInt("itemjq");
	        int itemjcolon = getConfig().getInt("itemjcolon");
	        int itemk = getConfig().getInt("itemk");
	        int itemkq = getConfig().getInt("itemkq");
	        int itemkcolon = getConfig().getInt("itemkcolon");
	        int iteml = getConfig().getInt("iteml");
	        int itemlq = getConfig().getInt("itemlq");
	        int itemlcolon = getConfig().getInt("itemlcolon");
	        int itemm = getConfig().getInt("itemm");
	        int itemmq = getConfig().getInt("itemmq");
	        int itemmcolon = getConfig().getInt("itemmcolon");
	        int itemn = getConfig().getInt("itemn");
	        int itemnq = getConfig().getInt("itemnq");
	        int itemncolon = getConfig().getInt("itemncolon");
	        int itemo = getConfig().getInt("itemo");
	        int itemoq = getConfig().getInt("itemoq");
	        int itemocolon = getConfig().getInt("itemocolon");
	        int itemp = getConfig().getInt("itemp");
	        int itempq = getConfig().getInt("itempq");
	        int itempcolon = getConfig().getInt("itemapolon");
	       ItemStack item1 = new ItemStack(itema, itemaq, (byte) itemacolon);
	       ItemStack item2 = new ItemStack(itemb, itembq, (byte) itembcolon);
	       ItemStack item3 = new ItemStack(itemc, itemcq, (byte) itemccolon);
	       ItemStack item4 = new ItemStack(itemd, itemdq, (byte) itemdcolon);
	       ItemStack item5 = new ItemStack(iteme, itemeq, (byte) itemecolon);
	       ItemStack item6 = new ItemStack(itemf, itemfq, (byte) itemfcolon);
	       ItemStack item7 = new ItemStack(itemg, itemgq, (byte) itemgcolon);
	       ItemStack item8 = new ItemStack(itemh, itemhq, (byte) itemhcolon);
	       ItemStack item9 = new ItemStack(itemi, itemiq, (byte) itemicolon);
	       ItemStack item10 = new ItemStack(itemj, itemjq, (byte) itemjcolon);
	       ItemStack item11 = new ItemStack(itemk, itemkq, (byte) itemkcolon);
	       ItemStack item12 = new ItemStack(iteml, itemlq, (byte) itemlcolon);
	       ItemStack item13 = new ItemStack(itemm, itemmq, (byte) itemmcolon);
	       ItemStack item14 = new ItemStack(itemn, itemnq, (byte) itemncolon);
	       ItemStack item15 = new ItemStack(itemo, itemoq, (byte) itemocolon);
	       ItemStack item16 = new ItemStack(itemp, itempq, (byte) itempcolon);
			
	       inv.addItem(item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12, item13, item14, item15, item16);
			
			
			}
		}
		
		if (command.getName().equalsIgnoreCase("cratedrop")){
			int minutes = getConfig().getInt("minuteDelay");
		
			if (player.hasPermission("supplycrate.cratedrop")){
				
			Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable(){

				@Override
				public void run() {
					
					Random rand = new Random(); 
					int xcoord = rand.nextInt(4000) + -4000; 
					int zcoord = rand.nextInt(4000) + -4000;
					int ycoord = rand.nextInt(65) + 62;
					Location loc = new Location(player.getWorld(), xcoord, ycoord, zcoord);
					Block block = loc.getBlock();
					 loc.getBlock().setType(Material.CHEST);
					Chest chest = (Chest)block.getState();
			        Inventory inv = chest.getInventory();
			        int itema = getConfig().getInt("itema");
			        int itemaq = getConfig().getInt("itemaq");
			        int itemacolon = getConfig().getInt("itemacolon");
			        int itemb = getConfig().getInt("itemb");
			        int itembq = getConfig().getInt("itembq");
			        int itembcolon = getConfig().getInt("itembcolon");
			        int itemc = getConfig().getInt("itemc");
			        int itemcq = getConfig().getInt("itemcq");
			        int itemccolon = getConfig().getInt("itemccolon");
			        int itemd = getConfig().getInt("itemd");
			        int itemdq = getConfig().getInt("itemdq");
			        int itemdcolon = getConfig().getInt("itemdcolon");
			        int iteme = getConfig().getInt("iteme");
			        int itemeq = getConfig().getInt("itemeq");
			        int itemecolon = getConfig().getInt("itemecolon");
			        int itemf = getConfig().getInt("itemf");
			        int itemfq = getConfig().getInt("itemfq");
			        int itemfcolon = getConfig().getInt("itemfcolon");
			        int itemg = getConfig().getInt("itemg");
			        int itemgq = getConfig().getInt("itemgq");
			        int itemgcolon = getConfig().getInt("itemgcolon");
			        int itemh = getConfig().getInt("itemh");
			        int itemhq = getConfig().getInt("itemhq");
			        int itemhcolon = getConfig().getInt("itemhcolon");
			        int itemi = getConfig().getInt("itemi");
			        int itemiq = getConfig().getInt("itemiq");
			        int itemicolon = getConfig().getInt("itemicolon");
			        int itemj = getConfig().getInt("itemj");
			        int itemjq = getConfig().getInt("itemjq");
			        int itemjcolon = getConfig().getInt("itemjcolon");
			        int itemk = getConfig().getInt("itemk");
			        int itemkq = getConfig().getInt("itemkq");
			        int itemkcolon = getConfig().getInt("itemkcolon");
			        int iteml = getConfig().getInt("iteml");
			        int itemlq = getConfig().getInt("itemlq");
			        int itemlcolon = getConfig().getInt("itemlcolon");
			        int itemm = getConfig().getInt("itemm");
			        int itemmq = getConfig().getInt("itemmq");
			        int itemmcolon = getConfig().getInt("itemmcolon");
			        int itemn = getConfig().getInt("itemn");
			        int itemnq = getConfig().getInt("itemnq");
			        int itemncolon = getConfig().getInt("itemncolon");
			        int itemo = getConfig().getInt("itemo");
			        int itemoq = getConfig().getInt("itemoq");
			        int itemocolon = getConfig().getInt("itemocolon");
			        int itemp = getConfig().getInt("itemp");
			        int itempq = getConfig().getInt("itempq");
			        int itempcolon = getConfig().getInt("itemapolon");
			       ItemStack item1 = new ItemStack(itema, itemaq, (byte) itemacolon);
			       ItemStack item2 = new ItemStack(itemb, itembq, (byte) itembcolon);
			       ItemStack item3 = new ItemStack(itemc, itemcq, (byte) itemccolon);
			       ItemStack item4 = new ItemStack(itemd, itemdq, (byte) itemdcolon);
			       ItemStack item5 = new ItemStack(iteme, itemeq, (byte) itemecolon);
			       ItemStack item6 = new ItemStack(itemf, itemfq, (byte) itemfcolon);
			       ItemStack item7 = new ItemStack(itemg, itemgq, (byte) itemgcolon);
			       ItemStack item8 = new ItemStack(itemh, itemhq, (byte) itemhcolon);
			       ItemStack item9 = new ItemStack(itemi, itemiq, (byte) itemicolon);
			       ItemStack item10 = new ItemStack(itemj, itemjq, (byte) itemjcolon);
			       ItemStack item11 = new ItemStack(itemk, itemkq, (byte) itemkcolon);
			       ItemStack item12 = new ItemStack(iteml, itemlq, (byte) itemlcolon);
			       ItemStack item13 = new ItemStack(itemm, itemmq, (byte) itemmcolon);
			       ItemStack item14 = new ItemStack(itemn, itemnq, (byte) itemncolon);
			       ItemStack item15 = new ItemStack(itemo, itemoq, (byte) itemocolon);
			       ItemStack item16 = new ItemStack(itemp, itempq, (byte) itempcolon);
					
			       inv.addItem(item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12, item13, item14, item15, item16);
			       Server server = Bukkit.getServer();
			      broadcastMessage(xcoord, ycoord, zcoord);
				}
				
			
				
				
				
			},minutes*1200, minutes*1200);
			
			
		}
			if (command.getName().equalsIgnoreCase("scconfig")){
				if (player.hasPermission("supplycrate.scconfig")){
					player.sendMessage(ChatColor.GREEN + "Config reloaded.");
				reloadConfig();
				}
			}else{
				player.sendMessage(ChatColor.RED + "You don't have permission");
			}
		
		
		
		
	}
		return false;

	}
	public void broadcastMessage(int xcoord, int ycoord, int zcoord){
		
		Bukkit.broadcastMessage(ChatColor.GREEN + "Supply crate dropped: X: " + xcoord + "Y: " + ycoord + "Z: " + zcoord );
		
		
	}
	
	
}
