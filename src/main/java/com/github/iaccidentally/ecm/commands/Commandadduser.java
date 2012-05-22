/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.iaccidentally.ecm.commands;

import java.io.File;
import java.io.IOException;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

/**
 * 
 * @author casdorph.gavin
 */
public class Commandadduser extends JavaPlugin {

	public void addUser(Player sender, String user, Player realUser)
			throws IOException {

		FileConfiguration userName = getConfig();
		File configFile = new File("plugins" + File.pathSeparator + "EMC"
				+ "UserNames.yml");
		boolean configExists = configFile.exists() && configFile.canRead()
				&& configFile.canWrite();

		boolean userIsNotAdded = userName.getString("EMC.Users", user) == null;

		if (userIsNotAdded && configExists) {
			userName.set("EMC.Users", user);
			userName.save("");
			realUser.sendRawMessage("You have been added to the config!");
		} else {
			sender.sendRawMessage("That user is already in the user file!");
		}
	}

}
