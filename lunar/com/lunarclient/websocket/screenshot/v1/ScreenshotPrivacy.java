package com.lunarclient.websocket.screenshot.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum ScreenshotPrivacy implements ProtocolMessageEnum {
   SCREENSHOT_PRIVACY_UNSPECIFIED(0),
   SCREENSHOT_PRIVACY_PUBLIC(1),
   SCREENSHOT_PRIVACY_UNLISTED(2),
   SCREENSHOT_PRIVACY_PRIVATE(3),
   UNRECOGNIZED(-1);

   public static final int SCREENSHOT_PRIVACY_UNSPECIFIED_VALUE = 0;
   public static final int SCREENSHOT_PRIVACY_PUBLIC_VALUE = 1;
   public static final int SCREENSHOT_PRIVACY_UNLISTED_VALUE = 2;
   public static final int SCREENSHOT_PRIVACY_PRIVATE_VALUE = 3;
   private static final Internal.EnumLiteMap<ScreenshotPrivacy> internalValueMap = new Internal.EnumLiteMap<ScreenshotPrivacy>() {
      public ScreenshotPrivacy findValueByNumber(int var1) {
         return ScreenshotPrivacy.forNumber(var1);
      }
   };
   private static final ScreenshotPrivacy[] VALUES = values();
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
   public static ScreenshotPrivacy valueOf(int var0) {
      return forNumber(var0);
   }

   public static ScreenshotPrivacy forNumber(int var0) {
      switch (var0) {
         case 0:
            return SCREENSHOT_PRIVACY_UNSPECIFIED;
         case 1:
            return SCREENSHOT_PRIVACY_PUBLIC;
         case 2:
            return SCREENSHOT_PRIVACY_UNLISTED;
         case 3:
            return SCREENSHOT_PRIVACY_PRIVATE;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<ScreenshotPrivacy> internalGetValueMap() {
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
      return CommonProto.getDescriptor().getEnumTypes().get(3);
   }

   public static ScreenshotPrivacy valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   ScreenshotPrivacy(int var3) {
      this.value = var3;
   }
}
