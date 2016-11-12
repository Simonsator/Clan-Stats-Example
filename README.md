# Clan-Stats-Example
This is an example which should show you how to create a clan-stat for Clans.

### Adding dependencies in maven
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
			<version>0.9.8.15</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>de.simonsator</groupId>
			<artifactId>BungeecordPartyAndFriends</artifactId>
			<version>1.0.45</version>
			<scope>provided</scope>
		</dependency>
	</dependencies>
```
