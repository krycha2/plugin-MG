package me.kodysimpson.commandspart1;

import me.kodysimpson.commandspart1.commands.*;
import me.kodysimpson.commandspart1.listeners.JoinListeners;
import org.bukkit.plugin.java.JavaPlugin;

public final class MainMG extends JavaPlugin {

    @Override
    public void onEnable() {

        saveDefaultConfig();

        // komenda na bycie nie smiertelnym
        getCommand("god").setExecutor(new GodCommand());
        getCommand("test").setExecutor(new TestCommand());

        // komendy z 2 argumentami
        getCommand("repeat").setExecutor(new TowargCommand());
        getCommand("fart").setExecutor(new FartCommand());

        //getCommand("setspawn").setExecutor(new SetSpawnCommand(this));

        getServer().getPluginManager().registerEvents(new JoinListeners(this), this);

    }

}
