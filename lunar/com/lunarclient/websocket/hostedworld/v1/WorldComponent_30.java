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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class HostedWorldHeartbeatRequest extends GeneratedMessageV3 implements HostedWorldHeartbeatRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int HEARTBEAT_FIELD_NUMBER = 1;
   private Heartbeat heartbeat_;
   private byte memoizedIsInitialized = -1;
   private static final HostedWorldHeartbeatRequest DEFAULT_INSTANCE = new HostedWorldHeartbeatRequest();
   private static final Parser<HostedWorldHeartbeatRequest> PARSER = new AbstractParser<HostedWorldHeartbeatRequest>() {
      public HostedWorldHeartbeatRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         HostedWorldHeartbeatRequest.Builder var3 = HostedWorldHeartbeatRequest.newBuilder();

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

   private HostedWorldHeartbeatRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private HostedWorldHeartbeatRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new HostedWorldHeartbeatRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldHeartbeatRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldHeartbeatRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(HostedWorldHeartbeatRequest.class, HostedWorldHeartbeatRequest.Builder.class);
   }

   @Override
   public boolean hasHeartbeat() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Heartbeat getHeartbeat() {
      return this.heartbeat_ == null ? Heartbeat.getDefaultInstance() : this.heartbeat_;
   }

   @Override
   public HeartbeatOrBuilder getHeartbeatOrBuilder() {
      return this.heartbeat_ == null ? Heartbeat.getDefaultInstance() : this.heartbeat_;
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
         var1.writeMessage(1, this.getHeartbeat());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getHeartbeat());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof HostedWorldHeartbeatRequest)) {
         return super.equals(var1);
      } else {
         HostedWorldHeartbeatRequest var2 = (HostedWorldHeartbeatRequest)var1;
         if (this.hasHeartbeat() != var2.hasHeartbeat()) {
            return false;
         } else {
            return this.hasHeartbeat() && !this.getHeartbeat().equals(var2.getHeartbeat()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasHeartbeat()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getHeartbeat().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static HostedWorldHeartbeatRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static HostedWorldHeartbeatRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HostedWorldHeartbeatRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static HostedWorldHeartbeatRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HostedWorldHeartbeatRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static HostedWorldHeartbeatRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HostedWorldHeartbeatRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static HostedWorldHeartbeatRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static HostedWorldHeartbeatRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static HostedWorldHeartbeatRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static HostedWorldHeartbeatRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static HostedWorldHeartbeatRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public HostedWorldHeartbeatRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static HostedWorldHeartbeatRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static HostedWorldHeartbeatRequest.Builder newBuilder(HostedWorldHeartbeatRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public HostedWorldHeartbeatRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new HostedWorldHeartbeatRequest.Builder() : new HostedWorldHeartbeatRequest.Builder().mergeFrom(this);
   }

   protected HostedWorldHeartbeatRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new HostedWorldHeartbeatRequest.Builder(var1);
   }

   public static HostedWorldHeartbeatRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<HostedWorldHeartbeatRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<HostedWorldHeartbeatRequest> getParserForType() {
      return PARSER;
   }

   public HostedWorldHeartbeatRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<HostedWorldHeartbeatRequest.Builder> implements HostedWorldHeartbeatRequestOrBuilder {
      private int bitField0_;
      private Heartbeat heartbeat_;
      private SingleFieldBuilderV3<Heartbeat, Heartbeat.Builder, HeartbeatOrBuilder> heartbeatBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldHeartbeatRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldHeartbeatRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(HostedWorldHeartbeatRequest.class, HostedWorldHeartbeatRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (HostedWorldHeartbeatRequest.alwaysUseFieldBuilders) {
            this.getHeartbeatFieldBuilder();
         }
      }

      public HostedWorldHeartbeatRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.heartbeat_ = null;
         if (this.heartbeatBuilder_ != null) {
            this.heartbeatBuilder_.dispose();
            this.heartbeatBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldHeartbeatRequest_descriptor;
      }

      public HostedWorldHeartbeatRequest getDefaultInstanceForType() {
         return HostedWorldHeartbeatRequest.getDefaultInstance();
      }

      public HostedWorldHeartbeatRequest build() {
         HostedWorldHeartbeatRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public HostedWorldHeartbeatRequest buildPartial() {
         HostedWorldHeartbeatRequest var1 = new HostedWorldHeartbeatRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(HostedWorldHeartbeatRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.heartbeat_ = this.heartbeatBuilder_ == null ? this.heartbeat_ : this.heartbeatBuilder_.build();
            var3 |= 1;
         }

         HostedWorldHeartbeatRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public HostedWorldHeartbeatRequest.Builder clone() {
         return (HostedWorldHeartbeatRequest.Builder)super.clone();
      }

      public HostedWorldHeartbeatRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (HostedWorldHeartbeatRequest.Builder)super.setField(var1, var2);
      }

      public HostedWorldHeartbeatRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (HostedWorldHeartbeatRequest.Builder)super.clearField(var1);
      }

      public HostedWorldHeartbeatRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (HostedWorldHeartbeatRequest.Builder)super.clearOneof(var1);
      }

      public HostedWorldHeartbeatRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (HostedWorldHeartbeatRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public HostedWorldHeartbeatRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (HostedWorldHeartbeatRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public HostedWorldHeartbeatRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof HostedWorldHeartbeatRequest) {
            return this.mergeFrom((HostedWorldHeartbeatRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public HostedWorldHeartbeatRequest.Builder mergeFrom(HostedWorldHeartbeatRequest var1) {
         if (var1 == HostedWorldHeartbeatRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasHeartbeat()) {
            this.mergeHeartbeat(var1.getHeartbeat());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public HostedWorldHeartbeatRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getHeartbeatFieldBuilder().getBuilder(), var2);
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
      public boolean hasHeartbeat() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Heartbeat getHeartbeat() {
         if (this.heartbeatBuilder_ == null) {
            return this.heartbeat_ == null ? Heartbeat.getDefaultInstance() : this.heartbeat_;
         } else {
            return this.heartbeatBuilder_.getMessage();
         }
      }

      public HostedWorldHeartbeatRequest.Builder setHeartbeat(Heartbeat var1) {
         if (this.heartbeatBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.heartbeat_ = var1;
         } else {
            this.heartbeatBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public HostedWorldHeartbeatRequest.Builder setHeartbeat(Heartbeat.Builder var1) {
         if (this.heartbeatBuilder_ == null) {
            this.heartbeat_ = var1.build();
         } else {
            this.heartbeatBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public HostedWorldHeartbeatRequest.Builder mergeHeartbeat(Heartbeat var1) {
         if (this.heartbeatBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.heartbeat_ != null && this.heartbeat_ != Heartbeat.getDefaultInstance()) {
               this.getHeartbeatBuilder().mergeFrom(var1);
            } else {
               this.heartbeat_ = var1;
            }
         } else {
            this.heartbeatBuilder_.mergeFrom(var1);
         }

         if (this.heartbeat_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public HostedWorldHeartbeatRequest.Builder clearHeartbeat() {
         this.bitField0_ &= -2;
         this.heartbeat_ = null;
         if (this.heartbeatBuilder_ != null) {
            this.heartbeatBuilder_.dispose();
            this.heartbeatBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Heartbeat.Builder getHeartbeatBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getHeartbeatFieldBuilder().getBuilder();
      }

      @Override
      public HeartbeatOrBuilder getHeartbeatOrBuilder() {
         if (this.heartbeatBuilder_ != null) {
            return this.heartbeatBuilder_.getMessageOrBuilder();
         } else {
            return this.heartbeat_ == null ? Heartbeat.getDefaultInstance() : this.heartbeat_;
         }
      }

      private SingleFieldBuilderV3<Heartbeat, Heartbeat.Builder, HeartbeatOrBuilder> getHeartbeatFieldBuilder() {
         if (this.heartbeatBuilder_ == null) {
            this.heartbeatBuilder_ = new SingleFieldBuilderV3<>(this.getHeartbeat(), this.getParentForChildren(), this.isClean());
            this.heartbeat_ = null;
         }

         return this.heartbeatBuilder_;
      }

      public final HostedWorldHeartbeatRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (HostedWorldHeartbeatRequest.Builder)super.setUnknownFields(var1);
      }

      public final HostedWorldHeartbeatRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (HostedWorldHeartbeatRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
