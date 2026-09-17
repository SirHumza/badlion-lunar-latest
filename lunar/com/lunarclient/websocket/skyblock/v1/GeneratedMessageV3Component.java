package com.lunarclient.websocket.skyblock.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DungeonUpdate extends GeneratedMessageV3 implements DungeonUpdateOrBuilder {
   private static final long serialVersionUID = 0L;
   private int contentsCase_ = 0;
   private Object contents_;
   public static final int EARLY_IN_DOOR_FIELD_NUMBER = 1;
   public static final int EARLY_IN_ROOM_FIELD_NUMBER = 2;
   public static final int EARLY_IN_UNKNOWN_FIELD_NUMBER = 3;
   public static final int ROOM_DETECTION_FIELD_NUMBER = 4;
   public static final int ROOM_SECRETS_FIELD_NUMBER = 5;
   private byte memoizedIsInitialized = -1;
   private static final DungeonUpdate DEFAULT_INSTANCE = new DungeonUpdate();
   private static final Parser<DungeonUpdate> PARSER = new AbstractParser<DungeonUpdate>() {
      public DungeonUpdate parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DungeonUpdate.Builder var3 = DungeonUpdate.newBuilder();

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

   private DungeonUpdate(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DungeonUpdate() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DungeonUpdate();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_DungeonUpdate_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_DungeonUpdate_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DungeonUpdate.class, DungeonUpdate.Builder.class);
   }

   @Override
   public DungeonUpdate.ContentsCase getContentsCase() {
      return DungeonUpdate.ContentsCase.forNumber(this.contentsCase_);
   }

   @Override
   public boolean hasEarlyInDoor() {
      return this.contentsCase_ == 1;
   }

   @Override
   public EarlyInDoor getEarlyInDoor() {
      return this.contentsCase_ == 1 ? (EarlyInDoor)this.contents_ : EarlyInDoor.getDefaultInstance();
   }

   @Override
   public EarlyInDoorOrBuilder getEarlyInDoorOrBuilder() {
      return this.contentsCase_ == 1 ? (EarlyInDoor)this.contents_ : EarlyInDoor.getDefaultInstance();
   }

   @Override
   public boolean hasEarlyInRoom() {
      return this.contentsCase_ == 2;
   }

   @Override
   public EarlyInRoom getEarlyInRoom() {
      return this.contentsCase_ == 2 ? (EarlyInRoom)this.contents_ : EarlyInRoom.getDefaultInstance();
   }

   @Override
   public EarlyInRoomOrBuilder getEarlyInRoomOrBuilder() {
      return this.contentsCase_ == 2 ? (EarlyInRoom)this.contents_ : EarlyInRoom.getDefaultInstance();
   }

   @Override
   public boolean hasEarlyInUnknown() {
      return this.contentsCase_ == 3;
   }

   @Override
   public EarlyInUnknown getEarlyInUnknown() {
      return this.contentsCase_ == 3 ? (EarlyInUnknown)this.contents_ : EarlyInUnknown.getDefaultInstance();
   }

   @Override
   public EarlyInUnknownOrBuilder getEarlyInUnknownOrBuilder() {
      return this.contentsCase_ == 3 ? (EarlyInUnknown)this.contents_ : EarlyInUnknown.getDefaultInstance();
   }

   @Override
   public boolean hasRoomDetection() {
      return this.contentsCase_ == 4;
   }

   @Override
   public RoomDetection getRoomDetection() {
      return this.contentsCase_ == 4 ? (RoomDetection)this.contents_ : RoomDetection.getDefaultInstance();
   }

   @Override
   public RoomDetectionOrBuilder getRoomDetectionOrBuilder() {
      return this.contentsCase_ == 4 ? (RoomDetection)this.contents_ : RoomDetection.getDefaultInstance();
   }

   @Override
   public boolean hasRoomSecrets() {
      return this.contentsCase_ == 5;
   }

   @Override
   public RoomSecrets getRoomSecrets() {
      return this.contentsCase_ == 5 ? (RoomSecrets)this.contents_ : RoomSecrets.getDefaultInstance();
   }

   @Override
   public RoomSecretsOrBuilder getRoomSecretsOrBuilder() {
      return this.contentsCase_ == 5 ? (RoomSecrets)this.contents_ : RoomSecrets.getDefaultInstance();
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
      if (this.contentsCase_ == 1) {
         var1.writeMessage(1, (EarlyInDoor)this.contents_);
      }

      if (this.contentsCase_ == 2) {
         var1.writeMessage(2, (EarlyInRoom)this.contents_);
      }

      if (this.contentsCase_ == 3) {
         var1.writeMessage(3, (EarlyInUnknown)this.contents_);
      }

      if (this.contentsCase_ == 4) {
         var1.writeMessage(4, (RoomDetection)this.contents_);
      }

      if (this.contentsCase_ == 5) {
         var1.writeMessage(5, (RoomSecrets)this.contents_);
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
      if (this.contentsCase_ == 1) {
         var1 += CodedOutputStream.computeMessageSize(1, (EarlyInDoor)this.contents_);
      }

      if (this.contentsCase_ == 2) {
         var1 += CodedOutputStream.computeMessageSize(2, (EarlyInRoom)this.contents_);
      }

      if (this.contentsCase_ == 3) {
         var1 += CodedOutputStream.computeMessageSize(3, (EarlyInUnknown)this.contents_);
      }

      if (this.contentsCase_ == 4) {
         var1 += CodedOutputStream.computeMessageSize(4, (RoomDetection)this.contents_);
      }

      if (this.contentsCase_ == 5) {
         var1 += CodedOutputStream.computeMessageSize(5, (RoomSecrets)this.contents_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof DungeonUpdate)) {
         return super.equals(var1);
      }

      DungeonUpdate var2 = (DungeonUpdate)var1;
      if (!this.getContentsCase().equals(var2.getContentsCase())) {
         return false;
      }

      switch (this.contentsCase_) {
         case 0:
         default:
            break;
         case 1:
            if (!this.getEarlyInDoor().equals(var2.getEarlyInDoor())) {
               return false;
            }
            break;
         case 2:
            if (!this.getEarlyInRoom().equals(var2.getEarlyInRoom())) {
               return false;
            }
            break;
         case 3:
            if (!this.getEarlyInUnknown().equals(var2.getEarlyInUnknown())) {
               return false;
            }
            break;
         case 4:
            if (!this.getRoomDetection().equals(var2.getRoomDetection())) {
               return false;
            }
            break;
         case 5:
            if (!this.getRoomSecrets().equals(var2.getRoomSecrets())) {
               return false;
            }
      }

      return this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      switch (this.contentsCase_) {
         case 0:
         default:
            break;
         case 1:
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getEarlyInDoor().hashCode();
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getEarlyInRoom().hashCode();
            break;
         case 3:
            var1 = 37 * var1 + 3;
            var1 = 53 * var1 + this.getEarlyInUnknown().hashCode();
            break;
         case 4:
            var1 = 37 * var1 + 4;
            var1 = 53 * var1 + this.getRoomDetection().hashCode();
            break;
         case 5:
            var1 = 37 * var1 + 5;
            var1 = 53 * var1 + this.getRoomSecrets().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DungeonUpdate parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DungeonUpdate parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DungeonUpdate parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DungeonUpdate parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DungeonUpdate parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DungeonUpdate parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DungeonUpdate parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DungeonUpdate parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DungeonUpdate parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DungeonUpdate parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DungeonUpdate parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DungeonUpdate parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DungeonUpdate.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DungeonUpdate.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DungeonUpdate.Builder newBuilder(DungeonUpdate var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DungeonUpdate.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DungeonUpdate.Builder() : new DungeonUpdate.Builder().mergeFrom(this);
   }

   protected DungeonUpdate.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DungeonUpdate.Builder(var1);
   }

   public static DungeonUpdate getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DungeonUpdate> parser() {
      return PARSER;
   }

   @Override
   public Parser<DungeonUpdate> getParserForType() {
      return PARSER;
   }

   public DungeonUpdate getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<DungeonUpdate.Builder> implements DungeonUpdateOrBuilder {
      private int contentsCase_ = 0;
      private Object contents_;
      private int bitField0_;
      private SingleFieldBuilderV3<EarlyInDoor, EarlyInDoor.Builder, EarlyInDoorOrBuilder> earlyInDoorBuilder_;
      private SingleFieldBuilderV3<EarlyInRoom, EarlyInRoom.Builder, EarlyInRoomOrBuilder> earlyInRoomBuilder_;
      private SingleFieldBuilderV3<EarlyInUnknown, EarlyInUnknown.Builder, EarlyInUnknownOrBuilder> earlyInUnknownBuilder_;
      private SingleFieldBuilderV3<RoomDetection, RoomDetection.Builder, RoomDetectionOrBuilder> roomDetectionBuilder_;
      private SingleFieldBuilderV3<RoomSecrets, RoomSecrets.Builder, RoomSecretsOrBuilder> roomSecretsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_DungeonUpdate_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_DungeonUpdate_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DungeonUpdate.class, DungeonUpdate.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public DungeonUpdate.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.earlyInDoorBuilder_ != null) {
            this.earlyInDoorBuilder_.clear();
         }

         if (this.earlyInRoomBuilder_ != null) {
            this.earlyInRoomBuilder_.clear();
         }

         if (this.earlyInUnknownBuilder_ != null) {
            this.earlyInUnknownBuilder_.clear();
         }

         if (this.roomDetectionBuilder_ != null) {
            this.roomDetectionBuilder_.clear();
         }

         if (this.roomSecretsBuilder_ != null) {
            this.roomSecretsBuilder_.clear();
         }

         this.contentsCase_ = 0;
         this.contents_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_DungeonUpdate_descriptor;
      }

      public DungeonUpdate getDefaultInstanceForType() {
         return DungeonUpdate.getDefaultInstance();
      }

      public DungeonUpdate build() {
         DungeonUpdate var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DungeonUpdate buildPartial() {
         DungeonUpdate var1 = new DungeonUpdate(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(DungeonUpdate var1) {
         int var2 = this.bitField0_;
      }

      private void buildPartialOneofs(DungeonUpdate var1) {
         var1.contentsCase_ = this.contentsCase_;
         var1.contents_ = this.contents_;
         if (this.contentsCase_ == 1 && this.earlyInDoorBuilder_ != null) {
            var1.contents_ = this.earlyInDoorBuilder_.build();
         }

         if (this.contentsCase_ == 2 && this.earlyInRoomBuilder_ != null) {
            var1.contents_ = this.earlyInRoomBuilder_.build();
         }

         if (this.contentsCase_ == 3 && this.earlyInUnknownBuilder_ != null) {
            var1.contents_ = this.earlyInUnknownBuilder_.build();
         }

         if (this.contentsCase_ == 4 && this.roomDetectionBuilder_ != null) {
            var1.contents_ = this.roomDetectionBuilder_.build();
         }

         if (this.contentsCase_ == 5 && this.roomSecretsBuilder_ != null) {
            var1.contents_ = this.roomSecretsBuilder_.build();
         }
      }

      public DungeonUpdate.Builder clone() {
         return (DungeonUpdate.Builder)super.clone();
      }

      public DungeonUpdate.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DungeonUpdate.Builder)super.setField(var1, var2);
      }

      public DungeonUpdate.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DungeonUpdate.Builder)super.clearField(var1);
      }

      public DungeonUpdate.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DungeonUpdate.Builder)super.clearOneof(var1);
      }

      public DungeonUpdate.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DungeonUpdate.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DungeonUpdate.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DungeonUpdate.Builder)super.addRepeatedField(var1, var2);
      }

      public DungeonUpdate.Builder mergeFrom(Message var1) {
         if (var1 instanceof DungeonUpdate) {
            return this.mergeFrom((DungeonUpdate)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DungeonUpdate.Builder mergeFrom(DungeonUpdate var1) {
         if (var1 == DungeonUpdate.getDefaultInstance()) {
            return this;
         }

         switch (var1.getContentsCase()) {
            case EARLY_IN_DOOR:
               this.mergeEarlyInDoor(var1.getEarlyInDoor());
               break;
            case EARLY_IN_ROOM:
               this.mergeEarlyInRoom(var1.getEarlyInRoom());
               break;
            case EARLY_IN_UNKNOWN:
               this.mergeEarlyInUnknown(var1.getEarlyInUnknown());
               break;
            case ROOM_DETECTION:
               this.mergeRoomDetection(var1.getRoomDetection());
               break;
            case ROOM_SECRETS:
               this.mergeRoomSecrets(var1.getRoomSecrets());
            case CONTENTS_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public DungeonUpdate.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getEarlyInDoorFieldBuilder().getBuilder(), var2);
                     this.contentsCase_ = 1;
                     break;
                  case 18:
                     var1.readMessage(this.getEarlyInRoomFieldBuilder().getBuilder(), var2);
                     this.contentsCase_ = 2;
                     break;
                  case 26:
                     var1.readMessage(this.getEarlyInUnknownFieldBuilder().getBuilder(), var2);
                     this.contentsCase_ = 3;
                     break;
                  case 34:
                     var1.readMessage(this.getRoomDetectionFieldBuilder().getBuilder(), var2);
                     this.contentsCase_ = 4;
                     break;
                  case 42:
                     var1.readMessage(this.getRoomSecretsFieldBuilder().getBuilder(), var2);
                     this.contentsCase_ = 5;
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
      public DungeonUpdate.ContentsCase getContentsCase() {
         return DungeonUpdate.ContentsCase.forNumber(this.contentsCase_);
      }

      public DungeonUpdate.Builder clearContents() {
         this.contentsCase_ = 0;
         this.contents_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasEarlyInDoor() {
         return this.contentsCase_ == 1;
      }

      @Override
      public EarlyInDoor getEarlyInDoor() {
         if (this.earlyInDoorBuilder_ == null) {
            return this.contentsCase_ == 1 ? (EarlyInDoor)this.contents_ : EarlyInDoor.getDefaultInstance();
         } else {
            return this.contentsCase_ == 1 ? this.earlyInDoorBuilder_.getMessage() : EarlyInDoor.getDefaultInstance();
         }
      }

      public DungeonUpdate.Builder setEarlyInDoor(EarlyInDoor var1) {
         if (this.earlyInDoorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.contents_ = var1;
            this.onChanged();
         } else {
            this.earlyInDoorBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 1;
         return this;
      }

      public DungeonUpdate.Builder setEarlyInDoor(EarlyInDoor.Builder var1) {
         if (this.earlyInDoorBuilder_ == null) {
            this.contents_ = var1.build();
            this.onChanged();
         } else {
            this.earlyInDoorBuilder_.setMessage(var1.build());
         }

         this.contentsCase_ = 1;
         return this;
      }

      public DungeonUpdate.Builder mergeEarlyInDoor(EarlyInDoor var1) {
         if (this.earlyInDoorBuilder_ == null) {
            if (this.contentsCase_ == 1 && this.contents_ != EarlyInDoor.getDefaultInstance()) {
               this.contents_ = EarlyInDoor.newBuilder((EarlyInDoor)this.contents_).mergeFrom(var1).buildPartial();
            } else {
               this.contents_ = var1;
            }

            this.onChanged();
         } else if (this.contentsCase_ == 1) {
            this.earlyInDoorBuilder_.mergeFrom(var1);
         } else {
            this.earlyInDoorBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 1;
         return this;
      }

      public DungeonUpdate.Builder clearEarlyInDoor() {
         if (this.earlyInDoorBuilder_ == null) {
            if (this.contentsCase_ == 1) {
               this.contentsCase_ = 0;
               this.contents_ = null;
               this.onChanged();
            }
         } else {
            if (this.contentsCase_ == 1) {
               this.contentsCase_ = 0;
               this.contents_ = null;
            }

            this.earlyInDoorBuilder_.clear();
         }

         return this;
      }

      public EarlyInDoor.Builder getEarlyInDoorBuilder() {
         return this.getEarlyInDoorFieldBuilder().getBuilder();
      }

      @Override
      public EarlyInDoorOrBuilder getEarlyInDoorOrBuilder() {
         if (this.contentsCase_ == 1 && this.earlyInDoorBuilder_ != null) {
            return this.earlyInDoorBuilder_.getMessageOrBuilder();
         } else {
            return this.contentsCase_ == 1 ? (EarlyInDoor)this.contents_ : EarlyInDoor.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<EarlyInDoor, EarlyInDoor.Builder, EarlyInDoorOrBuilder> getEarlyInDoorFieldBuilder() {
         if (this.earlyInDoorBuilder_ == null) {
            if (this.contentsCase_ != 1) {
               this.contents_ = EarlyInDoor.getDefaultInstance();
            }

            this.earlyInDoorBuilder_ = new SingleFieldBuilderV3<>((EarlyInDoor)this.contents_, this.getParentForChildren(), this.isClean());
            this.contents_ = null;
         }

         this.contentsCase_ = 1;
         this.onChanged();
         return this.earlyInDoorBuilder_;
      }

      @Override
      public boolean hasEarlyInRoom() {
         return this.contentsCase_ == 2;
      }

      @Override
      public EarlyInRoom getEarlyInRoom() {
         if (this.earlyInRoomBuilder_ == null) {
            return this.contentsCase_ == 2 ? (EarlyInRoom)this.contents_ : EarlyInRoom.getDefaultInstance();
         } else {
            return this.contentsCase_ == 2 ? this.earlyInRoomBuilder_.getMessage() : EarlyInRoom.getDefaultInstance();
         }
      }

      public DungeonUpdate.Builder setEarlyInRoom(EarlyInRoom var1) {
         if (this.earlyInRoomBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.contents_ = var1;
            this.onChanged();
         } else {
            this.earlyInRoomBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 2;
         return this;
      }

      public DungeonUpdate.Builder setEarlyInRoom(EarlyInRoom.Builder var1) {
         if (this.earlyInRoomBuilder_ == null) {
            this.contents_ = var1.build();
            this.onChanged();
         } else {
            this.earlyInRoomBuilder_.setMessage(var1.build());
         }

         this.contentsCase_ = 2;
         return this;
      }

      public DungeonUpdate.Builder mergeEarlyInRoom(EarlyInRoom var1) {
         if (this.earlyInRoomBuilder_ == null) {
            if (this.contentsCase_ == 2 && this.contents_ != EarlyInRoom.getDefaultInstance()) {
               this.contents_ = EarlyInRoom.newBuilder((EarlyInRoom)this.contents_).mergeFrom(var1).buildPartial();
            } else {
               this.contents_ = var1;
            }

            this.onChanged();
         } else if (this.contentsCase_ == 2) {
            this.earlyInRoomBuilder_.mergeFrom(var1);
         } else {
            this.earlyInRoomBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 2;
         return this;
      }

      public DungeonUpdate.Builder clearEarlyInRoom() {
         if (this.earlyInRoomBuilder_ == null) {
            if (this.contentsCase_ == 2) {
               this.contentsCase_ = 0;
               this.contents_ = null;
               this.onChanged();
            }
         } else {
            if (this.contentsCase_ == 2) {
               this.contentsCase_ = 0;
               this.contents_ = null;
            }

            this.earlyInRoomBuilder_.clear();
         }

         return this;
      }

      public EarlyInRoom.Builder getEarlyInRoomBuilder() {
         return this.getEarlyInRoomFieldBuilder().getBuilder();
      }

      @Override
      public EarlyInRoomOrBuilder getEarlyInRoomOrBuilder() {
         if (this.contentsCase_ == 2 && this.earlyInRoomBuilder_ != null) {
            return this.earlyInRoomBuilder_.getMessageOrBuilder();
         } else {
            return this.contentsCase_ == 2 ? (EarlyInRoom)this.contents_ : EarlyInRoom.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<EarlyInRoom, EarlyInRoom.Builder, EarlyInRoomOrBuilder> getEarlyInRoomFieldBuilder() {
         if (this.earlyInRoomBuilder_ == null) {
            if (this.contentsCase_ != 2) {
               this.contents_ = EarlyInRoom.getDefaultInstance();
            }

            this.earlyInRoomBuilder_ = new SingleFieldBuilderV3<>((EarlyInRoom)this.contents_, this.getParentForChildren(), this.isClean());
            this.contents_ = null;
         }

         this.contentsCase_ = 2;
         this.onChanged();
         return this.earlyInRoomBuilder_;
      }

      @Override
      public boolean hasEarlyInUnknown() {
         return this.contentsCase_ == 3;
      }

      @Override
      public EarlyInUnknown getEarlyInUnknown() {
         if (this.earlyInUnknownBuilder_ == null) {
            return this.contentsCase_ == 3 ? (EarlyInUnknown)this.contents_ : EarlyInUnknown.getDefaultInstance();
         } else {
            return this.contentsCase_ == 3 ? this.earlyInUnknownBuilder_.getMessage() : EarlyInUnknown.getDefaultInstance();
         }
      }

      public DungeonUpdate.Builder setEarlyInUnknown(EarlyInUnknown var1) {
         if (this.earlyInUnknownBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.contents_ = var1;
            this.onChanged();
         } else {
            this.earlyInUnknownBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 3;
         return this;
      }

      public DungeonUpdate.Builder setEarlyInUnknown(EarlyInUnknown.Builder var1) {
         if (this.earlyInUnknownBuilder_ == null) {
            this.contents_ = var1.build();
            this.onChanged();
         } else {
            this.earlyInUnknownBuilder_.setMessage(var1.build());
         }

         this.contentsCase_ = 3;
         return this;
      }

      public DungeonUpdate.Builder mergeEarlyInUnknown(EarlyInUnknown var1) {
         if (this.earlyInUnknownBuilder_ == null) {
            if (this.contentsCase_ == 3 && this.contents_ != EarlyInUnknown.getDefaultInstance()) {
               this.contents_ = EarlyInUnknown.newBuilder((EarlyInUnknown)this.contents_).mergeFrom(var1).buildPartial();
            } else {
               this.contents_ = var1;
            }

            this.onChanged();
         } else if (this.contentsCase_ == 3) {
            this.earlyInUnknownBuilder_.mergeFrom(var1);
         } else {
            this.earlyInUnknownBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 3;
         return this;
      }

      public DungeonUpdate.Builder clearEarlyInUnknown() {
         if (this.earlyInUnknownBuilder_ == null) {
            if (this.contentsCase_ == 3) {
               this.contentsCase_ = 0;
               this.contents_ = null;
               this.onChanged();
            }
         } else {
            if (this.contentsCase_ == 3) {
               this.contentsCase_ = 0;
               this.contents_ = null;
            }

            this.earlyInUnknownBuilder_.clear();
         }

         return this;
      }

      public EarlyInUnknown.Builder getEarlyInUnknownBuilder() {
         return this.getEarlyInUnknownFieldBuilder().getBuilder();
      }

      @Override
      public EarlyInUnknownOrBuilder getEarlyInUnknownOrBuilder() {
         if (this.contentsCase_ == 3 && this.earlyInUnknownBuilder_ != null) {
            return this.earlyInUnknownBuilder_.getMessageOrBuilder();
         } else {
            return this.contentsCase_ == 3 ? (EarlyInUnknown)this.contents_ : EarlyInUnknown.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<EarlyInUnknown, EarlyInUnknown.Builder, EarlyInUnknownOrBuilder> getEarlyInUnknownFieldBuilder() {
         if (this.earlyInUnknownBuilder_ == null) {
            if (this.contentsCase_ != 3) {
               this.contents_ = EarlyInUnknown.getDefaultInstance();
            }

            this.earlyInUnknownBuilder_ = new SingleFieldBuilderV3<>((EarlyInUnknown)this.contents_, this.getParentForChildren(), this.isClean());
            this.contents_ = null;
         }

         this.contentsCase_ = 3;
         this.onChanged();
         return this.earlyInUnknownBuilder_;
      }

      @Override
      public boolean hasRoomDetection() {
         return this.contentsCase_ == 4;
      }

      @Override
      public RoomDetection getRoomDetection() {
         if (this.roomDetectionBuilder_ == null) {
            return this.contentsCase_ == 4 ? (RoomDetection)this.contents_ : RoomDetection.getDefaultInstance();
         } else {
            return this.contentsCase_ == 4 ? this.roomDetectionBuilder_.getMessage() : RoomDetection.getDefaultInstance();
         }
      }

      public DungeonUpdate.Builder setRoomDetection(RoomDetection var1) {
         if (this.roomDetectionBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.contents_ = var1;
            this.onChanged();
         } else {
            this.roomDetectionBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 4;
         return this;
      }

      public DungeonUpdate.Builder setRoomDetection(RoomDetection.Builder var1) {
         if (this.roomDetectionBuilder_ == null) {
            this.contents_ = var1.build();
            this.onChanged();
         } else {
            this.roomDetectionBuilder_.setMessage(var1.build());
         }

         this.contentsCase_ = 4;
         return this;
      }

      public DungeonUpdate.Builder mergeRoomDetection(RoomDetection var1) {
         if (this.roomDetectionBuilder_ == null) {
            if (this.contentsCase_ == 4 && this.contents_ != RoomDetection.getDefaultInstance()) {
               this.contents_ = RoomDetection.newBuilder((RoomDetection)this.contents_).mergeFrom(var1).buildPartial();
            } else {
               this.contents_ = var1;
            }

            this.onChanged();
         } else if (this.contentsCase_ == 4) {
            this.roomDetectionBuilder_.mergeFrom(var1);
         } else {
            this.roomDetectionBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 4;
         return this;
      }

      public DungeonUpdate.Builder clearRoomDetection() {
         if (this.roomDetectionBuilder_ == null) {
            if (this.contentsCase_ == 4) {
               this.contentsCase_ = 0;
               this.contents_ = null;
               this.onChanged();
            }
         } else {
            if (this.contentsCase_ == 4) {
               this.contentsCase_ = 0;
               this.contents_ = null;
            }

            this.roomDetectionBuilder_.clear();
         }

         return this;
      }

      public RoomDetection.Builder getRoomDetectionBuilder() {
         return this.getRoomDetectionFieldBuilder().getBuilder();
      }

      @Override
      public RoomDetectionOrBuilder getRoomDetectionOrBuilder() {
         if (this.contentsCase_ == 4 && this.roomDetectionBuilder_ != null) {
            return this.roomDetectionBuilder_.getMessageOrBuilder();
         } else {
            return this.contentsCase_ == 4 ? (RoomDetection)this.contents_ : RoomDetection.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<RoomDetection, RoomDetection.Builder, RoomDetectionOrBuilder> getRoomDetectionFieldBuilder() {
         if (this.roomDetectionBuilder_ == null) {
            if (this.contentsCase_ != 4) {
               this.contents_ = RoomDetection.getDefaultInstance();
            }

            this.roomDetectionBuilder_ = new SingleFieldBuilderV3<>((RoomDetection)this.contents_, this.getParentForChildren(), this.isClean());
            this.contents_ = null;
         }

         this.contentsCase_ = 4;
         this.onChanged();
         return this.roomDetectionBuilder_;
      }

      @Override
      public boolean hasRoomSecrets() {
         return this.contentsCase_ == 5;
      }

      @Override
      public RoomSecrets getRoomSecrets() {
         if (this.roomSecretsBuilder_ == null) {
            return this.contentsCase_ == 5 ? (RoomSecrets)this.contents_ : RoomSecrets.getDefaultInstance();
         } else {
            return this.contentsCase_ == 5 ? this.roomSecretsBuilder_.getMessage() : RoomSecrets.getDefaultInstance();
         }
      }

      public DungeonUpdate.Builder setRoomSecrets(RoomSecrets var1) {
         if (this.roomSecretsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.contents_ = var1;
            this.onChanged();
         } else {
            this.roomSecretsBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 5;
         return this;
      }

      public DungeonUpdate.Builder setRoomSecrets(RoomSecrets.Builder var1) {
         if (this.roomSecretsBuilder_ == null) {
            this.contents_ = var1.build();
            this.onChanged();
         } else {
            this.roomSecretsBuilder_.setMessage(var1.build());
         }

         this.contentsCase_ = 5;
         return this;
      }

      public DungeonUpdate.Builder mergeRoomSecrets(RoomSecrets var1) {
         if (this.roomSecretsBuilder_ == null) {
            if (this.contentsCase_ == 5 && this.contents_ != RoomSecrets.getDefaultInstance()) {
               this.contents_ = RoomSecrets.newBuilder((RoomSecrets)this.contents_).mergeFrom(var1).buildPartial();
            } else {
               this.contents_ = var1;
            }

            this.onChanged();
         } else if (this.contentsCase_ == 5) {
            this.roomSecretsBuilder_.mergeFrom(var1);
         } else {
            this.roomSecretsBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 5;
         return this;
      }

      public DungeonUpdate.Builder clearRoomSecrets() {
         if (this.roomSecretsBuilder_ == null) {
            if (this.contentsCase_ == 5) {
               this.contentsCase_ = 0;
               this.contents_ = null;
               this.onChanged();
            }
         } else {
            if (this.contentsCase_ == 5) {
               this.contentsCase_ = 0;
               this.contents_ = null;
            }

            this.roomSecretsBuilder_.clear();
         }

         return this;
      }

      public RoomSecrets.Builder getRoomSecretsBuilder() {
         return this.getRoomSecretsFieldBuilder().getBuilder();
      }

      @Override
      public RoomSecretsOrBuilder getRoomSecretsOrBuilder() {
         if (this.contentsCase_ == 5 && this.roomSecretsBuilder_ != null) {
            return this.roomSecretsBuilder_.getMessageOrBuilder();
         } else {
            return this.contentsCase_ == 5 ? (RoomSecrets)this.contents_ : RoomSecrets.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<RoomSecrets, RoomSecrets.Builder, RoomSecretsOrBuilder> getRoomSecretsFieldBuilder() {
         if (this.roomSecretsBuilder_ == null) {
            if (this.contentsCase_ != 5) {
               this.contents_ = RoomSecrets.getDefaultInstance();
            }

            this.roomSecretsBuilder_ = new SingleFieldBuilderV3<>((RoomSecrets)this.contents_, this.getParentForChildren(), this.isClean());
            this.contents_ = null;
         }

         this.contentsCase_ = 5;
         this.onChanged();
         return this.roomSecretsBuilder_;
      }

      public final DungeonUpdate.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DungeonUpdate.Builder)super.setUnknownFields(var1);
      }

      public final DungeonUpdate.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DungeonUpdate.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum ContentsCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      EARLY_IN_DOOR(1),
      EARLY_IN_ROOM(2),
      EARLY_IN_UNKNOWN(3),
      ROOM_DETECTION(4),
      ROOM_SECRETS(5),
      CONTENTS_NOT_SET(0);

      private final int value;

      ContentsCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static DungeonUpdate.ContentsCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static DungeonUpdate.ContentsCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return CONTENTS_NOT_SET;
            case 1:
               return EARLY_IN_DOOR;
            case 2:
               return EARLY_IN_ROOM;
            case 3:
               return EARLY_IN_UNKNOWN;
            case 4:
               return ROOM_DETECTION;
            case 5:
               return ROOM_SECRETS;
            default:
               return null;
         }
      }

      @Override
      public int getNumber() {
         return this.value;
      }
   }
}
