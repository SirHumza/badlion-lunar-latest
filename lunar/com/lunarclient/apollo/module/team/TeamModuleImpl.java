package com.lunarclient.apollo.module.team;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.common.ApolloComponent;
import com.lunarclient.apollo.common.location.ApolloLocation;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.recipients.Recipients;
import com.lunarclient.apollo.team.v1.ResetTeamMembersMessage;
import com.lunarclient.apollo.team.v1.UpdateTeamMembersMessage;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.awt.Color;
import java.util.List;
import lombok.NonNull;

public final class TeamModuleImpl extends TeamModule {
   @Override
   public void updateTeamMembers(@NonNull Recipients var1, @NonNull List<TeamMember> var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("teamMembers is marked non-null but is null");
      }

      UpdateTeamMembersMessage.Builder var3 = UpdateTeamMembersMessage.newBuilder();

      for (TeamMember var5 : var2) {
         var3.addMembers(this.toProtobuf(var5));
      }

      ApolloManager.getNetworkManager().sendPacket(var1, var3.build());
   }

   @Override
   public void resetTeamMembers(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetTeamMembersMessage var2 = ResetTeamMembersMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }

   private com.lunarclient.apollo.team.v1.TeamMember toProtobuf(TeamMember var1) {
      com.lunarclient.apollo.team.v1.TeamMember.Builder var2 = com.lunarclient.apollo.team.v1.TeamMember.newBuilder()
         .setPlayerUuid(NetworkTypes.toProtobuf(var1.getPlayerUuid()));
      Component var3 = var1.getDisplayName();
      if (var3 != null) {
         var2.setAdventureJsonPlayerName(ApolloComponent.toJson(var3));
      }

      Color var4 = var1.getMarkerColor();
      if (var4 != null) {
         var2.setMarkerColor(NetworkTypes.toProtobuf(var4));
      }

      ApolloLocation var5 = var1.getLocation();
      if (var5 != null) {
         var2.setLocation(NetworkTypes.toProtobuf(var5));
      }

      return var2.build();
   }
}
