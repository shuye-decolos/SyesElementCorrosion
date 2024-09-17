package com.shuye.elementcorrosion.blocks;

import com.shuye.elementcorrosion.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomeGlassBlock extends BlockGlass {
    public BiomeGlassBlock(Material materialIn, String name){
        super(materialIn, false);
        setUnlocalizedName(name);
        setRegistryName(name);
        setLightOpacity(1);
        setLightLevel(0.1f);
        ItemBlock item = new ItemBlock(this);
        item.setRegistryName(name);
        item.setUnlocalizedName(name);
        setCreativeTab(ModTabs.SYESEC_BUILDING_BLOCKS);
    }
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }
}
