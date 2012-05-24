/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.iaccidentally.ecm.commands;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.github.iaccidentally.ecm.Chat;

/**
 * 
 * @author Joshua D. Katz
 */
public class Commandadduser extends JavaPlugin {

	public void addUser(Player sender, String user)
			throws IOException {

		Chat chat = new Chat();
		FileConfiguration userName = getConfig();
		File configFile = new File("plugins" + File.pathSeparator + "EMC"
				+ "users.yml");
		boolean configExists = configFile.exists() && configFile.canRead()
				&& configFile.canWrite();
		boolean userIsNotAdded = userName.getString("EMC.Users", user) == null;

		if (userIsNotAdded && sender.hasPermission("ECM.adduser")
				|| sender.hasPermission("ECM.*")) {
			if (configExists) {
				userName.set("EMC.Users", user);
				userName.save("plugins" + File.pathSeparator + "ECM"
						+ File.pathSeparator + "users.yml");
				chat.finishMessage(sender, "You have let " + user.toLowerCase()
						+ " use ECM correctly!");
			} else {
				FileWriter outFile = new FileWriter(configFile, true);
				PrintWriter out = new PrintWriter(outFile);
				out.println("#Users For ECM go in here! Do not touch this! Use the ingame command!");
				out.close();
				userName.set("EMC.Users", user);
				userName.save("plugins" + File.pathSeparator + "ECM"
						+ File.pathSeparator + "users.yml");
				chat.finishMessage(
						sender,
						"You have let "
								+ user.toLowerCase()
								+ " use ECM correctly, there was no 'user' file so I made one!");
			}
		} else {
			sender.sendRawMessage("That user is already in the user file!");
		}
	}
}