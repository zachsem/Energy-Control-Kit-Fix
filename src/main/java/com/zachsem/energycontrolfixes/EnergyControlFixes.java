package com.zachsem.energycontrolfixes;

import net.minecraftforge.fml.common.Mod;

@Mod(
    modid = EnergyControlFixes.MODID,
    name = EnergyControlFixes.NAME,
    version = EnergyControlFixes.VERSION,
    dependencies = "required-after:energycontrol;after:thermalexpansion;",
    acceptedMinecraftVersions = "[1.12.2]",
    useMetadata = true
)
public final class EnergyControlFixes {
    public static final String MODID = "energycontrolfixes";
    public static final String NAME = "Energy Control Fixes";
    public static final String VERSION = "1.0.3";

    public EnergyControlFixes() {
    }
}
