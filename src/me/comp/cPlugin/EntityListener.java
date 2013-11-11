package me.comp.cPlugin;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class EntityListener extends Main implements Listener {
	Main plugin;
//THE SHEEP CANNON!
	public EntityListener(Main instance){
		plugin = instance;
	}
	
	@EventHandler
	public void getLocation(Location loc) {
		
	}
}
