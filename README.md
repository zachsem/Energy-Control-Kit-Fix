# Energy Control Kit Fix

**Energy Control Kit Fix** is a small unofficial compatibility patch for **Energy Control 1.12.2-0.3.2**.

## Official download

Installable releases are published on **CurseForge**:

**[Download Energy Control Kit Fix on CurseForge](https://www.curseforge.com/minecraft/mc-mods/energy-control-kit-fix)**

> **Important:** GitHub's **Code → Download ZIP** option downloads the project source code, not the installable mod. Download the release `.jar` from CurseForge and place that file in your `mods` folder.

Energy Control's Thermal Expansion integration contains a broken Kit Assembler recipe. The upstream recipe points to the wrong Energy Control item instead of producing the intended Thermal Expansion kit. This project supplies a corrected recipe while leaving the original Energy Control jar untouched.

## What it fixes

The affected upstream Kit Assembler recipe attempts to output:

```json
{"item":"energycontrol:kit_thermal_expansion","count":17}
```

The intended Energy Control kit is actually the `item_kit` subtype with metadata `17`:

```json
{"item":"energycontrol:item_kit","data":17}
```

The patch registers the corrected recipe from its own namespace so the Kit Assembler can produce the proper Thermal Expansion kit.

No unrelated Energy Control recipes, machines, configuration options, or gameplay mechanics are changed.

## Requirements

**Required**

- Minecraft 1.12.2
- Forge for Minecraft 1.12.2 — tested with 14.23.5.2859
- Energy Control 1.12.2-0.3.2

**Optional integration**

- Thermal Expansion — the corrected integration recipe is only relevant when Thermal Expansion is installed

## Installation

1. Install Energy Control normally.
2. Download the **Energy Control Kit Fix** release `.jar` from CurseForge.
3. Place the jar in the same `mods` folder.
4. Install it on both client and server.

Do not edit or replace the original Energy Control jar.

## Reporting bugs

Please use the GitHub **Issues** tab and include:

- Minecraft and Forge versions
- Energy Control version
- Energy Control Kit Fix version
- Thermal Expansion version when applicable
- steps to reproduce
- `latest.log` or the crash report

## Building from source

This is a ForgeGradle 2.3 / Minecraft 1.12.2 project targeting Java 8.

The technical mod ID remains `energycontrolfixes`; the public project name is **Energy Control Kit Fix**.

## Scope

This project is intentionally narrow. It fixes the broken Thermal Expansion Kit Assembler recipe and does not attempt to alter unrelated Energy Control behavior or harmless upstream log noise.

## Credits

- **Energy Control** — based on the Nuclear Control lineage; 1.12-era metadata credits **Shedar, xbony2, Zuxelus, and DMF444**
- **Thermal Expansion** — its respective authors and contributors
- **Energy Control Kit Fix** — zachsem

This is an independent, unofficial compatibility project and is not an official Energy Control release.

## License

GPL-3.0. See [`LICENSE`](LICENSE) and [`NOTICE.md`](NOTICE.md).
