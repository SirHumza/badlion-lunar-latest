package com.lunarclient.apollo.tntcountdown.v1;

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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class SetTntCountdownMessage extends GeneratedMessageV3 implements SetTntCountdownMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ENTITY_ID_FIELD_NUMBER = 1;
   private EntityId entityId_;
   public static final int DURATION_TICKS_FIELD_NUMBER = 2;
   private int durationTicks_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final SetTntCountdownMessage DEFAULT_INSTANCE = new SetTntCountdownMessage();
   private static final Parser<SetTntCountdownMessage> PARSER = new AbstractParser<SetTntCountdownMessage>() {
      public SetTntCountdownMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SetTntCountdownMessage.Builder var3 = SetTntCountdownMessage.newBuilder();

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

   private SetTntCountdownMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SetTntCountdownMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SetTntCountdownMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_tntcountdown_v1_SetTntCountdownMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_tntcountdown_v1_SetTntCountdownMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SetTntCountdownMessage.class, SetTntCountdownMessage.Builder.class);
   }

   @Override
   public boolean hasEntityId() {
      return (this.bitField0_ & 1) != 0;
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
   public int getDurationTicks() {
      return this.durationTicks_;
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
         var1.writeMessage(1, this.getEntityId());
      }

      if (this.durationTicks_ != 0) {
         var1.writeInt32(2, this.durationTicks_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getEntityId());
      }

      if (this.durationTicks_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.durationTicks_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SetTntCountdownMessage)) {
         return super.equals(var1);
      } else {
         SetTntCountdownMessage var2 = (SetTntCountdownMessage)var1;
         if (this.hasEntityId() != var2.hasEntityId()) {
            return false;
         } else if (this.hasEntityId() && !this.getEntityId().equals(var2.getEntityId())) {
            return false;
         } else {
            return this.getDurationTicks() != var2.getDurationTicks() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasEntityId()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getEntityId().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getDurationTicks();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SetTntCountdownMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetTntCountdownMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetTntCountdownMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetTntCountdownMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetTntCountdownMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetTntCountdownMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetTntCountdownMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetTntCountdownMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SetTntCountdownMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SetTntCountdownMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SetTntCountdownMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetTntCountdownMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SetTntCountdownMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SetTntCountdownMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SetTntCountdownMessage.Builder newBuilder(SetTntCountdownMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SetTntCountdownMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SetTntCountdownMessage.Builder() : new SetTntCountdownMessage.Builder().mergeFrom(this);
   }

   protected SetTntCountdownMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SetTntCountdownMessage.Builder(var1);
   }

   public static SetTntCountdownMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SetTntCountdownMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<SetTntCountdownMessage> getParserForType() {
      return PARSER;
   }

   public SetTntCountdownMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SetTntCountdownMessage.Builder> implements SetTntCountdownMessageOrBuilder {
      private int bitField0_;
      private EntityId entityId_;
      private SingleFieldBuilderV3<EntityId, EntityId.Builder, EntityIdOrBuilder> entityIdBuilder_;
      private int durationTicks_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_tntcountdown_v1_SetTntCountdownMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_tntcountdown_v1_SetTntCountdownMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SetTntCountdownMessage.class, SetTntCountdownMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (SetTntCountdownMessage.alwaysUseFieldBuilders) {
            this.getEntityIdFieldBuilder();
         }
      }

      public SetTntCountdownMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.entityId_ = null;
         if (this.entityIdBuilder_ != null) {
            this.entityIdBuilder_.dispose();
            this.entityIdBuilder_ = null;
         }

         this.durationTicks_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_tntcountdown_v1_SetTntCountdownMessage_descriptor;
      }

      public SetTntCountdownMessage getDefaultInstanceForType() {
         return SetTntCountdownMessage.getDefaultInstance();
      }

      public SetTntCountdownMessage build() {
         SetTntCountdownMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SetTntCountdownMessage buildPartial() {
         SetTntCountdownMessage var1 = new SetTntCountdownMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SetTntCountdownMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.entityId_ = this.entityIdBuilder_ == null ? this.entityId_ : this.entityIdBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.durationTicks_ = this.durationTicks_;
         }

         SetTntCountdownMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public SetTntCountdownMessage.Builder clone() {
         return (SetTntCountdownMessage.Builder)super.clone();
      }

      public SetTntCountdownMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetTntCountdownMessage.Builder)super.setField(var1, var2);
      }

      public SetTntCountdownMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SetTntCountdownMessage.Builder)super.clearField(var1);
      }

      public SetTntCountdownMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SetTntCountdownMessage.Builder)super.clearOneof(var1);
      }

      public SetTntCountdownMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SetTntCountdownMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SetTntCountdownMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetTntCountdownMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public SetTntCountdownMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof SetTntCountdownMessage) {
            return this.mergeFrom((SetTntCountdownMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SetTntCountdownMessage.Builder mergeFrom(SetTntCountdownMessage var1) {
         if (var1 == SetTntCountdownMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.hasEntityId()) {
            this.mergeEntityId(var1.getEntityId());
         }

         if (var1.getDurationTicks() != 0) {
            this.setDurationTicks(var1.getDurationTicks());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public SetTntCountdownMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getEntityIdFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.durationTicks_ = var1.readInt32();
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
      public boolean hasEntityId() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public EntityId getEntityId() {
         if (this.entityIdBuilder_ == null) {
            return this.entityId_ == null ? EntityId.getDefaultInstance() : this.entityId_;
         } else {
            return this.entityIdBuilder_.getMessage();
         }
      }

      public SetTntCountdownMessage.Builder setEntityId(EntityId var1) {
         if (this.entityIdBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.entityId_ = var1;
         } else {
            this.entityIdBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SetTntCountdownMessage.Builder setEntityId(EntityId.Builder var1) {
         if (this.entityIdBuilder_ == null) {
            this.entityId_ = var1.build();
         } else {
            this.entityIdBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SetTntCountdownMessage.Builder mergeEntityId(EntityId var1) {
         if (this.entityIdBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.entityId_ != null && this.entityId_ != EntityId.getDefaultInstance()) {
               this.getEntityIdBuilder().mergeFrom(var1);
            } else {
               this.entityId_ = var1;
            }
         } else {
            this.entityIdBuilder_.mergeFrom(var1);
         }

         if (this.entityId_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public SetTntCountdownMessage.Builder clearEntityId() {
         this.bitField0_ &= -2;
         this.entityId_ = null;
         if (this.entityIdBuilder_ != null) {
            this.entityIdBuilder_.dispose();
            this.entityIdBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public EntityId.Builder getEntityIdBuilder() {
         this.bitField0_ |= 1;
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

      @Override
      public int getDurationTicks() {
         return this.durationTicks_;
      }

      public SetTntCountdownMessage.Builder setDurationTicks(int var1) {
         this.durationTicks_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public SetTntCountdownMessage.Builder clearDurationTicks() {
         this.bitField0_ &= -3;
         this.durationTicks_ = 0;
         this.onChanged();
         return this;
      }

      public final SetTntCountdownMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SetTntCountdownMessage.Builder)super.setUnknownFields(var1);
      }

      public final SetTntCountdownMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SetTntCountdownMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
