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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class EarlyInDoor extends GeneratedMessageV3 implements EarlyInDoorOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int TYPE_FIELD_NUMBER = 1;
   private int type_ = 0;
   public static final int POSITION_1_FIELD_NUMBER = 2;
   private Vector2i position1_;
   public static final int POSITION_2_FIELD_NUMBER = 3;
   private Vector2i position2_;
   private byte memoizedIsInitialized = -1;
   private static final EarlyInDoor DEFAULT_INSTANCE = new EarlyInDoor();
   private static final Parser<EarlyInDoor> PARSER = new AbstractParser<EarlyInDoor>() {
      public EarlyInDoor parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EarlyInDoor.Builder var3 = EarlyInDoor.newBuilder();

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

   private EarlyInDoor(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EarlyInDoor() {
      this.type_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EarlyInDoor();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_EarlyInDoor_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_EarlyInDoor_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EarlyInDoor.class, EarlyInDoor.Builder.class);
   }

   @Override
   public int getTypeValue() {
      return this.type_;
   }

   @Override
   public DungeonRoomType getType() {
      DungeonRoomType var1 = DungeonRoomType.forNumber(this.type_);
      return var1 == null ? DungeonRoomType.UNRECOGNIZED : var1;
   }

   @Override
   public boolean hasPosition1() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Vector2i getPosition1() {
      return this.position1_ == null ? Vector2i.getDefaultInstance() : this.position1_;
   }

   @Override
   public Vector2iOrBuilder getPosition1OrBuilder() {
      return this.position1_ == null ? Vector2i.getDefaultInstance() : this.position1_;
   }

   @Override
   public boolean hasPosition2() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Vector2i getPosition2() {
      return this.position2_ == null ? Vector2i.getDefaultInstance() : this.position2_;
   }

   @Override
   public Vector2iOrBuilder getPosition2OrBuilder() {
      return this.position2_ == null ? Vector2i.getDefaultInstance() : this.position2_;
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
      if (this.type_ != DungeonRoomType.DUNGEON_ROOM_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.type_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getPosition1());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(3, this.getPosition2());
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
      if (this.type_ != DungeonRoomType.DUNGEON_ROOM_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.type_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getPosition1());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getPosition2());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof EarlyInDoor)) {
         return super.equals(var1);
      } else {
         EarlyInDoor var2 = (EarlyInDoor)var1;
         if (this.type_ != var2.type_) {
            return false;
         } else if (this.hasPosition1() != var2.hasPosition1()) {
            return false;
         } else if (this.hasPosition1() && !this.getPosition1().equals(var2.getPosition1())) {
            return false;
         } else if (this.hasPosition2() != var2.hasPosition2()) {
            return false;
         } else {
            return this.hasPosition2() && !this.getPosition2().equals(var2.getPosition2()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.type_;
      if (this.hasPosition1()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getPosition1().hashCode();
      }

      if (this.hasPosition2()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getPosition2().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EarlyInDoor parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EarlyInDoor parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EarlyInDoor parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EarlyInDoor parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EarlyInDoor parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EarlyInDoor parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EarlyInDoor parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EarlyInDoor parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EarlyInDoor parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EarlyInDoor parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EarlyInDoor parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EarlyInDoor parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EarlyInDoor.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EarlyInDoor.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EarlyInDoor.Builder newBuilder(EarlyInDoor var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EarlyInDoor.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EarlyInDoor.Builder() : new EarlyInDoor.Builder().mergeFrom(this);
   }

   protected EarlyInDoor.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EarlyInDoor.Builder(var1);
   }

   public static EarlyInDoor getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EarlyInDoor> parser() {
      return PARSER;
   }

   @Override
   public Parser<EarlyInDoor> getParserForType() {
      return PARSER;
   }

   public EarlyInDoor getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EarlyInDoor.Builder> implements EarlyInDoorOrBuilder {
      private int bitField0_;
      private int type_ = 0;
      private Vector2i position1_;
      private SingleFieldBuilderV3<Vector2i, Vector2i.Builder, Vector2iOrBuilder> position1Builder_;
      private Vector2i position2_;
      private SingleFieldBuilderV3<Vector2i, Vector2i.Builder, Vector2iOrBuilder> position2Builder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_EarlyInDoor_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_EarlyInDoor_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EarlyInDoor.class, EarlyInDoor.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (EarlyInDoor.alwaysUseFieldBuilders) {
            this.getPosition1FieldBuilder();
            this.getPosition2FieldBuilder();
         }
      }

      public EarlyInDoor.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.type_ = 0;
         this.position1_ = null;
         if (this.position1Builder_ != null) {
            this.position1Builder_.dispose();
            this.position1Builder_ = null;
         }

         this.position2_ = null;
         if (this.position2Builder_ != null) {
            this.position2Builder_.dispose();
            this.position2Builder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_EarlyInDoor_descriptor;
      }

      public EarlyInDoor getDefaultInstanceForType() {
         return EarlyInDoor.getDefaultInstance();
      }

      public EarlyInDoor build() {
         EarlyInDoor var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EarlyInDoor buildPartial() {
         EarlyInDoor var1 = new EarlyInDoor(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(EarlyInDoor var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.type_ = this.type_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.position1_ = this.position1Builder_ == null ? this.position1_ : this.position1Builder_.build();
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            var1.position2_ = this.position2Builder_ == null ? this.position2_ : this.position2Builder_.build();
            var3 |= 2;
         }

         EarlyInDoor var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public EarlyInDoor.Builder clone() {
         return (EarlyInDoor.Builder)super.clone();
      }

      public EarlyInDoor.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EarlyInDoor.Builder)super.setField(var1, var2);
      }

      public EarlyInDoor.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EarlyInDoor.Builder)super.clearField(var1);
      }

      public EarlyInDoor.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EarlyInDoor.Builder)super.clearOneof(var1);
      }

      public EarlyInDoor.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EarlyInDoor.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EarlyInDoor.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EarlyInDoor.Builder)super.addRepeatedField(var1, var2);
      }

      public EarlyInDoor.Builder mergeFrom(Message var1) {
         if (var1 instanceof EarlyInDoor) {
            return this.mergeFrom((EarlyInDoor)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EarlyInDoor.Builder mergeFrom(EarlyInDoor var1) {
         if (var1 == EarlyInDoor.getDefaultInstance()) {
            return this;
         }

         if (var1.type_ != 0) {
            this.setTypeValue(var1.getTypeValue());
         }

         if (var1.hasPosition1()) {
            this.mergePosition1(var1.getPosition1());
         }

         if (var1.hasPosition2()) {
            this.mergePosition2(var1.getPosition2());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public EarlyInDoor.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 8:
                     this.type_ = var1.readEnum();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getPosition1FieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getPosition2FieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
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
      public int getTypeValue() {
         return this.type_;
      }

      public EarlyInDoor.Builder setTypeValue(int var1) {
         this.type_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public DungeonRoomType getType() {
         DungeonRoomType var1 = DungeonRoomType.forNumber(this.type_);
         return var1 == null ? DungeonRoomType.UNRECOGNIZED : var1;
      }

      public EarlyInDoor.Builder setType(DungeonRoomType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.type_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public EarlyInDoor.Builder clearType() {
         this.bitField0_ &= -2;
         this.type_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasPosition1() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Vector2i getPosition1() {
         if (this.position1Builder_ == null) {
            return this.position1_ == null ? Vector2i.getDefaultInstance() : this.position1_;
         } else {
            return this.position1Builder_.getMessage();
         }
      }

      public EarlyInDoor.Builder setPosition1(Vector2i var1) {
         if (this.position1Builder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.position1_ = var1;
         } else {
            this.position1Builder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public EarlyInDoor.Builder setPosition1(Vector2i.Builder var1) {
         if (this.position1Builder_ == null) {
            this.position1_ = var1.build();
         } else {
            this.position1Builder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public EarlyInDoor.Builder mergePosition1(Vector2i var1) {
         if (this.position1Builder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.position1_ != null && this.position1_ != Vector2i.getDefaultInstance()) {
               this.getPosition1Builder().mergeFrom(var1);
            } else {
               this.position1_ = var1;
            }
         } else {
            this.position1Builder_.mergeFrom(var1);
         }

         if (this.position1_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public EarlyInDoor.Builder clearPosition1() {
         this.bitField0_ &= -3;
         this.position1_ = null;
         if (this.position1Builder_ != null) {
            this.position1Builder_.dispose();
            this.position1Builder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Vector2i.Builder getPosition1Builder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getPosition1FieldBuilder().getBuilder();
      }

      @Override
      public Vector2iOrBuilder getPosition1OrBuilder() {
         if (this.position1Builder_ != null) {
            return this.position1Builder_.getMessageOrBuilder();
         } else {
            return this.position1_ == null ? Vector2i.getDefaultInstance() : this.position1_;
         }
      }

      private SingleFieldBuilderV3<Vector2i, Vector2i.Builder, Vector2iOrBuilder> getPosition1FieldBuilder() {
         if (this.position1Builder_ == null) {
            this.position1Builder_ = new SingleFieldBuilderV3<>(this.getPosition1(), this.getParentForChildren(), this.isClean());
            this.position1_ = null;
         }

         return this.position1Builder_;
      }

      @Override
      public boolean hasPosition2() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Vector2i getPosition2() {
         if (this.position2Builder_ == null) {
            return this.position2_ == null ? Vector2i.getDefaultInstance() : this.position2_;
         } else {
            return this.position2Builder_.getMessage();
         }
      }

      public EarlyInDoor.Builder setPosition2(Vector2i var1) {
         if (this.position2Builder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.position2_ = var1;
         } else {
            this.position2Builder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public EarlyInDoor.Builder setPosition2(Vector2i.Builder var1) {
         if (this.position2Builder_ == null) {
            this.position2_ = var1.build();
         } else {
            this.position2Builder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public EarlyInDoor.Builder mergePosition2(Vector2i var1) {
         if (this.position2Builder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.position2_ != null && this.position2_ != Vector2i.getDefaultInstance()) {
               this.getPosition2Builder().mergeFrom(var1);
            } else {
               this.position2_ = var1;
            }
         } else {
            this.position2Builder_.mergeFrom(var1);
         }

         if (this.position2_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public EarlyInDoor.Builder clearPosition2() {
         this.bitField0_ &= -5;
         this.position2_ = null;
         if (this.position2Builder_ != null) {
            this.position2Builder_.dispose();
            this.position2Builder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Vector2i.Builder getPosition2Builder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getPosition2FieldBuilder().getBuilder();
      }

      @Override
      public Vector2iOrBuilder getPosition2OrBuilder() {
         if (this.position2Builder_ != null) {
            return this.position2Builder_.getMessageOrBuilder();
         } else {
            return this.position2_ == null ? Vector2i.getDefaultInstance() : this.position2_;
         }
      }

      private SingleFieldBuilderV3<Vector2i, Vector2i.Builder, Vector2iOrBuilder> getPosition2FieldBuilder() {
         if (this.position2Builder_ == null) {
            this.position2Builder_ = new SingleFieldBuilderV3<>(this.getPosition2(), this.getParentForChildren(), this.isClean());
            this.position2_ = null;
         }

         return this.position2Builder_;
      }

      public final EarlyInDoor.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EarlyInDoor.Builder)super.setUnknownFields(var1);
      }

      public final EarlyInDoor.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EarlyInDoor.Builder)super.mergeUnknownFields(var1);
      }
   }
}
