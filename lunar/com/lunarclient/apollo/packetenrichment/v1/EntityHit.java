package com.lunarclient.apollo.packetenrichment.v1;

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
import com.lunarclient.apollo.common.v1.EntityId;
import com.lunarclient.apollo.common.v1.EntityIdOrBuilder;
import com.lunarclient.apollo.common.v1.Location;
import com.lunarclient.apollo.common.v1.LocationOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class EntityHit extends GeneratedMessageV3 implements EntityHitOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int HIT_LOCATION_FIELD_NUMBER = 1;
   private Location hitLocation_;
   public static final int ENTITY_ID_FIELD_NUMBER = 2;
   private EntityId entityId_;
   private byte memoizedIsInitialized = -1;
   private static final EntityHit DEFAULT_INSTANCE = new EntityHit();
   private static final Parser<EntityHit> PARSER = new AbstractParser<EntityHit>() {
      public EntityHit parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EntityHit.Builder var3 = EntityHit.newBuilder();

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

   private EntityHit(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EntityHit() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EntityHit();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return RaytraceProto.internal_static_lunarclient_apollo_packetenrichment_v1_EntityHit_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return RaytraceProto.internal_static_lunarclient_apollo_packetenrichment_v1_EntityHit_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EntityHit.class, EntityHit.Builder.class);
   }

   @Override
   public boolean hasHitLocation() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Location getHitLocation() {
      return this.hitLocation_ == null ? Location.getDefaultInstance() : this.hitLocation_;
   }

   @Override
   public LocationOrBuilder getHitLocationOrBuilder() {
      return this.hitLocation_ == null ? Location.getDefaultInstance() : this.hitLocation_;
   }

   @Override
   public boolean hasEntityId() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public EntityId getEntityId() {
      return this.entityId_ == null ? EntityId.getDefaultInstance() : this.entityId_;
   }

   @Override
   public EntityIdOrBuilder getEntityIdOrBuilder() {
      return this.entityId_ == null ? EntityId.getDefaultInstance() : this.entityId_;
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
         var1.writeMessage(1, this.getHitLocation());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getEntityId());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getHitLocation());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getEntityId());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof EntityHit)) {
         return super.equals(var1);
      } else {
         EntityHit var2 = (EntityHit)var1;
         if (this.hasHitLocation() != var2.hasHitLocation()) {
            return false;
         } else if (this.hasHitLocation() && !this.getHitLocation().equals(var2.getHitLocation())) {
            return false;
         } else if (this.hasEntityId() != var2.hasEntityId()) {
            return false;
         } else {
            return this.hasEntityId() && !this.getEntityId().equals(var2.getEntityId()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasHitLocation()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getHitLocation().hashCode();
      }

      if (this.hasEntityId()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getEntityId().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EntityHit parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EntityHit parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EntityHit parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EntityHit parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EntityHit parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EntityHit parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EntityHit parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EntityHit parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EntityHit parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EntityHit parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EntityHit parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EntityHit parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EntityHit.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EntityHit.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EntityHit.Builder newBuilder(EntityHit var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EntityHit.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EntityHit.Builder() : new EntityHit.Builder().mergeFrom(this);
   }

   protected EntityHit.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EntityHit.Builder(var1);
   }

   public static EntityHit getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EntityHit> parser() {
      return PARSER;
   }

   @Override
   public Parser<EntityHit> getParserForType() {
      return PARSER;
   }

   public EntityHit getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EntityHit.Builder> implements EntityHitOrBuilder {
      private int bitField0_;
      private Location hitLocation_;
      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> hitLocationBuilder_;
      private EntityId entityId_;
      private SingleFieldBuilderV3<EntityId, EntityId.Builder, EntityIdOrBuilder> entityIdBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return RaytraceProto.internal_static_lunarclient_apollo_packetenrichment_v1_EntityHit_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RaytraceProto.internal_static_lunarclient_apollo_packetenrichment_v1_EntityHit_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EntityHit.class, EntityHit.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (EntityHit.alwaysUseFieldBuilders) {
            this.getHitLocationFieldBuilder();
            this.getEntityIdFieldBuilder();
         }
      }

      public EntityHit.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.hitLocation_ = null;
         if (this.hitLocationBuilder_ != null) {
            this.hitLocationBuilder_.dispose();
            this.hitLocationBuilder_ = null;
         }

         this.entityId_ = null;
         if (this.entityIdBuilder_ != null) {
            this.entityIdBuilder_.dispose();
            this.entityIdBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return RaytraceProto.internal_static_lunarclient_apollo_packetenrichment_v1_EntityHit_descriptor;
      }

      public EntityHit getDefaultInstanceForType() {
         return EntityHit.getDefaultInstance();
      }

      public EntityHit build() {
         EntityHit var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EntityHit buildPartial() {
         EntityHit var1 = new EntityHit(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(EntityHit var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.hitLocation_ = this.hitLocationBuilder_ == null ? this.hitLocation_ : this.hitLocationBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.entityId_ = this.entityIdBuilder_ == null ? this.entityId_ : this.entityIdBuilder_.build();
            var3 |= 2;
         }

         EntityHit var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public EntityHit.Builder clone() {
         return (EntityHit.Builder)super.clone();
      }

      public EntityHit.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EntityHit.Builder)super.setField(var1, var2);
      }

      public EntityHit.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EntityHit.Builder)super.clearField(var1);
      }

      public EntityHit.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EntityHit.Builder)super.clearOneof(var1);
      }

      public EntityHit.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EntityHit.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EntityHit.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EntityHit.Builder)super.addRepeatedField(var1, var2);
      }

      public EntityHit.Builder mergeFrom(Message var1) {
         if (var1 instanceof EntityHit) {
            return this.mergeFrom((EntityHit)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EntityHit.Builder mergeFrom(EntityHit var1) {
         if (var1 == EntityHit.getDefaultInstance()) {
            return this;
         }

         if (var1.hasHitLocation()) {
            this.mergeHitLocation(var1.getHitLocation());
         }

         if (var1.hasEntityId()) {
            this.mergeEntityId(var1.getEntityId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public EntityHit.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getHitLocationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getEntityIdFieldBuilder().getBuilder(), var2);
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
      public boolean hasHitLocation() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Location getHitLocation() {
         if (this.hitLocationBuilder_ == null) {
            return this.hitLocation_ == null ? Location.getDefaultInstance() : this.hitLocation_;
         } else {
            return this.hitLocationBuilder_.getMessage();
         }
      }

      public EntityHit.Builder setHitLocation(Location var1) {
         if (this.hitLocationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.hitLocation_ = var1;
         } else {
            this.hitLocationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public EntityHit.Builder setHitLocation(Location.Builder var1) {
         if (this.hitLocationBuilder_ == null) {
            this.hitLocation_ = var1.build();
         } else {
            this.hitLocationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public EntityHit.Builder mergeHitLocation(Location var1) {
         if (this.hitLocationBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.hitLocation_ != null && this.hitLocation_ != Location.getDefaultInstance()) {
               this.getHitLocationBuilder().mergeFrom(var1);
            } else {
               this.hitLocation_ = var1;
            }
         } else {
            this.hitLocationBuilder_.mergeFrom(var1);
         }

         if (this.hitLocation_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public EntityHit.Builder clearHitLocation() {
         this.bitField0_ &= -2;
         this.hitLocation_ = null;
         if (this.hitLocationBuilder_ != null) {
            this.hitLocationBuilder_.dispose();
            this.hitLocationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Location.Builder getHitLocationBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getHitLocationFieldBuilder().getBuilder();
      }

      @Override
      public LocationOrBuilder getHitLocationOrBuilder() {
         if (this.hitLocationBuilder_ != null) {
            return this.hitLocationBuilder_.getMessageOrBuilder();
         } else {
            return this.hitLocation_ == null ? Location.getDefaultInstance() : this.hitLocation_;
         }
      }

      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> getHitLocationFieldBuilder() {
         if (this.hitLocationBuilder_ == null) {
            this.hitLocationBuilder_ = new SingleFieldBuilderV3<>(this.getHitLocation(), this.getParentForChildren(), this.isClean());
            this.hitLocation_ = null;
         }

         return this.hitLocationBuilder_;
      }

      @Override
      public boolean hasEntityId() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public EntityId getEntityId() {
         if (this.entityIdBuilder_ == null) {
            return this.entityId_ == null ? EntityId.getDefaultInstance() : this.entityId_;
         } else {
            return this.entityIdBuilder_.getMessage();
         }
      }

      public EntityHit.Builder setEntityId(EntityId var1) {
         if (this.entityIdBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.entityId_ = var1;
         } else {
            this.entityIdBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public EntityHit.Builder setEntityId(EntityId.Builder var1) {
         if (this.entityIdBuilder_ == null) {
            this.entityId_ = var1.build();
         } else {
            this.entityIdBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public EntityHit.Builder mergeEntityId(EntityId var1) {
         if (this.entityIdBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.entityId_ != null && this.entityId_ != EntityId.getDefaultInstance()) {
               this.getEntityIdBuilder().mergeFrom(var1);
            } else {
               this.entityId_ = var1;
            }
         } else {
            this.entityIdBuilder_.mergeFrom(var1);
         }

         if (this.entityId_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public EntityHit.Builder clearEntityId() {
         this.bitField0_ &= -3;
         this.entityId_ = null;
         if (this.entityIdBuilder_ != null) {
            this.entityIdBuilder_.dispose();
            this.entityIdBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public EntityId.Builder getEntityIdBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getEntityIdFieldBuilder().getBuilder();
      }

      @Override
      public EntityIdOrBuilder getEntityIdOrBuilder() {
         if (this.entityIdBuilder_ != null) {
            return this.entityIdBuilder_.getMessageOrBuilder();
         } else {
            return this.entityId_ == null ? EntityId.getDefaultInstance() : this.entityId_;
         }
      }

      private SingleFieldBuilderV3<EntityId, EntityId.Builder, EntityIdOrBuilder> getEntityIdFieldBuilder() {
         if (this.entityIdBuilder_ == null) {
            this.entityIdBuilder_ = new SingleFieldBuilderV3<>(this.getEntityId(), this.getParentForChildren(), this.isClean());
            this.entityId_ = null;
         }

         return this.entityIdBuilder_;
      }

      public final EntityHit.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EntityHit.Builder)super.setUnknownFields(var1);
      }

      public final EntityHit.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EntityHit.Builder)super.mergeUnknownFields(var1);
      }
   }
}
