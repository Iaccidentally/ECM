package com.github.iaccidentally.ecm.listeners;

import com.github.iaccidentally.ecm.commands.Util;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.util.BlockVector;

public class BlockListener {
    
    public static BlockVector block1;
    public static BlockVector block2;
    public static World world;
    
    public void onBlockDamage(BlockDamageEvent event) {
        Player player = event.getPlayer();
        Block block = event.getBlock();
        if (player.getItemInHand().getTypeId() == 281) {
            if (player.hasPermission("ECM.selection"));
            block1 = Util.toVector(block);
            world = block.getWorld();
            player.sendMessage(ChatColor.GREEN + "First point is now set!");
        }
    }
    
    

}