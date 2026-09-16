package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.beam.v1.DisplayBeaconBeamMessage;
import com.lunarclient.apollo.beam.v1.RemoveBeaconBeamMessage;
import com.lunarclient.apollo.beam.v1.ResetBeaconBeamsMessage;
import com.lunarclient.apollo.module.beam.Beam;
import com.lunarclient.apollo.network.NetworkTypes;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import lombok.Generated;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final Map<String, Beam> HCHOOIOHICCRIOIICHCHOIIRRRIHCI = new HashMap<>();

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      super("beam", "Beam");
   }

   @Override
   protected void onEnable() {
      this.ICICCCHHROCIHROROHIRCIOHICCCCH();
   }

   @Override
   protected void onDisable() {
      this.ICICCCHHROCIHROROHIRCIOHICCCCH();
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(DisplayBeaconBeamMessage.class, RemoveBeaconBeamMessage.class, ResetBeaconBeamsMessage.class);
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         DisplayBeaconBeamMessage.class,
         var1x -> {
            if (var1x.hasLocation()) {
               String var2 = var1x.getId();
               this.HCHOOIOHICCRIOIICHCHOIIRRRIHCI
                  .put(var2, Beam.builder().color(NetworkTypes.fromProtobuf(var1x.getColor())).location(NetworkTypes.fromProtobuf(var1x.getLocation())).build());
            }
         }
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RemoveBeaconBeamMessage.class, var1x -> this.HCHOOIOHICCRIOIICHCHOIIRRRIHCI.remove(var1x.getId()));
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetBeaconBeamsMessage.class, var1x -> this.ICICCCHHROCIHROROHIRCIOHICCCCH());
   }

   private void ICICCCHHROCIHROROHIRCIOHICCCCH() {
      this.HCHOOIOHICCRIOIICHCHOIIRRRIHCI.clear();
   }

   @Generated
   public Map<String, Beam> OHIIIORIOIRCIIOOORHIOCOOOOIIRO() {
      return this.HCHOOIOHICCRIOIICHCHOIIRRRIHCI;
   }
}
