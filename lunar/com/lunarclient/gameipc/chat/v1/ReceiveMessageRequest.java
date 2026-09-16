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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ReceiveMessageRequest extends GeneratedMessageV3 implements ReceiveMessageRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int SENDER_FIELD_NUMBER = 1;
   private UuidAndUsername sender_;
   public static final int CONTENT_FIELD_NUMBER = 2;
   private volatile Object content_ = "";
   private byte memoizedIsInitialized = -1;
   private static final ReceiveMessageRequest DEFAULT_INSTANCE = new ReceiveMessageRequest();
   private static final Parser<ReceiveMessageRequest> PARSER = new AbstractParser<ReceiveMessageRequest>() {
      public ReceiveMessageRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ReceiveMessageRequest.Builder var3 = ReceiveMessageRequest.newBuilder();

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

   private ReceiveMessageRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ReceiveMessageRequest() {
      this.content_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ReceiveMessageRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_chat_v1_ReceiveMessageRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_chat_v1_ReceiveMessageRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ReceiveMessageRequest.class, ReceiveMessageRequest.Builder.class);
   }

   @Override
   public boolean hasSender() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public UuidAndUsername getSender() {
      return this.sender_ == null ? UuidAndUsername.getDefaultInstance() : this.sender_;
   }

   @Override
   public UuidAndUsernameOrBuilder getSenderOrBuilder() {
      return this.sender_ == null ? UuidAndUsername.getDefaultInstance() : this.sender_;
   }

   @Override
   public String getContent() {
      Object var1 = this.content_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.content_ = var3;
      return var3;
   }

   @Override
   public ByteString getContentBytes() {
      Object var1 = this.content_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.content_ = var2;
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
      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(1, this.getSender());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.content_)) {
         GeneratedMessageV3.writeString(var1, 2, this.content_);
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
      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(1, this.getSender());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.content_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.content_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ReceiveMessageRequest)) {
         return super.equals(var1);
      } else {
         ReceiveMessageRequest var2 = (ReceiveMessageRequest)var1;
         if (this.hasSender() != var2.hasSender()) {
            return false;
         } else if (this.hasSender() && !this.getSender().equals(var2.getSender())) {
            return false;
         } else {
            return !this.getContent().equals(var2.getContent()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasSender()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getSender().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getContent().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ReceiveMessageRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ReceiveMessageRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ReceiveMessageRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ReceiveMessageRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ReceiveMessageRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ReceiveMessageRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ReceiveMessageRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ReceiveMessageRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ReceiveMessageRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ReceiveMessageRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ReceiveMessageRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ReceiveMessageRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ReceiveMessageRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ReceiveMessageRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ReceiveMessageRequest.Builder newBuilder(ReceiveMessageRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ReceiveMessageRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ReceiveMessageRequest.Builder() : new ReceiveMessageRequest.Builder().mergeFrom(this);
   }

   protected ReceiveMessageRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ReceiveMessageRequest.Builder(var1);
   }

   public static ReceiveMessageRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ReceiveMessageRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<ReceiveMessageRequest> getParserForType() {
      return PARSER;
   }

   public ReceiveMessageRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ReceiveMessageRequest.Builder> implements ReceiveMessageRequestOrBuilder {
      private int bitField0_;
      private UuidAndUsername sender_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> senderBuilder_;
      private Object content_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_chat_v1_ReceiveMessageRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_chat_v1_ReceiveMessageRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ReceiveMessageRequest.class, ReceiveMessageRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ReceiveMessageRequest.alwaysUseFieldBuilders) {
            this.getSenderFieldBuilder();
         }
      }

      public ReceiveMessageRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.sender_ = null;
         if (this.senderBuilder_ != null) {
            this.senderBuilder_.dispose();
            this.senderBuilder_ = null;
         }

         this.content_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_chat_v1_ReceiveMessageRequest_descriptor;
      }

      public ReceiveMessageRequest getDefaultInstanceForType() {
         return ReceiveMessageRequest.getDefaultInstance();
      }

      public ReceiveMessageRequest build() {
         ReceiveMessageRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ReceiveMessageRequest buildPartial() {
         ReceiveMessageRequest var1 = new ReceiveMessageRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ReceiveMessageRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.sender_ = this.senderBuilder_ == null ? this.sender_ : this.senderBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.content_ = this.content_;
         }

         ReceiveMessageRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ReceiveMessageRequest.Builder clone() {
         return (ReceiveMessageRequest.Builder)super.clone();
      }

      public ReceiveMessageRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ReceiveMessageRequest.Builder)super.setField(var1, var2);
      }

      public ReceiveMessageRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ReceiveMessageRequest.Builder)super.clearField(var1);
      }

      public ReceiveMessageRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ReceiveMessageRequest.Builder)super.clearOneof(var1);
      }

      public ReceiveMessageRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ReceiveMessageRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ReceiveMessageRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ReceiveMessageRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public ReceiveMessageRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof ReceiveMessageRequest) {
            return this.mergeFrom((ReceiveMessageRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ReceiveMessageRequest.Builder mergeFrom(ReceiveMessageRequest var1) {
         if (var1 == ReceiveMessageRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasSender()) {
            this.mergeSender(var1.getSender());
         }

         if (!var1.getContent().isEmpty()) {
            this.content_ = var1.content_;
            this.bitField0_ |= 2;
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

      public ReceiveMessageRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getSenderFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.content_ = var1.readStringRequireUtf8();
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
      public boolean hasSender() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public UuidAndUsername getSender() {
         if (this.senderBuilder_ == null) {
            return this.sender_ == null ? UuidAndUsername.getDefaultInstance() : this.sender_;
         } else {
            return this.senderBuilder_.getMessage();
         }
      }

      public ReceiveMessageRequest.Builder setSender(UuidAndUsername var1) {
         if (this.senderBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.sender_ = var1;
         } else {
            this.senderBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ReceiveMessageRequest.Builder setSender(UuidAndUsername.Builder var1) {
         if (this.senderBuilder_ == null) {
            this.sender_ = var1.build();
         } else {
            this.senderBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ReceiveMessageRequest.Builder mergeSender(UuidAndUsername var1) {
         if (this.senderBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.sender_ != null && this.sender_ != UuidAndUsername.getDefaultInstance()) {
               this.getSenderBuilder().mergeFrom(var1);
            } else {
               this.sender_ = var1;
            }
         } else {
            this.senderBuilder_.mergeFrom(var1);
         }

         if (this.sender_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public ReceiveMessageRequest.Builder clearSender() {
         this.bitField0_ &= -2;
         this.sender_ = null;
         if (this.senderBuilder_ != null) {
            this.senderBuilder_.dispose();
            this.senderBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public UuidAndUsername.Builder getSenderBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getSenderFieldBuilder().getBuilder();
      }

      @Override
      public UuidAndUsernameOrBuilder getSenderOrBuilder() {
         if (this.senderBuilder_ != null) {
            return this.senderBuilder_.getMessageOrBuilder();
         } else {
            return this.sender_ == null ? UuidAndUsername.getDefaultInstance() : this.sender_;
         }
      }

      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getSenderFieldBuilder() {
         if (this.senderBuilder_ == null) {
            this.senderBuilder_ = new SingleFieldBuilderV3<>(this.getSender(), this.getParentForChildren(), this.isClean());
            this.sender_ = null;
         }

         return this.senderBuilder_;
      }

      @Override
      public String getContent() {
         Object var1 = this.content_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.content_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getContentBytes() {
         Object var1 = this.content_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.content_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ReceiveMessageRequest.Builder setContent(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.content_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ReceiveMessageRequest.Builder clearContent() {
         this.content_ = ReceiveMessageRequest.getDefaultInstance().getContent();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public ReceiveMessageRequest.Builder setContentBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ReceiveMessageRequest.checkByteStringIsUtf8(var1);
         this.content_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public final ReceiveMessageRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ReceiveMessageRequest.Builder)super.setUnknownFields(var1);
      }

      public final ReceiveMessageRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ReceiveMessageRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
