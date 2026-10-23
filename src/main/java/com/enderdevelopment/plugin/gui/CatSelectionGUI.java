package com.enderdevelopment.plugin.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CatSelectionGUI {

    public static void openGUI(Player player) {
        Inventory gui = Bukkit.createInventory(null, 9, "Choose Your Cat");

        // Add cat items to the GUI
        ItemStack gingerCat = createCatItem(Material.ORANGE_WOOL, "Ginger Cat");
        ItemStack sphynxCat = createCatItem(Material.WHITE_WOOL, "Sphynx Cat");
        ItemStack lionCat = createCatItem(Material.BROWN_WOOL, "Lion Cat");
        ItemStack fatCat = createCatItem(Material.LIGHT_GRAY_WOOL, "Fat Cat");
        ItemStack cartoonCat = createCatItem(Material.BLACK_WOOL, "Cartoon Cat");
        ItemStack calicoCat = createCatItem(Material.RED_WOOL, "Calico Cat");

        gui.addItem(gingerCat, sphynxCat, lionCat, fatCat, cartoonCat, calicoCat);
        player.openInventory(gui);
    }

    private static ItemStack createCatItem(Material material, String name) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        return item;
    }
}