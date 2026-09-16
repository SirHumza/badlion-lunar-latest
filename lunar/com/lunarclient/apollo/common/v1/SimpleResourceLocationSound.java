package com.lunarclient.apollo.common.v1;

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

public final class SimpleResourceLocationSound extends GeneratedMessageV3 implements SimpleResourceLocationSoundOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int RESOURCE_LOCATION_FIELD_NUMBER = 1;
   private volatile Object resourceLocation_ = "";
   private byte memoizedIsInitialized = -1;
   private static final SimpleResourceLocationSound DEFAULT_INSTANCE = new SimpleResourceLocationSound();
   private static final Parser<SimpleResourceLocationSound> PARSER = new AbstractParser<SimpleResourceLocationSound>() {
      public SimpleResourceLocationSound parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SimpleResourceLocationSound.Builder var3 = SimpleResourceLocationSound.newBuilder();

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

   private SimpleResourceLocationSound(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SimpleResourceLocationSound() {
      this.resourceLocation_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SimpleResourceLocationSound();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SoundProto.internal_static_lunarclient_apollo_common_v1_SimpleResourceLocationSound_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SoundProto.internal_static_lunarclient_apollo_common_v1_SimpleResourceLocationSound_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SimpleResourceLocationSound.class, SimpleResourceLocationSound.Builder.class);
   }

   @Override
   public String getResourceLocation() {
      Object var1 = this.resourceLocation_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.resourceLocation_ = var3;
      return var3;
   }

   @Override
   public ByteString getResourceLocationBytes() {
      Object var1 = this.resourceLocation_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.resourceLocation_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
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
      if (!GeneratedMessageV3.isStringEmpty(this.resourceLocation_)) {
         GeneratedMessageV3.writeString(var1, 1, this.resourceLocation_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.resourceLocation_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.resourceLocation_);
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

      if (!(var1 instanceof SimpleResourceLocationSound)) {
         return super.equals(var1);
      }

      SimpleResourceLocationSound var2 = (SimpleResourceLocationSound)var1;
      return !this.getResourceLocation().equals(var2.getResourceLocation()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getResourceLocation().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SimpleResourceLocationSound parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SimpleResourceLocationSound parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SimpleResourceLocationSound parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SimpleResourceLocationSound parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SimpleResourceLocationSound parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SimpleResourceLocationSound parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SimpleResourceLocationSound parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SimpleResourceLocationSound parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SimpleResourceLocationSound parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SimpleResourceLocationSound parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SimpleResourceLocationSound parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SimpleResourceLocationSound parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SimpleResourceLocationSound.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SimpleResourceLocationSound.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SimpleResourceLocationSound.Builder newBuilder(SimpleResourceLocationSound var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SimpleResourceLocationSound.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SimpleResourceLocationSound.Builder() : new SimpleResourceLocationSound.Builder().mergeFrom(this);
   }

   protected SimpleResourceLocationSound.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SimpleResourceLocationSound.Builder(var1);
   }

   public static SimpleResourceLocationSound getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SimpleResourceLocationSound> parser() {
      return PARSER;
   }

   @Override
   public Parser<SimpleResourceLocationSound> getParserForType() {
      return PARSER;
   }

   public SimpleResourceLocationSound getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SimpleResourceLocationSound.Builder> implements SimpleResourceLocationSoundOrBuilder {
      private int bitField0_;
      private Object resourceLocation_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return SoundProto.internal_static_lunarclient_apollo_common_v1_SimpleResourceLocationSound_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SoundProto.internal_static_lunarclient_apollo_common_v1_SimpleResourceLocationSound_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SimpleResourceLocationSound.class, SimpleResourceLocationSound.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SimpleResourceLocationSound.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.resourceLocation_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SoundProto.internal_static_lunarclient_apollo_common_v1_SimpleResourceLocationSound_descriptor;
      }

      public SimpleResourceLocationSound getDefaultInstanceForType() {
         return SimpleResourceLocationSound.getDefaultInstance();
      }

      public SimpleResourceLocationSound build() {
         SimpleResourceLocationSound var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SimpleResourceLocationSound buildPartial() {
         SimpleResourceLocationSound var1 = new SimpleResourceLocationSound(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SimpleResourceLocationSound var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.resourceLocation_ = this.resourceLocation_;
         }
      }

      public SimpleResourceLocationSound.Builder clone() {
         return (SimpleResourceLocationSound.Builder)super.clone();
      }

      public SimpleResourceLocationSound.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SimpleResourceLocationSound.Builder)super.setField(var1, var2);
      }

      public SimpleResourceLocationSound.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SimpleResourceLocationSound.Builder)super.clearField(var1);
      }

      public SimpleResourceLocationSound.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SimpleResourceLocationSound.Builder)super.clearOneof(var1);
      }

      public SimpleResourceLocationSound.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SimpleResourceLocationSound.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SimpleResourceLocationSound.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SimpleResourceLocationSound.Builder)super.addRepeatedField(var1, var2);
      }

      public SimpleResourceLocationSound.Builder mergeFrom(Message var1) {
         if (var1 instanceof SimpleResourceLocationSound) {
            return this.mergeFrom((SimpleResourceLocationSound)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SimpleResourceLocationSound.Builder mergeFrom(SimpleResourceLocationSound var1) {
         if (var1 == SimpleResourceLocationSound.getDefaultInstance()) {
            return this;
         }

         if (!var1.getResourceLocation().isEmpty()) {
            this.resourceLocation_ = var1.resourceLocation_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public SimpleResourceLocationSound.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.resourceLocation_ = var1.readStringRequireUtf8();
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
      public String getResourceLocation() {
         Object var1 = this.resourceLocation_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.resourceLocation_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getResourceLocationBytes() {
         Object var1 = this.resourceLocation_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.resourceLocation_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public SimpleResourceLocationSound.Builder setResourceLocation(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.resourceLocation_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SimpleResourceLocationSound.Builder clearResourceLocation() {
         this.resourceLocation_ = SimpleResourceLocationSound.getDefaultInstance().getResourceLocation();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public SimpleResourceLocationSound.Builder setResourceLocationBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         SimpleResourceLocationSound.checkByteStringIsUtf8(var1);
         this.resourceLocation_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final SimpleResourceLocationSound.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SimpleResourceLocationSound.Builder)super.setUnknownFields(var1);
      }

      public final SimpleResourceLocationSound.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SimpleResourceLocationSound.Builder)super.mergeUnknownFields(var1);
      }
   }
}
