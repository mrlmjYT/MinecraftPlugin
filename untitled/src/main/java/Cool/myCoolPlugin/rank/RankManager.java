package Cool.myCoolPlugin.rank;

import java.util.HashMap;
import java.util.UUID;

public class RankManager {

    public static HashMap<UUID, String> ranks = new HashMap<>();

    public static void setRank(UUID uuid, String rank) {
        ranks.put(uuid, rank);
    }

    public static String getRank(UUID uuid) {
        return ranks.getOrDefault(uuid, "PLAYER");
    }
}