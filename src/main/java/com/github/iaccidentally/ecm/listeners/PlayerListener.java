/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.iaccidentally.ecm.listeners;

/**
 *
 * @author casdorph.gavin & Iaccidentally
 */
import com.github.iaccidentally.ecm.commands.Util; 
import com.github.iaccidentally.ecm.listeners.BlockListener;
import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;

public class PlayerListener implements Listener {

    //right click
    //without edit mode on
    @EventHandler(priority = EventPriority.LOWEST)
    public void normal(PlayerInteractEvent event) {
        // Some code here
    }

    //with edit mode on
    @EventHandler(priority = EventPriority.HIGH)
    public void high(PlayerInteractEvent event) {
        // Some code here
    }

    //item held
    //without edit mode on
    @EventHandler(priority = EventPriority.LOWEST)
    public void normal(PlayerItemHeldEvent event) {
        // Some code here
    }

    //with edit mode on
    @EventHandler(priority = EventPriority.HIGH)
    public void high(PlayerItemHeldEvent event) {
        // Some code here
    }
    
    

    public void onPlayerInteract(PlayerInteractEvent event){
	if (!(event.getAction().equals(Action.RIGHT_CLICK_BLOCK))) return;
	Player player = event.getPlayer();
	Block block = event.getClickedBlock();
            if (player.getItemInHand().getTypeId() == 281){
		if (player.hasPermission("ECM.selection"));
                BlockListener.block2 = Util.toVector(block);
                BlockListener.world = block.getWorld();
                player.sendMessage(ChatColor.GREEN + "Second point has been selected!");
            }
    }
}