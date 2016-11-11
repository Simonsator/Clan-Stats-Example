package de.simonsator.clans.example.stats;

import de.simonsator.partyandfriends.api.pafplayers.OnlinePAFPlayer;
import de.simonsator.partyandfriends.clan.api.Clan;
import de.simonsator.partyandfriends.clan.api.ClanStats;
import de.simonsator.partyandfriends.clan.commands.ClanCommands;
import de.simonsator.partyandfriends.clan.commands.subcommands.Stats;
import net.md_5.bungee.api.plugin.Plugin;

/**
 * @author simonbrungs
 * @version 1.0.0 11.11.16
 */
public class StatsExample extends Plugin implements ClanStats {
	public void onEnable() {
		((Stats) ClanCommands.getInstance().getSubCommand(Stats.class)).registerClanStats(this, this);
	}

	public void stats(OnlinePAFPlayer pSender, Clan pClan) {

	}
}
