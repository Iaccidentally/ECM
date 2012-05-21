
package com.github.Iaccidentally.ECM.listeners;

/**
 * ECM
 * @author casdorph.gavin & Iaccidentally
 */
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockListener implements Listener {
    @EventHandler(priority = EventPriority.LOWEST)
    public void normalblockplace(BlockPlaceEvent event) {
        // Some code here
    }
 
    @EventHandler(priority = EventPriority.HIGH)
    public void highblockplace(BlockPlaceEvent event) {
        // Some code here
    }
}

