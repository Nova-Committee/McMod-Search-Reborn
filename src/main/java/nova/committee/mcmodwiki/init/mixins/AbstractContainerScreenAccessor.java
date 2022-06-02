package nova.committee.mcmodwiki.init.mixins;

import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.world.inventory.Slot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import javax.annotation.Nullable;

/**
 * Description:
 * Author: cnlimiter
 * Date: 2022/4/20 22:58
 * Version: 1.0
 */
@Mixin(AbstractContainerScreen.class)
public interface AbstractContainerScreenAccessor {
    @Nullable
    @Accessor
    Slot getHoveredSlot();
}
