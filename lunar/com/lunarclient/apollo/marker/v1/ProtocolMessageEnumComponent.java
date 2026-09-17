package com.lunarclient.apollo.marker.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum MarkerOwnerDisplay implements ProtocolMessageEnum {
   MARKER_OWNER_DISPLAY_UNSPECIFIED(0),
   MARKER_OWNER_DISPLAY_HEAD(1),
   MARKER_OWNER_DISPLAY_NAME(2),
   UNRECOGNIZED(-1);

   public static final int MARKER_OWNER_DISPLAY_UNSPECIFIED_VALUE = 0;
   public static final int MARKER_OWNER_DISPLAY_HEAD_VALUE = 1;
   public static final int MARKER_OWNER_DISPLAY_NAME_VALUE = 2;
   private static final Internal.EnumLiteMap<MarkerOwnerDisplay> internalValueMap = new Internal.EnumLiteMap<MarkerOwnerDisplay>() {
      public MarkerOwnerDisplay findValueByNumber(int var1) {
         return MarkerOwnerDisplay.forNumber(var1);
      }
   };
   private static final MarkerOwnerDisplay[] VALUES = values();
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
   public static MarkerOwnerDisplay valueOf(int var0) {
      return forNumber(var0);
   }

   public static MarkerOwnerDisplay forNumber(int var0) {
      switch (var0) {
         case 0:
            return MARKER_OWNER_DISPLAY_UNSPECIFIED;
         case 1:
            return MARKER_OWNER_DISPLAY_HEAD;
         case 2:
            return MARKER_OWNER_DISPLAY_NAME;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<MarkerOwnerDisplay> internalGetValueMap() {
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
      return SchemaProto.getDescriptor().getEnumTypes().get(1);
   }

   public static MarkerOwnerDisplay valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   MarkerOwnerDisplay(int var3) {
      this.value = var3;
   }
}
