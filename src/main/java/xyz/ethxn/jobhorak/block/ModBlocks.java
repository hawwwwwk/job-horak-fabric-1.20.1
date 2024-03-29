package xyz.ethxn.jobhorak.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import xyz.ethxn.jobhorak.JobHorak;
import xyz.ethxn.jobhorak.block.custom.JobBlock;

public class ModBlocks {

    public static final Block JOB_BLOCK = registerBlock("job_block",
            new JobBlock(FabricBlockSettings.copyOf(Blocks.WARPED_WART_BLOCK).sounds(BlockSoundGroup.HONEY)));
    public static final Block FROZEN_CRUDE_OIL_BLOCK = registerBlock("frozen_crude_oil_block",
            new Block(FabricBlockSettings.copyOf(Blocks.TUFF)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(JobHorak.MOD_ID, name), block);
    }
    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(JobHorak.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        JobHorak.LOGGER.info("Registering mod blocks for " + JobHorak.MOD_ID);
    }
}
