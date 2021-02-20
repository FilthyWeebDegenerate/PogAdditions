package me.filthyweebdegenerate.pogadditions;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(PogAdditions.MOD_ID)
public class PogAdditions
{
    public static final String MOD_ID = "pog_additions";

    private static final Logger LOGGER = LogManager.getLogger();

    public PogAdditions() {
        IEventBus Bus = FMLJavaModLoadingContext.get().getModEventBus();
        Bus.addListener(this::setup);

        Registration.register(Bus);
        Registration.registerYES(Bus);
        Registration.registerBep(Bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {}
}

