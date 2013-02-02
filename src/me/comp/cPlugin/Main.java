package me.comp.cPlugin;

import java.util.logging.Logger;

import mc.comp.cPlugin.commands.Foo;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	   public final Logger logger = Logger.getLogger("Minecraft");
	
	
	@Override
	public void onDisable()
	{
		PluginDescriptionFile pdffile = this.getDescription();
		this.logger.info(pdffile.getName() + "is now disabled.");
	}
	
	@Override
	public void onEnable()
	{
		
		getServer().getPluginManager().registerEvents(new PlayerListener(), this);
		this.getCommand("foo").setExecutor(new Foo());
		PluginDescriptionFile pdffile = this.getDescription();
		this.logger.info(pdffile.getName() + "is now enabled.");
	}
}
