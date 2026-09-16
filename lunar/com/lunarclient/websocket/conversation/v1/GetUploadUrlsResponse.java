package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class GetUploadUrlsResponse extends GeneratedMessageV3 implements GetUploadUrlsResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int STATUS_FIELD_NUMBER = 1;
   private int status_ = 0;
   public static final int UPLOADS_FIELD_NUMBER = 2;
   private List<PresignedUpload> uploads_;
   private byte memoizedIsInitialized = -1;
   private static final GetUploadUrlsResponse DEFAULT_INSTANCE = new GetUploadUrlsResponse();
   private static final Parser<GetUploadUrlsResponse> PARSER = new AbstractParser<GetUploadUrlsResponse>() {
      public GetUploadUrlsResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         GetUploadUrlsResponse.Builder var3 = GetUploadUrlsResponse.newBuilder();

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

   private GetUploadUrlsResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private GetUploadUrlsResponse() {
      this.status_ = 0;
      this.uploads_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new GetUploadUrlsResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_GetUploadUrlsResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_GetUploadUrlsResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(GetUploadUrlsResponse.class, GetUploadUrlsResponse.Builder.class);
   }

   @Override
   public int getStatusValue() {
      return this.status_;
   }

   @Override
   public GetUploadUrlsResponse.Status getStatus() {
      GetUploadUrlsResponse.Status var1 = GetUploadUrlsResponse.Status.forNumber(this.status_);
      return var1 == null ? GetUploadUrlsResponse.Status.UNRECOGNIZED : var1;
   }

   @Override
   public List<PresignedUpload> getUploadsList() {
      return this.uploads_;
   }

   @Override
   public List<? extends PresignedUploadOrBuilder> getUploadsOrBuilderList() {
      return this.uploads_;
   }

   @Override
   public int getUploadsCount() {
      return this.uploads_.size();
   }

   @Override
   public PresignedUpload getUploads(int var1) {
      return this.uploads_.get(var1);
   }

   @Override
   public PresignedUploadOrBuilder getUploadsOrBuilder(int var1) {
      return this.uploads_.get(var1);
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
      if (this.status_ != GetUploadUrlsResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.status_);
      }

      for (int var2 = 0; var2 < this.uploads_.size(); var2++) {
         var1.writeMessage(2, this.uploads_.get(var2));
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
      if (this.status_ != GetUploadUrlsResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.status_);
      }

      for (int var2 = 0; var2 < this.uploads_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(2, this.uploads_.get(var2));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof GetUploadUrlsResponse)) {
         return super.equals(var1);
      } else {
         GetUploadUrlsResponse var2 = (GetUploadUrlsResponse)var1;
         if (this.status_ != var2.status_) {
            return false;
         } else {
            return !this.getUploadsList().equals(var2.getUploadsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.status_;
      if (this.getUploadsCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getUploadsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static GetUploadUrlsResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static GetUploadUrlsResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GetUploadUrlsResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static GetUploadUrlsResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GetUploadUrlsResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static GetUploadUrlsResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GetUploadUrlsResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GetUploadUrlsResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static GetUploadUrlsResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static GetUploadUrlsResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static GetUploadUrlsResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GetUploadUrlsResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public GetUploadUrlsResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static GetUploadUrlsResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static GetUploadUrlsResponse.Builder newBuilder(GetUploadUrlsResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public GetUploadUrlsResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new GetUploadUrlsResponse.Builder() : new GetUploadUrlsResponse.Builder().mergeFrom(this);
   }

   protected GetUploadUrlsResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new GetUploadUrlsResponse.Builder(var1);
   }

   public static GetUploadUrlsResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<GetUploadUrlsResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<GetUploadUrlsResponse> getParserForType() {
      return PARSER;
   }

   public GetUploadUrlsResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<GetUploadUrlsResponse.Builder> implements GetUploadUrlsResponseOrBuilder {
      private int bitField0_;
      private int status_ = 0;
      private List<PresignedUpload> uploads_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<PresignedUpload, PresignedUpload.Builder, PresignedUploadOrBuilder> uploadsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_GetUploadUrlsResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_GetUploadUrlsResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(GetUploadUrlsResponse.class, GetUploadUrlsResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public GetUploadUrlsResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.status_ = 0;
         if (this.uploadsBuilder_ == null) {
            this.uploads_ = Collections.emptyList();
         } else {
            this.uploads_ = null;
            this.uploadsBuilder_.clear();
         }

         this.bitField0_ &= -3;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_GetUploadUrlsResponse_descriptor;
      }

      public GetUploadUrlsResponse getDefaultInstanceForType() {
         return GetUploadUrlsResponse.getDefaultInstance();
      }

      public GetUploadUrlsResponse build() {
         GetUploadUrlsResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public GetUploadUrlsResponse buildPartial() {
         GetUploadUrlsResponse var1 = new GetUploadUrlsResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(GetUploadUrlsResponse var1) {
         if (this.uploadsBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.uploads_ = Collections.unmodifiableList(this.uploads_);
               this.bitField0_ &= -3;
            }

            var1.uploads_ = this.uploads_;
         } else {
            var1.uploads_ = this.uploadsBuilder_.build();
         }
      }

      private void buildPartial0(GetUploadUrlsResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.status_ = this.status_;
         }
      }

      public GetUploadUrlsResponse.Builder clone() {
         return (GetUploadUrlsResponse.Builder)super.clone();
      }

      public GetUploadUrlsResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GetUploadUrlsResponse.Builder)super.setField(var1, var2);
      }

      public GetUploadUrlsResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (GetUploadUrlsResponse.Builder)super.clearField(var1);
      }

      public GetUploadUrlsResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (GetUploadUrlsResponse.Builder)super.clearOneof(var1);
      }

      public GetUploadUrlsResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (GetUploadUrlsResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public GetUploadUrlsResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GetUploadUrlsResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public GetUploadUrlsResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof GetUploadUrlsResponse) {
            return this.mergeFrom((GetUploadUrlsResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public GetUploadUrlsResponse.Builder mergeFrom(GetUploadUrlsResponse var1) {
         if (var1 == GetUploadUrlsResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.status_ != 0) {
            this.setStatusValue(var1.getStatusValue());
         }

         if (this.uploadsBuilder_ == null) {
            if (!var1.uploads_.isEmpty()) {
               if (this.uploads_.isEmpty()) {
                  this.uploads_ = var1.uploads_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureUploadsIsMutable();
                  this.uploads_.addAll(var1.uploads_);
               }

               this.onChanged();
            }
         } else if (!var1.uploads_.isEmpty()) {
            if (this.uploadsBuilder_.isEmpty()) {
               this.uploadsBuilder_.dispose();
               this.uploadsBuilder_ = null;
               this.uploads_ = var1.uploads_;
               this.bitField0_ &= -3;
               this.uploadsBuilder_ = GetUploadUrlsResponse.alwaysUseFieldBuilders ? this.getUploadsFieldBuilder() : null;
            } else {
               this.uploadsBuilder_.addAllMessages(var1.uploads_);
            }
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public GetUploadUrlsResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.status_ = var1.readEnum();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     PresignedUpload var5 = var1.readMessage(PresignedUpload.parser(), var2);
                     if (this.uploadsBuilder_ == null) {
                        this.ensureUploadsIsMutable();
                        this.uploads_.add(var5);
                     } else {
                        this.uploadsBuilder_.addMessage(var5);
                     }
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
      public int getStatusValue() {
         return this.status_;
      }

      public GetUploadUrlsResponse.Builder setStatusValue(int var1) {
         this.status_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public GetUploadUrlsResponse.Status getStatus() {
         GetUploadUrlsResponse.Status var1 = GetUploadUrlsResponse.Status.forNumber(this.status_);
         return var1 == null ? GetUploadUrlsResponse.Status.UNRECOGNIZED : var1;
      }

      public GetUploadUrlsResponse.Builder setStatus(GetUploadUrlsResponse.Status var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.status_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public GetUploadUrlsResponse.Builder clearStatus() {
         this.bitField0_ &= -2;
         this.status_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureUploadsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.uploads_ = new ArrayList<>(this.uploads_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<PresignedUpload> getUploadsList() {
         return this.uploadsBuilder_ == null ? Collections.unmodifiableList(this.uploads_) : this.uploadsBuilder_.getMessageList();
      }

      @Override
      public int getUploadsCount() {
         return this.uploadsBuilder_ == null ? this.uploads_.size() : this.uploadsBuilder_.getCount();
      }

      @Override
      public PresignedUpload getUploads(int var1) {
         return this.uploadsBuilder_ == null ? this.uploads_.get(var1) : this.uploadsBuilder_.getMessage(var1);
      }

      public GetUploadUrlsResponse.Builder setUploads(int var1, PresignedUpload var2) {
         if (this.uploadsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureUploadsIsMutable();
            this.uploads_.set(var1, var2);
            this.onChanged();
         } else {
            this.uploadsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public GetUploadUrlsResponse.Builder setUploads(int var1, PresignedUpload.Builder var2) {
         if (this.uploadsBuilder_ == null) {
            this.ensureUploadsIsMutable();
            this.uploads_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.uploadsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public GetUploadUrlsResponse.Builder addUploads(PresignedUpload var1) {
         if (this.uploadsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureUploadsIsMutable();
            this.uploads_.add(var1);
            this.onChanged();
         } else {
            this.uploadsBuilder_.addMessage(var1);
         }

         return this;
      }

      public GetUploadUrlsResponse.Builder addUploads(int var1, PresignedUpload var2) {
         if (this.uploadsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureUploadsIsMutable();
            this.uploads_.add(var1, var2);
            this.onChanged();
         } else {
            this.uploadsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public GetUploadUrlsResponse.Builder addUploads(PresignedUpload.Builder var1) {
         if (this.uploadsBuilder_ == null) {
            this.ensureUploadsIsMutable();
            this.uploads_.add(var1.build());
            this.onChanged();
         } else {
            this.uploadsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public GetUploadUrlsResponse.Builder addUploads(int var1, PresignedUpload.Builder var2) {
         if (this.uploadsBuilder_ == null) {
            this.ensureUploadsIsMutable();
            this.uploads_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.uploadsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public GetUploadUrlsResponse.Builder addAllUploads(Iterable<? extends PresignedUpload> var1) {
         if (this.uploadsBuilder_ == null) {
            this.ensureUploadsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.uploads_);
            this.onChanged();
         } else {
            this.uploadsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public GetUploadUrlsResponse.Builder clearUploads() {
         if (this.uploadsBuilder_ == null) {
            this.uploads_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.uploadsBuilder_.clear();
         }

         return this;
      }

      public GetUploadUrlsResponse.Builder removeUploads(int var1) {
         if (this.uploadsBuilder_ == null) {
            this.ensureUploadsIsMutable();
            this.uploads_.remove(var1);
            this.onChanged();
         } else {
            this.uploadsBuilder_.remove(var1);
         }

         return this;
      }

      public PresignedUpload.Builder getUploadsBuilder(int var1) {
         return this.getUploadsFieldBuilder().getBuilder(var1);
      }

      @Override
      public PresignedUploadOrBuilder getUploadsOrBuilder(int var1) {
         return this.uploadsBuilder_ == null ? this.uploads_.get(var1) : this.uploadsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends PresignedUploadOrBuilder> getUploadsOrBuilderList() {
         return this.uploadsBuilder_ != null ? this.uploadsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.uploads_);
      }

      public PresignedUpload.Builder addUploadsBuilder() {
         return this.getUploadsFieldBuilder().addBuilder(PresignedUpload.getDefaultInstance());
      }

      public PresignedUpload.Builder addUploadsBuilder(int var1) {
         return this.getUploadsFieldBuilder().addBuilder(var1, PresignedUpload.getDefaultInstance());
      }

      public List<PresignedUpload.Builder> getUploadsBuilderList() {
         return this.getUploadsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<PresignedUpload, PresignedUpload.Builder, PresignedUploadOrBuilder> getUploadsFieldBuilder() {
         if (this.uploadsBuilder_ == null) {
            this.uploadsBuilder_ = new RepeatedFieldBuilderV3<>(this.uploads_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
            this.uploads_ = null;
         }

         return this.uploadsBuilder_;
      }

      public final GetUploadUrlsResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (GetUploadUrlsResponse.Builder)super.setUnknownFields(var1);
      }

      public final GetUploadUrlsResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (GetUploadUrlsResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Status implements ProtocolMessageEnum {
      STATUS_UNSPECIFIED(0),
      STATUS_OK(1),
      STATUS_NOT_IN_CONVERSATION(2),
      STATUS_ICON_POLICY_DISABLED(3),
      UNRECOGNIZED(-1);

      public static final int STATUS_UNSPECIFIED_VALUE = 0;
      public static final int STATUS_OK_VALUE = 1;
      public static final int STATUS_NOT_IN_CONVERSATION_VALUE = 2;
      public static final int STATUS_ICON_POLICY_DISABLED_VALUE = 3;
      private static final Internal.EnumLiteMap<GetUploadUrlsResponse.Status> internalValueMap = new Internal.EnumLiteMap<GetUploadUrlsResponse.Status>() {
         public GetUploadUrlsResponse.Status findValueByNumber(int var1) {
            return GetUploadUrlsResponse.Status.forNumber(var1);
         }
      };
      private static final GetUploadUrlsResponse.Status[] VALUES = values();
      private final int value;

      @Override
      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      @Deprecated
      public static GetUploadUrlsResponse.Status valueOf(int var0) {
         return forNumber(var0);
      }

      public static GetUploadUrlsResponse.Status forNumber(int var0) {
         switch (var0) {
            case 0:
               return STATUS_UNSPECIFIED;
            case 1:
               return STATUS_OK;
            case 2:
               return STATUS_NOT_IN_CONVERSATION;
            case 3:
               return STATUS_ICON_POLICY_DISABLED;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<GetUploadUrlsResponse.Status> internalGetValueMap() {
         return internalValueMap;
      }

      @Override
      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
         } else {
            return getDescriptor().getValues().get(this.ordinal());
         }
      }

      @Override
      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return GetUploadUrlsResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static GetUploadUrlsResponse.Status valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Status(int var3) {
         this.value = var3;
      }
   }
}
