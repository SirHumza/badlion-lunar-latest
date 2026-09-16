package com.lunarclient.apollo.marker.v1;

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
import com.lunarclient.apollo.common.v1.ItemStackIcon;
import com.lunarclient.apollo.common.v1.ItemStackIconOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ItemTarget extends GeneratedMessageV3 implements ItemTargetOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ITEM_STACK_FIELD_NUMBER = 1;
   private ItemStackIcon itemStack_;
   private byte memoizedIsInitialized = -1;
   private static final ItemTarget DEFAULT_INSTANCE = new ItemTarget();
   private static final Parser<ItemTarget> PARSER = new AbstractParser<ItemTarget>() {
      public ItemTarget parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ItemTarget.Builder var3 = ItemTarget.newBuilder();

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

   private ItemTarget(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ItemTarget() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ItemTarget();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_marker_v1_ItemTarget_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_marker_v1_ItemTarget_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ItemTarget.class, ItemTarget.Builder.class);
   }

   @Override
   public boolean hasItemStack() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public ItemStackIcon getItemStack() {
      return this.itemStack_ == null ? ItemStackIcon.getDefaultInstance() : this.itemStack_;
   }

   @Override
   public ItemStackIconOrBuilder getItemStackOrBuilder() {
      return this.itemStack_ == null ? ItemStackIcon.getDefaultInstance() : this.itemStack_;
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
         var1.writeMessage(1, this.getItemStack());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getItemStack());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ItemTarget)) {
         return super.equals(var1);
      } else {
         ItemTarget var2 = (ItemTarget)var1;
         if (this.hasItemStack() != var2.hasItemStack()) {
            return false;
         } else {
            return this.hasItemStack() && !this.getItemStack().equals(var2.getItemStack()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasItemStack()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getItemStack().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ItemTarget parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ItemTarget parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ItemTarget parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ItemTarget parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ItemTarget parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ItemTarget parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ItemTarget parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ItemTarget parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ItemTarget parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ItemTarget parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ItemTarget parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ItemTarget parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ItemTarget.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ItemTarget.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ItemTarget.Builder newBuilder(ItemTarget var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ItemTarget.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ItemTarget.Builder() : new ItemTarget.Builder().mergeFrom(this);
   }

   protected ItemTarget.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ItemTarget.Builder(var1);
   }

   public static ItemTarget getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ItemTarget> parser() {
      return PARSER;
   }

   @Override
   public Parser<ItemTarget> getParserForType() {
      return PARSER;
   }

   public ItemTarget getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ItemTarget.Builder> implements ItemTargetOrBuilder {
      private int bitField0_;
      private ItemStackIcon itemStack_;
      private SingleFieldBuilderV3<ItemStackIcon, ItemStackIcon.Builder, ItemStackIconOrBuilder> itemStackBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_ItemTarget_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_ItemTarget_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ItemTarget.class, ItemTarget.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ItemTarget.alwaysUseFieldBuilders) {
            this.getItemStackFieldBuilder();
         }
      }

      public ItemTarget.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.itemStack_ = null;
         if (this.itemStackBuilder_ != null) {
            this.itemStackBuilder_.dispose();
            this.itemStackBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_ItemTarget_descriptor;
      }

      public ItemTarget getDefaultInstanceForType() {
         return ItemTarget.getDefaultInstance();
      }

      public ItemTarget build() {
         ItemTarget var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ItemTarget buildPartial() {
         ItemTarget var1 = new ItemTarget(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ItemTarget var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.itemStack_ = this.itemStackBuilder_ == null ? this.itemStack_ : this.itemStackBuilder_.build();
            var3 |= 1;
         }

         ItemTarget var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ItemTarget.Builder clone() {
         return (ItemTarget.Builder)super.clone();
      }

      public ItemTarget.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ItemTarget.Builder)super.setField(var1, var2);
      }

      public ItemTarget.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ItemTarget.Builder)super.clearField(var1);
      }

      public ItemTarget.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ItemTarget.Builder)super.clearOneof(var1);
      }

      public ItemTarget.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ItemTarget.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ItemTarget.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ItemTarget.Builder)super.addRepeatedField(var1, var2);
      }

      public ItemTarget.Builder mergeFrom(Message var1) {
         if (var1 instanceof ItemTarget) {
            return this.mergeFrom((ItemTarget)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ItemTarget.Builder mergeFrom(ItemTarget var1) {
         if (var1 == ItemTarget.getDefaultInstance()) {
            return this;
         }

         if (var1.hasItemStack()) {
            this.mergeItemStack(var1.getItemStack());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ItemTarget.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getItemStackFieldBuilder().getBuilder(), var2);
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
      public boolean hasItemStack() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public ItemStackIcon getItemStack() {
         if (this.itemStackBuilder_ == null) {
            return this.itemStack_ == null ? ItemStackIcon.getDefaultInstance() : this.itemStack_;
         } else {
            return this.itemStackBuilder_.getMessage();
         }
      }

      public ItemTarget.Builder setItemStack(ItemStackIcon var1) {
         if (this.itemStackBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.itemStack_ = var1;
         } else {
            this.itemStackBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ItemTarget.Builder setItemStack(ItemStackIcon.Builder var1) {
         if (this.itemStackBuilder_ == null) {
            this.itemStack_ = var1.build();
         } else {
            this.itemStackBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ItemTarget.Builder mergeItemStack(ItemStackIcon var1) {
         if (this.itemStackBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.itemStack_ != null && this.itemStack_ != ItemStackIcon.getDefaultInstance()) {
               this.getItemStackBuilder().mergeFrom(var1);
            } else {
               this.itemStack_ = var1;
            }
         } else {
            this.itemStackBuilder_.mergeFrom(var1);
         }

         if (this.itemStack_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public ItemTarget.Builder clearItemStack() {
         this.bitField0_ &= -2;
         this.itemStack_ = null;
         if (this.itemStackBuilder_ != null) {
            this.itemStackBuilder_.dispose();
            this.itemStackBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ItemStackIcon.Builder getItemStackBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getItemStackFieldBuilder().getBuilder();
      }

      @Override
      public ItemStackIconOrBuilder getItemStackOrBuilder() {
         if (this.itemStackBuilder_ != null) {
            return this.itemStackBuilder_.getMessageOrBuilder();
         } else {
            return this.itemStack_ == null ? ItemStackIcon.getDefaultInstance() : this.itemStack_;
         }
      }

      private SingleFieldBuilderV3<ItemStackIcon, ItemStackIcon.Builder, ItemStackIconOrBuilder> getItemStackFieldBuilder() {
         if (this.itemStackBuilder_ == null) {
            this.itemStackBuilder_ = new SingleFieldBuilderV3<>(this.getItemStack(), this.getParentForChildren(), this.isClean());
            this.itemStack_ = null;
         }

         return this.itemStackBuilder_;
      }

      public final ItemTarget.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ItemTarget.Builder)super.setUnknownFields(var1);
      }

      public final ItemTarget.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ItemTarget.Builder)super.mergeUnknownFields(var1);
      }
   }
}
