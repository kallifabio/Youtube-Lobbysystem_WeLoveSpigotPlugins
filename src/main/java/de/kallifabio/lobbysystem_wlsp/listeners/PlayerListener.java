package de.kallifabio.lobbysystem_wlsp.listeners;

import de.kallifabio.lobbysystem_wlsp.Lobbysystem;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Projektname: Youtube-Lobbysystem_WeLoveSpigotPlugins
 * Programmierer: kallifabio
 */

public class PlayerListener implements Listener {

    @EventHandler
    public void onJoin(final PlayerJoinEvent event) {
        final Player player = event.getPlayer();
        event.setJoinMessage(null);
        Lobbysystem.getInstance().getPlayerUtils().setPlayerInventory(player);
    }
}
