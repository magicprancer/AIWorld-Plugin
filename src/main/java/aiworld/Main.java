package aiworld;

import org.bukkit.plugin.java.JavaPlugin;
import aiworld.towns.TownsModule;
import aiworld.survivors.SurvivorsModule;
import aiworld.magic.MagicModule;
import aiworld.admin.AdminModule;
import aiworld.admin.AdminAI;
import aiworld.commands.AINPCCommand;
import aiworld.commands.AIAdminCommand;
import aiworld.towns.TownNPC;
import aiworld.survivors.SurvivorNPC;
import aiworld.magic.MagicNPC;

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

        // Start AI loop ev
