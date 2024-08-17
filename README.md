# FRC Kotlin Robot Code Project Template

This is template for FRC robot code that uses Kotlin instead of Java (for robot code and gradle scripts)

Additionally, this template uses LoggedRobot from AdvantageKit instead of the traditional TimedRobot from WPILIB.

### Getting Started With This Template

There are few steps necessary in order to make sure this project is configured correctly

1) The team number in the [wpilib_preferences.json](.wpilib/wpilib_preferences.json) file needs to be set to the correct team number
2) The version of the GradleRIO plugin may need to be changed depending on the version of WPILIB you have installed locally. This is located in the plugins section of the [build.gradle.kts](build.gradle.kts) file.

```kotlin
plugins {
    java
    kotlin("jvm") version "1.9.22"
    id("edu.wpi.first.GradleRIO") version "2024.3.2" // <--- Change this to the correct version
}
```