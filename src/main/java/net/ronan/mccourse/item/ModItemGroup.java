package net.ronan.mccourse.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.ronan.mccourse.MCCourseMod;
import net.ronan.mccourse.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup ROHNS_IMPROVED_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCCourseMod.MOD_ID, "steel_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rohns_improved_group"))
                    .icon(() -> new ItemStack(ModBlocks.Steel_Block)).entries((displayContext, entries) -> {
                        entries.add(ModItems.Steel_Ingot);
                        entries.add(ModItems.STEEL_SWORD);
                        entries.add(ModItems.STEEL_PICKAXE);
                        entries.add(ModItems.STEEL_AXE);
                        entries.add(ModItems.STEEL_SHOVEL);
                        entries.add(ModItems.STEEL_HOE);

                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.COPPER_HOE);

                        entries.add(ModItems.Silver_Ingot);
                        entries.add(ModItems.GOLDEN_SWEET_BERRIES);
                        entries.add(ModItems.Dynamite);
                        entries.add(ModItems.CHOCOLATE_PIE);
                        entries.add(ModItems.BERRY_PIE);

                        entries.add(ModItems.Banana);
                        entries.add(ModItems.Blue_Berries);
                        entries.add(ModItems.Frog_Legs);
                        entries.add(ModItems.Cooked_Frog_Legs);
                        entries.add(ModItems.Corn);
                        entries.add(ModItems.Corn_Seeds);
                        entries.add(ModItems.Raw_Silver);
                        entries.add(ModItems.Silver_Nugget);
                        entries.add(ModItems.Steel_Plate);
                        entries.add(ModItems.WITHER_BONE);
                        entries.add(ModItems.WITHER_BONE_MEAL);
                        entries.add(ModItems.Trident_Shard);
                        entries.add(ModItems.Chocolate_Milk);
                        entries.add(ModBlocks.Steel_Block);
                        entries.add(ModBlocks.Silver_Block);
                        entries.add(ModBlocks.Block_of_Raw_Silver);
                        entries.add(ModBlocks.Silver_Ore);
                        entries.add(ModBlocks.Foundation_Block);
                        entries.add(ModBlocks.Deepslate_Silver_Ore);

                        entries.add(ModBlocks.Steel_Door);
                        entries.add(ModBlocks.Steel_Trapdoor);

                    }).build());
    public static void  registerItemGroups(){

    }
}
