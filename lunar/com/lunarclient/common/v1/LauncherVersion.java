package com.lunarclient.common.v1;

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

public final class LauncherVersion extends GeneratedMessageV3 implements LauncherVersionOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SEMVER_FIELD_NUMBER = 1;
   private volatile Object semver_ = "";
   private byte memoizedIsInitialized = -1;
   private static final LauncherVersion DEFAULT_INSTANCE = new LauncherVersion();
   private static final Parser<LauncherVersion> PARSER = new AbstractParser<LauncherVersion>() {
      public LauncherVersion parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LauncherVersion.Builder var3 = LauncherVersion.newBuilder();

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

   private LauncherVersion(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LauncherVersion() {
      this.semver_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LauncherVersion();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return VersionProto.internal_static_lunarclient_common_v1_LauncherVersion_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return VersionProto.internal_static_lunarclient_common_v1_LauncherVersion_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LauncherVersion.class, LauncherVersion.Builder.class);
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
      if (!GeneratedMessageV3.isStringEmpty(this.semver_)) {
         GeneratedMessageV3.writeString(var1, 1, this.semver_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.semver_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.semver_);
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

      if (!(var1 instanceof LauncherVersion)) {
         return super.equals(var1);
      }

      LauncherVersion var2 = (LauncherVersion)var1;
      return !this.getSemver().equals(var2.getSemver()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getSemver().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LauncherVersion parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LauncherVersion parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LauncherVersion parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LauncherVersion parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LauncherVersion parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LauncherVersion parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LauncherVersion parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LauncherVersion parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LauncherVersion parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LauncherVersion parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LauncherVersion parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LauncherVersion parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LauncherVersion.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LauncherVersion.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LauncherVersion.Builder newBuilder(LauncherVersion var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LauncherVersion.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LauncherVersion.Builder() : new LauncherVersion.Builder().mergeFrom(this);
   }

   protected LauncherVersion.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LauncherVersion.Builder(var1);
   }

   public static LauncherVersion getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LauncherVersion> parser() {
      return PARSER;
   }

   @Override
   public Parser<LauncherVersion> getParserForType() {
      return PARSER;
   }

   public LauncherVersion getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LauncherVersion.Builder> implements LauncherVersionOrBuilder {
      private int bitField0_;
      private Object semver_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return VersionProto.internal_static_lunarclient_common_v1_LauncherVersion_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return VersionProto.internal_static_lunarclient_common_v1_LauncherVersion_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LauncherVersion.class, LauncherVersion.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public LauncherVersion.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.semver_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return VersionProto.internal_static_lunarclient_common_v1_LauncherVersion_descriptor;
      }

      public LauncherVersion getDefaultInstanceForType() {
         return LauncherVersion.getDefaultInstance();
      }

      public LauncherVersion build() {
         LauncherVersion var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LauncherVersion buildPartial() {
         LauncherVersion var1 = new LauncherVersion(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(LauncherVersion var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.semver_ = this.semver_;
         }
      }

      public LauncherVersion.Builder clone() {
         return (LauncherVersion.Builder)super.clone();
      }

      public LauncherVersion.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LauncherVersion.Builder)super.setField(var1, var2);
      }

      public LauncherVersion.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LauncherVersion.Builder)super.clearField(var1);
      }

      public LauncherVersion.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LauncherVersion.Builder)super.clearOneof(var1);
      }

      public LauncherVersion.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LauncherVersion.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LauncherVersion.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LauncherVersion.Builder)super.addRepeatedField(var1, var2);
      }

      public LauncherVersion.Builder mergeFrom(Message var1) {
         if (var1 instanceof LauncherVersion) {
            return this.mergeFrom((LauncherVersion)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LauncherVersion.Builder mergeFrom(LauncherVersion var1) {
         if (var1 == LauncherVersion.getDefaultInstance()) {
            return this;
         }

         if (!var1.getSemver().isEmpty()) {
            this.semver_ = var1.semver_;
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

      public LauncherVersion.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.semver_ = var1.readStringRequireUtf8();
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

      public LauncherVersion.Builder setSemver(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.semver_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LauncherVersion.Builder clearSemver() {
         this.semver_ = LauncherVersion.getDefaultInstance().getSemver();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public LauncherVersion.Builder setSemverBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LauncherVersion.checkByteStringIsUtf8(var1);
         this.semver_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final LauncherVersion.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LauncherVersion.Builder)super.setUnknownFields(var1);
      }

      public final LauncherVersion.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LauncherVersion.Builder)super.mergeUnknownFields(var1);
      }
   }
}
