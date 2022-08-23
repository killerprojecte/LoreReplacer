package flyproject.lorereplacer;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class LRListener implements Listener {
    @EventHandler(priority = EventPriority.MONITOR)
    public void onJoin(PlayerJoinEvent event){
        PlayerInventory inventory = event.getPlayer().getInventory();
        Bukkit.getScheduler().runTaskAsynchronously(LoreReplacer.instance,() -> {
            int stat = 0;
            for (ItemStack is : inventory.getContents()){
                if (is==null || is.getType().equals(Material.AIR)) continue;
                if (!is.hasItemMeta() || is.getItemMeta()==null) continue;
                ItemMeta im = is.getItemMeta();
                if (!im.hasLore() || im.getLore()==null || im.getLore().size()==0) continue;
                Object[] array = Utils.replaceLore(im.getLore());
                if (!((boolean) array[0])) continue;
                stat++;
                im.setLore((List<String>) array[1]);
            }
            for (ItemStack is : inventory.getArmorContents()){
                if (is==null || is.getType().equals(Material.AIR)) continue;
                if (!is.hasItemMeta() || is.getItemMeta()==null) continue;
                ItemMeta im = is.getItemMeta();
                if (!im.hasLore() || im.getLore()==null || im.getLore().size()==0) continue;
                Object[] array = Utils.replaceLore(im.getLore());
                if (!((boolean) array[0])) continue;
                stat++;
                im.setLore((List<String>) array[1]);
            }
            for (ItemStack is : inventory.getExtraContents()){
                if (is==null || is.getType().equals(Material.AIR)) continue;
                if (!is.hasItemMeta() || is.getItemMeta()==null) continue;
                ItemMeta im = is.getItemMeta();
                if (!im.hasLore() || im.getLore()==null || im.getLore().size()==0) continue;
                Object[] array = Utils.replaceLore(im.getLore());
                if (!((boolean) array[0])) continue;
                stat++;
                im.setLore((List<String>) array[1]);
            }
            Bukkit.getLogger().info("[LoreReplacer] " + String.format(LoreReplacer.config.getString("messages.log"), event.getPlayer().getDisplayName(),String.valueOf(stat)));
            if (LoreReplacer.config.getBoolean("sendtoplayer")){
                event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&',String.format(LoreReplacer.config.getString("messages.replaced"),String.valueOf(stat))));
            }
        });
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onClick(InventoryClickEvent event){
        if (!(event.getWhoClicked() instanceof Player)) return;
        Player player = (Player) event.getWhoClicked();
        PlayerInventory inventory = player.getInventory();
        Bukkit.getScheduler().runTaskAsynchronously(LoreReplacer.instance,() -> {
            int stat = 0;
            for (ItemStack is : inventory.getContents()){
                if (is==null || is.getType().equals(Material.AIR)) continue;
                if (!is.hasItemMeta() || is.getItemMeta()==null) continue;
                ItemMeta im = is.getItemMeta();
                if (!im.hasLore() || im.getLore()==null || im.getLore().size()==0) continue;
                Object[] array = Utils.replaceLore(im.getLore());
                if (!((boolean) array[0])) continue;
                stat++;
                im.setLore((List<String>) array[1]);
            }
            for (ItemStack is : inventory.getArmorContents()){
                if (is==null || is.getType().equals(Material.AIR)) continue;
                if (!is.hasItemMeta() || is.getItemMeta()==null) continue;
                ItemMeta im = is.getItemMeta();
                if (!im.hasLore() || im.getLore()==null || im.getLore().size()==0) continue;
                Object[] array = Utils.replaceLore(im.getLore());
                if (!((boolean) array[0])) continue;
                stat++;
                im.setLore((List<String>) array[1]);
            }
            for (ItemStack is : inventory.getExtraContents()){
                if (is==null || is.getType().equals(Material.AIR)) continue;
                if (!is.hasItemMeta() || is.getItemMeta()==null) continue;
                ItemMeta im = is.getItemMeta();
                if (!im.hasLore() || im.getLore()==null || im.getLore().size()==0) continue;
                Object[] array = Utils.replaceLore(im.getLore());
                if (!((boolean) array[0])) continue;
                stat++;
                im.setLore((List<String>) array[1]);
            }
            Bukkit.getLogger().info("[LoreReplacer] " + String.format(LoreReplacer.config.getString("messages.log"), player.getDisplayName(),String.valueOf(stat)));
            if (LoreReplacer.config.getBoolean("sendtoplayer")){
                player.sendMessage(ChatColor.translateAlternateColorCodes('&',String.format(LoreReplacer.config.getString("messages.replaced"),String.valueOf(stat))));
            }
        });
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onOpenInventory(InventoryOpenEvent event){
        if (!(event.getPlayer() instanceof Player)) return;
        Player player = (Player) event.getPlayer();
        PlayerInventory inventory = player.getInventory();
        Bukkit.getScheduler().runTaskAsynchronously(LoreReplacer.instance,() -> {
            int stat = 0;
            for (ItemStack is : inventory.getContents()){
                if (is==null || is.getType().equals(Material.AIR)) continue;
                if (!is.hasItemMeta() || is.getItemMeta()==null) continue;
                ItemMeta im = is.getItemMeta();
                if (!im.hasLore() || im.getLore()==null || im.getLore().size()==0) continue;
                Object[] array = Utils.replaceLore(im.getLore());
                if (!((boolean) array[0])) continue;
                stat++;
                im.setLore((List<String>) array[1]);
                is.setItemMeta(im);
            }
            for (ItemStack is : inventory.getArmorContents()){
                if (is==null || is.getType().equals(Material.AIR)) continue;
                if (!is.hasItemMeta() || is.getItemMeta()==null) continue;
                ItemMeta im = is.getItemMeta();
                if (!im.hasLore() || im.getLore()==null || im.getLore().size()==0) continue;
                Object[] array = Utils.replaceLore(im.getLore());
                if (!((boolean) array[0])) continue;
                stat++;
                im.setLore((List<String>) array[1]);
                is.setItemMeta(im);
            }
            for (ItemStack is : inventory.getExtraContents()){
                if (is==null || is.getType().equals(Material.AIR)) continue;
                if (!is.hasItemMeta() || is.getItemMeta()==null) continue;
                ItemMeta im = is.getItemMeta();
                if (!im.hasLore() || im.getLore()==null || im.getLore().size()==0) continue;
                Object[] array = Utils.replaceLore(im.getLore());
                if (!((boolean) array[0])) continue;
                stat++;
                im.setLore((List<String>) array[1]);
                is.setItemMeta(im);
            }
            Bukkit.getLogger().info("[LoreReplacer] " + String.format(LoreReplacer.config.getString("messages.log"), player.getDisplayName(),String.valueOf(stat)));
            if (LoreReplacer.config.getBoolean("sendtoplayer")){
                event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&',String.format(LoreReplacer.config.getString("messages.replaced"),String.valueOf(stat))));
            }
        });
    }
}
