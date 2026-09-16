package com.lunarclient.apollo.heightlimit.v1;

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

public final class ResetHeightLimitsMessage extends GeneratedMessageV3 implements ResetHeightLimitsMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final ResetHeightLimitsMessage DEFAULT_INSTANCE = new ResetHeightLimitsMessage();
   private static final Parser<ResetHeightLimitsMessage> PARSER = new AbstractParser<ResetHeightLimitsMessage>() {
      public ResetHeightLimitsMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ResetHeightLimitsMessage.Builder var3 = ResetHeightLimitsMessage.newBuilder();

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

   private ResetHeightLimitsMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ResetHeightLimitsMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ResetHeightLimitsMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_heightlimit_v1_ResetHeightLimitsMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_heightlimit_v1_ResetHeightLimitsMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ResetHeightLimitsMessage.class, ResetHeightLimitsMessage.Builder.class);
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

      if (!(var1 instanceof ResetHeightLimitsMessage)) {
         return super.equals(var1);
      }

      ResetHeightLimitsMessage var2 = (ResetHeightLimitsMessage)var1;
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

   public static ResetHeightLimitsMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetHeightLimitsMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetHeightLimitsMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetHeightLimitsMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetHeightLimitsMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetHeightLimitsMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetHeightLimitsMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetHeightLimitsMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ResetHeightLimitsMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ResetHeightLimitsMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ResetHeightLimitsMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetHeightLimitsMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ResetHeightLimitsMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ResetHeightLimitsMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ResetHeightLimitsMessage.Builder newBuilder(ResetHeightLimitsMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ResetHeightLimitsMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ResetHeightLimitsMessage.Builder() : new ResetHeightLimitsMessage.Builder().mergeFrom(this);
   }

   protected ResetHeightLimitsMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ResetHeightLimitsMessage.Builder(var1);
   }

   public static ResetHeightLimitsMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ResetHeightLimitsMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ResetHeightLimitsMessage> getParserForType() {
      return PARSER;
   }

   public ResetHeightLimitsMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ResetHeightLimitsMessage.Builder> implements ResetHeightLimitsMessageOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_heightlimit_v1_ResetHeightLimitsMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_heightlimit_v1_ResetHeightLimitsMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ResetHeightLimitsMessage.class, ResetHeightLimitsMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ResetHeightLimitsMessage.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_heightlimit_v1_ResetHeightLimitsMessage_descriptor;
      }

      public ResetHeightLimitsMessage getDefaultInstanceForType() {
         return ResetHeightLimitsMessage.getDefaultInstance();
      }

      public ResetHeightLimitsMessage build() {
         ResetHeightLimitsMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ResetHeightLimitsMessage buildPartial() {
         ResetHeightLimitsMessage var1 = new ResetHeightLimitsMessage(this);
         this.onBuilt();
         return var1;
      }

      public ResetHeightLimitsMessage.Builder clone() {
         return (ResetHeightLimitsMessage.Builder)super.clone();
      }

      public ResetHeightLimitsMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetHeightLimitsMessage.Builder)super.setField(var1, var2);
      }

      public ResetHeightLimitsMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ResetHeightLimitsMessage.Builder)super.clearField(var1);
      }

      public ResetHeightLimitsMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ResetHeightLimitsMessage.Builder)super.clearOneof(var1);
      }

      public ResetHeightLimitsMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ResetHeightLimitsMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ResetHeightLimitsMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetHeightLimitsMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public ResetHeightLimitsMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ResetHeightLimitsMessage) {
            return this.mergeFrom((ResetHeightLimitsMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ResetHeightLimitsMessage.Builder mergeFrom(ResetHeightLimitsMessage var1) {
         if (var1 == ResetHeightLimitsMessage.getDefaultInstance()) {
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

      public ResetHeightLimitsMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final ResetHeightLimitsMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ResetHeightLimitsMessage.Builder)super.setUnknownFields(var1);
      }

      public final ResetHeightLimitsMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ResetHeightLimitsMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
