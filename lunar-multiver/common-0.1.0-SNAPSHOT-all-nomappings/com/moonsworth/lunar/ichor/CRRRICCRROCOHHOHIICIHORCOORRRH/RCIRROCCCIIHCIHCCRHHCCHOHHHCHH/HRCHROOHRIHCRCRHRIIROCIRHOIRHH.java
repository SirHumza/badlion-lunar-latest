package com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.ichor.util.FatalIchorError;
import java.io.FileWriter;
import java.io.IOException;
import lombok.Generated;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.io.srg.xsrg.XSrgWriter;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH implements com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH CHICROICOOCOHROIICHRHRRCROCHIO;

   protected com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
      com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2 = var1.IHIRRIIORRHORHRORIHOROIRCORCOO();
      MappingSet var3 = (MappingSet)var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.CHICROICOOCOHROIICHRHRRCROCHIO)
         .orElseThrow(() -> new FatalIchorError("Can't find Lunar mappings"));
      var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class, var3, var1);
      if (com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.DEBUG) {
         try {
            XSrgWriter var4 = new XSrgWriter(new FileWriter(".ichor/lunar_mappings.xsrg"));

            try {
               var4.write(var3);
            } catch (Throwable var8) {
               try {
                  var4.close();
               } catch (Throwable var7) {
                  var8.addSuppressed(var7);
               }

               throw var8;
            }

            var4.close();
         } catch (IOException var9) {
            throw new RuntimeException(var9);
         }
      }

      return new com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var3,
         var0 -> !var0.contains("/")
            || var0.startsWith("net/minecraft/")
            || var0.startsWith("com/mojang/")
            || var0.startsWith("net/optifine/")
            || var0.startsWith("net/minecraftforge/")
            || var0.startsWith("shadersmod/")
      );
   }

   public com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR[] RIRHOCHIORCCIIOIIRHOCCCRHHCHHH() {
      return new com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR[]{
         com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.INITIAL_REMAP
      };
   }

   @Generated
   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH(com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      this.CHICROICOOCOHROIICHRHRRCROCHIO = var1;
   }

   public static class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var1
      ) {
         super(var1);
      }

      @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
         CCCIROHORHHCRCCOIRHRRCOIROOCRH = true,
         HRHRCHHHOOHCOOIIIRROHOCCRCCORC = true,
         IHOOICIHHROORHIHHORHIOROCHRCHH = true,
         HHOOCHRORRHHRIIIHHCHCOIHIOOCCC = true
      )
      public com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH OHHRIOHROOIHOROCIRHCHORIHRRRRI(
         com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
      ) {
         return this.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1);
      }
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var1
      ) {
         super(var1);
      }

      @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
         CCCIROHORHHCRCCOIRHRRCOIROOCRH = true,
         HRHRCHHHOOHCOOIIIRROHOCCRCCORC = true,
         IHOOICIHHROORHIHHORHIOROCHRCHH = true
      )
      public com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH IIRHCHHOICHRICOOCRORCCIOOIHOIR(
         com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
      ) {
         return this.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1);
      }
   }
}
