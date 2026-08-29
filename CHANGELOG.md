# Changelog

All notable changes to the **Create: Waystones Recipes** mod are documented in this file.

---

## [3.0.1.b] - 1.21.1 NeoForge

###  Added
- **Minecraft 1.21.1 & NeoForge Support**: Full port to NeoForge 21.1.128 and Create 6.0.0.
- **Epitaph Recipe**: Added Create Mechanical Crafting recipe for Epitaph using original Waystones ingredients (`c:nuggets/gold`, `minecraft:amethyst_shard`, `minecraft:deepslate`).
- **New Item & Block Recipes**:
  - Mechanical Crafting for **Warp Plate**
  - Mechanical Crafting for **Twinbound Feather**
  - Mechanical Crafting for **Dormant Shard**
  - Mechanical Crafting for **Deepslate Shard**
  - Recipes for new Waystones variants (Mud Bricks Waystone, Prismarine Waystone, etc.)

###  Changed
- **Casing Replacement**: Changed **Blackstone Waystone** and **Red Nether Bricks Waystone** mechanical crafting recipes to use **Andesite Casing** instead of Train / Railway Casing.
- Modernized data generation pipeline to use NeoForge 1.21 `RecipeOutput` and `RecipeProvider`.

###  Fixed
- **Tag Conventions**: Migrated all ingredient tags from legacy `forge:` namespace to NeoForge `c:` namespace (`c:dyes/*`, `c:nuggets/gold`, `c:gems/emerald`, `c:dyes/purple`).
- **Recoloring Recipes**: Fixed empty/invalid tag issues for all colored Sharestone and Portstone shapeless recoloring recipes.

###  Removed
- **Train Casing**: Removed all usages of Train / Railway Casing (`create:railway_casing`) across all recipes.
