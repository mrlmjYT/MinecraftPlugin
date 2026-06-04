package Cool.myCoolPlugin.Commands;

import Cool.myCoolPlugin.Items.CustomItems;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MagicSwordCommand implements CommandExecutor {

    private final JavaPlugin plugin;

    public MagicSwordCommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player player)) return true;

        if (command.getName().equalsIgnoreCase("magicsword")) {

            player.getInventory().addItem(
                    CustomItems.getMagicSword(plugin)
            );

            player.sendMessage("§aYou got the magic Sword");
            return true;
        }

        return false;
    }
}