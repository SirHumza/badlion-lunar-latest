package com.lunarclient.websocket.serverdiscovery.v1;

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

public final class LoadServerModalResponse extends GeneratedMessageV3 implements LoadServerModalResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int DETAILS_FIELD_NUMBER = 1;
   private ServerModalDetails details_;
   private byte memoizedIsInitialized = -1;
   private static final LoadServerModalResponse DEFAULT_INSTANCE = new LoadServerModalResponse();
   private static final Parser<LoadServerModalResponse> PARSER = new AbstractParser<LoadServerModalResponse>() {
      public LoadServerModalResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LoadServerModalResponse.Builder var3 = LoadServerModalResponse.newBuilder();

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

   private LoadServerModalResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LoadServerModalResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LoadServerModalResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_LoadServerModalResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_LoadServerModalResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LoadServerModalResponse.class, LoadServerModalResponse.Builder.class);
   }

   @Override
   public boolean hasDetails() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public ServerModalDetails getDetails() {
      return this.details_ == null ? ServerModalDetails.getDefaultInstance() : this.details_;
   }

   @Override
   public ServerModalDetailsOrBuilder getDetailsOrBuilder() {
      return this.details_ == null ? ServerModalDetails.getDefaultInstance() : this.details_;
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
         var1.writeMessage(1, this.getDetails());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getDetails());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LoadServerModalResponse)) {
         return super.equals(var1);
      } else {
         LoadServerModalResponse var2 = (LoadServerModalResponse)var1;
         if (this.hasDetails() != var2.hasDetails()) {
            return false;
         } else {
            return this.hasDetails() && !this.getDetails().equals(var2.getDetails()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasDetails()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getDetails().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LoadServerModalResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadServerModalResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadServerModalResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadServerModalResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadServerModalResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadServerModalResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadServerModalResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoadServerModalResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LoadServerModalResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LoadServerModalResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LoadServerModalResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoadServerModalResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LoadServerModalResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LoadServerModalResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LoadServerModalResponse.Builder newBuilder(LoadServerModalResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LoadServerModalResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LoadServerModalResponse.Builder() : new LoadServerModalResponse.Builder().mergeFrom(this);
   }

   protected LoadServerModalResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LoadServerModalResponse.Builder(var1);
   }

   public static LoadServerModalResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LoadServerModalResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<LoadServerModalResponse> getParserForType() {
      return PARSER;
   }

   public LoadServerModalResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LoadServerModalResponse.Builder> implements LoadServerModalResponseOrBuilder {
      private int bitField0_;
      private ServerModalDetails details_;
      private SingleFieldBuilderV3<ServerModalDetails, ServerModalDetails.Builder, ServerModalDetailsOrBuilder> detailsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_LoadServerModalResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_LoadServerModalResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LoadServerModalResponse.class, LoadServerModalResponse.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (LoadServerModalResponse.alwaysUseFieldBuilders) {
            this.getDetailsFieldBuilder();
         }
      }

      public LoadServerModalResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.details_ = null;
         if (this.detailsBuilder_ != null) {
            this.detailsBuilder_.dispose();
            this.detailsBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_LoadServerModalResponse_descriptor;
      }

      public LoadServerModalResponse getDefaultInstanceForType() {
         return LoadServerModalResponse.getDefaultInstance();
      }

      public LoadServerModalResponse build() {
         LoadServerModalResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LoadServerModalResponse buildPartial() {
         LoadServerModalResponse var1 = new LoadServerModalResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(LoadServerModalResponse var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.details_ = this.detailsBuilder_ == null ? this.details_ : this.detailsBuilder_.build();
            var3 |= 1;
         }

         LoadServerModalResponse var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public LoadServerModalResponse.Builder clone() {
         return (LoadServerModalResponse.Builder)super.clone();
      }

      public LoadServerModalResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoadServerModalResponse.Builder)super.setField(var1, var2);
      }

      public LoadServerModalResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LoadServerModalResponse.Builder)super.clearField(var1);
      }

      public LoadServerModalResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LoadServerModalResponse.Builder)super.clearOneof(var1);
      }

      public LoadServerModalResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LoadServerModalResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LoadServerModalResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoadServerModalResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public LoadServerModalResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof LoadServerModalResponse) {
            return this.mergeFrom((LoadServerModalResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LoadServerModalResponse.Builder mergeFrom(LoadServerModalResponse var1) {
         if (var1 == LoadServerModalResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.hasDetails()) {
            this.mergeDetails(var1.getDetails());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public LoadServerModalResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getDetailsFieldBuilder().getBuilder(), var2);
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
      public boolean hasDetails() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public ServerModalDetails getDetails() {
         if (this.detailsBuilder_ == null) {
            return this.details_ == null ? ServerModalDetails.getDefaultInstance() : this.details_;
         } else {
            return this.detailsBuilder_.getMessage();
         }
      }

      public LoadServerModalResponse.Builder setDetails(ServerModalDetails var1) {
         if (this.detailsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.details_ = var1;
         } else {
            this.detailsBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LoadServerModalResponse.Builder setDetails(ServerModalDetails.Builder var1) {
         if (this.detailsBuilder_ == null) {
            this.details_ = var1.build();
         } else {
            this.detailsBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LoadServerModalResponse.Builder mergeDetails(ServerModalDetails var1) {
         if (this.detailsBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.details_ != null && this.details_ != ServerModalDetails.getDefaultInstance()) {
               this.getDetailsBuilder().mergeFrom(var1);
            } else {
               this.details_ = var1;
            }
         } else {
            this.detailsBuilder_.mergeFrom(var1);
         }

         if (this.details_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public LoadServerModalResponse.Builder clearDetails() {
         this.bitField0_ &= -2;
         this.details_ = null;
         if (this.detailsBuilder_ != null) {
            this.detailsBuilder_.dispose();
            this.detailsBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder getDetailsBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getDetailsFieldBuilder().getBuilder();
      }

      @Override
      public ServerModalDetailsOrBuilder getDetailsOrBuilder() {
         if (this.detailsBuilder_ != null) {
            return this.detailsBuilder_.getMessageOrBuilder();
         } else {
            return this.details_ == null ? ServerModalDetails.getDefaultInstance() : this.details_;
         }
      }

      private SingleFieldBuilderV3<ServerModalDetails, ServerModalDetails.Builder, ServerModalDetailsOrBuilder> getDetailsFieldBuilder() {
         if (this.detailsBuilder_ == null) {
            this.detailsBuilder_ = new SingleFieldBuilderV3<>(this.getDetails(), this.getParentForChildren(), this.isClean());
            this.details_ = null;
         }

         return this.detailsBuilder_;
      }

      public final LoadServerModalResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LoadServerModalResponse.Builder)super.setUnknownFields(var1);
      }

      public final LoadServerModalResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LoadServerModalResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
