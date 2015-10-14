package com.zanis.protean.block;


import com.zanis.protean.creativeTab.creativeTabProtean;

public class BlockProteanOreProcessor extends BlockProtean{
    public BlockProteanOreProcessor(){
        super();
        this.setBlockName("proteanOreProcessor");
        this.setBlockTextureName("proteanOreProcessor");
        this.setCreativeTab(creativeTabProtean.PROTEAN_TAB);
    }
}
