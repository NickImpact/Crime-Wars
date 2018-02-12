package com.pixelmonmod.crimewars.configuration.keys;

import com.pixelmonmod.crimewars.configuration.ConfigAdapter;
import com.pixelmonmod.crimewars.configuration.ConfigKey;

import java.util.function.Function;

public class AbstractKey<T> implements ConfigKey<T> {
	private final Function<ConfigAdapter, T> function;

	private AbstractKey(Function<ConfigAdapter, T> function) {
		this.function = function;
	}

	public static <T> AbstractKey of(Function<ConfigAdapter, T> function) {
		return new AbstractKey<>(function);
	}

	@Override
	public T get(ConfigAdapter adapter) {
		return function.apply(adapter);
	}
}
