package com.github.Iaccidentally.ECM;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import com.github.Iaccidentally.ECM.commands.Util;
import com.github.Iaccidentally.ECM.configuration.Configuration;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;


public class ECM extends JavaPlugin
{
	Logger log;
	public CommandManager manager;
	
	private FileConfiguration data = null, language = null;
	private File dataFile = null, languageFile = null;
	
	public void onEnable()
        {
		log = this.getLogger();
		manager = new CommandManager(this);
		
		log.info("Plugin enabled");
	}
	
	public void onDisable()
	{
		log.info("Plugin disabled");
	}
	
	public void reloadData() {
	    if (dataFile == null) {
	    dataFile = new File(getDataFolder(), "data.yml");
	    }
	    data = YamlConfiguration.loadConfiguration(dataFile);
	 
	    // Look for defaults in the jar
	    InputStream defConfigStream = getResource("data.yml");
	    if (defConfigStream != null) {
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

	public void saveData() {
	    if (data == null || dataFile == null) return;
	    try {
	        data.save(dataFile);
	    } catch (IOException ex) {
	        Util.log("Could not save config to " + dataFile);
	    }
	}
	
	public void reloadLanguage() {
		
		String lang = Configuration.getString("configuration.language") + ".yml";
		Util.log("Language file used: " + lang);
		
	    if (languageFile == null) {
	    languageFile = new File(getDataFolder(), lang);
	    }
	    language = YamlConfiguration.loadConfiguration(languageFile);
	 
	    // Look for defaults in the jar
	    InputStream defConfigStream = getResource(lang);
	    if (defConfigStream != null) {
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
	    } catch (IOException ex) {
	        Util.log("Could not save config to " + languageFile);
	    }
	}
}