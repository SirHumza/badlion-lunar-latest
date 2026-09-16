package org.tritonus.share.sampled;

import javax.sound.sampled.AudioFileFormat.Type;
import org.tritonus.share.StringHashedSet;

public class AudioFileTypes extends Type {
   private static final StringHashedSet<Type> types = new StringHashedSet<>();

   AudioFileTypes(String var1, String var2) {
      super(var1, var2);
   }

   public static Type getType(String var0) {
      return getType(var0, null);
   }

   public static Type getType(String var0, String var1) {
      Type var2 = types.get(var0);
      if (var2 == null) {
         if (var1 == null) {
            return null;
         }

         var2 = new AudioFileTypes(var0, var1);
         types.add(var2);
      }

      return var2;
   }

   public static boolean equals(Type var0, Type var1) {
      return var1.toString().equals(var0.toString());
   }

   static {
      types.add(Type.AIFF);
      types.add(Type.AIFC);
      types.add(Type.AU);
      types.add(Type.SND);
      types.add(Type.WAVE);
   }
}
