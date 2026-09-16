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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Color extends GeneratedMessageV3 implements ColorOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int COLOR_FIELD_NUMBER = 1;
   private int color_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final Color DEFAULT_INSTANCE = new Color();
   private static final Parser<Color> PARSER = new AbstractParser<Color>() {
      public Color parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Color.Builder var3 = Color.newBuilder();

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

   private Color(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Color() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Color();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ColorProto.internal_static_lunarclient_apollo_common_v1_Color_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ColorProto.internal_static_lunarclient_apollo_common_v1_Color_fieldAccessorTable.ensureFieldAccessorsInitialized(Color.class, Color.Builder.class);
   }

   @Override
   public int getColor() {
      return this.color_;
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
      if (this.color_ != 0) {
         var1.writeInt32(1, this.color_);
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
      if (this.color_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.color_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof Color)) {
         return super.equals(var1);
      }

      Color var2 = (Color)var1;
      return this.getColor() != var2.getColor() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getColor();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Color parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Color parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Color parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Color parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Color parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Color parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Color parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Color parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Color parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Color parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Color parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Color parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Color.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Color.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Color.Builder newBuilder(Color var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Color.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Color.Builder() : new Color.Builder().mergeFrom(this);
   }

   protected Color.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Color.Builder(var1);
   }

   public static Color getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Color> parser() {
      return PARSER;
   }

   @Override
   public Parser<Color> getParserForType() {
      return PARSER;
   }

   public Color getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Color.Builder> implements ColorOrBuilder {
      private int bitField0_;
      private int color_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ColorProto.internal_static_lunarclient_apollo_common_v1_Color_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ColorProto.internal_static_lunarclient_apollo_common_v1_Color_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Color.class, Color.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public Color.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.color_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ColorProto.internal_static_lunarclient_apollo_common_v1_Color_descriptor;
      }

      public Color getDefaultInstanceForType() {
         return Color.getDefaultInstance();
      }

      public Color build() {
         Color var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Color buildPartial() {
         Color var1 = new Color(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Color var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.color_ = this.color_;
         }
      }

      public Color.Builder clone() {
         return (Color.Builder)super.clone();
      }

      public Color.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Color.Builder)super.setField(var1, var2);
      }

      public Color.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Color.Builder)super.clearField(var1);
      }

      public Color.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Color.Builder)super.clearOneof(var1);
      }

      public Color.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Color.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Color.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Color.Builder)super.addRepeatedField(var1, var2);
      }

      public Color.Builder mergeFrom(Message var1) {
         if (var1 instanceof Color) {
            return this.mergeFrom((Color)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Color.Builder mergeFrom(Color var1) {
         if (var1 == Color.getDefaultInstance()) {
            return this;
         }

         if (var1.getColor() != 0) {
            this.setColor(var1.getColor());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public Color.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.color_ = var1.readInt32();
                     this.bitField0_ |= 1;
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
      public int getColor() {
         return this.color_;
      }

      public Color.Builder setColor(int var1) {
         this.color_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Color.Builder clearColor() {
         this.bitField0_ &= -2;
         this.color_ = 0;
         this.onChanged();
         return this;
      }

      public final Color.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Color.Builder)super.setUnknownFields(var1);
      }

      public final Color.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Color.Builder)super.mergeUnknownFields(var1);
      }
   }
}
