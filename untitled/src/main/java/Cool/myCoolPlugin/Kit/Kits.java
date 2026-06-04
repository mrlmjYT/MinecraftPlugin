package Cool.myCoolPlugin.Kit;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Kits {

    public static void giveStarter(Player player) {
        player.getInventory().addItem(
                new ItemStack(Material.WOODEN_SWORD),
                new ItemStack(Material.BREAD, 16)
        );
    }

    public static void giveWarrior(Player player) {
        player.getInventory().addItem(
                new ItemStack(Material.IRON_SWORD),
                new ItemStack(Material.COOKED_BEEF, 16)
        );
    }

    public static void giveKnight(Player player) {
        player.getInventory().addItem(
                new ItemStack(Material.DIAMOND_SWORD),
                new ItemStack(Material.SHIELD)
        );
    }

    public static void giveVIP(Player player) {
        player.getInventory().addItem(
                new ItemStack(Material.DIAMOND_SWORD),
                new ItemStack(Material.GOLDEN_APPLE, 5)
        );
    }

    public static void giveLegend(Player player) {
        player.getInventory().addItem(
                new ItemStack(Material.NETHERITE_SWORD),
                new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1)
        );
    }
}