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

public final class ResetPingMarkerTypesMessage extends GeneratedMessageV3 implements ResetPingMarkerTypesMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final ResetPingMarkerTypesMessage DEFAULT_INSTANCE = new ResetPingMarkerTypesMessage();
   private static final Parser<ResetPingMarkerTypesMessage> PARSER = new AbstractParser<ResetPingMarkerTypesMessage>() {
      public ResetPingMarkerTypesMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ResetPingMarkerTypesMessage.Builder var3 = ResetPingMarkerTypesMessage.newBuilder();

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

   private ResetPingMarkerTypesMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ResetPingMarkerTypesMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ResetPingMarkerTypesMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_ResetPingMarkerTypesMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_ResetPingMarkerTypesMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ResetPingMarkerTypesMessage.class, ResetPingMarkerTypesMessage.Builder.class);
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

      if (!(var1 instanceof ResetPingMarkerTypesMessage)) {
         return super.equals(var1);
      }

      ResetPingMarkerTypesMessage var2 = (ResetPingMarkerTypesMessage)var1;
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

   public static ResetPingMarkerTypesMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetPingMarkerTypesMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetPingMarkerTypesMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetPingMarkerTypesMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetPingMarkerTypesMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetPingMarkerTypesMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetPingMarkerTypesMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetPingMarkerTypesMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ResetPingMarkerTypesMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ResetPingMarkerTypesMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ResetPingMarkerTypesMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetPingMarkerTypesMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ResetPingMarkerTypesMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ResetPingMarkerTypesMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ResetPingMarkerTypesMessage.Builder newBuilder(ResetPingMarkerTypesMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ResetPingMarkerTypesMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ResetPingMarkerTypesMessage.Builder() : new ResetPingMarkerTypesMessage.Builder().mergeFrom(this);
   }

   protected ResetPingMarkerTypesMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ResetPingMarkerTypesMessage.Builder(var1);
   }

   public static ResetPingMarkerTypesMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ResetPingMarkerTypesMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ResetPingMarkerTypesMessage> getParserForType() {
      return PARSER;
   }

   public ResetPingMarkerTypesMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ResetPingMarkerTypesMessage.Builder> implements ResetPingMarkerTypesMessageOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_ResetPingMarkerTypesMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_ResetPingMarkerTypesMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ResetPingMarkerTypesMessage.class, ResetPingMarkerTypesMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ResetPingMarkerTypesMessage.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_ResetPingMarkerTypesMessage_descriptor;
      }

      public ResetPingMarkerTypesMessage getDefaultInstanceForType() {
         return ResetPingMarkerTypesMessage.getDefaultInstance();
      }

      public ResetPingMarkerTypesMessage build() {
         ResetPingMarkerTypesMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ResetPingMarkerTypesMessage buildPartial() {
         ResetPingMarkerTypesMessage var1 = new ResetPingMarkerTypesMessage(this);
         this.onBuilt();
         return var1;
      }

      public ResetPingMarkerTypesMessage.Builder clone() {
         return (ResetPingMarkerTypesMessage.Builder)super.clone();
      }

      public ResetPingMarkerTypesMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetPingMarkerTypesMessage.Builder)super.setField(var1, var2);
      }

      public ResetPingMarkerTypesMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ResetPingMarkerTypesMessage.Builder)super.clearField(var1);
      }

      public ResetPingMarkerTypesMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ResetPingMarkerTypesMessage.Builder)super.clearOneof(var1);
      }

      public ResetPingMarkerTypesMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ResetPingMarkerTypesMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ResetPingMarkerTypesMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetPingMarkerTypesMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public ResetPingMarkerTypesMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ResetPingMarkerTypesMessage) {
            return this.mergeFrom((ResetPingMarkerTypesMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ResetPingMarkerTypesMessage.Builder mergeFrom(ResetPingMarkerTypesMessage var1) {
         if (var1 == ResetPingMarkerTypesMessage.getDefaultInstance()) {
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

      public ResetPingMarkerTypesMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final ResetPingMarkerTypesMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ResetPingMarkerTypesMessage.Builder)super.setUnknownFields(var1);
      }

      public final ResetPingMarkerTypesMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ResetPingMarkerTypesMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
