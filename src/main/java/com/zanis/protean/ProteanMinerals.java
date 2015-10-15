package com.zanis.protean;

import com.zanis.protean.handler.ConfigurationHandler;
import com.zanis.protean.init.ModBlocks;
import com.zanis.protean.init.ModItems;
import com.zanis.protean.init.Recipes;
import com.zanis.protean.proxy.IProxy;
import com.zanis.protean.reference.Reference;
import com.zanis.protean.utility.LogHelper;
import com.zanis.protean.world.ProteanWorldGen;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class ProteanMinerals {
    @Mod.Instance(Reference.MOD_ID)
    public static ProteanMinerals instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
        ModBlocks.init();
        LogHelper.info("Pre Initialization Complete! =D");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        Recipes.init();
        GameRegistry.registerWorldGenerator(new ProteanWorldGen(), 0);
        LogHelper.info("Initialization Complete! =D");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        LogHelper.info("Post Initialization Complete! =D");
    }
}
