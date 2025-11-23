package aiworld;

import org.bukkit.plugin.java.JavaPlugin;
import aiworld.towns.TownsModule;
import aiworld.survivors.SurvivorsModule;
import aiworld.magic.MagicModule;
import aiworld.admin.AdminModule;

public class Main extends JavaPlugin {
    public TownsModule towns;
    public SurvivorsModule survivors;
    public MagicModule magic;
    public AdminModule admin;

    @Override
    public void onEnable() {
        saveDefaultConfig();

        // Initialize modules
        towns = new TownsModule(this);
        survivors = new SurvivorsModule(this);
        magic = new MagicModule(this);
        admin = new AdminModule(this);

        getLogger().info("AIWorld Plugin Enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("AIWorld Plugin Disabled!");
    }
}
