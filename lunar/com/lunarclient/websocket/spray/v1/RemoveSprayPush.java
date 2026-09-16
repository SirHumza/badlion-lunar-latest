package com.lunarclient.websocket.spray.v1;

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
import com.lunarclient.common.v1.Vector3f;
import com.lunarclient.common.v1.Vector3fOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class RemoveSprayPush extends GeneratedMessageV3 implements RemoveSprayPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLAYER_UUID_FIELD_NUMBER = 1;
   private Uuid playerUuid_;
   public static final int POS_FIELD_NUMBER = 2;
   private Vector3f pos_;
   private byte memoizedIsInitialized = -1;
   private static final RemoveSprayPush DEFAULT_INSTANCE = new RemoveSprayPush();
   private static final Parser<RemoveSprayPush> PARSER = new AbstractParser<RemoveSprayPush>() {
      public RemoveSprayPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RemoveSprayPush.Builder var3 = RemoveSprayPush.newBuilder();

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

   private RemoveSprayPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RemoveSprayPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RemoveSprayPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_spray_v1_RemoveSprayPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_spray_v1_RemoveSprayPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RemoveSprayPush.class, RemoveSprayPush.Builder.class);
   }

   @Override
   public boolean hasPlayerUuid() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getPlayerUuid() {
      return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
   }

   @Override
   public UuidOrBuilder getPlayerUuidOrBuilder() {
      return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
   }

   @Override
   public boolean hasPos() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Vector3f getPos() {
      return this.pos_ == null ? Vector3f.getDefaultInstance() : this.pos_;
   }

   @Override
   public Vector3fOrBuilder getPosOrBuilder() {
      return this.pos_ == null ? Vector3f.getDefaultInstance() : this.pos_;
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
         var1.writeMessage(1, this.getPlayerUuid());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getPos());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getPlayerUuid());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getPos());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RemoveSprayPush)) {
         return super.equals(var1);
      } else {
         RemoveSprayPush var2 = (RemoveSprayPush)var1;
         if (this.hasPlayerUuid() != var2.hasPlayerUuid()) {
            return false;
         } else if (this.hasPlayerUuid() && !this.getPlayerUuid().equals(var2.getPlayerUuid())) {
            return false;
         } else if (this.hasPos() != var2.hasPos()) {
            return false;
         } else {
            return this.hasPos() && !this.getPos().equals(var2.getPos()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasPlayerUuid()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getPlayerUuid().hashCode();
      }

      if (this.hasPos()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getPos().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RemoveSprayPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveSprayPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveSprayPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveSprayPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveSprayPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveSprayPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveSprayPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemoveSprayPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RemoveSprayPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RemoveSprayPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RemoveSprayPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemoveSprayPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RemoveSprayPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RemoveSprayPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RemoveSprayPush.Builder newBuilder(RemoveSprayPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RemoveSprayPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RemoveSprayPush.Builder() : new RemoveSprayPush.Builder().mergeFrom(this);
   }

   protected RemoveSprayPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RemoveSprayPush.Builder(var1);
   }

   public static RemoveSprayPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RemoveSprayPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<RemoveSprayPush> getParserForType() {
      return PARSER;
   }

   public RemoveSprayPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RemoveSprayPush.Builder> implements RemoveSprayPushOrBuilder {
      private int bitField0_;
      private Uuid playerUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> playerUuidBuilder_;
      private Vector3f pos_;
      private SingleFieldBuilderV3<Vector3f, Vector3f.Builder, Vector3fOrBuilder> posBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_spray_v1_RemoveSprayPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_spray_v1_RemoveSprayPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RemoveSprayPush.class, RemoveSprayPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (RemoveSprayPush.alwaysUseFieldBuilders) {
            this.getPlayerUuidFieldBuilder();
            this.getPosFieldBuilder();
         }
      }

      public RemoveSprayPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.playerUuid_ = null;
         if (this.playerUuidBuilder_ != null) {
            this.playerUuidBuilder_.dispose();
            this.playerUuidBuilder_ = null;
         }

         this.pos_ = null;
         if (this.posBuilder_ != null) {
            this.posBuilder_.dispose();
            this.posBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_spray_v1_RemoveSprayPush_descriptor;
      }

      public RemoveSprayPush getDefaultInstanceForType() {
         return RemoveSprayPush.getDefaultInstance();
      }

      public RemoveSprayPush build() {
         RemoveSprayPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RemoveSprayPush buildPartial() {
         RemoveSprayPush var1 = new RemoveSprayPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RemoveSprayPush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.playerUuid_ = this.playerUuidBuilder_ == null ? this.playerUuid_ : this.playerUuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.pos_ = this.posBuilder_ == null ? this.pos_ : this.posBuilder_.build();
            var3 |= 2;
         }

         RemoveSprayPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public RemoveSprayPush.Builder clone() {
         return (RemoveSprayPush.Builder)super.clone();
      }

      public RemoveSprayPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemoveSprayPush.Builder)super.setField(var1, var2);
      }

      public RemoveSprayPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RemoveSprayPush.Builder)super.clearField(var1);
      }

      public RemoveSprayPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RemoveSprayPush.Builder)super.clearOneof(var1);
      }

      public RemoveSprayPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RemoveSprayPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RemoveSprayPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemoveSprayPush.Builder)super.addRepeatedField(var1, var2);
      }

      public RemoveSprayPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof RemoveSprayPush) {
            return this.mergeFrom((RemoveSprayPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RemoveSprayPush.Builder mergeFrom(RemoveSprayPush var1) {
         if (var1 == RemoveSprayPush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlayerUuid()) {
            this.mergePlayerUuid(var1.getPlayerUuid());
         }

         if (var1.hasPos()) {
            this.mergePos(var1.getPos());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RemoveSprayPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getPlayerUuidFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getPosFieldBuilder().getBuilder(), var2);
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
      public boolean hasPlayerUuid() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getPlayerUuid() {
         if (this.playerUuidBuilder_ == null) {
            return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
         } else {
            return this.playerUuidBuilder_.getMessage();
         }
      }

      public RemoveSprayPush.Builder setPlayerUuid(Uuid var1) {
         if (this.playerUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.playerUuid_ = var1;
         } else {
            this.playerUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RemoveSprayPush.Builder setPlayerUuid(Uuid.Builder var1) {
         if (this.playerUuidBuilder_ == null) {
            this.playerUuid_ = var1.build();
         } else {
            this.playerUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RemoveSprayPush.Builder mergePlayerUuid(Uuid var1) {
         if (this.playerUuidBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.playerUuid_ != null && this.playerUuid_ != Uuid.getDefaultInstance()) {
               this.getPlayerUuidBuilder().mergeFrom(var1);
            } else {
               this.playerUuid_ = var1;
            }
         } else {
            this.playerUuidBuilder_.mergeFrom(var1);
         }

         if (this.playerUuid_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public RemoveSprayPush.Builder clearPlayerUuid() {
         this.bitField0_ &= -2;
         this.playerUuid_ = null;
         if (this.playerUuidBuilder_ != null) {
            this.playerUuidBuilder_.dispose();
            this.playerUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getPlayerUuidBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getPlayerUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getPlayerUuidOrBuilder() {
         if (this.playerUuidBuilder_ != null) {
            return this.playerUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getPlayerUuidFieldBuilder() {
         if (this.playerUuidBuilder_ == null) {
            this.playerUuidBuilder_ = new SingleFieldBuilderV3<>(this.getPlayerUuid(), this.getParentForChildren(), this.isClean());
            this.playerUuid_ = null;
         }

         return this.playerUuidBuilder_;
      }

      @Override
      public boolean hasPos() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Vector3f getPos() {
         if (this.posBuilder_ == null) {
            return this.pos_ == null ? Vector3f.getDefaultInstance() : this.pos_;
         } else {
            return this.posBuilder_.getMessage();
         }
      }

      public RemoveSprayPush.Builder setPos(Vector3f var1) {
         if (this.posBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.pos_ = var1;
         } else {
            this.posBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public RemoveSprayPush.Builder setPos(Vector3f.Builder var1) {
         if (this.posBuilder_ == null) {
            this.pos_ = var1.build();
         } else {
            this.posBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public RemoveSprayPush.Builder mergePos(Vector3f var1) {
         if (this.posBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.pos_ != null && this.pos_ != Vector3f.getDefaultInstance()) {
               this.getPosBuilder().mergeFrom(var1);
            } else {
               this.pos_ = var1;
            }
         } else {
            this.posBuilder_.mergeFrom(var1);
         }

         if (this.pos_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public RemoveSprayPush.Builder clearPos() {
         this.bitField0_ &= -3;
         this.pos_ = null;
         if (this.posBuilder_ != null) {
            this.posBuilder_.dispose();
            this.posBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Vector3f.Builder getPosBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getPosFieldBuilder().getBuilder();
      }

      @Override
      public Vector3fOrBuilder getPosOrBuilder() {
         if (this.posBuilder_ != null) {
            return this.posBuilder_.getMessageOrBuilder();
         } else {
            return this.pos_ == null ? Vector3f.getDefaultInstance() : this.pos_;
         }
      }

      private SingleFieldBuilderV3<Vector3f, Vector3f.Builder, Vector3fOrBuilder> getPosFieldBuilder() {
         if (this.posBuilder_ == null) {
            this.posBuilder_ = new SingleFieldBuilderV3<>(this.getPos(), this.getParentForChildren(), this.isClean());
            this.pos_ = null;
         }

         return this.posBuilder_;
      }

      public final RemoveSprayPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RemoveSprayPush.Builder)super.setUnknownFields(var1);
      }

      public final RemoveSprayPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RemoveSprayPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
