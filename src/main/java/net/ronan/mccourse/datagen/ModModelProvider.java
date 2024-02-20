package net.ronan.mccourse.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.ronan.mccourse.block.ModBlocks;
import net.ronan.mccourse.block.custom.Blueberrybushblock;
import net.ronan.mccourse.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public  ModModelProvider (FabricDataOutput output) {
        super(output);}

    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool SteelTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Steel_Block);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Steel_Block);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Silver_Block);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Silver_Ore);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Deepslate_Silver_Ore);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Block_of_Raw_Silver);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Foundation_Block);

        blockStateModelGenerator.registerDoor(ModBlocks.Steel_Door);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.Steel_Trapdoor);

        blockStateModelGenerator.registerCrop(ModBlocks.blueberry_bush, Blueberrybushblock.AGE, 0, 1, 2, 3);
    }

    public void generateItemModels(ItemModelGenerator itemModelGenerator) {


        itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.Banana, Models.GENERATED);
        itemModelGenerator.register(ModItems.Blue_Berries, Models.GENERATED);
        itemModelGenerator.register(ModItems.Chocolate_Milk, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHOCOLATE_PIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.Cooked_Frog_Legs, Models.GENERATED);
        itemModelGenerator.register(ModItems.Corn, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_SWEET_BERRIES, Models.GENERATED);

        itemModelGenerator.register(ModItems.Dynamite, Models.GENERATED);
        itemModelGenerator.register(ModItems.Silver_Ingot, Models.GENERATED);
        itemModelGenerator.register(ModItems.Silver_Nugget, Models.GENERATED);
        itemModelGenerator.register(ModItems.Raw_Silver, Models.GENERATED);
        itemModelGenerator.register(ModItems.Trident_Shard, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITHER_BONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITHER_BONE_MEAL, Models.GENERATED);

    }
}
