package com.zanis.protean.init;


import com.zanis.protean.block.BlockProtean;
import com.zanis.protean.block.BlockProteanBlock;
import com.zanis.protean.block.BlockProteanOre;
import com.zanis.protean.block.BlockProteanOreProcessor;
import cpw.mods.fml.common.registry.GameRegistry;
import com.zanis.protean.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockProtean oreProtean = new BlockProteanOre();
    public static final BlockProtean proteanOreProcessor = new BlockProteanOreProcessor();
    public static final BlockProtean proteanBlock = new BlockProteanBlock();

    public static void init(){
        GameRegistry.registerBlock(oreProtean, "oreProtean");
        GameRegistry.registerBlock(proteanOreProcessor, "proteanOreProcessor");
        GameRegistry.registerBlock(proteanBlock, "proteanBlock");
    }
}
