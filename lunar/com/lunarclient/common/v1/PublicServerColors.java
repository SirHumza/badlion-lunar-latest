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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class PublicServerColors extends GeneratedMessageV3 implements PublicServerColorsOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PRIMARY_FIELD_NUMBER = 1;
   private Color primary_;
   public static final int SECONDARY_FIELD_NUMBER = 2;
   private Color secondary_;
   private byte memoizedIsInitialized = -1;
   private static final PublicServerColors DEFAULT_INSTANCE = new PublicServerColors();
   private static final Parser<PublicServerColors> PARSER = new AbstractParser<PublicServerColors>() {
      public PublicServerColors parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PublicServerColors.Builder var3 = PublicServerColors.newBuilder();

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

   private PublicServerColors(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PublicServerColors() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PublicServerColors();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return LocationProto.internal_static_lunarclient_common_v1_PublicServerColors_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return LocationProto.internal_static_lunarclient_common_v1_PublicServerColors_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PublicServerColors.class, PublicServerColors.Builder.class);
   }

   @Override
   public boolean hasPrimary() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Color getPrimary() {
      return this.primary_ == null ? Color.getDefaultInstance() : this.primary_;
   }

   @Override
   public ColorOrBuilder getPrimaryOrBuilder() {
      return this.primary_ == null ? Color.getDefaultInstance() : this.primary_;
   }

   @Override
   public boolean hasSecondary() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Color getSecondary() {
      return this.secondary_ == null ? Color.getDefaultInstance() : this.secondary_;
   }

   @Override
   public ColorOrBuilder getSecondaryOrBuilder() {
      return this.secondary_ == null ? Color.getDefaultInstance() : this.secondary_;
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
      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(1, this.getPrimary());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getSecondary());
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
      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(1, this.getPrimary());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getSecondary());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PublicServerColors)) {
         return super.equals(var1);
      } else {
         PublicServerColors var2 = (PublicServerColors)var1;
         if (this.hasPrimary() != var2.hasPrimary()) {
            return false;
         } else if (this.hasPrimary() && !this.getPrimary().equals(var2.getPrimary())) {
            return false;
         } else if (this.hasSecondary() != var2.hasSecondary()) {
            return false;
         } else {
            return this.hasSecondary() && !this.getSecondary().equals(var2.getSecondary()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasPrimary()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getPrimary().hashCode();
      }

      if (this.hasSecondary()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getSecondary().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PublicServerColors parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PublicServerColors parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PublicServerColors parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PublicServerColors parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PublicServerColors parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PublicServerColors parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PublicServerColors parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PublicServerColors parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PublicServerColors parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PublicServerColors parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PublicServerColors parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PublicServerColors parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PublicServerColors.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PublicServerColors.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PublicServerColors.Builder newBuilder(PublicServerColors var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PublicServerColors.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PublicServerColors.Builder() : new PublicServerColors.Builder().mergeFrom(this);
   }

   protected PublicServerColors.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PublicServerColors.Builder(var1);
   }

   public static PublicServerColors getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PublicServerColors> parser() {
      return PARSER;
   }

   @Override
   public Parser<PublicServerColors> getParserForType() {
      return PARSER;
   }

   public PublicServerColors getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PublicServerColors.Builder> implements PublicServerColorsOrBuilder {
      private int bitField0_;
      private Color primary_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> primaryBuilder_;
      private Color secondary_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> secondaryBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return LocationProto.internal_static_lunarclient_common_v1_PublicServerColors_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LocationProto.internal_static_lunarclient_common_v1_PublicServerColors_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PublicServerColors.class, PublicServerColors.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (PublicServerColors.alwaysUseFieldBuilders) {
            this.getPrimaryFieldBuilder();
            this.getSecondaryFieldBuilder();
         }
      }

      public PublicServerColors.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.primary_ = null;
         if (this.primaryBuilder_ != null) {
            this.primaryBuilder_.dispose();
            this.primaryBuilder_ = null;
         }

         this.secondary_ = null;
         if (this.secondaryBuilder_ != null) {
            this.secondaryBuilder_.dispose();
            this.secondaryBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return LocationProto.internal_static_lunarclient_common_v1_PublicServerColors_descriptor;
      }

      public PublicServerColors getDefaultInstanceForType() {
         return PublicServerColors.getDefaultInstance();
      }

      public PublicServerColors build() {
         PublicServerColors var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PublicServerColors buildPartial() {
         PublicServerColors var1 = new PublicServerColors(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(PublicServerColors var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.primary_ = this.primaryBuilder_ == null ? this.primary_ : this.primaryBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.secondary_ = this.secondaryBuilder_ == null ? this.secondary_ : this.secondaryBuilder_.build();
            var3 |= 2;
         }

         PublicServerColors var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public PublicServerColors.Builder clone() {
         return (PublicServerColors.Builder)super.clone();
      }

      public PublicServerColors.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PublicServerColors.Builder)super.setField(var1, var2);
      }

      public PublicServerColors.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PublicServerColors.Builder)super.clearField(var1);
      }

      public PublicServerColors.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PublicServerColors.Builder)super.clearOneof(var1);
      }

      public PublicServerColors.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PublicServerColors.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PublicServerColors.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PublicServerColors.Builder)super.addRepeatedField(var1, var2);
      }

      public PublicServerColors.Builder mergeFrom(Message var1) {
         if (var1 instanceof PublicServerColors) {
            return this.mergeFrom((PublicServerColors)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PublicServerColors.Builder mergeFrom(PublicServerColors var1) {
         if (var1 == PublicServerColors.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPrimary()) {
            this.mergePrimary(var1.getPrimary());
         }

         if (var1.hasSecondary()) {
            this.mergeSecondary(var1.getSecondary());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public PublicServerColors.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getPrimaryFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getSecondaryFieldBuilder().getBuilder(), var2);
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
      public boolean hasPrimary() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Color getPrimary() {
         if (this.primaryBuilder_ == null) {
            return this.primary_ == null ? Color.getDefaultInstance() : this.primary_;
         } else {
            return this.primaryBuilder_.getMessage();
         }
      }

      public PublicServerColors.Builder setPrimary(Color var1) {
         if (this.primaryBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.primary_ = var1;
         } else {
            this.primaryBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PublicServerColors.Builder setPrimary(Color.Builder var1) {
         if (this.primaryBuilder_ == null) {
            this.primary_ = var1.build();
         } else {
            this.primaryBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PublicServerColors.Builder mergePrimary(Color var1) {
         if (this.primaryBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.primary_ != null && this.primary_ != Color.getDefaultInstance()) {
               this.getPrimaryBuilder().mergeFrom(var1);
            } else {
               this.primary_ = var1;
            }
         } else {
            this.primaryBuilder_.mergeFrom(var1);
         }

         if (this.primary_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public PublicServerColors.Builder clearPrimary() {
         this.bitField0_ &= -2;
         this.primary_ = null;
         if (this.primaryBuilder_ != null) {
            this.primaryBuilder_.dispose();
            this.primaryBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getPrimaryBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getPrimaryFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getPrimaryOrBuilder() {
         if (this.primaryBuilder_ != null) {
            return this.primaryBuilder_.getMessageOrBuilder();
         } else {
            return this.primary_ == null ? Color.getDefaultInstance() : this.primary_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getPrimaryFieldBuilder() {
         if (this.primaryBuilder_ == null) {
            this.primaryBuilder_ = new SingleFieldBuilderV3<>(this.getPrimary(), this.getParentForChildren(), this.isClean());
            this.primary_ = null;
         }

         return this.primaryBuilder_;
      }

      @Override
      public boolean hasSecondary() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Color getSecondary() {
         if (this.secondaryBuilder_ == null) {
            return this.secondary_ == null ? Color.getDefaultInstance() : this.secondary_;
         } else {
            return this.secondaryBuilder_.getMessage();
         }
      }

      public PublicServerColors.Builder setSecondary(Color var1) {
         if (this.secondaryBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.secondary_ = var1;
         } else {
            this.secondaryBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PublicServerColors.Builder setSecondary(Color.Builder var1) {
         if (this.secondaryBuilder_ == null) {
            this.secondary_ = var1.build();
         } else {
            this.secondaryBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PublicServerColors.Builder mergeSecondary(Color var1) {
         if (this.secondaryBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.secondary_ != null && this.secondary_ != Color.getDefaultInstance()) {
               this.getSecondaryBuilder().mergeFrom(var1);
            } else {
               this.secondary_ = var1;
            }
         } else {
            this.secondaryBuilder_.mergeFrom(var1);
         }

         if (this.secondary_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public PublicServerColors.Builder clearSecondary() {
         this.bitField0_ &= -3;
         this.secondary_ = null;
         if (this.secondaryBuilder_ != null) {
            this.secondaryBuilder_.dispose();
            this.secondaryBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getSecondaryBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getSecondaryFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getSecondaryOrBuilder() {
         if (this.secondaryBuilder_ != null) {
            return this.secondaryBuilder_.getMessageOrBuilder();
         } else {
            return this.secondary_ == null ? Color.getDefaultInstance() : this.secondary_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getSecondaryFieldBuilder() {
         if (this.secondaryBuilder_ == null) {
            this.secondaryBuilder_ = new SingleFieldBuilderV3<>(this.getSecondary(), this.getParentForChildren(), this.isClean());
            this.secondary_ = null;
         }

         return this.secondaryBuilder_;
      }

      public final PublicServerColors.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PublicServerColors.Builder)super.setUnknownFields(var1);
      }

      public final PublicServerColors.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PublicServerColors.Builder)super.mergeUnknownFields(var1);
      }
   }
}
