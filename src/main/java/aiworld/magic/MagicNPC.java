package aiworld.magic;

import org.bukkit.entity.Entity;

public class MagicNPC {
    private final Entity entity;
    private final String type;

    public MagicNPC(Entity entity, String type) {
        this.entity = entity;
        this.type = type; // e.g., "wizard", "fairy", "guardian"
    }

    public Entity getEntity() {
        return entity;
    }

    public String getType() {
        return type;
    }

    // Future: Add AI behavior methods (cast spells, give quests, interact)
}
