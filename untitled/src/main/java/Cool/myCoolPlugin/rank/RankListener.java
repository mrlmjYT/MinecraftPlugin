package Cool.myCoolPlugin.rank;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.entity.Player;

public class RankListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();
        String rank = RankManager.getRank(player.getUniqueId());

        player.setPlayerListName(getPrefix(rank) + player.getName());
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {

        Player player = event.getPlayer();
        String rank = RankManager.getRank(player.getUniqueId());

        event.setFormat(getPrefix(rank) + player.getName() + " §7» §f" + event.getMessage());
    }

    private String getPrefix(String rank) {

        switch (rank.toUpperCase()) {

            case "VIP":
                return "§a[VIP] ";

            case "LEGEND":
                return "§6[LEGEND] ";

            case "ADMIN":
                return "§c[ADMIN] ";

            default:
                return "§7[PLAYER] ";
        }
    }
}