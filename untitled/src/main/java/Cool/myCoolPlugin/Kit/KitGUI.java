package Cool.myCoolPlugin.Kit;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class KitGUI {

    public static void open(Player player) {

        Inventory inv = Bukkit.createInventory(null, 27, "§6Kit Selector");

        inv.setItem(10, createItem(Material.WOODEN_SWORD, "§aStarter Kit"));
        inv.setItem(12, createItem(Material.IRON_SWORD, "§bWarrior Kit"));
        inv.setItem(14, createItem(Material.DIAMOND_SWORD, "§6VIP Kit"));
        inv.setItem(16, createItem(Material.NETHERITE_SWORD, "§cLegend Kit"));

        player.openInventory(inv);
    }

    private static ItemStack createItem(Material mat, String name) {

        ItemStack item = new ItemStack(mat);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(name);

        item.setItemMeta(meta);

        return item;
    }
}