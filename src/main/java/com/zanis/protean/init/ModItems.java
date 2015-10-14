package com.zanis.protean.init;

import com.zanis.protean.item.*;
import com.zanis.protean.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static Item.ToolMaterial PROTEAN = EnumHelper.addToolMaterial("PROTEAN", 3, 1561, 12.0F, 3.0F, 22);

    public static final ItemProtean proteanIngot = new ItemProteanIngot();
    public static final ItemProtean proteanNugget = new ItemProteanNugget();
    public static final ItemProtean proteanCore = new ItemProteanCore();

    public static final ItemPickaxe proteanPickaxe = new ItemProteanPickaxe(PROTEAN);
    public static final ItemAxe proteanAxe = new ItemProteanAxe(PROTEAN);
    public static final ItemHoe proteanHoe = new ItemProteanHoe(PROTEAN);
    public static final ItemSpade proteanShovel = new ItemProteanShovel(PROTEAN);
    public static final ItemSword proteanSword = new ItemProteanSword(PROTEAN);



    public static void init(){
        GameRegistry.registerItem(proteanIngot, "proteanIngot");
        GameRegistry.registerItem(proteanNugget, "proteanNugget");
        GameRegistry.registerItem(proteanPickaxe, "proteanPickaxe");
        GameRegistry.registerItem(proteanAxe, "proteanAxe");
        GameRegistry.registerItem(proteanHoe, "proteanHoe");
        GameRegistry.registerItem(proteanShovel, "proteanShovel");
        GameRegistry.registerItem(proteanSword, "proteanSword");
    }
}
