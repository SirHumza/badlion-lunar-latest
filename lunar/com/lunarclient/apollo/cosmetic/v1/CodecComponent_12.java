package com.lunarclient.apollo.cosmetic.v1;

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
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ResetNpcCosmeticsMessage extends GeneratedMessageV3 implements ResetNpcCosmeticsMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int NPC_UUID_FIELD_NUMBER = 1;
   private Uuid npcUuid_;
   private byte memoizedIsInitialized = -1;
   private static final ResetNpcCosmeticsMessage DEFAULT_INSTANCE = new ResetNpcCosmeticsMessage();
   private static final Parser<ResetNpcCosmeticsMessage> PARSER = new AbstractParser<ResetNpcCosmeticsMessage>() {
      public ResetNpcCosmeticsMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ResetNpcCosmeticsMessage.Builder var3 = ResetNpcCosmeticsMessage.newBuilder();

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

   private ResetNpcCosmeticsMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ResetNpcCosmeticsMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ResetNpcCosmeticsMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_ResetNpcCosmeticsMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_ResetNpcCosmeticsMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ResetNpcCosmeticsMessage.class, ResetNpcCosmeticsMessage.Builder.class);
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

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ResetNpcCosmeticsMessage)) {
         return super.equals(var1);
      } else {
         ResetNpcCosmeticsMessage var2 = (ResetNpcCosmeticsMessage)var1;
         if (this.hasNpcUuid() != var2.hasNpcUuid()) {
            return false;
         } else {
            return this.hasNpcUuid() && !this.getNpcUuid().equals(var2.getNpcUuid()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ResetNpcCosmeticsMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetNpcCosmeticsMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetNpcCosmeticsMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetNpcCosmeticsMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetNpcCosmeticsMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetNpcCosmeticsMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetNpcCosmeticsMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetNpcCosmeticsMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ResetNpcCosmeticsMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ResetNpcCosmeticsMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ResetNpcCosmeticsMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetNpcCosmeticsMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ResetNpcCosmeticsMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ResetNpcCosmeticsMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ResetNpcCosmeticsMessage.Builder newBuilder(ResetNpcCosmeticsMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ResetNpcCosmeticsMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ResetNpcCosmeticsMessage.Builder() : new ResetNpcCosmeticsMessage.Builder().mergeFrom(this);
   }

   protected ResetNpcCosmeticsMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ResetNpcCosmeticsMessage.Builder(var1);
   }

   public static ResetNpcCosmeticsMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ResetNpcCosmeticsMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ResetNpcCosmeticsMessage> getParserForType() {
      return PARSER;
   }

   public ResetNpcCosmeticsMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ResetNpcCosmeticsMessage.Builder> implements ResetNpcCosmeticsMessageOrBuilder {
      private int bitField0_;
      private Uuid npcUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> npcUuidBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_ResetNpcCosmeticsMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_ResetNpcCosmeticsMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ResetNpcCosmeticsMessage.class, ResetNpcCosmeticsMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ResetNpcCosmeticsMessage.alwaysUseFieldBuilders) {
            this.getNpcUuidFieldBuilder();
         }
      }

      public ResetNpcCosmeticsMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.npcUuid_ = null;
         if (this.npcUuidBuilder_ != null) {
            this.npcUuidBuilder_.dispose();
            this.npcUuidBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_ResetNpcCosmeticsMessage_descriptor;
      }

      public ResetNpcCosmeticsMessage getDefaultInstanceForType() {
         return ResetNpcCosmeticsMessage.getDefaultInstance();
      }

      public ResetNpcCosmeticsMessage build() {
         ResetNpcCosmeticsMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ResetNpcCosmeticsMessage buildPartial() {
         ResetNpcCosmeticsMessage var1 = new ResetNpcCosmeticsMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ResetNpcCosmeticsMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.npcUuid_ = this.npcUuidBuilder_ == null ? this.npcUuid_ : this.npcUuidBuilder_.build();
            var3 |= 1;
         }

         ResetNpcCosmeticsMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ResetNpcCosmeticsMessage.Builder clone() {
         return (ResetNpcCosmeticsMessage.Builder)super.clone();
      }

      public ResetNpcCosmeticsMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetNpcCosmeticsMessage.Builder)super.setField(var1, var2);
      }

      public ResetNpcCosmeticsMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ResetNpcCosmeticsMessage.Builder)super.clearField(var1);
      }

      public ResetNpcCosmeticsMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ResetNpcCosmeticsMessage.Builder)super.clearOneof(var1);
      }

      public ResetNpcCosmeticsMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ResetNpcCosmeticsMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ResetNpcCosmeticsMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetNpcCosmeticsMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public ResetNpcCosmeticsMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ResetNpcCosmeticsMessage) {
            return this.mergeFrom((ResetNpcCosmeticsMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ResetNpcCosmeticsMessage.Builder mergeFrom(ResetNpcCosmeticsMessage var1) {
         if (var1 == ResetNpcCosmeticsMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.hasNpcUuid()) {
            this.mergeNpcUuid(var1.getNpcUuid());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ResetNpcCosmeticsMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public ResetNpcCosmeticsMessage.Builder setNpcUuid(Uuid var1) {
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

      public ResetNpcCosmeticsMessage.Builder setNpcUuid(Uuid.Builder var1) {
         if (this.npcUuidBuilder_ == null) {
            this.npcUuid_ = var1.build();
         } else {
            this.npcUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ResetNpcCosmeticsMessage.Builder mergeNpcUuid(Uuid var1) {
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

      public ResetNpcCosmeticsMessage.Builder clearNpcUuid() {
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

      public final ResetNpcCosmeticsMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ResetNpcCosmeticsMessage.Builder)super.setUnknownFields(var1);
      }

      public final ResetNpcCosmeticsMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ResetNpcCosmeticsMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
