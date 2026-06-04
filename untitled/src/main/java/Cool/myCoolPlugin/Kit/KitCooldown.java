package Cool.myCoolPlugin.Kit;

import java.util.HashMap;
import java.util.UUID;

public class KitCooldown {

    public static HashMap<UUID, Long> cooldowns = new HashMap<>();

    public static boolean isOnCooldown(UUID uuid) {

        if (!cooldowns.containsKey(uuid)) return false;

        long timeLeft = (cooldowns.get(uuid) + 86400000) - System.currentTimeMillis();

        return timeLeft > 0;
    }

    public static long getTimeLeft(UUID uuid) {

        return (cooldowns.get(uuid) + 86400000) - System.currentTimeMillis();
    }

    public static void setCooldown(UUID uuid) {
        cooldowns.put(uuid, System.currentTimeMillis());
    }
}