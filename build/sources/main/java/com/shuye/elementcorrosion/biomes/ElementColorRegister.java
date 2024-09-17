package com.shuye.elementcorrosion.biomes;

import com.shuye.elementcorrosion.blocks.RegisterBlock;
import com.shuye.elementcorrosion.blocks.SyesECBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ElementColorRegister {
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerElementColor(ColorHandlerEvent.Block event){
        event.getBlockColors().registerBlockColorHandler(new IBlockColor() {
            @Override
            public int colorMultiplier(IBlockState state, @Nullable IBlockAccess worldIn, @Nullable BlockPos pos, int tintIndex) {
                return worldIn != null && pos != null ? BiomeColorHelper.getFoliageColorAtPos(worldIn, pos) : -1;
            }
        }, SyesECBlocks.BIOME_GLASS
        );
    }
}
