package xyz.ethxn.jobhorak.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;
import xyz.ethxn.jobhorak.block.ModBlocks;
import xyz.ethxn.jobhorak.item.ModItems;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.FROZEN_CRUDE_OIL_CHUNKS, RecipeCategory.DECORATIONS,
                ModBlocks.FROZEN_CRUDE_OIL_BLOCK);
    }
}
