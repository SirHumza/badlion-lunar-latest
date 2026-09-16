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

public final class SelectOutfitRequest extends GeneratedMessageV3 implements SelectOutfitRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int OUTFIT_TREE_FIELD_NUMBER = 1;
   private OutfitTree outfitTree_;
   private byte memoizedIsInitialized = -1;
   private static final SelectOutfitRequest DEFAULT_INSTANCE = new SelectOutfitRequest();
   private static final Parser<SelectOutfitRequest> PARSER = new AbstractParser<SelectOutfitRequest>() {
      public SelectOutfitRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SelectOutfitRequest.Builder var3 = SelectOutfitRequest.newBuilder();

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

   private SelectOutfitRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SelectOutfitRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SelectOutfitRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_SelectOutfitRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_SelectOutfitRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SelectOutfitRequest.class, SelectOutfitRequest.Builder.class);
   }

   @Override
   public boolean hasOutfitTree() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public OutfitTree getOutfitTree() {
      return this.outfitTree_ == null ? OutfitTree.getDefaultInstance() : this.outfitTree_;
   }

   @Override
   public OutfitTreeOrBuilder getOutfitTreeOrBuilder() {
      return this.outfitTree_ == null ? OutfitTree.getDefaultInstance() : this.outfitTree_;
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
         var1.writeMessage(1, this.getOutfitTree());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getOutfitTree());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SelectOutfitRequest)) {
         return super.equals(var1);
      } else {
         SelectOutfitRequest var2 = (SelectOutfitRequest)var1;
         if (this.hasOutfitTree() != var2.hasOutfitTree()) {
            return false;
         } else {
            return this.hasOutfitTree() && !this.getOutfitTree().equals(var2.getOutfitTree()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasOutfitTree()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getOutfitTree().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SelectOutfitRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SelectOutfitRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SelectOutfitRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SelectOutfitRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SelectOutfitRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SelectOutfitRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SelectOutfitRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SelectOutfitRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SelectOutfitRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SelectOutfitRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SelectOutfitRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SelectOutfitRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SelectOutfitRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SelectOutfitRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SelectOutfitRequest.Builder newBuilder(SelectOutfitRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SelectOutfitRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SelectOutfitRequest.Builder() : new SelectOutfitRequest.Builder().mergeFrom(this);
   }

   protected SelectOutfitRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SelectOutfitRequest.Builder(var1);
   }

   public static SelectOutfitRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SelectOutfitRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<SelectOutfitRequest> getParserForType() {
      return PARSER;
   }

   public SelectOutfitRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SelectOutfitRequest.Builder> implements SelectOutfitRequestOrBuilder {
      private int bitField0_;
      private OutfitTree outfitTree_;
      private SingleFieldBuilderV3<OutfitTree, OutfitTree.Builder, OutfitTreeOrBuilder> outfitTreeBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_SelectOutfitRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_SelectOutfitRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SelectOutfitRequest.class, SelectOutfitRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (SelectOutfitRequest.alwaysUseFieldBuilders) {
            this.getOutfitTreeFieldBuilder();
         }
      }

      public SelectOutfitRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.outfitTree_ = null;
         if (this.outfitTreeBuilder_ != null) {
            this.outfitTreeBuilder_.dispose();
            this.outfitTreeBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_SelectOutfitRequest_descriptor;
      }

      public SelectOutfitRequest getDefaultInstanceForType() {
         return SelectOutfitRequest.getDefaultInstance();
      }

      public SelectOutfitRequest build() {
         SelectOutfitRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SelectOutfitRequest buildPartial() {
         SelectOutfitRequest var1 = new SelectOutfitRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SelectOutfitRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.outfitTree_ = this.outfitTreeBuilder_ == null ? this.outfitTree_ : this.outfitTreeBuilder_.build();
            var3 |= 1;
         }

         SelectOutfitRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public SelectOutfitRequest.Builder clone() {
         return (SelectOutfitRequest.Builder)super.clone();
      }

      public SelectOutfitRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SelectOutfitRequest.Builder)super.setField(var1, var2);
      }

      public SelectOutfitRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SelectOutfitRequest.Builder)super.clearField(var1);
      }

      public SelectOutfitRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SelectOutfitRequest.Builder)super.clearOneof(var1);
      }

      public SelectOutfitRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SelectOutfitRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SelectOutfitRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SelectOutfitRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public SelectOutfitRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof SelectOutfitRequest) {
            return this.mergeFrom((SelectOutfitRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SelectOutfitRequest.Builder mergeFrom(SelectOutfitRequest var1) {
         if (var1 == SelectOutfitRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasOutfitTree()) {
            this.mergeOutfitTree(var1.getOutfitTree());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public SelectOutfitRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getOutfitTreeFieldBuilder().getBuilder(), var2);
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
      public boolean hasOutfitTree() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public OutfitTree getOutfitTree() {
         if (this.outfitTreeBuilder_ == null) {
            return this.outfitTree_ == null ? OutfitTree.getDefaultInstance() : this.outfitTree_;
         } else {
            return this.outfitTreeBuilder_.getMessage();
         }
      }

      public SelectOutfitRequest.Builder setOutfitTree(OutfitTree var1) {
         if (this.outfitTreeBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.outfitTree_ = var1;
         } else {
            this.outfitTreeBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SelectOutfitRequest.Builder setOutfitTree(OutfitTree.Builder var1) {
         if (this.outfitTreeBuilder_ == null) {
            this.outfitTree_ = var1.build();
         } else {
            this.outfitTreeBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SelectOutfitRequest.Builder mergeOutfitTree(OutfitTree var1) {
         if (this.outfitTreeBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.outfitTree_ != null && this.outfitTree_ != OutfitTree.getDefaultInstance()) {
               this.getOutfitTreeBuilder().mergeFrom(var1);
            } else {
               this.outfitTree_ = var1;
            }
         } else {
            this.outfitTreeBuilder_.mergeFrom(var1);
         }

         if (this.outfitTree_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public SelectOutfitRequest.Builder clearOutfitTree() {
         this.bitField0_ &= -2;
         this.outfitTree_ = null;
         if (this.outfitTreeBuilder_ != null) {
            this.outfitTreeBuilder_.dispose();
            this.outfitTreeBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public OutfitTree.Builder getOutfitTreeBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getOutfitTreeFieldBuilder().getBuilder();
      }

      @Override
      public OutfitTreeOrBuilder getOutfitTreeOrBuilder() {
         if (this.outfitTreeBuilder_ != null) {
            return this.outfitTreeBuilder_.getMessageOrBuilder();
         } else {
            return this.outfitTree_ == null ? OutfitTree.getDefaultInstance() : this.outfitTree_;
         }
      }

      private SingleFieldBuilderV3<OutfitTree, OutfitTree.Builder, OutfitTreeOrBuilder> getOutfitTreeFieldBuilder() {
         if (this.outfitTreeBuilder_ == null) {
            this.outfitTreeBuilder_ = new SingleFieldBuilderV3<>(this.getOutfitTree(), this.getParentForChildren(), this.isClean());
            this.outfitTree_ = null;
         }

         return this.outfitTreeBuilder_;
      }

      public final SelectOutfitRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SelectOutfitRequest.Builder)super.setUnknownFields(var1);
      }

      public final SelectOutfitRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SelectOutfitRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
