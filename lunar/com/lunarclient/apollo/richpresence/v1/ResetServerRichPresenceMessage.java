package com.lunarclient.apollo.richpresence.v1;

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

public final class ResetServerRichPresenceMessage extends GeneratedMessageV3 implements ResetServerRichPresenceMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final ResetServerRichPresenceMessage DEFAULT_INSTANCE = new ResetServerRichPresenceMessage();
   private static final Parser<ResetServerRichPresenceMessage> PARSER = new AbstractParser<ResetServerRichPresenceMessage>() {
      public ResetServerRichPresenceMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ResetServerRichPresenceMessage.Builder var3 = ResetServerRichPresenceMessage.newBuilder();

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

   private ResetServerRichPresenceMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ResetServerRichPresenceMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ResetServerRichPresenceMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_richpresence_v1_ResetServerRichPresenceMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_richpresence_v1_ResetServerRichPresenceMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ResetServerRichPresenceMessage.class, ResetServerRichPresenceMessage.Builder.class);
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

      if (!(var1 instanceof ResetServerRichPresenceMessage)) {
         return super.equals(var1);
      }

      ResetServerRichPresenceMessage var2 = (ResetServerRichPresenceMessage)var1;
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

   public static ResetServerRichPresenceMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetServerRichPresenceMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetServerRichPresenceMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetServerRichPresenceMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetServerRichPresenceMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetServerRichPresenceMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetServerRichPresenceMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetServerRichPresenceMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ResetServerRichPresenceMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ResetServerRichPresenceMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ResetServerRichPresenceMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetServerRichPresenceMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ResetServerRichPresenceMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ResetServerRichPresenceMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ResetServerRichPresenceMessage.Builder newBuilder(ResetServerRichPresenceMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ResetServerRichPresenceMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ResetServerRichPresenceMessage.Builder() : new ResetServerRichPresenceMessage.Builder().mergeFrom(this);
   }

   protected ResetServerRichPresenceMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ResetServerRichPresenceMessage.Builder(var1);
   }

   public static ResetServerRichPresenceMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ResetServerRichPresenceMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ResetServerRichPresenceMessage> getParserForType() {
      return PARSER;
   }

   public ResetServerRichPresenceMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<ResetServerRichPresenceMessage.Builder>
      implements ResetServerRichPresenceMessageOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_richpresence_v1_ResetServerRichPresenceMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_richpresence_v1_ResetServerRichPresenceMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ResetServerRichPresenceMessage.class, ResetServerRichPresenceMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ResetServerRichPresenceMessage.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_richpresence_v1_ResetServerRichPresenceMessage_descriptor;
      }

      public ResetServerRichPresenceMessage getDefaultInstanceForType() {
         return ResetServerRichPresenceMessage.getDefaultInstance();
      }

      public ResetServerRichPresenceMessage build() {
         ResetServerRichPresenceMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ResetServerRichPresenceMessage buildPartial() {
         ResetServerRichPresenceMessage var1 = new ResetServerRichPresenceMessage(this);
         this.onBuilt();
         return var1;
      }

      public ResetServerRichPresenceMessage.Builder clone() {
         return (ResetServerRichPresenceMessage.Builder)super.clone();
      }

      public ResetServerRichPresenceMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetServerRichPresenceMessage.Builder)super.setField(var1, var2);
      }

      public ResetServerRichPresenceMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ResetServerRichPresenceMessage.Builder)super.clearField(var1);
      }

      public ResetServerRichPresenceMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ResetServerRichPresenceMessage.Builder)super.clearOneof(var1);
      }

      public ResetServerRichPresenceMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ResetServerRichPresenceMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ResetServerRichPresenceMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetServerRichPresenceMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public ResetServerRichPresenceMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ResetServerRichPresenceMessage) {
            return this.mergeFrom((ResetServerRichPresenceMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ResetServerRichPresenceMessage.Builder mergeFrom(ResetServerRichPresenceMessage var1) {
         if (var1 == ResetServerRichPresenceMessage.getDefaultInstance()) {
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

      public ResetServerRichPresenceMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final ResetServerRichPresenceMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ResetServerRichPresenceMessage.Builder)super.setUnknownFields(var1);
      }

      public final ResetServerRichPresenceMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ResetServerRichPresenceMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
