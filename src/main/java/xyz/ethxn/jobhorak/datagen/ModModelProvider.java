package xyz.ethxn.jobhorak.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import xyz.ethxn.jobhorak.block.ModBlocks;
import xyz.ethxn.jobhorak.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FROZEN_CRUDE_OIL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JOB_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.JOB_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.JAPPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FROZEN_CRUDE_OIL_CHUNKS, Models.GENERATED);
    }
}
