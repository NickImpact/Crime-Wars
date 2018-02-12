package com.pixelmonmod.crimewars.configuration.keys;

import com.pixelmonmod.crimewars.configuration.ConfigAdapter;
import com.pixelmonmod.crimewars.configuration.ConfigKey;

/**
 * A static key represents what is essentially hardcode. There is no pathing to the
 * config to be parsed, but the variable is included as if it is within the config.
 *
 * @param <T> The type of the element within the key
 */
public class StaticKey<T> implements ConfigKey<T> {
	private final T val;

	private StaticKey(T val) {
		this.val = val;
	}

	public static <T> StaticKey of(T val) {
		return new StaticKey<>(val);
	}

	@Override
	public T get(ConfigAdapter adapter) {
		return val;
	}
}
