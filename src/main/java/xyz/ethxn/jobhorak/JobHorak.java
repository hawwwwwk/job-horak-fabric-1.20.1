package xyz.ethxn.jobhorak;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.ethxn.jobhorak.block.ModBlocks;
import xyz.ethxn.jobhorak.item.ModItemGroups;
import xyz.ethxn.jobhorak.item.ModItems;

public class JobHorak implements ModInitializer {
	public static final String MOD_ID = "jobhorak";
    public static final Logger LOGGER = LoggerFactory.getLogger("jobhorak");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}