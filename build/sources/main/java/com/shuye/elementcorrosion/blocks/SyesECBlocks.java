package com.shuye.elementcorrosion.blocks;

import com.shuye.elementcorrosion.ModTabs;
import com.shuye.elementcorrosion.SyesEC;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

import static com.shuye.elementcorrosion.items.SyesECItems.BLOCK_ITEM_LIST;

@Mod.EventBusSubscriber(modid= SyesEC.MODID)
public class SyesECBlocks {
//    public static final List<CrystalBlock> CRYSTAL_ITEM_LIST = new ArrayList<>();
//    public static final List<ItemBlock> CRYSTAL_BLOCK_ITEM_LIST = new ArrayList<>();
//    public static final List<Block> REACTOR_BLOCK_LIST = new ArrayList<>();

//    public static final List<Item> BLOCK_ITEM_LIST = new ArrayList<>();
    public static final List<Block> BLOCK_LIST = new ArrayList<>();


    public static final Block IGNIS_CRYSTAL_BLOCK = new CrystalBlock(Material.ROCK, "ignis_crystal_block");

    public static final Block BIOME_GLASS = new BiomeGlassBlock(Material.GLASS, "biome_glass");
    public static final Block BIOME_GLASS_IGNIS = new BiomeGlassBlock(Material.GLASS, "biome_glass_ignis");

    public static final Block REACTOR_BASIC_BLOCK = new Block(Material.ROCK);
    public static final Block REACTOR_CORE = new Block(Material.IRON);
    public static final Block REACTOR_PREVENTION_BLOCK = new Block(Material.IRON);
    public static final Block REACTOR_CONTROLLER = new Block(Material.IRON);
    public static final Block REACTOR_STABILIZER = new Block(Material.ANVIL);

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        //set all Blocks
        IGNIS_CRYSTAL_BLOCK.setHardness(5);

        //Set block RegistryName
        REACTOR_BASIC_BLOCK.setRegistryName("reactor_basic_block");
        REACTOR_CORE.setRegistryName("reactor_core");
        REACTOR_PREVENTION_BLOCK.setRegistryName("reactor_prevention_block");
        REACTOR_CONTROLLER.setRegistryName("reactor_controller");
        REACTOR_STABILIZER.setRegistryName("reactor_stabilizer");

        //Add Blocks
        BLOCK_LIST.add(IGNIS_CRYSTAL_BLOCK);
        BLOCK_LIST.add(BIOME_GLASS);
        BLOCK_LIST.add(BIOME_GLASS_IGNIS);
        BLOCK_LIST.add(REACTOR_BASIC_BLOCK);
        BLOCK_LIST.add(REACTOR_CORE);
        BLOCK_LIST.add(REACTOR_PREVENTION_BLOCK);
        BLOCK_LIST.add(REACTOR_CONTROLLER);
        BLOCK_LIST.add(REACTOR_STABILIZER);

        //Set Creative Tab
        BIOME_GLASS.setCreativeTab(ModTabs.SYESEC_BUILDING_BLOCKS);
        BIOME_GLASS_IGNIS.setCreativeTab(ModTabs.SYESEC_BUILDING_BLOCKS);
        IGNIS_CRYSTAL_BLOCK.setCreativeTab(ModTabs.SYESEC_BUILDING_BLOCKS);

        REACTOR_BASIC_BLOCK.setCreativeTab(ModTabs.SYESEC_BUILDING_BLOCKS);
        REACTOR_CORE.setCreativeTab(ModTabs.SYESEC_BUILDING_BLOCKS);
        REACTOR_PREVENTION_BLOCK.setCreativeTab(ModTabs.SYESEC_BUILDING_BLOCKS);
        REACTOR_CONTROLLER.setCreativeTab(ModTabs.SYESEC_BUILDING_BLOCKS);
        REACTOR_STABILIZER.setCreativeTab(ModTabs.SYESEC_BUILDING_BLOCKS);


        //New ItemBlocks from Block
        InitItemBlock(BIOME_GLASS, "biome_glass", ModTabs.SYESEC_BUILDING_BLOCKS);
        InitItemBlock(BIOME_GLASS_IGNIS, "biome_glass_ignis", ModTabs.SYESEC_BUILDING_BLOCKS);

        InitItemBlock(REACTOR_BASIC_BLOCK, "reactor_basic", ModTabs.SYESEC_BUILDING_BLOCKS);
        InitItemBlock(REACTOR_CORE, "reactor_core", ModTabs.SYESEC_BUILDING_BLOCKS);
        InitItemBlock(REACTOR_PREVENTION_BLOCK, "reactor_prevention_block", ModTabs.SYESEC_BUILDING_BLOCKS);
        InitItemBlock(REACTOR_CONTROLLER, "reactor_controller", ModTabs.SYESEC_BUILDING_BLOCKS);
        InitItemBlock(REACTOR_STABILIZER, "reactor_stabilizer", ModTabs.SYESEC_BUILDING_BLOCKS);

        //Register All Block
        event.getRegistry().registerAll(BLOCK_LIST.toArray(new Block[0]));
    }
    public static void InitItemBlock(Block block, String name, CreativeTabs tab){
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(name);
        item.setUnlocalizedName(name);
        BLOCK_ITEM_LIST.add(item);
//        block.setCreativeTab(tab);
    }
}
