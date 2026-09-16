package com.lunarclient.websocket.emote.v1;

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

public final class UseEmoteRequest extends GeneratedMessageV3 implements UseEmoteRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int EMOTE_ID_FIELD_NUMBER = 1;
   private int emoteId_ = 0;
   public static final int EMOTE_METADATA_FIELD_NUMBER = 2;
   private int emoteMetadata_ = 0;
   public static final int EMOTE_SOUNDTRACK_URL_FIELD_NUMBER = 3;
   private volatile Object emoteSoundtrackUrl_ = "";
   public static final int EMOTE_JAM_ID_FIELD_NUMBER = 4;
   private int emoteJamId_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final UseEmoteRequest DEFAULT_INSTANCE = new UseEmoteRequest();
   private static final Parser<UseEmoteRequest> PARSER = new AbstractParser<UseEmoteRequest>() {
      public UseEmoteRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UseEmoteRequest.Builder var3 = UseEmoteRequest.newBuilder();

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

   private UseEmoteRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UseEmoteRequest() {
      this.emoteSoundtrackUrl_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UseEmoteRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_emote_v1_UseEmoteRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_emote_v1_UseEmoteRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UseEmoteRequest.class, UseEmoteRequest.Builder.class);
   }

   @Override
   public int getEmoteId() {
      return this.emoteId_;
   }

   @Override
   public int getEmoteMetadata() {
      return this.emoteMetadata_;
   }

   @Override
   public String getEmoteSoundtrackUrl() {
      Object var1 = this.emoteSoundtrackUrl_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.emoteSoundtrackUrl_ = var3;
      return var3;
   }

   @Override
   public ByteString getEmoteSoundtrackUrlBytes() {
      Object var1 = this.emoteSoundtrackUrl_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.emoteSoundtrackUrl_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getEmoteJamId() {
      return this.emoteJamId_;
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
      if (this.emoteId_ != 0) {
         var1.writeInt32(1, this.emoteId_);
      }

      if (this.emoteMetadata_ != 0) {
         var1.writeInt32(2, this.emoteMetadata_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.emoteSoundtrackUrl_)) {
         GeneratedMessageV3.writeString(var1, 3, this.emoteSoundtrackUrl_);
      }

      if (this.emoteJamId_ != 0) {
         var1.writeInt32(4, this.emoteJamId_);
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
      if (this.emoteId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.emoteId_);
      }

      if (this.emoteMetadata_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.emoteMetadata_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.emoteSoundtrackUrl_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.emoteSoundtrackUrl_);
      }

      if (this.emoteJamId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(4, this.emoteJamId_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof UseEmoteRequest)) {
         return super.equals(var1);
      } else {
         UseEmoteRequest var2 = (UseEmoteRequest)var1;
         if (this.getEmoteId() != var2.getEmoteId()) {
            return false;
         } else if (this.getEmoteMetadata() != var2.getEmoteMetadata()) {
            return false;
         } else if (!this.getEmoteSoundtrackUrl().equals(var2.getEmoteSoundtrackUrl())) {
            return false;
         } else {
            return this.getEmoteJamId() != var2.getEmoteJamId() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getEmoteId();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getEmoteMetadata();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getEmoteSoundtrackUrl().hashCode();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getEmoteJamId();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UseEmoteRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UseEmoteRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UseEmoteRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UseEmoteRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UseEmoteRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UseEmoteRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UseEmoteRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UseEmoteRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UseEmoteRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UseEmoteRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UseEmoteRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UseEmoteRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UseEmoteRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UseEmoteRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UseEmoteRequest.Builder newBuilder(UseEmoteRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UseEmoteRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UseEmoteRequest.Builder() : new UseEmoteRequest.Builder().mergeFrom(this);
   }

   protected UseEmoteRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UseEmoteRequest.Builder(var1);
   }

   public static UseEmoteRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UseEmoteRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<UseEmoteRequest> getParserForType() {
      return PARSER;
   }

   public UseEmoteRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UseEmoteRequest.Builder> implements UseEmoteRequestOrBuilder {
      private int bitField0_;
      private int emoteId_;
      private int emoteMetadata_;
      private Object emoteSoundtrackUrl_ = "";
      private int emoteJamId_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_emote_v1_UseEmoteRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_emote_v1_UseEmoteRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UseEmoteRequest.class, UseEmoteRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public UseEmoteRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.emoteId_ = 0;
         this.emoteMetadata_ = 0;
         this.emoteSoundtrackUrl_ = "";
         this.emoteJamId_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_emote_v1_UseEmoteRequest_descriptor;
      }

      public UseEmoteRequest getDefaultInstanceForType() {
         return UseEmoteRequest.getDefaultInstance();
      }

      public UseEmoteRequest build() {
         UseEmoteRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UseEmoteRequest buildPartial() {
         UseEmoteRequest var1 = new UseEmoteRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UseEmoteRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.emoteId_ = this.emoteId_;
         }

         if ((var2 & 2) != 0) {
            var1.emoteMetadata_ = this.emoteMetadata_;
         }

         if ((var2 & 4) != 0) {
            var1.emoteSoundtrackUrl_ = this.emoteSoundtrackUrl_;
         }

         if ((var2 & 8) != 0) {
            var1.emoteJamId_ = this.emoteJamId_;
         }
      }

      public UseEmoteRequest.Builder clone() {
         return (UseEmoteRequest.Builder)super.clone();
      }

      public UseEmoteRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UseEmoteRequest.Builder)super.setField(var1, var2);
      }

      public UseEmoteRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UseEmoteRequest.Builder)super.clearField(var1);
      }

      public UseEmoteRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UseEmoteRequest.Builder)super.clearOneof(var1);
      }

      public UseEmoteRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UseEmoteRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UseEmoteRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UseEmoteRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public UseEmoteRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof UseEmoteRequest) {
            return this.mergeFrom((UseEmoteRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UseEmoteRequest.Builder mergeFrom(UseEmoteRequest var1) {
         if (var1 == UseEmoteRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.getEmoteId() != 0) {
            this.setEmoteId(var1.getEmoteId());
         }

         if (var1.getEmoteMetadata() != 0) {
            this.setEmoteMetadata(var1.getEmoteMetadata());
         }

         if (!var1.getEmoteSoundtrackUrl().isEmpty()) {
            this.emoteSoundtrackUrl_ = var1.emoteSoundtrackUrl_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         if (var1.getEmoteJamId() != 0) {
            this.setEmoteJamId(var1.getEmoteJamId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public UseEmoteRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 8:
                     this.emoteId_ = var1.readInt32();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.emoteMetadata_ = var1.readInt32();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.emoteSoundtrackUrl_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.emoteJamId_ = var1.readInt32();
                     this.bitField0_ |= 8;
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
      public int getEmoteId() {
         return this.emoteId_;
      }

      public UseEmoteRequest.Builder setEmoteId(int var1) {
         this.emoteId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UseEmoteRequest.Builder clearEmoteId() {
         this.bitField0_ &= -2;
         this.emoteId_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getEmoteMetadata() {
         return this.emoteMetadata_;
      }

      public UseEmoteRequest.Builder setEmoteMetadata(int var1) {
         this.emoteMetadata_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UseEmoteRequest.Builder clearEmoteMetadata() {
         this.bitField0_ &= -3;
         this.emoteMetadata_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public String getEmoteSoundtrackUrl() {
         Object var1 = this.emoteSoundtrackUrl_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.emoteSoundtrackUrl_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getEmoteSoundtrackUrlBytes() {
         Object var1 = this.emoteSoundtrackUrl_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.emoteSoundtrackUrl_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public UseEmoteRequest.Builder setEmoteSoundtrackUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.emoteSoundtrackUrl_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public UseEmoteRequest.Builder clearEmoteSoundtrackUrl() {
         this.emoteSoundtrackUrl_ = UseEmoteRequest.getDefaultInstance().getEmoteSoundtrackUrl();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public UseEmoteRequest.Builder setEmoteSoundtrackUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         UseEmoteRequest.checkByteStringIsUtf8(var1);
         this.emoteSoundtrackUrl_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public int getEmoteJamId() {
         return this.emoteJamId_;
      }

      public UseEmoteRequest.Builder setEmoteJamId(int var1) {
         this.emoteJamId_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public UseEmoteRequest.Builder clearEmoteJamId() {
         this.bitField0_ &= -9;
         this.emoteJamId_ = 0;
         this.onChanged();
         return this;
      }

      public final UseEmoteRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UseEmoteRequest.Builder)super.setUnknownFields(var1);
      }

      public final UseEmoteRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UseEmoteRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
