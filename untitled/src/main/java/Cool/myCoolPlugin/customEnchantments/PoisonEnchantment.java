package Cool.myCoolPlugin.customEnchantments;

import org.bukkit.NamespacedKey;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PoisonEnchantment implements Listener {

    private final JavaPlugin plugin;

    public PoisonEnchantment(JavaPlugin plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onHit(EntityDamageByEntityEvent event){
        if (!(event.getDamager() instanceof Player player)) return;
        if (!(event.getEntity() instanceof LivingEntity target)) return;

        ItemStack item = player.getInventory().getItemInMainHand();
        if (item == null || !item.hasItemMeta()) return;

        ItemMeta meta = item.getItemMeta();

        NamespacedKey key = new NamespacedKey(plugin, "poisonblade");

        if (!meta.getPersistentDataContainer().has(key, PersistentDataType.INTEGER)) return;

        target.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 60, 0));
    }
}
