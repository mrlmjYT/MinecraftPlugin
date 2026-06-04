package Cool.myCoolPlugin;

import Cool.myCoolPlugin.Commands.*;
import Cool.myCoolPlugin.Enchantments.Revival;
import Cool.myCoolPlugin.Kit.KitListener;
import Cool.myCoolPlugin.Listener.CaseListener;
import Cool.myCoolPlugin.customEnchantments.LaserEnchantment;
import Cool.myCoolPlugin.customEnchantments.LifeSteel;
import Cool.myCoolPlugin.customEnchantments.PoisonEnchantment;
import Cool.myCoolPlugin.rank.RankListener;
import Cool.myCoolPlugin.rank.RankManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public final class MyCoolPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin starting");

        RankManager.setRank(
                Bukkit.getOfflinePlayer("Mr_LMJ").getUniqueId(),
                "ADMIN"
        );

        getServer().getPluginCommand("spawn").setExecutor(new SpawnCommand());
        getServer().getPluginCommand("help").setExecutor(new HelpCommand());
        getServer().getPluginCommand("laserpickaxe").setExecutor(new LaserPIckaxeCommand(this));
        getServer().getPluginCommand("magicsword").setExecutor(new MagicSwordCommand(this));
        getServer().getPluginCommand("poisonblade").setExecutor(new PoisonBlade(this));
        getServer().getPluginCommand("commoncase").setExecutor(new CaseCommand(this));
        getServer().getPluginCommand("laseraxe").setExecutor(new LaserAxeCommand(this));
        getServer().getPluginCommand("tankarmour").setExecutor(new GetTankArmourCommand(this));
        getServer().getPluginCommand("kit").setExecutor(new KitCommand());
        getServer().getPluginCommand("revivalarmour").setExecutor(new GetrevivalArmourCommand(this));

        getServer().getPluginManager().registerEvents(new LifeSteel(), this);
        getServer().getPluginManager().registerEvents(new LaserEnchantment(this), this);
        getServer().getPluginManager().registerEvents(new PoisonEnchantment(this), this);
        getServer().getPluginManager().registerEvents(new CaseListener(this), this);
        getServer().getPluginManager().registerEvents(new KitListener(),this);
        getServer().getPluginManager().registerEvents(new RankListener(), this);
        getServer().getPluginManager().registerEvents(new Revival(this), this);

    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin shutdown");
    }
}
