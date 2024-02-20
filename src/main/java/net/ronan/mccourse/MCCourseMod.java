package net.ronan.mccourse;

import net.fabricmc.api.ModInitializer;

import net.ronan.mccourse.block.ModBlocks;
import net.ronan.mccourse.item.ModItemGroup;
import net.ronan.mccourse.item.ModItems;
import net.ronan.mccourse.util.ModLootTableModifiers;
import net.ronan.mccourse.util.ModRegistries;
import net.ronan.mccourse.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID ="mccourse";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();

		ModVillagers.registerVillagers();

		ModLootTableModifiers.modifyLootTables();
	}
}