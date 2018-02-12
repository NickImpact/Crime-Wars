package com.pixelmonmod.crimewars.game.teams;

import com.google.common.collect.Lists;
import com.pixelmonmod.crimewars.game.teams.pokemon.Pokemon;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Team {

	public static final Team ROCKET = new Team(Teams.ROCKET);
	public static final Team MAGMA = new Team(Teams.MAGMA);
	public static final Team AQUA = new Team(Teams.AQUA);
	public static final Team GALACTIC = new Team(Teams.GALACTIC);
	public static final Team PLASMA = new Team(Teams.PLASMA);
	public static final Team FLARE = new Team(Teams.FLARE);

	private Teams team;
	private List<UUID> members;

	/** The list of pokemon to fill the teams starter list */
	private static final List<Pokemon> teamList = Lists.newArrayList();

	public Team(Teams team) {
		this.team = team;
	}

	public String getName() {
		return team.name;
	}

	public String getLeader() {
		return team.leader;
	}

	private enum Teams {
		ROCKET("Team Rocket", "Giovanni"),
		MAGMA("Team Mamga", "Maxie"),
		AQUA("Team Aqua", "Archie"),
		GALACTIC("Team Galactic", "Cyrus"),
		PLASMA("Team Plasma", "Ghetsis"),
		FLARE("Team Flare", "Lysandre"),
		SKULL("Team Skull", "Guzma");

		private String name;
		private String leader;

		private Teams(String name, String leader) {
			this.name = name;
			this.leader = leader;
		}

		public void anon() {
			String anon = "anon.";
			List<String> out = Lists.newArrayList();
			for(int i = 0; i < anon.length(); i++) {
				char c = anon.charAt(i);
				out.add("{" + c + "}");
			}
		}

		public void head_last() {
			List<String> filtered =
					Lists.newArrayList("pop", "top", "suds")
							.stream()
							.filter(str -> str.charAt(0) == str.charAt(str.length() - 1))
							.collect(Collectors.toList());

		}
	}
}
