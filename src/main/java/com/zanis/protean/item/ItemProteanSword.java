package com.zanis.protean.item;

import com.zanis.protean.creativeTab.creativeTabProtean;
import com.zanis.protean.reference.Reference;
import net.minecraft.item.ItemSword;

public class ItemProteanSword extends ItemSword{
    public ItemProteanSword(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("proteanSword");
        this.maxStackSize = 1;
        this.setCreativeTab(creativeTabProtean.PROTEAN_TAB);
        this.setTextureName(Reference.MOD_ID + ":proteanSword");
    }
}
