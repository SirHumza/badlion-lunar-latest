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
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.MapFieldReflectionAccessor;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Map.Entry;

public final class PresignedUpload extends GeneratedMessageV3 implements PresignedUploadOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int UPLOAD_URL_FIELD_NUMBER = 1;
   private volatile Object uploadUrl_ = "";
   public static final int REQUIRED_HEADERS_FIELD_NUMBER = 2;
   private MapField<String, String> requiredHeaders_;
   public static final int MAX_BYTES_FIELD_NUMBER = 3;
   private long maxBytes_ = 0L;
   public static final int ACCEPTED_CONTENT_TYPE_FIELD_NUMBER = 4;
   private volatile Object acceptedContentType_ = "";
   public static final int EXPIRES_AT_FIELD_NUMBER = 5;
   private Timestamp expiresAt_;
   public static final int FINISHED_URL_FIELD_NUMBER = 6;
   private volatile Object finishedUrl_ = "";
   private byte memoizedIsInitialized = -1;
   private static final PresignedUpload DEFAULT_INSTANCE = new PresignedUpload();
   private static final Parser<PresignedUpload> PARSER = new AbstractParser<PresignedUpload>() {
      public PresignedUpload parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PresignedUpload.Builder var3 = PresignedUpload.newBuilder();

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

   private PresignedUpload(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PresignedUpload() {
      this.uploadUrl_ = "";
      this.acceptedContentType_ = "";
      this.finishedUrl_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PresignedUpload();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_PresignedUpload_descriptor;
   }

   @Override
   protected MapFieldReflectionAccessor internalGetMapFieldReflection(int var1) {
      switch (var1) {
         case 2:
            return this.internalGetRequiredHeaders();
         default:
            throw new RuntimeException("Invalid map field number: " + var1);
      }
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_PresignedUpload_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PresignedUpload.class, PresignedUpload.Builder.class);
   }

   @Override
   public String getUploadUrl() {
      Object var1 = this.uploadUrl_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.uploadUrl_ = var3;
      return var3;
   }

   @Override
   public ByteString getUploadUrlBytes() {
      Object var1 = this.uploadUrl_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.uploadUrl_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   private MapField<String, String> internalGetRequiredHeaders() {
      return this.requiredHeaders_ == null ? MapField.emptyMapField(PresignedUpload.RequiredHeadersDefaultEntryHolder.defaultEntry) : this.requiredHeaders_;
   }

   @Override
   public int getRequiredHeadersCount() {
      return this.internalGetRequiredHeaders().getMap().size();
   }

   @Override
   public boolean containsRequiredHeaders(String var1) {
      if (var1 == null) {
         throw new NullPointerException("map key");
      } else {
         return this.internalGetRequiredHeaders().getMap().containsKey(var1);
      }
   }

   @Deprecated
   @Override
   public Map<String, String> getRequiredHeaders() {
      return this.getRequiredHeadersMap();
   }

   @Override
   public Map<String, String> getRequiredHeadersMap() {
      return this.internalGetRequiredHeaders().getMap();
   }

   @Override
   public String getRequiredHeadersOrDefault(String var1, String var2) {
      if (var1 == null) {
         throw new NullPointerException("map key");
      }

      Map var3 = this.internalGetRequiredHeaders().getMap();
      return var3.containsKey(var1) ? (String)var3.get(var1) : var2;
   }

   @Override
   public String getRequiredHeadersOrThrow(String var1) {
      if (var1 == null) {
         throw new NullPointerException("map key");
      } else {
         Map var2 = this.internalGetRequiredHeaders().getMap();
         if (!var2.containsKey(var1)) {
            throw new IllegalArgumentException();
         } else {
            return (String)var2.get(var1);
         }
      }
   }

   @Override
   public long getMaxBytes() {
      return this.maxBytes_;
   }

   @Override
   public String getAcceptedContentType() {
      Object var1 = this.acceptedContentType_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.acceptedContentType_ = var3;
      return var3;
   }

   @Override
   public ByteString getAcceptedContentTypeBytes() {
      Object var1 = this.acceptedContentType_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.acceptedContentType_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasExpiresAt() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Timestamp getExpiresAt() {
      return this.expiresAt_ == null ? Timestamp.getDefaultInstance() : this.expiresAt_;
   }

   @Override
   public TimestampOrBuilder getExpiresAtOrBuilder() {
      return this.expiresAt_ == null ? Timestamp.getDefaultInstance() : this.expiresAt_;
   }

   @Override
   public String getFinishedUrl() {
      Object var1 = this.finishedUrl_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.finishedUrl_ = var3;
      return var3;
   }

   @Override
   public ByteString getFinishedUrlBytes() {
      Object var1 = this.finishedUrl_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.finishedUrl_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
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
      if (!GeneratedMessageV3.isStringEmpty(this.uploadUrl_)) {
         GeneratedMessageV3.writeString(var1, 1, this.uploadUrl_);
      }

      GeneratedMessageV3.serializeStringMapTo(var1, this.internalGetRequiredHeaders(), PresignedUpload.RequiredHeadersDefaultEntryHolder.defaultEntry, 2);
      if (this.maxBytes_ != 0L) {
         var1.writeUInt64(3, this.maxBytes_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.acceptedContentType_)) {
         GeneratedMessageV3.writeString(var1, 4, this.acceptedContentType_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(5, this.getExpiresAt());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.finishedUrl_)) {
         GeneratedMessageV3.writeString(var1, 6, this.finishedUrl_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.uploadUrl_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.uploadUrl_);
      }

      for (Entry var3 : this.internalGetRequiredHeaders().getMap().entrySet()) {
         MapEntry var4 = PresignedUpload.RequiredHeadersDefaultEntryHolder.defaultEntry
            .newBuilderForType()
            .setKey((String)var3.getKey())
            .setValue((String)var3.getValue())
            .build();
         var1 += CodedOutputStream.computeMessageSize(2, var4);
      }

      if (this.maxBytes_ != 0L) {
         var1 += CodedOutputStream.computeUInt64Size(3, this.maxBytes_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.acceptedContentType_)) {
         var1 += GeneratedMessageV3.computeStringSize(4, this.acceptedContentType_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(5, this.getExpiresAt());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.finishedUrl_)) {
         var1 += GeneratedMessageV3.computeStringSize(6, this.finishedUrl_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PresignedUpload)) {
         return super.equals(var1);
      } else {
         PresignedUpload var2 = (PresignedUpload)var1;
         if (!this.getUploadUrl().equals(var2.getUploadUrl())) {
            return false;
         } else if (!this.internalGetRequiredHeaders().equals(var2.internalGetRequiredHeaders())) {
            return false;
         } else if (this.getMaxBytes() != var2.getMaxBytes()) {
            return false;
         } else if (!this.getAcceptedContentType().equals(var2.getAcceptedContentType())) {
            return false;
         } else if (this.hasExpiresAt() != var2.hasExpiresAt()) {
            return false;
         } else if (this.hasExpiresAt() && !this.getExpiresAt().equals(var2.getExpiresAt())) {
            return false;
         } else {
            return !this.getFinishedUrl().equals(var2.getFinishedUrl()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getUploadUrl().hashCode();
      if (!this.internalGetRequiredHeaders().getMap().isEmpty()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.internalGetRequiredHeaders().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Internal.hashLong(this.getMaxBytes());
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getAcceptedContentType().hashCode();
      if (this.hasExpiresAt()) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getExpiresAt().hashCode();
      }

      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.getFinishedUrl().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PresignedUpload parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PresignedUpload parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PresignedUpload parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PresignedUpload parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PresignedUpload parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PresignedUpload parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PresignedUpload parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PresignedUpload parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PresignedUpload parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PresignedUpload parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PresignedUpload parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PresignedUpload parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PresignedUpload.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PresignedUpload.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PresignedUpload.Builder newBuilder(PresignedUpload var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PresignedUpload.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PresignedUpload.Builder() : new PresignedUpload.Builder().mergeFrom(this);
   }

   protected PresignedUpload.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PresignedUpload.Builder(var1);
   }

   public static PresignedUpload getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PresignedUpload> parser() {
      return PARSER;
   }

   @Override
   public Parser<PresignedUpload> getParserForType() {
      return PARSER;
   }

   public PresignedUpload getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PresignedUpload.Builder> implements PresignedUploadOrBuilder {
      private int bitField0_;
      private Object uploadUrl_ = "";
      private MapField<String, String> requiredHeaders_;
      private long maxBytes_;
      private Object acceptedContentType_ = "";
      private Timestamp expiresAt_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> expiresAtBuilder_;
      private Object finishedUrl_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_PresignedUpload_descriptor;
      }

      @Override
      protected MapFieldReflectionAccessor internalGetMapFieldReflection(int var1) {
         switch (var1) {
            case 2:
               return this.internalGetRequiredHeaders();
            default:
               throw new RuntimeException("Invalid map field number: " + var1);
         }
      }

      @Override
      protected MapFieldReflectionAccessor internalGetMutableMapFieldReflection(int var1) {
         switch (var1) {
            case 2:
               return this.internalGetMutableRequiredHeaders();
            default:
               throw new RuntimeException("Invalid map field number: " + var1);
         }
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_PresignedUpload_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PresignedUpload.class, PresignedUpload.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (PresignedUpload.alwaysUseFieldBuilders) {
            this.getExpiresAtFieldBuilder();
         }
      }

      public PresignedUpload.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.uploadUrl_ = "";
         this.internalGetMutableRequiredHeaders().clear();
         this.maxBytes_ = 0L;
         this.acceptedContentType_ = "";
         this.expiresAt_ = null;
         if (this.expiresAtBuilder_ != null) {
            this.expiresAtBuilder_.dispose();
            this.expiresAtBuilder_ = null;
         }

         this.finishedUrl_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_PresignedUpload_descriptor;
      }

      public PresignedUpload getDefaultInstanceForType() {
         return PresignedUpload.getDefaultInstance();
      }

      public PresignedUpload build() {
         PresignedUpload var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PresignedUpload buildPartial() {
         PresignedUpload var1 = new PresignedUpload(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(PresignedUpload var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.uploadUrl_ = this.uploadUrl_;
         }

         if ((var2 & 2) != 0) {
            var1.requiredHeaders_ = this.internalGetRequiredHeaders();
            var1.requiredHeaders_.makeImmutable();
         }

         if ((var2 & 4) != 0) {
            var1.maxBytes_ = this.maxBytes_;
         }

         if ((var2 & 8) != 0) {
            var1.acceptedContentType_ = this.acceptedContentType_;
         }

         byte var3 = 0;
         if ((var2 & 16) != 0) {
            var1.expiresAt_ = this.expiresAtBuilder_ == null ? this.expiresAt_ : this.expiresAtBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 32) != 0) {
            var1.finishedUrl_ = this.finishedUrl_;
         }

         PresignedUpload var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public PresignedUpload.Builder clone() {
         return (PresignedUpload.Builder)super.clone();
      }

      public PresignedUpload.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PresignedUpload.Builder)super.setField(var1, var2);
      }

      public PresignedUpload.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PresignedUpload.Builder)super.clearField(var1);
      }

      public PresignedUpload.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PresignedUpload.Builder)super.clearOneof(var1);
      }

      public PresignedUpload.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PresignedUpload.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PresignedUpload.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PresignedUpload.Builder)super.addRepeatedField(var1, var2);
      }

      public PresignedUpload.Builder mergeFrom(Message var1) {
         if (var1 instanceof PresignedUpload) {
            return this.mergeFrom((PresignedUpload)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PresignedUpload.Builder mergeFrom(PresignedUpload var1) {
         if (var1 == PresignedUpload.getDefaultInstance()) {
            return this;
         }

         if (!var1.getUploadUrl().isEmpty()) {
            this.uploadUrl_ = var1.uploadUrl_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         this.internalGetMutableRequiredHeaders().mergeFrom(var1.internalGetRequiredHeaders());
         this.bitField0_ |= 2;
         if (var1.getMaxBytes() != 0L) {
            this.setMaxBytes(var1.getMaxBytes());
         }

         if (!var1.getAcceptedContentType().isEmpty()) {
            this.acceptedContentType_ = var1.acceptedContentType_;
            this.bitField0_ |= 8;
            this.onChanged();
         }

         if (var1.hasExpiresAt()) {
            this.mergeExpiresAt(var1.getExpiresAt());
         }

         if (!var1.getFinishedUrl().isEmpty()) {
            this.finishedUrl_ = var1.finishedUrl_;
            this.bitField0_ |= 32;
            this.onChanged();
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public PresignedUpload.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.uploadUrl_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     MapEntry var5 = var1.readMessage(PresignedUpload.RequiredHeadersDefaultEntryHolder.defaultEntry.getParserForType(), var2);
                     this.internalGetMutableRequiredHeaders().getMutableMap().put((String)var5.getKey(), (String)var5.getValue());
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.maxBytes_ = var1.readUInt64();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     this.acceptedContentType_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     var1.readMessage(this.getExpiresAtFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     this.finishedUrl_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 32;
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var9) {
            throw var9.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      @Override
      public String getUploadUrl() {
         Object var1 = this.uploadUrl_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.uploadUrl_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getUploadUrlBytes() {
         Object var1 = this.uploadUrl_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.uploadUrl_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public PresignedUpload.Builder setUploadUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.uploadUrl_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PresignedUpload.Builder clearUploadUrl() {
         this.uploadUrl_ = PresignedUpload.getDefaultInstance().getUploadUrl();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public PresignedUpload.Builder setUploadUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         PresignedUpload.checkByteStringIsUtf8(var1);
         this.uploadUrl_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      private MapField<String, String> internalGetRequiredHeaders() {
         return this.requiredHeaders_ == null ? MapField.emptyMapField(PresignedUpload.RequiredHeadersDefaultEntryHolder.defaultEntry) : this.requiredHeaders_;
      }

      private MapField<String, String> internalGetMutableRequiredHeaders() {
         if (this.requiredHeaders_ == null) {
            this.requiredHeaders_ = MapField.newMapField(PresignedUpload.RequiredHeadersDefaultEntryHolder.defaultEntry);
         }

         if (!this.requiredHeaders_.isMutable()) {
            this.requiredHeaders_ = this.requiredHeaders_.copy();
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this.requiredHeaders_;
      }

      @Override
      public int getRequiredHeadersCount() {
         return this.internalGetRequiredHeaders().getMap().size();
      }

      @Override
      public boolean containsRequiredHeaders(String var1) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         } else {
            return this.internalGetRequiredHeaders().getMap().containsKey(var1);
         }
      }

      @Deprecated
      @Override
      public Map<String, String> getRequiredHeaders() {
         return this.getRequiredHeadersMap();
      }

      @Override
      public Map<String, String> getRequiredHeadersMap() {
         return this.internalGetRequiredHeaders().getMap();
      }

      @Override
      public String getRequiredHeadersOrDefault(String var1, String var2) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         }

         Map var3 = this.internalGetRequiredHeaders().getMap();
         return var3.containsKey(var1) ? (String)var3.get(var1) : var2;
      }

      @Override
      public String getRequiredHeadersOrThrow(String var1) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         } else {
            Map var2 = this.internalGetRequiredHeaders().getMap();
            if (!var2.containsKey(var1)) {
               throw new IllegalArgumentException();
            } else {
               return (String)var2.get(var1);
            }
         }
      }

      public PresignedUpload.Builder clearRequiredHeaders() {
         this.bitField0_ &= -3;
         this.internalGetMutableRequiredHeaders().getMutableMap().clear();
         return this;
      }

      public PresignedUpload.Builder removeRequiredHeaders(String var1) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         }

         this.internalGetMutableRequiredHeaders().getMutableMap().remove(var1);
         return this;
      }

      @Deprecated
      public Map<String, String> getMutableRequiredHeaders() {
         this.bitField0_ |= 2;
         return this.internalGetMutableRequiredHeaders().getMutableMap();
      }

      public PresignedUpload.Builder putRequiredHeaders(String var1, String var2) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         }

         if (var2 == null) {
            throw new NullPointerException("map value");
         }

         this.internalGetMutableRequiredHeaders().getMutableMap().put(var1, var2);
         this.bitField0_ |= 2;
         return this;
      }

      public PresignedUpload.Builder putAllRequiredHeaders(Map<String, String> var1) {
         this.internalGetMutableRequiredHeaders().getMutableMap().putAll(var1);
         this.bitField0_ |= 2;
         return this;
      }

      @Override
      public long getMaxBytes() {
         return this.maxBytes_;
      }

      public PresignedUpload.Builder setMaxBytes(long var1) {
         this.maxBytes_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public PresignedUpload.Builder clearMaxBytes() {
         this.bitField0_ &= -5;
         this.maxBytes_ = 0L;
         this.onChanged();
         return this;
      }

      @Override
      public String getAcceptedContentType() {
         Object var1 = this.acceptedContentType_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.acceptedContentType_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getAcceptedContentTypeBytes() {
         Object var1 = this.acceptedContentType_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.acceptedContentType_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public PresignedUpload.Builder setAcceptedContentType(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.acceptedContentType_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public PresignedUpload.Builder clearAcceptedContentType() {
         this.acceptedContentType_ = PresignedUpload.getDefaultInstance().getAcceptedContentType();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      public PresignedUpload.Builder setAcceptedContentTypeBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         PresignedUpload.checkByteStringIsUtf8(var1);
         this.acceptedContentType_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasExpiresAt() {
         return (this.bitField0_ & 16) != 0;
      }

      @Override
      public Timestamp getExpiresAt() {
         if (this.expiresAtBuilder_ == null) {
            return this.expiresAt_ == null ? Timestamp.getDefaultInstance() : this.expiresAt_;
         } else {
            return this.expiresAtBuilder_.getMessage();
         }
      }

      public PresignedUpload.Builder setExpiresAt(Timestamp var1) {
         if (this.expiresAtBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.expiresAt_ = var1;
         } else {
            this.expiresAtBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public PresignedUpload.Builder setExpiresAt(Timestamp.Builder var1) {
         if (this.expiresAtBuilder_ == null) {
            this.expiresAt_ = var1.build();
         } else {
            this.expiresAtBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public PresignedUpload.Builder mergeExpiresAt(Timestamp var1) {
         if (this.expiresAtBuilder_ == null) {
            if ((this.bitField0_ & 16) != 0 && this.expiresAt_ != null && this.expiresAt_ != Timestamp.getDefaultInstance()) {
               this.getExpiresAtBuilder().mergeFrom(var1);
            } else {
               this.expiresAt_ = var1;
            }
         } else {
            this.expiresAtBuilder_.mergeFrom(var1);
         }

         if (this.expiresAt_ != null) {
            this.bitField0_ |= 16;
            this.onChanged();
         }

         return this;
      }

      public PresignedUpload.Builder clearExpiresAt() {
         this.bitField0_ &= -17;
         this.expiresAt_ = null;
         if (this.expiresAtBuilder_ != null) {
            this.expiresAtBuilder_.dispose();
            this.expiresAtBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getExpiresAtBuilder() {
         this.bitField0_ |= 16;
         this.onChanged();
         return this.getExpiresAtFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getExpiresAtOrBuilder() {
         if (this.expiresAtBuilder_ != null) {
            return this.expiresAtBuilder_.getMessageOrBuilder();
         } else {
            return this.expiresAt_ == null ? Timestamp.getDefaultInstance() : this.expiresAt_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getExpiresAtFieldBuilder() {
         if (this.expiresAtBuilder_ == null) {
            this.expiresAtBuilder_ = new SingleFieldBuilderV3<>(this.getExpiresAt(), this.getParentForChildren(), this.isClean());
            this.expiresAt_ = null;
         }

         return this.expiresAtBuilder_;
      }

      @Override
      public String getFinishedUrl() {
         Object var1 = this.finishedUrl_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.finishedUrl_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getFinishedUrlBytes() {
         Object var1 = this.finishedUrl_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.finishedUrl_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public PresignedUpload.Builder setFinishedUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.finishedUrl_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public PresignedUpload.Builder clearFinishedUrl() {
         this.finishedUrl_ = PresignedUpload.getDefaultInstance().getFinishedUrl();
         this.bitField0_ &= -33;
         this.onChanged();
         return this;
      }

      public PresignedUpload.Builder setFinishedUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         PresignedUpload.checkByteStringIsUtf8(var1);
         this.finishedUrl_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public final PresignedUpload.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PresignedUpload.Builder)super.setUnknownFields(var1);
      }

      public final PresignedUpload.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PresignedUpload.Builder)super.mergeUnknownFields(var1);
      }
   }

   private static final class RequiredHeadersDefaultEntryHolder {
      static final MapEntry<String, String> defaultEntry = MapEntry.newDefaultInstance(
         CommonProto.internal_static_lunarclient_websocket_conversation_v1_PresignedUpload_RequiredHeadersEntry_descriptor,
         WireFormat.FieldType.STRING,
         "",
         WireFormat.FieldType.STRING,
         ""
      );
   }
}
