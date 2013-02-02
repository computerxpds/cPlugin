package me.comp.cPlugin;

import mc.comp.cPlugin.commands.Foo;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	
	@Override
	public void onDisable()
	{
		
	}
	
	@Override
	public void onEnable()
	{
		
		getServer().getPluginManager().registerEvents(new PlayerListener(), this);
		this.getCommand("foo").setExecutor(new Foo());
	}
}
