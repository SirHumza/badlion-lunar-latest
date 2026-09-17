package com.lunarclient.websocket.logupload.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class StartLogUploadRequest extends GeneratedMessageV3 implements StartLogUploadRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int FILES_FIELD_NUMBER = 1;
   private List<StartLogUploadRequest.File> files_;
   public static final int SENTRY_CRASH_ID_FIELD_NUMBER = 2;
   private volatile Object sentryCrashId_ = "";
   public static final int SOLUTION_ID_FIELD_NUMBER = 3;
   private volatile Object solutionId_ = "";
   private byte memoizedIsInitialized = -1;
   private static final StartLogUploadRequest DEFAULT_INSTANCE = new StartLogUploadRequest();
   private static final Parser<StartLogUploadRequest> PARSER = new AbstractParser<StartLogUploadRequest>() {
      public StartLogUploadRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         StartLogUploadRequest.Builder var3 = StartLogUploadRequest.newBuilder();

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

   private StartLogUploadRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private StartLogUploadRequest() {
      this.files_ = Collections.emptyList();
      this.sentryCrashId_ = "";
      this.solutionId_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new StartLogUploadRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_logupload_v1_StartLogUploadRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_logupload_v1_StartLogUploadRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(StartLogUploadRequest.class, StartLogUploadRequest.Builder.class);
   }

   @Override
   public List<StartLogUploadRequest.File> getFilesList() {
      return this.files_;
   }

   @Override
   public List<? extends StartLogUploadRequest.FileOrBuilder> getFilesOrBuilderList() {
      return this.files_;
   }

   @Override
   public int getFilesCount() {
      return this.files_.size();
   }

   @Override
   public StartLogUploadRequest.File getFiles(int var1) {
      return this.files_.get(var1);
   }

   @Override
   public StartLogUploadRequest.FileOrBuilder getFilesOrBuilder(int var1) {
      return this.files_.get(var1);
   }

   @Override
   public String getSentryCrashId() {
      Object var1 = this.sentryCrashId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.sentryCrashId_ = var3;
      return var3;
   }

   @Override
   public ByteString getSentryCrashIdBytes() {
      Object var1 = this.sentryCrashId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.sentryCrashId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getSolutionId() {
      Object var1 = this.solutionId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.solutionId_ = var3;
      return var3;
   }

   @Override
   public ByteString getSolutionIdBytes() {
      Object var1 = this.solutionId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.solutionId_ = var2;
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
      for (int var2 = 0; var2 < this.files_.size(); var2++) {
         var1.writeMessage(1, this.files_.get(var2));
      }

      if (!GeneratedMessageV3.isStringEmpty(this.sentryCrashId_)) {
         GeneratedMessageV3.writeString(var1, 2, this.sentryCrashId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.solutionId_)) {
         GeneratedMessageV3.writeString(var1, 3, this.solutionId_);
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

      if (!GeneratedMessageV3.isStringEmpty(this.sentryCrashId_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.sentryCrashId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.solutionId_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.solutionId_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof StartLogUploadRequest)) {
         return super.equals(var1);
      } else {
         StartLogUploadRequest var2 = (StartLogUploadRequest)var1;
         if (!this.getFilesList().equals(var2.getFilesList())) {
            return false;
         } else if (!this.getSentryCrashId().equals(var2.getSentryCrashId())) {
            return false;
         } else {
            return !this.getSolutionId().equals(var2.getSolutionId()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getSentryCrashId().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getSolutionId().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static StartLogUploadRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartLogUploadRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartLogUploadRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartLogUploadRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartLogUploadRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartLogUploadRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartLogUploadRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StartLogUploadRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static StartLogUploadRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static StartLogUploadRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static StartLogUploadRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StartLogUploadRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public StartLogUploadRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static StartLogUploadRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static StartLogUploadRequest.Builder newBuilder(StartLogUploadRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public StartLogUploadRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new StartLogUploadRequest.Builder() : new StartLogUploadRequest.Builder().mergeFrom(this);
   }

   protected StartLogUploadRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new StartLogUploadRequest.Builder(var1);
   }

   public static StartLogUploadRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<StartLogUploadRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<StartLogUploadRequest> getParserForType() {
      return PARSER;
   }

   public StartLogUploadRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<StartLogUploadRequest.Builder> implements StartLogUploadRequestOrBuilder {
      private int bitField0_;
      private List<StartLogUploadRequest.File> files_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<StartLogUploadRequest.File, StartLogUploadRequest.File.Builder, StartLogUploadRequest.FileOrBuilder> filesBuilder_;
      private Object sentryCrashId_ = "";
      private Object solutionId_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_logupload_v1_StartLogUploadRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_logupload_v1_StartLogUploadRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(StartLogUploadRequest.class, StartLogUploadRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public StartLogUploadRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.filesBuilder_ == null) {
            this.files_ = Collections.emptyList();
         } else {
            this.files_ = null;
            this.filesBuilder_.clear();
         }

         this.bitField0_ &= -2;
         this.sentryCrashId_ = "";
         this.solutionId_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_logupload_v1_StartLogUploadRequest_descriptor;
      }

      public StartLogUploadRequest getDefaultInstanceForType() {
         return StartLogUploadRequest.getDefaultInstance();
      }

      public StartLogUploadRequest build() {
         StartLogUploadRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public StartLogUploadRequest buildPartial() {
         StartLogUploadRequest var1 = new StartLogUploadRequest(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(StartLogUploadRequest var1) {
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

      private void buildPartial0(StartLogUploadRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 2) != 0) {
            var1.sentryCrashId_ = this.sentryCrashId_;
         }

         if ((var2 & 4) != 0) {
            var1.solutionId_ = this.solutionId_;
         }
      }

      public StartLogUploadRequest.Builder clone() {
         return (StartLogUploadRequest.Builder)super.clone();
      }

      public StartLogUploadRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StartLogUploadRequest.Builder)super.setField(var1, var2);
      }

      public StartLogUploadRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (StartLogUploadRequest.Builder)super.clearField(var1);
      }

      public StartLogUploadRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (StartLogUploadRequest.Builder)super.clearOneof(var1);
      }

      public StartLogUploadRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (StartLogUploadRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public StartLogUploadRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StartLogUploadRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public StartLogUploadRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof StartLogUploadRequest) {
            return this.mergeFrom((StartLogUploadRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public StartLogUploadRequest.Builder mergeFrom(StartLogUploadRequest var1) {
         if (var1 == StartLogUploadRequest.getDefaultInstance()) {
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
               this.filesBuilder_ = StartLogUploadRequest.alwaysUseFieldBuilders ? this.getFilesFieldBuilder() : null;
            } else {
               this.filesBuilder_.addAllMessages(var1.files_);
            }
         }

         if (!var1.getSentryCrashId().isEmpty()) {
            this.sentryCrashId_ = var1.sentryCrashId_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getSolutionId().isEmpty()) {
            this.solutionId_ = var1.solutionId_;
            this.bitField0_ |= 4;
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

      public StartLogUploadRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     StartLogUploadRequest.File var5 = var1.readMessage(StartLogUploadRequest.File.parser(), var2);
                     if (this.filesBuilder_ == null) {
                        this.ensureFilesIsMutable();
                        this.files_.add(var5);
                     } else {
                        this.filesBuilder_.addMessage(var5);
                     }
                     break;
                  case 18:
                     this.sentryCrashId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.solutionId_ = var1.readStringRequireUtf8();
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
      public List<StartLogUploadRequest.File> getFilesList() {
         return this.filesBuilder_ == null ? Collections.unmodifiableList(this.files_) : this.filesBuilder_.getMessageList();
      }

      @Override
      public int getFilesCount() {
         return this.filesBuilder_ == null ? this.files_.size() : this.filesBuilder_.getCount();
      }

      @Override
      public StartLogUploadRequest.File getFiles(int var1) {
         return this.filesBuilder_ == null ? this.files_.get(var1) : this.filesBuilder_.getMessage(var1);
      }

      public StartLogUploadRequest.Builder setFiles(int var1, StartLogUploadRequest.File var2) {
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

      public StartLogUploadRequest.Builder setFiles(int var1, StartLogUploadRequest.File.Builder var2) {
         if (this.filesBuilder_ == null) {
            this.ensureFilesIsMutable();
            this.files_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.filesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public StartLogUploadRequest.Builder addFiles(StartLogUploadRequest.File var1) {
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

      public StartLogUploadRequest.Builder addFiles(int var1, StartLogUploadRequest.File var2) {
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

      public StartLogUploadRequest.Builder addFiles(StartLogUploadRequest.File.Builder var1) {
         if (this.filesBuilder_ == null) {
            this.ensureFilesIsMutable();
            this.files_.add(var1.build());
            this.onChanged();
         } else {
            this.filesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public StartLogUploadRequest.Builder addFiles(int var1, StartLogUploadRequest.File.Builder var2) {
         if (this.filesBuilder_ == null) {
            this.ensureFilesIsMutable();
            this.files_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.filesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public StartLogUploadRequest.Builder addAllFiles(Iterable<? extends StartLogUploadRequest.File> var1) {
         if (this.filesBuilder_ == null) {
            this.ensureFilesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.files_);
            this.onChanged();
         } else {
            this.filesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public StartLogUploadRequest.Builder clearFiles() {
         if (this.filesBuilder_ == null) {
            this.files_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.filesBuilder_.clear();
         }

         return this;
      }

      public StartLogUploadRequest.Builder removeFiles(int var1) {
         if (this.filesBuilder_ == null) {
            this.ensureFilesIsMutable();
            this.files_.remove(var1);
            this.onChanged();
         } else {
            this.filesBuilder_.remove(var1);
         }

         return this;
      }

      public StartLogUploadRequest.File.Builder getFilesBuilder(int var1) {
         return this.getFilesFieldBuilder().getBuilder(var1);
      }

      @Override
      public StartLogUploadRequest.FileOrBuilder getFilesOrBuilder(int var1) {
         return this.filesBuilder_ == null ? this.files_.get(var1) : this.filesBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends StartLogUploadRequest.FileOrBuilder> getFilesOrBuilderList() {
         return this.filesBuilder_ != null ? this.filesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.files_);
      }

      public StartLogUploadRequest.File.Builder addFilesBuilder() {
         return this.getFilesFieldBuilder().addBuilder(StartLogUploadRequest.File.getDefaultInstance());
      }

      public StartLogUploadRequest.File.Builder addFilesBuilder(int var1) {
         return this.getFilesFieldBuilder().addBuilder(var1, StartLogUploadRequest.File.getDefaultInstance());
      }

      public List<StartLogUploadRequest.File.Builder> getFilesBuilderList() {
         return this.getFilesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<StartLogUploadRequest.File, StartLogUploadRequest.File.Builder, StartLogUploadRequest.FileOrBuilder> getFilesFieldBuilder() {
         if (this.filesBuilder_ == null) {
            this.filesBuilder_ = new RepeatedFieldBuilderV3<>(this.files_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.files_ = null;
         }

         return this.filesBuilder_;
      }

      @Override
      public String getSentryCrashId() {
         Object var1 = this.sentryCrashId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.sentryCrashId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getSentryCrashIdBytes() {
         Object var1 = this.sentryCrashId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.sentryCrashId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public StartLogUploadRequest.Builder setSentryCrashId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.sentryCrashId_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public StartLogUploadRequest.Builder clearSentryCrashId() {
         this.sentryCrashId_ = StartLogUploadRequest.getDefaultInstance().getSentryCrashId();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public StartLogUploadRequest.Builder setSentryCrashIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         StartLogUploadRequest.checkByteStringIsUtf8(var1);
         this.sentryCrashId_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getSolutionId() {
         Object var1 = this.solutionId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.solutionId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getSolutionIdBytes() {
         Object var1 = this.solutionId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.solutionId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public StartLogUploadRequest.Builder setSolutionId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.solutionId_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public StartLogUploadRequest.Builder clearSolutionId() {
         this.solutionId_ = StartLogUploadRequest.getDefaultInstance().getSolutionId();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public StartLogUploadRequest.Builder setSolutionIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         StartLogUploadRequest.checkByteStringIsUtf8(var1);
         this.solutionId_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public final StartLogUploadRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (StartLogUploadRequest.Builder)super.setUnknownFields(var1);
      }

      public final StartLogUploadRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (StartLogUploadRequest.Builder)super.mergeUnknownFields(var1);
      }
   }

   public static final class File extends GeneratedMessageV3 implements StartLogUploadRequest.FileOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int NAME_FIELD_NUMBER = 1;
      private volatile Object name_ = "";
      private byte memoizedIsInitialized = -1;
      private static final StartLogUploadRequest.File DEFAULT_INSTANCE = new StartLogUploadRequest.File();
      private static final Parser<StartLogUploadRequest.File> PARSER = new AbstractParser<StartLogUploadRequest.File>() {
         public StartLogUploadRequest.File parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            StartLogUploadRequest.File.Builder var3 = StartLogUploadRequest.File.newBuilder();

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
      }

      @Override
      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
         return new StartLogUploadRequest.File();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_logupload_v1_StartLogUploadRequest_File_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_logupload_v1_StartLogUploadRequest_File_fieldAccessorTable
            .ensureFieldAccessorsInitialized(StartLogUploadRequest.File.class, StartLogUploadRequest.File.Builder.class);
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

         var1 += this.getUnknownFields().getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         }

         if (!(var1 instanceof StartLogUploadRequest.File)) {
            return super.equals(var1);
         }

         StartLogUploadRequest.File var2 = (StartLogUploadRequest.File)var1;
         return !this.getName().equals(var2.getName()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
         var1 = 29 * var1 + this.getUnknownFields().hashCode();
         this.memoizedHashCode = var1;
         return var1;
      }

      public static StartLogUploadRequest.File parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static StartLogUploadRequest.File parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static StartLogUploadRequest.File parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static StartLogUploadRequest.File parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static StartLogUploadRequest.File parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static StartLogUploadRequest.File parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static StartLogUploadRequest.File parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static StartLogUploadRequest.File parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static StartLogUploadRequest.File parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static StartLogUploadRequest.File parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static StartLogUploadRequest.File parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static StartLogUploadRequest.File parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public StartLogUploadRequest.File.Builder newBuilderForType() {
         return newBuilder();
      }

      public static StartLogUploadRequest.File.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static StartLogUploadRequest.File.Builder newBuilder(StartLogUploadRequest.File var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public StartLogUploadRequest.File.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new StartLogUploadRequest.File.Builder() : new StartLogUploadRequest.File.Builder().mergeFrom(this);
      }

      protected StartLogUploadRequest.File.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new StartLogUploadRequest.File.Builder(var1);
      }

      public static StartLogUploadRequest.File getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<StartLogUploadRequest.File> parser() {
         return PARSER;
      }

      @Override
      public Parser<StartLogUploadRequest.File> getParserForType() {
         return PARSER;
      }

      public StartLogUploadRequest.File getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<StartLogUploadRequest.File.Builder> implements StartLogUploadRequest.FileOrBuilder {
         private int bitField0_;
         private Object name_ = "";

         public static final Descriptors.Descriptor getDescriptor() {
            return ServiceProto.internal_static_lunarclient_websocket_logupload_v1_StartLogUploadRequest_File_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ServiceProto.internal_static_lunarclient_websocket_logupload_v1_StartLogUploadRequest_File_fieldAccessorTable
               .ensureFieldAccessorsInitialized(StartLogUploadRequest.File.class, StartLogUploadRequest.File.Builder.class);
         }

         private Builder() {
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
         }

         public StartLogUploadRequest.File.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.name_ = "";
            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return ServiceProto.internal_static_lunarclient_websocket_logupload_v1_StartLogUploadRequest_File_descriptor;
         }

         public StartLogUploadRequest.File getDefaultInstanceForType() {
            return StartLogUploadRequest.File.getDefaultInstance();
         }

         public StartLogUploadRequest.File build() {
            StartLogUploadRequest.File var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public StartLogUploadRequest.File buildPartial() {
            StartLogUploadRequest.File var1 = new StartLogUploadRequest.File(this);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartial0(StartLogUploadRequest.File var1) {
            int var2 = this.bitField0_;
            if ((var2 & 1) != 0) {
               var1.name_ = this.name_;
            }
         }

         public StartLogUploadRequest.File.Builder clone() {
            return (StartLogUploadRequest.File.Builder)super.clone();
         }

         public StartLogUploadRequest.File.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (StartLogUploadRequest.File.Builder)super.setField(var1, var2);
         }

         public StartLogUploadRequest.File.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (StartLogUploadRequest.File.Builder)super.clearField(var1);
         }

         public StartLogUploadRequest.File.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (StartLogUploadRequest.File.Builder)super.clearOneof(var1);
         }

         public StartLogUploadRequest.File.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (StartLogUploadRequest.File.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public StartLogUploadRequest.File.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (StartLogUploadRequest.File.Builder)super.addRepeatedField(var1, var2);
         }

         public StartLogUploadRequest.File.Builder mergeFrom(Message var1) {
            if (var1 instanceof StartLogUploadRequest.File) {
               return this.mergeFrom((StartLogUploadRequest.File)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public StartLogUploadRequest.File.Builder mergeFrom(StartLogUploadRequest.File var1) {
            if (var1 == StartLogUploadRequest.File.getDefaultInstance()) {
               return this;
            }

            if (!var1.getName().isEmpty()) {
               this.name_ = var1.name_;
               this.bitField0_ |= 1;
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

         public StartLogUploadRequest.File.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

         public StartLogUploadRequest.File.Builder setName(String var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.name_ = var1;
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public StartLogUploadRequest.File.Builder clearName() {
            this.name_ = StartLogUploadRequest.File.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public StartLogUploadRequest.File.Builder setNameBytes(ByteString var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            StartLogUploadRequest.File.checkByteStringIsUtf8(var1);
            this.name_ = var1;
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public final StartLogUploadRequest.File.Builder setUnknownFields(UnknownFieldSet var1) {
            return (StartLogUploadRequest.File.Builder)super.setUnknownFields(var1);
         }

         public final StartLogUploadRequest.File.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (StartLogUploadRequest.File.Builder)super.mergeUnknownFields(var1);
         }
      }
   }

   public interface FileOrBuilder extends MessageOrBuilder {
      String getName();

      ByteString getNameBytes();
   }
}
