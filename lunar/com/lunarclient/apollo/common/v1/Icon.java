package com.lunarclient.apollo.common.v1;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Icon extends GeneratedMessageV3 implements IconOrBuilder {
   private static final long serialVersionUID = 0L;
   private int contentsCase_ = 0;
   private Object contents_;
   public static final int ITEM_STACK_FIELD_NUMBER = 1;
   public static final int SIMPLE_RESOURCE_LOCATION_FIELD_NUMBER = 2;
   public static final int ADVANCED_RESOURCE_LOCATION_FIELD_NUMBER = 3;
   public static final int RESOURCE_LOCATION_FIELD_NUMBER = 4;
   private byte memoizedIsInitialized = -1;
   private static final Icon DEFAULT_INSTANCE = new Icon();
   private static final Parser<Icon> PARSER = new AbstractParser<Icon>() {
      public Icon parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Icon.Builder var3 = Icon.newBuilder();

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

   private Icon(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Icon() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Icon();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return IconProto.internal_static_lunarclient_apollo_common_v1_Icon_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return IconProto.internal_static_lunarclient_apollo_common_v1_Icon_fieldAccessorTable.ensureFieldAccessorsInitialized(Icon.class, Icon.Builder.class);
   }

   @Override
   public Icon.ContentsCase getContentsCase() {
      return Icon.ContentsCase.forNumber(this.contentsCase_);
   }

   @Override
   public boolean hasItemStack() {
      return this.contentsCase_ == 1;
   }

   @Override
   public ItemStackIcon getItemStack() {
      return this.contentsCase_ == 1 ? (ItemStackIcon)this.contents_ : ItemStackIcon.getDefaultInstance();
   }

   @Override
   public ItemStackIconOrBuilder getItemStackOrBuilder() {
      return this.contentsCase_ == 1 ? (ItemStackIcon)this.contents_ : ItemStackIcon.getDefaultInstance();
   }

   @Override
   public boolean hasSimpleResourceLocation() {
      return this.contentsCase_ == 2;
   }

   @Override
   public SimpleResourceLocationIcon getSimpleResourceLocation() {
      return this.contentsCase_ == 2 ? (SimpleResourceLocationIcon)this.contents_ : SimpleResourceLocationIcon.getDefaultInstance();
   }

   @Override
   public SimpleResourceLocationIconOrBuilder getSimpleResourceLocationOrBuilder() {
      return this.contentsCase_ == 2 ? (SimpleResourceLocationIcon)this.contents_ : SimpleResourceLocationIcon.getDefaultInstance();
   }

   @Override
   public boolean hasAdvancedResourceLocation() {
      return this.contentsCase_ == 3;
   }

   @Override
   public AdvancedResourceLocationIcon getAdvancedResourceLocation() {
      return this.contentsCase_ == 3 ? (AdvancedResourceLocationIcon)this.contents_ : AdvancedResourceLocationIcon.getDefaultInstance();
   }

   @Override
   public AdvancedResourceLocationIconOrBuilder getAdvancedResourceLocationOrBuilder() {
      return this.contentsCase_ == 3 ? (AdvancedResourceLocationIcon)this.contents_ : AdvancedResourceLocationIcon.getDefaultInstance();
   }

   @Override
   public boolean hasResourceLocation() {
      return this.contentsCase_ == 4;
   }

   @Override
   public ResourceLocationIcon getResourceLocation() {
      return this.contentsCase_ == 4 ? (ResourceLocationIcon)this.contents_ : ResourceLocationIcon.getDefaultInstance();
   }

   @Override
   public ResourceLocationIconOrBuilder getResourceLocationOrBuilder() {
      return this.contentsCase_ == 4 ? (ResourceLocationIcon)this.contents_ : ResourceLocationIcon.getDefaultInstance();
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
      if (this.contentsCase_ == 1) {
         var1.writeMessage(1, (ItemStackIcon)this.contents_);
      }

      if (this.contentsCase_ == 2) {
         var1.writeMessage(2, (SimpleResourceLocationIcon)this.contents_);
      }

      if (this.contentsCase_ == 3) {
         var1.writeMessage(3, (AdvancedResourceLocationIcon)this.contents_);
      }

      if (this.contentsCase_ == 4) {
         var1.writeMessage(4, (ResourceLocationIcon)this.contents_);
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
      if (this.contentsCase_ == 1) {
         var1 += CodedOutputStream.computeMessageSize(1, (ItemStackIcon)this.contents_);
      }

      if (this.contentsCase_ == 2) {
         var1 += CodedOutputStream.computeMessageSize(2, (SimpleResourceLocationIcon)this.contents_);
      }

      if (this.contentsCase_ == 3) {
         var1 += CodedOutputStream.computeMessageSize(3, (AdvancedResourceLocationIcon)this.contents_);
      }

      if (this.contentsCase_ == 4) {
         var1 += CodedOutputStream.computeMessageSize(4, (ResourceLocationIcon)this.contents_);
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

      if (!(var1 instanceof Icon)) {
         return super.equals(var1);
      }

      Icon var2 = (Icon)var1;
      if (!this.getContentsCase().equals(var2.getContentsCase())) {
         return false;
      }

      switch (this.contentsCase_) {
         case 0:
         default:
            break;
         case 1:
            if (!this.getItemStack().equals(var2.getItemStack())) {
               return false;
            }
            break;
         case 2:
            if (!this.getSimpleResourceLocation().equals(var2.getSimpleResourceLocation())) {
               return false;
            }
            break;
         case 3:
            if (!this.getAdvancedResourceLocation().equals(var2.getAdvancedResourceLocation())) {
               return false;
            }
            break;
         case 4:
            if (!this.getResourceLocation().equals(var2.getResourceLocation())) {
               return false;
            }
      }

      return this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      switch (this.contentsCase_) {
         case 0:
         default:
            break;
         case 1:
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getItemStack().hashCode();
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getSimpleResourceLocation().hashCode();
            break;
         case 3:
            var1 = 37 * var1 + 3;
            var1 = 53 * var1 + this.getAdvancedResourceLocation().hashCode();
            break;
         case 4:
            var1 = 37 * var1 + 4;
            var1 = 53 * var1 + this.getResourceLocation().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Icon parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Icon parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Icon parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Icon parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Icon parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Icon parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Icon parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Icon parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Icon parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Icon parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Icon parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Icon parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Icon.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Icon.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Icon.Builder newBuilder(Icon var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Icon.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Icon.Builder() : new Icon.Builder().mergeFrom(this);
   }

   protected Icon.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Icon.Builder(var1);
   }

   public static Icon getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Icon> parser() {
      return PARSER;
   }

   @Override
   public Parser<Icon> getParserForType() {
      return PARSER;
   }

   public Icon getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Icon.Builder> implements IconOrBuilder {
      private int contentsCase_ = 0;
      private Object contents_;
      private int bitField0_;
      private SingleFieldBuilderV3<ItemStackIcon, ItemStackIcon.Builder, ItemStackIconOrBuilder> itemStackBuilder_;
      private SingleFieldBuilderV3<SimpleResourceLocationIcon, SimpleResourceLocationIcon.Builder, SimpleResourceLocationIconOrBuilder> simpleResourceLocationBuilder_;
      private SingleFieldBuilderV3<AdvancedResourceLocationIcon, AdvancedResourceLocationIcon.Builder, AdvancedResourceLocationIconOrBuilder> advancedResourceLocationBuilder_;
      private SingleFieldBuilderV3<ResourceLocationIcon, ResourceLocationIcon.Builder, ResourceLocationIconOrBuilder> resourceLocationBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return IconProto.internal_static_lunarclient_apollo_common_v1_Icon_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return IconProto.internal_static_lunarclient_apollo_common_v1_Icon_fieldAccessorTable.ensureFieldAccessorsInitialized(Icon.class, Icon.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public Icon.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.itemStackBuilder_ != null) {
            this.itemStackBuilder_.clear();
         }

         if (this.simpleResourceLocationBuilder_ != null) {
            this.simpleResourceLocationBuilder_.clear();
         }

         if (this.advancedResourceLocationBuilder_ != null) {
            this.advancedResourceLocationBuilder_.clear();
         }

         if (this.resourceLocationBuilder_ != null) {
            this.resourceLocationBuilder_.clear();
         }

         this.contentsCase_ = 0;
         this.contents_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return IconProto.internal_static_lunarclient_apollo_common_v1_Icon_descriptor;
      }

      public Icon getDefaultInstanceForType() {
         return Icon.getDefaultInstance();
      }

      public Icon build() {
         Icon var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Icon buildPartial() {
         Icon var1 = new Icon(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Icon var1) {
         int var2 = this.bitField0_;
      }

      private void buildPartialOneofs(Icon var1) {
         var1.contentsCase_ = this.contentsCase_;
         var1.contents_ = this.contents_;
         if (this.contentsCase_ == 1 && this.itemStackBuilder_ != null) {
            var1.contents_ = this.itemStackBuilder_.build();
         }

         if (this.contentsCase_ == 2 && this.simpleResourceLocationBuilder_ != null) {
            var1.contents_ = this.simpleResourceLocationBuilder_.build();
         }

         if (this.contentsCase_ == 3 && this.advancedResourceLocationBuilder_ != null) {
            var1.contents_ = this.advancedResourceLocationBuilder_.build();
         }

         if (this.contentsCase_ == 4 && this.resourceLocationBuilder_ != null) {
            var1.contents_ = this.resourceLocationBuilder_.build();
         }
      }

      public Icon.Builder clone() {
         return (Icon.Builder)super.clone();
      }

      public Icon.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Icon.Builder)super.setField(var1, var2);
      }

      public Icon.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Icon.Builder)super.clearField(var1);
      }

      public Icon.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Icon.Builder)super.clearOneof(var1);
      }

      public Icon.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Icon.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Icon.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Icon.Builder)super.addRepeatedField(var1, var2);
      }

      public Icon.Builder mergeFrom(Message var1) {
         if (var1 instanceof Icon) {
            return this.mergeFrom((Icon)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Icon.Builder mergeFrom(Icon var1) {
         if (var1 == Icon.getDefaultInstance()) {
            return this;
         }

         switch (var1.getContentsCase()) {
            case ITEM_STACK:
               this.mergeItemStack(var1.getItemStack());
               break;
            case SIMPLE_RESOURCE_LOCATION:
               this.mergeSimpleResourceLocation(var1.getSimpleResourceLocation());
               break;
            case ADVANCED_RESOURCE_LOCATION:
               this.mergeAdvancedResourceLocation(var1.getAdvancedResourceLocation());
               break;
            case RESOURCE_LOCATION:
               this.mergeResourceLocation(var1.getResourceLocation());
            case CONTENTS_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public Icon.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.contentsCase_ = 1;
                     break;
                  case 18:
                     var1.readMessage(this.getSimpleResourceLocationFieldBuilder().getBuilder(), var2);
                     this.contentsCase_ = 2;
                     break;
                  case 26:
                     var1.readMessage(this.getAdvancedResourceLocationFieldBuilder().getBuilder(), var2);
                     this.contentsCase_ = 3;
                     break;
                  case 34:
                     var1.readMessage(this.getResourceLocationFieldBuilder().getBuilder(), var2);
                     this.contentsCase_ = 4;
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
      public Icon.ContentsCase getContentsCase() {
         return Icon.ContentsCase.forNumber(this.contentsCase_);
      }

      public Icon.Builder clearContents() {
         this.contentsCase_ = 0;
         this.contents_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasItemStack() {
         return this.contentsCase_ == 1;
      }

      @Override
      public ItemStackIcon getItemStack() {
         if (this.itemStackBuilder_ == null) {
            return this.contentsCase_ == 1 ? (ItemStackIcon)this.contents_ : ItemStackIcon.getDefaultInstance();
         } else {
            return this.contentsCase_ == 1 ? this.itemStackBuilder_.getMessage() : ItemStackIcon.getDefaultInstance();
         }
      }

      public Icon.Builder setItemStack(ItemStackIcon var1) {
         if (this.itemStackBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.contents_ = var1;
            this.onChanged();
         } else {
            this.itemStackBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 1;
         return this;
      }

      public Icon.Builder setItemStack(ItemStackIcon.Builder var1) {
         if (this.itemStackBuilder_ == null) {
            this.contents_ = var1.build();
            this.onChanged();
         } else {
            this.itemStackBuilder_.setMessage(var1.build());
         }

         this.contentsCase_ = 1;
         return this;
      }

      public Icon.Builder mergeItemStack(ItemStackIcon var1) {
         if (this.itemStackBuilder_ == null) {
            if (this.contentsCase_ == 1 && this.contents_ != ItemStackIcon.getDefaultInstance()) {
               this.contents_ = ItemStackIcon.newBuilder((ItemStackIcon)this.contents_).mergeFrom(var1).buildPartial();
            } else {
               this.contents_ = var1;
            }

            this.onChanged();
         } else if (this.contentsCase_ == 1) {
            this.itemStackBuilder_.mergeFrom(var1);
         } else {
            this.itemStackBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 1;
         return this;
      }

      public Icon.Builder clearItemStack() {
         if (this.itemStackBuilder_ == null) {
            if (this.contentsCase_ == 1) {
               this.contentsCase_ = 0;
               this.contents_ = null;
               this.onChanged();
            }
         } else {
            if (this.contentsCase_ == 1) {
               this.contentsCase_ = 0;
               this.contents_ = null;
            }

            this.itemStackBuilder_.clear();
         }

         return this;
      }

      public ItemStackIcon.Builder getItemStackBuilder() {
         return this.getItemStackFieldBuilder().getBuilder();
      }

      @Override
      public ItemStackIconOrBuilder getItemStackOrBuilder() {
         if (this.contentsCase_ == 1 && this.itemStackBuilder_ != null) {
            return this.itemStackBuilder_.getMessageOrBuilder();
         } else {
            return this.contentsCase_ == 1 ? (ItemStackIcon)this.contents_ : ItemStackIcon.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<ItemStackIcon, ItemStackIcon.Builder, ItemStackIconOrBuilder> getItemStackFieldBuilder() {
         if (this.itemStackBuilder_ == null) {
            if (this.contentsCase_ != 1) {
               this.contents_ = ItemStackIcon.getDefaultInstance();
            }

            this.itemStackBuilder_ = new SingleFieldBuilderV3<>((ItemStackIcon)this.contents_, this.getParentForChildren(), this.isClean());
            this.contents_ = null;
         }

         this.contentsCase_ = 1;
         this.onChanged();
         return this.itemStackBuilder_;
      }

      @Override
      public boolean hasSimpleResourceLocation() {
         return this.contentsCase_ == 2;
      }

      @Override
      public SimpleResourceLocationIcon getSimpleResourceLocation() {
         if (this.simpleResourceLocationBuilder_ == null) {
            return this.contentsCase_ == 2 ? (SimpleResourceLocationIcon)this.contents_ : SimpleResourceLocationIcon.getDefaultInstance();
         } else {
            return this.contentsCase_ == 2 ? this.simpleResourceLocationBuilder_.getMessage() : SimpleResourceLocationIcon.getDefaultInstance();
         }
      }

      public Icon.Builder setSimpleResourceLocation(SimpleResourceLocationIcon var1) {
         if (this.simpleResourceLocationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.contents_ = var1;
            this.onChanged();
         } else {
            this.simpleResourceLocationBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 2;
         return this;
      }

      public Icon.Builder setSimpleResourceLocation(SimpleResourceLocationIcon.Builder var1) {
         if (this.simpleResourceLocationBuilder_ == null) {
            this.contents_ = var1.build();
            this.onChanged();
         } else {
            this.simpleResourceLocationBuilder_.setMessage(var1.build());
         }

         this.contentsCase_ = 2;
         return this;
      }

      public Icon.Builder mergeSimpleResourceLocation(SimpleResourceLocationIcon var1) {
         if (this.simpleResourceLocationBuilder_ == null) {
            if (this.contentsCase_ == 2 && this.contents_ != SimpleResourceLocationIcon.getDefaultInstance()) {
               this.contents_ = SimpleResourceLocationIcon.newBuilder((SimpleResourceLocationIcon)this.contents_).mergeFrom(var1).buildPartial();
            } else {
               this.contents_ = var1;
            }

            this.onChanged();
         } else if (this.contentsCase_ == 2) {
            this.simpleResourceLocationBuilder_.mergeFrom(var1);
         } else {
            this.simpleResourceLocationBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 2;
         return this;
      }

      public Icon.Builder clearSimpleResourceLocation() {
         if (this.simpleResourceLocationBuilder_ == null) {
            if (this.contentsCase_ == 2) {
               this.contentsCase_ = 0;
               this.contents_ = null;
               this.onChanged();
            }
         } else {
            if (this.contentsCase_ == 2) {
               this.contentsCase_ = 0;
               this.contents_ = null;
            }

            this.simpleResourceLocationBuilder_.clear();
         }

         return this;
      }

      public SimpleResourceLocationIcon.Builder getSimpleResourceLocationBuilder() {
         return this.getSimpleResourceLocationFieldBuilder().getBuilder();
      }

      @Override
      public SimpleResourceLocationIconOrBuilder getSimpleResourceLocationOrBuilder() {
         if (this.contentsCase_ == 2 && this.simpleResourceLocationBuilder_ != null) {
            return this.simpleResourceLocationBuilder_.getMessageOrBuilder();
         } else {
            return this.contentsCase_ == 2 ? (SimpleResourceLocationIcon)this.contents_ : SimpleResourceLocationIcon.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<SimpleResourceLocationIcon, SimpleResourceLocationIcon.Builder, SimpleResourceLocationIconOrBuilder> getSimpleResourceLocationFieldBuilder() {
         if (this.simpleResourceLocationBuilder_ == null) {
            if (this.contentsCase_ != 2) {
               this.contents_ = SimpleResourceLocationIcon.getDefaultInstance();
            }

            this.simpleResourceLocationBuilder_ = new SingleFieldBuilderV3<>(
               (SimpleResourceLocationIcon)this.contents_, this.getParentForChildren(), this.isClean()
            );
            this.contents_ = null;
         }

         this.contentsCase_ = 2;
         this.onChanged();
         return this.simpleResourceLocationBuilder_;
      }

      @Override
      public boolean hasAdvancedResourceLocation() {
         return this.contentsCase_ == 3;
      }

      @Override
      public AdvancedResourceLocationIcon getAdvancedResourceLocation() {
         if (this.advancedResourceLocationBuilder_ == null) {
            return this.contentsCase_ == 3 ? (AdvancedResourceLocationIcon)this.contents_ : AdvancedResourceLocationIcon.getDefaultInstance();
         } else {
            return this.contentsCase_ == 3 ? this.advancedResourceLocationBuilder_.getMessage() : AdvancedResourceLocationIcon.getDefaultInstance();
         }
      }

      public Icon.Builder setAdvancedResourceLocation(AdvancedResourceLocationIcon var1) {
         if (this.advancedResourceLocationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.contents_ = var1;
            this.onChanged();
         } else {
            this.advancedResourceLocationBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 3;
         return this;
      }

      public Icon.Builder setAdvancedResourceLocation(AdvancedResourceLocationIcon.Builder var1) {
         if (this.advancedResourceLocationBuilder_ == null) {
            this.contents_ = var1.build();
            this.onChanged();
         } else {
            this.advancedResourceLocationBuilder_.setMessage(var1.build());
         }

         this.contentsCase_ = 3;
         return this;
      }

      public Icon.Builder mergeAdvancedResourceLocation(AdvancedResourceLocationIcon var1) {
         if (this.advancedResourceLocationBuilder_ == null) {
            if (this.contentsCase_ == 3 && this.contents_ != AdvancedResourceLocationIcon.getDefaultInstance()) {
               this.contents_ = AdvancedResourceLocationIcon.newBuilder((AdvancedResourceLocationIcon)this.contents_).mergeFrom(var1).buildPartial();
            } else {
               this.contents_ = var1;
            }

            this.onChanged();
         } else if (this.contentsCase_ == 3) {
            this.advancedResourceLocationBuilder_.mergeFrom(var1);
         } else {
            this.advancedResourceLocationBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 3;
         return this;
      }

      public Icon.Builder clearAdvancedResourceLocation() {
         if (this.advancedResourceLocationBuilder_ == null) {
            if (this.contentsCase_ == 3) {
               this.contentsCase_ = 0;
               this.contents_ = null;
               this.onChanged();
            }
         } else {
            if (this.contentsCase_ == 3) {
               this.contentsCase_ = 0;
               this.contents_ = null;
            }

            this.advancedResourceLocationBuilder_.clear();
         }

         return this;
      }

      public AdvancedResourceLocationIcon.Builder getAdvancedResourceLocationBuilder() {
         return this.getAdvancedResourceLocationFieldBuilder().getBuilder();
      }

      @Override
      public AdvancedResourceLocationIconOrBuilder getAdvancedResourceLocationOrBuilder() {
         if (this.contentsCase_ == 3 && this.advancedResourceLocationBuilder_ != null) {
            return this.advancedResourceLocationBuilder_.getMessageOrBuilder();
         } else {
            return this.contentsCase_ == 3 ? (AdvancedResourceLocationIcon)this.contents_ : AdvancedResourceLocationIcon.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<AdvancedResourceLocationIcon, AdvancedResourceLocationIcon.Builder, AdvancedResourceLocationIconOrBuilder> getAdvancedResourceLocationFieldBuilder() {
         if (this.advancedResourceLocationBuilder_ == null) {
            if (this.contentsCase_ != 3) {
               this.contents_ = AdvancedResourceLocationIcon.getDefaultInstance();
            }

            this.advancedResourceLocationBuilder_ = new SingleFieldBuilderV3<>(
               (AdvancedResourceLocationIcon)this.contents_, this.getParentForChildren(), this.isClean()
            );
            this.contents_ = null;
         }

         this.contentsCase_ = 3;
         this.onChanged();
         return this.advancedResourceLocationBuilder_;
      }

      @Override
      public boolean hasResourceLocation() {
         return this.contentsCase_ == 4;
      }

      @Override
      public ResourceLocationIcon getResourceLocation() {
         if (this.resourceLocationBuilder_ == null) {
            return this.contentsCase_ == 4 ? (ResourceLocationIcon)this.contents_ : ResourceLocationIcon.getDefaultInstance();
         } else {
            return this.contentsCase_ == 4 ? this.resourceLocationBuilder_.getMessage() : ResourceLocationIcon.getDefaultInstance();
         }
      }

      public Icon.Builder setResourceLocation(ResourceLocationIcon var1) {
         if (this.resourceLocationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.contents_ = var1;
            this.onChanged();
         } else {
            this.resourceLocationBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 4;
         return this;
      }

      public Icon.Builder setResourceLocation(ResourceLocationIcon.Builder var1) {
         if (this.resourceLocationBuilder_ == null) {
            this.contents_ = var1.build();
            this.onChanged();
         } else {
            this.resourceLocationBuilder_.setMessage(var1.build());
         }

         this.contentsCase_ = 4;
         return this;
      }

      public Icon.Builder mergeResourceLocation(ResourceLocationIcon var1) {
         if (this.resourceLocationBuilder_ == null) {
            if (this.contentsCase_ == 4 && this.contents_ != ResourceLocationIcon.getDefaultInstance()) {
               this.contents_ = ResourceLocationIcon.newBuilder((ResourceLocationIcon)this.contents_).mergeFrom(var1).buildPartial();
            } else {
               this.contents_ = var1;
            }

            this.onChanged();
         } else if (this.contentsCase_ == 4) {
            this.resourceLocationBuilder_.mergeFrom(var1);
         } else {
            this.resourceLocationBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 4;
         return this;
      }

      public Icon.Builder clearResourceLocation() {
         if (this.resourceLocationBuilder_ == null) {
            if (this.contentsCase_ == 4) {
               this.contentsCase_ = 0;
               this.contents_ = null;
               this.onChanged();
            }
         } else {
            if (this.contentsCase_ == 4) {
               this.contentsCase_ = 0;
               this.contents_ = null;
            }

            this.resourceLocationBuilder_.clear();
         }

         return this;
      }

      public ResourceLocationIcon.Builder getResourceLocationBuilder() {
         return this.getResourceLocationFieldBuilder().getBuilder();
      }

      @Override
      public ResourceLocationIconOrBuilder getResourceLocationOrBuilder() {
         if (this.contentsCase_ == 4 && this.resourceLocationBuilder_ != null) {
            return this.resourceLocationBuilder_.getMessageOrBuilder();
         } else {
            return this.contentsCase_ == 4 ? (ResourceLocationIcon)this.contents_ : ResourceLocationIcon.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<ResourceLocationIcon, ResourceLocationIcon.Builder, ResourceLocationIconOrBuilder> getResourceLocationFieldBuilder() {
         if (this.resourceLocationBuilder_ == null) {
            if (this.contentsCase_ != 4) {
               this.contents_ = ResourceLocationIcon.getDefaultInstance();
            }

            this.resourceLocationBuilder_ = new SingleFieldBuilderV3<>((ResourceLocationIcon)this.contents_, this.getParentForChildren(), this.isClean());
            this.contents_ = null;
         }

         this.contentsCase_ = 4;
         this.onChanged();
         return this.resourceLocationBuilder_;
      }

      public final Icon.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Icon.Builder)super.setUnknownFields(var1);
      }

      public final Icon.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Icon.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum ContentsCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      ITEM_STACK(1),
      SIMPLE_RESOURCE_LOCATION(2),
      ADVANCED_RESOURCE_LOCATION(3),
      RESOURCE_LOCATION(4),
      CONTENTS_NOT_SET(0);

      private final int value;

      ContentsCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static Icon.ContentsCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static Icon.ContentsCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return CONTENTS_NOT_SET;
            case 1:
               return ITEM_STACK;
            case 2:
               return SIMPLE_RESOURCE_LOCATION;
            case 3:
               return ADVANCED_RESOURCE_LOCATION;
            case 4:
               return RESOURCE_LOCATION;
            default:
               return null;
         }
      }

      @Override
      public int getNumber() {
         return this.value;
      }
   }
}
