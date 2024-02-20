package net.ronan.mccourse.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.ronan.mccourse.MCCourseMod;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(MCCourseMod.MOD_ID, name));
        }

    private static TagKey<Block> createCommonBlockTag(String name) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier("c", name));
    }
}

    public static class Items {

        private static TagKey<Item> createItemtag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(MCCourseMod.MOD_ID, name));
        }

        private static TagKey<Item> createCommonItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier("c", name));
        }
    }
}