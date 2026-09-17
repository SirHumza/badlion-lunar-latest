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

public final class ResetServerLinkResourceMessage extends GeneratedMessageV3 implements ResetServerLinkResourceMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final ResetServerLinkResourceMessage DEFAULT_INSTANCE = new ResetServerLinkResourceMessage();
   private static final Parser<ResetServerLinkResourceMessage> PARSER = new AbstractParser<ResetServerLinkResourceMessage>() {
      public ResetServerLinkResourceMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ResetServerLinkResourceMessage.Builder var3 = ResetServerLinkResourceMessage.newBuilder();

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

   private ResetServerLinkResourceMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ResetServerLinkResourceMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ResetServerLinkResourceMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_ResetServerLinkResourceMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_ResetServerLinkResourceMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ResetServerLinkResourceMessage.class, ResetServerLinkResourceMessage.Builder.class);
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

      if (!(var1 instanceof ResetServerLinkResourceMessage)) {
         return super.equals(var1);
      }

      ResetServerLinkResourceMessage var2 = (ResetServerLinkResourceMessage)var1;
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

   public static ResetServerLinkResourceMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetServerLinkResourceMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetServerLinkResourceMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetServerLinkResourceMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetServerLinkResourceMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetServerLinkResourceMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetServerLinkResourceMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetServerLinkResourceMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ResetServerLinkResourceMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ResetServerLinkResourceMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ResetServerLinkResourceMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetServerLinkResourceMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ResetServerLinkResourceMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ResetServerLinkResourceMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ResetServerLinkResourceMessage.Builder newBuilder(ResetServerLinkResourceMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ResetServerLinkResourceMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ResetServerLinkResourceMessage.Builder() : new ResetServerLinkResourceMessage.Builder().mergeFrom(this);
   }

   protected ResetServerLinkResourceMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ResetServerLinkResourceMessage.Builder(var1);
   }

   public static ResetServerLinkResourceMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ResetServerLinkResourceMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ResetServerLinkResourceMessage> getParserForType() {
      return PARSER;
   }

   public ResetServerLinkResourceMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<ResetServerLinkResourceMessage.Builder>
      implements ResetServerLinkResourceMessageOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_ResetServerLinkResourceMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_ResetServerLinkResourceMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ResetServerLinkResourceMessage.class, ResetServerLinkResourceMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ResetServerLinkResourceMessage.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_ResetServerLinkResourceMessage_descriptor;
      }

      public ResetServerLinkResourceMessage getDefaultInstanceForType() {
         return ResetServerLinkResourceMessage.getDefaultInstance();
      }

      public ResetServerLinkResourceMessage build() {
         ResetServerLinkResourceMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ResetServerLinkResourceMessage buildPartial() {
         ResetServerLinkResourceMessage var1 = new ResetServerLinkResourceMessage(this);
         this.onBuilt();
         return var1;
      }

      public ResetServerLinkResourceMessage.Builder clone() {
         return (ResetServerLinkResourceMessage.Builder)super.clone();
      }

      public ResetServerLinkResourceMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetServerLinkResourceMessage.Builder)super.setField(var1, var2);
      }

      public ResetServerLinkResourceMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ResetServerLinkResourceMessage.Builder)super.clearField(var1);
      }

      public ResetServerLinkResourceMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ResetServerLinkResourceMessage.Builder)super.clearOneof(var1);
      }

      public ResetServerLinkResourceMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ResetServerLinkResourceMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ResetServerLinkResourceMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetServerLinkResourceMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public ResetServerLinkResourceMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ResetServerLinkResourceMessage) {
            return this.mergeFrom((ResetServerLinkResourceMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ResetServerLinkResourceMessage.Builder mergeFrom(ResetServerLinkResourceMessage var1) {
         if (var1 == ResetServerLinkResourceMessage.getDefaultInstance()) {
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

      public ResetServerLinkResourceMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final ResetServerLinkResourceMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ResetServerLinkResourceMessage.Builder)super.setUnknownFields(var1);
      }

      public final ResetServerLinkResourceMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ResetServerLinkResourceMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
