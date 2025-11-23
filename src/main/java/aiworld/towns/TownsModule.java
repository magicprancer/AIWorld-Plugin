package aiworld.towns;

import aiworld.Main;
import org.bukkit.event.Listener;
import java.util.ArrayList;
import java.util.List;

public class TownsModule implements Listener {
    private final Main plugin;
    private final List<TownNPC> townNPCs;

    public TownsModule(Main plugin) {
        this.plugin = plugin;
        this.townNPCs = new ArrayList<>();
    }

    public void addNPC(TownNPC npc) {
        townNPCs.add(npc);
    }

    public List<TownNPC> getAllNPCs() {
        return new ArrayList<>(townNPCs);
    }
}
