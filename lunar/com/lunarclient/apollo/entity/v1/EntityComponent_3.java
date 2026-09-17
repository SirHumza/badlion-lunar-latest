package com.lunarclient.apollo.entity.v1;

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
import com.lunarclient.apollo.common.v1.EntityId;
import com.lunarclient.apollo.common.v1.EntityIdOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ResetRainbowSheepMessage extends GeneratedMessageV3 implements ResetRainbowSheepMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int ENTITY_IDS_FIELD_NUMBER = 1;
   private List<EntityId> entityIds_;
   private byte memoizedIsInitialized = -1;
   private static final ResetRainbowSheepMessage DEFAULT_INSTANCE = new ResetRainbowSheepMessage();
   private static final Parser<ResetRainbowSheepMessage> PARSER = new AbstractParser<ResetRainbowSheepMessage>() {
      public ResetRainbowSheepMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ResetRainbowSheepMessage.Builder var3 = ResetRainbowSheepMessage.newBuilder();

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

   private ResetRainbowSheepMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ResetRainbowSheepMessage() {
      this.entityIds_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ResetRainbowSheepMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_entity_v1_ResetRainbowSheepMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_entity_v1_ResetRainbowSheepMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ResetRainbowSheepMessage.class, ResetRainbowSheepMessage.Builder.class);
   }

   @Override
   public List<EntityId> getEntityIdsList() {
      return this.entityIds_;
   }

   @Override
   public List<? extends EntityIdOrBuilder> getEntityIdsOrBuilderList() {
      return this.entityIds_;
   }

   @Override
   public int getEntityIdsCount() {
      return this.entityIds_.size();
   }

   @Override
   public EntityId getEntityIds(int var1) {
      return this.entityIds_.get(var1);
   }

   @Override
   public EntityIdOrBuilder getEntityIdsOrBuilder(int var1) {
      return this.entityIds_.get(var1);
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
      for (int var2 = 0; var2 < this.entityIds_.size(); var2++) {
         var1.writeMessage(1, this.entityIds_.get(var2));
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

      for (int var2 = 0; var2 < this.entityIds_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.entityIds_.get(var2));
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

      if (!(var1 instanceof ResetRainbowSheepMessage)) {
         return super.equals(var1);
      }

      ResetRainbowSheepMessage var2 = (ResetRainbowSheepMessage)var1;
      return !this.getEntityIdsList().equals(var2.getEntityIdsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getEntityIdsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getEntityIdsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ResetRainbowSheepMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetRainbowSheepMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetRainbowSheepMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetRainbowSheepMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetRainbowSheepMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetRainbowSheepMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetRainbowSheepMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetRainbowSheepMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ResetRainbowSheepMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ResetRainbowSheepMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ResetRainbowSheepMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetRainbowSheepMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ResetRainbowSheepMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ResetRainbowSheepMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ResetRainbowSheepMessage.Builder newBuilder(ResetRainbowSheepMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ResetRainbowSheepMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ResetRainbowSheepMessage.Builder() : new ResetRainbowSheepMessage.Builder().mergeFrom(this);
   }

   protected ResetRainbowSheepMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ResetRainbowSheepMessage.Builder(var1);
   }

   public static ResetRainbowSheepMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ResetRainbowSheepMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ResetRainbowSheepMessage> getParserForType() {
      return PARSER;
   }

   public ResetRainbowSheepMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ResetRainbowSheepMessage.Builder> implements ResetRainbowSheepMessageOrBuilder {
      private int bitField0_;
      private List<EntityId> entityIds_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<EntityId, EntityId.Builder, EntityIdOrBuilder> entityIdsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_entity_v1_ResetRainbowSheepMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_entity_v1_ResetRainbowSheepMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ResetRainbowSheepMessage.class, ResetRainbowSheepMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ResetRainbowSheepMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.entityIdsBuilder_ == null) {
            this.entityIds_ = Collections.emptyList();
         } else {
            this.entityIds_ = null;
            this.entityIdsBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_entity_v1_ResetRainbowSheepMessage_descriptor;
      }

      public ResetRainbowSheepMessage getDefaultInstanceForType() {
         return ResetRainbowSheepMessage.getDefaultInstance();
      }

      public ResetRainbowSheepMessage build() {
         ResetRainbowSheepMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ResetRainbowSheepMessage buildPartial() {
         ResetRainbowSheepMessage var1 = new ResetRainbowSheepMessage(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(ResetRainbowSheepMessage var1) {
         if (this.entityIdsBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.entityIds_ = Collections.unmodifiableList(this.entityIds_);
               this.bitField0_ &= -2;
            }

            var1.entityIds_ = this.entityIds_;
         } else {
            var1.entityIds_ = this.entityIdsBuilder_.build();
         }
      }

      private void buildPartial0(ResetRainbowSheepMessage var1) {
         int var2 = this.bitField0_;
      }

      public ResetRainbowSheepMessage.Builder clone() {
         return (ResetRainbowSheepMessage.Builder)super.clone();
      }

      public ResetRainbowSheepMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetRainbowSheepMessage.Builder)super.setField(var1, var2);
      }

      public ResetRainbowSheepMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ResetRainbowSheepMessage.Builder)super.clearField(var1);
      }

      public ResetRainbowSheepMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ResetRainbowSheepMessage.Builder)super.clearOneof(var1);
      }

      public ResetRainbowSheepMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ResetRainbowSheepMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ResetRainbowSheepMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetRainbowSheepMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public ResetRainbowSheepMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ResetRainbowSheepMessage) {
            return this.mergeFrom((ResetRainbowSheepMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ResetRainbowSheepMessage.Builder mergeFrom(ResetRainbowSheepMessage var1) {
         if (var1 == ResetRainbowSheepMessage.getDefaultInstance()) {
            return this;
         }

         if (this.entityIdsBuilder_ == null) {
            if (!var1.entityIds_.isEmpty()) {
               if (this.entityIds_.isEmpty()) {
                  this.entityIds_ = var1.entityIds_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureEntityIdsIsMutable();
                  this.entityIds_.addAll(var1.entityIds_);
               }

               this.onChanged();
            }
         } else if (!var1.entityIds_.isEmpty()) {
            if (this.entityIdsBuilder_.isEmpty()) {
               this.entityIdsBuilder_.dispose();
               this.entityIdsBuilder_ = null;
               this.entityIds_ = var1.entityIds_;
               this.bitField0_ &= -2;
               this.entityIdsBuilder_ = ResetRainbowSheepMessage.alwaysUseFieldBuilders ? this.getEntityIdsFieldBuilder() : null;
            } else {
               this.entityIdsBuilder_.addAllMessages(var1.entityIds_);
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

      public ResetRainbowSheepMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     EntityId var5 = var1.readMessage(EntityId.parser(), var2);
                     if (this.entityIdsBuilder_ == null) {
                        this.ensureEntityIdsIsMutable();
                        this.entityIds_.add(var5);
                     } else {
                        this.entityIdsBuilder_.addMessage(var5);
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

      private void ensureEntityIdsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.entityIds_ = new ArrayList<>(this.entityIds_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<EntityId> getEntityIdsList() {
         return this.entityIdsBuilder_ == null ? Collections.unmodifiableList(this.entityIds_) : this.entityIdsBuilder_.getMessageList();
      }

      @Override
      public int getEntityIdsCount() {
         return this.entityIdsBuilder_ == null ? this.entityIds_.size() : this.entityIdsBuilder_.getCount();
      }

      @Override
      public EntityId getEntityIds(int var1) {
         return this.entityIdsBuilder_ == null ? this.entityIds_.get(var1) : this.entityIdsBuilder_.getMessage(var1);
      }

      public ResetRainbowSheepMessage.Builder setEntityIds(int var1, EntityId var2) {
         if (this.entityIdsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureEntityIdsIsMutable();
            this.entityIds_.set(var1, var2);
            this.onChanged();
         } else {
            this.entityIdsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public ResetRainbowSheepMessage.Builder setEntityIds(int var1, EntityId.Builder var2) {
         if (this.entityIdsBuilder_ == null) {
            this.ensureEntityIdsIsMutable();
            this.entityIds_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.entityIdsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public ResetRainbowSheepMessage.Builder addEntityIds(EntityId var1) {
         if (this.entityIdsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureEntityIdsIsMutable();
            this.entityIds_.add(var1);
            this.onChanged();
         } else {
            this.entityIdsBuilder_.addMessage(var1);
         }

         return this;
      }

      public ResetRainbowSheepMessage.Builder addEntityIds(int var1, EntityId var2) {
         if (this.entityIdsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureEntityIdsIsMutable();
            this.entityIds_.add(var1, var2);
            this.onChanged();
         } else {
            this.entityIdsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public ResetRainbowSheepMessage.Builder addEntityIds(EntityId.Builder var1) {
         if (this.entityIdsBuilder_ == null) {
            this.ensureEntityIdsIsMutable();
            this.entityIds_.add(var1.build());
            this.onChanged();
         } else {
            this.entityIdsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public ResetRainbowSheepMessage.Builder addEntityIds(int var1, EntityId.Builder var2) {
         if (this.entityIdsBuilder_ == null) {
            this.ensureEntityIdsIsMutable();
            this.entityIds_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.entityIdsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public ResetRainbowSheepMessage.Builder addAllEntityIds(Iterable<? extends EntityId> var1) {
         if (this.entityIdsBuilder_ == null) {
            this.ensureEntityIdsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.entityIds_);
            this.onChanged();
         } else {
            this.entityIdsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public ResetRainbowSheepMessage.Builder clearEntityIds() {
         if (this.entityIdsBuilder_ == null) {
            this.entityIds_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.entityIdsBuilder_.clear();
         }

         return this;
      }

      public ResetRainbowSheepMessage.Builder removeEntityIds(int var1) {
         if (this.entityIdsBuilder_ == null) {
            this.ensureEntityIdsIsMutable();
            this.entityIds_.remove(var1);
            this.onChanged();
         } else {
            this.entityIdsBuilder_.remove(var1);
         }

         return this;
      }

      public EntityId.Builder getEntityIdsBuilder(int var1) {
         return this.getEntityIdsFieldBuilder().getBuilder(var1);
      }

      @Override
      public EntityIdOrBuilder getEntityIdsOrBuilder(int var1) {
         return this.entityIdsBuilder_ == null ? this.entityIds_.get(var1) : this.entityIdsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends EntityIdOrBuilder> getEntityIdsOrBuilderList() {
         return this.entityIdsBuilder_ != null ? this.entityIdsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.entityIds_);
      }

      public EntityId.Builder addEntityIdsBuilder() {
         return this.getEntityIdsFieldBuilder().addBuilder(EntityId.getDefaultInstance());
      }

      public EntityId.Builder addEntityIdsBuilder(int var1) {
         return this.getEntityIdsFieldBuilder().addBuilder(var1, EntityId.getDefaultInstance());
      }

      public List<EntityId.Builder> getEntityIdsBuilderList() {
         return this.getEntityIdsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<EntityId, EntityId.Builder, EntityIdOrBuilder> getEntityIdsFieldBuilder() {
         if (this.entityIdsBuilder_ == null) {
            this.entityIdsBuilder_ = new RepeatedFieldBuilderV3<>(this.entityIds_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.entityIds_ = null;
         }

         return this.entityIdsBuilder_;
      }

      public final ResetRainbowSheepMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ResetRainbowSheepMessage.Builder)super.setUnknownFields(var1);
      }

      public final ResetRainbowSheepMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ResetRainbowSheepMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
