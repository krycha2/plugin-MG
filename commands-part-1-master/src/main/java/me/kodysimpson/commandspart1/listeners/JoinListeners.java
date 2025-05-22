package me.kodysimpson.commandspart1.listeners;

import me.kodysimpson.commandspart1.MainMG;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class JoinListeners implements Listener {
    private final MainMG plugin;

    public JoinListeners(MainMG plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        String s = this.plugin.getConfig().getString("join-message");
        if (s != null){
            s = s.replace("%player%", e.getPlayer().getDisplayName());
            e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', s));
        }
    }

}
