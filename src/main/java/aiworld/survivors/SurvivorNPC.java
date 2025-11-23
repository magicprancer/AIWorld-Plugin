package aiworld.survivors;

import org.bukkit.entity.Player;

public class SurvivorNPC {
    private final Player npcPlayer;
    private final String role;

    public SurvivorNPC(Player npcPlayer, String role) {
        this.npcPlayer = npcPlayer;
        this.role = role;
    }

    public Player getNpcPlayer() { return npcPlayer; }
    public String getRole() { return role; }

    // Placeholder AI behavior
    public void explore() {
        npcPlayer.sendMessage("Exploring the world as " + role);
    }

    public void gather() {
        npcPlayer.sendMessage("Gathering resources as " + role);
    }
}
