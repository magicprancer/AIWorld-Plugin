package aiworld.towns;

import org.bukkit.entity.Villager;

public class TownNPC {
    private final Villager villager;
    private final String personality;

    public TownNPC(Villager villager, String personality) {
        this.villager = villager;
        this.personality = personality;
    }

    public Villager getVillager() { return villager; }
    public String getPersonality() { return personality; }

    // Placeholder AI methods
    public void work() {
        // TODO: Make NPC work/farm/build
        villager.setCustomName("Working " + personality);
    }

    public void talk(String message) {
        // TODO: Add AI chat
        villager.setCustomName(message);
    }
}
