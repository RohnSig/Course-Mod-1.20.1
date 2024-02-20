package net.ronan.mccourse.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.ronan.mccourse.MCCourseMod;
import net.ronan.mccourse.block.custom.Blueberrybushblock;

public class ModBlocks {

public static final Block Foundation_Block = registerBlocks("foundation_block",
    new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK)));

    public static final Block Silver_Ore = registerBlocks("silver_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE), UniformIntProvider.create(2, 4)));

    public static final Block Steel_Block = registerBlocks("steel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block Silver_Block = registerBlocks("silver_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block Block_of_Raw_Silver = registerBlocks("block_of_raw_silver",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
    public static final Block Deepslate_Silver_Ore = registerBlocks("deepslate_silver_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE)));

    public static final Block Steel_Ladder = registerBlocks("steel_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)));

    public static final Block Steel_Door = registerBlocks("steel_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR), BlockSetType.IRON));
    public static final Block Steel_Trapdoor = registerBlocks("steel_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR), BlockSetType.IRON));

    public static final Block blueberry_bush = registerBlockWithoutBlockItem("blueberry_bush",
            new Blueberrybushblock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
    return Registry.register(Registries.BLOCK, new Identifier(MCCourseMod.MOD_ID, name), block);
}

    private static Block registerBlocks(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MCCourseMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(MCCourseMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        MCCourseMod.LOGGER.info("Registering ModBlocks for " + MCCourseMod.MOD_ID);
    }
}