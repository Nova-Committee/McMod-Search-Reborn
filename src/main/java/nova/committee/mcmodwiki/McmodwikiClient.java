package nova.committee.mcmodwiki;

import com.mojang.blaze3d.platform.InputConstants;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;
import nova.committee.mcmodwiki.init.handler.KeyHandler;
import org.lwjgl.glfw.GLFW;

/**
 * Description:
 * Author: cnlimiter
 * Date: 2022/4/21 10:44
 * Version: 1.0
 */
@Environment(EnvType.CLIENT)
public class McmodwikiClient implements ClientModInitializer {

    public static KeyMapping searchKey;

    @Override
    public void onInitializeClient() {
        searchKey = KeyBindingHelper.registerKeyBinding(new KeyMapping(
                "key.gui.search",
                InputConstants.Type.KEYSYM,
                GLFW.GLFW_KEY_I,
                "key.mcmodwiki"
        ));


        KeyHandler.init();


    }
}
