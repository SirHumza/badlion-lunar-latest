package com.lunarclient.websocket.serverdiscovery.v1;

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

public final class SearchServersResponse extends GeneratedMessageV3 implements SearchServersResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SERVERS_FIELD_NUMBER = 1;
   private List<ServerCard> servers_;
   private byte memoizedIsInitialized = -1;
   private static final SearchServersResponse DEFAULT_INSTANCE = new SearchServersResponse();
   private static final Parser<SearchServersResponse> PARSER = new AbstractParser<SearchServersResponse>() {
      public SearchServersResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SearchServersResponse.Builder var3 = SearchServersResponse.newBuilder();

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

   private SearchServersResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SearchServersResponse() {
      this.servers_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SearchServersResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_SearchServersResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_SearchServersResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SearchServersResponse.class, SearchServersResponse.Builder.class);
   }

   @Override
   public List<ServerCard> getServersList() {
      return this.servers_;
   }

   @Override
   public List<? extends ServerCardOrBuilder> getServersOrBuilderList() {
      return this.servers_;
   }

   @Override
   public int getServersCount() {
      return this.servers_.size();
   }

   @Override
   public ServerCard getServers(int var1) {
      return this.servers_.get(var1);
   }

   @Override
   public ServerCardOrBuilder getServersOrBuilder(int var1) {
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

      if (!(var1 instanceof SearchServersResponse)) {
         return super.equals(var1);
      }

      SearchServersResponse var2 = (SearchServersResponse)var1;
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

   public static SearchServersResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SearchServersResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SearchServersResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SearchServersResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SearchServersResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SearchServersResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SearchServersResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SearchServersResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SearchServersResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SearchServersResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SearchServersResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SearchServersResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SearchServersResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SearchServersResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SearchServersResponse.Builder newBuilder(SearchServersResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SearchServersResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SearchServersResponse.Builder() : new SearchServersResponse.Builder().mergeFrom(this);
   }

   protected SearchServersResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SearchServersResponse.Builder(var1);
   }

   public static SearchServersResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SearchServersResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<SearchServersResponse> getParserForType() {
      return PARSER;
   }

   public SearchServersResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SearchServersResponse.Builder> implements SearchServersResponseOrBuilder {
      private int bitField0_;
      private List<ServerCard> servers_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<ServerCard, ServerCard.Builder, ServerCardOrBuilder> serversBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_SearchServersResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_SearchServersResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SearchServersResponse.class, SearchServersResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SearchServersResponse.Builder clear() {
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
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_SearchServersResponse_descriptor;
      }

      public SearchServersResponse getDefaultInstanceForType() {
         return SearchServersResponse.getDefaultInstance();
      }

      public SearchServersResponse build() {
         SearchServersResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SearchServersResponse buildPartial() {
         SearchServersResponse var1 = new SearchServersResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(SearchServersResponse var1) {
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

      private void buildPartial0(SearchServersResponse var1) {
         int var2 = this.bitField0_;
      }

      public SearchServersResponse.Builder clone() {
         return (SearchServersResponse.Builder)super.clone();
      }

      public SearchServersResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SearchServersResponse.Builder)super.setField(var1, var2);
      }

      public SearchServersResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SearchServersResponse.Builder)super.clearField(var1);
      }

      public SearchServersResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SearchServersResponse.Builder)super.clearOneof(var1);
      }

      public SearchServersResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SearchServersResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SearchServersResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SearchServersResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public SearchServersResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof SearchServersResponse) {
            return this.mergeFrom((SearchServersResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SearchServersResponse.Builder mergeFrom(SearchServersResponse var1) {
         if (var1 == SearchServersResponse.getDefaultInstance()) {
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
               this.serversBuilder_ = SearchServersResponse.alwaysUseFieldBuilders ? this.getServersFieldBuilder() : null;
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

      public SearchServersResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     ServerCard var5 = var1.readMessage(ServerCard.parser(), var2);
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
      public List<ServerCard> getServersList() {
         return this.serversBuilder_ == null ? Collections.unmodifiableList(this.servers_) : this.serversBuilder_.getMessageList();
      }

      @Override
      public int getServersCount() {
         return this.serversBuilder_ == null ? this.servers_.size() : this.serversBuilder_.getCount();
      }

      @Override
      public ServerCard getServers(int var1) {
         return this.serversBuilder_ == null ? this.servers_.get(var1) : this.serversBuilder_.getMessage(var1);
      }

      public SearchServersResponse.Builder setServers(int var1, ServerCard var2) {
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

      public SearchServersResponse.Builder setServers(int var1, ServerCard.Builder var2) {
         if (this.serversBuilder_ == null) {
            this.ensureServersIsMutable();
            this.servers_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.serversBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public SearchServersResponse.Builder addServers(ServerCard var1) {
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

      public SearchServersResponse.Builder addServers(int var1, ServerCard var2) {
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

      public SearchServersResponse.Builder addServers(ServerCard.Builder var1) {
         if (this.serversBuilder_ == null) {
            this.ensureServersIsMutable();
            this.servers_.add(var1.build());
            this.onChanged();
         } else {
            this.serversBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public SearchServersResponse.Builder addServers(int var1, ServerCard.Builder var2) {
         if (this.serversBuilder_ == null) {
            this.ensureServersIsMutable();
            this.servers_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.serversBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public SearchServersResponse.Builder addAllServers(Iterable<? extends ServerCard> var1) {
         if (this.serversBuilder_ == null) {
            this.ensureServersIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.servers_);
            this.onChanged();
         } else {
            this.serversBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public SearchServersResponse.Builder clearServers() {
         if (this.serversBuilder_ == null) {
            this.servers_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.serversBuilder_.clear();
         }

         return this;
      }

      public SearchServersResponse.Builder removeServers(int var1) {
         if (this.serversBuilder_ == null) {
            this.ensureServersIsMutable();
            this.servers_.remove(var1);
            this.onChanged();
         } else {
            this.serversBuilder_.remove(var1);
         }

         return this;
      }

      public ServerCard.Builder getServersBuilder(int var1) {
         return this.getServersFieldBuilder().getBuilder(var1);
      }

      @Override
      public ServerCardOrBuilder getServersOrBuilder(int var1) {
         return this.serversBuilder_ == null ? this.servers_.get(var1) : this.serversBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ServerCardOrBuilder> getServersOrBuilderList() {
         return this.serversBuilder_ != null ? this.serversBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.servers_);
      }

      public ServerCard.Builder addServersBuilder() {
         return this.getServersFieldBuilder().addBuilder(ServerCard.getDefaultInstance());
      }

      public ServerCard.Builder addServersBuilder(int var1) {
         return this.getServersFieldBuilder().addBuilder(var1, ServerCard.getDefaultInstance());
      }

      public List<ServerCard.Builder> getServersBuilderList() {
         return this.getServersFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<ServerCard, ServerCard.Builder, ServerCardOrBuilder> getServersFieldBuilder() {
         if (this.serversBuilder_ == null) {
            this.serversBuilder_ = new RepeatedFieldBuilderV3<>(this.servers_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.servers_ = null;
         }

         return this.serversBuilder_;
      }

      public final SearchServersResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SearchServersResponse.Builder)super.setUnknownFields(var1);
      }

      public final SearchServersResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SearchServersResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
