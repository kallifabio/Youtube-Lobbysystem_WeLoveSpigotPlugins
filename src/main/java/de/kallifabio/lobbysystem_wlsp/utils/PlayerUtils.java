package de.kallifabio.lobbysystem_wlsp.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 * Projektname: Youtube-Lobbysystem_WeLoveSpigotPlugins
 * Programmierer: kallifabio
 */

public class PlayerUtils {
    
    private final Inventory inventory;

    public PlayerUtils() {
        this.inventory = Bukkit.createInventory(null, 9, "");

        this.inventory.setItem(0,
                new ItemManager(Material.COMPASS).setDisplayName("§8● §eNavigator §8(§eRechtsklick§8)").build());

        this.inventory.setItem(1,
                new ItemManager(Material.FEATHER).setDisplayName("§8● §ePlayerhider §8(§eRechtsklick§8)").build());

        this.inventory.setItem(4,
                new ItemManager(Material.ENDER_CHEST).setDisplayName("§8● §eGadgets §8(§eRechtsklick§8)").build());

        this.inventory.setItem(7,
                new ItemManager(Material.BEACON).setDisplayName("§8● §eLobbyswitcher §8(§eRechtsklick§8)").build());

        this.inventory.setItem(8,
                new ItemManager(Material.REDSTONE).setDisplayName("§8● §eEinstellungen §8(§eRechtsklick§8)").build());

    }

    public void setPlayerInventory(final Player player) {
        player.getInventory().setContents(inventory.getContents());
    }

}
