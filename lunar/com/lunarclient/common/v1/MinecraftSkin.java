package com.lunarclient.common.v1;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class MinecraftSkin extends GeneratedMessageV3 implements MinecraftSkinOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int TEXTURE_ID_FIELD_NUMBER = 1;
   private volatile Object textureId_ = "";
   public static final int MODEL_FIELD_NUMBER = 2;
   private int model_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final MinecraftSkin DEFAULT_INSTANCE = new MinecraftSkin();
   private static final Parser<MinecraftSkin> PARSER = new AbstractParser<MinecraftSkin>() {
      public MinecraftSkin parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         MinecraftSkin.Builder var3 = MinecraftSkin.newBuilder();

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

   private MinecraftSkin(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private MinecraftSkin() {
      this.textureId_ = "";
      this.model_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new MinecraftSkin();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SkinProto.internal_static_lunarclient_common_v1_MinecraftSkin_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SkinProto.internal_static_lunarclient_common_v1_MinecraftSkin_fieldAccessorTable
         .ensureFieldAccessorsInitialized(MinecraftSkin.class, MinecraftSkin.Builder.class);
   }

   @Override
   public String getTextureId() {
      Object var1 = this.textureId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.textureId_ = var3;
      return var3;
   }

   @Override
   public ByteString getTextureIdBytes() {
      Object var1 = this.textureId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.textureId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getModelValue() {
      return this.model_;
   }

   @Override
   public MinecraftSkinModel getModel() {
      MinecraftSkinModel var1 = MinecraftSkinModel.forNumber(this.model_);
      return var1 == null ? MinecraftSkinModel.UNRECOGNIZED : var1;
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
      if (!GeneratedMessageV3.isStringEmpty(this.textureId_)) {
         GeneratedMessageV3.writeString(var1, 1, this.textureId_);
      }

      if (this.model_ != MinecraftSkinModel.MINECRAFT_SKIN_MODEL_UNSPECIFIED.getNumber()) {
         var1.writeEnum(2, this.model_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.textureId_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.textureId_);
      }

      if (this.model_ != MinecraftSkinModel.MINECRAFT_SKIN_MODEL_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(2, this.model_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof MinecraftSkin)) {
         return super.equals(var1);
      } else {
         MinecraftSkin var2 = (MinecraftSkin)var1;
         if (!this.getTextureId().equals(var2.getTextureId())) {
            return false;
         } else {
            return this.model_ != var2.model_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getTextureId().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.model_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static MinecraftSkin parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static MinecraftSkin parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MinecraftSkin parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static MinecraftSkin parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MinecraftSkin parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static MinecraftSkin parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MinecraftSkin parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MinecraftSkin parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MinecraftSkin parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MinecraftSkin parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MinecraftSkin parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MinecraftSkin parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MinecraftSkin.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MinecraftSkin.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MinecraftSkin.Builder newBuilder(MinecraftSkin var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MinecraftSkin.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MinecraftSkin.Builder() : new MinecraftSkin.Builder().mergeFrom(this);
   }

   protected MinecraftSkin.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new MinecraftSkin.Builder(var1);
   }

   public static MinecraftSkin getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<MinecraftSkin> parser() {
      return PARSER;
   }

   @Override
   public Parser<MinecraftSkin> getParserForType() {
      return PARSER;
   }

   public MinecraftSkin getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<MinecraftSkin.Builder> implements MinecraftSkinOrBuilder {
      private int bitField0_;
      private Object textureId_ = "";
      private int model_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return SkinProto.internal_static_lunarclient_common_v1_MinecraftSkin_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SkinProto.internal_static_lunarclient_common_v1_MinecraftSkin_fieldAccessorTable
            .ensureFieldAccessorsInitialized(MinecraftSkin.class, MinecraftSkin.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public MinecraftSkin.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.textureId_ = "";
         this.model_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SkinProto.internal_static_lunarclient_common_v1_MinecraftSkin_descriptor;
      }

      public MinecraftSkin getDefaultInstanceForType() {
         return MinecraftSkin.getDefaultInstance();
      }

      public MinecraftSkin build() {
         MinecraftSkin var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MinecraftSkin buildPartial() {
         MinecraftSkin var1 = new MinecraftSkin(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(MinecraftSkin var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.textureId_ = this.textureId_;
         }

         if ((var2 & 2) != 0) {
            var1.model_ = this.model_;
         }
      }

      public MinecraftSkin.Builder clone() {
         return (MinecraftSkin.Builder)super.clone();
      }

      public MinecraftSkin.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (MinecraftSkin.Builder)super.setField(var1, var2);
      }

      public MinecraftSkin.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (MinecraftSkin.Builder)super.clearField(var1);
      }

      public MinecraftSkin.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (MinecraftSkin.Builder)super.clearOneof(var1);
      }

      public MinecraftSkin.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (MinecraftSkin.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MinecraftSkin.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (MinecraftSkin.Builder)super.addRepeatedField(var1, var2);
      }

      public MinecraftSkin.Builder mergeFrom(Message var1) {
         if (var1 instanceof MinecraftSkin) {
            return this.mergeFrom((MinecraftSkin)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public MinecraftSkin.Builder mergeFrom(MinecraftSkin var1) {
         if (var1 == MinecraftSkin.getDefaultInstance()) {
            return this;
         }

         if (!var1.getTextureId().isEmpty()) {
            this.textureId_ = var1.textureId_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.model_ != 0) {
            this.setModelValue(var1.getModelValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public MinecraftSkin.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.textureId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.model_ = var1.readEnum();
                     this.bitField0_ |= 2;
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
      public String getTextureId() {
         Object var1 = this.textureId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.textureId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getTextureIdBytes() {
         Object var1 = this.textureId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.textureId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public MinecraftSkin.Builder setTextureId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.textureId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public MinecraftSkin.Builder clearTextureId() {
         this.textureId_ = MinecraftSkin.getDefaultInstance().getTextureId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public MinecraftSkin.Builder setTextureIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         MinecraftSkin.checkByteStringIsUtf8(var1);
         this.textureId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public int getModelValue() {
         return this.model_;
      }

      public MinecraftSkin.Builder setModelValue(int var1) {
         this.model_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public MinecraftSkinModel getModel() {
         MinecraftSkinModel var1 = MinecraftSkinModel.forNumber(this.model_);
         return var1 == null ? MinecraftSkinModel.UNRECOGNIZED : var1;
      }

      public MinecraftSkin.Builder setModel(MinecraftSkinModel var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.model_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public MinecraftSkin.Builder clearModel() {
         this.bitField0_ &= -3;
         this.model_ = 0;
         this.onChanged();
         return this;
      }

      public final MinecraftSkin.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MinecraftSkin.Builder)super.setUnknownFields(var1);
      }

      public final MinecraftSkin.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MinecraftSkin.Builder)super.mergeUnknownFields(var1);
      }
   }
}
