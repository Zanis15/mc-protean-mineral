package com.zanis.protean.item;


import com.zanis.protean.creativeTab.creativeTabProtean;
import com.zanis.protean.reference.Reference;
import net.minecraft.item.ItemSpade;

public class ItemProteanShovel extends ItemSpade {
    public ItemProteanShovel(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("proteanShovel");
        this.maxStackSize = 1;
        this.setCreativeTab(creativeTabProtean.PROTEAN_TAB);
        this.setTextureName(Reference.MOD_ID + ":proteanShovel");
    }
}
