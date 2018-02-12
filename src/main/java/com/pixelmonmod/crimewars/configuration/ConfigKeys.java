package com.pixelmonmod.crimewars.configuration;

import com.google.common.collect.ImmutableMap;
import com.pixelmonmod.crimewars.configuration.keys.IntegerKey;
import com.pixelmonmod.crimewars.configuration.keys.LongKey;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.LinkedHashMap;
import java.util.Map;

public class ConfigKeys {

	/** Specifies the duration of the games length, in minutes */
	private static final ConfigKey<Integer> GAME_TIME_STARTERS = IntegerKey.of("game.team-selection", 5);
	private static final ConfigKey<Integer> GAME_TIME_MAIN = IntegerKey.of("game.main-phase", 30);

	private static Map<String, ConfigKey<?>> KEYS = null;
	public static synchronized Map<String, ConfigKey<?>> getAllKeys() {
		if(KEYS == null) {
			Map<String, ConfigKey<?>> keys = new LinkedHashMap<>();

			try {
				Field[] values = ConfigKeys.class.getFields();
				for(Field f : values) {
					if(!Modifier.isStatic(f.getModifiers()))
						continue;

					Object val = f.get(null);
					if(val instanceof ConfigKey<?>)
						keys.put(f.getName(), (ConfigKey<?>) val);
				}
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}

			KEYS = ImmutableMap.copyOf(keys);
		}

		return KEYS;
	}
}
