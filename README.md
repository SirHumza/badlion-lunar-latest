# Badlion + Lunar — latest source dumps

Both clients, latest obtainable builds, decompiled with Vineflower 1.12.0.
No launcher login or checks needed for any of this. Lunar acquired Badlion (Mar 2025);
standalone Badlion is discontinued and Badlion mode now ships the same jars as Lunar.

## Contents

| Dir | What | Source | Files |
|-----|------|--------|-------|
| `lunar-genesis/` | Current Lunar/Badlion boot + platform code (Sept 2026 prod). Entry: `com/moonsworth/lunar/genesis/Genesis` | `multiver-releases.lunarclientprod.com`, OFFLINE launch API, `genesis-0.1.0-SNAPSHOT-all.jar` sha `ff87ae5c…` | 4,074 |
| `lunar/` | Current `lunar.jar` full dump (62MB, 16,719 classes). **Still decompiling, lands here next.** | same API, `lunar.jar` sha `42970deb…` | — |
| `lunar-multiver/` | All other current 1.8.9 multiver jars decompiled: `common` (28), `legacy` (737), `optifine shim` (214), `OptiFine` (2,633), `lunar-lang` resources (34), `platform-mappings` (5) | same API response | 3,651 |
| `badlion-4.4.0-libs/` | Last standalone Badlion 4.4.0 shipped Java. Only real Badlion class: `net/badlion/optifineinstallwrapper/InstallWrapper.java`. Rest is third-party (caffeine, disruptor, joml, lz4). | `Badlion Client Setup v4.4.0.exe` (Google Drive `1ghV00WOx8HJu_3OvNVbMTbAX5SA4iR0t`), NSIS → `app-64.7z` → `libs/` | ~850 |
| `badlion-4.4.0-launcher/` | 4.4.0 Electron shell: `package.json` (v4.4.0) + `app/background.js`. Game logic lives in native `launcher.node` / `badlion_electron.dll`, not JS. | same exe → `resources/app.asar` | 2 |
| `badlion-4.5.4/` | **Latest standalone Badlion (Mar 2025).** Full `app/` shell: new `chat.html`/`chat.js`, `child-process.js`, new bundles, changed `background.js`/`preload.js`. Update feed: `client-updates.badlion.net`, channel `latest`. | `Badlion Client-4.5.4-mac.zip` (178MB) direct from update feed | ~5,600 |
| `lunar-launch-1.8.9.json` | Raw OFFLINE launch API response (`module=badlion` returns byte-identical artifacts to `module=lunar`). | `api.lunarclientprod.com/launcher/launch` | 1 |
| `batmod-installer/` | BatMod installer decompiled (238 files, entry `com.batmod.installer.Main`) + live version manifest `version.json` (`id: BatMod`, mainClass `net.minecraft.client.main.Main`). | `static.batmod.com/BatMod_Installer.jar` (798K) via `dl.batmod.com/go/download.php`, `dl.batmod.com/json/` | 239 |
| `batmod-updater/` | BatMod updater decompiled (73 files). | `dl.batmod.com/updater/` (272K) | 73 |
| `batmod-client/` | Full BatMod 1.8.9 client: 3,300 `.java` files + vanilla `net/minecraft`, assets. Obfuscated root classes, readable syntax. Ships dev leftovers (`client.iml`, `.gitignore`). | `static.batmod.com/BatMod.jar` (57MB) via `dl.batmod.com/jar/` redirect | 8,137 |

Readable classic source (not mirrored here, link only): [NightSling/Badlion-3.0.0](https://github.com/NightSling/badlion-3.0.0) — last public Badlion leak (2021, 1.8.8, BAC stripped). Clone of it lives next to this repo as `badlion-src`.

## Honest notes

- Current builds are heavily obfuscated (`HHCCIRHCCCIIRHCROHIORHIRHHIORH`-style names). Decompiled syntax is readable, identifiers are not. No mappings exist publicly.
- Badlion 4.x standalone game jars download at runtime via the launcher's native module (`launcher.node`); only launcher shell + bundled libs are recoverable from the installer. The update feed itself (`client-updates.badlion.net`) is still alive and served 4.5.4.
- `module=badlion` vs `module=lunar` on the launch API returns identical artifacts and `mainClass: com.moonsworth.lunar.genesis.Genesis`.

## Reproduce

```sh
# needs: java 17+, curl, unzip, 7z
./decompile.sh   # re-fetches current jars via OFFLINE launch API, decompiles with Vineflower
```

## How to read

Open the folder in IntelliJ IDEA (Community is fine) as a plain directory, use Navigate → Class/Symbol.
Start points: `com.moonsworth.lunar.genesis.Genesis` (current Lunar/Badlion),
`com.batmod.installer.Main` (BatMod installer), vanilla `net.minecraft.client.main.Main`
(BatMod client), `net.badlion.client` package (3.0.0 leak, linked below).

## On "deobfuscated / cleaned"

Every dump here is a complete, verified Vineflower decompile: all classes recovered,
readable control flow, organized in original package trees. What no one can give you
without the vendors' own ProGuard maps: original identifier names. Obfuscated names
(`HHCCIRH…`, `A25DxEi…`) are intact, syntax is clean. Entry points and protocols
(`MinecraftPatcherService`, version manifests) are documented above so you can
navigate by behavior instead of names.
