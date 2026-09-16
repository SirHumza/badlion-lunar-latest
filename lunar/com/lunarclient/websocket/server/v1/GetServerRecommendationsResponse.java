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

public final class GetServerRecommendationsResponse extends GeneratedMessageV3 implements GetServerRecommendationsResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int RECOMMENDATIONS_FIELD_NUMBER = 1;
   private List<ServerRecommendations> recommendations_;
   private byte memoizedIsInitialized = -1;
   private static final GetServerRecommendationsResponse DEFAULT_INSTANCE = new GetServerRecommendationsResponse();
   private static final Parser<GetServerRecommendationsResponse> PARSER = new AbstractParser<GetServerRecommendationsResponse>() {
      public GetServerRecommendationsResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         GetServerRecommendationsResponse.Builder var3 = GetServerRecommendationsResponse.newBuilder();

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

   private GetServerRecommendationsResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private GetServerRecommendationsResponse() {
      this.recommendations_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new GetServerRecommendationsResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_server_v1_GetServerRecommendationsResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_server_v1_GetServerRecommendationsResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(GetServerRecommendationsResponse.class, GetServerRecommendationsResponse.Builder.class);
   }

   @Override
   public List<ServerRecommendations> getRecommendationsList() {
      return this.recommendations_;
   }

   @Override
   public List<? extends ServerRecommendationsOrBuilder> getRecommendationsOrBuilderList() {
      return this.recommendations_;
   }

   @Override
   public int getRecommendationsCount() {
      return this.recommendations_.size();
   }

   @Override
   public ServerRecommendations getRecommendations(int var1) {
      return this.recommendations_.get(var1);
   }

   @Override
   public ServerRecommendationsOrBuilder getRecommendationsOrBuilder(int var1) {
      return this.recommendations_.get(var1);
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
      for (int var2 = 0; var2 < this.recommendations_.size(); var2++) {
         var1.writeMessage(1, this.recommendations_.get(var2));
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

      for (int var2 = 0; var2 < this.recommendations_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.recommendations_.get(var2));
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

      if (!(var1 instanceof GetServerRecommendationsResponse)) {
         return super.equals(var1);
      }

      GetServerRecommendationsResponse var2 = (GetServerRecommendationsResponse)var1;
      return !this.getRecommendationsList().equals(var2.getRecommendationsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getRecommendationsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getRecommendationsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static GetServerRecommendationsResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static GetServerRecommendationsResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GetServerRecommendationsResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static GetServerRecommendationsResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GetServerRecommendationsResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static GetServerRecommendationsResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GetServerRecommendationsResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GetServerRecommendationsResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static GetServerRecommendationsResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static GetServerRecommendationsResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static GetServerRecommendationsResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GetServerRecommendationsResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public GetServerRecommendationsResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static GetServerRecommendationsResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static GetServerRecommendationsResponse.Builder newBuilder(GetServerRecommendationsResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public GetServerRecommendationsResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new GetServerRecommendationsResponse.Builder() : new GetServerRecommendationsResponse.Builder().mergeFrom(this);
   }

   protected GetServerRecommendationsResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new GetServerRecommendationsResponse.Builder(var1);
   }

   public static GetServerRecommendationsResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<GetServerRecommendationsResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<GetServerRecommendationsResponse> getParserForType() {
      return PARSER;
   }

   public GetServerRecommendationsResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<GetServerRecommendationsResponse.Builder>
      implements GetServerRecommendationsResponseOrBuilder {
      private int bitField0_;
      private List<ServerRecommendations> recommendations_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<ServerRecommendations, ServerRecommendations.Builder, ServerRecommendationsOrBuilder> recommendationsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_server_v1_GetServerRecommendationsResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_server_v1_GetServerRecommendationsResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(GetServerRecommendationsResponse.class, GetServerRecommendationsResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public GetServerRecommendationsResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.recommendationsBuilder_ == null) {
            this.recommendations_ = Collections.emptyList();
         } else {
            this.recommendations_ = null;
            this.recommendationsBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_server_v1_GetServerRecommendationsResponse_descriptor;
      }

      public GetServerRecommendationsResponse getDefaultInstanceForType() {
         return GetServerRecommendationsResponse.getDefaultInstance();
      }

      public GetServerRecommendationsResponse build() {
         GetServerRecommendationsResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public GetServerRecommendationsResponse buildPartial() {
         GetServerRecommendationsResponse var1 = new GetServerRecommendationsResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(GetServerRecommendationsResponse var1) {
         if (this.recommendationsBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.recommendations_ = Collections.unmodifiableList(this.recommendations_);
               this.bitField0_ &= -2;
            }

            var1.recommendations_ = this.recommendations_;
         } else {
            var1.recommendations_ = this.recommendationsBuilder_.build();
         }
      }

      private void buildPartial0(GetServerRecommendationsResponse var1) {
         int var2 = this.bitField0_;
      }

      public GetServerRecommendationsResponse.Builder clone() {
         return (GetServerRecommendationsResponse.Builder)super.clone();
      }

      public GetServerRecommendationsResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GetServerRecommendationsResponse.Builder)super.setField(var1, var2);
      }

      public GetServerRecommendationsResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (GetServerRecommendationsResponse.Builder)super.clearField(var1);
      }

      public GetServerRecommendationsResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (GetServerRecommendationsResponse.Builder)super.clearOneof(var1);
      }

      public GetServerRecommendationsResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (GetServerRecommendationsResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public GetServerRecommendationsResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GetServerRecommendationsResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public GetServerRecommendationsResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof GetServerRecommendationsResponse) {
            return this.mergeFrom((GetServerRecommendationsResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public GetServerRecommendationsResponse.Builder mergeFrom(GetServerRecommendationsResponse var1) {
         if (var1 == GetServerRecommendationsResponse.getDefaultInstance()) {
            return this;
         }

         if (this.recommendationsBuilder_ == null) {
            if (!var1.recommendations_.isEmpty()) {
               if (this.recommendations_.isEmpty()) {
                  this.recommendations_ = var1.recommendations_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureRecommendationsIsMutable();
                  this.recommendations_.addAll(var1.recommendations_);
               }

               this.onChanged();
            }
         } else if (!var1.recommendations_.isEmpty()) {
            if (this.recommendationsBuilder_.isEmpty()) {
               this.recommendationsBuilder_.dispose();
               this.recommendationsBuilder_ = null;
               this.recommendations_ = var1.recommendations_;
               this.bitField0_ &= -2;
               this.recommendationsBuilder_ = GetServerRecommendationsResponse.alwaysUseFieldBuilders ? this.getRecommendationsFieldBuilder() : null;
            } else {
               this.recommendationsBuilder_.addAllMessages(var1.recommendations_);
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

      public GetServerRecommendationsResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     ServerRecommendations var5 = var1.readMessage(ServerRecommendations.parser(), var2);
                     if (this.recommendationsBuilder_ == null) {
                        this.ensureRecommendationsIsMutable();
                        this.recommendations_.add(var5);
                     } else {
                        this.recommendationsBuilder_.addMessage(var5);
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

      private void ensureRecommendationsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.recommendations_ = new ArrayList<>(this.recommendations_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<ServerRecommendations> getRecommendationsList() {
         return this.recommendationsBuilder_ == null ? Collections.unmodifiableList(this.recommendations_) : this.recommendationsBuilder_.getMessageList();
      }

      @Override
      public int getRecommendationsCount() {
         return this.recommendationsBuilder_ == null ? this.recommendations_.size() : this.recommendationsBuilder_.getCount();
      }

      @Override
      public ServerRecommendations getRecommendations(int var1) {
         return this.recommendationsBuilder_ == null ? this.recommendations_.get(var1) : this.recommendationsBuilder_.getMessage(var1);
      }

      public GetServerRecommendationsResponse.Builder setRecommendations(int var1, ServerRecommendations var2) {
         if (this.recommendationsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureRecommendationsIsMutable();
            this.recommendations_.set(var1, var2);
            this.onChanged();
         } else {
            this.recommendationsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public GetServerRecommendationsResponse.Builder setRecommendations(int var1, ServerRecommendations.Builder var2) {
         if (this.recommendationsBuilder_ == null) {
            this.ensureRecommendationsIsMutable();
            this.recommendations_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.recommendationsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public GetServerRecommendationsResponse.Builder addRecommendations(ServerRecommendations var1) {
         if (this.recommendationsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureRecommendationsIsMutable();
            this.recommendations_.add(var1);
            this.onChanged();
         } else {
            this.recommendationsBuilder_.addMessage(var1);
         }

         return this;
      }

      public GetServerRecommendationsResponse.Builder addRecommendations(int var1, ServerRecommendations var2) {
         if (this.recommendationsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureRecommendationsIsMutable();
            this.recommendations_.add(var1, var2);
            this.onChanged();
         } else {
            this.recommendationsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public GetServerRecommendationsResponse.Builder addRecommendations(ServerRecommendations.Builder var1) {
         if (this.recommendationsBuilder_ == null) {
            this.ensureRecommendationsIsMutable();
            this.recommendations_.add(var1.build());
            this.onChanged();
         } else {
            this.recommendationsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public GetServerRecommendationsResponse.Builder addRecommendations(int var1, ServerRecommendations.Builder var2) {
         if (this.recommendationsBuilder_ == null) {
            this.ensureRecommendationsIsMutable();
            this.recommendations_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.recommendationsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public GetServerRecommendationsResponse.Builder addAllRecommendations(Iterable<? extends ServerRecommendations> var1) {
         if (this.recommendationsBuilder_ == null) {
            this.ensureRecommendationsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.recommendations_);
            this.onChanged();
         } else {
            this.recommendationsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public GetServerRecommendationsResponse.Builder clearRecommendations() {
         if (this.recommendationsBuilder_ == null) {
            this.recommendations_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.recommendationsBuilder_.clear();
         }

         return this;
      }

      public GetServerRecommendationsResponse.Builder removeRecommendations(int var1) {
         if (this.recommendationsBuilder_ == null) {
            this.ensureRecommendationsIsMutable();
            this.recommendations_.remove(var1);
            this.onChanged();
         } else {
            this.recommendationsBuilder_.remove(var1);
         }

         return this;
      }

      public ServerRecommendations.Builder getRecommendationsBuilder(int var1) {
         return this.getRecommendationsFieldBuilder().getBuilder(var1);
      }

      @Override
      public ServerRecommendationsOrBuilder getRecommendationsOrBuilder(int var1) {
         return this.recommendationsBuilder_ == null ? this.recommendations_.get(var1) : this.recommendationsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ServerRecommendationsOrBuilder> getRecommendationsOrBuilderList() {
         return this.recommendationsBuilder_ != null
            ? this.recommendationsBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.recommendations_);
      }

      public ServerRecommendations.Builder addRecommendationsBuilder() {
         return this.getRecommendationsFieldBuilder().addBuilder(ServerRecommendations.getDefaultInstance());
      }

      public ServerRecommendations.Builder addRecommendationsBuilder(int var1) {
         return this.getRecommendationsFieldBuilder().addBuilder(var1, ServerRecommendations.getDefaultInstance());
      }

      public List<ServerRecommendations.Builder> getRecommendationsBuilderList() {
         return this.getRecommendationsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<ServerRecommendations, ServerRecommendations.Builder, ServerRecommendationsOrBuilder> getRecommendationsFieldBuilder() {
         if (this.recommendationsBuilder_ == null) {
            this.recommendationsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.recommendations_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean()
            );
            this.recommendations_ = null;
         }

         return this.recommendationsBuilder_;
      }

      public final GetServerRecommendationsResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (GetServerRecommendationsResponse.Builder)super.setUnknownFields(var1);
      }

      public final GetServerRecommendationsResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (GetServerRecommendationsResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
