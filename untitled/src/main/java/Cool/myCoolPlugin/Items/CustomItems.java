package Cool.myCoolPlugin.Items;

import Cool.myCoolPlugin.Commands.LaserPIckaxeCommand;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class CustomItems {
    // custom Swords
    public static ItemStack getMagicSword(JavaPlugin plugin) {

        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);

        ItemMeta meta = sword.getItemMeta();
        List<String> lore = new ArrayList<>();
        lore.add("§dLifeSteel I");

        meta.setLore(lore);

        meta.setDisplayName(ChatColor.DARK_GREEN + "Magic Sword");

        NamespacedKey key = new NamespacedKey(plugin, "lifesteal");

        meta.getPersistentDataContainer().set(
                key,
                PersistentDataType.INTEGER,
                1
        );

        sword.setItemMeta(meta);

        return sword;
    }

    public static ItemStack getPoisonBlade(JavaPlugin plugin){
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = sword.getItemMeta();
        List<String> lore = new ArrayList<>();
        lore.add("§dPoisonBlade I");
        meta.setLore(lore);

        meta.setDisplayName(net.md_5.bungee.api.ChatColor.DARK_GREEN + "Poison Blade");

        NamespacedKey key = new NamespacedKey(plugin, "poisonBlade");

        meta.getPersistentDataContainer().set(key, PersistentDataType.INTEGER, 1);

        sword.setItemMeta(meta);

        return sword;
    }

    //custom Pickaxes
    public static ItemStack getLaserPickaxe(JavaPlugin plugin){
        ItemStack pickaxe = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta meta = pickaxe.getItemMeta();

        List<String> lore = new ArrayList<>();
        lore.add("§dLaser I");

        meta.setLore(lore);

        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Laser Pickaxe");

        NamespacedKey key = new NamespacedKey(plugin, "laser");
        meta.getPersistentDataContainer().set(key, PersistentDataType.INTEGER, 1);

        pickaxe.setItemMeta(meta);

        pickaxe.addUnsafeEnchantment(Enchantment.EFFICIENCY, 10);
        pickaxe.addUnsafeEnchantment(Enchantment.UNBREAKING, 10);
        return pickaxe;
    }


    //custom Axes
    public static ItemStack getLaserAxe(JavaPlugin plugin){
        ItemStack axe =  new ItemStack(Material.DIAMOND_AXE);
        ItemMeta meta = axe.getItemMeta();
        List<String> lore = new ArrayList<>();
        lore.add("§dLaser I");
        meta.setLore(lore);
        meta.setDisplayName(ChatColor.AQUA + "Laser Axe");

        NamespacedKey key = new NamespacedKey(plugin, "laser");
        meta.getPersistentDataContainer().set(key, PersistentDataType.INTEGER, 1);
        axe.setItemMeta(meta);

        axe.addUnsafeEnchantment(Enchantment.UNBREAKING, 10);
        return axe;
    }

    //custom Armour
    public static ItemStack getTankhelmet(JavaPlugin plugin){
        ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta meta = helmet.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Tank helmet");

        NamespacedKey key = new NamespacedKey(plugin, "tankHelmet");
        meta.getPersistentDataContainer().set(key, PersistentDataType.INTEGER, 1);
        helmet.setItemMeta(meta);
        helmet.addUnsafeEnchantment(Enchantment.PROTECTION, 10);
        helmet.addUnsafeEnchantment(Enchantment.BLAST_PROTECTION, 10);
        helmet.addUnsafeEnchantment(Enchantment.FIRE_PROTECTION, 10);
        helmet.addUnsafeEnchantment(Enchantment.PROJECTILE_PROTECTION, 10);
        return helmet;
    }

    public static ItemStack getTankchestplate(JavaPlugin plugin){
        ItemStack helmet = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta meta = helmet.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Tank chestplate");

        NamespacedKey key = new NamespacedKey(plugin, "tankchestplate");
        meta.getPersistentDataContainer().set(key, PersistentDataType.INTEGER, 1);
        helmet.setItemMeta(meta);
        helmet.addUnsafeEnchantment(Enchantment.PROTECTION, 10);
        helmet.addUnsafeEnchantment(Enchantment.BLAST_PROTECTION, 10);
        helmet.addUnsafeEnchantment(Enchantment.FIRE_PROTECTION, 10);
        helmet.addUnsafeEnchantment(Enchantment.PROJECTILE_PROTECTION, 10);
        return helmet;
    }

    public static ItemStack getTankLeggings(JavaPlugin plugin){
        ItemStack helmet = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta meta = helmet.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Tank Leggings");

        NamespacedKey key = new NamespacedKey(plugin, "tankLeggings");
        meta.getPersistentDataContainer().set(key, PersistentDataType.INTEGER, 1);
        helmet.setItemMeta(meta);
        helmet.addUnsafeEnchantment(Enchantment.PROTECTION, 10);
        helmet.addUnsafeEnchantment(Enchantment.BLAST_PROTECTION, 10);
        helmet.addUnsafeEnchantment(Enchantment.FIRE_PROTECTION, 10);
        helmet.addUnsafeEnchantment(Enchantment.PROJECTILE_PROTECTION, 10);
        return helmet;
    }

    public static ItemStack getTankboots(JavaPlugin plugin){
        ItemStack helmet = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = helmet.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Tank boots");

        NamespacedKey key = new NamespacedKey(plugin, "tankBoots");
        meta.getPersistentDataContainer().set(key, PersistentDataType.INTEGER, 1);
        helmet.setItemMeta(meta);
        helmet.addUnsafeEnchantment(Enchantment.PROTECTION, 10);
        helmet.addUnsafeEnchantment(Enchantment.BLAST_PROTECTION, 10);
        helmet.addUnsafeEnchantment(Enchantment.FIRE_PROTECTION, 10);
        helmet.addUnsafeEnchantment(Enchantment.PROJECTILE_PROTECTION, 10);
        return helmet;
    }

    public static ItemStack getLifestealArmor(JavaPlugin plugin) {

        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();
        List<String> lore = new ArrayList<>();
        lore.add("§dRevival I");
        meta.setLore(lore);


        meta.setDisplayName("§cLifesteal Armor");

        NamespacedKey key = new NamespacedKey(plugin, "revival");

        meta.getPersistentDataContainer().set(
                key,
                PersistentDataType.INTEGER,
                1
        );

        item.setItemMeta(meta);

        return item;
    }



    //Cases
    public static ItemStack getCommonCase(JavaPlugin plugin){
        ItemStack egg = new ItemStack(Material.DRAGON_EGG);
        ItemMeta meta = egg.getItemMeta();

        meta.setDisplayName("§5Mystery Case");
        NamespacedKey key = new NamespacedKey(plugin, "case");

        meta.getPersistentDataContainer().set(key, PersistentDataType.INTEGER, 1);

        egg.setItemMeta(meta);
        return egg;
    }
}