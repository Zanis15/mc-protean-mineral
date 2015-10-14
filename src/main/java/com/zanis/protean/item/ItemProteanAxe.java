package com.zanis.protean.item;

import com.zanis.protean.creativeTab.creativeTabProtean;
import net.minecraft.item.ItemAxe;

public class ItemProteanAxe  extends ItemAxe {
    public ItemProteanAxe(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("proteanAxe");
        this.maxStackSize = 1;
        this.setCreativeTab(creativeTabProtean.PROTEAN_TAB);
    }
}
