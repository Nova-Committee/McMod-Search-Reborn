package nova.committee.mcmodwiki.init.handler;

import mezz.jei.common.Internal;
import net.minecraft.world.item.ItemStack;
import nova.committee.mcmodwiki.Static;
import nova.committee.mcmodwiki.core.CoreService;

/**
 * Description:
 * Author: cnlimiter
 * Date: 2022/4/20 10:57
 * Version: 1.0
 */
public class JeiHandler {
    public static void tryInteract() {
        try {
            if (Internal.getRuntime().isEmpty()) {
                Static.LOGGER.warn("JEI Runtime Loss");
                return;
            }
            final var ingredientType = Internal.getRegisteredIngredients().getIngredientType(ItemStack.class);
            final var stack = Internal.getRuntime().get().getIngredientListOverlay().getIngredientUnderMouse(ingredientType);
            CoreService.openMcMod(stack);
        } catch (Throwable ex) {
            Static.LOGGER.warn("Unable to get JEI item.", ex);
        }
    }
}
