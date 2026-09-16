package com.lunarclient.apollo.common.v1;

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

public final class LunarClientVersion extends GeneratedMessageV3 implements LunarClientVersionOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int GIT_BRANCH_FIELD_NUMBER = 1;
   private volatile Object gitBranch_ = "";
   public static final int GIT_COMMIT_FIELD_NUMBER = 2;
   private volatile Object gitCommit_ = "";
   public static final int SEMVER_FIELD_NUMBER = 3;
   private volatile Object semver_ = "";
   private byte memoizedIsInitialized = -1;
   private static final LunarClientVersion DEFAULT_INSTANCE = new LunarClientVersion();
   private static final Parser<LunarClientVersion> PARSER = new AbstractParser<LunarClientVersion>() {
      public LunarClientVersion parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LunarClientVersion.Builder var3 = LunarClientVersion.newBuilder();

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

   private LunarClientVersion(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LunarClientVersion() {
      this.gitBranch_ = "";
      this.gitCommit_ = "";
      this.semver_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LunarClientVersion();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return VersionProto.internal_static_lunarclient_apollo_common_v1_LunarClientVersion_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return VersionProto.internal_static_lunarclient_apollo_common_v1_LunarClientVersion_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LunarClientVersion.class, LunarClientVersion.Builder.class);
   }

   @Override
   public String getGitBranch() {
      Object var1 = this.gitBranch_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.gitBranch_ = var3;
      return var3;
   }

   @Override
   public ByteString getGitBranchBytes() {
      Object var1 = this.gitBranch_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.gitBranch_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getGitCommit() {
      Object var1 = this.gitCommit_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.gitCommit_ = var3;
      return var3;
   }

   @Override
   public ByteString getGitCommitBytes() {
      Object var1 = this.gitCommit_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.gitCommit_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getSemver() {
      Object var1 = this.semver_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.semver_ = var3;
      return var3;
   }

   @Override
   public ByteString getSemverBytes() {
      Object var1 = this.semver_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.semver_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.gitBranch_)) {
         GeneratedMessageV3.writeString(var1, 1, this.gitBranch_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.gitCommit_)) {
         GeneratedMessageV3.writeString(var1, 2, this.gitCommit_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.semver_)) {
         GeneratedMessageV3.writeString(var1, 3, this.semver_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.gitBranch_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.gitBranch_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.gitCommit_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.gitCommit_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.semver_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.semver_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LunarClientVersion)) {
         return super.equals(var1);
      } else {
         LunarClientVersion var2 = (LunarClientVersion)var1;
         if (!this.getGitBranch().equals(var2.getGitBranch())) {
            return false;
         } else if (!this.getGitCommit().equals(var2.getGitCommit())) {
            return false;
         } else {
            return !this.getSemver().equals(var2.getSemver()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getGitBranch().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getGitCommit().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getSemver().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LunarClientVersion parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LunarClientVersion parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LunarClientVersion parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LunarClientVersion parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LunarClientVersion parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LunarClientVersion parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LunarClientVersion parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LunarClientVersion parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LunarClientVersion parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LunarClientVersion parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LunarClientVersion parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LunarClientVersion parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LunarClientVersion.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LunarClientVersion.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LunarClientVersion.Builder newBuilder(LunarClientVersion var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LunarClientVersion.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LunarClientVersion.Builder() : new LunarClientVersion.Builder().mergeFrom(this);
   }

   protected LunarClientVersion.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LunarClientVersion.Builder(var1);
   }

   public static LunarClientVersion getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LunarClientVersion> parser() {
      return PARSER;
   }

   @Override
   public Parser<LunarClientVersion> getParserForType() {
      return PARSER;
   }

   public LunarClientVersion getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LunarClientVersion.Builder> implements LunarClientVersionOrBuilder {
      private int bitField0_;
      private Object gitBranch_ = "";
      private Object gitCommit_ = "";
      private Object semver_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return VersionProto.internal_static_lunarclient_apollo_common_v1_LunarClientVersion_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return VersionProto.internal_static_lunarclient_apollo_common_v1_LunarClientVersion_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LunarClientVersion.class, LunarClientVersion.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public LunarClientVersion.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.gitBranch_ = "";
         this.gitCommit_ = "";
         this.semver_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return VersionProto.internal_static_lunarclient_apollo_common_v1_LunarClientVersion_descriptor;
      }

      public LunarClientVersion getDefaultInstanceForType() {
         return LunarClientVersion.getDefaultInstance();
      }

      public LunarClientVersion build() {
         LunarClientVersion var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LunarClientVersion buildPartial() {
         LunarClientVersion var1 = new LunarClientVersion(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(LunarClientVersion var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.gitBranch_ = this.gitBranch_;
         }

         if ((var2 & 2) != 0) {
            var1.gitCommit_ = this.gitCommit_;
         }

         if ((var2 & 4) != 0) {
            var1.semver_ = this.semver_;
         }
      }

      public LunarClientVersion.Builder clone() {
         return (LunarClientVersion.Builder)super.clone();
      }

      public LunarClientVersion.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LunarClientVersion.Builder)super.setField(var1, var2);
      }

      public LunarClientVersion.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LunarClientVersion.Builder)super.clearField(var1);
      }

      public LunarClientVersion.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LunarClientVersion.Builder)super.clearOneof(var1);
      }

      public LunarClientVersion.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LunarClientVersion.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LunarClientVersion.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LunarClientVersion.Builder)super.addRepeatedField(var1, var2);
      }

      public LunarClientVersion.Builder mergeFrom(Message var1) {
         if (var1 instanceof LunarClientVersion) {
            return this.mergeFrom((LunarClientVersion)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LunarClientVersion.Builder mergeFrom(LunarClientVersion var1) {
         if (var1 == LunarClientVersion.getDefaultInstance()) {
            return this;
         }

         if (!var1.getGitBranch().isEmpty()) {
            this.gitBranch_ = var1.gitBranch_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getGitCommit().isEmpty()) {
            this.gitCommit_ = var1.gitCommit_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getSemver().isEmpty()) {
            this.semver_ = var1.semver_;
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

      public LunarClientVersion.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.gitBranch_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.gitCommit_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.semver_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
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
      public String getGitBranch() {
         Object var1 = this.gitBranch_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.gitBranch_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getGitBranchBytes() {
         Object var1 = this.gitBranch_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.gitBranch_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LunarClientVersion.Builder setGitBranch(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.gitBranch_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LunarClientVersion.Builder clearGitBranch() {
         this.gitBranch_ = LunarClientVersion.getDefaultInstance().getGitBranch();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public LunarClientVersion.Builder setGitBranchBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LunarClientVersion.checkByteStringIsUtf8(var1);
         this.gitBranch_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public String getGitCommit() {
         Object var1 = this.gitCommit_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.gitCommit_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getGitCommitBytes() {
         Object var1 = this.gitCommit_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.gitCommit_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LunarClientVersion.Builder setGitCommit(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.gitCommit_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public LunarClientVersion.Builder clearGitCommit() {
         this.gitCommit_ = LunarClientVersion.getDefaultInstance().getGitCommit();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public LunarClientVersion.Builder setGitCommitBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LunarClientVersion.checkByteStringIsUtf8(var1);
         this.gitCommit_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getSemver() {
         Object var1 = this.semver_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.semver_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getSemverBytes() {
         Object var1 = this.semver_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.semver_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LunarClientVersion.Builder setSemver(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.semver_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public LunarClientVersion.Builder clearSemver() {
         this.semver_ = LunarClientVersion.getDefaultInstance().getSemver();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public LunarClientVersion.Builder setSemverBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LunarClientVersion.checkByteStringIsUtf8(var1);
         this.semver_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public final LunarClientVersion.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LunarClientVersion.Builder)super.setUnknownFields(var1);
      }

      public final LunarClientVersion.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LunarClientVersion.Builder)super.mergeUnknownFields(var1);
      }
   }
}
