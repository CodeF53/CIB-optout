package net.ciboptout;

import dev.architectury.event.events.common.PlayerEvent;
import dev.architectury.networking.NetworkManager;
import io.netty.buffer.Unpooled;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;

public class CIBOptout {
    public static final ResourceLocation OPTOUT_PACKET = new ResourceLocation("cardinalboats", "optout");
    
    public static void init() {
        PlayerEvent.PLAYER_JOIN.register((ServerPlayer player)->{
            FriendlyByteBuf buf = new FriendlyByteBuf(Unpooled.buffer());
            NetworkManager.sendToPlayer(player, OPTOUT_PACKET, buf);
        });
    }
}
