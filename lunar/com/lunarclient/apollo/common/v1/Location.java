package com.lunarclient.apollo.common.v1;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Location extends GeneratedMessageV3 implements LocationOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int WORLD_FIELD_NUMBER = 1;
   private volatile Object world_ = "";
   public static final int X_FIELD_NUMBER = 2;
   private double x_ = 0.0;
   public static final int Y_FIELD_NUMBER = 3;
   private double y_ = 0.0;
   public static final int Z_FIELD_NUMBER = 4;
   private double z_ = 0.0;
   private byte memoizedIsInitialized = -1;
   private static final Location DEFAULT_INSTANCE = new Location();
   private static final Parser<Location> PARSER = new AbstractParser<Location>() {
      public Location parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Location.Builder var3 = Location.newBuilder();

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

   private Location(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Location() {
      this.world_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Location();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return LocationProto.internal_static_lunarclient_apollo_common_v1_Location_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return LocationProto.internal_static_lunarclient_apollo_common_v1_Location_fieldAccessorTable
         .ensureFieldAccessorsInitialized(Location.class, Location.Builder.class);
   }

   @Override
   public String getWorld() {
      Object var1 = this.world_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.world_ = var3;
      return var3;
   }

   @Override
   public ByteString getWorldBytes() {
      Object var1 = this.world_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.world_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public double getX() {
      return this.x_;
   }

   @Override
   public double getY() {
      return this.y_;
   }

   @Override
   public double getZ() {
      return this.z_;
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
      if (!GeneratedMessageV3.isStringEmpty(this.world_)) {
         GeneratedMessageV3.writeString(var1, 1, this.world_);
      }

      if (Double.doubleToRawLongBits(this.x_) != 0L) {
         var1.writeDouble(2, this.x_);
      }

      if (Double.doubleToRawLongBits(this.y_) != 0L) {
         var1.writeDouble(3, this.y_);
      }

      if (Double.doubleToRawLongBits(this.z_) != 0L) {
         var1.writeDouble(4, this.z_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.world_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.world_);
      }

      if (Double.doubleToRawLongBits(this.x_) != 0L) {
         var1 += CodedOutputStream.computeDoubleSize(2, this.x_);
      }

      if (Double.doubleToRawLongBits(this.y_) != 0L) {
         var1 += CodedOutputStream.computeDoubleSize(3, this.y_);
      }

      if (Double.doubleToRawLongBits(this.z_) != 0L) {
         var1 += CodedOutputStream.computeDoubleSize(4, this.z_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Location)) {
         return super.equals(var1);
      } else {
         Location var2 = (Location)var1;
         if (!this.getWorld().equals(var2.getWorld())) {
            return false;
         } else if (Double.doubleToLongBits(this.getX()) != Double.doubleToLongBits(var2.getX())) {
            return false;
         } else if (Double.doubleToLongBits(this.getY()) != Double.doubleToLongBits(var2.getY())) {
            return false;
         } else {
            return Double.doubleToLongBits(this.getZ()) != Double.doubleToLongBits(var2.getZ())
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
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getWorld().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Internal.hashLong(Double.doubleToLongBits(this.getX()));
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Internal.hashLong(Double.doubleToLongBits(this.getY()));
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashLong(Double.doubleToLongBits(this.getZ()));
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Location parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Location parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Location parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Location parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Location parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Location parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Location parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Location parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Location parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Location parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Location parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Location parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Location.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Location.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Location.Builder newBuilder(Location var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Location.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Location.Builder() : new Location.Builder().mergeFrom(this);
   }

   protected Location.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Location.Builder(var1);
   }

   public static Location getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Location> parser() {
      return PARSER;
   }

   @Override
   public Parser<Location> getParserForType() {
      return PARSER;
   }

   public Location getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Location.Builder> implements LocationOrBuilder {
      private int bitField0_;
      private Object world_ = "";
      private double x_;
      private double y_;
      private double z_;

      public static final Descriptors.Descriptor getDescriptor() {
         return LocationProto.internal_static_lunarclient_apollo_common_v1_Location_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LocationProto.internal_static_lunarclient_apollo_common_v1_Location_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Location.class, Location.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public Location.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.world_ = "";
         this.x_ = 0.0;
         this.y_ = 0.0;
         this.z_ = 0.0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return LocationProto.internal_static_lunarclient_apollo_common_v1_Location_descriptor;
      }

      public Location getDefaultInstanceForType() {
         return Location.getDefaultInstance();
      }

      public Location build() {
         Location var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Location buildPartial() {
         Location var1 = new Location(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Location var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.world_ = this.world_;
         }

         if ((var2 & 2) != 0) {
            var1.x_ = this.x_;
         }

         if ((var2 & 4) != 0) {
            var1.y_ = this.y_;
         }

         if ((var2 & 8) != 0) {
            var1.z_ = this.z_;
         }
      }

      public Location.Builder clone() {
         return (Location.Builder)super.clone();
      }

      public Location.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Location.Builder)super.setField(var1, var2);
      }

      public Location.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Location.Builder)super.clearField(var1);
      }

      public Location.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Location.Builder)super.clearOneof(var1);
      }

      public Location.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Location.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Location.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Location.Builder)super.addRepeatedField(var1, var2);
      }

      public Location.Builder mergeFrom(Message var1) {
         if (var1 instanceof Location) {
            return this.mergeFrom((Location)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Location.Builder mergeFrom(Location var1) {
         if (var1 == Location.getDefaultInstance()) {
            return this;
         }

         if (!var1.getWorld().isEmpty()) {
            this.world_ = var1.world_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.getX() != 0.0) {
            this.setX(var1.getX());
         }

         if (var1.getY() != 0.0) {
            this.setY(var1.getY());
         }

         if (var1.getZ() != 0.0) {
            this.setZ(var1.getZ());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public Location.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.world_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 17:
                     this.x_ = var1.readDouble();
                     this.bitField0_ |= 2;
                     break;
                  case 25:
                     this.y_ = var1.readDouble();
                     this.bitField0_ |= 4;
                     break;
                  case 33:
                     this.z_ = var1.readDouble();
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
      public String getWorld() {
         Object var1 = this.world_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.world_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getWorldBytes() {
         Object var1 = this.world_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.world_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Location.Builder setWorld(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.world_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Location.Builder clearWorld() {
         this.world_ = Location.getDefaultInstance().getWorld();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public Location.Builder setWorldBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Location.checkByteStringIsUtf8(var1);
         this.world_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public double getX() {
         return this.x_;
      }

      public Location.Builder setX(double var1) {
         this.x_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Location.Builder clearX() {
         this.bitField0_ &= -3;
         this.x_ = 0.0;
         this.onChanged();
         return this;
      }

      @Override
      public double getY() {
         return this.y_;
      }

      public Location.Builder setY(double var1) {
         this.y_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public Location.Builder clearY() {
         this.bitField0_ &= -5;
         this.y_ = 0.0;
         this.onChanged();
         return this;
      }

      @Override
      public double getZ() {
         return this.z_;
      }

      public Location.Builder setZ(double var1) {
         this.z_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public Location.Builder clearZ() {
         this.bitField0_ &= -9;
         this.z_ = 0.0;
         this.onChanged();
         return this;
      }

      public final Location.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Location.Builder)super.setUnknownFields(var1);
      }

      public final Location.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Location.Builder)super.mergeUnknownFields(var1);
      }
   }
}
