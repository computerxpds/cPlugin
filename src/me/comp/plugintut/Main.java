package me.comp.plugintut;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
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
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(cmd.getName().equalsIgnoreCase("Test"))
		{
			sender.sendMessage("That command worked.");
			return true;
		}
		
		return false;
		
	}
}
