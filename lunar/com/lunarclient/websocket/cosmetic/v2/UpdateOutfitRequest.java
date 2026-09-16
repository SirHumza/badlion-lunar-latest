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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UpdateOutfitRequest extends GeneratedMessageV3 implements UpdateOutfitRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int OUTFIT_FIELD_NUMBER = 1;
   private Outfit outfit_;
   private byte memoizedIsInitialized = -1;
   private static final UpdateOutfitRequest DEFAULT_INSTANCE = new UpdateOutfitRequest();
   private static final Parser<UpdateOutfitRequest> PARSER = new AbstractParser<UpdateOutfitRequest>() {
      public UpdateOutfitRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UpdateOutfitRequest.Builder var3 = UpdateOutfitRequest.newBuilder();

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

   private UpdateOutfitRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UpdateOutfitRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UpdateOutfitRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_UpdateOutfitRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_UpdateOutfitRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UpdateOutfitRequest.class, UpdateOutfitRequest.Builder.class);
   }

   @Override
   public boolean hasOutfit() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Outfit getOutfit() {
      return this.outfit_ == null ? Outfit.getDefaultInstance() : this.outfit_;
   }

   @Override
   public OutfitOrBuilder getOutfitOrBuilder() {
      return this.outfit_ == null ? Outfit.getDefaultInstance() : this.outfit_;
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
         var1.writeMessage(1, this.getOutfit());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getOutfit());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof UpdateOutfitRequest)) {
         return super.equals(var1);
      } else {
         UpdateOutfitRequest var2 = (UpdateOutfitRequest)var1;
         if (this.hasOutfit() != var2.hasOutfit()) {
            return false;
         } else {
            return this.hasOutfit() && !this.getOutfit().equals(var2.getOutfit()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasOutfit()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getOutfit().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UpdateOutfitRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateOutfitRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateOutfitRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateOutfitRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateOutfitRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateOutfitRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateOutfitRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateOutfitRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UpdateOutfitRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UpdateOutfitRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UpdateOutfitRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateOutfitRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UpdateOutfitRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UpdateOutfitRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UpdateOutfitRequest.Builder newBuilder(UpdateOutfitRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UpdateOutfitRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UpdateOutfitRequest.Builder() : new UpdateOutfitRequest.Builder().mergeFrom(this);
   }

   protected UpdateOutfitRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UpdateOutfitRequest.Builder(var1);
   }

   public static UpdateOutfitRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UpdateOutfitRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<UpdateOutfitRequest> getParserForType() {
      return PARSER;
   }

   public UpdateOutfitRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UpdateOutfitRequest.Builder> implements UpdateOutfitRequestOrBuilder {
      private int bitField0_;
      private Outfit outfit_;
      private SingleFieldBuilderV3<Outfit, Outfit.Builder, OutfitOrBuilder> outfitBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_UpdateOutfitRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_UpdateOutfitRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UpdateOutfitRequest.class, UpdateOutfitRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (UpdateOutfitRequest.alwaysUseFieldBuilders) {
            this.getOutfitFieldBuilder();
         }
      }

      public UpdateOutfitRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.outfit_ = null;
         if (this.outfitBuilder_ != null) {
            this.outfitBuilder_.dispose();
            this.outfitBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_UpdateOutfitRequest_descriptor;
      }

      public UpdateOutfitRequest getDefaultInstanceForType() {
         return UpdateOutfitRequest.getDefaultInstance();
      }

      public UpdateOutfitRequest build() {
         UpdateOutfitRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UpdateOutfitRequest buildPartial() {
         UpdateOutfitRequest var1 = new UpdateOutfitRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UpdateOutfitRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.outfit_ = this.outfitBuilder_ == null ? this.outfit_ : this.outfitBuilder_.build();
            var3 |= 1;
         }

         UpdateOutfitRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public UpdateOutfitRequest.Builder clone() {
         return (UpdateOutfitRequest.Builder)super.clone();
      }

      public UpdateOutfitRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateOutfitRequest.Builder)super.setField(var1, var2);
      }

      public UpdateOutfitRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UpdateOutfitRequest.Builder)super.clearField(var1);
      }

      public UpdateOutfitRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UpdateOutfitRequest.Builder)super.clearOneof(var1);
      }

      public UpdateOutfitRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UpdateOutfitRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UpdateOutfitRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateOutfitRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public UpdateOutfitRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof UpdateOutfitRequest) {
            return this.mergeFrom((UpdateOutfitRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UpdateOutfitRequest.Builder mergeFrom(UpdateOutfitRequest var1) {
         if (var1 == UpdateOutfitRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasOutfit()) {
            this.mergeOutfit(var1.getOutfit());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public UpdateOutfitRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getOutfitFieldBuilder().getBuilder(), var2);
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
      public boolean hasOutfit() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Outfit getOutfit() {
         if (this.outfitBuilder_ == null) {
            return this.outfit_ == null ? Outfit.getDefaultInstance() : this.outfit_;
         } else {
            return this.outfitBuilder_.getMessage();
         }
      }

      public UpdateOutfitRequest.Builder setOutfit(Outfit var1) {
         if (this.outfitBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.outfit_ = var1;
         } else {
            this.outfitBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdateOutfitRequest.Builder setOutfit(Outfit.Builder var1) {
         if (this.outfitBuilder_ == null) {
            this.outfit_ = var1.build();
         } else {
            this.outfitBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdateOutfitRequest.Builder mergeOutfit(Outfit var1) {
         if (this.outfitBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.outfit_ != null && this.outfit_ != Outfit.getDefaultInstance()) {
               this.getOutfitBuilder().mergeFrom(var1);
            } else {
               this.outfit_ = var1;
            }
         } else {
            this.outfitBuilder_.mergeFrom(var1);
         }

         if (this.outfit_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public UpdateOutfitRequest.Builder clearOutfit() {
         this.bitField0_ &= -2;
         this.outfit_ = null;
         if (this.outfitBuilder_ != null) {
            this.outfitBuilder_.dispose();
            this.outfitBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Outfit.Builder getOutfitBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getOutfitFieldBuilder().getBuilder();
      }

      @Override
      public OutfitOrBuilder getOutfitOrBuilder() {
         if (this.outfitBuilder_ != null) {
            return this.outfitBuilder_.getMessageOrBuilder();
         } else {
            return this.outfit_ == null ? Outfit.getDefaultInstance() : this.outfit_;
         }
      }

      private SingleFieldBuilderV3<Outfit, Outfit.Builder, OutfitOrBuilder> getOutfitFieldBuilder() {
         if (this.outfitBuilder_ == null) {
            this.outfitBuilder_ = new SingleFieldBuilderV3<>(this.getOutfit(), this.getParentForChildren(), this.isClean());
            this.outfit_ = null;
         }

         return this.outfitBuilder_;
      }

      public final UpdateOutfitRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UpdateOutfitRequest.Builder)super.setUnknownFields(var1);
      }

      public final UpdateOutfitRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UpdateOutfitRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
