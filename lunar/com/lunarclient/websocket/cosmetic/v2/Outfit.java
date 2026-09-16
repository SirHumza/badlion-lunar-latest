package com.lunarclient.websocket.cosmetic.v2;

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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Outfit extends GeneratedMessageV3 implements OutfitOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ID_FIELD_NUMBER = 1;
   private Uuid id_;
   public static final int NAME_FIELD_NUMBER = 2;
   private volatile Object name_ = "";
   public static final int COSMETICS_FIELD_NUMBER = 3;
   private List<EquippedCosmetic> cosmetics_;
   public static final int FAVORITE_FIELD_NUMBER = 4;
   private boolean favorite_ = false;
   public static final int CREATED_AT_FIELD_NUMBER = 5;
   private Timestamp createdAt_;
   public static final int UPDATED_AT_FIELD_NUMBER = 6;
   private Timestamp updatedAt_;
   public static final int SKIN_HASH_FIELD_NUMBER = 7;
   private volatile Object skinHash_ = "";
   public static final int BADGE_ID_FIELD_NUMBER = 8;
   private int badgeId_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final Outfit DEFAULT_INSTANCE = new Outfit();
   private static final Parser<Outfit> PARSER = new AbstractParser<Outfit>() {
      public Outfit parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Outfit.Builder var3 = Outfit.newBuilder();

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

   private Outfit(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Outfit() {
      this.name_ = "";
      this.cosmetics_ = Collections.emptyList();
      this.skinHash_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Outfit();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_Outfit_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_Outfit_fieldAccessorTable
         .ensureFieldAccessorsInitialized(Outfit.class, Outfit.Builder.class);
   }

   @Override
   public boolean hasId() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getId() {
      return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
   }

   @Override
   public UuidOrBuilder getIdOrBuilder() {
      return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
   }

   @Override
   public String getName() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.name_ = var3;
      return var3;
   }

   @Override
   public ByteString getNameBytes() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.name_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public List<EquippedCosmetic> getCosmeticsList() {
      return this.cosmetics_;
   }

   @Override
   public List<? extends EquippedCosmeticOrBuilder> getCosmeticsOrBuilderList() {
      return this.cosmetics_;
   }

   @Override
   public int getCosmeticsCount() {
      return this.cosmetics_.size();
   }

   @Override
   public EquippedCosmetic getCosmetics(int var1) {
      return this.cosmetics_.get(var1);
   }

   @Override
   public EquippedCosmeticOrBuilder getCosmeticsOrBuilder(int var1) {
      return this.cosmetics_.get(var1);
   }

   @Override
   public boolean getFavorite() {
      return this.favorite_;
   }

   @Override
   public boolean hasCreatedAt() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Timestamp getCreatedAt() {
      return this.createdAt_ == null ? Timestamp.getDefaultInstance() : this.createdAt_;
   }

   @Override
   public TimestampOrBuilder getCreatedAtOrBuilder() {
      return this.createdAt_ == null ? Timestamp.getDefaultInstance() : this.createdAt_;
   }

   @Override
   public boolean hasUpdatedAt() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public Timestamp getUpdatedAt() {
      return this.updatedAt_ == null ? Timestamp.getDefaultInstance() : this.updatedAt_;
   }

   @Override
   public TimestampOrBuilder getUpdatedAtOrBuilder() {
      return this.updatedAt_ == null ? Timestamp.getDefaultInstance() : this.updatedAt_;
   }

   @Override
   public boolean hasSkinHash() {
      return (this.bitField0_ & 8) != 0;
   }

   @Override
   public String getSkinHash() {
      Object var1 = this.skinHash_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.skinHash_ = var3;
      return var3;
   }

   @Override
   public ByteString getSkinHashBytes() {
      Object var1 = this.skinHash_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.skinHash_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasBadgeId() {
      return (this.bitField0_ & 16) != 0;
   }

   @Override
   public int getBadgeId() {
      return this.badgeId_;
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
         var1.writeMessage(1, this.getId());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         GeneratedMessageV3.writeString(var1, 2, this.name_);
      }

      for (int var2 = 0; var2 < this.cosmetics_.size(); var2++) {
         var1.writeMessage(3, this.cosmetics_.get(var2));
      }

      if (this.favorite_) {
         var1.writeBool(4, this.favorite_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(5, this.getCreatedAt());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(6, this.getUpdatedAt());
      }

      if ((this.bitField0_ & 8) != 0) {
         GeneratedMessageV3.writeString(var1, 7, this.skinHash_);
      }

      if ((this.bitField0_ & 16) != 0) {
         var1.writeInt32(8, this.badgeId_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getId());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.name_);
      }

      for (int var2 = 0; var2 < this.cosmetics_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(3, this.cosmetics_.get(var2));
      }

      if (this.favorite_) {
         var1 += CodedOutputStream.computeBoolSize(4, this.favorite_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(5, this.getCreatedAt());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(6, this.getUpdatedAt());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1 += GeneratedMessageV3.computeStringSize(7, this.skinHash_);
      }

      if ((this.bitField0_ & 16) != 0) {
         var1 += CodedOutputStream.computeInt32Size(8, this.badgeId_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Outfit)) {
         return super.equals(var1);
      } else {
         Outfit var2 = (Outfit)var1;
         if (this.hasId() != var2.hasId()) {
            return false;
         } else if (this.hasId() && !this.getId().equals(var2.getId())) {
            return false;
         } else if (!this.getName().equals(var2.getName())) {
            return false;
         } else if (!this.getCosmeticsList().equals(var2.getCosmeticsList())) {
            return false;
         } else if (this.getFavorite() != var2.getFavorite()) {
            return false;
         } else if (this.hasCreatedAt() != var2.hasCreatedAt()) {
            return false;
         } else if (this.hasCreatedAt() && !this.getCreatedAt().equals(var2.getCreatedAt())) {
            return false;
         } else if (this.hasUpdatedAt() != var2.hasUpdatedAt()) {
            return false;
         } else if (this.hasUpdatedAt() && !this.getUpdatedAt().equals(var2.getUpdatedAt())) {
            return false;
         } else if (this.hasSkinHash() != var2.hasSkinHash()) {
            return false;
         } else if (this.hasSkinHash() && !this.getSkinHash().equals(var2.getSkinHash())) {
            return false;
         } else if (this.hasBadgeId() != var2.hasBadgeId()) {
            return false;
         } else {
            return this.hasBadgeId() && this.getBadgeId() != var2.getBadgeId() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasId()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getId().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getName().hashCode();
      if (this.getCosmeticsCount() > 0) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getCosmeticsList().hashCode();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashBoolean(this.getFavorite());
      if (this.hasCreatedAt()) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getCreatedAt().hashCode();
      }

      if (this.hasUpdatedAt()) {
         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + this.getUpdatedAt().hashCode();
      }

      if (this.hasSkinHash()) {
         var1 = 37 * var1 + 7;
         var1 = 53 * var1 + this.getSkinHash().hashCode();
      }

      if (this.hasBadgeId()) {
         var1 = 37 * var1 + 8;
         var1 = 53 * var1 + this.getBadgeId();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Outfit parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Outfit parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Outfit parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Outfit parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Outfit parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Outfit parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Outfit parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Outfit parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Outfit parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Outfit parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Outfit parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Outfit parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Outfit.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Outfit.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Outfit.Builder newBuilder(Outfit var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Outfit.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Outfit.Builder() : new Outfit.Builder().mergeFrom(this);
   }

   protected Outfit.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Outfit.Builder(var1);
   }

   public static Outfit getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Outfit> parser() {
      return PARSER;
   }

   @Override
   public Parser<Outfit> getParserForType() {
      return PARSER;
   }

   public Outfit getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Outfit.Builder> implements OutfitOrBuilder {
      private int bitField0_;
      private Uuid id_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> idBuilder_;
      private Object name_ = "";
      private List<EquippedCosmetic> cosmetics_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<EquippedCosmetic, EquippedCosmetic.Builder, EquippedCosmeticOrBuilder> cosmeticsBuilder_;
      private boolean favorite_;
      private Timestamp createdAt_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> createdAtBuilder_;
      private Timestamp updatedAt_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> updatedAtBuilder_;
      private Object skinHash_ = "";
      private int badgeId_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_Outfit_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_Outfit_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Outfit.class, Outfit.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (Outfit.alwaysUseFieldBuilders) {
            this.getIdFieldBuilder();
            this.getCosmeticsFieldBuilder();
            this.getCreatedAtFieldBuilder();
            this.getUpdatedAtFieldBuilder();
         }
      }

      public Outfit.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = null;
         if (this.idBuilder_ != null) {
            this.idBuilder_.dispose();
            this.idBuilder_ = null;
         }

         this.name_ = "";
         if (this.cosmeticsBuilder_ == null) {
            this.cosmetics_ = Collections.emptyList();
         } else {
            this.cosmetics_ = null;
            this.cosmeticsBuilder_.clear();
         }

         this.bitField0_ &= -5;
         this.favorite_ = false;
         this.createdAt_ = null;
         if (this.createdAtBuilder_ != null) {
            this.createdAtBuilder_.dispose();
            this.createdAtBuilder_ = null;
         }

         this.updatedAt_ = null;
         if (this.updatedAtBuilder_ != null) {
            this.updatedAtBuilder_.dispose();
            this.updatedAtBuilder_ = null;
         }

         this.skinHash_ = "";
         this.badgeId_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_Outfit_descriptor;
      }

      public Outfit getDefaultInstanceForType() {
         return Outfit.getDefaultInstance();
      }

      public Outfit build() {
         Outfit var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Outfit buildPartial() {
         Outfit var1 = new Outfit(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(Outfit var1) {
         if (this.cosmeticsBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0) {
               this.cosmetics_ = Collections.unmodifiableList(this.cosmetics_);
               this.bitField0_ &= -5;
            }

            var1.cosmetics_ = this.cosmetics_;
         } else {
            var1.cosmetics_ = this.cosmeticsBuilder_.build();
         }
      }

      private void buildPartial0(Outfit var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.id_ = this.idBuilder_ == null ? this.id_ : this.idBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.name_ = this.name_;
         }

         if ((var2 & 8) != 0) {
            var1.favorite_ = this.favorite_;
         }

         if ((var2 & 16) != 0) {
            var1.createdAt_ = this.createdAtBuilder_ == null ? this.createdAt_ : this.createdAtBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 32) != 0) {
            var1.updatedAt_ = this.updatedAtBuilder_ == null ? this.updatedAt_ : this.updatedAtBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 64) != 0) {
            var1.skinHash_ = this.skinHash_;
            var3 |= 8;
         }

         if ((var2 & 128) != 0) {
            var1.badgeId_ = this.badgeId_;
            var3 |= 16;
         }

         Outfit var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public Outfit.Builder clone() {
         return (Outfit.Builder)super.clone();
      }

      public Outfit.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Outfit.Builder)super.setField(var1, var2);
      }

      public Outfit.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Outfit.Builder)super.clearField(var1);
      }

      public Outfit.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Outfit.Builder)super.clearOneof(var1);
      }

      public Outfit.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Outfit.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Outfit.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Outfit.Builder)super.addRepeatedField(var1, var2);
      }

      public Outfit.Builder mergeFrom(Message var1) {
         if (var1 instanceof Outfit) {
            return this.mergeFrom((Outfit)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Outfit.Builder mergeFrom(Outfit var1) {
         if (var1 == Outfit.getDefaultInstance()) {
            return this;
         }

         if (var1.hasId()) {
            this.mergeId(var1.getId());
         }

         if (!var1.getName().isEmpty()) {
            this.name_ = var1.name_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (this.cosmeticsBuilder_ == null) {
            if (!var1.cosmetics_.isEmpty()) {
               if (this.cosmetics_.isEmpty()) {
                  this.cosmetics_ = var1.cosmetics_;
                  this.bitField0_ &= -5;
               } else {
                  this.ensureCosmeticsIsMutable();
                  this.cosmetics_.addAll(var1.cosmetics_);
               }

               this.onChanged();
            }
         } else if (!var1.cosmetics_.isEmpty()) {
            if (this.cosmeticsBuilder_.isEmpty()) {
               this.cosmeticsBuilder_.dispose();
               this.cosmeticsBuilder_ = null;
               this.cosmetics_ = var1.cosmetics_;
               this.bitField0_ &= -5;
               this.cosmeticsBuilder_ = Outfit.alwaysUseFieldBuilders ? this.getCosmeticsFieldBuilder() : null;
            } else {
               this.cosmeticsBuilder_.addAllMessages(var1.cosmetics_);
            }
         }

         if (var1.getFavorite()) {
            this.setFavorite(var1.getFavorite());
         }

         if (var1.hasCreatedAt()) {
            this.mergeCreatedAt(var1.getCreatedAt());
         }

         if (var1.hasUpdatedAt()) {
            this.mergeUpdatedAt(var1.getUpdatedAt());
         }

         if (var1.hasSkinHash()) {
            this.skinHash_ = var1.skinHash_;
            this.bitField0_ |= 64;
            this.onChanged();
         }

         if (var1.hasBadgeId()) {
            this.setBadgeId(var1.getBadgeId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public Outfit.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getIdFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.name_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     EquippedCosmetic var5 = var1.readMessage(EquippedCosmetic.parser(), var2);
                     if (this.cosmeticsBuilder_ == null) {
                        this.ensureCosmeticsIsMutable();
                        this.cosmetics_.add(var5);
                     } else {
                        this.cosmeticsBuilder_.addMessage(var5);
                     }
                     break;
                  case 32:
                     this.favorite_ = var1.readBool();
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     var1.readMessage(this.getCreatedAtFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     var1.readMessage(this.getUpdatedAtFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 32;
                     break;
                  case 58:
                     this.skinHash_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 64;
                     break;
                  case 64:
                     this.badgeId_ = var1.readInt32();
                     this.bitField0_ |= 128;
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
      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getId() {
         if (this.idBuilder_ == null) {
            return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
         } else {
            return this.idBuilder_.getMessage();
         }
      }

      public Outfit.Builder setId(Uuid var1) {
         if (this.idBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.id_ = var1;
         } else {
            this.idBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Outfit.Builder setId(Uuid.Builder var1) {
         if (this.idBuilder_ == null) {
            this.id_ = var1.build();
         } else {
            this.idBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Outfit.Builder mergeId(Uuid var1) {
         if (this.idBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.id_ != null && this.id_ != Uuid.getDefaultInstance()) {
               this.getIdBuilder().mergeFrom(var1);
            } else {
               this.id_ = var1;
            }
         } else {
            this.idBuilder_.mergeFrom(var1);
         }

         if (this.id_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public Outfit.Builder clearId() {
         this.bitField0_ &= -2;
         this.id_ = null;
         if (this.idBuilder_ != null) {
            this.idBuilder_.dispose();
            this.idBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getIdBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getIdFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getIdOrBuilder() {
         if (this.idBuilder_ != null) {
            return this.idBuilder_.getMessageOrBuilder();
         } else {
            return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getIdFieldBuilder() {
         if (this.idBuilder_ == null) {
            this.idBuilder_ = new SingleFieldBuilderV3<>(this.getId(), this.getParentForChildren(), this.isClean());
            this.id_ = null;
         }

         return this.idBuilder_;
      }

      @Override
      public String getName() {
         Object var1 = this.name_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.name_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getNameBytes() {
         Object var1 = this.name_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.name_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Outfit.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Outfit.Builder clearName() {
         this.name_ = Outfit.getDefaultInstance().getName();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public Outfit.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Outfit.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      private void ensureCosmeticsIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.cosmetics_ = new ArrayList<>(this.cosmetics_);
            this.bitField0_ |= 4;
         }
      }

      @Override
      public List<EquippedCosmetic> getCosmeticsList() {
         return this.cosmeticsBuilder_ == null ? Collections.unmodifiableList(this.cosmetics_) : this.cosmeticsBuilder_.getMessageList();
      }

      @Override
      public int getCosmeticsCount() {
         return this.cosmeticsBuilder_ == null ? this.cosmetics_.size() : this.cosmeticsBuilder_.getCount();
      }

      @Override
      public EquippedCosmetic getCosmetics(int var1) {
         return this.cosmeticsBuilder_ == null ? this.cosmetics_.get(var1) : this.cosmeticsBuilder_.getMessage(var1);
      }

      public Outfit.Builder setCosmetics(int var1, EquippedCosmetic var2) {
         if (this.cosmeticsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureCosmeticsIsMutable();
            this.cosmetics_.set(var1, var2);
            this.onChanged();
         } else {
            this.cosmeticsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public Outfit.Builder setCosmetics(int var1, EquippedCosmetic.Builder var2) {
         if (this.cosmeticsBuilder_ == null) {
            this.ensureCosmeticsIsMutable();
            this.cosmetics_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.cosmeticsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public Outfit.Builder addCosmetics(EquippedCosmetic var1) {
         if (this.cosmeticsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureCosmeticsIsMutable();
            this.cosmetics_.add(var1);
            this.onChanged();
         } else {
            this.cosmeticsBuilder_.addMessage(var1);
         }

         return this;
      }

      public Outfit.Builder addCosmetics(int var1, EquippedCosmetic var2) {
         if (this.cosmeticsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureCosmeticsIsMutable();
            this.cosmetics_.add(var1, var2);
            this.onChanged();
         } else {
            this.cosmeticsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public Outfit.Builder addCosmetics(EquippedCosmetic.Builder var1) {
         if (this.cosmeticsBuilder_ == null) {
            this.ensureCosmeticsIsMutable();
            this.cosmetics_.add(var1.build());
            this.onChanged();
         } else {
            this.cosmeticsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public Outfit.Builder addCosmetics(int var1, EquippedCosmetic.Builder var2) {
         if (this.cosmeticsBuilder_ == null) {
            this.ensureCosmeticsIsMutable();
            this.cosmetics_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.cosmeticsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public Outfit.Builder addAllCosmetics(Iterable<? extends EquippedCosmetic> var1) {
         if (this.cosmeticsBuilder_ == null) {
            this.ensureCosmeticsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.cosmetics_);
            this.onChanged();
         } else {
            this.cosmeticsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public Outfit.Builder clearCosmetics() {
         if (this.cosmeticsBuilder_ == null) {
            this.cosmetics_ = Collections.emptyList();
            this.bitField0_ &= -5;
            this.onChanged();
         } else {
            this.cosmeticsBuilder_.clear();
         }

         return this;
      }

      public Outfit.Builder removeCosmetics(int var1) {
         if (this.cosmeticsBuilder_ == null) {
            this.ensureCosmeticsIsMutable();
            this.cosmetics_.remove(var1);
            this.onChanged();
         } else {
            this.cosmeticsBuilder_.remove(var1);
         }

         return this;
      }

      public EquippedCosmetic.Builder getCosmeticsBuilder(int var1) {
         return this.getCosmeticsFieldBuilder().getBuilder(var1);
      }

      @Override
      public EquippedCosmeticOrBuilder getCosmeticsOrBuilder(int var1) {
         return this.cosmeticsBuilder_ == null ? this.cosmetics_.get(var1) : this.cosmeticsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends EquippedCosmeticOrBuilder> getCosmeticsOrBuilderList() {
         return this.cosmeticsBuilder_ != null ? this.cosmeticsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.cosmetics_);
      }

      public EquippedCosmetic.Builder addCosmeticsBuilder() {
         return this.getCosmeticsFieldBuilder().addBuilder(EquippedCosmetic.getDefaultInstance());
      }

      public EquippedCosmetic.Builder addCosmeticsBuilder(int var1) {
         return this.getCosmeticsFieldBuilder().addBuilder(var1, EquippedCosmetic.getDefaultInstance());
      }

      public List<EquippedCosmetic.Builder> getCosmeticsBuilderList() {
         return this.getCosmeticsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<EquippedCosmetic, EquippedCosmetic.Builder, EquippedCosmeticOrBuilder> getCosmeticsFieldBuilder() {
         if (this.cosmeticsBuilder_ == null) {
            this.cosmeticsBuilder_ = new RepeatedFieldBuilderV3<>(this.cosmetics_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
            this.cosmetics_ = null;
         }

         return this.cosmeticsBuilder_;
      }

      @Override
      public boolean getFavorite() {
         return this.favorite_;
      }

      public Outfit.Builder setFavorite(boolean var1) {
         this.favorite_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public Outfit.Builder clearFavorite() {
         this.bitField0_ &= -9;
         this.favorite_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasCreatedAt() {
         return (this.bitField0_ & 16) != 0;
      }

      @Override
      public Timestamp getCreatedAt() {
         if (this.createdAtBuilder_ == null) {
            return this.createdAt_ == null ? Timestamp.getDefaultInstance() : this.createdAt_;
         } else {
            return this.createdAtBuilder_.getMessage();
         }
      }

      public Outfit.Builder setCreatedAt(Timestamp var1) {
         if (this.createdAtBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.createdAt_ = var1;
         } else {
            this.createdAtBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public Outfit.Builder setCreatedAt(Timestamp.Builder var1) {
         if (this.createdAtBuilder_ == null) {
            this.createdAt_ = var1.build();
         } else {
            this.createdAtBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public Outfit.Builder mergeCreatedAt(Timestamp var1) {
         if (this.createdAtBuilder_ == null) {
            if ((this.bitField0_ & 16) != 0 && this.createdAt_ != null && this.createdAt_ != Timestamp.getDefaultInstance()) {
               this.getCreatedAtBuilder().mergeFrom(var1);
            } else {
               this.createdAt_ = var1;
            }
         } else {
            this.createdAtBuilder_.mergeFrom(var1);
         }

         if (this.createdAt_ != null) {
            this.bitField0_ |= 16;
            this.onChanged();
         }

         return this;
      }

      public Outfit.Builder clearCreatedAt() {
         this.bitField0_ &= -17;
         this.createdAt_ = null;
         if (this.createdAtBuilder_ != null) {
            this.createdAtBuilder_.dispose();
            this.createdAtBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getCreatedAtBuilder() {
         this.bitField0_ |= 16;
         this.onChanged();
         return this.getCreatedAtFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getCreatedAtOrBuilder() {
         if (this.createdAtBuilder_ != null) {
            return this.createdAtBuilder_.getMessageOrBuilder();
         } else {
            return this.createdAt_ == null ? Timestamp.getDefaultInstance() : this.createdAt_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getCreatedAtFieldBuilder() {
         if (this.createdAtBuilder_ == null) {
            this.createdAtBuilder_ = new SingleFieldBuilderV3<>(this.getCreatedAt(), this.getParentForChildren(), this.isClean());
            this.createdAt_ = null;
         }

         return this.createdAtBuilder_;
      }

      @Override
      public boolean hasUpdatedAt() {
         return (this.bitField0_ & 32) != 0;
      }

      @Override
      public Timestamp getUpdatedAt() {
         if (this.updatedAtBuilder_ == null) {
            return this.updatedAt_ == null ? Timestamp.getDefaultInstance() : this.updatedAt_;
         } else {
            return this.updatedAtBuilder_.getMessage();
         }
      }

      public Outfit.Builder setUpdatedAt(Timestamp var1) {
         if (this.updatedAtBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.updatedAt_ = var1;
         } else {
            this.updatedAtBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public Outfit.Builder setUpdatedAt(Timestamp.Builder var1) {
         if (this.updatedAtBuilder_ == null) {
            this.updatedAt_ = var1.build();
         } else {
            this.updatedAtBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public Outfit.Builder mergeUpdatedAt(Timestamp var1) {
         if (this.updatedAtBuilder_ == null) {
            if ((this.bitField0_ & 32) != 0 && this.updatedAt_ != null && this.updatedAt_ != Timestamp.getDefaultInstance()) {
               this.getUpdatedAtBuilder().mergeFrom(var1);
            } else {
               this.updatedAt_ = var1;
            }
         } else {
            this.updatedAtBuilder_.mergeFrom(var1);
         }

         if (this.updatedAt_ != null) {
            this.bitField0_ |= 32;
            this.onChanged();
         }

         return this;
      }

      public Outfit.Builder clearUpdatedAt() {
         this.bitField0_ &= -33;
         this.updatedAt_ = null;
         if (this.updatedAtBuilder_ != null) {
            this.updatedAtBuilder_.dispose();
            this.updatedAtBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getUpdatedAtBuilder() {
         this.bitField0_ |= 32;
         this.onChanged();
         return this.getUpdatedAtFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getUpdatedAtOrBuilder() {
         if (this.updatedAtBuilder_ != null) {
            return this.updatedAtBuilder_.getMessageOrBuilder();
         } else {
            return this.updatedAt_ == null ? Timestamp.getDefaultInstance() : this.updatedAt_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getUpdatedAtFieldBuilder() {
         if (this.updatedAtBuilder_ == null) {
            this.updatedAtBuilder_ = new SingleFieldBuilderV3<>(this.getUpdatedAt(), this.getParentForChildren(), this.isClean());
            this.updatedAt_ = null;
         }

         return this.updatedAtBuilder_;
      }

      @Override
      public boolean hasSkinHash() {
         return (this.bitField0_ & 64) != 0;
      }

      @Override
      public String getSkinHash() {
         Object var1 = this.skinHash_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.skinHash_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getSkinHashBytes() {
         Object var1 = this.skinHash_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.skinHash_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Outfit.Builder setSkinHash(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.skinHash_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public Outfit.Builder clearSkinHash() {
         this.skinHash_ = Outfit.getDefaultInstance().getSkinHash();
         this.bitField0_ &= -65;
         this.onChanged();
         return this;
      }

      public Outfit.Builder setSkinHashBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Outfit.checkByteStringIsUtf8(var1);
         this.skinHash_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasBadgeId() {
         return (this.bitField0_ & 128) != 0;
      }

      @Override
      public int getBadgeId() {
         return this.badgeId_;
      }

      public Outfit.Builder setBadgeId(int var1) {
         this.badgeId_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public Outfit.Builder clearBadgeId() {
         this.bitField0_ &= -129;
         this.badgeId_ = 0;
         this.onChanged();
         return this;
      }

      public final Outfit.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Outfit.Builder)super.setUnknownFields(var1);
      }

      public final Outfit.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Outfit.Builder)super.mergeUnknownFields(var1);
      }
   }
}
