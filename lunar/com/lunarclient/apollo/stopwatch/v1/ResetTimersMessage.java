package com.lunarclient.apollo.stopwatch.v1;

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

public final class ResetTimersMessage extends GeneratedMessageV3 implements ResetTimersMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final ResetTimersMessage DEFAULT_INSTANCE = new ResetTimersMessage();
   private static final Parser<ResetTimersMessage> PARSER = new AbstractParser<ResetTimersMessage>() {
      public ResetTimersMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ResetTimersMessage.Builder var3 = ResetTimersMessage.newBuilder();

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

   private ResetTimersMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ResetTimersMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ResetTimersMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_stopwatch_v1_ResetTimersMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_stopwatch_v1_ResetTimersMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ResetTimersMessage.class, ResetTimersMessage.Builder.class);
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

      if (!(var1 instanceof ResetTimersMessage)) {
         return super.equals(var1);
      }

      ResetTimersMessage var2 = (ResetTimersMessage)var1;
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

   public static ResetTimersMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetTimersMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetTimersMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetTimersMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetTimersMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetTimersMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetTimersMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetTimersMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ResetTimersMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ResetTimersMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ResetTimersMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetTimersMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ResetTimersMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ResetTimersMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ResetTimersMessage.Builder newBuilder(ResetTimersMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ResetTimersMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ResetTimersMessage.Builder() : new ResetTimersMessage.Builder().mergeFrom(this);
   }

   protected ResetTimersMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ResetTimersMessage.Builder(var1);
   }

   public static ResetTimersMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ResetTimersMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ResetTimersMessage> getParserForType() {
      return PARSER;
   }

   public ResetTimersMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ResetTimersMessage.Builder> implements ResetTimersMessageOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_stopwatch_v1_ResetTimersMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_stopwatch_v1_ResetTimersMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ResetTimersMessage.class, ResetTimersMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ResetTimersMessage.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_stopwatch_v1_ResetTimersMessage_descriptor;
      }

      public ResetTimersMessage getDefaultInstanceForType() {
         return ResetTimersMessage.getDefaultInstance();
      }

      public ResetTimersMessage build() {
         ResetTimersMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ResetTimersMessage buildPartial() {
         ResetTimersMessage var1 = new ResetTimersMessage(this);
         this.onBuilt();
         return var1;
      }

      public ResetTimersMessage.Builder clone() {
         return (ResetTimersMessage.Builder)super.clone();
      }

      public ResetTimersMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetTimersMessage.Builder)super.setField(var1, var2);
      }

      public ResetTimersMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ResetTimersMessage.Builder)super.clearField(var1);
      }

      public ResetTimersMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ResetTimersMessage.Builder)super.clearOneof(var1);
      }

      public ResetTimersMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ResetTimersMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ResetTimersMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetTimersMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public ResetTimersMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ResetTimersMessage) {
            return this.mergeFrom((ResetTimersMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ResetTimersMessage.Builder mergeFrom(ResetTimersMessage var1) {
         if (var1 == ResetTimersMessage.getDefaultInstance()) {
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

      public ResetTimersMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final ResetTimersMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ResetTimersMessage.Builder)super.setUnknownFields(var1);
      }

      public final ResetTimersMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ResetTimersMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
