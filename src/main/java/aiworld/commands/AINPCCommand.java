package aiworld.commands;

import aiworld.Main;
import aiworld.towns.TownNPC;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;

public class AINPCCommand implements CommandExecutor {
    private final Main plugin;

    public AINPCCommand(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("ainpc").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        if (args.length < 2) {
            player.sendMessage("Usage: /ainpc create <name> <personality>");
            return true;
        }

        String name = args[1];
        String personality = String.join(" ", args, 2, args.length);

        // Spawn a villager at the player location
        Villager villager = player.getWorld().spawn(player.getLocation(), Villager.class);
        villager.setCustomName(name);
        villager.setCustomNameVisible(true);

        // Create TownNPC object
        TownNPC npc = new TownNPC(villager, personality);

        player.sendMessage("AI NPC " + name + " with personality '" + personality + "' created!");

        // TODO: add NPC AI behavior
        return true;
    }
}
