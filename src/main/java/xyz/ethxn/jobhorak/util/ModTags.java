package xyz.ethxn.jobhorak.util;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import xyz.ethxn.jobhorak.JobHorak;

public class ModTags {
    public static class Blocks {
    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(JobHorak.MOD_ID));
        }
    }
}
