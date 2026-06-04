package Cool.myCoolPlugin.Commands;

import Cool.myCoolPlugin.Items.CustomItems;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class LaserPIckaxeCommand implements CommandExecutor {

    private final JavaPlugin plugin;

    public LaserPIckaxeCommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player player)) return true;

        if (command.getName().equalsIgnoreCase("laserpickaxe")) {

            player.getInventory().addItem(
                    CustomItems.getLaserPickaxe(plugin)
            );

            player.sendMessage("§aU got the LaserPickaxe");
            return true;
        }

        return false;
    }
}