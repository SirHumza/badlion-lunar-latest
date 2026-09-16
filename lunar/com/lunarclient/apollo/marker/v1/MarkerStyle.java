package com.lunarclient.apollo.marker.v1;

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

public final class MarkerStyle extends GeneratedMessageV3 implements MarkerStyleOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SCALE_FIELD_NUMBER = 1;
   private float scale_ = 0.0F;
   public static final int ANIMATE_MARKER_ON_HOVER_FIELD_NUMBER = 2;
   private boolean animateMarkerOnHover_ = false;
   public static final int COMPACT_MODE_FIELD_NUMBER = 3;
   private boolean compactMode_ = false;
   public static final int TEXT_SHADOW_FIELD_NUMBER = 4;
   private boolean textShadow_ = false;
   public static final int OWNER_SUFFIX_FIELD_NUMBER = 5;
   private volatile Object ownerSuffix_ = "";
   public static final int OWNER_DISPLAY_FIELD_NUMBER = 6;
   private int ownerDisplay_ = 0;
   public static final int SHOW_OWNER_FIELD_NUMBER = 7;
   private int showOwner_ = 0;
   public static final int SHOW_COORDINATES_FIELD_NUMBER = 8;
   private int showCoordinates_ = 0;
   public static final int SHOW_DISTANCE_FIELD_NUMBER = 9;
   private int showDistance_ = 0;
   public static final int SHOW_DESCRIPTION_FIELD_NUMBER = 10;
   private int showDescription_ = 0;
   public static final int DESCRIPTION_DISPLAY_FIELD_NUMBER = 11;
   private int descriptionDisplay_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final MarkerStyle DEFAULT_INSTANCE = new MarkerStyle();
   private static final Parser<MarkerStyle> PARSER = new AbstractParser<MarkerStyle>() {
      public MarkerStyle parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         MarkerStyle.Builder var3 = MarkerStyle.newBuilder();

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

   private MarkerStyle(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private MarkerStyle() {
      this.ownerSuffix_ = "";
      this.ownerDisplay_ = 0;
      this.showOwner_ = 0;
      this.showCoordinates_ = 0;
      this.showDistance_ = 0;
      this.showDescription_ = 0;
      this.descriptionDisplay_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new MarkerStyle();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_marker_v1_MarkerStyle_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_marker_v1_MarkerStyle_fieldAccessorTable
         .ensureFieldAccessorsInitialized(MarkerStyle.class, MarkerStyle.Builder.class);
   }

   @Override
   public float getScale() {
      return this.scale_;
   }

   @Override
   public boolean getAnimateMarkerOnHover() {
      return this.animateMarkerOnHover_;
   }

   @Override
   public boolean getCompactMode() {
      return this.compactMode_;
   }

   @Override
   public boolean getTextShadow() {
      return this.textShadow_;
   }

   @Override
   public String getOwnerSuffix() {
      Object var1 = this.ownerSuffix_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.ownerSuffix_ = var3;
      return var3;
   }

   @Override
   public ByteString getOwnerSuffixBytes() {
      Object var1 = this.ownerSuffix_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.ownerSuffix_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getOwnerDisplayValue() {
      return this.ownerDisplay_;
   }

   @Override
   public MarkerOwnerDisplay getOwnerDisplay() {
      MarkerOwnerDisplay var1 = MarkerOwnerDisplay.forNumber(this.ownerDisplay_);
      return var1 == null ? MarkerOwnerDisplay.UNRECOGNIZED : var1;
   }

   @Override
   public int getShowOwnerValue() {
      return this.showOwner_;
   }

   @Override
   public MarkerDisplayCondition getShowOwner() {
      MarkerDisplayCondition var1 = MarkerDisplayCondition.forNumber(this.showOwner_);
      return var1 == null ? MarkerDisplayCondition.UNRECOGNIZED : var1;
   }

   @Override
   public int getShowCoordinatesValue() {
      return this.showCoordinates_;
   }

   @Override
   public MarkerDisplayCondition getShowCoordinates() {
      MarkerDisplayCondition var1 = MarkerDisplayCondition.forNumber(this.showCoordinates_);
      return var1 == null ? MarkerDisplayCondition.UNRECOGNIZED : var1;
   }

   @Override
   public int getShowDistanceValue() {
      return this.showDistance_;
   }

   @Override
   public MarkerDisplayCondition getShowDistance() {
      MarkerDisplayCondition var1 = MarkerDisplayCondition.forNumber(this.showDistance_);
      return var1 == null ? MarkerDisplayCondition.UNRECOGNIZED : var1;
   }

   @Override
   public int getShowDescriptionValue() {
      return this.showDescription_;
   }

   @Override
   public MarkerDisplayCondition getShowDescription() {
      MarkerDisplayCondition var1 = MarkerDisplayCondition.forNumber(this.showDescription_);
      return var1 == null ? MarkerDisplayCondition.UNRECOGNIZED : var1;
   }

   @Override
   public int getDescriptionDisplayValue() {
      return this.descriptionDisplay_;
   }

   @Override
   public MarkerDescriptionDisplay getDescriptionDisplay() {
      MarkerDescriptionDisplay var1 = MarkerDescriptionDisplay.forNumber(this.descriptionDisplay_);
      return var1 == null ? MarkerDescriptionDisplay.UNRECOGNIZED : var1;
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
      if (Float.floatToRawIntBits(this.scale_) != 0) {
         var1.writeFloat(1, this.scale_);
      }

      if (this.animateMarkerOnHover_) {
         var1.writeBool(2, this.animateMarkerOnHover_);
      }

      if (this.compactMode_) {
         var1.writeBool(3, this.compactMode_);
      }

      if (this.textShadow_) {
         var1.writeBool(4, this.textShadow_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.ownerSuffix_)) {
         GeneratedMessageV3.writeString(var1, 5, this.ownerSuffix_);
      }

      if (this.ownerDisplay_ != MarkerOwnerDisplay.MARKER_OWNER_DISPLAY_UNSPECIFIED.getNumber()) {
         var1.writeEnum(6, this.ownerDisplay_);
      }

      if (this.showOwner_ != MarkerDisplayCondition.MARKER_DISPLAY_CONDITION_UNSPECIFIED.getNumber()) {
         var1.writeEnum(7, this.showOwner_);
      }

      if (this.showCoordinates_ != MarkerDisplayCondition.MARKER_DISPLAY_CONDITION_UNSPECIFIED.getNumber()) {
         var1.writeEnum(8, this.showCoordinates_);
      }

      if (this.showDistance_ != MarkerDisplayCondition.MARKER_DISPLAY_CONDITION_UNSPECIFIED.getNumber()) {
         var1.writeEnum(9, this.showDistance_);
      }

      if (this.showDescription_ != MarkerDisplayCondition.MARKER_DISPLAY_CONDITION_UNSPECIFIED.getNumber()) {
         var1.writeEnum(10, this.showDescription_);
      }

      if (this.descriptionDisplay_ != MarkerDescriptionDisplay.MARKER_DESCRIPTION_DISPLAY_UNSPECIFIED.getNumber()) {
         var1.writeEnum(11, this.descriptionDisplay_);
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
      if (Float.floatToRawIntBits(this.scale_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(1, this.scale_);
      }

      if (this.animateMarkerOnHover_) {
         var1 += CodedOutputStream.computeBoolSize(2, this.animateMarkerOnHover_);
      }

      if (this.compactMode_) {
         var1 += CodedOutputStream.computeBoolSize(3, this.compactMode_);
      }

      if (this.textShadow_) {
         var1 += CodedOutputStream.computeBoolSize(4, this.textShadow_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.ownerSuffix_)) {
         var1 += GeneratedMessageV3.computeStringSize(5, this.ownerSuffix_);
      }

      if (this.ownerDisplay_ != MarkerOwnerDisplay.MARKER_OWNER_DISPLAY_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(6, this.ownerDisplay_);
      }

      if (this.showOwner_ != MarkerDisplayCondition.MARKER_DISPLAY_CONDITION_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(7, this.showOwner_);
      }

      if (this.showCoordinates_ != MarkerDisplayCondition.MARKER_DISPLAY_CONDITION_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(8, this.showCoordinates_);
      }

      if (this.showDistance_ != MarkerDisplayCondition.MARKER_DISPLAY_CONDITION_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(9, this.showDistance_);
      }

      if (this.showDescription_ != MarkerDisplayCondition.MARKER_DISPLAY_CONDITION_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(10, this.showDescription_);
      }

      if (this.descriptionDisplay_ != MarkerDescriptionDisplay.MARKER_DESCRIPTION_DISPLAY_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(11, this.descriptionDisplay_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof MarkerStyle)) {
         return super.equals(var1);
      } else {
         MarkerStyle var2 = (MarkerStyle)var1;
         if (Float.floatToIntBits(this.getScale()) != Float.floatToIntBits(var2.getScale())) {
            return false;
         } else if (this.getAnimateMarkerOnHover() != var2.getAnimateMarkerOnHover()) {
            return false;
         } else if (this.getCompactMode() != var2.getCompactMode()) {
            return false;
         } else if (this.getTextShadow() != var2.getTextShadow()) {
            return false;
         } else if (!this.getOwnerSuffix().equals(var2.getOwnerSuffix())) {
            return false;
         } else if (this.ownerDisplay_ != var2.ownerDisplay_) {
            return false;
         } else if (this.showOwner_ != var2.showOwner_) {
            return false;
         } else if (this.showCoordinates_ != var2.showCoordinates_) {
            return false;
         } else if (this.showDistance_ != var2.showDistance_) {
            return false;
         } else if (this.showDescription_ != var2.showDescription_) {
            return false;
         } else {
            return this.descriptionDisplay_ != var2.descriptionDisplay_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + Float.floatToIntBits(this.getScale());
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Internal.hashBoolean(this.getAnimateMarkerOnHover());
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Internal.hashBoolean(this.getCompactMode());
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashBoolean(this.getTextShadow());
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getOwnerSuffix().hashCode();
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.ownerDisplay_;
      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + this.showOwner_;
      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + this.showCoordinates_;
      var1 = 37 * var1 + 9;
      var1 = 53 * var1 + this.showDistance_;
      var1 = 37 * var1 + 10;
      var1 = 53 * var1 + this.showDescription_;
      var1 = 37 * var1 + 11;
      var1 = 53 * var1 + this.descriptionDisplay_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static MarkerStyle parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static MarkerStyle parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MarkerStyle parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static MarkerStyle parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MarkerStyle parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static MarkerStyle parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MarkerStyle parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MarkerStyle parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MarkerStyle parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MarkerStyle parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MarkerStyle parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MarkerStyle parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MarkerStyle.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MarkerStyle.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MarkerStyle.Builder newBuilder(MarkerStyle var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MarkerStyle.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MarkerStyle.Builder() : new MarkerStyle.Builder().mergeFrom(this);
   }

   protected MarkerStyle.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new MarkerStyle.Builder(var1);
   }

   public static MarkerStyle getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<MarkerStyle> parser() {
      return PARSER;
   }

   @Override
   public Parser<MarkerStyle> getParserForType() {
      return PARSER;
   }

   public MarkerStyle getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<MarkerStyle.Builder> implements MarkerStyleOrBuilder {
      private int bitField0_;
      private float scale_;
      private boolean animateMarkerOnHover_;
      private boolean compactMode_;
      private boolean textShadow_;
      private Object ownerSuffix_ = "";
      private int ownerDisplay_ = 0;
      private int showOwner_ = 0;
      private int showCoordinates_ = 0;
      private int showDistance_ = 0;
      private int showDescription_ = 0;
      private int descriptionDisplay_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_MarkerStyle_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_MarkerStyle_fieldAccessorTable
            .ensureFieldAccessorsInitialized(MarkerStyle.class, MarkerStyle.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public MarkerStyle.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.scale_ = 0.0F;
         this.animateMarkerOnHover_ = false;
         this.compactMode_ = false;
         this.textShadow_ = false;
         this.ownerSuffix_ = "";
         this.ownerDisplay_ = 0;
         this.showOwner_ = 0;
         this.showCoordinates_ = 0;
         this.showDistance_ = 0;
         this.showDescription_ = 0;
         this.descriptionDisplay_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_MarkerStyle_descriptor;
      }

      public MarkerStyle getDefaultInstanceForType() {
         return MarkerStyle.getDefaultInstance();
      }

      public MarkerStyle build() {
         MarkerStyle var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MarkerStyle buildPartial() {
         MarkerStyle var1 = new MarkerStyle(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(MarkerStyle var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.scale_ = this.scale_;
         }

         if ((var2 & 2) != 0) {
            var1.animateMarkerOnHover_ = this.animateMarkerOnHover_;
         }

         if ((var2 & 4) != 0) {
            var1.compactMode_ = this.compactMode_;
         }

         if ((var2 & 8) != 0) {
            var1.textShadow_ = this.textShadow_;
         }

         if ((var2 & 16) != 0) {
            var1.ownerSuffix_ = this.ownerSuffix_;
         }

         if ((var2 & 32) != 0) {
            var1.ownerDisplay_ = this.ownerDisplay_;
         }

         if ((var2 & 64) != 0) {
            var1.showOwner_ = this.showOwner_;
         }

         if ((var2 & 128) != 0) {
            var1.showCoordinates_ = this.showCoordinates_;
         }

         if ((var2 & 256) != 0) {
            var1.showDistance_ = this.showDistance_;
         }

         if ((var2 & 512) != 0) {
            var1.showDescription_ = this.showDescription_;
         }

         if ((var2 & 1024) != 0) {
            var1.descriptionDisplay_ = this.descriptionDisplay_;
         }
      }

      public MarkerStyle.Builder clone() {
         return (MarkerStyle.Builder)super.clone();
      }

      public MarkerStyle.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (MarkerStyle.Builder)super.setField(var1, var2);
      }

      public MarkerStyle.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (MarkerStyle.Builder)super.clearField(var1);
      }

      public MarkerStyle.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (MarkerStyle.Builder)super.clearOneof(var1);
      }

      public MarkerStyle.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (MarkerStyle.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MarkerStyle.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (MarkerStyle.Builder)super.addRepeatedField(var1, var2);
      }

      public MarkerStyle.Builder mergeFrom(Message var1) {
         if (var1 instanceof MarkerStyle) {
            return this.mergeFrom((MarkerStyle)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public MarkerStyle.Builder mergeFrom(MarkerStyle var1) {
         if (var1 == MarkerStyle.getDefaultInstance()) {
            return this;
         }

         if (var1.getScale() != 0.0F) {
            this.setScale(var1.getScale());
         }

         if (var1.getAnimateMarkerOnHover()) {
            this.setAnimateMarkerOnHover(var1.getAnimateMarkerOnHover());
         }

         if (var1.getCompactMode()) {
            this.setCompactMode(var1.getCompactMode());
         }

         if (var1.getTextShadow()) {
            this.setTextShadow(var1.getTextShadow());
         }

         if (!var1.getOwnerSuffix().isEmpty()) {
            this.ownerSuffix_ = var1.ownerSuffix_;
            this.bitField0_ |= 16;
            this.onChanged();
         }

         if (var1.ownerDisplay_ != 0) {
            this.setOwnerDisplayValue(var1.getOwnerDisplayValue());
         }

         if (var1.showOwner_ != 0) {
            this.setShowOwnerValue(var1.getShowOwnerValue());
         }

         if (var1.showCoordinates_ != 0) {
            this.setShowCoordinatesValue(var1.getShowCoordinatesValue());
         }

         if (var1.showDistance_ != 0) {
            this.setShowDistanceValue(var1.getShowDistanceValue());
         }

         if (var1.showDescription_ != 0) {
            this.setShowDescriptionValue(var1.getShowDescriptionValue());
         }

         if (var1.descriptionDisplay_ != 0) {
            this.setDescriptionDisplayValue(var1.getDescriptionDisplayValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public MarkerStyle.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 13:
                     this.scale_ = var1.readFloat();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.animateMarkerOnHover_ = var1.readBool();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.compactMode_ = var1.readBool();
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.textShadow_ = var1.readBool();
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     this.ownerSuffix_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 16;
                     break;
                  case 48:
                     this.ownerDisplay_ = var1.readEnum();
                     this.bitField0_ |= 32;
                     break;
                  case 56:
                     this.showOwner_ = var1.readEnum();
                     this.bitField0_ |= 64;
                     break;
                  case 64:
                     this.showCoordinates_ = var1.readEnum();
                     this.bitField0_ |= 128;
                     break;
                  case 72:
                     this.showDistance_ = var1.readEnum();
                     this.bitField0_ |= 256;
                     break;
                  case 80:
                     this.showDescription_ = var1.readEnum();
                     this.bitField0_ |= 512;
                     break;
                  case 88:
                     this.descriptionDisplay_ = var1.readEnum();
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
      public float getScale() {
         return this.scale_;
      }

      public MarkerStyle.Builder setScale(float var1) {
         this.scale_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public MarkerStyle.Builder clearScale() {
         this.bitField0_ &= -2;
         this.scale_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getAnimateMarkerOnHover() {
         return this.animateMarkerOnHover_;
      }

      public MarkerStyle.Builder setAnimateMarkerOnHover(boolean var1) {
         this.animateMarkerOnHover_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public MarkerStyle.Builder clearAnimateMarkerOnHover() {
         this.bitField0_ &= -3;
         this.animateMarkerOnHover_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getCompactMode() {
         return this.compactMode_;
      }

      public MarkerStyle.Builder setCompactMode(boolean var1) {
         this.compactMode_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public MarkerStyle.Builder clearCompactMode() {
         this.bitField0_ &= -5;
         this.compactMode_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getTextShadow() {
         return this.textShadow_;
      }

      public MarkerStyle.Builder setTextShadow(boolean var1) {
         this.textShadow_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public MarkerStyle.Builder clearTextShadow() {
         this.bitField0_ &= -9;
         this.textShadow_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public String getOwnerSuffix() {
         Object var1 = this.ownerSuffix_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.ownerSuffix_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getOwnerSuffixBytes() {
         Object var1 = this.ownerSuffix_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.ownerSuffix_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public MarkerStyle.Builder setOwnerSuffix(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ownerSuffix_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public MarkerStyle.Builder clearOwnerSuffix() {
         this.ownerSuffix_ = MarkerStyle.getDefaultInstance().getOwnerSuffix();
         this.bitField0_ &= -17;
         this.onChanged();
         return this;
      }

      public MarkerStyle.Builder setOwnerSuffixBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         MarkerStyle.checkByteStringIsUtf8(var1);
         this.ownerSuffix_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      @Override
      public int getOwnerDisplayValue() {
         return this.ownerDisplay_;
      }

      public MarkerStyle.Builder setOwnerDisplayValue(int var1) {
         this.ownerDisplay_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      @Override
      public MarkerOwnerDisplay getOwnerDisplay() {
         MarkerOwnerDisplay var1 = MarkerOwnerDisplay.forNumber(this.ownerDisplay_);
         return var1 == null ? MarkerOwnerDisplay.UNRECOGNIZED : var1;
      }

      public MarkerStyle.Builder setOwnerDisplay(MarkerOwnerDisplay var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 32;
         this.ownerDisplay_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public MarkerStyle.Builder clearOwnerDisplay() {
         this.bitField0_ &= -33;
         this.ownerDisplay_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getShowOwnerValue() {
         return this.showOwner_;
      }

      public MarkerStyle.Builder setShowOwnerValue(int var1) {
         this.showOwner_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      @Override
      public MarkerDisplayCondition getShowOwner() {
         MarkerDisplayCondition var1 = MarkerDisplayCondition.forNumber(this.showOwner_);
         return var1 == null ? MarkerDisplayCondition.UNRECOGNIZED : var1;
      }

      public MarkerStyle.Builder setShowOwner(MarkerDisplayCondition var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 64;
         this.showOwner_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public MarkerStyle.Builder clearShowOwner() {
         this.bitField0_ &= -65;
         this.showOwner_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getShowCoordinatesValue() {
         return this.showCoordinates_;
      }

      public MarkerStyle.Builder setShowCoordinatesValue(int var1) {
         this.showCoordinates_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      @Override
      public MarkerDisplayCondition getShowCoordinates() {
         MarkerDisplayCondition var1 = MarkerDisplayCondition.forNumber(this.showCoordinates_);
         return var1 == null ? MarkerDisplayCondition.UNRECOGNIZED : var1;
      }

      public MarkerStyle.Builder setShowCoordinates(MarkerDisplayCondition var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 128;
         this.showCoordinates_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public MarkerStyle.Builder clearShowCoordinates() {
         this.bitField0_ &= -129;
         this.showCoordinates_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getShowDistanceValue() {
         return this.showDistance_;
      }

      public MarkerStyle.Builder setShowDistanceValue(int var1) {
         this.showDistance_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      @Override
      public MarkerDisplayCondition getShowDistance() {
         MarkerDisplayCondition var1 = MarkerDisplayCondition.forNumber(this.showDistance_);
         return var1 == null ? MarkerDisplayCondition.UNRECOGNIZED : var1;
      }

      public MarkerStyle.Builder setShowDistance(MarkerDisplayCondition var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 256;
         this.showDistance_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public MarkerStyle.Builder clearShowDistance() {
         this.bitField0_ &= -257;
         this.showDistance_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getShowDescriptionValue() {
         return this.showDescription_;
      }

      public MarkerStyle.Builder setShowDescriptionValue(int var1) {
         this.showDescription_ = var1;
         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      @Override
      public MarkerDisplayCondition getShowDescription() {
         MarkerDisplayCondition var1 = MarkerDisplayCondition.forNumber(this.showDescription_);
         return var1 == null ? MarkerDisplayCondition.UNRECOGNIZED : var1;
      }

      public MarkerStyle.Builder setShowDescription(MarkerDisplayCondition var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 512;
         this.showDescription_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public MarkerStyle.Builder clearShowDescription() {
         this.bitField0_ &= -513;
         this.showDescription_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getDescriptionDisplayValue() {
         return this.descriptionDisplay_;
      }

      public MarkerStyle.Builder setDescriptionDisplayValue(int var1) {
         this.descriptionDisplay_ = var1;
         this.bitField0_ |= 1024;
         this.onChanged();
         return this;
      }

      @Override
      public MarkerDescriptionDisplay getDescriptionDisplay() {
         MarkerDescriptionDisplay var1 = MarkerDescriptionDisplay.forNumber(this.descriptionDisplay_);
         return var1 == null ? MarkerDescriptionDisplay.UNRECOGNIZED : var1;
      }

      public MarkerStyle.Builder setDescriptionDisplay(MarkerDescriptionDisplay var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1024;
         this.descriptionDisplay_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public MarkerStyle.Builder clearDescriptionDisplay() {
         this.bitField0_ &= -1025;
         this.descriptionDisplay_ = 0;
         this.onChanged();
         return this;
      }

      public final MarkerStyle.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MarkerStyle.Builder)super.setUnknownFields(var1);
      }

      public final MarkerStyle.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MarkerStyle.Builder)super.mergeUnknownFields(var1);
      }
   }
}
