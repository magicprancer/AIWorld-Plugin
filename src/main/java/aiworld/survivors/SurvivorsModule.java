package aiworld.survivors;

import aiworld.Main;
import org.bukkit.event.Listener;
import java.util.ArrayList;
import java.util.List;

public class SurvivorsModule implements Listener {
    private final Main plugin;
    private final List<SurvivorNPC> survivorNPCs;

    public SurvivorsModule(Main plugin) {
        this.plugin = plugin;
        this.survivorNPCs = new ArrayList<>();
    }

    public void addNPC(SurvivorNPC npc) {
        survivorNPCs.add(npc);
    }

    public List<SurvivorNPC> getAllNPCs() {
        return new ArrayList<>(survivorNPCs);
    }
}
