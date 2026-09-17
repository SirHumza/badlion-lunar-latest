package com.lunarclient.apollo.cooldown.v1;

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
import com.lunarclient.apollo.common.v1.Color;
import com.lunarclient.apollo.common.v1.ColorOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class CooldownStyle extends GeneratedMessageV3 implements CooldownStyleOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CIRCLE_START_COLOR_FIELD_NUMBER = 1;
   private Color circleStartColor_;
   public static final int CIRCLE_END_COLOR_FIELD_NUMBER = 2;
   private Color circleEndColor_;
   public static final int CIRCLE_EDGE_COLOR_FIELD_NUMBER = 3;
   private Color circleEdgeColor_;
   public static final int TEXT_COLOR_FIELD_NUMBER = 4;
   private Color textColor_;
   private byte memoizedIsInitialized = -1;
   private static final CooldownStyle DEFAULT_INSTANCE = new CooldownStyle();
   private static final Parser<CooldownStyle> PARSER = new AbstractParser<CooldownStyle>() {
      public CooldownStyle parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         CooldownStyle.Builder var3 = CooldownStyle.newBuilder();

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

   private CooldownStyle(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private CooldownStyle() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new CooldownStyle();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_cooldown_v1_CooldownStyle_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_cooldown_v1_CooldownStyle_fieldAccessorTable
         .ensureFieldAccessorsInitialized(CooldownStyle.class, CooldownStyle.Builder.class);
   }

   @Override
   public boolean hasCircleStartColor() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Color getCircleStartColor() {
      return this.circleStartColor_ == null ? Color.getDefaultInstance() : this.circleStartColor_;
   }

   @Override
   public ColorOrBuilder getCircleStartColorOrBuilder() {
      return this.circleStartColor_ == null ? Color.getDefaultInstance() : this.circleStartColor_;
   }

   @Override
   public boolean hasCircleEndColor() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Color getCircleEndColor() {
      return this.circleEndColor_ == null ? Color.getDefaultInstance() : this.circleEndColor_;
   }

   @Override
   public ColorOrBuilder getCircleEndColorOrBuilder() {
      return this.circleEndColor_ == null ? Color.getDefaultInstance() : this.circleEndColor_;
   }

   @Override
   public boolean hasCircleEdgeColor() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public Color getCircleEdgeColor() {
      return this.circleEdgeColor_ == null ? Color.getDefaultInstance() : this.circleEdgeColor_;
   }

   @Override
   public ColorOrBuilder getCircleEdgeColorOrBuilder() {
      return this.circleEdgeColor_ == null ? Color.getDefaultInstance() : this.circleEdgeColor_;
   }

   @Override
   public boolean hasTextColor() {
      return (this.bitField0_ & 8) != 0;
   }

   @Override
   public Color getTextColor() {
      return this.textColor_ == null ? Color.getDefaultInstance() : this.textColor_;
   }

   @Override
   public ColorOrBuilder getTextColorOrBuilder() {
      return this.textColor_ == null ? Color.getDefaultInstance() : this.textColor_;
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
         var1.writeMessage(1, this.getCircleStartColor());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getCircleEndColor());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(3, this.getCircleEdgeColor());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeMessage(4, this.getTextColor());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getCircleStartColor());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getCircleEndColor());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getCircleEdgeColor());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getTextColor());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof CooldownStyle)) {
         return super.equals(var1);
      } else {
         CooldownStyle var2 = (CooldownStyle)var1;
         if (this.hasCircleStartColor() != var2.hasCircleStartColor()) {
            return false;
         } else if (this.hasCircleStartColor() && !this.getCircleStartColor().equals(var2.getCircleStartColor())) {
            return false;
         } else if (this.hasCircleEndColor() != var2.hasCircleEndColor()) {
            return false;
         } else if (this.hasCircleEndColor() && !this.getCircleEndColor().equals(var2.getCircleEndColor())) {
            return false;
         } else if (this.hasCircleEdgeColor() != var2.hasCircleEdgeColor()) {
            return false;
         } else if (this.hasCircleEdgeColor() && !this.getCircleEdgeColor().equals(var2.getCircleEdgeColor())) {
            return false;
         } else if (this.hasTextColor() != var2.hasTextColor()) {
            return false;
         } else {
            return this.hasTextColor() && !this.getTextColor().equals(var2.getTextColor()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasCircleStartColor()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getCircleStartColor().hashCode();
      }

      if (this.hasCircleEndColor()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getCircleEndColor().hashCode();
      }

      if (this.hasCircleEdgeColor()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getCircleEdgeColor().hashCode();
      }

      if (this.hasTextColor()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getTextColor().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static CooldownStyle parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static CooldownStyle parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CooldownStyle parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static CooldownStyle parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CooldownStyle parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static CooldownStyle parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CooldownStyle parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CooldownStyle parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CooldownStyle parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CooldownStyle parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CooldownStyle parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CooldownStyle parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CooldownStyle.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CooldownStyle.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CooldownStyle.Builder newBuilder(CooldownStyle var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CooldownStyle.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CooldownStyle.Builder() : new CooldownStyle.Builder().mergeFrom(this);
   }

   protected CooldownStyle.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new CooldownStyle.Builder(var1);
   }

   public static CooldownStyle getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<CooldownStyle> parser() {
      return PARSER;
   }

   @Override
   public Parser<CooldownStyle> getParserForType() {
      return PARSER;
   }

   public CooldownStyle getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<CooldownStyle.Builder> implements CooldownStyleOrBuilder {
      private int bitField0_;
      private Color circleStartColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> circleStartColorBuilder_;
      private Color circleEndColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> circleEndColorBuilder_;
      private Color circleEdgeColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> circleEdgeColorBuilder_;
      private Color textColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> textColorBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_cooldown_v1_CooldownStyle_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_cooldown_v1_CooldownStyle_fieldAccessorTable
            .ensureFieldAccessorsInitialized(CooldownStyle.class, CooldownStyle.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (CooldownStyle.alwaysUseFieldBuilders) {
            this.getCircleStartColorFieldBuilder();
            this.getCircleEndColorFieldBuilder();
            this.getCircleEdgeColorFieldBuilder();
            this.getTextColorFieldBuilder();
         }
      }

      public CooldownStyle.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.circleStartColor_ = null;
         if (this.circleStartColorBuilder_ != null) {
            this.circleStartColorBuilder_.dispose();
            this.circleStartColorBuilder_ = null;
         }

         this.circleEndColor_ = null;
         if (this.circleEndColorBuilder_ != null) {
            this.circleEndColorBuilder_.dispose();
            this.circleEndColorBuilder_ = null;
         }

         this.circleEdgeColor_ = null;
         if (this.circleEdgeColorBuilder_ != null) {
            this.circleEdgeColorBuilder_.dispose();
            this.circleEdgeColorBuilder_ = null;
         }

         this.textColor_ = null;
         if (this.textColorBuilder_ != null) {
            this.textColorBuilder_.dispose();
            this.textColorBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_cooldown_v1_CooldownStyle_descriptor;
      }

      public CooldownStyle getDefaultInstanceForType() {
         return CooldownStyle.getDefaultInstance();
      }

      public CooldownStyle build() {
         CooldownStyle var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CooldownStyle buildPartial() {
         CooldownStyle var1 = new CooldownStyle(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(CooldownStyle var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.circleStartColor_ = this.circleStartColorBuilder_ == null ? this.circleStartColor_ : this.circleStartColorBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.circleEndColor_ = this.circleEndColorBuilder_ == null ? this.circleEndColor_ : this.circleEndColorBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.circleEdgeColor_ = this.circleEdgeColorBuilder_ == null ? this.circleEdgeColor_ : this.circleEdgeColorBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 8) != 0) {
            var1.textColor_ = this.textColorBuilder_ == null ? this.textColor_ : this.textColorBuilder_.build();
            var3 |= 8;
         }

         CooldownStyle var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public CooldownStyle.Builder clone() {
         return (CooldownStyle.Builder)super.clone();
      }

      public CooldownStyle.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CooldownStyle.Builder)super.setField(var1, var2);
      }

      public CooldownStyle.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (CooldownStyle.Builder)super.clearField(var1);
      }

      public CooldownStyle.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (CooldownStyle.Builder)super.clearOneof(var1);
      }

      public CooldownStyle.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (CooldownStyle.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CooldownStyle.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CooldownStyle.Builder)super.addRepeatedField(var1, var2);
      }

      public CooldownStyle.Builder mergeFrom(Message var1) {
         if (var1 instanceof CooldownStyle) {
            return this.mergeFrom((CooldownStyle)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public CooldownStyle.Builder mergeFrom(CooldownStyle var1) {
         if (var1 == CooldownStyle.getDefaultInstance()) {
            return this;
         }

         if (var1.hasCircleStartColor()) {
            this.mergeCircleStartColor(var1.getCircleStartColor());
         }

         if (var1.hasCircleEndColor()) {
            this.mergeCircleEndColor(var1.getCircleEndColor());
         }

         if (var1.hasCircleEdgeColor()) {
            this.mergeCircleEdgeColor(var1.getCircleEdgeColor());
         }

         if (var1.hasTextColor()) {
            this.mergeTextColor(var1.getTextColor());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public CooldownStyle.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getCircleStartColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getCircleEndColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getCircleEdgeColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     var1.readMessage(this.getTextColorFieldBuilder().getBuilder(), var2);
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
      public boolean hasCircleStartColor() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Color getCircleStartColor() {
         if (this.circleStartColorBuilder_ == null) {
            return this.circleStartColor_ == null ? Color.getDefaultInstance() : this.circleStartColor_;
         } else {
            return this.circleStartColorBuilder_.getMessage();
         }
      }

      public CooldownStyle.Builder setCircleStartColor(Color var1) {
         if (this.circleStartColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.circleStartColor_ = var1;
         } else {
            this.circleStartColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public CooldownStyle.Builder setCircleStartColor(Color.Builder var1) {
         if (this.circleStartColorBuilder_ == null) {
            this.circleStartColor_ = var1.build();
         } else {
            this.circleStartColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public CooldownStyle.Builder mergeCircleStartColor(Color var1) {
         if (this.circleStartColorBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.circleStartColor_ != null && this.circleStartColor_ != Color.getDefaultInstance()) {
               this.getCircleStartColorBuilder().mergeFrom(var1);
            } else {
               this.circleStartColor_ = var1;
            }
         } else {
            this.circleStartColorBuilder_.mergeFrom(var1);
         }

         if (this.circleStartColor_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public CooldownStyle.Builder clearCircleStartColor() {
         this.bitField0_ &= -2;
         this.circleStartColor_ = null;
         if (this.circleStartColorBuilder_ != null) {
            this.circleStartColorBuilder_.dispose();
            this.circleStartColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getCircleStartColorBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getCircleStartColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getCircleStartColorOrBuilder() {
         if (this.circleStartColorBuilder_ != null) {
            return this.circleStartColorBuilder_.getMessageOrBuilder();
         } else {
            return this.circleStartColor_ == null ? Color.getDefaultInstance() : this.circleStartColor_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getCircleStartColorFieldBuilder() {
         if (this.circleStartColorBuilder_ == null) {
            this.circleStartColorBuilder_ = new SingleFieldBuilderV3<>(this.getCircleStartColor(), this.getParentForChildren(), this.isClean());
            this.circleStartColor_ = null;
         }

         return this.circleStartColorBuilder_;
      }

      @Override
      public boolean hasCircleEndColor() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Color getCircleEndColor() {
         if (this.circleEndColorBuilder_ == null) {
            return this.circleEndColor_ == null ? Color.getDefaultInstance() : this.circleEndColor_;
         } else {
            return this.circleEndColorBuilder_.getMessage();
         }
      }

      public CooldownStyle.Builder setCircleEndColor(Color var1) {
         if (this.circleEndColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.circleEndColor_ = var1;
         } else {
            this.circleEndColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public CooldownStyle.Builder setCircleEndColor(Color.Builder var1) {
         if (this.circleEndColorBuilder_ == null) {
            this.circleEndColor_ = var1.build();
         } else {
            this.circleEndColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public CooldownStyle.Builder mergeCircleEndColor(Color var1) {
         if (this.circleEndColorBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.circleEndColor_ != null && this.circleEndColor_ != Color.getDefaultInstance()) {
               this.getCircleEndColorBuilder().mergeFrom(var1);
            } else {
               this.circleEndColor_ = var1;
            }
         } else {
            this.circleEndColorBuilder_.mergeFrom(var1);
         }

         if (this.circleEndColor_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public CooldownStyle.Builder clearCircleEndColor() {
         this.bitField0_ &= -3;
         this.circleEndColor_ = null;
         if (this.circleEndColorBuilder_ != null) {
            this.circleEndColorBuilder_.dispose();
            this.circleEndColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getCircleEndColorBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getCircleEndColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getCircleEndColorOrBuilder() {
         if (this.circleEndColorBuilder_ != null) {
            return this.circleEndColorBuilder_.getMessageOrBuilder();
         } else {
            return this.circleEndColor_ == null ? Color.getDefaultInstance() : this.circleEndColor_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getCircleEndColorFieldBuilder() {
         if (this.circleEndColorBuilder_ == null) {
            this.circleEndColorBuilder_ = new SingleFieldBuilderV3<>(this.getCircleEndColor(), this.getParentForChildren(), this.isClean());
            this.circleEndColor_ = null;
         }

         return this.circleEndColorBuilder_;
      }

      @Override
      public boolean hasCircleEdgeColor() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Color getCircleEdgeColor() {
         if (this.circleEdgeColorBuilder_ == null) {
            return this.circleEdgeColor_ == null ? Color.getDefaultInstance() : this.circleEdgeColor_;
         } else {
            return this.circleEdgeColorBuilder_.getMessage();
         }
      }

      public CooldownStyle.Builder setCircleEdgeColor(Color var1) {
         if (this.circleEdgeColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.circleEdgeColor_ = var1;
         } else {
            this.circleEdgeColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public CooldownStyle.Builder setCircleEdgeColor(Color.Builder var1) {
         if (this.circleEdgeColorBuilder_ == null) {
            this.circleEdgeColor_ = var1.build();
         } else {
            this.circleEdgeColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public CooldownStyle.Builder mergeCircleEdgeColor(Color var1) {
         if (this.circleEdgeColorBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.circleEdgeColor_ != null && this.circleEdgeColor_ != Color.getDefaultInstance()) {
               this.getCircleEdgeColorBuilder().mergeFrom(var1);
            } else {
               this.circleEdgeColor_ = var1;
            }
         } else {
            this.circleEdgeColorBuilder_.mergeFrom(var1);
         }

         if (this.circleEdgeColor_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public CooldownStyle.Builder clearCircleEdgeColor() {
         this.bitField0_ &= -5;
         this.circleEdgeColor_ = null;
         if (this.circleEdgeColorBuilder_ != null) {
            this.circleEdgeColorBuilder_.dispose();
            this.circleEdgeColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getCircleEdgeColorBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getCircleEdgeColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getCircleEdgeColorOrBuilder() {
         if (this.circleEdgeColorBuilder_ != null) {
            return this.circleEdgeColorBuilder_.getMessageOrBuilder();
         } else {
            return this.circleEdgeColor_ == null ? Color.getDefaultInstance() : this.circleEdgeColor_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getCircleEdgeColorFieldBuilder() {
         if (this.circleEdgeColorBuilder_ == null) {
            this.circleEdgeColorBuilder_ = new SingleFieldBuilderV3<>(this.getCircleEdgeColor(), this.getParentForChildren(), this.isClean());
            this.circleEdgeColor_ = null;
         }

         return this.circleEdgeColorBuilder_;
      }

      @Override
      public boolean hasTextColor() {
         return (this.bitField0_ & 8) != 0;
      }

      @Override
      public Color getTextColor() {
         if (this.textColorBuilder_ == null) {
            return this.textColor_ == null ? Color.getDefaultInstance() : this.textColor_;
         } else {
            return this.textColorBuilder_.getMessage();
         }
      }

      public CooldownStyle.Builder setTextColor(Color var1) {
         if (this.textColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.textColor_ = var1;
         } else {
            this.textColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public CooldownStyle.Builder setTextColor(Color.Builder var1) {
         if (this.textColorBuilder_ == null) {
            this.textColor_ = var1.build();
         } else {
            this.textColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public CooldownStyle.Builder mergeTextColor(Color var1) {
         if (this.textColorBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0 && this.textColor_ != null && this.textColor_ != Color.getDefaultInstance()) {
               this.getTextColorBuilder().mergeFrom(var1);
            } else {
               this.textColor_ = var1;
            }
         } else {
            this.textColorBuilder_.mergeFrom(var1);
         }

         if (this.textColor_ != null) {
            this.bitField0_ |= 8;
            this.onChanged();
         }

         return this;
      }

      public CooldownStyle.Builder clearTextColor() {
         this.bitField0_ &= -9;
         this.textColor_ = null;
         if (this.textColorBuilder_ != null) {
            this.textColorBuilder_.dispose();
            this.textColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getTextColorBuilder() {
         this.bitField0_ |= 8;
         this.onChanged();
         return this.getTextColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getTextColorOrBuilder() {
         if (this.textColorBuilder_ != null) {
            return this.textColorBuilder_.getMessageOrBuilder();
         } else {
            return this.textColor_ == null ? Color.getDefaultInstance() : this.textColor_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getTextColorFieldBuilder() {
         if (this.textColorBuilder_ == null) {
            this.textColorBuilder_ = new SingleFieldBuilderV3<>(this.getTextColor(), this.getParentForChildren(), this.isClean());
            this.textColor_ = null;
         }

         return this.textColorBuilder_;
      }

      public final CooldownStyle.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CooldownStyle.Builder)super.setUnknownFields(var1);
      }

      public final CooldownStyle.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CooldownStyle.Builder)super.mergeUnknownFields(var1);
      }
   }
}
