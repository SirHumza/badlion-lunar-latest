package com.lunarclient.gameipc.auth.v1;

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
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class RefreshAccountRequest extends GeneratedMessageV3 implements RefreshAccountRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int UUID_FIELD_NUMBER = 1;
   private Uuid uuid_;
   private byte memoizedIsInitialized = -1;
   private static final RefreshAccountRequest DEFAULT_INSTANCE = new RefreshAccountRequest();
   private static final Parser<RefreshAccountRequest> PARSER = new AbstractParser<RefreshAccountRequest>() {
      public RefreshAccountRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RefreshAccountRequest.Builder var3 = RefreshAccountRequest.newBuilder();

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

   private RefreshAccountRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RefreshAccountRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RefreshAccountRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_auth_v1_RefreshAccountRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_auth_v1_RefreshAccountRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RefreshAccountRequest.class, RefreshAccountRequest.Builder.class);
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

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RefreshAccountRequest)) {
         return super.equals(var1);
      } else {
         RefreshAccountRequest var2 = (RefreshAccountRequest)var1;
         if (this.hasUuid() != var2.hasUuid()) {
            return false;
         } else {
            return this.hasUuid() && !this.getUuid().equals(var2.getUuid()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RefreshAccountRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshAccountRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshAccountRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshAccountRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshAccountRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshAccountRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshAccountRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RefreshAccountRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RefreshAccountRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RefreshAccountRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RefreshAccountRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RefreshAccountRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RefreshAccountRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RefreshAccountRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RefreshAccountRequest.Builder newBuilder(RefreshAccountRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RefreshAccountRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RefreshAccountRequest.Builder() : new RefreshAccountRequest.Builder().mergeFrom(this);
   }

   protected RefreshAccountRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RefreshAccountRequest.Builder(var1);
   }

   public static RefreshAccountRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RefreshAccountRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<RefreshAccountRequest> getParserForType() {
      return PARSER;
   }

   public RefreshAccountRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RefreshAccountRequest.Builder> implements RefreshAccountRequestOrBuilder {
      private int bitField0_;
      private Uuid uuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> uuidBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_auth_v1_RefreshAccountRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_auth_v1_RefreshAccountRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RefreshAccountRequest.class, RefreshAccountRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (RefreshAccountRequest.alwaysUseFieldBuilders) {
            this.getUuidFieldBuilder();
         }
      }

      public RefreshAccountRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.uuid_ = null;
         if (this.uuidBuilder_ != null) {
            this.uuidBuilder_.dispose();
            this.uuidBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_auth_v1_RefreshAccountRequest_descriptor;
      }

      public RefreshAccountRequest getDefaultInstanceForType() {
         return RefreshAccountRequest.getDefaultInstance();
      }

      public RefreshAccountRequest build() {
         RefreshAccountRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RefreshAccountRequest buildPartial() {
         RefreshAccountRequest var1 = new RefreshAccountRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RefreshAccountRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.uuid_ = this.uuidBuilder_ == null ? this.uuid_ : this.uuidBuilder_.build();
            var3 |= 1;
         }

         RefreshAccountRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public RefreshAccountRequest.Builder clone() {
         return (RefreshAccountRequest.Builder)super.clone();
      }

      public RefreshAccountRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RefreshAccountRequest.Builder)super.setField(var1, var2);
      }

      public RefreshAccountRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RefreshAccountRequest.Builder)super.clearField(var1);
      }

      public RefreshAccountRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RefreshAccountRequest.Builder)super.clearOneof(var1);
      }

      public RefreshAccountRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RefreshAccountRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RefreshAccountRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RefreshAccountRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public RefreshAccountRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof RefreshAccountRequest) {
            return this.mergeFrom((RefreshAccountRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RefreshAccountRequest.Builder mergeFrom(RefreshAccountRequest var1) {
         if (var1 == RefreshAccountRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasUuid()) {
            this.mergeUuid(var1.getUuid());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RefreshAccountRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public RefreshAccountRequest.Builder setUuid(Uuid var1) {
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

      public RefreshAccountRequest.Builder setUuid(Uuid.Builder var1) {
         if (this.uuidBuilder_ == null) {
            this.uuid_ = var1.build();
         } else {
            this.uuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RefreshAccountRequest.Builder mergeUuid(Uuid var1) {
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

      public RefreshAccountRequest.Builder clearUuid() {
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

      public final RefreshAccountRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RefreshAccountRequest.Builder)super.setUnknownFields(var1);
      }

      public final RefreshAccountRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RefreshAccountRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
