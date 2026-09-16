package com.lunarclient.websocket.skyblock.v1;

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

public final class BroadcastDungeonUpdateRequest extends GeneratedMessageV3 implements BroadcastDungeonUpdateRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int UPDATE_FIELD_NUMBER = 1;
   private DungeonUpdate update_;
   private byte memoizedIsInitialized = -1;
   private static final BroadcastDungeonUpdateRequest DEFAULT_INSTANCE = new BroadcastDungeonUpdateRequest();
   private static final Parser<BroadcastDungeonUpdateRequest> PARSER = new AbstractParser<BroadcastDungeonUpdateRequest>() {
      public BroadcastDungeonUpdateRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         BroadcastDungeonUpdateRequest.Builder var3 = BroadcastDungeonUpdateRequest.newBuilder();

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

   private BroadcastDungeonUpdateRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private BroadcastDungeonUpdateRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new BroadcastDungeonUpdateRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_skyblock_v1_BroadcastDungeonUpdateRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_skyblock_v1_BroadcastDungeonUpdateRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(BroadcastDungeonUpdateRequest.class, BroadcastDungeonUpdateRequest.Builder.class);
   }

   @Override
   public boolean hasUpdate() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public DungeonUpdate getUpdate() {
      return this.update_ == null ? DungeonUpdate.getDefaultInstance() : this.update_;
   }

   @Override
   public DungeonUpdateOrBuilder getUpdateOrBuilder() {
      return this.update_ == null ? DungeonUpdate.getDefaultInstance() : this.update_;
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
         var1.writeMessage(1, this.getUpdate());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getUpdate());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof BroadcastDungeonUpdateRequest)) {
         return super.equals(var1);
      } else {
         BroadcastDungeonUpdateRequest var2 = (BroadcastDungeonUpdateRequest)var1;
         if (this.hasUpdate() != var2.hasUpdate()) {
            return false;
         } else {
            return this.hasUpdate() && !this.getUpdate().equals(var2.getUpdate()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasUpdate()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getUpdate().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static BroadcastDungeonUpdateRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastDungeonUpdateRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastDungeonUpdateRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastDungeonUpdateRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastDungeonUpdateRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastDungeonUpdateRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastDungeonUpdateRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BroadcastDungeonUpdateRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static BroadcastDungeonUpdateRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static BroadcastDungeonUpdateRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static BroadcastDungeonUpdateRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BroadcastDungeonUpdateRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public BroadcastDungeonUpdateRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static BroadcastDungeonUpdateRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static BroadcastDungeonUpdateRequest.Builder newBuilder(BroadcastDungeonUpdateRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public BroadcastDungeonUpdateRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new BroadcastDungeonUpdateRequest.Builder() : new BroadcastDungeonUpdateRequest.Builder().mergeFrom(this);
   }

   protected BroadcastDungeonUpdateRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new BroadcastDungeonUpdateRequest.Builder(var1);
   }

   public static BroadcastDungeonUpdateRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<BroadcastDungeonUpdateRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<BroadcastDungeonUpdateRequest> getParserForType() {
      return PARSER;
   }

   public BroadcastDungeonUpdateRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<BroadcastDungeonUpdateRequest.Builder>
      implements BroadcastDungeonUpdateRequestOrBuilder {
      private int bitField0_;
      private DungeonUpdate update_;
      private SingleFieldBuilderV3<DungeonUpdate, DungeonUpdate.Builder, DungeonUpdateOrBuilder> updateBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_skyblock_v1_BroadcastDungeonUpdateRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_skyblock_v1_BroadcastDungeonUpdateRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(BroadcastDungeonUpdateRequest.class, BroadcastDungeonUpdateRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (BroadcastDungeonUpdateRequest.alwaysUseFieldBuilders) {
            this.getUpdateFieldBuilder();
         }
      }

      public BroadcastDungeonUpdateRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.update_ = null;
         if (this.updateBuilder_ != null) {
            this.updateBuilder_.dispose();
            this.updateBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_skyblock_v1_BroadcastDungeonUpdateRequest_descriptor;
      }

      public BroadcastDungeonUpdateRequest getDefaultInstanceForType() {
         return BroadcastDungeonUpdateRequest.getDefaultInstance();
      }

      public BroadcastDungeonUpdateRequest build() {
         BroadcastDungeonUpdateRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public BroadcastDungeonUpdateRequest buildPartial() {
         BroadcastDungeonUpdateRequest var1 = new BroadcastDungeonUpdateRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(BroadcastDungeonUpdateRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.update_ = this.updateBuilder_ == null ? this.update_ : this.updateBuilder_.build();
            var3 |= 1;
         }

         BroadcastDungeonUpdateRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public BroadcastDungeonUpdateRequest.Builder clone() {
         return (BroadcastDungeonUpdateRequest.Builder)super.clone();
      }

      public BroadcastDungeonUpdateRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BroadcastDungeonUpdateRequest.Builder)super.setField(var1, var2);
      }

      public BroadcastDungeonUpdateRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (BroadcastDungeonUpdateRequest.Builder)super.clearField(var1);
      }

      public BroadcastDungeonUpdateRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (BroadcastDungeonUpdateRequest.Builder)super.clearOneof(var1);
      }

      public BroadcastDungeonUpdateRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (BroadcastDungeonUpdateRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public BroadcastDungeonUpdateRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BroadcastDungeonUpdateRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public BroadcastDungeonUpdateRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof BroadcastDungeonUpdateRequest) {
            return this.mergeFrom((BroadcastDungeonUpdateRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public BroadcastDungeonUpdateRequest.Builder mergeFrom(BroadcastDungeonUpdateRequest var1) {
         if (var1 == BroadcastDungeonUpdateRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasUpdate()) {
            this.mergeUpdate(var1.getUpdate());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public BroadcastDungeonUpdateRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getUpdateFieldBuilder().getBuilder(), var2);
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
      public boolean hasUpdate() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public DungeonUpdate getUpdate() {
         if (this.updateBuilder_ == null) {
            return this.update_ == null ? DungeonUpdate.getDefaultInstance() : this.update_;
         } else {
            return this.updateBuilder_.getMessage();
         }
      }

      public BroadcastDungeonUpdateRequest.Builder setUpdate(DungeonUpdate var1) {
         if (this.updateBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.update_ = var1;
         } else {
            this.updateBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public BroadcastDungeonUpdateRequest.Builder setUpdate(DungeonUpdate.Builder var1) {
         if (this.updateBuilder_ == null) {
            this.update_ = var1.build();
         } else {
            this.updateBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public BroadcastDungeonUpdateRequest.Builder mergeUpdate(DungeonUpdate var1) {
         if (this.updateBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.update_ != null && this.update_ != DungeonUpdate.getDefaultInstance()) {
               this.getUpdateBuilder().mergeFrom(var1);
            } else {
               this.update_ = var1;
            }
         } else {
            this.updateBuilder_.mergeFrom(var1);
         }

         if (this.update_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public BroadcastDungeonUpdateRequest.Builder clearUpdate() {
         this.bitField0_ &= -2;
         this.update_ = null;
         if (this.updateBuilder_ != null) {
            this.updateBuilder_.dispose();
            this.updateBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public DungeonUpdate.Builder getUpdateBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getUpdateFieldBuilder().getBuilder();
      }

      @Override
      public DungeonUpdateOrBuilder getUpdateOrBuilder() {
         if (this.updateBuilder_ != null) {
            return this.updateBuilder_.getMessageOrBuilder();
         } else {
            return this.update_ == null ? DungeonUpdate.getDefaultInstance() : this.update_;
         }
      }

      private SingleFieldBuilderV3<DungeonUpdate, DungeonUpdate.Builder, DungeonUpdateOrBuilder> getUpdateFieldBuilder() {
         if (this.updateBuilder_ == null) {
            this.updateBuilder_ = new SingleFieldBuilderV3<>(this.getUpdate(), this.getParentForChildren(), this.isClean());
            this.update_ = null;
         }

         return this.updateBuilder_;
      }

      public final BroadcastDungeonUpdateRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (BroadcastDungeonUpdateRequest.Builder)super.setUnknownFields(var1);
      }

      public final BroadcastDungeonUpdateRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (BroadcastDungeonUpdateRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
