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

public final class Vector2i extends GeneratedMessageV3 implements Vector2iOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int X_FIELD_NUMBER = 1;
   private int x_ = 0;
   public static final int Z_FIELD_NUMBER = 3;
   private int z_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final Vector2i DEFAULT_INSTANCE = new Vector2i();
   private static final Parser<Vector2i> PARSER = new AbstractParser<Vector2i>() {
      public Vector2i parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Vector2i.Builder var3 = Vector2i.newBuilder();

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

   private Vector2i(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Vector2i() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Vector2i();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PositionProto.internal_static_lunarclient_common_v1_Vector2i_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PositionProto.internal_static_lunarclient_common_v1_Vector2i_fieldAccessorTable
         .ensureFieldAccessorsInitialized(Vector2i.class, Vector2i.Builder.class);
   }

   @Override
   public int getX() {
      return this.x_;
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
      } else if (!(var1 instanceof Vector2i)) {
         return super.equals(var1);
      } else {
         Vector2i var2 = (Vector2i)var1;
         if (this.getX() != var2.getX()) {
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
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getZ();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Vector2i parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Vector2i parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Vector2i parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Vector2i parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Vector2i parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Vector2i parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Vector2i parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Vector2i parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Vector2i parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Vector2i parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Vector2i parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Vector2i parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Vector2i.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Vector2i.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Vector2i.Builder newBuilder(Vector2i var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Vector2i.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Vector2i.Builder() : new Vector2i.Builder().mergeFrom(this);
   }

   protected Vector2i.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Vector2i.Builder(var1);
   }

   public static Vector2i getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Vector2i> parser() {
      return PARSER;
   }

   @Override
   public Parser<Vector2i> getParserForType() {
      return PARSER;
   }

   public Vector2i getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Vector2i.Builder> implements Vector2iOrBuilder {
      private int bitField0_;
      private int x_;
      private int z_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PositionProto.internal_static_lunarclient_common_v1_Vector2i_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PositionProto.internal_static_lunarclient_common_v1_Vector2i_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Vector2i.class, Vector2i.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public Vector2i.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.x_ = 0;
         this.z_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PositionProto.internal_static_lunarclient_common_v1_Vector2i_descriptor;
      }

      public Vector2i getDefaultInstanceForType() {
         return Vector2i.getDefaultInstance();
      }

      public Vector2i build() {
         Vector2i var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Vector2i buildPartial() {
         Vector2i var1 = new Vector2i(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Vector2i var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.x_ = this.x_;
         }

         if ((var2 & 2) != 0) {
            var1.z_ = this.z_;
         }
      }

      public Vector2i.Builder clone() {
         return (Vector2i.Builder)super.clone();
      }

      public Vector2i.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Vector2i.Builder)super.setField(var1, var2);
      }

      public Vector2i.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Vector2i.Builder)super.clearField(var1);
      }

      public Vector2i.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Vector2i.Builder)super.clearOneof(var1);
      }

      public Vector2i.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Vector2i.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Vector2i.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Vector2i.Builder)super.addRepeatedField(var1, var2);
      }

      public Vector2i.Builder mergeFrom(Message var1) {
         if (var1 instanceof Vector2i) {
            return this.mergeFrom((Vector2i)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Vector2i.Builder mergeFrom(Vector2i var1) {
         if (var1 == Vector2i.getDefaultInstance()) {
            return this;
         }

         if (var1.getX() != 0) {
            this.setX(var1.getX());
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

      public Vector2i.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 24:
                     this.z_ = var1.readInt32();
                     this.bitField0_ |= 2;
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

      public Vector2i.Builder setX(int var1) {
         this.x_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Vector2i.Builder clearX() {
         this.bitField0_ &= -2;
         this.x_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getZ() {
         return this.z_;
      }

      public Vector2i.Builder setZ(int var1) {
         this.z_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Vector2i.Builder clearZ() {
         this.bitField0_ &= -3;
         this.z_ = 0;
         this.onChanged();
         return this;
      }

      public final Vector2i.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Vector2i.Builder)super.setUnknownFields(var1);
      }

      public final Vector2i.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Vector2i.Builder)super.mergeUnknownFields(var1);
      }
   }
}
