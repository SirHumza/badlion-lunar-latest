package org.tritonus.share.sampled;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioFormat.Encoding;
import org.tritonus.share.StringHashedSet;

public class Encodings extends Encoding {
   private static final StringHashedSet<Encoding> encodings = new StringHashedSet<>();

   Encodings(String var1) {
      super(var1);
   }

   public static Encoding getEncoding(String var0) {
      Encoding var1 = encodings.get(var0);
      if (var1 == null) {
         var1 = new Encodings(var0);
         encodings.add(var1);
      }

      return var1;
   }

   public static boolean equals(Encoding var0, Encoding var1) {
      return var1.toString().equals(var0.toString());
   }

   public static Encoding[] getEncodings() {
      StringHashedSet var0 = new StringHashedSet();
      StringHashedSet var1 = new StringHashedSet();

      for (Encoding var3 : encodings) {
         iterateEncodings(var3, var0, var1);
      }

      return var1.toArray(new Encoding[0]);
   }

   private static void iterateEncodings(Encoding var0, StringHashedSet<Encoding> var1, StringHashedSet<Encoding> var2) {
      if (!var1.contains(var0)) {
         var1.add(var0);
         Encoding[] var3 = AudioSystem.getTargetEncodings(var0);

         for (Encoding var7 : var3) {
            if (var2.add(var7)) {
               iterateEncodings(var7, var1, var2);
            }
         }
      }
   }

   static {
      encodings.add(Encoding.PCM_SIGNED);
      encodings.add(Encoding.PCM_UNSIGNED);
      encodings.add(Encoding.ULAW);
      encodings.add(Encoding.ALAW);
   }
}
