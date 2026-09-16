package com.lunarclient.apollo.cosmetic.v1;

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

public final class HatOptions extends GeneratedMessageV3 implements HatOptionsOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SHOW_OVER_HELMET_FIELD_NUMBER = 1;
   private boolean showOverHelmet_ = false;
   public static final int SHOW_OVER_SKIN_LAYER_FIELD_NUMBER = 2;
   private boolean showOverSkinLayer_ = false;
   public static final int HEIGHT_OFFSET_FIELD_NUMBER = 3;
   private float heightOffset_ = 0.0F;
   private byte memoizedIsInitialized = -1;
   private static final HatOptions DEFAULT_INSTANCE = new HatOptions();
   private static final Parser<HatOptions> PARSER = new AbstractParser<HatOptions>() {
      public HatOptions parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         HatOptions.Builder var3 = HatOptions.newBuilder();

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

   private HatOptions(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private HatOptions() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new HatOptions();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_HatOptions_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_HatOptions_fieldAccessorTable
         .ensureFieldAccessorsInitialized(HatOptions.class, HatOptions.Builder.class);
   }

   @Override
   public boolean getShowOverHelmet() {
      return this.showOverHelmet_;
   }

   @Override
   public boolean getShowOverSkinLayer() {
      return this.showOverSkinLayer_;
   }

   @Override
   public float getHeightOffset() {
      return this.heightOffset_;
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
      if (this.showOverHelmet_) {
         var1.writeBool(1, this.showOverHelmet_);
      }

      if (this.showOverSkinLayer_) {
         var1.writeBool(2, this.showOverSkinLayer_);
      }

      if (Float.floatToRawIntBits(this.heightOffset_) != 0) {
         var1.writeFloat(3, this.heightOffset_);
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
      if (this.showOverHelmet_) {
         var1 += CodedOutputStream.computeBoolSize(1, this.showOverHelmet_);
      }

      if (this.showOverSkinLayer_) {
         var1 += CodedOutputStream.computeBoolSize(2, this.showOverSkinLayer_);
      }

      if (Float.floatToRawIntBits(this.heightOffset_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(3, this.heightOffset_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof HatOptions)) {
         return super.equals(var1);
      } else {
         HatOptions var2 = (HatOptions)var1;
         if (this.getShowOverHelmet() != var2.getShowOverHelmet()) {
            return false;
         } else if (this.getShowOverSkinLayer() != var2.getShowOverSkinLayer()) {
            return false;
         } else {
            return Float.floatToIntBits(this.getHeightOffset()) != Float.floatToIntBits(var2.getHeightOffset())
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
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowOverHelmet());
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowOverSkinLayer());
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Float.floatToIntBits(this.getHeightOffset());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static HatOptions parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static HatOptions parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HatOptions parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static HatOptions parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HatOptions parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static HatOptions parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HatOptions parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static HatOptions parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static HatOptions parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static HatOptions parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static HatOptions parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static HatOptions parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public HatOptions.Builder newBuilderForType() {
      return newBuilder();
   }

   public static HatOptions.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static HatOptions.Builder newBuilder(HatOptions var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public HatOptions.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new HatOptions.Builder() : new HatOptions.Builder().mergeFrom(this);
   }

   protected HatOptions.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new HatOptions.Builder(var1);
   }

   public static HatOptions getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<HatOptions> parser() {
      return PARSER;
   }

   @Override
   public Parser<HatOptions> getParserForType() {
      return PARSER;
   }

   public HatOptions getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<HatOptions.Builder> implements HatOptionsOrBuilder {
      private int bitField0_;
      private boolean showOverHelmet_;
      private boolean showOverSkinLayer_;
      private float heightOffset_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_HatOptions_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_HatOptions_fieldAccessorTable
            .ensureFieldAccessorsInitialized(HatOptions.class, HatOptions.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public HatOptions.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.showOverHelmet_ = false;
         this.showOverSkinLayer_ = false;
         this.heightOffset_ = 0.0F;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_HatOptions_descriptor;
      }

      public HatOptions getDefaultInstanceForType() {
         return HatOptions.getDefaultInstance();
      }

      public HatOptions build() {
         HatOptions var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public HatOptions buildPartial() {
         HatOptions var1 = new HatOptions(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(HatOptions var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.showOverHelmet_ = this.showOverHelmet_;
         }

         if ((var2 & 2) != 0) {
            var1.showOverSkinLayer_ = this.showOverSkinLayer_;
         }

         if ((var2 & 4) != 0) {
            var1.heightOffset_ = this.heightOffset_;
         }
      }

      public HatOptions.Builder clone() {
         return (HatOptions.Builder)super.clone();
      }

      public HatOptions.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (HatOptions.Builder)super.setField(var1, var2);
      }

      public HatOptions.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (HatOptions.Builder)super.clearField(var1);
      }

      public HatOptions.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (HatOptions.Builder)super.clearOneof(var1);
      }

      public HatOptions.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (HatOptions.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public HatOptions.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (HatOptions.Builder)super.addRepeatedField(var1, var2);
      }

      public HatOptions.Builder mergeFrom(Message var1) {
         if (var1 instanceof HatOptions) {
            return this.mergeFrom((HatOptions)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public HatOptions.Builder mergeFrom(HatOptions var1) {
         if (var1 == HatOptions.getDefaultInstance()) {
            return this;
         }

         if (var1.getShowOverHelmet()) {
            this.setShowOverHelmet(var1.getShowOverHelmet());
         }

         if (var1.getShowOverSkinLayer()) {
            this.setShowOverSkinLayer(var1.getShowOverSkinLayer());
         }

         if (var1.getHeightOffset() != 0.0F) {
            this.setHeightOffset(var1.getHeightOffset());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public HatOptions.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.showOverHelmet_ = var1.readBool();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.showOverSkinLayer_ = var1.readBool();
                     this.bitField0_ |= 2;
                     break;
                  case 29:
                     this.heightOffset_ = var1.readFloat();
                     this.bitField0_ |= 4;
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
      public boolean getShowOverHelmet() {
         return this.showOverHelmet_;
      }

      public HatOptions.Builder setShowOverHelmet(boolean var1) {
         this.showOverHelmet_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public HatOptions.Builder clearShowOverHelmet() {
         this.bitField0_ &= -2;
         this.showOverHelmet_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getShowOverSkinLayer() {
         return this.showOverSkinLayer_;
      }

      public HatOptions.Builder setShowOverSkinLayer(boolean var1) {
         this.showOverSkinLayer_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public HatOptions.Builder clearShowOverSkinLayer() {
         this.bitField0_ &= -3;
         this.showOverSkinLayer_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public float getHeightOffset() {
         return this.heightOffset_;
      }

      public HatOptions.Builder setHeightOffset(float var1) {
         this.heightOffset_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public HatOptions.Builder clearHeightOffset() {
         this.bitField0_ &= -5;
         this.heightOffset_ = 0.0F;
         this.onChanged();
         return this;
      }

      public final HatOptions.Builder setUnknownFields(UnknownFieldSet var1) {
         return (HatOptions.Builder)super.setUnknownFields(var1);
      }

      public final HatOptions.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (HatOptions.Builder)super.mergeUnknownFields(var1);
      }
   }
}
