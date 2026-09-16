package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.glow.v1.OverrideGlowEffectMessage;
import com.lunarclient.apollo.glow.v1.ResetGlowEffectMessage;
import com.lunarclient.apollo.glow.v1.ResetGlowEffectsMessage;
import com.lunarclient.apollo.network.NetworkTypes;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Set;
import java.util.UUID;

public class HICHRCOHCCRHOHCICOOCHOIHCCHIRI
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static final int HHIHHOCHCHOICHRIHCHRIICHOCCHHI = Integer.MIN_VALUE;
   private final Object2IntMap<UUID> HCOCHROIHOHRIIHHRIHCOOIIOHOORC = new Object2IntOpenHashMap();

   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI() {
      super("glow", "Glow");
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(OverrideGlowEffectMessage.class, ResetGlowEffectMessage.class, ResetGlowEffectsMessage.class);
   }

   @Override
   protected void onEnable() {
      this.ORROICIHIROOCHROICOHIRCOIIHHOI();
   }

   @Override
   protected void onDisable() {
      this.ORROICIHIROOCHROICOHIRCOIIHHOI();
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OverrideGlowEffectMessage.class, var1x -> {
         if (var1x.hasPlayerUuid()) {
            UUID var2 = NetworkTypes.fromProtobuf(var1x.getPlayerUuid());
            if (var1x.hasColor()) {
               this.HCOCHROIHOHRIIHHRIHCOOIIOHOORC.put(var2, var1x.getColor().getColor());
            } else {
               this.HCOCHROIHOHRIIHHRIHCOOIIOHOORC.put(var2, Integer.MIN_VALUE);
            }
         }
      });
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetGlowEffectMessage.class, var1x -> {
         if (var1x.hasPlayerUuid()) {
            UUID var2 = NetworkTypes.fromProtobuf(var1x.getPlayerUuid());
            this.HCOCHROIHOHRIIHHRIHCOOIIOHOORC.removeInt(var2);
         }
      });
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetGlowEffectsMessage.class, var1x -> this.ORROICIHIROOCHROICOHIRCOIIHHOI());
   }

   public boolean RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var1
   ) {
      return this.HCOCHROIHOHRIIHHRIHCOOIIOHOORC.containsKey(var1.bridge$getUniqueID());
   }

   public int HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var1
   ) {
      return this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1.bridge$getUniqueID());
   }

   public int HICHRCOHCCRHOHCICOOCHOIHCCHIRI(UUID var1) {
      return this.HCOCHROIHOHRIIHHRIHCOOIIOHOORC.getInt(var1);
   }

   private void ORROICIHIROOCHROICOHIRCOIIHHOI() {
      this.HCOCHROIHOHRIIHHRIHCOOIIOHOORC.clear();
   }
}
