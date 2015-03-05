package com.professorvennie.modulartools;

import com.professorvennie.modulartools.common.proxey.CommonProxey;
import com.professorvennie.modulartools.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by ProfessorVennie on 3/4/2015 at 7:08 PM.
 */
@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class ModularTools {

    @Mod.Instance
    public static ModularTools INSTANCE;

    @SidedProxy(clientSide = Reference.CLIENT_PROXEY, serverSide = Reference.COMMON_PROXEY)
    public static CommonProxey proxey;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
