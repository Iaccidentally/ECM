/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.iaccidentally.ecm.commands;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author casdorph.gavin
 */
public class Commanddeluser extends JavaPlugin {
	public void addUser(Player sender, String user, Player realUser)
			throws IOException {
		FileConfiguration userName = getConfig();
		File configFile = new File("plugins" + File.pathSeparator + "EMC"
				+ "users.yml");
		boolean configExists = configFile.exists() && configFile.canRead()
				&& configFile.canWrite();
		boolean userIsAdded = userName.getString("EMC.Users", user) != null;
		
		if (configExists && userIsAdded && sender.hasPermission("EMC.deluser") || sender.hasPermission("EMC.*")) {
			userName.set("EMC.deluser." + user, null);
		}
		
	}
}
