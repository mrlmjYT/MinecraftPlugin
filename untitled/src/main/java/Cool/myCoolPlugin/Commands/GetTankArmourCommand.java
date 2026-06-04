package Cool.myCoolPlugin.Commands;

import Cool.myCoolPlugin.Items.CustomItems;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class GetTankArmourCommand implements CommandExecutor {

    private final JavaPlugin plugin;

    public GetTankArmourCommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player player)) return true;

        if (command.getName().equalsIgnoreCase("tankarmour")) {

            player.getInventory().addItem(
                    CustomItems.getTankhelmet(plugin),
                    CustomItems.getTankchestplate(plugin),
                    CustomItems.getTankLeggings(plugin),
                    CustomItems.getTankboots(plugin)
            );

            player.sendMessage("§aU got the tank armour");
            return true;
        }

        return false;
    }


}