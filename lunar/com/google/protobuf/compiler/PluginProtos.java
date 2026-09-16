package com.google.protobuf.compiler;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PluginProtos {
   private static final Descriptors.Descriptor internal_static_google_protobuf_compiler_Version_descriptor = getDescriptor().getMessageTypes().get(0);
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_compiler_Version_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_google_protobuf_compiler_Version_descriptor, new String[]{"Major", "Minor", "Patch", "Suffix"}
   );
   private static final Descriptors.Descriptor internal_static_google_protobuf_compiler_CodeGeneratorRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_compiler_CodeGeneratorRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_google_protobuf_compiler_CodeGeneratorRequest_descriptor,
      new String[]{"FileToGenerate", "Parameter", "ProtoFile", "SourceFileDescriptors", "CompilerVersion"}
   );
   private static final Descriptors.Descriptor internal_static_google_protobuf_compiler_CodeGeneratorResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_compiler_CodeGeneratorResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_google_protobuf_compiler_CodeGeneratorResponse_descriptor, new String[]{"Error", "SupportedFeatures", "File"}
   );
   private static final Descriptors.Descriptor internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_descriptor = internal_static_google_protobuf_compiler_CodeGeneratorResponse_descriptor.getNestedTypes()
      .get(0);
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_descriptor, new String[]{"Name", "InsertionPoint", "Content", "GeneratedCodeInfo"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private PluginProtos() {
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static Descriptors.FileDescriptor getDescriptor() {
      return descriptor;
   }

   static {
      String[] var0 = new String[]{
         "\n%google/protobuf/compiler/plugin.proto\u0012\u0018google.protobuf.compiler\u001a google/protobuf/descriptor.proto\"c\n\u0007Version\u0012\u0014\n\u0005major\u0018\u0001 \u0001(\u0005R\u0005major\u0012\u0014\n\u0005minor\u0018\u0002 \u0001(\u0005R\u0005minor\u0012\u0014\n\u0005patch\u0018\u0003 \u0001(\u0005R\u0005patch\u0012\u0016\n\u0006suffix\u0018\u0004 \u0001(\tR\u0006suffix\"Ï\u0002\n\u0014CodeGeneratorRequest\u0012(\n\u0010file_to_generate\u0018\u0001 \u0003(\tR\u000efileToGenerate\u0012\u001c\n\tparameter\u0018\u0002 \u0001(\tR\tparameter\u0012C\n\nproto_file\u0018\u000f \u0003(\u000b2$.google.protobuf.FileDescriptorProtoR\tprotoFile\u0012\\\n\u0017source_file_descriptors\u0018\u0011 \u0003(\u000b2$.google.protobuf.FileDescriptorProtoR\u0015sourceFileDescriptors\u0012L\n\u0010compiler_version\u0018\u0003 \u0001(\u000b2!.google.protobuf.compiler.VersionR\u000fcompilerVersion\"³\u0003\n\u0015CodeGeneratorResponse\u0012\u0014\n\u0005error\u0018\u0001 \u0001(\tR\u0005error\u0012-\n\u0012supported_features\u0018\u0002 \u0001(\u0004R\u0011supportedFeatures\u0012H\n\u0004file\u0018\u000f \u0003(\u000b24.google.protobuf.compiler.CodeGeneratorResponse.FileR\u0004file\u001a±\u0001\n\u0004File\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012'\n\u000finsertion_point\u0018\u0002 \u0001(\tR\u000einsertionPoint\u0012\u0018\n\u0007content\u0018\u000f \u0001(\tR\u0007content\u0012R\n\u0013generated_code_info\u0018\u0010 \u0001(\u000b2\".google.protobuf.GeneratedCodeInfoR\u0011generatedCodeInfo\"W\n\u0007Feature\u0012\u0010\n\fFEATURE_NONE\u0010\u0000\u0012\u001b\n\u0017FEATURE_PROTO3_OPTIONAL\u0010\u0001\u0012\u001d\n\u0019FEATURE_SUPPORTS_EDITIONS\u0010\u0002Br\n\u001ccom.google.protobuf.compilerB\fPluginProtosZ)google.golang.org/protobuf/types/pluginpbª\u0002\u0018Google.Protobuf.Compiler"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{DescriptorProtos.getDescriptor()});
      DescriptorProtos.getDescriptor();
   }

   public static final class CodeGeneratorRequest extends GeneratedMessageV3 implements PluginProtos.CodeGeneratorRequestOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FILE_TO_GENERATE_FIELD_NUMBER = 1;
      private LazyStringArrayList fileToGenerate_ = LazyStringArrayList.emptyList();
      public static final int PARAMETER_FIELD_NUMBER = 2;
      private volatile Object parameter_ = "";
      public static final int PROTO_FILE_FIELD_NUMBER = 15;
      private List<DescriptorProtos.FileDescriptorProto> protoFile_;
      public static final int SOURCE_FILE_DESCRIPTORS_FIELD_NUMBER = 17;
      private List<DescriptorProtos.FileDescriptorProto> sourceFileDescriptors_;
      public static final int COMPILER_VERSION_FIELD_NUMBER = 3;
      private PluginProtos.Version compilerVersion_;
      private byte memoizedIsInitialized = -1;
      private static final PluginProtos.CodeGeneratorRequest DEFAULT_INSTANCE = new PluginProtos.CodeGeneratorRequest();
      @Deprecated
      public static final Parser<PluginProtos.CodeGeneratorRequest> PARSER = new AbstractParser<PluginProtos.CodeGeneratorRequest>() {
         public PluginProtos.CodeGeneratorRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            PluginProtos.CodeGeneratorRequest.Builder var3 = PluginProtos.CodeGeneratorRequest.newBuilder();

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

      private CodeGeneratorRequest(GeneratedMessageV3.Builder<?> var1) {
         super(var1);
      }

      private CodeGeneratorRequest() {
         this.fileToGenerate_ = LazyStringArrayList.emptyList();
         this.parameter_ = "";
         this.protoFile_ = Collections.emptyList();
         this.sourceFileDescriptors_ = Collections.emptyList();
      }

      @Override
      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
         return new PluginProtos.CodeGeneratorRequest();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PluginProtos.CodeGeneratorRequest.class, PluginProtos.CodeGeneratorRequest.Builder.class);
      }

      public ProtocolStringList getFileToGenerateList() {
         return this.fileToGenerate_;
      }

      @Override
      public int getFileToGenerateCount() {
         return this.fileToGenerate_.size();
      }

      @Override
      public String getFileToGenerate(int var1) {
         return this.fileToGenerate_.get(var1);
      }

      @Override
      public ByteString getFileToGenerateBytes(int var1) {
         return this.fileToGenerate_.getByteString(var1);
      }

      @Override
      public boolean hasParameter() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public String getParameter() {
         Object var1 = this.parameter_;
         if (var1 instanceof String) {
            return (String)var1;
         }

         ByteString var2 = (ByteString)var1;
         String var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.parameter_ = var3;
         }

         return var3;
      }

      @Override
      public ByteString getParameterBytes() {
         Object var1 = this.parameter_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.parameter_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      @Override
      public List<DescriptorProtos.FileDescriptorProto> getProtoFileList() {
         return this.protoFile_;
      }

      @Override
      public List<? extends DescriptorProtos.FileDescriptorProtoOrBuilder> getProtoFileOrBuilderList() {
         return this.protoFile_;
      }

      @Override
      public int getProtoFileCount() {
         return this.protoFile_.size();
      }

      @Override
      public DescriptorProtos.FileDescriptorProto getProtoFile(int var1) {
         return this.protoFile_.get(var1);
      }

      @Override
      public DescriptorProtos.FileDescriptorProtoOrBuilder getProtoFileOrBuilder(int var1) {
         return this.protoFile_.get(var1);
      }

      @Override
      public List<DescriptorProtos.FileDescriptorProto> getSourceFileDescriptorsList() {
         return this.sourceFileDescriptors_;
      }

      @Override
      public List<? extends DescriptorProtos.FileDescriptorProtoOrBuilder> getSourceFileDescriptorsOrBuilderList() {
         return this.sourceFileDescriptors_;
      }

      @Override
      public int getSourceFileDescriptorsCount() {
         return this.sourceFileDescriptors_.size();
      }

      @Override
      public DescriptorProtos.FileDescriptorProto getSourceFileDescriptors(int var1) {
         return this.sourceFileDescriptors_.get(var1);
      }

      @Override
      public DescriptorProtos.FileDescriptorProtoOrBuilder getSourceFileDescriptorsOrBuilder(int var1) {
         return this.sourceFileDescriptors_.get(var1);
      }

      @Override
      public boolean hasCompilerVersion() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public PluginProtos.Version getCompilerVersion() {
         return this.compilerVersion_ == null ? PluginProtos.Version.getDefaultInstance() : this.compilerVersion_;
      }

      @Override
      public PluginProtos.VersionOrBuilder getCompilerVersionOrBuilder() {
         return this.compilerVersion_ == null ? PluginProtos.Version.getDefaultInstance() : this.compilerVersion_;
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

         for (int var2 = 0; var2 < this.getProtoFileCount(); var2++) {
            if (!this.getProtoFile(var2).isInitialized()) {
               this.memoizedIsInitialized = 0;
               return false;
            }
         }

         for (int var3 = 0; var3 < this.getSourceFileDescriptorsCount(); var3++) {
            if (!this.getSourceFileDescriptors(var3).isInitialized()) {
               this.memoizedIsInitialized = 0;
               return false;
            }
         }

         this.memoizedIsInitialized = 1;
         return true;
      }

      @Override
      public void writeTo(CodedOutputStream var1) {
         for (int var2 = 0; var2 < this.fileToGenerate_.size(); var2++) {
            GeneratedMessageV3.writeString(var1, 1, this.fileToGenerate_.getRaw(var2));
         }

         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(var1, 2, this.parameter_);
         }

         if ((this.bitField0_ & 2) != 0) {
            var1.writeMessage(3, this.getCompilerVersion());
         }

         for (int var3 = 0; var3 < this.protoFile_.size(); var3++) {
            var1.writeMessage(15, this.protoFile_.get(var3));
         }

         for (int var4 = 0; var4 < this.sourceFileDescriptors_.size(); var4++) {
            var1.writeMessage(17, this.sourceFileDescriptors_.get(var4));
         }

         this.getUnknownFields().writeTo(var1);
      }

      @Override
      public int getSerializedSize() {
         int var1 = this.memoizedSize;
         if (var1 != -1) {
            return var1;
         }

         int var4 = 0;
         int var2 = 0;

         for (int var3 = 0; var3 < this.fileToGenerate_.size(); var3++) {
            var2 += computeStringSizeNoTag(this.fileToGenerate_.getRaw(var3));
         }

         var4 += var2;
         var4 += 1 * this.getFileToGenerateList().size();
         if ((this.bitField0_ & 1) != 0) {
            var4 += GeneratedMessageV3.computeStringSize(2, this.parameter_);
         }

         if ((this.bitField0_ & 2) != 0) {
            var4 += CodedOutputStream.computeMessageSize(3, this.getCompilerVersion());
         }

         for (int var8 = 0; var8 < this.protoFile_.size(); var8++) {
            var4 += CodedOutputStream.computeMessageSize(15, this.protoFile_.get(var8));
         }

         for (int var9 = 0; var9 < this.sourceFileDescriptors_.size(); var9++) {
            var4 += CodedOutputStream.computeMessageSize(17, this.sourceFileDescriptors_.get(var9));
         }

         var4 += this.getUnknownFields().getSerializedSize();
         this.memoizedSize = var4;
         return var4;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof PluginProtos.CodeGeneratorRequest)) {
            return super.equals(var1);
         } else {
            PluginProtos.CodeGeneratorRequest var2 = (PluginProtos.CodeGeneratorRequest)var1;
            if (!this.getFileToGenerateList().equals(var2.getFileToGenerateList())) {
               return false;
            } else if (this.hasParameter() != var2.hasParameter()) {
               return false;
            } else if (this.hasParameter() && !this.getParameter().equals(var2.getParameter())) {
               return false;
            } else if (!this.getProtoFileList().equals(var2.getProtoFileList())) {
               return false;
            } else if (!this.getSourceFileDescriptorsList().equals(var2.getSourceFileDescriptorsList())) {
               return false;
            } else if (this.hasCompilerVersion() != var2.hasCompilerVersion()) {
               return false;
            } else {
               return this.hasCompilerVersion() && !this.getCompilerVersion().equals(var2.getCompilerVersion())
                  ? false
                  : this.getUnknownFields().equals(var2.getUnknownFields());
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
         if (this.getFileToGenerateCount() > 0) {
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getFileToGenerateList().hashCode();
         }

         if (this.hasParameter()) {
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getParameter().hashCode();
         }

         if (this.getProtoFileCount() > 0) {
            var1 = 37 * var1 + 15;
            var1 = 53 * var1 + this.getProtoFileList().hashCode();
         }

         if (this.getSourceFileDescriptorsCount() > 0) {
            var1 = 37 * var1 + 17;
            var1 = 53 * var1 + this.getSourceFileDescriptorsList().hashCode();
         }

         if (this.hasCompilerVersion()) {
            var1 = 37 * var1 + 3;
            var1 = 53 * var1 + this.getCompilerVersion().hashCode();
         }

         var1 = 29 * var1 + this.getUnknownFields().hashCode();
         this.memoizedHashCode = var1;
         return var1;
      }

      public static PluginProtos.CodeGeneratorRequest parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static PluginProtos.CodeGeneratorRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static PluginProtos.CodeGeneratorRequest parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static PluginProtos.CodeGeneratorRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static PluginProtos.CodeGeneratorRequest parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static PluginProtos.CodeGeneratorRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static PluginProtos.CodeGeneratorRequest parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static PluginProtos.CodeGeneratorRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static PluginProtos.CodeGeneratorRequest parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static PluginProtos.CodeGeneratorRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static PluginProtos.CodeGeneratorRequest parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static PluginProtos.CodeGeneratorRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public PluginProtos.CodeGeneratorRequest.Builder newBuilderForType() {
         return newBuilder();
      }

      public static PluginProtos.CodeGeneratorRequest.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static PluginProtos.CodeGeneratorRequest.Builder newBuilder(PluginProtos.CodeGeneratorRequest var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public PluginProtos.CodeGeneratorRequest.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new PluginProtos.CodeGeneratorRequest.Builder() : new PluginProtos.CodeGeneratorRequest.Builder().mergeFrom(this);
      }

      protected PluginProtos.CodeGeneratorRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new PluginProtos.CodeGeneratorRequest.Builder(var1);
      }

      public static PluginProtos.CodeGeneratorRequest getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<PluginProtos.CodeGeneratorRequest> parser() {
         return PARSER;
      }

      @Override
      public Parser<PluginProtos.CodeGeneratorRequest> getParserForType() {
         return PARSER;
      }

      public PluginProtos.CodeGeneratorRequest getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder
         extends GeneratedMessageV3.Builder<PluginProtos.CodeGeneratorRequest.Builder>
         implements PluginProtos.CodeGeneratorRequestOrBuilder {
         private int bitField0_;
         private LazyStringArrayList fileToGenerate_ = LazyStringArrayList.emptyList();
         private Object parameter_ = "";
         private List<DescriptorProtos.FileDescriptorProto> protoFile_ = Collections.emptyList();
         private RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> protoFileBuilder_;
         private List<DescriptorProtos.FileDescriptorProto> sourceFileDescriptors_ = Collections.emptyList();
         private RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> sourceFileDescriptorsBuilder_;
         private PluginProtos.Version compilerVersion_;
         private SingleFieldBuilderV3<PluginProtos.Version, PluginProtos.Version.Builder, PluginProtos.VersionOrBuilder> compilerVersionBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorRequest_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorRequest_fieldAccessorTable
               .ensureFieldAccessorsInitialized(PluginProtos.CodeGeneratorRequest.class, PluginProtos.CodeGeneratorRequest.Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PluginProtos.CodeGeneratorRequest.alwaysUseFieldBuilders) {
               this.getProtoFileFieldBuilder();
               this.getSourceFileDescriptorsFieldBuilder();
               this.getCompilerVersionFieldBuilder();
            }
         }

         public PluginProtos.CodeGeneratorRequest.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.fileToGenerate_ = LazyStringArrayList.emptyList();
            this.parameter_ = "";
            if (this.protoFileBuilder_ == null) {
               this.protoFile_ = Collections.emptyList();
            } else {
               this.protoFile_ = null;
               this.protoFileBuilder_.clear();
            }

            this.bitField0_ &= -5;
            if (this.sourceFileDescriptorsBuilder_ == null) {
               this.sourceFileDescriptors_ = Collections.emptyList();
            } else {
               this.sourceFileDescriptors_ = null;
               this.sourceFileDescriptorsBuilder_.clear();
            }

            this.bitField0_ &= -9;
            this.compilerVersion_ = null;
            if (this.compilerVersionBuilder_ != null) {
               this.compilerVersionBuilder_.dispose();
               this.compilerVersionBuilder_ = null;
            }

            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorRequest_descriptor;
         }

         public PluginProtos.CodeGeneratorRequest getDefaultInstanceForType() {
            return PluginProtos.CodeGeneratorRequest.getDefaultInstance();
         }

         public PluginProtos.CodeGeneratorRequest build() {
            PluginProtos.CodeGeneratorRequest var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public PluginProtos.CodeGeneratorRequest buildPartial() {
            PluginProtos.CodeGeneratorRequest var1 = new PluginProtos.CodeGeneratorRequest(this);
            this.buildPartialRepeatedFields(var1);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartialRepeatedFields(PluginProtos.CodeGeneratorRequest var1) {
            if (this.protoFileBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.protoFile_ = Collections.unmodifiableList(this.protoFile_);
                  this.bitField0_ &= -5;
               }

               var1.protoFile_ = this.protoFile_;
            } else {
               var1.protoFile_ = this.protoFileBuilder_.build();
            }

            if (this.sourceFileDescriptorsBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.sourceFileDescriptors_ = Collections.unmodifiableList(this.sourceFileDescriptors_);
                  this.bitField0_ &= -9;
               }

               var1.sourceFileDescriptors_ = this.sourceFileDescriptors_;
            } else {
               var1.sourceFileDescriptors_ = this.sourceFileDescriptorsBuilder_.build();
            }
         }

         private void buildPartial0(PluginProtos.CodeGeneratorRequest var1) {
            int var2 = this.bitField0_;
            if ((var2 & 1) != 0) {
               this.fileToGenerate_.makeImmutable();
               var1.fileToGenerate_ = this.fileToGenerate_;
            }

            byte var3 = 0;
            if ((var2 & 2) != 0) {
               var1.parameter_ = this.parameter_;
               var3 |= 1;
            }

            if ((var2 & 16) != 0) {
               var1.compilerVersion_ = this.compilerVersionBuilder_ == null ? this.compilerVersion_ : this.compilerVersionBuilder_.build();
               var3 |= 2;
            }

            var1.bitField0_ |= var3;
         }

         public PluginProtos.CodeGeneratorRequest.Builder clone() {
            return (PluginProtos.CodeGeneratorRequest.Builder)super.clone();
         }

         public PluginProtos.CodeGeneratorRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (PluginProtos.CodeGeneratorRequest.Builder)super.setField(var1, var2);
         }

         public PluginProtos.CodeGeneratorRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (PluginProtos.CodeGeneratorRequest.Builder)super.clearField(var1);
         }

         public PluginProtos.CodeGeneratorRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (PluginProtos.CodeGeneratorRequest.Builder)super.clearOneof(var1);
         }

         public PluginProtos.CodeGeneratorRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (PluginProtos.CodeGeneratorRequest.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public PluginProtos.CodeGeneratorRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (PluginProtos.CodeGeneratorRequest.Builder)super.addRepeatedField(var1, var2);
         }

         public PluginProtos.CodeGeneratorRequest.Builder mergeFrom(Message var1) {
            if (var1 instanceof PluginProtos.CodeGeneratorRequest) {
               return this.mergeFrom((PluginProtos.CodeGeneratorRequest)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder mergeFrom(PluginProtos.CodeGeneratorRequest var1) {
            if (var1 == PluginProtos.CodeGeneratorRequest.getDefaultInstance()) {
               return this;
            }

            if (!var1.fileToGenerate_.isEmpty()) {
               if (this.fileToGenerate_.isEmpty()) {
                  this.fileToGenerate_ = var1.fileToGenerate_;
                  this.bitField0_ |= 1;
               } else {
                  this.ensureFileToGenerateIsMutable();
                  this.fileToGenerate_.addAll(var1.fileToGenerate_);
               }

               this.onChanged();
            }

            if (var1.hasParameter()) {
               this.parameter_ = var1.parameter_;
               this.bitField0_ |= 2;
               this.onChanged();
            }

            if (this.protoFileBuilder_ == null) {
               if (!var1.protoFile_.isEmpty()) {
                  if (this.protoFile_.isEmpty()) {
                     this.protoFile_ = var1.protoFile_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureProtoFileIsMutable();
                     this.protoFile_.addAll(var1.protoFile_);
                  }

                  this.onChanged();
               }
            } else if (!var1.protoFile_.isEmpty()) {
               if (this.protoFileBuilder_.isEmpty()) {
                  this.protoFileBuilder_.dispose();
                  this.protoFileBuilder_ = null;
                  this.protoFile_ = var1.protoFile_;
                  this.bitField0_ &= -5;
                  this.protoFileBuilder_ = PluginProtos.CodeGeneratorRequest.alwaysUseFieldBuilders ? this.getProtoFileFieldBuilder() : null;
               } else {
                  this.protoFileBuilder_.addAllMessages(var1.protoFile_);
               }
            }

            if (this.sourceFileDescriptorsBuilder_ == null) {
               if (!var1.sourceFileDescriptors_.isEmpty()) {
                  if (this.sourceFileDescriptors_.isEmpty()) {
                     this.sourceFileDescriptors_ = var1.sourceFileDescriptors_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureSourceFileDescriptorsIsMutable();
                     this.sourceFileDescriptors_.addAll(var1.sourceFileDescriptors_);
                  }

                  this.onChanged();
               }
            } else if (!var1.sourceFileDescriptors_.isEmpty()) {
               if (this.sourceFileDescriptorsBuilder_.isEmpty()) {
                  this.sourceFileDescriptorsBuilder_.dispose();
                  this.sourceFileDescriptorsBuilder_ = null;
                  this.sourceFileDescriptors_ = var1.sourceFileDescriptors_;
                  this.bitField0_ &= -9;
                  this.sourceFileDescriptorsBuilder_ = PluginProtos.CodeGeneratorRequest.alwaysUseFieldBuilders
                     ? this.getSourceFileDescriptorsFieldBuilder()
                     : null;
               } else {
                  this.sourceFileDescriptorsBuilder_.addAllMessages(var1.sourceFileDescriptors_);
               }
            }

            if (var1.hasCompilerVersion()) {
               this.mergeCompilerVersion(var1.getCompilerVersion());
            }

            this.mergeUnknownFields(var1.getUnknownFields());
            this.onChanged();
            return this;
         }

         @Override
         public final boolean isInitialized() {
            for (int var1 = 0; var1 < this.getProtoFileCount(); var1++) {
               if (!this.getProtoFile(var1).isInitialized()) {
                  return false;
               }
            }

            for (int var2 = 0; var2 < this.getSourceFileDescriptorsCount(); var2++) {
               if (!this.getSourceFileDescriptors(var2).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public PluginProtos.CodeGeneratorRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                        ByteString var12 = var1.readBytes();
                        this.ensureFileToGenerateIsMutable();
                        this.fileToGenerate_.add(var12);
                        break;
                     case 18:
                        this.parameter_ = var1.readBytes();
                        this.bitField0_ |= 2;
                        break;
                     case 26:
                        var1.readMessage(this.getCompilerVersionFieldBuilder().getBuilder(), var2);
                        this.bitField0_ |= 16;
                        break;
                     case 122:
                        DescriptorProtos.FileDescriptorProto var11 = var1.readMessage(DescriptorProtos.FileDescriptorProto.PARSER, var2);
                        if (this.protoFileBuilder_ == null) {
                           this.ensureProtoFileIsMutable();
                           this.protoFile_.add(var11);
                        } else {
                           this.protoFileBuilder_.addMessage(var11);
                        }
                        break;
                     case 138:
                        DescriptorProtos.FileDescriptorProto var5 = var1.readMessage(DescriptorProtos.FileDescriptorProto.PARSER, var2);
                        if (this.sourceFileDescriptorsBuilder_ == null) {
                           this.ensureSourceFileDescriptorsIsMutable();
                           this.sourceFileDescriptors_.add(var5);
                        } else {
                           this.sourceFileDescriptorsBuilder_.addMessage(var5);
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

         private void ensureFileToGenerateIsMutable() {
            if (!this.fileToGenerate_.isModifiable()) {
               this.fileToGenerate_ = new LazyStringArrayList(this.fileToGenerate_);
            }

            this.bitField0_ |= 1;
         }

         public ProtocolStringList getFileToGenerateList() {
            this.fileToGenerate_.makeImmutable();
            return this.fileToGenerate_;
         }

         @Override
         public int getFileToGenerateCount() {
            return this.fileToGenerate_.size();
         }

         @Override
         public String getFileToGenerate(int var1) {
            return this.fileToGenerate_.get(var1);
         }

         @Override
         public ByteString getFileToGenerateBytes(int var1) {
            return this.fileToGenerate_.getByteString(var1);
         }

         public PluginProtos.CodeGeneratorRequest.Builder setFileToGenerate(int var1, String var2) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureFileToGenerateIsMutable();
            this.fileToGenerate_.set(var1, var2);
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder addFileToGenerate(String var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureFileToGenerateIsMutable();
            this.fileToGenerate_.add(var1);
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder addAllFileToGenerate(Iterable<String> var1) {
            this.ensureFileToGenerateIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.fileToGenerate_);
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder clearFileToGenerate() {
            this.fileToGenerate_ = LazyStringArrayList.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder addFileToGenerateBytes(ByteString var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureFileToGenerateIsMutable();
            this.fileToGenerate_.add(var1);
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         @Override
         public boolean hasParameter() {
            return (this.bitField0_ & 2) != 0;
         }

         @Override
         public String getParameter() {
            Object var1 = this.parameter_;
            if (!(var1 instanceof String)) {
               ByteString var2 = (ByteString)var1;
               String var3 = var2.toStringUtf8();
               if (var2.isValidUtf8()) {
                  this.parameter_ = var3;
               }

               return var3;
            } else {
               return (String)var1;
            }
         }

         @Override
         public ByteString getParameterBytes() {
            Object var1 = this.parameter_;
            if (var1 instanceof String) {
               ByteString var2 = ByteString.copyFromUtf8((String)var1);
               this.parameter_ = var2;
               return var2;
            } else {
               return (ByteString)var1;
            }
         }

         public PluginProtos.CodeGeneratorRequest.Builder setParameter(String var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.parameter_ = var1;
            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder clearParameter() {
            this.parameter_ = PluginProtos.CodeGeneratorRequest.getDefaultInstance().getParameter();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder setParameterBytes(ByteString var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.parameter_ = var1;
            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         private void ensureProtoFileIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.protoFile_ = new ArrayList<>(this.protoFile_);
               this.bitField0_ |= 4;
            }
         }

         @Override
         public List<DescriptorProtos.FileDescriptorProto> getProtoFileList() {
            return this.protoFileBuilder_ == null ? Collections.unmodifiableList(this.protoFile_) : this.protoFileBuilder_.getMessageList();
         }

         @Override
         public int getProtoFileCount() {
            return this.protoFileBuilder_ == null ? this.protoFile_.size() : this.protoFileBuilder_.getCount();
         }

         @Override
         public DescriptorProtos.FileDescriptorProto getProtoFile(int var1) {
            return this.protoFileBuilder_ == null ? this.protoFile_.get(var1) : this.protoFileBuilder_.getMessage(var1);
         }

         public PluginProtos.CodeGeneratorRequest.Builder setProtoFile(int var1, DescriptorProtos.FileDescriptorProto var2) {
            if (this.protoFileBuilder_ == null) {
               if (var2 == null) {
                  throw new NullPointerException();
               }

               this.ensureProtoFileIsMutable();
               this.protoFile_.set(var1, var2);
               this.onChanged();
            } else {
               this.protoFileBuilder_.setMessage(var1, var2);
            }

            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder setProtoFile(int var1, DescriptorProtos.FileDescriptorProto.Builder var2) {
            if (this.protoFileBuilder_ == null) {
               this.ensureProtoFileIsMutable();
               this.protoFile_.set(var1, var2.build());
               this.onChanged();
            } else {
               this.protoFileBuilder_.setMessage(var1, var2.build());
            }

            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder addProtoFile(DescriptorProtos.FileDescriptorProto var1) {
            if (this.protoFileBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.ensureProtoFileIsMutable();
               this.protoFile_.add(var1);
               this.onChanged();
            } else {
               this.protoFileBuilder_.addMessage(var1);
            }

            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder addProtoFile(int var1, DescriptorProtos.FileDescriptorProto var2) {
            if (this.protoFileBuilder_ == null) {
               if (var2 == null) {
                  throw new NullPointerException();
               }

               this.ensureProtoFileIsMutable();
               this.protoFile_.add(var1, var2);
               this.onChanged();
            } else {
               this.protoFileBuilder_.addMessage(var1, var2);
            }

            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder addProtoFile(DescriptorProtos.FileDescriptorProto.Builder var1) {
            if (this.protoFileBuilder_ == null) {
               this.ensureProtoFileIsMutable();
               this.protoFile_.add(var1.build());
               this.onChanged();
            } else {
               this.protoFileBuilder_.addMessage(var1.build());
            }

            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder addProtoFile(int var1, DescriptorProtos.FileDescriptorProto.Builder var2) {
            if (this.protoFileBuilder_ == null) {
               this.ensureProtoFileIsMutable();
               this.protoFile_.add(var1, var2.build());
               this.onChanged();
            } else {
               this.protoFileBuilder_.addMessage(var1, var2.build());
            }

            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder addAllProtoFile(Iterable<? extends DescriptorProtos.FileDescriptorProto> var1) {
            if (this.protoFileBuilder_ == null) {
               this.ensureProtoFileIsMutable();
               AbstractMessageLite.Builder.addAll(var1, this.protoFile_);
               this.onChanged();
            } else {
               this.protoFileBuilder_.addAllMessages(var1);
            }

            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder clearProtoFile() {
            if (this.protoFileBuilder_ == null) {
               this.protoFile_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.protoFileBuilder_.clear();
            }

            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder removeProtoFile(int var1) {
            if (this.protoFileBuilder_ == null) {
               this.ensureProtoFileIsMutable();
               this.protoFile_.remove(var1);
               this.onChanged();
            } else {
               this.protoFileBuilder_.remove(var1);
            }

            return this;
         }

         public DescriptorProtos.FileDescriptorProto.Builder getProtoFileBuilder(int var1) {
            return this.getProtoFileFieldBuilder().getBuilder(var1);
         }

         @Override
         public DescriptorProtos.FileDescriptorProtoOrBuilder getProtoFileOrBuilder(int var1) {
            return this.protoFileBuilder_ == null ? this.protoFile_.get(var1) : this.protoFileBuilder_.getMessageOrBuilder(var1);
         }

         @Override
         public List<? extends DescriptorProtos.FileDescriptorProtoOrBuilder> getProtoFileOrBuilderList() {
            return this.protoFileBuilder_ != null ? this.protoFileBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.protoFile_);
         }

         public DescriptorProtos.FileDescriptorProto.Builder addProtoFileBuilder() {
            return this.getProtoFileFieldBuilder().addBuilder(DescriptorProtos.FileDescriptorProto.getDefaultInstance());
         }

         public DescriptorProtos.FileDescriptorProto.Builder addProtoFileBuilder(int var1) {
            return this.getProtoFileFieldBuilder().addBuilder(var1, DescriptorProtos.FileDescriptorProto.getDefaultInstance());
         }

         public List<DescriptorProtos.FileDescriptorProto.Builder> getProtoFileBuilderList() {
            return this.getProtoFileFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> getProtoFileFieldBuilder() {
            if (this.protoFileBuilder_ == null) {
               this.protoFileBuilder_ = new RepeatedFieldBuilderV3<>(this.protoFile_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.protoFile_ = null;
            }

            return this.protoFileBuilder_;
         }

         private void ensureSourceFileDescriptorsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.sourceFileDescriptors_ = new ArrayList<>(this.sourceFileDescriptors_);
               this.bitField0_ |= 8;
            }
         }

         @Override
         public List<DescriptorProtos.FileDescriptorProto> getSourceFileDescriptorsList() {
            return this.sourceFileDescriptorsBuilder_ == null
               ? Collections.unmodifiableList(this.sourceFileDescriptors_)
               : this.sourceFileDescriptorsBuilder_.getMessageList();
         }

         @Override
         public int getSourceFileDescriptorsCount() {
            return this.sourceFileDescriptorsBuilder_ == null ? this.sourceFileDescriptors_.size() : this.sourceFileDescriptorsBuilder_.getCount();
         }

         @Override
         public DescriptorProtos.FileDescriptorProto getSourceFileDescriptors(int var1) {
            return this.sourceFileDescriptorsBuilder_ == null ? this.sourceFileDescriptors_.get(var1) : this.sourceFileDescriptorsBuilder_.getMessage(var1);
         }

         public PluginProtos.CodeGeneratorRequest.Builder setSourceFileDescriptors(int var1, DescriptorProtos.FileDescriptorProto var2) {
            if (this.sourceFileDescriptorsBuilder_ == null) {
               if (var2 == null) {
                  throw new NullPointerException();
               }

               this.ensureSourceFileDescriptorsIsMutable();
               this.sourceFileDescriptors_.set(var1, var2);
               this.onChanged();
            } else {
               this.sourceFileDescriptorsBuilder_.setMessage(var1, var2);
            }

            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder setSourceFileDescriptors(int var1, DescriptorProtos.FileDescriptorProto.Builder var2) {
            if (this.sourceFileDescriptorsBuilder_ == null) {
               this.ensureSourceFileDescriptorsIsMutable();
               this.sourceFileDescriptors_.set(var1, var2.build());
               this.onChanged();
            } else {
               this.sourceFileDescriptorsBuilder_.setMessage(var1, var2.build());
            }

            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder addSourceFileDescriptors(DescriptorProtos.FileDescriptorProto var1) {
            if (this.sourceFileDescriptorsBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.ensureSourceFileDescriptorsIsMutable();
               this.sourceFileDescriptors_.add(var1);
               this.onChanged();
            } else {
               this.sourceFileDescriptorsBuilder_.addMessage(var1);
            }

            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder addSourceFileDescriptors(int var1, DescriptorProtos.FileDescriptorProto var2) {
            if (this.sourceFileDescriptorsBuilder_ == null) {
               if (var2 == null) {
                  throw new NullPointerException();
               }

               this.ensureSourceFileDescriptorsIsMutable();
               this.sourceFileDescriptors_.add(var1, var2);
               this.onChanged();
            } else {
               this.sourceFileDescriptorsBuilder_.addMessage(var1, var2);
            }

            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder addSourceFileDescriptors(DescriptorProtos.FileDescriptorProto.Builder var1) {
            if (this.sourceFileDescriptorsBuilder_ == null) {
               this.ensureSourceFileDescriptorsIsMutable();
               this.sourceFileDescriptors_.add(var1.build());
               this.onChanged();
            } else {
               this.sourceFileDescriptorsBuilder_.addMessage(var1.build());
            }

            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder addSourceFileDescriptors(int var1, DescriptorProtos.FileDescriptorProto.Builder var2) {
            if (this.sourceFileDescriptorsBuilder_ == null) {
               this.ensureSourceFileDescriptorsIsMutable();
               this.sourceFileDescriptors_.add(var1, var2.build());
               this.onChanged();
            } else {
               this.sourceFileDescriptorsBuilder_.addMessage(var1, var2.build());
            }

            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder addAllSourceFileDescriptors(Iterable<? extends DescriptorProtos.FileDescriptorProto> var1) {
            if (this.sourceFileDescriptorsBuilder_ == null) {
               this.ensureSourceFileDescriptorsIsMutable();
               AbstractMessageLite.Builder.addAll(var1, this.sourceFileDescriptors_);
               this.onChanged();
            } else {
               this.sourceFileDescriptorsBuilder_.addAllMessages(var1);
            }

            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder clearSourceFileDescriptors() {
            if (this.sourceFileDescriptorsBuilder_ == null) {
               this.sourceFileDescriptors_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.sourceFileDescriptorsBuilder_.clear();
            }

            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder removeSourceFileDescriptors(int var1) {
            if (this.sourceFileDescriptorsBuilder_ == null) {
               this.ensureSourceFileDescriptorsIsMutable();
               this.sourceFileDescriptors_.remove(var1);
               this.onChanged();
            } else {
               this.sourceFileDescriptorsBuilder_.remove(var1);
            }

            return this;
         }

         public DescriptorProtos.FileDescriptorProto.Builder getSourceFileDescriptorsBuilder(int var1) {
            return this.getSourceFileDescriptorsFieldBuilder().getBuilder(var1);
         }

         @Override
         public DescriptorProtos.FileDescriptorProtoOrBuilder getSourceFileDescriptorsOrBuilder(int var1) {
            return this.sourceFileDescriptorsBuilder_ == null
               ? this.sourceFileDescriptors_.get(var1)
               : this.sourceFileDescriptorsBuilder_.getMessageOrBuilder(var1);
         }

         @Override
         public List<? extends DescriptorProtos.FileDescriptorProtoOrBuilder> getSourceFileDescriptorsOrBuilderList() {
            return this.sourceFileDescriptorsBuilder_ != null
               ? this.sourceFileDescriptorsBuilder_.getMessageOrBuilderList()
               : Collections.unmodifiableList(this.sourceFileDescriptors_);
         }

         public DescriptorProtos.FileDescriptorProto.Builder addSourceFileDescriptorsBuilder() {
            return this.getSourceFileDescriptorsFieldBuilder().addBuilder(DescriptorProtos.FileDescriptorProto.getDefaultInstance());
         }

         public DescriptorProtos.FileDescriptorProto.Builder addSourceFileDescriptorsBuilder(int var1) {
            return this.getSourceFileDescriptorsFieldBuilder().addBuilder(var1, DescriptorProtos.FileDescriptorProto.getDefaultInstance());
         }

         public List<DescriptorProtos.FileDescriptorProto.Builder> getSourceFileDescriptorsBuilderList() {
            return this.getSourceFileDescriptorsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> getSourceFileDescriptorsFieldBuilder() {
            if (this.sourceFileDescriptorsBuilder_ == null) {
               this.sourceFileDescriptorsBuilder_ = new RepeatedFieldBuilderV3<>(
                  this.sourceFileDescriptors_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean()
               );
               this.sourceFileDescriptors_ = null;
            }

            return this.sourceFileDescriptorsBuilder_;
         }

         @Override
         public boolean hasCompilerVersion() {
            return (this.bitField0_ & 16) != 0;
         }

         @Override
         public PluginProtos.Version getCompilerVersion() {
            if (this.compilerVersionBuilder_ == null) {
               return this.compilerVersion_ == null ? PluginProtos.Version.getDefaultInstance() : this.compilerVersion_;
            } else {
               return this.compilerVersionBuilder_.getMessage();
            }
         }

         public PluginProtos.CodeGeneratorRequest.Builder setCompilerVersion(PluginProtos.Version var1) {
            if (this.compilerVersionBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.compilerVersion_ = var1;
            } else {
               this.compilerVersionBuilder_.setMessage(var1);
            }

            this.bitField0_ |= 16;
            this.onChanged();
            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder setCompilerVersion(PluginProtos.Version.Builder var1) {
            if (this.compilerVersionBuilder_ == null) {
               this.compilerVersion_ = var1.build();
            } else {
               this.compilerVersionBuilder_.setMessage(var1.build());
            }

            this.bitField0_ |= 16;
            this.onChanged();
            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder mergeCompilerVersion(PluginProtos.Version var1) {
            if (this.compilerVersionBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0 && this.compilerVersion_ != null && this.compilerVersion_ != PluginProtos.Version.getDefaultInstance()) {
                  this.getCompilerVersionBuilder().mergeFrom(var1);
               } else {
                  this.compilerVersion_ = var1;
               }
            } else {
               this.compilerVersionBuilder_.mergeFrom(var1);
            }

            if (this.compilerVersion_ != null) {
               this.bitField0_ |= 16;
               this.onChanged();
            }

            return this;
         }

         public PluginProtos.CodeGeneratorRequest.Builder clearCompilerVersion() {
            this.bitField0_ &= -17;
            this.compilerVersion_ = null;
            if (this.compilerVersionBuilder_ != null) {
               this.compilerVersionBuilder_.dispose();
               this.compilerVersionBuilder_ = null;
            }

            this.onChanged();
            return this;
         }

         public PluginProtos.Version.Builder getCompilerVersionBuilder() {
            this.bitField0_ |= 16;
            this.onChanged();
            return this.getCompilerVersionFieldBuilder().getBuilder();
         }

         @Override
         public PluginProtos.VersionOrBuilder getCompilerVersionOrBuilder() {
            if (this.compilerVersionBuilder_ != null) {
               return this.compilerVersionBuilder_.getMessageOrBuilder();
            } else {
               return this.compilerVersion_ == null ? PluginProtos.Version.getDefaultInstance() : this.compilerVersion_;
            }
         }

         private SingleFieldBuilderV3<PluginProtos.Version, PluginProtos.Version.Builder, PluginProtos.VersionOrBuilder> getCompilerVersionFieldBuilder() {
            if (this.compilerVersionBuilder_ == null) {
               this.compilerVersionBuilder_ = new SingleFieldBuilderV3<>(this.getCompilerVersion(), this.getParentForChildren(), this.isClean());
               this.compilerVersion_ = null;
            }

            return this.compilerVersionBuilder_;
         }

         public final PluginProtos.CodeGeneratorRequest.Builder setUnknownFields(UnknownFieldSet var1) {
            return (PluginProtos.CodeGeneratorRequest.Builder)super.setUnknownFields(var1);
         }

         public final PluginProtos.CodeGeneratorRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (PluginProtos.CodeGeneratorRequest.Builder)super.mergeUnknownFields(var1);
         }
      }
   }

   public interface CodeGeneratorRequestOrBuilder extends MessageOrBuilder {
      List<String> getFileToGenerateList();

      int getFileToGenerateCount();

      String getFileToGenerate(int var1);

      ByteString getFileToGenerateBytes(int var1);

      boolean hasParameter();

      String getParameter();

      ByteString getParameterBytes();

      List<DescriptorProtos.FileDescriptorProto> getProtoFileList();

      DescriptorProtos.FileDescriptorProto getProtoFile(int var1);

      int getProtoFileCount();

      List<? extends DescriptorProtos.FileDescriptorProtoOrBuilder> getProtoFileOrBuilderList();

      DescriptorProtos.FileDescriptorProtoOrBuilder getProtoFileOrBuilder(int var1);

      List<DescriptorProtos.FileDescriptorProto> getSourceFileDescriptorsList();

      DescriptorProtos.FileDescriptorProto getSourceFileDescriptors(int var1);

      int getSourceFileDescriptorsCount();

      List<? extends DescriptorProtos.FileDescriptorProtoOrBuilder> getSourceFileDescriptorsOrBuilderList();

      DescriptorProtos.FileDescriptorProtoOrBuilder getSourceFileDescriptorsOrBuilder(int var1);

      boolean hasCompilerVersion();

      PluginProtos.Version getCompilerVersion();

      PluginProtos.VersionOrBuilder getCompilerVersionOrBuilder();
   }

   public static final class CodeGeneratorResponse extends GeneratedMessageV3 implements PluginProtos.CodeGeneratorResponseOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ERROR_FIELD_NUMBER = 1;
      private volatile Object error_ = "";
      public static final int SUPPORTED_FEATURES_FIELD_NUMBER = 2;
      private long supportedFeatures_ = 0L;
      public static final int FILE_FIELD_NUMBER = 15;
      private List<PluginProtos.CodeGeneratorResponse.File> file_;
      private byte memoizedIsInitialized = -1;
      private static final PluginProtos.CodeGeneratorResponse DEFAULT_INSTANCE = new PluginProtos.CodeGeneratorResponse();
      @Deprecated
      public static final Parser<PluginProtos.CodeGeneratorResponse> PARSER = new AbstractParser<PluginProtos.CodeGeneratorResponse>() {
         public PluginProtos.CodeGeneratorResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            PluginProtos.CodeGeneratorResponse.Builder var3 = PluginProtos.CodeGeneratorResponse.newBuilder();

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

      private CodeGeneratorResponse(GeneratedMessageV3.Builder<?> var1) {
         super(var1);
      }

      private CodeGeneratorResponse() {
         this.error_ = "";
         this.file_ = Collections.emptyList();
      }

      @Override
      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
         return new PluginProtos.CodeGeneratorResponse();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PluginProtos.CodeGeneratorResponse.class, PluginProtos.CodeGeneratorResponse.Builder.class);
      }

      @Override
      public boolean hasError() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public String getError() {
         Object var1 = this.error_;
         if (var1 instanceof String) {
            return (String)var1;
         }

         ByteString var2 = (ByteString)var1;
         String var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.error_ = var3;
         }

         return var3;
      }

      @Override
      public ByteString getErrorBytes() {
         Object var1 = this.error_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.error_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      @Override
      public boolean hasSupportedFeatures() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public long getSupportedFeatures() {
         return this.supportedFeatures_;
      }

      @Override
      public List<PluginProtos.CodeGeneratorResponse.File> getFileList() {
         return this.file_;
      }

      @Override
      public List<? extends PluginProtos.CodeGeneratorResponse.FileOrBuilder> getFileOrBuilderList() {
         return this.file_;
      }

      @Override
      public int getFileCount() {
         return this.file_.size();
      }

      @Override
      public PluginProtos.CodeGeneratorResponse.File getFile(int var1) {
         return this.file_.get(var1);
      }

      @Override
      public PluginProtos.CodeGeneratorResponse.FileOrBuilder getFileOrBuilder(int var1) {
         return this.file_.get(var1);
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
            GeneratedMessageV3.writeString(var1, 1, this.error_);
         }

         if ((this.bitField0_ & 2) != 0) {
            var1.writeUInt64(2, this.supportedFeatures_);
         }

         for (int var2 = 0; var2 < this.file_.size(); var2++) {
            var1.writeMessage(15, this.file_.get(var2));
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
            var1 += GeneratedMessageV3.computeStringSize(1, this.error_);
         }

         if ((this.bitField0_ & 2) != 0) {
            var1 += CodedOutputStream.computeUInt64Size(2, this.supportedFeatures_);
         }

         for (int var2 = 0; var2 < this.file_.size(); var2++) {
            var1 += CodedOutputStream.computeMessageSize(15, this.file_.get(var2));
         }

         var1 += this.getUnknownFields().getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof PluginProtos.CodeGeneratorResponse)) {
            return super.equals(var1);
         } else {
            PluginProtos.CodeGeneratorResponse var2 = (PluginProtos.CodeGeneratorResponse)var1;
            if (this.hasError() != var2.hasError()) {
               return false;
            } else if (this.hasError() && !this.getError().equals(var2.getError())) {
               return false;
            } else if (this.hasSupportedFeatures() != var2.hasSupportedFeatures()) {
               return false;
            } else if (this.hasSupportedFeatures() && this.getSupportedFeatures() != var2.getSupportedFeatures()) {
               return false;
            } else {
               return !this.getFileList().equals(var2.getFileList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
         if (this.hasError()) {
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getError().hashCode();
         }

         if (this.hasSupportedFeatures()) {
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + Internal.hashLong(this.getSupportedFeatures());
         }

         if (this.getFileCount() > 0) {
            var1 = 37 * var1 + 15;
            var1 = 53 * var1 + this.getFileList().hashCode();
         }

         var1 = 29 * var1 + this.getUnknownFields().hashCode();
         this.memoizedHashCode = var1;
         return var1;
      }

      public static PluginProtos.CodeGeneratorResponse parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static PluginProtos.CodeGeneratorResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static PluginProtos.CodeGeneratorResponse parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static PluginProtos.CodeGeneratorResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static PluginProtos.CodeGeneratorResponse parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static PluginProtos.CodeGeneratorResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static PluginProtos.CodeGeneratorResponse parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static PluginProtos.CodeGeneratorResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static PluginProtos.CodeGeneratorResponse parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static PluginProtos.CodeGeneratorResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static PluginProtos.CodeGeneratorResponse parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static PluginProtos.CodeGeneratorResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public PluginProtos.CodeGeneratorResponse.Builder newBuilderForType() {
         return newBuilder();
      }

      public static PluginProtos.CodeGeneratorResponse.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static PluginProtos.CodeGeneratorResponse.Builder newBuilder(PluginProtos.CodeGeneratorResponse var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public PluginProtos.CodeGeneratorResponse.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new PluginProtos.CodeGeneratorResponse.Builder() : new PluginProtos.CodeGeneratorResponse.Builder().mergeFrom(this);
      }

      protected PluginProtos.CodeGeneratorResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new PluginProtos.CodeGeneratorResponse.Builder(var1);
      }

      public static PluginProtos.CodeGeneratorResponse getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<PluginProtos.CodeGeneratorResponse> parser() {
         return PARSER;
      }

      @Override
      public Parser<PluginProtos.CodeGeneratorResponse> getParserForType() {
         return PARSER;
      }

      public PluginProtos.CodeGeneratorResponse getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder
         extends GeneratedMessageV3.Builder<PluginProtos.CodeGeneratorResponse.Builder>
         implements PluginProtos.CodeGeneratorResponseOrBuilder {
         private int bitField0_;
         private Object error_ = "";
         private long supportedFeatures_;
         private List<PluginProtos.CodeGeneratorResponse.File> file_ = Collections.emptyList();
         private RepeatedFieldBuilderV3<PluginProtos.CodeGeneratorResponse.File, PluginProtos.CodeGeneratorResponse.File.Builder, PluginProtos.CodeGeneratorResponse.FileOrBuilder> fileBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_fieldAccessorTable
               .ensureFieldAccessorsInitialized(PluginProtos.CodeGeneratorResponse.class, PluginProtos.CodeGeneratorResponse.Builder.class);
         }

         private Builder() {
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
         }

         public PluginProtos.CodeGeneratorResponse.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.error_ = "";
            this.supportedFeatures_ = 0L;
            if (this.fileBuilder_ == null) {
               this.file_ = Collections.emptyList();
            } else {
               this.file_ = null;
               this.fileBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_descriptor;
         }

         public PluginProtos.CodeGeneratorResponse getDefaultInstanceForType() {
            return PluginProtos.CodeGeneratorResponse.getDefaultInstance();
         }

         public PluginProtos.CodeGeneratorResponse build() {
            PluginProtos.CodeGeneratorResponse var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public PluginProtos.CodeGeneratorResponse buildPartial() {
            PluginProtos.CodeGeneratorResponse var1 = new PluginProtos.CodeGeneratorResponse(this);
            this.buildPartialRepeatedFields(var1);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartialRepeatedFields(PluginProtos.CodeGeneratorResponse var1) {
            if (this.fileBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.file_ = Collections.unmodifiableList(this.file_);
                  this.bitField0_ &= -5;
               }

               var1.file_ = this.file_;
            } else {
               var1.file_ = this.fileBuilder_.build();
            }
         }

         private void buildPartial0(PluginProtos.CodeGeneratorResponse var1) {
            int var2 = this.bitField0_;
            byte var3 = 0;
            if ((var2 & 1) != 0) {
               var1.error_ = this.error_;
               var3 |= 1;
            }

            if ((var2 & 2) != 0) {
               var1.supportedFeatures_ = this.supportedFeatures_;
               var3 |= 2;
            }

            var1.bitField0_ |= var3;
         }

         public PluginProtos.CodeGeneratorResponse.Builder clone() {
            return (PluginProtos.CodeGeneratorResponse.Builder)super.clone();
         }

         public PluginProtos.CodeGeneratorResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (PluginProtos.CodeGeneratorResponse.Builder)super.setField(var1, var2);
         }

         public PluginProtos.CodeGeneratorResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (PluginProtos.CodeGeneratorResponse.Builder)super.clearField(var1);
         }

         public PluginProtos.CodeGeneratorResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (PluginProtos.CodeGeneratorResponse.Builder)super.clearOneof(var1);
         }

         public PluginProtos.CodeGeneratorResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (PluginProtos.CodeGeneratorResponse.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public PluginProtos.CodeGeneratorResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (PluginProtos.CodeGeneratorResponse.Builder)super.addRepeatedField(var1, var2);
         }

         public PluginProtos.CodeGeneratorResponse.Builder mergeFrom(Message var1) {
            if (var1 instanceof PluginProtos.CodeGeneratorResponse) {
               return this.mergeFrom((PluginProtos.CodeGeneratorResponse)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public PluginProtos.CodeGeneratorResponse.Builder mergeFrom(PluginProtos.CodeGeneratorResponse var1) {
            if (var1 == PluginProtos.CodeGeneratorResponse.getDefaultInstance()) {
               return this;
            }

            if (var1.hasError()) {
               this.error_ = var1.error_;
               this.bitField0_ |= 1;
               this.onChanged();
            }

            if (var1.hasSupportedFeatures()) {
               this.setSupportedFeatures(var1.getSupportedFeatures());
            }

            if (this.fileBuilder_ == null) {
               if (!var1.file_.isEmpty()) {
                  if (this.file_.isEmpty()) {
                     this.file_ = var1.file_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureFileIsMutable();
                     this.file_.addAll(var1.file_);
                  }

                  this.onChanged();
               }
            } else if (!var1.file_.isEmpty()) {
               if (this.fileBuilder_.isEmpty()) {
                  this.fileBuilder_.dispose();
                  this.fileBuilder_ = null;
                  this.file_ = var1.file_;
                  this.bitField0_ &= -5;
                  this.fileBuilder_ = PluginProtos.CodeGeneratorResponse.alwaysUseFieldBuilders ? this.getFileFieldBuilder() : null;
               } else {
                  this.fileBuilder_.addAllMessages(var1.file_);
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

         public PluginProtos.CodeGeneratorResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                        this.error_ = var1.readBytes();
                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.supportedFeatures_ = var1.readUInt64();
                        this.bitField0_ |= 2;
                        break;
                     case 122:
                        PluginProtos.CodeGeneratorResponse.File var5 = var1.readMessage(PluginProtos.CodeGeneratorResponse.File.PARSER, var2);
                        if (this.fileBuilder_ == null) {
                           this.ensureFileIsMutable();
                           this.file_.add(var5);
                        } else {
                           this.fileBuilder_.addMessage(var5);
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
         public boolean hasError() {
            return (this.bitField0_ & 1) != 0;
         }

         @Override
         public String getError() {
            Object var1 = this.error_;
            if (!(var1 instanceof String)) {
               ByteString var2 = (ByteString)var1;
               String var3 = var2.toStringUtf8();
               if (var2.isValidUtf8()) {
                  this.error_ = var3;
               }

               return var3;
            } else {
               return (String)var1;
            }
         }

         @Override
         public ByteString getErrorBytes() {
            Object var1 = this.error_;
            if (var1 instanceof String) {
               ByteString var2 = ByteString.copyFromUtf8((String)var1);
               this.error_ = var2;
               return var2;
            } else {
               return (ByteString)var1;
            }
         }

         public PluginProtos.CodeGeneratorResponse.Builder setError(String var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.error_ = var1;
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public PluginProtos.CodeGeneratorResponse.Builder clearError() {
            this.error_ = PluginProtos.CodeGeneratorResponse.getDefaultInstance().getError();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public PluginProtos.CodeGeneratorResponse.Builder setErrorBytes(ByteString var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.error_ = var1;
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         @Override
         public boolean hasSupportedFeatures() {
            return (this.bitField0_ & 2) != 0;
         }

         @Override
         public long getSupportedFeatures() {
            return this.supportedFeatures_;
         }

         public PluginProtos.CodeGeneratorResponse.Builder setSupportedFeatures(long var1) {
            this.supportedFeatures_ = var1;
            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         public PluginProtos.CodeGeneratorResponse.Builder clearSupportedFeatures() {
            this.bitField0_ &= -3;
            this.supportedFeatures_ = 0L;
            this.onChanged();
            return this;
         }

         private void ensureFileIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.file_ = new ArrayList<>(this.file_);
               this.bitField0_ |= 4;
            }
         }

         @Override
         public List<PluginProtos.CodeGeneratorResponse.File> getFileList() {
            return this.fileBuilder_ == null ? Collections.unmodifiableList(this.file_) : this.fileBuilder_.getMessageList();
         }

         @Override
         public int getFileCount() {
            return this.fileBuilder_ == null ? this.file_.size() : this.fileBuilder_.getCount();
         }

         @Override
         public PluginProtos.CodeGeneratorResponse.File getFile(int var1) {
            return this.fileBuilder_ == null ? this.file_.get(var1) : this.fileBuilder_.getMessage(var1);
         }

         public PluginProtos.CodeGeneratorResponse.Builder setFile(int var1, PluginProtos.CodeGeneratorResponse.File var2) {
            if (this.fileBuilder_ == null) {
               if (var2 == null) {
                  throw new NullPointerException();
               }

               this.ensureFileIsMutable();
               this.file_.set(var1, var2);
               this.onChanged();
            } else {
               this.fileBuilder_.setMessage(var1, var2);
            }

            return this;
         }

         public PluginProtos.CodeGeneratorResponse.Builder setFile(int var1, PluginProtos.CodeGeneratorResponse.File.Builder var2) {
            if (this.fileBuilder_ == null) {
               this.ensureFileIsMutable();
               this.file_.set(var1, var2.build());
               this.onChanged();
            } else {
               this.fileBuilder_.setMessage(var1, var2.build());
            }

            return this;
         }

         public PluginProtos.CodeGeneratorResponse.Builder addFile(PluginProtos.CodeGeneratorResponse.File var1) {
            if (this.fileBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.ensureFileIsMutable();
               this.file_.add(var1);
               this.onChanged();
            } else {
               this.fileBuilder_.addMessage(var1);
            }

            return this;
         }

         public PluginProtos.CodeGeneratorResponse.Builder addFile(int var1, PluginProtos.CodeGeneratorResponse.File var2) {
            if (this.fileBuilder_ == null) {
               if (var2 == null) {
                  throw new NullPointerException();
               }

               this.ensureFileIsMutable();
               this.file_.add(var1, var2);
               this.onChanged();
            } else {
               this.fileBuilder_.addMessage(var1, var2);
            }

            return this;
         }

         public PluginProtos.CodeGeneratorResponse.Builder addFile(PluginProtos.CodeGeneratorResponse.File.Builder var1) {
            if (this.fileBuilder_ == null) {
               this.ensureFileIsMutable();
               this.file_.add(var1.build());
               this.onChanged();
            } else {
               this.fileBuilder_.addMessage(var1.build());
            }

            return this;
         }

         public PluginProtos.CodeGeneratorResponse.Builder addFile(int var1, PluginProtos.CodeGeneratorResponse.File.Builder var2) {
            if (this.fileBuilder_ == null) {
               this.ensureFileIsMutable();
               this.file_.add(var1, var2.build());
               this.onChanged();
            } else {
               this.fileBuilder_.addMessage(var1, var2.build());
            }

            return this;
         }

         public PluginProtos.CodeGeneratorResponse.Builder addAllFile(Iterable<? extends PluginProtos.CodeGeneratorResponse.File> var1) {
            if (this.fileBuilder_ == null) {
               this.ensureFileIsMutable();
               AbstractMessageLite.Builder.addAll(var1, this.file_);
               this.onChanged();
            } else {
               this.fileBuilder_.addAllMessages(var1);
            }

            return this;
         }

         public PluginProtos.CodeGeneratorResponse.Builder clearFile() {
            if (this.fileBuilder_ == null) {
               this.file_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.fileBuilder_.clear();
            }

            return this;
         }

         public PluginProtos.CodeGeneratorResponse.Builder removeFile(int var1) {
            if (this.fileBuilder_ == null) {
               this.ensureFileIsMutable();
               this.file_.remove(var1);
               this.onChanged();
            } else {
               this.fileBuilder_.remove(var1);
            }

            return this;
         }

         public PluginProtos.CodeGeneratorResponse.File.Builder getFileBuilder(int var1) {
            return this.getFileFieldBuilder().getBuilder(var1);
         }

         @Override
         public PluginProtos.CodeGeneratorResponse.FileOrBuilder getFileOrBuilder(int var1) {
            return this.fileBuilder_ == null ? this.file_.get(var1) : this.fileBuilder_.getMessageOrBuilder(var1);
         }

         @Override
         public List<? extends PluginProtos.CodeGeneratorResponse.FileOrBuilder> getFileOrBuilderList() {
            return this.fileBuilder_ != null ? this.fileBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.file_);
         }

         public PluginProtos.CodeGeneratorResponse.File.Builder addFileBuilder() {
            return this.getFileFieldBuilder().addBuilder(PluginProtos.CodeGeneratorResponse.File.getDefaultInstance());
         }

         public PluginProtos.CodeGeneratorResponse.File.Builder addFileBuilder(int var1) {
            return this.getFileFieldBuilder().addBuilder(var1, PluginProtos.CodeGeneratorResponse.File.getDefaultInstance());
         }

         public List<PluginProtos.CodeGeneratorResponse.File.Builder> getFileBuilderList() {
            return this.getFileFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PluginProtos.CodeGeneratorResponse.File, PluginProtos.CodeGeneratorResponse.File.Builder, PluginProtos.CodeGeneratorResponse.FileOrBuilder> getFileFieldBuilder() {
            if (this.fileBuilder_ == null) {
               this.fileBuilder_ = new RepeatedFieldBuilderV3<>(this.file_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.file_ = null;
            }

            return this.fileBuilder_;
         }

         public final PluginProtos.CodeGeneratorResponse.Builder setUnknownFields(UnknownFieldSet var1) {
            return (PluginProtos.CodeGeneratorResponse.Builder)super.setUnknownFields(var1);
         }

         public final PluginProtos.CodeGeneratorResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (PluginProtos.CodeGeneratorResponse.Builder)super.mergeUnknownFields(var1);
         }
      }

      public enum Feature implements ProtocolMessageEnum {
         FEATURE_NONE(0),
         FEATURE_PROTO3_OPTIONAL(1),
         FEATURE_SUPPORTS_EDITIONS(2);

         public static final int FEATURE_NONE_VALUE = 0;
         public static final int FEATURE_PROTO3_OPTIONAL_VALUE = 1;
         public static final int FEATURE_SUPPORTS_EDITIONS_VALUE = 2;
         private static final Internal.EnumLiteMap<PluginProtos.CodeGeneratorResponse.Feature> internalValueMap = new Internal.EnumLiteMap<PluginProtos.CodeGeneratorResponse.Feature>() {
            public PluginProtos.CodeGeneratorResponse.Feature findValueByNumber(int var1) {
               return PluginProtos.CodeGeneratorResponse.Feature.forNumber(var1);
            }
         };
         private static final PluginProtos.CodeGeneratorResponse.Feature[] VALUES = values();
         private final int value;

         @Override
         public final int getNumber() {
            return this.value;
         }

         @Deprecated
         public static PluginProtos.CodeGeneratorResponse.Feature valueOf(int var0) {
            return forNumber(var0);
         }

         public static PluginProtos.CodeGeneratorResponse.Feature forNumber(int var0) {
            switch (var0) {
               case 0:
                  return FEATURE_NONE;
               case 1:
                  return FEATURE_PROTO3_OPTIONAL;
               case 2:
                  return FEATURE_SUPPORTS_EDITIONS;
               default:
                  return null;
            }
         }

         public static Internal.EnumLiteMap<PluginProtos.CodeGeneratorResponse.Feature> internalGetValueMap() {
            return internalValueMap;
         }

         @Override
         public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(this.ordinal());
         }

         @Override
         public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
         }

         public static final Descriptors.EnumDescriptor getDescriptor() {
            return PluginProtos.CodeGeneratorResponse.getDescriptor().getEnumTypes().get(0);
         }

         public static PluginProtos.CodeGeneratorResponse.Feature valueOf(Descriptors.EnumValueDescriptor var0) {
            if (var0.getType() != getDescriptor()) {
               throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            } else {
               return VALUES[var0.getIndex()];
            }
         }

         Feature(int var3) {
            this.value = var3;
         }
      }

      public static final class File extends GeneratedMessageV3 implements PluginProtos.CodeGeneratorResponse.FileOrBuilder {
         private static final long serialVersionUID = 0L;
         private int bitField0_;
         public static final int NAME_FIELD_NUMBER = 1;
         private volatile Object name_ = "";
         public static final int INSERTION_POINT_FIELD_NUMBER = 2;
         private volatile Object insertionPoint_ = "";
         public static final int CONTENT_FIELD_NUMBER = 15;
         private volatile Object content_ = "";
         public static final int GENERATED_CODE_INFO_FIELD_NUMBER = 16;
         private DescriptorProtos.GeneratedCodeInfo generatedCodeInfo_;
         private byte memoizedIsInitialized = -1;
         private static final PluginProtos.CodeGeneratorResponse.File DEFAULT_INSTANCE = new PluginProtos.CodeGeneratorResponse.File();
         @Deprecated
         public static final Parser<PluginProtos.CodeGeneratorResponse.File> PARSER = new AbstractParser<PluginProtos.CodeGeneratorResponse.File>() {
            public PluginProtos.CodeGeneratorResponse.File parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
               PluginProtos.CodeGeneratorResponse.File.Builder var3 = PluginProtos.CodeGeneratorResponse.File.newBuilder();

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
            this.insertionPoint_ = "";
            this.content_ = "";
         }

         @Override
         protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
            return new PluginProtos.CodeGeneratorResponse.File();
         }

         public static final Descriptors.Descriptor getDescriptor() {
            return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_fieldAccessorTable
               .ensureFieldAccessorsInitialized(PluginProtos.CodeGeneratorResponse.File.class, PluginProtos.CodeGeneratorResponse.File.Builder.class);
         }

         @Override
         public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
         }

         @Override
         public String getName() {
            Object var1 = this.name_;
            if (var1 instanceof String) {
               return (String)var1;
            }

            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            if (var2.isValidUtf8()) {
               this.name_ = var3;
            }

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
         public boolean hasInsertionPoint() {
            return (this.bitField0_ & 2) != 0;
         }

         @Override
         public String getInsertionPoint() {
            Object var1 = this.insertionPoint_;
            if (var1 instanceof String) {
               return (String)var1;
            }

            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            if (var2.isValidUtf8()) {
               this.insertionPoint_ = var3;
            }

            return var3;
         }

         @Override
         public ByteString getInsertionPointBytes() {
            Object var1 = this.insertionPoint_;
            if (var1 instanceof String) {
               ByteString var2 = ByteString.copyFromUtf8((String)var1);
               this.insertionPoint_ = var2;
               return var2;
            } else {
               return (ByteString)var1;
            }
         }

         @Override
         public boolean hasContent() {
            return (this.bitField0_ & 4) != 0;
         }

         @Override
         public String getContent() {
            Object var1 = this.content_;
            if (var1 instanceof String) {
               return (String)var1;
            }

            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            if (var2.isValidUtf8()) {
               this.content_ = var3;
            }

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
         public boolean hasGeneratedCodeInfo() {
            return (this.bitField0_ & 8) != 0;
         }

         @Override
         public DescriptorProtos.GeneratedCodeInfo getGeneratedCodeInfo() {
            return this.generatedCodeInfo_ == null ? DescriptorProtos.GeneratedCodeInfo.getDefaultInstance() : this.generatedCodeInfo_;
         }

         @Override
         public DescriptorProtos.GeneratedCodeInfoOrBuilder getGeneratedCodeInfoOrBuilder() {
            return this.generatedCodeInfo_ == null ? DescriptorProtos.GeneratedCodeInfo.getDefaultInstance() : this.generatedCodeInfo_;
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
               GeneratedMessageV3.writeString(var1, 1, this.name_);
            }

            if ((this.bitField0_ & 2) != 0) {
               GeneratedMessageV3.writeString(var1, 2, this.insertionPoint_);
            }

            if ((this.bitField0_ & 4) != 0) {
               GeneratedMessageV3.writeString(var1, 15, this.content_);
            }

            if ((this.bitField0_ & 8) != 0) {
               var1.writeMessage(16, this.getGeneratedCodeInfo());
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
               var1 += GeneratedMessageV3.computeStringSize(1, this.name_);
            }

            if ((this.bitField0_ & 2) != 0) {
               var1 += GeneratedMessageV3.computeStringSize(2, this.insertionPoint_);
            }

            if ((this.bitField0_ & 4) != 0) {
               var1 += GeneratedMessageV3.computeStringSize(15, this.content_);
            }

            if ((this.bitField0_ & 8) != 0) {
               var1 += CodedOutputStream.computeMessageSize(16, this.getGeneratedCodeInfo());
            }

            var1 += this.getUnknownFields().getSerializedSize();
            this.memoizedSize = var1;
            return var1;
         }

         @Override
         public boolean equals(Object var1) {
            if (var1 == this) {
               return true;
            } else if (!(var1 instanceof PluginProtos.CodeGeneratorResponse.File)) {
               return super.equals(var1);
            } else {
               PluginProtos.CodeGeneratorResponse.File var2 = (PluginProtos.CodeGeneratorResponse.File)var1;
               if (this.hasName() != var2.hasName()) {
                  return false;
               } else if (this.hasName() && !this.getName().equals(var2.getName())) {
                  return false;
               } else if (this.hasInsertionPoint() != var2.hasInsertionPoint()) {
                  return false;
               } else if (this.hasInsertionPoint() && !this.getInsertionPoint().equals(var2.getInsertionPoint())) {
                  return false;
               } else if (this.hasContent() != var2.hasContent()) {
                  return false;
               } else if (this.hasContent() && !this.getContent().equals(var2.getContent())) {
                  return false;
               } else if (this.hasGeneratedCodeInfo() != var2.hasGeneratedCodeInfo()) {
                  return false;
               } else {
                  return this.hasGeneratedCodeInfo() && !this.getGeneratedCodeInfo().equals(var2.getGeneratedCodeInfo())
                     ? false
                     : this.getUnknownFields().equals(var2.getUnknownFields());
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
            if (this.hasName()) {
               var1 = 37 * var1 + 1;
               var1 = 53 * var1 + this.getName().hashCode();
            }

            if (this.hasInsertionPoint()) {
               var1 = 37 * var1 + 2;
               var1 = 53 * var1 + this.getInsertionPoint().hashCode();
            }

            if (this.hasContent()) {
               var1 = 37 * var1 + 15;
               var1 = 53 * var1 + this.getContent().hashCode();
            }

            if (this.hasGeneratedCodeInfo()) {
               var1 = 37 * var1 + 16;
               var1 = 53 * var1 + this.getGeneratedCodeInfo().hashCode();
            }

            var1 = 29 * var1 + this.getUnknownFields().hashCode();
            this.memoizedHashCode = var1;
            return var1;
         }

         public static PluginProtos.CodeGeneratorResponse.File parseFrom(ByteBuffer var0) {
            return PARSER.parseFrom(var0);
         }

         public static PluginProtos.CodeGeneratorResponse.File parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
            return PARSER.parseFrom(var0, var1);
         }

         public static PluginProtos.CodeGeneratorResponse.File parseFrom(ByteString var0) {
            return PARSER.parseFrom(var0);
         }

         public static PluginProtos.CodeGeneratorResponse.File parseFrom(ByteString var0, ExtensionRegistryLite var1) {
            return PARSER.parseFrom(var0, var1);
         }

         public static PluginProtos.CodeGeneratorResponse.File parseFrom(byte[] var0) {
            return PARSER.parseFrom(var0);
         }

         public static PluginProtos.CodeGeneratorResponse.File parseFrom(byte[] var0, ExtensionRegistryLite var1) {
            return PARSER.parseFrom(var0, var1);
         }

         public static PluginProtos.CodeGeneratorResponse.File parseFrom(InputStream var0) {
            return GeneratedMessageV3.parseWithIOException(PARSER, var0);
         }

         public static PluginProtos.CodeGeneratorResponse.File parseFrom(InputStream var0, ExtensionRegistryLite var1) {
            return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
         }

         public static PluginProtos.CodeGeneratorResponse.File parseDelimitedFrom(InputStream var0) {
            return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
         }

         public static PluginProtos.CodeGeneratorResponse.File parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
            return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
         }

         public static PluginProtos.CodeGeneratorResponse.File parseFrom(CodedInputStream var0) {
            return GeneratedMessageV3.parseWithIOException(PARSER, var0);
         }

         public static PluginProtos.CodeGeneratorResponse.File parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
            return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
         }

         public PluginProtos.CodeGeneratorResponse.File.Builder newBuilderForType() {
            return newBuilder();
         }

         public static PluginProtos.CodeGeneratorResponse.File.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
         }

         public static PluginProtos.CodeGeneratorResponse.File.Builder newBuilder(PluginProtos.CodeGeneratorResponse.File var0) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
         }

         public PluginProtos.CodeGeneratorResponse.File.Builder toBuilder() {
            return this == DEFAULT_INSTANCE
               ? new PluginProtos.CodeGeneratorResponse.File.Builder()
               : new PluginProtos.CodeGeneratorResponse.File.Builder().mergeFrom(this);
         }

         protected PluginProtos.CodeGeneratorResponse.File.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
            return new PluginProtos.CodeGeneratorResponse.File.Builder(var1);
         }

         public static PluginProtos.CodeGeneratorResponse.File getDefaultInstance() {
            return DEFAULT_INSTANCE;
         }

         public static Parser<PluginProtos.CodeGeneratorResponse.File> parser() {
            return PARSER;
         }

         @Override
         public Parser<PluginProtos.CodeGeneratorResponse.File> getParserForType() {
            return PARSER;
         }

         public PluginProtos.CodeGeneratorResponse.File getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
         }

         public static final class Builder
            extends GeneratedMessageV3.Builder<PluginProtos.CodeGeneratorResponse.File.Builder>
            implements PluginProtos.CodeGeneratorResponse.FileOrBuilder {
            private int bitField0_;
            private Object name_ = "";
            private Object insertionPoint_ = "";
            private Object content_ = "";
            private DescriptorProtos.GeneratedCodeInfo generatedCodeInfo_;
            private SingleFieldBuilderV3<DescriptorProtos.GeneratedCodeInfo, DescriptorProtos.GeneratedCodeInfo.Builder, DescriptorProtos.GeneratedCodeInfoOrBuilder> generatedCodeInfoBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
               return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_descriptor;
            }

            @Override
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
               return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_fieldAccessorTable
                  .ensureFieldAccessorsInitialized(PluginProtos.CodeGeneratorResponse.File.class, PluginProtos.CodeGeneratorResponse.File.Builder.class);
            }

            private Builder() {
               this.maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent var1) {
               super(var1);
               this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
               if (PluginProtos.CodeGeneratorResponse.File.alwaysUseFieldBuilders) {
                  this.getGeneratedCodeInfoFieldBuilder();
               }
            }

            public PluginProtos.CodeGeneratorResponse.File.Builder clear() {
               super.clear();
               this.bitField0_ = 0;
               this.name_ = "";
               this.insertionPoint_ = "";
               this.content_ = "";
               this.generatedCodeInfo_ = null;
               if (this.generatedCodeInfoBuilder_ != null) {
                  this.generatedCodeInfoBuilder_.dispose();
                  this.generatedCodeInfoBuilder_ = null;
               }

               return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
               return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_descriptor;
            }

            public PluginProtos.CodeGeneratorResponse.File getDefaultInstanceForType() {
               return PluginProtos.CodeGeneratorResponse.File.getDefaultInstance();
            }

            public PluginProtos.CodeGeneratorResponse.File build() {
               PluginProtos.CodeGeneratorResponse.File var1 = this.buildPartial();
               if (!var1.isInitialized()) {
                  throw newUninitializedMessageException(var1);
               } else {
                  return var1;
               }
            }

            public PluginProtos.CodeGeneratorResponse.File buildPartial() {
               PluginProtos.CodeGeneratorResponse.File var1 = new PluginProtos.CodeGeneratorResponse.File(this);
               if (this.bitField0_ != 0) {
                  this.buildPartial0(var1);
               }

               this.onBuilt();
               return var1;
            }

            private void buildPartial0(PluginProtos.CodeGeneratorResponse.File var1) {
               int var2 = this.bitField0_;
               byte var3 = 0;
               if ((var2 & 1) != 0) {
                  var1.name_ = this.name_;
                  var3 |= 1;
               }

               if ((var2 & 2) != 0) {
                  var1.insertionPoint_ = this.insertionPoint_;
                  var3 |= 2;
               }

               if ((var2 & 4) != 0) {
                  var1.content_ = this.content_;
                  var3 |= 4;
               }

               if ((var2 & 8) != 0) {
                  var1.generatedCodeInfo_ = this.generatedCodeInfoBuilder_ == null ? this.generatedCodeInfo_ : this.generatedCodeInfoBuilder_.build();
                  var3 |= 8;
               }

               var1.bitField0_ |= var3;
            }

            public PluginProtos.CodeGeneratorResponse.File.Builder clone() {
               return (PluginProtos.CodeGeneratorResponse.File.Builder)super.clone();
            }

            public PluginProtos.CodeGeneratorResponse.File.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
               return (PluginProtos.CodeGeneratorResponse.File.Builder)super.setField(var1, var2);
            }

            public PluginProtos.CodeGeneratorResponse.File.Builder clearField(Descriptors.FieldDescriptor var1) {
               return (PluginProtos.CodeGeneratorResponse.File.Builder)super.clearField(var1);
            }

            public PluginProtos.CodeGeneratorResponse.File.Builder clearOneof(Descriptors.OneofDescriptor var1) {
               return (PluginProtos.CodeGeneratorResponse.File.Builder)super.clearOneof(var1);
            }

            public PluginProtos.CodeGeneratorResponse.File.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
               return (PluginProtos.CodeGeneratorResponse.File.Builder)super.setRepeatedField(var1, var2, var3);
            }

            public PluginProtos.CodeGeneratorResponse.File.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
               return (PluginProtos.CodeGeneratorResponse.File.Builder)super.addRepeatedField(var1, var2);
            }

            public PluginProtos.CodeGeneratorResponse.File.Builder mergeFrom(Message var1) {
               if (var1 instanceof PluginProtos.CodeGeneratorResponse.File) {
                  return this.mergeFrom((PluginProtos.CodeGeneratorResponse.File)var1);
               }

               super.mergeFrom(var1);
               return this;
            }

            public PluginProtos.CodeGeneratorResponse.File.Builder mergeFrom(PluginProtos.CodeGeneratorResponse.File var1) {
               if (var1 == PluginProtos.CodeGeneratorResponse.File.getDefaultInstance()) {
                  return this;
               }

               if (var1.hasName()) {
                  this.name_ = var1.name_;
                  this.bitField0_ |= 1;
                  this.onChanged();
               }

               if (var1.hasInsertionPoint()) {
                  this.insertionPoint_ = var1.insertionPoint_;
                  this.bitField0_ |= 2;
                  this.onChanged();
               }

               if (var1.hasContent()) {
                  this.content_ = var1.content_;
                  this.bitField0_ |= 4;
                  this.onChanged();
               }

               if (var1.hasGeneratedCodeInfo()) {
                  this.mergeGeneratedCodeInfo(var1.getGeneratedCodeInfo());
               }

               this.mergeUnknownFields(var1.getUnknownFields());
               this.onChanged();
               return this;
            }

            @Override
            public final boolean isInitialized() {
               return true;
            }

            public PluginProtos.CodeGeneratorResponse.File.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                           this.name_ = var1.readBytes();
                           this.bitField0_ |= 1;
                           break;
                        case 18:
                           this.insertionPoint_ = var1.readBytes();
                           this.bitField0_ |= 2;
                           break;
                        case 122:
                           this.content_ = var1.readBytes();
                           this.bitField0_ |= 4;
                           break;
                        case 130:
                           var1.readMessage(this.getGeneratedCodeInfoFieldBuilder().getBuilder(), var2);
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
            public boolean hasName() {
               return (this.bitField0_ & 1) != 0;
            }

            @Override
            public String getName() {
               Object var1 = this.name_;
               if (!(var1 instanceof String)) {
                  ByteString var2 = (ByteString)var1;
                  String var3 = var2.toStringUtf8();
                  if (var2.isValidUtf8()) {
                     this.name_ = var3;
                  }

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

            public PluginProtos.CodeGeneratorResponse.File.Builder setName(String var1) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.name_ = var1;
               this.bitField0_ |= 1;
               this.onChanged();
               return this;
            }

            public PluginProtos.CodeGeneratorResponse.File.Builder clearName() {
               this.name_ = PluginProtos.CodeGeneratorResponse.File.getDefaultInstance().getName();
               this.bitField0_ &= -2;
               this.onChanged();
               return this;
            }

            public PluginProtos.CodeGeneratorResponse.File.Builder setNameBytes(ByteString var1) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.name_ = var1;
               this.bitField0_ |= 1;
               this.onChanged();
               return this;
            }

            @Override
            public boolean hasInsertionPoint() {
               return (this.bitField0_ & 2) != 0;
            }

            @Override
            public String getInsertionPoint() {
               Object var1 = this.insertionPoint_;
               if (!(var1 instanceof String)) {
                  ByteString var2 = (ByteString)var1;
                  String var3 = var2.toStringUtf8();
                  if (var2.isValidUtf8()) {
                     this.insertionPoint_ = var3;
                  }

                  return var3;
               } else {
                  return (String)var1;
               }
            }

            @Override
            public ByteString getInsertionPointBytes() {
               Object var1 = this.insertionPoint_;
               if (var1 instanceof String) {
                  ByteString var2 = ByteString.copyFromUtf8((String)var1);
                  this.insertionPoint_ = var2;
                  return var2;
               } else {
                  return (ByteString)var1;
               }
            }

            public PluginProtos.CodeGeneratorResponse.File.Builder setInsertionPoint(String var1) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.insertionPoint_ = var1;
               this.bitField0_ |= 2;
               this.onChanged();
               return this;
            }

            public PluginProtos.CodeGeneratorResponse.File.Builder clearInsertionPoint() {
               this.insertionPoint_ = PluginProtos.CodeGeneratorResponse.File.getDefaultInstance().getInsertionPoint();
               this.bitField0_ &= -3;
               this.onChanged();
               return this;
            }

            public PluginProtos.CodeGeneratorResponse.File.Builder setInsertionPointBytes(ByteString var1) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.insertionPoint_ = var1;
               this.bitField0_ |= 2;
               this.onChanged();
               return this;
            }

            @Override
            public boolean hasContent() {
               return (this.bitField0_ & 4) != 0;
            }

            @Override
            public String getContent() {
               Object var1 = this.content_;
               if (!(var1 instanceof String)) {
                  ByteString var2 = (ByteString)var1;
                  String var3 = var2.toStringUtf8();
                  if (var2.isValidUtf8()) {
                     this.content_ = var3;
                  }

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

            public PluginProtos.CodeGeneratorResponse.File.Builder setContent(String var1) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.content_ = var1;
               this.bitField0_ |= 4;
               this.onChanged();
               return this;
            }

            public PluginProtos.CodeGeneratorResponse.File.Builder clearContent() {
               this.content_ = PluginProtos.CodeGeneratorResponse.File.getDefaultInstance().getContent();
               this.bitField0_ &= -5;
               this.onChanged();
               return this;
            }

            public PluginProtos.CodeGeneratorResponse.File.Builder setContentBytes(ByteString var1) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.content_ = var1;
               this.bitField0_ |= 4;
               this.onChanged();
               return this;
            }

            @Override
            public boolean hasGeneratedCodeInfo() {
               return (this.bitField0_ & 8) != 0;
            }

            @Override
            public DescriptorProtos.GeneratedCodeInfo getGeneratedCodeInfo() {
               if (this.generatedCodeInfoBuilder_ == null) {
                  return this.generatedCodeInfo_ == null ? DescriptorProtos.GeneratedCodeInfo.getDefaultInstance() : this.generatedCodeInfo_;
               } else {
                  return this.generatedCodeInfoBuilder_.getMessage();
               }
            }

            public PluginProtos.CodeGeneratorResponse.File.Builder setGeneratedCodeInfo(DescriptorProtos.GeneratedCodeInfo var1) {
               if (this.generatedCodeInfoBuilder_ == null) {
                  if (var1 == null) {
                     throw new NullPointerException();
                  }

                  this.generatedCodeInfo_ = var1;
               } else {
                  this.generatedCodeInfoBuilder_.setMessage(var1);
               }

               this.bitField0_ |= 8;
               this.onChanged();
               return this;
            }

            public PluginProtos.CodeGeneratorResponse.File.Builder setGeneratedCodeInfo(DescriptorProtos.GeneratedCodeInfo.Builder var1) {
               if (this.generatedCodeInfoBuilder_ == null) {
                  this.generatedCodeInfo_ = var1.build();
               } else {
                  this.generatedCodeInfoBuilder_.setMessage(var1.build());
               }

               this.bitField0_ |= 8;
               this.onChanged();
               return this;
            }

            public PluginProtos.CodeGeneratorResponse.File.Builder mergeGeneratedCodeInfo(DescriptorProtos.GeneratedCodeInfo var1) {
               if (this.generatedCodeInfoBuilder_ == null) {
                  if ((this.bitField0_ & 8) != 0
                     && this.generatedCodeInfo_ != null
                     && this.generatedCodeInfo_ != DescriptorProtos.GeneratedCodeInfo.getDefaultInstance()) {
                     this.getGeneratedCodeInfoBuilder().mergeFrom(var1);
                  } else {
                     this.generatedCodeInfo_ = var1;
                  }
               } else {
                  this.generatedCodeInfoBuilder_.mergeFrom(var1);
               }

               if (this.generatedCodeInfo_ != null) {
                  this.bitField0_ |= 8;
                  this.onChanged();
               }

               return this;
            }

            public PluginProtos.CodeGeneratorResponse.File.Builder clearGeneratedCodeInfo() {
               this.bitField0_ &= -9;
               this.generatedCodeInfo_ = null;
               if (this.generatedCodeInfoBuilder_ != null) {
                  this.generatedCodeInfoBuilder_.dispose();
                  this.generatedCodeInfoBuilder_ = null;
               }

               this.onChanged();
               return this;
            }

            public DescriptorProtos.GeneratedCodeInfo.Builder getGeneratedCodeInfoBuilder() {
               this.bitField0_ |= 8;
               this.onChanged();
               return this.getGeneratedCodeInfoFieldBuilder().getBuilder();
            }

            @Override
            public DescriptorProtos.GeneratedCodeInfoOrBuilder getGeneratedCodeInfoOrBuilder() {
               if (this.generatedCodeInfoBuilder_ != null) {
                  return this.generatedCodeInfoBuilder_.getMessageOrBuilder();
               } else {
                  return this.generatedCodeInfo_ == null ? DescriptorProtos.GeneratedCodeInfo.getDefaultInstance() : this.generatedCodeInfo_;
               }
            }

            private SingleFieldBuilderV3<DescriptorProtos.GeneratedCodeInfo, DescriptorProtos.GeneratedCodeInfo.Builder, DescriptorProtos.GeneratedCodeInfoOrBuilder> getGeneratedCodeInfoFieldBuilder() {
               if (this.generatedCodeInfoBuilder_ == null) {
                  this.generatedCodeInfoBuilder_ = new SingleFieldBuilderV3<>(this.getGeneratedCodeInfo(), this.getParentForChildren(), this.isClean());
                  this.generatedCodeInfo_ = null;
               }

               return this.generatedCodeInfoBuilder_;
            }

            public final PluginProtos.CodeGeneratorResponse.File.Builder setUnknownFields(UnknownFieldSet var1) {
               return (PluginProtos.CodeGeneratorResponse.File.Builder)super.setUnknownFields(var1);
            }

            public final PluginProtos.CodeGeneratorResponse.File.Builder mergeUnknownFields(UnknownFieldSet var1) {
               return (PluginProtos.CodeGeneratorResponse.File.Builder)super.mergeUnknownFields(var1);
            }
         }
      }

      public interface FileOrBuilder extends MessageOrBuilder {
         boolean hasName();

         String getName();

         ByteString getNameBytes();

         boolean hasInsertionPoint();

         String getInsertionPoint();

         ByteString getInsertionPointBytes();

         boolean hasContent();

         String getContent();

         ByteString getContentBytes();

         boolean hasGeneratedCodeInfo();

         DescriptorProtos.GeneratedCodeInfo getGeneratedCodeInfo();

         DescriptorProtos.GeneratedCodeInfoOrBuilder getGeneratedCodeInfoOrBuilder();
      }
   }

   public interface CodeGeneratorResponseOrBuilder extends MessageOrBuilder {
      boolean hasError();

      String getError();

      ByteString getErrorBytes();

      boolean hasSupportedFeatures();

      long getSupportedFeatures();

      List<PluginProtos.CodeGeneratorResponse.File> getFileList();

      PluginProtos.CodeGeneratorResponse.File getFile(int var1);

      int getFileCount();

      List<? extends PluginProtos.CodeGeneratorResponse.FileOrBuilder> getFileOrBuilderList();

      PluginProtos.CodeGeneratorResponse.FileOrBuilder getFileOrBuilder(int var1);
   }

   public static final class Version extends GeneratedMessageV3 implements PluginProtos.VersionOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MAJOR_FIELD_NUMBER = 1;
      private int major_ = 0;
      public static final int MINOR_FIELD_NUMBER = 2;
      private int minor_ = 0;
      public static final int PATCH_FIELD_NUMBER = 3;
      private int patch_ = 0;
      public static final int SUFFIX_FIELD_NUMBER = 4;
      private volatile Object suffix_ = "";
      private byte memoizedIsInitialized = -1;
      private static final PluginProtos.Version DEFAULT_INSTANCE = new PluginProtos.Version();
      @Deprecated
      public static final Parser<PluginProtos.Version> PARSER = new AbstractParser<PluginProtos.Version>() {
         public PluginProtos.Version parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            PluginProtos.Version.Builder var3 = PluginProtos.Version.newBuilder();

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

      private Version(GeneratedMessageV3.Builder<?> var1) {
         super(var1);
      }

      private Version() {
         this.suffix_ = "";
      }

      @Override
      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
         return new PluginProtos.Version();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PluginProtos.internal_static_google_protobuf_compiler_Version_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PluginProtos.internal_static_google_protobuf_compiler_Version_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PluginProtos.Version.class, PluginProtos.Version.Builder.class);
      }

      @Override
      public boolean hasMajor() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public int getMajor() {
         return this.major_;
      }

      @Override
      public boolean hasMinor() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public int getMinor() {
         return this.minor_;
      }

      @Override
      public boolean hasPatch() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public int getPatch() {
         return this.patch_;
      }

      @Override
      public boolean hasSuffix() {
         return (this.bitField0_ & 8) != 0;
      }

      @Override
      public String getSuffix() {
         Object var1 = this.suffix_;
         if (var1 instanceof String) {
            return (String)var1;
         }

         ByteString var2 = (ByteString)var1;
         String var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.suffix_ = var3;
         }

         return var3;
      }

      @Override
      public ByteString getSuffixBytes() {
         Object var1 = this.suffix_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.suffix_ = var2;
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
            var1.writeInt32(1, this.major_);
         }

         if ((this.bitField0_ & 2) != 0) {
            var1.writeInt32(2, this.minor_);
         }

         if ((this.bitField0_ & 4) != 0) {
            var1.writeInt32(3, this.patch_);
         }

         if ((this.bitField0_ & 8) != 0) {
            GeneratedMessageV3.writeString(var1, 4, this.suffix_);
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
            var1 += CodedOutputStream.computeInt32Size(1, this.major_);
         }

         if ((this.bitField0_ & 2) != 0) {
            var1 += CodedOutputStream.computeInt32Size(2, this.minor_);
         }

         if ((this.bitField0_ & 4) != 0) {
            var1 += CodedOutputStream.computeInt32Size(3, this.patch_);
         }

         if ((this.bitField0_ & 8) != 0) {
            var1 += GeneratedMessageV3.computeStringSize(4, this.suffix_);
         }

         var1 += this.getUnknownFields().getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof PluginProtos.Version)) {
            return super.equals(var1);
         } else {
            PluginProtos.Version var2 = (PluginProtos.Version)var1;
            if (this.hasMajor() != var2.hasMajor()) {
               return false;
            } else if (this.hasMajor() && this.getMajor() != var2.getMajor()) {
               return false;
            } else if (this.hasMinor() != var2.hasMinor()) {
               return false;
            } else if (this.hasMinor() && this.getMinor() != var2.getMinor()) {
               return false;
            } else if (this.hasPatch() != var2.hasPatch()) {
               return false;
            } else if (this.hasPatch() && this.getPatch() != var2.getPatch()) {
               return false;
            } else if (this.hasSuffix() != var2.hasSuffix()) {
               return false;
            } else {
               return this.hasSuffix() && !this.getSuffix().equals(var2.getSuffix()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
         if (this.hasMajor()) {
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getMajor();
         }

         if (this.hasMinor()) {
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getMinor();
         }

         if (this.hasPatch()) {
            var1 = 37 * var1 + 3;
            var1 = 53 * var1 + this.getPatch();
         }

         if (this.hasSuffix()) {
            var1 = 37 * var1 + 4;
            var1 = 53 * var1 + this.getSuffix().hashCode();
         }

         var1 = 29 * var1 + this.getUnknownFields().hashCode();
         this.memoizedHashCode = var1;
         return var1;
      }

      public static PluginProtos.Version parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static PluginProtos.Version parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static PluginProtos.Version parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static PluginProtos.Version parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static PluginProtos.Version parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static PluginProtos.Version parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static PluginProtos.Version parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static PluginProtos.Version parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static PluginProtos.Version parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static PluginProtos.Version parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static PluginProtos.Version parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static PluginProtos.Version parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public PluginProtos.Version.Builder newBuilderForType() {
         return newBuilder();
      }

      public static PluginProtos.Version.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static PluginProtos.Version.Builder newBuilder(PluginProtos.Version var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public PluginProtos.Version.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new PluginProtos.Version.Builder() : new PluginProtos.Version.Builder().mergeFrom(this);
      }

      protected PluginProtos.Version.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new PluginProtos.Version.Builder(var1);
      }

      public static PluginProtos.Version getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<PluginProtos.Version> parser() {
         return PARSER;
      }

      @Override
      public Parser<PluginProtos.Version> getParserForType() {
         return PARSER;
      }

      public PluginProtos.Version getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<PluginProtos.Version.Builder> implements PluginProtos.VersionOrBuilder {
         private int bitField0_;
         private int major_;
         private int minor_;
         private int patch_;
         private Object suffix_ = "";

         public static final Descriptors.Descriptor getDescriptor() {
            return PluginProtos.internal_static_google_protobuf_compiler_Version_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PluginProtos.internal_static_google_protobuf_compiler_Version_fieldAccessorTable
               .ensureFieldAccessorsInitialized(PluginProtos.Version.class, PluginProtos.Version.Builder.class);
         }

         private Builder() {
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
         }

         public PluginProtos.Version.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.major_ = 0;
            this.minor_ = 0;
            this.patch_ = 0;
            this.suffix_ = "";
            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return PluginProtos.internal_static_google_protobuf_compiler_Version_descriptor;
         }

         public PluginProtos.Version getDefaultInstanceForType() {
            return PluginProtos.Version.getDefaultInstance();
         }

         public PluginProtos.Version build() {
            PluginProtos.Version var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public PluginProtos.Version buildPartial() {
            PluginProtos.Version var1 = new PluginProtos.Version(this);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartial0(PluginProtos.Version var1) {
            int var2 = this.bitField0_;
            byte var3 = 0;
            if ((var2 & 1) != 0) {
               var1.major_ = this.major_;
               var3 |= 1;
            }

            if ((var2 & 2) != 0) {
               var1.minor_ = this.minor_;
               var3 |= 2;
            }

            if ((var2 & 4) != 0) {
               var1.patch_ = this.patch_;
               var3 |= 4;
            }

            if ((var2 & 8) != 0) {
               var1.suffix_ = this.suffix_;
               var3 |= 8;
            }

            var1.bitField0_ |= var3;
         }

         public PluginProtos.Version.Builder clone() {
            return (PluginProtos.Version.Builder)super.clone();
         }

         public PluginProtos.Version.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (PluginProtos.Version.Builder)super.setField(var1, var2);
         }

         public PluginProtos.Version.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (PluginProtos.Version.Builder)super.clearField(var1);
         }

         public PluginProtos.Version.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (PluginProtos.Version.Builder)super.clearOneof(var1);
         }

         public PluginProtos.Version.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (PluginProtos.Version.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public PluginProtos.Version.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (PluginProtos.Version.Builder)super.addRepeatedField(var1, var2);
         }

         public PluginProtos.Version.Builder mergeFrom(Message var1) {
            if (var1 instanceof PluginProtos.Version) {
               return this.mergeFrom((PluginProtos.Version)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public PluginProtos.Version.Builder mergeFrom(PluginProtos.Version var1) {
            if (var1 == PluginProtos.Version.getDefaultInstance()) {
               return this;
            }

            if (var1.hasMajor()) {
               this.setMajor(var1.getMajor());
            }

            if (var1.hasMinor()) {
               this.setMinor(var1.getMinor());
            }

            if (var1.hasPatch()) {
               this.setPatch(var1.getPatch());
            }

            if (var1.hasSuffix()) {
               this.suffix_ = var1.suffix_;
               this.bitField0_ |= 8;
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

         public PluginProtos.Version.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                        this.major_ = var1.readInt32();
                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.minor_ = var1.readInt32();
                        this.bitField0_ |= 2;
                        break;
                     case 24:
                        this.patch_ = var1.readInt32();
                        this.bitField0_ |= 4;
                        break;
                     case 34:
                        this.suffix_ = var1.readBytes();
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
         public boolean hasMajor() {
            return (this.bitField0_ & 1) != 0;
         }

         @Override
         public int getMajor() {
            return this.major_;
         }

         public PluginProtos.Version.Builder setMajor(int var1) {
            this.major_ = var1;
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public PluginProtos.Version.Builder clearMajor() {
            this.bitField0_ &= -2;
            this.major_ = 0;
            this.onChanged();
            return this;
         }

         @Override
         public boolean hasMinor() {
            return (this.bitField0_ & 2) != 0;
         }

         @Override
         public int getMinor() {
            return this.minor_;
         }

         public PluginProtos.Version.Builder setMinor(int var1) {
            this.minor_ = var1;
            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         public PluginProtos.Version.Builder clearMinor() {
            this.bitField0_ &= -3;
            this.minor_ = 0;
            this.onChanged();
            return this;
         }

         @Override
         public boolean hasPatch() {
            return (this.bitField0_ & 4) != 0;
         }

         @Override
         public int getPatch() {
            return this.patch_;
         }

         public PluginProtos.Version.Builder setPatch(int var1) {
            this.patch_ = var1;
            this.bitField0_ |= 4;
            this.onChanged();
            return this;
         }

         public PluginProtos.Version.Builder clearPatch() {
            this.bitField0_ &= -5;
            this.patch_ = 0;
            this.onChanged();
            return this;
         }

         @Override
         public boolean hasSuffix() {
            return (this.bitField0_ & 8) != 0;
         }

         @Override
         public String getSuffix() {
            Object var1 = this.suffix_;
            if (!(var1 instanceof String)) {
               ByteString var2 = (ByteString)var1;
               String var3 = var2.toStringUtf8();
               if (var2.isValidUtf8()) {
                  this.suffix_ = var3;
               }

               return var3;
            } else {
               return (String)var1;
            }
         }

         @Override
         public ByteString getSuffixBytes() {
            Object var1 = this.suffix_;
            if (var1 instanceof String) {
               ByteString var2 = ByteString.copyFromUtf8((String)var1);
               this.suffix_ = var2;
               return var2;
            } else {
               return (ByteString)var1;
            }
         }

         public PluginProtos.Version.Builder setSuffix(String var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.suffix_ = var1;
            this.bitField0_ |= 8;
            this.onChanged();
            return this;
         }

         public PluginProtos.Version.Builder clearSuffix() {
            this.suffix_ = PluginProtos.Version.getDefaultInstance().getSuffix();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         public PluginProtos.Version.Builder setSuffixBytes(ByteString var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.suffix_ = var1;
            this.bitField0_ |= 8;
            this.onChanged();
            return this;
         }

         public final PluginProtos.Version.Builder setUnknownFields(UnknownFieldSet var1) {
            return (PluginProtos.Version.Builder)super.setUnknownFields(var1);
         }

         public final PluginProtos.Version.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (PluginProtos.Version.Builder)super.mergeUnknownFields(var1);
         }
      }
   }

   public interface VersionOrBuilder extends MessageOrBuilder {
      boolean hasMajor();

      int getMajor();

      boolean hasMinor();

      int getMinor();

      boolean hasPatch();

      int getPatch();

      boolean hasSuffix();

      String getSuffix();

      ByteString getSuffixBytes();
   }
}
