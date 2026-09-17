package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.coloredfire.v1.OverrideColoredFireMessage;
import com.lunarclient.apollo.coloredfire.v1.ResetColoredFireMessage;
import com.lunarclient.apollo.coloredfire.v1.ResetColoredFiresMessage;
import com.lunarclient.apollo.module.coloredfire.ColoredFireModule;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.SimpleOption;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final Object2IntMap<UUID> IHOROCHCICHIIOOHHRRIRIIICIRRRR = new Object2IntOpenHashMap();

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
      super("colored_fire", "Colored Fire");
      this.IHOROCHCICHIIOOHHRRIRIIICIRRRR.defaultReturnValue(-1);
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.class,
         var1 -> {
            if (!this.getOptions().<Boolean, SimpleOption<Boolean>>get(ColoredFireModule.PERSIST_COLORS_ON_UNLOAD)) {
               this.IHOROCHCICHIIOOHHRRIRIIICIRRRR.removeInt(var1.IIRROICRRIIIIHICIHIOOHIOOOHIRI().bridge$getUniqueID());
            }
         }
      );
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(OverrideColoredFireMessage.class, ResetColoredFireMessage.class, ResetColoredFiresMessage.class);
   }

   @Override
   protected void onEnable() {
      this.HIHOOOCROORHCCCCOCIHIHHIOCIHCR();
   }

   @Override
   protected void onDisable() {
      this.HIHOOOCROORHCCCCOCIHIHHIOCIHCR();
   }

   @Override
   public Collection<Option<?, ?, ?>> IOHHOCRCCCIRHRCORCRCCCOCIOCCRH() {
      return List.of(ColoredFireModule.PERSIST_COLORS_ON_UNLOAD);
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OverrideColoredFireMessage.class, var1x -> {
         if (var1x.hasPlayerUuid()) {
            UUID var2 = NetworkTypes.fromProtobuf(var1x.getPlayerUuid());
            int var3 = var1x.getColor().getColor();
            this.IHOROCHCICHIIOOHHRRIRIIICIRRRR.put(var2, var3);
         }
      });
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetColoredFireMessage.class, var1x -> {
         if (var1x.hasPlayerUuid()) {
            UUID var2 = NetworkTypes.fromProtobuf(var1x.getPlayerUuid());
            this.IHOROCHCICHIIOOHHRRIRIIICIRRRR.removeInt(var2);
         }
      });
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetColoredFiresMessage.class, var1x -> this.HIHOOOCROORHCCCCOCIHIHHIOCIHCR());
   }

   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 25) {
         return this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
               ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var1).bridge$getUniqueID()
            )
            != -1;
      } else {
         return var1 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2
            ? this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var2.bridge$getUniqueID()) != -1
            : false;
      }
   }

   public int CRRRICCRROCOHHOHIICIHORCOORRRH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 25) {
         return this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
            ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var1).bridge$getUniqueID()
         );
      } else {
         return var1 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2
            ? this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var2.bridge$getUniqueID())
            : -1;
      }
   }

   public boolean CRRRICCRROCOHHOHIICIHORCOORRRH(UUID var1) {
      return this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1) != -1;
   }

   public int RRCRRCORICCHOHHIRCHIROOHIIOHCO(UUID var1) {
      return this.IHOROCHCICHIIOOHHRRIRIIICIRRRR.getInt(var1);
   }

   private void HIHOOOCROORHCCCCOCIHIHHIOCIHCR() {
      this.IHOROCHCICHIIOOHHRRIRIIICIRRRR.clear();
   }
}
