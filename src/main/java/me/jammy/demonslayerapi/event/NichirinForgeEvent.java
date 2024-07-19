package me.jammy.demonslayerapi.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class NichirinForgeEvent extends PlayerEvent implements Cancellable {
    private static final HandlerList HANDLERS = new HandlerList();

    private boolean isCancelled;
    private final ItemStack nichirin;

    public NichirinForgeEvent(Player player, ItemStack nichirin) {
        super(player);
        this.isCancelled = false;
        this.nichirin = nichirin;
    }

    public ItemStack getNichirin() {
        return nichirin;
    }

    @Override
    public final boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public final void setCancelled(boolean cancelled) {
        this.isCancelled = cancelled;
    }

    @Override
    public final @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    public final static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
