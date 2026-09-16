#!/bin/sh
# Re-fetch latest Lunar/Badlion jars (no auth, OFFLINE) and decompile with Vineflower.
# Usage: ./decompile.sh [outdir]
set -e
OUT="${1:-./lunar}"
WORK="$(mktemp -d)"
VINE="$WORK/vineflower.jar"
curl -sL -o "$VINE" "https://github.com/Vineflower/vineflower/releases/download/1.12.0/vineflower-1.12.0-slim.jar"
LAUNCH="$WORK/launch.json"
python3 - "$LAUNCH" <<'PY'
import json, random, string, sys, urllib.request, uuid
def r(n): return ''.join(random.choice(string.ascii_letters + string.digits) for _ in range(n))
p = {"hwid": r(34), "installation_id": str(uuid.uuid4()), "hwid_private": r(512),
     "os": "darwin", "os_release": "23.0.0", "arch": "x64", "launcher_version": "3.4.9",
     "version": "1.8.9", "branch": "master", "launch_type": "OFFLINE", "args": [], "module": "lunar"}
req = urllib.request.Request("https://api.lunarclientprod.com/launcher/launch",
    data=json.dumps(p).encode(), headers={"User-Agent": "Lunar Client Launcher v3.4.9", "Content-Type": "application/json"})
urllib.request.urlretrieve if False else None
with urllib.request.urlopen(req, timeout=60) as resp:
    open(sys.argv[1], "w").write(resp.read().decode())
PY
mkdir -p "$WORK/jars"
python3 - "$LAUNCH" "$WORK/jars" <<'PY'
import json, sys, urllib.request
j = json.load(open(sys.argv[1]))
arts = {a["name"]: a for a in j["launchTypeData"]["artifacts"]}
for name in ("genesis-0.1.0-SNAPSHOT-all.jar", "lunar.jar"):
    a = arts[name]
    print(name, a["sha1"])
    urllib.request.urlretrieve(a["url"], sys.argv[2] + "/" + name)
PY
for j in "$WORK"/jars/*.jar; do
  n="$(basename "$j" .jar)"
  java -jar "$VINE" "$j" "$OUT/$n/"
done
echo "done -> $OUT"
