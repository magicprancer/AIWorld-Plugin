package aiworld.survivors;

import org.bukkit.entity.Player;

public class SurvivorNPC {
    private final Player npcPlayer;
    private final String role;

    public SurvivorNPC(Player npcPlayer, String role) {
        this.npcPlayer = npcPlayer;
        this.role = role; // e.g., "explorer", "builder", "gatherer"
    }

    public Player getNpcPlayer() {
        return npcPlayer;
    }

    public String getRole() {
        return role;
    }

    // Future: Add AI behavior methods (gather, build, survive)
}
