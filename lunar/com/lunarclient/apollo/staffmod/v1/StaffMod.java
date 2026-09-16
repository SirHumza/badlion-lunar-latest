package com.lunarclient.apollo.staffmod.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum StaffMod implements ProtocolMessageEnum {
   STAFF_MOD_UNSPECIFIED(0),
   STAFF_MOD_XRAY(1),
   UNRECOGNIZED(-1);

   public static final int STAFF_MOD_UNSPECIFIED_VALUE = 0;
   public static final int STAFF_MOD_XRAY_VALUE = 1;
   private static final Internal.EnumLiteMap<StaffMod> internalValueMap = new Internal.EnumLiteMap<StaffMod>() {
      public StaffMod findValueByNumber(int var1) {
         return StaffMod.forNumber(var1);
      }
   };
   private static final StaffMod[] VALUES = values();
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
   public static StaffMod valueOf(int var0) {
      return forNumber(var0);
   }

   public static StaffMod forNumber(int var0) {
      switch (var0) {
         case 0:
            return STAFF_MOD_UNSPECIFIED;
         case 1:
            return STAFF_MOD_XRAY;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<StaffMod> internalGetValueMap() {
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

   public static StaffMod valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   StaffMod(int var3) {
      this.value = var3;
   }
}
