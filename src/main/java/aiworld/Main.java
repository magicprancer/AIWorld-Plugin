package aiworld;

import org.bukkit.plugin.java.JavaPlugin;
import aiworld.towns.TownsModule;
import aiworld.survivors.SurvivorsModule;
import aiworld.magic.MagicModule;
import aiworld.admin.AdminModule;
import aiworld.admin.AdminAI;
import aiworld.commands.AINPCCommand;
import aiworld.commands.AIAdminCommand;

public class Main extends JavaPlugin {
    public TownsModule towns;
    public SurvivorsModule survivors;
    public MagicModule magic;
    public AdminModule admin;

    @Override
    public void onEnable() {
        // Save default config if it does not exist
        saveDefaultConfig();

        // Initialize all modules
        towns = new TownsModule(this);
        survivors = new SurvivorsModule(this);
        magic = new MagicModule(this);
        admin = new AdminModule(this);

        // Register commands
        new AINPCCommand(this);
        new AIAdminCommand(this, new AdminAI(this));

        getLogger().info("AIWorld Plugin Enabled!");

        // Start a simple AI loop every 10 seconds (200 ticks)
        getServer().getScheduler().runTaskTimer(this, () -> {
            // Example placeholder AI behavior
            // TODO: Replace with real NPC lists and AI methods

            // Town NPCs (work/talk)
            // if you add NPC lists: towns.getAllNPCs().forEach(npc -> npc.work());

            // Survivor NPCs (explore/gather)
            // survivors.getAllNPCs().forEach(npc -> npc.explore());

            // Magic NPCs (cast spells/give quests)
            // magic.getAllNPCs().forEach(npc -> npc.castSpell("Spark"));

            // Admin AI background tasks
            // admin.getAdminAI().askAI("Placeholder background task");

        }, 0L, 200L); // 0L = start immediately, 200L = 10 seconds in ticks
    }

    @Override
    public void onDisable() {
        getLogger().info("AIWorld Plugin Disabled!");
    }
}
