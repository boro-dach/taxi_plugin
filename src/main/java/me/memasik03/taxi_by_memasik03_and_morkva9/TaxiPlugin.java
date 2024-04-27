package me.memasik03.taxi_by_memasik03_and_morkva9;

import me.memasik03.taxi_by_memasik03_and_morkva9.commands.forCostumer;

import org.bukkit.plugin.java.JavaPlugin;

public final class TaxiPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("taxi").setExecutor(new forCostumer());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logitech g-102
    }
}
