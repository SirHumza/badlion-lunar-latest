package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.util.ORCOCORROHIROCCIORORRRRCHIOOCH;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Override
   public String name() {
      return "events";
   }

   @Override
   public boolean HCRCCCICHHRRHROCHIOOHCHCRORCCO() {
      return true;
   }

   @Override
   public Duration HHOICRCRCROCOIROOCROOROOOORHRR() {
      return Duration.ofMillis(100L);
   }

   @Override
   public com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ROOOCCORIHOOROIOIRHCRRIRCCIIHC() {
      return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PRE_COLLECT;
   }

   @Override
   public Future<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> RIIOIHHIHRHOHCORCRHHRHCHICCHOR() {
      return ORCOCORROHIROCCIORORRRRCHIOOCH.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(
         () -> new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH()
            .RHOCHHIRRCHHHOHOIRROIROHHHIHIO("events.txt", this.HIRRIHCIRCCHIHHOROCHRROOCCIHHI())
      );
   }

   private String HIRRIHCIRCCHIHHOROCHRROOCCIHHI() {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO();
      StringBuilder var2 = new StringBuilder();
      ReentrantLock var3 = var1.HOIRROCROIIHIROHORIOOROCCHOCHI();
      var3.lock();

      try {
         ArrayList var4 = new ArrayList<>(var1.RIIOIOHHOCOROCRROOOCRRCIICORIC().entrySet());
         var4.sort(
            Comparator.<Entry>comparingInt(
                  var0 -> -(
                     var0.getValue() == null
                        ? 0
                        : ((com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO[])var0.getValue()).length
                  )
               )
               .thenComparing(var0 -> ((Class)var0.getKey()).getName())
         );

         for (Entry var6 : var4) {
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO[] var7 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO[])var6.getValue();
            int var8 = var7 == null ? 0 : var7.length;
            var2.append(((Class)var6.getKey()).getName()).append(" (").append(var8).append(" listeners)\n");
            if (var7 != null) {
               for (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var12 : var7) {
                  var2.append("  - priority=")
                     .append(var12.priority())
                     .append(" callback=")
                     .append(var12.COIOHCOCOHIRRRRRCCIHRRCICOCOII() == null ? "null" : var12.COIOHCOCOHIRRRRRCCIHRRCICOCOII().getClass().getName())
                     .append("\n");
               }
            }
         }
      } finally {
         var3.unlock();
      }

      return var2.toString();
   }
}
