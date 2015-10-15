package com.zanis.protean.item;


import com.zanis.protean.creativeTab.creativeTabProtean;
import com.zanis.protean.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemProteanPickaxe extends ItemPickaxe{
    public ItemProteanPickaxe(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("proteanPickaxe");
        this.maxStackSize = 1;
        this.setCreativeTab(creativeTabProtean.PROTEAN_TAB);
        this.setTextureName(Reference.MOD_ID + ":proteanPickaxe");
    }



}
