package aiworld.commands;

import aiworld.Main;
import aiworld.admin.AdminAI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AIAdminCommand implements CommandExecutor {
    private final Main plugin;
    private final AdminAI adminAI;

    public AIAdminCommand(Main plugin, AdminAI adminAI) {
        this.plugin = plugin;
        this.adminAI = adminAI;
        plugin.getCommand("aiadmin").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("aiworld.admin")) {
            sender.sendMessage("You do not have permission to use this command.");
            return true;
        }

        if (args.length == 0) {
            sender.sendMessage("Usage: /aiadmin <question>");
            return true;
        }

        String question = String.join(" ", args);
        sender.sendMessage("Sending question to AI: " + question);

        // TODO: integrate OpenAI API to get a response
        String response = "AI response placeholder";

        sender.sendMessage(response);

        return true;
    }
}
