package Cool.myCoolPlugin.Kit;

import Cool.myCoolPlugin.rank.RankManager;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.entity.Player;

public class KitListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {

        if (!event.getView().getTitle().equals("§6Kit Selector")) return;

        event.setCancelled(true);

        Player player = (Player) event.getWhoClicked();

        switch (event.getCurrentItem().getType()) {

            case WOODEN_SWORD:
                Kits.giveStarter(player);
                break;

            case IRON_SWORD:
                if (!RankManager.getRank(player.getUniqueId()).equals("VIP")) {
                    player.sendMessage("§cKein Zugriff!");
                    return;
                }
                Kits.giveWarrior(player);
                break;

            case DIAMOND_SWORD:
                if (!RankManager.getRank(player.getUniqueId()).equals("VIP")) {
                    player.sendMessage("§cKein Zugriff!");
                    return;
                }
                Kits.giveVIP(player);
                break;

            case NETHERITE_SWORD:
                if (!RankManager.getRank(player.getUniqueId()).equals("LEGEND")) {
                    player.sendMessage("§cKein Zugriff!");
                    return;
                }
                Kits.giveLegend(player);
                break;
        }

        if (KitCooldown.isOnCooldown(player.getUniqueId())) {
            player.sendMessage("§cDu musst noch warten!");
            return;
        }

        KitCooldown.setCooldown(player.getUniqueId());

        player.closeInventory();
    }
}