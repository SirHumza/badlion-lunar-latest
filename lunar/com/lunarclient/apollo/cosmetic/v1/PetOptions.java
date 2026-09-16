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

public final class PetOptions extends GeneratedMessageV3 implements PetOptionsOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int FLIP_SHOULDER_FIELD_NUMBER = 1;
   private boolean flipShoulder_ = false;
   private byte memoizedIsInitialized = -1;
   private static final PetOptions DEFAULT_INSTANCE = new PetOptions();
   private static final Parser<PetOptions> PARSER = new AbstractParser<PetOptions>() {
      public PetOptions parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PetOptions.Builder var3 = PetOptions.newBuilder();

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

   private PetOptions(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PetOptions() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PetOptions();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_PetOptions_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_PetOptions_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PetOptions.class, PetOptions.Builder.class);
   }

   @Override
   public boolean getFlipShoulder() {
      return this.flipShoulder_;
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
      if (this.flipShoulder_) {
         var1.writeBool(1, this.flipShoulder_);
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
      if (this.flipShoulder_) {
         var1 += CodedOutputStream.computeBoolSize(1, this.flipShoulder_);
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

      if (!(var1 instanceof PetOptions)) {
         return super.equals(var1);
      }

      PetOptions var2 = (PetOptions)var1;
      return this.getFlipShoulder() != var2.getFlipShoulder() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + Internal.hashBoolean(this.getFlipShoulder());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PetOptions parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PetOptions parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PetOptions parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PetOptions parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PetOptions parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PetOptions parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PetOptions parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PetOptions parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PetOptions parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PetOptions parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PetOptions parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PetOptions parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PetOptions.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PetOptions.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PetOptions.Builder newBuilder(PetOptions var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PetOptions.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PetOptions.Builder() : new PetOptions.Builder().mergeFrom(this);
   }

   protected PetOptions.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PetOptions.Builder(var1);
   }

   public static PetOptions getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PetOptions> parser() {
      return PARSER;
   }

   @Override
   public Parser<PetOptions> getParserForType() {
      return PARSER;
   }

   public PetOptions getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PetOptions.Builder> implements PetOptionsOrBuilder {
      private int bitField0_;
      private boolean flipShoulder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_PetOptions_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_PetOptions_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PetOptions.class, PetOptions.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public PetOptions.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.flipShoulder_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_PetOptions_descriptor;
      }

      public PetOptions getDefaultInstanceForType() {
         return PetOptions.getDefaultInstance();
      }

      public PetOptions build() {
         PetOptions var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PetOptions buildPartial() {
         PetOptions var1 = new PetOptions(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(PetOptions var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.flipShoulder_ = this.flipShoulder_;
         }
      }

      public PetOptions.Builder clone() {
         return (PetOptions.Builder)super.clone();
      }

      public PetOptions.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PetOptions.Builder)super.setField(var1, var2);
      }

      public PetOptions.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PetOptions.Builder)super.clearField(var1);
      }

      public PetOptions.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PetOptions.Builder)super.clearOneof(var1);
      }

      public PetOptions.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PetOptions.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PetOptions.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PetOptions.Builder)super.addRepeatedField(var1, var2);
      }

      public PetOptions.Builder mergeFrom(Message var1) {
         if (var1 instanceof PetOptions) {
            return this.mergeFrom((PetOptions)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PetOptions.Builder mergeFrom(PetOptions var1) {
         if (var1 == PetOptions.getDefaultInstance()) {
            return this;
         }

         if (var1.getFlipShoulder()) {
            this.setFlipShoulder(var1.getFlipShoulder());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public PetOptions.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.flipShoulder_ = var1.readBool();
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
      public boolean getFlipShoulder() {
         return this.flipShoulder_;
      }

      public PetOptions.Builder setFlipShoulder(boolean var1) {
         this.flipShoulder_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PetOptions.Builder clearFlipShoulder() {
         this.bitField0_ &= -2;
         this.flipShoulder_ = false;
         this.onChanged();
         return this;
      }

      public final PetOptions.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PetOptions.Builder)super.setUnknownFields(var1);
      }

      public final PetOptions.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PetOptions.Builder)super.mergeUnknownFields(var1);
      }
   }
}
