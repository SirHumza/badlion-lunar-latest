package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.lunarclient.dfu.serialization.Codec;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import com.moonsworth.lunar.client.util.IHIIIRHOOCHRCCCCIORIROCOIRRHCC;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import lombok.Generated;
import org.jspecify.annotations.Nullable;

public class IHCRORHRORIICHRHRCHRRIRRHHOCOO extends IIRHCHHOICHRICOOCRORCCIOOIHOIR {
   private static final List<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HICOHRHHICOHROIIRHHHIHIHHOIHII = HICRROHICIRHRHCOROIIICHCCRCIOI();
   private static final List<String> CIICCOIIRHIRHORHICCHOIHIOIOOOH = new ArrayList<>();
   private static final Map<String, com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HRCOCHHHCCIOHCICORHHIOHCHCROOO = new HashMap<>();
   private final AtomicReference<Map<String, com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>> OIOIOCOHICHRIHCRROHIRRCHOCCROR = new AtomicReference<>(
      new Object2ObjectArrayMap()
   );

   public IHCRORHRORIICHRHRCHRRIRRHHOCOO(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1,
      @Nullable Codec<Set<String>> var2,
      Collection<String> var3,
      Set<String> var4,
      @Nullable Consumer<String> var5,
      Function<String, String> var6
   ) {
      super(var1, var2, var3, var4, var5, var6);
      if (!var4.isEmpty()) {
         this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var4);
      }
   }

   private static List<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HICRROHICIRHRHCOROIIICHCCRCIOI() {
      Builder var0 = ImmutableList.builder();

      for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2 : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIHHIHOORIIHCOORRRICHHCCRRRCHO()
         .HHRRORCOHRRIROCHIICHORRHHOROOH()) {
         String var3 = var2.bridge$getRegistryName();
         if (!var3.endsWith("potion") && !var3.equals("minecraft:water")) {
            if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().OOICHHIHHIHROCCRRRIIIIRIRICCIH()) {
               var0.add(
                  new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var3
                  )
               );
            } else {
               List var4 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CHHHIRRRHHCOOHRRICOCICHHROHHIR(
                  var3
               );
               if (var4.isEmpty()) {
                  var0.add(
                     new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        var3
                     )
                  );
               } else {
                  for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 : var4) {
                     var0.add(
                        new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                           var3, var6.IIOCRCCRCCCCCROIICCIOIHICOIROI(), var6.CHCCCCICHHOIHRHOCRRHOCOHCRHHOC()
                        )
                     );
                  }
               }
            }
         }
      }

      if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().ROOCRICIHHRRIRCROHHIHICHIROCRC()) {
         for (int var13 : IHIIIRHOOCHRCCCCIORIROCOIRRHCC.IICOHCCIRCRCOIRIOICCIIICOOIICI) {
            var0.add(
               new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  var13
               )
            );
            if (var13 != 0 && var13 != 16 && var13 != 32 && var13 != 64) {
               var0.add(
                  new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                     IHIIIRHOOCHRCCCCIORIROCOIRRHCC.CCCHICOCHIOOIRCCHOCHHIHIIHHCHO(var13)
                  )
               );
            }
         }
      } else {
         List var8 = List.of("minecraft:potion", "minecraft:splash_potion", "minecraft:lingering_potion");

         for (String var12 : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCICHHOCCHOROIORCOHOHIRRHCIIOR()
            .CHCHIHHHOOHIHHHCCCICOHICRCRIRI()) {
            for (String var15 : var8) {
               var0.add(
                  new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                     var15, var12
                  )
               );
            }
         }
      }

      return var0.build();
   }

   @Override
   public void IOIICIRIICICIIOORHCIIIIRRIHRHI(Set<String> var1) {
      super.IOIICIRIICICIIOORHCIIIIRRIHRHI(var1);
      this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1);
   }

   private void CRICCOOHHHCHOORCICOCOHIHOIRHOO(Collection<String> var1) {
      Object2ObjectArrayMap var2 = new Object2ObjectArrayMap(var1.size());

      for (String var4 : var1) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = this.OHOCOOCOORHRROCRIRIHIHRHOCIORH(
            var4
         );
         if (var5 != null) {
            var2.put(var4, var5);
         }
      }

      this.OIOIOCOHICHRIHCRROHIRRCHOCCROR.set(var2);
   }

   @Override
   public boolean OIHIRIHHROCIHCCOROROIRIOHHIHHR(String var1) {
      if (super.OIHIRIHHROCIHCCOROROIRIOHHIHHR(var1)) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.OHOCOOCOORHRROCRIRIHIHRHOCIORH(
            var1
         );
         if (var2 != null) {
            this.OIOIOCOHICHRIHCRROHIRRCHOCCROR.getAndUpdate(var2x -> {
               Object2ObjectArrayMap var3 = new Object2ObjectArrayMap(var2x);
               var3.put(var1, var2);
               return var3;
            });
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean remove(String var1) {
      if (super.remove(var1)) {
         this.OIOIOCOHICHRIHCRROHIRRCHOCCROR.getAndUpdate(var1x -> {
            Object2ObjectArrayMap var2 = new Object2ObjectArrayMap(var1x);
            var2.remove(var1);
            return var2;
         });
         return true;
      } else {
         return false;
      }
   }

   public boolean RRHHORICORICIRHICOHHROHIIHICCH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var1
   ) {
      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : this.OIOIOCOHICHRIHCRROHIRRCHOCCROR
         .get()
         .values()) {
         if (var4.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var1)) {
            return true;
         }
      }

      return false;
   }

   private @Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OHOCOOCOORHRROCRIRIHIHRHOCIORH(String var1) {
      return IOOOHCIOOIHHCHRCIIORIICROHOCIH().get(var1);
   }

   @Generated
   public static List<String> CIIIRHHIICOIROOIOOHRHCCOCRIIRH() {
      return CIICCOIIRHIRHORHICCHOIHIOIOOOH;
   }

   @Generated
   public static Map<String, com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> IOOOHCIOOIHHCHRCIIORIICROHOCIH() {
      return HRCOCHHHCCIOHCICORHHIOHCHCROOO;
   }

   static {
      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 : HICOHRHHICOHROIIRHHHIHIHHOIHII) {
         HRCOCHHHCCIOHCICORHHIOHCHCROOO.put(var1.ROCCHOHOIICCCROOHIHHHRORHCCIRI(), var1);
         CIICCOIIRHIRHORHICCHOIHIOIOOOH.add(var1.ROCCHOHOIICCCROOHIHHHRORHCCIRI());
      }
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      extends IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<IHCRORHRORIICHRHRCHRRIRRHHOCOO, IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> {
      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1
      ) {
         super(var1);
      }

      protected IHCRORHRORIICHRHRCHRRIRRHHOCOO IHCHROOIOHHCOIIIRRHCHICHIHHHOH() {
         return new IHCRORHRORIICHRHRCHRRIRRHHOCOO(
            this.RROHIIOCCIOHRHHIIRIOIRHHIOCRRO,
            this.codec,
            this.IIRCICOICHOHRCOORCOIRRCOOIHHIO == null ? IHCRORHRORIICHRHRCHRRIRRHHOCOO.CIICCOIIRHIRHORHICCHOIHIOIOOOH : this.IIRCICOICHOHRCOORCOIRRCOOIHHIO,
            this.defaultValue == null ? new LinkedHashSet<>() : this.defaultValue,
            this.OROOHIRIRCIRCOIROROHCCCHHCIOCI,
            this.HCRIRRCOHIOOOHOOCHOHOICRRRCIRI == null
               ? var0 -> IHCRORHRORIICHRHRCHRRIRRHHOCOO.HRCOCHHHCCIOHCICORHHIOHCHCROOO.get(var0).toString()
               : this.HCRIRRCOHIOOOHOOCHOHOICRRRCIRI
         );
      }
   }
}
