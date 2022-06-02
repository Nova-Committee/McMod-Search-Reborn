package nova.committee.mcmodwiki.init.handler;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import nova.committee.mcmodwiki.McmodwikiClient;
import nova.committee.mcmodwiki.Static;
import nova.committee.mcmodwiki.core.CoreService;
import nova.committee.mcmodwiki.init.callbacks.KeyBoardEvents;
import nova.committee.mcmodwiki.init.mixins.AbstractContainerScreenAccessor;

/**
 * Description:
 * Author: cnlimiter
 * Date: 2022/4/20 23:42
 * Version: 1.0
 */
public class KeyHandler {

    @Environment(EnvType.CLIENT)
    public static void init() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (McmodwikiClient.searchKey.isDown()) {
                Screen screen = Minecraft.getInstance().screen;
                if (screen instanceof AbstractContainerScreen<?> screen1) {
                    Static.LOGGER.info("true");
                    Slot slotUnderMouse = ((AbstractContainerScreenAccessor) screen1).getHoveredSlot();
                    if (slotUnderMouse != null && slotUnderMouse.hasItem()) {
                        ItemStack stack = slotUnderMouse.getItem().copy();
                        //stack.setTag(null);
                        CoreService.openMcMod(stack);
                    }
                }
            }
        });

//        KeyBoardEvents.KEY_PRESSED_EVENT.register((l, i, j, k, m) -> {
//            if (McmodwikiClient.searchKey.isDown()) {
//                    Screen screen = Minecraft.getInstance().screen;
//                    if (screen instanceof AbstractContainerScreen<?>) {
//                        //Static.LOGGER.info("true");
//                        Slot slotUnderMouse = ((AbstractContainerScreenAccessor)screen).getHoveredSlot();
//                        if (slotUnderMouse != null && slotUnderMouse.hasItem()) {
//                            ItemStack stack = slotUnderMouse.getItem().copy();
//                            //stack.setTag(null);
//                            CoreService.openMcMod(stack);
//                        }
//                    }
//            }
//        });

    }

}
