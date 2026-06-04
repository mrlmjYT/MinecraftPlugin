package Cool.myCoolPlugin.Enchantments;

import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

public class Revival implements Listener {

    private final JavaPlugin plugin;
    private final Random random = new Random();

    public Revival(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onHit(EntityDamageByEntityEvent event) {

        if (!(event.getEntity() instanceof Player player)) return;

        boolean hasEnchant = false;

        for (ItemStack item : player.getInventory().getArmorContents()) {

            if (item == null || !item.hasItemMeta()) continue;

            NamespacedKey key = new NamespacedKey(plugin, "armor_lifesteal");

            if (item.getItemMeta()
                    .getPersistentDataContainer()
                    .has(key, PersistentDataType.INTEGER)) {

                hasEnchant = true;
                break;
            }
        }

        if (!hasEnchant) return;

        int chance = random.nextInt(100);

        if (chance < 25) {

            double healAmount = 2.0;

            player.setHealth(Math.min(
                    player.getMaxHealth(),
                    player.getHealth() + healAmount
            ));

            player.sendMessage("§a❤ Armour Revival activated!");
        }
    }
}