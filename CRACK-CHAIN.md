# How every file here was obtained (full chain, no login anywhere)

## Lunar / Badlion-mode jars (current prod, Sept 2026)

1. `GET https://launcherupdates.lunarclientcdn.com/latest.yml` → launcher `3.4.9` (UA `Electron`).
2. `POST https://api.lunarclientprod.com/launcher/launch` with `module=lunar|badlion`,
   `version=1.8.9`, `branch=master`, `launch_type=OFFLINE`, random hwid/installation_id,
   UA `Lunar Client Launcher v3.4.9` → `launchTypeData.artifacts[]` (name/sha1/url).
3. `module=badlion` returns byte-identical artifacts + `mainClass:
   com.moonsworth.lunar.genesis.Genesis` (proof saved in `lunar-launch-1.8.9.json`).
4. `GET` each artifact URL with a browser UA (bare `urllib` gets 403) → jars.
5. Decompile with Vineflower 1.12.0 slim: `java -jar vineflower-slim.jar in.jar out/`.
   `lunar.jar` (62MB, 16,719 classes) needs `-Xmx8G`; it OOMs at 3G.

## Badlion standalone 4.4.0 (last archived exe)

1. `https://github.com/TalesOfJDL/Badlion-Client-Installer-v4.4.0` → Google Drive
   file `1ghV00WOx8HJu_3OvNVbMTbAX5SA4iR0t` (`Badlion Client Setup v4.4.0.exe`, 133MB).
2. Drive virus-scan interstitial: parse `page2.html` form
   (`drive.usercontent.google.com/download?id=…&export=download&confirm=t&uuid=…`).
3. `7z x` the NSIS exe → `$PLUGINSDIR/app-64.7z` → `7z x` again → Electron app.
4. `npx @electron/asar extract resources/app.asar` → `app/background.js` (main),
   `libs/*.jar` → Vineflower each. Real Badlion class found:
   `net.badlion.optifineinstallwrapper.InstallWrapper`.

## Badlion standalone 4.5.4 (actual latest standalone, Mar 2025)

1. `app-update.yml` inside 4.4.0 points at `https://client-updates.badlion.net`, channel `latest`.
2. `GET https://client-updates.badlion.net/latest-mac.yml` → `4.5.4` + file list.
3. Direct `GET` of `Badlion Client-4.5.4-mac.zip` (175MB, no auth) → unzip → `.app`.
4. `libs/*.jar` md5-identical to 4.4.0 (minus dropped `lz4`); new code is all in
   `Contents/Resources/app.asar` (`chat.js`, `child-process.js`, new bundles).
5. `npx @electron/asar extract` → `badlion-4.5.4/app/` (node_modules excluded).

## BatMod (installer → updater → full client)

1. `GET https://batmod.com/download` → installer link `https://dl.batmod.com/go/download.php`
   (+ `/js/download.js` reveals `https://api.batmod.com/changelog/`, `/dl-count/`).
2. The `.php` 302-redirects to `https://static.batmod.com/BatMod_Installer.jar` (798K,
   `Main-Class: com.batmod.installer.Main`, built by CoffeeBunny).
3. Decompile installer → hardcoded endpoints `https://dl.batmod.com/jar`, `/json`, `/updater`.
4. `GET https://dl.batmod.com/json/` → live version manifest (`id: BatMod`, 1.8,
   37 libraries). `GET /updater/` → updater jar (272K). `GET /jar/` → 302 to
   `https://static.batmod.com/BatMod.jar` (57MB, 9,039 entries) = the real client.
5. Vineflower both jars. Client yields 3,300 `.java` + assets (obfuscated root
   classes + vanilla tree + `client.iml`/`.gitignore` dev leftovers).
