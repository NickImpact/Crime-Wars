package com.pixelmonmod.criminalwars.statistics;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.pixelmonmod.criminalwars.game.teams.Team;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class GameStats {

	private Team winningTeam;
	private Map<UUID, Integer> numStolenPokemon = Maps.newHashMap();

	public List<String> outputFinalStats() {
		return Lists.newArrayList();
	}
}
