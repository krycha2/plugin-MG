package me.kodysimpson.commandspart1.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class GodCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        //See if a player ran the command
        if (sender instanceof Player){

            //Get the Player object to be able to do things
            Player p = (Player) sender;

            //See if they are invulnerable (cant be hurt)
            if (p.isInvulnerable()){
                //since they are, disable it and send them a message
                p.setInvulnerable(false);
                p.sendMessage(ChatColor.RED + "God mode disabled.");
            }else{
                p.setInvulnerable(true);
                p.sendMessage(ChatColor.GREEN + "God mode enabled.");
            }

        }else{
            System.out.println("Only a player can run this command");
        }
        return true;
    }
}
