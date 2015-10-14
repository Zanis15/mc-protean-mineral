package com.zanis.protean.item;

import com.zanis.protean.creativeTab.creativeTabProtean;
import net.minecraft.item.ItemSword;

public class ItemProteanSword extends ItemSword{
    public ItemProteanSword(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("proteanPickaxe");
        this.maxStackSize = 1;
        this.setCreativeTab(creativeTabProtean.PROTEAN_TAB);
    }
}
