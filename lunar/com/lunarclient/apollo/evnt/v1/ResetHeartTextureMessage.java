package com.lunarclient.apollo.evnt.v1;

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

public final class ResetHeartTextureMessage extends GeneratedMessageV3 implements ResetHeartTextureMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final ResetHeartTextureMessage DEFAULT_INSTANCE = new ResetHeartTextureMessage();
   private static final Parser<ResetHeartTextureMessage> PARSER = new AbstractParser<ResetHeartTextureMessage>() {
      public ResetHeartTextureMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ResetHeartTextureMessage.Builder var3 = ResetHeartTextureMessage.newBuilder();

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

   private ResetHeartTextureMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ResetHeartTextureMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ResetHeartTextureMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return HearttextureProto.internal_static_lunarclient_apollo_evnt_v1_ResetHeartTextureMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return HearttextureProto.internal_static_lunarclient_apollo_evnt_v1_ResetHeartTextureMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ResetHeartTextureMessage.class, ResetHeartTextureMessage.Builder.class);
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

      if (!(var1 instanceof ResetHeartTextureMessage)) {
         return super.equals(var1);
      }

      ResetHeartTextureMessage var2 = (ResetHeartTextureMessage)var1;
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

   public static ResetHeartTextureMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetHeartTextureMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetHeartTextureMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetHeartTextureMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetHeartTextureMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetHeartTextureMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetHeartTextureMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetHeartTextureMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ResetHeartTextureMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ResetHeartTextureMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ResetHeartTextureMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetHeartTextureMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ResetHeartTextureMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ResetHeartTextureMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ResetHeartTextureMessage.Builder newBuilder(ResetHeartTextureMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ResetHeartTextureMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ResetHeartTextureMessage.Builder() : new ResetHeartTextureMessage.Builder().mergeFrom(this);
   }

   protected ResetHeartTextureMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ResetHeartTextureMessage.Builder(var1);
   }

   public static ResetHeartTextureMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ResetHeartTextureMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ResetHeartTextureMessage> getParserForType() {
      return PARSER;
   }

   public ResetHeartTextureMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ResetHeartTextureMessage.Builder> implements ResetHeartTextureMessageOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return HearttextureProto.internal_static_lunarclient_apollo_evnt_v1_ResetHeartTextureMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HearttextureProto.internal_static_lunarclient_apollo_evnt_v1_ResetHeartTextureMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ResetHeartTextureMessage.class, ResetHeartTextureMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ResetHeartTextureMessage.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return HearttextureProto.internal_static_lunarclient_apollo_evnt_v1_ResetHeartTextureMessage_descriptor;
      }

      public ResetHeartTextureMessage getDefaultInstanceForType() {
         return ResetHeartTextureMessage.getDefaultInstance();
      }

      public ResetHeartTextureMessage build() {
         ResetHeartTextureMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ResetHeartTextureMessage buildPartial() {
         ResetHeartTextureMessage var1 = new ResetHeartTextureMessage(this);
         this.onBuilt();
         return var1;
      }

      public ResetHeartTextureMessage.Builder clone() {
         return (ResetHeartTextureMessage.Builder)super.clone();
      }

      public ResetHeartTextureMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetHeartTextureMessage.Builder)super.setField(var1, var2);
      }

      public ResetHeartTextureMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ResetHeartTextureMessage.Builder)super.clearField(var1);
      }

      public ResetHeartTextureMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ResetHeartTextureMessage.Builder)super.clearOneof(var1);
      }

      public ResetHeartTextureMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ResetHeartTextureMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ResetHeartTextureMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetHeartTextureMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public ResetHeartTextureMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ResetHeartTextureMessage) {
            return this.mergeFrom((ResetHeartTextureMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ResetHeartTextureMessage.Builder mergeFrom(ResetHeartTextureMessage var1) {
         if (var1 == ResetHeartTextureMessage.getDefaultInstance()) {
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

      public ResetHeartTextureMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final ResetHeartTextureMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ResetHeartTextureMessage.Builder)super.setUnknownFields(var1);
      }

      public final ResetHeartTextureMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ResetHeartTextureMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
