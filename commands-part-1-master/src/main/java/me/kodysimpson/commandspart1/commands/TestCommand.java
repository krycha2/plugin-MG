package me.kodysimpson.commandspart1.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        //See if a player ran the command
        if (sender instanceof Player){

            //Get the Player object to be able to do things
            Player p = (Player) sender;

            if (p.hasPermission("MG.test")){
                p.sendMessage(ChatColor.BOLD + "" + ChatColor.GREEN + "sfdsaf");
            }else {
                p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "SDSDSAD");
            }


        }else{
            System.out.println("Only a player can run this command");
        }
        return true;
    }
}
