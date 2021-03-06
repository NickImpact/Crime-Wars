package com.pixelmonmod.crimewars.configuration.keys;

import com.pixelmonmod.crimewars.configuration.ConfigAdapter;
import com.pixelmonmod.crimewars.configuration.ConfigKey;

public class StringKey implements ConfigKey<String> {
	private final String path;
	private final String def;

	private StringKey(String path, String def) {
		this.path = path;
		this.def = def;
	}

	public static StringKey of(String path, String def) {
		return new StringKey(path, def);
	}

	@Override
	public String get(ConfigAdapter adapter) {
		return adapter.getString(path, def);
	}
}
