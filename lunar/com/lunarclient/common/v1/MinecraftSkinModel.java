package com.lunarclient.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum MinecraftSkinModel implements ProtocolMessageEnum {
   MINECRAFT_SKIN_MODEL_UNSPECIFIED(0),
   MINECRAFT_SKIN_MODEL_CLASSIC(1),
   MINECRAFT_SKIN_MODEL_SLIM(2),
   UNRECOGNIZED(-1);

   public static final int MINECRAFT_SKIN_MODEL_UNSPECIFIED_VALUE = 0;
   public static final int MINECRAFT_SKIN_MODEL_CLASSIC_VALUE = 1;
   public static final int MINECRAFT_SKIN_MODEL_SLIM_VALUE = 2;
   private static final Internal.EnumLiteMap<MinecraftSkinModel> internalValueMap = new Internal.EnumLiteMap<MinecraftSkinModel>() {
      public MinecraftSkinModel findValueByNumber(int var1) {
         return MinecraftSkinModel.forNumber(var1);
      }
   };
   private static final MinecraftSkinModel[] VALUES = values();
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
   public static MinecraftSkinModel valueOf(int var0) {
      return forNumber(var0);
   }

   public static MinecraftSkinModel forNumber(int var0) {
      switch (var0) {
         case 0:
            return MINECRAFT_SKIN_MODEL_UNSPECIFIED;
         case 1:
            return MINECRAFT_SKIN_MODEL_CLASSIC;
         case 2:
            return MINECRAFT_SKIN_MODEL_SLIM;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<MinecraftSkinModel> internalGetValueMap() {
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
      return SkinProto.getDescriptor().getEnumTypes().get(0);
   }

   public static MinecraftSkinModel valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   MinecraftSkinModel(int var3) {
      this.value = var3;
   }
}
