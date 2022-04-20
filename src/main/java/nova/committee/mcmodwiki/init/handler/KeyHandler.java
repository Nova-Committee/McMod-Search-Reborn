package nova.committee.mcmodwiki.init.handler;

import mezz.jei.Internal;
import mezz.jei.api.ingredients.IIngredientType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import nova.committee.mcmodwiki.McmodWiki;
import nova.committee.mcmodwiki.Static;
import nova.committee.mcmodwiki.core.CoreService;
import nova.committee.mcmodwiki.init.proxy.ClientProxy;

/**
 * Description:
 * Author: cnlimiter
 * Date: 2022/4/20 8:47
 * Version: 1.0
 */
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class KeyHandler {


    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onGuiKeyPress(InputEvent.KeyInputEvent event) {
        KeyBinding key = ((ClientProxy) McmodWiki.proxy).searchKey;
        if (key.isDown()) {
            Screen screen = Minecraft.getInstance().screen;
            if (screen instanceof ContainerScreen) {
                ContainerScreen gui = (ContainerScreen) screen;
                Slot slot = gui.getSlotUnderMouse();
                if (slot != null) {
                    ItemStack itemStack = slot.getItem();
                    if (!itemStack.isEmpty()) {
                        CoreService.openMcMod(itemStack);
                    }
                }
            }

            if (ModList.get().isLoaded("jei")) {
                if (Internal.getRuntime() != null)
                    try {
                        IIngredientType<ItemStack> ingredientType = Internal.getIngredientManager().getIngredientType(ItemStack.class);
                        ItemStack stack = Internal.getRuntime().getIngredientListOverlay().getIngredientUnderMouse(ingredientType);
                        CoreService.openMcMod(stack);
                    } catch (Throwable ex) {
                        Static.LOGGER.warn("Unable to get JEI item.", ex);
                    }
            }
        }
    }

}
