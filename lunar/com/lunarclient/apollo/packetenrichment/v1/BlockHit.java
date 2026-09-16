package com.lunarclient.apollo.packetenrichment.v1;

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
import com.lunarclient.apollo.common.v1.BlockLocation;
import com.lunarclient.apollo.common.v1.BlockLocationOrBuilder;
import com.lunarclient.apollo.common.v1.Location;
import com.lunarclient.apollo.common.v1.LocationOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BlockHit extends GeneratedMessageV3 implements BlockHitOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int HIT_LOCATION_FIELD_NUMBER = 1;
   private Location hitLocation_;
   public static final int BLOCK_LOCATION_FIELD_NUMBER = 2;
   private BlockLocation blockLocation_;
   public static final int DIRECTION_FIELD_NUMBER = 3;
   private int direction_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final BlockHit DEFAULT_INSTANCE = new BlockHit();
   private static final Parser<BlockHit> PARSER = new AbstractParser<BlockHit>() {
      public BlockHit parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         BlockHit.Builder var3 = BlockHit.newBuilder();

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

   private BlockHit(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private BlockHit() {
      this.direction_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new BlockHit();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return RaytraceProto.internal_static_lunarclient_apollo_packetenrichment_v1_BlockHit_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return RaytraceProto.internal_static_lunarclient_apollo_packetenrichment_v1_BlockHit_fieldAccessorTable
         .ensureFieldAccessorsInitialized(BlockHit.class, BlockHit.Builder.class);
   }

   @Override
   public boolean hasHitLocation() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Location getHitLocation() {
      return this.hitLocation_ == null ? Location.getDefaultInstance() : this.hitLocation_;
   }

   @Override
   public LocationOrBuilder getHitLocationOrBuilder() {
      return this.hitLocation_ == null ? Location.getDefaultInstance() : this.hitLocation_;
   }

   @Override
   public boolean hasBlockLocation() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public BlockLocation getBlockLocation() {
      return this.blockLocation_ == null ? BlockLocation.getDefaultInstance() : this.blockLocation_;
   }

   @Override
   public BlockLocationOrBuilder getBlockLocationOrBuilder() {
      return this.blockLocation_ == null ? BlockLocation.getDefaultInstance() : this.blockLocation_;
   }

   @Override
   public int getDirectionValue() {
      return this.direction_;
   }

   @Override
   public Direction getDirection() {
      Direction var1 = Direction.forNumber(this.direction_);
      return var1 == null ? Direction.UNRECOGNIZED : var1;
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
         var1.writeMessage(1, this.getHitLocation());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getBlockLocation());
      }

      if (this.direction_ != Direction.DIRECTION_UNSPECIFIED.getNumber()) {
         var1.writeEnum(3, this.direction_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getHitLocation());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getBlockLocation());
      }

      if (this.direction_ != Direction.DIRECTION_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(3, this.direction_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof BlockHit)) {
         return super.equals(var1);
      } else {
         BlockHit var2 = (BlockHit)var1;
         if (this.hasHitLocation() != var2.hasHitLocation()) {
            return false;
         } else if (this.hasHitLocation() && !this.getHitLocation().equals(var2.getHitLocation())) {
            return false;
         } else if (this.hasBlockLocation() != var2.hasBlockLocation()) {
            return false;
         } else if (this.hasBlockLocation() && !this.getBlockLocation().equals(var2.getBlockLocation())) {
            return false;
         } else {
            return this.direction_ != var2.direction_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasHitLocation()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getHitLocation().hashCode();
      }

      if (this.hasBlockLocation()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getBlockLocation().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.direction_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static BlockHit parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static BlockHit parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BlockHit parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static BlockHit parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BlockHit parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static BlockHit parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BlockHit parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BlockHit parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static BlockHit parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static BlockHit parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static BlockHit parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BlockHit parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public BlockHit.Builder newBuilderForType() {
      return newBuilder();
   }

   public static BlockHit.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static BlockHit.Builder newBuilder(BlockHit var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public BlockHit.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new BlockHit.Builder() : new BlockHit.Builder().mergeFrom(this);
   }

   protected BlockHit.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new BlockHit.Builder(var1);
   }

   public static BlockHit getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<BlockHit> parser() {
      return PARSER;
   }

   @Override
   public Parser<BlockHit> getParserForType() {
      return PARSER;
   }

   public BlockHit getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<BlockHit.Builder> implements BlockHitOrBuilder {
      private int bitField0_;
      private Location hitLocation_;
      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> hitLocationBuilder_;
      private BlockLocation blockLocation_;
      private SingleFieldBuilderV3<BlockLocation, BlockLocation.Builder, BlockLocationOrBuilder> blockLocationBuilder_;
      private int direction_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return RaytraceProto.internal_static_lunarclient_apollo_packetenrichment_v1_BlockHit_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RaytraceProto.internal_static_lunarclient_apollo_packetenrichment_v1_BlockHit_fieldAccessorTable
            .ensureFieldAccessorsInitialized(BlockHit.class, BlockHit.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (BlockHit.alwaysUseFieldBuilders) {
            this.getHitLocationFieldBuilder();
            this.getBlockLocationFieldBuilder();
         }
      }

      public BlockHit.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.hitLocation_ = null;
         if (this.hitLocationBuilder_ != null) {
            this.hitLocationBuilder_.dispose();
            this.hitLocationBuilder_ = null;
         }

         this.blockLocation_ = null;
         if (this.blockLocationBuilder_ != null) {
            this.blockLocationBuilder_.dispose();
            this.blockLocationBuilder_ = null;
         }

         this.direction_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return RaytraceProto.internal_static_lunarclient_apollo_packetenrichment_v1_BlockHit_descriptor;
      }

      public BlockHit getDefaultInstanceForType() {
         return BlockHit.getDefaultInstance();
      }

      public BlockHit build() {
         BlockHit var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public BlockHit buildPartial() {
         BlockHit var1 = new BlockHit(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(BlockHit var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.hitLocation_ = this.hitLocationBuilder_ == null ? this.hitLocation_ : this.hitLocationBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.blockLocation_ = this.blockLocationBuilder_ == null ? this.blockLocation_ : this.blockLocationBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.direction_ = this.direction_;
         }

         BlockHit var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public BlockHit.Builder clone() {
         return (BlockHit.Builder)super.clone();
      }

      public BlockHit.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BlockHit.Builder)super.setField(var1, var2);
      }

      public BlockHit.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (BlockHit.Builder)super.clearField(var1);
      }

      public BlockHit.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (BlockHit.Builder)super.clearOneof(var1);
      }

      public BlockHit.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (BlockHit.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public BlockHit.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BlockHit.Builder)super.addRepeatedField(var1, var2);
      }

      public BlockHit.Builder mergeFrom(Message var1) {
         if (var1 instanceof BlockHit) {
            return this.mergeFrom((BlockHit)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public BlockHit.Builder mergeFrom(BlockHit var1) {
         if (var1 == BlockHit.getDefaultInstance()) {
            return this;
         }

         if (var1.hasHitLocation()) {
            this.mergeHitLocation(var1.getHitLocation());
         }

         if (var1.hasBlockLocation()) {
            this.mergeBlockLocation(var1.getBlockLocation());
         }

         if (var1.direction_ != 0) {
            this.setDirectionValue(var1.getDirectionValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public BlockHit.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getHitLocationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getBlockLocationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.direction_ = var1.readEnum();
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
      public boolean hasHitLocation() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Location getHitLocation() {
         if (this.hitLocationBuilder_ == null) {
            return this.hitLocation_ == null ? Location.getDefaultInstance() : this.hitLocation_;
         } else {
            return this.hitLocationBuilder_.getMessage();
         }
      }

      public BlockHit.Builder setHitLocation(Location var1) {
         if (this.hitLocationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.hitLocation_ = var1;
         } else {
            this.hitLocationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public BlockHit.Builder setHitLocation(Location.Builder var1) {
         if (this.hitLocationBuilder_ == null) {
            this.hitLocation_ = var1.build();
         } else {
            this.hitLocationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public BlockHit.Builder mergeHitLocation(Location var1) {
         if (this.hitLocationBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.hitLocation_ != null && this.hitLocation_ != Location.getDefaultInstance()) {
               this.getHitLocationBuilder().mergeFrom(var1);
            } else {
               this.hitLocation_ = var1;
            }
         } else {
            this.hitLocationBuilder_.mergeFrom(var1);
         }

         if (this.hitLocation_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public BlockHit.Builder clearHitLocation() {
         this.bitField0_ &= -2;
         this.hitLocation_ = null;
         if (this.hitLocationBuilder_ != null) {
            this.hitLocationBuilder_.dispose();
            this.hitLocationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Location.Builder getHitLocationBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getHitLocationFieldBuilder().getBuilder();
      }

      @Override
      public LocationOrBuilder getHitLocationOrBuilder() {
         if (this.hitLocationBuilder_ != null) {
            return this.hitLocationBuilder_.getMessageOrBuilder();
         } else {
            return this.hitLocation_ == null ? Location.getDefaultInstance() : this.hitLocation_;
         }
      }

      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> getHitLocationFieldBuilder() {
         if (this.hitLocationBuilder_ == null) {
            this.hitLocationBuilder_ = new SingleFieldBuilderV3<>(this.getHitLocation(), this.getParentForChildren(), this.isClean());
            this.hitLocation_ = null;
         }

         return this.hitLocationBuilder_;
      }

      @Override
      public boolean hasBlockLocation() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public BlockLocation getBlockLocation() {
         if (this.blockLocationBuilder_ == null) {
            return this.blockLocation_ == null ? BlockLocation.getDefaultInstance() : this.blockLocation_;
         } else {
            return this.blockLocationBuilder_.getMessage();
         }
      }

      public BlockHit.Builder setBlockLocation(BlockLocation var1) {
         if (this.blockLocationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.blockLocation_ = var1;
         } else {
            this.blockLocationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public BlockHit.Builder setBlockLocation(BlockLocation.Builder var1) {
         if (this.blockLocationBuilder_ == null) {
            this.blockLocation_ = var1.build();
         } else {
            this.blockLocationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public BlockHit.Builder mergeBlockLocation(BlockLocation var1) {
         if (this.blockLocationBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.blockLocation_ != null && this.blockLocation_ != BlockLocation.getDefaultInstance()) {
               this.getBlockLocationBuilder().mergeFrom(var1);
            } else {
               this.blockLocation_ = var1;
            }
         } else {
            this.blockLocationBuilder_.mergeFrom(var1);
         }

         if (this.blockLocation_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public BlockHit.Builder clearBlockLocation() {
         this.bitField0_ &= -3;
         this.blockLocation_ = null;
         if (this.blockLocationBuilder_ != null) {
            this.blockLocationBuilder_.dispose();
            this.blockLocationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public BlockLocation.Builder getBlockLocationBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getBlockLocationFieldBuilder().getBuilder();
      }

      @Override
      public BlockLocationOrBuilder getBlockLocationOrBuilder() {
         if (this.blockLocationBuilder_ != null) {
            return this.blockLocationBuilder_.getMessageOrBuilder();
         } else {
            return this.blockLocation_ == null ? BlockLocation.getDefaultInstance() : this.blockLocation_;
         }
      }

      private SingleFieldBuilderV3<BlockLocation, BlockLocation.Builder, BlockLocationOrBuilder> getBlockLocationFieldBuilder() {
         if (this.blockLocationBuilder_ == null) {
            this.blockLocationBuilder_ = new SingleFieldBuilderV3<>(this.getBlockLocation(), this.getParentForChildren(), this.isClean());
            this.blockLocation_ = null;
         }

         return this.blockLocationBuilder_;
      }

      @Override
      public int getDirectionValue() {
         return this.direction_;
      }

      public BlockHit.Builder setDirectionValue(int var1) {
         this.direction_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public Direction getDirection() {
         Direction var1 = Direction.forNumber(this.direction_);
         return var1 == null ? Direction.UNRECOGNIZED : var1;
      }

      public BlockHit.Builder setDirection(Direction var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 4;
         this.direction_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public BlockHit.Builder clearDirection() {
         this.bitField0_ &= -5;
         this.direction_ = 0;
         this.onChanged();
         return this;
      }

      public final BlockHit.Builder setUnknownFields(UnknownFieldSet var1) {
         return (BlockHit.Builder)super.setUnknownFields(var1);
      }

      public final BlockHit.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (BlockHit.Builder)super.mergeUnknownFields(var1);
      }
   }
}
