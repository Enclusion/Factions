package me.iran.factions.events;

import me.iran.factions.Factions;
import me.iran.factions.faction.Faction;
import me.iran.factions.faction.FactionManager;
import net.md_5.bungee.api.ChatColor;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerLoginEvent implements Listener {

	Factions plugin;
	
	public PlayerLoginEvent (Factions plugin) {
		this.plugin = plugin;
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		event.setJoinMessage(null);
		
		if(FactionManager.getManager().isPlayerInFaction(player)) {
			Faction faction = FactionManager.getManager().getFactionByPlayer(player);
			
			for(Player p : Bukkit.getOnlinePlayers()) {
				if(faction.getMemberList().contains(p.getUniqueId().toString())) {
					p.sendMessage(ChatColor.DARK_GREEN + player.getName() + ChatColor.YELLOW + " has logged in");
				}
			}
			
			player.sendMessage(ChatColor.YELLOW + "[Announcement] " + ChatColor.LIGHT_PURPLE + faction.getMotd());
		}
	}
}
