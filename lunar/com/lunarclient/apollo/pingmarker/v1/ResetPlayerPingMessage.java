package com.lunarclient.apollo.pingmarker.v1;

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

public final class ResetPlayerPingMessage extends GeneratedMessageV3 implements ResetPlayerPingMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final ResetPlayerPingMessage DEFAULT_INSTANCE = new ResetPlayerPingMessage();
   private static final Parser<ResetPlayerPingMessage> PARSER = new AbstractParser<ResetPlayerPingMessage>() {
      public ResetPlayerPingMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ResetPlayerPingMessage.Builder var3 = ResetPlayerPingMessage.newBuilder();

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

   private ResetPlayerPingMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ResetPlayerPingMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ResetPlayerPingMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_ResetPlayerPingMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_ResetPlayerPingMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ResetPlayerPingMessage.class, ResetPlayerPingMessage.Builder.class);
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

      if (!(var1 instanceof ResetPlayerPingMessage)) {
         return super.equals(var1);
      }

      ResetPlayerPingMessage var2 = (ResetPlayerPingMessage)var1;
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

   public static ResetPlayerPingMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetPlayerPingMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetPlayerPingMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetPlayerPingMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetPlayerPingMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetPlayerPingMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetPlayerPingMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetPlayerPingMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ResetPlayerPingMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ResetPlayerPingMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ResetPlayerPingMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetPlayerPingMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ResetPlayerPingMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ResetPlayerPingMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ResetPlayerPingMessage.Builder newBuilder(ResetPlayerPingMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ResetPlayerPingMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ResetPlayerPingMessage.Builder() : new ResetPlayerPingMessage.Builder().mergeFrom(this);
   }

   protected ResetPlayerPingMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ResetPlayerPingMessage.Builder(var1);
   }

   public static ResetPlayerPingMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ResetPlayerPingMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ResetPlayerPingMessage> getParserForType() {
      return PARSER;
   }

   public ResetPlayerPingMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ResetPlayerPingMessage.Builder> implements ResetPlayerPingMessageOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_ResetPlayerPingMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_ResetPlayerPingMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ResetPlayerPingMessage.class, ResetPlayerPingMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ResetPlayerPingMessage.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_ResetPlayerPingMessage_descriptor;
      }

      public ResetPlayerPingMessage getDefaultInstanceForType() {
         return ResetPlayerPingMessage.getDefaultInstance();
      }

      public ResetPlayerPingMessage build() {
         ResetPlayerPingMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ResetPlayerPingMessage buildPartial() {
         ResetPlayerPingMessage var1 = new ResetPlayerPingMessage(this);
         this.onBuilt();
         return var1;
      }

      public ResetPlayerPingMessage.Builder clone() {
         return (ResetPlayerPingMessage.Builder)super.clone();
      }

      public ResetPlayerPingMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetPlayerPingMessage.Builder)super.setField(var1, var2);
      }

      public ResetPlayerPingMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ResetPlayerPingMessage.Builder)super.clearField(var1);
      }

      public ResetPlayerPingMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ResetPlayerPingMessage.Builder)super.clearOneof(var1);
      }

      public ResetPlayerPingMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ResetPlayerPingMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ResetPlayerPingMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetPlayerPingMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public ResetPlayerPingMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ResetPlayerPingMessage) {
            return this.mergeFrom((ResetPlayerPingMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ResetPlayerPingMessage.Builder mergeFrom(ResetPlayerPingMessage var1) {
         if (var1 == ResetPlayerPingMessage.getDefaultInstance()) {
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

      public ResetPlayerPingMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final ResetPlayerPingMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ResetPlayerPingMessage.Builder)super.setUnknownFields(var1);
      }

      public final ResetPlayerPingMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ResetPlayerPingMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
