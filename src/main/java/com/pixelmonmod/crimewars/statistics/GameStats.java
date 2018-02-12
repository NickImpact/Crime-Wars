package com.pixelmonmod.crimewars.statistics;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.pixelmonmod.crimewars.game.teams.Team;

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
