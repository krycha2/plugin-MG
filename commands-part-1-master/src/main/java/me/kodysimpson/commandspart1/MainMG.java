package me.kodysimpson.commandspart1;

import me.kodysimpson.commandspart1.commands.TestCommand;
import org.bukkit.plugin.java.JavaPlugin;
import me.kodysimpson.commandspart1.commands.GodCommand;

public final class MainMG extends JavaPlugin {

    @Override
    public void onEnable() {

        // komenda na bycie nie smiertelnym
        getCommand("god").setExecutor(new GodCommand());
        getCommand("test").setExecutor(new TestCommand());

    }

}
