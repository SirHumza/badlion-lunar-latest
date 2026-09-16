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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class WaypointTextStyle extends GeneratedMessageV3 implements WaypointTextStyleOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SHOW_TEXT_FIELD_NUMBER = 1;
   private boolean showText_ = false;
   public static final int ONLY_SHOW_TEXT_WHEN_LOOKING_NEAR_FIELD_NUMBER = 2;
   private boolean onlyShowTextWhenLookingNear_ = false;
   public static final int SHOW_ICONS_FIELD_NUMBER = 3;
   private boolean showIcons_ = false;
   public static final int TEXT_ICON_SCALE_FIELD_NUMBER = 4;
   private float textIconScale_ = 0.0F;
   public static final int LABEL_SCALE_FIELD_NUMBER = 5;
   private float labelScale_ = 0.0F;
   public static final int BOX_PADDING_FIELD_NUMBER = 6;
   private float boxPadding_ = 0.0F;
   public static final int BOX_BORDERS_FIELD_NUMBER = 7;
   private boolean boxBorders_ = false;
   public static final int TEXT_SHADOW_FIELD_NUMBER = 8;
   private boolean textShadow_ = false;
   public static final int SHOW_DISTANCE_FIELD_NUMBER = 9;
   private boolean showDistance_ = false;
   private byte memoizedIsInitialized = -1;
   private static final WaypointTextStyle DEFAULT_INSTANCE = new WaypointTextStyle();
   private static final Parser<WaypointTextStyle> PARSER = new AbstractParser<WaypointTextStyle>() {
      public WaypointTextStyle parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         WaypointTextStyle.Builder var3 = WaypointTextStyle.newBuilder();

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

   private WaypointTextStyle(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private WaypointTextStyle() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new WaypointTextStyle();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_waypoint_v1_WaypointTextStyle_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_waypoint_v1_WaypointTextStyle_fieldAccessorTable
         .ensureFieldAccessorsInitialized(WaypointTextStyle.class, WaypointTextStyle.Builder.class);
   }

   @Override
   public boolean getShowText() {
      return this.showText_;
   }

   @Override
   public boolean getOnlyShowTextWhenLookingNear() {
      return this.onlyShowTextWhenLookingNear_;
   }

   @Override
   public boolean getShowIcons() {
      return this.showIcons_;
   }

   @Override
   public float getTextIconScale() {
      return this.textIconScale_;
   }

   @Override
   public float getLabelScale() {
      return this.labelScale_;
   }

   @Override
   public float getBoxPadding() {
      return this.boxPadding_;
   }

   @Override
   public boolean getBoxBorders() {
      return this.boxBorders_;
   }

   @Override
   public boolean getTextShadow() {
      return this.textShadow_;
   }

   @Override
   public boolean getShowDistance() {
      return this.showDistance_;
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
      if (this.showText_) {
         var1.writeBool(1, this.showText_);
      }

      if (this.onlyShowTextWhenLookingNear_) {
         var1.writeBool(2, this.onlyShowTextWhenLookingNear_);
      }

      if (this.showIcons_) {
         var1.writeBool(3, this.showIcons_);
      }

      if (Float.floatToRawIntBits(this.textIconScale_) != 0) {
         var1.writeFloat(4, this.textIconScale_);
      }

      if (Float.floatToRawIntBits(this.labelScale_) != 0) {
         var1.writeFloat(5, this.labelScale_);
      }

      if (Float.floatToRawIntBits(this.boxPadding_) != 0) {
         var1.writeFloat(6, this.boxPadding_);
      }

      if (this.boxBorders_) {
         var1.writeBool(7, this.boxBorders_);
      }

      if (this.textShadow_) {
         var1.writeBool(8, this.textShadow_);
      }

      if (this.showDistance_) {
         var1.writeBool(9, this.showDistance_);
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
      if (this.showText_) {
         var1 += CodedOutputStream.computeBoolSize(1, this.showText_);
      }

      if (this.onlyShowTextWhenLookingNear_) {
         var1 += CodedOutputStream.computeBoolSize(2, this.onlyShowTextWhenLookingNear_);
      }

      if (this.showIcons_) {
         var1 += CodedOutputStream.computeBoolSize(3, this.showIcons_);
      }

      if (Float.floatToRawIntBits(this.textIconScale_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(4, this.textIconScale_);
      }

      if (Float.floatToRawIntBits(this.labelScale_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(5, this.labelScale_);
      }

      if (Float.floatToRawIntBits(this.boxPadding_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(6, this.boxPadding_);
      }

      if (this.boxBorders_) {
         var1 += CodedOutputStream.computeBoolSize(7, this.boxBorders_);
      }

      if (this.textShadow_) {
         var1 += CodedOutputStream.computeBoolSize(8, this.textShadow_);
      }

      if (this.showDistance_) {
         var1 += CodedOutputStream.computeBoolSize(9, this.showDistance_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof WaypointTextStyle)) {
         return super.equals(var1);
      } else {
         WaypointTextStyle var2 = (WaypointTextStyle)var1;
         if (this.getShowText() != var2.getShowText()) {
            return false;
         } else if (this.getOnlyShowTextWhenLookingNear() != var2.getOnlyShowTextWhenLookingNear()) {
            return false;
         } else if (this.getShowIcons() != var2.getShowIcons()) {
            return false;
         } else if (Float.floatToIntBits(this.getTextIconScale()) != Float.floatToIntBits(var2.getTextIconScale())) {
            return false;
         } else if (Float.floatToIntBits(this.getLabelScale()) != Float.floatToIntBits(var2.getLabelScale())) {
            return false;
         } else if (Float.floatToIntBits(this.getBoxPadding()) != Float.floatToIntBits(var2.getBoxPadding())) {
            return false;
         } else if (this.getBoxBorders() != var2.getBoxBorders()) {
            return false;
         } else if (this.getTextShadow() != var2.getTextShadow()) {
            return false;
         } else {
            return this.getShowDistance() != var2.getShowDistance() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowText());
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Internal.hashBoolean(this.getOnlyShowTextWhenLookingNear());
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowIcons());
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Float.floatToIntBits(this.getTextIconScale());
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + Float.floatToIntBits(this.getLabelScale());
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + Float.floatToIntBits(this.getBoxPadding());
      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + Internal.hashBoolean(this.getBoxBorders());
      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + Internal.hashBoolean(this.getTextShadow());
      var1 = 37 * var1 + 9;
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowDistance());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static WaypointTextStyle parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static WaypointTextStyle parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static WaypointTextStyle parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static WaypointTextStyle parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static WaypointTextStyle parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static WaypointTextStyle parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static WaypointTextStyle parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static WaypointTextStyle parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static WaypointTextStyle parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static WaypointTextStyle parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static WaypointTextStyle parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static WaypointTextStyle parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public WaypointTextStyle.Builder newBuilderForType() {
      return newBuilder();
   }

   public static WaypointTextStyle.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static WaypointTextStyle.Builder newBuilder(WaypointTextStyle var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public WaypointTextStyle.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new WaypointTextStyle.Builder() : new WaypointTextStyle.Builder().mergeFrom(this);
   }

   protected WaypointTextStyle.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new WaypointTextStyle.Builder(var1);
   }

   public static WaypointTextStyle getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<WaypointTextStyle> parser() {
      return PARSER;
   }

   @Override
   public Parser<WaypointTextStyle> getParserForType() {
      return PARSER;
   }

   public WaypointTextStyle getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<WaypointTextStyle.Builder> implements WaypointTextStyleOrBuilder {
      private int bitField0_;
      private boolean showText_;
      private boolean onlyShowTextWhenLookingNear_;
      private boolean showIcons_;
      private float textIconScale_;
      private float labelScale_;
      private float boxPadding_;
      private boolean boxBorders_;
      private boolean textShadow_;
      private boolean showDistance_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_waypoint_v1_WaypointTextStyle_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_waypoint_v1_WaypointTextStyle_fieldAccessorTable
            .ensureFieldAccessorsInitialized(WaypointTextStyle.class, WaypointTextStyle.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public WaypointTextStyle.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.showText_ = false;
         this.onlyShowTextWhenLookingNear_ = false;
         this.showIcons_ = false;
         this.textIconScale_ = 0.0F;
         this.labelScale_ = 0.0F;
         this.boxPadding_ = 0.0F;
         this.boxBorders_ = false;
         this.textShadow_ = false;
         this.showDistance_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_waypoint_v1_WaypointTextStyle_descriptor;
      }

      public WaypointTextStyle getDefaultInstanceForType() {
         return WaypointTextStyle.getDefaultInstance();
      }

      public WaypointTextStyle build() {
         WaypointTextStyle var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public WaypointTextStyle buildPartial() {
         WaypointTextStyle var1 = new WaypointTextStyle(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(WaypointTextStyle var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.showText_ = this.showText_;
         }

         if ((var2 & 2) != 0) {
            var1.onlyShowTextWhenLookingNear_ = this.onlyShowTextWhenLookingNear_;
         }

         if ((var2 & 4) != 0) {
            var1.showIcons_ = this.showIcons_;
         }

         if ((var2 & 8) != 0) {
            var1.textIconScale_ = this.textIconScale_;
         }

         if ((var2 & 16) != 0) {
            var1.labelScale_ = this.labelScale_;
         }

         if ((var2 & 32) != 0) {
            var1.boxPadding_ = this.boxPadding_;
         }

         if ((var2 & 64) != 0) {
            var1.boxBorders_ = this.boxBorders_;
         }

         if ((var2 & 128) != 0) {
            var1.textShadow_ = this.textShadow_;
         }

         if ((var2 & 256) != 0) {
            var1.showDistance_ = this.showDistance_;
         }
      }

      public WaypointTextStyle.Builder clone() {
         return (WaypointTextStyle.Builder)super.clone();
      }

      public WaypointTextStyle.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (WaypointTextStyle.Builder)super.setField(var1, var2);
      }

      public WaypointTextStyle.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (WaypointTextStyle.Builder)super.clearField(var1);
      }

      public WaypointTextStyle.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (WaypointTextStyle.Builder)super.clearOneof(var1);
      }

      public WaypointTextStyle.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (WaypointTextStyle.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public WaypointTextStyle.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (WaypointTextStyle.Builder)super.addRepeatedField(var1, var2);
      }

      public WaypointTextStyle.Builder mergeFrom(Message var1) {
         if (var1 instanceof WaypointTextStyle) {
            return this.mergeFrom((WaypointTextStyle)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public WaypointTextStyle.Builder mergeFrom(WaypointTextStyle var1) {
         if (var1 == WaypointTextStyle.getDefaultInstance()) {
            return this;
         }

         if (var1.getShowText()) {
            this.setShowText(var1.getShowText());
         }

         if (var1.getOnlyShowTextWhenLookingNear()) {
            this.setOnlyShowTextWhenLookingNear(var1.getOnlyShowTextWhenLookingNear());
         }

         if (var1.getShowIcons()) {
            this.setShowIcons(var1.getShowIcons());
         }

         if (var1.getTextIconScale() != 0.0F) {
            this.setTextIconScale(var1.getTextIconScale());
         }

         if (var1.getLabelScale() != 0.0F) {
            this.setLabelScale(var1.getLabelScale());
         }

         if (var1.getBoxPadding() != 0.0F) {
            this.setBoxPadding(var1.getBoxPadding());
         }

         if (var1.getBoxBorders()) {
            this.setBoxBorders(var1.getBoxBorders());
         }

         if (var1.getTextShadow()) {
            this.setTextShadow(var1.getTextShadow());
         }

         if (var1.getShowDistance()) {
            this.setShowDistance(var1.getShowDistance());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public WaypointTextStyle.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.showText_ = var1.readBool();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.onlyShowTextWhenLookingNear_ = var1.readBool();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.showIcons_ = var1.readBool();
                     this.bitField0_ |= 4;
                     break;
                  case 37:
                     this.textIconScale_ = var1.readFloat();
                     this.bitField0_ |= 8;
                     break;
                  case 45:
                     this.labelScale_ = var1.readFloat();
                     this.bitField0_ |= 16;
                     break;
                  case 53:
                     this.boxPadding_ = var1.readFloat();
                     this.bitField0_ |= 32;
                     break;
                  case 56:
                     this.boxBorders_ = var1.readBool();
                     this.bitField0_ |= 64;
                     break;
                  case 64:
                     this.textShadow_ = var1.readBool();
                     this.bitField0_ |= 128;
                     break;
                  case 72:
                     this.showDistance_ = var1.readBool();
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
      public boolean getShowText() {
         return this.showText_;
      }

      public WaypointTextStyle.Builder setShowText(boolean var1) {
         this.showText_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public WaypointTextStyle.Builder clearShowText() {
         this.bitField0_ &= -2;
         this.showText_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getOnlyShowTextWhenLookingNear() {
         return this.onlyShowTextWhenLookingNear_;
      }

      public WaypointTextStyle.Builder setOnlyShowTextWhenLookingNear(boolean var1) {
         this.onlyShowTextWhenLookingNear_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public WaypointTextStyle.Builder clearOnlyShowTextWhenLookingNear() {
         this.bitField0_ &= -3;
         this.onlyShowTextWhenLookingNear_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getShowIcons() {
         return this.showIcons_;
      }

      public WaypointTextStyle.Builder setShowIcons(boolean var1) {
         this.showIcons_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public WaypointTextStyle.Builder clearShowIcons() {
         this.bitField0_ &= -5;
         this.showIcons_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public float getTextIconScale() {
         return this.textIconScale_;
      }

      public WaypointTextStyle.Builder setTextIconScale(float var1) {
         this.textIconScale_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public WaypointTextStyle.Builder clearTextIconScale() {
         this.bitField0_ &= -9;
         this.textIconScale_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public float getLabelScale() {
         return this.labelScale_;
      }

      public WaypointTextStyle.Builder setLabelScale(float var1) {
         this.labelScale_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public WaypointTextStyle.Builder clearLabelScale() {
         this.bitField0_ &= -17;
         this.labelScale_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public float getBoxPadding() {
         return this.boxPadding_;
      }

      public WaypointTextStyle.Builder setBoxPadding(float var1) {
         this.boxPadding_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public WaypointTextStyle.Builder clearBoxPadding() {
         this.bitField0_ &= -33;
         this.boxPadding_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getBoxBorders() {
         return this.boxBorders_;
      }

      public WaypointTextStyle.Builder setBoxBorders(boolean var1) {
         this.boxBorders_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public WaypointTextStyle.Builder clearBoxBorders() {
         this.bitField0_ &= -65;
         this.boxBorders_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getTextShadow() {
         return this.textShadow_;
      }

      public WaypointTextStyle.Builder setTextShadow(boolean var1) {
         this.textShadow_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public WaypointTextStyle.Builder clearTextShadow() {
         this.bitField0_ &= -129;
         this.textShadow_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getShowDistance() {
         return this.showDistance_;
      }

      public WaypointTextStyle.Builder setShowDistance(boolean var1) {
         this.showDistance_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public WaypointTextStyle.Builder clearShowDistance() {
         this.bitField0_ &= -257;
         this.showDistance_ = false;
         this.onChanged();
         return this;
      }

      public final WaypointTextStyle.Builder setUnknownFields(UnknownFieldSet var1) {
         return (WaypointTextStyle.Builder)super.setUnknownFields(var1);
      }

      public final WaypointTextStyle.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (WaypointTextStyle.Builder)super.mergeUnknownFields(var1);
      }
   }
}
