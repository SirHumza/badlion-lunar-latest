package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class HRCHROOHRIHCRCRHRIIROCIRHOIRHH extends IHIRRIIORRHORHRORIHOROIRCORCOO {
   private final RCIROOOOICRHCCRRCIORHHIRCOIIIC ORRICOHCOIIRCRRORROOHIOOHHCROH;
   private final boolean RRCCRRROIRIHIOHHCRHHOIHCHIHRIR;
   private RIOOCHICIHRHOHCCCCCHOCCCOHCRHI OOHHOHHIRORIOORRCCIIORRHHHOOIH;

   HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var2,
      boolean var3
   ) {
      super(var1);
      this.ORRICOHCOIIRCRRORROOHIOOHHCROH = var2;
      this.RRCCRRROIRIHIOHHCRHHOIHCHIHRIR = var3;
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var1,
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var3,
      Class<?> var4,
      boolean var5
   ) {
      var5 |= var4 != null;
      return new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var0, var2, var5).RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3, var4);
   }

   CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var2,
      Class<?> var3
   ) {
      List var4 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, var3);
      List var5 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var3);
      if (this.RRCCRRROIRIHIOHHCRHHOIHCHIHRIR) {
         if (this.OOHHOHHIRORIOORRCCIIORRHHHOOIH != null
            && this.OICORRIIOHOCCIHIOCCCOHOICROOOR.CRRRICCRROCOHHOHIICIHORCOORRRH(this.OOHHOHHIRORIOORRCCIIORRHHHOOIH)) {
            this.OOHHOHHIRORIOORRCCIIORRHHHOOIH = null;
         }

         int var6 = var4.size();

         while (--var6 >= 0) {
            if (this.OICORRIIOHOCCIHIOCCCOHOICROOOR.CRRRICCRROCOHHOHIICIHORCOORRRH((CRICCOOHHHCHOORCICOCOHIHOIRHOO)var4.get(var6))) {
               var4.remove(var6);
            }
         }

         var6 = var5.size();

         while (--var6 >= 0) {
            if (this.OICORRIIOHOCCIHIOCCCOHOICROOOR.CRRRICCRROCOHHOHIICIHORCOORRRH((CRICCOOHHHCHOORCICOCOHIHOIRHOO)var5.get(var6))) {
               var5.remove(var6);
            }
         }
      }

      return new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.OOHHOHHIRORIOORRCCIIORRHHHOOIH, var4, var5);
   }

   private List<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1, Class<?> var2
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = null;
      ArrayList var4 = null;
      if (!var1.ORHRHCHCOHHORROCRRRCIHRIOORORC()) {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var5 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RHCHRCCRRHORIOCIOHHCRHCHICRIHH(
            var1.RRICIOOORRIORHHICIRCIOCHRHRCHH()
         );

         for (com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9 : var5) {
            if (HHCCIRHCCCIIRHCROHIORHIRHHIORH(var9.IRCOOROHOCCHOICOIRIRIRCRRHCIRH())) {
               if (var9.HHHIRIRHRCRHIHIIRCIRHICORRCHIC() == 0) {
                  var3 = var9;
               } else {
                  if (var4 == null) {
                     var4 = new ArrayList();
                  }

                  var4.add(var9);
               }
            }
         }
      }

      List var14;
      int var15;
      if (var4 == null) {
         var14 = Collections.emptyList();
         if (var3 == null) {
            return var14;
         }

         var15 = 0;
      } else {
         var15 = var4.size();
         var14 = new ArrayList(var15);

         for (int var16 = 0; var16 < var15; var16++) {
            var14.add(null);
         }
      }

      if (var2 != null) {
         IHCRORHRORIICHRHRCHRRIRRHHOCOO[] var17 = null;

         for (com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 : com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RHCHRCCRRHORIOCIOHHCRHCHICRIHH(
            var2
         )) {
            if (var11.HHHIRIRHRCRHIHIIRCIRHICORRCHIC() == 0) {
               if (var3 != null) {
                  this.OOHHOHHIRORIOORRCCIIORRHHHOOIH = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var11);
                  var3 = null;
               }
            } else if (var4 != null) {
               if (var17 == null) {
                  var17 = new IHCRORHRORIICHRHRCHRRIRRHHOCOO[var15];

                  for (int var12 = 0; var12 < var15; var12++) {
                     var17[var12] = new IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                        ((com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var4.get(
                              var12
                           ))
                           .IRCOOROHOCCHOICOIRIRIRCRRHCIRH()
                     );
                  }
               }

               IHCRORHRORIICHRHRCHRRIRRHHOCOO var22 = new IHCRORHRORIICHRHRCHRRIRRHHOCOO(var11.IRCOOROHOCCHOICOIRIRIRCRRHCIRH());

               for (int var13 = 0; var13 < var15; var13++) {
                  if (var22.equals(var17[var13])) {
                     var14.set(
                        var13,
                        this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                           (com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var4.get(
                              var13
                           ),
                           var11
                        )
                     );
                     break;
                  }
               }
            }
         }
      }

      if (var3 != null) {
         this.OOHHOHHIRORIOORRCCIIORRHHHOOIH = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, null);
      }

      for (int var18 = 0; var18 < var15; var18++) {
         RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var20 = (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)var14.get(var18);
         if (var20 == null) {
            var14.set(
               var18,
               this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  (com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var4.get(
                     var18
                  ),
                  null
               )
            );
         }
      }

      return var14;
   }

   private List<HICHRCOHCCRHOHCICOOCHOIHCCHIRI> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var2,
      Class<?> var3
   ) {
      ArrayList var4 = null;

      for (Method var8 : com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCICHHOCCHOROIORCOHOHIRRHCIIOR(
         var2.RRICIOOORRIORHHICIRCIOCHRHRCHH()
      )) {
         if (RRCRRCORICCHOHHIRCHIROOHIIOHCO(var8)) {
            if (var4 == null) {
               var4 = new ArrayList();
            }

            var4.add(var8);
         }
      }

      if (var4 == null) {
         return Collections.emptyList();
      }

      RCIROOOOICRHCCRRCIORHHIRCOIIIC var15 = this.ORRICOHCOIIRCRRORROOHIOOHHCROH;
      int var16 = var4.size();
      ArrayList var17 = new ArrayList(var16);

      for (int var18 = 0; var18 < var16; var18++) {
         var17.add(null);
      }

      if (var3 != null) {
         IHCRORHRORIICHRHRCHRRIRRHHOCOO[] var19 = null;

         for (Method var12 : var3.getDeclaredMethods()) {
            if (RRCRRCORICCHOHHIRCHIROOHIIOHCO(var12)) {
               if (var19 == null) {
                  var19 = new IHCRORHRORIICHRHRCHRRIRRHHOCOO[var16];

                  for (int var13 = 0; var13 < var16; var13++) {
                     var19[var13] = new IHCRORHRORIICHRHRCHRRIRRHHOCOO((Method)var4.get(var13));
                  }
               }

               IHCRORHRORIICHRHRCHRRIRRHHOCOO var24 = new IHCRORHRORIICHRHRCHRRIRRHHOCOO(var12);

               for (int var14 = 0; var14 < var16; var14++) {
                  if (var24.equals(var19[var14])) {
                     var17.set(var14, this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((Method)var4.get(var14), var15, var12));
                     break;
                  }
               }
            }
         }
      }

      for (int var20 = 0; var20 < var16; var20++) {
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI var21 = (HICHRCOHCCRHOHCICOOCHOIHCCHIRI)var17.get(var20);
         if (var21 == null) {
            Method var22 = (Method)var4.get(var20);
            RCIROOOOICRHCCRRCIORHHIRCOIIIC var23 = ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var22, var2, var1, var15);
            var17.set(var20, this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var22, var23, null));
         }
      }

      return var17;
   }

   private static boolean RRCRRCORICCHOHHIRCHIROOHIIOHCO(Method var0) {
      return Modifier.isStatic(var0.getModifiers()) && !var0.isSynthetic();
   }

   protected RIOOCHICIHRHOHCCCCCHOCCCOHCRHI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
   ) {
      return new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         this.ORRICOHCOIIRCRRORROOHIOOHHCROH,
         var1.IRCOOROHOCCHOICOIRIRIRCRRHCIRH(),
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2),
         ORIHRHRCRCOCOHRCCCCCIIRIRORRIC
      );
   }

   protected RIOOCHICIHRHOHCCCCCHOCCCOHCRHI IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
   ) {
      int var3 = var1.HHHIRIRHRCRHIHIIRCIRHICORRCHIC();
      if (this.OICORRIIOHOCCIHIOCCCOHOICROOOR == null) {
         return new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
            this.ORRICOHCOIIRCRRORROOHIOOHHCROH, var1.IRCOOROHOCCHOICOIRIRIRCRRHCIRH(), OIIROCIHICHIOHCHROOCRHROOHCROC(), OHHCIIOCHOHIOORRCCOIOHHCHIIHOI(var3)
         );
      }

      if (var3 == 0) {
         return new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
            this.ORRICOHCOIIRCRRORROOHIOOHHCROH,
            var1.IRCOOROHOCCHOICOIRIRIRCRRHCIRH(),
            this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2),
            ORIHRHRCRCOCOHRCCCCCIIRIRORRIC
         );
      }

      Annotation[][] var5 = var1.getParameterAnnotations();
      RHOCHHIRRCHHHOHOIRROIROHHHIHIO[] var4;
      if (var3 != var5.length) {
         var4 = null;
         Class var6 = var1.getDeclaringClass();
         if (com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HIORIIIIOCCCRCHCOROROCCOIOOIIR(
               var6
            )
            && var3 == var5.length + 2) {
            Annotation[][] var8 = var5;
            var5 = new Annotation[var8.length + 2][];
            System.arraycopy(var8, 0, var5, 2, var8.length);
            var4 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, (Annotation[][])null);
         } else if (var6.isMemberClass() && var3 == var5.length + 1) {
            Annotation[][] var7 = var5;
            var5 = new Annotation[var7.length + 1][];
            System.arraycopy(var7, 0, var5, 1, var7.length);
            var5[0] = OHORICRHHCHICIHCHROHIRRRRHHCCO;
            var4 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, (Annotation[][])null);
         }

         if (var4 == null) {
            throw new IllegalStateException(
               String.format(
                  "Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations",
                  var1.getDeclaringClass().getName(),
                  var3,
                  var5.length
               )
            );
         }
      } else {
         var4 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var2 == null ? (Annotation[][])null : var2.getParameterAnnotations());
      }

      return new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         this.ORRICOHCOIIRCRRORROOHIOOHHCROH, var1.IRCOOROHOCCHOICOIRIRIRCRRHCIRH(), this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2), var4
      );
   }

   protected HICHRCOHCCRHOHCICOOCHOIHCCHIRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Method var1, RCIROOOOICRHCCRRCIORHHIRCOIIIC var2, Method var3) {
      int var4 = var1.getParameterCount();
      if (this.OICORRIIOHOCCIHIOCCCOHOICROOOR == null) {
         return new HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var2, var1, OIIROCIHICHIOHCHROOCRHROOHCROC(), OHHCIIOCHOHIOORRCCOIOHHCHIIHOI(var4));
      } else {
         return var4 == 0
            ? new HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var2, var1, this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3), ORIHRHRCRCOCOHRCCCCCIIRIRORRIC)
            : new HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
               var2,
               var1,
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3),
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getParameterAnnotations(), var3 == null ? (Annotation[][])null : var3.getParameterAnnotations())
            );
      }
   }

   private RHOCHHIRRCHHHOHOIRROIROHHHIHIO[] RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Annotation[][] var1, Annotation[][] var2) {
      if (this.RRCCRRROIRIHIOHHCRHHOIHCHIHRIR) {
         int var3 = var1.length;
         RHOCHHIRRCHHHOHOIRROIROHHHIHIO[] var4 = new RHOCHHIRRCHHHOHOIRROIROHHHIHIO[var3];

         for (int var5 = 0; var5 < var3; var5++) {
            IIRHCHHOICHRICOOCRORCCIOOIHOIR var6 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               IIRHCHHOICHRICOOCRORCCIOOIHOIR.HRRROIOROCICHHRROOHRHHOIOHRCRC(), var1[var5]
            );
            if (var2 != null) {
               var6 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var6, var2[var5]);
            }

            var4[var5] = var6.COIRCRCCOHRRROIRIRHROIROIHCRII();
         }

         return var4;
      } else {
         return ORIHRHRCRCOCOHRCCCCCIIRIRORRIC;
      }
   }

   private RHOCHHIRRCHHHOHOIRROIROHHHIHIO HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
   ) {
      if (this.RRCCRRROIRIHIOHHCRHHOIHCHIHRIR) {
         IIRHCHHOICHRICOOCRORCCIOOIHOIR var3 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getDeclaredAnnotations());
         if (var2 != null) {
            var3 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3, var2.getDeclaredAnnotations());
         }

         return var3.COIRCRCCOHRRROIRIRHROIROIHCRII();
      } else {
         return OIIROCIHICHIOHCHROOCRHROOHCROC();
      }
   }

   private final RHOCHHIRRCHHHOHOIRROIROHHHIHIO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(AnnotatedElement var1, AnnotatedElement var2) {
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var3 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getDeclaredAnnotations());
      if (var2 != null) {
         var3 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3, var2.getDeclaredAnnotations());
      }

      return var3.COIRCRCCOHRRROIRIRHROIROIHCRII();
   }

   private static boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(Constructor<?> var0) {
      return !var0.isSynthetic();
   }
}
