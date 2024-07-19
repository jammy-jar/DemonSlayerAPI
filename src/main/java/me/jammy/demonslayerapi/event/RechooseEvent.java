package me.jammy.demonslayerapi.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

public class RechooseEvent extends PlayerEvent implements Cancellable {
    private static final HandlerList HANDLERS = new HandlerList();

    private boolean isCancelled;
    private final String oldBreath;
    private final String newBreath;

    public RechooseEvent(Player player, String oldBreath, String newBreath) {
        super(player);
        this.isCancelled = false;
        this.oldBreath = oldBreath;
        this.newBreath = newBreath;
    }

    public String getOldBreath() {
        return oldBreath;
    }
    public String getNewBreath() {
        return newBreath;
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
