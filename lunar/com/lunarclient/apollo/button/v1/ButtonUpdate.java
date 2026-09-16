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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ButtonUpdate extends GeneratedMessageV3 implements ButtonUpdateOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONTENT_FIELD_NUMBER = 1;
   private ButtonContent content_;
   public static final int TOOLTIP_FIELD_NUMBER = 2;
   private ButtonTooltip tooltip_;
   private byte memoizedIsInitialized = -1;
   private static final ButtonUpdate DEFAULT_INSTANCE = new ButtonUpdate();
   private static final Parser<ButtonUpdate> PARSER = new AbstractParser<ButtonUpdate>() {
      public ButtonUpdate parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ButtonUpdate.Builder var3 = ButtonUpdate.newBuilder();

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

   private ButtonUpdate(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ButtonUpdate() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ButtonUpdate();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonUpdate_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonUpdate_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ButtonUpdate.class, ButtonUpdate.Builder.class);
   }

   @Override
   public boolean hasContent() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public ButtonContent getContent() {
      return this.content_ == null ? ButtonContent.getDefaultInstance() : this.content_;
   }

   @Override
   public ButtonContentOrBuilder getContentOrBuilder() {
      return this.content_ == null ? ButtonContent.getDefaultInstance() : this.content_;
   }

   @Override
   public boolean hasTooltip() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public ButtonTooltip getTooltip() {
      return this.tooltip_ == null ? ButtonTooltip.getDefaultInstance() : this.tooltip_;
   }

   @Override
   public ButtonTooltipOrBuilder getTooltipOrBuilder() {
      return this.tooltip_ == null ? ButtonTooltip.getDefaultInstance() : this.tooltip_;
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
         var1.writeMessage(1, this.getContent());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getTooltip());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getContent());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getTooltip());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ButtonUpdate)) {
         return super.equals(var1);
      } else {
         ButtonUpdate var2 = (ButtonUpdate)var1;
         if (this.hasContent() != var2.hasContent()) {
            return false;
         } else if (this.hasContent() && !this.getContent().equals(var2.getContent())) {
            return false;
         } else if (this.hasTooltip() != var2.hasTooltip()) {
            return false;
         } else {
            return this.hasTooltip() && !this.getTooltip().equals(var2.getTooltip()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasContent()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getContent().hashCode();
      }

      if (this.hasTooltip()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getTooltip().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ButtonUpdate parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ButtonUpdate parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ButtonUpdate parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ButtonUpdate parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ButtonUpdate parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ButtonUpdate parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ButtonUpdate parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ButtonUpdate parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ButtonUpdate parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ButtonUpdate parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ButtonUpdate parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ButtonUpdate parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ButtonUpdate.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ButtonUpdate.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ButtonUpdate.Builder newBuilder(ButtonUpdate var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ButtonUpdate.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ButtonUpdate.Builder() : new ButtonUpdate.Builder().mergeFrom(this);
   }

   protected ButtonUpdate.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ButtonUpdate.Builder(var1);
   }

   public static ButtonUpdate getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ButtonUpdate> parser() {
      return PARSER;
   }

   @Override
   public Parser<ButtonUpdate> getParserForType() {
      return PARSER;
   }

   public ButtonUpdate getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ButtonUpdate.Builder> implements ButtonUpdateOrBuilder {
      private int bitField0_;
      private ButtonContent content_;
      private SingleFieldBuilderV3<ButtonContent, ButtonContent.Builder, ButtonContentOrBuilder> contentBuilder_;
      private ButtonTooltip tooltip_;
      private SingleFieldBuilderV3<ButtonTooltip, ButtonTooltip.Builder, ButtonTooltipOrBuilder> tooltipBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonUpdate_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonUpdate_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ButtonUpdate.class, ButtonUpdate.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ButtonUpdate.alwaysUseFieldBuilders) {
            this.getContentFieldBuilder();
            this.getTooltipFieldBuilder();
         }
      }

      public ButtonUpdate.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.content_ = null;
         if (this.contentBuilder_ != null) {
            this.contentBuilder_.dispose();
            this.contentBuilder_ = null;
         }

         this.tooltip_ = null;
         if (this.tooltipBuilder_ != null) {
            this.tooltipBuilder_.dispose();
            this.tooltipBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonUpdate_descriptor;
      }

      public ButtonUpdate getDefaultInstanceForType() {
         return ButtonUpdate.getDefaultInstance();
      }

      public ButtonUpdate build() {
         ButtonUpdate var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ButtonUpdate buildPartial() {
         ButtonUpdate var1 = new ButtonUpdate(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ButtonUpdate var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.content_ = this.contentBuilder_ == null ? this.content_ : this.contentBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.tooltip_ = this.tooltipBuilder_ == null ? this.tooltip_ : this.tooltipBuilder_.build();
            var3 |= 2;
         }

         ButtonUpdate var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ButtonUpdate.Builder clone() {
         return (ButtonUpdate.Builder)super.clone();
      }

      public ButtonUpdate.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ButtonUpdate.Builder)super.setField(var1, var2);
      }

      public ButtonUpdate.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ButtonUpdate.Builder)super.clearField(var1);
      }

      public ButtonUpdate.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ButtonUpdate.Builder)super.clearOneof(var1);
      }

      public ButtonUpdate.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ButtonUpdate.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ButtonUpdate.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ButtonUpdate.Builder)super.addRepeatedField(var1, var2);
      }

      public ButtonUpdate.Builder mergeFrom(Message var1) {
         if (var1 instanceof ButtonUpdate) {
            return this.mergeFrom((ButtonUpdate)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ButtonUpdate.Builder mergeFrom(ButtonUpdate var1) {
         if (var1 == ButtonUpdate.getDefaultInstance()) {
            return this;
         }

         if (var1.hasContent()) {
            this.mergeContent(var1.getContent());
         }

         if (var1.hasTooltip()) {
            this.mergeTooltip(var1.getTooltip());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ButtonUpdate.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getContentFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getTooltipFieldBuilder().getBuilder(), var2);
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
      public boolean hasContent() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public ButtonContent getContent() {
         if (this.contentBuilder_ == null) {
            return this.content_ == null ? ButtonContent.getDefaultInstance() : this.content_;
         } else {
            return this.contentBuilder_.getMessage();
         }
      }

      public ButtonUpdate.Builder setContent(ButtonContent var1) {
         if (this.contentBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.content_ = var1;
         } else {
            this.contentBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ButtonUpdate.Builder setContent(ButtonContent.Builder var1) {
         if (this.contentBuilder_ == null) {
            this.content_ = var1.build();
         } else {
            this.contentBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ButtonUpdate.Builder mergeContent(ButtonContent var1) {
         if (this.contentBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.content_ != null && this.content_ != ButtonContent.getDefaultInstance()) {
               this.getContentBuilder().mergeFrom(var1);
            } else {
               this.content_ = var1;
            }
         } else {
            this.contentBuilder_.mergeFrom(var1);
         }

         if (this.content_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public ButtonUpdate.Builder clearContent() {
         this.bitField0_ &= -2;
         this.content_ = null;
         if (this.contentBuilder_ != null) {
            this.contentBuilder_.dispose();
            this.contentBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ButtonContent.Builder getContentBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getContentFieldBuilder().getBuilder();
      }

      @Override
      public ButtonContentOrBuilder getContentOrBuilder() {
         if (this.contentBuilder_ != null) {
            return this.contentBuilder_.getMessageOrBuilder();
         } else {
            return this.content_ == null ? ButtonContent.getDefaultInstance() : this.content_;
         }
      }

      private SingleFieldBuilderV3<ButtonContent, ButtonContent.Builder, ButtonContentOrBuilder> getContentFieldBuilder() {
         if (this.contentBuilder_ == null) {
            this.contentBuilder_ = new SingleFieldBuilderV3<>(this.getContent(), this.getParentForChildren(), this.isClean());
            this.content_ = null;
         }

         return this.contentBuilder_;
      }

      @Override
      public boolean hasTooltip() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public ButtonTooltip getTooltip() {
         if (this.tooltipBuilder_ == null) {
            return this.tooltip_ == null ? ButtonTooltip.getDefaultInstance() : this.tooltip_;
         } else {
            return this.tooltipBuilder_.getMessage();
         }
      }

      public ButtonUpdate.Builder setTooltip(ButtonTooltip var1) {
         if (this.tooltipBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.tooltip_ = var1;
         } else {
            this.tooltipBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ButtonUpdate.Builder setTooltip(ButtonTooltip.Builder var1) {
         if (this.tooltipBuilder_ == null) {
            this.tooltip_ = var1.build();
         } else {
            this.tooltipBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ButtonUpdate.Builder mergeTooltip(ButtonTooltip var1) {
         if (this.tooltipBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.tooltip_ != null && this.tooltip_ != ButtonTooltip.getDefaultInstance()) {
               this.getTooltipBuilder().mergeFrom(var1);
            } else {
               this.tooltip_ = var1;
            }
         } else {
            this.tooltipBuilder_.mergeFrom(var1);
         }

         if (this.tooltip_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public ButtonUpdate.Builder clearTooltip() {
         this.bitField0_ &= -3;
         this.tooltip_ = null;
         if (this.tooltipBuilder_ != null) {
            this.tooltipBuilder_.dispose();
            this.tooltipBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ButtonTooltip.Builder getTooltipBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getTooltipFieldBuilder().getBuilder();
      }

      @Override
      public ButtonTooltipOrBuilder getTooltipOrBuilder() {
         if (this.tooltipBuilder_ != null) {
            return this.tooltipBuilder_.getMessageOrBuilder();
         } else {
            return this.tooltip_ == null ? ButtonTooltip.getDefaultInstance() : this.tooltip_;
         }
      }

      private SingleFieldBuilderV3<ButtonTooltip, ButtonTooltip.Builder, ButtonTooltipOrBuilder> getTooltipFieldBuilder() {
         if (this.tooltipBuilder_ == null) {
            this.tooltipBuilder_ = new SingleFieldBuilderV3<>(this.getTooltip(), this.getParentForChildren(), this.isClean());
            this.tooltip_ = null;
         }

         return this.tooltipBuilder_;
      }

      public final ButtonUpdate.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ButtonUpdate.Builder)super.setUnknownFields(var1);
      }

      public final ButtonUpdate.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ButtonUpdate.Builder)super.mergeUnknownFields(var1);
      }
   }
}
