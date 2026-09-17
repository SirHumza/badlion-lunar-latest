package com.lunarclient.websocket.performance.v1;

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

public final class StartJfrUploadResponse extends GeneratedMessageV3 implements StartJfrUploadResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int FILES_FIELD_NUMBER = 1;
   private List<StartJfrUploadResponse.File> files_;
   public static final int UPLOAD_ID_FIELD_NUMBER = 2;
   private volatile Object uploadId_ = "";
   public static final int STATUS_FIELD_NUMBER = 3;
   private int status_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final StartJfrUploadResponse DEFAULT_INSTANCE = new StartJfrUploadResponse();
   private static final Parser<StartJfrUploadResponse> PARSER = new AbstractParser<StartJfrUploadResponse>() {
      public StartJfrUploadResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         StartJfrUploadResponse.Builder var3 = StartJfrUploadResponse.newBuilder();

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

   private StartJfrUploadResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private StartJfrUploadResponse() {
      this.files_ = Collections.emptyList();
      this.uploadId_ = "";
      this.status_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new StartJfrUploadResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_performance_v1_StartJfrUploadResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_performance_v1_StartJfrUploadResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(StartJfrUploadResponse.class, StartJfrUploadResponse.Builder.class);
   }

   @Override
   public List<StartJfrUploadResponse.File> getFilesList() {
      return this.files_;
   }

   @Override
   public List<? extends StartJfrUploadResponse.FileOrBuilder> getFilesOrBuilderList() {
      return this.files_;
   }

   @Override
   public int getFilesCount() {
      return this.files_.size();
   }

   @Override
   public StartJfrUploadResponse.File getFiles(int var1) {
      return this.files_.get(var1);
   }

   @Override
   public StartJfrUploadResponse.FileOrBuilder getFilesOrBuilder(int var1) {
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
   public StartJfrUploadResponse.Status getStatus() {
      StartJfrUploadResponse.Status var1 = StartJfrUploadResponse.Status.forNumber(this.status_);
      return var1 == null ? StartJfrUploadResponse.Status.UNRECOGNIZED : var1;
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

      if (this.status_ != StartJfrUploadResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
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

      if (this.status_ != StartJfrUploadResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
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
      } else if (!(var1 instanceof StartJfrUploadResponse)) {
         return super.equals(var1);
      } else {
         StartJfrUploadResponse var2 = (StartJfrUploadResponse)var1;
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

   public static StartJfrUploadResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartJfrUploadResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartJfrUploadResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartJfrUploadResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartJfrUploadResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartJfrUploadResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartJfrUploadResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StartJfrUploadResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static StartJfrUploadResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static StartJfrUploadResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static StartJfrUploadResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StartJfrUploadResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public StartJfrUploadResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static StartJfrUploadResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static StartJfrUploadResponse.Builder newBuilder(StartJfrUploadResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public StartJfrUploadResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new StartJfrUploadResponse.Builder() : new StartJfrUploadResponse.Builder().mergeFrom(this);
   }

   protected StartJfrUploadResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new StartJfrUploadResponse.Builder(var1);
   }

   public static StartJfrUploadResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<StartJfrUploadResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<StartJfrUploadResponse> getParserForType() {
      return PARSER;
   }

   public StartJfrUploadResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<StartJfrUploadResponse.Builder> implements StartJfrUploadResponseOrBuilder {
      private int bitField0_;
      private List<StartJfrUploadResponse.File> files_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<StartJfrUploadResponse.File, StartJfrUploadResponse.File.Builder, StartJfrUploadResponse.FileOrBuilder> filesBuilder_;
      private Object uploadId_ = "";
      private int status_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_StartJfrUploadResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_StartJfrUploadResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(StartJfrUploadResponse.class, StartJfrUploadResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public StartJfrUploadResponse.Builder clear() {
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
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_StartJfrUploadResponse_descriptor;
      }

      public StartJfrUploadResponse getDefaultInstanceForType() {
         return StartJfrUploadResponse.getDefaultInstance();
      }

      public StartJfrUploadResponse build() {
         StartJfrUploadResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public StartJfrUploadResponse buildPartial() {
         StartJfrUploadResponse var1 = new StartJfrUploadResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(StartJfrUploadResponse var1) {
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

      private void buildPartial0(StartJfrUploadResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 2) != 0) {
            var1.uploadId_ = this.uploadId_;
         }

         if ((var2 & 4) != 0) {
            var1.status_ = this.status_;
         }
      }

      public StartJfrUploadResponse.Builder clone() {
         return (StartJfrUploadResponse.Builder)super.clone();
      }

      public StartJfrUploadResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StartJfrUploadResponse.Builder)super.setField(var1, var2);
      }

      public StartJfrUploadResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (StartJfrUploadResponse.Builder)super.clearField(var1);
      }

      public StartJfrUploadResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (StartJfrUploadResponse.Builder)super.clearOneof(var1);
      }

      public StartJfrUploadResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (StartJfrUploadResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public StartJfrUploadResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StartJfrUploadResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public StartJfrUploadResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof StartJfrUploadResponse) {
            return this.mergeFrom((StartJfrUploadResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public StartJfrUploadResponse.Builder mergeFrom(StartJfrUploadResponse var1) {
         if (var1 == StartJfrUploadResponse.getDefaultInstance()) {
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
               this.filesBuilder_ = StartJfrUploadResponse.alwaysUseFieldBuilders ? this.getFilesFieldBuilder() : null;
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

      public StartJfrUploadResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     StartJfrUploadResponse.File var5 = var1.readMessage(StartJfrUploadResponse.File.parser(), var2);
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
      public List<StartJfrUploadResponse.File> getFilesList() {
         return this.filesBuilder_ == null ? Collections.unmodifiableList(this.files_) : this.filesBuilder_.getMessageList();
      }

      @Override
      public int getFilesCount() {
         return this.filesBuilder_ == null ? this.files_.size() : this.filesBuilder_.getCount();
      }

      @Override
      public StartJfrUploadResponse.File getFiles(int var1) {
         return this.filesBuilder_ == null ? this.files_.get(var1) : this.filesBuilder_.getMessage(var1);
      }

      public StartJfrUploadResponse.Builder setFiles(int var1, StartJfrUploadResponse.File var2) {
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

      public StartJfrUploadResponse.Builder setFiles(int var1, StartJfrUploadResponse.File.Builder var2) {
         if (this.filesBuilder_ == null) {
            this.ensureFilesIsMutable();
            this.files_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.filesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public StartJfrUploadResponse.Builder addFiles(StartJfrUploadResponse.File var1) {
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

      public StartJfrUploadResponse.Builder addFiles(int var1, StartJfrUploadResponse.File var2) {
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

      public StartJfrUploadResponse.Builder addFiles(StartJfrUploadResponse.File.Builder var1) {
         if (this.filesBuilder_ == null) {
            this.ensureFilesIsMutable();
            this.files_.add(var1.build());
            this.onChanged();
         } else {
            this.filesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public StartJfrUploadResponse.Builder addFiles(int var1, StartJfrUploadResponse.File.Builder var2) {
         if (this.filesBuilder_ == null) {
            this.ensureFilesIsMutable();
            this.files_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.filesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public StartJfrUploadResponse.Builder addAllFiles(Iterable<? extends StartJfrUploadResponse.File> var1) {
         if (this.filesBuilder_ == null) {
            this.ensureFilesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.files_);
            this.onChanged();
         } else {
            this.filesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public StartJfrUploadResponse.Builder clearFiles() {
         if (this.filesBuilder_ == null) {
            this.files_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.filesBuilder_.clear();
         }

         return this;
      }

      public StartJfrUploadResponse.Builder removeFiles(int var1) {
         if (this.filesBuilder_ == null) {
            this.ensureFilesIsMutable();
            this.files_.remove(var1);
            this.onChanged();
         } else {
            this.filesBuilder_.remove(var1);
         }

         return this;
      }

      public StartJfrUploadResponse.File.Builder getFilesBuilder(int var1) {
         return this.getFilesFieldBuilder().getBuilder(var1);
      }

      @Override
      public StartJfrUploadResponse.FileOrBuilder getFilesOrBuilder(int var1) {
         return this.filesBuilder_ == null ? this.files_.get(var1) : this.filesBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends StartJfrUploadResponse.FileOrBuilder> getFilesOrBuilderList() {
         return this.filesBuilder_ != null ? this.filesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.files_);
      }

      public StartJfrUploadResponse.File.Builder addFilesBuilder() {
         return this.getFilesFieldBuilder().addBuilder(StartJfrUploadResponse.File.getDefaultInstance());
      }

      public StartJfrUploadResponse.File.Builder addFilesBuilder(int var1) {
         return this.getFilesFieldBuilder().addBuilder(var1, StartJfrUploadResponse.File.getDefaultInstance());
      }

      public List<StartJfrUploadResponse.File.Builder> getFilesBuilderList() {
         return this.getFilesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<StartJfrUploadResponse.File, StartJfrUploadResponse.File.Builder, StartJfrUploadResponse.FileOrBuilder> getFilesFieldBuilder() {
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

      public StartJfrUploadResponse.Builder setUploadId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.uploadId_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public StartJfrUploadResponse.Builder clearUploadId() {
         this.uploadId_ = StartJfrUploadResponse.getDefaultInstance().getUploadId();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public StartJfrUploadResponse.Builder setUploadIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         StartJfrUploadResponse.checkByteStringIsUtf8(var1);
         this.uploadId_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public int getStatusValue() {
         return this.status_;
      }

      public StartJfrUploadResponse.Builder setStatusValue(int var1) {
         this.status_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public StartJfrUploadResponse.Status getStatus() {
         StartJfrUploadResponse.Status var1 = StartJfrUploadResponse.Status.forNumber(this.status_);
         return var1 == null ? StartJfrUploadResponse.Status.UNRECOGNIZED : var1;
      }

      public StartJfrUploadResponse.Builder setStatus(StartJfrUploadResponse.Status var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 4;
         this.status_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public StartJfrUploadResponse.Builder clearStatus() {
         this.bitField0_ &= -5;
         this.status_ = 0;
         this.onChanged();
         return this;
      }

      public final StartJfrUploadResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (StartJfrUploadResponse.Builder)super.setUnknownFields(var1);
      }

      public final StartJfrUploadResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (StartJfrUploadResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public static final class File extends GeneratedMessageV3 implements StartJfrUploadResponse.FileOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int NAME_FIELD_NUMBER = 1;
      private volatile Object name_ = "";
      public static final int UPLOAD_URL_FIELD_NUMBER = 2;
      private volatile Object uploadUrl_ = "";
      private byte memoizedIsInitialized = -1;
      private static final StartJfrUploadResponse.File DEFAULT_INSTANCE = new StartJfrUploadResponse.File();
      private static final Parser<StartJfrUploadResponse.File> PARSER = new AbstractParser<StartJfrUploadResponse.File>() {
         public StartJfrUploadResponse.File parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            StartJfrUploadResponse.File.Builder var3 = StartJfrUploadResponse.File.newBuilder();

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
         return new StartJfrUploadResponse.File();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_StartJfrUploadResponse_File_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_StartJfrUploadResponse_File_fieldAccessorTable
            .ensureFieldAccessorsInitialized(StartJfrUploadResponse.File.class, StartJfrUploadResponse.File.Builder.class);
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
         } else if (!(var1 instanceof StartJfrUploadResponse.File)) {
            return super.equals(var1);
         } else {
            StartJfrUploadResponse.File var2 = (StartJfrUploadResponse.File)var1;
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

      public static StartJfrUploadResponse.File parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static StartJfrUploadResponse.File parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static StartJfrUploadResponse.File parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static StartJfrUploadResponse.File parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static StartJfrUploadResponse.File parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static StartJfrUploadResponse.File parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static StartJfrUploadResponse.File parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static StartJfrUploadResponse.File parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static StartJfrUploadResponse.File parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static StartJfrUploadResponse.File parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static StartJfrUploadResponse.File parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static StartJfrUploadResponse.File parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public StartJfrUploadResponse.File.Builder newBuilderForType() {
         return newBuilder();
      }

      public static StartJfrUploadResponse.File.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static StartJfrUploadResponse.File.Builder newBuilder(StartJfrUploadResponse.File var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public StartJfrUploadResponse.File.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new StartJfrUploadResponse.File.Builder() : new StartJfrUploadResponse.File.Builder().mergeFrom(this);
      }

      protected StartJfrUploadResponse.File.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new StartJfrUploadResponse.File.Builder(var1);
      }

      public static StartJfrUploadResponse.File getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<StartJfrUploadResponse.File> parser() {
         return PARSER;
      }

      @Override
      public Parser<StartJfrUploadResponse.File> getParserForType() {
         return PARSER;
      }

      public StartJfrUploadResponse.File getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<StartJfrUploadResponse.File.Builder> implements StartJfrUploadResponse.FileOrBuilder {
         private int bitField0_;
         private Object name_ = "";
         private Object uploadUrl_ = "";

         public static final Descriptors.Descriptor getDescriptor() {
            return ServiceProto.internal_static_lunarclient_websocket_performance_v1_StartJfrUploadResponse_File_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ServiceProto.internal_static_lunarclient_websocket_performance_v1_StartJfrUploadResponse_File_fieldAccessorTable
               .ensureFieldAccessorsInitialized(StartJfrUploadResponse.File.class, StartJfrUploadResponse.File.Builder.class);
         }

         private Builder() {
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
         }

         public StartJfrUploadResponse.File.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.uploadUrl_ = "";
            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return ServiceProto.internal_static_lunarclient_websocket_performance_v1_StartJfrUploadResponse_File_descriptor;
         }

         public StartJfrUploadResponse.File getDefaultInstanceForType() {
            return StartJfrUploadResponse.File.getDefaultInstance();
         }

         public StartJfrUploadResponse.File build() {
            StartJfrUploadResponse.File var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public StartJfrUploadResponse.File buildPartial() {
            StartJfrUploadResponse.File var1 = new StartJfrUploadResponse.File(this);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartial0(StartJfrUploadResponse.File var1) {
            int var2 = this.bitField0_;
            if ((var2 & 1) != 0) {
               var1.name_ = this.name_;
            }

            if ((var2 & 2) != 0) {
               var1.uploadUrl_ = this.uploadUrl_;
            }
         }

         public StartJfrUploadResponse.File.Builder clone() {
            return (StartJfrUploadResponse.File.Builder)super.clone();
         }

         public StartJfrUploadResponse.File.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (StartJfrUploadResponse.File.Builder)super.setField(var1, var2);
         }

         public StartJfrUploadResponse.File.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (StartJfrUploadResponse.File.Builder)super.clearField(var1);
         }

         public StartJfrUploadResponse.File.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (StartJfrUploadResponse.File.Builder)super.clearOneof(var1);
         }

         public StartJfrUploadResponse.File.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (StartJfrUploadResponse.File.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public StartJfrUploadResponse.File.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (StartJfrUploadResponse.File.Builder)super.addRepeatedField(var1, var2);
         }

         public StartJfrUploadResponse.File.Builder mergeFrom(Message var1) {
            if (var1 instanceof StartJfrUploadResponse.File) {
               return this.mergeFrom((StartJfrUploadResponse.File)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public StartJfrUploadResponse.File.Builder mergeFrom(StartJfrUploadResponse.File var1) {
            if (var1 == StartJfrUploadResponse.File.getDefaultInstance()) {
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

         public StartJfrUploadResponse.File.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

         public StartJfrUploadResponse.File.Builder setName(String var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.name_ = var1;
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public StartJfrUploadResponse.File.Builder clearName() {
            this.name_ = StartJfrUploadResponse.File.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public StartJfrUploadResponse.File.Builder setNameBytes(ByteString var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            StartJfrUploadResponse.File.checkByteStringIsUtf8(var1);
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

         public StartJfrUploadResponse.File.Builder setUploadUrl(String var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.uploadUrl_ = var1;
            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         public StartJfrUploadResponse.File.Builder clearUploadUrl() {
            this.uploadUrl_ = StartJfrUploadResponse.File.getDefaultInstance().getUploadUrl();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public StartJfrUploadResponse.File.Builder setUploadUrlBytes(ByteString var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            StartJfrUploadResponse.File.checkByteStringIsUtf8(var1);
            this.uploadUrl_ = var1;
            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         public final StartJfrUploadResponse.File.Builder setUnknownFields(UnknownFieldSet var1) {
            return (StartJfrUploadResponse.File.Builder)super.setUnknownFields(var1);
         }

         public final StartJfrUploadResponse.File.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (StartJfrUploadResponse.File.Builder)super.mergeUnknownFields(var1);
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
      private static final Internal.EnumLiteMap<StartJfrUploadResponse.Status> internalValueMap = new Internal.EnumLiteMap<StartJfrUploadResponse.Status>() {
         public StartJfrUploadResponse.Status findValueByNumber(int var1) {
            return StartJfrUploadResponse.Status.forNumber(var1);
         }
      };
      private static final StartJfrUploadResponse.Status[] VALUES = values();
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
      public static StartJfrUploadResponse.Status valueOf(int var0) {
         return forNumber(var0);
      }

      public static StartJfrUploadResponse.Status forNumber(int var0) {
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

      public static Internal.EnumLiteMap<StartJfrUploadResponse.Status> internalGetValueMap() {
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
         return StartJfrUploadResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static StartJfrUploadResponse.Status valueOf(Descriptors.EnumValueDescriptor var0) {
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
