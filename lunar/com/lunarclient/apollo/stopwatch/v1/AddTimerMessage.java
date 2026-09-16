package com.lunarclient.apollo.stopwatch.v1;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
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

public final class AddTimerMessage extends GeneratedMessageV3 implements AddTimerMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ID_FIELD_NUMBER = 1;
   private volatile Object id_ = "";
   public static final int NAME_FIELD_NUMBER = 2;
   private volatile Object name_ = "";
   public static final int DURATION_FIELD_NUMBER = 3;
   private Duration duration_;
   public static final int LOOP_FIELD_NUMBER = 4;
   private boolean loop_ = false;
   public static final int PREVENT_MODIFICATION_FIELD_NUMBER = 5;
   private boolean preventModification_ = false;
   public static final int IN_GAME_NOTIFICATION_FIELD_NUMBER = 6;
   private boolean inGameNotification_ = false;
   public static final int HIDE_WHEN_STOPPED_FIELD_NUMBER = 7;
   private boolean hideWhenStopped_ = false;
   public static final int DISPLAY_FORMAT_FIELD_NUMBER = 8;
   private volatile Object displayFormat_ = "";
   public static final int TITLE_TEXT_ADVENTURE_JSON_LINES_FIELD_NUMBER = 9;
   private volatile Object titleTextAdventureJsonLines_ = "";
   public static final int TEXT_COLOR_FIELD_NUMBER = 10;
   private Color textColor_;
   public static final int HUD_POSITION_FIELD_NUMBER = 11;
   private HudPosition hudPosition_;
   private byte memoizedIsInitialized = -1;
   private static final AddTimerMessage DEFAULT_INSTANCE = new AddTimerMessage();
   private static final Parser<AddTimerMessage> PARSER = new AbstractParser<AddTimerMessage>() {
      public AddTimerMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         AddTimerMessage.Builder var3 = AddTimerMessage.newBuilder();

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

   private AddTimerMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private AddTimerMessage() {
      this.id_ = "";
      this.name_ = "";
      this.displayFormat_ = "";
      this.titleTextAdventureJsonLines_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new AddTimerMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_stopwatch_v1_AddTimerMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_stopwatch_v1_AddTimerMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(AddTimerMessage.class, AddTimerMessage.Builder.class);
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
   public boolean hasDuration() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Duration getDuration() {
      return this.duration_ == null ? Duration.getDefaultInstance() : this.duration_;
   }

   @Override
   public DurationOrBuilder getDurationOrBuilder() {
      return this.duration_ == null ? Duration.getDefaultInstance() : this.duration_;
   }

   @Override
   public boolean getLoop() {
      return this.loop_;
   }

   @Override
   public boolean getPreventModification() {
      return this.preventModification_;
   }

   @Override
   public boolean getInGameNotification() {
      return this.inGameNotification_;
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
   public String getTitleTextAdventureJsonLines() {
      Object var1 = this.titleTextAdventureJsonLines_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.titleTextAdventureJsonLines_ = var3;
      return var3;
   }

   @Override
   public ByteString getTitleTextAdventureJsonLinesBytes() {
      Object var1 = this.titleTextAdventureJsonLines_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.titleTextAdventureJsonLines_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasTextColor() {
      return (this.bitField0_ & 2) != 0;
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
      return (this.bitField0_ & 4) != 0;
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

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(3, this.getDuration());
      }

      if (this.loop_) {
         var1.writeBool(4, this.loop_);
      }

      if (this.preventModification_) {
         var1.writeBool(5, this.preventModification_);
      }

      if (this.inGameNotification_) {
         var1.writeBool(6, this.inGameNotification_);
      }

      if (this.hideWhenStopped_) {
         var1.writeBool(7, this.hideWhenStopped_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.displayFormat_)) {
         GeneratedMessageV3.writeString(var1, 8, this.displayFormat_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.titleTextAdventureJsonLines_)) {
         GeneratedMessageV3.writeString(var1, 9, this.titleTextAdventureJsonLines_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(10, this.getTextColor());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(11, this.getHudPosition());
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

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getDuration());
      }

      if (this.loop_) {
         var1 += CodedOutputStream.computeBoolSize(4, this.loop_);
      }

      if (this.preventModification_) {
         var1 += CodedOutputStream.computeBoolSize(5, this.preventModification_);
      }

      if (this.inGameNotification_) {
         var1 += CodedOutputStream.computeBoolSize(6, this.inGameNotification_);
      }

      if (this.hideWhenStopped_) {
         var1 += CodedOutputStream.computeBoolSize(7, this.hideWhenStopped_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.displayFormat_)) {
         var1 += GeneratedMessageV3.computeStringSize(8, this.displayFormat_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.titleTextAdventureJsonLines_)) {
         var1 += GeneratedMessageV3.computeStringSize(9, this.titleTextAdventureJsonLines_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(10, this.getTextColor());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(11, this.getHudPosition());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof AddTimerMessage)) {
         return super.equals(var1);
      } else {
         AddTimerMessage var2 = (AddTimerMessage)var1;
         if (!this.getId().equals(var2.getId())) {
            return false;
         } else if (!this.getName().equals(var2.getName())) {
            return false;
         } else if (this.hasDuration() != var2.hasDuration()) {
            return false;
         } else if (this.hasDuration() && !this.getDuration().equals(var2.getDuration())) {
            return false;
         } else if (this.getLoop() != var2.getLoop()) {
            return false;
         } else if (this.getPreventModification() != var2.getPreventModification()) {
            return false;
         } else if (this.getInGameNotification() != var2.getInGameNotification()) {
            return false;
         } else if (this.getHideWhenStopped() != var2.getHideWhenStopped()) {
            return false;
         } else if (!this.getDisplayFormat().equals(var2.getDisplayFormat())) {
            return false;
         } else if (!this.getTitleTextAdventureJsonLines().equals(var2.getTitleTextAdventureJsonLines())) {
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
      if (this.hasDuration()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getDuration().hashCode();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashBoolean(this.getLoop());
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + Internal.hashBoolean(this.getPreventModification());
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + Internal.hashBoolean(this.getInGameNotification());
      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + Internal.hashBoolean(this.getHideWhenStopped());
      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + this.getDisplayFormat().hashCode();
      var1 = 37 * var1 + 9;
      var1 = 53 * var1 + this.getTitleTextAdventureJsonLines().hashCode();
      if (this.hasTextColor()) {
         var1 = 37 * var1 + 10;
         var1 = 53 * var1 + this.getTextColor().hashCode();
      }

      if (this.hasHudPosition()) {
         var1 = 37 * var1 + 11;
         var1 = 53 * var1 + this.getHudPosition().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static AddTimerMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static AddTimerMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AddTimerMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static AddTimerMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AddTimerMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static AddTimerMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AddTimerMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AddTimerMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static AddTimerMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static AddTimerMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static AddTimerMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AddTimerMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public AddTimerMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static AddTimerMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static AddTimerMessage.Builder newBuilder(AddTimerMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public AddTimerMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new AddTimerMessage.Builder() : new AddTimerMessage.Builder().mergeFrom(this);
   }

   protected AddTimerMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new AddTimerMessage.Builder(var1);
   }

   public static AddTimerMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<AddTimerMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<AddTimerMessage> getParserForType() {
      return PARSER;
   }

   public AddTimerMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<AddTimerMessage.Builder> implements AddTimerMessageOrBuilder {
      private int bitField0_;
      private Object id_ = "";
      private Object name_ = "";
      private Duration duration_;
      private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> durationBuilder_;
      private boolean loop_;
      private boolean preventModification_;
      private boolean inGameNotification_;
      private boolean hideWhenStopped_;
      private Object displayFormat_ = "";
      private Object titleTextAdventureJsonLines_ = "";
      private Color textColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> textColorBuilder_;
      private HudPosition hudPosition_;
      private SingleFieldBuilderV3<HudPosition, HudPosition.Builder, HudPositionOrBuilder> hudPositionBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_stopwatch_v1_AddTimerMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_stopwatch_v1_AddTimerMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(AddTimerMessage.class, AddTimerMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (AddTimerMessage.alwaysUseFieldBuilders) {
            this.getDurationFieldBuilder();
            this.getTextColorFieldBuilder();
            this.getHudPositionFieldBuilder();
         }
      }

      public AddTimerMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = "";
         this.name_ = "";
         this.duration_ = null;
         if (this.durationBuilder_ != null) {
            this.durationBuilder_.dispose();
            this.durationBuilder_ = null;
         }

         this.loop_ = false;
         this.preventModification_ = false;
         this.inGameNotification_ = false;
         this.hideWhenStopped_ = false;
         this.displayFormat_ = "";
         this.titleTextAdventureJsonLines_ = "";
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
         return SchemaProto.internal_static_lunarclient_apollo_stopwatch_v1_AddTimerMessage_descriptor;
      }

      public AddTimerMessage getDefaultInstanceForType() {
         return AddTimerMessage.getDefaultInstance();
      }

      public AddTimerMessage build() {
         AddTimerMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public AddTimerMessage buildPartial() {
         AddTimerMessage var1 = new AddTimerMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(AddTimerMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }

         if ((var2 & 2) != 0) {
            var1.name_ = this.name_;
         }

         byte var3 = 0;
         if ((var2 & 4) != 0) {
            var1.duration_ = this.durationBuilder_ == null ? this.duration_ : this.durationBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 8) != 0) {
            var1.loop_ = this.loop_;
         }

         if ((var2 & 16) != 0) {
            var1.preventModification_ = this.preventModification_;
         }

         if ((var2 & 32) != 0) {
            var1.inGameNotification_ = this.inGameNotification_;
         }

         if ((var2 & 64) != 0) {
            var1.hideWhenStopped_ = this.hideWhenStopped_;
         }

         if ((var2 & 128) != 0) {
            var1.displayFormat_ = this.displayFormat_;
         }

         if ((var2 & 256) != 0) {
            var1.titleTextAdventureJsonLines_ = this.titleTextAdventureJsonLines_;
         }

         if ((var2 & 512) != 0) {
            var1.textColor_ = this.textColorBuilder_ == null ? this.textColor_ : this.textColorBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 1024) != 0) {
            var1.hudPosition_ = this.hudPositionBuilder_ == null ? this.hudPosition_ : this.hudPositionBuilder_.build();
            var3 |= 4;
         }

         AddTimerMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public AddTimerMessage.Builder clone() {
         return (AddTimerMessage.Builder)super.clone();
      }

      public AddTimerMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (AddTimerMessage.Builder)super.setField(var1, var2);
      }

      public AddTimerMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (AddTimerMessage.Builder)super.clearField(var1);
      }

      public AddTimerMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (AddTimerMessage.Builder)super.clearOneof(var1);
      }

      public AddTimerMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (AddTimerMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public AddTimerMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (AddTimerMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public AddTimerMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof AddTimerMessage) {
            return this.mergeFrom((AddTimerMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public AddTimerMessage.Builder mergeFrom(AddTimerMessage var1) {
         if (var1 == AddTimerMessage.getDefaultInstance()) {
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

         if (var1.hasDuration()) {
            this.mergeDuration(var1.getDuration());
         }

         if (var1.getLoop()) {
            this.setLoop(var1.getLoop());
         }

         if (var1.getPreventModification()) {
            this.setPreventModification(var1.getPreventModification());
         }

         if (var1.getInGameNotification()) {
            this.setInGameNotification(var1.getInGameNotification());
         }

         if (var1.getHideWhenStopped()) {
            this.setHideWhenStopped(var1.getHideWhenStopped());
         }

         if (!var1.getDisplayFormat().isEmpty()) {
            this.displayFormat_ = var1.displayFormat_;
            this.bitField0_ |= 128;
            this.onChanged();
         }

         if (!var1.getTitleTextAdventureJsonLines().isEmpty()) {
            this.titleTextAdventureJsonLines_ = var1.titleTextAdventureJsonLines_;
            this.bitField0_ |= 256;
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

      public AddTimerMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 26:
                     var1.readMessage(this.getDurationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.loop_ = var1.readBool();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.preventModification_ = var1.readBool();
                     this.bitField0_ |= 16;
                     break;
                  case 48:
                     this.inGameNotification_ = var1.readBool();
                     this.bitField0_ |= 32;
                     break;
                  case 56:
                     this.hideWhenStopped_ = var1.readBool();
                     this.bitField0_ |= 64;
                     break;
                  case 66:
                     this.displayFormat_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 128;
                     break;
                  case 74:
                     this.titleTextAdventureJsonLines_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 256;
                     break;
                  case 82:
                     var1.readMessage(this.getTextColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 512;
                     break;
                  case 90:
                     var1.readMessage(this.getHudPositionFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1024;
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

      public AddTimerMessage.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public AddTimerMessage.Builder clearId() {
         this.id_ = AddTimerMessage.getDefaultInstance().getId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public AddTimerMessage.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         AddTimerMessage.checkByteStringIsUtf8(var1);
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

      public AddTimerMessage.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public AddTimerMessage.Builder clearName() {
         this.name_ = AddTimerMessage.getDefaultInstance().getName();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public AddTimerMessage.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         AddTimerMessage.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasDuration() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Duration getDuration() {
         if (this.durationBuilder_ == null) {
            return this.duration_ == null ? Duration.getDefaultInstance() : this.duration_;
         } else {
            return this.durationBuilder_.getMessage();
         }
      }

      public AddTimerMessage.Builder setDuration(Duration var1) {
         if (this.durationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.duration_ = var1;
         } else {
            this.durationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public AddTimerMessage.Builder setDuration(Duration.Builder var1) {
         if (this.durationBuilder_ == null) {
            this.duration_ = var1.build();
         } else {
            this.durationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public AddTimerMessage.Builder mergeDuration(Duration var1) {
         if (this.durationBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.duration_ != null && this.duration_ != Duration.getDefaultInstance()) {
               this.getDurationBuilder().mergeFrom(var1);
            } else {
               this.duration_ = var1;
            }
         } else {
            this.durationBuilder_.mergeFrom(var1);
         }

         if (this.duration_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public AddTimerMessage.Builder clearDuration() {
         this.bitField0_ &= -5;
         this.duration_ = null;
         if (this.durationBuilder_ != null) {
            this.durationBuilder_.dispose();
            this.durationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Duration.Builder getDurationBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getDurationFieldBuilder().getBuilder();
      }

      @Override
      public DurationOrBuilder getDurationOrBuilder() {
         if (this.durationBuilder_ != null) {
            return this.durationBuilder_.getMessageOrBuilder();
         } else {
            return this.duration_ == null ? Duration.getDefaultInstance() : this.duration_;
         }
      }

      private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> getDurationFieldBuilder() {
         if (this.durationBuilder_ == null) {
            this.durationBuilder_ = new SingleFieldBuilderV3<>(this.getDuration(), this.getParentForChildren(), this.isClean());
            this.duration_ = null;
         }

         return this.durationBuilder_;
      }

      @Override
      public boolean getLoop() {
         return this.loop_;
      }

      public AddTimerMessage.Builder setLoop(boolean var1) {
         this.loop_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public AddTimerMessage.Builder clearLoop() {
         this.bitField0_ &= -9;
         this.loop_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getPreventModification() {
         return this.preventModification_;
      }

      public AddTimerMessage.Builder setPreventModification(boolean var1) {
         this.preventModification_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public AddTimerMessage.Builder clearPreventModification() {
         this.bitField0_ &= -17;
         this.preventModification_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getInGameNotification() {
         return this.inGameNotification_;
      }

      public AddTimerMessage.Builder setInGameNotification(boolean var1) {
         this.inGameNotification_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public AddTimerMessage.Builder clearInGameNotification() {
         this.bitField0_ &= -33;
         this.inGameNotification_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getHideWhenStopped() {
         return this.hideWhenStopped_;
      }

      public AddTimerMessage.Builder setHideWhenStopped(boolean var1) {
         this.hideWhenStopped_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public AddTimerMessage.Builder clearHideWhenStopped() {
         this.bitField0_ &= -65;
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

      public AddTimerMessage.Builder setDisplayFormat(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.displayFormat_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public AddTimerMessage.Builder clearDisplayFormat() {
         this.displayFormat_ = AddTimerMessage.getDefaultInstance().getDisplayFormat();
         this.bitField0_ &= -129;
         this.onChanged();
         return this;
      }

      public AddTimerMessage.Builder setDisplayFormatBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         AddTimerMessage.checkByteStringIsUtf8(var1);
         this.displayFormat_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      @Override
      public String getTitleTextAdventureJsonLines() {
         Object var1 = this.titleTextAdventureJsonLines_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.titleTextAdventureJsonLines_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getTitleTextAdventureJsonLinesBytes() {
         Object var1 = this.titleTextAdventureJsonLines_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.titleTextAdventureJsonLines_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public AddTimerMessage.Builder setTitleTextAdventureJsonLines(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.titleTextAdventureJsonLines_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public AddTimerMessage.Builder clearTitleTextAdventureJsonLines() {
         this.titleTextAdventureJsonLines_ = AddTimerMessage.getDefaultInstance().getTitleTextAdventureJsonLines();
         this.bitField0_ &= -257;
         this.onChanged();
         return this;
      }

      public AddTimerMessage.Builder setTitleTextAdventureJsonLinesBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         AddTimerMessage.checkByteStringIsUtf8(var1);
         this.titleTextAdventureJsonLines_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasTextColor() {
         return (this.bitField0_ & 512) != 0;
      }

      @Override
      public Color getTextColor() {
         if (this.textColorBuilder_ == null) {
            return this.textColor_ == null ? Color.getDefaultInstance() : this.textColor_;
         } else {
            return this.textColorBuilder_.getMessage();
         }
      }

      public AddTimerMessage.Builder setTextColor(Color var1) {
         if (this.textColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.textColor_ = var1;
         } else {
            this.textColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      public AddTimerMessage.Builder setTextColor(Color.Builder var1) {
         if (this.textColorBuilder_ == null) {
            this.textColor_ = var1.build();
         } else {
            this.textColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      public AddTimerMessage.Builder mergeTextColor(Color var1) {
         if (this.textColorBuilder_ == null) {
            if ((this.bitField0_ & 512) != 0 && this.textColor_ != null && this.textColor_ != Color.getDefaultInstance()) {
               this.getTextColorBuilder().mergeFrom(var1);
            } else {
               this.textColor_ = var1;
            }
         } else {
            this.textColorBuilder_.mergeFrom(var1);
         }

         if (this.textColor_ != null) {
            this.bitField0_ |= 512;
            this.onChanged();
         }

         return this;
      }

      public AddTimerMessage.Builder clearTextColor() {
         this.bitField0_ &= -513;
         this.textColor_ = null;
         if (this.textColorBuilder_ != null) {
            this.textColorBuilder_.dispose();
            this.textColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getTextColorBuilder() {
         this.bitField0_ |= 512;
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
         return (this.bitField0_ & 1024) != 0;
      }

      @Override
      public HudPosition getHudPosition() {
         if (this.hudPositionBuilder_ == null) {
            return this.hudPosition_ == null ? HudPosition.getDefaultInstance() : this.hudPosition_;
         } else {
            return this.hudPositionBuilder_.getMessage();
         }
      }

      public AddTimerMessage.Builder setHudPosition(HudPosition var1) {
         if (this.hudPositionBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.hudPosition_ = var1;
         } else {
            this.hudPositionBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1024;
         this.onChanged();
         return this;
      }

      public AddTimerMessage.Builder setHudPosition(HudPosition.Builder var1) {
         if (this.hudPositionBuilder_ == null) {
            this.hudPosition_ = var1.build();
         } else {
            this.hudPositionBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1024;
         this.onChanged();
         return this;
      }

      public AddTimerMessage.Builder mergeHudPosition(HudPosition var1) {
         if (this.hudPositionBuilder_ == null) {
            if ((this.bitField0_ & 1024) != 0 && this.hudPosition_ != null && this.hudPosition_ != HudPosition.getDefaultInstance()) {
               this.getHudPositionBuilder().mergeFrom(var1);
            } else {
               this.hudPosition_ = var1;
            }
         } else {
            this.hudPositionBuilder_.mergeFrom(var1);
         }

         if (this.hudPosition_ != null) {
            this.bitField0_ |= 1024;
            this.onChanged();
         }

         return this;
      }

      public AddTimerMessage.Builder clearHudPosition() {
         this.bitField0_ &= -1025;
         this.hudPosition_ = null;
         if (this.hudPositionBuilder_ != null) {
            this.hudPositionBuilder_.dispose();
            this.hudPositionBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public HudPosition.Builder getHudPositionBuilder() {
         this.bitField0_ |= 1024;
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

      public final AddTimerMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (AddTimerMessage.Builder)super.setUnknownFields(var1);
      }

      public final AddTimerMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (AddTimerMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
