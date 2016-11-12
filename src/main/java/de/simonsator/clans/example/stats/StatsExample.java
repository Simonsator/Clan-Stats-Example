package de.simonsator.clans.example.stats;

import de.simonsator.partyandfriends.api.pafplayers.OnlinePAFPlayer;
import de.simonsator.partyandfriends.clan.api.Clan;
import de.simonsator.partyandfriends.clan.api.ClanStat;
import de.simonsator.partyandfriends.clan.commands.ClanCommands;
import de.simonsator.partyandfriends.clan.commands.subcommands.Stats;
import net.md_5.bungee.api.plugin.Plugin;

/**
 * @author Simonsator
 * @version 1.0.0 11.11.16
 */
public class StatsExample extends Plugin implements ClanStat {

	/**
	 * onEnable method. In this method the Clan stat gets registered.
	 */
	public void onEnable() {
		// Gets the instance of the main clan command (/clan).
		ClanCommands clanCommandInstance = ClanCommands.getInstance();

		// Gets the SubCommand which is an instance of the given class (in this case Stats (/clan stats)).
		Stats statCommand = ((Stats) clanCommandInstance.getSubCommand(Stats.class));

		// registers this as a ClanStat, which should be called (stats(OnlinePAFPlayer pSender, Clan pClan)) if a player uses /clan stats.
		statCommand.registerClanStats(this, this);
	}

	/**
	 * onDisable method. In this method the Clan stat gets unregistered (must not be done onDisable)
	 */
	public void onDisable() {
		// Gets the instance of the main clan command (/clan).
		ClanCommands clanCommandInstance = ClanCommands.getInstance();

		// Gets the SubCommand which is an instance of the given class (in this case Stats (/clan stats)).
		Stats statCommand = ((Stats) clanCommandInstance.getSubCommand(Stats.class));

		/*
		* Unregisters all ClanStats which were registered by this plugin. The method
		* stats(OnlinePAFPlayer pSender, Clan pClan) of this class will no longer be called if /clan stats get called by a player.
		*/
		statCommand.unregisterAll(this);
	}

	/**
	 * This method gets executed when a player calls the command /clan stats <clan>
	 * @param pSender The player who executed /clan stats
	 * @param pClan The clan of which the stats was requested (it c
	 */
	public void stats(OnlinePAFPlayer pSender, Clan pClan) {
		// Here belongs the code which should be executed when /clan stats is called.


		// Sends a message to the player who used /clan stats and tells him, how many people of this clan are online at the moment
		pSender.sendMessage("From this clan are " + pClan.getAllOnlineClanPlayers() + " members online.");
	}
}
