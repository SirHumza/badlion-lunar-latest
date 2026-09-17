package com.lunarclient.websocket.radio.v1;

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
import com.lunarclient.common.v1.RadioInfo;
import com.lunarclient.common.v1.RadioInfoOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BroadcastRadioInfoChangeResponse extends GeneratedMessageV3 implements BroadcastRadioInfoChangeResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int NEW_RADIO_INFO_FIELD_NUMBER = 1;
   private RadioInfo newRadioInfo_;
   private byte memoizedIsInitialized = -1;
   private static final BroadcastRadioInfoChangeResponse DEFAULT_INSTANCE = new BroadcastRadioInfoChangeResponse();
   private static final Parser<BroadcastRadioInfoChangeResponse> PARSER = new AbstractParser<BroadcastRadioInfoChangeResponse>() {
      public BroadcastRadioInfoChangeResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         BroadcastRadioInfoChangeResponse.Builder var3 = BroadcastRadioInfoChangeResponse.newBuilder();

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

   private BroadcastRadioInfoChangeResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private BroadcastRadioInfoChangeResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new BroadcastRadioInfoChangeResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_radio_v1_BroadcastRadioInfoChangeResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_radio_v1_BroadcastRadioInfoChangeResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(BroadcastRadioInfoChangeResponse.class, BroadcastRadioInfoChangeResponse.Builder.class);
   }

   @Override
   public boolean hasNewRadioInfo() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public RadioInfo getNewRadioInfo() {
      return this.newRadioInfo_ == null ? RadioInfo.getDefaultInstance() : this.newRadioInfo_;
   }

   @Override
   public RadioInfoOrBuilder getNewRadioInfoOrBuilder() {
      return this.newRadioInfo_ == null ? RadioInfo.getDefaultInstance() : this.newRadioInfo_;
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
         var1.writeMessage(1, this.getNewRadioInfo());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getNewRadioInfo());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof BroadcastRadioInfoChangeResponse)) {
         return super.equals(var1);
      } else {
         BroadcastRadioInfoChangeResponse var2 = (BroadcastRadioInfoChangeResponse)var1;
         if (this.hasNewRadioInfo() != var2.hasNewRadioInfo()) {
            return false;
         } else {
            return this.hasNewRadioInfo() && !this.getNewRadioInfo().equals(var2.getNewRadioInfo())
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
      if (this.hasNewRadioInfo()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getNewRadioInfo().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static BroadcastRadioInfoChangeResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastRadioInfoChangeResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastRadioInfoChangeResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastRadioInfoChangeResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastRadioInfoChangeResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastRadioInfoChangeResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastRadioInfoChangeResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BroadcastRadioInfoChangeResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static BroadcastRadioInfoChangeResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static BroadcastRadioInfoChangeResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static BroadcastRadioInfoChangeResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BroadcastRadioInfoChangeResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public BroadcastRadioInfoChangeResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static BroadcastRadioInfoChangeResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static BroadcastRadioInfoChangeResponse.Builder newBuilder(BroadcastRadioInfoChangeResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public BroadcastRadioInfoChangeResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new BroadcastRadioInfoChangeResponse.Builder() : new BroadcastRadioInfoChangeResponse.Builder().mergeFrom(this);
   }

   protected BroadcastRadioInfoChangeResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new BroadcastRadioInfoChangeResponse.Builder(var1);
   }

   public static BroadcastRadioInfoChangeResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<BroadcastRadioInfoChangeResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<BroadcastRadioInfoChangeResponse> getParserForType() {
      return PARSER;
   }

   public BroadcastRadioInfoChangeResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<BroadcastRadioInfoChangeResponse.Builder>
      implements BroadcastRadioInfoChangeResponseOrBuilder {
      private int bitField0_;
      private RadioInfo newRadioInfo_;
      private SingleFieldBuilderV3<RadioInfo, RadioInfo.Builder, RadioInfoOrBuilder> newRadioInfoBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_radio_v1_BroadcastRadioInfoChangeResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_radio_v1_BroadcastRadioInfoChangeResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(BroadcastRadioInfoChangeResponse.class, BroadcastRadioInfoChangeResponse.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (BroadcastRadioInfoChangeResponse.alwaysUseFieldBuilders) {
            this.getNewRadioInfoFieldBuilder();
         }
      }

      public BroadcastRadioInfoChangeResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.newRadioInfo_ = null;
         if (this.newRadioInfoBuilder_ != null) {
            this.newRadioInfoBuilder_.dispose();
            this.newRadioInfoBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_radio_v1_BroadcastRadioInfoChangeResponse_descriptor;
      }

      public BroadcastRadioInfoChangeResponse getDefaultInstanceForType() {
         return BroadcastRadioInfoChangeResponse.getDefaultInstance();
      }

      public BroadcastRadioInfoChangeResponse build() {
         BroadcastRadioInfoChangeResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public BroadcastRadioInfoChangeResponse buildPartial() {
         BroadcastRadioInfoChangeResponse var1 = new BroadcastRadioInfoChangeResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(BroadcastRadioInfoChangeResponse var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.newRadioInfo_ = this.newRadioInfoBuilder_ == null ? this.newRadioInfo_ : this.newRadioInfoBuilder_.build();
            var3 |= 1;
         }

         BroadcastRadioInfoChangeResponse var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public BroadcastRadioInfoChangeResponse.Builder clone() {
         return (BroadcastRadioInfoChangeResponse.Builder)super.clone();
      }

      public BroadcastRadioInfoChangeResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BroadcastRadioInfoChangeResponse.Builder)super.setField(var1, var2);
      }

      public BroadcastRadioInfoChangeResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (BroadcastRadioInfoChangeResponse.Builder)super.clearField(var1);
      }

      public BroadcastRadioInfoChangeResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (BroadcastRadioInfoChangeResponse.Builder)super.clearOneof(var1);
      }

      public BroadcastRadioInfoChangeResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (BroadcastRadioInfoChangeResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public BroadcastRadioInfoChangeResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BroadcastRadioInfoChangeResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public BroadcastRadioInfoChangeResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof BroadcastRadioInfoChangeResponse) {
            return this.mergeFrom((BroadcastRadioInfoChangeResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public BroadcastRadioInfoChangeResponse.Builder mergeFrom(BroadcastRadioInfoChangeResponse var1) {
         if (var1 == BroadcastRadioInfoChangeResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.hasNewRadioInfo()) {
            this.mergeNewRadioInfo(var1.getNewRadioInfo());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public BroadcastRadioInfoChangeResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getNewRadioInfoFieldBuilder().getBuilder(), var2);
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
      public boolean hasNewRadioInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public RadioInfo getNewRadioInfo() {
         if (this.newRadioInfoBuilder_ == null) {
            return this.newRadioInfo_ == null ? RadioInfo.getDefaultInstance() : this.newRadioInfo_;
         } else {
            return this.newRadioInfoBuilder_.getMessage();
         }
      }

      public BroadcastRadioInfoChangeResponse.Builder setNewRadioInfo(RadioInfo var1) {
         if (this.newRadioInfoBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.newRadioInfo_ = var1;
         } else {
            this.newRadioInfoBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public BroadcastRadioInfoChangeResponse.Builder setNewRadioInfo(RadioInfo.Builder var1) {
         if (this.newRadioInfoBuilder_ == null) {
            this.newRadioInfo_ = var1.build();
         } else {
            this.newRadioInfoBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public BroadcastRadioInfoChangeResponse.Builder mergeNewRadioInfo(RadioInfo var1) {
         if (this.newRadioInfoBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.newRadioInfo_ != null && this.newRadioInfo_ != RadioInfo.getDefaultInstance()) {
               this.getNewRadioInfoBuilder().mergeFrom(var1);
            } else {
               this.newRadioInfo_ = var1;
            }
         } else {
            this.newRadioInfoBuilder_.mergeFrom(var1);
         }

         if (this.newRadioInfo_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public BroadcastRadioInfoChangeResponse.Builder clearNewRadioInfo() {
         this.bitField0_ &= -2;
         this.newRadioInfo_ = null;
         if (this.newRadioInfoBuilder_ != null) {
            this.newRadioInfoBuilder_.dispose();
            this.newRadioInfoBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public RadioInfo.Builder getNewRadioInfoBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getNewRadioInfoFieldBuilder().getBuilder();
      }

      @Override
      public RadioInfoOrBuilder getNewRadioInfoOrBuilder() {
         if (this.newRadioInfoBuilder_ != null) {
            return this.newRadioInfoBuilder_.getMessageOrBuilder();
         } else {
            return this.newRadioInfo_ == null ? RadioInfo.getDefaultInstance() : this.newRadioInfo_;
         }
      }

      private SingleFieldBuilderV3<RadioInfo, RadioInfo.Builder, RadioInfoOrBuilder> getNewRadioInfoFieldBuilder() {
         if (this.newRadioInfoBuilder_ == null) {
            this.newRadioInfoBuilder_ = new SingleFieldBuilderV3<>(this.getNewRadioInfo(), this.getParentForChildren(), this.isClean());
            this.newRadioInfo_ = null;
         }

         return this.newRadioInfoBuilder_;
      }

      public final BroadcastRadioInfoChangeResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (BroadcastRadioInfoChangeResponse.Builder)super.setUnknownFields(var1);
      }

      public final BroadcastRadioInfoChangeResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (BroadcastRadioInfoChangeResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
