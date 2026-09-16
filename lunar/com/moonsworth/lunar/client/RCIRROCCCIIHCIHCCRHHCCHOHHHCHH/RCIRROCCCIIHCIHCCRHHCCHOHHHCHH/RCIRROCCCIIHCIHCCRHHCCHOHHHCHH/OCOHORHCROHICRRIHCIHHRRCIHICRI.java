package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.common.v1.Location;
import com.lunarclient.apollo.hologram.v1.DisplayHologramMessage;
import com.lunarclient.apollo.hologram.v1.RemoveHologramMessage;
import com.lunarclient.apollo.hologram.v1.ResetHologramsMessage;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.Objects;
import java.util.Set;

public class OCOHORHCROHICRRIHCIHHRRCIHICRI
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public OCOHORHCROHICRRIHCIHHRRCIHICRI() {
      super("hologram", "Hologram");
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(DisplayHologramMessage.class, RemoveHologramMessage.class, ResetHologramsMessage.class);
   }

   @Override
   protected void onEnable() {
      this.RRIRRIROCCRCRHRHIRIIIICIHIRCHC();
   }

   @Override
   protected void onDisable() {
      this.RRIRRIROCCRCRHRHIRIIIICIHIRCHC();
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         DisplayHologramMessage.class,
         var0 -> {
            if (var0.hasLocation()) {
               String var1x = var0.getId();
               Component[] var2 = var0.getAdventureJsonLinesList()
                  .stream()
                  .map(
                     com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH::IRRCHIRICCIHCCIHOHRCHRHRHCRCOH
                  )
                  .filter(Objects::nonNull)
                  .toArray(Component[]::new);
               Location var3 = var0.getLocation();
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var1x, var2, var3.getX(), var3.getY(), var3.getZ(), var0.getShowThroughWalls(), var0.getShowShadow(), var0.getShowBackground(), true
               );
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .IOICCCHOCCOIIHICRCIRIRROHRCHCC()
                  .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
                  .put(var1x, var4);
            }
         }
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         RemoveHologramMessage.class,
         var0 -> IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .IOICCCHOCCOIIHICRCIRIRROHRCHCC()
            .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
            .remove(var0.getId())
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetHologramsMessage.class, var1x -> this.RRIRRIROCCRCRHRHIRIIIICIHIRCHC());
   }

   private void RRIRRIROCCRCRHRHIRIIIICIHIRCHC() {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .IOICCCHOCCOIIHICRCIRIRROHRCHCC()
         .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
         .entrySet()
         .removeIf(var0 -> var0.getValue().OHOHROCCIROORCCCIOOOIOIIHORHOC());
   }
}
