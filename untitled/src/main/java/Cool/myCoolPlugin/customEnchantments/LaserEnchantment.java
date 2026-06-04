package Cool.myCoolPlugin.customEnchantments;

import org.bukkit.NamespacedKey;
import org.bukkit.block.data.type.Snow;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.java.JavaPlugin;

public class LaserEnchantment implements Listener {

    private final JavaPlugin plugin;

    public LaserEnchantment(JavaPlugin plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onRightClick(PlayerInteractEvent event){
        Player player = event.getPlayer();

        if (!event.getAction().name().contains("RIGHT_CLICK")) return;

        ItemStack item = player.getInventory().getItemInMainHand();
        if (item == null || !item.hasItemMeta()) return;

        ItemMeta meta = item.getItemMeta();

        NamespacedKey key = new NamespacedKey(plugin, "laser");

        if (!meta.getPersistentDataContainer().has(key, PersistentDataType.INTEGER)) return;

        Snowball snowball = player.launchProjectile(Snowball.class);
        snowball.setVelocity(player.getLocation().getDirection().multiply(2));
    }

    @EventHandler
    public void onHit(ProjectileHitEvent event){
        if (!(event.getEntity() instanceof Snowball)) return;

        if (event.getHitBlock() != null){
            event.getHitBlock().breakNaturally();
        }
    }
}
