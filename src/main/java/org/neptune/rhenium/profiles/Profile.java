package org.neptune.rhenium.profiles;

import org.bukkit.plugin.IllegalPluginAccessException;

import lombok.Getter;

@Getter
public class Profile {
    private String name;
    private int credits;

    public String getName() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public int getCredits() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
