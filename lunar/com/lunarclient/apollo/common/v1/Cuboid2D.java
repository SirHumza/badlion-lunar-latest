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

public final class Cuboid2D extends GeneratedMessageV3 implements Cuboid2DOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int MIN_X_FIELD_NUMBER = 1;
   private double minX_ = 0.0;
   public static final int MIN_Z_FIELD_NUMBER = 2;
   private double minZ_ = 0.0;
   public static final int MAX_X_FIELD_NUMBER = 3;
   private double maxX_ = 0.0;
   public static final int MAX_Z_FIELD_NUMBER = 4;
   private double maxZ_ = 0.0;
   private byte memoizedIsInitialized = -1;
   private static final Cuboid2D DEFAULT_INSTANCE = new Cuboid2D();
   private static final Parser<Cuboid2D> PARSER = new AbstractParser<Cuboid2D>() {
      public Cuboid2D parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Cuboid2D.Builder var3 = Cuboid2D.newBuilder();

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

   private Cuboid2D(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Cuboid2D() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Cuboid2D();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CuboidProto.internal_static_lunarclient_apollo_common_v1_Cuboid2D_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CuboidProto.internal_static_lunarclient_apollo_common_v1_Cuboid2D_fieldAccessorTable
         .ensureFieldAccessorsInitialized(Cuboid2D.class, Cuboid2D.Builder.class);
   }

   @Override
   public double getMinX() {
      return this.minX_;
   }

   @Override
   public double getMinZ() {
      return this.minZ_;
   }

   @Override
   public double getMaxX() {
      return this.maxX_;
   }

   @Override
   public double getMaxZ() {
      return this.maxZ_;
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
      if (Double.doubleToRawLongBits(this.minX_) != 0L) {
         var1.writeDouble(1, this.minX_);
      }

      if (Double.doubleToRawLongBits(this.minZ_) != 0L) {
         var1.writeDouble(2, this.minZ_);
      }

      if (Double.doubleToRawLongBits(this.maxX_) != 0L) {
         var1.writeDouble(3, this.maxX_);
      }

      if (Double.doubleToRawLongBits(this.maxZ_) != 0L) {
         var1.writeDouble(4, this.maxZ_);
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
      if (Double.doubleToRawLongBits(this.minX_) != 0L) {
         var1 += CodedOutputStream.computeDoubleSize(1, this.minX_);
      }

      if (Double.doubleToRawLongBits(this.minZ_) != 0L) {
         var1 += CodedOutputStream.computeDoubleSize(2, this.minZ_);
      }

      if (Double.doubleToRawLongBits(this.maxX_) != 0L) {
         var1 += CodedOutputStream.computeDoubleSize(3, this.maxX_);
      }

      if (Double.doubleToRawLongBits(this.maxZ_) != 0L) {
         var1 += CodedOutputStream.computeDoubleSize(4, this.maxZ_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Cuboid2D)) {
         return super.equals(var1);
      } else {
         Cuboid2D var2 = (Cuboid2D)var1;
         if (Double.doubleToLongBits(this.getMinX()) != Double.doubleToLongBits(var2.getMinX())) {
            return false;
         } else if (Double.doubleToLongBits(this.getMinZ()) != Double.doubleToLongBits(var2.getMinZ())) {
            return false;
         } else if (Double.doubleToLongBits(this.getMaxX()) != Double.doubleToLongBits(var2.getMaxX())) {
            return false;
         } else {
            return Double.doubleToLongBits(this.getMaxZ()) != Double.doubleToLongBits(var2.getMaxZ())
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
      var1 = 53 * var1 + Internal.hashLong(Double.doubleToLongBits(this.getMinX()));
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Internal.hashLong(Double.doubleToLongBits(this.getMinZ()));
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Internal.hashLong(Double.doubleToLongBits(this.getMaxX()));
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashLong(Double.doubleToLongBits(this.getMaxZ()));
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Cuboid2D parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Cuboid2D parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Cuboid2D parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Cuboid2D parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Cuboid2D parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Cuboid2D parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Cuboid2D parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Cuboid2D parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Cuboid2D parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Cuboid2D parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Cuboid2D parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Cuboid2D parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Cuboid2D.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Cuboid2D.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Cuboid2D.Builder newBuilder(Cuboid2D var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Cuboid2D.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Cuboid2D.Builder() : new Cuboid2D.Builder().mergeFrom(this);
   }

   protected Cuboid2D.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Cuboid2D.Builder(var1);
   }

   public static Cuboid2D getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Cuboid2D> parser() {
      return PARSER;
   }

   @Override
   public Parser<Cuboid2D> getParserForType() {
      return PARSER;
   }

   public Cuboid2D getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Cuboid2D.Builder> implements Cuboid2DOrBuilder {
      private int bitField0_;
      private double minX_;
      private double minZ_;
      private double maxX_;
      private double maxZ_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CuboidProto.internal_static_lunarclient_apollo_common_v1_Cuboid2D_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CuboidProto.internal_static_lunarclient_apollo_common_v1_Cuboid2D_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Cuboid2D.class, Cuboid2D.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public Cuboid2D.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.minX_ = 0.0;
         this.minZ_ = 0.0;
         this.maxX_ = 0.0;
         this.maxZ_ = 0.0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CuboidProto.internal_static_lunarclient_apollo_common_v1_Cuboid2D_descriptor;
      }

      public Cuboid2D getDefaultInstanceForType() {
         return Cuboid2D.getDefaultInstance();
      }

      public Cuboid2D build() {
         Cuboid2D var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Cuboid2D buildPartial() {
         Cuboid2D var1 = new Cuboid2D(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Cuboid2D var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.minX_ = this.minX_;
         }

         if ((var2 & 2) != 0) {
            var1.minZ_ = this.minZ_;
         }

         if ((var2 & 4) != 0) {
            var1.maxX_ = this.maxX_;
         }

         if ((var2 & 8) != 0) {
            var1.maxZ_ = this.maxZ_;
         }
      }

      public Cuboid2D.Builder clone() {
         return (Cuboid2D.Builder)super.clone();
      }

      public Cuboid2D.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Cuboid2D.Builder)super.setField(var1, var2);
      }

      public Cuboid2D.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Cuboid2D.Builder)super.clearField(var1);
      }

      public Cuboid2D.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Cuboid2D.Builder)super.clearOneof(var1);
      }

      public Cuboid2D.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Cuboid2D.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Cuboid2D.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Cuboid2D.Builder)super.addRepeatedField(var1, var2);
      }

      public Cuboid2D.Builder mergeFrom(Message var1) {
         if (var1 instanceof Cuboid2D) {
            return this.mergeFrom((Cuboid2D)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Cuboid2D.Builder mergeFrom(Cuboid2D var1) {
         if (var1 == Cuboid2D.getDefaultInstance()) {
            return this;
         }

         if (var1.getMinX() != 0.0) {
            this.setMinX(var1.getMinX());
         }

         if (var1.getMinZ() != 0.0) {
            this.setMinZ(var1.getMinZ());
         }

         if (var1.getMaxX() != 0.0) {
            this.setMaxX(var1.getMaxX());
         }

         if (var1.getMaxZ() != 0.0) {
            this.setMaxZ(var1.getMaxZ());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public Cuboid2D.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 9:
                     this.minX_ = var1.readDouble();
                     this.bitField0_ |= 1;
                     break;
                  case 17:
                     this.minZ_ = var1.readDouble();
                     this.bitField0_ |= 2;
                     break;
                  case 25:
                     this.maxX_ = var1.readDouble();
                     this.bitField0_ |= 4;
                     break;
                  case 33:
                     this.maxZ_ = var1.readDouble();
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
      public double getMinX() {
         return this.minX_;
      }

      public Cuboid2D.Builder setMinX(double var1) {
         this.minX_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Cuboid2D.Builder clearMinX() {
         this.bitField0_ &= -2;
         this.minX_ = 0.0;
         this.onChanged();
         return this;
      }

      @Override
      public double getMinZ() {
         return this.minZ_;
      }

      public Cuboid2D.Builder setMinZ(double var1) {
         this.minZ_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Cuboid2D.Builder clearMinZ() {
         this.bitField0_ &= -3;
         this.minZ_ = 0.0;
         this.onChanged();
         return this;
      }

      @Override
      public double getMaxX() {
         return this.maxX_;
      }

      public Cuboid2D.Builder setMaxX(double var1) {
         this.maxX_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public Cuboid2D.Builder clearMaxX() {
         this.bitField0_ &= -5;
         this.maxX_ = 0.0;
         this.onChanged();
         return this;
      }

      @Override
      public double getMaxZ() {
         return this.maxZ_;
      }

      public Cuboid2D.Builder setMaxZ(double var1) {
         this.maxZ_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public Cuboid2D.Builder clearMaxZ() {
         this.bitField0_ &= -9;
         this.maxZ_ = 0.0;
         this.onChanged();
         return this;
      }

      public final Cuboid2D.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Cuboid2D.Builder)super.setUnknownFields(var1);
      }

      public final Cuboid2D.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Cuboid2D.Builder)super.mergeUnknownFields(var1);
      }
   }
}
