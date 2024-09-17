package com.shuye.elementcorrosion.blocks;

import com.shuye.elementcorrosion.ModTabs;
import com.shuye.elementcorrosion.SyesEC;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid= SyesEC.MODID)
public class SyesECBlocks {
    public static final List<CrystalBlock> CRYSTAL_ITEM_LIST = new ArrayList<>();
    public static final List<ItemBlock> CRYSTAL_BLOCK_ITEM_LIST = new ArrayList<>();

    public static final Block IGNIS_CRYSTAL_BLOCK = new CrystalBlock(Material.ROCK, "ignis_crystal_block");

    public static final Block BIOME_GLASS = new BiomeGlassBlock(Material.GLASS, "biome_glass");
    public static final Block BIOME_GLASS_IGNIS = new BiomeGlassBlock(Material.GLASS, "biome_glass_ignis");
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){

        IGNIS_CRYSTAL_BLOCK.setHardness(5);
        event.getRegistry().register(BIOME_GLASS);
        event.getRegistry().register(BIOME_GLASS_IGNIS);
        BIOME_GLASS.setCreativeTab(ModTabs.SYESEC_BUILDING_BLOCKS);
        BIOME_GLASS_IGNIS.setCreativeTab(ModTabs.SYESEC_BUILDING_BLOCKS);

        InitItemBlock(BIOME_GLASS, "biome_glass", ModTabs.SYESEC_BUILDING_BLOCKS);
        InitItemBlock(BIOME_GLASS_IGNIS, "biome_glass", ModTabs.SYESEC_BUILDING_BLOCKS);
        event.getRegistry().register(IGNIS_CRYSTAL_BLOCK);
        event.getRegistry().registerAll(CRYSTAL_ITEM_LIST.toArray(new Block[0]));
    }
    public static void InitItemBlock(Block block, String name, CreativeTabs tab){
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(name);
        item.setUnlocalizedName(name);
        CRYSTAL_BLOCK_ITEM_LIST.add(item);
        block.setCreativeTab(tab);
    }
}
