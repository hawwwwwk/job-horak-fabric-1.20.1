package xyz.ethxn.jobhorak.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.ethxn.jobhorak.JobHorak;

public class ModItems {

    public static final Item JOB_INGOT = registerItem("job_ingot", new Item(new FabricItemSettings()));
    public static final Item JAPPLE = registerItem("japple", new Item(new FabricItemSettings().food(ModFoodComponents.JAPPLE)));
    public static final Item FROZEN_CRUDE_OIL_CHUNKS = registerItem("frozen_crude_oil_chunks", new Item(new FabricItemSettings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(JOB_INGOT);
    }
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(JobHorak.MOD_ID, name), item);
    }
    public static void registerModItems() {
        JobHorak.LOGGER.info("Registering mod items for " + JobHorak.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
