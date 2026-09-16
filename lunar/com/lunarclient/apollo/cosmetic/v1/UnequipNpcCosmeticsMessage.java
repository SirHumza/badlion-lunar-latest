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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class UnequipNpcCosmeticsMessage extends GeneratedMessageV3 implements UnequipNpcCosmeticsMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int NPC_UUID_FIELD_NUMBER = 1;
   private Uuid npcUuid_;
   public static final int COSMETIC_IDS_FIELD_NUMBER = 2;
   private Internal.IntList cosmeticIds_ = emptyIntList();
   private int cosmeticIdsMemoizedSerializedSize = -1;
   private byte memoizedIsInitialized = -1;
   private static final UnequipNpcCosmeticsMessage DEFAULT_INSTANCE = new UnequipNpcCosmeticsMessage();
   private static final Parser<UnequipNpcCosmeticsMessage> PARSER = new AbstractParser<UnequipNpcCosmeticsMessage>() {
      public UnequipNpcCosmeticsMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UnequipNpcCosmeticsMessage.Builder var3 = UnequipNpcCosmeticsMessage.newBuilder();

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

   private UnequipNpcCosmeticsMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UnequipNpcCosmeticsMessage() {
      this.cosmeticIds_ = emptyIntList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UnequipNpcCosmeticsMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_UnequipNpcCosmeticsMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_UnequipNpcCosmeticsMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UnequipNpcCosmeticsMessage.class, UnequipNpcCosmeticsMessage.Builder.class);
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
   public List<Integer> getCosmeticIdsList() {
      return this.cosmeticIds_;
   }

   @Override
   public int getCosmeticIdsCount() {
      return this.cosmeticIds_.size();
   }

   @Override
   public int getCosmeticIds(int var1) {
      return this.cosmeticIds_.getInt(var1);
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
      this.getSerializedSize();
      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(1, this.getNpcUuid());
      }

      if (this.getCosmeticIdsList().size() > 0) {
         var1.writeUInt32NoTag(18);
         var1.writeUInt32NoTag(this.cosmeticIdsMemoizedSerializedSize);
      }

      for (int var2 = 0; var2 < this.cosmeticIds_.size(); var2++) {
         var1.writeInt32NoTag(this.cosmeticIds_.getInt(var2));
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

      int var2 = 0;

      for (int var3 = 0; var3 < this.cosmeticIds_.size(); var3++) {
         var2 += CodedOutputStream.computeInt32SizeNoTag(this.cosmeticIds_.getInt(var3));
      }

      var1 += var2;
      if (!this.getCosmeticIdsList().isEmpty()) {
         var1 = ++var1 + CodedOutputStream.computeInt32SizeNoTag(var2);
      }

      this.cosmeticIdsMemoizedSerializedSize = var2;
      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof UnequipNpcCosmeticsMessage)) {
         return super.equals(var1);
      } else {
         UnequipNpcCosmeticsMessage var2 = (UnequipNpcCosmeticsMessage)var1;
         if (this.hasNpcUuid() != var2.hasNpcUuid()) {
            return false;
         } else if (this.hasNpcUuid() && !this.getNpcUuid().equals(var2.getNpcUuid())) {
            return false;
         } else {
            return !this.getCosmeticIdsList().equals(var2.getCosmeticIdsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      if (this.getCosmeticIdsCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getCosmeticIdsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UnequipNpcCosmeticsMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UnequipNpcCosmeticsMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UnequipNpcCosmeticsMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UnequipNpcCosmeticsMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UnequipNpcCosmeticsMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UnequipNpcCosmeticsMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UnequipNpcCosmeticsMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UnequipNpcCosmeticsMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UnequipNpcCosmeticsMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UnequipNpcCosmeticsMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UnequipNpcCosmeticsMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UnequipNpcCosmeticsMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UnequipNpcCosmeticsMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UnequipNpcCosmeticsMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UnequipNpcCosmeticsMessage.Builder newBuilder(UnequipNpcCosmeticsMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UnequipNpcCosmeticsMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UnequipNpcCosmeticsMessage.Builder() : new UnequipNpcCosmeticsMessage.Builder().mergeFrom(this);
   }

   protected UnequipNpcCosmeticsMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UnequipNpcCosmeticsMessage.Builder(var1);
   }

   public static UnequipNpcCosmeticsMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UnequipNpcCosmeticsMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<UnequipNpcCosmeticsMessage> getParserForType() {
      return PARSER;
   }

   public UnequipNpcCosmeticsMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UnequipNpcCosmeticsMessage.Builder> implements UnequipNpcCosmeticsMessageOrBuilder {
      private int bitField0_;
      private Uuid npcUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> npcUuidBuilder_;
      private Internal.IntList cosmeticIds_ = UnequipNpcCosmeticsMessage.emptyIntList();

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_UnequipNpcCosmeticsMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_UnequipNpcCosmeticsMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UnequipNpcCosmeticsMessage.class, UnequipNpcCosmeticsMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (UnequipNpcCosmeticsMessage.alwaysUseFieldBuilders) {
            this.getNpcUuidFieldBuilder();
         }
      }

      public UnequipNpcCosmeticsMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.npcUuid_ = null;
         if (this.npcUuidBuilder_ != null) {
            this.npcUuidBuilder_.dispose();
            this.npcUuidBuilder_ = null;
         }

         this.cosmeticIds_ = UnequipNpcCosmeticsMessage.emptyIntList();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_UnequipNpcCosmeticsMessage_descriptor;
      }

      public UnequipNpcCosmeticsMessage getDefaultInstanceForType() {
         return UnequipNpcCosmeticsMessage.getDefaultInstance();
      }

      public UnequipNpcCosmeticsMessage build() {
         UnequipNpcCosmeticsMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UnequipNpcCosmeticsMessage buildPartial() {
         UnequipNpcCosmeticsMessage var1 = new UnequipNpcCosmeticsMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UnequipNpcCosmeticsMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.npcUuid_ = this.npcUuidBuilder_ == null ? this.npcUuid_ : this.npcUuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            this.cosmeticIds_.makeImmutable();
            var1.cosmeticIds_ = this.cosmeticIds_;
         }

         UnequipNpcCosmeticsMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public UnequipNpcCosmeticsMessage.Builder clone() {
         return (UnequipNpcCosmeticsMessage.Builder)super.clone();
      }

      public UnequipNpcCosmeticsMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UnequipNpcCosmeticsMessage.Builder)super.setField(var1, var2);
      }

      public UnequipNpcCosmeticsMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UnequipNpcCosmeticsMessage.Builder)super.clearField(var1);
      }

      public UnequipNpcCosmeticsMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UnequipNpcCosmeticsMessage.Builder)super.clearOneof(var1);
      }

      public UnequipNpcCosmeticsMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UnequipNpcCosmeticsMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UnequipNpcCosmeticsMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UnequipNpcCosmeticsMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public UnequipNpcCosmeticsMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof UnequipNpcCosmeticsMessage) {
            return this.mergeFrom((UnequipNpcCosmeticsMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UnequipNpcCosmeticsMessage.Builder mergeFrom(UnequipNpcCosmeticsMessage var1) {
         if (var1 == UnequipNpcCosmeticsMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.hasNpcUuid()) {
            this.mergeNpcUuid(var1.getNpcUuid());
         }

         if (!var1.cosmeticIds_.isEmpty()) {
            if (this.cosmeticIds_.isEmpty()) {
               this.cosmeticIds_ = var1.cosmeticIds_;
               this.cosmeticIds_.makeImmutable();
               this.bitField0_ |= 2;
            } else {
               this.ensureCosmeticIdsIsMutable();
               this.cosmeticIds_.addAll(var1.cosmeticIds_);
            }

            this.onChanged();
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public UnequipNpcCosmeticsMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 16:
                     int var12 = var1.readInt32();
                     this.ensureCosmeticIdsIsMutable();
                     this.cosmeticIds_.addInt(var12);
                     break;
                  case 18:
                     int var5 = var1.readRawVarint32();
                     int var6 = var1.pushLimit(var5);
                     this.ensureCosmeticIdsIsMutable();

                     while (var1.getBytesUntilLimit() > 0) {
                        this.cosmeticIds_.addInt(var1.readInt32());
                     }

                     var1.popLimit(var6);
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var10) {
            throw var10.unwrapIOException();
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

      public UnequipNpcCosmeticsMessage.Builder setNpcUuid(Uuid var1) {
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

      public UnequipNpcCosmeticsMessage.Builder setNpcUuid(Uuid.Builder var1) {
         if (this.npcUuidBuilder_ == null) {
            this.npcUuid_ = var1.build();
         } else {
            this.npcUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UnequipNpcCosmeticsMessage.Builder mergeNpcUuid(Uuid var1) {
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

      public UnequipNpcCosmeticsMessage.Builder clearNpcUuid() {
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

      private void ensureCosmeticIdsIsMutable() {
         if (!this.cosmeticIds_.isModifiable()) {
            this.cosmeticIds_ = UnequipNpcCosmeticsMessage.makeMutableCopy(this.cosmeticIds_);
         }

         this.bitField0_ |= 2;
      }

      @Override
      public List<Integer> getCosmeticIdsList() {
         this.cosmeticIds_.makeImmutable();
         return this.cosmeticIds_;
      }

      @Override
      public int getCosmeticIdsCount() {
         return this.cosmeticIds_.size();
      }

      @Override
      public int getCosmeticIds(int var1) {
         return this.cosmeticIds_.getInt(var1);
      }

      public UnequipNpcCosmeticsMessage.Builder setCosmeticIds(int var1, int var2) {
         this.ensureCosmeticIdsIsMutable();
         this.cosmeticIds_.setInt(var1, var2);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UnequipNpcCosmeticsMessage.Builder addCosmeticIds(int var1) {
         this.ensureCosmeticIdsIsMutable();
         this.cosmeticIds_.addInt(var1);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UnequipNpcCosmeticsMessage.Builder addAllCosmeticIds(Iterable<? extends Integer> var1) {
         this.ensureCosmeticIdsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.cosmeticIds_);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UnequipNpcCosmeticsMessage.Builder clearCosmeticIds() {
         this.cosmeticIds_ = UnequipNpcCosmeticsMessage.emptyIntList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public final UnequipNpcCosmeticsMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UnequipNpcCosmeticsMessage.Builder)super.setUnknownFields(var1);
      }

      public final UnequipNpcCosmeticsMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UnequipNpcCosmeticsMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
