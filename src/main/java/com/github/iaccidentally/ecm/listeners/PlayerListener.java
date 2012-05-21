/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.Iaccidentally.ECM.listeners;

/**
 *
 * @author casdorph.gavin & Iaccidentally
 */
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
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
}
