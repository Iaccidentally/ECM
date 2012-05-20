/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.Iaccidentally.ECM;

import com.github.Iaccidentally.ECM.commands.Util;
import com.github.Iaccidentally.ECM.listeners.BlockListener;
import com.github.Iaccidentally.ECM.listeners.PlayerListener;
import java.io.File;
import java.io.InputStream;
import java.util.logging.Logger;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
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
    
    private FileConfiguration data = null, language = null;
    private File dataFile = null, languageFile = null;
    
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
    
    public void reloadData() {
        if (dataFile == null) {
            dataFile = new File(getDataFolder(), "data.yml");
            
        }
        data = YamlConfiguration.loadConfiguration(dataFile);
        
        InputStream defConfigStream = getResource("data.yml");
        if (defConfigStream !=null) {
            YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
            data.setDefaults(defConfig);
        }
        
    }
    public FileConfiguration getData() {
        if (data == null) {
            reloadData();
        }
        return data;
        
    }
    public void reloadLanguage() {
        
            String lang = Configuration.getString("configuration.language") + ".yml";
            Util.log("Language file used: " + lang);
        if (languageFile == null) {
        languageFile = new File(getDataFolder(), lang);
        
        }
        
        InputStream defConfigStream = getResource(lang);
        if (defConfigStream !=null) {
            YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
            language.setDefaults(defConfig);
        }
    }
    
    public FileConfiguration getLanguage() {
        if (language == null) {
            reloadLanguage();
        }
        return language;
    }
    
    public void saveLanguageData() {
        if (language == null || languageFile == null) return;
        try {
            language.save(languageFile);
            
        } catch (IOExcpetion ex) {
            Util.log("Could not save config to " + languageFile);
        }
        
    }
    
}
