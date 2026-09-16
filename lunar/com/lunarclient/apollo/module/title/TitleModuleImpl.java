package com.lunarclient.apollo.module.title;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.common.ApolloComponent;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.recipients.Recipients;
import com.lunarclient.apollo.title.v1.DisplayTitleMessage;
import com.lunarclient.apollo.title.v1.ResetTitlesMessage;
import com.lunarclient.apollo.util.Ranges;
import lombok.NonNull;

public final class TitleModuleImpl extends TitleModule {
   @Override
   public void displayTitle(@NonNull Recipients var1, @NonNull Title var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("title is marked non-null but is null");
      }

      DisplayTitleMessage var3 = DisplayTitleMessage.newBuilder()
         .setTitleType(com.lunarclient.apollo.title.v1.TitleType.forNumber(var2.getType().ordinal() + 1))
         .setAdventureJsonMessage(ApolloComponent.toJson(var2.getMessage()))
         .setScale(Ranges.checkPositive(var2.getScale(), "Title#scale"))
         .setFadeInTime(NetworkTypes.toProtobuf(var2.getFadeInTime()))
         .setDisplayTime(NetworkTypes.toProtobuf(var2.getDisplayTime()))
         .setFadeOutTime(NetworkTypes.toProtobuf(var2.getFadeOutTime()))
         .setInterpolationScale(Ranges.checkPositive(var2.getInterpolationScale(), "Title#interpolationScale"))
         .setInterpolationRate(Ranges.checkPositive(var2.getInterpolationRate(), "Title#interpolationRate"))
         .build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void resetTitles(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetTitlesMessage var2 = ResetTitlesMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }
}
