package com.lunarclient.apollo.inventory.v1;

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

public final class DisplayInventoryButtonsMessage extends GeneratedMessageV3 implements DisplayInventoryButtonsMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int INVENTORY_BUTTONS_FIELD_NUMBER = 1;
   private List<InventoryButton> inventoryButtons_;
   private byte memoizedIsInitialized = -1;
   private static final DisplayInventoryButtonsMessage DEFAULT_INSTANCE = new DisplayInventoryButtonsMessage();
   private static final Parser<DisplayInventoryButtonsMessage> PARSER = new AbstractParser<DisplayInventoryButtonsMessage>() {
      public DisplayInventoryButtonsMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DisplayInventoryButtonsMessage.Builder var3 = DisplayInventoryButtonsMessage.newBuilder();

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

   private DisplayInventoryButtonsMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DisplayInventoryButtonsMessage() {
      this.inventoryButtons_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DisplayInventoryButtonsMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_inventory_v1_DisplayInventoryButtonsMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_inventory_v1_DisplayInventoryButtonsMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DisplayInventoryButtonsMessage.class, DisplayInventoryButtonsMessage.Builder.class);
   }

   @Override
   public List<InventoryButton> getInventoryButtonsList() {
      return this.inventoryButtons_;
   }

   @Override
   public List<? extends InventoryButtonOrBuilder> getInventoryButtonsOrBuilderList() {
      return this.inventoryButtons_;
   }

   @Override
   public int getInventoryButtonsCount() {
      return this.inventoryButtons_.size();
   }

   @Override
   public InventoryButton getInventoryButtons(int var1) {
      return this.inventoryButtons_.get(var1);
   }

   @Override
   public InventoryButtonOrBuilder getInventoryButtonsOrBuilder(int var1) {
      return this.inventoryButtons_.get(var1);
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
      for (int var2 = 0; var2 < this.inventoryButtons_.size(); var2++) {
         var1.writeMessage(1, this.inventoryButtons_.get(var2));
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

      for (int var2 = 0; var2 < this.inventoryButtons_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.inventoryButtons_.get(var2));
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

      if (!(var1 instanceof DisplayInventoryButtonsMessage)) {
         return super.equals(var1);
      }

      DisplayInventoryButtonsMessage var2 = (DisplayInventoryButtonsMessage)var1;
      return !this.getInventoryButtonsList().equals(var2.getInventoryButtonsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getInventoryButtonsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getInventoryButtonsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DisplayInventoryButtonsMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayInventoryButtonsMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayInventoryButtonsMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayInventoryButtonsMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayInventoryButtonsMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayInventoryButtonsMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayInventoryButtonsMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayInventoryButtonsMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DisplayInventoryButtonsMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DisplayInventoryButtonsMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DisplayInventoryButtonsMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayInventoryButtonsMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DisplayInventoryButtonsMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DisplayInventoryButtonsMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DisplayInventoryButtonsMessage.Builder newBuilder(DisplayInventoryButtonsMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DisplayInventoryButtonsMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DisplayInventoryButtonsMessage.Builder() : new DisplayInventoryButtonsMessage.Builder().mergeFrom(this);
   }

   protected DisplayInventoryButtonsMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DisplayInventoryButtonsMessage.Builder(var1);
   }

   public static DisplayInventoryButtonsMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DisplayInventoryButtonsMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<DisplayInventoryButtonsMessage> getParserForType() {
      return PARSER;
   }

   public DisplayInventoryButtonsMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<DisplayInventoryButtonsMessage.Builder>
      implements DisplayInventoryButtonsMessageOrBuilder {
      private int bitField0_;
      private List<InventoryButton> inventoryButtons_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<InventoryButton, InventoryButton.Builder, InventoryButtonOrBuilder> inventoryButtonsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_inventory_v1_DisplayInventoryButtonsMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_inventory_v1_DisplayInventoryButtonsMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DisplayInventoryButtonsMessage.class, DisplayInventoryButtonsMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public DisplayInventoryButtonsMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.inventoryButtonsBuilder_ == null) {
            this.inventoryButtons_ = Collections.emptyList();
         } else {
            this.inventoryButtons_ = null;
            this.inventoryButtonsBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_inventory_v1_DisplayInventoryButtonsMessage_descriptor;
      }

      public DisplayInventoryButtonsMessage getDefaultInstanceForType() {
         return DisplayInventoryButtonsMessage.getDefaultInstance();
      }

      public DisplayInventoryButtonsMessage build() {
         DisplayInventoryButtonsMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DisplayInventoryButtonsMessage buildPartial() {
         DisplayInventoryButtonsMessage var1 = new DisplayInventoryButtonsMessage(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(DisplayInventoryButtonsMessage var1) {
         if (this.inventoryButtonsBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.inventoryButtons_ = Collections.unmodifiableList(this.inventoryButtons_);
               this.bitField0_ &= -2;
            }

            var1.inventoryButtons_ = this.inventoryButtons_;
         } else {
            var1.inventoryButtons_ = this.inventoryButtonsBuilder_.build();
         }
      }

      private void buildPartial0(DisplayInventoryButtonsMessage var1) {
         int var2 = this.bitField0_;
      }

      public DisplayInventoryButtonsMessage.Builder clone() {
         return (DisplayInventoryButtonsMessage.Builder)super.clone();
      }

      public DisplayInventoryButtonsMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayInventoryButtonsMessage.Builder)super.setField(var1, var2);
      }

      public DisplayInventoryButtonsMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DisplayInventoryButtonsMessage.Builder)super.clearField(var1);
      }

      public DisplayInventoryButtonsMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DisplayInventoryButtonsMessage.Builder)super.clearOneof(var1);
      }

      public DisplayInventoryButtonsMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DisplayInventoryButtonsMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DisplayInventoryButtonsMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayInventoryButtonsMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public DisplayInventoryButtonsMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof DisplayInventoryButtonsMessage) {
            return this.mergeFrom((DisplayInventoryButtonsMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DisplayInventoryButtonsMessage.Builder mergeFrom(DisplayInventoryButtonsMessage var1) {
         if (var1 == DisplayInventoryButtonsMessage.getDefaultInstance()) {
            return this;
         }

         if (this.inventoryButtonsBuilder_ == null) {
            if (!var1.inventoryButtons_.isEmpty()) {
               if (this.inventoryButtons_.isEmpty()) {
                  this.inventoryButtons_ = var1.inventoryButtons_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureInventoryButtonsIsMutable();
                  this.inventoryButtons_.addAll(var1.inventoryButtons_);
               }

               this.onChanged();
            }
         } else if (!var1.inventoryButtons_.isEmpty()) {
            if (this.inventoryButtonsBuilder_.isEmpty()) {
               this.inventoryButtonsBuilder_.dispose();
               this.inventoryButtonsBuilder_ = null;
               this.inventoryButtons_ = var1.inventoryButtons_;
               this.bitField0_ &= -2;
               this.inventoryButtonsBuilder_ = DisplayInventoryButtonsMessage.alwaysUseFieldBuilders ? this.getInventoryButtonsFieldBuilder() : null;
            } else {
               this.inventoryButtonsBuilder_.addAllMessages(var1.inventoryButtons_);
            }
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public DisplayInventoryButtonsMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     InventoryButton var5 = var1.readMessage(InventoryButton.parser(), var2);
                     if (this.inventoryButtonsBuilder_ == null) {
                        this.ensureInventoryButtonsIsMutable();
                        this.inventoryButtons_.add(var5);
                     } else {
                        this.inventoryButtonsBuilder_.addMessage(var5);
                     }
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

      private void ensureInventoryButtonsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.inventoryButtons_ = new ArrayList<>(this.inventoryButtons_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<InventoryButton> getInventoryButtonsList() {
         return this.inventoryButtonsBuilder_ == null ? Collections.unmodifiableList(this.inventoryButtons_) : this.inventoryButtonsBuilder_.getMessageList();
      }

      @Override
      public int getInventoryButtonsCount() {
         return this.inventoryButtonsBuilder_ == null ? this.inventoryButtons_.size() : this.inventoryButtonsBuilder_.getCount();
      }

      @Override
      public InventoryButton getInventoryButtons(int var1) {
         return this.inventoryButtonsBuilder_ == null ? this.inventoryButtons_.get(var1) : this.inventoryButtonsBuilder_.getMessage(var1);
      }

      public DisplayInventoryButtonsMessage.Builder setInventoryButtons(int var1, InventoryButton var2) {
         if (this.inventoryButtonsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureInventoryButtonsIsMutable();
            this.inventoryButtons_.set(var1, var2);
            this.onChanged();
         } else {
            this.inventoryButtonsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public DisplayInventoryButtonsMessage.Builder setInventoryButtons(int var1, InventoryButton.Builder var2) {
         if (this.inventoryButtonsBuilder_ == null) {
            this.ensureInventoryButtonsIsMutable();
            this.inventoryButtons_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.inventoryButtonsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public DisplayInventoryButtonsMessage.Builder addInventoryButtons(InventoryButton var1) {
         if (this.inventoryButtonsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureInventoryButtonsIsMutable();
            this.inventoryButtons_.add(var1);
            this.onChanged();
         } else {
            this.inventoryButtonsBuilder_.addMessage(var1);
         }

         return this;
      }

      public DisplayInventoryButtonsMessage.Builder addInventoryButtons(int var1, InventoryButton var2) {
         if (this.inventoryButtonsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureInventoryButtonsIsMutable();
            this.inventoryButtons_.add(var1, var2);
            this.onChanged();
         } else {
            this.inventoryButtonsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public DisplayInventoryButtonsMessage.Builder addInventoryButtons(InventoryButton.Builder var1) {
         if (this.inventoryButtonsBuilder_ == null) {
            this.ensureInventoryButtonsIsMutable();
            this.inventoryButtons_.add(var1.build());
            this.onChanged();
         } else {
            this.inventoryButtonsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public DisplayInventoryButtonsMessage.Builder addInventoryButtons(int var1, InventoryButton.Builder var2) {
         if (this.inventoryButtonsBuilder_ == null) {
            this.ensureInventoryButtonsIsMutable();
            this.inventoryButtons_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.inventoryButtonsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public DisplayInventoryButtonsMessage.Builder addAllInventoryButtons(Iterable<? extends InventoryButton> var1) {
         if (this.inventoryButtonsBuilder_ == null) {
            this.ensureInventoryButtonsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.inventoryButtons_);
            this.onChanged();
         } else {
            this.inventoryButtonsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public DisplayInventoryButtonsMessage.Builder clearInventoryButtons() {
         if (this.inventoryButtonsBuilder_ == null) {
            this.inventoryButtons_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.inventoryButtonsBuilder_.clear();
         }

         return this;
      }

      public DisplayInventoryButtonsMessage.Builder removeInventoryButtons(int var1) {
         if (this.inventoryButtonsBuilder_ == null) {
            this.ensureInventoryButtonsIsMutable();
            this.inventoryButtons_.remove(var1);
            this.onChanged();
         } else {
            this.inventoryButtonsBuilder_.remove(var1);
         }

         return this;
      }

      public InventoryButton.Builder getInventoryButtonsBuilder(int var1) {
         return this.getInventoryButtonsFieldBuilder().getBuilder(var1);
      }

      @Override
      public InventoryButtonOrBuilder getInventoryButtonsOrBuilder(int var1) {
         return this.inventoryButtonsBuilder_ == null ? this.inventoryButtons_.get(var1) : this.inventoryButtonsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends InventoryButtonOrBuilder> getInventoryButtonsOrBuilderList() {
         return this.inventoryButtonsBuilder_ != null
            ? this.inventoryButtonsBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.inventoryButtons_);
      }

      public InventoryButton.Builder addInventoryButtonsBuilder() {
         return this.getInventoryButtonsFieldBuilder().addBuilder(InventoryButton.getDefaultInstance());
      }

      public InventoryButton.Builder addInventoryButtonsBuilder(int var1) {
         return this.getInventoryButtonsFieldBuilder().addBuilder(var1, InventoryButton.getDefaultInstance());
      }

      public List<InventoryButton.Builder> getInventoryButtonsBuilderList() {
         return this.getInventoryButtonsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<InventoryButton, InventoryButton.Builder, InventoryButtonOrBuilder> getInventoryButtonsFieldBuilder() {
         if (this.inventoryButtonsBuilder_ == null) {
            this.inventoryButtonsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.inventoryButtons_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean()
            );
            this.inventoryButtons_ = null;
         }

         return this.inventoryButtonsBuilder_;
      }

      public final DisplayInventoryButtonsMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DisplayInventoryButtonsMessage.Builder)super.setUnknownFields(var1);
      }

      public final DisplayInventoryButtonsMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DisplayInventoryButtonsMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
