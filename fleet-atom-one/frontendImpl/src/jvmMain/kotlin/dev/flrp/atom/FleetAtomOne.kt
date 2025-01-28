package dev.flrp.atom

import fleet.dock.api.ThemeId
import fleet.frontend.theme.registerTheme
import fleet.kernel.plugins.ContributionScope
import fleet.kernel.plugins.Plugin
import fleet.kernel.plugins.PluginScope

class FleetAtomOne : Plugin<Unit> {
    companion object : Plugin.Key<Unit>

    override val key: Plugin.Key<Unit> = FleetAtomOne

    override fun ContributionScope.load(pluginScope: PluginScope) {
        registerTheme(ThemeId(id = "atom-one-dark"))
        registerTheme(ThemeId(id = "atom-one-light"))
    }
}
