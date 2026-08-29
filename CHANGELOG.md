# Changelog

All notable changes to the **Create: Waystones Recipes** mod will be documented in this file.

---

## [2.0.1.b] - 2026-08-29

### Added
- **New Waystone Variants in Mechanical Crafting**:
  - **Deepslate Waystone** (`waystones:deepslate_waystone`): Crafted using Andesite Casings, Deepslate Bricks, Ender Pearls, and a Warp Stone.
  - **Blackstone Waystone** (`waystones:blackstone_waystone`): Crafted using Railway Casings, Polished Blackstone Bricks, Ender Pearls, and a Warp Stone.
  - **End Stone Waystone** (`waystones:end_stone_waystone`): Crafted using Brass Casings, End Stone Bricks, Ender Pearls, and a Warp Stone.
- **Mechanical Crafting Support for Waystones Items**:
  - **Warp Stone** (`waystones:warp_stone`): Migrated to a custom 5×4 Mechanical Crafting grid (Amethyst Shards, Emeralds, Ender Pearls).
  - **Warp Plate** (`waystones:warp_plate`): Migrated to a custom 5×4 Mechanical Crafting grid (Andesite Casings, Stone Bricks, Warp Dust, Flint).
  - **Warp Scroll** (`waystones:warp_scroll`): Migrated to a custom 5×4 Mechanical Crafting grid (Gold Nuggets, Purple Dyes, Paper, Ender Pearl).
  - **Return Scroll** (`waystones:return_scroll`): Migrated to a custom 5×4 Mechanical Crafting grid (Gold Nuggets, Purple Dyes, Paper).
  - **Bound Scroll** (`waystones:bound_scroll`): Migrated to a custom 5×4 Mechanical Crafting grid (Purple Dyes, Gold Nuggets, Paper, Ender Pearl).
  - **Warp Dust** (`waystones:warp_dust`): Converted to Mechanical Crafting recipe.

### Fixed
- **Recipe Overwrite Priority**:
  - Updated `mods.toml` dependency ordering for `waystones` and `create` to `ordering = "AFTER"`.
  - Fixed an issue where default Waystones recipes overrode the custom Create mechanical crafting recipes due to mod/datapack load order.
---

## [1.0.1.b]

### Added
- Initial Mechanical Crafting recipes for regular **Waystone**, **Mossy Waystone**, **Sandy Waystone**, **Sharestone**, and **Portstone**.
- Standard recipes for **Warp Stone**, **Warp Plate**, **Warp Scroll**, **Return Scroll**, **Bound Scroll**, and **Warp Dust**.
- Support for 16 colored Sharestone dyes and Clear Sharestone recipe.
