package rt.guirandomtp;

import org.bukkit.plugin.java.JavaPlugin;

public final class GuiRandomTp extends JavaPlugin {
    public static JavaPlugin ins;

    @Override
    public void onEnable() {
        ins = this;
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
