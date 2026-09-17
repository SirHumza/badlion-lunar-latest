package com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR;

import com.google.common.collect.Sets;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Supplier;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   private static Set<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HICRHIOORRRHOOOHHCCIOCHORCHRCI = null;
   private final Set<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RCCRIIIROHCICIIOORCCRRIHIOOIOI = Sets.newSetFromMap(new IdentityHashMap());
   private final Runnable RIHHCRHCIOHRIIIHRCHRORIRHOCCRH;

   private RRCRRCORICCHOHHIRCHIROOHIIOHCO(Runnable var1) {
      this.RIHHCRHCIOHRIIIHRCHRORIRHOCCRH = var1;
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0) {
      if (HICRHIOORRRHOOOHHCCIOCHORCHRCI != null) {
         if (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .HOHHOCRCRCHRRHHOIIHOCOIOCOIRRO()) {
            HICRHIOORRRHOOOHHCCIOCHORCHRCI.add(var0);
         }
      }
   }

   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO IOHIHIIHCCCCCIHRORIOIOORCIOHII(Runnable var0) {
      return new RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0);
   }

   public <T> T RIIHIHHCRHCHRCICHOROHCHIIHCICH(Supplier<T> var1) {
      return com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .HHCCIRHCCCIIRHCROHIORHIRHHIORH(() -> {
            Set var2 = Sets.newSetFromMap(new IdentityHashMap());
            HICRHIOORRRHOOOHHCCIOCHORCHRCI = var2;
            Object var3 = var1.get();
            HICRHIOORRRHOOOHHCCIOCHORCHRCI = null;
            Iterator var4 = this.RCCRIIIROHCICIIOORCCRRIHIOOIOI.iterator();

            while (var4.hasNext()) {
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var4.next();
               if (!var2.contains(var5)) {
                  var5.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(this.RIHHCRHCIOHRIIIHRCHRORIRHOCCRH);
                  var4.remove();
               }
            }

            for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 : var2) {
               if (this.RCCRIIIROHCICIIOORCCRRIHIOOIOI.add(var7)) {
                  var7.OIHCOHRCICCCRHRCROOCIOIRRHHHIH(this.RIHHCRHCIOHRIIIHRCHRORIRHOCCRH);
               }
            }

            return (T)var3;
         });
   }
}
