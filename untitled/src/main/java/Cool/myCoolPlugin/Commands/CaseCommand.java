package Cool.myCoolPlugin.Commands;

import Cool.myCoolPlugin.Items.CustomItems;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CaseCommand implements CommandExecutor {
    private final JavaPlugin plugin;
    public CaseCommand(JavaPlugin plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (!(sender instanceof Player player)){
            return true;
        }

        player.getInventory().addItem(CustomItems.getCommonCase(plugin));

        player.sendMessage("§5You got a Mystery Case");
        return true;
    }
}
