package de.kallifabio.lobbysystem_wlsp;

import de.kallifabio.lobbysystem_wlsp.listeners.PlayerListener;
import de.kallifabio.lobbysystem_wlsp.utils.PlayerUtils;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Projektname: Youtube-Lobbysystem_WeLoveSpigotPlugins
 * Programmierer: kallifabio
 */

public class Lobbysystem extends JavaPlugin {

    private static Lobbysystem instance;
    private PlayerUtils playerUtils;

    @Override
    public void onEnable() {
        instance = this;
        init();

        this.playerUtils = new PlayerUtils();
    }
    
    private void init() {
        registerEvents(Bukkit.getPluginManager());
    }
    
    private void registerCommands() {
        
    }
    
    private void registerEvents(final PluginManager pluginManager) {
        pluginManager.registerEvents(new PlayerListener(), this);
    }

    public static Lobbysystem getInstance() {
        return instance;
    }

    public PlayerUtils getPlayerUtils() {
        return playerUtils;
    }
}
