package com.lunarclient.websocket.screenshot.v1;

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

public final class Dimensions extends GeneratedMessageV3 implements DimensionsOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int WIDTH_FIELD_NUMBER = 1;
   private long width_ = 0L;
   public static final int HEIGHT_FIELD_NUMBER = 2;
   private long height_ = 0L;
   private byte memoizedIsInitialized = -1;
   private static final Dimensions DEFAULT_INSTANCE = new Dimensions();
   private static final Parser<Dimensions> PARSER = new AbstractParser<Dimensions>() {
      public Dimensions parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Dimensions.Builder var3 = Dimensions.newBuilder();

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

   private Dimensions(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Dimensions() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Dimensions();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_screenshot_v1_Dimensions_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_screenshot_v1_Dimensions_fieldAccessorTable
         .ensureFieldAccessorsInitialized(Dimensions.class, Dimensions.Builder.class);
   }

   @Override
   public long getWidth() {
      return this.width_;
   }

   @Override
   public long getHeight() {
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
      if (this.width_ != 0L) {
         var1.writeInt64(1, this.width_);
      }

      if (this.height_ != 0L) {
         var1.writeInt64(2, this.height_);
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
      if (this.width_ != 0L) {
         var1 += CodedOutputStream.computeInt64Size(1, this.width_);
      }

      if (this.height_ != 0L) {
         var1 += CodedOutputStream.computeInt64Size(2, this.height_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Dimensions)) {
         return super.equals(var1);
      } else {
         Dimensions var2 = (Dimensions)var1;
         if (this.getWidth() != var2.getWidth()) {
            return false;
         } else {
            return this.getHeight() != var2.getHeight() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + Internal.hashLong(this.getWidth());
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Internal.hashLong(this.getHeight());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Dimensions parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Dimensions parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Dimensions parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Dimensions parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Dimensions parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Dimensions parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Dimensions parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Dimensions parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Dimensions parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Dimensions parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Dimensions parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Dimensions parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Dimensions.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Dimensions.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Dimensions.Builder newBuilder(Dimensions var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Dimensions.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Dimensions.Builder() : new Dimensions.Builder().mergeFrom(this);
   }

   protected Dimensions.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Dimensions.Builder(var1);
   }

   public static Dimensions getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Dimensions> parser() {
      return PARSER;
   }

   @Override
   public Parser<Dimensions> getParserForType() {
      return PARSER;
   }

   public Dimensions getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Dimensions.Builder> implements DimensionsOrBuilder {
      private int bitField0_;
      private long width_;
      private long height_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_screenshot_v1_Dimensions_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_screenshot_v1_Dimensions_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Dimensions.class, Dimensions.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public Dimensions.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.width_ = 0L;
         this.height_ = 0L;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_screenshot_v1_Dimensions_descriptor;
      }

      public Dimensions getDefaultInstanceForType() {
         return Dimensions.getDefaultInstance();
      }

      public Dimensions build() {
         Dimensions var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Dimensions buildPartial() {
         Dimensions var1 = new Dimensions(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Dimensions var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.width_ = this.width_;
         }

         if ((var2 & 2) != 0) {
            var1.height_ = this.height_;
         }
      }

      public Dimensions.Builder clone() {
         return (Dimensions.Builder)super.clone();
      }

      public Dimensions.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Dimensions.Builder)super.setField(var1, var2);
      }

      public Dimensions.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Dimensions.Builder)super.clearField(var1);
      }

      public Dimensions.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Dimensions.Builder)super.clearOneof(var1);
      }

      public Dimensions.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Dimensions.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Dimensions.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Dimensions.Builder)super.addRepeatedField(var1, var2);
      }

      public Dimensions.Builder mergeFrom(Message var1) {
         if (var1 instanceof Dimensions) {
            return this.mergeFrom((Dimensions)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Dimensions.Builder mergeFrom(Dimensions var1) {
         if (var1 == Dimensions.getDefaultInstance()) {
            return this;
         }

         if (var1.getWidth() != 0L) {
            this.setWidth(var1.getWidth());
         }

         if (var1.getHeight() != 0L) {
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

      public Dimensions.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.width_ = var1.readInt64();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.height_ = var1.readInt64();
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
      public long getWidth() {
         return this.width_;
      }

      public Dimensions.Builder setWidth(long var1) {
         this.width_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Dimensions.Builder clearWidth() {
         this.bitField0_ &= -2;
         this.width_ = 0L;
         this.onChanged();
         return this;
      }

      @Override
      public long getHeight() {
         return this.height_;
      }

      public Dimensions.Builder setHeight(long var1) {
         this.height_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Dimensions.Builder clearHeight() {
         this.bitField0_ &= -3;
         this.height_ = 0L;
         this.onChanged();
         return this;
      }

      public final Dimensions.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Dimensions.Builder)super.setUnknownFields(var1);
      }

      public final Dimensions.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Dimensions.Builder)super.mergeUnknownFields(var1);
      }
   }
}
