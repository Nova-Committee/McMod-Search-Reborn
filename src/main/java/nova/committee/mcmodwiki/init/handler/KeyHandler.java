package nova.committee.mcmodwiki.init.handler;


import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import nova.committee.mcmodwiki.McmodWiki;
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
        KeyMapping key = ((ClientProxy) McmodWiki.proxy).searchKey;
        if (key.isDown()) {
            Screen screen = Minecraft.getInstance().screen;
            if (screen instanceof AbstractContainerScreen gui) {
                Slot slot = gui.getSlotUnderMouse();
                if (slot != null) {
                    ItemStack itemStack = slot.getItem();
                    if (!itemStack.isEmpty()) {
                        CoreService.openMcMod(itemStack);
                    }
                }
            }

//            if (ModList.get().isLoaded("jei")) {
//                if (Internal.getRuntime() != null)
//                    try {
//                        IIngredientType<ItemStack> ingredientType = Internal.getRegisteredIngredients().getIngredientType(ItemStack.class);
//                        FocusFactory factory = new FocusFactory(Internal.getRegisteredIngredients());
//                        ItemStack stack = Internal.getRuntime().getIngredientListOverlay().getIngredientUnderMouse(ingredientType);
//                        CoreService.openMcMod(stack);
//                    } catch (Throwable ex) {
//                        Static.LOGGER.warn("Unable to get JEI item.", ex);
//                    }
//            }
        }
    }

}
