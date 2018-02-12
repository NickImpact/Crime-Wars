package com.pixelmonmod.criminalwars.configuration.keys;

import com.pixelmonmod.criminalwars.configuration.ConfigAdapter;
import com.pixelmonmod.criminalwars.configuration.ConfigKey;

public class BooleanKey implements ConfigKey<Boolean> {
	private final String path;
	private final boolean def;

	private BooleanKey(String path, boolean def) {
		this.path = path;
		this.def = def;
	}

	public static BooleanKey of(String path, boolean def) {
		return new BooleanKey(path, def);
	}

	@Override
	public Boolean get(ConfigAdapter adapter) {
		return adapter.getBoolean(path, def);
	}
}
