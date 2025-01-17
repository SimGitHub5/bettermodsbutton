package fuzs.bettermodsbutton.client;

import fuzs.bettermodsbutton.BetterModsButton;
import fuzs.bettermodsbutton.client.handler.ModScreenHandler;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;

@Mod.EventBusSubscriber(modid = BetterModsButton.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BetterModsButtonClient {

    @SubscribeEvent
    public static void onConstructMod(final FMLConstructModEvent evt) {
        final ModScreenHandler handler = new ModScreenHandler();
        MinecraftForge.EVENT_BUS.addListener(handler::onInitGui);
        MinecraftForge.EVENT_BUS.addListener(handler::onDrawScreen);
    }
}
