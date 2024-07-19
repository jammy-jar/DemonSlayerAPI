package me.jammy.demonslayerapi.event;

import me.jammy.demonslayerapi.enums.DemonType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.checkerframework.checker.units.qual.N;
import org.jetbrains.annotations.NotNull;

public class DemonDeathEvent extends EntityEvent implements Cancellable {
    private static final HandlerList HANDLERS = new HandlerList();

    private boolean isCancelled;

    private final DemonType type;

    private final LivingEntity demon;

    public DemonDeathEvent(@NotNull final LivingEntity entity, DemonType type) {
        super(entity);
        this.demon = entity;
        this.isCancelled = false;
        this.type = type;
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

    public final @NotNull DemonType getType() {
        return type;
    }

    public final @NotNull LivingEntity getEntity() {
        return demon;
    }

    public final static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
