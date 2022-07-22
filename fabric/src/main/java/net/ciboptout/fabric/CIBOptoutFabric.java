package net.ciboptout.fabric;

import net.ciboptout.CIBOptout;
import net.fabricmc.api.ModInitializer;

public class CIBOptoutFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CIBOptout.init();
    }
}
