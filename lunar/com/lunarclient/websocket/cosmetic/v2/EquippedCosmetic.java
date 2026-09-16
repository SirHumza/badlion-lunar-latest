package com.lunarclient.websocket.cosmetic.v2;

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
import com.google.protobuf.Struct;
import com.google.protobuf.StructOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class EquippedCosmetic extends GeneratedMessageV3 implements EquippedCosmeticOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int COSMETIC_ID_FIELD_NUMBER = 1;
   private int cosmeticId_ = 0;
   public static final int GECKOLIB_METADATA_FIELD_NUMBER = 2;
   private Struct geckolibMetadata_;
   public static final int CLOTH_CLOAK_FIELD_NUMBER = 3;
   private boolean clothCloak_ = false;
   public static final int SHOW_OVER_SKIN_LAYER_FIELD_NUMBER = 4;
   private boolean showOverSkinLayer_ = false;
   public static final int SHOW_OVER_HELMET_FIELD_NUMBER = 5;
   private boolean showOverHelmet_ = false;
   public static final int SHOW_OVER_CHESTPLATE_FIELD_NUMBER = 6;
   private boolean showOverChestplate_ = false;
   public static final int SHOW_OVER_LEGGINGS_FIELD_NUMBER = 7;
   private boolean showOverLeggings_ = false;
   public static final int SHOW_OVER_BOOTS_FIELD_NUMBER = 8;
   private boolean showOverBoots_ = false;
   public static final int HAT_HEIGHT_OFFSET_FIELD_NUMBER = 9;
   private float hatHeightOffset_ = 0.0F;
   public static final int FLIP_ARM_FIELD_NUMBER = 10;
   private boolean flipArm_ = false;
   private byte memoizedIsInitialized = -1;
   private static final EquippedCosmetic DEFAULT_INSTANCE = new EquippedCosmetic();
   private static final Parser<EquippedCosmetic> PARSER = new AbstractParser<EquippedCosmetic>() {
      public EquippedCosmetic parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EquippedCosmetic.Builder var3 = EquippedCosmetic.newBuilder();

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

   private EquippedCosmetic(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EquippedCosmetic() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EquippedCosmetic();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_EquippedCosmetic_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_EquippedCosmetic_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EquippedCosmetic.class, EquippedCosmetic.Builder.class);
   }

   @Override
   public int getCosmeticId() {
      return this.cosmeticId_;
   }

   @Override
   public boolean hasGeckolibMetadata() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Struct getGeckolibMetadata() {
      return this.geckolibMetadata_ == null ? Struct.getDefaultInstance() : this.geckolibMetadata_;
   }

   @Override
   public StructOrBuilder getGeckolibMetadataOrBuilder() {
      return this.geckolibMetadata_ == null ? Struct.getDefaultInstance() : this.geckolibMetadata_;
   }

   @Override
   public boolean getClothCloak() {
      return this.clothCloak_;
   }

   @Override
   public boolean getShowOverSkinLayer() {
      return this.showOverSkinLayer_;
   }

   @Override
   public boolean getShowOverHelmet() {
      return this.showOverHelmet_;
   }

   @Override
   public boolean getShowOverChestplate() {
      return this.showOverChestplate_;
   }

   @Override
   public boolean getShowOverLeggings() {
      return this.showOverLeggings_;
   }

   @Override
   public boolean getShowOverBoots() {
      return this.showOverBoots_;
   }

   @Override
   public float getHatHeightOffset() {
      return this.hatHeightOffset_;
   }

   @Override
   public boolean getFlipArm() {
      return this.flipArm_;
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
      if (this.cosmeticId_ != 0) {
         var1.writeInt32(1, this.cosmeticId_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getGeckolibMetadata());
      }

      if (this.clothCloak_) {
         var1.writeBool(3, this.clothCloak_);
      }

      if (this.showOverSkinLayer_) {
         var1.writeBool(4, this.showOverSkinLayer_);
      }

      if (this.showOverHelmet_) {
         var1.writeBool(5, this.showOverHelmet_);
      }

      if (this.showOverChestplate_) {
         var1.writeBool(6, this.showOverChestplate_);
      }

      if (this.showOverLeggings_) {
         var1.writeBool(7, this.showOverLeggings_);
      }

      if (this.showOverBoots_) {
         var1.writeBool(8, this.showOverBoots_);
      }

      if (Float.floatToRawIntBits(this.hatHeightOffset_) != 0) {
         var1.writeFloat(9, this.hatHeightOffset_);
      }

      if (this.flipArm_) {
         var1.writeBool(10, this.flipArm_);
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
      if (this.cosmeticId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.cosmeticId_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getGeckolibMetadata());
      }

      if (this.clothCloak_) {
         var1 += CodedOutputStream.computeBoolSize(3, this.clothCloak_);
      }

      if (this.showOverSkinLayer_) {
         var1 += CodedOutputStream.computeBoolSize(4, this.showOverSkinLayer_);
      }

      if (this.showOverHelmet_) {
         var1 += CodedOutputStream.computeBoolSize(5, this.showOverHelmet_);
      }

      if (this.showOverChestplate_) {
         var1 += CodedOutputStream.computeBoolSize(6, this.showOverChestplate_);
      }

      if (this.showOverLeggings_) {
         var1 += CodedOutputStream.computeBoolSize(7, this.showOverLeggings_);
      }

      if (this.showOverBoots_) {
         var1 += CodedOutputStream.computeBoolSize(8, this.showOverBoots_);
      }

      if (Float.floatToRawIntBits(this.hatHeightOffset_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(9, this.hatHeightOffset_);
      }

      if (this.flipArm_) {
         var1 += CodedOutputStream.computeBoolSize(10, this.flipArm_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof EquippedCosmetic)) {
         return super.equals(var1);
      } else {
         EquippedCosmetic var2 = (EquippedCosmetic)var1;
         if (this.getCosmeticId() != var2.getCosmeticId()) {
            return false;
         } else if (this.hasGeckolibMetadata() != var2.hasGeckolibMetadata()) {
            return false;
         } else if (this.hasGeckolibMetadata() && !this.getGeckolibMetadata().equals(var2.getGeckolibMetadata())) {
            return false;
         } else if (this.getClothCloak() != var2.getClothCloak()) {
            return false;
         } else if (this.getShowOverSkinLayer() != var2.getShowOverSkinLayer()) {
            return false;
         } else if (this.getShowOverHelmet() != var2.getShowOverHelmet()) {
            return false;
         } else if (this.getShowOverChestplate() != var2.getShowOverChestplate()) {
            return false;
         } else if (this.getShowOverLeggings() != var2.getShowOverLeggings()) {
            return false;
         } else if (this.getShowOverBoots() != var2.getShowOverBoots()) {
            return false;
         } else if (Float.floatToIntBits(this.getHatHeightOffset()) != Float.floatToIntBits(var2.getHatHeightOffset())) {
            return false;
         } else {
            return this.getFlipArm() != var2.getFlipArm() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getCosmeticId();
      if (this.hasGeckolibMetadata()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getGeckolibMetadata().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Internal.hashBoolean(this.getClothCloak());
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowOverSkinLayer());
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowOverHelmet());
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowOverChestplate());
      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowOverLeggings());
      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowOverBoots());
      var1 = 37 * var1 + 9;
      var1 = 53 * var1 + Float.floatToIntBits(this.getHatHeightOffset());
      var1 = 37 * var1 + 10;
      var1 = 53 * var1 + Internal.hashBoolean(this.getFlipArm());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EquippedCosmetic parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EquippedCosmetic parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EquippedCosmetic parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EquippedCosmetic parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EquippedCosmetic parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EquippedCosmetic parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EquippedCosmetic parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EquippedCosmetic parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EquippedCosmetic parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EquippedCosmetic parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EquippedCosmetic parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EquippedCosmetic parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EquippedCosmetic.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EquippedCosmetic.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EquippedCosmetic.Builder newBuilder(EquippedCosmetic var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EquippedCosmetic.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EquippedCosmetic.Builder() : new EquippedCosmetic.Builder().mergeFrom(this);
   }

   protected EquippedCosmetic.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EquippedCosmetic.Builder(var1);
   }

   public static EquippedCosmetic getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EquippedCosmetic> parser() {
      return PARSER;
   }

   @Override
   public Parser<EquippedCosmetic> getParserForType() {
      return PARSER;
   }

   public EquippedCosmetic getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EquippedCosmetic.Builder> implements EquippedCosmeticOrBuilder {
      private int bitField0_;
      private int cosmeticId_;
      private Struct geckolibMetadata_;
      private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> geckolibMetadataBuilder_;
      private boolean clothCloak_;
      private boolean showOverSkinLayer_;
      private boolean showOverHelmet_;
      private boolean showOverChestplate_;
      private boolean showOverLeggings_;
      private boolean showOverBoots_;
      private float hatHeightOffset_;
      private boolean flipArm_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_EquippedCosmetic_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_EquippedCosmetic_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EquippedCosmetic.class, EquippedCosmetic.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (EquippedCosmetic.alwaysUseFieldBuilders) {
            this.getGeckolibMetadataFieldBuilder();
         }
      }

      public EquippedCosmetic.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.cosmeticId_ = 0;
         this.geckolibMetadata_ = null;
         if (this.geckolibMetadataBuilder_ != null) {
            this.geckolibMetadataBuilder_.dispose();
            this.geckolibMetadataBuilder_ = null;
         }

         this.clothCloak_ = false;
         this.showOverSkinLayer_ = false;
         this.showOverHelmet_ = false;
         this.showOverChestplate_ = false;
         this.showOverLeggings_ = false;
         this.showOverBoots_ = false;
         this.hatHeightOffset_ = 0.0F;
         this.flipArm_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_EquippedCosmetic_descriptor;
      }

      public EquippedCosmetic getDefaultInstanceForType() {
         return EquippedCosmetic.getDefaultInstance();
      }

      public EquippedCosmetic build() {
         EquippedCosmetic var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EquippedCosmetic buildPartial() {
         EquippedCosmetic var1 = new EquippedCosmetic(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(EquippedCosmetic var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.cosmeticId_ = this.cosmeticId_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.geckolibMetadata_ = this.geckolibMetadataBuilder_ == null ? this.geckolibMetadata_ : this.geckolibMetadataBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            var1.clothCloak_ = this.clothCloak_;
         }

         if ((var2 & 8) != 0) {
            var1.showOverSkinLayer_ = this.showOverSkinLayer_;
         }

         if ((var2 & 16) != 0) {
            var1.showOverHelmet_ = this.showOverHelmet_;
         }

         if ((var2 & 32) != 0) {
            var1.showOverChestplate_ = this.showOverChestplate_;
         }

         if ((var2 & 64) != 0) {
            var1.showOverLeggings_ = this.showOverLeggings_;
         }

         if ((var2 & 128) != 0) {
            var1.showOverBoots_ = this.showOverBoots_;
         }

         if ((var2 & 256) != 0) {
            var1.hatHeightOffset_ = this.hatHeightOffset_;
         }

         if ((var2 & 512) != 0) {
            var1.flipArm_ = this.flipArm_;
         }

         EquippedCosmetic var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public EquippedCosmetic.Builder clone() {
         return (EquippedCosmetic.Builder)super.clone();
      }

      public EquippedCosmetic.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EquippedCosmetic.Builder)super.setField(var1, var2);
      }

      public EquippedCosmetic.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EquippedCosmetic.Builder)super.clearField(var1);
      }

      public EquippedCosmetic.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EquippedCosmetic.Builder)super.clearOneof(var1);
      }

      public EquippedCosmetic.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EquippedCosmetic.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EquippedCosmetic.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EquippedCosmetic.Builder)super.addRepeatedField(var1, var2);
      }

      public EquippedCosmetic.Builder mergeFrom(Message var1) {
         if (var1 instanceof EquippedCosmetic) {
            return this.mergeFrom((EquippedCosmetic)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EquippedCosmetic.Builder mergeFrom(EquippedCosmetic var1) {
         if (var1 == EquippedCosmetic.getDefaultInstance()) {
            return this;
         }

         if (var1.getCosmeticId() != 0) {
            this.setCosmeticId(var1.getCosmeticId());
         }

         if (var1.hasGeckolibMetadata()) {
            this.mergeGeckolibMetadata(var1.getGeckolibMetadata());
         }

         if (var1.getClothCloak()) {
            this.setClothCloak(var1.getClothCloak());
         }

         if (var1.getShowOverSkinLayer()) {
            this.setShowOverSkinLayer(var1.getShowOverSkinLayer());
         }

         if (var1.getShowOverHelmet()) {
            this.setShowOverHelmet(var1.getShowOverHelmet());
         }

         if (var1.getShowOverChestplate()) {
            this.setShowOverChestplate(var1.getShowOverChestplate());
         }

         if (var1.getShowOverLeggings()) {
            this.setShowOverLeggings(var1.getShowOverLeggings());
         }

         if (var1.getShowOverBoots()) {
            this.setShowOverBoots(var1.getShowOverBoots());
         }

         if (var1.getHatHeightOffset() != 0.0F) {
            this.setHatHeightOffset(var1.getHatHeightOffset());
         }

         if (var1.getFlipArm()) {
            this.setFlipArm(var1.getFlipArm());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public EquippedCosmetic.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.cosmeticId_ = var1.readInt32();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getGeckolibMetadataFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.clothCloak_ = var1.readBool();
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.showOverSkinLayer_ = var1.readBool();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.showOverHelmet_ = var1.readBool();
                     this.bitField0_ |= 16;
                     break;
                  case 48:
                     this.showOverChestplate_ = var1.readBool();
                     this.bitField0_ |= 32;
                     break;
                  case 56:
                     this.showOverLeggings_ = var1.readBool();
                     this.bitField0_ |= 64;
                     break;
                  case 64:
                     this.showOverBoots_ = var1.readBool();
                     this.bitField0_ |= 128;
                     break;
                  case 77:
                     this.hatHeightOffset_ = var1.readFloat();
                     this.bitField0_ |= 256;
                     break;
                  case 80:
                     this.flipArm_ = var1.readBool();
                     this.bitField0_ |= 512;
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
      public int getCosmeticId() {
         return this.cosmeticId_;
      }

      public EquippedCosmetic.Builder setCosmeticId(int var1) {
         this.cosmeticId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public EquippedCosmetic.Builder clearCosmeticId() {
         this.bitField0_ &= -2;
         this.cosmeticId_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasGeckolibMetadata() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Struct getGeckolibMetadata() {
         if (this.geckolibMetadataBuilder_ == null) {
            return this.geckolibMetadata_ == null ? Struct.getDefaultInstance() : this.geckolibMetadata_;
         } else {
            return this.geckolibMetadataBuilder_.getMessage();
         }
      }

      public EquippedCosmetic.Builder setGeckolibMetadata(Struct var1) {
         if (this.geckolibMetadataBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.geckolibMetadata_ = var1;
         } else {
            this.geckolibMetadataBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public EquippedCosmetic.Builder setGeckolibMetadata(Struct.Builder var1) {
         if (this.geckolibMetadataBuilder_ == null) {
            this.geckolibMetadata_ = var1.build();
         } else {
            this.geckolibMetadataBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public EquippedCosmetic.Builder mergeGeckolibMetadata(Struct var1) {
         if (this.geckolibMetadataBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.geckolibMetadata_ != null && this.geckolibMetadata_ != Struct.getDefaultInstance()) {
               this.getGeckolibMetadataBuilder().mergeFrom(var1);
            } else {
               this.geckolibMetadata_ = var1;
            }
         } else {
            this.geckolibMetadataBuilder_.mergeFrom(var1);
         }

         if (this.geckolibMetadata_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public EquippedCosmetic.Builder clearGeckolibMetadata() {
         this.bitField0_ &= -3;
         this.geckolibMetadata_ = null;
         if (this.geckolibMetadataBuilder_ != null) {
            this.geckolibMetadataBuilder_.dispose();
            this.geckolibMetadataBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Struct.Builder getGeckolibMetadataBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getGeckolibMetadataFieldBuilder().getBuilder();
      }

      @Override
      public StructOrBuilder getGeckolibMetadataOrBuilder() {
         if (this.geckolibMetadataBuilder_ != null) {
            return this.geckolibMetadataBuilder_.getMessageOrBuilder();
         } else {
            return this.geckolibMetadata_ == null ? Struct.getDefaultInstance() : this.geckolibMetadata_;
         }
      }

      private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getGeckolibMetadataFieldBuilder() {
         if (this.geckolibMetadataBuilder_ == null) {
            this.geckolibMetadataBuilder_ = new SingleFieldBuilderV3<>(this.getGeckolibMetadata(), this.getParentForChildren(), this.isClean());
            this.geckolibMetadata_ = null;
         }

         return this.geckolibMetadataBuilder_;
      }

      @Override
      public boolean getClothCloak() {
         return this.clothCloak_;
      }

      public EquippedCosmetic.Builder setClothCloak(boolean var1) {
         this.clothCloak_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public EquippedCosmetic.Builder clearClothCloak() {
         this.bitField0_ &= -5;
         this.clothCloak_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getShowOverSkinLayer() {
         return this.showOverSkinLayer_;
      }

      public EquippedCosmetic.Builder setShowOverSkinLayer(boolean var1) {
         this.showOverSkinLayer_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public EquippedCosmetic.Builder clearShowOverSkinLayer() {
         this.bitField0_ &= -9;
         this.showOverSkinLayer_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getShowOverHelmet() {
         return this.showOverHelmet_;
      }

      public EquippedCosmetic.Builder setShowOverHelmet(boolean var1) {
         this.showOverHelmet_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public EquippedCosmetic.Builder clearShowOverHelmet() {
         this.bitField0_ &= -17;
         this.showOverHelmet_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getShowOverChestplate() {
         return this.showOverChestplate_;
      }

      public EquippedCosmetic.Builder setShowOverChestplate(boolean var1) {
         this.showOverChestplate_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public EquippedCosmetic.Builder clearShowOverChestplate() {
         this.bitField0_ &= -33;
         this.showOverChestplate_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getShowOverLeggings() {
         return this.showOverLeggings_;
      }

      public EquippedCosmetic.Builder setShowOverLeggings(boolean var1) {
         this.showOverLeggings_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public EquippedCosmetic.Builder clearShowOverLeggings() {
         this.bitField0_ &= -65;
         this.showOverLeggings_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getShowOverBoots() {
         return this.showOverBoots_;
      }

      public EquippedCosmetic.Builder setShowOverBoots(boolean var1) {
         this.showOverBoots_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public EquippedCosmetic.Builder clearShowOverBoots() {
         this.bitField0_ &= -129;
         this.showOverBoots_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public float getHatHeightOffset() {
         return this.hatHeightOffset_;
      }

      public EquippedCosmetic.Builder setHatHeightOffset(float var1) {
         this.hatHeightOffset_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public EquippedCosmetic.Builder clearHatHeightOffset() {
         this.bitField0_ &= -257;
         this.hatHeightOffset_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getFlipArm() {
         return this.flipArm_;
      }

      public EquippedCosmetic.Builder setFlipArm(boolean var1) {
         this.flipArm_ = var1;
         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      public EquippedCosmetic.Builder clearFlipArm() {
         this.bitField0_ &= -513;
         this.flipArm_ = false;
         this.onChanged();
         return this;
      }

      public final EquippedCosmetic.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EquippedCosmetic.Builder)super.setUnknownFields(var1);
      }

      public final EquippedCosmetic.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EquippedCosmetic.Builder)super.mergeUnknownFields(var1);
      }
   }
}
