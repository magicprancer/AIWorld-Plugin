package aiworld.magic;

import org.bukkit.entity.Entity;

public class MagicNPC {
    private final Entity entity;
    private final String type;

    public MagicNPC(Entity entity, String type) {
        this.entity = entity;
        this.type = type;
    }

    public Entity getEntity() { return entity; }
    public String getType() { return type; }

    // Placeholder magical actions
    public void castSpell(String spell) {
        entity.getWorld().broadcastMessage(type + " casts " + spell);
    }

    public void giveQuest(String quest) {
        entity.getWorld().broadcastMessage(type + " offers quest: " + quest);
    }
}
