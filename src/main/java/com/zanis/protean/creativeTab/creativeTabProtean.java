package com.zanis.protean.creativeTab;

import com.zanis.protean.init.ModItems;
import com.zanis.protean.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class creativeTabProtean {
    public static final CreativeTabs PROTEAN_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.proteanCore;
        }
        @Override
        public String getTranslatedTabLabel(){
            return "Protean Minerals";
        }
    };
}
