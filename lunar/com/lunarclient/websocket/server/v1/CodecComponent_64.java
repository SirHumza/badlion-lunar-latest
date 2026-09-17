package com.lunarclient.websocket.server.v1;

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

public final class GetPlayerCountsRequest extends GeneratedMessageV3 implements GetPlayerCountsRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SERVER_IDS_FIELD_NUMBER = 1;
   private LazyStringArrayList serverIds_ = LazyStringArrayList.emptyList();
   private byte memoizedIsInitialized = -1;
   private static final GetPlayerCountsRequest DEFAULT_INSTANCE = new GetPlayerCountsRequest();
   private static final Parser<GetPlayerCountsRequest> PARSER = new AbstractParser<GetPlayerCountsRequest>() {
      public GetPlayerCountsRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         GetPlayerCountsRequest.Builder var3 = GetPlayerCountsRequest.newBuilder();

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

   private GetPlayerCountsRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private GetPlayerCountsRequest() {
      this.serverIds_ = LazyStringArrayList.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new GetPlayerCountsRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_server_v1_GetPlayerCountsRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_server_v1_GetPlayerCountsRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(GetPlayerCountsRequest.class, GetPlayerCountsRequest.Builder.class);
   }

   public ProtocolStringList getServerIdsList() {
      return this.serverIds_;
   }

   @Override
   public int getServerIdsCount() {
      return this.serverIds_.size();
   }

   @Override
   public String getServerIds(int var1) {
      return this.serverIds_.get(var1);
   }

   @Override
   public ByteString getServerIdsBytes(int var1) {
      return this.serverIds_.getByteString(var1);
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
      for (int var2 = 0; var2 < this.serverIds_.size(); var2++) {
         GeneratedMessageV3.writeString(var1, 1, this.serverIds_.getRaw(var2));
      }

      this.getUnknownFields().writeTo(var1);
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      int var4 = 0;
      int var2 = 0;

      for (int var3 = 0; var3 < this.serverIds_.size(); var3++) {
         var2 += computeStringSizeNoTag(this.serverIds_.getRaw(var3));
      }

      var4 += var2;
      var4 += 1 * this.getServerIdsList().size();
      var4 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var4;
      return var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof GetPlayerCountsRequest)) {
         return super.equals(var1);
      }

      GetPlayerCountsRequest var2 = (GetPlayerCountsRequest)var1;
      return !this.getServerIdsList().equals(var2.getServerIdsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getServerIdsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getServerIdsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static GetPlayerCountsRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static GetPlayerCountsRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GetPlayerCountsRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static GetPlayerCountsRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GetPlayerCountsRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static GetPlayerCountsRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GetPlayerCountsRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GetPlayerCountsRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static GetPlayerCountsRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static GetPlayerCountsRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static GetPlayerCountsRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GetPlayerCountsRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public GetPlayerCountsRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static GetPlayerCountsRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static GetPlayerCountsRequest.Builder newBuilder(GetPlayerCountsRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public GetPlayerCountsRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new GetPlayerCountsRequest.Builder() : new GetPlayerCountsRequest.Builder().mergeFrom(this);
   }

   protected GetPlayerCountsRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new GetPlayerCountsRequest.Builder(var1);
   }

   public static GetPlayerCountsRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<GetPlayerCountsRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<GetPlayerCountsRequest> getParserForType() {
      return PARSER;
   }

   public GetPlayerCountsRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<GetPlayerCountsRequest.Builder> implements GetPlayerCountsRequestOrBuilder {
      private int bitField0_;
      private LazyStringArrayList serverIds_ = LazyStringArrayList.emptyList();

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_server_v1_GetPlayerCountsRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_server_v1_GetPlayerCountsRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(GetPlayerCountsRequest.class, GetPlayerCountsRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public GetPlayerCountsRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.serverIds_ = LazyStringArrayList.emptyList();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_server_v1_GetPlayerCountsRequest_descriptor;
      }

      public GetPlayerCountsRequest getDefaultInstanceForType() {
         return GetPlayerCountsRequest.getDefaultInstance();
      }

      public GetPlayerCountsRequest build() {
         GetPlayerCountsRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public GetPlayerCountsRequest buildPartial() {
         GetPlayerCountsRequest var1 = new GetPlayerCountsRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(GetPlayerCountsRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            this.serverIds_.makeImmutable();
            var1.serverIds_ = this.serverIds_;
         }
      }

      public GetPlayerCountsRequest.Builder clone() {
         return (GetPlayerCountsRequest.Builder)super.clone();
      }

      public GetPlayerCountsRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GetPlayerCountsRequest.Builder)super.setField(var1, var2);
      }

      public GetPlayerCountsRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (GetPlayerCountsRequest.Builder)super.clearField(var1);
      }

      public GetPlayerCountsRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (GetPlayerCountsRequest.Builder)super.clearOneof(var1);
      }

      public GetPlayerCountsRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (GetPlayerCountsRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public GetPlayerCountsRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GetPlayerCountsRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public GetPlayerCountsRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof GetPlayerCountsRequest) {
            return this.mergeFrom((GetPlayerCountsRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public GetPlayerCountsRequest.Builder mergeFrom(GetPlayerCountsRequest var1) {
         if (var1 == GetPlayerCountsRequest.getDefaultInstance()) {
            return this;
         }

         if (!var1.serverIds_.isEmpty()) {
            if (this.serverIds_.isEmpty()) {
               this.serverIds_ = var1.serverIds_;
               this.bitField0_ |= 1;
            } else {
               this.ensureServerIdsIsMutable();
               this.serverIds_.addAll(var1.serverIds_);
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

      public GetPlayerCountsRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     String var5 = var1.readStringRequireUtf8();
                     this.ensureServerIdsIsMutable();
                     this.serverIds_.add(var5);
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

      private void ensureServerIdsIsMutable() {
         if (!this.serverIds_.isModifiable()) {
            this.serverIds_ = new LazyStringArrayList(this.serverIds_);
         }

         this.bitField0_ |= 1;
      }

      public ProtocolStringList getServerIdsList() {
         this.serverIds_.makeImmutable();
         return this.serverIds_;
      }

      @Override
      public int getServerIdsCount() {
         return this.serverIds_.size();
      }

      @Override
      public String getServerIds(int var1) {
         return this.serverIds_.get(var1);
      }

      @Override
      public ByteString getServerIdsBytes(int var1) {
         return this.serverIds_.getByteString(var1);
      }

      public GetPlayerCountsRequest.Builder setServerIds(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureServerIdsIsMutable();
         this.serverIds_.set(var1, var2);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public GetPlayerCountsRequest.Builder addServerIds(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureServerIdsIsMutable();
         this.serverIds_.add(var1);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public GetPlayerCountsRequest.Builder addAllServerIds(Iterable<String> var1) {
         this.ensureServerIdsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.serverIds_);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public GetPlayerCountsRequest.Builder clearServerIds() {
         this.serverIds_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public GetPlayerCountsRequest.Builder addServerIdsBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         GetPlayerCountsRequest.checkByteStringIsUtf8(var1);
         this.ensureServerIdsIsMutable();
         this.serverIds_.add(var1);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final GetPlayerCountsRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (GetPlayerCountsRequest.Builder)super.setUnknownFields(var1);
      }

      public final GetPlayerCountsRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (GetPlayerCountsRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
