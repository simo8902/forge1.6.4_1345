package com.example.helloworld;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = "helloworld", name = "Hello World Mod", version = "1.0")
public class HelloWorldMod {
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("Hello World Mod loaded!");
    }
}
