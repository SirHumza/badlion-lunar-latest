package com.lunarclient.apollo.module.beam;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.beam.v1.DisplayBeaconBeamMessage;
import com.lunarclient.apollo.beam.v1.RemoveBeaconBeamMessage;
import com.lunarclient.apollo.beam.v1.ResetBeaconBeamsMessage;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.recipients.Recipients;
import lombok.NonNull;

public final class BeamModuleImpl extends BeamModule {
   @Override
   public void displayBeam(@NonNull Recipients var1, @NonNull Beam var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("beam is marked non-null but is null");
      }

      DisplayBeaconBeamMessage var3 = DisplayBeaconBeamMessage.newBuilder()
         .setId(var2.getId())
         .setLocation(NetworkTypes.toProtobuf(var2.getLocation()))
         .setColor(NetworkTypes.toProtobuf(var2.getColor()))
         .build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void removeBeam(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("beamId is marked non-null but is null");
      }

      RemoveBeaconBeamMessage var3 = RemoveBeaconBeamMessage.newBuilder().setId(var2).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void removeBeam(@NonNull Recipients var1, @NonNull Beam var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("beam is marked non-null but is null");
      }

      this.removeBeam(var1, var2.getId());
   }

   @Override
   public void resetBeams(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetBeaconBeamsMessage var2 = ResetBeaconBeamsMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }
}
