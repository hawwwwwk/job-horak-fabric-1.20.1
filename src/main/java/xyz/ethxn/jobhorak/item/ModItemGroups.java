package xyz.ethxn.jobhorak.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xyz.ethxn.jobhorak.JobHorak;
import xyz.ethxn.jobhorak.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup JOB_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(JobHorak.MOD_ID, "job"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.job"))
                    .icon(() -> new ItemStack(ModItems.JOB_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.FROZEN_CRUDE_OIL_CHUNKS);
                        entries.add(ModBlocks.FROZEN_CRUDE_OIL_BLOCK);
                        entries.add(ModItems.JOB_INGOT);
                        entries.add(ModBlocks.JOB_BLOCK);
                        entries.add(ModItems.JAPPLE);
                    }).build());

    public static void registerItemGroups() {
        JobHorak.LOGGER.info("Registering item groups for " + JobHorak.MOD_ID);
    }
}
