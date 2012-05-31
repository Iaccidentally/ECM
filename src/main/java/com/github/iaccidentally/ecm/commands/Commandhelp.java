package com.github.iaccidentally.ecm.commands;

import com.github.iaccidentally.ecm.CommandManager;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class Commandhelp 
{
	public static void getHelp()
	{
		formatHelp("", "", "");
	}

	public static void getSelect()
	{
		formatHelp("region pos1", "Creates a reference point 1 at your immediate location", "");
		formatHelp("region pos2", "Creates a reference point 2 at your immediate location", "");
                formatHelp("tool pos1", "You can also use a tool, preciesly a bowl, to choose your positions", "");
		//Util.sendMessage(" You can also select a region with your normal World Edit tool");
	}

	public static void getEdit()
	{
		formatHelp("cut", "Removes blocks in the selected region and adds them to your 'clipboard'", "");
                formatHelp("paste", "Takes the blocks that are on your 'clipboard' and 'pastes' them relative to your location", "");
                formatHelp("copy", "Take the blocks in the selected region and ads them to your clipboard for pasting", "");
	}

	public static void getEditMode()
	{
		formatHelp("edit-mode", "When in edit mode, you are able to use ECM commands with ease, without worrying about overlapping or overriden commands", "");
	}

	private static void formatHelp(String command, String description, String node)
	{
		CommandSender sender = CommandManager.getSender();
		if(Util.senderHasPermission(node))
			sender.sendMessage(ChatColor.GREEN + "/" + command + ChatColor.WHITE + " " + description);

		return;
	}
}
