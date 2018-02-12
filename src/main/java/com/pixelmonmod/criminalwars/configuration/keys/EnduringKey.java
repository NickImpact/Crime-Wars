package com.pixelmonmod.criminalwars.configuration.keys;

import com.pixelmonmod.criminalwars.configuration.ConfigAdapter;
import com.pixelmonmod.criminalwars.configuration.ConfigKey;

public class EnduringKey<T> implements ConfigKey<T> {

	private final ConfigKey<T> key;

	private EnduringKey(ConfigKey<T> key) {
		this.key = key;
	}

	public static <T> EnduringKey wrap(ConfigKey<T> key) {
		return new EnduringKey<>(key);
	}

	@Override
	public T get(ConfigAdapter adapter) {
		return key.get(adapter);
	}
}
