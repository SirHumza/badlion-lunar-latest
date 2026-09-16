package com.lunarclient.websocket.heartbeat.v1;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class RendererPosition extends GeneratedMessageV3 implements RendererPositionOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int POSITION_X_FIELD_NUMBER = 1;
   private int positionX_ = 0;
   public static final int POSITION_Y_FIELD_NUMBER = 2;
   private int positionY_ = 0;
   public static final int WIDTH_FIELD_NUMBER = 3;
   private int width_ = 0;
   public static final int HEIGHT_FIELD_NUMBER = 4;
   private int height_ = 0;
   public static final int DISPLAY_ID_FIELD_NUMBER = 5;
   private int displayId_ = 0;
   public static final int PRIMARY_DISPLAY_FIELD_NUMBER = 6;
   private boolean primaryDisplay_ = false;
   public static final int DISPLAY_WIDTH_FIELD_NUMBER = 7;
   private int displayWidth_ = 0;
   public static final int DISPLAY_HEIGHT_FIELD_NUMBER = 8;
   private int displayHeight_ = 0;
   public static final int DISPLAY_TYPE_FIELD_NUMBER = 9;
   private int displayType_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final RendererPosition DEFAULT_INSTANCE = new RendererPosition();
   private static final Parser<RendererPosition> PARSER = new AbstractParser<RendererPosition>() {
      public RendererPosition parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RendererPosition.Builder var3 = RendererPosition.newBuilder();

         try {
            var3.mergeFrom(var1, var2);
         } catch (InvalidProtocolBufferException var5) {
            throw var5.setUnfinishedMessage(var3.buildPartial());
         } catch (UninitializedMessageException var6) {
            throw var6.asInvalidProtocolBufferException().setUnfinishedMessage(var3.buildPartial());
         } catch (IOException var7) {
            throw new InvalidProtocolBufferException(var7).setUnfinishedMessage(var3.buildPartial());
         }

         return var3.buildPartial();
      }
   };

   private RendererPosition(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RendererPosition() {
      this.displayType_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RendererPosition();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_RendererPosition_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_RendererPosition_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RendererPosition.class, RendererPosition.Builder.class);
   }

   @Override
   public int getPositionX() {
      return this.positionX_;
   }

   @Override
   public int getPositionY() {
      return this.positionY_;
   }

   @Override
   public int getWidth() {
      return this.width_;
   }

   @Override
   public int getHeight() {
      return this.height_;
   }

   @Override
   public int getDisplayId() {
      return this.displayId_;
   }

   @Override
   public boolean getPrimaryDisplay() {
      return this.primaryDisplay_;
   }

   @Override
   public int getDisplayWidth() {
      return this.displayWidth_;
   }

   @Override
   public int getDisplayHeight() {
      return this.displayHeight_;
   }

   @Override
   public int getDisplayTypeValue() {
      return this.displayType_;
   }

   @Override
   public RendererPosition.DisplayType getDisplayType() {
      RendererPosition.DisplayType var1 = RendererPosition.DisplayType.forNumber(this.displayType_);
      return var1 == null ? RendererPosition.DisplayType.UNRECOGNIZED : var1;
   }

   @Override
   public final boolean isInitialized() {
      byte var1 = this.memoizedIsInitialized;
      if (var1 == 1) {
         return true;
      }

      if (var1 == 0) {
         return false;
      }

      this.memoizedIsInitialized = 1;
      return true;
   }

   @Override
   public void writeTo(CodedOutputStream var1) {
      if (this.positionX_ != 0) {
         var1.writeInt32(1, this.positionX_);
      }

      if (this.positionY_ != 0) {
         var1.writeInt32(2, this.positionY_);
      }

      if (this.width_ != 0) {
         var1.writeInt32(3, this.width_);
      }

      if (this.height_ != 0) {
         var1.writeInt32(4, this.height_);
      }

      if (this.displayId_ != 0) {
         var1.writeInt32(5, this.displayId_);
      }

      if (this.primaryDisplay_) {
         var1.writeBool(6, this.primaryDisplay_);
      }

      if (this.displayWidth_ != 0) {
         var1.writeInt32(7, this.displayWidth_);
      }

      if (this.displayHeight_ != 0) {
         var1.writeInt32(8, this.displayHeight_);
      }

      if (this.displayType_ != RendererPosition.DisplayType.DISPLAY_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(9, this.displayType_);
      }

      this.getUnknownFields().writeTo(var1);
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      var1 = 0;
      if (this.positionX_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.positionX_);
      }

      if (this.positionY_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.positionY_);
      }

      if (this.width_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(3, this.width_);
      }

      if (this.height_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(4, this.height_);
      }

      if (this.displayId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(5, this.displayId_);
      }

      if (this.primaryDisplay_) {
         var1 += CodedOutputStream.computeBoolSize(6, this.primaryDisplay_);
      }

      if (this.displayWidth_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(7, this.displayWidth_);
      }

      if (this.displayHeight_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(8, this.displayHeight_);
      }

      if (this.displayType_ != RendererPosition.DisplayType.DISPLAY_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(9, this.displayType_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RendererPosition)) {
         return super.equals(var1);
      } else {
         RendererPosition var2 = (RendererPosition)var1;
         if (this.getPositionX() != var2.getPositionX()) {
            return false;
         } else if (this.getPositionY() != var2.getPositionY()) {
            return false;
         } else if (this.getWidth() != var2.getWidth()) {
            return false;
         } else if (this.getHeight() != var2.getHeight()) {
            return false;
         } else if (this.getDisplayId() != var2.getDisplayId()) {
            return false;
         } else if (this.getPrimaryDisplay() != var2.getPrimaryDisplay()) {
            return false;
         } else if (this.getDisplayWidth() != var2.getDisplayWidth()) {
            return false;
         } else if (this.getDisplayHeight() != var2.getDisplayHeight()) {
            return false;
         } else {
            return this.displayType_ != var2.displayType_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
         }
      }
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getPositionX();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getPositionY();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getWidth();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getHeight();
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getDisplayId();
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + Internal.hashBoolean(this.getPrimaryDisplay());
      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + this.getDisplayWidth();
      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + this.getDisplayHeight();
      var1 = 37 * var1 + 9;
      var1 = 53 * var1 + this.displayType_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RendererPosition parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RendererPosition parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RendererPosition parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RendererPosition parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RendererPosition parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RendererPosition parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RendererPosition parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RendererPosition parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RendererPosition parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RendererPosition parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RendererPosition parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RendererPosition parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RendererPosition.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RendererPosition.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RendererPosition.Builder newBuilder(RendererPosition var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RendererPosition.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RendererPosition.Builder() : new RendererPosition.Builder().mergeFrom(this);
   }

   protected RendererPosition.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RendererPosition.Builder(var1);
   }

   public static RendererPosition getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RendererPosition> parser() {
      return PARSER;
   }

   @Override
   public Parser<RendererPosition> getParserForType() {
      return PARSER;
   }

   public RendererPosition getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RendererPosition.Builder> implements RendererPositionOrBuilder {
      private int bitField0_;
      private int positionX_;
      private int positionY_;
      private int width_;
      private int height_;
      private int displayId_;
      private boolean primaryDisplay_;
      private int displayWidth_;
      private int displayHeight_;
      private int displayType_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_RendererPosition_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_RendererPosition_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RendererPosition.class, RendererPosition.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RendererPosition.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.positionX_ = 0;
         this.positionY_ = 0;
         this.width_ = 0;
         this.height_ = 0;
         this.displayId_ = 0;
         this.primaryDisplay_ = false;
         this.displayWidth_ = 0;
         this.displayHeight_ = 0;
         this.displayType_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_RendererPosition_descriptor;
      }

      public RendererPosition getDefaultInstanceForType() {
         return RendererPosition.getDefaultInstance();
      }

      public RendererPosition build() {
         RendererPosition var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RendererPosition buildPartial() {
         RendererPosition var1 = new RendererPosition(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RendererPosition var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.positionX_ = this.positionX_;
         }

         if ((var2 & 2) != 0) {
            var1.positionY_ = this.positionY_;
         }

         if ((var2 & 4) != 0) {
            var1.width_ = this.width_;
         }

         if ((var2 & 8) != 0) {
            var1.height_ = this.height_;
         }

         if ((var2 & 16) != 0) {
            var1.displayId_ = this.displayId_;
         }

         if ((var2 & 32) != 0) {
            var1.primaryDisplay_ = this.primaryDisplay_;
         }

         if ((var2 & 64) != 0) {
            var1.displayWidth_ = this.displayWidth_;
         }

         if ((var2 & 128) != 0) {
            var1.displayHeight_ = this.displayHeight_;
         }

         if ((var2 & 256) != 0) {
            var1.displayType_ = this.displayType_;
         }
      }

      public RendererPosition.Builder clone() {
         return (RendererPosition.Builder)super.clone();
      }

      public RendererPosition.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RendererPosition.Builder)super.setField(var1, var2);
      }

      public RendererPosition.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RendererPosition.Builder)super.clearField(var1);
      }

      public RendererPosition.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RendererPosition.Builder)super.clearOneof(var1);
      }

      public RendererPosition.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RendererPosition.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RendererPosition.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RendererPosition.Builder)super.addRepeatedField(var1, var2);
      }

      public RendererPosition.Builder mergeFrom(Message var1) {
         if (var1 instanceof RendererPosition) {
            return this.mergeFrom((RendererPosition)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RendererPosition.Builder mergeFrom(RendererPosition var1) {
         if (var1 == RendererPosition.getDefaultInstance()) {
            return this;
         }

         if (var1.getPositionX() != 0) {
            this.setPositionX(var1.getPositionX());
         }

         if (var1.getPositionY() != 0) {
            this.setPositionY(var1.getPositionY());
         }

         if (var1.getWidth() != 0) {
            this.setWidth(var1.getWidth());
         }

         if (var1.getHeight() != 0) {
            this.setHeight(var1.getHeight());
         }

         if (var1.getDisplayId() != 0) {
            this.setDisplayId(var1.getDisplayId());
         }

         if (var1.getPrimaryDisplay()) {
            this.setPrimaryDisplay(var1.getPrimaryDisplay());
         }

         if (var1.getDisplayWidth() != 0) {
            this.setDisplayWidth(var1.getDisplayWidth());
         }

         if (var1.getDisplayHeight() != 0) {
            this.setDisplayHeight(var1.getDisplayHeight());
         }

         if (var1.displayType_ != 0) {
            this.setDisplayTypeValue(var1.getDisplayTypeValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RendererPosition.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         try {
            boolean var3 = false;

            while (!var3) {
               int var4 = var1.readTag();
               switch (var4) {
                  case 0:
                     var3 = true;
                     break;
                  case 8:
                     this.positionX_ = var1.readInt32();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.positionY_ = var1.readInt32();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.width_ = var1.readInt32();
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.height_ = var1.readInt32();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.displayId_ = var1.readInt32();
                     this.bitField0_ |= 16;
                     break;
                  case 48:
                     this.primaryDisplay_ = var1.readBool();
                     this.bitField0_ |= 32;
                     break;
                  case 56:
                     this.displayWidth_ = var1.readInt32();
                     this.bitField0_ |= 64;
                     break;
                  case 64:
                     this.displayHeight_ = var1.readInt32();
                     this.bitField0_ |= 128;
                     break;
                  case 72:
                     this.displayType_ = var1.readEnum();
                     this.bitField0_ |= 256;
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var8) {
            throw var8.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      @Override
      public int getPositionX() {
         return this.positionX_;
      }

      public RendererPosition.Builder setPositionX(int var1) {
         this.positionX_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RendererPosition.Builder clearPositionX() {
         this.bitField0_ &= -2;
         this.positionX_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getPositionY() {
         return this.positionY_;
      }

      public RendererPosition.Builder setPositionY(int var1) {
         this.positionY_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public RendererPosition.Builder clearPositionY() {
         this.bitField0_ &= -3;
         this.positionY_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getWidth() {
         return this.width_;
      }

      public RendererPosition.Builder setWidth(int var1) {
         this.width_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public RendererPosition.Builder clearWidth() {
         this.bitField0_ &= -5;
         this.width_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getHeight() {
         return this.height_;
      }

      public RendererPosition.Builder setHeight(int var1) {
         this.height_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public RendererPosition.Builder clearHeight() {
         this.bitField0_ &= -9;
         this.height_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getDisplayId() {
         return this.displayId_;
      }

      public RendererPosition.Builder setDisplayId(int var1) {
         this.displayId_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public RendererPosition.Builder clearDisplayId() {
         this.bitField0_ &= -17;
         this.displayId_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getPrimaryDisplay() {
         return this.primaryDisplay_;
      }

      public RendererPosition.Builder setPrimaryDisplay(boolean var1) {
         this.primaryDisplay_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public RendererPosition.Builder clearPrimaryDisplay() {
         this.bitField0_ &= -33;
         this.primaryDisplay_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public int getDisplayWidth() {
         return this.displayWidth_;
      }

      public RendererPosition.Builder setDisplayWidth(int var1) {
         this.displayWidth_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public RendererPosition.Builder clearDisplayWidth() {
         this.bitField0_ &= -65;
         this.displayWidth_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getDisplayHeight() {
         return this.displayHeight_;
      }

      public RendererPosition.Builder setDisplayHeight(int var1) {
         this.displayHeight_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public RendererPosition.Builder clearDisplayHeight() {
         this.bitField0_ &= -129;
         this.displayHeight_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getDisplayTypeValue() {
         return this.displayType_;
      }

      public RendererPosition.Builder setDisplayTypeValue(int var1) {
         this.displayType_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      @Override
      public RendererPosition.DisplayType getDisplayType() {
         RendererPosition.DisplayType var1 = RendererPosition.DisplayType.forNumber(this.displayType_);
         return var1 == null ? RendererPosition.DisplayType.UNRECOGNIZED : var1;
      }

      public RendererPosition.Builder setDisplayType(RendererPosition.DisplayType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 256;
         this.displayType_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public RendererPosition.Builder clearDisplayType() {
         this.bitField0_ &= -257;
         this.displayType_ = 0;
         this.onChanged();
         return this;
      }

      public final RendererPosition.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RendererPosition.Builder)super.setUnknownFields(var1);
      }

      public final RendererPosition.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RendererPosition.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum DisplayType implements ProtocolMessageEnum {
      DISPLAY_TYPE_UNSPECIFIED(0),
      DISPLAY_TYPE_NATIVE(1),
      DISPLAY_TYPE_OSR(2),
      UNRECOGNIZED(-1);

      public static final int DISPLAY_TYPE_UNSPECIFIED_VALUE = 0;
      public static final int DISPLAY_TYPE_NATIVE_VALUE = 1;
      public static final int DISPLAY_TYPE_OSR_VALUE = 2;
      private static final Internal.EnumLiteMap<RendererPosition.DisplayType> internalValueMap = new Internal.EnumLiteMap<RendererPosition.DisplayType>() {
         public RendererPosition.DisplayType findValueByNumber(int var1) {
            return RendererPosition.DisplayType.forNumber(var1);
         }
      };
      private static final RendererPosition.DisplayType[] VALUES = values();
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
      public static RendererPosition.DisplayType valueOf(int var0) {
         return forNumber(var0);
      }

      public static RendererPosition.DisplayType forNumber(int var0) {
         switch (var0) {
            case 0:
               return DISPLAY_TYPE_UNSPECIFIED;
            case 1:
               return DISPLAY_TYPE_NATIVE;
            case 2:
               return DISPLAY_TYPE_OSR;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<RendererPosition.DisplayType> internalGetValueMap() {
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
         return RendererPosition.getDescriptor().getEnumTypes().get(0);
      }

      public static RendererPosition.DisplayType valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      DisplayType(int var3) {
         this.value = var3;
      }
   }
}
