package com.zanis.protean.item;

import com.zanis.protean.creativeTab.creativeTabProtean;
import com.zanis.protean.reference.Reference;
import net.minecraft.item.ItemHoe;

public class ItemProteanHoe extends ItemHoe{
    public ItemProteanHoe(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("proteanHoe");
        this.maxStackSize = 1;
        this.setCreativeTab(creativeTabProtean.PROTEAN_TAB);
        this.setTextureName(Reference.MOD_ID + ":proteanHoe");
    }
}
