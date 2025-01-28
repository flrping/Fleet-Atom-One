rootProject.name = "Fleet Atom One"

include(":fleet-atom-one")
include(":fleet-atom-one:frontendImpl")

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven("https://cache-redirector.jetbrains.com/intellij-dependencies")
        maven("https://packages.jetbrains.team/maven/p/teamcity-rest-client/teamcity-rest-client")
        maven("https://download.jetbrains.com/teamcity-repository")
        maven("https://packages.jetbrains.team/maven/p/fleet/fleet-sdk")
    }
}
