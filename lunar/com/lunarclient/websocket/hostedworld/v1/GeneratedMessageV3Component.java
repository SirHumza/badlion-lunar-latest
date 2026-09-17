package com.lunarclient.websocket.hostedworld.v1;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class PingResponse extends GeneratedMessageV3 implements PingResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int TARGET_FIELD_NUMBER = 1;
   private AddressAndPort target_;
   public static final int SUCCESS_FIELD_NUMBER = 2;
   private boolean success_ = false;
   public static final int LATENCY_FIELD_NUMBER = 3;
   private Duration latency_;
   private byte memoizedIsInitialized = -1;
   private static final PingResponse DEFAULT_INSTANCE = new PingResponse();
   private static final Parser<PingResponse> PARSER = new AbstractParser<PingResponse>() {
      public PingResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PingResponse.Builder var3 = PingResponse.newBuilder();

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

   private PingResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PingResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PingResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_hostedworld_v1_PingResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_hostedworld_v1_PingResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PingResponse.class, PingResponse.Builder.class);
   }

   @Override
   public boolean hasTarget() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public AddressAndPort getTarget() {
      return this.target_ == null ? AddressAndPort.getDefaultInstance() : this.target_;
   }

   @Override
   public AddressAndPortOrBuilder getTargetOrBuilder() {
      return this.target_ == null ? AddressAndPort.getDefaultInstance() : this.target_;
   }

   @Override
   public boolean getSuccess() {
      return this.success_;
   }

   @Override
   public boolean hasLatency() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Duration getLatency() {
      return this.latency_ == null ? Duration.getDefaultInstance() : this.latency_;
   }

   @Override
   public DurationOrBuilder getLatencyOrBuilder() {
      return this.latency_ == null ? Duration.getDefaultInstance() : this.latency_;
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
         var1.writeMessage(1, this.getTarget());
      }

      if (this.success_) {
         var1.writeBool(2, this.success_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(3, this.getLatency());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getTarget());
      }

      if (this.success_) {
         var1 += CodedOutputStream.computeBoolSize(2, this.success_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getLatency());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PingResponse)) {
         return super.equals(var1);
      } else {
         PingResponse var2 = (PingResponse)var1;
         if (this.hasTarget() != var2.hasTarget()) {
            return false;
         } else if (this.hasTarget() && !this.getTarget().equals(var2.getTarget())) {
            return false;
         } else if (this.getSuccess() != var2.getSuccess()) {
            return false;
         } else if (this.hasLatency() != var2.hasLatency()) {
            return false;
         } else {
            return this.hasLatency() && !this.getLatency().equals(var2.getLatency()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasTarget()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getTarget().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Internal.hashBoolean(this.getSuccess());
      if (this.hasLatency()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getLatency().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PingResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PingResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PingResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PingResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PingResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PingResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PingResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PingResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PingResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PingResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PingResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PingResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PingResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PingResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PingResponse.Builder newBuilder(PingResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PingResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PingResponse.Builder() : new PingResponse.Builder().mergeFrom(this);
   }

   protected PingResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PingResponse.Builder(var1);
   }

   public static PingResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PingResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<PingResponse> getParserForType() {
      return PARSER;
   }

   public PingResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PingResponse.Builder> implements PingResponseOrBuilder {
      private int bitField0_;
      private AddressAndPort target_;
      private SingleFieldBuilderV3<AddressAndPort, AddressAndPort.Builder, AddressAndPortOrBuilder> targetBuilder_;
      private boolean success_;
      private Duration latency_;
      private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> latencyBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_hostedworld_v1_PingResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_hostedworld_v1_PingResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PingResponse.class, PingResponse.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (PingResponse.alwaysUseFieldBuilders) {
            this.getTargetFieldBuilder();
            this.getLatencyFieldBuilder();
         }
      }

      public PingResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.target_ = null;
         if (this.targetBuilder_ != null) {
            this.targetBuilder_.dispose();
            this.targetBuilder_ = null;
         }

         this.success_ = false;
         this.latency_ = null;
         if (this.latencyBuilder_ != null) {
            this.latencyBuilder_.dispose();
            this.latencyBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_hostedworld_v1_PingResponse_descriptor;
      }

      public PingResponse getDefaultInstanceForType() {
         return PingResponse.getDefaultInstance();
      }

      public PingResponse build() {
         PingResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PingResponse buildPartial() {
         PingResponse var1 = new PingResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(PingResponse var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.target_ = this.targetBuilder_ == null ? this.target_ : this.targetBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.success_ = this.success_;
         }

         if ((var2 & 4) != 0) {
            var1.latency_ = this.latencyBuilder_ == null ? this.latency_ : this.latencyBuilder_.build();
            var3 |= 2;
         }

         PingResponse var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public PingResponse.Builder clone() {
         return (PingResponse.Builder)super.clone();
      }

      public PingResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PingResponse.Builder)super.setField(var1, var2);
      }

      public PingResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PingResponse.Builder)super.clearField(var1);
      }

      public PingResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PingResponse.Builder)super.clearOneof(var1);
      }

      public PingResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PingResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PingResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PingResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public PingResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof PingResponse) {
            return this.mergeFrom((PingResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PingResponse.Builder mergeFrom(PingResponse var1) {
         if (var1 == PingResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.hasTarget()) {
            this.mergeTarget(var1.getTarget());
         }

         if (var1.getSuccess()) {
            this.setSuccess(var1.getSuccess());
         }

         if (var1.hasLatency()) {
            this.mergeLatency(var1.getLatency());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public PingResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getTargetFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.success_ = var1.readBool();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getLatencyFieldBuilder().getBuilder(), var2);
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
      public boolean hasTarget() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public AddressAndPort getTarget() {
         if (this.targetBuilder_ == null) {
            return this.target_ == null ? AddressAndPort.getDefaultInstance() : this.target_;
         } else {
            return this.targetBuilder_.getMessage();
         }
      }

      public PingResponse.Builder setTarget(AddressAndPort var1) {
         if (this.targetBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.target_ = var1;
         } else {
            this.targetBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PingResponse.Builder setTarget(AddressAndPort.Builder var1) {
         if (this.targetBuilder_ == null) {
            this.target_ = var1.build();
         } else {
            this.targetBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PingResponse.Builder mergeTarget(AddressAndPort var1) {
         if (this.targetBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.target_ != null && this.target_ != AddressAndPort.getDefaultInstance()) {
               this.getTargetBuilder().mergeFrom(var1);
            } else {
               this.target_ = var1;
            }
         } else {
            this.targetBuilder_.mergeFrom(var1);
         }

         if (this.target_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public PingResponse.Builder clearTarget() {
         this.bitField0_ &= -2;
         this.target_ = null;
         if (this.targetBuilder_ != null) {
            this.targetBuilder_.dispose();
            this.targetBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public AddressAndPort.Builder getTargetBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getTargetFieldBuilder().getBuilder();
      }

      @Override
      public AddressAndPortOrBuilder getTargetOrBuilder() {
         if (this.targetBuilder_ != null) {
            return this.targetBuilder_.getMessageOrBuilder();
         } else {
            return this.target_ == null ? AddressAndPort.getDefaultInstance() : this.target_;
         }
      }

      private SingleFieldBuilderV3<AddressAndPort, AddressAndPort.Builder, AddressAndPortOrBuilder> getTargetFieldBuilder() {
         if (this.targetBuilder_ == null) {
            this.targetBuilder_ = new SingleFieldBuilderV3<>(this.getTarget(), this.getParentForChildren(), this.isClean());
            this.target_ = null;
         }

         return this.targetBuilder_;
      }

      @Override
      public boolean getSuccess() {
         return this.success_;
      }

      public PingResponse.Builder setSuccess(boolean var1) {
         this.success_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PingResponse.Builder clearSuccess() {
         this.bitField0_ &= -3;
         this.success_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasLatency() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Duration getLatency() {
         if (this.latencyBuilder_ == null) {
            return this.latency_ == null ? Duration.getDefaultInstance() : this.latency_;
         } else {
            return this.latencyBuilder_.getMessage();
         }
      }

      public PingResponse.Builder setLatency(Duration var1) {
         if (this.latencyBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.latency_ = var1;
         } else {
            this.latencyBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public PingResponse.Builder setLatency(Duration.Builder var1) {
         if (this.latencyBuilder_ == null) {
            this.latency_ = var1.build();
         } else {
            this.latencyBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public PingResponse.Builder mergeLatency(Duration var1) {
         if (this.latencyBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.latency_ != null && this.latency_ != Duration.getDefaultInstance()) {
               this.getLatencyBuilder().mergeFrom(var1);
            } else {
               this.latency_ = var1;
            }
         } else {
            this.latencyBuilder_.mergeFrom(var1);
         }

         if (this.latency_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public PingResponse.Builder clearLatency() {
         this.bitField0_ &= -5;
         this.latency_ = null;
         if (this.latencyBuilder_ != null) {
            this.latencyBuilder_.dispose();
            this.latencyBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Duration.Builder getLatencyBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getLatencyFieldBuilder().getBuilder();
      }

      @Override
      public DurationOrBuilder getLatencyOrBuilder() {
         if (this.latencyBuilder_ != null) {
            return this.latencyBuilder_.getMessageOrBuilder();
         } else {
            return this.latency_ == null ? Duration.getDefaultInstance() : this.latency_;
         }
      }

      private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> getLatencyFieldBuilder() {
         if (this.latencyBuilder_ == null) {
            this.latencyBuilder_ = new SingleFieldBuilderV3<>(this.getLatency(), this.getParentForChildren(), this.isClean());
            this.latency_ = null;
         }

         return this.latencyBuilder_;
      }

      public final PingResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PingResponse.Builder)super.setUnknownFields(var1);
      }

      public final PingResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PingResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
