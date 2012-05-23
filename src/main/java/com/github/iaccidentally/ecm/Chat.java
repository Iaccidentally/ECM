package com.github.iaccidentally.ecm;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

/* 
 * 
 * @author Joshua D. Katz
 * 
 */

public class Chat {
	public static ChatColor black = ChatColor.BLACK;
	public static ChatColor dark_blue = ChatColor.DARK_BLUE;
	public static ChatColor dark_green = ChatColor.DARK_GREEN;
	public static ChatColor dark_aqua = ChatColor.DARK_AQUA;
	public static ChatColor dark_red = ChatColor.DARK_RED;
	public static ChatColor dark_purple = ChatColor.DARK_PURPLE;
	public static ChatColor gold = ChatColor.GOLD;
	public static ChatColor gray = ChatColor.GRAY;
	public static ChatColor dark_grey = ChatColor.DARK_GRAY;
	public static ChatColor blue = ChatColor.BLUE;
	public static ChatColor green = ChatColor.GREEN;
	public static ChatColor aqua = ChatColor.AQUA;
	public static ChatColor red = ChatColor.RED;
	public static ChatColor light_purple = ChatColor.LIGHT_PURPLE;
	public static ChatColor yellow = ChatColor.YELLOW;
	public static ChatColor white = ChatColor.WHITE;
	public static ChatColor magic = ChatColor.MAGIC;
	public static ChatColor bold = ChatColor.BOLD;
	public static ChatColor strike = ChatColor.STRIKETHROUGH;
	public static ChatColor underline = ChatColor.UNDERLINE;
	public static ChatColor italic = ChatColor.ITALIC;
	public static ChatColor reset = ChatColor.RESET;

	//I think we should use this format for messages! This way all will look ~ the same!
	
	public void errorMessage(Player player, String message) {
		if (message == null) {
			String error = aqua + "[E.C.M. " + underline + "Error" + aqua + "]"
					+ red + "You have made an error! See the logfile!";
			player.sendRawMessage(error);
		} else {
			String error = aqua + "[E.C.M. " + underline + "Error" + aqua + "]"
					+ red + message;
			player.sendRawMessage(error);
		}
	}

	public void finishMessage(Player player, String message) {
		if (message == null) {
			String finished = aqua + "[ " + bold + " E.C.M. " + aqua + "] "
					+ "You have finished that command!";
			player.sendRawMessage(finished);
		} else {
			String finished = aqua + "[ " + bold + " E.C.M. " + aqua + "] "
					+ message;
			player.sendRawMessage(finished);
		}
	}

}
