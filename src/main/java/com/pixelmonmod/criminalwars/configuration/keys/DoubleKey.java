package com.pixelmonmod.criminalwars.configuration.keys;

import com.pixelmonmod.criminalwars.configuration.ConfigAdapter;
import com.pixelmonmod.criminalwars.configuration.ConfigKey;

public class DoubleKey implements ConfigKey<Double>{
	private final String path;
	private final double def;

	private DoubleKey(String path, double def) {
		this.path = path;
		this.def = def;
	}

	public static DoubleKey of(String path, double def) {
		return new DoubleKey(path, def);
	}

	@Override
	public Double get(ConfigAdapter adapter) {
		return adapter.getDouble(path, def);
	}
}
