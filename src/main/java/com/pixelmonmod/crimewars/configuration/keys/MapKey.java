package com.pixelmonmod.crimewars.configuration.keys;

import com.google.common.collect.ImmutableMap;
import com.pixelmonmod.crimewars.configuration.ConfigAdapter;
import com.pixelmonmod.crimewars.configuration.ConfigKey;

import java.util.Map;

public class MapKey implements ConfigKey<Map<String, String>> {

	private final String path;

	private MapKey(String path) {
		this.path = path;
	}

	public static MapKey of(String path) {
		return new MapKey(path);
	}

	@Override
	public Map<String, String> get(ConfigAdapter adapter) {
		return ImmutableMap.copyOf(adapter.getMap(path, ImmutableMap.of()));
	}
}
