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

public final class CloakOptions extends GeneratedMessageV3 implements CloakOptionsOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int USE_CLOTH_PHYSICS_FIELD_NUMBER = 1;
   private boolean useClothPhysics_ = false;
   private byte memoizedIsInitialized = -1;
   private static final CloakOptions DEFAULT_INSTANCE = new CloakOptions();
   private static final Parser<CloakOptions> PARSER = new AbstractParser<CloakOptions>() {
      public CloakOptions parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         CloakOptions.Builder var3 = CloakOptions.newBuilder();

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

   private CloakOptions(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private CloakOptions() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new CloakOptions();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_CloakOptions_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_CloakOptions_fieldAccessorTable
         .ensureFieldAccessorsInitialized(CloakOptions.class, CloakOptions.Builder.class);
   }

   @Override
   public boolean getUseClothPhysics() {
      return this.useClothPhysics_;
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
      if (this.useClothPhysics_) {
         var1.writeBool(1, this.useClothPhysics_);
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
      if (this.useClothPhysics_) {
         var1 += CodedOutputStream.computeBoolSize(1, this.useClothPhysics_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof CloakOptions)) {
         return super.equals(var1);
      }

      CloakOptions var2 = (CloakOptions)var1;
      return this.getUseClothPhysics() != var2.getUseClothPhysics() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + Internal.hashBoolean(this.getUseClothPhysics());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static CloakOptions parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static CloakOptions parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CloakOptions parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static CloakOptions parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CloakOptions parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static CloakOptions parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CloakOptions parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CloakOptions parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CloakOptions parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CloakOptions parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CloakOptions parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CloakOptions parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CloakOptions.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CloakOptions.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CloakOptions.Builder newBuilder(CloakOptions var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CloakOptions.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CloakOptions.Builder() : new CloakOptions.Builder().mergeFrom(this);
   }

   protected CloakOptions.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new CloakOptions.Builder(var1);
   }

   public static CloakOptions getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<CloakOptions> parser() {
      return PARSER;
   }

   @Override
   public Parser<CloakOptions> getParserForType() {
      return PARSER;
   }

   public CloakOptions getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<CloakOptions.Builder> implements CloakOptionsOrBuilder {
      private int bitField0_;
      private boolean useClothPhysics_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_CloakOptions_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_CloakOptions_fieldAccessorTable
            .ensureFieldAccessorsInitialized(CloakOptions.class, CloakOptions.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public CloakOptions.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.useClothPhysics_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_CloakOptions_descriptor;
      }

      public CloakOptions getDefaultInstanceForType() {
         return CloakOptions.getDefaultInstance();
      }

      public CloakOptions build() {
         CloakOptions var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CloakOptions buildPartial() {
         CloakOptions var1 = new CloakOptions(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(CloakOptions var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.useClothPhysics_ = this.useClothPhysics_;
         }
      }

      public CloakOptions.Builder clone() {
         return (CloakOptions.Builder)super.clone();
      }

      public CloakOptions.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CloakOptions.Builder)super.setField(var1, var2);
      }

      public CloakOptions.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (CloakOptions.Builder)super.clearField(var1);
      }

      public CloakOptions.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (CloakOptions.Builder)super.clearOneof(var1);
      }

      public CloakOptions.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (CloakOptions.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CloakOptions.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CloakOptions.Builder)super.addRepeatedField(var1, var2);
      }

      public CloakOptions.Builder mergeFrom(Message var1) {
         if (var1 instanceof CloakOptions) {
            return this.mergeFrom((CloakOptions)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public CloakOptions.Builder mergeFrom(CloakOptions var1) {
         if (var1 == CloakOptions.getDefaultInstance()) {
            return this;
         }

         if (var1.getUseClothPhysics()) {
            this.setUseClothPhysics(var1.getUseClothPhysics());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public CloakOptions.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.useClothPhysics_ = var1.readBool();
                     this.bitField0_ |= 1;
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
      public boolean getUseClothPhysics() {
         return this.useClothPhysics_;
      }

      public CloakOptions.Builder setUseClothPhysics(boolean var1) {
         this.useClothPhysics_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public CloakOptions.Builder clearUseClothPhysics() {
         this.bitField0_ &= -2;
         this.useClothPhysics_ = false;
         this.onChanged();
         return this;
      }

      public final CloakOptions.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CloakOptions.Builder)super.setUnknownFields(var1);
      }

      public final CloakOptions.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CloakOptions.Builder)super.mergeUnknownFields(var1);
      }
   }
}
