package com.lunarclient.apollo.vignette.v1;

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

public final class DisplayVignetteMessage extends GeneratedMessageV3 implements DisplayVignetteMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int RESOURCE_LOCATION_FIELD_NUMBER = 1;
   private volatile Object resourceLocation_ = "";
   public static final int OPACITY_FIELD_NUMBER = 2;
   private float opacity_ = 0.0F;
   private byte memoizedIsInitialized = -1;
   private static final DisplayVignetteMessage DEFAULT_INSTANCE = new DisplayVignetteMessage();
   private static final Parser<DisplayVignetteMessage> PARSER = new AbstractParser<DisplayVignetteMessage>() {
      public DisplayVignetteMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DisplayVignetteMessage.Builder var3 = DisplayVignetteMessage.newBuilder();

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

   private DisplayVignetteMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DisplayVignetteMessage() {
      this.resourceLocation_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DisplayVignetteMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_vignette_v1_DisplayVignetteMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_vignette_v1_DisplayVignetteMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DisplayVignetteMessage.class, DisplayVignetteMessage.Builder.class);
   }

   @Override
   public String getResourceLocation() {
      Object var1 = this.resourceLocation_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.resourceLocation_ = var3;
      return var3;
   }

   @Override
   public ByteString getResourceLocationBytes() {
      Object var1 = this.resourceLocation_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.resourceLocation_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public float getOpacity() {
      return this.opacity_;
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
      if (!GeneratedMessageV3.isStringEmpty(this.resourceLocation_)) {
         GeneratedMessageV3.writeString(var1, 1, this.resourceLocation_);
      }

      if (Float.floatToRawIntBits(this.opacity_) != 0) {
         var1.writeFloat(2, this.opacity_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.resourceLocation_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.resourceLocation_);
      }

      if (Float.floatToRawIntBits(this.opacity_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(2, this.opacity_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof DisplayVignetteMessage)) {
         return super.equals(var1);
      } else {
         DisplayVignetteMessage var2 = (DisplayVignetteMessage)var1;
         if (!this.getResourceLocation().equals(var2.getResourceLocation())) {
            return false;
         } else {
            return Float.floatToIntBits(this.getOpacity()) != Float.floatToIntBits(var2.getOpacity())
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
      var1 = 53 * var1 + this.getResourceLocation().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Float.floatToIntBits(this.getOpacity());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DisplayVignetteMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayVignetteMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayVignetteMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayVignetteMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayVignetteMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayVignetteMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayVignetteMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayVignetteMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DisplayVignetteMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DisplayVignetteMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DisplayVignetteMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayVignetteMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DisplayVignetteMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DisplayVignetteMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DisplayVignetteMessage.Builder newBuilder(DisplayVignetteMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DisplayVignetteMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DisplayVignetteMessage.Builder() : new DisplayVignetteMessage.Builder().mergeFrom(this);
   }

   protected DisplayVignetteMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DisplayVignetteMessage.Builder(var1);
   }

   public static DisplayVignetteMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DisplayVignetteMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<DisplayVignetteMessage> getParserForType() {
      return PARSER;
   }

   public DisplayVignetteMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<DisplayVignetteMessage.Builder> implements DisplayVignetteMessageOrBuilder {
      private int bitField0_;
      private Object resourceLocation_ = "";
      private float opacity_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_vignette_v1_DisplayVignetteMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_vignette_v1_DisplayVignetteMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DisplayVignetteMessage.class, DisplayVignetteMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public DisplayVignetteMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.resourceLocation_ = "";
         this.opacity_ = 0.0F;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_vignette_v1_DisplayVignetteMessage_descriptor;
      }

      public DisplayVignetteMessage getDefaultInstanceForType() {
         return DisplayVignetteMessage.getDefaultInstance();
      }

      public DisplayVignetteMessage build() {
         DisplayVignetteMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DisplayVignetteMessage buildPartial() {
         DisplayVignetteMessage var1 = new DisplayVignetteMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(DisplayVignetteMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.resourceLocation_ = this.resourceLocation_;
         }

         if ((var2 & 2) != 0) {
            var1.opacity_ = this.opacity_;
         }
      }

      public DisplayVignetteMessage.Builder clone() {
         return (DisplayVignetteMessage.Builder)super.clone();
      }

      public DisplayVignetteMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayVignetteMessage.Builder)super.setField(var1, var2);
      }

      public DisplayVignetteMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DisplayVignetteMessage.Builder)super.clearField(var1);
      }

      public DisplayVignetteMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DisplayVignetteMessage.Builder)super.clearOneof(var1);
      }

      public DisplayVignetteMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DisplayVignetteMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DisplayVignetteMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayVignetteMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public DisplayVignetteMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof DisplayVignetteMessage) {
            return this.mergeFrom((DisplayVignetteMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DisplayVignetteMessage.Builder mergeFrom(DisplayVignetteMessage var1) {
         if (var1 == DisplayVignetteMessage.getDefaultInstance()) {
            return this;
         }

         if (!var1.getResourceLocation().isEmpty()) {
            this.resourceLocation_ = var1.resourceLocation_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.getOpacity() != 0.0F) {
            this.setOpacity(var1.getOpacity());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public DisplayVignetteMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.resourceLocation_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 21:
                     this.opacity_ = var1.readFloat();
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
      public String getResourceLocation() {
         Object var1 = this.resourceLocation_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.resourceLocation_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getResourceLocationBytes() {
         Object var1 = this.resourceLocation_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.resourceLocation_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public DisplayVignetteMessage.Builder setResourceLocation(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.resourceLocation_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public DisplayVignetteMessage.Builder clearResourceLocation() {
         this.resourceLocation_ = DisplayVignetteMessage.getDefaultInstance().getResourceLocation();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public DisplayVignetteMessage.Builder setResourceLocationBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         DisplayVignetteMessage.checkByteStringIsUtf8(var1);
         this.resourceLocation_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public float getOpacity() {
         return this.opacity_;
      }

      public DisplayVignetteMessage.Builder setOpacity(float var1) {
         this.opacity_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public DisplayVignetteMessage.Builder clearOpacity() {
         this.bitField0_ &= -3;
         this.opacity_ = 0.0F;
         this.onChanged();
         return this;
      }

      public final DisplayVignetteMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DisplayVignetteMessage.Builder)super.setUnknownFields(var1);
      }

      public final DisplayVignetteMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DisplayVignetteMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
