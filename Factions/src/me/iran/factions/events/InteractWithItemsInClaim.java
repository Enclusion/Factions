package me.iran.factions.events;

import me.iran.factions.Factions;
import me.iran.factions.faction.Faction;
import me.iran.factions.faction.FactionManager;

import org.bukkit.ChatColor;
import org.bukkit.block.BlockState;
import org.bukkit.block.Chest;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class InteractWithItemsInClaim implements Listener {
	
	Factions plugin;
	
	public InteractWithItemsInClaim (Factions plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onInteract(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		
		if(event.getAction() == null) {
			return;
		}
		
		if(event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			BlockState block = event.getClickedBlock().getState();
			
			
			if(FactionManager.getManager().isPlayerInFaction(player)) {
				
				Faction pFaction = FactionManager.getManager().getFactionByPlayer(player);
				
				if(FactionManager.getManager().insideClaim(event.getClickedBlock().getLocation())) {
					
					Faction bFaction = FactionManager.getManager().getClaimByLocation(event.getClickedBlock().getLocation());
					
					if(!pFaction.getName().equals(bFaction.getName())) {
						
						if(!bFaction.isRaidable()) {
							
							switch (block.getType()) {
					            
				               case TRAPPED_CHEST:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Trapped Chests inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				            	   break;
				               case CHEST:
				                   event.setCancelled(true);
				                   player.sendMessage(ChatColor.RED + "Cant open Chests inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case ENDER_CHEST:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Enderchests inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case DISPENSER:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Dispensers inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case HOPPER:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Hoppers inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case DROPPER:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Droppers inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case FURNACE:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Furnaces inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case BREWING_STAND:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Brewing Stands doors inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case BEACON:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Beacons inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case FENCE_GATE:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Fence Gates inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case TRAP_DOOR:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Trapped Doors inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case WOOD_BUTTON:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant click Wood Buttons inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case WOOD_DOOR:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Wood Doors inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case STONE_BUTTON:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant click Stone Buttons inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case IRON_DOOR:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Iron Doors inside of  " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
							default:
								break;
				           }
							
						}
						
					}
				}
				

				
			} else if (!FactionManager.getManager().isPlayerInFaction(player)) {
	
				if(FactionManager.getManager().insideClaim(event.getClickedBlock().getLocation())) {
					
					Faction bFaction = FactionManager.getManager().getClaimByLocation(event.getClickedBlock().getLocation());
						
						if(!bFaction.isRaidable()) {
							
							switch (block.getType()) {
					            
				               case TRAPPED_CHEST:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Trapped Chests inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				            	   break;
				               case CHEST:
				                   event.setCancelled(true);
				                   player.sendMessage(ChatColor.RED + "Cant open Chests inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case ENDER_CHEST:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Enderchests inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case DISPENSER:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Dispensers inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case HOPPER:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Hoppers inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case DROPPER:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Droppers inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case FURNACE:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Furnaces inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case BREWING_STAND:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Brewing Stands doors inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case BEACON:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Beacons inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case FENCE_GATE:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Fence Gates inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case TRAP_DOOR:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Trapped Doors inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case WOOD_BUTTON:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant click Wood Buttons inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case WOOD_DOOR:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Wood Doors inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case STONE_BUTTON:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant click Stone Buttons inside of " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
				               case IRON_DOOR:
				            	   event.setCancelled(true);
				            	   player.sendMessage(ChatColor.RED + "Cant open Iron Doors inside of  " + ChatColor.LIGHT_PURPLE + bFaction.getName() + ChatColor.RED + " claim");
				                   break;
							default:
								break;
				           }

					}

				}

			}

		}
	}

}
