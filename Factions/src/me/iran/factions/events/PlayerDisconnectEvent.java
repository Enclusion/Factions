package me.iran.factions.events;

import me.iran.factions.Factions;
import me.iran.factions.faction.Faction;
import me.iran.factions.faction.FactionManager;
import net.md_5.bungee.api.ChatColor;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerDisconnectEvent implements Listener {

	Factions plugin;
	
	public PlayerDisconnectEvent (Factions plugin) {
		this.plugin = plugin;
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onQuit(PlayerQuitEvent event) {
		Player player = event.getPlayer();
		
		event.setQuitMessage(null);
		
		if(FactionManager.getManager().isPlayerInFaction(player)) {
			Faction faction = FactionManager.getManager().getFactionByPlayer(player);
			
			for(Player p : Bukkit.getOnlinePlayers()) {
				if(faction.getMemberList().contains(p.getUniqueId().toString())) {
					p.sendMessage(ChatColor.DARK_RED + player.getName() + ChatColor.YELLOW + " is now offline");
				}
			}
			
		}
	}
	
}
