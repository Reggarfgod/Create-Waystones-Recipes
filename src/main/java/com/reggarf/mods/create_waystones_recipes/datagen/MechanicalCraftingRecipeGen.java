package com.reggarf.mods.create_waystones_recipes.datagen;

import com.google.common.base.Supplier;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.foundation.data.recipe.CreateRecipeProvider;
import com.simibubi.create.foundation.data.recipe.MechanicalCraftingRecipeBuilder;
import net.blay09.mods.waystones.block.ModBlocks;
import net.blay09.mods.waystones.item.ModItems;
import net.createmod.catnip.registry.RegisteredObjectsHelper;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.concurrent.CompletableFuture;
import java.util.function.UnaryOperator;

import static com.reggarf.mods.create_waystones_recipes.Create_waystones_recipes.asResource;

public class MechanicalCraftingRecipeGen extends CreateRecipeProvider {

	GeneratedRecipe

	WAYSTONE = create(ModBlocks.waystone::asItem).returns(2)
		.recipe(b -> b
				.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
			    .key('S', ModItems.warpStone)
			    .key('A', AllBlocks.ANDESITE_CASING)
				.key('O', Items.ENDER_PEARL)
			    .patternLine(" OOO ")
			    .patternLine("PPPPP")
			    .patternLine(" AAA ")
			    .patternLine("  S  ")
			    .patternLine(" AAA ")
				.patternLine("PPPPP")
			.disallowMirrored()),


	MOSSY_WAYSTONE = create(ModBlocks.mossyWaystone::asItem).returns(2)
					.recipe(b -> b
							.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
							.key('S', ModItems.warpStone)
							.key('A', AllBlocks.COPPER_CASING)
							.key('O', Items.ENDER_PEARL)
							.patternLine(" OOO ")
							.patternLine("PPPPP")
							.patternLine(" AAA ")
							.patternLine("  S  ")
							.patternLine(" AAA ")
							.patternLine("PPPPP")
							.disallowMirrored()),


			SANDY_WAYSTONE = create(ModBlocks.sandyWaystone::asItem).returns(2)
					.recipe(b -> b
							.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
							.key('S', ModItems.warpStone)
							.key('A', AllBlocks.BRASS_CASING)
							.key('O', Items.ENDER_PEARL)
							.patternLine(" OOO ")
							.patternLine("PPPPP")
							.patternLine(" AAA ")
							.patternLine("  S  ")
							.patternLine(" AAA ")
							.patternLine("PPPPP")
							.disallowMirrored()),


	END_STONE_WAYSTONE = create(ModBlocks.endStoneWaystone::asItem).returns(2)
							.recipe(b -> b
									.key('P', Ingredient.of(Items.END_STONE))
									.key('S', ModItems.warpStone)
									.key('A', AllBlocks.ANDESITE_CASING)
									.key('O', Items.ENDER_PEARL)
									.patternLine(" OOO ")
									.patternLine("PPPPP")
									.patternLine(" AAA ")
									.patternLine("  S  ")
									.patternLine(" AAA ")
									.patternLine("PPPPP")
									.disallowMirrored()),


			DEEPSLATE_WAYSTONE = create(ModBlocks.deepslateWaystone::asItem).returns(2)
					.recipe(b -> b
							.key('P', Ingredient.of(Items.DEEPSLATE_BRICKS))
							.key('S', ModItems.warpStone)
							.key('A', AllBlocks.ANDESITE_CASING)
							.key('O', Items.ENDER_PEARL)
							.patternLine(" OOO ")
							.patternLine("PPPPP")
							.patternLine(" AAA ")
							.patternLine("  S  ")
							.patternLine(" AAA ")
							.patternLine("PPPPP")
							.disallowMirrored()),


	BLACKSTONE_WAYSTONE = create(ModBlocks.blackstoneWaystone::asItem).returns(2)
			.recipe(b -> b
					.key('P', Ingredient.of(Items.OBSIDIAN))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('O', Items.ENDER_PEARL)
					.patternLine(" OOO ")
					.patternLine("PPPPP")
					.patternLine(" AAA ")
					.patternLine("  S  ")
					.patternLine(" AAA ")
					.patternLine("PPPPP")
					.disallowMirrored()),

