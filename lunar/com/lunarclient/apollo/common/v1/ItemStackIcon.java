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

public final class ItemStackIcon extends GeneratedMessageV3 implements ItemStackIconOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int itemCase_ = 0;
   private Object item_;
   public static final int ITEM_ID_FIELD_NUMBER = 1;
   public static final int ITEM_NAME_FIELD_NUMBER = 2;
   public static final int CUSTOM_MODEL_DATA_FIELD_NUMBER = 3;
   private int customModelData_ = 0;
   public static final int PROFILE_FIELD_NUMBER = 4;
   private Profile profile_;
   public static final int CUSTOM_MODEL_DATA_OBJECT_FIELD_NUMBER = 5;
   private CustomModelData customModelDataObject_;
   public static final int POTION_FIELD_NUMBER = 6;
   private volatile Object potion_ = "";
   private byte memoizedIsInitialized = -1;
   private static final ItemStackIcon DEFAULT_INSTANCE = new ItemStackIcon();
   private static final Parser<ItemStackIcon> PARSER = new AbstractParser<ItemStackIcon>() {
      public ItemStackIcon parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ItemStackIcon.Builder var3 = ItemStackIcon.newBuilder();

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

   private ItemStackIcon(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ItemStackIcon() {
      this.potion_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ItemStackIcon();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return IconProto.internal_static_lunarclient_apollo_common_v1_ItemStackIcon_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return IconProto.internal_static_lunarclient_apollo_common_v1_ItemStackIcon_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ItemStackIcon.class, ItemStackIcon.Builder.class);
   }

   @Override
   public ItemStackIcon.ItemCase getItemCase() {
      return ItemStackIcon.ItemCase.forNumber(this.itemCase_);
   }

   @Override
   public boolean hasItemId() {
      return this.itemCase_ == 1;
   }

   @Override
   public int getItemId() {
      return this.itemCase_ == 1 ? (Integer)this.item_ : 0;
   }

   @Override
   public boolean hasItemName() {
      return this.itemCase_ == 2;
   }

   @Override
   public String getItemName() {
      Object var1 = "";
      if (this.itemCase_ == 2) {
         var1 = this.item_;
      }

      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      if (this.itemCase_ == 2) {
         this.item_ = var3;
      }

      return var3;
   }

   @Override
   public ByteString getItemNameBytes() {
      Object var1 = "";
      if (this.itemCase_ == 2) {
         var1 = this.item_;
      }

      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         if (this.itemCase_ == 2) {
            this.item_ = var2;
         }

         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Deprecated
   @Override
   public int getCustomModelData() {
      return this.customModelData_;
   }

   @Override
   public boolean hasProfile() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Profile getProfile() {
      return this.profile_ == null ? Profile.getDefaultInstance() : this.profile_;
   }

   @Override
   public ProfileOrBuilder getProfileOrBuilder() {
      return this.profile_ == null ? Profile.getDefaultInstance() : this.profile_;
   }

   @Override
   public boolean hasCustomModelDataObject() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public CustomModelData getCustomModelDataObject() {
      return this.customModelDataObject_ == null ? CustomModelData.getDefaultInstance() : this.customModelDataObject_;
   }

   @Override
   public CustomModelDataOrBuilder getCustomModelDataObjectOrBuilder() {
      return this.customModelDataObject_ == null ? CustomModelData.getDefaultInstance() : this.customModelDataObject_;
   }

   @Override
   public String getPotion() {
      Object var1 = this.potion_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.potion_ = var3;
      return var3;
   }

   @Override
   public ByteString getPotionBytes() {
      Object var1 = this.potion_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.potion_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
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
      if (this.itemCase_ == 1) {
         var1.writeInt32(1, (Integer)this.item_);
      }

      if (this.itemCase_ == 2) {
         GeneratedMessageV3.writeString(var1, 2, this.item_);
      }

      if (this.customModelData_ != 0) {
         var1.writeInt32(3, this.customModelData_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(4, this.getProfile());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(5, this.getCustomModelDataObject());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.potion_)) {
         GeneratedMessageV3.writeString(var1, 6, this.potion_);
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
      if (this.itemCase_ == 1) {
         var1 += CodedOutputStream.computeInt32Size(1, (Integer)this.item_);
      }

      if (this.itemCase_ == 2) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.item_);
      }

      if (this.customModelData_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(3, this.customModelData_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getProfile());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(5, this.getCustomModelDataObject());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.potion_)) {
         var1 += GeneratedMessageV3.computeStringSize(6, this.potion_);
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

      if (!(var1 instanceof ItemStackIcon)) {
         return super.equals(var1);
      }

      ItemStackIcon var2 = (ItemStackIcon)var1;
      if (this.getCustomModelData() != var2.getCustomModelData()) {
         return false;
      }

      if (this.hasProfile() != var2.hasProfile()) {
         return false;
      }

      if (this.hasProfile() && !this.getProfile().equals(var2.getProfile())) {
         return false;
      }

      if (this.hasCustomModelDataObject() != var2.hasCustomModelDataObject()) {
         return false;
      }

      if (this.hasCustomModelDataObject() && !this.getCustomModelDataObject().equals(var2.getCustomModelDataObject())) {
         return false;
      }

      if (!this.getPotion().equals(var2.getPotion())) {
         return false;
      }

      if (!this.getItemCase().equals(var2.getItemCase())) {
         return false;
      }

      switch (this.itemCase_) {
         case 0:
         default:
            break;
         case 1:
            if (this.getItemId() != var2.getItemId()) {
               return false;
            }
            break;
         case 2:
            if (!this.getItemName().equals(var2.getItemName())) {
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
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getCustomModelData();
      if (this.hasProfile()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getProfile().hashCode();
      }

      if (this.hasCustomModelDataObject()) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getCustomModelDataObject().hashCode();
      }

      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.getPotion().hashCode();
      switch (this.itemCase_) {
         case 0:
         default:
            break;
         case 1:
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getItemId();
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getItemName().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ItemStackIcon parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ItemStackIcon parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ItemStackIcon parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ItemStackIcon parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ItemStackIcon parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ItemStackIcon parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ItemStackIcon parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ItemStackIcon parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ItemStackIcon parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ItemStackIcon parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ItemStackIcon parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ItemStackIcon parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ItemStackIcon.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ItemStackIcon.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ItemStackIcon.Builder newBuilder(ItemStackIcon var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ItemStackIcon.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ItemStackIcon.Builder() : new ItemStackIcon.Builder().mergeFrom(this);
   }

   protected ItemStackIcon.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ItemStackIcon.Builder(var1);
   }

   public static ItemStackIcon getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ItemStackIcon> parser() {
      return PARSER;
   }

   @Override
   public Parser<ItemStackIcon> getParserForType() {
      return PARSER;
   }

   public ItemStackIcon getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ItemStackIcon.Builder> implements ItemStackIconOrBuilder {
      private int itemCase_ = 0;
      private Object item_;
      private int bitField0_;
      private int customModelData_;
      private Profile profile_;
      private SingleFieldBuilderV3<Profile, Profile.Builder, ProfileOrBuilder> profileBuilder_;
      private CustomModelData customModelDataObject_;
      private SingleFieldBuilderV3<CustomModelData, CustomModelData.Builder, CustomModelDataOrBuilder> customModelDataObjectBuilder_;
      private Object potion_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return IconProto.internal_static_lunarclient_apollo_common_v1_ItemStackIcon_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return IconProto.internal_static_lunarclient_apollo_common_v1_ItemStackIcon_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ItemStackIcon.class, ItemStackIcon.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ItemStackIcon.alwaysUseFieldBuilders) {
            this.getProfileFieldBuilder();
            this.getCustomModelDataObjectFieldBuilder();
         }
      }

      public ItemStackIcon.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.customModelData_ = 0;
         this.profile_ = null;
         if (this.profileBuilder_ != null) {
            this.profileBuilder_.dispose();
            this.profileBuilder_ = null;
         }

         this.customModelDataObject_ = null;
         if (this.customModelDataObjectBuilder_ != null) {
            this.customModelDataObjectBuilder_.dispose();
            this.customModelDataObjectBuilder_ = null;
         }

         this.potion_ = "";
         this.itemCase_ = 0;
         this.item_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return IconProto.internal_static_lunarclient_apollo_common_v1_ItemStackIcon_descriptor;
      }

      public ItemStackIcon getDefaultInstanceForType() {
         return ItemStackIcon.getDefaultInstance();
      }

      public ItemStackIcon build() {
         ItemStackIcon var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ItemStackIcon buildPartial() {
         ItemStackIcon var1 = new ItemStackIcon(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ItemStackIcon var1) {
         int var2 = this.bitField0_;
         if ((var2 & 4) != 0) {
            var1.customModelData_ = this.customModelData_;
         }

         byte var3 = 0;
         if ((var2 & 8) != 0) {
            var1.profile_ = this.profileBuilder_ == null ? this.profile_ : this.profileBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 16) != 0) {
            var1.customModelDataObject_ = this.customModelDataObjectBuilder_ == null ? this.customModelDataObject_ : this.customModelDataObjectBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 32) != 0) {
            var1.potion_ = this.potion_;
         }

         ItemStackIcon var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      private void buildPartialOneofs(ItemStackIcon var1) {
         var1.itemCase_ = this.itemCase_;
         var1.item_ = this.item_;
      }

      public ItemStackIcon.Builder clone() {
         return (ItemStackIcon.Builder)super.clone();
      }

      public ItemStackIcon.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ItemStackIcon.Builder)super.setField(var1, var2);
      }

      public ItemStackIcon.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ItemStackIcon.Builder)super.clearField(var1);
      }

      public ItemStackIcon.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ItemStackIcon.Builder)super.clearOneof(var1);
      }

      public ItemStackIcon.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ItemStackIcon.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ItemStackIcon.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ItemStackIcon.Builder)super.addRepeatedField(var1, var2);
      }

      public ItemStackIcon.Builder mergeFrom(Message var1) {
         if (var1 instanceof ItemStackIcon) {
            return this.mergeFrom((ItemStackIcon)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ItemStackIcon.Builder mergeFrom(ItemStackIcon var1) {
         if (var1 == ItemStackIcon.getDefaultInstance()) {
            return this;
         }

         if (var1.getCustomModelData() != 0) {
            this.setCustomModelData(var1.getCustomModelData());
         }

         if (var1.hasProfile()) {
            this.mergeProfile(var1.getProfile());
         }

         if (var1.hasCustomModelDataObject()) {
            this.mergeCustomModelDataObject(var1.getCustomModelDataObject());
         }

         if (!var1.getPotion().isEmpty()) {
            this.potion_ = var1.potion_;
            this.bitField0_ |= 32;
            this.onChanged();
         }

         switch (var1.getItemCase()) {
            case ITEM_ID:
               this.setItemId(var1.getItemId());
               break;
            case ITEM_NAME:
               this.itemCase_ = 2;
               this.item_ = var1.item_;
               this.onChanged();
            case ITEM_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ItemStackIcon.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.item_ = var1.readInt32();
                     this.itemCase_ = 1;
                     break;
                  case 18:
                     String var5 = var1.readStringRequireUtf8();
                     this.itemCase_ = 2;
                     this.item_ = var5;
                     break;
                  case 24:
                     this.customModelData_ = var1.readInt32();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     var1.readMessage(this.getProfileFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     var1.readMessage(this.getCustomModelDataObjectFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     this.potion_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 32;
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

      @Override
      public ItemStackIcon.ItemCase getItemCase() {
         return ItemStackIcon.ItemCase.forNumber(this.itemCase_);
      }

      public ItemStackIcon.Builder clearItem() {
         this.itemCase_ = 0;
         this.item_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasItemId() {
         return this.itemCase_ == 1;
      }

      @Override
      public int getItemId() {
         return this.itemCase_ == 1 ? (Integer)this.item_ : 0;
      }

      public ItemStackIcon.Builder setItemId(int var1) {
         this.itemCase_ = 1;
         this.item_ = var1;
         this.onChanged();
         return this;
      }

      public ItemStackIcon.Builder clearItemId() {
         if (this.itemCase_ == 1) {
            this.itemCase_ = 0;
            this.item_ = null;
            this.onChanged();
         }

         return this;
      }

      @Override
      public boolean hasItemName() {
         return this.itemCase_ == 2;
      }

      @Override
      public String getItemName() {
         Object var1 = "";
         if (this.itemCase_ == 2) {
            var1 = this.item_;
         }

         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            if (this.itemCase_ == 2) {
               this.item_ = var3;
            }

            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getItemNameBytes() {
         Object var1 = "";
         if (this.itemCase_ == 2) {
            var1 = this.item_;
         }

         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            if (this.itemCase_ == 2) {
               this.item_ = var2;
            }

            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ItemStackIcon.Builder setItemName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.itemCase_ = 2;
         this.item_ = var1;
         this.onChanged();
         return this;
      }

      public ItemStackIcon.Builder clearItemName() {
         if (this.itemCase_ == 2) {
            this.itemCase_ = 0;
            this.item_ = null;
            this.onChanged();
         }

         return this;
      }

      public ItemStackIcon.Builder setItemNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ItemStackIcon.checkByteStringIsUtf8(var1);
         this.itemCase_ = 2;
         this.item_ = var1;
         this.onChanged();
         return this;
      }

      @Deprecated
      @Override
      public int getCustomModelData() {
         return this.customModelData_;
      }

      @Deprecated
      public ItemStackIcon.Builder setCustomModelData(int var1) {
         this.customModelData_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Deprecated
      public ItemStackIcon.Builder clearCustomModelData() {
         this.bitField0_ &= -5;
         this.customModelData_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasProfile() {
         return (this.bitField0_ & 8) != 0;
      }

      @Override
      public Profile getProfile() {
         if (this.profileBuilder_ == null) {
            return this.profile_ == null ? Profile.getDefaultInstance() : this.profile_;
         } else {
            return this.profileBuilder_.getMessage();
         }
      }

      public ItemStackIcon.Builder setProfile(Profile var1) {
         if (this.profileBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.profile_ = var1;
         } else {
            this.profileBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public ItemStackIcon.Builder setProfile(Profile.Builder var1) {
         if (this.profileBuilder_ == null) {
            this.profile_ = var1.build();
         } else {
            this.profileBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public ItemStackIcon.Builder mergeProfile(Profile var1) {
         if (this.profileBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0 && this.profile_ != null && this.profile_ != Profile.getDefaultInstance()) {
               this.getProfileBuilder().mergeFrom(var1);
            } else {
               this.profile_ = var1;
            }
         } else {
            this.profileBuilder_.mergeFrom(var1);
         }

         if (this.profile_ != null) {
            this.bitField0_ |= 8;
            this.onChanged();
         }

         return this;
      }

      public ItemStackIcon.Builder clearProfile() {
         this.bitField0_ &= -9;
         this.profile_ = null;
         if (this.profileBuilder_ != null) {
            this.profileBuilder_.dispose();
            this.profileBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Profile.Builder getProfileBuilder() {
         this.bitField0_ |= 8;
         this.onChanged();
         return this.getProfileFieldBuilder().getBuilder();
      }

      @Override
      public ProfileOrBuilder getProfileOrBuilder() {
         if (this.profileBuilder_ != null) {
            return this.profileBuilder_.getMessageOrBuilder();
         } else {
            return this.profile_ == null ? Profile.getDefaultInstance() : this.profile_;
         }
      }

      private SingleFieldBuilderV3<Profile, Profile.Builder, ProfileOrBuilder> getProfileFieldBuilder() {
         if (this.profileBuilder_ == null) {
            this.profileBuilder_ = new SingleFieldBuilderV3<>(this.getProfile(), this.getParentForChildren(), this.isClean());
            this.profile_ = null;
         }

         return this.profileBuilder_;
      }

      @Override
      public boolean hasCustomModelDataObject() {
         return (this.bitField0_ & 16) != 0;
      }

      @Override
      public CustomModelData getCustomModelDataObject() {
         if (this.customModelDataObjectBuilder_ == null) {
            return this.customModelDataObject_ == null ? CustomModelData.getDefaultInstance() : this.customModelDataObject_;
         } else {
            return this.customModelDataObjectBuilder_.getMessage();
         }
      }

      public ItemStackIcon.Builder setCustomModelDataObject(CustomModelData var1) {
         if (this.customModelDataObjectBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.customModelDataObject_ = var1;
         } else {
            this.customModelDataObjectBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public ItemStackIcon.Builder setCustomModelDataObject(CustomModelData.Builder var1) {
         if (this.customModelDataObjectBuilder_ == null) {
            this.customModelDataObject_ = var1.build();
         } else {
            this.customModelDataObjectBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public ItemStackIcon.Builder mergeCustomModelDataObject(CustomModelData var1) {
         if (this.customModelDataObjectBuilder_ == null) {
            if ((this.bitField0_ & 16) != 0 && this.customModelDataObject_ != null && this.customModelDataObject_ != CustomModelData.getDefaultInstance()) {
               this.getCustomModelDataObjectBuilder().mergeFrom(var1);
            } else {
               this.customModelDataObject_ = var1;
            }
         } else {
            this.customModelDataObjectBuilder_.mergeFrom(var1);
         }

         if (this.customModelDataObject_ != null) {
            this.bitField0_ |= 16;
            this.onChanged();
         }

         return this;
      }

      public ItemStackIcon.Builder clearCustomModelDataObject() {
         this.bitField0_ &= -17;
         this.customModelDataObject_ = null;
         if (this.customModelDataObjectBuilder_ != null) {
            this.customModelDataObjectBuilder_.dispose();
            this.customModelDataObjectBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public CustomModelData.Builder getCustomModelDataObjectBuilder() {
         this.bitField0_ |= 16;
         this.onChanged();
         return this.getCustomModelDataObjectFieldBuilder().getBuilder();
      }

      @Override
      public CustomModelDataOrBuilder getCustomModelDataObjectOrBuilder() {
         if (this.customModelDataObjectBuilder_ != null) {
            return this.customModelDataObjectBuilder_.getMessageOrBuilder();
         } else {
            return this.customModelDataObject_ == null ? CustomModelData.getDefaultInstance() : this.customModelDataObject_;
         }
      }

      private SingleFieldBuilderV3<CustomModelData, CustomModelData.Builder, CustomModelDataOrBuilder> getCustomModelDataObjectFieldBuilder() {
         if (this.customModelDataObjectBuilder_ == null) {
            this.customModelDataObjectBuilder_ = new SingleFieldBuilderV3<>(this.getCustomModelDataObject(), this.getParentForChildren(), this.isClean());
            this.customModelDataObject_ = null;
         }

         return this.customModelDataObjectBuilder_;
      }

      @Override
      public String getPotion() {
         Object var1 = this.potion_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.potion_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getPotionBytes() {
         Object var1 = this.potion_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.potion_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ItemStackIcon.Builder setPotion(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.potion_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public ItemStackIcon.Builder clearPotion() {
         this.potion_ = ItemStackIcon.getDefaultInstance().getPotion();
         this.bitField0_ &= -33;
         this.onChanged();
         return this;
      }

      public ItemStackIcon.Builder setPotionBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ItemStackIcon.checkByteStringIsUtf8(var1);
         this.potion_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public final ItemStackIcon.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ItemStackIcon.Builder)super.setUnknownFields(var1);
      }

      public final ItemStackIcon.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ItemStackIcon.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum ItemCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      ITEM_ID(1),
      ITEM_NAME(2),
      ITEM_NOT_SET(0);

      private final int value;

      ItemCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static ItemStackIcon.ItemCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static ItemStackIcon.ItemCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return ITEM_NOT_SET;
            case 1:
               return ITEM_ID;
            case 2:
               return ITEM_NAME;
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
