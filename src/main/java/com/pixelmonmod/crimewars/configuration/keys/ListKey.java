package com.pixelmonmod.crimewars.configuration.keys;

import com.pixelmonmod.crimewars.configuration.ConfigAdapter;
import com.pixelmonmod.crimewars.configuration.ConfigKey;

import java.util.List;

public class ListKey implements ConfigKey<List<String>> {
	private final String path;
	private final List<String> def;

	private ListKey(String path, List<String> def) {
		this.path = path;
		this.def = def;
	}

	public static ListKey of(String path, List<String> def) {
		return new ListKey(path, def);
	}

	@Override
	public List<String> get(ConfigAdapter adapter) {
		return null;
	}
}
