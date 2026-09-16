package com.lunarclient.websocket.performance.v1;

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

public final class StartJfrUploadRequest extends GeneratedMessageV3 implements StartJfrUploadRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int FILES_FIELD_NUMBER = 1;
   private List<StartJfrUploadRequest.File> files_;
   private byte memoizedIsInitialized = -1;
   private static final StartJfrUploadRequest DEFAULT_INSTANCE = new StartJfrUploadRequest();
   private static final Parser<StartJfrUploadRequest> PARSER = new AbstractParser<StartJfrUploadRequest>() {
      public StartJfrUploadRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         StartJfrUploadRequest.Builder var3 = StartJfrUploadRequest.newBuilder();

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

   private StartJfrUploadRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private StartJfrUploadRequest() {
      this.files_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new StartJfrUploadRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_performance_v1_StartJfrUploadRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_performance_v1_StartJfrUploadRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(StartJfrUploadRequest.class, StartJfrUploadRequest.Builder.class);
   }

   @Override
   public List<StartJfrUploadRequest.File> getFilesList() {
      return this.files_;
   }

   @Override
   public List<? extends StartJfrUploadRequest.FileOrBuilder> getFilesOrBuilderList() {
      return this.files_;
   }

   @Override
   public int getFilesCount() {
      return this.files_.size();
   }

   @Override
   public StartJfrUploadRequest.File getFiles(int var1) {
      return this.files_.get(var1);
   }

   @Override
   public StartJfrUploadRequest.FileOrBuilder getFilesOrBuilder(int var1) {
      return this.files_.get(var1);
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

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof StartJfrUploadRequest)) {
         return super.equals(var1);
      }

      StartJfrUploadRequest var2 = (StartJfrUploadRequest)var1;
      return !this.getFilesList().equals(var2.getFilesList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static StartJfrUploadRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartJfrUploadRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartJfrUploadRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartJfrUploadRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartJfrUploadRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartJfrUploadRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartJfrUploadRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StartJfrUploadRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static StartJfrUploadRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static StartJfrUploadRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static StartJfrUploadRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StartJfrUploadRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public StartJfrUploadRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static StartJfrUploadRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static StartJfrUploadRequest.Builder newBuilder(StartJfrUploadRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public StartJfrUploadRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new StartJfrUploadRequest.Builder() : new StartJfrUploadRequest.Builder().mergeFrom(this);
   }

   protected StartJfrUploadRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new StartJfrUploadRequest.Builder(var1);
   }

   public static StartJfrUploadRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<StartJfrUploadRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<StartJfrUploadRequest> getParserForType() {
      return PARSER;
   }

   public StartJfrUploadRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<StartJfrUploadRequest.Builder> implements StartJfrUploadRequestOrBuilder {
      private int bitField0_;
      private List<StartJfrUploadRequest.File> files_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<StartJfrUploadRequest.File, StartJfrUploadRequest.File.Builder, StartJfrUploadRequest.FileOrBuilder> filesBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_StartJfrUploadRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_StartJfrUploadRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(StartJfrUploadRequest.class, StartJfrUploadRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public StartJfrUploadRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.filesBuilder_ == null) {
            this.files_ = Collections.emptyList();
         } else {
            this.files_ = null;
            this.filesBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_StartJfrUploadRequest_descriptor;
      }

      public StartJfrUploadRequest getDefaultInstanceForType() {
         return StartJfrUploadRequest.getDefaultInstance();
      }

      public StartJfrUploadRequest build() {
         StartJfrUploadRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public StartJfrUploadRequest buildPartial() {
         StartJfrUploadRequest var1 = new StartJfrUploadRequest(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(StartJfrUploadRequest var1) {
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

      private void buildPartial0(StartJfrUploadRequest var1) {
         int var2 = this.bitField0_;
      }

      public StartJfrUploadRequest.Builder clone() {
         return (StartJfrUploadRequest.Builder)super.clone();
      }

      public StartJfrUploadRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StartJfrUploadRequest.Builder)super.setField(var1, var2);
      }

      public StartJfrUploadRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (StartJfrUploadRequest.Builder)super.clearField(var1);
      }

      public StartJfrUploadRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (StartJfrUploadRequest.Builder)super.clearOneof(var1);
      }

      public StartJfrUploadRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (StartJfrUploadRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public StartJfrUploadRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StartJfrUploadRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public StartJfrUploadRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof StartJfrUploadRequest) {
            return this.mergeFrom((StartJfrUploadRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public StartJfrUploadRequest.Builder mergeFrom(StartJfrUploadRequest var1) {
         if (var1 == StartJfrUploadRequest.getDefaultInstance()) {
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
               this.filesBuilder_ = StartJfrUploadRequest.alwaysUseFieldBuilders ? this.getFilesFieldBuilder() : null;
            } else {
               this.filesBuilder_.addAllMessages(var1.files_);
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

      public StartJfrUploadRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     StartJfrUploadRequest.File var5 = var1.readMessage(StartJfrUploadRequest.File.parser(), var2);
                     if (this.filesBuilder_ == null) {
                        this.ensureFilesIsMutable();
                        this.files_.add(var5);
                     } else {
                        this.filesBuilder_.addMessage(var5);
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

      private void ensureFilesIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.files_ = new ArrayList<>(this.files_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<StartJfrUploadRequest.File> getFilesList() {
         return this.filesBuilder_ == null ? Collections.unmodifiableList(this.files_) : this.filesBuilder_.getMessageList();
      }

      @Override
      public int getFilesCount() {
         return this.filesBuilder_ == null ? this.files_.size() : this.filesBuilder_.getCount();
      }

      @Override
      public StartJfrUploadRequest.File getFiles(int var1) {
         return this.filesBuilder_ == null ? this.files_.get(var1) : this.filesBuilder_.getMessage(var1);
      }

      public StartJfrUploadRequest.Builder setFiles(int var1, StartJfrUploadRequest.File var2) {
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

      public StartJfrUploadRequest.Builder setFiles(int var1, StartJfrUploadRequest.File.Builder var2) {
         if (this.filesBuilder_ == null) {
            this.ensureFilesIsMutable();
            this.files_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.filesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public StartJfrUploadRequest.Builder addFiles(StartJfrUploadRequest.File var1) {
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

      public StartJfrUploadRequest.Builder addFiles(int var1, StartJfrUploadRequest.File var2) {
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

      public StartJfrUploadRequest.Builder addFiles(StartJfrUploadRequest.File.Builder var1) {
         if (this.filesBuilder_ == null) {
            this.ensureFilesIsMutable();
            this.files_.add(var1.build());
            this.onChanged();
         } else {
            this.filesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public StartJfrUploadRequest.Builder addFiles(int var1, StartJfrUploadRequest.File.Builder var2) {
         if (this.filesBuilder_ == null) {
            this.ensureFilesIsMutable();
            this.files_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.filesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public StartJfrUploadRequest.Builder addAllFiles(Iterable<? extends StartJfrUploadRequest.File> var1) {
         if (this.filesBuilder_ == null) {
            this.ensureFilesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.files_);
            this.onChanged();
         } else {
            this.filesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public StartJfrUploadRequest.Builder clearFiles() {
         if (this.filesBuilder_ == null) {
            this.files_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.filesBuilder_.clear();
         }

         return this;
      }

      public StartJfrUploadRequest.Builder removeFiles(int var1) {
         if (this.filesBuilder_ == null) {
            this.ensureFilesIsMutable();
            this.files_.remove(var1);
            this.onChanged();
         } else {
            this.filesBuilder_.remove(var1);
         }

         return this;
      }

      public StartJfrUploadRequest.File.Builder getFilesBuilder(int var1) {
         return this.getFilesFieldBuilder().getBuilder(var1);
      }

      @Override
      public StartJfrUploadRequest.FileOrBuilder getFilesOrBuilder(int var1) {
         return this.filesBuilder_ == null ? this.files_.get(var1) : this.filesBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends StartJfrUploadRequest.FileOrBuilder> getFilesOrBuilderList() {
         return this.filesBuilder_ != null ? this.filesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.files_);
      }

      public StartJfrUploadRequest.File.Builder addFilesBuilder() {
         return this.getFilesFieldBuilder().addBuilder(StartJfrUploadRequest.File.getDefaultInstance());
      }

      public StartJfrUploadRequest.File.Builder addFilesBuilder(int var1) {
         return this.getFilesFieldBuilder().addBuilder(var1, StartJfrUploadRequest.File.getDefaultInstance());
      }

      public List<StartJfrUploadRequest.File.Builder> getFilesBuilderList() {
         return this.getFilesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<StartJfrUploadRequest.File, StartJfrUploadRequest.File.Builder, StartJfrUploadRequest.FileOrBuilder> getFilesFieldBuilder() {
         if (this.filesBuilder_ == null) {
            this.filesBuilder_ = new RepeatedFieldBuilderV3<>(this.files_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.files_ = null;
         }

         return this.filesBuilder_;
      }

      public final StartJfrUploadRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (StartJfrUploadRequest.Builder)super.setUnknownFields(var1);
      }

      public final StartJfrUploadRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (StartJfrUploadRequest.Builder)super.mergeUnknownFields(var1);
      }
   }

   public static final class File extends GeneratedMessageV3 implements StartJfrUploadRequest.FileOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int NAME_FIELD_NUMBER = 1;
      private volatile Object name_ = "";
      private byte memoizedIsInitialized = -1;
      private static final StartJfrUploadRequest.File DEFAULT_INSTANCE = new StartJfrUploadRequest.File();
      private static final Parser<StartJfrUploadRequest.File> PARSER = new AbstractParser<StartJfrUploadRequest.File>() {
         public StartJfrUploadRequest.File parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            StartJfrUploadRequest.File.Builder var3 = StartJfrUploadRequest.File.newBuilder();

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
         return new StartJfrUploadRequest.File();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_StartJfrUploadRequest_File_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_StartJfrUploadRequest_File_fieldAccessorTable
            .ensureFieldAccessorsInitialized(StartJfrUploadRequest.File.class, StartJfrUploadRequest.File.Builder.class);
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

         if (!(var1 instanceof StartJfrUploadRequest.File)) {
            return super.equals(var1);
         }

         StartJfrUploadRequest.File var2 = (StartJfrUploadRequest.File)var1;
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

      public static StartJfrUploadRequest.File parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static StartJfrUploadRequest.File parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static StartJfrUploadRequest.File parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static StartJfrUploadRequest.File parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static StartJfrUploadRequest.File parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static StartJfrUploadRequest.File parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static StartJfrUploadRequest.File parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static StartJfrUploadRequest.File parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static StartJfrUploadRequest.File parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static StartJfrUploadRequest.File parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static StartJfrUploadRequest.File parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static StartJfrUploadRequest.File parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public StartJfrUploadRequest.File.Builder newBuilderForType() {
         return newBuilder();
      }

      public static StartJfrUploadRequest.File.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static StartJfrUploadRequest.File.Builder newBuilder(StartJfrUploadRequest.File var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public StartJfrUploadRequest.File.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new StartJfrUploadRequest.File.Builder() : new StartJfrUploadRequest.File.Builder().mergeFrom(this);
      }

      protected StartJfrUploadRequest.File.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new StartJfrUploadRequest.File.Builder(var1);
      }

      public static StartJfrUploadRequest.File getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<StartJfrUploadRequest.File> parser() {
         return PARSER;
      }

      @Override
      public Parser<StartJfrUploadRequest.File> getParserForType() {
         return PARSER;
      }

      public StartJfrUploadRequest.File getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<StartJfrUploadRequest.File.Builder> implements StartJfrUploadRequest.FileOrBuilder {
         private int bitField0_;
         private Object name_ = "";

         public static final Descriptors.Descriptor getDescriptor() {
            return ServiceProto.internal_static_lunarclient_websocket_performance_v1_StartJfrUploadRequest_File_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ServiceProto.internal_static_lunarclient_websocket_performance_v1_StartJfrUploadRequest_File_fieldAccessorTable
               .ensureFieldAccessorsInitialized(StartJfrUploadRequest.File.class, StartJfrUploadRequest.File.Builder.class);
         }

         private Builder() {
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
         }

         public StartJfrUploadRequest.File.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.name_ = "";
            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return ServiceProto.internal_static_lunarclient_websocket_performance_v1_StartJfrUploadRequest_File_descriptor;
         }

         public StartJfrUploadRequest.File getDefaultInstanceForType() {
            return StartJfrUploadRequest.File.getDefaultInstance();
         }

         public StartJfrUploadRequest.File build() {
            StartJfrUploadRequest.File var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public StartJfrUploadRequest.File buildPartial() {
            StartJfrUploadRequest.File var1 = new StartJfrUploadRequest.File(this);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartial0(StartJfrUploadRequest.File var1) {
            int var2 = this.bitField0_;
            if ((var2 & 1) != 0) {
               var1.name_ = this.name_;
            }
         }

         public StartJfrUploadRequest.File.Builder clone() {
            return (StartJfrUploadRequest.File.Builder)super.clone();
         }

         public StartJfrUploadRequest.File.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (StartJfrUploadRequest.File.Builder)super.setField(var1, var2);
         }

         public StartJfrUploadRequest.File.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (StartJfrUploadRequest.File.Builder)super.clearField(var1);
         }

         public StartJfrUploadRequest.File.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (StartJfrUploadRequest.File.Builder)super.clearOneof(var1);
         }

         public StartJfrUploadRequest.File.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (StartJfrUploadRequest.File.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public StartJfrUploadRequest.File.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (StartJfrUploadRequest.File.Builder)super.addRepeatedField(var1, var2);
         }

         public StartJfrUploadRequest.File.Builder mergeFrom(Message var1) {
            if (var1 instanceof StartJfrUploadRequest.File) {
               return this.mergeFrom((StartJfrUploadRequest.File)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public StartJfrUploadRequest.File.Builder mergeFrom(StartJfrUploadRequest.File var1) {
            if (var1 == StartJfrUploadRequest.File.getDefaultInstance()) {
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

         public StartJfrUploadRequest.File.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

         public StartJfrUploadRequest.File.Builder setName(String var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.name_ = var1;
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public StartJfrUploadRequest.File.Builder clearName() {
            this.name_ = StartJfrUploadRequest.File.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public StartJfrUploadRequest.File.Builder setNameBytes(ByteString var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            StartJfrUploadRequest.File.checkByteStringIsUtf8(var1);
            this.name_ = var1;
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public final StartJfrUploadRequest.File.Builder setUnknownFields(UnknownFieldSet var1) {
            return (StartJfrUploadRequest.File.Builder)super.setUnknownFields(var1);
         }

         public final StartJfrUploadRequest.File.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (StartJfrUploadRequest.File.Builder)super.mergeUnknownFields(var1);
         }
      }
   }

   public interface FileOrBuilder extends MessageOrBuilder {
      String getName();

      ByteString getNameBytes();
   }
}
