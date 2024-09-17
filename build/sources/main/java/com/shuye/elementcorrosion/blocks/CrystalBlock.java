package com.shuye.elementcorrosion.blocks;

import com.shuye.elementcorrosion.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

import static com.shuye.elementcorrosion.items.SyesECItems.BLOCK_ITEM_LIST;

public class CrystalBlock extends Block {
    public CrystalBlock(Material materialIn, String name){
        super(materialIn);
        setUnlocalizedName(name);
        setRegistryName(name);

        ItemBlock item = new ItemBlock(this);
        item.setRegistryName(name);
        item.setUnlocalizedName(name);
        BLOCK_ITEM_LIST.add(item);
        setCreativeTab(ModTabs.SYESEC);
    }
}
