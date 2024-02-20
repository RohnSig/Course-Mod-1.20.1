package net.ronan.mccourse.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.ronan.mccourse.MCCourseMod;
import net.ronan.mccourse.block.ModBlocks;





public class ModItems {
    public static final Item Dynamite = registerItem("dynamite",
        new Item(new FabricItemSettings()));
    public static final Item Chocolate_Milk = registerItem("chocolate_milk",
            new Item(new FabricItemSettings().food(ModFoodComponents.Chocolate_Milk)));
    public static final Item Banana = registerItem("banana",
            new Item(new FabricItemSettings().food(ModFoodComponents.Banana)));
    public static final Item Blue_Berries = registerItem("blue_berries",
            new AliasedBlockItem(ModBlocks.blueberry_bush, new FabricItemSettings().food(ModFoodComponents.Blue_Berries)));
    public static final Item Corn = registerItem("corn",
            new Item(new FabricItemSettings().food(ModFoodComponents.Corn)));
    public static final Item GOLDEN_SWEET_BERRIES = registerItem("golden_sweet_berries",
            new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_SWEET_BERRIES)));
    public static final Item CHOCOLATE_PIE = registerItem("chocolate_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_PIE)));
    public static final Item BERRY_PIE = registerItem("berry_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.BERRY_PIE)));
    public static final Item Frog_Legs = registerItem("frog_legs",
            new Item(new FabricItemSettings().food(ModFoodComponents.Frog_Legs)));
    public static final Item Cooked_Frog_Legs = registerItem("cooked_frog_legs",
            new Item(new FabricItemSettings().food(ModFoodComponents.Cooked_Frog_Legs)));
    public static final Item Corn_Seeds = registerItem("corn_seeds",
            new Item(new FabricItemSettings()));

    public static final Item Steel_Ingot = registerItem("steel_ingot",
            new Item(new FabricItemSettings()));
    public static final Item Steel_Plate = registerItem("steel_plate",
            new Item(new FabricItemSettings()));
    public static final Item Trident_Shard = registerItem("trident_shard",
            new Item(new FabricItemSettings()));

    public static final Item WITHER_BONE = registerItem("wither_bone",
            new Item(new FabricItemSettings()));
    public static final Item WITHER_BONE_MEAL = registerItem("wither_bone_meal",
            new Item(new FabricItemSettings()));

    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterial.Steel,2,-2f, new FabricItemSettings()));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new PickaxeItem(ModToolMaterial.Steel, 0,-2.3f, new FabricItemSettings()));
    public static final Item STEEL_AXE = registerItem("steel_axe",
            new AxeItem(ModToolMaterial.Steel, 6, -2.7f, new FabricItemSettings()));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(ModToolMaterial.Steel, 1,-2.5f, new FabricItemSettings()));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new HoeItem(ModToolMaterial.Steel, -3,-0.5f, new FabricItemSettings()));
    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterial.Copper,3,-2.4f, new FabricItemSettings()));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new PickaxeItem(ModToolMaterial.Copper, 1,-2.8f, new FabricItemSettings()));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new AxeItem(ModToolMaterial.Copper, 6, -3f, new FabricItemSettings()));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterial.Copper, 2,-3f, new FabricItemSettings()));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new HoeItem(ModToolMaterial.Copper, -1,-1f, new FabricItemSettings()));

    public static final Item Raw_Silver = registerItem("raw_silver",
            new Item(new FabricItemSettings()));
    public static final Item Silver_Ingot = registerItem("silver_ingot",
            new Item(new FabricItemSettings()));
    public static final Item Silver_Nugget = registerItem("silver_nugget",
            new Item(new FabricItemSettings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);

    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(Dynamite);
        entries.add(WITHER_BONE);
        entries.add(WITHER_BONE_MEAL);

        entries.add(Chocolate_Milk);
        entries.add(GOLDEN_SWEET_BERRIES);
        entries.add(CHOCOLATE_PIE);
        entries.add(BERRY_PIE);
        entries.add(Banana);
        entries.add(Blue_Berries);
        entries.add(Corn);
        entries.add(Frog_Legs);
        entries.add(Cooked_Frog_Legs);
        entries.add(Corn_Seeds);

        entries.add(Steel_Ingot);
        entries.add(Raw_Silver);
        entries.add(Silver_Nugget);
        entries.add(Trident_Shard);

        entries.add(STEEL_SWORD);
        entries.add(STEEL_PICKAXE);
        entries.add(STEEL_AXE);
        entries.add(STEEL_SHOVEL);
        entries.add(STEEL_HOE);

        entries.add(COPPER_SWORD);
        entries.add(COPPER_PICKAXE);
        entries.add(COPPER_AXE);
        entries.add(COPPER_SHOVEL);
        entries.add(COPPER_HOE);

        entries.add(ModBlocks.Foundation_Block);
        entries.add(ModBlocks.Silver_Ore);
        entries.add(ModBlocks.Silver_Block);
        entries.add(ModBlocks.Steel_Block);
        entries.add(ModBlocks.Block_of_Raw_Silver);
        entries.add(ModBlocks.Deepslate_Silver_Ore);
        entries.add(ModBlocks.Steel_Ladder);

    }
    public static void registerModItems() {
        MCCourseMod.LOGGER.info("Registering Mod Items for " + MCCourseMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}