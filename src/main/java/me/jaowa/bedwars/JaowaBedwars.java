package me.jaowa.bedwars;

import org.bukkit.plugin.java.JavaPlugin;

public class JaowaBedwars extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("JaowaBedwars telah aktif!");
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        getLogger().info("JaowaBedwars telah dinonaktifkan!");
    }
}
