package com.zanis.protean.init;

import com.zanis.protean.item.ItemProteanIngot;
import com.zanis.protean.item.ItemProtean;
import com.zanis.protean.item.ItemProteanNugget;
import com.zanis.protean.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemProtean proteanIngot = new ItemProteanIngot();
    public static final ItemProtean proteanNugget = new ItemProteanNugget();

    public static void init(){
        GameRegistry.registerItem(proteanIngot, "proteanIngot");
        GameRegistry.registerItem(proteanNugget, "proteanNugget");

    }
}
