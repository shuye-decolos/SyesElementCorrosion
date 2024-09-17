package com.shuye.elementcorrosion;

import com.shuye.elementcorrosion.blocks.SyesECBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModTabs {
    public static final CreativeTabs SYESEC = new CreativeTabs(CreativeTabs.getNextID(), "syesec.materials")
    {
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem()
        {
            return new ItemStack(Items.NETHER_STAR);
        }
    };
    public static final CreativeTabs SYESEC_BUILDING_BLOCKS = new CreativeTabs(CreativeTabs.getNextID(), "syesec.buildingBlocks")
    {
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem()
        {
            return new ItemStack(Item.getItemFromBlock(SyesECBlocks.BIOME_GLASS));
        }
    };
}
