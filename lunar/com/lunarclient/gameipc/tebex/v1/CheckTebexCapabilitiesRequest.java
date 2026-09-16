package com.lunarclient.gameipc.tebex.v1;

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

public final class CheckTebexCapabilitiesRequest extends GeneratedMessageV3 implements CheckTebexCapabilitiesRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final CheckTebexCapabilitiesRequest DEFAULT_INSTANCE = new CheckTebexCapabilitiesRequest();
   private static final Parser<CheckTebexCapabilitiesRequest> PARSER = new AbstractParser<CheckTebexCapabilitiesRequest>() {
      public CheckTebexCapabilitiesRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         CheckTebexCapabilitiesRequest.Builder var3 = CheckTebexCapabilitiesRequest.newBuilder();

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

   private CheckTebexCapabilitiesRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private CheckTebexCapabilitiesRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new CheckTebexCapabilitiesRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_tebex_v1_CheckTebexCapabilitiesRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_tebex_v1_CheckTebexCapabilitiesRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(CheckTebexCapabilitiesRequest.class, CheckTebexCapabilitiesRequest.Builder.class);
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

      if (!(var1 instanceof CheckTebexCapabilitiesRequest)) {
         return super.equals(var1);
      }

      CheckTebexCapabilitiesRequest var2 = (CheckTebexCapabilitiesRequest)var1;
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

   public static CheckTebexCapabilitiesRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static CheckTebexCapabilitiesRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CheckTebexCapabilitiesRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static CheckTebexCapabilitiesRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CheckTebexCapabilitiesRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static CheckTebexCapabilitiesRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CheckTebexCapabilitiesRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CheckTebexCapabilitiesRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CheckTebexCapabilitiesRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CheckTebexCapabilitiesRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CheckTebexCapabilitiesRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CheckTebexCapabilitiesRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CheckTebexCapabilitiesRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CheckTebexCapabilitiesRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CheckTebexCapabilitiesRequest.Builder newBuilder(CheckTebexCapabilitiesRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CheckTebexCapabilitiesRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CheckTebexCapabilitiesRequest.Builder() : new CheckTebexCapabilitiesRequest.Builder().mergeFrom(this);
   }

   protected CheckTebexCapabilitiesRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new CheckTebexCapabilitiesRequest.Builder(var1);
   }

   public static CheckTebexCapabilitiesRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<CheckTebexCapabilitiesRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<CheckTebexCapabilitiesRequest> getParserForType() {
      return PARSER;
   }

   public CheckTebexCapabilitiesRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<CheckTebexCapabilitiesRequest.Builder>
      implements CheckTebexCapabilitiesRequestOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_tebex_v1_CheckTebexCapabilitiesRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_tebex_v1_CheckTebexCapabilitiesRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(CheckTebexCapabilitiesRequest.class, CheckTebexCapabilitiesRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public CheckTebexCapabilitiesRequest.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_tebex_v1_CheckTebexCapabilitiesRequest_descriptor;
      }

      public CheckTebexCapabilitiesRequest getDefaultInstanceForType() {
         return CheckTebexCapabilitiesRequest.getDefaultInstance();
      }

      public CheckTebexCapabilitiesRequest build() {
         CheckTebexCapabilitiesRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CheckTebexCapabilitiesRequest buildPartial() {
         CheckTebexCapabilitiesRequest var1 = new CheckTebexCapabilitiesRequest(this);
         this.onBuilt();
         return var1;
      }

      public CheckTebexCapabilitiesRequest.Builder clone() {
         return (CheckTebexCapabilitiesRequest.Builder)super.clone();
      }

      public CheckTebexCapabilitiesRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CheckTebexCapabilitiesRequest.Builder)super.setField(var1, var2);
      }

      public CheckTebexCapabilitiesRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (CheckTebexCapabilitiesRequest.Builder)super.clearField(var1);
      }

      public CheckTebexCapabilitiesRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (CheckTebexCapabilitiesRequest.Builder)super.clearOneof(var1);
      }

      public CheckTebexCapabilitiesRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (CheckTebexCapabilitiesRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CheckTebexCapabilitiesRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CheckTebexCapabilitiesRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public CheckTebexCapabilitiesRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof CheckTebexCapabilitiesRequest) {
            return this.mergeFrom((CheckTebexCapabilitiesRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public CheckTebexCapabilitiesRequest.Builder mergeFrom(CheckTebexCapabilitiesRequest var1) {
         if (var1 == CheckTebexCapabilitiesRequest.getDefaultInstance()) {
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

      public CheckTebexCapabilitiesRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final CheckTebexCapabilitiesRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CheckTebexCapabilitiesRequest.Builder)super.setUnknownFields(var1);
      }

      public final CheckTebexCapabilitiesRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CheckTebexCapabilitiesRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
