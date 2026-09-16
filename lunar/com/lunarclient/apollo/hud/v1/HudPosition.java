package com.lunarclient.apollo.hud.v1;

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

public final class HudPosition extends GeneratedMessageV3 implements HudPositionOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int X_FIELD_NUMBER = 1;
   private float x_ = 0.0F;
   public static final int Y_FIELD_NUMBER = 2;
   private float y_ = 0.0F;
   private byte memoizedIsInitialized = -1;
   private static final HudPosition DEFAULT_INSTANCE = new HudPosition();
   private static final Parser<HudPosition> PARSER = new AbstractParser<HudPosition>() {
      public HudPosition parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         HudPosition.Builder var3 = HudPosition.newBuilder();

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

   private HudPosition(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private HudPosition() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new HudPosition();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PositionProto.internal_static_lunarclient_apollo_hud_v1_HudPosition_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PositionProto.internal_static_lunarclient_apollo_hud_v1_HudPosition_fieldAccessorTable
         .ensureFieldAccessorsInitialized(HudPosition.class, HudPosition.Builder.class);
   }

   @Override
   public float getX() {
      return this.x_;
   }

   @Override
   public float getY() {
      return this.y_;
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
      if (Float.floatToRawIntBits(this.x_) != 0) {
         var1.writeFloat(1, this.x_);
      }

      if (Float.floatToRawIntBits(this.y_) != 0) {
         var1.writeFloat(2, this.y_);
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
      if (Float.floatToRawIntBits(this.x_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(1, this.x_);
      }

      if (Float.floatToRawIntBits(this.y_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(2, this.y_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof HudPosition)) {
         return super.equals(var1);
      } else {
         HudPosition var2 = (HudPosition)var1;
         if (Float.floatToIntBits(this.getX()) != Float.floatToIntBits(var2.getX())) {
            return false;
         } else {
            return Float.floatToIntBits(this.getY()) != Float.floatToIntBits(var2.getY()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + Float.floatToIntBits(this.getX());
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Float.floatToIntBits(this.getY());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static HudPosition parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static HudPosition parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HudPosition parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static HudPosition parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HudPosition parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static HudPosition parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HudPosition parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static HudPosition parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static HudPosition parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static HudPosition parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static HudPosition parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static HudPosition parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public HudPosition.Builder newBuilderForType() {
      return newBuilder();
   }

   public static HudPosition.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static HudPosition.Builder newBuilder(HudPosition var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public HudPosition.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new HudPosition.Builder() : new HudPosition.Builder().mergeFrom(this);
   }

   protected HudPosition.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new HudPosition.Builder(var1);
   }

   public static HudPosition getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<HudPosition> parser() {
      return PARSER;
   }

   @Override
   public Parser<HudPosition> getParserForType() {
      return PARSER;
   }

   public HudPosition getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<HudPosition.Builder> implements HudPositionOrBuilder {
      private int bitField0_;
      private float x_;
      private float y_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PositionProto.internal_static_lunarclient_apollo_hud_v1_HudPosition_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PositionProto.internal_static_lunarclient_apollo_hud_v1_HudPosition_fieldAccessorTable
            .ensureFieldAccessorsInitialized(HudPosition.class, HudPosition.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public HudPosition.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.x_ = 0.0F;
         this.y_ = 0.0F;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PositionProto.internal_static_lunarclient_apollo_hud_v1_HudPosition_descriptor;
      }

      public HudPosition getDefaultInstanceForType() {
         return HudPosition.getDefaultInstance();
      }

      public HudPosition build() {
         HudPosition var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public HudPosition buildPartial() {
         HudPosition var1 = new HudPosition(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(HudPosition var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.x_ = this.x_;
         }

         if ((var2 & 2) != 0) {
            var1.y_ = this.y_;
         }
      }

      public HudPosition.Builder clone() {
         return (HudPosition.Builder)super.clone();
      }

      public HudPosition.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (HudPosition.Builder)super.setField(var1, var2);
      }

      public HudPosition.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (HudPosition.Builder)super.clearField(var1);
      }

      public HudPosition.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (HudPosition.Builder)super.clearOneof(var1);
      }

      public HudPosition.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (HudPosition.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public HudPosition.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (HudPosition.Builder)super.addRepeatedField(var1, var2);
      }

      public HudPosition.Builder mergeFrom(Message var1) {
         if (var1 instanceof HudPosition) {
            return this.mergeFrom((HudPosition)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public HudPosition.Builder mergeFrom(HudPosition var1) {
         if (var1 == HudPosition.getDefaultInstance()) {
            return this;
         }

         if (var1.getX() != 0.0F) {
            this.setX(var1.getX());
         }

         if (var1.getY() != 0.0F) {
            this.setY(var1.getY());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public HudPosition.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 13:
                     this.x_ = var1.readFloat();
                     this.bitField0_ |= 1;
                     break;
                  case 21:
                     this.y_ = var1.readFloat();
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
      public float getX() {
         return this.x_;
      }

      public HudPosition.Builder setX(float var1) {
         this.x_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public HudPosition.Builder clearX() {
         this.bitField0_ &= -2;
         this.x_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public float getY() {
         return this.y_;
      }

      public HudPosition.Builder setY(float var1) {
         this.y_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public HudPosition.Builder clearY() {
         this.bitField0_ &= -3;
         this.y_ = 0.0F;
         this.onChanged();
         return this;
      }

      public final HudPosition.Builder setUnknownFields(UnknownFieldSet var1) {
         return (HudPosition.Builder)super.setUnknownFields(var1);
      }

      public final HudPosition.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (HudPosition.Builder)super.mergeUnknownFields(var1);
      }
   }
}
