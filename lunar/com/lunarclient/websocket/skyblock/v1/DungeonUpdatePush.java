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
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DungeonUpdatePush extends GeneratedMessageV3 implements DungeonUpdatePushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int SENDER_UUID_FIELD_NUMBER = 1;
   private Uuid senderUuid_;
   public static final int UPDATE_FIELD_NUMBER = 2;
   private DungeonUpdate update_;
   private byte memoizedIsInitialized = -1;
   private static final DungeonUpdatePush DEFAULT_INSTANCE = new DungeonUpdatePush();
   private static final Parser<DungeonUpdatePush> PARSER = new AbstractParser<DungeonUpdatePush>() {
      public DungeonUpdatePush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DungeonUpdatePush.Builder var3 = DungeonUpdatePush.newBuilder();

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

   private DungeonUpdatePush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DungeonUpdatePush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DungeonUpdatePush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_skyblock_v1_DungeonUpdatePush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_skyblock_v1_DungeonUpdatePush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DungeonUpdatePush.class, DungeonUpdatePush.Builder.class);
   }

   @Override
   public boolean hasSenderUuid() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getSenderUuid() {
      return this.senderUuid_ == null ? Uuid.getDefaultInstance() : this.senderUuid_;
   }

   @Override
   public UuidOrBuilder getSenderUuidOrBuilder() {
      return this.senderUuid_ == null ? Uuid.getDefaultInstance() : this.senderUuid_;
   }

   @Override
   public boolean hasUpdate() {
      return (this.bitField0_ & 2) != 0;
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
         var1.writeMessage(1, this.getSenderUuid());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getUpdate());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getSenderUuid());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getUpdate());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof DungeonUpdatePush)) {
         return super.equals(var1);
      } else {
         DungeonUpdatePush var2 = (DungeonUpdatePush)var1;
         if (this.hasSenderUuid() != var2.hasSenderUuid()) {
            return false;
         } else if (this.hasSenderUuid() && !this.getSenderUuid().equals(var2.getSenderUuid())) {
            return false;
         } else if (this.hasUpdate() != var2.hasUpdate()) {
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
      if (this.hasSenderUuid()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getSenderUuid().hashCode();
      }

      if (this.hasUpdate()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getUpdate().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DungeonUpdatePush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DungeonUpdatePush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DungeonUpdatePush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DungeonUpdatePush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DungeonUpdatePush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DungeonUpdatePush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DungeonUpdatePush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DungeonUpdatePush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DungeonUpdatePush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DungeonUpdatePush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DungeonUpdatePush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DungeonUpdatePush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DungeonUpdatePush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DungeonUpdatePush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DungeonUpdatePush.Builder newBuilder(DungeonUpdatePush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DungeonUpdatePush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DungeonUpdatePush.Builder() : new DungeonUpdatePush.Builder().mergeFrom(this);
   }

   protected DungeonUpdatePush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DungeonUpdatePush.Builder(var1);
   }

   public static DungeonUpdatePush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DungeonUpdatePush> parser() {
      return PARSER;
   }

   @Override
   public Parser<DungeonUpdatePush> getParserForType() {
      return PARSER;
   }

   public DungeonUpdatePush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<DungeonUpdatePush.Builder> implements DungeonUpdatePushOrBuilder {
      private int bitField0_;
      private Uuid senderUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> senderUuidBuilder_;
      private DungeonUpdate update_;
      private SingleFieldBuilderV3<DungeonUpdate, DungeonUpdate.Builder, DungeonUpdateOrBuilder> updateBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_skyblock_v1_DungeonUpdatePush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_skyblock_v1_DungeonUpdatePush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DungeonUpdatePush.class, DungeonUpdatePush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (DungeonUpdatePush.alwaysUseFieldBuilders) {
            this.getSenderUuidFieldBuilder();
            this.getUpdateFieldBuilder();
         }
      }

      public DungeonUpdatePush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.senderUuid_ = null;
         if (this.senderUuidBuilder_ != null) {
            this.senderUuidBuilder_.dispose();
            this.senderUuidBuilder_ = null;
         }

         this.update_ = null;
         if (this.updateBuilder_ != null) {
            this.updateBuilder_.dispose();
            this.updateBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_skyblock_v1_DungeonUpdatePush_descriptor;
      }

      public DungeonUpdatePush getDefaultInstanceForType() {
         return DungeonUpdatePush.getDefaultInstance();
      }

      public DungeonUpdatePush build() {
         DungeonUpdatePush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DungeonUpdatePush buildPartial() {
         DungeonUpdatePush var1 = new DungeonUpdatePush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(DungeonUpdatePush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.senderUuid_ = this.senderUuidBuilder_ == null ? this.senderUuid_ : this.senderUuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.update_ = this.updateBuilder_ == null ? this.update_ : this.updateBuilder_.build();
            var3 |= 2;
         }

         DungeonUpdatePush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public DungeonUpdatePush.Builder clone() {
         return (DungeonUpdatePush.Builder)super.clone();
      }

      public DungeonUpdatePush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DungeonUpdatePush.Builder)super.setField(var1, var2);
      }

      public DungeonUpdatePush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DungeonUpdatePush.Builder)super.clearField(var1);
      }

      public DungeonUpdatePush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DungeonUpdatePush.Builder)super.clearOneof(var1);
      }

      public DungeonUpdatePush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DungeonUpdatePush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DungeonUpdatePush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DungeonUpdatePush.Builder)super.addRepeatedField(var1, var2);
      }

      public DungeonUpdatePush.Builder mergeFrom(Message var1) {
         if (var1 instanceof DungeonUpdatePush) {
            return this.mergeFrom((DungeonUpdatePush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DungeonUpdatePush.Builder mergeFrom(DungeonUpdatePush var1) {
         if (var1 == DungeonUpdatePush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasSenderUuid()) {
            this.mergeSenderUuid(var1.getSenderUuid());
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

      public DungeonUpdatePush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getSenderUuidFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getUpdateFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
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
      public boolean hasSenderUuid() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getSenderUuid() {
         if (this.senderUuidBuilder_ == null) {
            return this.senderUuid_ == null ? Uuid.getDefaultInstance() : this.senderUuid_;
         } else {
            return this.senderUuidBuilder_.getMessage();
         }
      }

      public DungeonUpdatePush.Builder setSenderUuid(Uuid var1) {
         if (this.senderUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.senderUuid_ = var1;
         } else {
            this.senderUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public DungeonUpdatePush.Builder setSenderUuid(Uuid.Builder var1) {
         if (this.senderUuidBuilder_ == null) {
            this.senderUuid_ = var1.build();
         } else {
            this.senderUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public DungeonUpdatePush.Builder mergeSenderUuid(Uuid var1) {
         if (this.senderUuidBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.senderUuid_ != null && this.senderUuid_ != Uuid.getDefaultInstance()) {
               this.getSenderUuidBuilder().mergeFrom(var1);
            } else {
               this.senderUuid_ = var1;
            }
         } else {
            this.senderUuidBuilder_.mergeFrom(var1);
         }

         if (this.senderUuid_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public DungeonUpdatePush.Builder clearSenderUuid() {
         this.bitField0_ &= -2;
         this.senderUuid_ = null;
         if (this.senderUuidBuilder_ != null) {
            this.senderUuidBuilder_.dispose();
            this.senderUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getSenderUuidBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getSenderUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getSenderUuidOrBuilder() {
         if (this.senderUuidBuilder_ != null) {
            return this.senderUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.senderUuid_ == null ? Uuid.getDefaultInstance() : this.senderUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getSenderUuidFieldBuilder() {
         if (this.senderUuidBuilder_ == null) {
            this.senderUuidBuilder_ = new SingleFieldBuilderV3<>(this.getSenderUuid(), this.getParentForChildren(), this.isClean());
            this.senderUuid_ = null;
         }

         return this.senderUuidBuilder_;
      }

      @Override
      public boolean hasUpdate() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public DungeonUpdate getUpdate() {
         if (this.updateBuilder_ == null) {
            return this.update_ == null ? DungeonUpdate.getDefaultInstance() : this.update_;
         } else {
            return this.updateBuilder_.getMessage();
         }
      }

      public DungeonUpdatePush.Builder setUpdate(DungeonUpdate var1) {
         if (this.updateBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.update_ = var1;
         } else {
            this.updateBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public DungeonUpdatePush.Builder setUpdate(DungeonUpdate.Builder var1) {
         if (this.updateBuilder_ == null) {
            this.update_ = var1.build();
         } else {
            this.updateBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public DungeonUpdatePush.Builder mergeUpdate(DungeonUpdate var1) {
         if (this.updateBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.update_ != null && this.update_ != DungeonUpdate.getDefaultInstance()) {
               this.getUpdateBuilder().mergeFrom(var1);
            } else {
               this.update_ = var1;
            }
         } else {
            this.updateBuilder_.mergeFrom(var1);
         }

         if (this.update_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public DungeonUpdatePush.Builder clearUpdate() {
         this.bitField0_ &= -3;
         this.update_ = null;
         if (this.updateBuilder_ != null) {
            this.updateBuilder_.dispose();
            this.updateBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public DungeonUpdate.Builder getUpdateBuilder() {
         this.bitField0_ |= 2;
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

      public final DungeonUpdatePush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DungeonUpdatePush.Builder)super.setUnknownFields(var1);
      }

      public final DungeonUpdatePush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DungeonUpdatePush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
