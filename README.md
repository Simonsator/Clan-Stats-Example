# Clan-Stats-Example
This is an example which should show you how to create a clan-stat for Clans.

### Adding dependencies in maven to use clans in your plugin
To add Clans as an dependency of your maven project you need to add the following line of code
```xml
	<repositories>
		<repository>
			<id>bungeecord-repo</id>
			<url>https://oss.sonatype.org/content/repositories/snapshots</url>
		</repository>
		<repository>
			<id>simonsators-repo</id>
			<url>http://simonsator.de/repo</url>
		</repository>
	</repositories>
	<dependencies>
		<dependency>
			<groupId>de.simonsator</groupId>
			<artifactId>Clans</artifactId>
			<version>0.9.9.17</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>de.simonsator</groupId>
			<artifactId>BungeecordPartyAndFriends</artifactId>
			<version>1.0.79</version>
			<scope>provided</scope>
		</dependency>
	</dependencies>
```
### How to add a clan-stat
To see how you are adding a clan stat you should view this example class: https://github.com/Simonsator/Clan-Stats-Example/blob/master/src/main/java/de/simonsator/clans/example/stats/StatsExample.java.
### JavaDoc of this example-plugin
The JavaDoc of this plugin can be found here: http://simonsator.de/JavaDoc/Clan-Stats-Example/index.html.
### Download this example-plugin
If you want to see how it looks ingame, just download this example-plugin from here: https://github.com/Simonsator/Clan-Stats-Example/releases.
