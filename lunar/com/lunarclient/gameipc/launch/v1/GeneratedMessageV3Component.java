package com.lunarclient.gameipc.launch.v1;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.PlayerModpack;
import com.lunarclient.common.v1.PlayerModpackOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class LaunchGameRequest extends GeneratedMessageV3 implements LaunchGameRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int VERSION_FIELD_NUMBER = 1;
   private volatile Object version_ = "";
   public static final int MODULE_FIELD_NUMBER = 2;
   private volatile Object module_ = "";
   public static final int AUTO_JOIN_SERVER_IP_FIELD_NUMBER = 3;
   private volatile Object autoJoinServerIp_ = "";
   public static final int LAUNCH_SOURCE_FIELD_NUMBER = 4;
   private int launchSource_ = 0;
   public static final int MODPACK_FIELD_NUMBER = 5;
   private PlayerModpack modpack_;
   private byte memoizedIsInitialized = -1;
   private static final LaunchGameRequest DEFAULT_INSTANCE = new LaunchGameRequest();
   private static final Parser<LaunchGameRequest> PARSER = new AbstractParser<LaunchGameRequest>() {
      public LaunchGameRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LaunchGameRequest.Builder var3 = LaunchGameRequest.newBuilder();

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

   private LaunchGameRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LaunchGameRequest() {
      this.version_ = "";
      this.module_ = "";
      this.autoJoinServerIp_ = "";
      this.launchSource_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LaunchGameRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_launch_v1_LaunchGameRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_launch_v1_LaunchGameRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LaunchGameRequest.class, LaunchGameRequest.Builder.class);
   }

   @Override
   public String getVersion() {
      Object var1 = this.version_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.version_ = var3;
      return var3;
   }

   @Override
   public ByteString getVersionBytes() {
      Object var1 = this.version_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.version_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getModule() {
      Object var1 = this.module_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.module_ = var3;
      return var3;
   }

   @Override
   public ByteString getModuleBytes() {
      Object var1 = this.module_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.module_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getAutoJoinServerIp() {
      Object var1 = this.autoJoinServerIp_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.autoJoinServerIp_ = var3;
      return var3;
   }

   @Override
   public ByteString getAutoJoinServerIpBytes() {
      Object var1 = this.autoJoinServerIp_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.autoJoinServerIp_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getLaunchSourceValue() {
      return this.launchSource_;
   }

   @Override
   public LaunchGameRequest.LaunchSource getLaunchSource() {
      LaunchGameRequest.LaunchSource var1 = LaunchGameRequest.LaunchSource.forNumber(this.launchSource_);
      return var1 == null ? LaunchGameRequest.LaunchSource.UNRECOGNIZED : var1;
   }

   @Override
   public boolean hasModpack() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public PlayerModpack getModpack() {
      return this.modpack_ == null ? PlayerModpack.getDefaultInstance() : this.modpack_;
   }

   @Override
   public PlayerModpackOrBuilder getModpackOrBuilder() {
      return this.modpack_ == null ? PlayerModpack.getDefaultInstance() : this.modpack_;
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
      if (!GeneratedMessageV3.isStringEmpty(this.version_)) {
         GeneratedMessageV3.writeString(var1, 1, this.version_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.module_)) {
         GeneratedMessageV3.writeString(var1, 2, this.module_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.autoJoinServerIp_)) {
         GeneratedMessageV3.writeString(var1, 3, this.autoJoinServerIp_);
      }

      if (this.launchSource_ != LaunchGameRequest.LaunchSource.LAUNCH_SOURCE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(4, this.launchSource_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(5, this.getModpack());
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
      if (!GeneratedMessageV3.isStringEmpty(this.version_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.version_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.module_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.module_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.autoJoinServerIp_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.autoJoinServerIp_);
      }

      if (this.launchSource_ != LaunchGameRequest.LaunchSource.LAUNCH_SOURCE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(4, this.launchSource_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(5, this.getModpack());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LaunchGameRequest)) {
         return super.equals(var1);
      } else {
         LaunchGameRequest var2 = (LaunchGameRequest)var1;
         if (!this.getVersion().equals(var2.getVersion())) {
            return false;
         } else if (!this.getModule().equals(var2.getModule())) {
            return false;
         } else if (!this.getAutoJoinServerIp().equals(var2.getAutoJoinServerIp())) {
            return false;
         } else if (this.launchSource_ != var2.launchSource_) {
            return false;
         } else if (this.hasModpack() != var2.hasModpack()) {
            return false;
         } else {
            return this.hasModpack() && !this.getModpack().equals(var2.getModpack()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getVersion().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getModule().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getAutoJoinServerIp().hashCode();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.launchSource_;
      if (this.hasModpack()) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getModpack().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LaunchGameRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LaunchGameRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LaunchGameRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LaunchGameRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LaunchGameRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LaunchGameRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LaunchGameRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LaunchGameRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LaunchGameRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LaunchGameRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LaunchGameRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LaunchGameRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LaunchGameRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LaunchGameRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LaunchGameRequest.Builder newBuilder(LaunchGameRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LaunchGameRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LaunchGameRequest.Builder() : new LaunchGameRequest.Builder().mergeFrom(this);
   }

   protected LaunchGameRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LaunchGameRequest.Builder(var1);
   }

   public static LaunchGameRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LaunchGameRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<LaunchGameRequest> getParserForType() {
      return PARSER;
   }

   public LaunchGameRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LaunchGameRequest.Builder> implements LaunchGameRequestOrBuilder {
      private int bitField0_;
      private Object version_ = "";
      private Object module_ = "";
      private Object autoJoinServerIp_ = "";
      private int launchSource_ = 0;
      private PlayerModpack modpack_;
      private SingleFieldBuilderV3<PlayerModpack, PlayerModpack.Builder, PlayerModpackOrBuilder> modpackBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_launch_v1_LaunchGameRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_launch_v1_LaunchGameRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LaunchGameRequest.class, LaunchGameRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (LaunchGameRequest.alwaysUseFieldBuilders) {
            this.getModpackFieldBuilder();
         }
      }

      public LaunchGameRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.version_ = "";
         this.module_ = "";
         this.autoJoinServerIp_ = "";
         this.launchSource_ = 0;
         this.modpack_ = null;
         if (this.modpackBuilder_ != null) {
            this.modpackBuilder_.dispose();
            this.modpackBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_launch_v1_LaunchGameRequest_descriptor;
      }

      public LaunchGameRequest getDefaultInstanceForType() {
         return LaunchGameRequest.getDefaultInstance();
      }

      public LaunchGameRequest build() {
         LaunchGameRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LaunchGameRequest buildPartial() {
         LaunchGameRequest var1 = new LaunchGameRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(LaunchGameRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.version_ = this.version_;
         }

         if ((var2 & 2) != 0) {
            var1.module_ = this.module_;
         }

         if ((var2 & 4) != 0) {
            var1.autoJoinServerIp_ = this.autoJoinServerIp_;
         }

         if ((var2 & 8) != 0) {
            var1.launchSource_ = this.launchSource_;
         }

         byte var3 = 0;
         if ((var2 & 16) != 0) {
            var1.modpack_ = this.modpackBuilder_ == null ? this.modpack_ : this.modpackBuilder_.build();
            var3 |= 1;
         }

         LaunchGameRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public LaunchGameRequest.Builder clone() {
         return (LaunchGameRequest.Builder)super.clone();
      }

      public LaunchGameRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LaunchGameRequest.Builder)super.setField(var1, var2);
      }

      public LaunchGameRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LaunchGameRequest.Builder)super.clearField(var1);
      }

      public LaunchGameRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LaunchGameRequest.Builder)super.clearOneof(var1);
      }

      public LaunchGameRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LaunchGameRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LaunchGameRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LaunchGameRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public LaunchGameRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof LaunchGameRequest) {
            return this.mergeFrom((LaunchGameRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LaunchGameRequest.Builder mergeFrom(LaunchGameRequest var1) {
         if (var1 == LaunchGameRequest.getDefaultInstance()) {
            return this;
         }

         if (!var1.getVersion().isEmpty()) {
            this.version_ = var1.version_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getModule().isEmpty()) {
            this.module_ = var1.module_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getAutoJoinServerIp().isEmpty()) {
            this.autoJoinServerIp_ = var1.autoJoinServerIp_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         if (var1.launchSource_ != 0) {
            this.setLaunchSourceValue(var1.getLaunchSourceValue());
         }

         if (var1.hasModpack()) {
            this.mergeModpack(var1.getModpack());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public LaunchGameRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.version_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.module_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.autoJoinServerIp_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.launchSource_ = var1.readEnum();
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     var1.readMessage(this.getModpackFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 16;
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
      public String getVersion() {
         Object var1 = this.version_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.version_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getVersionBytes() {
         Object var1 = this.version_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.version_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LaunchGameRequest.Builder setVersion(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.version_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LaunchGameRequest.Builder clearVersion() {
         this.version_ = LaunchGameRequest.getDefaultInstance().getVersion();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public LaunchGameRequest.Builder setVersionBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LaunchGameRequest.checkByteStringIsUtf8(var1);
         this.version_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public String getModule() {
         Object var1 = this.module_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.module_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getModuleBytes() {
         Object var1 = this.module_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.module_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LaunchGameRequest.Builder setModule(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.module_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public LaunchGameRequest.Builder clearModule() {
         this.module_ = LaunchGameRequest.getDefaultInstance().getModule();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public LaunchGameRequest.Builder setModuleBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LaunchGameRequest.checkByteStringIsUtf8(var1);
         this.module_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getAutoJoinServerIp() {
         Object var1 = this.autoJoinServerIp_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.autoJoinServerIp_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getAutoJoinServerIpBytes() {
         Object var1 = this.autoJoinServerIp_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.autoJoinServerIp_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LaunchGameRequest.Builder setAutoJoinServerIp(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.autoJoinServerIp_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public LaunchGameRequest.Builder clearAutoJoinServerIp() {
         this.autoJoinServerIp_ = LaunchGameRequest.getDefaultInstance().getAutoJoinServerIp();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public LaunchGameRequest.Builder setAutoJoinServerIpBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LaunchGameRequest.checkByteStringIsUtf8(var1);
         this.autoJoinServerIp_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public int getLaunchSourceValue() {
         return this.launchSource_;
      }

      public LaunchGameRequest.Builder setLaunchSourceValue(int var1) {
         this.launchSource_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public LaunchGameRequest.LaunchSource getLaunchSource() {
         LaunchGameRequest.LaunchSource var1 = LaunchGameRequest.LaunchSource.forNumber(this.launchSource_);
         return var1 == null ? LaunchGameRequest.LaunchSource.UNRECOGNIZED : var1;
      }

      public LaunchGameRequest.Builder setLaunchSource(LaunchGameRequest.LaunchSource var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 8;
         this.launchSource_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public LaunchGameRequest.Builder clearLaunchSource() {
         this.bitField0_ &= -9;
         this.launchSource_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasModpack() {
         return (this.bitField0_ & 16) != 0;
      }

      @Override
      public PlayerModpack getModpack() {
         if (this.modpackBuilder_ == null) {
            return this.modpack_ == null ? PlayerModpack.getDefaultInstance() : this.modpack_;
         } else {
            return this.modpackBuilder_.getMessage();
         }
      }

      public LaunchGameRequest.Builder setModpack(PlayerModpack var1) {
         if (this.modpackBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.modpack_ = var1;
         } else {
            this.modpackBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public LaunchGameRequest.Builder setModpack(PlayerModpack.Builder var1) {
         if (this.modpackBuilder_ == null) {
            this.modpack_ = var1.build();
         } else {
            this.modpackBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public LaunchGameRequest.Builder mergeModpack(PlayerModpack var1) {
         if (this.modpackBuilder_ == null) {
            if ((this.bitField0_ & 16) != 0 && this.modpack_ != null && this.modpack_ != PlayerModpack.getDefaultInstance()) {
               this.getModpackBuilder().mergeFrom(var1);
            } else {
               this.modpack_ = var1;
            }
         } else {
            this.modpackBuilder_.mergeFrom(var1);
         }

         if (this.modpack_ != null) {
            this.bitField0_ |= 16;
            this.onChanged();
         }

         return this;
      }

      public LaunchGameRequest.Builder clearModpack() {
         this.bitField0_ &= -17;
         this.modpack_ = null;
         if (this.modpackBuilder_ != null) {
            this.modpackBuilder_.dispose();
            this.modpackBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public PlayerModpack.Builder getModpackBuilder() {
         this.bitField0_ |= 16;
         this.onChanged();
         return this.getModpackFieldBuilder().getBuilder();
      }

      @Override
      public PlayerModpackOrBuilder getModpackOrBuilder() {
         if (this.modpackBuilder_ != null) {
            return this.modpackBuilder_.getMessageOrBuilder();
         } else {
            return this.modpack_ == null ? PlayerModpack.getDefaultInstance() : this.modpack_;
         }
      }

      private SingleFieldBuilderV3<PlayerModpack, PlayerModpack.Builder, PlayerModpackOrBuilder> getModpackFieldBuilder() {
         if (this.modpackBuilder_ == null) {
            this.modpackBuilder_ = new SingleFieldBuilderV3<>(this.getModpack(), this.getParentForChildren(), this.isClean());
            this.modpack_ = null;
         }

         return this.modpackBuilder_;
      }

      public final LaunchGameRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LaunchGameRequest.Builder)super.setUnknownFields(var1);
      }

      public final LaunchGameRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LaunchGameRequest.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum LaunchSource implements ProtocolMessageEnum {
      LAUNCH_SOURCE_UNSPECIFIED(0),
      LAUNCH_SOURCE_MAIN_MENU_SWITCHER(1),
      LAUNCH_SOURCE_SERVER_KICK_PROMPT(2),
      LAUNCH_SOURCE_SERVER_MODPACK_RECOMMENDATION(3),
      UNRECOGNIZED(-1);

      public static final int LAUNCH_SOURCE_UNSPECIFIED_VALUE = 0;
      public static final int LAUNCH_SOURCE_MAIN_MENU_SWITCHER_VALUE = 1;
      public static final int LAUNCH_SOURCE_SERVER_KICK_PROMPT_VALUE = 2;
      public static final int LAUNCH_SOURCE_SERVER_MODPACK_RECOMMENDATION_VALUE = 3;
      private static final Internal.EnumLiteMap<LaunchGameRequest.LaunchSource> internalValueMap = new Internal.EnumLiteMap<LaunchGameRequest.LaunchSource>() {
         public LaunchGameRequest.LaunchSource findValueByNumber(int var1) {
            return LaunchGameRequest.LaunchSource.forNumber(var1);
         }
      };
      private static final LaunchGameRequest.LaunchSource[] VALUES = values();
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
      public static LaunchGameRequest.LaunchSource valueOf(int var0) {
         return forNumber(var0);
      }

      public static LaunchGameRequest.LaunchSource forNumber(int var0) {
         switch (var0) {
            case 0:
               return LAUNCH_SOURCE_UNSPECIFIED;
            case 1:
               return LAUNCH_SOURCE_MAIN_MENU_SWITCHER;
            case 2:
               return LAUNCH_SOURCE_SERVER_KICK_PROMPT;
            case 3:
               return LAUNCH_SOURCE_SERVER_MODPACK_RECOMMENDATION;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<LaunchGameRequest.LaunchSource> internalGetValueMap() {
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
         return LaunchGameRequest.getDescriptor().getEnumTypes().get(0);
      }

      public static LaunchGameRequest.LaunchSource valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      LaunchSource(int var3) {
         this.value = var3;
      }
   }
}
