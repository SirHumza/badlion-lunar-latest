package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;

public record CRRRICCRROCOHHOHIICIHORCOORRRH() {
   private final String ORIRHOCICIIRCRHCHHRHOHIIHRHOCI;
   private final RIOOCHICIHRHOHCCCCCHOCCCOHCRHI[] CROIHRIIRROCHORIIRIOCROOORRCCH;

   public CRRRICCRROCOHHOHIICIHORCOORRRH(String var1, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI[] var2) {
      this.ORIRHOCICIIRCRHCHHRHOHIIHRHOCI = var1;
      this.CROIHRIIRROCHORIIRIOCROOORRCCH = var2;
   }

   @NotNull
   public static CRRRICCRROCOHHOHIICIHORCOORRRH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(AnnotationNode var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, null);
   }

   @NotNull
   public static CRRRICCRROCOHHOHIICIHORCOORRRH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(AnnotationNode var0, @Nullable MethodNode var1) {
      String var2 = null;
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI[] var3 = null;
      List var4 = var0.values;
      if (var4 != null) {
         for (byte var5 = 0; var5 < var4.size(); var5 += 2) {
            String var6 = var4.get(var5).toString();
            Object var7 = var4.get(var5 + 1);
            if (var7 instanceof String var8) {
               if (!var8.isEmpty()) {
                  var2 = var7.toString();
               }
            } else if (var7 instanceof List var9) {
               List var10 = var9;
               var3 = new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI[var10.size()];

               for (int var11 = 0; var11 < var10.size(); var11++) {
                  AnnotationNode var12 = (AnnotationNode)var10.get(var11);
                  List var13 = var12.values;
                  Integer var14 = null;
                  RRCRRCORICCHOHHIRCHIROOHIIOHCO[] var15 = null;

                  for (byte var16 = 0; var16 < var13.size(); var16 += 2) {
                     String var17 = var13.get(var16).toString();
                     Object var18 = var13.get(var16 + 1);
                     if (var18 instanceof Integer var19) {
                        var14 = var19;
                     } else if (var18 instanceof List var20) {
                        List var21 = var20;
                        var15 = new RRCRRCORICCHOHHIRCHIROOHIIOHCO[var21.size()];

                        for (int var22 = 0; var22 < var21.size(); var22++) {
                           AnnotationNode var23 = (AnnotationNode)var21.get(var22);
                           List var24 = var23.values;
                           String[] var25 = null;

                           for (byte var26 = 0; var26 < var24.size(); var26 += 2) {
                              String var27 = var24.get(var26).toString();
                              if (var24.get(var26 + 1) instanceof List var29) {
                                 ArrayList var30 = (ArrayList)var29;
                                 if (var30.size() > 0) {
                                    var25 = var30.toArray(new String[0]);
                                 }
                              }
                           }

                           var15[var22] = new RRCRRCORICCHOHHIRCHIROOHIIOHCO(var25);
                        }
                     }
                  }

                  if (var14 != null && var15 != null) {
                     var3[var11] = new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var14, var15);
                  }
               }
            }
         }
      }

      if (var2 == null && var1 != null && var3 == null) {
         var2 = var1.name;
         if (var2.startsWith("bridge$")) {
            var2 = var2.replace("bridge$", "");
         }
      }

      if (var2 == null && var3 == null) {
         throw new IllegalStateException("Malformed bridge: new views present in " + var0.desc);
      } else {
         return new CRRRICCRROCOHHOHIICIHORCOORRRH(var2, var3);
      }
   }

   @Nullable
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO[] IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO[] var2 = null;
      if (this.ORIRHOCICIIRCRHCHHRHOHIIHRHOCI != null) {
         var2 = new RRCRRCORICCHOHHIRCHIROOHIIOHCO[]{new RRCRRCORICCHOHHIRCHIROOHIIOHCO(new String[]{this.ORIRHOCICIIRCRHCHHRHOHIIHRHOCI})};
      }

      if (this.CROIHRIIRROCHORIIRIOCROOORRCCH != null) {
         for (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var6 : this.CROIHRIIRROCHORIIRIOCROOORRCCH) {
            com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = (com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH)com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRHRHRCHHRCHCCRCRRCRICOICHCRRO(
                  var6.version()
               )
               .orElseThrow(() -> new IllegalStateException("Failed to parse Minecraft version " + var6.version()));
            if (var7 == var1) {
               return var6.IHOCIROIHHOHHIHOORORIRRHRICIRC();
            }

            if (var1.HHRIICOIOORCHCOIICOOIHIRHHICRI(var7)) {
               var2 = var6.IHOCIROIHHOHHIHOORORIRRHRICIRC();
            }
         }
      }

      return var2;
   }

   public String name() {
      return this.ORIRHOCICIIRCRHCHHRHOHIIHRHOCI;
   }

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI[] HIRRIHOOOHHRRCHOIRIHHOIHIRRCRC() {
      return this.CROIHRIIRROCHORIIRIOCROOORRCCH;
   }
}
