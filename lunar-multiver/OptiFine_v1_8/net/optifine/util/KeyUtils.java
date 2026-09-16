package net.optifine.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KeyUtils {
   public static void fixKeyConflicts(avb[] keys, avb[] keysPrio) {
      Set<Integer> keyPrioCodes = new HashSet<>();

      for (int i = 0; i < keysPrio.length; i++) {
         avb keyPrio = keysPrio[i];
         keyPrioCodes.add(keyPrio.i());
      }

      Set<avb> setKeys = new HashSet<>(Arrays.asList(keys));
      setKeys.removeAll(Arrays.asList(keysPrio));

      for (avb key : setKeys) {
         Integer code = key.i();
         if (keyPrioCodes.contains(code)) {
            key.b(0);
         }
      }
   }
}
