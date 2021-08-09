package org.mplugins.msit;

import org.bukkit.plugin.java.JavaPlugin;
import org.mplugins.msit.commands.SitCommand;

public final class MSit extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        this.getCommand("sit").setExecutor(new SitCommand());
        this.getServer().getPluginManager().registerEvents(new SitCommand(), this);
    }
}
