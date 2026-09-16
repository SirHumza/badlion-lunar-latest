package com.lunarclient.apollo.marker.v1;

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

public final class MarkerTarget extends GeneratedMessageV3 implements MarkerTargetOrBuilder {
   private static final long serialVersionUID = 0L;
   private int targetCase_ = 0;
   private Object target_;
   public static final int ITEM_FIELD_NUMBER = 1;
   public static final int BLOCK_FIELD_NUMBER = 2;
   public static final int ENTITY_FIELD_NUMBER = 3;
   public static final int PLAYER_FIELD_NUMBER = 4;
   private byte memoizedIsInitialized = -1;
   private static final MarkerTarget DEFAULT_INSTANCE = new MarkerTarget();
   private static final Parser<MarkerTarget> PARSER = new AbstractParser<MarkerTarget>() {
      public MarkerTarget parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         MarkerTarget.Builder var3 = MarkerTarget.newBuilder();

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

   private MarkerTarget(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private MarkerTarget() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new MarkerTarget();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_marker_v1_MarkerTarget_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_marker_v1_MarkerTarget_fieldAccessorTable
         .ensureFieldAccessorsInitialized(MarkerTarget.class, MarkerTarget.Builder.class);
   }

   @Override
   public MarkerTarget.TargetCase getTargetCase() {
      return MarkerTarget.TargetCase.forNumber(this.targetCase_);
   }

   @Override
   public boolean hasItem() {
      return this.targetCase_ == 1;
   }

   @Override
   public ItemTarget getItem() {
      return this.targetCase_ == 1 ? (ItemTarget)this.target_ : ItemTarget.getDefaultInstance();
   }

   @Override
   public ItemTargetOrBuilder getItemOrBuilder() {
      return this.targetCase_ == 1 ? (ItemTarget)this.target_ : ItemTarget.getDefaultInstance();
   }

   @Override
   public boolean hasBlock() {
      return this.targetCase_ == 2;
   }

   @Override
   public BlockTarget getBlock() {
      return this.targetCase_ == 2 ? (BlockTarget)this.target_ : BlockTarget.getDefaultInstance();
   }

   @Override
   public BlockTargetOrBuilder getBlockOrBuilder() {
      return this.targetCase_ == 2 ? (BlockTarget)this.target_ : BlockTarget.getDefaultInstance();
   }

   @Override
   public boolean hasEntity() {
      return this.targetCase_ == 3;
   }

   @Override
   public EntityTarget getEntity() {
      return this.targetCase_ == 3 ? (EntityTarget)this.target_ : EntityTarget.getDefaultInstance();
   }

   @Override
   public EntityTargetOrBuilder getEntityOrBuilder() {
      return this.targetCase_ == 3 ? (EntityTarget)this.target_ : EntityTarget.getDefaultInstance();
   }

   @Override
   public boolean hasPlayer() {
      return this.targetCase_ == 4;
   }

   @Override
   public PlayerTarget getPlayer() {
      return this.targetCase_ == 4 ? (PlayerTarget)this.target_ : PlayerTarget.getDefaultInstance();
   }

   @Override
   public PlayerTargetOrBuilder getPlayerOrBuilder() {
      return this.targetCase_ == 4 ? (PlayerTarget)this.target_ : PlayerTarget.getDefaultInstance();
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
      if (this.targetCase_ == 1) {
         var1.writeMessage(1, (ItemTarget)this.target_);
      }

      if (this.targetCase_ == 2) {
         var1.writeMessage(2, (BlockTarget)this.target_);
      }

      if (this.targetCase_ == 3) {
         var1.writeMessage(3, (EntityTarget)this.target_);
      }

      if (this.targetCase_ == 4) {
         var1.writeMessage(4, (PlayerTarget)this.target_);
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
      if (this.targetCase_ == 1) {
         var1 += CodedOutputStream.computeMessageSize(1, (ItemTarget)this.target_);
      }

      if (this.targetCase_ == 2) {
         var1 += CodedOutputStream.computeMessageSize(2, (BlockTarget)this.target_);
      }

      if (this.targetCase_ == 3) {
         var1 += CodedOutputStream.computeMessageSize(3, (EntityTarget)this.target_);
      }

      if (this.targetCase_ == 4) {
         var1 += CodedOutputStream.computeMessageSize(4, (PlayerTarget)this.target_);
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

      if (!(var1 instanceof MarkerTarget)) {
         return super.equals(var1);
      }

      MarkerTarget var2 = (MarkerTarget)var1;
      if (!this.getTargetCase().equals(var2.getTargetCase())) {
         return false;
      }

      switch (this.targetCase_) {
         case 0:
         default:
            break;
         case 1:
            if (!this.getItem().equals(var2.getItem())) {
               return false;
            }
            break;
         case 2:
            if (!this.getBlock().equals(var2.getBlock())) {
               return false;
            }
            break;
         case 3:
            if (!this.getEntity().equals(var2.getEntity())) {
               return false;
            }
            break;
         case 4:
            if (!this.getPlayer().equals(var2.getPlayer())) {
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
      switch (this.targetCase_) {
         case 0:
         default:
            break;
         case 1:
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getItem().hashCode();
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getBlock().hashCode();
            break;
         case 3:
            var1 = 37 * var1 + 3;
            var1 = 53 * var1 + this.getEntity().hashCode();
            break;
         case 4:
            var1 = 37 * var1 + 4;
            var1 = 53 * var1 + this.getPlayer().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static MarkerTarget parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static MarkerTarget parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MarkerTarget parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static MarkerTarget parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MarkerTarget parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static MarkerTarget parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MarkerTarget parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MarkerTarget parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MarkerTarget parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MarkerTarget parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MarkerTarget parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MarkerTarget parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MarkerTarget.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MarkerTarget.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MarkerTarget.Builder newBuilder(MarkerTarget var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MarkerTarget.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MarkerTarget.Builder() : new MarkerTarget.Builder().mergeFrom(this);
   }

   protected MarkerTarget.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new MarkerTarget.Builder(var1);
   }

   public static MarkerTarget getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<MarkerTarget> parser() {
      return PARSER;
   }

   @Override
   public Parser<MarkerTarget> getParserForType() {
      return PARSER;
   }

   public MarkerTarget getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<MarkerTarget.Builder> implements MarkerTargetOrBuilder {
      private int targetCase_ = 0;
      private Object target_;
      private int bitField0_;
      private SingleFieldBuilderV3<ItemTarget, ItemTarget.Builder, ItemTargetOrBuilder> itemBuilder_;
      private SingleFieldBuilderV3<BlockTarget, BlockTarget.Builder, BlockTargetOrBuilder> blockBuilder_;
      private SingleFieldBuilderV3<EntityTarget, EntityTarget.Builder, EntityTargetOrBuilder> entityBuilder_;
      private SingleFieldBuilderV3<PlayerTarget, PlayerTarget.Builder, PlayerTargetOrBuilder> playerBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_MarkerTarget_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_MarkerTarget_fieldAccessorTable
            .ensureFieldAccessorsInitialized(MarkerTarget.class, MarkerTarget.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public MarkerTarget.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.itemBuilder_ != null) {
            this.itemBuilder_.clear();
         }

         if (this.blockBuilder_ != null) {
            this.blockBuilder_.clear();
         }

         if (this.entityBuilder_ != null) {
            this.entityBuilder_.clear();
         }

         if (this.playerBuilder_ != null) {
            this.playerBuilder_.clear();
         }

         this.targetCase_ = 0;
         this.target_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_MarkerTarget_descriptor;
      }

      public MarkerTarget getDefaultInstanceForType() {
         return MarkerTarget.getDefaultInstance();
      }

      public MarkerTarget build() {
         MarkerTarget var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MarkerTarget buildPartial() {
         MarkerTarget var1 = new MarkerTarget(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(MarkerTarget var1) {
         int var2 = this.bitField0_;
      }

      private void buildPartialOneofs(MarkerTarget var1) {
         var1.targetCase_ = this.targetCase_;
         var1.target_ = this.target_;
         if (this.targetCase_ == 1 && this.itemBuilder_ != null) {
            var1.target_ = this.itemBuilder_.build();
         }

         if (this.targetCase_ == 2 && this.blockBuilder_ != null) {
            var1.target_ = this.blockBuilder_.build();
         }

         if (this.targetCase_ == 3 && this.entityBuilder_ != null) {
            var1.target_ = this.entityBuilder_.build();
         }

         if (this.targetCase_ == 4 && this.playerBuilder_ != null) {
            var1.target_ = this.playerBuilder_.build();
         }
      }

      public MarkerTarget.Builder clone() {
         return (MarkerTarget.Builder)super.clone();
      }

      public MarkerTarget.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (MarkerTarget.Builder)super.setField(var1, var2);
      }

      public MarkerTarget.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (MarkerTarget.Builder)super.clearField(var1);
      }

      public MarkerTarget.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (MarkerTarget.Builder)super.clearOneof(var1);
      }

      public MarkerTarget.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (MarkerTarget.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MarkerTarget.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (MarkerTarget.Builder)super.addRepeatedField(var1, var2);
      }

      public MarkerTarget.Builder mergeFrom(Message var1) {
         if (var1 instanceof MarkerTarget) {
            return this.mergeFrom((MarkerTarget)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public MarkerTarget.Builder mergeFrom(MarkerTarget var1) {
         if (var1 == MarkerTarget.getDefaultInstance()) {
            return this;
         }

         switch (var1.getTargetCase()) {
            case ITEM:
               this.mergeItem(var1.getItem());
               break;
            case BLOCK:
               this.mergeBlock(var1.getBlock());
               break;
            case ENTITY:
               this.mergeEntity(var1.getEntity());
               break;
            case PLAYER:
               this.mergePlayer(var1.getPlayer());
            case TARGET_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public MarkerTarget.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getItemFieldBuilder().getBuilder(), var2);
                     this.targetCase_ = 1;
                     break;
                  case 18:
                     var1.readMessage(this.getBlockFieldBuilder().getBuilder(), var2);
                     this.targetCase_ = 2;
                     break;
                  case 26:
                     var1.readMessage(this.getEntityFieldBuilder().getBuilder(), var2);
                     this.targetCase_ = 3;
                     break;
                  case 34:
                     var1.readMessage(this.getPlayerFieldBuilder().getBuilder(), var2);
                     this.targetCase_ = 4;
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
      public MarkerTarget.TargetCase getTargetCase() {
         return MarkerTarget.TargetCase.forNumber(this.targetCase_);
      }

      public MarkerTarget.Builder clearTarget() {
         this.targetCase_ = 0;
         this.target_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasItem() {
         return this.targetCase_ == 1;
      }

      @Override
      public ItemTarget getItem() {
         if (this.itemBuilder_ == null) {
            return this.targetCase_ == 1 ? (ItemTarget)this.target_ : ItemTarget.getDefaultInstance();
         } else {
            return this.targetCase_ == 1 ? this.itemBuilder_.getMessage() : ItemTarget.getDefaultInstance();
         }
      }

      public MarkerTarget.Builder setItem(ItemTarget var1) {
         if (this.itemBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.target_ = var1;
            this.onChanged();
         } else {
            this.itemBuilder_.setMessage(var1);
         }

         this.targetCase_ = 1;
         return this;
      }

      public MarkerTarget.Builder setItem(ItemTarget.Builder var1) {
         if (this.itemBuilder_ == null) {
            this.target_ = var1.build();
            this.onChanged();
         } else {
            this.itemBuilder_.setMessage(var1.build());
         }

         this.targetCase_ = 1;
         return this;
      }

      public MarkerTarget.Builder mergeItem(ItemTarget var1) {
         if (this.itemBuilder_ == null) {
            if (this.targetCase_ == 1 && this.target_ != ItemTarget.getDefaultInstance()) {
               this.target_ = ItemTarget.newBuilder((ItemTarget)this.target_).mergeFrom(var1).buildPartial();
            } else {
               this.target_ = var1;
            }

            this.onChanged();
         } else if (this.targetCase_ == 1) {
            this.itemBuilder_.mergeFrom(var1);
         } else {
            this.itemBuilder_.setMessage(var1);
         }

         this.targetCase_ = 1;
         return this;
      }

      public MarkerTarget.Builder clearItem() {
         if (this.itemBuilder_ == null) {
            if (this.targetCase_ == 1) {
               this.targetCase_ = 0;
               this.target_ = null;
               this.onChanged();
            }
         } else {
            if (this.targetCase_ == 1) {
               this.targetCase_ = 0;
               this.target_ = null;
            }

            this.itemBuilder_.clear();
         }

         return this;
      }

      public ItemTarget.Builder getItemBuilder() {
         return this.getItemFieldBuilder().getBuilder();
      }

      @Override
      public ItemTargetOrBuilder getItemOrBuilder() {
         if (this.targetCase_ == 1 && this.itemBuilder_ != null) {
            return this.itemBuilder_.getMessageOrBuilder();
         } else {
            return this.targetCase_ == 1 ? (ItemTarget)this.target_ : ItemTarget.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<ItemTarget, ItemTarget.Builder, ItemTargetOrBuilder> getItemFieldBuilder() {
         if (this.itemBuilder_ == null) {
            if (this.targetCase_ != 1) {
               this.target_ = ItemTarget.getDefaultInstance();
            }

            this.itemBuilder_ = new SingleFieldBuilderV3<>((ItemTarget)this.target_, this.getParentForChildren(), this.isClean());
            this.target_ = null;
         }

         this.targetCase_ = 1;
         this.onChanged();
         return this.itemBuilder_;
      }

      @Override
      public boolean hasBlock() {
         return this.targetCase_ == 2;
      }

      @Override
      public BlockTarget getBlock() {
         if (this.blockBuilder_ == null) {
            return this.targetCase_ == 2 ? (BlockTarget)this.target_ : BlockTarget.getDefaultInstance();
         } else {
            return this.targetCase_ == 2 ? this.blockBuilder_.getMessage() : BlockTarget.getDefaultInstance();
         }
      }

      public MarkerTarget.Builder setBlock(BlockTarget var1) {
         if (this.blockBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.target_ = var1;
            this.onChanged();
         } else {
            this.blockBuilder_.setMessage(var1);
         }

         this.targetCase_ = 2;
         return this;
      }

      public MarkerTarget.Builder setBlock(BlockTarget.Builder var1) {
         if (this.blockBuilder_ == null) {
            this.target_ = var1.build();
            this.onChanged();
         } else {
            this.blockBuilder_.setMessage(var1.build());
         }

         this.targetCase_ = 2;
         return this;
      }

      public MarkerTarget.Builder mergeBlock(BlockTarget var1) {
         if (this.blockBuilder_ == null) {
            if (this.targetCase_ == 2 && this.target_ != BlockTarget.getDefaultInstance()) {
               this.target_ = BlockTarget.newBuilder((BlockTarget)this.target_).mergeFrom(var1).buildPartial();
            } else {
               this.target_ = var1;
            }

            this.onChanged();
         } else if (this.targetCase_ == 2) {
            this.blockBuilder_.mergeFrom(var1);
         } else {
            this.blockBuilder_.setMessage(var1);
         }

         this.targetCase_ = 2;
         return this;
      }

      public MarkerTarget.Builder clearBlock() {
         if (this.blockBuilder_ == null) {
            if (this.targetCase_ == 2) {
               this.targetCase_ = 0;
               this.target_ = null;
               this.onChanged();
            }
         } else {
            if (this.targetCase_ == 2) {
               this.targetCase_ = 0;
               this.target_ = null;
            }

            this.blockBuilder_.clear();
         }

         return this;
      }

      public BlockTarget.Builder getBlockBuilder() {
         return this.getBlockFieldBuilder().getBuilder();
      }

      @Override
      public BlockTargetOrBuilder getBlockOrBuilder() {
         if (this.targetCase_ == 2 && this.blockBuilder_ != null) {
            return this.blockBuilder_.getMessageOrBuilder();
         } else {
            return this.targetCase_ == 2 ? (BlockTarget)this.target_ : BlockTarget.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<BlockTarget, BlockTarget.Builder, BlockTargetOrBuilder> getBlockFieldBuilder() {
         if (this.blockBuilder_ == null) {
            if (this.targetCase_ != 2) {
               this.target_ = BlockTarget.getDefaultInstance();
            }

            this.blockBuilder_ = new SingleFieldBuilderV3<>((BlockTarget)this.target_, this.getParentForChildren(), this.isClean());
            this.target_ = null;
         }

         this.targetCase_ = 2;
         this.onChanged();
         return this.blockBuilder_;
      }

      @Override
      public boolean hasEntity() {
         return this.targetCase_ == 3;
      }

      @Override
      public EntityTarget getEntity() {
         if (this.entityBuilder_ == null) {
            return this.targetCase_ == 3 ? (EntityTarget)this.target_ : EntityTarget.getDefaultInstance();
         } else {
            return this.targetCase_ == 3 ? this.entityBuilder_.getMessage() : EntityTarget.getDefaultInstance();
         }
      }

      public MarkerTarget.Builder setEntity(EntityTarget var1) {
         if (this.entityBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.target_ = var1;
            this.onChanged();
         } else {
            this.entityBuilder_.setMessage(var1);
         }

         this.targetCase_ = 3;
         return this;
      }

      public MarkerTarget.Builder setEntity(EntityTarget.Builder var1) {
         if (this.entityBuilder_ == null) {
            this.target_ = var1.build();
            this.onChanged();
         } else {
            this.entityBuilder_.setMessage(var1.build());
         }

         this.targetCase_ = 3;
         return this;
      }

      public MarkerTarget.Builder mergeEntity(EntityTarget var1) {
         if (this.entityBuilder_ == null) {
            if (this.targetCase_ == 3 && this.target_ != EntityTarget.getDefaultInstance()) {
               this.target_ = EntityTarget.newBuilder((EntityTarget)this.target_).mergeFrom(var1).buildPartial();
            } else {
               this.target_ = var1;
            }

            this.onChanged();
         } else if (this.targetCase_ == 3) {
            this.entityBuilder_.mergeFrom(var1);
         } else {
            this.entityBuilder_.setMessage(var1);
         }

         this.targetCase_ = 3;
         return this;
      }

      public MarkerTarget.Builder clearEntity() {
         if (this.entityBuilder_ == null) {
            if (this.targetCase_ == 3) {
               this.targetCase_ = 0;
               this.target_ = null;
               this.onChanged();
            }
         } else {
            if (this.targetCase_ == 3) {
               this.targetCase_ = 0;
               this.target_ = null;
            }

            this.entityBuilder_.clear();
         }

         return this;
      }

      public EntityTarget.Builder getEntityBuilder() {
         return this.getEntityFieldBuilder().getBuilder();
      }

      @Override
      public EntityTargetOrBuilder getEntityOrBuilder() {
         if (this.targetCase_ == 3 && this.entityBuilder_ != null) {
            return this.entityBuilder_.getMessageOrBuilder();
         } else {
            return this.targetCase_ == 3 ? (EntityTarget)this.target_ : EntityTarget.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<EntityTarget, EntityTarget.Builder, EntityTargetOrBuilder> getEntityFieldBuilder() {
         if (this.entityBuilder_ == null) {
            if (this.targetCase_ != 3) {
               this.target_ = EntityTarget.getDefaultInstance();
            }

            this.entityBuilder_ = new SingleFieldBuilderV3<>((EntityTarget)this.target_, this.getParentForChildren(), this.isClean());
            this.target_ = null;
         }

         this.targetCase_ = 3;
         this.onChanged();
         return this.entityBuilder_;
      }

      @Override
      public boolean hasPlayer() {
         return this.targetCase_ == 4;
      }

      @Override
      public PlayerTarget getPlayer() {
         if (this.playerBuilder_ == null) {
            return this.targetCase_ == 4 ? (PlayerTarget)this.target_ : PlayerTarget.getDefaultInstance();
         } else {
            return this.targetCase_ == 4 ? this.playerBuilder_.getMessage() : PlayerTarget.getDefaultInstance();
         }
      }

      public MarkerTarget.Builder setPlayer(PlayerTarget var1) {
         if (this.playerBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.target_ = var1;
            this.onChanged();
         } else {
            this.playerBuilder_.setMessage(var1);
         }

         this.targetCase_ = 4;
         return this;
      }

      public MarkerTarget.Builder setPlayer(PlayerTarget.Builder var1) {
         if (this.playerBuilder_ == null) {
            this.target_ = var1.build();
            this.onChanged();
         } else {
            this.playerBuilder_.setMessage(var1.build());
         }

         this.targetCase_ = 4;
         return this;
      }

      public MarkerTarget.Builder mergePlayer(PlayerTarget var1) {
         if (this.playerBuilder_ == null) {
            if (this.targetCase_ == 4 && this.target_ != PlayerTarget.getDefaultInstance()) {
               this.target_ = PlayerTarget.newBuilder((PlayerTarget)this.target_).mergeFrom(var1).buildPartial();
            } else {
               this.target_ = var1;
            }

            this.onChanged();
         } else if (this.targetCase_ == 4) {
            this.playerBuilder_.mergeFrom(var1);
         } else {
            this.playerBuilder_.setMessage(var1);
         }

         this.targetCase_ = 4;
         return this;
      }

      public MarkerTarget.Builder clearPlayer() {
         if (this.playerBuilder_ == null) {
            if (this.targetCase_ == 4) {
               this.targetCase_ = 0;
               this.target_ = null;
               this.onChanged();
            }
         } else {
            if (this.targetCase_ == 4) {
               this.targetCase_ = 0;
               this.target_ = null;
            }

            this.playerBuilder_.clear();
         }

         return this;
      }

      public PlayerTarget.Builder getPlayerBuilder() {
         return this.getPlayerFieldBuilder().getBuilder();
      }

      @Override
      public PlayerTargetOrBuilder getPlayerOrBuilder() {
         if (this.targetCase_ == 4 && this.playerBuilder_ != null) {
            return this.playerBuilder_.getMessageOrBuilder();
         } else {
            return this.targetCase_ == 4 ? (PlayerTarget)this.target_ : PlayerTarget.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<PlayerTarget, PlayerTarget.Builder, PlayerTargetOrBuilder> getPlayerFieldBuilder() {
         if (this.playerBuilder_ == null) {
            if (this.targetCase_ != 4) {
               this.target_ = PlayerTarget.getDefaultInstance();
            }

            this.playerBuilder_ = new SingleFieldBuilderV3<>((PlayerTarget)this.target_, this.getParentForChildren(), this.isClean());
            this.target_ = null;
         }

         this.targetCase_ = 4;
         this.onChanged();
         return this.playerBuilder_;
      }

      public final MarkerTarget.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MarkerTarget.Builder)super.setUnknownFields(var1);
      }

      public final MarkerTarget.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MarkerTarget.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum TargetCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      ITEM(1),
      BLOCK(2),
      ENTITY(3),
      PLAYER(4),
      TARGET_NOT_SET(0);

      private final int value;

      TargetCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static MarkerTarget.TargetCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static MarkerTarget.TargetCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return TARGET_NOT_SET;
            case 1:
               return ITEM;
            case 2:
               return BLOCK;
            case 3:
               return ENTITY;
            case 4:
               return PLAYER;
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
