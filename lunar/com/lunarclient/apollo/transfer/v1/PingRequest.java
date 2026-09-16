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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class PingRequest extends GeneratedMessageV3 implements PingRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int REQUEST_ID_FIELD_NUMBER = 1;
   private ByteString requestId_ = ByteString.EMPTY;
   public static final int SERVER_IPS_FIELD_NUMBER = 2;
   private LazyStringArrayList serverIps_ = LazyStringArrayList.emptyList();
   private byte memoizedIsInitialized = -1;
   private static final PingRequest DEFAULT_INSTANCE = new PingRequest();
   private static final Parser<PingRequest> PARSER = new AbstractParser<PingRequest>() {
      public PingRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PingRequest.Builder var3 = PingRequest.newBuilder();

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

   private PingRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PingRequest() {
      this.requestId_ = ByteString.EMPTY;
      this.serverIps_ = LazyStringArrayList.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PingRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_transfer_v1_PingRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_transfer_v1_PingRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PingRequest.class, PingRequest.Builder.class);
   }

   @Override
   public ByteString getRequestId() {
      return this.requestId_;
   }

   public ProtocolStringList getServerIpsList() {
      return this.serverIps_;
   }

   @Override
   public int getServerIpsCount() {
      return this.serverIps_.size();
   }

   @Override
   public String getServerIps(int var1) {
      return this.serverIps_.get(var1);
   }

   @Override
   public ByteString getServerIpsBytes(int var1) {
      return this.serverIps_.getByteString(var1);
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

      for (int var2 = 0; var2 < this.serverIps_.size(); var2++) {
         GeneratedMessageV3.writeString(var1, 2, this.serverIps_.getRaw(var2));
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

      int var2 = 0;

      for (int var3 = 0; var3 < this.serverIps_.size(); var3++) {
         var2 += computeStringSizeNoTag(this.serverIps_.getRaw(var3));
      }

      var1 += var2;
      var1 += 1 * this.getServerIpsList().size();
      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PingRequest)) {
         return super.equals(var1);
      } else {
         PingRequest var2 = (PingRequest)var1;
         if (!this.getRequestId().equals(var2.getRequestId())) {
            return false;
         } else {
            return !this.getServerIpsList().equals(var2.getServerIpsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.getServerIpsCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getServerIpsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PingRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PingRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PingRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PingRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PingRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PingRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PingRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PingRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PingRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PingRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PingRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PingRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PingRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PingRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PingRequest.Builder newBuilder(PingRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PingRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PingRequest.Builder() : new PingRequest.Builder().mergeFrom(this);
   }

   protected PingRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PingRequest.Builder(var1);
   }

   public static PingRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PingRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<PingRequest> getParserForType() {
      return PARSER;
   }

   public PingRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PingRequest.Builder> implements PingRequestOrBuilder {
      private int bitField0_;
      private ByteString requestId_ = ByteString.EMPTY;
      private LazyStringArrayList serverIps_ = LazyStringArrayList.emptyList();

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_transfer_v1_PingRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_transfer_v1_PingRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PingRequest.class, PingRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public PingRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.requestId_ = ByteString.EMPTY;
         this.serverIps_ = LazyStringArrayList.emptyList();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_transfer_v1_PingRequest_descriptor;
      }

      public PingRequest getDefaultInstanceForType() {
         return PingRequest.getDefaultInstance();
      }

      public PingRequest build() {
         PingRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PingRequest buildPartial() {
         PingRequest var1 = new PingRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(PingRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.requestId_ = this.requestId_;
         }

         if ((var2 & 2) != 0) {
            this.serverIps_.makeImmutable();
            var1.serverIps_ = this.serverIps_;
         }
      }

      public PingRequest.Builder clone() {
         return (PingRequest.Builder)super.clone();
      }

      public PingRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PingRequest.Builder)super.setField(var1, var2);
      }

      public PingRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PingRequest.Builder)super.clearField(var1);
      }

      public PingRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PingRequest.Builder)super.clearOneof(var1);
      }

      public PingRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PingRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PingRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PingRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public PingRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof PingRequest) {
            return this.mergeFrom((PingRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PingRequest.Builder mergeFrom(PingRequest var1) {
         if (var1 == PingRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.getRequestId() != ByteString.EMPTY) {
            this.setRequestId(var1.getRequestId());
         }

         if (!var1.serverIps_.isEmpty()) {
            if (this.serverIps_.isEmpty()) {
               this.serverIps_ = var1.serverIps_;
               this.bitField0_ |= 2;
            } else {
               this.ensureServerIpsIsMutable();
               this.serverIps_.addAll(var1.serverIps_);
            }

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

      public PingRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     String var5 = var1.readStringRequireUtf8();
                     this.ensureServerIpsIsMutable();
                     this.serverIps_.add(var5);
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

      public PingRequest.Builder setRequestId(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.requestId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PingRequest.Builder clearRequestId() {
         this.bitField0_ &= -2;
         this.requestId_ = PingRequest.getDefaultInstance().getRequestId();
         this.onChanged();
         return this;
      }

      private void ensureServerIpsIsMutable() {
         if (!this.serverIps_.isModifiable()) {
            this.serverIps_ = new LazyStringArrayList(this.serverIps_);
         }

         this.bitField0_ |= 2;
      }

      public ProtocolStringList getServerIpsList() {
         this.serverIps_.makeImmutable();
         return this.serverIps_;
      }

      @Override
      public int getServerIpsCount() {
         return this.serverIps_.size();
      }

      @Override
      public String getServerIps(int var1) {
         return this.serverIps_.get(var1);
      }

      @Override
      public ByteString getServerIpsBytes(int var1) {
         return this.serverIps_.getByteString(var1);
      }

      public PingRequest.Builder setServerIps(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureServerIpsIsMutable();
         this.serverIps_.set(var1, var2);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PingRequest.Builder addServerIps(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureServerIpsIsMutable();
         this.serverIps_.add(var1);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PingRequest.Builder addAllServerIps(Iterable<String> var1) {
         this.ensureServerIpsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.serverIps_);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PingRequest.Builder clearServerIps() {
         this.serverIps_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public PingRequest.Builder addServerIpsBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         PingRequest.checkByteStringIsUtf8(var1);
         this.ensureServerIpsIsMutable();
         this.serverIps_.add(var1);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public final PingRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PingRequest.Builder)super.setUnknownFields(var1);
      }

      public final PingRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PingRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
