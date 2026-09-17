package com.lunarclient.apollo.stopwatch.v1;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.apollo.common.v1.Color;
import com.lunarclient.apollo.common.v1.ColorOrBuilder;
import com.lunarclient.apollo.hud.v1.HudPosition;
import com.lunarclient.apollo.hud.v1.HudPositionOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class AddStopwatchMessage extends GeneratedMessageV3 implements AddStopwatchMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ID_FIELD_NUMBER = 1;
   private volatile Object id_ = "";
   public static final int NAME_FIELD_NUMBER = 2;
   private volatile Object name_ = "";
   public static final int RESET_ON_START_FIELD_NUMBER = 3;
   private boolean resetOnStart_ = false;
   public static final int PREVENT_MODIFICATION_FIELD_NUMBER = 4;
   private boolean preventModification_ = false;
   public static final int HIDE_WHEN_STOPPED_FIELD_NUMBER = 5;
   private boolean hideWhenStopped_ = false;
   public static final int DISPLAY_FORMAT_FIELD_NUMBER = 6;
   private volatile Object displayFormat_ = "";
   public static final int TEXT_COLOR_FIELD_NUMBER = 7;
   private Color textColor_;
   public static final int HUD_POSITION_FIELD_NUMBER = 8;
   private HudPosition hudPosition_;
   private byte memoizedIsInitialized = -1;
   private static final AddStopwatchMessage DEFAULT_INSTANCE = new AddStopwatchMessage();
   private static final Parser<AddStopwatchMessage> PARSER = new AbstractParser<AddStopwatchMessage>() {
      public AddStopwatchMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         AddStopwatchMessage.Builder var3 = AddStopwatchMessage.newBuilder();

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

   private AddStopwatchMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private AddStopwatchMessage() {
      this.id_ = "";
      this.name_ = "";
      this.displayFormat_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new AddStopwatchMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_stopwatch_v1_AddStopwatchMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_stopwatch_v1_AddStopwatchMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(AddStopwatchMessage.class, AddStopwatchMessage.Builder.class);
   }

   @Override
   public String getId() {
      Object var1 = this.id_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.id_ = var3;
      return var3;
   }

   @Override
   public ByteString getIdBytes() {
      Object var1 = this.id_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.id_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getName() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.name_ = var3;
      return var3;
   }

   @Override
   public ByteString getNameBytes() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.name_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean getResetOnStart() {
      return this.resetOnStart_;
   }

   @Override
   public boolean getPreventModification() {
      return this.preventModification_;
   }

   @Override
   public boolean getHideWhenStopped() {
      return this.hideWhenStopped_;
   }

   @Override
   public String getDisplayFormat() {
      Object var1 = this.displayFormat_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.displayFormat_ = var3;
      return var3;
   }

   @Override
   public ByteString getDisplayFormatBytes() {
      Object var1 = this.displayFormat_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.displayFormat_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasTextColor() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Color getTextColor() {
      return this.textColor_ == null ? Color.getDefaultInstance() : this.textColor_;
   }

   @Override
   public ColorOrBuilder getTextColorOrBuilder() {
      return this.textColor_ == null ? Color.getDefaultInstance() : this.textColor_;
   }

   @Override
   public boolean hasHudPosition() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public HudPosition getHudPosition() {
      return this.hudPosition_ == null ? HudPosition.getDefaultInstance() : this.hudPosition_;
   }

   @Override
   public HudPositionOrBuilder getHudPositionOrBuilder() {
      return this.hudPosition_ == null ? HudPosition.getDefaultInstance() : this.hudPosition_;
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
      if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
         GeneratedMessageV3.writeString(var1, 1, this.id_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         GeneratedMessageV3.writeString(var1, 2, this.name_);
      }

      if (this.resetOnStart_) {
         var1.writeBool(3, this.resetOnStart_);
      }

      if (this.preventModification_) {
         var1.writeBool(4, this.preventModification_);
      }

      if (this.hideWhenStopped_) {
         var1.writeBool(5, this.hideWhenStopped_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.displayFormat_)) {
         GeneratedMessageV3.writeString(var1, 6, this.displayFormat_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(7, this.getTextColor());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(8, this.getHudPosition());
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
      if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.id_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.name_);
      }

      if (this.resetOnStart_) {
         var1 += CodedOutputStream.computeBoolSize(3, this.resetOnStart_);
      }

      if (this.preventModification_) {
         var1 += CodedOutputStream.computeBoolSize(4, this.preventModification_);
      }

      if (this.hideWhenStopped_) {
         var1 += CodedOutputStream.computeBoolSize(5, this.hideWhenStopped_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.displayFormat_)) {
         var1 += GeneratedMessageV3.computeStringSize(6, this.displayFormat_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(7, this.getTextColor());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(8, this.getHudPosition());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof AddStopwatchMessage)) {
         return super.equals(var1);
      } else {
         AddStopwatchMessage var2 = (AddStopwatchMessage)var1;
         if (!this.getId().equals(var2.getId())) {
            return false;
         } else if (!this.getName().equals(var2.getName())) {
            return false;
         } else if (this.getResetOnStart() != var2.getResetOnStart()) {
            return false;
         } else if (this.getPreventModification() != var2.getPreventModification()) {
            return false;
         } else if (this.getHideWhenStopped() != var2.getHideWhenStopped()) {
            return false;
         } else if (!this.getDisplayFormat().equals(var2.getDisplayFormat())) {
            return false;
         } else if (this.hasTextColor() != var2.hasTextColor()) {
            return false;
         } else if (this.hasTextColor() && !this.getTextColor().equals(var2.getTextColor())) {
            return false;
         } else if (this.hasHudPosition() != var2.hasHudPosition()) {
            return false;
         } else {
            return this.hasHudPosition() && !this.getHudPosition().equals(var2.getHudPosition())
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
      var1 = 53 * var1 + this.getId().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getName().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Internal.hashBoolean(this.getResetOnStart());
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashBoolean(this.getPreventModification());
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + Internal.hashBoolean(this.getHideWhenStopped());
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.getDisplayFormat().hashCode();
      if (this.hasTextColor()) {
         var1 = 37 * var1 + 7;
         var1 = 53 * var1 + this.getTextColor().hashCode();
      }

      if (this.hasHudPosition()) {
         var1 = 37 * var1 + 8;
         var1 = 53 * var1 + this.getHudPosition().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static AddStopwatchMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static AddStopwatchMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AddStopwatchMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static AddStopwatchMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AddStopwatchMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static AddStopwatchMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AddStopwatchMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AddStopwatchMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static AddStopwatchMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static AddStopwatchMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static AddStopwatchMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AddStopwatchMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public AddStopwatchMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static AddStopwatchMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static AddStopwatchMessage.Builder newBuilder(AddStopwatchMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public AddStopwatchMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new AddStopwatchMessage.Builder() : new AddStopwatchMessage.Builder().mergeFrom(this);
   }

   protected AddStopwatchMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new AddStopwatchMessage.Builder(var1);
   }

   public static AddStopwatchMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<AddStopwatchMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<AddStopwatchMessage> getParserForType() {
      return PARSER;
   }

   public AddStopwatchMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<AddStopwatchMessage.Builder> implements AddStopwatchMessageOrBuilder {
      private int bitField0_;
      private Object id_ = "";
      private Object name_ = "";
      private boolean resetOnStart_;
      private boolean preventModification_;
      private boolean hideWhenStopped_;
      private Object displayFormat_ = "";
      private Color textColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> textColorBuilder_;
      private HudPosition hudPosition_;
      private SingleFieldBuilderV3<HudPosition, HudPosition.Builder, HudPositionOrBuilder> hudPositionBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_stopwatch_v1_AddStopwatchMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_stopwatch_v1_AddStopwatchMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(AddStopwatchMessage.class, AddStopwatchMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (AddStopwatchMessage.alwaysUseFieldBuilders) {
            this.getTextColorFieldBuilder();
            this.getHudPositionFieldBuilder();
         }
      }

      public AddStopwatchMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = "";
         this.name_ = "";
         this.resetOnStart_ = false;
         this.preventModification_ = false;
         this.hideWhenStopped_ = false;
         this.displayFormat_ = "";
         this.textColor_ = null;
         if (this.textColorBuilder_ != null) {
            this.textColorBuilder_.dispose();
            this.textColorBuilder_ = null;
         }

         this.hudPosition_ = null;
         if (this.hudPositionBuilder_ != null) {
            this.hudPositionBuilder_.dispose();
            this.hudPositionBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_stopwatch_v1_AddStopwatchMessage_descriptor;
      }

      public AddStopwatchMessage getDefaultInstanceForType() {
         return AddStopwatchMessage.getDefaultInstance();
      }

      public AddStopwatchMessage build() {
         AddStopwatchMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public AddStopwatchMessage buildPartial() {
         AddStopwatchMessage var1 = new AddStopwatchMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(AddStopwatchMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }

         if ((var2 & 2) != 0) {
            var1.name_ = this.name_;
         }

         if ((var2 & 4) != 0) {
            var1.resetOnStart_ = this.resetOnStart_;
         }

         if ((var2 & 8) != 0) {
            var1.preventModification_ = this.preventModification_;
         }

         if ((var2 & 16) != 0) {
            var1.hideWhenStopped_ = this.hideWhenStopped_;
         }

         if ((var2 & 32) != 0) {
            var1.displayFormat_ = this.displayFormat_;
         }

         byte var3 = 0;
         if ((var2 & 64) != 0) {
            var1.textColor_ = this.textColorBuilder_ == null ? this.textColor_ : this.textColorBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 128) != 0) {
            var1.hudPosition_ = this.hudPositionBuilder_ == null ? this.hudPosition_ : this.hudPositionBuilder_.build();
            var3 |= 2;
         }

         AddStopwatchMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public AddStopwatchMessage.Builder clone() {
         return (AddStopwatchMessage.Builder)super.clone();
      }

      public AddStopwatchMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (AddStopwatchMessage.Builder)super.setField(var1, var2);
      }

      public AddStopwatchMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (AddStopwatchMessage.Builder)super.clearField(var1);
      }

      public AddStopwatchMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (AddStopwatchMessage.Builder)super.clearOneof(var1);
      }

      public AddStopwatchMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (AddStopwatchMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public AddStopwatchMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (AddStopwatchMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public AddStopwatchMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof AddStopwatchMessage) {
            return this.mergeFrom((AddStopwatchMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public AddStopwatchMessage.Builder mergeFrom(AddStopwatchMessage var1) {
         if (var1 == AddStopwatchMessage.getDefaultInstance()) {
            return this;
         }

         if (!var1.getId().isEmpty()) {
            this.id_ = var1.id_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getName().isEmpty()) {
            this.name_ = var1.name_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (var1.getResetOnStart()) {
            this.setResetOnStart(var1.getResetOnStart());
         }

         if (var1.getPreventModification()) {
            this.setPreventModification(var1.getPreventModification());
         }

         if (var1.getHideWhenStopped()) {
            this.setHideWhenStopped(var1.getHideWhenStopped());
         }

         if (!var1.getDisplayFormat().isEmpty()) {
            this.displayFormat_ = var1.displayFormat_;
            this.bitField0_ |= 32;
            this.onChanged();
         }

         if (var1.hasTextColor()) {
            this.mergeTextColor(var1.getTextColor());
         }

         if (var1.hasHudPosition()) {
            this.mergeHudPosition(var1.getHudPosition());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public AddStopwatchMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 10:
                     this.id_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.name_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.resetOnStart_ = var1.readBool();
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.preventModification_ = var1.readBool();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.hideWhenStopped_ = var1.readBool();
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     this.displayFormat_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 32;
                     break;
                  case 58:
                     var1.readMessage(this.getTextColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 64;
                     break;
                  case 66:
                     var1.readMessage(this.getHudPositionFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 128;
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
      public String getId() {
         Object var1 = this.id_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.id_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getIdBytes() {
         Object var1 = this.id_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.id_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public AddStopwatchMessage.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public AddStopwatchMessage.Builder clearId() {
         this.id_ = AddStopwatchMessage.getDefaultInstance().getId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public AddStopwatchMessage.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         AddStopwatchMessage.checkByteStringIsUtf8(var1);
         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public String getName() {
         Object var1 = this.name_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.name_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getNameBytes() {
         Object var1 = this.name_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.name_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public AddStopwatchMessage.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public AddStopwatchMessage.Builder clearName() {
         this.name_ = AddStopwatchMessage.getDefaultInstance().getName();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public AddStopwatchMessage.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         AddStopwatchMessage.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getResetOnStart() {
         return this.resetOnStart_;
      }

      public AddStopwatchMessage.Builder setResetOnStart(boolean var1) {
         this.resetOnStart_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public AddStopwatchMessage.Builder clearResetOnStart() {
         this.bitField0_ &= -5;
         this.resetOnStart_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getPreventModification() {
         return this.preventModification_;
      }

      public AddStopwatchMessage.Builder setPreventModification(boolean var1) {
         this.preventModification_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public AddStopwatchMessage.Builder clearPreventModification() {
         this.bitField0_ &= -9;
         this.preventModification_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getHideWhenStopped() {
         return this.hideWhenStopped_;
      }

      public AddStopwatchMessage.Builder setHideWhenStopped(boolean var1) {
         this.hideWhenStopped_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public AddStopwatchMessage.Builder clearHideWhenStopped() {
         this.bitField0_ &= -17;
         this.hideWhenStopped_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public String getDisplayFormat() {
         Object var1 = this.displayFormat_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.displayFormat_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getDisplayFormatBytes() {
         Object var1 = this.displayFormat_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.displayFormat_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public AddStopwatchMessage.Builder setDisplayFormat(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.displayFormat_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public AddStopwatchMessage.Builder clearDisplayFormat() {
         this.displayFormat_ = AddStopwatchMessage.getDefaultInstance().getDisplayFormat();
         this.bitField0_ &= -33;
         this.onChanged();
         return this;
      }

      public AddStopwatchMessage.Builder setDisplayFormatBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         AddStopwatchMessage.checkByteStringIsUtf8(var1);
         this.displayFormat_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasTextColor() {
         return (this.bitField0_ & 64) != 0;
      }

      @Override
      public Color getTextColor() {
         if (this.textColorBuilder_ == null) {
            return this.textColor_ == null ? Color.getDefaultInstance() : this.textColor_;
         } else {
            return this.textColorBuilder_.getMessage();
         }
      }

      public AddStopwatchMessage.Builder setTextColor(Color var1) {
         if (this.textColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.textColor_ = var1;
         } else {
            this.textColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public AddStopwatchMessage.Builder setTextColor(Color.Builder var1) {
         if (this.textColorBuilder_ == null) {
            this.textColor_ = var1.build();
         } else {
            this.textColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public AddStopwatchMessage.Builder mergeTextColor(Color var1) {
         if (this.textColorBuilder_ == null) {
            if ((this.bitField0_ & 64) != 0 && this.textColor_ != null && this.textColor_ != Color.getDefaultInstance()) {
               this.getTextColorBuilder().mergeFrom(var1);
            } else {
               this.textColor_ = var1;
            }
         } else {
            this.textColorBuilder_.mergeFrom(var1);
         }

         if (this.textColor_ != null) {
            this.bitField0_ |= 64;
            this.onChanged();
         }

         return this;
      }

      public AddStopwatchMessage.Builder clearTextColor() {
         this.bitField0_ &= -65;
         this.textColor_ = null;
         if (this.textColorBuilder_ != null) {
            this.textColorBuilder_.dispose();
            this.textColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getTextColorBuilder() {
         this.bitField0_ |= 64;
         this.onChanged();
         return this.getTextColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getTextColorOrBuilder() {
         if (this.textColorBuilder_ != null) {
            return this.textColorBuilder_.getMessageOrBuilder();
         } else {
            return this.textColor_ == null ? Color.getDefaultInstance() : this.textColor_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getTextColorFieldBuilder() {
         if (this.textColorBuilder_ == null) {
            this.textColorBuilder_ = new SingleFieldBuilderV3<>(this.getTextColor(), this.getParentForChildren(), this.isClean());
            this.textColor_ = null;
         }

         return this.textColorBuilder_;
      }

      @Override
      public boolean hasHudPosition() {
         return (this.bitField0_ & 128) != 0;
      }

      @Override
      public HudPosition getHudPosition() {
         if (this.hudPositionBuilder_ == null) {
            return this.hudPosition_ == null ? HudPosition.getDefaultInstance() : this.hudPosition_;
         } else {
            return this.hudPositionBuilder_.getMessage();
         }
      }

      public AddStopwatchMessage.Builder setHudPosition(HudPosition var1) {
         if (this.hudPositionBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.hudPosition_ = var1;
         } else {
            this.hudPositionBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public AddStopwatchMessage.Builder setHudPosition(HudPosition.Builder var1) {
         if (this.hudPositionBuilder_ == null) {
            this.hudPosition_ = var1.build();
         } else {
            this.hudPositionBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public AddStopwatchMessage.Builder mergeHudPosition(HudPosition var1) {
         if (this.hudPositionBuilder_ == null) {
            if ((this.bitField0_ & 128) != 0 && this.hudPosition_ != null && this.hudPosition_ != HudPosition.getDefaultInstance()) {
               this.getHudPositionBuilder().mergeFrom(var1);
            } else {
               this.hudPosition_ = var1;
            }
         } else {
            this.hudPositionBuilder_.mergeFrom(var1);
         }

         if (this.hudPosition_ != null) {
            this.bitField0_ |= 128;
            this.onChanged();
         }

         return this;
      }

      public AddStopwatchMessage.Builder clearHudPosition() {
         this.bitField0_ &= -129;
         this.hudPosition_ = null;
         if (this.hudPositionBuilder_ != null) {
            this.hudPositionBuilder_.dispose();
            this.hudPositionBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public HudPosition.Builder getHudPositionBuilder() {
         this.bitField0_ |= 128;
         this.onChanged();
         return this.getHudPositionFieldBuilder().getBuilder();
      }

      @Override
      public HudPositionOrBuilder getHudPositionOrBuilder() {
         if (this.hudPositionBuilder_ != null) {
            return this.hudPositionBuilder_.getMessageOrBuilder();
         } else {
            return this.hudPosition_ == null ? HudPosition.getDefaultInstance() : this.hudPosition_;
         }
      }

      private SingleFieldBuilderV3<HudPosition, HudPosition.Builder, HudPositionOrBuilder> getHudPositionFieldBuilder() {
         if (this.hudPositionBuilder_ == null) {
            this.hudPositionBuilder_ = new SingleFieldBuilderV3<>(this.getHudPosition(), this.getParentForChildren(), this.isClean());
            this.hudPosition_ = null;
         }

         return this.hudPositionBuilder_;
      }

      public final AddStopwatchMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (AddStopwatchMessage.Builder)super.setUnknownFields(var1);
      }

      public final AddStopwatchMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (AddStopwatchMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
