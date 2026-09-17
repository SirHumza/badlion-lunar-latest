package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.cadixdev.bombe.provider.ClassProvider;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR implements CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final String HRICROHCOIRHHHOOOCORRORHOIHIRC = Type.getInternalName(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class
   );
   private final Map<String, String> CCCCCICORIHCIHIOCOCIOHCCRHCORR = new HashMap<>();

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR(ClassProvider var1) {
      ClassNode var2 = var1.getAsNode(HRICROHCOIRHHHOOOCORRORHOIHIRC, 1);

      for (MethodNode var4 : var2.methods) {
         if ((var4.access & 8) != 0 && Type.getReturnType(var4.desc) != Type.VOID_TYPE && Type.getArgumentTypes(var4.desc).length == 1) {
            String var5 = Objects.requireNonNullElse(var4.signature, var4.desc);
            if (this.CCCCCICORIHCIHIOCOCIOHCCRHCORR.containsKey(var5)) {
               throw new IllegalStateException(
                  String.format(
                     "Both %s and %s in TypeConversionUtil share the signature %s. Ensure only one method exists per signature!",
                     this.CCCCCICORIHCIHIOCOCIOHCCRHCORR.get(var5),
                     var4.name,
                     var5
                  )
               );
            }

            this.CCCCCICORIHCIHIOCOCIOHCCRHCORR.put(var5, var4.name);
         }
      }
   }

   @Override
   public com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      InsnList var3
   ) {
      CRICCOOHHHCHOORCICOCOHIHOIRHOO var4 = var1.IICRHRIOIROIOHRICHHHHHIHIOOICI();
      CRICCOOHHHCHOORCICOCOHIHOIRHOO var5 = var2.IICRHRIOIROIOHRICHHHHHIHIOOICI();
      String var6 = "(" + var4.getDescriptor() + ")" + var5.getDescriptor();
      String var7 = "(" + var1.toString() + ")" + var2;
      if (this.CCCCCICORIHCIHIOCOCIOHCCRHCORR.containsKey(var7)) {
         var3.add(new MethodInsnNode(184, HRICROHCOIRHHHOOOCORRORHOIHIRC, this.CCCCCICORIHCIHIOCOCIOHCCRHCORR.get(var7), var6));
         return var2;
      } else {
         return var1;
      }
   }

   @Override
   public com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      InsnList var3
   ) {
      CRICCOOHHHCHOORCICOCOHIHOIRHOO var4 = var1.IICRHRIOIROIOHRICHHHHHIHIOOICI();
      CRICCOOHHHCHOORCICOCOHIHOIRHOO var5 = var2.IICRHRIOIROIOHRICHHHHHIHIOOICI();
      String var6 = "(" + var4.getDescriptor() + ")" + var5.getDescriptor();
      String var7 = "(" + var1.toString() + ")" + var2;
      if (this.CCCCCICORIHCIHIOCOCIOHCCRHCORR.containsKey(var7)) {
         var3.add(new MethodInsnNode(184, HRICROHCOIRHHHOOOCORRORHOIHIRC, this.CCCCCICORIHCIHIOCOCIOHCCRHCORR.get(var7), var6));
         return var1;
      } else {
         return var2;
      }
   }
}
