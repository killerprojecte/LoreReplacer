package flyproject.lorereplacer;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static Object[] replaceLore(List<String> lores){
        boolean has = false;
        List<String> ilore = new ArrayList<>();
        for (String l : lores){
            for (String key : LoreReplacer.config.getConfigurationSection("lores").getKeys(false)){
                String old = LoreReplacer.config.getString("lores." + key + ".old").replace("&","§");
                String target = LoreReplacer.config.getString("lores." + key + ".new").replace("&","§");
                if (!has){
                    if (l.contains(old)){
                        has = true;
                    }
                }
                l = l.replace(old,target);
            }
            ilore.add(l);
        }
        return new Object[]{has,ilore};
    }
}
