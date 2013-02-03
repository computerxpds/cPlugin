package mc.comp.cPlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Foo implements CommandExecutor {

	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		//Checks if command executor is a player, if not tells them they need to be a player
        if (!(sender instanceof Player)) 
        {
            sender.sendMessage("Sorry, but you need to execute this command as player.");
            return true;
        }
        //if player then run command on player
        if (sender instanceof Player)
		{
			sender.sendMessage("That command worked.");
			return true;
		}
		return false;
		
	 }
}
