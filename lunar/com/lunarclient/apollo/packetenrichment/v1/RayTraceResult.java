package com.lunarclient.apollo.packetenrichment.v1;

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

public final class RayTraceResult extends GeneratedMessageV3 implements RayTraceResultOrBuilder {
   private static final long serialVersionUID = 0L;
   private int hitCase_ = 0;
   private Object hit_;
   public static final int BLOCK_FIELD_NUMBER = 1;
   public static final int ENTITY_FIELD_NUMBER = 2;
   public static final int MISS_FIELD_NUMBER = 3;
   private byte memoizedIsInitialized = -1;
   private static final RayTraceResult DEFAULT_INSTANCE = new RayTraceResult();
   private static final Parser<RayTraceResult> PARSER = new AbstractParser<RayTraceResult>() {
      public RayTraceResult parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RayTraceResult.Builder var3 = RayTraceResult.newBuilder();

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

   private RayTraceResult(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RayTraceResult() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RayTraceResult();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return RaytraceProto.internal_static_lunarclient_apollo_packetenrichment_v1_RayTraceResult_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return RaytraceProto.internal_static_lunarclient_apollo_packetenrichment_v1_RayTraceResult_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RayTraceResult.class, RayTraceResult.Builder.class);
   }

   @Override
   public RayTraceResult.HitCase getHitCase() {
      return RayTraceResult.HitCase.forNumber(this.hitCase_);
   }

   @Override
   public boolean hasBlock() {
      return this.hitCase_ == 1;
   }

   @Override
   public BlockHit getBlock() {
      return this.hitCase_ == 1 ? (BlockHit)this.hit_ : BlockHit.getDefaultInstance();
   }

   @Override
   public BlockHitOrBuilder getBlockOrBuilder() {
      return this.hitCase_ == 1 ? (BlockHit)this.hit_ : BlockHit.getDefaultInstance();
   }

   @Override
   public boolean hasEntity() {
      return this.hitCase_ == 2;
   }

   @Override
   public EntityHit getEntity() {
      return this.hitCase_ == 2 ? (EntityHit)this.hit_ : EntityHit.getDefaultInstance();
   }

   @Override
   public EntityHitOrBuilder getEntityOrBuilder() {
      return this.hitCase_ == 2 ? (EntityHit)this.hit_ : EntityHit.getDefaultInstance();
   }

   @Override
   public boolean hasMiss() {
      return this.hitCase_ == 3;
   }

   @Override
   public Miss getMiss() {
      return this.hitCase_ == 3 ? (Miss)this.hit_ : Miss.getDefaultInstance();
   }

