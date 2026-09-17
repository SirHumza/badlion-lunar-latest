package com.lunarclient.apollo.coloredfire.v1;

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

public final class ResetColoredFiresMessage extends GeneratedMessageV3 implements ResetColoredFiresMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final ResetColoredFiresMessage DEFAULT_INSTANCE = new ResetColoredFiresMessage();
   private static final Parser<ResetColoredFiresMessage> PARSER = new AbstractParser<ResetColoredFiresMessage>() {
      public ResetColoredFiresMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ResetColoredFiresMessage.Builder var3 = ResetColoredFiresMessage.newBuilder();

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

   private ResetColoredFiresMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ResetColoredFiresMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ResetColoredFiresMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_coloredfire_v1_ResetColoredFiresMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_coloredfire_v1_ResetColoredFiresMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ResetColoredFiresMessage.class, ResetColoredFiresMessage.Builder.class);
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

      if (!(var1 instanceof ResetColoredFiresMessage)) {
         return super.equals(var1);
      }

      ResetColoredFiresMessage var2 = (ResetColoredFiresMessage)var1;
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

   public static ResetColoredFiresMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetColoredFiresMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetColoredFiresMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetColoredFiresMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetColoredFiresMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetColoredFiresMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetColoredFiresMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetColoredFiresMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ResetColoredFiresMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ResetColoredFiresMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ResetColoredFiresMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetColoredFiresMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ResetColoredFiresMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ResetColoredFiresMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ResetColoredFiresMessage.Builder newBuilder(ResetColoredFiresMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ResetColoredFiresMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ResetColoredFiresMessage.Builder() : new ResetColoredFiresMessage.Builder().mergeFrom(this);
   }

   protected ResetColoredFiresMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ResetColoredFiresMessage.Builder(var1);
   }

   public static ResetColoredFiresMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ResetColoredFiresMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ResetColoredFiresMessage> getParserForType() {
      return PARSER;
   }

   public ResetColoredFiresMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ResetColoredFiresMessage.Builder> implements ResetColoredFiresMessageOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_coloredfire_v1_ResetColoredFiresMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_coloredfire_v1_ResetColoredFiresMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ResetColoredFiresMessage.class, ResetColoredFiresMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ResetColoredFiresMessage.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_coloredfire_v1_ResetColoredFiresMessage_descriptor;
      }

      public ResetColoredFiresMessage getDefaultInstanceForType() {
         return ResetColoredFiresMessage.getDefaultInstance();
      }

      public ResetColoredFiresMessage build() {
         ResetColoredFiresMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ResetColoredFiresMessage buildPartial() {
         ResetColoredFiresMessage var1 = new ResetColoredFiresMessage(this);
         this.onBuilt();
         return var1;
      }

      public ResetColoredFiresMessage.Builder clone() {
         return (ResetColoredFiresMessage.Builder)super.clone();
      }

      public ResetColoredFiresMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetColoredFiresMessage.Builder)super.setField(var1, var2);
      }

      public ResetColoredFiresMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ResetColoredFiresMessage.Builder)super.clearField(var1);
      }

      public ResetColoredFiresMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ResetColoredFiresMessage.Builder)super.clearOneof(var1);
      }

      public ResetColoredFiresMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ResetColoredFiresMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ResetColoredFiresMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetColoredFiresMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public ResetColoredFiresMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ResetColoredFiresMessage) {
            return this.mergeFrom((ResetColoredFiresMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ResetColoredFiresMessage.Builder mergeFrom(ResetColoredFiresMessage var1) {
         if (var1 == ResetColoredFiresMessage.getDefaultInstance()) {
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

      public ResetColoredFiresMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final ResetColoredFiresMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ResetColoredFiresMessage.Builder)super.setUnknownFields(var1);
      }

      public final ResetColoredFiresMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ResetColoredFiresMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
