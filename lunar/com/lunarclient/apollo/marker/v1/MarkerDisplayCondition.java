package com.lunarclient.apollo.marker.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum MarkerDisplayCondition implements ProtocolMessageEnum {
   MARKER_DISPLAY_CONDITION_UNSPECIFIED(0),
   MARKER_DISPLAY_CONDITION_NEVER(1),
   MARKER_DISPLAY_CONDITION_HOVER(2),
   MARKER_DISPLAY_CONDITION_ALWAYS(3),
   UNRECOGNIZED(-1);

   public static final int MARKER_DISPLAY_CONDITION_UNSPECIFIED_VALUE = 0;
   public static final int MARKER_DISPLAY_CONDITION_NEVER_VALUE = 1;
   public static final int MARKER_DISPLAY_CONDITION_HOVER_VALUE = 2;
   public static final int MARKER_DISPLAY_CONDITION_ALWAYS_VALUE = 3;
   private static final Internal.EnumLiteMap<MarkerDisplayCondition> internalValueMap = new Internal.EnumLiteMap<MarkerDisplayCondition>() {
      public MarkerDisplayCondition findValueByNumber(int var1) {
         return MarkerDisplayCondition.forNumber(var1);
      }
   };
   private static final MarkerDisplayCondition[] VALUES = values();
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
   public static MarkerDisplayCondition valueOf(int var0) {
      return forNumber(var0);
   }

   public static MarkerDisplayCondition forNumber(int var0) {
      switch (var0) {
         case 0:
            return MARKER_DISPLAY_CONDITION_UNSPECIFIED;
         case 1:
            return MARKER_DISPLAY_CONDITION_NEVER;
         case 2:
            return MARKER_DISPLAY_CONDITION_HOVER;
         case 3:
            return MARKER_DISPLAY_CONDITION_ALWAYS;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<MarkerDisplayCondition> internalGetValueMap() {
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
      return SchemaProto.getDescriptor().getEnumTypes().get(0);
   }

   public static MarkerDisplayCondition valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   MarkerDisplayCondition(int var3) {
      this.value = var3;
   }
}
