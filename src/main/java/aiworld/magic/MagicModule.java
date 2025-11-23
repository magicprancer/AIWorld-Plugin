package aiworld.magic;

import aiworld.Main;
import org.bukkit.event.Listener;
import java.util.ArrayList;
import java.util.List;

public class MagicModule implements Listener {
    private final Main plugin;
    private final List<MagicNPC> magicNPCs;

    public MagicModule(Main plugin) {
        this.plugin = plugin;
        this.magicNPCs = new ArrayList<>();
    }

    public void addNPC(MagicNPC npc) {
        magicNPCs.add(npc);
    }

    public List<MagicNPC> getAllNPCs() {
        return new ArrayList<>(magicNPCs);
    }
}
