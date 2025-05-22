package me.kodysimpson.commandspart1.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TowargCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] arg) {
        if (sender instanceof Player){
            Player p = (Player) sender;
            if (arg.length == 0){
                p.sendMessage("You did not provide any arguments when running the command. Try again.");
                p.sendMessage("Example: /repeat <message here>");
            } else if (arg.length == 1) {
                String word = arg[0];
                p.sendMessage("Message: " + word);
            }else {
                StringBuilder bilder = new StringBuilder();
                for(int i = 0; i < arg.length; i++){
                    bilder.append(arg[i]);
                    bilder.append(" ");
                }
                String finalMessage = bilder.toString();
                finalMessage = finalMessage.stripTrailing();

                p.sendMessage("Here is a big boi message: " + finalMessage);
            }
        }
        return true;
    }
}
