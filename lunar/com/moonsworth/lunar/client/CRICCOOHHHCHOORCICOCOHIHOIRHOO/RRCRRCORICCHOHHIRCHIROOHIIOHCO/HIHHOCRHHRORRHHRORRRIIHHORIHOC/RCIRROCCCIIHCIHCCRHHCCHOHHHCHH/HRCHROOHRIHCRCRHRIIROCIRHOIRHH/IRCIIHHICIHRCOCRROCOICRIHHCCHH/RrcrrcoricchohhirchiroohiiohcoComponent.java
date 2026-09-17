package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.annotations.SerializedName;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.util.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import lombok.Generated;

@RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO
public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private final RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IOCRHOCIRORHCOORCOORHIOIHRORIH;
   @SerializedName("links")
   private final Map<UUID, Set<UUID>> CIOCRHHRIRRCRHHIICRRCHRIOIHRHR = new HashMap<>();

   private RRCRRCORICCHOHHIRCHIROOHIIOHCO<?> IIOIROIHIHHCCRICRCOOCHIICHRCOI(UUID var1) {
      Entry var2 = this.IOCRHOCIRORHCOORCOORHIOIHRORIH.get(var1);
      return var2 == null ? null : (RRCRRCORICCHOHHIRCHIROOHIIOHCO)var2.getValue();
   }

   private Set<RRCRRCORICCHOHHIRCHIROOHIIOHCO<?>> HRCHROOHRIHCRCRHRIIROCIRHOIRHH(Set<UUID> var1) {
      HashSet var2 = new HashSet();

      for (UUID var4 : var1) {
         RRCRRCORICCHOHHIRCHIROOHIIOHCO var5 = this.IIOIROIHIHHCCRICRCOOCHIICHRCOI(var4);
         if (var5 != null) {
            var2.add(var5);
         }
      }

      return var2;
   }

   public Set<UUID> RHOORRIIOCHIRRHOHOOHIROHCRICRO(UUID var1) {
      return this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(this.IIOIROIHIHHCCRICRCOOCHIICHRCOI(var1));
   }

   public Set<UUID> RRCRRCORICCHOHHIRCHIROOHIIOHCO(RRCRRCORICCHOHHIRCHIROOHIIOHCO<?> var1) {
      if (var1 == null) {
         return Collections.emptySet();
      }

      UUID var2 = var1.RHIHOHRIICCHOHCCIRIIROCIHRRROO();
      if (var2 == null) {
         return Collections.emptySet();
      }

      Set var3 = this.CIOCRHHRIRRCRHHIICRRCHRIOIHRHR.get(var2);
      return var3 == null ? Collections.emptySet() : var3;
   }

   public Set<RRCRRCORICCHOHHIRCHIROOHIIOHCO<?>> CCHHCIRHICHHHHRRIHIORCCORCCIHR(UUID var1) {
      return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(this.RHOORRIIOCHIRRHOHOOHIROHCRICRO(var1));
   }

   public Set<RRCRRCORICCHOHHIRCHIROOHIIOHCO<?>> RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(RRCRRCORICCHOHHIRCHIROOHIIOHCO<?> var1) {
      return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1));
   }

   public void RRCRRCORICCHOHHIRCHIROOHIIOHCO(UUID var1, UUID var2) {
      Set var3 = this.CIOCRHHRIRRCRHHIICRRCHRIOIHRHR.computeIfAbsent(var1, var0 -> new HashSet<>());
      var3.add(var2);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, Set<UUID> var2) {
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var2));
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, Set<RRCRRCORICCHOHHIRCHIROOHIIOHCO<?>> var2) {
      if (var2.size() > 1) {
         boolean var3 = var1.HRCIOHCRICORROOIIHIHOIIICIOOCO();
         if (!var3) {
            var1.OIRICCRROORRCCICIIOIHHRICOHCIR();
         }

         UUID var4 = UUID.randomUUID();
         HashSet var5 = new HashSet();
         HashMap var6 = new HashMap();

         for (RRCRRCORICCHOHHIRCHIROOHIIOHCO var8 : var2) {
            var6.put(var8.getId(), var8.RHIHOHRIICCHOHCCIRIIROCIHRRROO());
         }

         this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1, var2);

         for (RRCRRCORICCHOHHIRCHIROOHIIOHCO var10 : var2) {
            var10.ORHIOICIOCRRHOOCOHRORIHICHRCRR(var4);
            var5.add(var10.getId());
         }

         var1.HHCCIRHCCCIIRHCROHIORHIRHHIORH(() -> this.CIOCRHHRIRRCRHHIICRRCHRIOIHRHR.remove(var4), () -> this.CIOCRHHRIRRCRHHIICRRCHRIOIHRHR.put(var4, var5));
         this.CIOCRHHRIRRCRHHIICRRCHRIOIHRHR.put(var4, var5);
         if (!var3) {
            var1.endBatch();
         }
      }
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, Set<UUID> var2) {
      this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1, this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var2));
   }

   public void CRRRICCRROCOHHOHIICIHORCOORRRH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, Set<RRCRRCORICCHOHHIRCHIROOHIIOHCO<?>> var2) {
      if (var2 != null && !var2.isEmpty()) {
         boolean var3 = var1.HRCIOHCRICORROOIIHIHOIIICIOOCO();
         if (!var3) {
            var1.OIRICCRROORRCCICIIOIHHRICOHCIR();
         }

         for (RRCRRCORICCHOHHIRCHIROOHIIOHCO var5 : var2) {
            UUID var6 = var5.RHIHOHRIICCHOHCCIRIIROCIHRRROO();
            if (var6 == null) {
               return;
            }

            Set var7 = this.CIOCRHHRIRRCRHHIICRRCHRIOIHRHR.get(var6);
            if (var7 != null) {
               var1.HHCCIRHCCCIIRHCROHIORHIRHHIORH(() -> var7.add(var5.getId()), () -> var7.remove(var5.getId()));
               var7.remove(var5.getId());
               if (var7.size() <= 1) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var6);
               }
            }

            var1.HHCCIRHCCCIIRHCROHIORHIRHHIORH(() -> var5.ORHIOICIOCRRHOOCOHRORIHICHRCRR(var6), () -> var5.ORHIOICIOCRRHOOCOHRORIHICHRCRR(null));
            var5.ORHIOICIOCRRHOOCOHRORIHICHRCRR(null);
         }

         if (!var3) {
            var1.endBatch();
         }
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, UUID var2) {
      Set var3 = this.CIOCRHHRIRRCRHHIICRRCHRIOIHRHR.remove(var2);
      if (var3 != null) {
         var1.HHCCIRHCCCIIRHCROHIORHIRHHIORH(() -> this.CIOCRHHRIRRCRHHIICRRCHRIOIHRHR.put(var2, var3), () -> this.CIOCRHHRIRRCRHHIICRRCHRIOIHRHR.remove(var2));

         for (UUID var5 : var3) {
            RRCRRCORICCHOHHIRCHIROOHIIOHCO var6 = this.IIOIROIHIHHCCRICRCOOCHIICHRCOI(var5);
            if (var6 != null) {
               var1.HHCCIRHCCCIIRHCROHIORHIRHHIORH(() -> var6.ORHIOICIOCRRHOOCOHRORIHICHRCRR(var2), () -> var6.ORHIOICIOCRRHOOCOHRORIHICHRCRR(null));
               var6.ORHIOICIOCRRHOOCOHRORIHICHRCRR(null);
            }
         }
      }
   }

   @Generated
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.IOCRHOCIRORHCOORCOORHIOIHRORIH = var1;
   }
}
