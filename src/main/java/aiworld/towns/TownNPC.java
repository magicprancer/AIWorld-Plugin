package aiworld.towns;

import org.bukkit.entity.Villager;

public class TownNPC {
    private final Villager villager;
    private final String personality;

    public TownNPC(Villager villager, String personality) {
        this.villager = villager;
        this.personality = personality;
    }

    public Villager getVillager() {
        return villager;
    }

    public String getPersonality() {
        return personality;
    }

    // Future: Add AI behavior methods (work, patrol, talk)
}
