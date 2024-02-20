package net.ronan.mccourse.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.ronan.mccourse.block.ModBlocks;
import net.ronan.mccourse.block.custom.Blueberrybushblock;
import net.ronan.mccourse.item.ModItems;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);}

    @Override
    public void generate() {
        addDrop(ModBlocks.Foundation_Block);
        addDrop(ModBlocks.Steel_Block);
        addDrop(ModBlocks.Block_of_Raw_Silver);
        addDrop(ModBlocks.Silver_Block);
        addDrop(ModBlocks.Steel_Trapdoor);
        addDrop(ModBlocks.Steel_Door, doorDrops(ModBlocks.Steel_Door));

        addDrop(ModBlocks.Silver_Ore, oreDrops(ModBlocks.Silver_Ore, ModItems.Raw_Silver));
        addDrop(ModBlocks.Deepslate_Silver_Ore, oreDrops(ModBlocks.Deepslate_Silver_Ore, ModItems.Raw_Silver));

        LootCondition.Builder builder5 = BlockStatePropertyLootCondition.builder(ModBlocks.blueberry_bush).properties(StatePredicate.Builder.create().exactMatch(Blueberrybushblock.AGE, 3));
        this.addDrop(ModBlocks.blueberry_bush, this.applyExplosionDecay(ModBlocks.blueberry_bush, LootTable.builder().pool(LootPool.builder().with(ItemEntry.builder(ModItems.Blue_Berries))).pool(LootPool.builder().conditionally(builder5).with(ItemEntry.builder(ModItems.Blue_Berries).apply(ApplyBonusLootFunction.binomialWithBonusCount(Enchantments.FORTUNE, 0.5714286F, 3))))));
        this.addDrop(ModBlocks.blueberry_bush, (block) -> this.applyExplosionDecay(block, LootTable.builder().pool(LootPool.builder().conditionally(BlockStatePropertyLootCondition.builder(ModBlocks.blueberry_bush).properties(StatePredicate.Builder.create().exactMatch(Blueberrybushblock.AGE, 2))).with(ItemEntry.builder(ModItems.Blue_Berries)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 3.0F))).apply(ApplyBonusLootFunction.uniformBonusCount(Enchantments.FORTUNE))).pool(LootPool.builder().conditionally(BlockStatePropertyLootCondition.builder(ModBlocks.blueberry_bush).properties(StatePredicate.Builder.create().exactMatch(Blueberrybushblock.AGE, 2))).with(ItemEntry.builder(ModItems.Blue_Berries)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 2.0F))).apply(ApplyBonusLootFunction.uniformBonusCount(Enchantments.FORTUNE)))));
    }
}

