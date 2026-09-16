package com.lunarclient.apollo.marker.v1;

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
import com.lunarclient.apollo.common.v1.Location;
import com.lunarclient.apollo.common.v1.LocationOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DisplayMarkerMessage extends GeneratedMessageV3 implements DisplayMarkerMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ID_FIELD_NUMBER = 1;
   private volatile Object id_ = "";
   public static final int LOCATION_FIELD_NUMBER = 2;
   private Location location_;
   public static final int OWNER_ID_FIELD_NUMBER = 3;
   private Uuid ownerId_;
   public static final int OWNER_NAME_FIELD_NUMBER = 4;
   private volatile Object ownerName_ = "";
   public static final int FLAG_FIELD_NUMBER = 5;
   private MarkerFlag flag_;
   public static final int TARGET_FIELD_NUMBER = 6;
   private MarkerTarget target_;
   public static final int DURATION_FIELD_NUMBER = 7;
   private Duration duration_;
   public static final int IN_GAME_NOTIFICATION_FIELD_NUMBER = 8;
   private boolean inGameNotification_ = false;
   public static final int CHAT_NOTIFY_FIELD_NUMBER = 9;
   private boolean chatNotify_ = false;
   public static final int MIDDLE_CLICK_REMOVE_FIELD_NUMBER = 10;
   private boolean middleClickRemove_ = false;
   public static final int STYLE_FIELD_NUMBER = 11;
   private MarkerStyle style_;
   private byte memoizedIsInitialized = -1;
   private static final DisplayMarkerMessage DEFAULT_INSTANCE = new DisplayMarkerMessage();
   private static final Parser<DisplayMarkerMessage> PARSER = new AbstractParser<DisplayMarkerMessage>() {
      public DisplayMarkerMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DisplayMarkerMessage.Builder var3 = DisplayMarkerMessage.newBuilder();

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

   private DisplayMarkerMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DisplayMarkerMessage() {
      this.id_ = "";
      this.ownerName_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DisplayMarkerMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_marker_v1_DisplayMarkerMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_marker_v1_DisplayMarkerMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DisplayMarkerMessage.class, DisplayMarkerMessage.Builder.class);
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
   public boolean hasLocation() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Location getLocation() {
      return this.location_ == null ? Location.getDefaultInstance() : this.location_;
   }

   @Override
   public LocationOrBuilder getLocationOrBuilder() {
      return this.location_ == null ? Location.getDefaultInstance() : this.location_;
   }

   @Override
   public boolean hasOwnerId() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Uuid getOwnerId() {
      return this.ownerId_ == null ? Uuid.getDefaultInstance() : this.ownerId_;
   }

   @Override
   public UuidOrBuilder getOwnerIdOrBuilder() {
      return this.ownerId_ == null ? Uuid.getDefaultInstance() : this.ownerId_;
   }

   @Override
   public String getOwnerName() {
      Object var1 = this.ownerName_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.ownerName_ = var3;
      return var3;
   }

   @Override
   public ByteString getOwnerNameBytes() {
      Object var1 = this.ownerName_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.ownerName_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasFlag() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public MarkerFlag getFlag() {
      return this.flag_ == null ? MarkerFlag.getDefaultInstance() : this.flag_;
   }

   @Override
   public MarkerFlagOrBuilder getFlagOrBuilder() {
      return this.flag_ == null ? MarkerFlag.getDefaultInstance() : this.flag_;
   }

   @Override
   public boolean hasTarget() {
      return (this.bitField0_ & 8) != 0;
   }

   @Override
   public MarkerTarget getTarget() {
      return this.target_ == null ? MarkerTarget.getDefaultInstance() : this.target_;
   }

   @Override
   public MarkerTargetOrBuilder getTargetOrBuilder() {
      return this.target_ == null ? MarkerTarget.getDefaultInstance() : this.target_;
   }

   @Override
   public boolean hasDuration() {
      return (this.bitField0_ & 16) != 0;
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
   public boolean getInGameNotification() {
      return this.inGameNotification_;
   }

   @Override
   public boolean getChatNotify() {
      return this.chatNotify_;
   }

   @Override
   public boolean getMiddleClickRemove() {
      return this.middleClickRemove_;
   }

   @Override
   public boolean hasStyle() {
      return (this.bitField0_ & 32) != 0;
   }

   @Override
   public MarkerStyle getStyle() {
      return this.style_ == null ? MarkerStyle.getDefaultInstance() : this.style_;
   }

   @Override
   public MarkerStyleOrBuilder getStyleOrBuilder() {
      return this.style_ == null ? MarkerStyle.getDefaultInstance() : this.style_;
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

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getLocation());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(3, this.getOwnerId());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.ownerName_)) {
         GeneratedMessageV3.writeString(var1, 4, this.ownerName_);
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(5, this.getFlag());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeMessage(6, this.getTarget());
      }

      if ((this.bitField0_ & 16) != 0) {
         var1.writeMessage(7, this.getDuration());
      }

      if (this.inGameNotification_) {
         var1.writeBool(8, this.inGameNotification_);
      }

      if (this.chatNotify_) {
         var1.writeBool(9, this.chatNotify_);
      }

      if (this.middleClickRemove_) {
         var1.writeBool(10, this.middleClickRemove_);
      }

      if ((this.bitField0_ & 32) != 0) {
         var1.writeMessage(11, this.getStyle());
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

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getLocation());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getOwnerId());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.ownerName_)) {
         var1 += GeneratedMessageV3.computeStringSize(4, this.ownerName_);
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(5, this.getFlag());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1 += CodedOutputStream.computeMessageSize(6, this.getTarget());
      }

      if ((this.bitField0_ & 16) != 0) {
         var1 += CodedOutputStream.computeMessageSize(7, this.getDuration());
      }

      if (this.inGameNotification_) {
         var1 += CodedOutputStream.computeBoolSize(8, this.inGameNotification_);
      }

      if (this.chatNotify_) {
         var1 += CodedOutputStream.computeBoolSize(9, this.chatNotify_);
      }

      if (this.middleClickRemove_) {
         var1 += CodedOutputStream.computeBoolSize(10, this.middleClickRemove_);
      }

      if ((this.bitField0_ & 32) != 0) {
         var1 += CodedOutputStream.computeMessageSize(11, this.getStyle());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof DisplayMarkerMessage)) {
         return super.equals(var1);
      } else {
         DisplayMarkerMessage var2 = (DisplayMarkerMessage)var1;
         if (!this.getId().equals(var2.getId())) {
            return false;
         } else if (this.hasLocation() != var2.hasLocation()) {
            return false;
         } else if (this.hasLocation() && !this.getLocation().equals(var2.getLocation())) {
            return false;
         } else if (this.hasOwnerId() != var2.hasOwnerId()) {
            return false;
         } else if (this.hasOwnerId() && !this.getOwnerId().equals(var2.getOwnerId())) {
            return false;
         } else if (!this.getOwnerName().equals(var2.getOwnerName())) {
            return false;
         } else if (this.hasFlag() != var2.hasFlag()) {
            return false;
         } else if (this.hasFlag() && !this.getFlag().equals(var2.getFlag())) {
            return false;
         } else if (this.hasTarget() != var2.hasTarget()) {
            return false;
         } else if (this.hasTarget() && !this.getTarget().equals(var2.getTarget())) {
            return false;
         } else if (this.hasDuration() != var2.hasDuration()) {
            return false;
         } else if (this.hasDuration() && !this.getDuration().equals(var2.getDuration())) {
            return false;
         } else if (this.getInGameNotification() != var2.getInGameNotification()) {
            return false;
         } else if (this.getChatNotify() != var2.getChatNotify()) {
            return false;
         } else if (this.getMiddleClickRemove() != var2.getMiddleClickRemove()) {
            return false;
         } else if (this.hasStyle() != var2.hasStyle()) {
            return false;
         } else {
            return this.hasStyle() && !this.getStyle().equals(var2.getStyle()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasLocation()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getLocation().hashCode();
      }

      if (this.hasOwnerId()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getOwnerId().hashCode();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getOwnerName().hashCode();
      if (this.hasFlag()) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getFlag().hashCode();
      }

      if (this.hasTarget()) {
         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + this.getTarget().hashCode();
      }

      if (this.hasDuration()) {
         var1 = 37 * var1 + 7;
         var1 = 53 * var1 + this.getDuration().hashCode();
      }

      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + Internal.hashBoolean(this.getInGameNotification());
      var1 = 37 * var1 + 9;
      var1 = 53 * var1 + Internal.hashBoolean(this.getChatNotify());
      var1 = 37 * var1 + 10;
      var1 = 53 * var1 + Internal.hashBoolean(this.getMiddleClickRemove());
      if (this.hasStyle()) {
         var1 = 37 * var1 + 11;
         var1 = 53 * var1 + this.getStyle().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DisplayMarkerMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayMarkerMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayMarkerMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayMarkerMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayMarkerMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayMarkerMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayMarkerMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayMarkerMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DisplayMarkerMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DisplayMarkerMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DisplayMarkerMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayMarkerMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DisplayMarkerMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DisplayMarkerMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DisplayMarkerMessage.Builder newBuilder(DisplayMarkerMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DisplayMarkerMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DisplayMarkerMessage.Builder() : new DisplayMarkerMessage.Builder().mergeFrom(this);
   }

   protected DisplayMarkerMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DisplayMarkerMessage.Builder(var1);
   }

   public static DisplayMarkerMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DisplayMarkerMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<DisplayMarkerMessage> getParserForType() {
      return PARSER;
   }

   public DisplayMarkerMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<DisplayMarkerMessage.Builder> implements DisplayMarkerMessageOrBuilder {
      private int bitField0_;
      private Object id_ = "";
      private Location location_;
      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> locationBuilder_;
      private Uuid ownerId_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> ownerIdBuilder_;
      private Object ownerName_ = "";
      private MarkerFlag flag_;
      private SingleFieldBuilderV3<MarkerFlag, MarkerFlag.Builder, MarkerFlagOrBuilder> flagBuilder_;
      private MarkerTarget target_;
      private SingleFieldBuilderV3<MarkerTarget, MarkerTarget.Builder, MarkerTargetOrBuilder> targetBuilder_;
      private Duration duration_;
      private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> durationBuilder_;
      private boolean inGameNotification_;
      private boolean chatNotify_;
      private boolean middleClickRemove_;
      private MarkerStyle style_;
      private SingleFieldBuilderV3<MarkerStyle, MarkerStyle.Builder, MarkerStyleOrBuilder> styleBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_DisplayMarkerMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_DisplayMarkerMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DisplayMarkerMessage.class, DisplayMarkerMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (DisplayMarkerMessage.alwaysUseFieldBuilders) {
            this.getLocationFieldBuilder();
            this.getOwnerIdFieldBuilder();
            this.getFlagFieldBuilder();
            this.getTargetFieldBuilder();
            this.getDurationFieldBuilder();
            this.getStyleFieldBuilder();
         }
      }

      public DisplayMarkerMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = "";
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.ownerId_ = null;
         if (this.ownerIdBuilder_ != null) {
            this.ownerIdBuilder_.dispose();
            this.ownerIdBuilder_ = null;
         }

         this.ownerName_ = "";
         this.flag_ = null;
         if (this.flagBuilder_ != null) {
            this.flagBuilder_.dispose();
            this.flagBuilder_ = null;
         }

         this.target_ = null;
         if (this.targetBuilder_ != null) {
            this.targetBuilder_.dispose();
            this.targetBuilder_ = null;
         }

         this.duration_ = null;
         if (this.durationBuilder_ != null) {
            this.durationBuilder_.dispose();
            this.durationBuilder_ = null;
         }

         this.inGameNotification_ = false;
         this.chatNotify_ = false;
         this.middleClickRemove_ = false;
         this.style_ = null;
         if (this.styleBuilder_ != null) {
            this.styleBuilder_.dispose();
            this.styleBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_DisplayMarkerMessage_descriptor;
      }

      public DisplayMarkerMessage getDefaultInstanceForType() {
         return DisplayMarkerMessage.getDefaultInstance();
      }

      public DisplayMarkerMessage build() {
         DisplayMarkerMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DisplayMarkerMessage buildPartial() {
         DisplayMarkerMessage var1 = new DisplayMarkerMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(DisplayMarkerMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.location_ = this.locationBuilder_ == null ? this.location_ : this.locationBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            var1.ownerId_ = this.ownerIdBuilder_ == null ? this.ownerId_ : this.ownerIdBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 8) != 0) {
            var1.ownerName_ = this.ownerName_;
         }

         if ((var2 & 16) != 0) {
            var1.flag_ = this.flagBuilder_ == null ? this.flag_ : this.flagBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 32) != 0) {
            var1.target_ = this.targetBuilder_ == null ? this.target_ : this.targetBuilder_.build();
            var3 |= 8;
         }

         if ((var2 & 64) != 0) {
            var1.duration_ = this.durationBuilder_ == null ? this.duration_ : this.durationBuilder_.build();
            var3 |= 16;
         }

         if ((var2 & 128) != 0) {
            var1.inGameNotification_ = this.inGameNotification_;
         }

         if ((var2 & 256) != 0) {
            var1.chatNotify_ = this.chatNotify_;
         }

         if ((var2 & 512) != 0) {
            var1.middleClickRemove_ = this.middleClickRemove_;
         }

         if ((var2 & 1024) != 0) {
            var1.style_ = this.styleBuilder_ == null ? this.style_ : this.styleBuilder_.build();
            var3 |= 32;
         }

         DisplayMarkerMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public DisplayMarkerMessage.Builder clone() {
         return (DisplayMarkerMessage.Builder)super.clone();
      }

      public DisplayMarkerMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayMarkerMessage.Builder)super.setField(var1, var2);
      }

      public DisplayMarkerMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DisplayMarkerMessage.Builder)super.clearField(var1);
      }

      public DisplayMarkerMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DisplayMarkerMessage.Builder)super.clearOneof(var1);
      }

      public DisplayMarkerMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DisplayMarkerMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DisplayMarkerMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayMarkerMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public DisplayMarkerMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof DisplayMarkerMessage) {
            return this.mergeFrom((DisplayMarkerMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DisplayMarkerMessage.Builder mergeFrom(DisplayMarkerMessage var1) {
         if (var1 == DisplayMarkerMessage.getDefaultInstance()) {
            return this;
         }

         if (!var1.getId().isEmpty()) {
            this.id_ = var1.id_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.hasLocation()) {
            this.mergeLocation(var1.getLocation());
         }

         if (var1.hasOwnerId()) {
            this.mergeOwnerId(var1.getOwnerId());
         }

         if (!var1.getOwnerName().isEmpty()) {
            this.ownerName_ = var1.ownerName_;
            this.bitField0_ |= 8;
            this.onChanged();
         }

         if (var1.hasFlag()) {
            this.mergeFlag(var1.getFlag());
         }

         if (var1.hasTarget()) {
            this.mergeTarget(var1.getTarget());
         }

         if (var1.hasDuration()) {
            this.mergeDuration(var1.getDuration());
         }

         if (var1.getInGameNotification()) {
            this.setInGameNotification(var1.getInGameNotification());
         }

         if (var1.getChatNotify()) {
            this.setChatNotify(var1.getChatNotify());
         }

         if (var1.getMiddleClickRemove()) {
            this.setMiddleClickRemove(var1.getMiddleClickRemove());
         }

         if (var1.hasStyle()) {
            this.mergeStyle(var1.getStyle());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public DisplayMarkerMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getLocationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getOwnerIdFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     this.ownerName_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     var1.readMessage(this.getFlagFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     var1.readMessage(this.getTargetFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 32;
                     break;
                  case 58:
                     var1.readMessage(this.getDurationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 64;
                     break;
                  case 64:
                     this.inGameNotification_ = var1.readBool();
                     this.bitField0_ |= 128;
                     break;
                  case 72:
                     this.chatNotify_ = var1.readBool();
                     this.bitField0_ |= 256;
                     break;
                  case 80:
                     this.middleClickRemove_ = var1.readBool();
                     this.bitField0_ |= 512;
                     break;
                  case 90:
                     var1.readMessage(this.getStyleFieldBuilder().getBuilder(), var2);
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

      public DisplayMarkerMessage.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public DisplayMarkerMessage.Builder clearId() {
         this.id_ = DisplayMarkerMessage.getDefaultInstance().getId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public DisplayMarkerMessage.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         DisplayMarkerMessage.checkByteStringIsUtf8(var1);
         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasLocation() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Location getLocation() {
         if (this.locationBuilder_ == null) {
            return this.location_ == null ? Location.getDefaultInstance() : this.location_;
         } else {
            return this.locationBuilder_.getMessage();
         }
      }

      public DisplayMarkerMessage.Builder setLocation(Location var1) {
         if (this.locationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
         } else {
            this.locationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public DisplayMarkerMessage.Builder setLocation(Location.Builder var1) {
         if (this.locationBuilder_ == null) {
            this.location_ = var1.build();
         } else {
            this.locationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public DisplayMarkerMessage.Builder mergeLocation(Location var1) {
         if (this.locationBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.location_ != null && this.location_ != Location.getDefaultInstance()) {
               this.getLocationBuilder().mergeFrom(var1);
            } else {
               this.location_ = var1;
            }
         } else {
            this.locationBuilder_.mergeFrom(var1);
         }

         if (this.location_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public DisplayMarkerMessage.Builder clearLocation() {
         this.bitField0_ &= -3;
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Location.Builder getLocationBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getLocationFieldBuilder().getBuilder();
      }

      @Override
      public LocationOrBuilder getLocationOrBuilder() {
         if (this.locationBuilder_ != null) {
            return this.locationBuilder_.getMessageOrBuilder();
         } else {
            return this.location_ == null ? Location.getDefaultInstance() : this.location_;
         }
      }

      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> getLocationFieldBuilder() {
         if (this.locationBuilder_ == null) {
            this.locationBuilder_ = new SingleFieldBuilderV3<>(this.getLocation(), this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         return this.locationBuilder_;
      }

      @Override
      public boolean hasOwnerId() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Uuid getOwnerId() {
         if (this.ownerIdBuilder_ == null) {
            return this.ownerId_ == null ? Uuid.getDefaultInstance() : this.ownerId_;
         } else {
            return this.ownerIdBuilder_.getMessage();
         }
      }

      public DisplayMarkerMessage.Builder setOwnerId(Uuid var1) {
         if (this.ownerIdBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ownerId_ = var1;
         } else {
            this.ownerIdBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public DisplayMarkerMessage.Builder setOwnerId(Uuid.Builder var1) {
         if (this.ownerIdBuilder_ == null) {
            this.ownerId_ = var1.build();
         } else {
            this.ownerIdBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public DisplayMarkerMessage.Builder mergeOwnerId(Uuid var1) {
         if (this.ownerIdBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.ownerId_ != null && this.ownerId_ != Uuid.getDefaultInstance()) {
               this.getOwnerIdBuilder().mergeFrom(var1);
            } else {
               this.ownerId_ = var1;
            }
         } else {
            this.ownerIdBuilder_.mergeFrom(var1);
         }

         if (this.ownerId_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public DisplayMarkerMessage.Builder clearOwnerId() {
         this.bitField0_ &= -5;
         this.ownerId_ = null;
         if (this.ownerIdBuilder_ != null) {
            this.ownerIdBuilder_.dispose();
            this.ownerIdBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getOwnerIdBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getOwnerIdFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getOwnerIdOrBuilder() {
         if (this.ownerIdBuilder_ != null) {
            return this.ownerIdBuilder_.getMessageOrBuilder();
         } else {
            return this.ownerId_ == null ? Uuid.getDefaultInstance() : this.ownerId_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getOwnerIdFieldBuilder() {
         if (this.ownerIdBuilder_ == null) {
            this.ownerIdBuilder_ = new SingleFieldBuilderV3<>(this.getOwnerId(), this.getParentForChildren(), this.isClean());
            this.ownerId_ = null;
         }

         return this.ownerIdBuilder_;
      }

      @Override
      public String getOwnerName() {
         Object var1 = this.ownerName_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.ownerName_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getOwnerNameBytes() {
         Object var1 = this.ownerName_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.ownerName_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public DisplayMarkerMessage.Builder setOwnerName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ownerName_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public DisplayMarkerMessage.Builder clearOwnerName() {
         this.ownerName_ = DisplayMarkerMessage.getDefaultInstance().getOwnerName();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      public DisplayMarkerMessage.Builder setOwnerNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         DisplayMarkerMessage.checkByteStringIsUtf8(var1);
         this.ownerName_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasFlag() {
         return (this.bitField0_ & 16) != 0;
      }

      @Override
      public MarkerFlag getFlag() {
         if (this.flagBuilder_ == null) {
            return this.flag_ == null ? MarkerFlag.getDefaultInstance() : this.flag_;
         } else {
            return this.flagBuilder_.getMessage();
         }
      }

      public DisplayMarkerMessage.Builder setFlag(MarkerFlag var1) {
         if (this.flagBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.flag_ = var1;
         } else {
            this.flagBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public DisplayMarkerMessage.Builder setFlag(MarkerFlag.Builder var1) {
         if (this.flagBuilder_ == null) {
            this.flag_ = var1.build();
         } else {
            this.flagBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public DisplayMarkerMessage.Builder mergeFlag(MarkerFlag var1) {
         if (this.flagBuilder_ == null) {
            if ((this.bitField0_ & 16) != 0 && this.flag_ != null && this.flag_ != MarkerFlag.getDefaultInstance()) {
               this.getFlagBuilder().mergeFrom(var1);
            } else {
               this.flag_ = var1;
            }
         } else {
            this.flagBuilder_.mergeFrom(var1);
         }

         if (this.flag_ != null) {
            this.bitField0_ |= 16;
            this.onChanged();
         }

         return this;
      }

      public DisplayMarkerMessage.Builder clearFlag() {
         this.bitField0_ &= -17;
         this.flag_ = null;
         if (this.flagBuilder_ != null) {
            this.flagBuilder_.dispose();
            this.flagBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public MarkerFlag.Builder getFlagBuilder() {
         this.bitField0_ |= 16;
         this.onChanged();
         return this.getFlagFieldBuilder().getBuilder();
      }

      @Override
      public MarkerFlagOrBuilder getFlagOrBuilder() {
         if (this.flagBuilder_ != null) {
            return this.flagBuilder_.getMessageOrBuilder();
         } else {
            return this.flag_ == null ? MarkerFlag.getDefaultInstance() : this.flag_;
         }
      }

      private SingleFieldBuilderV3<MarkerFlag, MarkerFlag.Builder, MarkerFlagOrBuilder> getFlagFieldBuilder() {
         if (this.flagBuilder_ == null) {
            this.flagBuilder_ = new SingleFieldBuilderV3<>(this.getFlag(), this.getParentForChildren(), this.isClean());
            this.flag_ = null;
         }

         return this.flagBuilder_;
      }

      @Override
      public boolean hasTarget() {
         return (this.bitField0_ & 32) != 0;
      }

      @Override
      public MarkerTarget getTarget() {
         if (this.targetBuilder_ == null) {
            return this.target_ == null ? MarkerTarget.getDefaultInstance() : this.target_;
         } else {
            return this.targetBuilder_.getMessage();
         }
      }

      public DisplayMarkerMessage.Builder setTarget(MarkerTarget var1) {
         if (this.targetBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.target_ = var1;
         } else {
            this.targetBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public DisplayMarkerMessage.Builder setTarget(MarkerTarget.Builder var1) {
         if (this.targetBuilder_ == null) {
            this.target_ = var1.build();
         } else {
            this.targetBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public DisplayMarkerMessage.Builder mergeTarget(MarkerTarget var1) {
         if (this.targetBuilder_ == null) {
            if ((this.bitField0_ & 32) != 0 && this.target_ != null && this.target_ != MarkerTarget.getDefaultInstance()) {
               this.getTargetBuilder().mergeFrom(var1);
            } else {
               this.target_ = var1;
            }
         } else {
            this.targetBuilder_.mergeFrom(var1);
         }

         if (this.target_ != null) {
            this.bitField0_ |= 32;
            this.onChanged();
         }

         return this;
      }

      public DisplayMarkerMessage.Builder clearTarget() {
         this.bitField0_ &= -33;
         this.target_ = null;
         if (this.targetBuilder_ != null) {
            this.targetBuilder_.dispose();
            this.targetBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public MarkerTarget.Builder getTargetBuilder() {
         this.bitField0_ |= 32;
         this.onChanged();
         return this.getTargetFieldBuilder().getBuilder();
      }

      @Override
      public MarkerTargetOrBuilder getTargetOrBuilder() {
         if (this.targetBuilder_ != null) {
            return this.targetBuilder_.getMessageOrBuilder();
         } else {
            return this.target_ == null ? MarkerTarget.getDefaultInstance() : this.target_;
         }
      }

      private SingleFieldBuilderV3<MarkerTarget, MarkerTarget.Builder, MarkerTargetOrBuilder> getTargetFieldBuilder() {
         if (this.targetBuilder_ == null) {
            this.targetBuilder_ = new SingleFieldBuilderV3<>(this.getTarget(), this.getParentForChildren(), this.isClean());
            this.target_ = null;
         }

         return this.targetBuilder_;
      }

      @Override
      public boolean hasDuration() {
         return (this.bitField0_ & 64) != 0;
      }

      @Override
      public Duration getDuration() {
         if (this.durationBuilder_ == null) {
            return this.duration_ == null ? Duration.getDefaultInstance() : this.duration_;
         } else {
            return this.durationBuilder_.getMessage();
         }
      }

      public DisplayMarkerMessage.Builder setDuration(Duration var1) {
         if (this.durationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.duration_ = var1;
         } else {
            this.durationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public DisplayMarkerMessage.Builder setDuration(Duration.Builder var1) {
         if (this.durationBuilder_ == null) {
            this.duration_ = var1.build();
         } else {
            this.durationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public DisplayMarkerMessage.Builder mergeDuration(Duration var1) {
         if (this.durationBuilder_ == null) {
            if ((this.bitField0_ & 64) != 0 && this.duration_ != null && this.duration_ != Duration.getDefaultInstance()) {
               this.getDurationBuilder().mergeFrom(var1);
            } else {
               this.duration_ = var1;
            }
         } else {
            this.durationBuilder_.mergeFrom(var1);
         }

         if (this.duration_ != null) {
            this.bitField0_ |= 64;
            this.onChanged();
         }

         return this;
      }

      public DisplayMarkerMessage.Builder clearDuration() {
         this.bitField0_ &= -65;
         this.duration_ = null;
         if (this.durationBuilder_ != null) {
            this.durationBuilder_.dispose();
            this.durationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Duration.Builder getDurationBuilder() {
         this.bitField0_ |= 64;
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
      public boolean getInGameNotification() {
         return this.inGameNotification_;
      }

      public DisplayMarkerMessage.Builder setInGameNotification(boolean var1) {
         this.inGameNotification_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public DisplayMarkerMessage.Builder clearInGameNotification() {
         this.bitField0_ &= -129;
         this.inGameNotification_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getChatNotify() {
         return this.chatNotify_;
      }

      public DisplayMarkerMessage.Builder setChatNotify(boolean var1) {
         this.chatNotify_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public DisplayMarkerMessage.Builder clearChatNotify() {
         this.bitField0_ &= -257;
         this.chatNotify_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getMiddleClickRemove() {
         return this.middleClickRemove_;
      }

      public DisplayMarkerMessage.Builder setMiddleClickRemove(boolean var1) {
         this.middleClickRemove_ = var1;
         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      public DisplayMarkerMessage.Builder clearMiddleClickRemove() {
         this.bitField0_ &= -513;
         this.middleClickRemove_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasStyle() {
         return (this.bitField0_ & 1024) != 0;
      }

      @Override
      public MarkerStyle getStyle() {
         if (this.styleBuilder_ == null) {
            return this.style_ == null ? MarkerStyle.getDefaultInstance() : this.style_;
         } else {
            return this.styleBuilder_.getMessage();
         }
      }

      public DisplayMarkerMessage.Builder setStyle(MarkerStyle var1) {
         if (this.styleBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.style_ = var1;
         } else {
            this.styleBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1024;
         this.onChanged();
         return this;
      }

      public DisplayMarkerMessage.Builder setStyle(MarkerStyle.Builder var1) {
         if (this.styleBuilder_ == null) {
            this.style_ = var1.build();
         } else {
            this.styleBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1024;
         this.onChanged();
         return this;
      }

      public DisplayMarkerMessage.Builder mergeStyle(MarkerStyle var1) {
         if (this.styleBuilder_ == null) {
            if ((this.bitField0_ & 1024) != 0 && this.style_ != null && this.style_ != MarkerStyle.getDefaultInstance()) {
               this.getStyleBuilder().mergeFrom(var1);
            } else {
               this.style_ = var1;
            }
         } else {
            this.styleBuilder_.mergeFrom(var1);
         }

         if (this.style_ != null) {
            this.bitField0_ |= 1024;
            this.onChanged();
         }

         return this;
      }

      public DisplayMarkerMessage.Builder clearStyle() {
         this.bitField0_ &= -1025;
         this.style_ = null;
         if (this.styleBuilder_ != null) {
            this.styleBuilder_.dispose();
            this.styleBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public MarkerStyle.Builder getStyleBuilder() {
         this.bitField0_ |= 1024;
         this.onChanged();
         return this.getStyleFieldBuilder().getBuilder();
      }

      @Override
      public MarkerStyleOrBuilder getStyleOrBuilder() {
         if (this.styleBuilder_ != null) {
            return this.styleBuilder_.getMessageOrBuilder();
         } else {
            return this.style_ == null ? MarkerStyle.getDefaultInstance() : this.style_;
         }
      }

      private SingleFieldBuilderV3<MarkerStyle, MarkerStyle.Builder, MarkerStyleOrBuilder> getStyleFieldBuilder() {
         if (this.styleBuilder_ == null) {
            this.styleBuilder_ = new SingleFieldBuilderV3<>(this.getStyle(), this.getParentForChildren(), this.isClean());
            this.style_ = null;
         }

         return this.styleBuilder_;
      }

      public final DisplayMarkerMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DisplayMarkerMessage.Builder)super.setUnknownFields(var1);
      }

      public final DisplayMarkerMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DisplayMarkerMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
