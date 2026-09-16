package com.lunarclient.apollo.common.v1;

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

public final class EntityId extends GeneratedMessageV3 implements EntityIdOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ENTITY_ID_FIELD_NUMBER = 1;
   private int entityId_ = 0;
   public static final int ENTITY_UUID_FIELD_NUMBER = 2;
   private Uuid entityUuid_;
   private byte memoizedIsInitialized = -1;
   private static final EntityId DEFAULT_INSTANCE = new EntityId();
   private static final Parser<EntityId> PARSER = new AbstractParser<EntityId>() {
      public EntityId parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EntityId.Builder var3 = EntityId.newBuilder();

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

   private EntityId(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EntityId() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EntityId();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return EntityidProto.internal_static_lunarclient_apollo_common_v1_EntityId_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return EntityidProto.internal_static_lunarclient_apollo_common_v1_EntityId_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EntityId.class, EntityId.Builder.class);
   }

   @Override
   public int getEntityId() {
      return this.entityId_;
   }

   @Override
   public boolean hasEntityUuid() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getEntityUuid() {
      return this.entityUuid_ == null ? Uuid.getDefaultInstance() : this.entityUuid_;
   }

   @Override
   public UuidOrBuilder getEntityUuidOrBuilder() {
      return this.entityUuid_ == null ? Uuid.getDefaultInstance() : this.entityUuid_;
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
      if (this.entityId_ != 0) {
         var1.writeInt32(1, this.entityId_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getEntityUuid());
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
      if (this.entityId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.entityId_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getEntityUuid());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof EntityId)) {
         return super.equals(var1);
      } else {
         EntityId var2 = (EntityId)var1;
         if (this.getEntityId() != var2.getEntityId()) {
            return false;
         } else if (this.hasEntityUuid() != var2.hasEntityUuid()) {
            return false;
         } else {
            return this.hasEntityUuid() && !this.getEntityUuid().equals(var2.getEntityUuid()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getEntityId();
      if (this.hasEntityUuid()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getEntityUuid().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EntityId parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EntityId parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EntityId parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EntityId parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EntityId parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EntityId parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EntityId parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EntityId parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EntityId parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EntityId parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EntityId parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EntityId parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EntityId.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EntityId.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EntityId.Builder newBuilder(EntityId var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EntityId.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EntityId.Builder() : new EntityId.Builder().mergeFrom(this);
   }

   protected EntityId.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EntityId.Builder(var1);
   }

   public static EntityId getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EntityId> parser() {
      return PARSER;
   }

   @Override
   public Parser<EntityId> getParserForType() {
      return PARSER;
   }

   public EntityId getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EntityId.Builder> implements EntityIdOrBuilder {
      private int bitField0_;
      private int entityId_;
      private Uuid entityUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> entityUuidBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return EntityidProto.internal_static_lunarclient_apollo_common_v1_EntityId_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EntityidProto.internal_static_lunarclient_apollo_common_v1_EntityId_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EntityId.class, EntityId.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (EntityId.alwaysUseFieldBuilders) {
            this.getEntityUuidFieldBuilder();
         }
      }

      public EntityId.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.entityId_ = 0;
         this.entityUuid_ = null;
         if (this.entityUuidBuilder_ != null) {
            this.entityUuidBuilder_.dispose();
            this.entityUuidBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return EntityidProto.internal_static_lunarclient_apollo_common_v1_EntityId_descriptor;
      }

      public EntityId getDefaultInstanceForType() {
         return EntityId.getDefaultInstance();
      }

      public EntityId build() {
         EntityId var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EntityId buildPartial() {
         EntityId var1 = new EntityId(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(EntityId var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.entityId_ = this.entityId_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.entityUuid_ = this.entityUuidBuilder_ == null ? this.entityUuid_ : this.entityUuidBuilder_.build();
            var3 |= 1;
         }

         EntityId var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public EntityId.Builder clone() {
         return (EntityId.Builder)super.clone();
      }

      public EntityId.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EntityId.Builder)super.setField(var1, var2);
      }

      public EntityId.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EntityId.Builder)super.clearField(var1);
      }

      public EntityId.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EntityId.Builder)super.clearOneof(var1);
      }

      public EntityId.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EntityId.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EntityId.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EntityId.Builder)super.addRepeatedField(var1, var2);
      }

      public EntityId.Builder mergeFrom(Message var1) {
         if (var1 instanceof EntityId) {
            return this.mergeFrom((EntityId)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EntityId.Builder mergeFrom(EntityId var1) {
         if (var1 == EntityId.getDefaultInstance()) {
            return this;
         }

         if (var1.getEntityId() != 0) {
            this.setEntityId(var1.getEntityId());
         }

         if (var1.hasEntityUuid()) {
            this.mergeEntityUuid(var1.getEntityUuid());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public EntityId.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.entityId_ = var1.readInt32();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getEntityUuidFieldBuilder().getBuilder(), var2);
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
      public int getEntityId() {
         return this.entityId_;
      }

      public EntityId.Builder setEntityId(int var1) {
         this.entityId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public EntityId.Builder clearEntityId() {
         this.bitField0_ &= -2;
         this.entityId_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasEntityUuid() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Uuid getEntityUuid() {
         if (this.entityUuidBuilder_ == null) {
            return this.entityUuid_ == null ? Uuid.getDefaultInstance() : this.entityUuid_;
         } else {
            return this.entityUuidBuilder_.getMessage();
         }
      }

      public EntityId.Builder setEntityUuid(Uuid var1) {
         if (this.entityUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.entityUuid_ = var1;
         } else {
            this.entityUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public EntityId.Builder setEntityUuid(Uuid.Builder var1) {
         if (this.entityUuidBuilder_ == null) {
            this.entityUuid_ = var1.build();
         } else {
            this.entityUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public EntityId.Builder mergeEntityUuid(Uuid var1) {
         if (this.entityUuidBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.entityUuid_ != null && this.entityUuid_ != Uuid.getDefaultInstance()) {
               this.getEntityUuidBuilder().mergeFrom(var1);
            } else {
               this.entityUuid_ = var1;
            }
         } else {
            this.entityUuidBuilder_.mergeFrom(var1);
         }

         if (this.entityUuid_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public EntityId.Builder clearEntityUuid() {
         this.bitField0_ &= -3;
         this.entityUuid_ = null;
         if (this.entityUuidBuilder_ != null) {
            this.entityUuidBuilder_.dispose();
            this.entityUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getEntityUuidBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getEntityUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getEntityUuidOrBuilder() {
         if (this.entityUuidBuilder_ != null) {
            return this.entityUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.entityUuid_ == null ? Uuid.getDefaultInstance() : this.entityUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getEntityUuidFieldBuilder() {
         if (this.entityUuidBuilder_ == null) {
            this.entityUuidBuilder_ = new SingleFieldBuilderV3<>(this.getEntityUuid(), this.getParentForChildren(), this.isClean());
            this.entityUuid_ = null;
         }

         return this.entityUuidBuilder_;
      }

      public final EntityId.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EntityId.Builder)super.setUnknownFields(var1);
      }

      public final EntityId.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EntityId.Builder)super.mergeUnknownFields(var1);
      }
   }
}
