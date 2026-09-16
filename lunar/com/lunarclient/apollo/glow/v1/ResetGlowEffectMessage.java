package com.lunarclient.apollo.glow.v1;

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

public final class ResetGlowEffectMessage extends GeneratedMessageV3 implements ResetGlowEffectMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLAYER_UUID_FIELD_NUMBER = 1;
   private Uuid playerUuid_;
   private byte memoizedIsInitialized = -1;
   private static final ResetGlowEffectMessage DEFAULT_INSTANCE = new ResetGlowEffectMessage();
   private static final Parser<ResetGlowEffectMessage> PARSER = new AbstractParser<ResetGlowEffectMessage>() {
      public ResetGlowEffectMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ResetGlowEffectMessage.Builder var3 = ResetGlowEffectMessage.newBuilder();

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

   private ResetGlowEffectMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ResetGlowEffectMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ResetGlowEffectMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_glow_v1_ResetGlowEffectMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_glow_v1_ResetGlowEffectMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ResetGlowEffectMessage.class, ResetGlowEffectMessage.Builder.class);
   }

   @Override
   public boolean hasPlayerUuid() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getPlayerUuid() {
      return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
   }

   @Override
   public UuidOrBuilder getPlayerUuidOrBuilder() {
      return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
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
         var1.writeMessage(1, this.getPlayerUuid());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getPlayerUuid());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ResetGlowEffectMessage)) {
         return super.equals(var1);
      } else {
         ResetGlowEffectMessage var2 = (ResetGlowEffectMessage)var1;
         if (this.hasPlayerUuid() != var2.hasPlayerUuid()) {
            return false;
         } else {
            return this.hasPlayerUuid() && !this.getPlayerUuid().equals(var2.getPlayerUuid()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasPlayerUuid()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getPlayerUuid().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ResetGlowEffectMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetGlowEffectMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetGlowEffectMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetGlowEffectMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetGlowEffectMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetGlowEffectMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetGlowEffectMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetGlowEffectMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ResetGlowEffectMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ResetGlowEffectMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ResetGlowEffectMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetGlowEffectMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ResetGlowEffectMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ResetGlowEffectMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ResetGlowEffectMessage.Builder newBuilder(ResetGlowEffectMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ResetGlowEffectMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ResetGlowEffectMessage.Builder() : new ResetGlowEffectMessage.Builder().mergeFrom(this);
   }

   protected ResetGlowEffectMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ResetGlowEffectMessage.Builder(var1);
   }

   public static ResetGlowEffectMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ResetGlowEffectMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ResetGlowEffectMessage> getParserForType() {
      return PARSER;
   }

   public ResetGlowEffectMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ResetGlowEffectMessage.Builder> implements ResetGlowEffectMessageOrBuilder {
      private int bitField0_;
      private Uuid playerUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> playerUuidBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_glow_v1_ResetGlowEffectMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_glow_v1_ResetGlowEffectMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ResetGlowEffectMessage.class, ResetGlowEffectMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ResetGlowEffectMessage.alwaysUseFieldBuilders) {
            this.getPlayerUuidFieldBuilder();
         }
      }

      public ResetGlowEffectMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.playerUuid_ = null;
         if (this.playerUuidBuilder_ != null) {
            this.playerUuidBuilder_.dispose();
            this.playerUuidBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_glow_v1_ResetGlowEffectMessage_descriptor;
      }

      public ResetGlowEffectMessage getDefaultInstanceForType() {
         return ResetGlowEffectMessage.getDefaultInstance();
      }

      public ResetGlowEffectMessage build() {
         ResetGlowEffectMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ResetGlowEffectMessage buildPartial() {
         ResetGlowEffectMessage var1 = new ResetGlowEffectMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ResetGlowEffectMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.playerUuid_ = this.playerUuidBuilder_ == null ? this.playerUuid_ : this.playerUuidBuilder_.build();
            var3 |= 1;
         }

         ResetGlowEffectMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ResetGlowEffectMessage.Builder clone() {
         return (ResetGlowEffectMessage.Builder)super.clone();
      }

      public ResetGlowEffectMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetGlowEffectMessage.Builder)super.setField(var1, var2);
      }

      public ResetGlowEffectMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ResetGlowEffectMessage.Builder)super.clearField(var1);
      }

      public ResetGlowEffectMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ResetGlowEffectMessage.Builder)super.clearOneof(var1);
      }

      public ResetGlowEffectMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ResetGlowEffectMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ResetGlowEffectMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetGlowEffectMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public ResetGlowEffectMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ResetGlowEffectMessage) {
            return this.mergeFrom((ResetGlowEffectMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ResetGlowEffectMessage.Builder mergeFrom(ResetGlowEffectMessage var1) {
         if (var1 == ResetGlowEffectMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlayerUuid()) {
            this.mergePlayerUuid(var1.getPlayerUuid());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ResetGlowEffectMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getPlayerUuidFieldBuilder().getBuilder(), var2);
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
      public boolean hasPlayerUuid() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getPlayerUuid() {
         if (this.playerUuidBuilder_ == null) {
            return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
         } else {
            return this.playerUuidBuilder_.getMessage();
         }
      }

      public ResetGlowEffectMessage.Builder setPlayerUuid(Uuid var1) {
         if (this.playerUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.playerUuid_ = var1;
         } else {
            this.playerUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ResetGlowEffectMessage.Builder setPlayerUuid(Uuid.Builder var1) {
         if (this.playerUuidBuilder_ == null) {
            this.playerUuid_ = var1.build();
         } else {
            this.playerUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ResetGlowEffectMessage.Builder mergePlayerUuid(Uuid var1) {
         if (this.playerUuidBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.playerUuid_ != null && this.playerUuid_ != Uuid.getDefaultInstance()) {
               this.getPlayerUuidBuilder().mergeFrom(var1);
            } else {
               this.playerUuid_ = var1;
            }
         } else {
            this.playerUuidBuilder_.mergeFrom(var1);
         }

         if (this.playerUuid_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public ResetGlowEffectMessage.Builder clearPlayerUuid() {
         this.bitField0_ &= -2;
         this.playerUuid_ = null;
         if (this.playerUuidBuilder_ != null) {
            this.playerUuidBuilder_.dispose();
            this.playerUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getPlayerUuidBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getPlayerUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getPlayerUuidOrBuilder() {
         if (this.playerUuidBuilder_ != null) {
            return this.playerUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getPlayerUuidFieldBuilder() {
         if (this.playerUuidBuilder_ == null) {
            this.playerUuidBuilder_ = new SingleFieldBuilderV3<>(this.getPlayerUuid(), this.getParentForChildren(), this.isClean());
            this.playerUuid_ = null;
         }

         return this.playerUuidBuilder_;
      }

      public final ResetGlowEffectMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ResetGlowEffectMessage.Builder)super.setUnknownFields(var1);
      }

      public final ResetGlowEffectMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ResetGlowEffectMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
