package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UploadRequestItem extends GeneratedMessageV3 implements UploadRequestItemOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
   private volatile Object contentType_ = "";
   public static final int EXPECTED_SIZE_BYTES_FIELD_NUMBER = 2;
   private long expectedSizeBytes_ = 0L;
   private byte memoizedIsInitialized = -1;
   private static final UploadRequestItem DEFAULT_INSTANCE = new UploadRequestItem();
   private static final Parser<UploadRequestItem> PARSER = new AbstractParser<UploadRequestItem>() {
      public UploadRequestItem parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UploadRequestItem.Builder var3 = UploadRequestItem.newBuilder();

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

   private UploadRequestItem(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UploadRequestItem() {
      this.contentType_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UploadRequestItem();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_UploadRequestItem_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_UploadRequestItem_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UploadRequestItem.class, UploadRequestItem.Builder.class);
   }

   @Override
   public String getContentType() {
      Object var1 = this.contentType_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.contentType_ = var3;
      return var3;
   }

   @Override
   public ByteString getContentTypeBytes() {
      Object var1 = this.contentType_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.contentType_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public long getExpectedSizeBytes() {
      return this.expectedSizeBytes_;
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
      if (!GeneratedMessageV3.isStringEmpty(this.contentType_)) {
         GeneratedMessageV3.writeString(var1, 1, this.contentType_);
      }

      if (this.expectedSizeBytes_ != 0L) {
         var1.writeUInt64(2, this.expectedSizeBytes_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.contentType_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.contentType_);
      }

      if (this.expectedSizeBytes_ != 0L) {
         var1 += CodedOutputStream.computeUInt64Size(2, this.expectedSizeBytes_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof UploadRequestItem)) {
         return super.equals(var1);
      } else {
         UploadRequestItem var2 = (UploadRequestItem)var1;
         if (!this.getContentType().equals(var2.getContentType())) {
            return false;
         } else {
            return this.getExpectedSizeBytes() != var2.getExpectedSizeBytes() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
         }
      }
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getContentType().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Internal.hashLong(this.getExpectedSizeBytes());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UploadRequestItem parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UploadRequestItem parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UploadRequestItem parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UploadRequestItem parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UploadRequestItem parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UploadRequestItem parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UploadRequestItem parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UploadRequestItem parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UploadRequestItem parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UploadRequestItem parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UploadRequestItem parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UploadRequestItem parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UploadRequestItem.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UploadRequestItem.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UploadRequestItem.Builder newBuilder(UploadRequestItem var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UploadRequestItem.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UploadRequestItem.Builder() : new UploadRequestItem.Builder().mergeFrom(this);
   }

   protected UploadRequestItem.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UploadRequestItem.Builder(var1);
   }

   public static UploadRequestItem getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UploadRequestItem> parser() {
      return PARSER;
   }

   @Override
   public Parser<UploadRequestItem> getParserForType() {
      return PARSER;
   }

   public UploadRequestItem getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UploadRequestItem.Builder> implements UploadRequestItemOrBuilder {
      private int bitField0_;
      private Object contentType_ = "";
      private long expectedSizeBytes_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_UploadRequestItem_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_UploadRequestItem_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UploadRequestItem.class, UploadRequestItem.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public UploadRequestItem.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.contentType_ = "";
         this.expectedSizeBytes_ = 0L;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_UploadRequestItem_descriptor;
      }

      public UploadRequestItem getDefaultInstanceForType() {
         return UploadRequestItem.getDefaultInstance();
      }

      public UploadRequestItem build() {
         UploadRequestItem var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UploadRequestItem buildPartial() {
         UploadRequestItem var1 = new UploadRequestItem(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UploadRequestItem var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.contentType_ = this.contentType_;
         }

         if ((var2 & 2) != 0) {
            var1.expectedSizeBytes_ = this.expectedSizeBytes_;
         }
      }

      public UploadRequestItem.Builder clone() {
         return (UploadRequestItem.Builder)super.clone();
      }

      public UploadRequestItem.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UploadRequestItem.Builder)super.setField(var1, var2);
      }

      public UploadRequestItem.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UploadRequestItem.Builder)super.clearField(var1);
      }

      public UploadRequestItem.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UploadRequestItem.Builder)super.clearOneof(var1);
      }

      public UploadRequestItem.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UploadRequestItem.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UploadRequestItem.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UploadRequestItem.Builder)super.addRepeatedField(var1, var2);
      }

      public UploadRequestItem.Builder mergeFrom(Message var1) {
         if (var1 instanceof UploadRequestItem) {
            return this.mergeFrom((UploadRequestItem)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UploadRequestItem.Builder mergeFrom(UploadRequestItem var1) {
         if (var1 == UploadRequestItem.getDefaultInstance()) {
            return this;
         }

         if (!var1.getContentType().isEmpty()) {
            this.contentType_ = var1.contentType_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.getExpectedSizeBytes() != 0L) {
            this.setExpectedSizeBytes(var1.getExpectedSizeBytes());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public UploadRequestItem.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.contentType_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.expectedSizeBytes_ = var1.readUInt64();
                     this.bitField0_ |= 2;
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
      public String getContentType() {
         Object var1 = this.contentType_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.contentType_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getContentTypeBytes() {
         Object var1 = this.contentType_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.contentType_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public UploadRequestItem.Builder setContentType(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.contentType_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UploadRequestItem.Builder clearContentType() {
         this.contentType_ = UploadRequestItem.getDefaultInstance().getContentType();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public UploadRequestItem.Builder setContentTypeBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         UploadRequestItem.checkByteStringIsUtf8(var1);
         this.contentType_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public long getExpectedSizeBytes() {
         return this.expectedSizeBytes_;
      }

      public UploadRequestItem.Builder setExpectedSizeBytes(long var1) {
         this.expectedSizeBytes_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UploadRequestItem.Builder clearExpectedSizeBytes() {
         this.bitField0_ &= -3;
         this.expectedSizeBytes_ = 0L;
         this.onChanged();
         return this;
      }

      public final UploadRequestItem.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UploadRequestItem.Builder)super.setUnknownFields(var1);
      }

      public final UploadRequestItem.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UploadRequestItem.Builder)super.mergeUnknownFields(var1);
      }
   }
}
