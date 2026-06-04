package Cool.myCoolPlugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        if (command.getName().equalsIgnoreCase("spawn")){
            Player player = (Player) sender;

            player.teleport(player.getWorld().getSpawnLocation());
            player.sendMessage("You where teleported to spawn");
            return true;
        }else {
            return false;
        }
    }
}
