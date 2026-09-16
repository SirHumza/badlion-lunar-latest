package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class IHICORCROOROHCIHIHCOIHRRHICICO
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RRCRRCORICCHOHHIRCHIROOHIIOHCO> {
   private final Map<String, com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RRCRRCORICCHOHHIRCHIROOHIIOHCO> HOICHCOOIIHIOHORIHRHCHRHOCIIHI = new HashMap<>();

   @Override
   protected Set<com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RRCRRCORICCHOHHIRCHIROOHIIOHCO> ORRHHOHHRICCROHHICIOOHOOCRRRCC() {
      return ConcurrentHashMap.newKeySet();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2,
      int var3,
      int var4
   ) {
      this.RORIRHOCHROROOOOICOICHOCCRCCOH(var1.bridge$serverIP())
         .ifPresent(
            var3x -> {
               if (var3x.getResource() != null) {
                  var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var3x.getResource(),
                     var3 - 16,
                     var4 + 12,
                     0.0F,
                     0.0F,
                     8.0F,
                     8.0F,
                     8.0F,
                     8.0F,
                     var3x.getResource()
                           == com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIRHIRCRCROIOICCCHOIROROCORROO
                        ? -256
                        : -1
                  );
               }
            }
         );
   }

   private Optional<com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RRCRRCORICCHOHHIRCHIROOHIIOHCO> RORIRHOCHROROOOOICOICHOCCRCCOH(String var1) {
      if (this.HOICHCOOIIHIOHORIHRHCHRHOCIIHI.containsKey(var1.toLowerCase())) {
         return Optional.ofNullable(this.HOICHCOOIIHIOHORIHRHCHRHOCIIHI.get(var1.toLowerCase()));
      }

      com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = null;

      for (com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 : this.OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
         if (var4.HCHIOHCORORROIIOHIIRCHCCIIICIC()
            .stream()
            .anyMatch(
               var1x -> com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR(
                  var1x, var1
               )
            )) {
            var2 = var4;
            break;
         }
      }

      this.HOICHCOOIIHIOHORIHRHCHRHOCIIHI.put(var1.toLowerCase(), var2);
      return Optional.ofNullable(var2);
   }

   public void clear() {
      this.OHHRCRIOOCIORORHIOHRICRHHORCIH().clear();
      this.HOICHCOOIIHIOHORIHRHCHRHOCIIHI.clear();
   }
}
