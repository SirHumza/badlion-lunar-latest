# Lunar / Badlion / BatMod — decompiled artifacts (NOT original source)

This repo holds **decompiler output recovered from publicly fetched binaries**,
plus launcher shells and manifests. It does **not** contain the vendors'
original source code (original identifiers, comments, and project structure
cannot be recovered from compiled, obfuscated binaries).

Decompiler: Vineflower 1.12.0 slim
(`sha256:753fd20d0b33ebf20c327d076e437557da0d8b42f121e1983b9cbe2b5b3e0219`).

Lunar acquired Badlion in March 2025
([announcement](https://www.lunarclient.com/news/lunar-client-acquires-badlion-client)).
Lunar's follow-up
([Mar 28, 2025](https://www.lunarclient.com/news/badlion-acquisition-next-steps))
says the merger was undecided and feature-parity work was ongoing — so shared
launcher responses must not be read as proof that Lunar ships Badlion's game code.

## Contents (verified file counts, 2026-09-17)

| Dir | What | Source | Files |
|-----|------|--------|-------|
| `lunar-genesis/` | Decompiled Lunar boot/platform jar. Entry: `com/moonsworth/lunar/genesis/Genesis` | `multiver-releases.lunarclientprod.com`, launch API, `genesis-0.1.0-SNAPSHOT-all.jar` sha1 `ff87ae5cd5177c70cbcc4240a3452cf2104cd9b0` (11,245,541 bytes, per saved API response) | 4,074 |
| `lunar/` | Decompiled `lunar.jar`: 10,296 `.java` (4,937 `com/moonsworth` incl. readable `com/lunarclient` API utils + obfuscated core) + bundled libs. **No `net/badlion` package was found in this dump.** | same API, `lunar.jar` sha1 `42970deb22b274f9c0062aa3feb3b7782469cba1` (64,877,399 bytes, per saved API response) | 10,322 |
| `lunar-multiver/` | Other 1.8.9 multiver jars decompiled: `common` (28), `legacy` (737), `optifine shim` (214), `OptiFine` (2,633), `lunar-lang` resources (34), `platform-mappings` (5). `OptiFine_v1_8/launchwrapper-of-2.2.jar` (15,900 bytes) decompiled in-repo under `OptiFine_v1_8/launchwrapper-of-2.2/` (8 files). | same API response (sha1s in `PROVENANCE.md`) | 3,659 |
| `badlion-4.4.0-libs/` | Decompiled third-party libs shipped with the 4.4.0 installer (caffeine, disruptor, joml, lz4) + one Badlion class: `net/badlion/optifineinstallwrapper/InstallWrapper.java`. | `Badlion Client Setup v4.4.0.exe` (Google Drive `1ghV00WOx8HJu_3OvNVbMTbAX5SA4iR0t`), NSIS → `app-64.7z` → `libs/` | 847 |
| `badlion-4.4.0-launcher/` | 4.4.0 Electron shell: `package.json` (v4.4.0) + `app/background.js`. Game logic lives in native `launcher.node` / `badlion_electron.dll`, not JS. No 4.x game-client code was recovered. | same exe → `resources/app.asar` | 2 |
| `badlion-4.5.4/` | 4.5.4 Electron **launcher shell** (`app/` JS/HTML/assets, `package.json`). **Not game-client source.** The feed below still lists 4.5.4 as latest (checked 2026-09-17). | `Badlion Client-4.5.4-mac.zip` (183,783,444 bytes, sha512 in `PROVENANCE.md`) from `client-updates.badlion.net`, channel `latest` | 172 |
| `lunar-launch-1.8.9.json` | Saved launch API response. At capture time, `module=badlion` returned the same artifact list as `module=lunar`. That shows shared launcher delivery, **not** Badlion game code inside Lunar. | `api.lunarclientprod.com/launcher/launch` | 1 |
| `batmod-installer/` | Decompiled installer (230 `.java`, entry `com.batmod.installer.Main`) + version manifest `version.json` (`id: BatMod`, vanilla 1.8 manifest shape, mainClass `net.minecraft.client.main.Main`). Includes semantic rename pass (18 classes renamed). | `static.batmod.com/BatMod_Installer.jar` (798K) via `dl.batmod.com/go/download.php`, `dl.batmod.com/json/` | 239 |
| `batmod-installer-src/` | **Clean renamed installer source** — 21 `.java` files with inferred semantic names (`BatModInstaller`, `Logger`, `Button`, `Checkbox`, `Spinner`, `ProgressBar`, etc.). Best quality reference for the installer UI framework. | Same as above, post-semantic-rename pass | 21 |
| `batmod-updater/` | Decompiled updater (69 `.java`). | `dl.batmod.com/updater/` (272K) | 73 |
| `batmod-client/` | Decompiled BatMod 1.8.9 client: 3,300 `.java` + vanilla `net/minecraft` + assets. Obfuscated vendor classes sit at the output root (default package) with generated names. `enhanced-discord-rpc.jar` (639,460 bytes) decompiled in-repo under `enhanced-discord-rpc/` (44 files). BatMod's own changelog tops out at 0.6.7 BETA (2021): the served build is old, not fresh. | `static.batmod.com/BatMod.jar` (57MB) via `dl.batmod.com/jar/` redirect | 8,181 |

Readable third-party Badlion material (not mirrored here, link only): [NightSling/Badlion-3.0.0](https://github.com/NightSling/badlion-3.0.0) — a 2021 1.8.8 leak (BAC stripped), **not** obtained here and **not** latest.

## Limitations (read before using)

- Decompilation recovers syntax and control flow, not original names, comments,
  or project layout. Obfuscated identifiers (`HHCCIRH…`, `A25DxEi…`) are intact.
- Completeness was **not** proven against the original binaries: the original
  jars/installers used for these dumps are no longer on local disk (temp storage
  was wiped), so outputs can only be re-derived by re-fetching (see Reproduce).
  Two nested jars are now decompiled in-repo (listed above, 52 files total).
- Public mappings do not restore vendor names: the local MCP 9.18 pack maps
  vanilla Minecraft 1.8.8 only; official Mojang mappings start at 1.14; community
  1.8.9 mappings cover vanilla Minecraft, not Lunar/Badlion/BatMod code.

## Reproduce

```sh
# needs: java 17+, curl, unzip, 7z
./decompile.sh   # re-fetches current jars via launch API / public endpoints, decompiles with Vineflower
```

`PROVENANCE.md` records per-artifact origins, sizes, hashes (where recorded),
endpoint checks, and what is still missing.

## How to read

Open the folder in IntelliJ IDEA (Community is fine) as a plain directory, use Navigate → Class/Symbol.
Start points: `com.moonsworth.lunar.genesis.Genesis` (Lunar boot),
`com.batmod.installer.Main` (BatMod installer), vanilla `net.minecraft.client.main.Main`
(BatMod client), `net.badlion.client` package (3.0.0 leak, linked above).
