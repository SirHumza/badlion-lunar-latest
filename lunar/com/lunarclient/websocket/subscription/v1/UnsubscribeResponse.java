package com.lunarclient.websocket.subscription.v1;

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

public final class UnsubscribeResponse extends GeneratedMessageV3 implements UnsubscribeResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final UnsubscribeResponse DEFAULT_INSTANCE = new UnsubscribeResponse();
   private static final Parser<UnsubscribeResponse> PARSER = new AbstractParser<UnsubscribeResponse>() {
      public UnsubscribeResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UnsubscribeResponse.Builder var3 = UnsubscribeResponse.newBuilder();

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

   private UnsubscribeResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UnsubscribeResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UnsubscribeResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_subscription_v1_UnsubscribeResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_subscription_v1_UnsubscribeResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UnsubscribeResponse.class, UnsubscribeResponse.Builder.class);
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

      if (!(var1 instanceof UnsubscribeResponse)) {
         return super.equals(var1);
      }

      UnsubscribeResponse var2 = (UnsubscribeResponse)var1;
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

   public static UnsubscribeResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UnsubscribeResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UnsubscribeResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UnsubscribeResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UnsubscribeResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UnsubscribeResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UnsubscribeResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UnsubscribeResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UnsubscribeResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UnsubscribeResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UnsubscribeResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UnsubscribeResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UnsubscribeResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UnsubscribeResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UnsubscribeResponse.Builder newBuilder(UnsubscribeResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UnsubscribeResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UnsubscribeResponse.Builder() : new UnsubscribeResponse.Builder().mergeFrom(this);
   }

   protected UnsubscribeResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UnsubscribeResponse.Builder(var1);
   }

   public static UnsubscribeResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UnsubscribeResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<UnsubscribeResponse> getParserForType() {
      return PARSER;
   }

   public UnsubscribeResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UnsubscribeResponse.Builder> implements UnsubscribeResponseOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_subscription_v1_UnsubscribeResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_subscription_v1_UnsubscribeResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UnsubscribeResponse.class, UnsubscribeResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public UnsubscribeResponse.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_subscription_v1_UnsubscribeResponse_descriptor;
      }

      public UnsubscribeResponse getDefaultInstanceForType() {
         return UnsubscribeResponse.getDefaultInstance();
      }

      public UnsubscribeResponse build() {
         UnsubscribeResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UnsubscribeResponse buildPartial() {
         UnsubscribeResponse var1 = new UnsubscribeResponse(this);
         this.onBuilt();
         return var1;
      }

      public UnsubscribeResponse.Builder clone() {
         return (UnsubscribeResponse.Builder)super.clone();
      }

      public UnsubscribeResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UnsubscribeResponse.Builder)super.setField(var1, var2);
      }

      public UnsubscribeResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UnsubscribeResponse.Builder)super.clearField(var1);
      }

      public UnsubscribeResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UnsubscribeResponse.Builder)super.clearOneof(var1);
      }

      public UnsubscribeResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UnsubscribeResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UnsubscribeResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UnsubscribeResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public UnsubscribeResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof UnsubscribeResponse) {
            return this.mergeFrom((UnsubscribeResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UnsubscribeResponse.Builder mergeFrom(UnsubscribeResponse var1) {
         if (var1 == UnsubscribeResponse.getDefaultInstance()) {
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

      public UnsubscribeResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final UnsubscribeResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UnsubscribeResponse.Builder)super.setUnknownFields(var1);
      }

      public final UnsubscribeResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UnsubscribeResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
