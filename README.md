Pixel Dungeon
=============
###### Forked from [watabou/pixel-dungeon](https://github.com/watabou/pixel-dungeon)

This is a fork of the reddit popular Android rogue-like game [Pixel Dungeon](http://pixeldungeon.watabou.ru/),
developed by [Watabou](https://github.com/watabou), which discontinued the project on October 2015.

In the words of its original creator:
> Pixel Dungeon: Traditional roguelike game with pixel-art graphics and simple interface.

## Intention
When the project was discontinued, the source code was provided as-is, with no documentation and no build system integration.

I have forked the project with the intention of documenting the code, cleaning up the project, integrate it with modern tools 
(IDEA, Gradle 6) and make it easily available for other people.

## Build

### Dependencies
The original Pixel Dungeon depends on an [unnamed game library](https://github.com/watabou/PD-classes) by Watabou.
This project instead uses a fork of that library called [Pixel Library](https://github.com/JordiGarcL/pixel-library).
Pixel Library is published as an artifact on the [Github Packages repository](https://github.com/JordiGarcL/pixel-library/packages). 

#### Local configuration
In order to add the Pixel Library as a dependency, Gradle
[Gradle](https://help.github.com/en/github/managing-packages-with-github-packages/configuring-gradle-for-use-with-github-packages) 
must be configured to authenticate with Github Packages.

This project uses the following gradle properties to define the authentication credentials:
- `github_repo_url`
- `github_username`
- `github_token`


To build this project locally, you must provide the above properties in a `gradle.properties` file 
under the `app` project module.
 

## License
This project is licensed under the terms of the GNU GPLv3 license. 
You can find a copy of the license in the root directory of this project.
 

## Original Work
Pixel Dungeon on Google Play: 
https://play.google.com/store/apps/details?id=com.watabou.pixeldungeon

Official web-site: 
http://pixeldungeon.watabou.ru/

Developer's blog: 
http://pixeldungeon.tumblr.com/