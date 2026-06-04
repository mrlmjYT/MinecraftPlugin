package Cool.myCoolPlugin.Listener;


import Cool.myCoolPlugin.Animation.CaseAnimation;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.java.JavaPlugin;

import javax.naming.Name;

public class CaseListener implements Listener {
    private final JavaPlugin plugin;
    public CaseListener(JavaPlugin plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event){
        if (event.getAction() != Action.RIGHT_CLICK_AIR && event.getAction() != Action.RIGHT_CLICK_BLOCK) return;

        Player player = event.getPlayer();
        ItemStack item = player.getInventory().getItemInMainHand();

        if (item == null || !item.hasItemMeta()){
            return;
        }

        NamespacedKey key = new NamespacedKey(plugin, "case");

        if (!item.getItemMeta().getPersistentDataContainer().has(key, PersistentDataType.INTEGER)){
            return;
        }

        item.setAmount(item.getAmount() - 1);

        CaseAnimation.openCase(plugin, player);
    }

    @EventHandler
    public void onClick(InventoryClickEvent event){
        if (event.getView().getTitle().equals("$5Mystery Case")){
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onDrag(InventoryDragEvent event){
        if (event.getView().getTitle().equals("§5Mystery Case")){
            event.setCancelled(true);
        }
    }
}
