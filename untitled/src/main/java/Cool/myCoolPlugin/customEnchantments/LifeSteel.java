package Cool.myCoolPlugin.customEnchantments;

import org.bukkit.EntityEffect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

public class LifeSteel implements Listener {


    @EventHandler
    public void onDamage(EntityDamageByEntityEvent event){
        if (!(event.getDamager() instanceof Player player)){
            return;
        }

        ItemStack item = player.getInventory().getItemInMainHand();

        if  (item.hasItemMeta() && item.getItemMeta().getDisplayName().equals("§dMagic Sword")){
            player.setHealth(
                    Math.min(player.getHealth() +2, player.getMaxHealth() )
            );
        }

    }
}
