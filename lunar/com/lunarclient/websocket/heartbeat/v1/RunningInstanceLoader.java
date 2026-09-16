package com.lunarclient.websocket.heartbeat.v1;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class RunningInstanceLoader extends GeneratedMessageV3 implements RunningInstanceLoaderOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int LOADER_FIELD_NUMBER = 1;
   private volatile Object loader_ = "";
   public static final int LOADER_VERSION_FIELD_NUMBER = 2;
   private volatile Object loaderVersion_ = "";
   public static final int LOADER_VERSION_RECOMMENDED_FIELD_NUMBER = 3;
   private boolean loaderVersionRecommended_ = false;
   private byte memoizedIsInitialized = -1;
   private static final RunningInstanceLoader DEFAULT_INSTANCE = new RunningInstanceLoader();
   private static final Parser<RunningInstanceLoader> PARSER = new AbstractParser<RunningInstanceLoader>() {
      public RunningInstanceLoader parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RunningInstanceLoader.Builder var3 = RunningInstanceLoader.newBuilder();

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

   private RunningInstanceLoader(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RunningInstanceLoader() {
      this.loader_ = "";
      this.loaderVersion_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RunningInstanceLoader();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_RunningInstanceLoader_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_RunningInstanceLoader_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RunningInstanceLoader.class, RunningInstanceLoader.Builder.class);
   }

   @Override
   public String getLoader() {
      Object var1 = this.loader_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.loader_ = var3;
      return var3;
   }

   @Override
   public ByteString getLoaderBytes() {
      Object var1 = this.loader_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.loader_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getLoaderVersion() {
      Object var1 = this.loaderVersion_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.loaderVersion_ = var3;
      return var3;
   }

   @Override
   public ByteString getLoaderVersionBytes() {
      Object var1 = this.loaderVersion_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.loaderVersion_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean getLoaderVersionRecommended() {
      return this.loaderVersionRecommended_;
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
      if (!GeneratedMessageV3.isStringEmpty(this.loader_)) {
         GeneratedMessageV3.writeString(var1, 1, this.loader_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.loaderVersion_)) {
         GeneratedMessageV3.writeString(var1, 2, this.loaderVersion_);
      }

      if (this.loaderVersionRecommended_) {
         var1.writeBool(3, this.loaderVersionRecommended_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.loader_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.loader_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.loaderVersion_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.loaderVersion_);
      }

      if (this.loaderVersionRecommended_) {
         var1 += CodedOutputStream.computeBoolSize(3, this.loaderVersionRecommended_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RunningInstanceLoader)) {
         return super.equals(var1);
      } else {
         RunningInstanceLoader var2 = (RunningInstanceLoader)var1;
         if (!this.getLoader().equals(var2.getLoader())) {
            return false;
         } else if (!this.getLoaderVersion().equals(var2.getLoaderVersion())) {
            return false;
         } else {
            return this.getLoaderVersionRecommended() != var2.getLoaderVersionRecommended() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getLoader().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getLoaderVersion().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Internal.hashBoolean(this.getLoaderVersionRecommended());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RunningInstanceLoader parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RunningInstanceLoader parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RunningInstanceLoader parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RunningInstanceLoader parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RunningInstanceLoader parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RunningInstanceLoader parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RunningInstanceLoader parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RunningInstanceLoader parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RunningInstanceLoader parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RunningInstanceLoader parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RunningInstanceLoader parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RunningInstanceLoader parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RunningInstanceLoader.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RunningInstanceLoader.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RunningInstanceLoader.Builder newBuilder(RunningInstanceLoader var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RunningInstanceLoader.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RunningInstanceLoader.Builder() : new RunningInstanceLoader.Builder().mergeFrom(this);
   }

   protected RunningInstanceLoader.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RunningInstanceLoader.Builder(var1);
   }

   public static RunningInstanceLoader getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RunningInstanceLoader> parser() {
      return PARSER;
   }

   @Override
   public Parser<RunningInstanceLoader> getParserForType() {
      return PARSER;
   }

   public RunningInstanceLoader getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RunningInstanceLoader.Builder> implements RunningInstanceLoaderOrBuilder {
      private int bitField0_;
      private Object loader_ = "";
      private Object loaderVersion_ = "";
      private boolean loaderVersionRecommended_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_RunningInstanceLoader_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_RunningInstanceLoader_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RunningInstanceLoader.class, RunningInstanceLoader.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RunningInstanceLoader.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.loader_ = "";
         this.loaderVersion_ = "";
         this.loaderVersionRecommended_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_RunningInstanceLoader_descriptor;
      }

      public RunningInstanceLoader getDefaultInstanceForType() {
         return RunningInstanceLoader.getDefaultInstance();
      }

      public RunningInstanceLoader build() {
         RunningInstanceLoader var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RunningInstanceLoader buildPartial() {
         RunningInstanceLoader var1 = new RunningInstanceLoader(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RunningInstanceLoader var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.loader_ = this.loader_;
         }

         if ((var2 & 2) != 0) {
            var1.loaderVersion_ = this.loaderVersion_;
         }

         if ((var2 & 4) != 0) {
            var1.loaderVersionRecommended_ = this.loaderVersionRecommended_;
         }
      }

      public RunningInstanceLoader.Builder clone() {
         return (RunningInstanceLoader.Builder)super.clone();
      }

      public RunningInstanceLoader.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RunningInstanceLoader.Builder)super.setField(var1, var2);
      }

      public RunningInstanceLoader.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RunningInstanceLoader.Builder)super.clearField(var1);
      }

      public RunningInstanceLoader.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RunningInstanceLoader.Builder)super.clearOneof(var1);
      }

      public RunningInstanceLoader.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RunningInstanceLoader.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RunningInstanceLoader.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RunningInstanceLoader.Builder)super.addRepeatedField(var1, var2);
      }

      public RunningInstanceLoader.Builder mergeFrom(Message var1) {
         if (var1 instanceof RunningInstanceLoader) {
            return this.mergeFrom((RunningInstanceLoader)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RunningInstanceLoader.Builder mergeFrom(RunningInstanceLoader var1) {
         if (var1 == RunningInstanceLoader.getDefaultInstance()) {
            return this;
         }

         if (!var1.getLoader().isEmpty()) {
            this.loader_ = var1.loader_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getLoaderVersion().isEmpty()) {
            this.loaderVersion_ = var1.loaderVersion_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (var1.getLoaderVersionRecommended()) {
            this.setLoaderVersionRecommended(var1.getLoaderVersionRecommended());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RunningInstanceLoader.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.loader_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.loaderVersion_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.loaderVersionRecommended_ = var1.readBool();
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
      public String getLoader() {
         Object var1 = this.loader_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.loader_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getLoaderBytes() {
         Object var1 = this.loader_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.loader_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public RunningInstanceLoader.Builder setLoader(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.loader_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RunningInstanceLoader.Builder clearLoader() {
         this.loader_ = RunningInstanceLoader.getDefaultInstance().getLoader();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public RunningInstanceLoader.Builder setLoaderBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         RunningInstanceLoader.checkByteStringIsUtf8(var1);
         this.loader_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public String getLoaderVersion() {
         Object var1 = this.loaderVersion_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.loaderVersion_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getLoaderVersionBytes() {
         Object var1 = this.loaderVersion_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.loaderVersion_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public RunningInstanceLoader.Builder setLoaderVersion(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.loaderVersion_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public RunningInstanceLoader.Builder clearLoaderVersion() {
         this.loaderVersion_ = RunningInstanceLoader.getDefaultInstance().getLoaderVersion();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public RunningInstanceLoader.Builder setLoaderVersionBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         RunningInstanceLoader.checkByteStringIsUtf8(var1);
         this.loaderVersion_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getLoaderVersionRecommended() {
         return this.loaderVersionRecommended_;
      }

      public RunningInstanceLoader.Builder setLoaderVersionRecommended(boolean var1) {
         this.loaderVersionRecommended_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public RunningInstanceLoader.Builder clearLoaderVersionRecommended() {
         this.bitField0_ &= -5;
         this.loaderVersionRecommended_ = false;
         this.onChanged();
         return this;
      }

      public final RunningInstanceLoader.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RunningInstanceLoader.Builder)super.setUnknownFields(var1);
      }

      public final RunningInstanceLoader.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RunningInstanceLoader.Builder)super.mergeUnknownFields(var1);
      }
   }
}
