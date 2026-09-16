package org.jctools.util;

public class SpscLookAheadUtil {
   public static final int MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

   public static int computeLookAheadStep(int var0) {
      return Math.min(var0 / 4, MAX_LOOK_AHEAD_STEP);
   }
}
