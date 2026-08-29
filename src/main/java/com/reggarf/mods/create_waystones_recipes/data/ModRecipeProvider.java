package com.reggarf.mods.create_waystones_recipes.data;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.api.data.recipe.MechanicalCraftingRecipeBuilder;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(PackOutput packOutput) {
        super(packOutput);
    }

    private static ItemLike waystoneItem(String name) {
        Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation("waystones", name));
        if (item != null) {
            return item;
        }
        return () -> ForgeRegistries.ITEMS.getValue(new ResourceLocation("waystones", name));
    }

    private static TagKey<Item> tag(String namespace, String path) {
        return ItemTags.create(new ResourceLocation(namespace, path));
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        buildMechanicalCraftingRecipes(consumer);
        buildStandardCraftingRecipes(consumer);
    }

    private void buildMechanicalCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        // Waystone (Regular)
        MechanicalCraftingRecipeBuilder.shapedRecipe(waystoneItem("waystone"), 2)
                .key('O', Items.ENDER_PEARL)
                .key('A', AllBlocks.ANDESITE_CASING.get())
                .key('P', Items.STONE_BRICKS)
                .key('S', waystoneItem("warp_stone"))
                .patternLine(" OOO ")
                .patternLine("AAAAA")
                .patternLine(" PPP ")
                .patternLine("  S  ")
                .patternLine(" PPP ")
                .patternLine("AAPAA")
                .disallowMirrored()
                .build(consumer, new ResourceLocation("waystones", "waystone"));

        // Mossy Waystone
        MechanicalCraftingRecipeBuilder.shapedRecipe(waystoneItem("mossy_waystone"), 2)
                .key('O', Items.ENDER_PEARL)
                .key('A', AllBlocks.COPPER_CASING.get())
                .key('P', Items.STONE_BRICKS)
                .key('S', waystoneItem("warp_stone"))
                .patternLine(" OOO ")
                .patternLine("AAAAA")
                .patternLine(" PPP ")
                .patternLine("  S  ")
                .patternLine(" PPP ")
                .patternLine("AAPAA")
                .disallowMirrored()
                .build(consumer, new ResourceLocation("waystones", "mossy_waystone"));

        // Sandy Waystone
        MechanicalCraftingRecipeBuilder.shapedRecipe(waystoneItem("sandy_waystone"), 3)
                .key('O', Items.ENDER_PEARL)
                .key('A', AllBlocks.BRASS_CASING.get())
                .key('P', Items.STONE_BRICKS)
                .key('S', waystoneItem("warp_stone"))
                .patternLine(" OOO ")
                .patternLine("AAAAA")
                .patternLine(" PPP ")
                .patternLine("  S  ")
                .patternLine(" PPP ")
                .patternLine("AAPAA")
                .disallowMirrored()
                .build(consumer, new ResourceLocation("waystones", "sandy_waystone"));

        // Deepslate Waystone
        MechanicalCraftingRecipeBuilder.shapedRecipe(waystoneItem("deepslate_waystone"), 2)
                .key('O', Items.ENDER_PEARL)
                .key('A', AllBlocks.ANDESITE_CASING.get())
                .key('P', Items.DEEPSLATE_BRICKS)
                .key('S', waystoneItem("warp_stone"))
                .patternLine(" OOO ")
                .patternLine("AAAAA")
                .patternLine(" PPP ")
                .patternLine("  S  ")
                .patternLine(" PPP ")
                .patternLine("AAPAA")
                .disallowMirrored()
                .build(consumer, new ResourceLocation("waystones", "deepslate_waystone"));

        // Blackstone Waystone (Black Waystone)
        MechanicalCraftingRecipeBuilder.shapedRecipe(waystoneItem("blackstone_waystone"), 2)
                .key('O', Items.ENDER_PEARL)
                .key('A', AllBlocks.RAILWAY_CASING.get())
                .key('P', Items.POLISHED_BLACKSTONE_BRICKS)
                .key('S', waystoneItem("warp_stone"))
                .patternLine(" OOO ")
                .patternLine("AAAAA")
                .patternLine(" PPP ")
                .patternLine("  S  ")
                .patternLine(" PPP ")
                .patternLine("AAPAA")
                .disallowMirrored()
                .build(consumer, new ResourceLocation("waystones", "blackstone_waystone"));

        // End Stone Waystone (Ender Waystone)
        MechanicalCraftingRecipeBuilder.shapedRecipe(waystoneItem("end_stone_waystone"), 2)
                .key('O', Items.ENDER_PEARL)
                .key('A', AllBlocks.BRASS_CASING.get())
                .key('P', Items.END_STONE_BRICKS)
                .key('S', waystoneItem("warp_stone"))
                .patternLine(" OOO ")
                .patternLine("AAAAA")
                .patternLine(" PPP ")
                .patternLine("  S  ")
                .patternLine(" PPP ")
                .patternLine("AAPAA")
                .disallowMirrored()
                .build(consumer, new ResourceLocation("waystones", "end_stone_waystone"));

        // Sharestone
        MechanicalCraftingRecipeBuilder.shapedRecipe(waystoneItem("sharestone"), 2)
                .key('A', AllBlocks.ANDESITE_CASING.get())
                .key('P', Items.STONE_BRICKS)
                .key('S', waystoneItem("warp_stone"))
                .patternLine("AAAAA")
                .patternLine(" PPP ")
                .patternLine("  S  ")
                .patternLine(" PPP ")
                .patternLine("AAPAA")
                .disallowMirrored()
                .build(consumer, new ResourceLocation("waystones", "sharestone"));

        // Portstone
        MechanicalCraftingRecipeBuilder.shapedRecipe(waystoneItem("portstone"), 2)
                .key('A', AllBlocks.ANDESITE_CASING.get())
                .key('P', Items.STONE_BRICKS)
                .key('S', waystoneItem("warp_stone"))
                .patternLine("  S  ")
                .patternLine(" PPP ")
                .patternLine("AAPAA")
                .disallowMirrored()
                .build(consumer, new ResourceLocation("waystones", "portstone"));

        // Warp Stone
        MechanicalCraftingRecipeBuilder.shapedRecipe(waystoneItem("warp_stone"))
                .key('A', Items.AMETHYST_SHARD)
                .key('G', tag("balm", "emeralds"))
                .key('P', Items.ENDER_PEARL)
                .patternLine(" AAA ")
                .patternLine("GPPPG")
                .patternLine("GPPPG")
                .patternLine(" APA ")
                .disallowMirrored()
                .build(consumer, new ResourceLocation("waystones", "warp_stone"));

        // Warp Plate
        MechanicalCraftingRecipeBuilder.shapedRecipe(waystoneItem("warp_plate"))
                .key('A', AllBlocks.ANDESITE_CASING.get())
                .key('S', Items.STONE_BRICKS)
                .key('W', waystoneItem("warp_dust"))
                .key('F', Items.FLINT)
                .patternLine("AAAAA")
                .patternLine("S W S")
                .patternLine("S F S")
                .patternLine("AASAA")
                .disallowMirrored()
                .build(consumer, new ResourceLocation("waystones", "warp_plate"));

        // Warp Scroll
        MechanicalCraftingRecipeBuilder.shapedRecipe(waystoneItem("warp_scroll"), 3)
                .key('G', tag("balm", "gold_nuggets"))
                .key('D', tag("balm", "purple_dyes"))
                .key('P', Items.PAPER)
                .key('E', Items.ENDER_PEARL)
                .patternLine("GGGGG")
                .patternLine("DPPPD")
                .patternLine("DPEPD")
                .patternLine("GGPGG")
                .disallowMirrored()
                .build(consumer, new ResourceLocation("waystones", "warp_scroll"));

        // Return Scroll
        MechanicalCraftingRecipeBuilder.shapedRecipe(waystoneItem("return_scroll"), 3)
                .key('G', tag("balm", "gold_nuggets"))
                .key('D', tag("balm", "purple_dyes"))
                .key('P', Items.PAPER)
                .patternLine("GGGGG")
                .patternLine("DPPPD")
                .patternLine("DPPPD")
                .patternLine("GGPGG")
                .disallowMirrored()
                .build(consumer, new ResourceLocation("waystones", "return_scroll"));

        // Bound Scroll
        MechanicalCraftingRecipeBuilder.shapedRecipe(waystoneItem("bound_scroll"), 3)
                .key('D', tag("balm", "purple_dyes"))
                .key('G', tag("balm", "gold_nuggets"))
                .key('P', Items.PAPER)
                .key('E', Items.ENDER_PEARL)
                .patternLine("DDDDD")
                .patternLine("GPPPG")
                .patternLine("GPEPG")
                .patternLine("DDPDD")
                .disallowMirrored()
                .build(consumer, new ResourceLocation("waystones", "bound_scroll"));

    }

    private void buildStandardCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        // Clear Sharestone (revert dyed sharestone to base sharestone)
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TRANSPORTATION, waystoneItem("sharestone"))
                .requires(Items.BONE_MEAL)
                .requires(tag("waystones", "dyed_sharestone"))
                .unlockedBy("has_dyed_sharestone", has(tag("waystones", "dyed_sharestone")))
                .save(consumer, new ResourceLocation("waystones", "clear_sharestone"));

        // 16 Colored Sharestones
        String[] colors = {
                "black", "blue", "brown", "cyan", "gray", "green",
                "light_blue", "light_gray", "lime", "magenta",
                "orange", "pink", "purple", "red", "white", "yellow"
        };
        for (String color : colors) {
            ShapelessRecipeBuilder.shapeless(RecipeCategory.TRANSPORTATION, waystoneItem(color + "_sharestone"))
                    .requires(tag("balm", color + "_dyes"))
                    .requires(tag("waystones", "sharestone"))
                    .unlockedBy("has_sharestone", has(tag("waystones", "sharestone")))
                    .save(consumer, new ResourceLocation("waystones", color + "_sharestone"));
        }
    }
}
