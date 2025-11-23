package aiworld;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("AIWorld Plugin Enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("AIWorld Plugin Disabled!");
    }
}
