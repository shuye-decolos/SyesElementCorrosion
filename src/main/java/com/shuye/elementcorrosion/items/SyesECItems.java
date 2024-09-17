package com.shuye.elementcorrosion.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.shuye.elementcorrosion.blocks.SyesECBlocks.CRYSTAL_BLOCK_ITEM_LIST;

@Mod.EventBusSubscriber
public class SyesECItems {
    public static final List<CrystalItem> CRYSTAL_ITEM_LIST = new ArrayList<>();

    public static final CrystalItem IGNIS_CRYSTAL = new CrystalItem("ignis_crystal");
    public static final CrystalItem WATER_CRYSTAL = new CrystalItem("water_crystal");
    public static final CrystalItem EARTH_CRYSTAL = new CrystalItem("earth_crystal");
    public static final CrystalItem AIR_CRYSTAL = new CrystalItem("air_crystal");
    public static final CrystalItem METAL_CRYSTAL = new CrystalItem("metal_crystal");


    @SubscribeEvent
    public static void handlerItem(RegistryEvent.Register<Item> event){
//        CRYSTAL_ITEM_LIST.add(IGNIS_CRYSTAL);
//        CRYSTAL_ITEM_LIST.add(WATER_CRYSTAL);
//        CRYSTAL_ITEM_LIST.add(EARTH_CRYSTAL);
//        CRYSTAL_ITEM_LIST.add(AIR_CRYSTAL);
//        CRYSTAL_ITEM_LIST.add(METAL_CRYSTAL);
        event.getRegistry().register(IGNIS_CRYSTAL);
        event.getRegistry().register(WATER_CRYSTAL);
        event.getRegistry().register(EARTH_CRYSTAL);
        event.getRegistry().register(AIR_CRYSTAL);
        event.getRegistry().register(METAL_CRYSTAL);
        event.getRegistry().registerAll(CRYSTAL_BLOCK_ITEM_LIST.toArray(new ItemBlock[0]));
    }
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void onModelReg(ModelRegistryEvent event){
        for (Item item : CRYSTAL_ITEM_LIST)
            ModelLoader.setCustomModelResourceLocation(
                    item,
                    0,
                    new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()),
                            "inventory"));
        for (Item item : CRYSTAL_BLOCK_ITEM_LIST)
            ModelLoader.setCustomModelResourceLocation(
                    item,
                    0,
                    new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()),
                            "inventory"));


    }
}
