package net.ciboptout.forge;

import dev.architectury.platform.forge.EventBuses;
import net.ciboptout.CIBOptout;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("cib-optout")
public class CIBOptoutForge {
    public CIBOptoutForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus("cib-optout", FMLJavaModLoadingContext.get().getModEventBus());
        CIBOptout.init();
    }
}