	WHITE_PORTSTONE = create(ModBlocks.getPortstone(DyeColor.WHITE)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.WHITE_DYE)
					.patternLine("  S  ")
					.patternLine(" BAB ")
					.patternLine("PPAPP")
					.disallowMirrored()),


			BLACK_PORTSTONE = create(ModBlocks.getPortstone(DyeColor.BLACK)::asItem).returns(1)
					.recipe(b -> b
							.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
							.key('S', ModItems.warpStone)
							.key('A', AllBlocks.ANDESITE_CASING)
							.key('B', Items.BLACK_DYE)
							.patternLine("  S  ")
							.patternLine(" BAB ")
							.patternLine("PPAPP")
							.disallowMirrored()),

					BLUE_PORTSTONE = create(ModBlocks.getPortstone(DyeColor.BLUE)::asItem).returns(1)
							.recipe(b -> b
									.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
									.key('S', ModItems.warpStone)
									.key('A', AllBlocks.ANDESITE_CASING)
									.key('B', Items.BLUE_DYE)
									.patternLine("  S  ")
									.patternLine(" BAB ")
									.patternLine("PPAPP")
									.disallowMirrored()),

	ORANGE_PORTSTONE = create(ModBlocks.getPortstone(DyeColor.ORANGE)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.ORANGE_DYE)
					.patternLine("  S  ")
					.patternLine(" BAB ")
					.patternLine("PPAPP")
					.disallowMirrored()),

	MAGENTA_PORTSTONE = create(ModBlocks.getPortstone(DyeColor.MAGENTA)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.MAGENTA_DYE)
					.patternLine("  S  ")
					.patternLine(" BAB ")
					.patternLine("PPAPP")
					.disallowMirrored()),

			LIGHT_BLUE_PORTSTONE = create(ModBlocks.getPortstone(DyeColor.LIGHT_BLUE)::asItem).returns(1)
					.recipe(b -> b
							.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
							.key('S', ModItems.warpStone)
							.key('A', AllBlocks.ANDESITE_CASING)
							.key('B', Items.LIGHT_BLUE_DYE)
							.patternLine("  S  ")
							.patternLine(" BAB ")
							.patternLine("PPAPP")
							.disallowMirrored()),
					YELLOW_PORTSTONE = create(ModBlocks.getPortstone(DyeColor.YELLOW)::asItem).returns(1)
							.recipe(b -> b
									.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
									.key('S', ModItems.warpStone)
									.key('A', AllBlocks.ANDESITE_CASING)
									.key('B', Items.YELLOW_DYE)
									.patternLine("  S  ")
									.patternLine(" BAB ")
									.patternLine("PPAPP")
									.disallowMirrored()),

					LIME_PORTSTONE = create(ModBlocks.getPortstone(DyeColor.LIME)::asItem).returns(1)
							.recipe(b -> b
									.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
									.key('S', ModItems.warpStone)
									.key('A', AllBlocks.ANDESITE_CASING)
									.key('B', Items.LIME_DYE)
									.patternLine("  S  ")
									.patternLine(" BAB ")
									.patternLine("PPAPP")
									.disallowMirrored()),

							PINK_PORTSTONE = create(ModBlocks.getPortstone(DyeColor.PINK)::asItem).returns(1)
									.recipe(b -> b
											.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
											.key('S', ModItems.warpStone)
											.key('A', AllBlocks.ANDESITE_CASING)
											.key('B', Items.PINK_DYE)
											.patternLine("  S  ")
											.patternLine(" BAB ")
											.patternLine("PPAPP")
											.disallowMirrored()),

	GRAY_PORTSTONE = create(ModBlocks.getPortstone(DyeColor.GRAY)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.GRAY_DYE)
					.patternLine("  S  ")
					.patternLine(" BAB ")
					.patternLine("PPAPP")
					.disallowMirrored()),


	LIGHT_GRAY_PORTSTONE = create(ModBlocks.getPortstone(DyeColor.LIGHT_GRAY)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.LIGHT_GRAY_DYE)
					.patternLine("  S  ")
					.patternLine(" BAB ")
					.patternLine("PPAPP")
					.disallowMirrored()),

	CYAN_PORTSTONE = create(ModBlocks.getPortstone(DyeColor.CYAN)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.CYAN_DYE)
					.patternLine("  S  ")
					.patternLine(" BAB ")
					.patternLine("PPAPP")
					.disallowMirrored()),

	PURPLE_PORTSTONE = create(ModBlocks.getPortstone(DyeColor.PURPLE)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.PURPLE_DYE)
					.patternLine("  S  ")
					.patternLine(" BAB ")
					.patternLine("PPAPP")
					.disallowMirrored()),

	BROWN_PORTSTONE = create(ModBlocks.getPortstone(DyeColor.BROWN)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.BROWN_DYE)
					.patternLine("  S  ")
					.patternLine(" BAB ")
					.patternLine("PPAPP")
					.disallowMirrored()),



	GREEN_PORTSTONE = create(ModBlocks.getPortstone(DyeColor.GREEN)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.GREEN_DYE)
					.patternLine("  S  ")
					.patternLine(" BAB ")
					.patternLine("PPAPP")
					.disallowMirrored()),

			RED_PORTSTONE = create(ModBlocks.getPortstone(DyeColor.RED)::asItem).returns(1)
					.recipe(b -> b
							.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
							.key('S', ModItems.warpStone)
							.key('A', AllBlocks.ANDESITE_CASING)
							.key('B', Items.RED_DYE)
							.patternLine("  S  ")
							.patternLine(" BAB ")
							.patternLine("PPAPP")
							.disallowMirrored()),

	ORANGE_SHARESTONE = create(ModBlocks.getSharestone(DyeColor.ORANGE)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.ORANGE_DYE)
					.patternLine("PPAPP")
					.patternLine(" ABA ")
					.patternLine("  S  ")
					.patternLine(" ABA ")
					.patternLine("PPPPP")
					.disallowMirrored()),

	MAGENTA_SHARESTONE = create(ModBlocks.getSharestone(DyeColor.MAGENTA)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.MAGENTA_DYE)
					.patternLine("PPAPP")
					.patternLine(" ABA ")
					.patternLine("  S  ")
					.patternLine(" ABA ")
					.patternLine("PPPPP")
					.disallowMirrored()),

	LIGHT_BLUE_SHARESTONE = create(ModBlocks.getSharestone(DyeColor.LIGHT_BLUE)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.LIGHT_BLUE_DYE)
					.patternLine("PPAPP")
					.patternLine(" ABA ")
					.patternLine("  S  ")
					.patternLine(" ABA ")
					.patternLine("PPPPP")
					.disallowMirrored()),

	YELLOW_SHARESTONE = create(ModBlocks.getSharestone(DyeColor.YELLOW)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.YELLOW_DYE)
					.patternLine("PPAPP")
					.patternLine(" ABA ")
					.patternLine("  S  ")
					.patternLine(" ABA ")
					.patternLine("PPPPP")
					.disallowMirrored()),

	LIME_SHARESTONE = create(ModBlocks.getSharestone(DyeColor.LIME)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.LIME_DYE)
					.patternLine("PPAPP")
					.patternLine(" ABA ")
					.patternLine("  S  ")
					.patternLine(" ABA ")
					.patternLine("PPPPP")
					.disallowMirrored()),

	PINK_SHARESTONE = create(ModBlocks.getSharestone(DyeColor.PINK)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.PINK_DYE)
					.patternLine("PPAPP")
					.patternLine(" ABA ")
					.patternLine("  S  ")
					.patternLine(" ABA ")
					.patternLine("PPPPP")
					.disallowMirrored()),

	GRAY_SHARESTONE = create(ModBlocks.getSharestone(DyeColor.GRAY)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.GRAY_DYE)
					.patternLine("PPAPP")
					.patternLine(" ABA ")
					.patternLine("  S  ")
					.patternLine(" ABA ")
					.patternLine("PPPPP")
					.disallowMirrored()),

	LIGHT_GRAY_SHARESTONE = create(ModBlocks.getSharestone(DyeColor.LIGHT_GRAY)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.LIGHT_GRAY_DYE)
					.patternLine("PPAPP")
					.patternLine(" ABA ")
					.patternLine("  S  ")
					.patternLine(" ABA ")
					.patternLine("PPPPP")
					.disallowMirrored()),

	CYAN_SHARESTONE = create(ModBlocks.getSharestone(DyeColor.CYAN)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.CYAN_DYE)
					.patternLine("PPAPP")
					.patternLine(" ABA ")
					.patternLine("  S  ")
					.patternLine(" ABA ")
					.patternLine("PPPPP")
					.disallowMirrored()),

			PURPLE_SHARESTONE = create(ModBlocks.getSharestone(DyeColor.PURPLE)::asItem).returns(1)
					.recipe(b -> b
							.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
							.key('S', ModItems.warpStone)
							.key('A', AllBlocks.ANDESITE_CASING)
							.key('B', Items.PURPLE_DYE)
							.patternLine("PPAPP")
							.patternLine(" ABA ")
							.patternLine("  S  ")
							.patternLine(" ABA ")
							.patternLine("PPPPP")
							.disallowMirrored()),

	BLUE_SHARESTONE = create(ModBlocks.getSharestone(DyeColor.BLUE)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.BLUE_DYE)
					.patternLine("PPAPP")
					.patternLine(" ABA ")
					.patternLine("  S  ")
					.patternLine(" ABA ")
					.patternLine("PPPPP")
					.disallowMirrored()),


	BROWN_SHARESTONE = create(ModBlocks.getSharestone(DyeColor.BROWN)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.BROWN_DYE)
					.patternLine("PPAPP")
					.patternLine(" ABA ")
					.patternLine("  S  ")
					.patternLine(" ABA ")
					.patternLine("PPPPP")
					.disallowMirrored()),

	GREEN_SHARESTONE = create(ModBlocks.getSharestone(DyeColor.GREEN)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.GREEN_DYE)
					.patternLine("PPAPP")
					.patternLine(" ABA ")
					.patternLine("  S  ")
					.patternLine(" ABA ")
					.patternLine("PPPPP")
					.disallowMirrored()),

	RED_SHARESTONE = create(ModBlocks.getSharestone(DyeColor.RED)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.RED_DYE)
					.patternLine("PPAPP")
					.patternLine(" ABA ")
					.patternLine("  S  ")
					.patternLine(" ABA ")
					.patternLine("PPPPP")
					.disallowMirrored()),

	BLACK_SHARESTONE = create(ModBlocks.getSharestone(DyeColor.BLACK)::asItem).returns(1)
			.recipe(b -> b
					.key('P', Ingredient.of(ItemTags.STONE_BRICKS))
					.key('S', ModItems.warpStone)
					.key('A', AllBlocks.ANDESITE_CASING)
					.key('B', Items.BLACK_DYE)
					.patternLine("PPAPP")
					.patternLine(" ABA ")
					.patternLine("  S  ")
					.patternLine(" ABA ")
					.patternLine("PPPPP")
					.disallowMirrored())
			;

	public MechanicalCraftingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
		super(output, registries);
	}

	GeneratedRecipeBuilder create(Supplier<ItemLike> result) {
		return new GeneratedRecipeBuilder(result);
	}

	class GeneratedRecipeBuilder {

		private String suffix;
		private Supplier<ItemLike> result;
		private int amount;

		public GeneratedRecipeBuilder(Supplier<ItemLike> result) {
			this.suffix = "";
			this.result = result;
			this.amount = 1;
		}

		GeneratedRecipeBuilder returns(int amount) {
			this.amount = amount;
			return this;
		}

		GeneratedRecipeBuilder withSuffix(String suffix) {
			this.suffix = suffix;
			return this;
		}

		GeneratedRecipe recipe(UnaryOperator<MechanicalCraftingRecipeBuilder> builder) {
			return register(output -> {
				MechanicalCraftingRecipeBuilder b =
					builder.apply(MechanicalCraftingRecipeBuilder.shapedRecipe(result.get(), amount));
				ResourceLocation location = asResource(  RegisteredObjectsHelper.getKeyOrThrow(result.get()
								.asItem())
					.getPath() + suffix);
				b.build(output, location);
			});
		}
	}
}
