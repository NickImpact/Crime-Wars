package com.pixelmonmod.crimewars.configuration.keys;

import com.pixelmonmod.crimewars.configuration.ConfigAdapter;
import com.pixelmonmod.crimewars.configuration.ConfigKey;

public class IntegerKey implements ConfigKey<Integer> {
	private final String path;
	private final int def;

	private IntegerKey(String path, int def) {
		this.path = path;
		this.def = def;
	}

	public static IntegerKey of(String path, int def) {
		return new IntegerKey(path, def);
	}

	@Override
	public Integer get(ConfigAdapter adapter) {
		return adapter.getInt(path, def);
	}
}
