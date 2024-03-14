package org.neptune.rhenium.api;

import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.neptune.rhenium.profiles.Profile;

public class RheniumAPI {
    public static int getCredits(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static Profile getProfile(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}