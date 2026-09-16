package com.lunarclient.apollo.limb.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum BodyPart implements ProtocolMessageEnum {
   BODY_PART_UNSPECIFIED(0),
   BODY_PART_HEAD(1),
   BODY_PART_TORSO(2),
   BODY_PART_LEFT_ARM(3),
   BODY_PART_RIGHT_ARM(4),
   BODY_PART_LEFT_LEG(5),
   BODY_PART_RIGHT_LEG(6),
   UNRECOGNIZED(-1);

   public static final int BODY_PART_UNSPECIFIED_VALUE = 0;
   public static final int BODY_PART_HEAD_VALUE = 1;
   public static final int BODY_PART_TORSO_VALUE = 2;
   public static final int BODY_PART_LEFT_ARM_VALUE = 3;
   public static final int BODY_PART_RIGHT_ARM_VALUE = 4;
   public static final int BODY_PART_LEFT_LEG_VALUE = 5;
   public static final int BODY_PART_RIGHT_LEG_VALUE = 6;
   private static final Internal.EnumLiteMap<BodyPart> internalValueMap = new Internal.EnumLiteMap<BodyPart>() {
      public BodyPart findValueByNumber(int var1) {
         return BodyPart.forNumber(var1);
      }
   };
   private static final BodyPart[] VALUES = values();
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
   public static BodyPart valueOf(int var0) {
      return forNumber(var0);
   }

   public static BodyPart forNumber(int var0) {
      switch (var0) {
         case 0:
            return BODY_PART_UNSPECIFIED;
         case 1:
            return BODY_PART_HEAD;
         case 2:
            return BODY_PART_TORSO;
         case 3:
            return BODY_PART_LEFT_ARM;
         case 4:
            return BODY_PART_RIGHT_ARM;
         case 5:
            return BODY_PART_LEFT_LEG;
         case 6:
            return BODY_PART_RIGHT_LEG;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<BodyPart> internalGetValueMap() {
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

   public static BodyPart valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   BodyPart(int var3) {
      this.value = var3;
   }
}
