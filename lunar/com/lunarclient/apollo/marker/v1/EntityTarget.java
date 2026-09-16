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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class EntityTarget extends GeneratedMessageV3 implements EntityTargetOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int ENTITY_TYPE_FIELD_NUMBER = 1;
   private volatile Object entityType_ = "";
   private byte memoizedIsInitialized = -1;
   private static final EntityTarget DEFAULT_INSTANCE = new EntityTarget();
   private static final Parser<EntityTarget> PARSER = new AbstractParser<EntityTarget>() {
      public EntityTarget parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EntityTarget.Builder var3 = EntityTarget.newBuilder();

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

   private EntityTarget(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EntityTarget() {
      this.entityType_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EntityTarget();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_marker_v1_EntityTarget_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_marker_v1_EntityTarget_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EntityTarget.class, EntityTarget.Builder.class);
   }

   @Override
   public String getEntityType() {
      Object var1 = this.entityType_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.entityType_ = var3;
      return var3;
   }

   @Override
   public ByteString getEntityTypeBytes() {
      Object var1 = this.entityType_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.entityType_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.entityType_)) {
         GeneratedMessageV3.writeString(var1, 1, this.entityType_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.entityType_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.entityType_);
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

      if (!(var1 instanceof EntityTarget)) {
         return super.equals(var1);
      }

      EntityTarget var2 = (EntityTarget)var1;
      return !this.getEntityType().equals(var2.getEntityType()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getEntityType().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EntityTarget parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EntityTarget parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EntityTarget parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EntityTarget parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EntityTarget parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EntityTarget parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EntityTarget parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EntityTarget parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EntityTarget parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EntityTarget parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EntityTarget parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EntityTarget parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EntityTarget.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EntityTarget.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EntityTarget.Builder newBuilder(EntityTarget var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EntityTarget.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EntityTarget.Builder() : new EntityTarget.Builder().mergeFrom(this);
   }

   protected EntityTarget.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EntityTarget.Builder(var1);
   }

   public static EntityTarget getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EntityTarget> parser() {
      return PARSER;
   }

   @Override
   public Parser<EntityTarget> getParserForType() {
      return PARSER;
   }

   public EntityTarget getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EntityTarget.Builder> implements EntityTargetOrBuilder {
      private int bitField0_;
      private Object entityType_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_EntityTarget_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_EntityTarget_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EntityTarget.class, EntityTarget.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public EntityTarget.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.entityType_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_EntityTarget_descriptor;
      }

      public EntityTarget getDefaultInstanceForType() {
         return EntityTarget.getDefaultInstance();
      }

      public EntityTarget build() {
         EntityTarget var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EntityTarget buildPartial() {
         EntityTarget var1 = new EntityTarget(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(EntityTarget var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.entityType_ = this.entityType_;
         }
      }

      public EntityTarget.Builder clone() {
         return (EntityTarget.Builder)super.clone();
      }

      public EntityTarget.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EntityTarget.Builder)super.setField(var1, var2);
      }

      public EntityTarget.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EntityTarget.Builder)super.clearField(var1);
      }

      public EntityTarget.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EntityTarget.Builder)super.clearOneof(var1);
      }

      public EntityTarget.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EntityTarget.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EntityTarget.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EntityTarget.Builder)super.addRepeatedField(var1, var2);
      }

      public EntityTarget.Builder mergeFrom(Message var1) {
         if (var1 instanceof EntityTarget) {
            return this.mergeFrom((EntityTarget)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EntityTarget.Builder mergeFrom(EntityTarget var1) {
         if (var1 == EntityTarget.getDefaultInstance()) {
            return this;
         }

         if (!var1.getEntityType().isEmpty()) {
            this.entityType_ = var1.entityType_;
            this.bitField0_ |= 1;
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

      public EntityTarget.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.entityType_ = var1.readStringRequireUtf8();
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
      public String getEntityType() {
         Object var1 = this.entityType_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.entityType_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getEntityTypeBytes() {
         Object var1 = this.entityType_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.entityType_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public EntityTarget.Builder setEntityType(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.entityType_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public EntityTarget.Builder clearEntityType() {
         this.entityType_ = EntityTarget.getDefaultInstance().getEntityType();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public EntityTarget.Builder setEntityTypeBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         EntityTarget.checkByteStringIsUtf8(var1);
         this.entityType_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final EntityTarget.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EntityTarget.Builder)super.setUnknownFields(var1);
      }

      public final EntityTarget.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EntityTarget.Builder)super.mergeUnknownFields(var1);
      }
   }
}
