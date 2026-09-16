package com.lunarclient.apollo.common.v1;

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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class PlayerLocation extends GeneratedMessageV3 implements PlayerLocationOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int LOCATION_FIELD_NUMBER = 1;
   private Location location_;
   public static final int YAW_FIELD_NUMBER = 2;
   private float yaw_ = 0.0F;
   public static final int PITCH_FIELD_NUMBER = 3;
   private float pitch_ = 0.0F;
   private byte memoizedIsInitialized = -1;
   private static final PlayerLocation DEFAULT_INSTANCE = new PlayerLocation();
   private static final Parser<PlayerLocation> PARSER = new AbstractParser<PlayerLocation>() {
      public PlayerLocation parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PlayerLocation.Builder var3 = PlayerLocation.newBuilder();

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

   private PlayerLocation(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PlayerLocation() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PlayerLocation();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return LocationProto.internal_static_lunarclient_apollo_common_v1_PlayerLocation_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return LocationProto.internal_static_lunarclient_apollo_common_v1_PlayerLocation_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PlayerLocation.class, PlayerLocation.Builder.class);
   }

   @Override
   public boolean hasLocation() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Location getLocation() {
      return this.location_ == null ? Location.getDefaultInstance() : this.location_;
   }

   @Override
   public LocationOrBuilder getLocationOrBuilder() {
      return this.location_ == null ? Location.getDefaultInstance() : this.location_;
   }

   @Override
   public float getYaw() {
      return this.yaw_;
   }

   @Override
   public float getPitch() {
      return this.pitch_;
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
         var1.writeMessage(1, this.getLocation());
      }

      if (Float.floatToRawIntBits(this.yaw_) != 0) {
         var1.writeFloat(2, this.yaw_);
      }

      if (Float.floatToRawIntBits(this.pitch_) != 0) {
         var1.writeFloat(3, this.pitch_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getLocation());
      }

      if (Float.floatToRawIntBits(this.yaw_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(2, this.yaw_);
      }

      if (Float.floatToRawIntBits(this.pitch_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(3, this.pitch_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PlayerLocation)) {
         return super.equals(var1);
      } else {
         PlayerLocation var2 = (PlayerLocation)var1;
         if (this.hasLocation() != var2.hasLocation()) {
            return false;
         } else if (this.hasLocation() && !this.getLocation().equals(var2.getLocation())) {
            return false;
         } else if (Float.floatToIntBits(this.getYaw()) != Float.floatToIntBits(var2.getYaw())) {
            return false;
         } else {
            return Float.floatToIntBits(this.getPitch()) != Float.floatToIntBits(var2.getPitch())
               ? false
               : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasLocation()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getLocation().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Float.floatToIntBits(this.getYaw());
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Float.floatToIntBits(this.getPitch());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PlayerLocation parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerLocation parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerLocation parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerLocation parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerLocation parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerLocation parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerLocation parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayerLocation parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PlayerLocation parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PlayerLocation parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PlayerLocation parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayerLocation parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PlayerLocation.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PlayerLocation.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PlayerLocation.Builder newBuilder(PlayerLocation var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PlayerLocation.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PlayerLocation.Builder() : new PlayerLocation.Builder().mergeFrom(this);
   }

   protected PlayerLocation.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PlayerLocation.Builder(var1);
   }

   public static PlayerLocation getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PlayerLocation> parser() {
      return PARSER;
   }

   @Override
   public Parser<PlayerLocation> getParserForType() {
      return PARSER;
   }

   public PlayerLocation getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PlayerLocation.Builder> implements PlayerLocationOrBuilder {
      private int bitField0_;
      private Location location_;
      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> locationBuilder_;
      private float yaw_;
      private float pitch_;

      public static final Descriptors.Descriptor getDescriptor() {
         return LocationProto.internal_static_lunarclient_apollo_common_v1_PlayerLocation_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LocationProto.internal_static_lunarclient_apollo_common_v1_PlayerLocation_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PlayerLocation.class, PlayerLocation.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (PlayerLocation.alwaysUseFieldBuilders) {
            this.getLocationFieldBuilder();
         }
      }

      public PlayerLocation.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.yaw_ = 0.0F;
         this.pitch_ = 0.0F;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return LocationProto.internal_static_lunarclient_apollo_common_v1_PlayerLocation_descriptor;
      }

      public PlayerLocation getDefaultInstanceForType() {
         return PlayerLocation.getDefaultInstance();
      }

      public PlayerLocation build() {
         PlayerLocation var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PlayerLocation buildPartial() {
         PlayerLocation var1 = new PlayerLocation(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(PlayerLocation var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.location_ = this.locationBuilder_ == null ? this.location_ : this.locationBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.yaw_ = this.yaw_;
         }

         if ((var2 & 4) != 0) {
            var1.pitch_ = this.pitch_;
         }

         PlayerLocation var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public PlayerLocation.Builder clone() {
         return (PlayerLocation.Builder)super.clone();
      }

      public PlayerLocation.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayerLocation.Builder)super.setField(var1, var2);
      }

      public PlayerLocation.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PlayerLocation.Builder)super.clearField(var1);
      }

      public PlayerLocation.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PlayerLocation.Builder)super.clearOneof(var1);
      }

      public PlayerLocation.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PlayerLocation.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PlayerLocation.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayerLocation.Builder)super.addRepeatedField(var1, var2);
      }

      public PlayerLocation.Builder mergeFrom(Message var1) {
         if (var1 instanceof PlayerLocation) {
            return this.mergeFrom((PlayerLocation)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PlayerLocation.Builder mergeFrom(PlayerLocation var1) {
         if (var1 == PlayerLocation.getDefaultInstance()) {
            return this;
         }

         if (var1.hasLocation()) {
            this.mergeLocation(var1.getLocation());
         }

         if (var1.getYaw() != 0.0F) {
            this.setYaw(var1.getYaw());
         }

         if (var1.getPitch() != 0.0F) {
            this.setPitch(var1.getPitch());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public PlayerLocation.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getLocationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 21:
                     this.yaw_ = var1.readFloat();
                     this.bitField0_ |= 2;
                     break;
                  case 29:
                     this.pitch_ = var1.readFloat();
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
      public boolean hasLocation() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Location getLocation() {
         if (this.locationBuilder_ == null) {
            return this.location_ == null ? Location.getDefaultInstance() : this.location_;
         } else {
            return this.locationBuilder_.getMessage();
         }
      }

      public PlayerLocation.Builder setLocation(Location var1) {
         if (this.locationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
         } else {
            this.locationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PlayerLocation.Builder setLocation(Location.Builder var1) {
         if (this.locationBuilder_ == null) {
            this.location_ = var1.build();
         } else {
            this.locationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PlayerLocation.Builder mergeLocation(Location var1) {
         if (this.locationBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.location_ != null && this.location_ != Location.getDefaultInstance()) {
               this.getLocationBuilder().mergeFrom(var1);
            } else {
               this.location_ = var1;
            }
         } else {
            this.locationBuilder_.mergeFrom(var1);
         }

         if (this.location_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public PlayerLocation.Builder clearLocation() {
         this.bitField0_ &= -2;
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Location.Builder getLocationBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getLocationFieldBuilder().getBuilder();
      }

      @Override
      public LocationOrBuilder getLocationOrBuilder() {
         if (this.locationBuilder_ != null) {
            return this.locationBuilder_.getMessageOrBuilder();
         } else {
            return this.location_ == null ? Location.getDefaultInstance() : this.location_;
         }
      }

      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> getLocationFieldBuilder() {
         if (this.locationBuilder_ == null) {
            this.locationBuilder_ = new SingleFieldBuilderV3<>(this.getLocation(), this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         return this.locationBuilder_;
      }

      @Override
      public float getYaw() {
         return this.yaw_;
      }

      public PlayerLocation.Builder setYaw(float var1) {
         this.yaw_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PlayerLocation.Builder clearYaw() {
         this.bitField0_ &= -3;
         this.yaw_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public float getPitch() {
         return this.pitch_;
      }

      public PlayerLocation.Builder setPitch(float var1) {
         this.pitch_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public PlayerLocation.Builder clearPitch() {
         this.bitField0_ &= -5;
         this.pitch_ = 0.0F;
         this.onChanged();
         return this;
      }

      public final PlayerLocation.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PlayerLocation.Builder)super.setUnknownFields(var1);
      }

      public final PlayerLocation.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PlayerLocation.Builder)super.mergeUnknownFields(var1);
      }
   }
}
