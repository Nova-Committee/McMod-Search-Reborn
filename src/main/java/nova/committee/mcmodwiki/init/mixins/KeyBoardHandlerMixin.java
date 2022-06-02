package nova.committee.mcmodwiki.init.mixins;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.KeyboardHandler;
import nova.committee.mcmodwiki.init.callbacks.KeyBoardEvents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Description:
 * Author: cnlimiter
 * Date: 2022/6/3 6:53
 * Version: 1.0
 */
@Environment(EnvType.CLIENT)
@Mixin(KeyboardHandler.class)
public abstract class KeyBoardHandlerMixin {

    @Inject(method = "keyPress", at = @At("TAIL"))
    private void KeyPress(long l, int i, int j, int k, int m, CallbackInfo ci) {

        KeyBoardEvents.KEY_PRESSED_EVENT.invoker().onPressed(l, i, j, k, m);
    }

}
