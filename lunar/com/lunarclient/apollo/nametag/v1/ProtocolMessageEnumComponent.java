package com.lunarclient.apollo.nametag.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum NametagVisibilityOverride implements ProtocolMessageEnum {
   NAMETAG_VISIBILITY_OVERRIDE_UNSPECIFIED(0),
   NAMETAG_VISIBILITY_OVERRIDE_NONE(1),
   NAMETAG_VISIBILITY_OVERRIDE_SHOWN(2),
   NAMETAG_VISIBILITY_OVERRIDE_HIDDEN(3),
   UNRECOGNIZED(-1);

   public static final int NAMETAG_VISIBILITY_OVERRIDE_UNSPECIFIED_VALUE = 0;
   public static final int NAMETAG_VISIBILITY_OVERRIDE_NONE_VALUE = 1;
   public static final int NAMETAG_VISIBILITY_OVERRIDE_SHOWN_VALUE = 2;
   public static final int NAMETAG_VISIBILITY_OVERRIDE_HIDDEN_VALUE = 3;
   private static final Internal.EnumLiteMap<NametagVisibilityOverride> internalValueMap = new Internal.EnumLiteMap<NametagVisibilityOverride>() {
      public NametagVisibilityOverride findValueByNumber(int var1) {
         return NametagVisibilityOverride.forNumber(var1);
      }
   };
   private static final NametagVisibilityOverride[] VALUES = values();
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
   public static NametagVisibilityOverride valueOf(int var0) {
      return forNumber(var0);
   }

   public static NametagVisibilityOverride forNumber(int var0) {
      switch (var0) {
         case 0:
            return NAMETAG_VISIBILITY_OVERRIDE_UNSPECIFIED;
         case 1:
            return NAMETAG_VISIBILITY_OVERRIDE_NONE;
         case 2:
            return NAMETAG_VISIBILITY_OVERRIDE_SHOWN;
         case 3:
            return NAMETAG_VISIBILITY_OVERRIDE_HIDDEN;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<NametagVisibilityOverride> internalGetValueMap() {
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

   public static NametagVisibilityOverride valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   NametagVisibilityOverride(int var3) {
      this.value = var3;
   }
}
