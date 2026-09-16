package com.lunarclient.apollo.cosmetic.v1;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
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
import com.lunarclient.apollo.packetenrichment.v1.Direction;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DisplaySprayMessage extends GeneratedMessageV3 implements DisplaySprayMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int SPRAY_ID_FIELD_NUMBER = 1;
   private int sprayId_ = 0;
   public static final int LOCATION_FIELD_NUMBER = 2;
   private BlockLocation location_;
   public static final int FACING_FIELD_NUMBER = 3;
   private int facing_ = 0;
   public static final int ROTATION_FIELD_NUMBER = 4;
   private float rotation_ = 0.0F;
   public static final int DURATION_FIELD_NUMBER = 5;
   private Duration duration_;
   private byte memoizedIsInitialized = -1;
   private static final DisplaySprayMessage DEFAULT_INSTANCE = new DisplaySprayMessage();
   private static final Parser<DisplaySprayMessage> PARSER = new AbstractParser<DisplaySprayMessage>() {
      public DisplaySprayMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DisplaySprayMessage.Builder var3 = DisplaySprayMessage.newBuilder();

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

   private DisplaySprayMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DisplaySprayMessage() {
      this.facing_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DisplaySprayMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_DisplaySprayMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_DisplaySprayMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DisplaySprayMessage.class, DisplaySprayMessage.Builder.class);
   }

   @Override
   public int getSprayId() {
      return this.sprayId_;
   }

   @Override
   public boolean hasLocation() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public BlockLocation getLocation() {
      return this.location_ == null ? BlockLocation.getDefaultInstance() : this.location_;
   }

   @Override
   public BlockLocationOrBuilder getLocationOrBuilder() {
      return this.location_ == null ? BlockLocation.getDefaultInstance() : this.location_;
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
   public boolean hasDuration() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Duration getDuration() {
      return this.duration_ == null ? Duration.getDefaultInstance() : this.duration_;
   }

   @Override
   public DurationOrBuilder getDurationOrBuilder() {
      return this.duration_ == null ? Duration.getDefaultInstance() : this.duration_;
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
      if (this.sprayId_ != 0) {
         var1.writeInt32(1, this.sprayId_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getLocation());
      }

      if (this.facing_ != Direction.DIRECTION_UNSPECIFIED.getNumber()) {
         var1.writeEnum(3, this.facing_);
      }

      if (Float.floatToRawIntBits(this.rotation_) != 0) {
         var1.writeFloat(4, this.rotation_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(5, this.getDuration());
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
      if (this.sprayId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.sprayId_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getLocation());
      }

      if (this.facing_ != Direction.DIRECTION_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(3, this.facing_);
      }

      if (Float.floatToRawIntBits(this.rotation_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(4, this.rotation_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(5, this.getDuration());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof DisplaySprayMessage)) {
         return super.equals(var1);
      } else {
         DisplaySprayMessage var2 = (DisplaySprayMessage)var1;
         if (this.getSprayId() != var2.getSprayId()) {
            return false;
         } else if (this.hasLocation() != var2.hasLocation()) {
            return false;
         } else if (this.hasLocation() && !this.getLocation().equals(var2.getLocation())) {
            return false;
         } else if (this.facing_ != var2.facing_) {
            return false;
         } else if (Float.floatToIntBits(this.getRotation()) != Float.floatToIntBits(var2.getRotation())) {
            return false;
         } else if (this.hasDuration() != var2.hasDuration()) {
            return false;
         } else {
            return this.hasDuration() && !this.getDuration().equals(var2.getDuration()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getSprayId();
      if (this.hasLocation()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getLocation().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.facing_;
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Float.floatToIntBits(this.getRotation());
      if (this.hasDuration()) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getDuration().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DisplaySprayMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplaySprayMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplaySprayMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplaySprayMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplaySprayMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplaySprayMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplaySprayMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplaySprayMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DisplaySprayMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DisplaySprayMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DisplaySprayMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplaySprayMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DisplaySprayMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DisplaySprayMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DisplaySprayMessage.Builder newBuilder(DisplaySprayMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DisplaySprayMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DisplaySprayMessage.Builder() : new DisplaySprayMessage.Builder().mergeFrom(this);
   }

   protected DisplaySprayMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DisplaySprayMessage.Builder(var1);
   }

   public static DisplaySprayMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DisplaySprayMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<DisplaySprayMessage> getParserForType() {
      return PARSER;
   }

   public DisplaySprayMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<DisplaySprayMessage.Builder> implements DisplaySprayMessageOrBuilder {
      private int bitField0_;
      private int sprayId_;
      private BlockLocation location_;
      private SingleFieldBuilderV3<BlockLocation, BlockLocation.Builder, BlockLocationOrBuilder> locationBuilder_;
      private int facing_ = 0;
      private float rotation_;
      private Duration duration_;
      private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> durationBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_DisplaySprayMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_DisplaySprayMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DisplaySprayMessage.class, DisplaySprayMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (DisplaySprayMessage.alwaysUseFieldBuilders) {
            this.getLocationFieldBuilder();
            this.getDurationFieldBuilder();
         }
      }

      public DisplaySprayMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.sprayId_ = 0;
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.facing_ = 0;
         this.rotation_ = 0.0F;
         this.duration_ = null;
         if (this.durationBuilder_ != null) {
            this.durationBuilder_.dispose();
            this.durationBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_DisplaySprayMessage_descriptor;
      }

      public DisplaySprayMessage getDefaultInstanceForType() {
         return DisplaySprayMessage.getDefaultInstance();
      }

      public DisplaySprayMessage build() {
         DisplaySprayMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DisplaySprayMessage buildPartial() {
         DisplaySprayMessage var1 = new DisplaySprayMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(DisplaySprayMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.sprayId_ = this.sprayId_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.location_ = this.locationBuilder_ == null ? this.location_ : this.locationBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            var1.facing_ = this.facing_;
         }

         if ((var2 & 8) != 0) {
            var1.rotation_ = this.rotation_;
         }

         if ((var2 & 16) != 0) {
            var1.duration_ = this.durationBuilder_ == null ? this.duration_ : this.durationBuilder_.build();
            var3 |= 2;
         }

         DisplaySprayMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public DisplaySprayMessage.Builder clone() {
         return (DisplaySprayMessage.Builder)super.clone();
      }

      public DisplaySprayMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplaySprayMessage.Builder)super.setField(var1, var2);
      }

      public DisplaySprayMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DisplaySprayMessage.Builder)super.clearField(var1);
      }

      public DisplaySprayMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DisplaySprayMessage.Builder)super.clearOneof(var1);
      }

      public DisplaySprayMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DisplaySprayMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DisplaySprayMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplaySprayMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public DisplaySprayMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof DisplaySprayMessage) {
            return this.mergeFrom((DisplaySprayMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DisplaySprayMessage.Builder mergeFrom(DisplaySprayMessage var1) {
         if (var1 == DisplaySprayMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.getSprayId() != 0) {
            this.setSprayId(var1.getSprayId());
         }

         if (var1.hasLocation()) {
            this.mergeLocation(var1.getLocation());
         }

         if (var1.facing_ != 0) {
            this.setFacingValue(var1.getFacingValue());
         }

         if (var1.getRotation() != 0.0F) {
            this.setRotation(var1.getRotation());
         }

         if (var1.hasDuration()) {
            this.mergeDuration(var1.getDuration());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public DisplaySprayMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.sprayId_ = var1.readInt32();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getLocationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.facing_ = var1.readEnum();
                     this.bitField0_ |= 4;
                     break;
                  case 37:
                     this.rotation_ = var1.readFloat();
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     var1.readMessage(this.getDurationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 16;
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
      public int getSprayId() {
         return this.sprayId_;
      }

      public DisplaySprayMessage.Builder setSprayId(int var1) {
         this.sprayId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public DisplaySprayMessage.Builder clearSprayId() {
         this.bitField0_ &= -2;
         this.sprayId_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasLocation() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public BlockLocation getLocation() {
         if (this.locationBuilder_ == null) {
            return this.location_ == null ? BlockLocation.getDefaultInstance() : this.location_;
         } else {
            return this.locationBuilder_.getMessage();
         }
      }

      public DisplaySprayMessage.Builder setLocation(BlockLocation var1) {
         if (this.locationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
         } else {
            this.locationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public DisplaySprayMessage.Builder setLocation(BlockLocation.Builder var1) {
         if (this.locationBuilder_ == null) {
            this.location_ = var1.build();
         } else {
            this.locationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public DisplaySprayMessage.Builder mergeLocation(BlockLocation var1) {
         if (this.locationBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.location_ != null && this.location_ != BlockLocation.getDefaultInstance()) {
               this.getLocationBuilder().mergeFrom(var1);
            } else {
               this.location_ = var1;
            }
         } else {
            this.locationBuilder_.mergeFrom(var1);
         }

         if (this.location_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public DisplaySprayMessage.Builder clearLocation() {
         this.bitField0_ &= -3;
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public BlockLocation.Builder getLocationBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getLocationFieldBuilder().getBuilder();
      }

      @Override
      public BlockLocationOrBuilder getLocationOrBuilder() {
         if (this.locationBuilder_ != null) {
            return this.locationBuilder_.getMessageOrBuilder();
         } else {
            return this.location_ == null ? BlockLocation.getDefaultInstance() : this.location_;
         }
      }

      private SingleFieldBuilderV3<BlockLocation, BlockLocation.Builder, BlockLocationOrBuilder> getLocationFieldBuilder() {
         if (this.locationBuilder_ == null) {
            this.locationBuilder_ = new SingleFieldBuilderV3<>(this.getLocation(), this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         return this.locationBuilder_;
      }

      @Override
      public int getFacingValue() {
         return this.facing_;
      }

      public DisplaySprayMessage.Builder setFacingValue(int var1) {
         this.facing_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public Direction getFacing() {
         Direction var1 = Direction.forNumber(this.facing_);
         return var1 == null ? Direction.UNRECOGNIZED : var1;
      }

      public DisplaySprayMessage.Builder setFacing(Direction var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 4;
         this.facing_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public DisplaySprayMessage.Builder clearFacing() {
         this.bitField0_ &= -5;
         this.facing_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public float getRotation() {
         return this.rotation_;
      }

      public DisplaySprayMessage.Builder setRotation(float var1) {
         this.rotation_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public DisplaySprayMessage.Builder clearRotation() {
         this.bitField0_ &= -9;
         this.rotation_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasDuration() {
         return (this.bitField0_ & 16) != 0;
      }

      @Override
      public Duration getDuration() {
         if (this.durationBuilder_ == null) {
            return this.duration_ == null ? Duration.getDefaultInstance() : this.duration_;
         } else {
            return this.durationBuilder_.getMessage();
         }
      }

      public DisplaySprayMessage.Builder setDuration(Duration var1) {
         if (this.durationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.duration_ = var1;
         } else {
            this.durationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public DisplaySprayMessage.Builder setDuration(Duration.Builder var1) {
         if (this.durationBuilder_ == null) {
            this.duration_ = var1.build();
         } else {
            this.durationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public DisplaySprayMessage.Builder mergeDuration(Duration var1) {
         if (this.durationBuilder_ == null) {
            if ((this.bitField0_ & 16) != 0 && this.duration_ != null && this.duration_ != Duration.getDefaultInstance()) {
               this.getDurationBuilder().mergeFrom(var1);
            } else {
               this.duration_ = var1;
            }
         } else {
            this.durationBuilder_.mergeFrom(var1);
         }

         if (this.duration_ != null) {
            this.bitField0_ |= 16;
            this.onChanged();
         }

         return this;
      }

      public DisplaySprayMessage.Builder clearDuration() {
         this.bitField0_ &= -17;
         this.duration_ = null;
         if (this.durationBuilder_ != null) {
            this.durationBuilder_.dispose();
            this.durationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Duration.Builder getDurationBuilder() {
         this.bitField0_ |= 16;
         this.onChanged();
         return this.getDurationFieldBuilder().getBuilder();
      }

      @Override
      public DurationOrBuilder getDurationOrBuilder() {
         if (this.durationBuilder_ != null) {
            return this.durationBuilder_.getMessageOrBuilder();
         } else {
            return this.duration_ == null ? Duration.getDefaultInstance() : this.duration_;
         }
      }

      private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> getDurationFieldBuilder() {
         if (this.durationBuilder_ == null) {
            this.durationBuilder_ = new SingleFieldBuilderV3<>(this.getDuration(), this.getParentForChildren(), this.isClean());
            this.duration_ = null;
         }

         return this.durationBuilder_;
      }

      public final DisplaySprayMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DisplaySprayMessage.Builder)super.setUnknownFields(var1);
      }

      public final DisplaySprayMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DisplaySprayMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
