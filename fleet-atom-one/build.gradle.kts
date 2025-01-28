plugins {
    base
    alias(libs.plugins.fleet.plugin)
}

version = "0.1.0"

fleetPlugin {
     id = "dev.flrp.fleet-atom-one"

     metadata {
         readableName = "Fleet Atom One"
         description = "A recreation of the popular Atom One themes for JetBrains Fleet."
     }

    fleetRuntime {
        version = "1.45.163"
    }
}
