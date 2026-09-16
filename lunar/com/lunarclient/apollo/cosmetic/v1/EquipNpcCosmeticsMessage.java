package com.lunarclient.apollo.cosmetic.v1;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class EquipNpcCosmeticsMessage extends GeneratedMessageV3 implements EquipNpcCosmeticsMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int NPC_UUID_FIELD_NUMBER = 1;
   private Uuid npcUuid_;
   public static final int COSMETICS_FIELD_NUMBER = 2;
   private List<Cosmetic> cosmetics_;
   public static final int COPY_LOCAL_COSMETICS_FIELD_NUMBER = 3;
   private boolean copyLocalCosmetics_ = false;
   private byte memoizedIsInitialized = -1;
   private static final EquipNpcCosmeticsMessage DEFAULT_INSTANCE = new EquipNpcCosmeticsMessage();
   private static final Parser<EquipNpcCosmeticsMessage> PARSER = new AbstractParser<EquipNpcCosmeticsMessage>() {
      public EquipNpcCosmeticsMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EquipNpcCosmeticsMessage.Builder var3 = EquipNpcCosmeticsMessage.newBuilder();

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

   private EquipNpcCosmeticsMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EquipNpcCosmeticsMessage() {
      this.cosmetics_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EquipNpcCosmeticsMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_EquipNpcCosmeticsMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_EquipNpcCosmeticsMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EquipNpcCosmeticsMessage.class, EquipNpcCosmeticsMessage.Builder.class);
   }

   @Override
   public boolean hasNpcUuid() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getNpcUuid() {
      return this.npcUuid_ == null ? Uuid.getDefaultInstance() : this.npcUuid_;
   }

   @Override
   public UuidOrBuilder getNpcUuidOrBuilder() {
      return this.npcUuid_ == null ? Uuid.getDefaultInstance() : this.npcUuid_;
   }

   @Override
   public List<Cosmetic> getCosmeticsList() {
      return this.cosmetics_;
   }

   @Override
   public List<? extends CosmeticOrBuilder> getCosmeticsOrBuilderList() {
      return this.cosmetics_;
   }

   @Override
   public int getCosmeticsCount() {
      return this.cosmetics_.size();
   }

   @Override
   public Cosmetic getCosmetics(int var1) {
      return this.cosmetics_.get(var1);
   }

   @Override
   public CosmeticOrBuilder getCosmeticsOrBuilder(int var1) {
      return this.cosmetics_.get(var1);
   }

   @Override
   public boolean getCopyLocalCosmetics() {
      return this.copyLocalCosmetics_;
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
         var1.writeMessage(1, this.getNpcUuid());
      }

      for (int var2 = 0; var2 < this.cosmetics_.size(); var2++) {
         var1.writeMessage(2, this.cosmetics_.get(var2));
      }

      if (this.copyLocalCosmetics_) {
         var1.writeBool(3, this.copyLocalCosmetics_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getNpcUuid());
      }

      for (int var2 = 0; var2 < this.cosmetics_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(2, this.cosmetics_.get(var2));
      }

      if (this.copyLocalCosmetics_) {
         var1 += CodedOutputStream.computeBoolSize(3, this.copyLocalCosmetics_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof EquipNpcCosmeticsMessage)) {
         return super.equals(var1);
      } else {
         EquipNpcCosmeticsMessage var2 = (EquipNpcCosmeticsMessage)var1;
         if (this.hasNpcUuid() != var2.hasNpcUuid()) {
            return false;
         } else if (this.hasNpcUuid() && !this.getNpcUuid().equals(var2.getNpcUuid())) {
            return false;
         } else if (!this.getCosmeticsList().equals(var2.getCosmeticsList())) {
            return false;
         } else {
            return this.getCopyLocalCosmetics() != var2.getCopyLocalCosmetics() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasNpcUuid()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getNpcUuid().hashCode();
      }

      if (this.getCosmeticsCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getCosmeticsList().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Internal.hashBoolean(this.getCopyLocalCosmetics());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EquipNpcCosmeticsMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EquipNpcCosmeticsMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EquipNpcCosmeticsMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EquipNpcCosmeticsMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EquipNpcCosmeticsMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EquipNpcCosmeticsMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EquipNpcCosmeticsMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EquipNpcCosmeticsMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EquipNpcCosmeticsMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EquipNpcCosmeticsMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EquipNpcCosmeticsMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EquipNpcCosmeticsMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EquipNpcCosmeticsMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EquipNpcCosmeticsMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EquipNpcCosmeticsMessage.Builder newBuilder(EquipNpcCosmeticsMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EquipNpcCosmeticsMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EquipNpcCosmeticsMessage.Builder() : new EquipNpcCosmeticsMessage.Builder().mergeFrom(this);
   }

   protected EquipNpcCosmeticsMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EquipNpcCosmeticsMessage.Builder(var1);
   }

   public static EquipNpcCosmeticsMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EquipNpcCosmeticsMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<EquipNpcCosmeticsMessage> getParserForType() {
      return PARSER;
   }

   public EquipNpcCosmeticsMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EquipNpcCosmeticsMessage.Builder> implements EquipNpcCosmeticsMessageOrBuilder {
      private int bitField0_;
      private Uuid npcUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> npcUuidBuilder_;
      private List<Cosmetic> cosmetics_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<Cosmetic, Cosmetic.Builder, CosmeticOrBuilder> cosmeticsBuilder_;
      private boolean copyLocalCosmetics_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_EquipNpcCosmeticsMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_EquipNpcCosmeticsMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EquipNpcCosmeticsMessage.class, EquipNpcCosmeticsMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (EquipNpcCosmeticsMessage.alwaysUseFieldBuilders) {
            this.getNpcUuidFieldBuilder();
            this.getCosmeticsFieldBuilder();
         }
      }

      public EquipNpcCosmeticsMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.npcUuid_ = null;
         if (this.npcUuidBuilder_ != null) {
            this.npcUuidBuilder_.dispose();
            this.npcUuidBuilder_ = null;
         }

         if (this.cosmeticsBuilder_ == null) {
            this.cosmetics_ = Collections.emptyList();
         } else {
            this.cosmetics_ = null;
            this.cosmeticsBuilder_.clear();
         }

         this.bitField0_ &= -3;
         this.copyLocalCosmetics_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_EquipNpcCosmeticsMessage_descriptor;
      }

      public EquipNpcCosmeticsMessage getDefaultInstanceForType() {
         return EquipNpcCosmeticsMessage.getDefaultInstance();
      }

      public EquipNpcCosmeticsMessage build() {
         EquipNpcCosmeticsMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EquipNpcCosmeticsMessage buildPartial() {
         EquipNpcCosmeticsMessage var1 = new EquipNpcCosmeticsMessage(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(EquipNpcCosmeticsMessage var1) {
         if (this.cosmeticsBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.cosmetics_ = Collections.unmodifiableList(this.cosmetics_);
               this.bitField0_ &= -3;
            }

            var1.cosmetics_ = this.cosmetics_;
         } else {
            var1.cosmetics_ = this.cosmeticsBuilder_.build();
         }
      }

      private void buildPartial0(EquipNpcCosmeticsMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.npcUuid_ = this.npcUuidBuilder_ == null ? this.npcUuid_ : this.npcUuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            var1.copyLocalCosmetics_ = this.copyLocalCosmetics_;
         }

         EquipNpcCosmeticsMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public EquipNpcCosmeticsMessage.Builder clone() {
         return (EquipNpcCosmeticsMessage.Builder)super.clone();
      }

      public EquipNpcCosmeticsMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EquipNpcCosmeticsMessage.Builder)super.setField(var1, var2);
      }

      public EquipNpcCosmeticsMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EquipNpcCosmeticsMessage.Builder)super.clearField(var1);
      }

      public EquipNpcCosmeticsMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EquipNpcCosmeticsMessage.Builder)super.clearOneof(var1);
      }

      public EquipNpcCosmeticsMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EquipNpcCosmeticsMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EquipNpcCosmeticsMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EquipNpcCosmeticsMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public EquipNpcCosmeticsMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof EquipNpcCosmeticsMessage) {
            return this.mergeFrom((EquipNpcCosmeticsMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EquipNpcCosmeticsMessage.Builder mergeFrom(EquipNpcCosmeticsMessage var1) {
         if (var1 == EquipNpcCosmeticsMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.hasNpcUuid()) {
            this.mergeNpcUuid(var1.getNpcUuid());
         }

         if (this.cosmeticsBuilder_ == null) {
            if (!var1.cosmetics_.isEmpty()) {
               if (this.cosmetics_.isEmpty()) {
                  this.cosmetics_ = var1.cosmetics_;
                  this.bitField0_ &= -3;
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
               this.bitField0_ &= -3;
               this.cosmeticsBuilder_ = EquipNpcCosmeticsMessage.alwaysUseFieldBuilders ? this.getCosmeticsFieldBuilder() : null;
            } else {
               this.cosmeticsBuilder_.addAllMessages(var1.cosmetics_);
            }
         }

         if (var1.getCopyLocalCosmetics()) {
            this.setCopyLocalCosmetics(var1.getCopyLocalCosmetics());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public EquipNpcCosmeticsMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getNpcUuidFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     Cosmetic var5 = var1.readMessage(Cosmetic.parser(), var2);
                     if (this.cosmeticsBuilder_ == null) {
                        this.ensureCosmeticsIsMutable();
                        this.cosmetics_.add(var5);
                     } else {
                        this.cosmeticsBuilder_.addMessage(var5);
                     }
                     break;
                  case 24:
                     this.copyLocalCosmetics_ = var1.readBool();
                     this.bitField0_ |= 4;
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
      public boolean hasNpcUuid() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getNpcUuid() {
         if (this.npcUuidBuilder_ == null) {
            return this.npcUuid_ == null ? Uuid.getDefaultInstance() : this.npcUuid_;
         } else {
            return this.npcUuidBuilder_.getMessage();
         }
      }

      public EquipNpcCosmeticsMessage.Builder setNpcUuid(Uuid var1) {
         if (this.npcUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.npcUuid_ = var1;
         } else {
            this.npcUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public EquipNpcCosmeticsMessage.Builder setNpcUuid(Uuid.Builder var1) {
         if (this.npcUuidBuilder_ == null) {
            this.npcUuid_ = var1.build();
         } else {
            this.npcUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public EquipNpcCosmeticsMessage.Builder mergeNpcUuid(Uuid var1) {
         if (this.npcUuidBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.npcUuid_ != null && this.npcUuid_ != Uuid.getDefaultInstance()) {
               this.getNpcUuidBuilder().mergeFrom(var1);
            } else {
               this.npcUuid_ = var1;
            }
         } else {
            this.npcUuidBuilder_.mergeFrom(var1);
         }

         if (this.npcUuid_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public EquipNpcCosmeticsMessage.Builder clearNpcUuid() {
         this.bitField0_ &= -2;
         this.npcUuid_ = null;
         if (this.npcUuidBuilder_ != null) {
            this.npcUuidBuilder_.dispose();
            this.npcUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getNpcUuidBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getNpcUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getNpcUuidOrBuilder() {
         if (this.npcUuidBuilder_ != null) {
            return this.npcUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.npcUuid_ == null ? Uuid.getDefaultInstance() : this.npcUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getNpcUuidFieldBuilder() {
         if (this.npcUuidBuilder_ == null) {
            this.npcUuidBuilder_ = new SingleFieldBuilderV3<>(this.getNpcUuid(), this.getParentForChildren(), this.isClean());
            this.npcUuid_ = null;
         }

         return this.npcUuidBuilder_;
      }

      private void ensureCosmeticsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.cosmetics_ = new ArrayList<>(this.cosmetics_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<Cosmetic> getCosmeticsList() {
         return this.cosmeticsBuilder_ == null ? Collections.unmodifiableList(this.cosmetics_) : this.cosmeticsBuilder_.getMessageList();
      }

      @Override
      public int getCosmeticsCount() {
         return this.cosmeticsBuilder_ == null ? this.cosmetics_.size() : this.cosmeticsBuilder_.getCount();
      }

      @Override
      public Cosmetic getCosmetics(int var1) {
         return this.cosmeticsBuilder_ == null ? this.cosmetics_.get(var1) : this.cosmeticsBuilder_.getMessage(var1);
      }

      public EquipNpcCosmeticsMessage.Builder setCosmetics(int var1, Cosmetic var2) {
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

      public EquipNpcCosmeticsMessage.Builder setCosmetics(int var1, Cosmetic.Builder var2) {
         if (this.cosmeticsBuilder_ == null) {
            this.ensureCosmeticsIsMutable();
            this.cosmetics_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.cosmeticsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public EquipNpcCosmeticsMessage.Builder addCosmetics(Cosmetic var1) {
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

      public EquipNpcCosmeticsMessage.Builder addCosmetics(int var1, Cosmetic var2) {
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

      public EquipNpcCosmeticsMessage.Builder addCosmetics(Cosmetic.Builder var1) {
         if (this.cosmeticsBuilder_ == null) {
            this.ensureCosmeticsIsMutable();
            this.cosmetics_.add(var1.build());
            this.onChanged();
         } else {
            this.cosmeticsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public EquipNpcCosmeticsMessage.Builder addCosmetics(int var1, Cosmetic.Builder var2) {
         if (this.cosmeticsBuilder_ == null) {
            this.ensureCosmeticsIsMutable();
            this.cosmetics_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.cosmeticsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public EquipNpcCosmeticsMessage.Builder addAllCosmetics(Iterable<? extends Cosmetic> var1) {
         if (this.cosmeticsBuilder_ == null) {
            this.ensureCosmeticsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.cosmetics_);
            this.onChanged();
         } else {
            this.cosmeticsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public EquipNpcCosmeticsMessage.Builder clearCosmetics() {
         if (this.cosmeticsBuilder_ == null) {
            this.cosmetics_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.cosmeticsBuilder_.clear();
         }

         return this;
      }

      public EquipNpcCosmeticsMessage.Builder removeCosmetics(int var1) {
         if (this.cosmeticsBuilder_ == null) {
            this.ensureCosmeticsIsMutable();
            this.cosmetics_.remove(var1);
            this.onChanged();
         } else {
            this.cosmeticsBuilder_.remove(var1);
         }

         return this;
      }

      public Cosmetic.Builder getCosmeticsBuilder(int var1) {
         return this.getCosmeticsFieldBuilder().getBuilder(var1);
      }

      @Override
      public CosmeticOrBuilder getCosmeticsOrBuilder(int var1) {
         return this.cosmeticsBuilder_ == null ? this.cosmetics_.get(var1) : this.cosmeticsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends CosmeticOrBuilder> getCosmeticsOrBuilderList() {
         return this.cosmeticsBuilder_ != null ? this.cosmeticsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.cosmetics_);
      }

      public Cosmetic.Builder addCosmeticsBuilder() {
         return this.getCosmeticsFieldBuilder().addBuilder(Cosmetic.getDefaultInstance());
      }

      public Cosmetic.Builder addCosmeticsBuilder(int var1) {
         return this.getCosmeticsFieldBuilder().addBuilder(var1, Cosmetic.getDefaultInstance());
      }

      public List<Cosmetic.Builder> getCosmeticsBuilderList() {
         return this.getCosmeticsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<Cosmetic, Cosmetic.Builder, CosmeticOrBuilder> getCosmeticsFieldBuilder() {
         if (this.cosmeticsBuilder_ == null) {
            this.cosmeticsBuilder_ = new RepeatedFieldBuilderV3<>(this.cosmetics_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
            this.cosmetics_ = null;
         }

         return this.cosmeticsBuilder_;
      }

      @Override
      public boolean getCopyLocalCosmetics() {
         return this.copyLocalCosmetics_;
      }

      public EquipNpcCosmeticsMessage.Builder setCopyLocalCosmetics(boolean var1) {
         this.copyLocalCosmetics_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public EquipNpcCosmeticsMessage.Builder clearCopyLocalCosmetics() {
         this.bitField0_ &= -5;
         this.copyLocalCosmetics_ = false;
         this.onChanged();
         return this;
      }

      public final EquipNpcCosmeticsMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EquipNpcCosmeticsMessage.Builder)super.setUnknownFields(var1);
      }

      public final EquipNpcCosmeticsMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EquipNpcCosmeticsMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
