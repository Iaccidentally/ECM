/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.Iaccidentally.ECM;

import com.github.Iaccidentally.ECM.listeners.BlockListener;
import com.github.Iaccidentally.ECM.listeners.PlayerListener;
import java.util.logging.Logger;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.Plugin;


/**
 *
 * @author casdorph.gavin
 */
public class ECM extends JavaPlugin {
    Logger log = Logger.getLogger("Minecraft");
    
    private PlayerListener PlayerListener = new PlayerListener();
    private BlockListener BlockListener = new BlockListener();
    
    @Override
    public void onEnable() {
        this.log.info("ECM is now enabled!");
        PluginManager pm = getServer().getPluginManager();
        
        pm.registerEvents(this.BlockListener, this);
        pm.registerEvents(this.PlayerListener, this);
        
    }
    @Override
    public void onDisable() {
        this.log.info("ECM is now disabled!");
        
    }
}
