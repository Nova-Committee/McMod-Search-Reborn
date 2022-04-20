package nova.committee.mcmodwiki.init.proxy;

import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.ClientRegistry;

public class ClientProxy implements IProxy {
    public KeyMapping searchKey;

    @Override
    public void init() {
        searchKey = new KeyMapping("key.gui.search", 73, "key.mcmodwiki");
        ClientRegistry.registerKeyBinding(searchKey);
    }
}
