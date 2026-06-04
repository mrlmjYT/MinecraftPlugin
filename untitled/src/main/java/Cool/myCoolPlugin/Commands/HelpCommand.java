package Cool.myCoolPlugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class HelpCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (command.getName().equalsIgnoreCase("help")){
            sender.sendMessage("Hello Player.");
            sender.sendMessage("You are on this awesome server of mine. I hope u have fun");
            sender.sendMessage("§6===Commands=======");
            sender.sendMessage("§e/help §7 - Shows this info");
            sender.sendMessage("§e/spawn §7 - Takes u to the spawn");
            sender.sendMessage("§e/laserpickaxe - gives u an op Pickaxe");
            sender.sendMessage("§e/poisonblade - gives u a sword that gives the opponent poison");
            sender.sendMessage("§e/magicsword - gives u an op Sword");
            sender.sendMessage("§e/laseraxe - gives u an op laser axe");
            sender.sendMessage("§e/case - gives u a case that u can open");
            sender.sendMessage("§e/tankarmour - gives u the entire tank armour");
            return true;
        }else {
            return false;
        }
    }
}
