package com.lunarclient.websocket.heartbeat.v1;

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

public final class LauncherHeartbeatResponse extends GeneratedMessageV3 implements LauncherHeartbeatResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ONLINE_COUNTS_FIELD_NUMBER = 1;
   private OnlineCounts onlineCounts_;
   private byte memoizedIsInitialized = -1;
   private static final LauncherHeartbeatResponse DEFAULT_INSTANCE = new LauncherHeartbeatResponse();
   private static final Parser<LauncherHeartbeatResponse> PARSER = new AbstractParser<LauncherHeartbeatResponse>() {
      public LauncherHeartbeatResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LauncherHeartbeatResponse.Builder var3 = LauncherHeartbeatResponse.newBuilder();

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

   private LauncherHeartbeatResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LauncherHeartbeatResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LauncherHeartbeatResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_heartbeat_v1_LauncherHeartbeatResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_heartbeat_v1_LauncherHeartbeatResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LauncherHeartbeatResponse.class, LauncherHeartbeatResponse.Builder.class);
   }

   @Override
   public boolean hasOnlineCounts() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public OnlineCounts getOnlineCounts() {
      return this.onlineCounts_ == null ? OnlineCounts.getDefaultInstance() : this.onlineCounts_;
   }

   @Override
   public OnlineCountsOrBuilder getOnlineCountsOrBuilder() {
      return this.onlineCounts_ == null ? OnlineCounts.getDefaultInstance() : this.onlineCounts_;
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
         var1.writeMessage(1, this.getOnlineCounts());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getOnlineCounts());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LauncherHeartbeatResponse)) {
         return super.equals(var1);
      } else {
         LauncherHeartbeatResponse var2 = (LauncherHeartbeatResponse)var1;
         if (this.hasOnlineCounts() != var2.hasOnlineCounts()) {
            return false;
         } else {
            return this.hasOnlineCounts() && !this.getOnlineCounts().equals(var2.getOnlineCounts())
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
      if (this.hasOnlineCounts()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getOnlineCounts().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LauncherHeartbeatResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LauncherHeartbeatResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LauncherHeartbeatResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LauncherHeartbeatResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LauncherHeartbeatResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LauncherHeartbeatResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LauncherHeartbeatResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LauncherHeartbeatResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LauncherHeartbeatResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LauncherHeartbeatResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LauncherHeartbeatResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LauncherHeartbeatResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LauncherHeartbeatResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LauncherHeartbeatResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LauncherHeartbeatResponse.Builder newBuilder(LauncherHeartbeatResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LauncherHeartbeatResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LauncherHeartbeatResponse.Builder() : new LauncherHeartbeatResponse.Builder().mergeFrom(this);
   }

   protected LauncherHeartbeatResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LauncherHeartbeatResponse.Builder(var1);
   }

   public static LauncherHeartbeatResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LauncherHeartbeatResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<LauncherHeartbeatResponse> getParserForType() {
      return PARSER;
   }

   public LauncherHeartbeatResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LauncherHeartbeatResponse.Builder> implements LauncherHeartbeatResponseOrBuilder {
      private int bitField0_;
      private OnlineCounts onlineCounts_;
      private SingleFieldBuilderV3<OnlineCounts, OnlineCounts.Builder, OnlineCountsOrBuilder> onlineCountsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_heartbeat_v1_LauncherHeartbeatResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_heartbeat_v1_LauncherHeartbeatResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LauncherHeartbeatResponse.class, LauncherHeartbeatResponse.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (LauncherHeartbeatResponse.alwaysUseFieldBuilders) {
            this.getOnlineCountsFieldBuilder();
         }
      }

      public LauncherHeartbeatResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.onlineCounts_ = null;
         if (this.onlineCountsBuilder_ != null) {
            this.onlineCountsBuilder_.dispose();
            this.onlineCountsBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_heartbeat_v1_LauncherHeartbeatResponse_descriptor;
      }

      public LauncherHeartbeatResponse getDefaultInstanceForType() {
         return LauncherHeartbeatResponse.getDefaultInstance();
      }

      public LauncherHeartbeatResponse build() {
         LauncherHeartbeatResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LauncherHeartbeatResponse buildPartial() {
         LauncherHeartbeatResponse var1 = new LauncherHeartbeatResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(LauncherHeartbeatResponse var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.onlineCounts_ = this.onlineCountsBuilder_ == null ? this.onlineCounts_ : this.onlineCountsBuilder_.build();
            var3 |= 1;
         }

         LauncherHeartbeatResponse var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public LauncherHeartbeatResponse.Builder clone() {
         return (LauncherHeartbeatResponse.Builder)super.clone();
      }

      public LauncherHeartbeatResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LauncherHeartbeatResponse.Builder)super.setField(var1, var2);
      }

      public LauncherHeartbeatResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LauncherHeartbeatResponse.Builder)super.clearField(var1);
      }

      public LauncherHeartbeatResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LauncherHeartbeatResponse.Builder)super.clearOneof(var1);
      }

      public LauncherHeartbeatResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LauncherHeartbeatResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LauncherHeartbeatResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LauncherHeartbeatResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public LauncherHeartbeatResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof LauncherHeartbeatResponse) {
            return this.mergeFrom((LauncherHeartbeatResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LauncherHeartbeatResponse.Builder mergeFrom(LauncherHeartbeatResponse var1) {
         if (var1 == LauncherHeartbeatResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.hasOnlineCounts()) {
            this.mergeOnlineCounts(var1.getOnlineCounts());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public LauncherHeartbeatResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getOnlineCountsFieldBuilder().getBuilder(), var2);
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
      public boolean hasOnlineCounts() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public OnlineCounts getOnlineCounts() {
         if (this.onlineCountsBuilder_ == null) {
            return this.onlineCounts_ == null ? OnlineCounts.getDefaultInstance() : this.onlineCounts_;
         } else {
            return this.onlineCountsBuilder_.getMessage();
         }
      }

      public LauncherHeartbeatResponse.Builder setOnlineCounts(OnlineCounts var1) {
         if (this.onlineCountsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.onlineCounts_ = var1;
         } else {
            this.onlineCountsBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LauncherHeartbeatResponse.Builder setOnlineCounts(OnlineCounts.Builder var1) {
         if (this.onlineCountsBuilder_ == null) {
            this.onlineCounts_ = var1.build();
         } else {
            this.onlineCountsBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LauncherHeartbeatResponse.Builder mergeOnlineCounts(OnlineCounts var1) {
         if (this.onlineCountsBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.onlineCounts_ != null && this.onlineCounts_ != OnlineCounts.getDefaultInstance()) {
               this.getOnlineCountsBuilder().mergeFrom(var1);
            } else {
               this.onlineCounts_ = var1;
            }
         } else {
            this.onlineCountsBuilder_.mergeFrom(var1);
         }

         if (this.onlineCounts_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public LauncherHeartbeatResponse.Builder clearOnlineCounts() {
         this.bitField0_ &= -2;
         this.onlineCounts_ = null;
         if (this.onlineCountsBuilder_ != null) {
            this.onlineCountsBuilder_.dispose();
            this.onlineCountsBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public OnlineCounts.Builder getOnlineCountsBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getOnlineCountsFieldBuilder().getBuilder();
      }

      @Override
      public OnlineCountsOrBuilder getOnlineCountsOrBuilder() {
         if (this.onlineCountsBuilder_ != null) {
            return this.onlineCountsBuilder_.getMessageOrBuilder();
         } else {
            return this.onlineCounts_ == null ? OnlineCounts.getDefaultInstance() : this.onlineCounts_;
         }
      }

      private SingleFieldBuilderV3<OnlineCounts, OnlineCounts.Builder, OnlineCountsOrBuilder> getOnlineCountsFieldBuilder() {
         if (this.onlineCountsBuilder_ == null) {
            this.onlineCountsBuilder_ = new SingleFieldBuilderV3<>(this.getOnlineCounts(), this.getParentForChildren(), this.isClean());
            this.onlineCounts_ = null;
         }

         return this.onlineCountsBuilder_;
      }

      public final LauncherHeartbeatResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LauncherHeartbeatResponse.Builder)super.setUnknownFields(var1);
      }

      public final LauncherHeartbeatResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LauncherHeartbeatResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
