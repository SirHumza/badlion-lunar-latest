package com.lunarclient.websocket.logupload.v1;

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
import com.google.protobuf.MessageOrBuilder;
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

public final class StartLogUploadResponse extends GeneratedMessageV3 implements StartLogUploadResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int FILES_FIELD_NUMBER = 1;
   private List<StartLogUploadResponse.File> files_;
   public static final int UPLOAD_ID_FIELD_NUMBER = 2;
   private volatile Object uploadId_ = "";
   public static final int STATUS_FIELD_NUMBER = 3;
   private int status_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final StartLogUploadResponse DEFAULT_INSTANCE = new StartLogUploadResponse();
   private static final Parser<StartLogUploadResponse> PARSER = new AbstractParser<StartLogUploadResponse>() {
      public StartLogUploadResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         StartLogUploadResponse.Builder var3 = StartLogUploadResponse.newBuilder();

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

   private StartLogUploadResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private StartLogUploadResponse() {
      this.files_ = Collections.emptyList();
      this.uploadId_ = "";
      this.status_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new StartLogUploadResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_logupload_v1_StartLogUploadResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_logupload_v1_StartLogUploadResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(StartLogUploadResponse.class, StartLogUploadResponse.Builder.class);
   }

   @Override
   public List<StartLogUploadResponse.File> getFilesList() {
      return this.files_;
   }

   @Override
   public List<? extends StartLogUploadResponse.FileOrBuilder> getFilesOrBuilderList() {
      return this.files_;
   }

   @Override
   public int getFilesCount() {
      return this.files_.size();
   }

   @Override
   public StartLogUploadResponse.File getFiles(int var1) {
      return this.files_.get(var1);
   }

   @Override
   public StartLogUploadResponse.FileOrBuilder getFilesOrBuilder(int var1) {
      return this.files_.get(var1);
   }

   @Override
   public String getUploadId() {
      Object var1 = this.uploadId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.uploadId_ = var3;
      return var3;
   }

   @Override
   public ByteString getUploadIdBytes() {
      Object var1 = this.uploadId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.uploadId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getStatusValue() {
      return this.status_;
   }

   @Override
   public StartLogUploadResponse.Status getStatus() {
      StartLogUploadResponse.Status var1 = StartLogUploadResponse.Status.forNumber(this.status_);
      return var1 == null ? StartLogUploadResponse.Status.UNRECOGNIZED : var1;
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
      for (int var2 = 0; var2 < this.files_.size(); var2++) {
         var1.writeMessage(1, this.files_.get(var2));
      }

      if (!GeneratedMessageV3.isStringEmpty(this.uploadId_)) {
         GeneratedMessageV3.writeString(var1, 2, this.uploadId_);
      }

      if (this.status_ != StartLogUploadResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1.writeEnum(3, this.status_);
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

      for (int var2 = 0; var2 < this.files_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.files_.get(var2));
      }

      if (!GeneratedMessageV3.isStringEmpty(this.uploadId_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.uploadId_);
      }

      if (this.status_ != StartLogUploadResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(3, this.status_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof StartLogUploadResponse)) {
         return super.equals(var1);
      } else {
         StartLogUploadResponse var2 = (StartLogUploadResponse)var1;
         if (!this.getFilesList().equals(var2.getFilesList())) {
            return false;
         } else if (!this.getUploadId().equals(var2.getUploadId())) {
            return false;
         } else {
            return this.status_ != var2.status_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.getFilesCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getFilesList().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getUploadId().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.status_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static StartLogUploadResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartLogUploadResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartLogUploadResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartLogUploadResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartLogUploadResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartLogUploadResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartLogUploadResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StartLogUploadResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static StartLogUploadResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static StartLogUploadResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static StartLogUploadResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StartLogUploadResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public StartLogUploadResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static StartLogUploadResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static StartLogUploadResponse.Builder newBuilder(StartLogUploadResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public StartLogUploadResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new StartLogUploadResponse.Builder() : new StartLogUploadResponse.Builder().mergeFrom(this);
   }

   protected StartLogUploadResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new StartLogUploadResponse.Builder(var1);
   }

   public static StartLogUploadResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<StartLogUploadResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<StartLogUploadResponse> getParserForType() {
      return PARSER;
   }

   public StartLogUploadResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<StartLogUploadResponse.Builder> implements StartLogUploadResponseOrBuilder {
      private int bitField0_;
      private List<StartLogUploadResponse.File> files_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<StartLogUploadResponse.File, StartLogUploadResponse.File.Builder, StartLogUploadResponse.FileOrBuilder> filesBuilder_;
      private Object uploadId_ = "";
      private int status_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_logupload_v1_StartLogUploadResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_logupload_v1_StartLogUploadResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(StartLogUploadResponse.class, StartLogUploadResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public StartLogUploadResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.filesBuilder_ == null) {
            this.files_ = Collections.emptyList();
         } else {
            this.files_ = null;
            this.filesBuilder_.clear();
         }

         this.bitField0_ &= -2;
         this.uploadId_ = "";
         this.status_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_logupload_v1_StartLogUploadResponse_descriptor;
      }

      public StartLogUploadResponse getDefaultInstanceForType() {
         return StartLogUploadResponse.getDefaultInstance();
      }

      public StartLogUploadResponse build() {
         StartLogUploadResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public StartLogUploadResponse buildPartial() {
         StartLogUploadResponse var1 = new StartLogUploadResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(StartLogUploadResponse var1) {
         if (this.filesBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.files_ = Collections.unmodifiableList(this.files_);
               this.bitField0_ &= -2;
            }

            var1.files_ = this.files_;
         } else {
            var1.files_ = this.filesBuilder_.build();
         }
      }

      private void buildPartial0(StartLogUploadResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 2) != 0) {
            var1.uploadId_ = this.uploadId_;
         }

         if ((var2 & 4) != 0) {
            var1.status_ = this.status_;
         }
      }

      public StartLogUploadResponse.Builder clone() {
         return (StartLogUploadResponse.Builder)super.clone();
      }

      public StartLogUploadResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StartLogUploadResponse.Builder)super.setField(var1, var2);
      }

      public StartLogUploadResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (StartLogUploadResponse.Builder)super.clearField(var1);
      }

      public StartLogUploadResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (StartLogUploadResponse.Builder)super.clearOneof(var1);
      }

      public StartLogUploadResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (StartLogUploadResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public StartLogUploadResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StartLogUploadResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public StartLogUploadResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof StartLogUploadResponse) {
            return this.mergeFrom((StartLogUploadResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public StartLogUploadResponse.Builder mergeFrom(StartLogUploadResponse var1) {
         if (var1 == StartLogUploadResponse.getDefaultInstance()) {
            return this;
         }

         if (this.filesBuilder_ == null) {
            if (!var1.files_.isEmpty()) {
               if (this.files_.isEmpty()) {
                  this.files_ = var1.files_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureFilesIsMutable();
                  this.files_.addAll(var1.files_);
               }

               this.onChanged();
            }
         } else if (!var1.files_.isEmpty()) {
            if (this.filesBuilder_.isEmpty()) {
               this.filesBuilder_.dispose();
               this.filesBuilder_ = null;
               this.files_ = var1.files_;
               this.bitField0_ &= -2;
               this.filesBuilder_ = StartLogUploadResponse.alwaysUseFieldBuilders ? this.getFilesFieldBuilder() : null;
            } else {
               this.filesBuilder_.addAllMessages(var1.files_);
            }
         }

         if (!var1.getUploadId().isEmpty()) {
            this.uploadId_ = var1.uploadId_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (var1.status_ != 0) {
            this.setStatusValue(var1.getStatusValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public StartLogUploadResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     StartLogUploadResponse.File var5 = var1.readMessage(StartLogUploadResponse.File.parser(), var2);
                     if (this.filesBuilder_ == null) {
                        this.ensureFilesIsMutable();
                        this.files_.add(var5);
                     } else {
                        this.filesBuilder_.addMessage(var5);
                     }
                     break;
                  case 18:
                     this.uploadId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.status_ = var1.readEnum();
                     this.bitField0_ |= 4;
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

      private void ensureFilesIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.files_ = new ArrayList<>(this.files_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<StartLogUploadResponse.File> getFilesList() {
         return this.filesBuilder_ == null ? Collections.unmodifiableList(this.files_) : this.filesBuilder_.getMessageList();
      }

      @Override
      public int getFilesCount() {
         return this.filesBuilder_ == null ? this.files_.size() : this.filesBuilder_.getCount();
      }

      @Override
      public StartLogUploadResponse.File getFiles(int var1) {
         return this.filesBuilder_ == null ? this.files_.get(var1) : this.filesBuilder_.getMessage(var1);
      }

      public StartLogUploadResponse.Builder setFiles(int var1, StartLogUploadResponse.File var2) {
         if (this.filesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureFilesIsMutable();
            this.files_.set(var1, var2);
            this.onChanged();
         } else {
            this.filesBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public StartLogUploadResponse.Builder setFiles(int var1, StartLogUploadResponse.File.Builder var2) {
         if (this.filesBuilder_ == null) {
            this.ensureFilesIsMutable();
            this.files_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.filesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public StartLogUploadResponse.Builder addFiles(StartLogUploadResponse.File var1) {
         if (this.filesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureFilesIsMutable();
            this.files_.add(var1);
            this.onChanged();
         } else {
            this.filesBuilder_.addMessage(var1);
         }

         return this;
      }

      public StartLogUploadResponse.Builder addFiles(int var1, StartLogUploadResponse.File var2) {
         if (this.filesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureFilesIsMutable();
            this.files_.add(var1, var2);
            this.onChanged();
         } else {
            this.filesBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public StartLogUploadResponse.Builder addFiles(StartLogUploadResponse.File.Builder var1) {
         if (this.filesBuilder_ == null) {
            this.ensureFilesIsMutable();
            this.files_.add(var1.build());
            this.onChanged();
         } else {
            this.filesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public StartLogUploadResponse.Builder addFiles(int var1, StartLogUploadResponse.File.Builder var2) {
         if (this.filesBuilder_ == null) {
            this.ensureFilesIsMutable();
            this.files_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.filesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public StartLogUploadResponse.Builder addAllFiles(Iterable<? extends StartLogUploadResponse.File> var1) {
         if (this.filesBuilder_ == null) {
            this.ensureFilesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.files_);
            this.onChanged();
         } else {
            this.filesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public StartLogUploadResponse.Builder clearFiles() {
         if (this.filesBuilder_ == null) {
            this.files_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.filesBuilder_.clear();
         }

         return this;
      }

      public StartLogUploadResponse.Builder removeFiles(int var1) {
         if (this.filesBuilder_ == null) {
            this.ensureFilesIsMutable();
            this.files_.remove(var1);
            this.onChanged();
         } else {
            this.filesBuilder_.remove(var1);
         }

         return this;
      }

      public StartLogUploadResponse.File.Builder getFilesBuilder(int var1) {
         return this.getFilesFieldBuilder().getBuilder(var1);
      }

      @Override
      public StartLogUploadResponse.FileOrBuilder getFilesOrBuilder(int var1) {
         return this.filesBuilder_ == null ? this.files_.get(var1) : this.filesBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends StartLogUploadResponse.FileOrBuilder> getFilesOrBuilderList() {
         return this.filesBuilder_ != null ? this.filesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.files_);
      }

      public StartLogUploadResponse.File.Builder addFilesBuilder() {
         return this.getFilesFieldBuilder().addBuilder(StartLogUploadResponse.File.getDefaultInstance());
      }

      public StartLogUploadResponse.File.Builder addFilesBuilder(int var1) {
         return this.getFilesFieldBuilder().addBuilder(var1, StartLogUploadResponse.File.getDefaultInstance());
      }

      public List<StartLogUploadResponse.File.Builder> getFilesBuilderList() {
         return this.getFilesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<StartLogUploadResponse.File, StartLogUploadResponse.File.Builder, StartLogUploadResponse.FileOrBuilder> getFilesFieldBuilder() {
         if (this.filesBuilder_ == null) {
            this.filesBuilder_ = new RepeatedFieldBuilderV3<>(this.files_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.files_ = null;
         }

         return this.filesBuilder_;
      }

      @Override
      public String getUploadId() {
         Object var1 = this.uploadId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.uploadId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getUploadIdBytes() {
         Object var1 = this.uploadId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.uploadId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public StartLogUploadResponse.Builder setUploadId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.uploadId_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public StartLogUploadResponse.Builder clearUploadId() {
         this.uploadId_ = StartLogUploadResponse.getDefaultInstance().getUploadId();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public StartLogUploadResponse.Builder setUploadIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         StartLogUploadResponse.checkByteStringIsUtf8(var1);
         this.uploadId_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public int getStatusValue() {
         return this.status_;
      }

      public StartLogUploadResponse.Builder setStatusValue(int var1) {
         this.status_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public StartLogUploadResponse.Status getStatus() {
         StartLogUploadResponse.Status var1 = StartLogUploadResponse.Status.forNumber(this.status_);
         return var1 == null ? StartLogUploadResponse.Status.UNRECOGNIZED : var1;
      }

      public StartLogUploadResponse.Builder setStatus(StartLogUploadResponse.Status var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 4;
         this.status_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public StartLogUploadResponse.Builder clearStatus() {
         this.bitField0_ &= -5;
         this.status_ = 0;
         this.onChanged();
         return this;
      }

      public final StartLogUploadResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (StartLogUploadResponse.Builder)super.setUnknownFields(var1);
      }

      public final StartLogUploadResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (StartLogUploadResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public static final class File extends GeneratedMessageV3 implements StartLogUploadResponse.FileOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int NAME_FIELD_NUMBER = 1;
      private volatile Object name_ = "";
      public static final int UPLOAD_URL_FIELD_NUMBER = 2;
      private volatile Object uploadUrl_ = "";
      private byte memoizedIsInitialized = -1;
      private static final StartLogUploadResponse.File DEFAULT_INSTANCE = new StartLogUploadResponse.File();
      private static final Parser<StartLogUploadResponse.File> PARSER = new AbstractParser<StartLogUploadResponse.File>() {
         public StartLogUploadResponse.File parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            StartLogUploadResponse.File.Builder var3 = StartLogUploadResponse.File.newBuilder();

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

      private File(GeneratedMessageV3.Builder<?> var1) {
         super(var1);
      }

      private File() {
         this.name_ = "";
         this.uploadUrl_ = "";
      }

      @Override
      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
         return new StartLogUploadResponse.File();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_logupload_v1_StartLogUploadResponse_File_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_logupload_v1_StartLogUploadResponse_File_fieldAccessorTable
            .ensureFieldAccessorsInitialized(StartLogUploadResponse.File.class, StartLogUploadResponse.File.Builder.class);
      }

      @Override
      public String getName() {
         Object var1 = this.name_;
         if (var1 instanceof String) {
            return (String)var1;
         }

         ByteString var2 = (ByteString)var1;
         String var3 = var2.toStringUtf8();
         this.name_ = var3;
         return var3;
      }

      @Override
      public ByteString getNameBytes() {
         Object var1 = this.name_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.name_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
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
         if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
            GeneratedMessageV3.writeString(var1, 1, this.name_);
         }

         if (!GeneratedMessageV3.isStringEmpty(this.uploadUrl_)) {
            GeneratedMessageV3.writeString(var1, 2, this.uploadUrl_);
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
         if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
            var1 += GeneratedMessageV3.computeStringSize(1, this.name_);
         }

         if (!GeneratedMessageV3.isStringEmpty(this.uploadUrl_)) {
            var1 += GeneratedMessageV3.computeStringSize(2, this.uploadUrl_);
         }

         var1 += this.getUnknownFields().getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof StartLogUploadResponse.File)) {
            return super.equals(var1);
         } else {
            StartLogUploadResponse.File var2 = (StartLogUploadResponse.File)var1;
            if (!this.getName().equals(var2.getName())) {
               return false;
            } else {
               return !this.getUploadUrl().equals(var2.getUploadUrl()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
         var1 = 53 * var1 + this.getName().hashCode();
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getUploadUrl().hashCode();
         var1 = 29 * var1 + this.getUnknownFields().hashCode();
         this.memoizedHashCode = var1;
         return var1;
      }

      public static StartLogUploadResponse.File parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static StartLogUploadResponse.File parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static StartLogUploadResponse.File parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static StartLogUploadResponse.File parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static StartLogUploadResponse.File parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static StartLogUploadResponse.File parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static StartLogUploadResponse.File parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static StartLogUploadResponse.File parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static StartLogUploadResponse.File parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static StartLogUploadResponse.File parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static StartLogUploadResponse.File parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static StartLogUploadResponse.File parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public StartLogUploadResponse.File.Builder newBuilderForType() {
         return newBuilder();
      }

      public static StartLogUploadResponse.File.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static StartLogUploadResponse.File.Builder newBuilder(StartLogUploadResponse.File var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public StartLogUploadResponse.File.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new StartLogUploadResponse.File.Builder() : new StartLogUploadResponse.File.Builder().mergeFrom(this);
      }

      protected StartLogUploadResponse.File.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new StartLogUploadResponse.File.Builder(var1);
      }

      public static StartLogUploadResponse.File getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<StartLogUploadResponse.File> parser() {
         return PARSER;
      }

      @Override
      public Parser<StartLogUploadResponse.File> getParserForType() {
         return PARSER;
      }

      public StartLogUploadResponse.File getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<StartLogUploadResponse.File.Builder> implements StartLogUploadResponse.FileOrBuilder {
         private int bitField0_;
         private Object name_ = "";
         private Object uploadUrl_ = "";

         public static final Descriptors.Descriptor getDescriptor() {
            return ServiceProto.internal_static_lunarclient_websocket_logupload_v1_StartLogUploadResponse_File_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ServiceProto.internal_static_lunarclient_websocket_logupload_v1_StartLogUploadResponse_File_fieldAccessorTable
               .ensureFieldAccessorsInitialized(StartLogUploadResponse.File.class, StartLogUploadResponse.File.Builder.class);
         }

         private Builder() {
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
         }

         public StartLogUploadResponse.File.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.uploadUrl_ = "";
            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return ServiceProto.internal_static_lunarclient_websocket_logupload_v1_StartLogUploadResponse_File_descriptor;
         }

         public StartLogUploadResponse.File getDefaultInstanceForType() {
            return StartLogUploadResponse.File.getDefaultInstance();
         }

         public StartLogUploadResponse.File build() {
            StartLogUploadResponse.File var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public StartLogUploadResponse.File buildPartial() {
            StartLogUploadResponse.File var1 = new StartLogUploadResponse.File(this);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartial0(StartLogUploadResponse.File var1) {
            int var2 = this.bitField0_;
            if ((var2 & 1) != 0) {
               var1.name_ = this.name_;
            }

            if ((var2 & 2) != 0) {
               var1.uploadUrl_ = this.uploadUrl_;
            }
         }

         public StartLogUploadResponse.File.Builder clone() {
            return (StartLogUploadResponse.File.Builder)super.clone();
         }

         public StartLogUploadResponse.File.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (StartLogUploadResponse.File.Builder)super.setField(var1, var2);
         }

         public StartLogUploadResponse.File.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (StartLogUploadResponse.File.Builder)super.clearField(var1);
         }

         public StartLogUploadResponse.File.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (StartLogUploadResponse.File.Builder)super.clearOneof(var1);
         }

         public StartLogUploadResponse.File.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (StartLogUploadResponse.File.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public StartLogUploadResponse.File.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (StartLogUploadResponse.File.Builder)super.addRepeatedField(var1, var2);
         }

         public StartLogUploadResponse.File.Builder mergeFrom(Message var1) {
            if (var1 instanceof StartLogUploadResponse.File) {
               return this.mergeFrom((StartLogUploadResponse.File)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public StartLogUploadResponse.File.Builder mergeFrom(StartLogUploadResponse.File var1) {
            if (var1 == StartLogUploadResponse.File.getDefaultInstance()) {
               return this;
            }

            if (!var1.getName().isEmpty()) {
               this.name_ = var1.name_;
               this.bitField0_ |= 1;
               this.onChanged();
            }

            if (!var1.getUploadUrl().isEmpty()) {
               this.uploadUrl_ = var1.uploadUrl_;
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

         public StartLogUploadResponse.File.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                        this.name_ = var1.readStringRequireUtf8();
                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        this.uploadUrl_ = var1.readStringRequireUtf8();
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
         public String getName() {
            Object var1 = this.name_;
            if (!(var1 instanceof String)) {
               ByteString var2 = (ByteString)var1;
               String var3 = var2.toStringUtf8();
               this.name_ = var3;
               return var3;
            } else {
               return (String)var1;
            }
         }

         @Override
         public ByteString getNameBytes() {
            Object var1 = this.name_;
            if (var1 instanceof String) {
               ByteString var2 = ByteString.copyFromUtf8((String)var1);
               this.name_ = var2;
               return var2;
            } else {
               return (ByteString)var1;
            }
         }

         public StartLogUploadResponse.File.Builder setName(String var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.name_ = var1;
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public StartLogUploadResponse.File.Builder clearName() {
            this.name_ = StartLogUploadResponse.File.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public StartLogUploadResponse.File.Builder setNameBytes(ByteString var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            StartLogUploadResponse.File.checkByteStringIsUtf8(var1);
            this.name_ = var1;
            this.bitField0_ |= 1;
            this.onChanged();
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

         public StartLogUploadResponse.File.Builder setUploadUrl(String var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.uploadUrl_ = var1;
            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         public StartLogUploadResponse.File.Builder clearUploadUrl() {
            this.uploadUrl_ = StartLogUploadResponse.File.getDefaultInstance().getUploadUrl();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public StartLogUploadResponse.File.Builder setUploadUrlBytes(ByteString var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            StartLogUploadResponse.File.checkByteStringIsUtf8(var1);
            this.uploadUrl_ = var1;
            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         public final StartLogUploadResponse.File.Builder setUnknownFields(UnknownFieldSet var1) {
            return (StartLogUploadResponse.File.Builder)super.setUnknownFields(var1);
         }

         public final StartLogUploadResponse.File.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (StartLogUploadResponse.File.Builder)super.mergeUnknownFields(var1);
         }
      }
   }

   public interface FileOrBuilder extends MessageOrBuilder {
      String getName();

      ByteString getNameBytes();

      String getUploadUrl();

      ByteString getUploadUrlBytes();
   }

   public enum Status implements ProtocolMessageEnum {
      STATUS_UNSPECIFIED(0),
      STATUS_SUCCESS(1),
      STATUS_NOT_ALLOWED(2),
      UNRECOGNIZED(-1);

      public static final int STATUS_UNSPECIFIED_VALUE = 0;
      public static final int STATUS_SUCCESS_VALUE = 1;
      public static final int STATUS_NOT_ALLOWED_VALUE = 2;
      private static final Internal.EnumLiteMap<StartLogUploadResponse.Status> internalValueMap = new Internal.EnumLiteMap<StartLogUploadResponse.Status>() {
         public StartLogUploadResponse.Status findValueByNumber(int var1) {
            return StartLogUploadResponse.Status.forNumber(var1);
         }
      };
      private static final StartLogUploadResponse.Status[] VALUES = values();
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
      public static StartLogUploadResponse.Status valueOf(int var0) {
         return forNumber(var0);
      }

      public static StartLogUploadResponse.Status forNumber(int var0) {
         switch (var0) {
            case 0:
               return STATUS_UNSPECIFIED;
            case 1:
               return STATUS_SUCCESS;
            case 2:
               return STATUS_NOT_ALLOWED;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<StartLogUploadResponse.Status> internalGetValueMap() {
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
         return StartLogUploadResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static StartLogUploadResponse.Status valueOf(Descriptors.EnumValueDescriptor var0) {
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