   @Override
   public MissOrBuilder getMissOrBuilder() {
      return this.hitCase_ == 3 ? (Miss)this.hit_ : Miss.getDefaultInstance();
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
      if (this.hitCase_ == 1) {
         var1.writeMessage(1, (BlockHit)this.hit_);
      }

      if (this.hitCase_ == 2) {
         var1.writeMessage(2, (EntityHit)this.hit_);
      }

      if (this.hitCase_ == 3) {
         var1.writeMessage(3, (Miss)this.hit_);
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
      if (this.hitCase_ == 1) {
         var1 += CodedOutputStream.computeMessageSize(1, (BlockHit)this.hit_);
      }

      if (this.hitCase_ == 2) {
         var1 += CodedOutputStream.computeMessageSize(2, (EntityHit)this.hit_);
      }

      if (this.hitCase_ == 3) {
         var1 += CodedOutputStream.computeMessageSize(3, (Miss)this.hit_);
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

      if (!(var1 instanceof RayTraceResult)) {
         return super.equals(var1);
      }

      RayTraceResult var2 = (RayTraceResult)var1;
      if (!this.getHitCase().equals(var2.getHitCase())) {
         return false;
      }

      switch (this.hitCase_) {
         case 0:
         default:
            break;
         case 1:
            if (!this.getBlock().equals(var2.getBlock())) {
               return false;
            }
            break;
         case 2:
            if (!this.getEntity().equals(var2.getEntity())) {
               return false;
            }
            break;
         case 3:
            if (!this.getMiss().equals(var2.getMiss())) {
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
      switch (this.hitCase_) {
         case 0:
         default:
            break;
         case 1:
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getBlock().hashCode();
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getEntity().hashCode();
            break;
         case 3:
            var1 = 37 * var1 + 3;
            var1 = 53 * var1 + this.getMiss().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RayTraceResult parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RayTraceResult parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RayTraceResult parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RayTraceResult parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RayTraceResult parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RayTraceResult parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RayTraceResult parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RayTraceResult parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RayTraceResult parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RayTraceResult parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RayTraceResult parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RayTraceResult parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RayTraceResult.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RayTraceResult.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RayTraceResult.Builder newBuilder(RayTraceResult var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RayTraceResult.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RayTraceResult.Builder() : new RayTraceResult.Builder().mergeFrom(this);
   }

   protected RayTraceResult.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RayTraceResult.Builder(var1);
   }

   public static RayTraceResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RayTraceResult> parser() {
      return PARSER;
   }

   @Override
   public Parser<RayTraceResult> getParserForType() {
      return PARSER;
   }

   public RayTraceResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RayTraceResult.Builder> implements RayTraceResultOrBuilder {
      private int hitCase_ = 0;
      private Object hit_;
      private int bitField0_;
      private SingleFieldBuilderV3<BlockHit, BlockHit.Builder, BlockHitOrBuilder> blockBuilder_;
      private SingleFieldBuilderV3<EntityHit, EntityHit.Builder, EntityHitOrBuilder> entityBuilder_;
      private SingleFieldBuilderV3<Miss, Miss.Builder, MissOrBuilder> missBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return RaytraceProto.internal_static_lunarclient_apollo_packetenrichment_v1_RayTraceResult_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RaytraceProto.internal_static_lunarclient_apollo_packetenrichment_v1_RayTraceResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RayTraceResult.class, RayTraceResult.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RayTraceResult.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.blockBuilder_ != null) {
            this.blockBuilder_.clear();
         }

         if (this.entityBuilder_ != null) {
            this.entityBuilder_.clear();
         }

         if (this.missBuilder_ != null) {
            this.missBuilder_.clear();
         }

         this.hitCase_ = 0;
         this.hit_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return RaytraceProto.internal_static_lunarclient_apollo_packetenrichment_v1_RayTraceResult_descriptor;
      }

      public RayTraceResult getDefaultInstanceForType() {
         return RayTraceResult.getDefaultInstance();
      }

      public RayTraceResult build() {
         RayTraceResult var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RayTraceResult buildPartial() {
         RayTraceResult var1 = new RayTraceResult(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RayTraceResult var1) {
         int var2 = this.bitField0_;
      }

      private void buildPartialOneofs(RayTraceResult var1) {
         var1.hitCase_ = this.hitCase_;
         var1.hit_ = this.hit_;
         if (this.hitCase_ == 1 && this.blockBuilder_ != null) {
            var1.hit_ = this.blockBuilder_.build();
         }

         if (this.hitCase_ == 2 && this.entityBuilder_ != null) {
            var1.hit_ = this.entityBuilder_.build();
         }

         if (this.hitCase_ == 3 && this.missBuilder_ != null) {
            var1.hit_ = this.missBuilder_.build();
         }
      }

      public RayTraceResult.Builder clone() {
         return (RayTraceResult.Builder)super.clone();
      }

      public RayTraceResult.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RayTraceResult.Builder)super.setField(var1, var2);
      }

      public RayTraceResult.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RayTraceResult.Builder)super.clearField(var1);
      }

      public RayTraceResult.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RayTraceResult.Builder)super.clearOneof(var1);
      }

