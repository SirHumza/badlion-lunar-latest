package com.lunarclient.websocket.skyblock.v1;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.Vector2i;
import com.lunarclient.common.v1.Vector2iOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class EarlyInRoom extends GeneratedMessageV3 implements EarlyInRoomOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int COMPONENTS_FIELD_NUMBER = 1;
   private List<Vector2i> components_;
   public static final int TYPE_FIELD_NUMBER = 2;
   private int type_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final EarlyInRoom DEFAULT_INSTANCE = new EarlyInRoom();
   private static final Parser<EarlyInRoom> PARSER = new AbstractParser<EarlyInRoom>() {
      public EarlyInRoom parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EarlyInRoom.Builder var3 = EarlyInRoom.newBuilder();

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

   private EarlyInRoom(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EarlyInRoom() {
      this.components_ = Collections.emptyList();
      this.type_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EarlyInRoom();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_EarlyInRoom_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_EarlyInRoom_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EarlyInRoom.class, EarlyInRoom.Builder.class);
   }

   @Override
   public List<Vector2i> getComponentsList() {
      return this.components_;
   }

   @Override
   public List<? extends Vector2iOrBuilder> getComponentsOrBuilderList() {
      return this.components_;
   }

   @Override
   public int getComponentsCount() {
      return this.components_.size();
   }

   @Override
   public Vector2i getComponents(int var1) {
      return this.components_.get(var1);
   }

   @Override
   public Vector2iOrBuilder getComponentsOrBuilder(int var1) {
      return this.components_.get(var1);
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
      for (int var2 = 0; var2 < this.components_.size(); var2++) {
         var1.writeMessage(1, this.components_.get(var2));
      }

      if (this.type_ != DungeonRoomType.DUNGEON_ROOM_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(2, this.type_);
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

      for (int var2 = 0; var2 < this.components_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.components_.get(var2));
      }

      if (this.type_ != DungeonRoomType.DUNGEON_ROOM_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(2, this.type_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof EarlyInRoom)) {
         return super.equals(var1);
      } else {
         EarlyInRoom var2 = (EarlyInRoom)var1;
         if (!this.getComponentsList().equals(var2.getComponentsList())) {
            return false;
         } else {
            return this.type_ != var2.type_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.getComponentsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getComponentsList().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.type_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EarlyInRoom parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EarlyInRoom parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EarlyInRoom parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EarlyInRoom parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EarlyInRoom parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EarlyInRoom parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EarlyInRoom parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EarlyInRoom parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EarlyInRoom parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EarlyInRoom parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EarlyInRoom parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EarlyInRoom parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EarlyInRoom.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EarlyInRoom.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EarlyInRoom.Builder newBuilder(EarlyInRoom var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EarlyInRoom.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EarlyInRoom.Builder() : new EarlyInRoom.Builder().mergeFrom(this);
   }

   protected EarlyInRoom.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EarlyInRoom.Builder(var1);
   }

   public static EarlyInRoom getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EarlyInRoom> parser() {
      return PARSER;
   }

   @Override
   public Parser<EarlyInRoom> getParserForType() {
      return PARSER;
   }

   public EarlyInRoom getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EarlyInRoom.Builder> implements EarlyInRoomOrBuilder {
      private int bitField0_;
      private List<Vector2i> components_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<Vector2i, Vector2i.Builder, Vector2iOrBuilder> componentsBuilder_;
      private int type_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_EarlyInRoom_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_EarlyInRoom_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EarlyInRoom.class, EarlyInRoom.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public EarlyInRoom.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.componentsBuilder_ == null) {
            this.components_ = Collections.emptyList();
         } else {
            this.components_ = null;
            this.componentsBuilder_.clear();
         }

         this.bitField0_ &= -2;
         this.type_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_EarlyInRoom_descriptor;
      }

      public EarlyInRoom getDefaultInstanceForType() {
         return EarlyInRoom.getDefaultInstance();
      }

      public EarlyInRoom build() {
         EarlyInRoom var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EarlyInRoom buildPartial() {
         EarlyInRoom var1 = new EarlyInRoom(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(EarlyInRoom var1) {
         if (this.componentsBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.components_ = Collections.unmodifiableList(this.components_);
               this.bitField0_ &= -2;
            }

            var1.components_ = this.components_;
         } else {
            var1.components_ = this.componentsBuilder_.build();
         }
      }

      private void buildPartial0(EarlyInRoom var1) {
         int var2 = this.bitField0_;
         if ((var2 & 2) != 0) {
            var1.type_ = this.type_;
         }
      }

      public EarlyInRoom.Builder clone() {
         return (EarlyInRoom.Builder)super.clone();
      }

      public EarlyInRoom.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EarlyInRoom.Builder)super.setField(var1, var2);
      }

      public EarlyInRoom.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EarlyInRoom.Builder)super.clearField(var1);
      }

      public EarlyInRoom.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EarlyInRoom.Builder)super.clearOneof(var1);
      }

      public EarlyInRoom.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EarlyInRoom.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EarlyInRoom.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EarlyInRoom.Builder)super.addRepeatedField(var1, var2);
      }

      public EarlyInRoom.Builder mergeFrom(Message var1) {
         if (var1 instanceof EarlyInRoom) {
            return this.mergeFrom((EarlyInRoom)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EarlyInRoom.Builder mergeFrom(EarlyInRoom var1) {
         if (var1 == EarlyInRoom.getDefaultInstance()) {
            return this;
         }

         if (this.componentsBuilder_ == null) {
            if (!var1.components_.isEmpty()) {
               if (this.components_.isEmpty()) {
                  this.components_ = var1.components_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureComponentsIsMutable();
                  this.components_.addAll(var1.components_);
               }

               this.onChanged();
            }
         } else if (!var1.components_.isEmpty()) {
            if (this.componentsBuilder_.isEmpty()) {
               this.componentsBuilder_.dispose();
               this.componentsBuilder_ = null;
               this.components_ = var1.components_;
               this.bitField0_ &= -2;
               this.componentsBuilder_ = EarlyInRoom.alwaysUseFieldBuilders ? this.getComponentsFieldBuilder() : null;
            } else {
               this.componentsBuilder_.addAllMessages(var1.components_);
            }
         }

         if (var1.type_ != 0) {
            this.setTypeValue(var1.getTypeValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public EarlyInRoom.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     Vector2i var5 = var1.readMessage(Vector2i.parser(), var2);
                     if (this.componentsBuilder_ == null) {
                        this.ensureComponentsIsMutable();
                        this.components_.add(var5);
                     } else {
                        this.componentsBuilder_.addMessage(var5);
                     }
                     break;
                  case 16:
                     this.type_ = var1.readEnum();
                     this.bitField0_ |= 2;
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var9) {
            throw var9.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      private void ensureComponentsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.components_ = new ArrayList<>(this.components_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<Vector2i> getComponentsList() {
         return this.componentsBuilder_ == null ? Collections.unmodifiableList(this.components_) : this.componentsBuilder_.getMessageList();
      }

      @Override
      public int getComponentsCount() {
         return this.componentsBuilder_ == null ? this.components_.size() : this.componentsBuilder_.getCount();
      }

      @Override
      public Vector2i getComponents(int var1) {
         return this.componentsBuilder_ == null ? this.components_.get(var1) : this.componentsBuilder_.getMessage(var1);
      }

      public EarlyInRoom.Builder setComponents(int var1, Vector2i var2) {
         if (this.componentsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureComponentsIsMutable();
            this.components_.set(var1, var2);
            this.onChanged();
         } else {
            this.componentsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public EarlyInRoom.Builder setComponents(int var1, Vector2i.Builder var2) {
         if (this.componentsBuilder_ == null) {
            this.ensureComponentsIsMutable();
            this.components_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.componentsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public EarlyInRoom.Builder addComponents(Vector2i var1) {
         if (this.componentsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureComponentsIsMutable();
            this.components_.add(var1);
            this.onChanged();
         } else {
            this.componentsBuilder_.addMessage(var1);
         }

         return this;
      }

      public EarlyInRoom.Builder addComponents(int var1, Vector2i var2) {
         if (this.componentsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureComponentsIsMutable();
            this.components_.add(var1, var2);
            this.onChanged();
         } else {
            this.componentsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public EarlyInRoom.Builder addComponents(Vector2i.Builder var1) {
         if (this.componentsBuilder_ == null) {
            this.ensureComponentsIsMutable();
            this.components_.add(var1.build());
            this.onChanged();
         } else {
            this.componentsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public EarlyInRoom.Builder addComponents(int var1, Vector2i.Builder var2) {
         if (this.componentsBuilder_ == null) {
            this.ensureComponentsIsMutable();
            this.components_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.componentsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public EarlyInRoom.Builder addAllComponents(Iterable<? extends Vector2i> var1) {
         if (this.componentsBuilder_ == null) {
            this.ensureComponentsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.components_);
            this.onChanged();
         } else {
            this.componentsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public EarlyInRoom.Builder clearComponents() {
         if (this.componentsBuilder_ == null) {
            this.components_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.componentsBuilder_.clear();
         }

         return this;
      }

      public EarlyInRoom.Builder removeComponents(int var1) {
         if (this.componentsBuilder_ == null) {
            this.ensureComponentsIsMutable();
            this.components_.remove(var1);
            this.onChanged();
         } else {
            this.componentsBuilder_.remove(var1);
         }

         return this;
      }

      public Vector2i.Builder getComponentsBuilder(int var1) {
         return this.getComponentsFieldBuilder().getBuilder(var1);
      }

      @Override
      public Vector2iOrBuilder getComponentsOrBuilder(int var1) {
         return this.componentsBuilder_ == null ? this.components_.get(var1) : this.componentsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends Vector2iOrBuilder> getComponentsOrBuilderList() {
         return this.componentsBuilder_ != null ? this.componentsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.components_);
      }

      public Vector2i.Builder addComponentsBuilder() {
         return this.getComponentsFieldBuilder().addBuilder(Vector2i.getDefaultInstance());
      }

      public Vector2i.Builder addComponentsBuilder(int var1) {
         return this.getComponentsFieldBuilder().addBuilder(var1, Vector2i.getDefaultInstance());
      }

      public List<Vector2i.Builder> getComponentsBuilderList() {
         return this.getComponentsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<Vector2i, Vector2i.Builder, Vector2iOrBuilder> getComponentsFieldBuilder() {
         if (this.componentsBuilder_ == null) {
            this.componentsBuilder_ = new RepeatedFieldBuilderV3<>(this.components_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.components_ = null;
         }

         return this.componentsBuilder_;
      }

      @Override
      public int getTypeValue() {
         return this.type_;
      }

      public EarlyInRoom.Builder setTypeValue(int var1) {
         this.type_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public DungeonRoomType getType() {
         DungeonRoomType var1 = DungeonRoomType.forNumber(this.type_);
         return var1 == null ? DungeonRoomType.UNRECOGNIZED : var1;
      }

      public EarlyInRoom.Builder setType(DungeonRoomType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.type_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public EarlyInRoom.Builder clearType() {
         this.bitField0_ &= -3;
         this.type_ = 0;
         this.onChanged();
         return this;
      }

      public final EarlyInRoom.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EarlyInRoom.Builder)super.setUnknownFields(var1);
      }

      public final EarlyInRoom.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EarlyInRoom.Builder)super.mergeUnknownFields(var1);
      }
   }
}
