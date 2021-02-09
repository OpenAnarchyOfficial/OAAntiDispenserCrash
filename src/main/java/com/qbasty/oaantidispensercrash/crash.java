package com.qbasty.oaantidispensercrash;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;

public class crash implements Listener {
    main plugin;

    @EventHandler
    public void dispenseCheck(BlockDispenseEvent e) {
        int blockHeight = e.getBlock().getY();
        if (blockHeight >= 255) {
            e.setCancelled(true);
        }
        if (blockHeight <= 0) {
            e.setCancelled(true);
        }
    }
}