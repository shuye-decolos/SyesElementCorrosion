package com.shuye.elementcorrosion.biomes;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ElementBiome {
    @SubscribeEvent
    public static void regElementBiome(RegistryEvent.Register<Biome> event){
        Biome.BiomeProperties properties = new Biome.BiomeProperties("Ignis_land");
        

    }
}
