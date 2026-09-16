package com.lunarclient.apollo.serverlink.v1;

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

public final class ResetServerLinksMessage extends GeneratedMessageV3 implements ResetServerLinksMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final ResetServerLinksMessage DEFAULT_INSTANCE = new ResetServerLinksMessage();
   private static final Parser<ResetServerLinksMessage> PARSER = new AbstractParser<ResetServerLinksMessage>() {
      public ResetServerLinksMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ResetServerLinksMessage.Builder var3 = ResetServerLinksMessage.newBuilder();

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

   private ResetServerLinksMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ResetServerLinksMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ResetServerLinksMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_ResetServerLinksMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_ResetServerLinksMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ResetServerLinksMessage.class, ResetServerLinksMessage.Builder.class);
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

      if (!(var1 instanceof ResetServerLinksMessage)) {
         return super.equals(var1);
      }

      ResetServerLinksMessage var2 = (ResetServerLinksMessage)var1;
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

   public static ResetServerLinksMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetServerLinksMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetServerLinksMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetServerLinksMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetServerLinksMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetServerLinksMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetServerLinksMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetServerLinksMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ResetServerLinksMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ResetServerLinksMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ResetServerLinksMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetServerLinksMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ResetServerLinksMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ResetServerLinksMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ResetServerLinksMessage.Builder newBuilder(ResetServerLinksMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ResetServerLinksMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ResetServerLinksMessage.Builder() : new ResetServerLinksMessage.Builder().mergeFrom(this);
   }

   protected ResetServerLinksMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ResetServerLinksMessage.Builder(var1);
   }

   public static ResetServerLinksMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ResetServerLinksMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ResetServerLinksMessage> getParserForType() {
      return PARSER;
   }

   public ResetServerLinksMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ResetServerLinksMessage.Builder> implements ResetServerLinksMessageOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_ResetServerLinksMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_ResetServerLinksMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ResetServerLinksMessage.class, ResetServerLinksMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ResetServerLinksMessage.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_ResetServerLinksMessage_descriptor;
      }

      public ResetServerLinksMessage getDefaultInstanceForType() {
         return ResetServerLinksMessage.getDefaultInstance();
      }

      public ResetServerLinksMessage build() {
         ResetServerLinksMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ResetServerLinksMessage buildPartial() {
         ResetServerLinksMessage var1 = new ResetServerLinksMessage(this);
         this.onBuilt();
         return var1;
      }

      public ResetServerLinksMessage.Builder clone() {
         return (ResetServerLinksMessage.Builder)super.clone();
      }

      public ResetServerLinksMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetServerLinksMessage.Builder)super.setField(var1, var2);
      }

      public ResetServerLinksMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ResetServerLinksMessage.Builder)super.clearField(var1);
      }

      public ResetServerLinksMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ResetServerLinksMessage.Builder)super.clearOneof(var1);
      }

      public ResetServerLinksMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ResetServerLinksMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ResetServerLinksMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetServerLinksMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public ResetServerLinksMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ResetServerLinksMessage) {
            return this.mergeFrom((ResetServerLinksMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ResetServerLinksMessage.Builder mergeFrom(ResetServerLinksMessage var1) {
         if (var1 == ResetServerLinksMessage.getDefaultInstance()) {
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

      public ResetServerLinksMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final ResetServerLinksMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ResetServerLinksMessage.Builder)super.setUnknownFields(var1);
      }

      public final ResetServerLinksMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ResetServerLinksMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
