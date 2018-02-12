package com.pixelmonmod.crimewars;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
public class CrimeWars {

	@Mod.Instance(ModInfo.ID)
	public static CrimeWars instance;

	/** Logger for Pixelmon errors. */
	private static final Logger LOGGER = LogManager.getLogger(ModInfo.NAME);

	@Mod.EventHandler
	public void onInit(FMLInitializationEvent e) {
		LOGGER.info("Initializing Criminal Wars " + ModInfo.VERSION + "...");

	}
}
