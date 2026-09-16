package com.lunarclient.apollo.marker.v1;

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

public final class ResetMarkersMessage extends GeneratedMessageV3 implements ResetMarkersMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final ResetMarkersMessage DEFAULT_INSTANCE = new ResetMarkersMessage();
   private static final Parser<ResetMarkersMessage> PARSER = new AbstractParser<ResetMarkersMessage>() {
      public ResetMarkersMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ResetMarkersMessage.Builder var3 = ResetMarkersMessage.newBuilder();

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

   private ResetMarkersMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ResetMarkersMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ResetMarkersMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_marker_v1_ResetMarkersMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_marker_v1_ResetMarkersMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ResetMarkersMessage.class, ResetMarkersMessage.Builder.class);
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

      if (!(var1 instanceof ResetMarkersMessage)) {
         return super.equals(var1);
      }

      ResetMarkersMessage var2 = (ResetMarkersMessage)var1;
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

   public static ResetMarkersMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetMarkersMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetMarkersMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetMarkersMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetMarkersMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetMarkersMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetMarkersMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetMarkersMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ResetMarkersMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ResetMarkersMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ResetMarkersMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetMarkersMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ResetMarkersMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ResetMarkersMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ResetMarkersMessage.Builder newBuilder(ResetMarkersMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ResetMarkersMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ResetMarkersMessage.Builder() : new ResetMarkersMessage.Builder().mergeFrom(this);
   }

   protected ResetMarkersMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ResetMarkersMessage.Builder(var1);
   }

   public static ResetMarkersMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ResetMarkersMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ResetMarkersMessage> getParserForType() {
      return PARSER;
   }

   public ResetMarkersMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ResetMarkersMessage.Builder> implements ResetMarkersMessageOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_ResetMarkersMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_ResetMarkersMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ResetMarkersMessage.class, ResetMarkersMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ResetMarkersMessage.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_ResetMarkersMessage_descriptor;
      }

      public ResetMarkersMessage getDefaultInstanceForType() {
         return ResetMarkersMessage.getDefaultInstance();
      }

      public ResetMarkersMessage build() {
         ResetMarkersMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ResetMarkersMessage buildPartial() {
         ResetMarkersMessage var1 = new ResetMarkersMessage(this);
         this.onBuilt();
         return var1;
      }

      public ResetMarkersMessage.Builder clone() {
         return (ResetMarkersMessage.Builder)super.clone();
      }

      public ResetMarkersMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetMarkersMessage.Builder)super.setField(var1, var2);
      }

      public ResetMarkersMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ResetMarkersMessage.Builder)super.clearField(var1);
      }

      public ResetMarkersMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ResetMarkersMessage.Builder)super.clearOneof(var1);
      }

      public ResetMarkersMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ResetMarkersMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ResetMarkersMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetMarkersMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public ResetMarkersMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ResetMarkersMessage) {
            return this.mergeFrom((ResetMarkersMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ResetMarkersMessage.Builder mergeFrom(ResetMarkersMessage var1) {
         if (var1 == ResetMarkersMessage.getDefaultInstance()) {
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

      public ResetMarkersMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final ResetMarkersMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ResetMarkersMessage.Builder)super.setUnknownFields(var1);
      }

      public final ResetMarkersMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ResetMarkersMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
