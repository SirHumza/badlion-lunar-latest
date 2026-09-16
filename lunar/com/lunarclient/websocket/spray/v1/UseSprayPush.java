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
import com.lunarclient.common.v1.Direction;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import com.lunarclient.common.v1.Vector3f;
import com.lunarclient.common.v1.Vector3fOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UseSprayPush extends GeneratedMessageV3 implements UseSprayPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLAYER_UUID_FIELD_NUMBER = 1;
   private Uuid playerUuid_;
   public static final int SPRAY_ID_FIELD_NUMBER = 2;
   private int sprayId_ = 0;
   public static final int POS_FIELD_NUMBER = 3;
   private Vector3f pos_;
   public static final int FACING_FIELD_NUMBER = 4;
   private int facing_ = 0;
   public static final int ROTATION_FIELD_NUMBER = 5;
   private float rotation_ = 0.0F;
   public static final int MAX_ACTIVE_SPRAYS_FIELD_NUMBER = 6;
   private int maxActiveSprays_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final UseSprayPush DEFAULT_INSTANCE = new UseSprayPush();
   private static final Parser<UseSprayPush> PARSER = new AbstractParser<UseSprayPush>() {
      public UseSprayPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UseSprayPush.Builder var3 = UseSprayPush.newBuilder();

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

   private UseSprayPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UseSprayPush() {
      this.facing_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UseSprayPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_spray_v1_UseSprayPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_spray_v1_UseSprayPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UseSprayPush.class, UseSprayPush.Builder.class);
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
   public int getSprayId() {
      return this.sprayId_;
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
   public int getFacingValue() {
      return this.facing_;
   }

   @Override
   public Direction getFacing() {
      Direction var1 = Direction.forNumber(this.facing_);
      return var1 == null ? Direction.UNRECOGNIZED : var1;
   }

   @Override
   public float getRotation() {
      return this.rotation_;
   }

   @Override
   public int getMaxActiveSprays() {
      return this.maxActiveSprays_;
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

      if (this.sprayId_ != 0) {
         var1.writeInt32(2, this.sprayId_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(3, this.getPos());
      }

      if (this.facing_ != Direction.DIRECTION_UNSPECIFIED.getNumber()) {
         var1.writeEnum(4, this.facing_);
      }

      if (Float.floatToRawIntBits(this.rotation_) != 0) {
         var1.writeFloat(5, this.rotation_);
      }

      if (this.maxActiveSprays_ != 0) {
         var1.writeInt32(6, this.maxActiveSprays_);
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

      if (this.sprayId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.sprayId_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getPos());
      }

      if (this.facing_ != Direction.DIRECTION_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(4, this.facing_);
      }

      if (Float.floatToRawIntBits(this.rotation_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(5, this.rotation_);
      }

      if (this.maxActiveSprays_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(6, this.maxActiveSprays_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof UseSprayPush)) {
         return super.equals(var1);
      } else {
         UseSprayPush var2 = (UseSprayPush)var1;
         if (this.hasPlayerUuid() != var2.hasPlayerUuid()) {
            return false;
         } else if (this.hasPlayerUuid() && !this.getPlayerUuid().equals(var2.getPlayerUuid())) {
            return false;
         } else if (this.getSprayId() != var2.getSprayId()) {
            return false;
         } else if (this.hasPos() != var2.hasPos()) {
            return false;
         } else if (this.hasPos() && !this.getPos().equals(var2.getPos())) {
            return false;
         } else if (this.facing_ != var2.facing_) {
            return false;
         } else if (Float.floatToIntBits(this.getRotation()) != Float.floatToIntBits(var2.getRotation())) {
            return false;
         } else {
            return this.getMaxActiveSprays() != var2.getMaxActiveSprays() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getSprayId();
      if (this.hasPos()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getPos().hashCode();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.facing_;
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + Float.floatToIntBits(this.getRotation());
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.getMaxActiveSprays();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UseSprayPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UseSprayPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UseSprayPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UseSprayPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UseSprayPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UseSprayPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UseSprayPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UseSprayPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UseSprayPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UseSprayPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UseSprayPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UseSprayPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UseSprayPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UseSprayPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UseSprayPush.Builder newBuilder(UseSprayPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UseSprayPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UseSprayPush.Builder() : new UseSprayPush.Builder().mergeFrom(this);
   }

   protected UseSprayPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UseSprayPush.Builder(var1);
   }

   public static UseSprayPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UseSprayPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<UseSprayPush> getParserForType() {
      return PARSER;
   }

   public UseSprayPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UseSprayPush.Builder> implements UseSprayPushOrBuilder {
      private int bitField0_;
      private Uuid playerUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> playerUuidBuilder_;
      private int sprayId_;
      private Vector3f pos_;
      private SingleFieldBuilderV3<Vector3f, Vector3f.Builder, Vector3fOrBuilder> posBuilder_;
      private int facing_ = 0;
      private float rotation_;
      private int maxActiveSprays_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_spray_v1_UseSprayPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_spray_v1_UseSprayPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UseSprayPush.class, UseSprayPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (UseSprayPush.alwaysUseFieldBuilders) {
            this.getPlayerUuidFieldBuilder();
            this.getPosFieldBuilder();
         }
      }

      public UseSprayPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.playerUuid_ = null;
         if (this.playerUuidBuilder_ != null) {
            this.playerUuidBuilder_.dispose();
            this.playerUuidBuilder_ = null;
         }

         this.sprayId_ = 0;
         this.pos_ = null;
         if (this.posBuilder_ != null) {
            this.posBuilder_.dispose();
            this.posBuilder_ = null;
         }

         this.facing_ = 0;
         this.rotation_ = 0.0F;
         this.maxActiveSprays_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_spray_v1_UseSprayPush_descriptor;
      }

      public UseSprayPush getDefaultInstanceForType() {
         return UseSprayPush.getDefaultInstance();
      }

      public UseSprayPush build() {
         UseSprayPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UseSprayPush buildPartial() {
         UseSprayPush var1 = new UseSprayPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UseSprayPush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.playerUuid_ = this.playerUuidBuilder_ == null ? this.playerUuid_ : this.playerUuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.sprayId_ = this.sprayId_;
         }

         if ((var2 & 4) != 0) {
            var1.pos_ = this.posBuilder_ == null ? this.pos_ : this.posBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 8) != 0) {
            var1.facing_ = this.facing_;
         }

         if ((var2 & 16) != 0) {
            var1.rotation_ = this.rotation_;
         }

         if ((var2 & 32) != 0) {
            var1.maxActiveSprays_ = this.maxActiveSprays_;
         }

         UseSprayPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public UseSprayPush.Builder clone() {
         return (UseSprayPush.Builder)super.clone();
      }

      public UseSprayPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UseSprayPush.Builder)super.setField(var1, var2);
      }

      public UseSprayPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UseSprayPush.Builder)super.clearField(var1);
      }

      public UseSprayPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UseSprayPush.Builder)super.clearOneof(var1);
      }

      public UseSprayPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UseSprayPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UseSprayPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UseSprayPush.Builder)super.addRepeatedField(var1, var2);
      }

      public UseSprayPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof UseSprayPush) {
            return this.mergeFrom((UseSprayPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UseSprayPush.Builder mergeFrom(UseSprayPush var1) {
         if (var1 == UseSprayPush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlayerUuid()) {
            this.mergePlayerUuid(var1.getPlayerUuid());
         }

         if (var1.getSprayId() != 0) {
            this.setSprayId(var1.getSprayId());
         }

         if (var1.hasPos()) {
            this.mergePos(var1.getPos());
         }

         if (var1.facing_ != 0) {
            this.setFacingValue(var1.getFacingValue());
         }

         if (var1.getRotation() != 0.0F) {
            this.setRotation(var1.getRotation());
         }

         if (var1.getMaxActiveSprays() != 0) {
            this.setMaxActiveSprays(var1.getMaxActiveSprays());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public UseSprayPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 16:
                     this.sprayId_ = var1.readInt32();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getPosFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.facing_ = var1.readEnum();
                     this.bitField0_ |= 8;
                     break;
                  case 45:
                     this.rotation_ = var1.readFloat();
                     this.bitField0_ |= 16;
                     break;
                  case 48:
                     this.maxActiveSprays_ = var1.readInt32();
                     this.bitField0_ |= 32;
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

      public UseSprayPush.Builder setPlayerUuid(Uuid var1) {
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

      public UseSprayPush.Builder setPlayerUuid(Uuid.Builder var1) {
         if (this.playerUuidBuilder_ == null) {
            this.playerUuid_ = var1.build();
         } else {
            this.playerUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UseSprayPush.Builder mergePlayerUuid(Uuid var1) {
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

      public UseSprayPush.Builder clearPlayerUuid() {
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
      public int getSprayId() {
         return this.sprayId_;
      }

      public UseSprayPush.Builder setSprayId(int var1) {
         this.sprayId_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UseSprayPush.Builder clearSprayId() {
         this.bitField0_ &= -3;
         this.sprayId_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasPos() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Vector3f getPos() {
         if (this.posBuilder_ == null) {
            return this.pos_ == null ? Vector3f.getDefaultInstance() : this.pos_;
         } else {
            return this.posBuilder_.getMessage();
         }
      }

      public UseSprayPush.Builder setPos(Vector3f var1) {
         if (this.posBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.pos_ = var1;
         } else {
            this.posBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public UseSprayPush.Builder setPos(Vector3f.Builder var1) {
         if (this.posBuilder_ == null) {
            this.pos_ = var1.build();
         } else {
            this.posBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public UseSprayPush.Builder mergePos(Vector3f var1) {
         if (this.posBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.pos_ != null && this.pos_ != Vector3f.getDefaultInstance()) {
               this.getPosBuilder().mergeFrom(var1);
            } else {
               this.pos_ = var1;
            }
         } else {
            this.posBuilder_.mergeFrom(var1);
         }

         if (this.pos_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public UseSprayPush.Builder clearPos() {
         this.bitField0_ &= -5;
         this.pos_ = null;
         if (this.posBuilder_ != null) {
            this.posBuilder_.dispose();
            this.posBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Vector3f.Builder getPosBuilder() {
         this.bitField0_ |= 4;
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

      @Override
      public int getFacingValue() {
         return this.facing_;
      }

      public UseSprayPush.Builder setFacingValue(int var1) {
         this.facing_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public Direction getFacing() {
         Direction var1 = Direction.forNumber(this.facing_);
         return var1 == null ? Direction.UNRECOGNIZED : var1;
      }

      public UseSprayPush.Builder setFacing(Direction var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 8;
         this.facing_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public UseSprayPush.Builder clearFacing() {
         this.bitField0_ &= -9;
         this.facing_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public float getRotation() {
         return this.rotation_;
      }

      public UseSprayPush.Builder setRotation(float var1) {
         this.rotation_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public UseSprayPush.Builder clearRotation() {
         this.bitField0_ &= -17;
         this.rotation_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public int getMaxActiveSprays() {
         return this.maxActiveSprays_;
      }

      public UseSprayPush.Builder setMaxActiveSprays(int var1) {
         this.maxActiveSprays_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public UseSprayPush.Builder clearMaxActiveSprays() {
         this.bitField0_ &= -33;
         this.maxActiveSprays_ = 0;
         this.onChanged();
         return this;
      }

      public final UseSprayPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UseSprayPush.Builder)super.setUnknownFields(var1);
      }

      public final UseSprayPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UseSprayPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
