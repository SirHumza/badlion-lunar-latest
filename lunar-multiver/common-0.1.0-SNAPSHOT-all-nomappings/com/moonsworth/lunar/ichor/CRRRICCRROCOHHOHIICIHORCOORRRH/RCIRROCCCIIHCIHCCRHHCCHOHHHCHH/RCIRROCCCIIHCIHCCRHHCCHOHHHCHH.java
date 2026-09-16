package com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.cadixdev.bombe.type.signature.FieldSignature;
import org.cadixdev.bombe.type.signature.MethodSignature;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.model.Mapping;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InnerClassNode;
import org.objectweb.asm.tree.MethodNode;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CRCOOOOIOOHIIRCROHHRCCHRCRHCCC;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(MappingSet var1, InputStream var2) {
      try {
         this.CRCOOOOIOOHIIRCROHHRCCHRCRHCCC = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1);
      } catch (Throwable var4) {
         throw var4;
      }
   }

   public com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR[] RIRHOCHIORCCIIOIIRHOCCCRHHCHHH() {
      return new com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR[]{
         com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ACCESS_WIDEN
      };
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   public void CRICCOOHHHCHOORCICOCOHIHOIRHOO(ClassNode var1) {
      com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = this.CRCOOOOIOOHIIRCROHHRCCHRCRHCCC
         .RRCICRHCCROHCCIHORCHIOICRIRRHC
         .get(RCIICOICCOIOCCCHCOOCCRHRIHOOHI(var1.name));
      if (var2 != null) {
         if (var2.ORHCHOHIHHIRHIROOHIIHRHCIIHICI) {
            var1.access = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRORROHIRIRIHHOOCOIRHCIRHHORI(var1.access);
         }

         if (var2.RIHHOCHRRCCICRRCRICIHRIIRHROHH) {
            var1.access = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var1.access, true);
            var1.permittedSubclasses = null;
         }
      }

      for (InnerClassNode var4 : var1.innerClasses) {
         com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = this.CRCOOOOIOOHIIRCROHHRCCHRCRHCCC
            .RRCICRHCCROHCCIHORCHIOICRIRRHC
            .get(RCIICOICCOIOCCCHCOOCCRHRIHOOHI(var4.name));
         if (var5 != null) {
            if (var5.ORHCHOHIHHIRHIROOHIIHRHCIIHICI) {
               var4.access = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRORROHIRIRIHHOOCOIRHCIRHHORI(var4.access);
            }

            if (var5.RIHHOCHRRCCICRRCRICIHRIIRHROHH) {
               var4.access = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var4.access, true);
            }
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ClassNode var1, FieldNode var2) {
      com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = this.CRCOOOOIOOHIIRCROHHRCCHRCRHCCC
         .fields
         .get(RCIICOICCOIOCCCHCOOCCRHRIHOOHI(var1.name) + "." + OCIRIHHHIICCRCHICCCHHHHIOHCHHH(var2.name) + RCIICOICCOIOCCCHCOOCCRHRIHOOHI(var2.desc));
      if (var3 != null) {
         if (var3.ORHCHOHIHHIRHIROOHIIHRHCIIHICI) {
            var2.access = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRORROHIRIRIHHOOCOIRHCIRHHORI(var2.access);
         }

         if (var3.mutable) {
            var2.access &= -17;
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO
   public void HRCHROOHRIHCRCRHRIIROCIRHOIRHH(ClassNode var1, MethodNode var2) {
      com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var3 = this.CRCOOOOIOOHIIRCROHHRCCHRCRHCCC
         .ROCRIHRIRRHRICOOOICCHHROIIIOIR
         .get(RCIICOICCOIOCCCHCOOCCRHRIHOOHI(var1.name) + "." + OCIRIHHHIICCRCHICCCHHHHIOHCHHH(var2.name) + RCIICOICCOIOCCCHCOOCCRHRIHOOHI(var2.desc));
      if (var3 != null) {
         if (var3.ORHCHOHIHHIRHIROOHIIHRHCIIHICI) {
            var2.access = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRORROHIRIRIHHOOCOIRHCIRHHORI(var2.access);
         }

         if (var3.RIHHOCHRRCCICRRCRICIHRIIRHROHH) {
            var2.access &= -17;
            if ((var2.access & 1) == 0) {
               var2.access = var2.access & -3 | 4;
            }
         }
      }
   }

   private static String OCIRIHHHIICCRCHICCCHHHHIOHCHHH(String var0) {
      int var1 = var0.lastIndexOf("$v");
      if (var1 > 0 && var1 + 2 < var0.length() && Character.isDigit(var0.charAt(var1 + 2))) {
         for (int var2 = var1 + 3; var2 < var0.length(); var2++) {
            char var3 = var0.charAt(var2);
            if (!Character.isLetterOrDigit(var3) && var3 != '_') {
               return var0;
            }
         }

         return var0.substring(0, var1);
      } else {
         return var0;
      }
   }

   private static String RCIICOICCOIOCCCHCOOCCRHRIHOOHI(String var0) {
      int var1;
      while ((var1 = var0.indexOf("_v")) > 0 && var1 + 2 < var0.length() && Character.isDigit(var0.charAt(var1 + 2))) {
         int var2 = var1 + 3;

         while (true) {
            if (var2 < var0.length()) {
               char var3 = var0.charAt(var2);
               if (Character.isLetterOrDigit(var3) || var3 == '_') {
                  var2++;
                  continue;
               }
            }

            var0 = var0.substring(0, var1) + var0.substring(var2);
            break;
         }
      }

      return var0;
   }

   private static com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      InputStream var0, @Nullable MappingSet var1
   ) {
      com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = new com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();

      try (BufferedReader var3 = new BufferedReader(new InputStreamReader(var0))) {
         boolean var4 = false;

         String var5;
         while ((var5 = var3.readLine()) != null) {
            int var6 = var5.indexOf(35);
            if (var6 >= 0) {
               var5 = var5.substring(0, var6);
            }

            var5 = var5.strip();
            if (!var5.isEmpty()) {
               if (!var4) {
                  var4 = true;
               } else {
                  String[] var7 = var5.split("\\s+");
                  if (var7.length >= 3) {
                     String var8 = var7[0];
                     String var9 = var7[1];
                     String var10 = var7[2];
                     switch (var9) {
                        case "class":
                           String var21 = var1 != null ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, var1) : var10;
                           com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var23 = var2.RRCICRHCCROHCCIHORCHIOICRIRRHC
                              .computeIfAbsent(
                                 var21,
                                 var0x -> new com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH()
                              );
                           if ("accessible".equals(var8)) {
                              var23.ORHCHOHIHHIRHIROOHIIHRHCIIHICI = true;
                           }

                           if ("extendable".equals(var8)) {
                              var23.RIHHOCHRRCCICRRCRICIHRIIRHROHH = true;
                           }
                           break;
                        case "method":
                           if (var7.length >= 5) {
                              String var20 = var7[3];
                              String var22 = var7[4];
                              String var24 = var1 != null
                                 ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, var1)
                                    + "."
                                    + RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, var20, var22, var1)
                                    + IRCIIHHICIHRCOCRROCOICRIHHCCHH(var22, var1)
                                 : var10 + "." + var20 + var22;
                              com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var25 = var2.ROCRIHRIRRHRICOOOICCHHROIIIOIR
                                 .computeIfAbsent(
                                    var24,
                                    var0x -> new com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH()
                                 );
                              if ("accessible".equals(var8)) {
                                 var25.ORHCHOHIHHIRHIROOHIIHRHCIIHICI = true;
                              }

                              if ("extendable".equals(var8)) {
                                 var25.RIHHOCHRRCCICRRCRICIHRIIRHROHH = true;
                              }
                           }
                           break;
                        case "field":
                           if (var7.length >= 5) {
                              String var13 = var7[3];
                              String var14 = var7[4];
                              String var15 = var1 != null
                                 ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, var1)
                                    + "."
                                    + IRCIIHHICIHRCOCRROCOICRIHHCCHH(var10, var13, var14, var1)
                                    + IRCIIHHICIHRCOCRROCOICRIHHCCHH(var14, var1)
                                 : var10 + "." + var13 + var14;
                              com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var16 = var2.fields
                                 .computeIfAbsent(
                                    var15,
                                    var0x -> new com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH()
                                 );
                              if ("accessible".equals(var8)) {
                                 var16.ORHCHOHIHHIRHIROOHIIHRHCIIHICI = true;
                              }

                              if ("mutable".equals(var8)) {
                                 var16.mutable = true;
                              }
                           }
                     }
                  }
               }
            }
         }
      }

      return var2;
   }

   private static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, MappingSet var1) {
      return var1.computeClassMapping(var0).<String>map(Mapping::getFullDeobfuscatedName).orElse(var0);
   }

   private static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, String var1, String var2, MappingSet var3) {
      return var3.computeClassMapping(var0)
         .flatMap(var2x -> var2x.getMethodMapping(MethodSignature.of(var1, var2)))
         .<String>map(Mapping::getDeobfuscatedName)
         .orElse(var1);
   }

   private static String IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var0, String var1, String var2, MappingSet var3) {
      return var3.computeClassMapping(var0)
         .flatMap(var2x -> var2x.computeFieldMapping(FieldSignature.of(var1, var2)))
         .<String>map(Mapping::getDeobfuscatedName)
         .orElse(var1);
   }

   private static String IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var0, MappingSet var1) {
      StringBuilder var2 = new StringBuilder(var0.length());
      int var3 = 0;

      while (var3 < var0.length()) {
         char var4 = var0.charAt(var3++);
         if (var4 == 'L') {
            int var5 = var0.indexOf(59, var3);
            if (var5 >= 0) {
               var2.append('L').append(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.substring(var3, var5), var1)).append(';');
               var3 = var5 + 1;
               continue;
            }
         }

         var2.append(var4);
      }

      return var2.toString();
   }

   private static class CRRRICCRROCOHHOHIICIHORCOORRRH {
      boolean ORHCHOHIHHIRHIROOHIIHRHCIIHICI;
      boolean RIHHOCHRRCCICRRCRICIHRIIRHROHH;
   }

   private static class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      boolean ORHCHOHIHHIRHIROOHIIHRHCIIHICI;
      boolean mutable;
   }

   private static class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      boolean ORHCHOHIHHIRHIROOHIIHRHCIIHICI;
      boolean RIHHOCHRRCCICRRCRICIHRIIRHROHH;
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      final Map<String, com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> RRCICRHCCROHCCIHORCHIOICRIRRHC = new HashMap<>();
      final Map<String, com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH> ROCRIHRIRRHRICOOOICCHHROIIIOIR = new HashMap<>();
      final Map<String, com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> fields = new HashMap<>();
   }
}
