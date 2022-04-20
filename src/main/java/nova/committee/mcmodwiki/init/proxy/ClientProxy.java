package nova.committee.mcmodwiki.init.proxy;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy implements IProxy {
    public KeyBinding searchKey;

    @Override
    public void init() {
        searchKey = new KeyBinding("key.gui.search", 73, "key.mcmodwiki");
        ClientRegistry.registerKeyBinding(searchKey);
    }
}
