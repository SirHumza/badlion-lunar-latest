package com.lunarclient.gameipc.chat.v1;

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

public final class ReceiveMessageResponse extends GeneratedMessageV3 implements ReceiveMessageResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final ReceiveMessageResponse DEFAULT_INSTANCE = new ReceiveMessageResponse();
   private static final Parser<ReceiveMessageResponse> PARSER = new AbstractParser<ReceiveMessageResponse>() {
      public ReceiveMessageResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ReceiveMessageResponse.Builder var3 = ReceiveMessageResponse.newBuilder();

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

   private ReceiveMessageResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ReceiveMessageResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ReceiveMessageResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_chat_v1_ReceiveMessageResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_chat_v1_ReceiveMessageResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ReceiveMessageResponse.class, ReceiveMessageResponse.Builder.class);
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

      if (!(var1 instanceof ReceiveMessageResponse)) {
         return super.equals(var1);
      }

      ReceiveMessageResponse var2 = (ReceiveMessageResponse)var1;
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

   public static ReceiveMessageResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ReceiveMessageResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ReceiveMessageResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ReceiveMessageResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ReceiveMessageResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ReceiveMessageResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ReceiveMessageResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ReceiveMessageResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ReceiveMessageResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ReceiveMessageResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ReceiveMessageResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ReceiveMessageResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ReceiveMessageResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ReceiveMessageResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ReceiveMessageResponse.Builder newBuilder(ReceiveMessageResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ReceiveMessageResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ReceiveMessageResponse.Builder() : new ReceiveMessageResponse.Builder().mergeFrom(this);
   }

   protected ReceiveMessageResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ReceiveMessageResponse.Builder(var1);
   }

   public static ReceiveMessageResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ReceiveMessageResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<ReceiveMessageResponse> getParserForType() {
      return PARSER;
   }

   public ReceiveMessageResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ReceiveMessageResponse.Builder> implements ReceiveMessageResponseOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_chat_v1_ReceiveMessageResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_chat_v1_ReceiveMessageResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ReceiveMessageResponse.class, ReceiveMessageResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ReceiveMessageResponse.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_chat_v1_ReceiveMessageResponse_descriptor;
      }

      public ReceiveMessageResponse getDefaultInstanceForType() {
         return ReceiveMessageResponse.getDefaultInstance();
      }

      public ReceiveMessageResponse build() {
         ReceiveMessageResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ReceiveMessageResponse buildPartial() {
         ReceiveMessageResponse var1 = new ReceiveMessageResponse(this);
         this.onBuilt();
         return var1;
      }

      public ReceiveMessageResponse.Builder clone() {
         return (ReceiveMessageResponse.Builder)super.clone();
      }

      public ReceiveMessageResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ReceiveMessageResponse.Builder)super.setField(var1, var2);
      }

      public ReceiveMessageResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ReceiveMessageResponse.Builder)super.clearField(var1);
      }

      public ReceiveMessageResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ReceiveMessageResponse.Builder)super.clearOneof(var1);
      }

      public ReceiveMessageResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ReceiveMessageResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ReceiveMessageResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ReceiveMessageResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public ReceiveMessageResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof ReceiveMessageResponse) {
            return this.mergeFrom((ReceiveMessageResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ReceiveMessageResponse.Builder mergeFrom(ReceiveMessageResponse var1) {
         if (var1 == ReceiveMessageResponse.getDefaultInstance()) {
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

      public ReceiveMessageResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final ReceiveMessageResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ReceiveMessageResponse.Builder)super.setUnknownFields(var1);
      }

      public final ReceiveMessageResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ReceiveMessageResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
