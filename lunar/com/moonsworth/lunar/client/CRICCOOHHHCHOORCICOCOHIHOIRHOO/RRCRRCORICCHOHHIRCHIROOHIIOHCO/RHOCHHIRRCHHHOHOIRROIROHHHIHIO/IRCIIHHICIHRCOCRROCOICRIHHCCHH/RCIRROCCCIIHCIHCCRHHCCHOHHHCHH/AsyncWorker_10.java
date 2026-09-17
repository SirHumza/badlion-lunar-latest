package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public class CRRRICCRROCOHHOHIICIHORCOORRRH {
   private final List<HHCCIRHCCCIIRHCROHIORHIRHHIORH> RHHOCOICRCOHCHRRHCOOIIOHHIOHOH = new ArrayList<>();

   public void clear() {
      this.RHHOCOICRCOHCHRRHCOOIIOHHIOHOH.clear();
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      this.RHHOCOICRCOHCHRRHCOOIIOHHIOHOH.add(var1);
      return this;
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH HCHRIROHHHCORIOCROOCHRCIOROOCI(List<HHCCIRHCCCIIRHCROHIORHIRHHIORH> var1) {
      this.RHHOCOICRCOHCHRRHCOOIIOHHIOHOH.addAll(var1);
      return this;
   }

   public Duration HRCOICIHHHICHCRHCICCROORCRICII() {
      return Arrays.stream(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.values()).map(this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH).reduce(Duration.ZERO, Duration::plus);
   }

   private Duration RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      Duration var2 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1)
         .map(HHCCIRHCCCIIRHCROHIORHIRHHIORH::HHOICRCRCROCOIROOCROOROOOORHRR)
         .reduce(null, CRRRICCRROCOHHOHIICIHORCOORRRH::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      return var2 == null ? Duration.ZERO : var2;
   }

   private static Duration RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Duration var0, Duration var1) {
      if (var0 == null) {
         return var1;
      } else if (var1 == null) {
         return var0;
      } else {
         return var0.minus(var1).isNegative() ? var1 : var0;
      }
   }

   private Stream<HHCCIRHCCCIIRHCROHIORHIRHHIORH> IRCIIHHICIHRCOCRROCOICRIHHCCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      return this.ICHCICHCCICHIHOOCRRIHICHCHCORC().filter(var1x -> var1x.ROOOCCORIHOOROIOIRHCRRIRCCIIHC() == var1);
   }

   private Stream<HHCCIRHCCCIIRHCROHIORHIRHHIORH> ICHCICHCCICHIHOOCRRIHICHCHCORC() {
      return this.RHHOCOICRCOHCHRRHCOOIIOHHIOHOH.stream().filter(HHCCIRHCCCIIRHCROHIORHIRHHIORH::HCRCCCICHHRRHROCHIOOHCHCRORCCO);
   }

   public Future<IRCIIHHICIHRCOCRROCOICRIHHCCHH> RIIOIHHIHRHOHCORCRHHRHCHICCHOR() {
      return CompletableFuture.supplyAsync(() -> Arrays.stream(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.values()).map(var1 -> {
         try {
            return this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1).get();
         } catch (InterruptedException | ExecutionException var3) {
            return new IRCIIHHICIHRCOCRROCOICRIHHCCHH().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("Failed to collect data for phase " + var1, var3);
         }
      }).reduce(new IRCIIHHICIHRCOCRROCOICRIHHCCHH(), IRCIIHHICIHRCOCRROCOICRIHHCCHH::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH));
   }

   private Future<IRCIIHHICIHRCOCRROCOICRIHHCCHH> HHCCIRHCCCIIRHCROHIORHIRHHIORH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      return CompletableFuture.supplyAsync(
         () -> this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1)
            .map(var0 -> RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORCOCORROHIROCCIORORRRRCHIOOCH(var0, var0.RIIOIHHIHRHOHCORCRHHRHCHICCHOR()))
            .toList()
            .stream()
            .map(
               var0 -> {
                  try {
                     return (IRCIIHHICIHRCOCRROCOICRIHHCCHH)((Future)var0.CICIHRHOHOHIOCRHRIHCHHIHRIHIIC).get();
                  } catch (InterruptedException | ExecutionException var2) {
                     return new IRCIIHHICIHRCOCRROCOICRIHHCCHH()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           "Failed to collect data for " + ((HHCCIRHCCCIIRHCROHIORHIRHHIORH)var0.OHICIOOICHICOIOCOROIIOCCHRRCIC).name(), var2
                        );
                  }
               }
            )
            .reduce(new IRCIIHHICIHRCOCRROCOICRIHHCCHH(), IRCIIHHICIHRCOCRROCOICRIHHCCHH::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)
      );
   }
}
