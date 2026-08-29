package com.reggarf.mods.create_waystones_recipes.data;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.foundation.data.recipe.MechanicalCraftingRecipeBuilder;
import net.blay09.mods.waystones.block.ModBlocks;
import net.blay09.mods.waystones.block.PortstoneBlock;
import net.blay09.mods.waystones.block.SharestoneBlock;
import net.blay09.mods.waystones.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    private static TagKey<Item> tag(String namespace, String path) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath(namespace, path));
    }

    private static TagKey<Item> dyeTag(DyeColor color) {
        return tag("c", "dyes/" + color.getSerializedName());
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        buildWaystoneMechanicalCraftingRecipes(recipeOutput);
        buildScrollMechanicalCraftingRecipes(recipeOutput);
        buildUtilityMechanicalCraftingRecipes(recipeOutput);
        buildStandardCraftingRecipes(recipeOutput);
    }

    private void buildWaystoneMechanicalCraftingRecipes(RecipeOutput recipeOutput) {
        // Waystone (Regular)
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModBlocks.waystone, 2)
                .key('O', Items.ENDER_PEARL)
                .key('A', AllBlocks.ANDESITE_CASING.get())
                .key('P', Items.STONE_BRICKS)
                .key('S', ModItems.warpStone)
                .patternLine(" OOO ")
                .patternLine("AAAAA")
                .patternLine(" PPP ")
                .patternLine("  S  ")
                .patternLine(" PPP ")
                .patternLine("AAPAA")
                .disallowMirrored()
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", "waystone"));

        // Mossy Waystone
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModBlocks.mossyWaystone, 2)
                .key('O', Items.ENDER_PEARL)
                .key('A', AllBlocks.COPPER_CASING.get())
                .key('P', Items.STONE_BRICKS)
                .key('S', ModItems.warpStone)
                .patternLine(" OOO ")
                .patternLine("AAAAA")
                .patternLine(" PPP ")
                .patternLine("  S  ")
                .patternLine(" PPP ")
                .patternLine("AAPAA")
                .disallowMirrored()
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", "mossy_waystone"));

        // Sandy Waystone
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModBlocks.sandyWaystone, 3)
                .key('O', Items.ENDER_PEARL)
                .key('A', AllBlocks.BRASS_CASING.get())
                .key('P', Items.STONE_BRICKS)
                .key('S', ModItems.warpStone)
                .patternLine(" OOO ")
                .patternLine("AAAAA")
                .patternLine(" PPP ")
                .patternLine("  S  ")
                .patternLine(" PPP ")
                .patternLine("AAPAA")
                .disallowMirrored()
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", "sandy_waystone"));

        // Deepslate Waystone
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModBlocks.deepslateWaystone, 2)
                .key('O', Items.ENDER_PEARL)
                .key('A', AllBlocks.ANDESITE_CASING.get())
                .key('P', Items.DEEPSLATE_BRICKS)
                .key('S', ModItems.warpStone)
                .patternLine(" OOO ")
                .patternLine("AAAAA")
                .patternLine(" PPP ")
                .patternLine("  S  ")
                .patternLine(" PPP ")
                .patternLine("AAPAA")
                .disallowMirrored()
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", "deepslate_waystone"));

        // Blackstone Waystone
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModBlocks.blackstoneWaystone, 2)
                .key('O', Items.ENDER_PEARL)
                .key('A', AllBlocks.ANDESITE_CASING.get())
                .key('P', Items.POLISHED_BLACKSTONE_BRICKS)
                .key('S', ModItems.warpStone)
                .patternLine(" OOO ")
                .patternLine("AAAAA")
                .patternLine(" PPP ")
                .patternLine("  S  ")
                .patternLine(" PPP ")
                .patternLine("AAPAA")
                .disallowMirrored()
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", "blackstone_waystone"));

        // End Stone Waystone
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModBlocks.endStoneWaystone, 2)
                .key('O', Items.ENDER_PEARL)
                .key('A', AllBlocks.BRASS_CASING.get())
                .key('P', Items.END_STONE_BRICKS)
                .key('S', ModItems.warpStone)
                .patternLine(" OOO ")
                .patternLine("AAAAA")
                .patternLine(" PPP ")
                .patternLine("  S  ")
                .patternLine(" PPP ")
                .patternLine("AAPAA")
                .disallowMirrored()
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", "end_stone_waystone"));

        // Red Nether Bricks Waystone
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModBlocks.redNetherBricksWaystone, 2)
                .key('O', Items.ENDER_PEARL)
                .key('A', AllBlocks.ANDESITE_CASING.get())
                .key('P', Items.RED_NETHER_BRICKS)
                .key('S', ModItems.warpStone)
                .patternLine(" OOO ")
                .patternLine("AAAAA")
                .patternLine(" PPP ")
                .patternLine("  S  ")
                .patternLine(" PPP ")
                .patternLine("AAPAA")
                .disallowMirrored()
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", "red_nether_bricks_waystone"));

        // Purpur Waystone
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModBlocks.purpurWaystone, 2)
                .key('O', Items.ENDER_PEARL)
                .key('A', AllBlocks.BRASS_CASING.get())
                .key('P', Items.PURPUR_BLOCK)
                .key('S', ModItems.warpStone)
                .patternLine(" OOO ")
                .patternLine("AAAAA")
                .patternLine(" PPP ")
                .patternLine("  S  ")
                .patternLine(" PPP ")
                .patternLine("AAPAA")
                .disallowMirrored()
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", "purpur_waystone"));

        // Prismarine Waystone
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModBlocks.prismarineWaystone, 2)
                .key('O', Items.ENDER_PEARL)
                .key('A', AllBlocks.COPPER_CASING.get())
                .key('P', Items.PRISMARINE_BRICKS)
                .key('S', ModItems.warpStone)
                .patternLine(" OOO ")
                .patternLine("AAAAA")
                .patternLine(" PPP ")
                .patternLine("  S  ")
                .patternLine(" PPP ")
                .patternLine("AAPAA")
                .disallowMirrored()
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", "prismarine_waystone"));

        // Mud Bricks Waystone
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModBlocks.mudBricksWaystone, 2)
                .key('O', Items.ENDER_PEARL)
                .key('A', AllBlocks.ANDESITE_CASING.get())
                .key('P', Items.MUD_BRICKS)
                .key('S', ModItems.warpStone)
                .patternLine(" OOO ")
                .patternLine("AAAAA")
                .patternLine(" PPP ")
                .patternLine("  S  ")
                .patternLine(" PPP ")
                .patternLine("AAPAA")
                .disallowMirrored()
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", "mud_bricks_waystone"));

        // Colored Sharestones (Mechanical Crafting with specific dyes)
        for (SharestoneBlock sharestone : ModBlocks.sharestones) {
            DyeColor color = sharestone.getColor();
            String name = color != null ? color.getSerializedName() + "_sharestone" : "sharestone";
            var builder = MechanicalCraftingRecipeBuilder.shapedRecipe(sharestone, 2)
                    .key('A', AllBlocks.ANDESITE_CASING.get())
                    .key('P', Items.STONE_BRICKS)
                    .key('S', ModItems.warpStone);

            if (color != null) {
                builder.key('D', dyeTag(color))
                        .patternLine("AAAAA")
                        .patternLine("DPPPD")
                        .patternLine("  S  ")
                        .patternLine(" PPP ")
                        .patternLine("AAPAA");
            } else {
                builder.patternLine("AAAAA")
                        .patternLine(" PPP ")
                        .patternLine("  S  ")
                        .patternLine(" PPP ")
                        .patternLine("AAPAA");
            }

            builder.disallowMirrored()
                    .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", name));
        }

        // Colored Portstones (Mechanical Crafting with specific dyes)
        for (PortstoneBlock portstone : ModBlocks.portstones) {
            DyeColor color = portstone.getColor();
            String name = color != null ? color.getSerializedName() + "_portstone" : "portstone";
            var builder = MechanicalCraftingRecipeBuilder.shapedRecipe(portstone, 2)
                    .key('A', AllBlocks.ANDESITE_CASING.get())
                    .key('P', Items.STONE_BRICKS)
                    .key('S', ModItems.warpStone);

            if (color != null) {
                builder.key('D', dyeTag(color))
                        .patternLine(" DSD ")
                        .patternLine(" PPP ")
                        .patternLine("AAPAA");
            } else {
                builder.patternLine("  S  ")
                        .patternLine(" PPP ")
                        .patternLine("AAPAA");
            }

            builder.disallowMirrored()
                    .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", name));
        }
    }

    private void buildScrollMechanicalCraftingRecipes(RecipeOutput recipeOutput) {
        // Warp Scroll
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModItems.warpScroll, 3)
                .key('G', Tags.Items.NUGGETS_GOLD)
                .key('D', Tags.Items.DYES_PURPLE)
                .key('P', Items.PAPER)
                .key('E', Items.ENDER_PEARL)
                .patternLine("GGGGG")
                .patternLine("DPPPD")
                .patternLine("DPEPD")
                .patternLine("GGPGG")
                .disallowMirrored()
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", "warp_scroll"));

        // Return Scroll
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModItems.returnScroll, 3)
                .key('G', Tags.Items.NUGGETS_GOLD)
                .key('D', Tags.Items.DYES_PURPLE)
                .key('P', Items.PAPER)
                .patternLine("GGGGG")
                .patternLine("DPPPD")
                .patternLine("DPPPD")
                .patternLine("GGPGG")
                .disallowMirrored()
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", "return_scroll"));

        // Bound Scroll
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModItems.boundScroll, 3)
                .key('D', Tags.Items.DYES_PURPLE)
                .key('G', Tags.Items.NUGGETS_GOLD)
                .key('P', Items.PAPER)
                .key('E', Items.ENDER_PEARL)
                .patternLine("DDDDD")
                .patternLine("GPPPG")
                .patternLine("GPEPG")
                .patternLine("DDPDD")
                .disallowMirrored()
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", "bound_scroll"));

        // Blank Scroll
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModItems.blankScroll, 3)
                .key('G', Tags.Items.NUGGETS_GOLD)
                .key('D', Tags.Items.DYES_PURPLE)
                .key('P', Items.PAPER)
                .patternLine("GGGGG")
                .patternLine("DPPPD")
                .patternLine("D P D")
                .patternLine("GGPGG")
                .disallowMirrored()
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", "blank_scroll"));

        // Portal Scroll
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModItems.portalScroll, 3)
                .key('G', Tags.Items.NUGGETS_GOLD)
                .key('D', Tags.Items.DYES_PURPLE)
                .key('P', Items.PAPER)
                .key('S', ModItems.warpStone)
                .patternLine("GGGGG")
                .patternLine("DPPPD")
                .patternLine("DPSPD")
                .patternLine("GGPGG")
                .disallowMirrored()
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", "portal_scroll"));
    }

    private void buildUtilityMechanicalCraftingRecipes(RecipeOutput recipeOutput) {
        // Warp Stone
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModItems.warpStone, 1)
                .key('A', Items.AMETHYST_SHARD)
                .key('G', Tags.Items.GEMS_EMERALD)
                .key('P', Items.ENDER_PEARL)
                .patternLine(" AAA ")
                .patternLine("GPPPG")
                .patternLine("GPPPG")
                .patternLine(" APA ")
                .disallowMirrored()
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", "warp_stone"));

        // Warp Plate
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModBlocks.warpPlate, 1)
                .key('A', AllBlocks.ANDESITE_CASING.get())
                .key('S', Items.STONE_BRICKS)
                .key('W', ModItems.warpDust)
                .key('F', Items.FLINT)
                .patternLine("AAAAA")
                .patternLine("S W S")
                .patternLine("S F S")
                .patternLine("AASAA")
                .disallowMirrored()
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", "warp_plate"));

        // Epitaph
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModItems.epitaph, 1)
                .key('G', Tags.Items.NUGGETS_GOLD)
                .key('A', Items.AMETHYST_SHARD)
                .key('D', Items.DEEPSLATE)
                .patternLine("GGGGG")
                .patternLine("A D A")
                .patternLine("A D A")
                .patternLine("GGDGG")
                .disallowMirrored()
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", "epitaph"));

        // Twinbound Feather
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModItems.twinboundFeather, 1)
                .key('G', Tags.Items.NUGGETS_GOLD)
                .key('D', ModItems.warpDust)
                .key('F', Items.FEATHER)
                .key('A', Items.AMETHYST_SHARD)
                .patternLine("  A  ")
                .patternLine(" GFG ")
                .patternLine("  D  ")
                .disallowMirrored()
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", "twinbound_feather"));

        // Dormant Shard
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModItems.dormantShard, 2)
                .key('A', Items.AMETHYST_SHARD)
                .key('D', ModItems.warpDust)
                .key('E', Items.ENDER_PEARL)
                .patternLine(" A ")
                .patternLine("DED")
                .patternLine(" A ")
                .disallowMirrored()
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", "dormant_shard"));

        // Deepslate Shard
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModItems.deepslateShard, 2)
                .key('S', Items.COBBLED_DEEPSLATE)
                .key('D', ModItems.warpDust)
                .key('E', Items.ENDER_PEARL)
                .patternLine(" S ")
                .patternLine("DED")
                .patternLine(" S ")
                .disallowMirrored()
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", "deepslate_shard"));
    }

    private void buildStandardCraftingRecipes(RecipeOutput recipeOutput) {
        // Sharestones recoloring (shapeless: any sharestone + color dye -> colored sharestone)
        Ingredient anySharestone = Ingredient.of(ModBlocks.sharestones);

        for (SharestoneBlock sharestone : ModBlocks.sharestones) {
            DyeColor color = sharestone.getColor();
            if (color != null) {
                ShapelessRecipeBuilder.shapeless(RecipeCategory.TRANSPORTATION, sharestone)
                        .requires(dyeTag(color))
                        .requires(anySharestone)
                        .unlockedBy("has_sharestone", has(sharestone))
                        .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", color.getSerializedName() + "_sharestone_recolor"));
            }
        }

        // Portstones recoloring (shapeless: any portstone + color dye -> colored portstone)
        Ingredient anyPortstone = Ingredient.of(ModBlocks.portstones);

        for (PortstoneBlock portstone : ModBlocks.portstones) {
            DyeColor color = portstone.getColor();
            if (color != null) {
                ShapelessRecipeBuilder.shapeless(RecipeCategory.TRANSPORTATION, portstone)
                        .requires(dyeTag(color))
                        .requires(anyPortstone)
                        .unlockedBy("has_portstone", has(portstone))
                        .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("waystones", color.getSerializedName() + "_portstone_recolor"));
            }
        }
    }
}
