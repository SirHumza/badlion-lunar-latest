package com.lunarclient.apollo.button.v1;

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

public final class ButtonSize extends GeneratedMessageV3 implements ButtonSizeOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int WIDTH_FIELD_NUMBER = 1;
   private float width_ = 0.0F;
   public static final int HEIGHT_FIELD_NUMBER = 2;
   private float height_ = 0.0F;
   private byte memoizedIsInitialized = -1;
   private static final ButtonSize DEFAULT_INSTANCE = new ButtonSize();
   private static final Parser<ButtonSize> PARSER = new AbstractParser<ButtonSize>() {
      public ButtonSize parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ButtonSize.Builder var3 = ButtonSize.newBuilder();

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

   private ButtonSize(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ButtonSize() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ButtonSize();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonSize_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonSize_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ButtonSize.class, ButtonSize.Builder.class);
   }

   @Override
   public float getWidth() {
      return this.width_;
   }

   @Override
   public float getHeight() {
      return this.height_;
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
      if (Float.floatToRawIntBits(this.width_) != 0) {
         var1.writeFloat(1, this.width_);
      }

      if (Float.floatToRawIntBits(this.height_) != 0) {
         var1.writeFloat(2, this.height_);
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
      if (Float.floatToRawIntBits(this.width_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(1, this.width_);
      }

      if (Float.floatToRawIntBits(this.height_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(2, this.height_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ButtonSize)) {
         return super.equals(var1);
      } else {
         ButtonSize var2 = (ButtonSize)var1;
         if (Float.floatToIntBits(this.getWidth()) != Float.floatToIntBits(var2.getWidth())) {
            return false;
         } else {
            return Float.floatToIntBits(this.getHeight()) != Float.floatToIntBits(var2.getHeight())
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
      var1 = 53 * var1 + Float.floatToIntBits(this.getWidth());
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Float.floatToIntBits(this.getHeight());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ButtonSize parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ButtonSize parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ButtonSize parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ButtonSize parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ButtonSize parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ButtonSize parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ButtonSize parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ButtonSize parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ButtonSize parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ButtonSize parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ButtonSize parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ButtonSize parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ButtonSize.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ButtonSize.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ButtonSize.Builder newBuilder(ButtonSize var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ButtonSize.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ButtonSize.Builder() : new ButtonSize.Builder().mergeFrom(this);
   }

   protected ButtonSize.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ButtonSize.Builder(var1);
   }

   public static ButtonSize getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ButtonSize> parser() {
      return PARSER;
   }

   @Override
   public Parser<ButtonSize> getParserForType() {
      return PARSER;
   }

   public ButtonSize getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ButtonSize.Builder> implements ButtonSizeOrBuilder {
      private int bitField0_;
      private float width_;
      private float height_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonSize_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonSize_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ButtonSize.class, ButtonSize.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ButtonSize.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.width_ = 0.0F;
         this.height_ = 0.0F;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonSize_descriptor;
      }

      public ButtonSize getDefaultInstanceForType() {
         return ButtonSize.getDefaultInstance();
      }

      public ButtonSize build() {
         ButtonSize var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ButtonSize buildPartial() {
         ButtonSize var1 = new ButtonSize(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ButtonSize var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.width_ = this.width_;
         }

         if ((var2 & 2) != 0) {
            var1.height_ = this.height_;
         }
      }

      public ButtonSize.Builder clone() {
         return (ButtonSize.Builder)super.clone();
      }

      public ButtonSize.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ButtonSize.Builder)super.setField(var1, var2);
      }

      public ButtonSize.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ButtonSize.Builder)super.clearField(var1);
      }

      public ButtonSize.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ButtonSize.Builder)super.clearOneof(var1);
      }

      public ButtonSize.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ButtonSize.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ButtonSize.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ButtonSize.Builder)super.addRepeatedField(var1, var2);
      }

      public ButtonSize.Builder mergeFrom(Message var1) {
         if (var1 instanceof ButtonSize) {
            return this.mergeFrom((ButtonSize)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ButtonSize.Builder mergeFrom(ButtonSize var1) {
         if (var1 == ButtonSize.getDefaultInstance()) {
            return this;
         }

         if (var1.getWidth() != 0.0F) {
            this.setWidth(var1.getWidth());
         }

         if (var1.getHeight() != 0.0F) {
            this.setHeight(var1.getHeight());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ButtonSize.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.width_ = var1.readFloat();
                     this.bitField0_ |= 1;
                     break;
                  case 21:
                     this.height_ = var1.readFloat();
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
      public float getWidth() {
         return this.width_;
      }

      public ButtonSize.Builder setWidth(float var1) {
         this.width_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ButtonSize.Builder clearWidth() {
         this.bitField0_ &= -2;
         this.width_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public float getHeight() {
         return this.height_;
      }

      public ButtonSize.Builder setHeight(float var1) {
         this.height_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ButtonSize.Builder clearHeight() {
         this.bitField0_ &= -3;
         this.height_ = 0.0F;
         this.onChanged();
         return this;
      }

      public final ButtonSize.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ButtonSize.Builder)super.setUnknownFields(var1);
      }

      public final ButtonSize.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ButtonSize.Builder)super.mergeUnknownFields(var1);
      }
   }
}
