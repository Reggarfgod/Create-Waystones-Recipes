package com.reggarf.mods.create_waystones_recipes;


import com.reggarf.mods.create_waystones_recipes.datagen.CWRDatagen;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.blay09.mods.waystones.Waystones;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;


@Mod(Create_waystones_recipes.MODID)
public class Create_waystones_recipes {
    public static final String MODID = "create_waystones_recipes";

    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MODID)
            .defaultCreativeTab((ResourceKey<CreativeModeTab>) null);
    public Create_waystones_recipes(IEventBus modEventBus, ModContainer modContainer) {
        //datagen
        modEventBus.addListener(EventPriority.LOWEST, CWRDatagen::gatherData);
    }

    public static ResourceLocation asResource(String path) {
        return ResourceLocation.fromNamespaceAndPath(Waystones.MOD_ID, path);
    }
}
