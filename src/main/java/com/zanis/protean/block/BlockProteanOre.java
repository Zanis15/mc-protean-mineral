package com.zanis.protean.block;

import com.zanis.protean.creativeTab.creativeTabProtean;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import java.util.Random;

public class BlockProteanOre extends BlockProtean{
    private Item drop;
    private int least_quantity;
    private int most_quantity;

    public BlockProteanOre(Item drop, int least, int most){
        super(Material.rock);
        this.drop = drop;
        this.least_quantity = least;
        this.most_quantity = most;
        this.setBlockName("oreProtean");
        this.setBlockTextureName("oreProtean");
        this.setStepSound(soundTypeStone);
        this.setHardness(10.0f);
        this.setResistance(20.0f);
        this.setHarvestLevel("pickaxe", 2);
        this.setCreativeTab(creativeTabProtean.PROTEAN_TAB);
    }

    @Override
    public Item getItemDropped(int meta, Random random, int fortune){
        return this.drop;
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random){
        return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
    }
}
