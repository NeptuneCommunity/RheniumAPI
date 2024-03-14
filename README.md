# RheniumAPI

Official API of Rhenium

## Installing
You can either shade this repository into your plugin, or run it as a plugin by itself.

1. Clone this repository
2. Enter the directory: `cd RheniumAPI`
3. Build & install with Maven: `mvn clean install`

OR

You can get Rhenium's API from the releases tab, then adding it through a libraries' folder:
```xml
<dependencies>
    <dependency>
        <groupId>org.neptune.rhenium</groupId>
        <artifactId>Rhenium-API</artifactId>
        <version>1.0</version>
        <scope>system</scope>
        <systemPath>${basedir}/libs/Rhenium.jar</systemPath>
    </dependency>
</dependencies>
```

## Usage
There are currently only **2 methods** to use.

Retrieving a player's profile and getting the credits of a player.
```java
    static Profile getProfile(Player player)
    static int getCredits(Player player)
```
The profile object methods are the following ones:
```java
    static String getName()
    static int getCredits()
```
### Examples
Example usage of Rhenium's API

Getting a player's credits on a listener.
```java
    @EventHandler
    public void onPlayerChat(final AsyncPlayerChatEvent event) {
        if (event.getMessage() == "credits") {
            event.setCancelled(true);
            int credits = RheniumAPI.getCredits(event.getPlayer());
            event.getPlayer().sendMessage(ChatColor.translateAlternateChatColors('&', "&eYou have a total of &3&o" + credits + " &ecredits!"))
        }
    }
```