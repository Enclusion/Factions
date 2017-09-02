package me.iran.factions.events;

import java.util.Iterator;
import java.util.List;

import org.bukkit.block.Block;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

import me.iran.factions.Factions;
import me.iran.factions.faction.FactionManager;

public class ExplosionEvents implements Listener {
	
	Factions plugin;
	
	public ExplosionEvents (Factions plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onExplode(EntityExplodeEvent event) {

		List<Block> destroyed = event.blockList();
        
		Iterator<Block> it = destroyed.iterator();
        
		if (event.getEntity() instanceof TNTPrimed) {
			while (it.hasNext()) {
				Block block = it.next();
				if (FactionManager.getManager().insideClaim(block.getLocation()))
					it.remove();
			}
		}
		

	}

}
