package com.lunarclient.apollo.module.staffmod;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.recipients.Recipients;
import com.lunarclient.apollo.staffmod.v1.DisableStaffModsMessage;
import com.lunarclient.apollo.staffmod.v1.EnableStaffModsMessage;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.NonNull;

public final class StaffModModuleImpl extends StaffModModule {
   private final Set<com.lunarclient.apollo.staffmod.v1.StaffMod> staffMods = Arrays.stream(StaffMod.values())
      .map(this::toProtobuf)
      .collect(Collectors.toSet());
   private final EnableStaffModsMessage enableAllStaffModsMessage = EnableStaffModsMessage.newBuilder().addAllStaffMods(this.staffMods).build();
   private final DisableStaffModsMessage disableAllStaffModsMessage = DisableStaffModsMessage.newBuilder().addAllStaffMods(this.staffMods).build();

   @Override
   public void enableStaffMods(@NonNull Recipients var1, @NonNull List<StaffMod> var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("mods is marked non-null but is null");
      }

      this.enableStaffMods(var1, var2, false);
   }

   @Override
   public void enableStaffMods(@NonNull Recipients var1, @NonNull List<StaffMod> var2, boolean var3) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("mods is marked non-null but is null");
      }

      Set var4 = var2.stream().map(this::toProtobuf).collect(Collectors.toSet());
      EnableStaffModsMessage var5 = EnableStaffModsMessage.newBuilder().addAllStaffMods(var4).setEnabledByDefault(var3).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var5);
   }

   @Override
   public void disableStaffMods(@NonNull Recipients var1, @NonNull List<StaffMod> var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("mods is marked non-null but is null");
      }

      Set var3 = var2.stream().map(this::toProtobuf).collect(Collectors.toSet());
      DisableStaffModsMessage var4 = DisableStaffModsMessage.newBuilder().addAllStaffMods(var3).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var4);
   }

   @Override
   public void enableAllStaffMods(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ApolloManager.getNetworkManager().sendPacket(var1, this.enableAllStaffModsMessage);
   }

   @Override
   public void enableAllStaffMods(@NonNull Recipients var1, boolean var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      EnableStaffModsMessage var3 = EnableStaffModsMessage.newBuilder().addAllStaffMods(this.staffMods).setEnabledByDefault(var2).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void disableAllStaffMods(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ApolloManager.getNetworkManager().sendPacket(var1, this.disableAllStaffModsMessage);
   }

   private com.lunarclient.apollo.staffmod.v1.StaffMod toProtobuf(StaffMod var1) {
      return com.lunarclient.apollo.staffmod.v1.StaffMod.forNumber(var1.ordinal() + 1);
   }
}
