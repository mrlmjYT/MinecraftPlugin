package Cool.myCoolPlugin.Animation;

import Cool.myCoolPlugin.Items.CustomItems;
import net.kyori.adventure.text.event.ClickEvent;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Random;

public class CaseAnimation {

    private static final int WIN_SLOT = 13;

    public static void openCase(JavaPlugin plugin, Player player) {

        Inventory inv = Bukkit.createInventory(null, 27, "§5Mystery Case");

        ItemStack green = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
        ItemMeta gMeta = green.getItemMeta();
        gMeta.setDisplayName("§aWin");
        green.setItemMeta(gMeta);

        inv.setItem(4, green);
        inv.setItem(22, green);

        for (int i = 9; i <= 17; i++) {
            inv.setItem(i, getRandomItem(plugin));
        }

        player.openInventory(inv);

        new BukkitRunnable() {

            int ticks = 0;
            int speed = 2;

            @Override
            public void run() {

                for (int i = 9; i < 17; i++) {
                    inv.setItem(i, inv.getItem(i + 1));
                }

                inv.setItem(17, getRandomItem(plugin));

                player.playSound(player.getLocation(),
                        Sound.UI_BUTTON_CLICK, 1f, 1f);

                ticks++;

                if (ticks > 20 && speed < 5) {
                    speed++;
                    this.cancel();
                    this.runTaskTimer(plugin, speed, speed);
                    return;
                }

                // 🏁 Ende
                if (ticks >= 60) {

                    ItemStack reward = inv.getItem(WIN_SLOT);

                    player.getInventory().addItem(reward.clone());

                    player.sendMessage("§6You Won!");
                    player.playSound(player.getLocation(),
                            Sound.ENTITY_PLAYER_LEVELUP, 1f, 1f);

                    player.closeInventory();

                    cancel();
                }
            }

        }.runTaskTimer(plugin, 0L, 2L);
    }

    private static ItemStack getRandomItem(JavaPlugin plugin) {

        Random random = new Random();
        int chance = random.nextInt(100);

        if (chance < 30) {
            return new ItemStack(Material.IRON_BLOCK, 32);
        } else if (chance < 40) {
            return new ItemStack(Material.DIAMOND_BLOCK, 32);
        } else if (chance < 50) {
            return CustomItems.getTankhelmet(plugin);
        } else if (chance < 60) {
            return CustomItems.getTankLeggings(plugin);
        } else if (chance < 70) {
            return CustomItems.getTankboots(plugin);
        } else if (chance < 80) {
            return CustomItems.getTankchestplate(plugin);
        } else if (chance < 90) {
            return CustomItems.getPoisonBlade(plugin);
        } else if (chance < 95) {
            return CustomItems.getMagicSword(plugin);
        } else {
            return CustomItems.getLaserPickaxe(plugin);
        }
    }
}