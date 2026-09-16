package com.lunarclient.apollo.transfer.v1;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PingResponse extends GeneratedMessageV3 implements PingResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int REQUEST_ID_FIELD_NUMBER = 1;
   private ByteString requestId_ = ByteString.EMPTY;
   public static final int PING_DATA_FIELD_NUMBER = 2;
   private List<PingData> pingData_;
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
      this.requestId_ = ByteString.EMPTY;
      this.pingData_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PingResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_transfer_v1_PingResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_transfer_v1_PingResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PingResponse.class, PingResponse.Builder.class);
   }

   @Override
   public ByteString getRequestId() {
      return this.requestId_;
   }

   @Override
   public List<PingData> getPingDataList() {
      return this.pingData_;
   }

   @Override
   public List<? extends PingDataOrBuilder> getPingDataOrBuilderList() {
      return this.pingData_;
   }

   @Override
   public int getPingDataCount() {
      return this.pingData_.size();
   }

   @Override
   public PingData getPingData(int var1) {
      return this.pingData_.get(var1);
   }

   @Override
   public PingDataOrBuilder getPingDataOrBuilder(int var1) {
      return this.pingData_.get(var1);
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
      if (!this.requestId_.isEmpty()) {
         var1.writeBytes(1, this.requestId_);
      }

      for (int var2 = 0; var2 < this.pingData_.size(); var2++) {
         var1.writeMessage(2, this.pingData_.get(var2));
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
      if (!this.requestId_.isEmpty()) {
         var1 += CodedOutputStream.computeBytesSize(1, this.requestId_);
      }

      for (int var2 = 0; var2 < this.pingData_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(2, this.pingData_.get(var2));
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
         if (!this.getRequestId().equals(var2.getRequestId())) {
            return false;
         } else {
            return !this.getPingDataList().equals(var2.getPingDataList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getRequestId().hashCode();
      if (this.getPingDataCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getPingDataList().hashCode();
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
      private ByteString requestId_ = ByteString.EMPTY;
      private List<PingData> pingData_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<PingData, PingData.Builder, PingDataOrBuilder> pingDataBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_transfer_v1_PingResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_transfer_v1_PingResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PingResponse.class, PingResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public PingResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.requestId_ = ByteString.EMPTY;
         if (this.pingDataBuilder_ == null) {
            this.pingData_ = Collections.emptyList();
         } else {
            this.pingData_ = null;
            this.pingDataBuilder_.clear();
         }

         this.bitField0_ &= -3;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_transfer_v1_PingResponse_descriptor;
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
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(PingResponse var1) {
         if (this.pingDataBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.pingData_ = Collections.unmodifiableList(this.pingData_);
               this.bitField0_ &= -3;
            }

            var1.pingData_ = this.pingData_;
         } else {
            var1.pingData_ = this.pingDataBuilder_.build();
         }
      }

      private void buildPartial0(PingResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.requestId_ = this.requestId_;
         }
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

         if (var1.getRequestId() != ByteString.EMPTY) {
            this.setRequestId(var1.getRequestId());
         }

         if (this.pingDataBuilder_ == null) {
            if (!var1.pingData_.isEmpty()) {
               if (this.pingData_.isEmpty()) {
                  this.pingData_ = var1.pingData_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensurePingDataIsMutable();
                  this.pingData_.addAll(var1.pingData_);
               }

               this.onChanged();
            }
         } else if (!var1.pingData_.isEmpty()) {
            if (this.pingDataBuilder_.isEmpty()) {
               this.pingDataBuilder_.dispose();
               this.pingDataBuilder_ = null;
               this.pingData_ = var1.pingData_;
               this.bitField0_ &= -3;
               this.pingDataBuilder_ = PingResponse.alwaysUseFieldBuilders ? this.getPingDataFieldBuilder() : null;
            } else {
               this.pingDataBuilder_.addAllMessages(var1.pingData_);
            }
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
                     this.requestId_ = var1.readBytes();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     PingData var5 = var1.readMessage(PingData.parser(), var2);
                     if (this.pingDataBuilder_ == null) {
                        this.ensurePingDataIsMutable();
                        this.pingData_.add(var5);
                     } else {
                        this.pingDataBuilder_.addMessage(var5);
                     }
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var9) {
            throw var9.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      @Override
      public ByteString getRequestId() {
         return this.requestId_;
      }

      public PingResponse.Builder setRequestId(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.requestId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PingResponse.Builder clearRequestId() {
         this.bitField0_ &= -2;
         this.requestId_ = PingResponse.getDefaultInstance().getRequestId();
         this.onChanged();
         return this;
      }

      private void ensurePingDataIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.pingData_ = new ArrayList<>(this.pingData_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<PingData> getPingDataList() {
         return this.pingDataBuilder_ == null ? Collections.unmodifiableList(this.pingData_) : this.pingDataBuilder_.getMessageList();
      }

      @Override
      public int getPingDataCount() {
         return this.pingDataBuilder_ == null ? this.pingData_.size() : this.pingDataBuilder_.getCount();
      }

      @Override
      public PingData getPingData(int var1) {
         return this.pingDataBuilder_ == null ? this.pingData_.get(var1) : this.pingDataBuilder_.getMessage(var1);
      }

      public PingResponse.Builder setPingData(int var1, PingData var2) {
         if (this.pingDataBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensurePingDataIsMutable();
            this.pingData_.set(var1, var2);
            this.onChanged();
         } else {
            this.pingDataBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public PingResponse.Builder setPingData(int var1, PingData.Builder var2) {
         if (this.pingDataBuilder_ == null) {
            this.ensurePingDataIsMutable();
            this.pingData_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.pingDataBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public PingResponse.Builder addPingData(PingData var1) {
         if (this.pingDataBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensurePingDataIsMutable();
            this.pingData_.add(var1);
            this.onChanged();
         } else {
            this.pingDataBuilder_.addMessage(var1);
         }

         return this;
      }

      public PingResponse.Builder addPingData(int var1, PingData var2) {
         if (this.pingDataBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensurePingDataIsMutable();
            this.pingData_.add(var1, var2);
            this.onChanged();
         } else {
            this.pingDataBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public PingResponse.Builder addPingData(PingData.Builder var1) {
         if (this.pingDataBuilder_ == null) {
            this.ensurePingDataIsMutable();
            this.pingData_.add(var1.build());
            this.onChanged();
         } else {
            this.pingDataBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public PingResponse.Builder addPingData(int var1, PingData.Builder var2) {
         if (this.pingDataBuilder_ == null) {
            this.ensurePingDataIsMutable();
            this.pingData_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.pingDataBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public PingResponse.Builder addAllPingData(Iterable<? extends PingData> var1) {
         if (this.pingDataBuilder_ == null) {
            this.ensurePingDataIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.pingData_);
            this.onChanged();
         } else {
            this.pingDataBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public PingResponse.Builder clearPingData() {
         if (this.pingDataBuilder_ == null) {
            this.pingData_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.pingDataBuilder_.clear();
         }

         return this;
      }

      public PingResponse.Builder removePingData(int var1) {
         if (this.pingDataBuilder_ == null) {
            this.ensurePingDataIsMutable();
            this.pingData_.remove(var1);
            this.onChanged();
         } else {
            this.pingDataBuilder_.remove(var1);
         }

         return this;
      }

      public PingData.Builder getPingDataBuilder(int var1) {
         return this.getPingDataFieldBuilder().getBuilder(var1);
      }

      @Override
      public PingDataOrBuilder getPingDataOrBuilder(int var1) {
         return this.pingDataBuilder_ == null ? this.pingData_.get(var1) : this.pingDataBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends PingDataOrBuilder> getPingDataOrBuilderList() {
         return this.pingDataBuilder_ != null ? this.pingDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.pingData_);
      }

      public PingData.Builder addPingDataBuilder() {
         return this.getPingDataFieldBuilder().addBuilder(PingData.getDefaultInstance());
      }

      public PingData.Builder addPingDataBuilder(int var1) {
         return this.getPingDataFieldBuilder().addBuilder(var1, PingData.getDefaultInstance());
      }

      public List<PingData.Builder> getPingDataBuilderList() {
         return this.getPingDataFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<PingData, PingData.Builder, PingDataOrBuilder> getPingDataFieldBuilder() {
         if (this.pingDataBuilder_ == null) {
            this.pingDataBuilder_ = new RepeatedFieldBuilderV3<>(this.pingData_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
            this.pingData_ = null;
         }

         return this.pingDataBuilder_;
      }

      public final PingResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PingResponse.Builder)super.setUnknownFields(var1);
      }

      public final PingResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PingResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
