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

public final class GlobalPos extends GeneratedMessageV3 implements GlobalPosOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int DIMENSION_FIELD_NUMBER = 1;
   private volatile Object dimension_ = "";
   public static final int X_FIELD_NUMBER = 2;
   private int x_ = 0;
   public static final int Y_FIELD_NUMBER = 3;
   private int y_ = 0;
   public static final int Z_FIELD_NUMBER = 4;
   private int z_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final GlobalPos DEFAULT_INSTANCE = new GlobalPos();
   private static final Parser<GlobalPos> PARSER = new AbstractParser<GlobalPos>() {
      public GlobalPos parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         GlobalPos.Builder var3 = GlobalPos.newBuilder();

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

   private GlobalPos(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private GlobalPos() {
      this.dimension_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new GlobalPos();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PositionProto.internal_static_lunarclient_common_v1_GlobalPos_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PositionProto.internal_static_lunarclient_common_v1_GlobalPos_fieldAccessorTable
         .ensureFieldAccessorsInitialized(GlobalPos.class, GlobalPos.Builder.class);
   }

   @Override
   public String getDimension() {
      Object var1 = this.dimension_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.dimension_ = var3;
      return var3;
   }

   @Override
   public ByteString getDimensionBytes() {
      Object var1 = this.dimension_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.dimension_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
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
      if (!GeneratedMessageV3.isStringEmpty(this.dimension_)) {
         GeneratedMessageV3.writeString(var1, 1, this.dimension_);
      }

      if (this.x_ != 0) {
         var1.writeInt32(2, this.x_);
      }

      if (this.y_ != 0) {
         var1.writeInt32(3, this.y_);
      }

      if (this.z_ != 0) {
         var1.writeInt32(4, this.z_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.dimension_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.dimension_);
      }

      if (this.x_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.x_);
      }

      if (this.y_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(3, this.y_);
      }

      if (this.z_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(4, this.z_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof GlobalPos)) {
         return super.equals(var1);
      } else {
         GlobalPos var2 = (GlobalPos)var1;
         if (!this.getDimension().equals(var2.getDimension())) {
            return false;
         } else if (this.getX() != var2.getX()) {
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
      var1 = 53 * var1 + this.getDimension().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getX();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getY();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getZ();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static GlobalPos parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static GlobalPos parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GlobalPos parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static GlobalPos parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GlobalPos parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static GlobalPos parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GlobalPos parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GlobalPos parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static GlobalPos parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static GlobalPos parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static GlobalPos parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GlobalPos parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public GlobalPos.Builder newBuilderForType() {
      return newBuilder();
   }

   public static GlobalPos.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static GlobalPos.Builder newBuilder(GlobalPos var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public GlobalPos.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new GlobalPos.Builder() : new GlobalPos.Builder().mergeFrom(this);
   }

   protected GlobalPos.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new GlobalPos.Builder(var1);
   }

   public static GlobalPos getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<GlobalPos> parser() {
      return PARSER;
   }

   @Override
   public Parser<GlobalPos> getParserForType() {
      return PARSER;
   }

   public GlobalPos getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<GlobalPos.Builder> implements GlobalPosOrBuilder {
      private int bitField0_;
      private Object dimension_ = "";
      private int x_;
      private int y_;
      private int z_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PositionProto.internal_static_lunarclient_common_v1_GlobalPos_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PositionProto.internal_static_lunarclient_common_v1_GlobalPos_fieldAccessorTable
            .ensureFieldAccessorsInitialized(GlobalPos.class, GlobalPos.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public GlobalPos.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.dimension_ = "";
         this.x_ = 0;
         this.y_ = 0;
         this.z_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PositionProto.internal_static_lunarclient_common_v1_GlobalPos_descriptor;
      }

      public GlobalPos getDefaultInstanceForType() {
         return GlobalPos.getDefaultInstance();
      }

      public GlobalPos build() {
         GlobalPos var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public GlobalPos buildPartial() {
         GlobalPos var1 = new GlobalPos(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(GlobalPos var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.dimension_ = this.dimension_;
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

      public GlobalPos.Builder clone() {
         return (GlobalPos.Builder)super.clone();
      }

      public GlobalPos.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GlobalPos.Builder)super.setField(var1, var2);
      }

      public GlobalPos.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (GlobalPos.Builder)super.clearField(var1);
      }

      public GlobalPos.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (GlobalPos.Builder)super.clearOneof(var1);
      }

      public GlobalPos.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (GlobalPos.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public GlobalPos.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GlobalPos.Builder)super.addRepeatedField(var1, var2);
      }

      public GlobalPos.Builder mergeFrom(Message var1) {
         if (var1 instanceof GlobalPos) {
            return this.mergeFrom((GlobalPos)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public GlobalPos.Builder mergeFrom(GlobalPos var1) {
         if (var1 == GlobalPos.getDefaultInstance()) {
            return this;
         }

         if (!var1.getDimension().isEmpty()) {
            this.dimension_ = var1.dimension_;
            this.bitField0_ |= 1;
            this.onChanged();
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

      public GlobalPos.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.dimension_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.x_ = var1.readInt32();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.y_ = var1.readInt32();
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.z_ = var1.readInt32();
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
      public String getDimension() {
         Object var1 = this.dimension_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.dimension_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getDimensionBytes() {
         Object var1 = this.dimension_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.dimension_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public GlobalPos.Builder setDimension(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.dimension_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public GlobalPos.Builder clearDimension() {
         this.dimension_ = GlobalPos.getDefaultInstance().getDimension();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public GlobalPos.Builder setDimensionBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         GlobalPos.checkByteStringIsUtf8(var1);
         this.dimension_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public int getX() {
         return this.x_;
      }

      public GlobalPos.Builder setX(int var1) {
         this.x_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public GlobalPos.Builder clearX() {
         this.bitField0_ &= -3;
         this.x_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getY() {
         return this.y_;
      }

      public GlobalPos.Builder setY(int var1) {
         this.y_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public GlobalPos.Builder clearY() {
         this.bitField0_ &= -5;
         this.y_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getZ() {
         return this.z_;
      }

      public GlobalPos.Builder setZ(int var1) {
         this.z_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public GlobalPos.Builder clearZ() {
         this.bitField0_ &= -9;
         this.z_ = 0;
         this.onChanged();
         return this;
      }

      public final GlobalPos.Builder setUnknownFields(UnknownFieldSet var1) {
         return (GlobalPos.Builder)super.setUnknownFields(var1);
      }

      public final GlobalPos.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (GlobalPos.Builder)super.mergeUnknownFields(var1);
      }
   }
}
