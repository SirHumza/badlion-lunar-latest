package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.heightlimit.v1.OverrideHeightLimitMessage;
import com.lunarclient.apollo.heightlimit.v1.RemoveHeightLimitMessage;
import com.lunarclient.apollo.heightlimit.v1.ResetHeightLimitsMessage;
import com.lunarclient.apollo.player.v1.UpdatePlayerWorldMessage;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IIHRRHORCRCROCHHOHORCHCROCIHRO
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final Map<String, com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> RIHHRIORHCIOHCIRCOHIIHICOCCCOO = new HashMap<>();

   public IIHRRHORCRCROCHHOHORCHCROCIHRO() {
      super("height_limit", "Height Limit");
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(OverrideHeightLimitMessage.class, RemoveHeightLimitMessage.class, ResetHeightLimitsMessage.class);
   }

   @Override
   protected void onEnable() {
      this.CRRRRCROCHOHHIOOOHRRHORHOCHCCI();
   }

   @Override
   protected void onDisable() {
      this.CRRRRCROCHOHHIOOOHRRHORHOCHCCI();
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         OverrideHeightLimitMessage.class,
         var1x -> {
            if (var1x.getLimit() > 0) {
               String var2 = var1x.getDisplayNameAdventureJsonLines();
               String var3 = null;
               if (!var2.isEmpty()) {
                  Component var4 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCHIRICCIHCCIHOHRCHRHRHCRCOH(
                     var2
                  );
                  var3 = var4 == null
                     ? null
                     : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asLegacyString(var4);
               }

               this.RIHHRIORHCIOHCIRCOHIIHICOCCCOO
                  .put(
                     var1x.getWorld(),
                     new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        var1x.getLimit(), var3
                     )
                  );
               this.resolve();
            }
         }
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RemoveHeightLimitMessage.class, var1x -> {
         this.RIHHRIORHCIOHCIRCOHIIHICOCCCOO.remove(var1x.getWorld());
         this.resolve();
      });
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetHeightLimitsMessage.class, var1x -> this.CRRRRCROCHOHHIOOOHRRHORHOCHCCI());
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UpdatePlayerWorldMessage.class, var1x -> {
         if (this.isEnabled()) {
            this.resolve();
         }
      });
   }

   private void resolve() {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = this.RIHHRIORHCIOHCIRCOHIIHICOCCCOO
         .get(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR().getWorld());
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .OOHHHHCRIIROCRHCCICRRCHHHCCCOI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
   }

   private void CRRRRCROCHOHHIOOOHRRHORHOCHCCI() {
      this.RIHHRIORHCIOHCIRCOHIIHICOCCCOO.clear();
      this.resolve();
   }
}
