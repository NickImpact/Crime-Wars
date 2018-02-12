package com.pixelmonmod.criminalwars.configuration.keys;

import com.pixelmonmod.criminalwars.configuration.ConfigAdapter;
import com.pixelmonmod.criminalwars.configuration.ConfigKey;

public class LongKey implements ConfigKey<Long> {

	private final String path;
	private final long def;

	private LongKey(String path, long def) {
		this.path = path;
		this.def = def;
	}

	public static LongKey of(String path, long def) {
		return new LongKey(path, def);
	}

	@Override
	public Long get(ConfigAdapter adapter) {
		return adapter.getLong(path, def);
	}
}
