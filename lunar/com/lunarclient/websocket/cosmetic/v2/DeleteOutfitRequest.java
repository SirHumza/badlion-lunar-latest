package com.lunarclient.websocket.cosmetic.v2;

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
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DeleteOutfitRequest extends GeneratedMessageV3 implements DeleteOutfitRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int OUTFIT_ID_FIELD_NUMBER = 1;
   private Uuid outfitId_;
   private byte memoizedIsInitialized = -1;
   private static final DeleteOutfitRequest DEFAULT_INSTANCE = new DeleteOutfitRequest();
   private static final Parser<DeleteOutfitRequest> PARSER = new AbstractParser<DeleteOutfitRequest>() {
      public DeleteOutfitRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DeleteOutfitRequest.Builder var3 = DeleteOutfitRequest.newBuilder();

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

   private DeleteOutfitRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DeleteOutfitRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DeleteOutfitRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_DeleteOutfitRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_DeleteOutfitRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DeleteOutfitRequest.class, DeleteOutfitRequest.Builder.class);
   }

   @Override
   public boolean hasOutfitId() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getOutfitId() {
      return this.outfitId_ == null ? Uuid.getDefaultInstance() : this.outfitId_;
   }

   @Override
   public UuidOrBuilder getOutfitIdOrBuilder() {
      return this.outfitId_ == null ? Uuid.getDefaultInstance() : this.outfitId_;
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
         var1.writeMessage(1, this.getOutfitId());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getOutfitId());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof DeleteOutfitRequest)) {
         return super.equals(var1);
      } else {
         DeleteOutfitRequest var2 = (DeleteOutfitRequest)var1;
         if (this.hasOutfitId() != var2.hasOutfitId()) {
            return false;
         } else {
            return this.hasOutfitId() && !this.getOutfitId().equals(var2.getOutfitId()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasOutfitId()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getOutfitId().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DeleteOutfitRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DeleteOutfitRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DeleteOutfitRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DeleteOutfitRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DeleteOutfitRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DeleteOutfitRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DeleteOutfitRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DeleteOutfitRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DeleteOutfitRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DeleteOutfitRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DeleteOutfitRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DeleteOutfitRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DeleteOutfitRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DeleteOutfitRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DeleteOutfitRequest.Builder newBuilder(DeleteOutfitRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DeleteOutfitRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DeleteOutfitRequest.Builder() : new DeleteOutfitRequest.Builder().mergeFrom(this);
   }

   protected DeleteOutfitRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DeleteOutfitRequest.Builder(var1);
   }

   public static DeleteOutfitRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DeleteOutfitRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<DeleteOutfitRequest> getParserForType() {
      return PARSER;
   }

   public DeleteOutfitRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<DeleteOutfitRequest.Builder> implements DeleteOutfitRequestOrBuilder {
      private int bitField0_;
      private Uuid outfitId_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> outfitIdBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_DeleteOutfitRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_DeleteOutfitRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DeleteOutfitRequest.class, DeleteOutfitRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (DeleteOutfitRequest.alwaysUseFieldBuilders) {
            this.getOutfitIdFieldBuilder();
         }
      }

      public DeleteOutfitRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.outfitId_ = null;
         if (this.outfitIdBuilder_ != null) {
            this.outfitIdBuilder_.dispose();
            this.outfitIdBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_DeleteOutfitRequest_descriptor;
      }

      public DeleteOutfitRequest getDefaultInstanceForType() {
         return DeleteOutfitRequest.getDefaultInstance();
      }

      public DeleteOutfitRequest build() {
         DeleteOutfitRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DeleteOutfitRequest buildPartial() {
         DeleteOutfitRequest var1 = new DeleteOutfitRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(DeleteOutfitRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.outfitId_ = this.outfitIdBuilder_ == null ? this.outfitId_ : this.outfitIdBuilder_.build();
            var3 |= 1;
         }

         DeleteOutfitRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public DeleteOutfitRequest.Builder clone() {
         return (DeleteOutfitRequest.Builder)super.clone();
      }

      public DeleteOutfitRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DeleteOutfitRequest.Builder)super.setField(var1, var2);
      }

      public DeleteOutfitRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DeleteOutfitRequest.Builder)super.clearField(var1);
      }

      public DeleteOutfitRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DeleteOutfitRequest.Builder)super.clearOneof(var1);
      }

      public DeleteOutfitRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DeleteOutfitRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DeleteOutfitRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DeleteOutfitRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public DeleteOutfitRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof DeleteOutfitRequest) {
            return this.mergeFrom((DeleteOutfitRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DeleteOutfitRequest.Builder mergeFrom(DeleteOutfitRequest var1) {
         if (var1 == DeleteOutfitRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasOutfitId()) {
            this.mergeOutfitId(var1.getOutfitId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public DeleteOutfitRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getOutfitIdFieldBuilder().getBuilder(), var2);
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
      public boolean hasOutfitId() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getOutfitId() {
         if (this.outfitIdBuilder_ == null) {
            return this.outfitId_ == null ? Uuid.getDefaultInstance() : this.outfitId_;
         } else {
            return this.outfitIdBuilder_.getMessage();
         }
      }

      public DeleteOutfitRequest.Builder setOutfitId(Uuid var1) {
         if (this.outfitIdBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.outfitId_ = var1;
         } else {
            this.outfitIdBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public DeleteOutfitRequest.Builder setOutfitId(Uuid.Builder var1) {
         if (this.outfitIdBuilder_ == null) {
            this.outfitId_ = var1.build();
         } else {
            this.outfitIdBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public DeleteOutfitRequest.Builder mergeOutfitId(Uuid var1) {
         if (this.outfitIdBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.outfitId_ != null && this.outfitId_ != Uuid.getDefaultInstance()) {
               this.getOutfitIdBuilder().mergeFrom(var1);
            } else {
               this.outfitId_ = var1;
            }
         } else {
            this.outfitIdBuilder_.mergeFrom(var1);
         }

         if (this.outfitId_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public DeleteOutfitRequest.Builder clearOutfitId() {
         this.bitField0_ &= -2;
         this.outfitId_ = null;
         if (this.outfitIdBuilder_ != null) {
            this.outfitIdBuilder_.dispose();
            this.outfitIdBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getOutfitIdBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getOutfitIdFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getOutfitIdOrBuilder() {
         if (this.outfitIdBuilder_ != null) {
            return this.outfitIdBuilder_.getMessageOrBuilder();
         } else {
            return this.outfitId_ == null ? Uuid.getDefaultInstance() : this.outfitId_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getOutfitIdFieldBuilder() {
         if (this.outfitIdBuilder_ == null) {
            this.outfitIdBuilder_ = new SingleFieldBuilderV3<>(this.getOutfitId(), this.getParentForChildren(), this.isClean());
            this.outfitId_ = null;
         }

         return this.outfitIdBuilder_;
      }

      public final DeleteOutfitRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DeleteOutfitRequest.Builder)super.setUnknownFields(var1);
      }

      public final DeleteOutfitRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DeleteOutfitRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
