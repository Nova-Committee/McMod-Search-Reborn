package nova.committee.mcmodwiki;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(Static.MOD_ID)
public class McmodWiki {
    public McmodWiki() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
