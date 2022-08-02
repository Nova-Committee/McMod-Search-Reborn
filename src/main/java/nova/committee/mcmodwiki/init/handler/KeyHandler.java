package nova.committee.mcmodwiki.init.handler;


import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import nova.committee.mcmodwiki.core.CoreService;

/**
 * Description:
 * Author: cnlimiter
 * Date: 2022/4/20 8:47
 * Version: 1.0
 */
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class KeyHandler {
    public static final KeyMapping searchKey = new KeyMapping("key.gui.search", 73, "key.mcmodwiki");

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onGuiKeyPress(InputEvent.Key event) {
        if (!searchKey.isDown()) return;
        final var screen = Minecraft.getInstance().screen;
        if (screen instanceof AbstractContainerScreen gui) {
            final var slot = gui.getSlotUnderMouse();
            if (slot != null) {
                final var itemStack = slot.getItem();
                if (!itemStack.isEmpty()) CoreService.openMcMod(itemStack);
            }
        }
        if (ModList.get().isLoaded("jei")) JeiHandler.tryInteract();
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onKeyRegistry(RegisterKeyMappingsEvent event) {
        event.register(searchKey);
    }
}
