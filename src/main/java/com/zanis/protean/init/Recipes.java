package com.zanis.protean.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes {
    public static void init(){

        GameRegistry.addRecipe(new ItemStack(ModItems.proteanPickaxe), new Object[] {"###", " I ", " I ", '#', ModItems.proteanIngot, 'I', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ModItems.proteanAxe), new Object[] {"## ", "#I ", " I ", '#', ModItems.proteanIngot, 'I', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ModItems.proteanHoe), new Object[] {"## ", " I ", " I ", '#', ModItems.proteanIngot, 'I', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ModItems.proteanShovel), new Object[] {" # ", " I ", " I ", '#', ModItems.proteanIngot, 'I', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ModItems.proteanSword), new Object[] {" # ", " # ", " I ", '#', ModItems.proteanIngot, 'I', Items.stick});

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.proteanNugget, 9), new Object[] {ModItems.proteanIngot});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.proteanIngot, 9), new Object[] {ModBlocks.proteanBlock});

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.proteanIngot), new Object[] {ModItems.proteanNugget, ModItems.proteanNugget, ModItems.proteanNugget, ModItems.proteanNugget, ModItems.proteanNugget, ModItems.proteanNugget, ModItems.proteanNugget, ModItems.proteanNugget, ModItems.proteanNugget, });
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.proteanBlock), new Object[] {ModItems.proteanIngot, ModItems.proteanIngot, ModItems.proteanIngot, ModItems.proteanIngot, ModItems.proteanIngot, ModItems.proteanIngot, ModItems.proteanIngot, ModItems.proteanIngot, ModItems.proteanIngot, });

        GameRegistry.addSmelting(ModItems.proteanCore, new ItemStack(ModItems.proteanIngot), 1.0F);
    }
}
