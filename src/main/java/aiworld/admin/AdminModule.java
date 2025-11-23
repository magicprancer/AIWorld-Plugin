package aiworld.admin;

import aiworld.Main;

public class AdminModule {
    private final Main plugin;
    private final AdminAI adminAI;

    public AdminModule(Main plugin) {
        this.plugin = plugin;
        this.adminAI = new AdminAI(plugin);
    }

    public AdminAI getAdminAI() {
        return adminAI;
    }
}
