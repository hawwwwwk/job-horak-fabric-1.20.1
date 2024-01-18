package xyz.ethxn.jobhorak.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import xyz.ethxn.jobhorak.JobHorak;

public class ModItems {

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        // add items here lol
    }
    public static void registerModItems(){
        JobHorak.LOGGER.info("Registering mod items for " + JobHorak.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
