package com.lunarclient.gameipc.styngr.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum PlaylistLicense implements ProtocolMessageEnum {
   PLAYLIST_LICENSE_UNSPECIFIED(0),
   PLAYLIST_LICENSE_LICENSED(1),
   PLAYLIST_LICENSE_ROYALTY_FREE(2),
   UNRECOGNIZED(-1);

   public static final int PLAYLIST_LICENSE_UNSPECIFIED_VALUE = 0;
   public static final int PLAYLIST_LICENSE_LICENSED_VALUE = 1;
   public static final int PLAYLIST_LICENSE_ROYALTY_FREE_VALUE = 2;
   private static final Internal.EnumLiteMap<PlaylistLicense> internalValueMap = new Internal.EnumLiteMap<PlaylistLicense>() {
      public PlaylistLicense findValueByNumber(int var1) {
         return PlaylistLicense.forNumber(var1);
      }
   };
   private static final PlaylistLicense[] VALUES = values();
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
   public static PlaylistLicense valueOf(int var0) {
      return forNumber(var0);
   }

   public static PlaylistLicense forNumber(int var0) {
      switch (var0) {
         case 0:
            return PLAYLIST_LICENSE_UNSPECIFIED;
         case 1:
            return PLAYLIST_LICENSE_LICENSED;
         case 2:
            return PLAYLIST_LICENSE_ROYALTY_FREE;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<PlaylistLicense> internalGetValueMap() {
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
      return CommonProto.getDescriptor().getEnumTypes().get(0);
   }

   public static PlaylistLicense valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   PlaylistLicense(int var3) {
      this.value = var3;
   }
}
