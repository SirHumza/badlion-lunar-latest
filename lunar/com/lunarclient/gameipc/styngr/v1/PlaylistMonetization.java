package com.lunarclient.gameipc.styngr.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum PlaylistMonetization implements ProtocolMessageEnum {
   PLAYLIST_MONETIZATION_UNSPECIFIED(0),
   PLAYLIST_MONETIZATION_INTERNAL_AD_FUNDED(1),
   PLAYLIST_MONETIZATION_EXTERNAL_AD_FUNDED(2),
   PLAYLIST_MONETIZATION_PREMIUM(3),
   UNRECOGNIZED(-1);

   public static final int PLAYLIST_MONETIZATION_UNSPECIFIED_VALUE = 0;
   public static final int PLAYLIST_MONETIZATION_INTERNAL_AD_FUNDED_VALUE = 1;
   public static final int PLAYLIST_MONETIZATION_EXTERNAL_AD_FUNDED_VALUE = 2;
   public static final int PLAYLIST_MONETIZATION_PREMIUM_VALUE = 3;
   private static final Internal.EnumLiteMap<PlaylistMonetization> internalValueMap = new Internal.EnumLiteMap<PlaylistMonetization>() {
      public PlaylistMonetization findValueByNumber(int var1) {
         return PlaylistMonetization.forNumber(var1);
      }
   };
   private static final PlaylistMonetization[] VALUES = values();
   private final int value;

   @Override
   public final int getNumber() {
      if (this == UNRECOGNIZED) {
         throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
      } else {
         return this.value;
      }
   }

   @Deprecated
   public static PlaylistMonetization valueOf(int var0) {
      return forNumber(var0);
   }

   public static PlaylistMonetization forNumber(int var0) {
      switch (var0) {
         case 0:
            return PLAYLIST_MONETIZATION_UNSPECIFIED;
         case 1:
            return PLAYLIST_MONETIZATION_INTERNAL_AD_FUNDED;
         case 2:
            return PLAYLIST_MONETIZATION_EXTERNAL_AD_FUNDED;
         case 3:
            return PLAYLIST_MONETIZATION_PREMIUM;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<PlaylistMonetization> internalGetValueMap() {
      return internalValueMap;
   }

   @Override
   public final Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
         throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
      } else {
         return getDescriptor().getValues().get(this.ordinal());
      }
   }

   @Override
   public final Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
   }

   public static final Descriptors.EnumDescriptor getDescriptor() {
      return CommonProto.getDescriptor().getEnumTypes().get(1);
   }

   public static PlaylistMonetization valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   PlaylistMonetization(int var3) {
      this.value = var3;
   }
}
