package com.lunarclient.apollo.button.v1;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ButtonContent extends GeneratedMessageV3 implements ButtonContentOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int PARTS_FIELD_NUMBER = 1;
   private List<ButtonContentPart> parts_;
   public static final int SCALE_FIELD_NUMBER = 2;
   private float scale_ = 0.0F;
   private byte memoizedIsInitialized = -1;
   private static final ButtonContent DEFAULT_INSTANCE = new ButtonContent();
   private static final Parser<ButtonContent> PARSER = new AbstractParser<ButtonContent>() {
      public ButtonContent parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ButtonContent.Builder var3 = ButtonContent.newBuilder();

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

   private ButtonContent(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ButtonContent() {
      this.parts_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ButtonContent();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonContent_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonContent_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ButtonContent.class, ButtonContent.Builder.class);
   }

   @Override
   public List<ButtonContentPart> getPartsList() {
      return this.parts_;
   }

   @Override
   public List<? extends ButtonContentPartOrBuilder> getPartsOrBuilderList() {
      return this.parts_;
   }

   @Override
   public int getPartsCount() {
      return this.parts_.size();
   }

   @Override
   public ButtonContentPart getParts(int var1) {
      return this.parts_.get(var1);
   }

   @Override
   public ButtonContentPartOrBuilder getPartsOrBuilder(int var1) {
      return this.parts_.get(var1);
   }

   @Override
   public float getScale() {
      return this.scale_;
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
      for (int var2 = 0; var2 < this.parts_.size(); var2++) {
         var1.writeMessage(1, this.parts_.get(var2));
      }

      if (Float.floatToRawIntBits(this.scale_) != 0) {
         var1.writeFloat(2, this.scale_);
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

      for (int var2 = 0; var2 < this.parts_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.parts_.get(var2));
      }

      if (Float.floatToRawIntBits(this.scale_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(2, this.scale_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ButtonContent)) {
         return super.equals(var1);
      } else {
         ButtonContent var2 = (ButtonContent)var1;
         if (!this.getPartsList().equals(var2.getPartsList())) {
            return false;
         } else {
            return Float.floatToIntBits(this.getScale()) != Float.floatToIntBits(var2.getScale())
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
      if (this.getPartsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getPartsList().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Float.floatToIntBits(this.getScale());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ButtonContent parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ButtonContent parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ButtonContent parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ButtonContent parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ButtonContent parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ButtonContent parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ButtonContent parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ButtonContent parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ButtonContent parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ButtonContent parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ButtonContent parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ButtonContent parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ButtonContent.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ButtonContent.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ButtonContent.Builder newBuilder(ButtonContent var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ButtonContent.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ButtonContent.Builder() : new ButtonContent.Builder().mergeFrom(this);
   }

   protected ButtonContent.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ButtonContent.Builder(var1);
   }

   public static ButtonContent getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ButtonContent> parser() {
      return PARSER;
   }

   @Override
   public Parser<ButtonContent> getParserForType() {
      return PARSER;
   }

   public ButtonContent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ButtonContent.Builder> implements ButtonContentOrBuilder {
      private int bitField0_;
      private List<ButtonContentPart> parts_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<ButtonContentPart, ButtonContentPart.Builder, ButtonContentPartOrBuilder> partsBuilder_;
      private float scale_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonContent_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonContent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ButtonContent.class, ButtonContent.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ButtonContent.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.partsBuilder_ == null) {
            this.parts_ = Collections.emptyList();
         } else {
            this.parts_ = null;
            this.partsBuilder_.clear();
         }

         this.bitField0_ &= -2;
         this.scale_ = 0.0F;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonContent_descriptor;
      }

      public ButtonContent getDefaultInstanceForType() {
         return ButtonContent.getDefaultInstance();
      }

      public ButtonContent build() {
         ButtonContent var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ButtonContent buildPartial() {
         ButtonContent var1 = new ButtonContent(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(ButtonContent var1) {
         if (this.partsBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.parts_ = Collections.unmodifiableList(this.parts_);
               this.bitField0_ &= -2;
            }

            var1.parts_ = this.parts_;
         } else {
            var1.parts_ = this.partsBuilder_.build();
         }
      }

      private void buildPartial0(ButtonContent var1) {
         int var2 = this.bitField0_;
         if ((var2 & 2) != 0) {
            var1.scale_ = this.scale_;
         }
      }

      public ButtonContent.Builder clone() {
         return (ButtonContent.Builder)super.clone();
      }

      public ButtonContent.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ButtonContent.Builder)super.setField(var1, var2);
      }

      public ButtonContent.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ButtonContent.Builder)super.clearField(var1);
      }

      public ButtonContent.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ButtonContent.Builder)super.clearOneof(var1);
      }

      public ButtonContent.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ButtonContent.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ButtonContent.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ButtonContent.Builder)super.addRepeatedField(var1, var2);
      }

      public ButtonContent.Builder mergeFrom(Message var1) {
         if (var1 instanceof ButtonContent) {
            return this.mergeFrom((ButtonContent)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ButtonContent.Builder mergeFrom(ButtonContent var1) {
         if (var1 == ButtonContent.getDefaultInstance()) {
            return this;
         }

         if (this.partsBuilder_ == null) {
            if (!var1.parts_.isEmpty()) {
               if (this.parts_.isEmpty()) {
                  this.parts_ = var1.parts_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensurePartsIsMutable();
                  this.parts_.addAll(var1.parts_);
               }

               this.onChanged();
            }
         } else if (!var1.parts_.isEmpty()) {
            if (this.partsBuilder_.isEmpty()) {
               this.partsBuilder_.dispose();
               this.partsBuilder_ = null;
               this.parts_ = var1.parts_;
               this.bitField0_ &= -2;
               this.partsBuilder_ = ButtonContent.alwaysUseFieldBuilders ? this.getPartsFieldBuilder() : null;
            } else {
               this.partsBuilder_.addAllMessages(var1.parts_);
            }
         }

         if (var1.getScale() != 0.0F) {
            this.setScale(var1.getScale());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ButtonContent.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     ButtonContentPart var5 = var1.readMessage(ButtonContentPart.parser(), var2);
                     if (this.partsBuilder_ == null) {
                        this.ensurePartsIsMutable();
                        this.parts_.add(var5);
                     } else {
                        this.partsBuilder_.addMessage(var5);
                     }
                     break;
                  case 21:
                     this.scale_ = var1.readFloat();
                     this.bitField0_ |= 2;
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var9) {
            throw var9.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      private void ensurePartsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.parts_ = new ArrayList<>(this.parts_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<ButtonContentPart> getPartsList() {
         return this.partsBuilder_ == null ? Collections.unmodifiableList(this.parts_) : this.partsBuilder_.getMessageList();
      }

      @Override
      public int getPartsCount() {
         return this.partsBuilder_ == null ? this.parts_.size() : this.partsBuilder_.getCount();
      }

      @Override
      public ButtonContentPart getParts(int var1) {
         return this.partsBuilder_ == null ? this.parts_.get(var1) : this.partsBuilder_.getMessage(var1);
      }

      public ButtonContent.Builder setParts(int var1, ButtonContentPart var2) {
         if (this.partsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensurePartsIsMutable();
            this.parts_.set(var1, var2);
            this.onChanged();
         } else {
            this.partsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public ButtonContent.Builder setParts(int var1, ButtonContentPart.Builder var2) {
         if (this.partsBuilder_ == null) {
            this.ensurePartsIsMutable();
            this.parts_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.partsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public ButtonContent.Builder addParts(ButtonContentPart var1) {
         if (this.partsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensurePartsIsMutable();
            this.parts_.add(var1);
            this.onChanged();
         } else {
            this.partsBuilder_.addMessage(var1);
         }

         return this;
      }

      public ButtonContent.Builder addParts(int var1, ButtonContentPart var2) {
         if (this.partsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensurePartsIsMutable();
            this.parts_.add(var1, var2);
            this.onChanged();
         } else {
            this.partsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public ButtonContent.Builder addParts(ButtonContentPart.Builder var1) {
         if (this.partsBuilder_ == null) {
            this.ensurePartsIsMutable();
            this.parts_.add(var1.build());
            this.onChanged();
         } else {
            this.partsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public ButtonContent.Builder addParts(int var1, ButtonContentPart.Builder var2) {
         if (this.partsBuilder_ == null) {
            this.ensurePartsIsMutable();
            this.parts_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.partsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public ButtonContent.Builder addAllParts(Iterable<? extends ButtonContentPart> var1) {
         if (this.partsBuilder_ == null) {
            this.ensurePartsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.parts_);
            this.onChanged();
         } else {
            this.partsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public ButtonContent.Builder clearParts() {
         if (this.partsBuilder_ == null) {
            this.parts_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.partsBuilder_.clear();
         }

         return this;
      }

      public ButtonContent.Builder removeParts(int var1) {
         if (this.partsBuilder_ == null) {
            this.ensurePartsIsMutable();
            this.parts_.remove(var1);
            this.onChanged();
         } else {
            this.partsBuilder_.remove(var1);
         }

         return this;
      }

      public ButtonContentPart.Builder getPartsBuilder(int var1) {
         return this.getPartsFieldBuilder().getBuilder(var1);
      }

      @Override
      public ButtonContentPartOrBuilder getPartsOrBuilder(int var1) {
         return this.partsBuilder_ == null ? this.parts_.get(var1) : this.partsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ButtonContentPartOrBuilder> getPartsOrBuilderList() {
         return this.partsBuilder_ != null ? this.partsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.parts_);
      }

      public ButtonContentPart.Builder addPartsBuilder() {
         return this.getPartsFieldBuilder().addBuilder(ButtonContentPart.getDefaultInstance());
      }

      public ButtonContentPart.Builder addPartsBuilder(int var1) {
         return this.getPartsFieldBuilder().addBuilder(var1, ButtonContentPart.getDefaultInstance());
      }

      public List<ButtonContentPart.Builder> getPartsBuilderList() {
         return this.getPartsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<ButtonContentPart, ButtonContentPart.Builder, ButtonContentPartOrBuilder> getPartsFieldBuilder() {
         if (this.partsBuilder_ == null) {
            this.partsBuilder_ = new RepeatedFieldBuilderV3<>(this.parts_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.parts_ = null;
         }

         return this.partsBuilder_;
      }

      @Override
      public float getScale() {
         return this.scale_;
      }

      public ButtonContent.Builder setScale(float var1) {
         this.scale_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ButtonContent.Builder clearScale() {
         this.bitField0_ &= -3;
         this.scale_ = 0.0F;
         this.onChanged();
         return this;
      }

      public final ButtonContent.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ButtonContent.Builder)super.setUnknownFields(var1);
      }

      public final ButtonContent.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ButtonContent.Builder)super.mergeUnknownFields(var1);
      }
   }
}
