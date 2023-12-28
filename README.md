# greet-me

![Build](https://github.com/polimer-consumer/greet-me/workflows/Build/badge.svg)

<!-- Plugin description -->
**This plugin can greet you if you feel alone during coding😊.**

I also played with CI/CD process during this plugin development, so it may seem a bit overcomplicated,
but it helped me a lot with understanding Github Actions :)

Oh, and also there is a custom  dialog wrapper I wrote, but I don't use it now as there is an easier
way to create simple dialog windows. 
<!-- Plugin description end -->

## Installation

Clone the repository, run *./gradlew build*.
Go into *build/distributions* and install it manually from this folder using
<kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

## Usage

You can start the plugin by <kbd>Control</kbd>+<kbd>Alt</kbd>+<kbd>G</kbd> and then press <kbd>C</kbd> or double press <kbd>Shift</kbd> and choose *Greet Me* from the list.


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
[docs:plugin-description]: https://plugins.jetbrains.com/docs/intellij/plugin-user-experience.html#plugin-description-and-presentation
