package com.qbasty.oaantidispensercrash;

import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {

        this.getServer().getPluginManager().registerEvents((Listener)new crash(), (Plugin)this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
