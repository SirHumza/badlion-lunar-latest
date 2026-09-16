package com.lunarclient.websocket.server.v1;

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

public final class CheckServerRecommendationsResponse extends GeneratedMessageV3 implements CheckServerRecommendationsResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int RECOMMENDATIONS_FIELD_NUMBER = 1;
   private ServerRecommendations recommendations_;
   private byte memoizedIsInitialized = -1;
   private static final CheckServerRecommendationsResponse DEFAULT_INSTANCE = new CheckServerRecommendationsResponse();
   private static final Parser<CheckServerRecommendationsResponse> PARSER = new AbstractParser<CheckServerRecommendationsResponse>() {
      public CheckServerRecommendationsResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         CheckServerRecommendationsResponse.Builder var3 = CheckServerRecommendationsResponse.newBuilder();

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

   private CheckServerRecommendationsResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private CheckServerRecommendationsResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new CheckServerRecommendationsResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_server_v1_CheckServerRecommendationsResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_server_v1_CheckServerRecommendationsResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(CheckServerRecommendationsResponse.class, CheckServerRecommendationsResponse.Builder.class);
   }

   @Override
   public boolean hasRecommendations() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public ServerRecommendations getRecommendations() {
      return this.recommendations_ == null ? ServerRecommendations.getDefaultInstance() : this.recommendations_;
   }

   @Override
   public ServerRecommendationsOrBuilder getRecommendationsOrBuilder() {
      return this.recommendations_ == null ? ServerRecommendations.getDefaultInstance() : this.recommendations_;
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
         var1.writeMessage(1, this.getRecommendations());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getRecommendations());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof CheckServerRecommendationsResponse)) {
         return super.equals(var1);
      } else {
         CheckServerRecommendationsResponse var2 = (CheckServerRecommendationsResponse)var1;
         if (this.hasRecommendations() != var2.hasRecommendations()) {
            return false;
         } else {
            return this.hasRecommendations() && !this.getRecommendations().equals(var2.getRecommendations())
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
      if (this.hasRecommendations()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getRecommendations().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static CheckServerRecommendationsResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static CheckServerRecommendationsResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CheckServerRecommendationsResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static CheckServerRecommendationsResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CheckServerRecommendationsResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static CheckServerRecommendationsResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CheckServerRecommendationsResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CheckServerRecommendationsResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CheckServerRecommendationsResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CheckServerRecommendationsResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CheckServerRecommendationsResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CheckServerRecommendationsResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CheckServerRecommendationsResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CheckServerRecommendationsResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CheckServerRecommendationsResponse.Builder newBuilder(CheckServerRecommendationsResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CheckServerRecommendationsResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CheckServerRecommendationsResponse.Builder() : new CheckServerRecommendationsResponse.Builder().mergeFrom(this);
   }

   protected CheckServerRecommendationsResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new CheckServerRecommendationsResponse.Builder(var1);
   }

   public static CheckServerRecommendationsResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<CheckServerRecommendationsResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<CheckServerRecommendationsResponse> getParserForType() {
      return PARSER;
   }

   public CheckServerRecommendationsResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<CheckServerRecommendationsResponse.Builder>
      implements CheckServerRecommendationsResponseOrBuilder {
      private int bitField0_;
      private ServerRecommendations recommendations_;
      private SingleFieldBuilderV3<ServerRecommendations, ServerRecommendations.Builder, ServerRecommendationsOrBuilder> recommendationsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_server_v1_CheckServerRecommendationsResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_server_v1_CheckServerRecommendationsResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(CheckServerRecommendationsResponse.class, CheckServerRecommendationsResponse.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (CheckServerRecommendationsResponse.alwaysUseFieldBuilders) {
            this.getRecommendationsFieldBuilder();
         }
      }

      public CheckServerRecommendationsResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.recommendations_ = null;
         if (this.recommendationsBuilder_ != null) {
            this.recommendationsBuilder_.dispose();
            this.recommendationsBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_server_v1_CheckServerRecommendationsResponse_descriptor;
      }

      public CheckServerRecommendationsResponse getDefaultInstanceForType() {
         return CheckServerRecommendationsResponse.getDefaultInstance();
      }

      public CheckServerRecommendationsResponse build() {
         CheckServerRecommendationsResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CheckServerRecommendationsResponse buildPartial() {
         CheckServerRecommendationsResponse var1 = new CheckServerRecommendationsResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(CheckServerRecommendationsResponse var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.recommendations_ = this.recommendationsBuilder_ == null ? this.recommendations_ : this.recommendationsBuilder_.build();
            var3 |= 1;
         }

         CheckServerRecommendationsResponse var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public CheckServerRecommendationsResponse.Builder clone() {
         return (CheckServerRecommendationsResponse.Builder)super.clone();
      }

      public CheckServerRecommendationsResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CheckServerRecommendationsResponse.Builder)super.setField(var1, var2);
      }

      public CheckServerRecommendationsResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (CheckServerRecommendationsResponse.Builder)super.clearField(var1);
      }

      public CheckServerRecommendationsResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (CheckServerRecommendationsResponse.Builder)super.clearOneof(var1);
      }

      public CheckServerRecommendationsResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (CheckServerRecommendationsResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CheckServerRecommendationsResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CheckServerRecommendationsResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public CheckServerRecommendationsResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof CheckServerRecommendationsResponse) {
            return this.mergeFrom((CheckServerRecommendationsResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public CheckServerRecommendationsResponse.Builder mergeFrom(CheckServerRecommendationsResponse var1) {
         if (var1 == CheckServerRecommendationsResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.hasRecommendations()) {
            this.mergeRecommendations(var1.getRecommendations());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public CheckServerRecommendationsResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getRecommendationsFieldBuilder().getBuilder(), var2);
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
      public boolean hasRecommendations() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public ServerRecommendations getRecommendations() {
         if (this.recommendationsBuilder_ == null) {
            return this.recommendations_ == null ? ServerRecommendations.getDefaultInstance() : this.recommendations_;
         } else {
            return this.recommendationsBuilder_.getMessage();
         }
      }

      public CheckServerRecommendationsResponse.Builder setRecommendations(ServerRecommendations var1) {
         if (this.recommendationsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.recommendations_ = var1;
         } else {
            this.recommendationsBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public CheckServerRecommendationsResponse.Builder setRecommendations(ServerRecommendations.Builder var1) {
         if (this.recommendationsBuilder_ == null) {
            this.recommendations_ = var1.build();
         } else {
            this.recommendationsBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public CheckServerRecommendationsResponse.Builder mergeRecommendations(ServerRecommendations var1) {
         if (this.recommendationsBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.recommendations_ != null && this.recommendations_ != ServerRecommendations.getDefaultInstance()) {
               this.getRecommendationsBuilder().mergeFrom(var1);
            } else {
               this.recommendations_ = var1;
            }
         } else {
            this.recommendationsBuilder_.mergeFrom(var1);
         }

         if (this.recommendations_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public CheckServerRecommendationsResponse.Builder clearRecommendations() {
         this.bitField0_ &= -2;
         this.recommendations_ = null;
         if (this.recommendationsBuilder_ != null) {
            this.recommendationsBuilder_.dispose();
            this.recommendationsBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ServerRecommendations.Builder getRecommendationsBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getRecommendationsFieldBuilder().getBuilder();
      }

      @Override
      public ServerRecommendationsOrBuilder getRecommendationsOrBuilder() {
         if (this.recommendationsBuilder_ != null) {
            return this.recommendationsBuilder_.getMessageOrBuilder();
         } else {
            return this.recommendations_ == null ? ServerRecommendations.getDefaultInstance() : this.recommendations_;
         }
      }

      private SingleFieldBuilderV3<ServerRecommendations, ServerRecommendations.Builder, ServerRecommendationsOrBuilder> getRecommendationsFieldBuilder() {
         if (this.recommendationsBuilder_ == null) {
            this.recommendationsBuilder_ = new SingleFieldBuilderV3<>(this.getRecommendations(), this.getParentForChildren(), this.isClean());
            this.recommendations_ = null;
         }

         return this.recommendationsBuilder_;
      }

      public final CheckServerRecommendationsResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CheckServerRecommendationsResponse.Builder)super.setUnknownFields(var1);
      }

      public final CheckServerRecommendationsResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CheckServerRecommendationsResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
