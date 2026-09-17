package com.lunarclient.apollo.inventory.v1;

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
import com.lunarclient.apollo.button.v1.Button;
import com.lunarclient.apollo.button.v1.ButtonOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class InventoryButton extends GeneratedMessageV3 implements InventoryButtonOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int BUTTON_FIELD_NUMBER = 1;
   private Button button_;
   public static final int INVENTORY_TYPE_FIELD_NUMBER = 2;
   private int inventoryType_ = 0;
   public static final int BOX_FIELD_NUMBER = 3;
   private int box_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final InventoryButton DEFAULT_INSTANCE = new InventoryButton();
   private static final Parser<InventoryButton> PARSER = new AbstractParser<InventoryButton>() {
      public InventoryButton parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         InventoryButton.Builder var3 = InventoryButton.newBuilder();

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

   private InventoryButton(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private InventoryButton() {
      this.inventoryType_ = 0;
      this.box_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new InventoryButton();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_inventory_v1_InventoryButton_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_inventory_v1_InventoryButton_fieldAccessorTable
         .ensureFieldAccessorsInitialized(InventoryButton.class, InventoryButton.Builder.class);
   }

   @Override
   public boolean hasButton() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Button getButton() {
      return this.button_ == null ? Button.getDefaultInstance() : this.button_;
   }

   @Override
   public ButtonOrBuilder getButtonOrBuilder() {
      return this.button_ == null ? Button.getDefaultInstance() : this.button_;
   }

   @Override
   public int getInventoryTypeValue() {
      return this.inventoryType_;
   }

   @Override
   public InventoryType getInventoryType() {
      InventoryType var1 = InventoryType.forNumber(this.inventoryType_);
      return var1 == null ? InventoryType.UNRECOGNIZED : var1;
   }

   @Override
   public int getBoxValue() {
      return this.box_;
   }

   @Override
   public InventoryButtonBox getBox() {
      InventoryButtonBox var1 = InventoryButtonBox.forNumber(this.box_);
      return var1 == null ? InventoryButtonBox.UNRECOGNIZED : var1;
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
         var1.writeMessage(1, this.getButton());
      }

      if (this.inventoryType_ != InventoryType.INVENTORY_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(2, this.inventoryType_);
      }

      if (this.box_ != InventoryButtonBox.INVENTORY_BUTTON_BOX_UNSPECIFIED.getNumber()) {
         var1.writeEnum(3, this.box_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getButton());
      }

      if (this.inventoryType_ != InventoryType.INVENTORY_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(2, this.inventoryType_);
      }

      if (this.box_ != InventoryButtonBox.INVENTORY_BUTTON_BOX_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(3, this.box_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof InventoryButton)) {
         return super.equals(var1);
      } else {
         InventoryButton var2 = (InventoryButton)var1;
         if (this.hasButton() != var2.hasButton()) {
            return false;
         } else if (this.hasButton() && !this.getButton().equals(var2.getButton())) {
            return false;
         } else if (this.inventoryType_ != var2.inventoryType_) {
            return false;
         } else {
            return this.box_ != var2.box_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasButton()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getButton().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.inventoryType_;
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.box_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static InventoryButton parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static InventoryButton parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InventoryButton parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static InventoryButton parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InventoryButton parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static InventoryButton parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InventoryButton parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InventoryButton parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static InventoryButton parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static InventoryButton parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static InventoryButton parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InventoryButton parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public InventoryButton.Builder newBuilderForType() {
      return newBuilder();
   }

   public static InventoryButton.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static InventoryButton.Builder newBuilder(InventoryButton var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public InventoryButton.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new InventoryButton.Builder() : new InventoryButton.Builder().mergeFrom(this);
   }

   protected InventoryButton.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new InventoryButton.Builder(var1);
   }

   public static InventoryButton getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<InventoryButton> parser() {
      return PARSER;
   }

   @Override
   public Parser<InventoryButton> getParserForType() {
      return PARSER;
   }

   public InventoryButton getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<InventoryButton.Builder> implements InventoryButtonOrBuilder {
      private int bitField0_;
      private Button button_;
      private SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> buttonBuilder_;
      private int inventoryType_ = 0;
      private int box_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_inventory_v1_InventoryButton_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_inventory_v1_InventoryButton_fieldAccessorTable
            .ensureFieldAccessorsInitialized(InventoryButton.class, InventoryButton.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (InventoryButton.alwaysUseFieldBuilders) {
            this.getButtonFieldBuilder();
         }
      }

      public InventoryButton.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.button_ = null;
         if (this.buttonBuilder_ != null) {
            this.buttonBuilder_.dispose();
            this.buttonBuilder_ = null;
         }

         this.inventoryType_ = 0;
         this.box_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_inventory_v1_InventoryButton_descriptor;
      }

      public InventoryButton getDefaultInstanceForType() {
         return InventoryButton.getDefaultInstance();
      }

      public InventoryButton build() {
         InventoryButton var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public InventoryButton buildPartial() {
         InventoryButton var1 = new InventoryButton(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(InventoryButton var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.button_ = this.buttonBuilder_ == null ? this.button_ : this.buttonBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.inventoryType_ = this.inventoryType_;
         }

         if ((var2 & 4) != 0) {
            var1.box_ = this.box_;
         }

         InventoryButton var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public InventoryButton.Builder clone() {
         return (InventoryButton.Builder)super.clone();
      }

      public InventoryButton.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InventoryButton.Builder)super.setField(var1, var2);
      }

      public InventoryButton.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (InventoryButton.Builder)super.clearField(var1);
      }

      public InventoryButton.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (InventoryButton.Builder)super.clearOneof(var1);
      }

      public InventoryButton.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (InventoryButton.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public InventoryButton.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InventoryButton.Builder)super.addRepeatedField(var1, var2);
      }

      public InventoryButton.Builder mergeFrom(Message var1) {
         if (var1 instanceof InventoryButton) {
            return this.mergeFrom((InventoryButton)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public InventoryButton.Builder mergeFrom(InventoryButton var1) {
         if (var1 == InventoryButton.getDefaultInstance()) {
            return this;
         }

         if (var1.hasButton()) {
            this.mergeButton(var1.getButton());
         }

         if (var1.inventoryType_ != 0) {
            this.setInventoryTypeValue(var1.getInventoryTypeValue());
         }

         if (var1.box_ != 0) {
            this.setBoxValue(var1.getBoxValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public InventoryButton.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getButtonFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.inventoryType_ = var1.readEnum();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.box_ = var1.readEnum();
                     this.bitField0_ |= 4;
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
      public boolean hasButton() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Button getButton() {
         if (this.buttonBuilder_ == null) {
            return this.button_ == null ? Button.getDefaultInstance() : this.button_;
         } else {
            return this.buttonBuilder_.getMessage();
         }
      }

      public InventoryButton.Builder setButton(Button var1) {
         if (this.buttonBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.button_ = var1;
         } else {
            this.buttonBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public InventoryButton.Builder setButton(Button.Builder var1) {
         if (this.buttonBuilder_ == null) {
            this.button_ = var1.build();
         } else {
            this.buttonBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public InventoryButton.Builder mergeButton(Button var1) {
         if (this.buttonBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.button_ != null && this.button_ != Button.getDefaultInstance()) {
               this.getButtonBuilder().mergeFrom(var1);
            } else {
               this.button_ = var1;
            }
         } else {
            this.buttonBuilder_.mergeFrom(var1);
         }

         if (this.button_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public InventoryButton.Builder clearButton() {
         this.bitField0_ &= -2;
         this.button_ = null;
         if (this.buttonBuilder_ != null) {
            this.buttonBuilder_.dispose();
            this.buttonBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Button.Builder getButtonBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getButtonFieldBuilder().getBuilder();
      }

      @Override
      public ButtonOrBuilder getButtonOrBuilder() {
         if (this.buttonBuilder_ != null) {
            return this.buttonBuilder_.getMessageOrBuilder();
         } else {
            return this.button_ == null ? Button.getDefaultInstance() : this.button_;
         }
      }

      private SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> getButtonFieldBuilder() {
         if (this.buttonBuilder_ == null) {
            this.buttonBuilder_ = new SingleFieldBuilderV3<>(this.getButton(), this.getParentForChildren(), this.isClean());
            this.button_ = null;
         }

         return this.buttonBuilder_;
      }

      @Override
      public int getInventoryTypeValue() {
         return this.inventoryType_;
      }

      public InventoryButton.Builder setInventoryTypeValue(int var1) {
         this.inventoryType_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public InventoryType getInventoryType() {
         InventoryType var1 = InventoryType.forNumber(this.inventoryType_);
         return var1 == null ? InventoryType.UNRECOGNIZED : var1;
      }

      public InventoryButton.Builder setInventoryType(InventoryType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.inventoryType_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public InventoryButton.Builder clearInventoryType() {
         this.bitField0_ &= -3;
         this.inventoryType_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getBoxValue() {
         return this.box_;
      }

      public InventoryButton.Builder setBoxValue(int var1) {
         this.box_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public InventoryButtonBox getBox() {
         InventoryButtonBox var1 = InventoryButtonBox.forNumber(this.box_);
         return var1 == null ? InventoryButtonBox.UNRECOGNIZED : var1;
      }

      public InventoryButton.Builder setBox(InventoryButtonBox var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 4;
         this.box_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public InventoryButton.Builder clearBox() {
         this.bitField0_ &= -5;
         this.box_ = 0;
         this.onChanged();
         return this;
      }

      public final InventoryButton.Builder setUnknownFields(UnknownFieldSet var1) {
         return (InventoryButton.Builder)super.setUnknownFields(var1);
      }

      public final InventoryButton.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (InventoryButton.Builder)super.mergeUnknownFields(var1);
      }
   }
}
