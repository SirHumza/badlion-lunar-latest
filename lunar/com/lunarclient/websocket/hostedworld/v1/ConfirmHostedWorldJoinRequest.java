package com.lunarclient.websocket.hostedworld.v1;

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

public final class ConfirmHostedWorldJoinRequest extends GeneratedMessageV3 implements ConfirmHostedWorldJoinRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int WORLD_HOST_UUID_FIELD_NUMBER = 1;
   private Uuid worldHostUuid_;
   private byte memoizedIsInitialized = -1;
   private static final ConfirmHostedWorldJoinRequest DEFAULT_INSTANCE = new ConfirmHostedWorldJoinRequest();
   private static final Parser<ConfirmHostedWorldJoinRequest> PARSER = new AbstractParser<ConfirmHostedWorldJoinRequest>() {
      public ConfirmHostedWorldJoinRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ConfirmHostedWorldJoinRequest.Builder var3 = ConfirmHostedWorldJoinRequest.newBuilder();

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

   private ConfirmHostedWorldJoinRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ConfirmHostedWorldJoinRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ConfirmHostedWorldJoinRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_ConfirmHostedWorldJoinRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_ConfirmHostedWorldJoinRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ConfirmHostedWorldJoinRequest.class, ConfirmHostedWorldJoinRequest.Builder.class);
   }

   @Override
   public boolean hasWorldHostUuid() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getWorldHostUuid() {
      return this.worldHostUuid_ == null ? Uuid.getDefaultInstance() : this.worldHostUuid_;
   }

   @Override
   public UuidOrBuilder getWorldHostUuidOrBuilder() {
      return this.worldHostUuid_ == null ? Uuid.getDefaultInstance() : this.worldHostUuid_;
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
         var1.writeMessage(1, this.getWorldHostUuid());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getWorldHostUuid());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ConfirmHostedWorldJoinRequest)) {
         return super.equals(var1);
      } else {
         ConfirmHostedWorldJoinRequest var2 = (ConfirmHostedWorldJoinRequest)var1;
         if (this.hasWorldHostUuid() != var2.hasWorldHostUuid()) {
            return false;
         } else {
            return this.hasWorldHostUuid() && !this.getWorldHostUuid().equals(var2.getWorldHostUuid())
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
      if (this.hasWorldHostUuid()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getWorldHostUuid().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ConfirmHostedWorldJoinRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConfirmHostedWorldJoinRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConfirmHostedWorldJoinRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConfirmHostedWorldJoinRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConfirmHostedWorldJoinRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConfirmHostedWorldJoinRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConfirmHostedWorldJoinRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConfirmHostedWorldJoinRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConfirmHostedWorldJoinRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConfirmHostedWorldJoinRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConfirmHostedWorldJoinRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConfirmHostedWorldJoinRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConfirmHostedWorldJoinRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConfirmHostedWorldJoinRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConfirmHostedWorldJoinRequest.Builder newBuilder(ConfirmHostedWorldJoinRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConfirmHostedWorldJoinRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ConfirmHostedWorldJoinRequest.Builder() : new ConfirmHostedWorldJoinRequest.Builder().mergeFrom(this);
   }

   protected ConfirmHostedWorldJoinRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ConfirmHostedWorldJoinRequest.Builder(var1);
   }

   public static ConfirmHostedWorldJoinRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ConfirmHostedWorldJoinRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<ConfirmHostedWorldJoinRequest> getParserForType() {
      return PARSER;
   }

   public ConfirmHostedWorldJoinRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<ConfirmHostedWorldJoinRequest.Builder>
      implements ConfirmHostedWorldJoinRequestOrBuilder {
      private int bitField0_;
      private Uuid worldHostUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> worldHostUuidBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_ConfirmHostedWorldJoinRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_ConfirmHostedWorldJoinRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ConfirmHostedWorldJoinRequest.class, ConfirmHostedWorldJoinRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ConfirmHostedWorldJoinRequest.alwaysUseFieldBuilders) {
            this.getWorldHostUuidFieldBuilder();
         }
      }

      public ConfirmHostedWorldJoinRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.worldHostUuid_ = null;
         if (this.worldHostUuidBuilder_ != null) {
            this.worldHostUuidBuilder_.dispose();
            this.worldHostUuidBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_ConfirmHostedWorldJoinRequest_descriptor;
      }

      public ConfirmHostedWorldJoinRequest getDefaultInstanceForType() {
         return ConfirmHostedWorldJoinRequest.getDefaultInstance();
      }

      public ConfirmHostedWorldJoinRequest build() {
         ConfirmHostedWorldJoinRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConfirmHostedWorldJoinRequest buildPartial() {
         ConfirmHostedWorldJoinRequest var1 = new ConfirmHostedWorldJoinRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ConfirmHostedWorldJoinRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.worldHostUuid_ = this.worldHostUuidBuilder_ == null ? this.worldHostUuid_ : this.worldHostUuidBuilder_.build();
            var3 |= 1;
         }

         ConfirmHostedWorldJoinRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ConfirmHostedWorldJoinRequest.Builder clone() {
         return (ConfirmHostedWorldJoinRequest.Builder)super.clone();
      }

      public ConfirmHostedWorldJoinRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConfirmHostedWorldJoinRequest.Builder)super.setField(var1, var2);
      }

      public ConfirmHostedWorldJoinRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ConfirmHostedWorldJoinRequest.Builder)super.clearField(var1);
      }

      public ConfirmHostedWorldJoinRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ConfirmHostedWorldJoinRequest.Builder)super.clearOneof(var1);
      }

      public ConfirmHostedWorldJoinRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ConfirmHostedWorldJoinRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConfirmHostedWorldJoinRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConfirmHostedWorldJoinRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public ConfirmHostedWorldJoinRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConfirmHostedWorldJoinRequest) {
            return this.mergeFrom((ConfirmHostedWorldJoinRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ConfirmHostedWorldJoinRequest.Builder mergeFrom(ConfirmHostedWorldJoinRequest var1) {
         if (var1 == ConfirmHostedWorldJoinRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasWorldHostUuid()) {
            this.mergeWorldHostUuid(var1.getWorldHostUuid());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ConfirmHostedWorldJoinRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getWorldHostUuidFieldBuilder().getBuilder(), var2);
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
      public boolean hasWorldHostUuid() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getWorldHostUuid() {
         if (this.worldHostUuidBuilder_ == null) {
            return this.worldHostUuid_ == null ? Uuid.getDefaultInstance() : this.worldHostUuid_;
         } else {
            return this.worldHostUuidBuilder_.getMessage();
         }
      }

      public ConfirmHostedWorldJoinRequest.Builder setWorldHostUuid(Uuid var1) {
         if (this.worldHostUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.worldHostUuid_ = var1;
         } else {
            this.worldHostUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ConfirmHostedWorldJoinRequest.Builder setWorldHostUuid(Uuid.Builder var1) {
         if (this.worldHostUuidBuilder_ == null) {
            this.worldHostUuid_ = var1.build();
         } else {
            this.worldHostUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ConfirmHostedWorldJoinRequest.Builder mergeWorldHostUuid(Uuid var1) {
         if (this.worldHostUuidBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.worldHostUuid_ != null && this.worldHostUuid_ != Uuid.getDefaultInstance()) {
               this.getWorldHostUuidBuilder().mergeFrom(var1);
            } else {
               this.worldHostUuid_ = var1;
            }
         } else {
            this.worldHostUuidBuilder_.mergeFrom(var1);
         }

         if (this.worldHostUuid_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public ConfirmHostedWorldJoinRequest.Builder clearWorldHostUuid() {
         this.bitField0_ &= -2;
         this.worldHostUuid_ = null;
         if (this.worldHostUuidBuilder_ != null) {
            this.worldHostUuidBuilder_.dispose();
            this.worldHostUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getWorldHostUuidBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getWorldHostUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getWorldHostUuidOrBuilder() {
         if (this.worldHostUuidBuilder_ != null) {
            return this.worldHostUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.worldHostUuid_ == null ? Uuid.getDefaultInstance() : this.worldHostUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getWorldHostUuidFieldBuilder() {
         if (this.worldHostUuidBuilder_ == null) {
            this.worldHostUuidBuilder_ = new SingleFieldBuilderV3<>(this.getWorldHostUuid(), this.getParentForChildren(), this.isClean());
            this.worldHostUuid_ = null;
         }

         return this.worldHostUuidBuilder_;
      }

      public final ConfirmHostedWorldJoinRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConfirmHostedWorldJoinRequest.Builder)super.setUnknownFields(var1);
      }

      public final ConfirmHostedWorldJoinRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConfirmHostedWorldJoinRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
