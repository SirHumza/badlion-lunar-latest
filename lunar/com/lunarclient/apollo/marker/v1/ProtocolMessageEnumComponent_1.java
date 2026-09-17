package com.lunarclient.apollo.marker.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum MarkerDescriptionDisplay implements ProtocolMessageEnum {
   MARKER_DESCRIPTION_DISPLAY_UNSPECIFIED(0),
   MARKER_DESCRIPTION_DISPLAY_ICON(1),
   MARKER_DESCRIPTION_DISPLAY_TEXT(2),
   UNRECOGNIZED(-1);

   public static final int MARKER_DESCRIPTION_DISPLAY_UNSPECIFIED_VALUE = 0;
   public static final int MARKER_DESCRIPTION_DISPLAY_ICON_VALUE = 1;
   public static final int MARKER_DESCRIPTION_DISPLAY_TEXT_VALUE = 2;
   private static final Internal.EnumLiteMap<MarkerDescriptionDisplay> internalValueMap = new Internal.EnumLiteMap<MarkerDescriptionDisplay>() {
      public MarkerDescriptionDisplay findValueByNumber(int var1) {
         return MarkerDescriptionDisplay.forNumber(var1);
      }
   };
   private static final MarkerDescriptionDisplay[] VALUES = values();
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
   public static MarkerDescriptionDisplay valueOf(int var0) {
      return forNumber(var0);
   }

   public static MarkerDescriptionDisplay forNumber(int var0) {
      switch (var0) {
         case 0:
            return MARKER_DESCRIPTION_DISPLAY_UNSPECIFIED;
         case 1:
            return MARKER_DESCRIPTION_DISPLAY_ICON;
         case 2:
            return MARKER_DESCRIPTION_DISPLAY_TEXT;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<MarkerDescriptionDisplay> internalGetValueMap() {
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
      return SchemaProto.getDescriptor().getEnumTypes().get(2);
   }

   public static MarkerDescriptionDisplay valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   MarkerDescriptionDisplay(int var3) {
      this.value = var3;
   }
}
