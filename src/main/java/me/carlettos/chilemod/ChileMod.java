package me.carlettos.chilemod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import me.carlettos.chilemod.block.CLBlocks;
import me.carlettos.chilemod.item.CLItems;

public class ChileMod implements ModInitializer {
	public static String ID = "chilemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(ID);
	public static Identifier id(String path) {return new Identifier(ID, path);}

	@Override
	public void onInitialize() {
	    CLBlocks.register();
	    CLItems.register();
	}
}