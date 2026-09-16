package com.lunarclient.apollo.waypoint.v1;

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
import com.lunarclient.apollo.common.v1.BlockLocation;
import com.lunarclient.apollo.common.v1.BlockLocationOrBuilder;
import com.lunarclient.apollo.common.v1.Color;
import com.lunarclient.apollo.common.v1.ColorOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DisplayWaypointMessage extends GeneratedMessageV3 implements DisplayWaypointMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int NAME_FIELD_NUMBER = 1;
   private volatile Object name_ = "";
   public static final int LOCATION_FIELD_NUMBER = 2;
   private BlockLocation location_;
   public static final int COLOR_FIELD_NUMBER = 3;
   private Color color_;
   public static final int PREVENT_REMOVAL_FIELD_NUMBER = 4;
   private boolean preventRemoval_ = false;
   public static final int HIDDEN_FIELD_NUMBER = 5;
   private boolean hidden_ = false;
   public static final int SHOW_BEAM_FIELD_NUMBER = 6;
   private boolean showBeam_ = false;
   public static final int HIGHLIGHT_BLOCK_FIELD_NUMBER = 7;
   private boolean highlightBlock_ = false;
   public static final int HIGHLIGHT_BLOCK_LINE_WIDTH_FIELD_NUMBER = 8;
   private float highlightBlockLineWidth_ = 0.0F;
   public static final int STYLE_FIELD_NUMBER = 9;
   private WaypointTextStyle style_;
   private byte memoizedIsInitialized = -1;
   private static final DisplayWaypointMessage DEFAULT_INSTANCE = new DisplayWaypointMessage();
   private static final Parser<DisplayWaypointMessage> PARSER = new AbstractParser<DisplayWaypointMessage>() {
      public DisplayWaypointMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DisplayWaypointMessage.Builder var3 = DisplayWaypointMessage.newBuilder();

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

   private DisplayWaypointMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DisplayWaypointMessage() {
      this.name_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DisplayWaypointMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_waypoint_v1_DisplayWaypointMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_waypoint_v1_DisplayWaypointMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DisplayWaypointMessage.class, DisplayWaypointMessage.Builder.class);
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
   public boolean hasLocation() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public BlockLocation getLocation() {
      return this.location_ == null ? BlockLocation.getDefaultInstance() : this.location_;
   }

   @Override
   public BlockLocationOrBuilder getLocationOrBuilder() {
      return this.location_ == null ? BlockLocation.getDefaultInstance() : this.location_;
   }

   @Override
   public boolean hasColor() {
      return (this.bitField0_ & 2) != 0;
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
   public boolean getPreventRemoval() {
      return this.preventRemoval_;
   }

   @Override
   public boolean getHidden() {
      return this.hidden_;
   }

   @Override
   public boolean getShowBeam() {
      return this.showBeam_;
   }

   @Override
   public boolean getHighlightBlock() {
      return this.highlightBlock_;
   }

   @Override
   public float getHighlightBlockLineWidth() {
      return this.highlightBlockLineWidth_;
   }

   @Override
   public boolean hasStyle() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public WaypointTextStyle getStyle() {
      return this.style_ == null ? WaypointTextStyle.getDefaultInstance() : this.style_;
   }

   @Override
   public WaypointTextStyleOrBuilder getStyleOrBuilder() {
      return this.style_ == null ? WaypointTextStyle.getDefaultInstance() : this.style_;
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
      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         GeneratedMessageV3.writeString(var1, 1, this.name_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getLocation());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(3, this.getColor());
      }

      if (this.preventRemoval_) {
         var1.writeBool(4, this.preventRemoval_);
      }

      if (this.hidden_) {
         var1.writeBool(5, this.hidden_);
      }

      if (this.showBeam_) {
         var1.writeBool(6, this.showBeam_);
      }

      if (this.highlightBlock_) {
         var1.writeBool(7, this.highlightBlock_);
      }

      if (Float.floatToRawIntBits(this.highlightBlockLineWidth_) != 0) {
         var1.writeFloat(8, this.highlightBlockLineWidth_);
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(9, this.getStyle());
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
      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.name_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getLocation());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getColor());
      }

      if (this.preventRemoval_) {
         var1 += CodedOutputStream.computeBoolSize(4, this.preventRemoval_);
      }

      if (this.hidden_) {
         var1 += CodedOutputStream.computeBoolSize(5, this.hidden_);
      }

      if (this.showBeam_) {
         var1 += CodedOutputStream.computeBoolSize(6, this.showBeam_);
      }

      if (this.highlightBlock_) {
         var1 += CodedOutputStream.computeBoolSize(7, this.highlightBlock_);
      }

      if (Float.floatToRawIntBits(this.highlightBlockLineWidth_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(8, this.highlightBlockLineWidth_);
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(9, this.getStyle());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof DisplayWaypointMessage)) {
         return super.equals(var1);
      } else {
         DisplayWaypointMessage var2 = (DisplayWaypointMessage)var1;
         if (!this.getName().equals(var2.getName())) {
            return false;
         } else if (this.hasLocation() != var2.hasLocation()) {
            return false;
         } else if (this.hasLocation() && !this.getLocation().equals(var2.getLocation())) {
            return false;
         } else if (this.hasColor() != var2.hasColor()) {
            return false;
         } else if (this.hasColor() && !this.getColor().equals(var2.getColor())) {
            return false;
         } else if (this.getPreventRemoval() != var2.getPreventRemoval()) {
            return false;
         } else if (this.getHidden() != var2.getHidden()) {
            return false;
         } else if (this.getShowBeam() != var2.getShowBeam()) {
            return false;
         } else if (this.getHighlightBlock() != var2.getHighlightBlock()) {
            return false;
         } else if (Float.floatToIntBits(this.getHighlightBlockLineWidth()) != Float.floatToIntBits(var2.getHighlightBlockLineWidth())) {
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
      var1 = 53 * var1 + this.getName().hashCode();
      if (this.hasLocation()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getLocation().hashCode();
      }

      if (this.hasColor()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getColor().hashCode();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashBoolean(this.getPreventRemoval());
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + Internal.hashBoolean(this.getHidden());
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowBeam());
      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + Internal.hashBoolean(this.getHighlightBlock());
      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + Float.floatToIntBits(this.getHighlightBlockLineWidth());
      if (this.hasStyle()) {
         var1 = 37 * var1 + 9;
         var1 = 53 * var1 + this.getStyle().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DisplayWaypointMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayWaypointMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayWaypointMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayWaypointMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayWaypointMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayWaypointMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayWaypointMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayWaypointMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DisplayWaypointMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DisplayWaypointMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DisplayWaypointMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayWaypointMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DisplayWaypointMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DisplayWaypointMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DisplayWaypointMessage.Builder newBuilder(DisplayWaypointMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DisplayWaypointMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DisplayWaypointMessage.Builder() : new DisplayWaypointMessage.Builder().mergeFrom(this);
   }

   protected DisplayWaypointMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DisplayWaypointMessage.Builder(var1);
   }

   public static DisplayWaypointMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DisplayWaypointMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<DisplayWaypointMessage> getParserForType() {
      return PARSER;
   }

   public DisplayWaypointMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<DisplayWaypointMessage.Builder> implements DisplayWaypointMessageOrBuilder {
      private int bitField0_;
      private Object name_ = "";
      private BlockLocation location_;
      private SingleFieldBuilderV3<BlockLocation, BlockLocation.Builder, BlockLocationOrBuilder> locationBuilder_;
      private Color color_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> colorBuilder_;
      private boolean preventRemoval_;
      private boolean hidden_;
      private boolean showBeam_;
      private boolean highlightBlock_;
      private float highlightBlockLineWidth_;
      private WaypointTextStyle style_;
      private SingleFieldBuilderV3<WaypointTextStyle, WaypointTextStyle.Builder, WaypointTextStyleOrBuilder> styleBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_waypoint_v1_DisplayWaypointMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_waypoint_v1_DisplayWaypointMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DisplayWaypointMessage.class, DisplayWaypointMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (DisplayWaypointMessage.alwaysUseFieldBuilders) {
            this.getLocationFieldBuilder();
            this.getColorFieldBuilder();
            this.getStyleFieldBuilder();
         }
      }

      public DisplayWaypointMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.name_ = "";
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

         this.preventRemoval_ = false;
         this.hidden_ = false;
         this.showBeam_ = false;
         this.highlightBlock_ = false;
         this.highlightBlockLineWidth_ = 0.0F;
         this.style_ = null;
         if (this.styleBuilder_ != null) {
            this.styleBuilder_.dispose();
            this.styleBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_waypoint_v1_DisplayWaypointMessage_descriptor;
      }

      public DisplayWaypointMessage getDefaultInstanceForType() {
         return DisplayWaypointMessage.getDefaultInstance();
      }

      public DisplayWaypointMessage build() {
         DisplayWaypointMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DisplayWaypointMessage buildPartial() {
         DisplayWaypointMessage var1 = new DisplayWaypointMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(DisplayWaypointMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.name_ = this.name_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.location_ = this.locationBuilder_ == null ? this.location_ : this.locationBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            var1.color_ = this.colorBuilder_ == null ? this.color_ : this.colorBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 8) != 0) {
            var1.preventRemoval_ = this.preventRemoval_;
         }

         if ((var2 & 16) != 0) {
            var1.hidden_ = this.hidden_;
         }

         if ((var2 & 32) != 0) {
            var1.showBeam_ = this.showBeam_;
         }

         if ((var2 & 64) != 0) {
            var1.highlightBlock_ = this.highlightBlock_;
         }

         if ((var2 & 128) != 0) {
            var1.highlightBlockLineWidth_ = this.highlightBlockLineWidth_;
         }

         if ((var2 & 256) != 0) {
            var1.style_ = this.styleBuilder_ == null ? this.style_ : this.styleBuilder_.build();
            var3 |= 4;
         }

         DisplayWaypointMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public DisplayWaypointMessage.Builder clone() {
         return (DisplayWaypointMessage.Builder)super.clone();
      }

      public DisplayWaypointMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayWaypointMessage.Builder)super.setField(var1, var2);
      }

      public DisplayWaypointMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DisplayWaypointMessage.Builder)super.clearField(var1);
      }

      public DisplayWaypointMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DisplayWaypointMessage.Builder)super.clearOneof(var1);
      }

      public DisplayWaypointMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DisplayWaypointMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DisplayWaypointMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayWaypointMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public DisplayWaypointMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof DisplayWaypointMessage) {
            return this.mergeFrom((DisplayWaypointMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DisplayWaypointMessage.Builder mergeFrom(DisplayWaypointMessage var1) {
         if (var1 == DisplayWaypointMessage.getDefaultInstance()) {
            return this;
         }

         if (!var1.getName().isEmpty()) {
            this.name_ = var1.name_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.hasLocation()) {
            this.mergeLocation(var1.getLocation());
         }

         if (var1.hasColor()) {
            this.mergeColor(var1.getColor());
         }

         if (var1.getPreventRemoval()) {
            this.setPreventRemoval(var1.getPreventRemoval());
         }

         if (var1.getHidden()) {
            this.setHidden(var1.getHidden());
         }

         if (var1.getShowBeam()) {
            this.setShowBeam(var1.getShowBeam());
         }

         if (var1.getHighlightBlock()) {
            this.setHighlightBlock(var1.getHighlightBlock());
         }

         if (var1.getHighlightBlockLineWidth() != 0.0F) {
            this.setHighlightBlockLineWidth(var1.getHighlightBlockLineWidth());
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

      public DisplayWaypointMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.name_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getLocationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.preventRemoval_ = var1.readBool();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.hidden_ = var1.readBool();
                     this.bitField0_ |= 16;
                     break;
                  case 48:
                     this.showBeam_ = var1.readBool();
                     this.bitField0_ |= 32;
                     break;
                  case 56:
                     this.highlightBlock_ = var1.readBool();
                     this.bitField0_ |= 64;
                     break;
                  case 69:
                     this.highlightBlockLineWidth_ = var1.readFloat();
                     this.bitField0_ |= 128;
                     break;
                  case 74:
                     var1.readMessage(this.getStyleFieldBuilder().getBuilder(), var2);
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

      public DisplayWaypointMessage.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public DisplayWaypointMessage.Builder clearName() {
         this.name_ = DisplayWaypointMessage.getDefaultInstance().getName();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public DisplayWaypointMessage.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         DisplayWaypointMessage.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasLocation() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public BlockLocation getLocation() {
         if (this.locationBuilder_ == null) {
            return this.location_ == null ? BlockLocation.getDefaultInstance() : this.location_;
         } else {
            return this.locationBuilder_.getMessage();
         }
      }

      public DisplayWaypointMessage.Builder setLocation(BlockLocation var1) {
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

      public DisplayWaypointMessage.Builder setLocation(BlockLocation.Builder var1) {
         if (this.locationBuilder_ == null) {
            this.location_ = var1.build();
         } else {
            this.locationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public DisplayWaypointMessage.Builder mergeLocation(BlockLocation var1) {
         if (this.locationBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.location_ != null && this.location_ != BlockLocation.getDefaultInstance()) {
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

      public DisplayWaypointMessage.Builder clearLocation() {
         this.bitField0_ &= -3;
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public BlockLocation.Builder getLocationBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getLocationFieldBuilder().getBuilder();
      }

      @Override
      public BlockLocationOrBuilder getLocationOrBuilder() {
         if (this.locationBuilder_ != null) {
            return this.locationBuilder_.getMessageOrBuilder();
         } else {
            return this.location_ == null ? BlockLocation.getDefaultInstance() : this.location_;
         }
      }

      private SingleFieldBuilderV3<BlockLocation, BlockLocation.Builder, BlockLocationOrBuilder> getLocationFieldBuilder() {
         if (this.locationBuilder_ == null) {
            this.locationBuilder_ = new SingleFieldBuilderV3<>(this.getLocation(), this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         return this.locationBuilder_;
      }

      @Override
      public boolean hasColor() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Color getColor() {
         if (this.colorBuilder_ == null) {
            return this.color_ == null ? Color.getDefaultInstance() : this.color_;
         } else {
            return this.colorBuilder_.getMessage();
         }
      }

      public DisplayWaypointMessage.Builder setColor(Color var1) {
         if (this.colorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.color_ = var1;
         } else {
            this.colorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public DisplayWaypointMessage.Builder setColor(Color.Builder var1) {
         if (this.colorBuilder_ == null) {
            this.color_ = var1.build();
         } else {
            this.colorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public DisplayWaypointMessage.Builder mergeColor(Color var1) {
         if (this.colorBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.color_ != null && this.color_ != Color.getDefaultInstance()) {
               this.getColorBuilder().mergeFrom(var1);
            } else {
               this.color_ = var1;
            }
         } else {
            this.colorBuilder_.mergeFrom(var1);
         }

         if (this.color_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public DisplayWaypointMessage.Builder clearColor() {
         this.bitField0_ &= -5;
         this.color_ = null;
         if (this.colorBuilder_ != null) {
            this.colorBuilder_.dispose();
            this.colorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getColorBuilder() {
         this.bitField0_ |= 4;
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
      public boolean getPreventRemoval() {
         return this.preventRemoval_;
      }

      public DisplayWaypointMessage.Builder setPreventRemoval(boolean var1) {
         this.preventRemoval_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public DisplayWaypointMessage.Builder clearPreventRemoval() {
         this.bitField0_ &= -9;
         this.preventRemoval_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getHidden() {
         return this.hidden_;
      }

      public DisplayWaypointMessage.Builder setHidden(boolean var1) {
         this.hidden_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public DisplayWaypointMessage.Builder clearHidden() {
         this.bitField0_ &= -17;
         this.hidden_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getShowBeam() {
         return this.showBeam_;
      }

      public DisplayWaypointMessage.Builder setShowBeam(boolean var1) {
         this.showBeam_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public DisplayWaypointMessage.Builder clearShowBeam() {
         this.bitField0_ &= -33;
         this.showBeam_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getHighlightBlock() {
         return this.highlightBlock_;
      }

      public DisplayWaypointMessage.Builder setHighlightBlock(boolean var1) {
         this.highlightBlock_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public DisplayWaypointMessage.Builder clearHighlightBlock() {
         this.bitField0_ &= -65;
         this.highlightBlock_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public float getHighlightBlockLineWidth() {
         return this.highlightBlockLineWidth_;
      }

      public DisplayWaypointMessage.Builder setHighlightBlockLineWidth(float var1) {
         this.highlightBlockLineWidth_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public DisplayWaypointMessage.Builder clearHighlightBlockLineWidth() {
         this.bitField0_ &= -129;
         this.highlightBlockLineWidth_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasStyle() {
         return (this.bitField0_ & 256) != 0;
      }

      @Override
      public WaypointTextStyle getStyle() {
         if (this.styleBuilder_ == null) {
            return this.style_ == null ? WaypointTextStyle.getDefaultInstance() : this.style_;
         } else {
            return this.styleBuilder_.getMessage();
         }
      }

      public DisplayWaypointMessage.Builder setStyle(WaypointTextStyle var1) {
         if (this.styleBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.style_ = var1;
         } else {
            this.styleBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public DisplayWaypointMessage.Builder setStyle(WaypointTextStyle.Builder var1) {
         if (this.styleBuilder_ == null) {
            this.style_ = var1.build();
         } else {
            this.styleBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public DisplayWaypointMessage.Builder mergeStyle(WaypointTextStyle var1) {
         if (this.styleBuilder_ == null) {
            if ((this.bitField0_ & 256) != 0 && this.style_ != null && this.style_ != WaypointTextStyle.getDefaultInstance()) {
               this.getStyleBuilder().mergeFrom(var1);
            } else {
               this.style_ = var1;
            }
         } else {
            this.styleBuilder_.mergeFrom(var1);
         }

         if (this.style_ != null) {
            this.bitField0_ |= 256;
            this.onChanged();
         }

         return this;
      }

      public DisplayWaypointMessage.Builder clearStyle() {
         this.bitField0_ &= -257;
         this.style_ = null;
         if (this.styleBuilder_ != null) {
            this.styleBuilder_.dispose();
            this.styleBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public WaypointTextStyle.Builder getStyleBuilder() {
         this.bitField0_ |= 256;
         this.onChanged();
         return this.getStyleFieldBuilder().getBuilder();
      }

      @Override
      public WaypointTextStyleOrBuilder getStyleOrBuilder() {
         if (this.styleBuilder_ != null) {
            return this.styleBuilder_.getMessageOrBuilder();
         } else {
            return this.style_ == null ? WaypointTextStyle.getDefaultInstance() : this.style_;
         }
      }

      private SingleFieldBuilderV3<WaypointTextStyle, WaypointTextStyle.Builder, WaypointTextStyleOrBuilder> getStyleFieldBuilder() {
         if (this.styleBuilder_ == null) {
            this.styleBuilder_ = new SingleFieldBuilderV3<>(this.getStyle(), this.getParentForChildren(), this.isClean());
            this.style_ = null;
         }

         return this.styleBuilder_;
      }

      public final DisplayWaypointMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DisplayWaypointMessage.Builder)super.setUnknownFields(var1);
      }

      public final DisplayWaypointMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DisplayWaypointMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
