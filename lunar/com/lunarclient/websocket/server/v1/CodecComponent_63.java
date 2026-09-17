package com.lunarclient.websocket.server.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class GetPlayerCountsResponse extends GeneratedMessageV3 implements GetPlayerCountsResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SERVERS_FIELD_NUMBER = 1;
   private List<GetPlayerCountsResponse.Server> servers_;
   private byte memoizedIsInitialized = -1;
   private static final GetPlayerCountsResponse DEFAULT_INSTANCE = new GetPlayerCountsResponse();
   private static final Parser<GetPlayerCountsResponse> PARSER = new AbstractParser<GetPlayerCountsResponse>() {
      public GetPlayerCountsResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         GetPlayerCountsResponse.Builder var3 = GetPlayerCountsResponse.newBuilder();

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

   private GetPlayerCountsResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private GetPlayerCountsResponse() {
      this.servers_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new GetPlayerCountsResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_server_v1_GetPlayerCountsResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_server_v1_GetPlayerCountsResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(GetPlayerCountsResponse.class, GetPlayerCountsResponse.Builder.class);
   }

   @Override
   public List<GetPlayerCountsResponse.Server> getServersList() {
      return this.servers_;
   }

   @Override
   public List<? extends GetPlayerCountsResponse.ServerOrBuilder> getServersOrBuilderList() {
      return this.servers_;
   }

   @Override
   public int getServersCount() {
      return this.servers_.size();
   }

   @Override
   public GetPlayerCountsResponse.Server getServers(int var1) {
      return this.servers_.get(var1);
   }

   @Override
   public GetPlayerCountsResponse.ServerOrBuilder getServersOrBuilder(int var1) {
      return this.servers_.get(var1);
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
      for (int var2 = 0; var2 < this.servers_.size(); var2++) {
         var1.writeMessage(1, this.servers_.get(var2));
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

      for (int var2 = 0; var2 < this.servers_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.servers_.get(var2));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof GetPlayerCountsResponse)) {
         return super.equals(var1);
      }

      GetPlayerCountsResponse var2 = (GetPlayerCountsResponse)var1;
      return !this.getServersList().equals(var2.getServersList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getServersCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getServersList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static GetPlayerCountsResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static GetPlayerCountsResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GetPlayerCountsResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static GetPlayerCountsResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GetPlayerCountsResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static GetPlayerCountsResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GetPlayerCountsResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GetPlayerCountsResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static GetPlayerCountsResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static GetPlayerCountsResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static GetPlayerCountsResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GetPlayerCountsResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public GetPlayerCountsResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static GetPlayerCountsResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static GetPlayerCountsResponse.Builder newBuilder(GetPlayerCountsResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public GetPlayerCountsResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new GetPlayerCountsResponse.Builder() : new GetPlayerCountsResponse.Builder().mergeFrom(this);
   }

   protected GetPlayerCountsResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new GetPlayerCountsResponse.Builder(var1);
   }

   public static GetPlayerCountsResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<GetPlayerCountsResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<GetPlayerCountsResponse> getParserForType() {
      return PARSER;
   }

   public GetPlayerCountsResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<GetPlayerCountsResponse.Builder> implements GetPlayerCountsResponseOrBuilder {
      private int bitField0_;
      private List<GetPlayerCountsResponse.Server> servers_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<GetPlayerCountsResponse.Server, GetPlayerCountsResponse.Server.Builder, GetPlayerCountsResponse.ServerOrBuilder> serversBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_server_v1_GetPlayerCountsResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_server_v1_GetPlayerCountsResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(GetPlayerCountsResponse.class, GetPlayerCountsResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public GetPlayerCountsResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.serversBuilder_ == null) {
            this.servers_ = Collections.emptyList();
         } else {
            this.servers_ = null;
            this.serversBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_server_v1_GetPlayerCountsResponse_descriptor;
      }

      public GetPlayerCountsResponse getDefaultInstanceForType() {
         return GetPlayerCountsResponse.getDefaultInstance();
      }

      public GetPlayerCountsResponse build() {
         GetPlayerCountsResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public GetPlayerCountsResponse buildPartial() {
         GetPlayerCountsResponse var1 = new GetPlayerCountsResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(GetPlayerCountsResponse var1) {
         if (this.serversBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.servers_ = Collections.unmodifiableList(this.servers_);
               this.bitField0_ &= -2;
            }

            var1.servers_ = this.servers_;
         } else {
            var1.servers_ = this.serversBuilder_.build();
         }
      }

      private void buildPartial0(GetPlayerCountsResponse var1) {
         int var2 = this.bitField0_;
      }

      public GetPlayerCountsResponse.Builder clone() {
         return (GetPlayerCountsResponse.Builder)super.clone();
      }

      public GetPlayerCountsResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GetPlayerCountsResponse.Builder)super.setField(var1, var2);
      }

      public GetPlayerCountsResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (GetPlayerCountsResponse.Builder)super.clearField(var1);
      }

      public GetPlayerCountsResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (GetPlayerCountsResponse.Builder)super.clearOneof(var1);
      }

      public GetPlayerCountsResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (GetPlayerCountsResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public GetPlayerCountsResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GetPlayerCountsResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public GetPlayerCountsResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof GetPlayerCountsResponse) {
            return this.mergeFrom((GetPlayerCountsResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public GetPlayerCountsResponse.Builder mergeFrom(GetPlayerCountsResponse var1) {
         if (var1 == GetPlayerCountsResponse.getDefaultInstance()) {
            return this;
         }

         if (this.serversBuilder_ == null) {
            if (!var1.servers_.isEmpty()) {
               if (this.servers_.isEmpty()) {
                  this.servers_ = var1.servers_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureServersIsMutable();
                  this.servers_.addAll(var1.servers_);
               }

               this.onChanged();
            }
         } else if (!var1.servers_.isEmpty()) {
            if (this.serversBuilder_.isEmpty()) {
               this.serversBuilder_.dispose();
               this.serversBuilder_ = null;
               this.servers_ = var1.servers_;
               this.bitField0_ &= -2;
               this.serversBuilder_ = GetPlayerCountsResponse.alwaysUseFieldBuilders ? this.getServersFieldBuilder() : null;
            } else {
               this.serversBuilder_.addAllMessages(var1.servers_);
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

      public GetPlayerCountsResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     GetPlayerCountsResponse.Server var5 = var1.readMessage(GetPlayerCountsResponse.Server.parser(), var2);
                     if (this.serversBuilder_ == null) {
                        this.ensureServersIsMutable();
                        this.servers_.add(var5);
                     } else {
                        this.serversBuilder_.addMessage(var5);
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

      private void ensureServersIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.servers_ = new ArrayList<>(this.servers_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<GetPlayerCountsResponse.Server> getServersList() {
         return this.serversBuilder_ == null ? Collections.unmodifiableList(this.servers_) : this.serversBuilder_.getMessageList();
      }

      @Override
      public int getServersCount() {
         return this.serversBuilder_ == null ? this.servers_.size() : this.serversBuilder_.getCount();
      }

      @Override
      public GetPlayerCountsResponse.Server getServers(int var1) {
         return this.serversBuilder_ == null ? this.servers_.get(var1) : this.serversBuilder_.getMessage(var1);
      }

      public GetPlayerCountsResponse.Builder setServers(int var1, GetPlayerCountsResponse.Server var2) {
         if (this.serversBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureServersIsMutable();
            this.servers_.set(var1, var2);
            this.onChanged();
         } else {
            this.serversBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public GetPlayerCountsResponse.Builder setServers(int var1, GetPlayerCountsResponse.Server.Builder var2) {
         if (this.serversBuilder_ == null) {
            this.ensureServersIsMutable();
            this.servers_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.serversBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public GetPlayerCountsResponse.Builder addServers(GetPlayerCountsResponse.Server var1) {
         if (this.serversBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureServersIsMutable();
            this.servers_.add(var1);
            this.onChanged();
         } else {
            this.serversBuilder_.addMessage(var1);
         }

         return this;
      }

      public GetPlayerCountsResponse.Builder addServers(int var1, GetPlayerCountsResponse.Server var2) {
         if (this.serversBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureServersIsMutable();
            this.servers_.add(var1, var2);
            this.onChanged();
         } else {
            this.serversBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public GetPlayerCountsResponse.Builder addServers(GetPlayerCountsResponse.Server.Builder var1) {
         if (this.serversBuilder_ == null) {
            this.ensureServersIsMutable();
            this.servers_.add(var1.build());
            this.onChanged();
         } else {
            this.serversBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public GetPlayerCountsResponse.Builder addServers(int var1, GetPlayerCountsResponse.Server.Builder var2) {
         if (this.serversBuilder_ == null) {
            this.ensureServersIsMutable();
            this.servers_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.serversBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public GetPlayerCountsResponse.Builder addAllServers(Iterable<? extends GetPlayerCountsResponse.Server> var1) {
         if (this.serversBuilder_ == null) {
            this.ensureServersIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.servers_);
            this.onChanged();
         } else {
            this.serversBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public GetPlayerCountsResponse.Builder clearServers() {
         if (this.serversBuilder_ == null) {
            this.servers_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.serversBuilder_.clear();
         }

         return this;
      }

      public GetPlayerCountsResponse.Builder removeServers(int var1) {
         if (this.serversBuilder_ == null) {
            this.ensureServersIsMutable();
            this.servers_.remove(var1);
            this.onChanged();
         } else {
            this.serversBuilder_.remove(var1);
         }

         return this;
      }

      public GetPlayerCountsResponse.Server.Builder getServersBuilder(int var1) {
         return this.getServersFieldBuilder().getBuilder(var1);
      }

      @Override
      public GetPlayerCountsResponse.ServerOrBuilder getServersOrBuilder(int var1) {
         return this.serversBuilder_ == null ? this.servers_.get(var1) : this.serversBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends GetPlayerCountsResponse.ServerOrBuilder> getServersOrBuilderList() {
         return this.serversBuilder_ != null ? this.serversBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.servers_);
      }

      public GetPlayerCountsResponse.Server.Builder addServersBuilder() {
         return this.getServersFieldBuilder().addBuilder(GetPlayerCountsResponse.Server.getDefaultInstance());
      }

      public GetPlayerCountsResponse.Server.Builder addServersBuilder(int var1) {
         return this.getServersFieldBuilder().addBuilder(var1, GetPlayerCountsResponse.Server.getDefaultInstance());
      }

      public List<GetPlayerCountsResponse.Server.Builder> getServersBuilderList() {
         return this.getServersFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<GetPlayerCountsResponse.Server, GetPlayerCountsResponse.Server.Builder, GetPlayerCountsResponse.ServerOrBuilder> getServersFieldBuilder() {
         if (this.serversBuilder_ == null) {
            this.serversBuilder_ = new RepeatedFieldBuilderV3<>(this.servers_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.servers_ = null;
         }

         return this.serversBuilder_;
      }

      public final GetPlayerCountsResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (GetPlayerCountsResponse.Builder)super.setUnknownFields(var1);
      }

      public final GetPlayerCountsResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (GetPlayerCountsResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public static final class Server extends GeneratedMessageV3 implements GetPlayerCountsResponse.ServerOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SERVER_ID_FIELD_NUMBER = 1;
      private volatile Object serverId_ = "";
      public static final int STATUS_FIELD_NUMBER = 2;
      private int status_ = 0;
      public static final int ONLINE_COUNT_FIELD_NUMBER = 3;
      private int onlineCount_ = 0;
      public static final int MAX_COUNT_FIELD_NUMBER = 4;
      private int maxCount_ = 0;
      private byte memoizedIsInitialized = -1;
      private static final GetPlayerCountsResponse.Server DEFAULT_INSTANCE = new GetPlayerCountsResponse.Server();
      private static final Parser<GetPlayerCountsResponse.Server> PARSER = new AbstractParser<GetPlayerCountsResponse.Server>() {
         public GetPlayerCountsResponse.Server parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            GetPlayerCountsResponse.Server.Builder var3 = GetPlayerCountsResponse.Server.newBuilder();

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

      private Server(GeneratedMessageV3.Builder<?> var1) {
         super(var1);
      }

      private Server() {
         this.serverId_ = "";
         this.status_ = 0;
      }

      @Override
      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
         return new GetPlayerCountsResponse.Server();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_server_v1_GetPlayerCountsResponse_Server_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_server_v1_GetPlayerCountsResponse_Server_fieldAccessorTable
            .ensureFieldAccessorsInitialized(GetPlayerCountsResponse.Server.class, GetPlayerCountsResponse.Server.Builder.class);
      }

      @Override
      public String getServerId() {
         Object var1 = this.serverId_;
         if (var1 instanceof String) {
            return (String)var1;
         }

         ByteString var2 = (ByteString)var1;
         String var3 = var2.toStringUtf8();
         this.serverId_ = var3;
         return var3;
      }

      @Override
      public ByteString getServerIdBytes() {
         Object var1 = this.serverId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.serverId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      @Override
      public int getStatusValue() {
         return this.status_;
      }

      @Override
      public GetPlayerCountsResponse.Server.Status getStatus() {
         GetPlayerCountsResponse.Server.Status var1 = GetPlayerCountsResponse.Server.Status.forNumber(this.status_);
         return var1 == null ? GetPlayerCountsResponse.Server.Status.UNRECOGNIZED : var1;
      }

      @Override
      public int getOnlineCount() {
         return this.onlineCount_;
      }

      @Override
      public int getMaxCount() {
         return this.maxCount_;
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
         if (!GeneratedMessageV3.isStringEmpty(this.serverId_)) {
            GeneratedMessageV3.writeString(var1, 1, this.serverId_);
         }

         if (this.status_ != GetPlayerCountsResponse.Server.Status.STATUS_UNSPECIFIED.getNumber()) {
            var1.writeEnum(2, this.status_);
         }

         if (this.onlineCount_ != 0) {
            var1.writeInt32(3, this.onlineCount_);
         }

         if (this.maxCount_ != 0) {
            var1.writeInt32(4, this.maxCount_);
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
         if (!GeneratedMessageV3.isStringEmpty(this.serverId_)) {
            var1 += GeneratedMessageV3.computeStringSize(1, this.serverId_);
         }

         if (this.status_ != GetPlayerCountsResponse.Server.Status.STATUS_UNSPECIFIED.getNumber()) {
            var1 += CodedOutputStream.computeEnumSize(2, this.status_);
         }

         if (this.onlineCount_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(3, this.onlineCount_);
         }

         if (this.maxCount_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(4, this.maxCount_);
         }

         var1 += this.getUnknownFields().getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof GetPlayerCountsResponse.Server)) {
            return super.equals(var1);
         } else {
            GetPlayerCountsResponse.Server var2 = (GetPlayerCountsResponse.Server)var1;
            if (!this.getServerId().equals(var2.getServerId())) {
               return false;
            } else if (this.status_ != var2.status_) {
               return false;
            } else if (this.getOnlineCount() != var2.getOnlineCount()) {
               return false;
            } else {
               return this.getMaxCount() != var2.getMaxCount() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
         var1 = 53 * var1 + this.getServerId().hashCode();
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.status_;
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getOnlineCount();
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getMaxCount();
         var1 = 29 * var1 + this.getUnknownFields().hashCode();
         this.memoizedHashCode = var1;
         return var1;
      }

      public static GetPlayerCountsResponse.Server parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static GetPlayerCountsResponse.Server parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static GetPlayerCountsResponse.Server parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static GetPlayerCountsResponse.Server parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static GetPlayerCountsResponse.Server parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static GetPlayerCountsResponse.Server parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static GetPlayerCountsResponse.Server parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static GetPlayerCountsResponse.Server parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static GetPlayerCountsResponse.Server parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static GetPlayerCountsResponse.Server parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static GetPlayerCountsResponse.Server parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static GetPlayerCountsResponse.Server parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public GetPlayerCountsResponse.Server.Builder newBuilderForType() {
         return newBuilder();
      }

      public static GetPlayerCountsResponse.Server.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static GetPlayerCountsResponse.Server.Builder newBuilder(GetPlayerCountsResponse.Server var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public GetPlayerCountsResponse.Server.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new GetPlayerCountsResponse.Server.Builder() : new GetPlayerCountsResponse.Server.Builder().mergeFrom(this);
      }

      protected GetPlayerCountsResponse.Server.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new GetPlayerCountsResponse.Server.Builder(var1);
      }

      public static GetPlayerCountsResponse.Server getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<GetPlayerCountsResponse.Server> parser() {
         return PARSER;
      }

      @Override
      public Parser<GetPlayerCountsResponse.Server> getParserForType() {
         return PARSER;
      }

      public GetPlayerCountsResponse.Server getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder
         extends GeneratedMessageV3.Builder<GetPlayerCountsResponse.Server.Builder>
         implements GetPlayerCountsResponse.ServerOrBuilder {
         private int bitField0_;
         private Object serverId_ = "";
         private int status_ = 0;
         private int onlineCount_;
         private int maxCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ServiceProto.internal_static_lunarclient_websocket_server_v1_GetPlayerCountsResponse_Server_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ServiceProto.internal_static_lunarclient_websocket_server_v1_GetPlayerCountsResponse_Server_fieldAccessorTable
               .ensureFieldAccessorsInitialized(GetPlayerCountsResponse.Server.class, GetPlayerCountsResponse.Server.Builder.class);
         }

         private Builder() {
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
         }

         public GetPlayerCountsResponse.Server.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.serverId_ = "";
            this.status_ = 0;
            this.onlineCount_ = 0;
            this.maxCount_ = 0;
            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return ServiceProto.internal_static_lunarclient_websocket_server_v1_GetPlayerCountsResponse_Server_descriptor;
         }

         public GetPlayerCountsResponse.Server getDefaultInstanceForType() {
            return GetPlayerCountsResponse.Server.getDefaultInstance();
         }

         public GetPlayerCountsResponse.Server build() {
            GetPlayerCountsResponse.Server var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public GetPlayerCountsResponse.Server buildPartial() {
            GetPlayerCountsResponse.Server var1 = new GetPlayerCountsResponse.Server(this);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartial0(GetPlayerCountsResponse.Server var1) {
            int var2 = this.bitField0_;
            if ((var2 & 1) != 0) {
               var1.serverId_ = this.serverId_;
            }

            if ((var2 & 2) != 0) {
               var1.status_ = this.status_;
            }

            if ((var2 & 4) != 0) {
               var1.onlineCount_ = this.onlineCount_;
            }

            if ((var2 & 8) != 0) {
               var1.maxCount_ = this.maxCount_;
            }
         }

         public GetPlayerCountsResponse.Server.Builder clone() {
            return (GetPlayerCountsResponse.Server.Builder)super.clone();
         }

         public GetPlayerCountsResponse.Server.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (GetPlayerCountsResponse.Server.Builder)super.setField(var1, var2);
         }

         public GetPlayerCountsResponse.Server.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (GetPlayerCountsResponse.Server.Builder)super.clearField(var1);
         }

         public GetPlayerCountsResponse.Server.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (GetPlayerCountsResponse.Server.Builder)super.clearOneof(var1);
         }

         public GetPlayerCountsResponse.Server.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (GetPlayerCountsResponse.Server.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public GetPlayerCountsResponse.Server.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (GetPlayerCountsResponse.Server.Builder)super.addRepeatedField(var1, var2);
         }

         public GetPlayerCountsResponse.Server.Builder mergeFrom(Message var1) {
            if (var1 instanceof GetPlayerCountsResponse.Server) {
               return this.mergeFrom((GetPlayerCountsResponse.Server)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public GetPlayerCountsResponse.Server.Builder mergeFrom(GetPlayerCountsResponse.Server var1) {
            if (var1 == GetPlayerCountsResponse.Server.getDefaultInstance()) {
               return this;
            }

            if (!var1.getServerId().isEmpty()) {
               this.serverId_ = var1.serverId_;
               this.bitField0_ |= 1;
               this.onChanged();
            }

            if (var1.status_ != 0) {
               this.setStatusValue(var1.getStatusValue());
            }

            if (var1.getOnlineCount() != 0) {
               this.setOnlineCount(var1.getOnlineCount());
            }

            if (var1.getMaxCount() != 0) {
               this.setMaxCount(var1.getMaxCount());
            }

            this.mergeUnknownFields(var1.getUnknownFields());
            this.onChanged();
            return this;
         }

         @Override
         public final boolean isInitialized() {
            return true;
         }

         public GetPlayerCountsResponse.Server.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                        this.serverId_ = var1.readStringRequireUtf8();
                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.status_ = var1.readEnum();
                        this.bitField0_ |= 2;
                        break;
                     case 24:
                        this.onlineCount_ = var1.readInt32();
                        this.bitField0_ |= 4;
                        break;
                     case 32:
                        this.maxCount_ = var1.readInt32();
                        this.bitField0_ |= 8;
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
         public String getServerId() {
            Object var1 = this.serverId_;
            if (!(var1 instanceof String)) {
               ByteString var2 = (ByteString)var1;
               String var3 = var2.toStringUtf8();
               this.serverId_ = var3;
               return var3;
            } else {
               return (String)var1;
            }
         }

         @Override
         public ByteString getServerIdBytes() {
            Object var1 = this.serverId_;
            if (var1 instanceof String) {
               ByteString var2 = ByteString.copyFromUtf8((String)var1);
               this.serverId_ = var2;
               return var2;
            } else {
               return (ByteString)var1;
            }
         }

         public GetPlayerCountsResponse.Server.Builder setServerId(String var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.serverId_ = var1;
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public GetPlayerCountsResponse.Server.Builder clearServerId() {
            this.serverId_ = GetPlayerCountsResponse.Server.getDefaultInstance().getServerId();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public GetPlayerCountsResponse.Server.Builder setServerIdBytes(ByteString var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            GetPlayerCountsResponse.Server.checkByteStringIsUtf8(var1);
            this.serverId_ = var1;
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         @Override
         public int getStatusValue() {
            return this.status_;
         }

         public GetPlayerCountsResponse.Server.Builder setStatusValue(int var1) {
            this.status_ = var1;
            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         @Override
         public GetPlayerCountsResponse.Server.Status getStatus() {
            GetPlayerCountsResponse.Server.Status var1 = GetPlayerCountsResponse.Server.Status.forNumber(this.status_);
            return var1 == null ? GetPlayerCountsResponse.Server.Status.UNRECOGNIZED : var1;
         }

         public GetPlayerCountsResponse.Server.Builder setStatus(GetPlayerCountsResponse.Server.Status var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.bitField0_ |= 2;
            this.status_ = var1.getNumber();
            this.onChanged();
            return this;
         }

         public GetPlayerCountsResponse.Server.Builder clearStatus() {
            this.bitField0_ &= -3;
            this.status_ = 0;
            this.onChanged();
            return this;
         }

         @Override
         public int getOnlineCount() {
            return this.onlineCount_;
         }

         public GetPlayerCountsResponse.Server.Builder setOnlineCount(int var1) {
            this.onlineCount_ = var1;
            this.bitField0_ |= 4;
            this.onChanged();
            return this;
         }

         public GetPlayerCountsResponse.Server.Builder clearOnlineCount() {
            this.bitField0_ &= -5;
            this.onlineCount_ = 0;
            this.onChanged();
            return this;
         }

         @Override
         public int getMaxCount() {
            return this.maxCount_;
         }

         public GetPlayerCountsResponse.Server.Builder setMaxCount(int var1) {
            this.maxCount_ = var1;
            this.bitField0_ |= 8;
            this.onChanged();
            return this;
         }

         public GetPlayerCountsResponse.Server.Builder clearMaxCount() {
            this.bitField0_ &= -9;
            this.maxCount_ = 0;
            this.onChanged();
            return this;
         }

         public final GetPlayerCountsResponse.Server.Builder setUnknownFields(UnknownFieldSet var1) {
            return (GetPlayerCountsResponse.Server.Builder)super.setUnknownFields(var1);
         }

         public final GetPlayerCountsResponse.Server.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (GetPlayerCountsResponse.Server.Builder)super.mergeUnknownFields(var1);
         }
      }

      public enum Status implements ProtocolMessageEnum {
         STATUS_UNSPECIFIED(0),
         STATUS_ONLINE(1),
         STATUS_OFFLINE(2),
         UNRECOGNIZED(-1);

         public static final int STATUS_UNSPECIFIED_VALUE = 0;
         public static final int STATUS_ONLINE_VALUE = 1;
         public static final int STATUS_OFFLINE_VALUE = 2;
         private static final Internal.EnumLiteMap<GetPlayerCountsResponse.Server.Status> internalValueMap = new Internal.EnumLiteMap<GetPlayerCountsResponse.Server.Status>() {
            public GetPlayerCountsResponse.Server.Status findValueByNumber(int var1) {
               return GetPlayerCountsResponse.Server.Status.forNumber(var1);
            }
         };
         private static final GetPlayerCountsResponse.Server.Status[] VALUES = values();
         private final int value;

         @Override
         public final int getNumber() {
            if (this == UNRECOGNIZED) {
               throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            } else {
               return this.value;
            }
         }

         @Deprecated
         public static GetPlayerCountsResponse.Server.Status valueOf(int var0) {
            return forNumber(var0);
         }

         public static GetPlayerCountsResponse.Server.Status forNumber(int var0) {
            switch (var0) {
               case 0:
                  return STATUS_UNSPECIFIED;
               case 1:
                  return STATUS_ONLINE;
               case 2:
                  return STATUS_OFFLINE;
               default:
                  return null;
            }
         }

         public static Internal.EnumLiteMap<GetPlayerCountsResponse.Server.Status> internalGetValueMap() {
            return internalValueMap;
         }

         @Override
         public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == UNRECOGNIZED) {
               throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            } else {
               return getDescriptor().getValues().get(this.ordinal());
            }
         }

         @Override
         public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
         }

         public static final Descriptors.EnumDescriptor getDescriptor() {
            return GetPlayerCountsResponse.Server.getDescriptor().getEnumTypes().get(0);
         }

         public static GetPlayerCountsResponse.Server.Status valueOf(Descriptors.EnumValueDescriptor var0) {
            if (var0.getType() != getDescriptor()) {
               throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            } else {
               return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
            }
         }

         Status(int var3) {
            this.value = var3;
         }
      }
   }

   public interface ServerOrBuilder extends MessageOrBuilder {
      String getServerId();

      ByteString getServerIdBytes();

      int getStatusValue();

      GetPlayerCountsResponse.Server.Status getStatus();

      int getOnlineCount();

      int getMaxCount();
   }
}
