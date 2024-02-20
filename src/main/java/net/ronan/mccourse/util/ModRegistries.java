package net.ronan.mccourse.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.ronan.mccourse.item.ModItems;
import net.ronan.mccourse.villager.ModVillagers;

public class ModRegistries {
    public static void registerModStuffs() {
        registerCustomTrades();
        registerModCompostables();
    }

        private static void registerCustomTrades() {
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 3),
                                new ItemStack(Items.HONEY_BOTTLE, 1), 6, 2, 0.02f
                        ));
                    });
            TradeOfferHelper.registerVillagerOffers(ModVillagers.BEE_KEEPER, 1,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 1),
                                new ItemStack(Items.HONEYCOMB, 2), 6, 2, 0.02f
                        ));
                    });
            TradeOfferHelper.registerVillagerOffers(ModVillagers.BEE_KEEPER, 1,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 3),
                                new ItemStack(Items.HONEY_BOTTLE, 1), 6, 2, 0.02f
                        ));
                    });
            TradeOfferHelper.registerVillagerOffers(ModVillagers.BEE_KEEPER, 2,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.POPPY, 8),
                                new ItemStack(Items.CANDLE, 1), 6, 4, 0.02f
                        ));
                    });
            TradeOfferHelper.registerVillagerOffers(ModVillagers.BEE_KEEPER, 3,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 1),
                                new ItemStack(Items.POPPY, 3), 6, 6, 0.02f
                        ));
                    });
            TradeOfferHelper.registerVillagerOffers(ModVillagers.BEE_KEEPER, 4,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 5),
                                new ItemStack(Items.CAMPFIRE, 1), 6, 8, 0.02f
                        ));
                    });
            TradeOfferHelper.registerVillagerOffers(ModVillagers.BEE_KEEPER, 5,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 7),
                                new ItemStack(Items.BEE_NEST, 1), 6, 10, 0.02f
                        ));
                    });
            TradeOfferHelper.registerVillagerOffers(ModVillagers.BEE_KEEPER, 6,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 10), new ItemStack(Items.OXEYE_DAISY, 1),
                                new ItemStack(Items.HONEY_BLOCK, 3), 6, 12, 0.02f
                        ));
                    });
        }
        private static void registerModCompostables(){
            ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.Banana, 0.65f);
            ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.Corn, 0.65f);
            ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.Corn_Seeds, 0.3f);
            ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.Blue_Berries, 0.3f);
            ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CHOCOLATE_PIE, 1.0f);
        }
    }



