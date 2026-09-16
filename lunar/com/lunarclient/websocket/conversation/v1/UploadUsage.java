package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum UploadUsage implements ProtocolMessageEnum {
   UPLOAD_USAGE_UNSPECIFIED(0),
   UPLOAD_USAGE_CONVERSATION_ICON(1),
   UPLOAD_USAGE_CHAT(2),
   UNRECOGNIZED(-1);

   public static final int UPLOAD_USAGE_UNSPECIFIED_VALUE = 0;
   public static final int UPLOAD_USAGE_CONVERSATION_ICON_VALUE = 1;
   public static final int UPLOAD_USAGE_CHAT_VALUE = 2;
   private static final Internal.EnumLiteMap<UploadUsage> internalValueMap = new Internal.EnumLiteMap<UploadUsage>() {
      public UploadUsage findValueByNumber(int var1) {
         return UploadUsage.forNumber(var1);
      }
   };
   private static final UploadUsage[] VALUES = values();
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
   public static UploadUsage valueOf(int var0) {
      return forNumber(var0);
   }

   public static UploadUsage forNumber(int var0) {
      switch (var0) {
         case 0:
            return UPLOAD_USAGE_UNSPECIFIED;
         case 1:
            return UPLOAD_USAGE_CONVERSATION_ICON;
         case 2:
            return UPLOAD_USAGE_CHAT;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<UploadUsage> internalGetValueMap() {
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
      return CommonProto.getDescriptor().getEnumTypes().get(7);
   }

   public static UploadUsage valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   UploadUsage(int var3) {
      this.value = var3;
   }
}
