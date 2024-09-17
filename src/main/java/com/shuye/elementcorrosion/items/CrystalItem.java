package com.shuye.elementcorrosion.items;

import com.shuye.elementcorrosion.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import static com.shuye.elementcorrosion.items.SyesECItems.CRYSTAL_ITEM_LIST;

public class CrystalItem extends Item {
    public CrystalItem(String name){
        super();
        setUnlocalizedName(name);
        setCreativeTab(ModTabs.SYESEC);
        setRegistryName(name);
        CRYSTAL_ITEM_LIST.add(this);
    }
}
