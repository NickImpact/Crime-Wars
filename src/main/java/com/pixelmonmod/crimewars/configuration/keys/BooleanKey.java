package com.pixelmonmod.crimewars.configuration.keys;

import com.pixelmonmod.crimewars.configuration.ConfigAdapter;
import com.pixelmonmod.crimewars.configuration.ConfigKey;

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