      public RayTraceResult.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RayTraceResult.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RayTraceResult.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RayTraceResult.Builder)super.addRepeatedField(var1, var2);
      }

      public RayTraceResult.Builder mergeFrom(Message var1) {
         if (var1 instanceof RayTraceResult) {
            return this.mergeFrom((RayTraceResult)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RayTraceResult.Builder mergeFrom(RayTraceResult var1) {
         if (var1 == RayTraceResult.getDefaultInstance()) {
            return this;
         }

         switch (var1.getHitCase()) {
            case BLOCK:
               this.mergeBlock(var1.getBlock());
               break;
            case ENTITY:
               this.mergeEntity(var1.getEntity());
               break;
            case MISS:
               this.mergeMiss(var1.getMiss());
            case HIT_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RayTraceResult.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getBlockFieldBuilder().getBuilder(), var2);
                     this.hitCase_ = 1;
                     break;
                  case 18:
                     var1.readMessage(this.getEntityFieldBuilder().getBuilder(), var2);
                     this.hitCase_ = 2;
                     break;
                  case 26:
                     var1.readMessage(this.getMissFieldBuilder().getBuilder(), var2);
                     this.hitCase_ = 3;
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
      public RayTraceResult.HitCase getHitCase() {
         return RayTraceResult.HitCase.forNumber(this.hitCase_);
      }

      public RayTraceResult.Builder clearHit() {
         this.hitCase_ = 0;
         this.hit_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasBlock() {
         return this.hitCase_ == 1;
      }

      @Override
      public BlockHit getBlock() {
         if (this.blockBuilder_ == null) {
            return this.hitCase_ == 1 ? (BlockHit)this.hit_ : BlockHit.getDefaultInstance();
         } else {
            return this.hitCase_ == 1 ? this.blockBuilder_.getMessage() : BlockHit.getDefaultInstance();
         }
      }

      public RayTraceResult.Builder setBlock(BlockHit var1) {
         if (this.blockBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.hit_ = var1;
            this.onChanged();
         } else {
            this.blockBuilder_.setMessage(var1);
         }

         this.hitCase_ = 1;
         return this;
      }

      public RayTraceResult.Builder setBlock(BlockHit.Builder var1) {
         if (this.blockBuilder_ == null) {
            this.hit_ = var1.build();
            this.onChanged();
         } else {
            this.blockBuilder_.setMessage(var1.build());
         }

         this.hitCase_ = 1;
         return this;
      }

      public RayTraceResult.Builder mergeBlock(BlockHit var1) {
         if (this.blockBuilder_ == null) {
            if (this.hitCase_ == 1 && this.hit_ != BlockHit.getDefaultInstance()) {
               this.hit_ = BlockHit.newBuilder((BlockHit)this.hit_).mergeFrom(var1).buildPartial();
            } else {
               this.hit_ = var1;
            }

            this.onChanged();
         } else if (this.hitCase_ == 1) {
            this.blockBuilder_.mergeFrom(var1);
         } else {
            this.blockBuilder_.setMessage(var1);
         }

         this.hitCase_ = 1;
         return this;
      }

      public RayTraceResult.Builder clearBlock() {
         if (this.blockBuilder_ == null) {
            if (this.hitCase_ == 1) {
               this.hitCase_ = 0;
               this.hit_ = null;
               this.onChanged();
            }
         } else {
            if (this.hitCase_ == 1) {
               this.hitCase_ = 0;
               this.hit_ = null;
            }

            this.blockBuilder_.clear();
         }

         return this;
      }

      public BlockHit.Builder getBlockBuilder() {
         return this.getBlockFieldBuilder().getBuilder();
      }

      @Override
      public BlockHitOrBuilder getBlockOrBuilder() {
         if (this.hitCase_ == 1 && this.blockBuilder_ != null) {
            return this.blockBuilder_.getMessageOrBuilder();
         } else {
            return this.hitCase_ == 1 ? (BlockHit)this.hit_ : BlockHit.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<BlockHit, BlockHit.Builder, BlockHitOrBuilder> getBlockFieldBuilder() {
         if (this.blockBuilder_ == null) {
            if (this.hitCase_ != 1) {
               this.hit_ = BlockHit.getDefaultInstance();
            }

            this.blockBuilder_ = new SingleFieldBuilderV3<>((BlockHit)this.hit_, this.getParentForChildren(), this.isClean());
            this.hit_ = null;
         }

         this.hitCase_ = 1;
         this.onChanged();
         return this.blockBuilder_;
      }

      @Override
      public boolean hasEntity() {
         return this.hitCase_ == 2;
      }

      @Override
      public EntityHit getEntity() {
         if (this.entityBuilder_ == null) {
            return this.hitCase_ == 2 ? (EntityHit)this.hit_ : EntityHit.getDefaultInstance();
         } else {
            return this.hitCase_ == 2 ? this.entityBuilder_.getMessage() : EntityHit.getDefaultInstance();
         }
      }

      public RayTraceResult.Builder setEntity(EntityHit var1) {
         if (this.entityBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.hit_ = var1;
            this.onChanged();
         } else {
            this.entityBuilder_.setMessage(var1);
         }

         this.hitCase_ = 2;
         return this;
      }

      public RayTraceResult.Builder setEntity(EntityHit.Builder var1) {
         if (this.entityBuilder_ == null) {
            this.hit_ = var1.build();
            this.onChanged();
         } else {
            this.entityBuilder_.setMessage(var1.build());
         }

         this.hitCase_ = 2;
         return this;
      }

      public RayTraceResult.Builder mergeEntity(EntityHit var1) {
         if (this.entityBuilder_ == null) {
            if (this.hitCase_ == 2 && this.hit_ != EntityHit.getDefaultInstance()) {
               this.hit_ = EntityHit.newBuilder((EntityHit)this.hit_).mergeFrom(var1).buildPartial();
            } else {
               this.hit_ = var1;
            }

            this.onChanged();
         } else if (this.hitCase_ == 2) {
            this.entityBuilder_.mergeFrom(var1);
         } else {
            this.entityBuilder_.setMessage(var1);
         }

         this.hitCase_ = 2;
         return this;
      }

      public RayTraceResult.Builder clearEntity() {
         if (this.entityBuilder_ == null) {
            if (this.hitCase_ == 2) {
               this.hitCase_ = 0;
               this.hit_ = null;
               this.onChanged();
            }
         } else {
            if (this.hitCase_ == 2) {
               this.hitCase_ = 0;
               this.hit_ = null;
            }

            this.entityBuilder_.clear();
         }

         return this;
      }

      public EntityHit.Builder getEntityBuilder() {
         return this.getEntityFieldBuilder().getBuilder();
      }

      @Override
      public EntityHitOrBuilder getEntityOrBuilder() {
         if (this.hitCase_ == 2 && this.entityBuilder_ != null) {
            return this.entityBuilder_.getMessageOrBuilder();
         } else {
            return this.hitCase_ == 2 ? (EntityHit)this.hit_ : EntityHit.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<EntityHit, EntityHit.Builder, EntityHitOrBuilder> getEntityFieldBuilder() {
         if (this.entityBuilder_ == null) {
            if (this.hitCase_ != 2) {
               this.hit_ = EntityHit.getDefaultInstance();
            }

            this.entityBuilder_ = new SingleFieldBuilderV3<>((EntityHit)this.hit_, this.getParentForChildren(), this.isClean());
            this.hit_ = null;
         }

         this.hitCase_ = 2;
         this.onChanged();
         return this.entityBuilder_;
      }

      @Override
      public boolean hasMiss() {
         return this.hitCase_ == 3;
      }

      @Override
      public Miss getMiss() {
         if (this.missBuilder_ == null) {
            return this.hitCase_ == 3 ? (Miss)this.hit_ : Miss.getDefaultInstance();
         } else {
            return this.hitCase_ == 3 ? this.missBuilder_.getMessage() : Miss.getDefaultInstance();
         }
      }

      public RayTraceResult.Builder setMiss(Miss var1) {
         if (this.missBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.hit_ = var1;
            this.onChanged();
         } else {
            this.missBuilder_.setMessage(var1);
         }

         this.hitCase_ = 3;
         return this;
      }

      public RayTraceResult.Builder setMiss(Miss.Builder var1) {
         if (this.missBuilder_ == null) {
            this.hit_ = var1.build();
            this.onChanged();
         } else {
            this.missBuilder_.setMessage(var1.build());
         }

         this.hitCase_ = 3;
         return this;
      }

      public RayTraceResult.Builder mergeMiss(Miss var1) {
         if (this.missBuilder_ == null) {
            if (this.hitCase_ == 3 && this.hit_ != Miss.getDefaultInstance()) {
               this.hit_ = Miss.newBuilder((Miss)this.hit_).mergeFrom(var1).buildPartial();
            } else {
               this.hit_ = var1;
            }

            this.onChanged();
         } else if (this.hitCase_ == 3) {
            this.missBuilder_.mergeFrom(var1);
         } else {
            this.missBuilder_.setMessage(var1);
         }

         this.hitCase_ = 3;
         return this;
      }

      public RayTraceResult.Builder clearMiss() {
         if (this.missBuilder_ == null) {
            if (this.hitCase_ == 3) {
               this.hitCase_ = 0;
               this.hit_ = null;
               this.onChanged();
            }
         } else {
            if (this.hitCase_ == 3) {
               this.hitCase_ = 0;
               this.hit_ = null;
            }

            this.missBuilder_.clear();
         }

         return this;
      }

      public Miss.Builder getMissBuilder() {
         return this.getMissFieldBuilder().getBuilder();
      }

      @Override
      public MissOrBuilder getMissOrBuilder() {
         if (this.hitCase_ == 3 && this.missBuilder_ != null) {
            return this.missBuilder_.getMessageOrBuilder();
         } else {
            return this.hitCase_ == 3 ? (Miss)this.hit_ : Miss.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<Miss, Miss.Builder, MissOrBuilder> getMissFieldBuilder() {
         if (this.missBuilder_ == null) {
            if (this.hitCase_ != 3) {
               this.hit_ = Miss.getDefaultInstance();
            }

            this.missBuilder_ = new SingleFieldBuilderV3<>((Miss)this.hit_, this.getParentForChildren(), this.isClean());
            this.hit_ = null;
         }

         this.hitCase_ = 3;
         this.onChanged();
         return this.missBuilder_;
      }

      public final RayTraceResult.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RayTraceResult.Builder)super.setUnknownFields(var1);
      }

      public final RayTraceResult.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RayTraceResult.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum HitCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      BLOCK(1),
      ENTITY(2),
      MISS(3),
      HIT_NOT_SET(0);

      private final int value;

      HitCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static RayTraceResult.HitCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static RayTraceResult.HitCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return HIT_NOT_SET;
            case 1:
               return BLOCK;
            case 2:
               return ENTITY;
            case 3:
               return MISS;
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
