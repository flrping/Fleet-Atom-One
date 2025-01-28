module dev.flrp.atom {
    requires fleet.frontend;
    requires fleet.kernel;
    requires fleet.util.logging.api;
    requires fleet.rhizomedb;
    requires fleet.frontend.ui;

    exports dev.flrp.atom;
    provides fleet.kernel.plugins.Plugin with dev.flrp.atom.FleetAtomOne;
}