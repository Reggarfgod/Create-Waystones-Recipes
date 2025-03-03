package com.reggarf.mods.create_waystones_recipes.datagen;


import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import com.simibubi.create.infrastructure.data.GeneratedEntriesProvider;
import com.tterrag.registrate.providers.RegistrateDataProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

import static com.reggarf.mods.create_waystones_recipes.Create_waystones_recipes.MODID;
import static com.reggarf.mods.create_waystones_recipes.Create_waystones_recipes.REGISTRATE;

public class CWRDatagen {
	public static void gatherData(GatherDataEvent event) {



		DataGenerator generator = event.getGenerator();
		PackOutput output = generator.getPackOutput();
		CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();



		GeneratedEntriesProvider generatedEntriesProvider = new GeneratedEntriesProvider(output, lookupProvider);
		lookupProvider = generatedEntriesProvider.getRegistryProvider();
		generator.addProvider(event.includeServer(), generatedEntriesProvider);


		generator.addProvider(event.includeServer(), new MechanicalCraftingRecipeGen(output, lookupProvider));


		if (event.includeServer()) {
			ProcessingRecipeGen.registerAll(generator, output, lookupProvider);
		}

		event.getGenerator().addProvider(true, REGISTRATE.setDataProvider(new RegistrateDataProvider(REGISTRATE, MODID, event)));
	}


}
