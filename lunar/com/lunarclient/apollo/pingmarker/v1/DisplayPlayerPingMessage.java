package com.lunarclient.apollo.pingmarker.v1;

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
import com.lunarclient.apollo.common.v1.Icon;
import com.lunarclient.apollo.common.v1.IconOrBuilder;
import com.lunarclient.apollo.common.v1.Location;
import com.lunarclient.apollo.common.v1.LocationOrBuilder;
import com.lunarclient.apollo.common.v1.Sound;
import com.lunarclient.apollo.common.v1.SoundOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DisplayPlayerPingMessage extends GeneratedMessageV3 implements DisplayPlayerPingMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ID_FIELD_NUMBER = 1;
   private Uuid id_;
   public static final int TYPE_FIELD_NUMBER = 2;
   private volatile Object type_ = "";
   public static final int LOCATION_FIELD_NUMBER = 3;
   private Location location_;
   public static final int COLOR_FIELD_NUMBER = 4;
   private Color color_;
   public static final int ICON_FIELD_NUMBER = 5;
   private Icon icon_;
   public static final int SOUND_FIELD_NUMBER = 6;
   private Sound sound_;
   public static final int DURATION_FIELD_NUMBER = 7;
   private Duration duration_;
   public static final int FOCUS_FIELD_NUMBER = 8;
   private boolean focus_ = false;
   private byte memoizedIsInitialized = -1;
   private static final DisplayPlayerPingMessage DEFAULT_INSTANCE = new DisplayPlayerPingMessage();
   private static final Parser<DisplayPlayerPingMessage> PARSER = new AbstractParser<DisplayPlayerPingMessage>() {
      public DisplayPlayerPingMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DisplayPlayerPingMessage.Builder var3 = DisplayPlayerPingMessage.newBuilder();

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

   private DisplayPlayerPingMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DisplayPlayerPingMessage() {
      this.type_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DisplayPlayerPingMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_DisplayPlayerPingMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_DisplayPlayerPingMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DisplayPlayerPingMessage.class, DisplayPlayerPingMessage.Builder.class);
   }

   @Override
   public boolean hasId() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getId() {
      return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
   }

   @Override
   public UuidOrBuilder getIdOrBuilder() {
      return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
   }

   @Override
   public String getType() {
      Object var1 = this.type_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.type_ = var3;
      return var3;
   }

   @Override
   public ByteString getTypeBytes() {
      Object var1 = this.type_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.type_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasLocation() {
      return (this.bitField0_ & 2) != 0;
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
   public boolean hasColor() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public Color getColor() {
      return this.color_ == null ? Color.getDefaultInstance() : this.color_;
   }

   @Override
   public ColorOrBuilder getColorOrBuilder() {
      return this.color_ == null ? Color.getDefaultInstance() : this.color_;
   }

   @Override
   public boolean hasIcon() {
      return (this.bitField0_ & 8) != 0;
   }

   @Override
   public Icon getIcon() {
      return this.icon_ == null ? Icon.getDefaultInstance() : this.icon_;
   }

   @Override
   public IconOrBuilder getIconOrBuilder() {
      return this.icon_ == null ? Icon.getDefaultInstance() : this.icon_;
   }

   @Override
   public boolean hasSound() {
      return (this.bitField0_ & 16) != 0;
   }

   @Override
   public Sound getSound() {
      return this.sound_ == null ? Sound.getDefaultInstance() : this.sound_;
   }

   @Override
   public SoundOrBuilder getSoundOrBuilder() {
      return this.sound_ == null ? Sound.getDefaultInstance() : this.sound_;
   }

   @Override
   public boolean hasDuration() {
      return (this.bitField0_ & 32) != 0;
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
   public boolean getFocus() {
      return this.focus_;
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
      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(1, this.getId());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.type_)) {
         GeneratedMessageV3.writeString(var1, 2, this.type_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(3, this.getLocation());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(4, this.getColor());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeMessage(5, this.getIcon());
      }

      if ((this.bitField0_ & 16) != 0) {
         var1.writeMessage(6, this.getSound());
      }

      if ((this.bitField0_ & 32) != 0) {
         var1.writeMessage(7, this.getDuration());
      }

      if (this.focus_) {
         var1.writeBool(8, this.focus_);
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
      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(1, this.getId());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.type_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.type_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getLocation());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getColor());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1 += CodedOutputStream.computeMessageSize(5, this.getIcon());
      }

      if ((this.bitField0_ & 16) != 0) {
         var1 += CodedOutputStream.computeMessageSize(6, this.getSound());
      }

      if ((this.bitField0_ & 32) != 0) {
         var1 += CodedOutputStream.computeMessageSize(7, this.getDuration());
      }

      if (this.focus_) {
         var1 += CodedOutputStream.computeBoolSize(8, this.focus_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof DisplayPlayerPingMessage)) {
         return super.equals(var1);
      } else {
         DisplayPlayerPingMessage var2 = (DisplayPlayerPingMessage)var1;
         if (this.hasId() != var2.hasId()) {
            return false;
         } else if (this.hasId() && !this.getId().equals(var2.getId())) {
            return false;
         } else if (!this.getType().equals(var2.getType())) {
            return false;
         } else if (this.hasLocation() != var2.hasLocation()) {
            return false;
         } else if (this.hasLocation() && !this.getLocation().equals(var2.getLocation())) {
            return false;
         } else if (this.hasColor() != var2.hasColor()) {
            return false;
         } else if (this.hasColor() && !this.getColor().equals(var2.getColor())) {
            return false;
         } else if (this.hasIcon() != var2.hasIcon()) {
            return false;
         } else if (this.hasIcon() && !this.getIcon().equals(var2.getIcon())) {
            return false;
         } else if (this.hasSound() != var2.hasSound()) {
            return false;
         } else if (this.hasSound() && !this.getSound().equals(var2.getSound())) {
            return false;
         } else if (this.hasDuration() != var2.hasDuration()) {
            return false;
         } else if (this.hasDuration() && !this.getDuration().equals(var2.getDuration())) {
            return false;
         } else {
            return this.getFocus() != var2.getFocus() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasId()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getId().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getType().hashCode();
      if (this.hasLocation()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getLocation().hashCode();
      }

      if (this.hasColor()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getColor().hashCode();
      }

      if (this.hasIcon()) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getIcon().hashCode();
      }

      if (this.hasSound()) {
         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + this.getSound().hashCode();
      }

      if (this.hasDuration()) {
         var1 = 37 * var1 + 7;
         var1 = 53 * var1 + this.getDuration().hashCode();
      }

      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + Internal.hashBoolean(this.getFocus());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DisplayPlayerPingMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayPlayerPingMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayPlayerPingMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayPlayerPingMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayPlayerPingMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayPlayerPingMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayPlayerPingMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayPlayerPingMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DisplayPlayerPingMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DisplayPlayerPingMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DisplayPlayerPingMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayPlayerPingMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DisplayPlayerPingMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DisplayPlayerPingMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DisplayPlayerPingMessage.Builder newBuilder(DisplayPlayerPingMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DisplayPlayerPingMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DisplayPlayerPingMessage.Builder() : new DisplayPlayerPingMessage.Builder().mergeFrom(this);
   }

   protected DisplayPlayerPingMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DisplayPlayerPingMessage.Builder(var1);
   }

   public static DisplayPlayerPingMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DisplayPlayerPingMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<DisplayPlayerPingMessage> getParserForType() {
      return PARSER;
   }

   public DisplayPlayerPingMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<DisplayPlayerPingMessage.Builder> implements DisplayPlayerPingMessageOrBuilder {
      private int bitField0_;
      private Uuid id_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> idBuilder_;
      private Object type_ = "";
      private Location location_;
      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> locationBuilder_;
      private Color color_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> colorBuilder_;
      private Icon icon_;
      private SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> iconBuilder_;
      private Sound sound_;
      private SingleFieldBuilderV3<Sound, Sound.Builder, SoundOrBuilder> soundBuilder_;
      private Duration duration_;
      private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> durationBuilder_;
      private boolean focus_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_DisplayPlayerPingMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_DisplayPlayerPingMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DisplayPlayerPingMessage.class, DisplayPlayerPingMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (DisplayPlayerPingMessage.alwaysUseFieldBuilders) {
            this.getIdFieldBuilder();
            this.getLocationFieldBuilder();
            this.getColorFieldBuilder();
            this.getIconFieldBuilder();
            this.getSoundFieldBuilder();
            this.getDurationFieldBuilder();
         }
      }

      public DisplayPlayerPingMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = null;
         if (this.idBuilder_ != null) {
            this.idBuilder_.dispose();
            this.idBuilder_ = null;
         }

         this.type_ = "";
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.color_ = null;
         if (this.colorBuilder_ != null) {
            this.colorBuilder_.dispose();
            this.colorBuilder_ = null;
         }

         this.icon_ = null;
         if (this.iconBuilder_ != null) {
            this.iconBuilder_.dispose();
            this.iconBuilder_ = null;
         }

         this.sound_ = null;
         if (this.soundBuilder_ != null) {
            this.soundBuilder_.dispose();
            this.soundBuilder_ = null;
         }

         this.duration_ = null;
         if (this.durationBuilder_ != null) {
            this.durationBuilder_.dispose();
            this.durationBuilder_ = null;
         }

         this.focus_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_DisplayPlayerPingMessage_descriptor;
      }

      public DisplayPlayerPingMessage getDefaultInstanceForType() {
         return DisplayPlayerPingMessage.getDefaultInstance();
      }

      public DisplayPlayerPingMessage build() {
         DisplayPlayerPingMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DisplayPlayerPingMessage buildPartial() {
         DisplayPlayerPingMessage var1 = new DisplayPlayerPingMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(DisplayPlayerPingMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.id_ = this.idBuilder_ == null ? this.id_ : this.idBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.type_ = this.type_;
         }

         if ((var2 & 4) != 0) {
            var1.location_ = this.locationBuilder_ == null ? this.location_ : this.locationBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 8) != 0) {
            var1.color_ = this.colorBuilder_ == null ? this.color_ : this.colorBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 16) != 0) {
            var1.icon_ = this.iconBuilder_ == null ? this.icon_ : this.iconBuilder_.build();
            var3 |= 8;
         }

         if ((var2 & 32) != 0) {
            var1.sound_ = this.soundBuilder_ == null ? this.sound_ : this.soundBuilder_.build();
            var3 |= 16;
         }

         if ((var2 & 64) != 0) {
            var1.duration_ = this.durationBuilder_ == null ? this.duration_ : this.durationBuilder_.build();
            var3 |= 32;
         }

         if ((var2 & 128) != 0) {
            var1.focus_ = this.focus_;
         }

         DisplayPlayerPingMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public DisplayPlayerPingMessage.Builder clone() {
         return (DisplayPlayerPingMessage.Builder)super.clone();
      }

      public DisplayPlayerPingMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayPlayerPingMessage.Builder)super.setField(var1, var2);
      }

      public DisplayPlayerPingMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DisplayPlayerPingMessage.Builder)super.clearField(var1);
      }

      public DisplayPlayerPingMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DisplayPlayerPingMessage.Builder)super.clearOneof(var1);
      }

      public DisplayPlayerPingMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DisplayPlayerPingMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DisplayPlayerPingMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayPlayerPingMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public DisplayPlayerPingMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof DisplayPlayerPingMessage) {
            return this.mergeFrom((DisplayPlayerPingMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DisplayPlayerPingMessage.Builder mergeFrom(DisplayPlayerPingMessage var1) {
         if (var1 == DisplayPlayerPingMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.hasId()) {
            this.mergeId(var1.getId());
         }

         if (!var1.getType().isEmpty()) {
            this.type_ = var1.type_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (var1.hasLocation()) {
            this.mergeLocation(var1.getLocation());
         }

         if (var1.hasColor()) {
            this.mergeColor(var1.getColor());
         }

         if (var1.hasIcon()) {
            this.mergeIcon(var1.getIcon());
         }

         if (var1.hasSound()) {
            this.mergeSound(var1.getSound());
         }

         if (var1.hasDuration()) {
            this.mergeDuration(var1.getDuration());
         }

         if (var1.getFocus()) {
            this.setFocus(var1.getFocus());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public DisplayPlayerPingMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getIdFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.type_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getLocationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     var1.readMessage(this.getColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     var1.readMessage(this.getIconFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     var1.readMessage(this.getSoundFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 32;
                     break;
                  case 58:
                     var1.readMessage(this.getDurationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 64;
                     break;
                  case 64:
                     this.focus_ = var1.readBool();
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
      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getId() {
         if (this.idBuilder_ == null) {
            return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
         } else {
            return this.idBuilder_.getMessage();
         }
      }

      public DisplayPlayerPingMessage.Builder setId(Uuid var1) {
         if (this.idBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.id_ = var1;
         } else {
            this.idBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public DisplayPlayerPingMessage.Builder setId(Uuid.Builder var1) {
         if (this.idBuilder_ == null) {
            this.id_ = var1.build();
         } else {
            this.idBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public DisplayPlayerPingMessage.Builder mergeId(Uuid var1) {
         if (this.idBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.id_ != null && this.id_ != Uuid.getDefaultInstance()) {
               this.getIdBuilder().mergeFrom(var1);
            } else {
               this.id_ = var1;
            }
         } else {
            this.idBuilder_.mergeFrom(var1);
         }

         if (this.id_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public DisplayPlayerPingMessage.Builder clearId() {
         this.bitField0_ &= -2;
         this.id_ = null;
         if (this.idBuilder_ != null) {
            this.idBuilder_.dispose();
            this.idBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getIdBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getIdFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getIdOrBuilder() {
         if (this.idBuilder_ != null) {
            return this.idBuilder_.getMessageOrBuilder();
         } else {
            return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getIdFieldBuilder() {
         if (this.idBuilder_ == null) {
            this.idBuilder_ = new SingleFieldBuilderV3<>(this.getId(), this.getParentForChildren(), this.isClean());
            this.id_ = null;
         }

         return this.idBuilder_;
      }

      @Override
      public String getType() {
         Object var1 = this.type_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.type_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getTypeBytes() {
         Object var1 = this.type_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.type_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public DisplayPlayerPingMessage.Builder setType(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.type_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public DisplayPlayerPingMessage.Builder clearType() {
         this.type_ = DisplayPlayerPingMessage.getDefaultInstance().getType();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public DisplayPlayerPingMessage.Builder setTypeBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         DisplayPlayerPingMessage.checkByteStringIsUtf8(var1);
         this.type_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasLocation() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Location getLocation() {
         if (this.locationBuilder_ == null) {
            return this.location_ == null ? Location.getDefaultInstance() : this.location_;
         } else {
            return this.locationBuilder_.getMessage();
         }
      }

      public DisplayPlayerPingMessage.Builder setLocation(Location var1) {
         if (this.locationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
         } else {
            this.locationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public DisplayPlayerPingMessage.Builder setLocation(Location.Builder var1) {
         if (this.locationBuilder_ == null) {
            this.location_ = var1.build();
         } else {
            this.locationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public DisplayPlayerPingMessage.Builder mergeLocation(Location var1) {
         if (this.locationBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.location_ != null && this.location_ != Location.getDefaultInstance()) {
               this.getLocationBuilder().mergeFrom(var1);
            } else {
               this.location_ = var1;
            }
         } else {
            this.locationBuilder_.mergeFrom(var1);
         }

         if (this.location_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public DisplayPlayerPingMessage.Builder clearLocation() {
         this.bitField0_ &= -5;
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Location.Builder getLocationBuilder() {
         this.bitField0_ |= 4;
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
      public boolean hasColor() {
         return (this.bitField0_ & 8) != 0;
      }

      @Override
      public Color getColor() {
         if (this.colorBuilder_ == null) {
            return this.color_ == null ? Color.getDefaultInstance() : this.color_;
         } else {
            return this.colorBuilder_.getMessage();
         }
      }

      public DisplayPlayerPingMessage.Builder setColor(Color var1) {
         if (this.colorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.color_ = var1;
         } else {
            this.colorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public DisplayPlayerPingMessage.Builder setColor(Color.Builder var1) {
         if (this.colorBuilder_ == null) {
            this.color_ = var1.build();
         } else {
            this.colorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public DisplayPlayerPingMessage.Builder mergeColor(Color var1) {
         if (this.colorBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0 && this.color_ != null && this.color_ != Color.getDefaultInstance()) {
               this.getColorBuilder().mergeFrom(var1);
            } else {
               this.color_ = var1;
            }
         } else {
            this.colorBuilder_.mergeFrom(var1);
         }

         if (this.color_ != null) {
            this.bitField0_ |= 8;
            this.onChanged();
         }

         return this;
      }

      public DisplayPlayerPingMessage.Builder clearColor() {
         this.bitField0_ &= -9;
         this.color_ = null;
         if (this.colorBuilder_ != null) {
            this.colorBuilder_.dispose();
            this.colorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getColorBuilder() {
         this.bitField0_ |= 8;
         this.onChanged();
         return this.getColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getColorOrBuilder() {
         if (this.colorBuilder_ != null) {
            return this.colorBuilder_.getMessageOrBuilder();
         } else {
            return this.color_ == null ? Color.getDefaultInstance() : this.color_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getColorFieldBuilder() {
         if (this.colorBuilder_ == null) {
            this.colorBuilder_ = new SingleFieldBuilderV3<>(this.getColor(), this.getParentForChildren(), this.isClean());
            this.color_ = null;
         }

         return this.colorBuilder_;
      }

      @Override
      public boolean hasIcon() {
         return (this.bitField0_ & 16) != 0;
      }

      @Override
      public Icon getIcon() {
         if (this.iconBuilder_ == null) {
            return this.icon_ == null ? Icon.getDefaultInstance() : this.icon_;
         } else {
            return this.iconBuilder_.getMessage();
         }
      }

      public DisplayPlayerPingMessage.Builder setIcon(Icon var1) {
         if (this.iconBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.icon_ = var1;
         } else {
            this.iconBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public DisplayPlayerPingMessage.Builder setIcon(Icon.Builder var1) {
         if (this.iconBuilder_ == null) {
            this.icon_ = var1.build();
         } else {
            this.iconBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public DisplayPlayerPingMessage.Builder mergeIcon(Icon var1) {
         if (this.iconBuilder_ == null) {
            if ((this.bitField0_ & 16) != 0 && this.icon_ != null && this.icon_ != Icon.getDefaultInstance()) {
               this.getIconBuilder().mergeFrom(var1);
            } else {
               this.icon_ = var1;
            }
         } else {
            this.iconBuilder_.mergeFrom(var1);
         }

         if (this.icon_ != null) {
            this.bitField0_ |= 16;
            this.onChanged();
         }

         return this;
      }

      public DisplayPlayerPingMessage.Builder clearIcon() {
         this.bitField0_ &= -17;
         this.icon_ = null;
         if (this.iconBuilder_ != null) {
            this.iconBuilder_.dispose();
            this.iconBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Icon.Builder getIconBuilder() {
         this.bitField0_ |= 16;
         this.onChanged();
         return this.getIconFieldBuilder().getBuilder();
      }

      @Override
      public IconOrBuilder getIconOrBuilder() {
         if (this.iconBuilder_ != null) {
            return this.iconBuilder_.getMessageOrBuilder();
         } else {
            return this.icon_ == null ? Icon.getDefaultInstance() : this.icon_;
         }
      }

      private SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> getIconFieldBuilder() {
         if (this.iconBuilder_ == null) {
            this.iconBuilder_ = new SingleFieldBuilderV3<>(this.getIcon(), this.getParentForChildren(), this.isClean());
            this.icon_ = null;
         }

         return this.iconBuilder_;
      }

      @Override
      public boolean hasSound() {
         return (this.bitField0_ & 32) != 0;
      }

      @Override
      public Sound getSound() {
         if (this.soundBuilder_ == null) {
            return this.sound_ == null ? Sound.getDefaultInstance() : this.sound_;
         } else {
            return this.soundBuilder_.getMessage();
         }
      }

      public DisplayPlayerPingMessage.Builder setSound(Sound var1) {
         if (this.soundBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.sound_ = var1;
         } else {
            this.soundBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public DisplayPlayerPingMessage.Builder setSound(Sound.Builder var1) {
         if (this.soundBuilder_ == null) {
            this.sound_ = var1.build();
         } else {
            this.soundBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public DisplayPlayerPingMessage.Builder mergeSound(Sound var1) {
         if (this.soundBuilder_ == null) {
            if ((this.bitField0_ & 32) != 0 && this.sound_ != null && this.sound_ != Sound.getDefaultInstance()) {
               this.getSoundBuilder().mergeFrom(var1);
            } else {
               this.sound_ = var1;
            }
         } else {
            this.soundBuilder_.mergeFrom(var1);
         }

         if (this.sound_ != null) {
            this.bitField0_ |= 32;
            this.onChanged();
         }

         return this;
      }

      public DisplayPlayerPingMessage.Builder clearSound() {
         this.bitField0_ &= -33;
         this.sound_ = null;
         if (this.soundBuilder_ != null) {
            this.soundBuilder_.dispose();
            this.soundBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Sound.Builder getSoundBuilder() {
         this.bitField0_ |= 32;
         this.onChanged();
         return this.getSoundFieldBuilder().getBuilder();
      }

      @Override
      public SoundOrBuilder getSoundOrBuilder() {
         if (this.soundBuilder_ != null) {
            return this.soundBuilder_.getMessageOrBuilder();
         } else {
            return this.sound_ == null ? Sound.getDefaultInstance() : this.sound_;
         }
      }

      private SingleFieldBuilderV3<Sound, Sound.Builder, SoundOrBuilder> getSoundFieldBuilder() {
         if (this.soundBuilder_ == null) {
            this.soundBuilder_ = new SingleFieldBuilderV3<>(this.getSound(), this.getParentForChildren(), this.isClean());
            this.sound_ = null;
         }

         return this.soundBuilder_;
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

      public DisplayPlayerPingMessage.Builder setDuration(Duration var1) {
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

      public DisplayPlayerPingMessage.Builder setDuration(Duration.Builder var1) {
         if (this.durationBuilder_ == null) {
            this.duration_ = var1.build();
         } else {
            this.durationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public DisplayPlayerPingMessage.Builder mergeDuration(Duration var1) {
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

      public DisplayPlayerPingMessage.Builder clearDuration() {
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
      public boolean getFocus() {
         return this.focus_;
      }

      public DisplayPlayerPingMessage.Builder setFocus(boolean var1) {
         this.focus_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public DisplayPlayerPingMessage.Builder clearFocus() {
         this.bitField0_ &= -129;
         this.focus_ = false;
         this.onChanged();
         return this;
      }

      public final DisplayPlayerPingMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DisplayPlayerPingMessage.Builder)super.setUnknownFields(var1);
      }

      public final DisplayPlayerPingMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DisplayPlayerPingMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
