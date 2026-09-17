# Provenance and verification status (2026-09-17)

## Method

Binaries were fetched from public endpoints (no launcher login), then
decompiled with Vineflower 1.12.0 slim
(`sha256:753fd20d0b33ebf20c327d076e437557da0d8b42f121e1983b9cbe2b5b3e0219`).
The original jars/installers are **no longer on local disk** (temp storage was
wiped), so the dumps below can currently be re-derived only by re-fetching.
Hashes marked "API-recorded" come from saved responses, not from re-hashing
local originals.

## Artifacts

- Lunar `genesis-0.1.0-SNAPSHOT-all.jar`: 11,245,541 bytes, sha1
  `ff87ae5cd5177c70cbcc4240a3452cf2104cd9b0` (API-recorded, saved launch JSON).
- Lunar `lunar.jar`: 64,877,399 bytes, sha1
  `42970deb22b274f9c0062aa3feb3b7782469cba1` (API-recorded, saved launch JSON).
  Dump audit 2026-09-17: 10,322 files, 10,296 `.java`; no `net/badlion` package.
- Other multiver jars (API-recorded sha1/size): common `c50ba60d…` (54,979);
  mappings `4393bc12…` (1,779,197); OptiFine `0bb792be…` (2,584,186); optifine
  shim `99669787…` (416,097); legacy `b58c087e…` (1,669,024); lang `39df0487…`
  (3,316,800).
- Badlion `Badlion Client-4.5.4-mac.zip`: 183,783,444 bytes, sha512
  `XSeqz9tkDX0gYgC6/11+XJKXJaKGtHsJYPshbbLUa6GGJFl3a6g33XsulIO4xzIDlKdtrB7dajzQkKATme9EdQ==`
  (feed-recorded 2026-09-17; feed still lists 4.5.4 as latest on mac channel).
  Only the Electron shell was kept (172 files); no 4.x game-client code recovered.
- Badlion 4.4.0 exe: Google Drive file `1ghV00WOx8HJu_3OvNVbMTbAX5SA4iR0t`
  (133MB, hash not recorded). Only `libs/` + `background.js` kept.
- BatMod installer (798K) and client (57MB): hashes not recorded at fetch time.
  Installer manifest `version.json` is a vanilla-1.8-shaped manifest (`id:
  BatMod`, mainClass `net.minecraft.client.main.Main`); the client jar came via
  the `/jar/` redirect, not from that manifest's library list.
- Newly decompiled 2026-09-17 from jars bundled in-repo:
  - `enhanced-discord-rpc.jar` (639,460 bytes,
    `sha256:21e634e68b6b236ae7c808748bc0b3461903271b9572e256486938eabf016729`)
    → 44 files (`net/coffeebunny/rpc/*`, `javax/annotation/*`).
  - `launchwrapper-of-2.2.jar` (15,900 bytes,
    `sha256:09d8f19ac2fb654809f72469106bcbabbde178db28903c4abfcf4a9114cc3a8c`)
    → 8 files (`net/minecraft/launchwrapper/*`).
  - Outputs added to the repo 2026-09-17 under
    `batmod-client/enhanced-discord-rpc/` and
    `lunar-multiver/OptiFine_v1_8/launchwrapper-of-2.2/`.

## Endpoint checks (2026-09-17)

- `client-updates.badlion.net/latest-mac.yml`: 200, still version 4.5.4.
- `api.batmod.com/changelog/`: 200, latest entry 0.6.7 BETA (Dec 2021).
- `dl.batmod.com/json/`: empty response on this check (earlier returned the
  manifest; treat as flaky, retry with redirect-following + browser UA).
- Lunar `launcher/metadata`: 200 (no auth).

## Mappings

- Local `mcp918.zip` = MCP v9.18 for vanilla Minecraft 1.8.8
  (`conf/methods.csv`, `fields.csv`, `params.csv`, `joined.srg`). Vanilla only.
- Official Mojang mappings start at 1.14 (per Fabric docs); community 1.8.9
  mappings (e.g. tiny/intermediary-style) cover vanilla Minecraft, not vendor code.
- No public mappings exist for Lunar/Badlion/BatMod proprietary identifiers.

## Still missing / not claimed

- Original vendor source for all three clients (requires vendor release).
- Badlion 4.x game-client binary (only launcher shell + libs recovered).
- Proof of completeness for any dump vs. its original binary.
- Proof that Lunar ships Badlion game code (not found; not claimed).
