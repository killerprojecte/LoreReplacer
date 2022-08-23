package flyproject.lorereplacer;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class LoreReplacer extends JavaPlugin {

    public static LoreReplacer instance;
    public static FileConfiguration config;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        instance = this;
        config = getConfig();
        getLogger().info("LoreReplacer By Flyproject");
        Bukkit.getPluginManager().registerEvents(new LRListener(),this);
        // Plugin startup logic

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.isOp()) return false;
        reloadConfig();
        config = getConfig();
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&',config.getString("messages.command")));
        return true;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
