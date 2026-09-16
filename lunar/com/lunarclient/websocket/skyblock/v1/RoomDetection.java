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
import com.lunarclient.common.v1.Vector2i;
import com.lunarclient.common.v1.Vector2iOrBuilder;
import com.lunarclient.common.v1.Vector3i;
import com.lunarclient.common.v1.Vector3iOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class RoomDetection extends GeneratedMessageV3 implements RoomDetectionOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int POSITION_FIELD_NUMBER = 1;
   private Vector2i position_;
   public static final int HASH_FIELD_NUMBER = 2;
   private volatile Object hash_ = "";
   public static final int ORIGIN_FIELD_NUMBER = 3;
   private Vector3i origin_;
   public static final int ROTATION_FIELD_NUMBER = 4;
   private int rotation_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final RoomDetection DEFAULT_INSTANCE = new RoomDetection();
   private static final Parser<RoomDetection> PARSER = new AbstractParser<RoomDetection>() {
      public RoomDetection parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RoomDetection.Builder var3 = RoomDetection.newBuilder();

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

   private RoomDetection(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RoomDetection() {
      this.hash_ = "";
      this.rotation_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RoomDetection();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_RoomDetection_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_RoomDetection_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RoomDetection.class, RoomDetection.Builder.class);
   }

   @Override
   public boolean hasPosition() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Vector2i getPosition() {
      return this.position_ == null ? Vector2i.getDefaultInstance() : this.position_;
   }

   @Override
   public Vector2iOrBuilder getPositionOrBuilder() {
      return this.position_ == null ? Vector2i.getDefaultInstance() : this.position_;
   }

   @Override
   public String getHash() {
      Object var1 = this.hash_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.hash_ = var3;
      return var3;
   }

   @Override
   public ByteString getHashBytes() {
      Object var1 = this.hash_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.hash_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasOrigin() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Vector3i getOrigin() {
      return this.origin_ == null ? Vector3i.getDefaultInstance() : this.origin_;
   }

   @Override
   public Vector3iOrBuilder getOriginOrBuilder() {
      return this.origin_ == null ? Vector3i.getDefaultInstance() : this.origin_;
   }

   @Override
   public int getRotationValue() {
      return this.rotation_;
   }

   @Override
   public DungeonRoomRotation getRotation() {
      DungeonRoomRotation var1 = DungeonRoomRotation.forNumber(this.rotation_);
      return var1 == null ? DungeonRoomRotation.UNRECOGNIZED : var1;
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
         var1.writeMessage(1, this.getPosition());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.hash_)) {
         GeneratedMessageV3.writeString(var1, 2, this.hash_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(3, this.getOrigin());
      }

      if (this.rotation_ != DungeonRoomRotation.DUNGEON_ROOM_ROTATION_UNSPECIFIED.getNumber()) {
         var1.writeEnum(4, this.rotation_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getPosition());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.hash_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.hash_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getOrigin());
      }

      if (this.rotation_ != DungeonRoomRotation.DUNGEON_ROOM_ROTATION_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(4, this.rotation_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RoomDetection)) {
         return super.equals(var1);
      } else {
         RoomDetection var2 = (RoomDetection)var1;
         if (this.hasPosition() != var2.hasPosition()) {
            return false;
         } else if (this.hasPosition() && !this.getPosition().equals(var2.getPosition())) {
            return false;
         } else if (!this.getHash().equals(var2.getHash())) {
            return false;
         } else if (this.hasOrigin() != var2.hasOrigin()) {
            return false;
         } else if (this.hasOrigin() && !this.getOrigin().equals(var2.getOrigin())) {
            return false;
         } else {
            return this.rotation_ != var2.rotation_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasPosition()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getPosition().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getHash().hashCode();
      if (this.hasOrigin()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getOrigin().hashCode();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.rotation_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RoomDetection parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RoomDetection parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RoomDetection parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RoomDetection parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RoomDetection parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RoomDetection parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RoomDetection parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RoomDetection parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RoomDetection parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RoomDetection parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RoomDetection parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RoomDetection parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RoomDetection.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RoomDetection.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RoomDetection.Builder newBuilder(RoomDetection var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RoomDetection.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RoomDetection.Builder() : new RoomDetection.Builder().mergeFrom(this);
   }

   protected RoomDetection.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RoomDetection.Builder(var1);
   }

   public static RoomDetection getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RoomDetection> parser() {
      return PARSER;
   }

   @Override
   public Parser<RoomDetection> getParserForType() {
      return PARSER;
   }

   public RoomDetection getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RoomDetection.Builder> implements RoomDetectionOrBuilder {
      private int bitField0_;
      private Vector2i position_;
      private SingleFieldBuilderV3<Vector2i, Vector2i.Builder, Vector2iOrBuilder> positionBuilder_;
      private Object hash_ = "";
      private Vector3i origin_;
      private SingleFieldBuilderV3<Vector3i, Vector3i.Builder, Vector3iOrBuilder> originBuilder_;
      private int rotation_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_RoomDetection_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_RoomDetection_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RoomDetection.class, RoomDetection.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (RoomDetection.alwaysUseFieldBuilders) {
            this.getPositionFieldBuilder();
            this.getOriginFieldBuilder();
         }
      }

      public RoomDetection.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.position_ = null;
         if (this.positionBuilder_ != null) {
            this.positionBuilder_.dispose();
            this.positionBuilder_ = null;
         }

         this.hash_ = "";
         this.origin_ = null;
         if (this.originBuilder_ != null) {
            this.originBuilder_.dispose();
            this.originBuilder_ = null;
         }

         this.rotation_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_RoomDetection_descriptor;
      }

      public RoomDetection getDefaultInstanceForType() {
         return RoomDetection.getDefaultInstance();
      }

      public RoomDetection build() {
         RoomDetection var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RoomDetection buildPartial() {
         RoomDetection var1 = new RoomDetection(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RoomDetection var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.position_ = this.positionBuilder_ == null ? this.position_ : this.positionBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.hash_ = this.hash_;
         }

         if ((var2 & 4) != 0) {
            var1.origin_ = this.originBuilder_ == null ? this.origin_ : this.originBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 8) != 0) {
            var1.rotation_ = this.rotation_;
         }

         RoomDetection var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public RoomDetection.Builder clone() {
         return (RoomDetection.Builder)super.clone();
      }

      public RoomDetection.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RoomDetection.Builder)super.setField(var1, var2);
      }

      public RoomDetection.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RoomDetection.Builder)super.clearField(var1);
      }

      public RoomDetection.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RoomDetection.Builder)super.clearOneof(var1);
      }

      public RoomDetection.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RoomDetection.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RoomDetection.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RoomDetection.Builder)super.addRepeatedField(var1, var2);
      }

      public RoomDetection.Builder mergeFrom(Message var1) {
         if (var1 instanceof RoomDetection) {
            return this.mergeFrom((RoomDetection)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RoomDetection.Builder mergeFrom(RoomDetection var1) {
         if (var1 == RoomDetection.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPosition()) {
            this.mergePosition(var1.getPosition());
         }

         if (!var1.getHash().isEmpty()) {
            this.hash_ = var1.hash_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (var1.hasOrigin()) {
            this.mergeOrigin(var1.getOrigin());
         }

         if (var1.rotation_ != 0) {
            this.setRotationValue(var1.getRotationValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RoomDetection.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getPositionFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.hash_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getOriginFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.rotation_ = var1.readEnum();
                     this.bitField0_ |= 8;
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
      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Vector2i getPosition() {
         if (this.positionBuilder_ == null) {
            return this.position_ == null ? Vector2i.getDefaultInstance() : this.position_;
         } else {
            return this.positionBuilder_.getMessage();
         }
      }

      public RoomDetection.Builder setPosition(Vector2i var1) {
         if (this.positionBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.position_ = var1;
         } else {
            this.positionBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RoomDetection.Builder setPosition(Vector2i.Builder var1) {
         if (this.positionBuilder_ == null) {
            this.position_ = var1.build();
         } else {
            this.positionBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RoomDetection.Builder mergePosition(Vector2i var1) {
         if (this.positionBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.position_ != null && this.position_ != Vector2i.getDefaultInstance()) {
               this.getPositionBuilder().mergeFrom(var1);
            } else {
               this.position_ = var1;
            }
         } else {
            this.positionBuilder_.mergeFrom(var1);
         }

         if (this.position_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public RoomDetection.Builder clearPosition() {
         this.bitField0_ &= -2;
         this.position_ = null;
         if (this.positionBuilder_ != null) {
            this.positionBuilder_.dispose();
            this.positionBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Vector2i.Builder getPositionBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getPositionFieldBuilder().getBuilder();
      }

      @Override
      public Vector2iOrBuilder getPositionOrBuilder() {
         if (this.positionBuilder_ != null) {
            return this.positionBuilder_.getMessageOrBuilder();
         } else {
            return this.position_ == null ? Vector2i.getDefaultInstance() : this.position_;
         }
      }

      private SingleFieldBuilderV3<Vector2i, Vector2i.Builder, Vector2iOrBuilder> getPositionFieldBuilder() {
         if (this.positionBuilder_ == null) {
            this.positionBuilder_ = new SingleFieldBuilderV3<>(this.getPosition(), this.getParentForChildren(), this.isClean());
            this.position_ = null;
         }

         return this.positionBuilder_;
      }

      @Override
      public String getHash() {
         Object var1 = this.hash_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.hash_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getHashBytes() {
         Object var1 = this.hash_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.hash_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public RoomDetection.Builder setHash(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.hash_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public RoomDetection.Builder clearHash() {
         this.hash_ = RoomDetection.getDefaultInstance().getHash();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public RoomDetection.Builder setHashBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         RoomDetection.checkByteStringIsUtf8(var1);
         this.hash_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasOrigin() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Vector3i getOrigin() {
         if (this.originBuilder_ == null) {
            return this.origin_ == null ? Vector3i.getDefaultInstance() : this.origin_;
         } else {
            return this.originBuilder_.getMessage();
         }
      }

      public RoomDetection.Builder setOrigin(Vector3i var1) {
         if (this.originBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.origin_ = var1;
         } else {
            this.originBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public RoomDetection.Builder setOrigin(Vector3i.Builder var1) {
         if (this.originBuilder_ == null) {
            this.origin_ = var1.build();
         } else {
            this.originBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public RoomDetection.Builder mergeOrigin(Vector3i var1) {
         if (this.originBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.origin_ != null && this.origin_ != Vector3i.getDefaultInstance()) {
               this.getOriginBuilder().mergeFrom(var1);
            } else {
               this.origin_ = var1;
            }
         } else {
            this.originBuilder_.mergeFrom(var1);
         }

         if (this.origin_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public RoomDetection.Builder clearOrigin() {
         this.bitField0_ &= -5;
         this.origin_ = null;
         if (this.originBuilder_ != null) {
            this.originBuilder_.dispose();
            this.originBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Vector3i.Builder getOriginBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getOriginFieldBuilder().getBuilder();
      }

      @Override
      public Vector3iOrBuilder getOriginOrBuilder() {
         if (this.originBuilder_ != null) {
            return this.originBuilder_.getMessageOrBuilder();
         } else {
            return this.origin_ == null ? Vector3i.getDefaultInstance() : this.origin_;
         }
      }

      private SingleFieldBuilderV3<Vector3i, Vector3i.Builder, Vector3iOrBuilder> getOriginFieldBuilder() {
         if (this.originBuilder_ == null) {
            this.originBuilder_ = new SingleFieldBuilderV3<>(this.getOrigin(), this.getParentForChildren(), this.isClean());
            this.origin_ = null;
         }

         return this.originBuilder_;
      }

      @Override
      public int getRotationValue() {
         return this.rotation_;
      }

      public RoomDetection.Builder setRotationValue(int var1) {
         this.rotation_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public DungeonRoomRotation getRotation() {
         DungeonRoomRotation var1 = DungeonRoomRotation.forNumber(this.rotation_);
         return var1 == null ? DungeonRoomRotation.UNRECOGNIZED : var1;
      }

      public RoomDetection.Builder setRotation(DungeonRoomRotation var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 8;
         this.rotation_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public RoomDetection.Builder clearRotation() {
         this.bitField0_ &= -9;
         this.rotation_ = 0;
         this.onChanged();
         return this;
      }

      public final RoomDetection.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RoomDetection.Builder)super.setUnknownFields(var1);
      }

      public final RoomDetection.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RoomDetection.Builder)super.mergeUnknownFields(var1);
      }
   }
}
