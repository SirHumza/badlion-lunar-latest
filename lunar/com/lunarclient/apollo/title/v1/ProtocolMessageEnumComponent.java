package com.lunarclient.apollo.title.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum TitleType implements ProtocolMessageEnum {
   TITLE_TYPE_UNSPECIFIED(0),
   TITLE_TYPE_TITLE(1),
   TITLE_TYPE_SUBTITLE(2),
   UNRECOGNIZED(-1);

   public static final int TITLE_TYPE_UNSPECIFIED_VALUE = 0;
   public static final int TITLE_TYPE_TITLE_VALUE = 1;
   public static final int TITLE_TYPE_SUBTITLE_VALUE = 2;
   private static final Internal.EnumLiteMap<TitleType> internalValueMap = new Internal.EnumLiteMap<TitleType>() {
      public TitleType findValueByNumber(int var1) {
         return TitleType.forNumber(var1);
      }
   };
   private static final TitleType[] VALUES = values();
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
   public static TitleType valueOf(int var0) {
      return forNumber(var0);
   }

   public static TitleType forNumber(int var0) {
      switch (var0) {
         case 0:
            return TITLE_TYPE_UNSPECIFIED;
         case 1:
            return TITLE_TYPE_TITLE;
         case 2:
            return TITLE_TYPE_SUBTITLE;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<TitleType> internalGetValueMap() {
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

   public static TitleType valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   TitleType(int var3) {
      this.value = var3;
   }
}
