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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UuidAndUsername extends GeneratedMessageV3 implements UuidAndUsernameOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int UUID_FIELD_NUMBER = 1;
   private Uuid uuid_;
   public static final int USERNAME_FIELD_NUMBER = 2;
   private volatile Object username_ = "";
   private byte memoizedIsInitialized = -1;
   private static final UuidAndUsername DEFAULT_INSTANCE = new UuidAndUsername();
   private static final Parser<UuidAndUsername> PARSER = new AbstractParser<UuidAndUsername>() {
      public UuidAndUsername parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UuidAndUsername.Builder var3 = UuidAndUsername.newBuilder();

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

   private UuidAndUsername(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UuidAndUsername() {
      this.username_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UuidAndUsername();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return UuidProto.internal_static_lunarclient_common_v1_UuidAndUsername_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return UuidProto.internal_static_lunarclient_common_v1_UuidAndUsername_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UuidAndUsername.class, UuidAndUsername.Builder.class);
   }

   @Override
   public boolean hasUuid() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getUuid() {
      return this.uuid_ == null ? Uuid.getDefaultInstance() : this.uuid_;
   }

   @Override
   public UuidOrBuilder getUuidOrBuilder() {
      return this.uuid_ == null ? Uuid.getDefaultInstance() : this.uuid_;
   }

   @Override
   public String getUsername() {
      Object var1 = this.username_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.username_ = var3;
      return var3;
   }

   @Override
   public ByteString getUsernameBytes() {
      Object var1 = this.username_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.username_ = var2;
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
      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(1, this.getUuid());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.username_)) {
         GeneratedMessageV3.writeString(var1, 2, this.username_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getUuid());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.username_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.username_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof UuidAndUsername)) {
         return super.equals(var1);
      } else {
         UuidAndUsername var2 = (UuidAndUsername)var1;
         if (this.hasUuid() != var2.hasUuid()) {
            return false;
         } else if (this.hasUuid() && !this.getUuid().equals(var2.getUuid())) {
            return false;
         } else {
            return !this.getUsername().equals(var2.getUsername()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasUuid()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getUuid().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getUsername().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UuidAndUsername parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UuidAndUsername parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UuidAndUsername parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UuidAndUsername parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UuidAndUsername parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UuidAndUsername parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UuidAndUsername parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UuidAndUsername parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UuidAndUsername parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UuidAndUsername parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UuidAndUsername parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UuidAndUsername parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UuidAndUsername.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UuidAndUsername.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UuidAndUsername.Builder newBuilder(UuidAndUsername var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UuidAndUsername.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UuidAndUsername.Builder() : new UuidAndUsername.Builder().mergeFrom(this);
   }

   protected UuidAndUsername.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UuidAndUsername.Builder(var1);
   }

   public static UuidAndUsername getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UuidAndUsername> parser() {
      return PARSER;
   }

   @Override
   public Parser<UuidAndUsername> getParserForType() {
      return PARSER;
   }

   public UuidAndUsername getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UuidAndUsername.Builder> implements UuidAndUsernameOrBuilder {
      private int bitField0_;
      private Uuid uuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> uuidBuilder_;
      private Object username_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return UuidProto.internal_static_lunarclient_common_v1_UuidAndUsername_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UuidProto.internal_static_lunarclient_common_v1_UuidAndUsername_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UuidAndUsername.class, UuidAndUsername.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (UuidAndUsername.alwaysUseFieldBuilders) {
            this.getUuidFieldBuilder();
         }
      }

      public UuidAndUsername.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.uuid_ = null;
         if (this.uuidBuilder_ != null) {
            this.uuidBuilder_.dispose();
            this.uuidBuilder_ = null;
         }

         this.username_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return UuidProto.internal_static_lunarclient_common_v1_UuidAndUsername_descriptor;
      }

      public UuidAndUsername getDefaultInstanceForType() {
         return UuidAndUsername.getDefaultInstance();
      }

      public UuidAndUsername build() {
         UuidAndUsername var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UuidAndUsername buildPartial() {
         UuidAndUsername var1 = new UuidAndUsername(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UuidAndUsername var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.uuid_ = this.uuidBuilder_ == null ? this.uuid_ : this.uuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.username_ = this.username_;
         }

         UuidAndUsername var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public UuidAndUsername.Builder clone() {
         return (UuidAndUsername.Builder)super.clone();
      }

      public UuidAndUsername.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UuidAndUsername.Builder)super.setField(var1, var2);
      }

      public UuidAndUsername.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UuidAndUsername.Builder)super.clearField(var1);
      }

      public UuidAndUsername.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UuidAndUsername.Builder)super.clearOneof(var1);
      }

      public UuidAndUsername.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UuidAndUsername.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UuidAndUsername.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UuidAndUsername.Builder)super.addRepeatedField(var1, var2);
      }

      public UuidAndUsername.Builder mergeFrom(Message var1) {
         if (var1 instanceof UuidAndUsername) {
            return this.mergeFrom((UuidAndUsername)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UuidAndUsername.Builder mergeFrom(UuidAndUsername var1) {
         if (var1 == UuidAndUsername.getDefaultInstance()) {
            return this;
         }

         if (var1.hasUuid()) {
            this.mergeUuid(var1.getUuid());
         }

         if (!var1.getUsername().isEmpty()) {
            this.username_ = var1.username_;
            this.bitField0_ |= 2;
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

      public UuidAndUsername.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getUuidFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.username_ = var1.readStringRequireUtf8();
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
      public boolean hasUuid() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getUuid() {
         if (this.uuidBuilder_ == null) {
            return this.uuid_ == null ? Uuid.getDefaultInstance() : this.uuid_;
         } else {
            return this.uuidBuilder_.getMessage();
         }
      }

      public UuidAndUsername.Builder setUuid(Uuid var1) {
         if (this.uuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.uuid_ = var1;
         } else {
            this.uuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UuidAndUsername.Builder setUuid(Uuid.Builder var1) {
         if (this.uuidBuilder_ == null) {
            this.uuid_ = var1.build();
         } else {
            this.uuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UuidAndUsername.Builder mergeUuid(Uuid var1) {
         if (this.uuidBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.uuid_ != null && this.uuid_ != Uuid.getDefaultInstance()) {
               this.getUuidBuilder().mergeFrom(var1);
            } else {
               this.uuid_ = var1;
            }
         } else {
            this.uuidBuilder_.mergeFrom(var1);
         }

         if (this.uuid_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public UuidAndUsername.Builder clearUuid() {
         this.bitField0_ &= -2;
         this.uuid_ = null;
         if (this.uuidBuilder_ != null) {
            this.uuidBuilder_.dispose();
            this.uuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getUuidBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getUuidOrBuilder() {
         if (this.uuidBuilder_ != null) {
            return this.uuidBuilder_.getMessageOrBuilder();
         } else {
            return this.uuid_ == null ? Uuid.getDefaultInstance() : this.uuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getUuidFieldBuilder() {
         if (this.uuidBuilder_ == null) {
            this.uuidBuilder_ = new SingleFieldBuilderV3<>(this.getUuid(), this.getParentForChildren(), this.isClean());
            this.uuid_ = null;
         }

         return this.uuidBuilder_;
      }

      @Override
      public String getUsername() {
         Object var1 = this.username_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.username_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getUsernameBytes() {
         Object var1 = this.username_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.username_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public UuidAndUsername.Builder setUsername(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.username_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UuidAndUsername.Builder clearUsername() {
         this.username_ = UuidAndUsername.getDefaultInstance().getUsername();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public UuidAndUsername.Builder setUsernameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         UuidAndUsername.checkByteStringIsUtf8(var1);
         this.username_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public final UuidAndUsername.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UuidAndUsername.Builder)super.setUnknownFields(var1);
      }

      public final UuidAndUsername.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UuidAndUsername.Builder)super.mergeUnknownFields(var1);
      }
   }
}
