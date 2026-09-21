# Attribution and modification notice

This compatibility/fix mod was created in 2026 for Minecraft 1.12.2.

It does not redistribute Energy Control or Thermal Expansion. It supplies a corrected recipe registration from its own mod namespace so the original mod jars can remain untouched.

Energy Control recipe behavior and recipe structures were referenced while preparing this fix. Energy Control is GPL-3.0 licensed, so this patch mod is also released under GPL-3.0.

Targets Zuxelus/Energy-Control (GPL-3.0). The corrected Thermal Expansion Kit Assembler output matches Energy Control's own `item_kit` subtype 17 definition.

Version 1.0.1 adjusts dependency matching for Energy Control's `1.12.2-0.3.2` version string.

Version 1.0.2 fixes Forge 1.12 mod construction by exposing a public no-argument mod constructor.

Version 1.0.3 normalizes public author metadata to lowercase `zachsem`; runtime behavior is unchanged.
