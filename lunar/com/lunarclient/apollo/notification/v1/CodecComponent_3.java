package com.lunarclient.apollo.notification.v1;

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

public final class ResetNotificationsMessage extends GeneratedMessageV3 implements ResetNotificationsMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final ResetNotificationsMessage DEFAULT_INSTANCE = new ResetNotificationsMessage();
   private static final Parser<ResetNotificationsMessage> PARSER = new AbstractParser<ResetNotificationsMessage>() {
      public ResetNotificationsMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ResetNotificationsMessage.Builder var3 = ResetNotificationsMessage.newBuilder();

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

   private ResetNotificationsMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ResetNotificationsMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ResetNotificationsMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_notification_v1_ResetNotificationsMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_notification_v1_ResetNotificationsMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ResetNotificationsMessage.class, ResetNotificationsMessage.Builder.class);
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

      if (!(var1 instanceof ResetNotificationsMessage)) {
         return super.equals(var1);
      }

      ResetNotificationsMessage var2 = (ResetNotificationsMessage)var1;
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

   public static ResetNotificationsMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetNotificationsMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetNotificationsMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetNotificationsMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetNotificationsMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetNotificationsMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetNotificationsMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetNotificationsMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ResetNotificationsMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ResetNotificationsMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ResetNotificationsMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetNotificationsMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ResetNotificationsMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ResetNotificationsMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ResetNotificationsMessage.Builder newBuilder(ResetNotificationsMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ResetNotificationsMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ResetNotificationsMessage.Builder() : new ResetNotificationsMessage.Builder().mergeFrom(this);
   }

   protected ResetNotificationsMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ResetNotificationsMessage.Builder(var1);
   }

   public static ResetNotificationsMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ResetNotificationsMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ResetNotificationsMessage> getParserForType() {
      return PARSER;
   }

   public ResetNotificationsMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ResetNotificationsMessage.Builder> implements ResetNotificationsMessageOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_notification_v1_ResetNotificationsMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_notification_v1_ResetNotificationsMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ResetNotificationsMessage.class, ResetNotificationsMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ResetNotificationsMessage.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_notification_v1_ResetNotificationsMessage_descriptor;
      }

      public ResetNotificationsMessage getDefaultInstanceForType() {
         return ResetNotificationsMessage.getDefaultInstance();
      }

      public ResetNotificationsMessage build() {
         ResetNotificationsMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ResetNotificationsMessage buildPartial() {
         ResetNotificationsMessage var1 = new ResetNotificationsMessage(this);
         this.onBuilt();
         return var1;
      }

      public ResetNotificationsMessage.Builder clone() {
         return (ResetNotificationsMessage.Builder)super.clone();
      }

      public ResetNotificationsMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetNotificationsMessage.Builder)super.setField(var1, var2);
      }

      public ResetNotificationsMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ResetNotificationsMessage.Builder)super.clearField(var1);
      }

      public ResetNotificationsMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ResetNotificationsMessage.Builder)super.clearOneof(var1);
      }

      public ResetNotificationsMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ResetNotificationsMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ResetNotificationsMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetNotificationsMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public ResetNotificationsMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ResetNotificationsMessage) {
            return this.mergeFrom((ResetNotificationsMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ResetNotificationsMessage.Builder mergeFrom(ResetNotificationsMessage var1) {
         if (var1 == ResetNotificationsMessage.getDefaultInstance()) {
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

      public ResetNotificationsMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final ResetNotificationsMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ResetNotificationsMessage.Builder)super.setUnknownFields(var1);
      }

      public final ResetNotificationsMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ResetNotificationsMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
