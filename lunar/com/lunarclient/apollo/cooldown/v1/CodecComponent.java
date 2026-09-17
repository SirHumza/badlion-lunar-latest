package com.lunarclient.apollo.cooldown.v1;

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

public final class ResetCooldownsMessage extends GeneratedMessageV3 implements ResetCooldownsMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final ResetCooldownsMessage DEFAULT_INSTANCE = new ResetCooldownsMessage();
   private static final Parser<ResetCooldownsMessage> PARSER = new AbstractParser<ResetCooldownsMessage>() {
      public ResetCooldownsMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ResetCooldownsMessage.Builder var3 = ResetCooldownsMessage.newBuilder();

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

   private ResetCooldownsMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ResetCooldownsMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ResetCooldownsMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_cooldown_v1_ResetCooldownsMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_cooldown_v1_ResetCooldownsMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ResetCooldownsMessage.class, ResetCooldownsMessage.Builder.class);
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
      this.getUnknownFields().writeTo(var1);
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      int var2 = 0;
      var2 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var2;
      return var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof ResetCooldownsMessage)) {
         return super.equals(var1);
      }

      ResetCooldownsMessage var2 = (ResetCooldownsMessage)var1;
      return this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ResetCooldownsMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetCooldownsMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetCooldownsMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetCooldownsMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetCooldownsMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetCooldownsMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetCooldownsMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetCooldownsMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ResetCooldownsMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ResetCooldownsMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ResetCooldownsMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetCooldownsMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ResetCooldownsMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ResetCooldownsMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ResetCooldownsMessage.Builder newBuilder(ResetCooldownsMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ResetCooldownsMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ResetCooldownsMessage.Builder() : new ResetCooldownsMessage.Builder().mergeFrom(this);
   }

   protected ResetCooldownsMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ResetCooldownsMessage.Builder(var1);
   }

   public static ResetCooldownsMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ResetCooldownsMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ResetCooldownsMessage> getParserForType() {
      return PARSER;
   }

   public ResetCooldownsMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ResetCooldownsMessage.Builder> implements ResetCooldownsMessageOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_cooldown_v1_ResetCooldownsMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_cooldown_v1_ResetCooldownsMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ResetCooldownsMessage.class, ResetCooldownsMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ResetCooldownsMessage.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_cooldown_v1_ResetCooldownsMessage_descriptor;
      }

      public ResetCooldownsMessage getDefaultInstanceForType() {
         return ResetCooldownsMessage.getDefaultInstance();
      }

      public ResetCooldownsMessage build() {
         ResetCooldownsMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ResetCooldownsMessage buildPartial() {
         ResetCooldownsMessage var1 = new ResetCooldownsMessage(this);
         this.onBuilt();
         return var1;
      }

      public ResetCooldownsMessage.Builder clone() {
         return (ResetCooldownsMessage.Builder)super.clone();
      }

      public ResetCooldownsMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetCooldownsMessage.Builder)super.setField(var1, var2);
      }

      public ResetCooldownsMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ResetCooldownsMessage.Builder)super.clearField(var1);
      }

      public ResetCooldownsMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ResetCooldownsMessage.Builder)super.clearOneof(var1);
      }

      public ResetCooldownsMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ResetCooldownsMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ResetCooldownsMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetCooldownsMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public ResetCooldownsMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ResetCooldownsMessage) {
            return this.mergeFrom((ResetCooldownsMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ResetCooldownsMessage.Builder mergeFrom(ResetCooldownsMessage var1) {
         if (var1 == ResetCooldownsMessage.getDefaultInstance()) {
            return this;
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ResetCooldownsMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final ResetCooldownsMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ResetCooldownsMessage.Builder)super.setUnknownFields(var1);
      }

      public final ResetCooldownsMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ResetCooldownsMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
