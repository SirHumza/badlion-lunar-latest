package com.lunarclient.apollo.module.border;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.border.v1.DisplayBorderMessage;
import com.lunarclient.apollo.border.v1.RemoveBorderMessage;
import com.lunarclient.apollo.border.v1.ResetBordersMessage;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.recipients.Recipients;
import com.lunarclient.apollo.util.Ranges;
import lombok.NonNull;

public final class BorderModuleImpl extends BorderModule {
   @Override
   public void displayBorder(@NonNull Recipients var1, @NonNull Border var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("border is marked non-null but is null");
      }

      DisplayBorderMessage var3 = DisplayBorderMessage.newBuilder()
         .setId(var2.getId())
         .setWorld(var2.getWorld())
         .setCancelEntry(var2.isCancelEntry())
         .setCancelExit(var2.isCancelExit())
         .setCanShrinkOrExpand(var2.isCanShrinkOrExpand())
         .setColor(NetworkTypes.toProtobuf(var2.getColor()))
         .setBounds(NetworkTypes.toProtobuf(var2.getBounds()))
         .setDurationTicks(Ranges.checkPositive(var2.getDurationTicks(), "Border#durationTicks"))
         .build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void removeBorder(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("borderId is marked non-null but is null");
      }

      RemoveBorderMessage var3 = RemoveBorderMessage.newBuilder().setId(var2).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void removeBorder(@NonNull Recipients var1, @NonNull Border var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("border is marked non-null but is null");
      }

      this.removeBorder(var1, var2.getId());
   }

   @Override
   public void resetBorders(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetBordersMessage var2 = ResetBordersMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }
}
