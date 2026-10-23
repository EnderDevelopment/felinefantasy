package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("CatAbilities plugin has been enabled!");
        // Register commands and events
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("CatAbilities plugin has been disabled!");
    }
}