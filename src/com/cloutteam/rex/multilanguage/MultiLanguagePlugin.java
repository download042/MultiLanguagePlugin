package com.cloutteam.rex.multilanguage;

import java.util.Set;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import com.cloutteam.rex.multilanguage.api.Language;
import com.cloutteam.rex.multilanguage.plugin.MultiLanguagePlugin.PluginType;

public class MultiLanguagePlugin {

	/**
	 * Get the {@link com.cloutteam.rex.multilanguage.api.Language
	 * LanguageManager} using this method. It handles all translations.
	 * 
	 * @return The only {@link com.cloutteam.rex.multilanguage.api.Language
	 *         LanguageManager} instance.
	 * 
	 * @category Spigot/Bukkit only
	 * 
	 * @since 0.1.5
	 * 
	 * @author Rexcantor64
	 */
	public Language getLanguageManager() {
		return null;
	}

	/**
	 * Get the syntax. For example, if the syntax is "lang", the syntax in game
	 * will be [lang]messageCode[/lang]
	 * 
	 * @return The syntax to use in-game to start language messages.
	 * 
	 * @author Rexcantor64
	 */
	public String getSyntax() {
		return null;
	}

	/**
	 * Get the args syntax. For example, if the syntax is "lang" and the args
	 * syntax "args", the syntax in game will be
	 * [lang]messageCode[args]args[/args][/lang]
	 * 
	 * @return The syntax to use in-game to start the arguments.
	 * 
	 * @author Rexcantor64
	 */
	public String getSyntaxArgs() {
		return null;
	}

	/**
	 * Get the arg syntax. For example, if the syntax is "lang", the args syntax
	 * "args" and the arg syntax "arg", the syntax in game will be
	 * [lang]messageCode[args][arg]arg1[/arg][arg]arg2[/arg][/args][/lang]
	 * 
	 * @return The syntax to use in-game to start the arguments.
	 * 
	 * @author Rexcantor64
	 */
	public String getSyntaxArg() {
		return null;
	}

	/**
	 * 
	 * @return If you are using SQL to save the player's language or not.
	 * 
	 * @author Rexcantor64
	 */
	public boolean useSql() {
		return false;
	}

	/**
	 * 
	 * @return If you are checking for language regex on chat or not.
	 * 
	 * @author Rexcantor64
	 */
	public boolean translateChat() {
		return false;
	}

	/**
	 * 
	 * @return If you are checking for language regex on titles/subtitles or
	 *         not.
	 * 
	 * @author Rexcantor64
	 */
	public boolean translateTitles() {
		return false;
	}

	/**
	 * 
	 * @return If you are checking for language regex on actionbars or not.
	 * 
	 * @author Rexcantor64
	 */
	public boolean translateActionBars() {
		return false;
	}

	/**
	 * 
	 * @return If you are checking for language regex on GUI titles or not.
	 * 
	 * @author Rexcantor64
	 */
	public boolean translateGUIs() {
		return false;
	}

	/**
	 * 
	 * @return If you are checking for language regex on scoreboards or not.
	 * 
	 * @author Rexcantor64
	 */
	public boolean translateScoreboards() {
		return false;
	}

	/**
	 * 
	 * @return If you are checking for language regex on kick messages or not.
	 * 
	 * @author Rexcantor64
	 */
	public boolean translateKick() {
		return false;
	}

	/**
	 * 
	 * @return If you are checking for language regex on tab header and footer
	 *         or not.
	 * 
	 * @author Rexcantor64
	 */
	public boolean translateTab() {
		return false;
	}

	/**
	 * 
	 * @return If you are checking for language regex on item's name and lore or
	 *         not.
	 * 
	 * @author Rexcantor64
	 */
	public boolean translateItems() {
		return false;
	}

	/**
	 * 
	 * @return If you are checking for language regex on item's name and lore or
	 *         not (if the item is inside the inventory).
	 * 
	 * @author Rexcantor64
	 */
	public boolean translateInventoryItems() {
		return false;
	}

	/**
	 * 
	 * @return The array list of translating entity titles.
	 * 
	 * @author Rexcantor64
	 */
	public Set<EntityType> translateHolograms() {
		return null;
	}

	/**
	 * 
	 * @param p
	 *            The player to open the GUI
	 * 
	 * @author Rexcantor64
	 */
	public void openLanguagesSelectionGUI(Player p) {
	}

	/**
	 * Get the only MultiLanguagePlugin instance. You can also get it by using
	 * {@link org.bukkit.plugin.PluginManager#getPlugin(String)
	 * (MultiLanguagePlugin)
	 * Bukkit.getPluginManager().getPlugin("MultiLanguagePlugin")}
	 * 
	 * @return The only MultiLanguagePlugin instance
	 * 
	 * @author Rexcantor64
	 * 
	 */
	@Deprecated
	public static MultiLanguagePlugin get() {
		return null;
	}

	/**
	 * 
	 * @return Returns {@link MultiLanguagePlugin.PluginType#SPIGOT
	 *         PluginType.SPIGOT}
	 * 
	 * @author Rexcantor64
	 */
	public PluginType getType() {
		return PluginType.SPIGOT;
	}

}
