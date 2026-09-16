package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.lib.adventure.text.Component;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final String RIICOCRRRHIHCHHRICOCHRCRCIOIRO = Type.getType(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.class
      )
      .getInternalName();
   private static final Type CIHHOOCCORHOIHRRRRCICIOIOIIHIH = Type.getType(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class
   );
   private static final String RCCICOORIOHOHOHOCCCOCICRCCHHHI = CIHHOOCCORHOIHRRRRCICIOIOIIHIH.getInternalName();
   private static final Type OCOCOIHOCHCIOORHOCIRIHRCHICORO = Type.getType(Component.class);
   private static final String HRICRCHIIHIIICIHCICRHOOCRCCHIO = OCOCOIHOCHCIOORHOCIRIHRCHICORO.getInternalName();
   private static final Type IHRIHCICOCCIIIRRIIIROHHIROCOOO = Type.getType(String.class);
   private static final String IIHOCOIHHIROCHIHHCCCORRCOHCHRC = IHRIHCICOCCIIIRRIIIROHHIROCOOO.getInternalName();
   private final String IOCIRIRHOHROHOCOROIRHCHIRHIHRO;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      this.IOCIRIRHOHROHOCOROIRHCHIRHIHRO = var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(RCCICOORIOHOHOHOCCCOCICRCCHHHI, var2)
         .orElseThrow()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
   }

   @Override
   public com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      InsnList var3
   ) {
      CRICCOOHHHCHOORCICOCOHIHOIRHOO var4 = var1.IICRHRIOIROIOHRICHHHHHIHIOOICI();
      CRICCOOHHHCHOORCICOCOHIHOIRHOO var5 = var2.IICRHRIOIROIOHRICHHHHHIHIOOICI();
      if (!(var4 instanceof com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH)
         || !((com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var4).name().equals(HRICRCHIIHIIICIHCICRHOOCRCCHIO)) {
         return var1;
      }

      if (!(var5 instanceof com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH)) {
         return var1;
      }

      String var6 = ((com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var5).name();
      if (var6.equals(IIHOCOIHHIROCHIHHCCCORRCOHCHRC)) {
         var3.add(
            new MethodInsnNode(
               184,
               RIICOCRRRHIHCHHRICOCHRCRCIOIRO,
               "asLegacyString",
               Type.getMethodDescriptor(IHRIHCICOCCIIIRRIIIROHHIROCOOO, new Type[]{OCOCOIHOCHCIOORHOCIRIHRCHICORO})
            )
         );
      } else {
         if (!var6.equals(this.IOCIRIRHOHROHOCOROIRHCHIRHIHRO)) {
            throw new UnsupportedOperationException("Don't know how to coerce type " + var1 + " to an Adventure component!");
         }

         var3.add(
            new MethodInsnNode(
               184,
               RIICOCRRRHIHCHHRICOCHRCRCIOIRO,
               "asBridge",
               Type.getMethodDescriptor(CIHHOOCCORHOIHRRRRCICIOIOIIHIH, new Type[]{OCOCOIHOCHCIOORHOCIRIHRCHICORO})
            )
         );
         var3.add(new TypeInsnNode(192, var6));
      }

      return var2;
   }

   @Override
   public com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      InsnList var3
   ) {
      CRICCOOHHHCHOORCICOCOHIHOIRHOO var4 = var1.IICRHRIOIROIOHRICHHHHHIHIOOICI();
      CRICCOOHHHCHOORCICOCOHIHOIRHOO var5 = var2.IICRHRIOIROIOHRICHHHHHIHIOOICI();
      if (!(var4 instanceof com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH)) {
         return var2;
      }

      if (var5 instanceof com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH
         && ((com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var5).name().equals(HRICRCHIIHIIICIHCICRHOOCRCCHIO)) {
         String var6 = ((com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var4).name();
         if (var6.equals(IIHOCOIHHIROCHIHHCCCORRCOHCHRC)) {
            var3.add(
               new MethodInsnNode(
                  184,
                  RIICOCRRRHIHCHHRICOCHRCRCIOIRO,
                  "asAdventure",
                  Type.getMethodDescriptor(OCOCOIHOCHCIOORHOCIRIHRCHICORO, new Type[]{IHRIHCICOCCIIIRRIIIROHHIROCOOO})
               )
            );
         } else {
            if (!var6.equals(this.IOCIRIRHOHROHOCOROIRHCHIRHIHRO)) {
               throw new UnsupportedOperationException("Don't know how to coerce type " + var1 + " to an Adventure component!");
            }

            var3.add(new TypeInsnNode(192, RCCICOORIOHOHOHOCCCOCICRCCHHHI));
            var3.add(
               new MethodInsnNode(
                  184,
                  RIICOCRRRHIHCHHRICOCHRCRCIOIRO,
                  "asAdventure",
                  Type.getMethodDescriptor(OCOCOIHOCHCIOORHOCIRIHRCHICORO, new Type[]{CIHHOOCCORHOIHRRRRCICIOIOIIHIH})
               )
            );
         }

         return var1;
      } else {
         return var2;
      }
   }
}
