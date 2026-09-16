package com.lunarclient.apollo.beam.v1;

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

public final class ResetBeaconBeamsMessage extends GeneratedMessageV3 implements ResetBeaconBeamsMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final ResetBeaconBeamsMessage DEFAULT_INSTANCE = new ResetBeaconBeamsMessage();
   private static final Parser<ResetBeaconBeamsMessage> PARSER = new AbstractParser<ResetBeaconBeamsMessage>() {
      public ResetBeaconBeamsMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ResetBeaconBeamsMessage.Builder var3 = ResetBeaconBeamsMessage.newBuilder();

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

   private ResetBeaconBeamsMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ResetBeaconBeamsMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ResetBeaconBeamsMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_beam_v1_ResetBeaconBeamsMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_beam_v1_ResetBeaconBeamsMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ResetBeaconBeamsMessage.class, ResetBeaconBeamsMessage.Builder.class);
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

      if (!(var1 instanceof ResetBeaconBeamsMessage)) {
         return super.equals(var1);
      }

      ResetBeaconBeamsMessage var2 = (ResetBeaconBeamsMessage)var1;
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

   public static ResetBeaconBeamsMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetBeaconBeamsMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetBeaconBeamsMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetBeaconBeamsMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetBeaconBeamsMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetBeaconBeamsMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetBeaconBeamsMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetBeaconBeamsMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ResetBeaconBeamsMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ResetBeaconBeamsMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ResetBeaconBeamsMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetBeaconBeamsMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ResetBeaconBeamsMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ResetBeaconBeamsMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ResetBeaconBeamsMessage.Builder newBuilder(ResetBeaconBeamsMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ResetBeaconBeamsMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ResetBeaconBeamsMessage.Builder() : new ResetBeaconBeamsMessage.Builder().mergeFrom(this);
   }

   protected ResetBeaconBeamsMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ResetBeaconBeamsMessage.Builder(var1);
   }

   public static ResetBeaconBeamsMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ResetBeaconBeamsMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ResetBeaconBeamsMessage> getParserForType() {
      return PARSER;
   }

   public ResetBeaconBeamsMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ResetBeaconBeamsMessage.Builder> implements ResetBeaconBeamsMessageOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_beam_v1_ResetBeaconBeamsMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_beam_v1_ResetBeaconBeamsMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ResetBeaconBeamsMessage.class, ResetBeaconBeamsMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ResetBeaconBeamsMessage.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_beam_v1_ResetBeaconBeamsMessage_descriptor;
      }

      public ResetBeaconBeamsMessage getDefaultInstanceForType() {
         return ResetBeaconBeamsMessage.getDefaultInstance();
      }

      public ResetBeaconBeamsMessage build() {
         ResetBeaconBeamsMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ResetBeaconBeamsMessage buildPartial() {
         ResetBeaconBeamsMessage var1 = new ResetBeaconBeamsMessage(this);
         this.onBuilt();
         return var1;
      }

      public ResetBeaconBeamsMessage.Builder clone() {
         return (ResetBeaconBeamsMessage.Builder)super.clone();
      }

      public ResetBeaconBeamsMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetBeaconBeamsMessage.Builder)super.setField(var1, var2);
      }

      public ResetBeaconBeamsMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ResetBeaconBeamsMessage.Builder)super.clearField(var1);
      }

      public ResetBeaconBeamsMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ResetBeaconBeamsMessage.Builder)super.clearOneof(var1);
      }

      public ResetBeaconBeamsMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ResetBeaconBeamsMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ResetBeaconBeamsMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetBeaconBeamsMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public ResetBeaconBeamsMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ResetBeaconBeamsMessage) {
            return this.mergeFrom((ResetBeaconBeamsMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ResetBeaconBeamsMessage.Builder mergeFrom(ResetBeaconBeamsMessage var1) {
         if (var1 == ResetBeaconBeamsMessage.getDefaultInstance()) {
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

      public ResetBeaconBeamsMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final ResetBeaconBeamsMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ResetBeaconBeamsMessage.Builder)super.setUnknownFields(var1);
      }

      public final ResetBeaconBeamsMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ResetBeaconBeamsMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
