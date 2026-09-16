package com.lunarclient.apollo.title.v1;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.apollo.common.v1.Component;
import com.lunarclient.apollo.common.v1.ComponentOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DisplayTitleMessage extends GeneratedMessageV3 implements DisplayTitleMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int TITLE_TYPE_FIELD_NUMBER = 1;
   private int titleType_ = 0;
   public static final int MESSAGE_FIELD_NUMBER = 2;
   private Component message_;
   public static final int SCALE_FIELD_NUMBER = 3;
   private float scale_ = 0.0F;
   public static final int FADE_IN_TIME_FIELD_NUMBER = 4;
   private Duration fadeInTime_;
   public static final int DISPLAY_TIME_FIELD_NUMBER = 5;
   private Duration displayTime_;
   public static final int FADE_OUT_TIME_FIELD_NUMBER = 6;
   private Duration fadeOutTime_;
   public static final int ADVENTURE_JSON_MESSAGE_FIELD_NUMBER = 7;
   private volatile Object adventureJsonMessage_ = "";
   public static final int INTERPOLATION_SCALE_FIELD_NUMBER = 8;
   private float interpolationScale_ = 0.0F;
   public static final int INTERPOLATION_RATE_FIELD_NUMBER = 9;
   private float interpolationRate_ = 0.0F;
   private byte memoizedIsInitialized = -1;
   private static final DisplayTitleMessage DEFAULT_INSTANCE = new DisplayTitleMessage();
   private static final Parser<DisplayTitleMessage> PARSER = new AbstractParser<DisplayTitleMessage>() {
      public DisplayTitleMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DisplayTitleMessage.Builder var3 = DisplayTitleMessage.newBuilder();

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

   private DisplayTitleMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DisplayTitleMessage() {
      this.titleType_ = 0;
      this.adventureJsonMessage_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DisplayTitleMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_title_v1_DisplayTitleMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_title_v1_DisplayTitleMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DisplayTitleMessage.class, DisplayTitleMessage.Builder.class);
   }

   @Override
   public int getTitleTypeValue() {
      return this.titleType_;
   }

   @Override
   public TitleType getTitleType() {
      TitleType var1 = TitleType.forNumber(this.titleType_);
      return var1 == null ? TitleType.UNRECOGNIZED : var1;
   }

   @Deprecated
   @Override
   public boolean hasMessage() {
      return (this.bitField0_ & 1) != 0;
   }

   @Deprecated
   @Override
   public Component getMessage() {
      return this.message_ == null ? Component.getDefaultInstance() : this.message_;
   }

   @Deprecated
   @Override
   public ComponentOrBuilder getMessageOrBuilder() {
      return this.message_ == null ? Component.getDefaultInstance() : this.message_;
   }

   @Override
   public float getScale() {
      return this.scale_;
   }

   @Override
   public boolean hasFadeInTime() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Duration getFadeInTime() {
      return this.fadeInTime_ == null ? Duration.getDefaultInstance() : this.fadeInTime_;
   }

   @Override
   public DurationOrBuilder getFadeInTimeOrBuilder() {
      return this.fadeInTime_ == null ? Duration.getDefaultInstance() : this.fadeInTime_;
   }

   @Override
   public boolean hasDisplayTime() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public Duration getDisplayTime() {
      return this.displayTime_ == null ? Duration.getDefaultInstance() : this.displayTime_;
   }

   @Override
   public DurationOrBuilder getDisplayTimeOrBuilder() {
      return this.displayTime_ == null ? Duration.getDefaultInstance() : this.displayTime_;
   }

   @Override
   public boolean hasFadeOutTime() {
      return (this.bitField0_ & 8) != 0;
   }

   @Override
   public Duration getFadeOutTime() {
      return this.fadeOutTime_ == null ? Duration.getDefaultInstance() : this.fadeOutTime_;
   }

   @Override
   public DurationOrBuilder getFadeOutTimeOrBuilder() {
      return this.fadeOutTime_ == null ? Duration.getDefaultInstance() : this.fadeOutTime_;
   }

   @Override
   public String getAdventureJsonMessage() {
      Object var1 = this.adventureJsonMessage_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.adventureJsonMessage_ = var3;
      return var3;
   }

   @Override
   public ByteString getAdventureJsonMessageBytes() {
      Object var1 = this.adventureJsonMessage_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.adventureJsonMessage_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public float getInterpolationScale() {
      return this.interpolationScale_;
   }

   @Override
   public float getInterpolationRate() {
      return this.interpolationRate_;
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
      if (this.titleType_ != TitleType.TITLE_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.titleType_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getMessage());
      }

      if (Float.floatToRawIntBits(this.scale_) != 0) {
         var1.writeFloat(3, this.scale_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(4, this.getFadeInTime());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(5, this.getDisplayTime());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeMessage(6, this.getFadeOutTime());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.adventureJsonMessage_)) {
         GeneratedMessageV3.writeString(var1, 7, this.adventureJsonMessage_);
      }

      if (Float.floatToRawIntBits(this.interpolationScale_) != 0) {
         var1.writeFloat(8, this.interpolationScale_);
      }

      if (Float.floatToRawIntBits(this.interpolationRate_) != 0) {
         var1.writeFloat(9, this.interpolationRate_);
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
      if (this.titleType_ != TitleType.TITLE_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.titleType_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getMessage());
      }

      if (Float.floatToRawIntBits(this.scale_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(3, this.scale_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getFadeInTime());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(5, this.getDisplayTime());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1 += CodedOutputStream.computeMessageSize(6, this.getFadeOutTime());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.adventureJsonMessage_)) {
         var1 += GeneratedMessageV3.computeStringSize(7, this.adventureJsonMessage_);
      }

      if (Float.floatToRawIntBits(this.interpolationScale_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(8, this.interpolationScale_);
      }

      if (Float.floatToRawIntBits(this.interpolationRate_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(9, this.interpolationRate_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof DisplayTitleMessage)) {
         return super.equals(var1);
      } else {
         DisplayTitleMessage var2 = (DisplayTitleMessage)var1;
         if (this.titleType_ != var2.titleType_) {
            return false;
         } else if (this.hasMessage() != var2.hasMessage()) {
            return false;
         } else if (this.hasMessage() && !this.getMessage().equals(var2.getMessage())) {
            return false;
         } else if (Float.floatToIntBits(this.getScale()) != Float.floatToIntBits(var2.getScale())) {
            return false;
         } else if (this.hasFadeInTime() != var2.hasFadeInTime()) {
            return false;
         } else if (this.hasFadeInTime() && !this.getFadeInTime().equals(var2.getFadeInTime())) {
            return false;
         } else if (this.hasDisplayTime() != var2.hasDisplayTime()) {
            return false;
         } else if (this.hasDisplayTime() && !this.getDisplayTime().equals(var2.getDisplayTime())) {
            return false;
         } else if (this.hasFadeOutTime() != var2.hasFadeOutTime()) {
            return false;
         } else if (this.hasFadeOutTime() && !this.getFadeOutTime().equals(var2.getFadeOutTime())) {
            return false;
         } else if (!this.getAdventureJsonMessage().equals(var2.getAdventureJsonMessage())) {
            return false;
         } else if (Float.floatToIntBits(this.getInterpolationScale()) != Float.floatToIntBits(var2.getInterpolationScale())) {
            return false;
         } else {
            return Float.floatToIntBits(this.getInterpolationRate()) != Float.floatToIntBits(var2.getInterpolationRate())
               ? false
               : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.titleType_;
      if (this.hasMessage()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getMessage().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Float.floatToIntBits(this.getScale());
      if (this.hasFadeInTime()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getFadeInTime().hashCode();
      }

      if (this.hasDisplayTime()) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getDisplayTime().hashCode();
      }

      if (this.hasFadeOutTime()) {
         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + this.getFadeOutTime().hashCode();
      }

      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + this.getAdventureJsonMessage().hashCode();
      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + Float.floatToIntBits(this.getInterpolationScale());
      var1 = 37 * var1 + 9;
      var1 = 53 * var1 + Float.floatToIntBits(this.getInterpolationRate());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DisplayTitleMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayTitleMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayTitleMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayTitleMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayTitleMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayTitleMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayTitleMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayTitleMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DisplayTitleMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DisplayTitleMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DisplayTitleMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayTitleMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DisplayTitleMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DisplayTitleMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DisplayTitleMessage.Builder newBuilder(DisplayTitleMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DisplayTitleMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DisplayTitleMessage.Builder() : new DisplayTitleMessage.Builder().mergeFrom(this);
   }

   protected DisplayTitleMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DisplayTitleMessage.Builder(var1);
   }

   public static DisplayTitleMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DisplayTitleMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<DisplayTitleMessage> getParserForType() {
      return PARSER;
   }

   public DisplayTitleMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<DisplayTitleMessage.Builder> implements DisplayTitleMessageOrBuilder {
      private int bitField0_;
      private int titleType_ = 0;
      private Component message_;
      private SingleFieldBuilderV3<Component, Component.Builder, ComponentOrBuilder> messageBuilder_;
      private float scale_;
      private Duration fadeInTime_;
      private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> fadeInTimeBuilder_;
      private Duration displayTime_;
      private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> displayTimeBuilder_;
      private Duration fadeOutTime_;
      private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> fadeOutTimeBuilder_;
      private Object adventureJsonMessage_ = "";
      private float interpolationScale_;
      private float interpolationRate_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_title_v1_DisplayTitleMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_title_v1_DisplayTitleMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DisplayTitleMessage.class, DisplayTitleMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (DisplayTitleMessage.alwaysUseFieldBuilders) {
            this.getMessageFieldBuilder();
            this.getFadeInTimeFieldBuilder();
            this.getDisplayTimeFieldBuilder();
            this.getFadeOutTimeFieldBuilder();
         }
      }

      public DisplayTitleMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.titleType_ = 0;
         this.message_ = null;
         if (this.messageBuilder_ != null) {
            this.messageBuilder_.dispose();
            this.messageBuilder_ = null;
         }

         this.scale_ = 0.0F;
         this.fadeInTime_ = null;
         if (this.fadeInTimeBuilder_ != null) {
            this.fadeInTimeBuilder_.dispose();
            this.fadeInTimeBuilder_ = null;
         }

         this.displayTime_ = null;
         if (this.displayTimeBuilder_ != null) {
            this.displayTimeBuilder_.dispose();
            this.displayTimeBuilder_ = null;
         }

         this.fadeOutTime_ = null;
         if (this.fadeOutTimeBuilder_ != null) {
            this.fadeOutTimeBuilder_.dispose();
            this.fadeOutTimeBuilder_ = null;
         }

         this.adventureJsonMessage_ = "";
         this.interpolationScale_ = 0.0F;
         this.interpolationRate_ = 0.0F;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_title_v1_DisplayTitleMessage_descriptor;
      }

      public DisplayTitleMessage getDefaultInstanceForType() {
         return DisplayTitleMessage.getDefaultInstance();
      }

      public DisplayTitleMessage build() {
         DisplayTitleMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DisplayTitleMessage buildPartial() {
         DisplayTitleMessage var1 = new DisplayTitleMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(DisplayTitleMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.titleType_ = this.titleType_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.message_ = this.messageBuilder_ == null ? this.message_ : this.messageBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            var1.scale_ = this.scale_;
         }

         if ((var2 & 8) != 0) {
            var1.fadeInTime_ = this.fadeInTimeBuilder_ == null ? this.fadeInTime_ : this.fadeInTimeBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 16) != 0) {
            var1.displayTime_ = this.displayTimeBuilder_ == null ? this.displayTime_ : this.displayTimeBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 32) != 0) {
            var1.fadeOutTime_ = this.fadeOutTimeBuilder_ == null ? this.fadeOutTime_ : this.fadeOutTimeBuilder_.build();
            var3 |= 8;
         }

         if ((var2 & 64) != 0) {
            var1.adventureJsonMessage_ = this.adventureJsonMessage_;
         }

         if ((var2 & 128) != 0) {
            var1.interpolationScale_ = this.interpolationScale_;
         }

         if ((var2 & 256) != 0) {
            var1.interpolationRate_ = this.interpolationRate_;
         }

         DisplayTitleMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public DisplayTitleMessage.Builder clone() {
         return (DisplayTitleMessage.Builder)super.clone();
      }

      public DisplayTitleMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayTitleMessage.Builder)super.setField(var1, var2);
      }

      public DisplayTitleMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DisplayTitleMessage.Builder)super.clearField(var1);
      }

      public DisplayTitleMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DisplayTitleMessage.Builder)super.clearOneof(var1);
      }

      public DisplayTitleMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DisplayTitleMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DisplayTitleMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayTitleMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public DisplayTitleMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof DisplayTitleMessage) {
            return this.mergeFrom((DisplayTitleMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DisplayTitleMessage.Builder mergeFrom(DisplayTitleMessage var1) {
         if (var1 == DisplayTitleMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.titleType_ != 0) {
            this.setTitleTypeValue(var1.getTitleTypeValue());
         }

         if (var1.hasMessage()) {
            this.mergeMessage(var1.getMessage());
         }

         if (var1.getScale() != 0.0F) {
            this.setScale(var1.getScale());
         }

         if (var1.hasFadeInTime()) {
            this.mergeFadeInTime(var1.getFadeInTime());
         }

         if (var1.hasDisplayTime()) {
            this.mergeDisplayTime(var1.getDisplayTime());
         }

         if (var1.hasFadeOutTime()) {
            this.mergeFadeOutTime(var1.getFadeOutTime());
         }

         if (!var1.getAdventureJsonMessage().isEmpty()) {
            this.adventureJsonMessage_ = var1.adventureJsonMessage_;
            this.bitField0_ |= 64;
            this.onChanged();
         }

         if (var1.getInterpolationScale() != 0.0F) {
            this.setInterpolationScale(var1.getInterpolationScale());
         }

         if (var1.getInterpolationRate() != 0.0F) {
            this.setInterpolationRate(var1.getInterpolationRate());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public DisplayTitleMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.titleType_ = var1.readEnum();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getMessageFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 29:
                     this.scale_ = var1.readFloat();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     var1.readMessage(this.getFadeInTimeFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     var1.readMessage(this.getDisplayTimeFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     var1.readMessage(this.getFadeOutTimeFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 32;
                     break;
                  case 58:
                     this.adventureJsonMessage_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 64;
                     break;
                  case 69:
                     this.interpolationScale_ = var1.readFloat();
                     this.bitField0_ |= 128;
                     break;
                  case 77:
                     this.interpolationRate_ = var1.readFloat();
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
      public int getTitleTypeValue() {
         return this.titleType_;
      }

      public DisplayTitleMessage.Builder setTitleTypeValue(int var1) {
         this.titleType_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public TitleType getTitleType() {
         TitleType var1 = TitleType.forNumber(this.titleType_);
         return var1 == null ? TitleType.UNRECOGNIZED : var1;
      }

      public DisplayTitleMessage.Builder setTitleType(TitleType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.titleType_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public DisplayTitleMessage.Builder clearTitleType() {
         this.bitField0_ &= -2;
         this.titleType_ = 0;
         this.onChanged();
         return this;
      }

      @Deprecated
      @Override
      public boolean hasMessage() {
         return (this.bitField0_ & 2) != 0;
      }

      @Deprecated
      @Override
      public Component getMessage() {
         if (this.messageBuilder_ == null) {
            return this.message_ == null ? Component.getDefaultInstance() : this.message_;
         } else {
            return this.messageBuilder_.getMessage();
         }
      }

      @Deprecated
      public DisplayTitleMessage.Builder setMessage(Component var1) {
         if (this.messageBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.message_ = var1;
         } else {
            this.messageBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Deprecated
      public DisplayTitleMessage.Builder setMessage(Component.Builder var1) {
         if (this.messageBuilder_ == null) {
            this.message_ = var1.build();
         } else {
            this.messageBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Deprecated
      public DisplayTitleMessage.Builder mergeMessage(Component var1) {
         if (this.messageBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.message_ != null && this.message_ != Component.getDefaultInstance()) {
               this.getMessageBuilder().mergeFrom(var1);
            } else {
               this.message_ = var1;
            }
         } else {
            this.messageBuilder_.mergeFrom(var1);
         }

         if (this.message_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      @Deprecated
      public DisplayTitleMessage.Builder clearMessage() {
         this.bitField0_ &= -3;
         this.message_ = null;
         if (this.messageBuilder_ != null) {
            this.messageBuilder_.dispose();
            this.messageBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      @Deprecated
      public Component.Builder getMessageBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getMessageFieldBuilder().getBuilder();
      }

      @Deprecated
      @Override
      public ComponentOrBuilder getMessageOrBuilder() {
         if (this.messageBuilder_ != null) {
            return this.messageBuilder_.getMessageOrBuilder();
         } else {
            return this.message_ == null ? Component.getDefaultInstance() : this.message_;
         }
      }

      private SingleFieldBuilderV3<Component, Component.Builder, ComponentOrBuilder> getMessageFieldBuilder() {
         if (this.messageBuilder_ == null) {
            this.messageBuilder_ = new SingleFieldBuilderV3<>(this.getMessage(), this.getParentForChildren(), this.isClean());
            this.message_ = null;
         }

         return this.messageBuilder_;
      }

      @Override
      public float getScale() {
         return this.scale_;
      }

      public DisplayTitleMessage.Builder setScale(float var1) {
         this.scale_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public DisplayTitleMessage.Builder clearScale() {
         this.bitField0_ &= -5;
         this.scale_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasFadeInTime() {
         return (this.bitField0_ & 8) != 0;
      }

      @Override
      public Duration getFadeInTime() {
         if (this.fadeInTimeBuilder_ == null) {
            return this.fadeInTime_ == null ? Duration.getDefaultInstance() : this.fadeInTime_;
         } else {
            return this.fadeInTimeBuilder_.getMessage();
         }
      }

      public DisplayTitleMessage.Builder setFadeInTime(Duration var1) {
         if (this.fadeInTimeBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.fadeInTime_ = var1;
         } else {
            this.fadeInTimeBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public DisplayTitleMessage.Builder setFadeInTime(Duration.Builder var1) {
         if (this.fadeInTimeBuilder_ == null) {
            this.fadeInTime_ = var1.build();
         } else {
            this.fadeInTimeBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public DisplayTitleMessage.Builder mergeFadeInTime(Duration var1) {
         if (this.fadeInTimeBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0 && this.fadeInTime_ != null && this.fadeInTime_ != Duration.getDefaultInstance()) {
               this.getFadeInTimeBuilder().mergeFrom(var1);
            } else {
               this.fadeInTime_ = var1;
            }
         } else {
            this.fadeInTimeBuilder_.mergeFrom(var1);
         }

         if (this.fadeInTime_ != null) {
            this.bitField0_ |= 8;
            this.onChanged();
         }

         return this;
      }

      public DisplayTitleMessage.Builder clearFadeInTime() {
         this.bitField0_ &= -9;
         this.fadeInTime_ = null;
         if (this.fadeInTimeBuilder_ != null) {
            this.fadeInTimeBuilder_.dispose();
            this.fadeInTimeBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Duration.Builder getFadeInTimeBuilder() {
         this.bitField0_ |= 8;
         this.onChanged();
         return this.getFadeInTimeFieldBuilder().getBuilder();
      }

      @Override
      public DurationOrBuilder getFadeInTimeOrBuilder() {
         if (this.fadeInTimeBuilder_ != null) {
            return this.fadeInTimeBuilder_.getMessageOrBuilder();
         } else {
            return this.fadeInTime_ == null ? Duration.getDefaultInstance() : this.fadeInTime_;
         }
      }

      private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> getFadeInTimeFieldBuilder() {
         if (this.fadeInTimeBuilder_ == null) {
            this.fadeInTimeBuilder_ = new SingleFieldBuilderV3<>(this.getFadeInTime(), this.getParentForChildren(), this.isClean());
            this.fadeInTime_ = null;
         }

         return this.fadeInTimeBuilder_;
      }

      @Override
      public boolean hasDisplayTime() {
         return (this.bitField0_ & 16) != 0;
      }

      @Override
      public Duration getDisplayTime() {
         if (this.displayTimeBuilder_ == null) {
            return this.displayTime_ == null ? Duration.getDefaultInstance() : this.displayTime_;
         } else {
            return this.displayTimeBuilder_.getMessage();
         }
      }

      public DisplayTitleMessage.Builder setDisplayTime(Duration var1) {
         if (this.displayTimeBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.displayTime_ = var1;
         } else {
            this.displayTimeBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public DisplayTitleMessage.Builder setDisplayTime(Duration.Builder var1) {
         if (this.displayTimeBuilder_ == null) {
            this.displayTime_ = var1.build();
         } else {
            this.displayTimeBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public DisplayTitleMessage.Builder mergeDisplayTime(Duration var1) {
         if (this.displayTimeBuilder_ == null) {
            if ((this.bitField0_ & 16) != 0 && this.displayTime_ != null && this.displayTime_ != Duration.getDefaultInstance()) {
               this.getDisplayTimeBuilder().mergeFrom(var1);
            } else {
               this.displayTime_ = var1;
            }
         } else {
            this.displayTimeBuilder_.mergeFrom(var1);
         }

         if (this.displayTime_ != null) {
            this.bitField0_ |= 16;
            this.onChanged();
         }

         return this;
      }

      public DisplayTitleMessage.Builder clearDisplayTime() {
         this.bitField0_ &= -17;
         this.displayTime_ = null;
         if (this.displayTimeBuilder_ != null) {
            this.displayTimeBuilder_.dispose();
            this.displayTimeBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Duration.Builder getDisplayTimeBuilder() {
         this.bitField0_ |= 16;
         this.onChanged();
         return this.getDisplayTimeFieldBuilder().getBuilder();
      }

      @Override
      public DurationOrBuilder getDisplayTimeOrBuilder() {
         if (this.displayTimeBuilder_ != null) {
            return this.displayTimeBuilder_.getMessageOrBuilder();
         } else {
            return this.displayTime_ == null ? Duration.getDefaultInstance() : this.displayTime_;
         }
      }

      private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> getDisplayTimeFieldBuilder() {
         if (this.displayTimeBuilder_ == null) {
            this.displayTimeBuilder_ = new SingleFieldBuilderV3<>(this.getDisplayTime(), this.getParentForChildren(), this.isClean());
            this.displayTime_ = null;
         }

         return this.displayTimeBuilder_;
      }

      @Override
      public boolean hasFadeOutTime() {
         return (this.bitField0_ & 32) != 0;
      }

      @Override
      public Duration getFadeOutTime() {
         if (this.fadeOutTimeBuilder_ == null) {
            return this.fadeOutTime_ == null ? Duration.getDefaultInstance() : this.fadeOutTime_;
         } else {
            return this.fadeOutTimeBuilder_.getMessage();
         }
      }

      public DisplayTitleMessage.Builder setFadeOutTime(Duration var1) {
         if (this.fadeOutTimeBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.fadeOutTime_ = var1;
         } else {
            this.fadeOutTimeBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public DisplayTitleMessage.Builder setFadeOutTime(Duration.Builder var1) {
         if (this.fadeOutTimeBuilder_ == null) {
            this.fadeOutTime_ = var1.build();
         } else {
            this.fadeOutTimeBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public DisplayTitleMessage.Builder mergeFadeOutTime(Duration var1) {
         if (this.fadeOutTimeBuilder_ == null) {
            if ((this.bitField0_ & 32) != 0 && this.fadeOutTime_ != null && this.fadeOutTime_ != Duration.getDefaultInstance()) {
               this.getFadeOutTimeBuilder().mergeFrom(var1);
            } else {
               this.fadeOutTime_ = var1;
            }
         } else {
            this.fadeOutTimeBuilder_.mergeFrom(var1);
         }

         if (this.fadeOutTime_ != null) {
            this.bitField0_ |= 32;
            this.onChanged();
         }

         return this;
      }

      public DisplayTitleMessage.Builder clearFadeOutTime() {
         this.bitField0_ &= -33;
         this.fadeOutTime_ = null;
         if (this.fadeOutTimeBuilder_ != null) {
            this.fadeOutTimeBuilder_.dispose();
            this.fadeOutTimeBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Duration.Builder getFadeOutTimeBuilder() {
         this.bitField0_ |= 32;
         this.onChanged();
         return this.getFadeOutTimeFieldBuilder().getBuilder();
      }

      @Override
      public DurationOrBuilder getFadeOutTimeOrBuilder() {
         if (this.fadeOutTimeBuilder_ != null) {
            return this.fadeOutTimeBuilder_.getMessageOrBuilder();
         } else {
            return this.fadeOutTime_ == null ? Duration.getDefaultInstance() : this.fadeOutTime_;
         }
      }

      private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> getFadeOutTimeFieldBuilder() {
         if (this.fadeOutTimeBuilder_ == null) {
            this.fadeOutTimeBuilder_ = new SingleFieldBuilderV3<>(this.getFadeOutTime(), this.getParentForChildren(), this.isClean());
            this.fadeOutTime_ = null;
         }

         return this.fadeOutTimeBuilder_;
      }

      @Override
      public String getAdventureJsonMessage() {
         Object var1 = this.adventureJsonMessage_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.adventureJsonMessage_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getAdventureJsonMessageBytes() {
         Object var1 = this.adventureJsonMessage_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.adventureJsonMessage_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public DisplayTitleMessage.Builder setAdventureJsonMessage(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.adventureJsonMessage_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public DisplayTitleMessage.Builder clearAdventureJsonMessage() {
         this.adventureJsonMessage_ = DisplayTitleMessage.getDefaultInstance().getAdventureJsonMessage();
         this.bitField0_ &= -65;
         this.onChanged();
         return this;
      }

      public DisplayTitleMessage.Builder setAdventureJsonMessageBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         DisplayTitleMessage.checkByteStringIsUtf8(var1);
         this.adventureJsonMessage_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      @Override
      public float getInterpolationScale() {
         return this.interpolationScale_;
      }

      public DisplayTitleMessage.Builder setInterpolationScale(float var1) {
         this.interpolationScale_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public DisplayTitleMessage.Builder clearInterpolationScale() {
         this.bitField0_ &= -129;
         this.interpolationScale_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public float getInterpolationRate() {
         return this.interpolationRate_;
      }

      public DisplayTitleMessage.Builder setInterpolationRate(float var1) {
         this.interpolationRate_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public DisplayTitleMessage.Builder clearInterpolationRate() {
         this.bitField0_ &= -257;
         this.interpolationRate_ = 0.0F;
         this.onChanged();
         return this;
      }

      public final DisplayTitleMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DisplayTitleMessage.Builder)super.setUnknownFields(var1);
      }

      public final DisplayTitleMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DisplayTitleMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
