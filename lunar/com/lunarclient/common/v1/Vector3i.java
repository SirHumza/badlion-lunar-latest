package com.lunarclient.common.v1;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Vector3i extends GeneratedMessageV3 implements Vector3iOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int X_FIELD_NUMBER = 1;
   private int x_ = 0;
   public static final int Y_FIELD_NUMBER = 2;
   private int y_ = 0;
   public static final int Z_FIELD_NUMBER = 3;
   private int z_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final Vector3i DEFAULT_INSTANCE = new Vector3i();
   private static final Parser<Vector3i> PARSER = new AbstractParser<Vector3i>() {
      public Vector3i parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Vector3i.Builder var3 = Vector3i.newBuilder();

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

   private Vector3i(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Vector3i() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Vector3i();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PositionProto.internal_static_lunarclient_common_v1_Vector3i_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PositionProto.internal_static_lunarclient_common_v1_Vector3i_fieldAccessorTable
         .ensureFieldAccessorsInitialized(Vector3i.class, Vector3i.Builder.class);
   }

   @Override
   public int getX() {
      return this.x_;
   }

   @Override
   public int getY() {
      return this.y_;
   }

   @Override
   public int getZ() {
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
      if (this.x_ != 0) {
         var1.writeInt32(1, this.x_);
      }

      if (this.y_ != 0) {
         var1.writeInt32(2, this.y_);
      }

      if (this.z_ != 0) {
         var1.writeInt32(3, this.z_);
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
      if (this.x_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.x_);
      }

      if (this.y_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.y_);
      }

      if (this.z_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(3, this.z_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Vector3i)) {
         return super.equals(var1);
      } else {
         Vector3i var2 = (Vector3i)var1;
         if (this.getX() != var2.getX()) {
            return false;
         } else if (this.getY() != var2.getY()) {
            return false;
         } else {
            return this.getZ() != var2.getZ() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getX();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getY();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getZ();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Vector3i parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Vector3i parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Vector3i parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Vector3i parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Vector3i parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Vector3i parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Vector3i parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Vector3i parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Vector3i parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Vector3i parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Vector3i parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Vector3i parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Vector3i.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Vector3i.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Vector3i.Builder newBuilder(Vector3i var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Vector3i.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Vector3i.Builder() : new Vector3i.Builder().mergeFrom(this);
   }

   protected Vector3i.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Vector3i.Builder(var1);
   }

   public static Vector3i getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Vector3i> parser() {
      return PARSER;
   }

   @Override
   public Parser<Vector3i> getParserForType() {
      return PARSER;
   }

   public Vector3i getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Vector3i.Builder> implements Vector3iOrBuilder {
      private int bitField0_;
      private int x_;
      private int y_;
      private int z_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PositionProto.internal_static_lunarclient_common_v1_Vector3i_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PositionProto.internal_static_lunarclient_common_v1_Vector3i_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Vector3i.class, Vector3i.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public Vector3i.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.x_ = 0;
         this.y_ = 0;
         this.z_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PositionProto.internal_static_lunarclient_common_v1_Vector3i_descriptor;
      }

      public Vector3i getDefaultInstanceForType() {
         return Vector3i.getDefaultInstance();
      }

      public Vector3i build() {
         Vector3i var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Vector3i buildPartial() {
         Vector3i var1 = new Vector3i(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Vector3i var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.x_ = this.x_;
         }

         if ((var2 & 2) != 0) {
            var1.y_ = this.y_;
         }

         if ((var2 & 4) != 0) {
            var1.z_ = this.z_;
         }
      }

      public Vector3i.Builder clone() {
         return (Vector3i.Builder)super.clone();
      }

      public Vector3i.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Vector3i.Builder)super.setField(var1, var2);
      }

      public Vector3i.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Vector3i.Builder)super.clearField(var1);
      }

      public Vector3i.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Vector3i.Builder)super.clearOneof(var1);
      }

      public Vector3i.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Vector3i.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Vector3i.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Vector3i.Builder)super.addRepeatedField(var1, var2);
      }

      public Vector3i.Builder mergeFrom(Message var1) {
         if (var1 instanceof Vector3i) {
            return this.mergeFrom((Vector3i)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Vector3i.Builder mergeFrom(Vector3i var1) {
         if (var1 == Vector3i.getDefaultInstance()) {
            return this;
         }

         if (var1.getX() != 0) {
            this.setX(var1.getX());
         }

         if (var1.getY() != 0) {
            this.setY(var1.getY());
         }

         if (var1.getZ() != 0) {
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

      public Vector3i.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.x_ = var1.readInt32();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.y_ = var1.readInt32();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.z_ = var1.readInt32();
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
      public int getX() {
         return this.x_;
      }

      public Vector3i.Builder setX(int var1) {
         this.x_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Vector3i.Builder clearX() {
         this.bitField0_ &= -2;
         this.x_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getY() {
         return this.y_;
      }

      public Vector3i.Builder setY(int var1) {
         this.y_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Vector3i.Builder clearY() {
         this.bitField0_ &= -3;
         this.y_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getZ() {
         return this.z_;
      }

      public Vector3i.Builder setZ(int var1) {
         this.z_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public Vector3i.Builder clearZ() {
         this.bitField0_ &= -5;
         this.z_ = 0;
         this.onChanged();
         return this;
      }

      public final Vector3i.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Vector3i.Builder)super.setUnknownFields(var1);
      }

      public final Vector3i.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Vector3i.Builder)super.mergeUnknownFields(var1);
      }
   }
}
