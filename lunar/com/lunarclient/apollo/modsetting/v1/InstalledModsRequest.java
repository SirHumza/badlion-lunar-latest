package com.lunarclient.apollo.modsetting.v1;

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

public final class InstalledModsRequest extends GeneratedMessageV3 implements InstalledModsRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int REQUEST_ID_FIELD_NUMBER = 1;
   private ByteString requestId_ = ByteString.EMPTY;
   private byte memoizedIsInitialized = -1;
   private static final InstalledModsRequest DEFAULT_INSTANCE = new InstalledModsRequest();
   private static final Parser<InstalledModsRequest> PARSER = new AbstractParser<InstalledModsRequest>() {
      public InstalledModsRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         InstalledModsRequest.Builder var3 = InstalledModsRequest.newBuilder();

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

   private InstalledModsRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private InstalledModsRequest() {
      this.requestId_ = ByteString.EMPTY;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new InstalledModsRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_modsetting_v1_InstalledModsRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_modsetting_v1_InstalledModsRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(InstalledModsRequest.class, InstalledModsRequest.Builder.class);
   }

   @Override
   public ByteString getRequestId() {
      return this.requestId_;
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
      if (!this.requestId_.isEmpty()) {
         var1.writeBytes(1, this.requestId_);
      }

      this.getUnknownFields().writeTo(var1);
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      var1 = 0;
      if (!this.requestId_.isEmpty()) {
         var1 += CodedOutputStream.computeBytesSize(1, this.requestId_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof InstalledModsRequest)) {
         return super.equals(var1);
      }

      InstalledModsRequest var2 = (InstalledModsRequest)var1;
      return !this.getRequestId().equals(var2.getRequestId()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getRequestId().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static InstalledModsRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static InstalledModsRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InstalledModsRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static InstalledModsRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InstalledModsRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static InstalledModsRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InstalledModsRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InstalledModsRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static InstalledModsRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static InstalledModsRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static InstalledModsRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InstalledModsRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public InstalledModsRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static InstalledModsRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static InstalledModsRequest.Builder newBuilder(InstalledModsRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public InstalledModsRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new InstalledModsRequest.Builder() : new InstalledModsRequest.Builder().mergeFrom(this);
   }

   protected InstalledModsRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new InstalledModsRequest.Builder(var1);
   }

   public static InstalledModsRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<InstalledModsRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<InstalledModsRequest> getParserForType() {
      return PARSER;
   }

   public InstalledModsRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<InstalledModsRequest.Builder> implements InstalledModsRequestOrBuilder {
      private int bitField0_;
      private ByteString requestId_ = ByteString.EMPTY;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_modsetting_v1_InstalledModsRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_modsetting_v1_InstalledModsRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(InstalledModsRequest.class, InstalledModsRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public InstalledModsRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.requestId_ = ByteString.EMPTY;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_modsetting_v1_InstalledModsRequest_descriptor;
      }

      public InstalledModsRequest getDefaultInstanceForType() {
         return InstalledModsRequest.getDefaultInstance();
      }

      public InstalledModsRequest build() {
         InstalledModsRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public InstalledModsRequest buildPartial() {
         InstalledModsRequest var1 = new InstalledModsRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(InstalledModsRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.requestId_ = this.requestId_;
         }
      }

      public InstalledModsRequest.Builder clone() {
         return (InstalledModsRequest.Builder)super.clone();
      }

      public InstalledModsRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InstalledModsRequest.Builder)super.setField(var1, var2);
      }

      public InstalledModsRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (InstalledModsRequest.Builder)super.clearField(var1);
      }

      public InstalledModsRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (InstalledModsRequest.Builder)super.clearOneof(var1);
      }

      public InstalledModsRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (InstalledModsRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public InstalledModsRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InstalledModsRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public InstalledModsRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof InstalledModsRequest) {
            return this.mergeFrom((InstalledModsRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public InstalledModsRequest.Builder mergeFrom(InstalledModsRequest var1) {
         if (var1 == InstalledModsRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.getRequestId() != ByteString.EMPTY) {
            this.setRequestId(var1.getRequestId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public InstalledModsRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 10:
                     this.requestId_ = var1.readBytes();
                     this.bitField0_ |= 1;
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

      @Override
      public ByteString getRequestId() {
         return this.requestId_;
      }

      public InstalledModsRequest.Builder setRequestId(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.requestId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public InstalledModsRequest.Builder clearRequestId() {
         this.bitField0_ &= -2;
         this.requestId_ = InstalledModsRequest.getDefaultInstance().getRequestId();
         this.onChanged();
         return this;
      }

      public final InstalledModsRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (InstalledModsRequest.Builder)super.setUnknownFields(var1);
      }

      public final InstalledModsRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (InstalledModsRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
