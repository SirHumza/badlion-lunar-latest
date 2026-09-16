package com.lunarclient.websocket.heartbeat.v1;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.Location;
import com.lunarclient.common.v1.LocationOrBuilder;
import com.lunarclient.common.v1.MinecraftVersion;
import com.lunarclient.common.v1.MinecraftVersionOrBuilder;
import com.lunarclient.common.v1.PlayerModpack;
import com.lunarclient.common.v1.PlayerModpackOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class RunningInstance extends GeneratedMessageV3 implements RunningInstanceOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int LAUNCH_ID_FIELD_NUMBER = 1;
   private volatile Object launchId_ = "";
   public static final int MINECRAFT_VERSION_FIELD_NUMBER = 2;
   private MinecraftVersion minecraftVersion_;
   public static final int MODULE_FIELD_NUMBER = 3;
   private volatile Object module_ = "";
   public static final int MODPACK_FIELD_NUMBER = 4;
   private PlayerModpack modpack_;
   public static final int LOCATION_FIELD_NUMBER = 5;
   private Location location_;
   public static final int LOADER_FIELD_NUMBER = 6;
   private RunningInstanceLoader loader_;
   private byte memoizedIsInitialized = -1;
   private static final RunningInstance DEFAULT_INSTANCE = new RunningInstance();
   private static final Parser<RunningInstance> PARSER = new AbstractParser<RunningInstance>() {
      public RunningInstance parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RunningInstance.Builder var3 = RunningInstance.newBuilder();

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

   private RunningInstance(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RunningInstance() {
      this.launchId_ = "";
      this.module_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RunningInstance();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_RunningInstance_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_RunningInstance_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RunningInstance.class, RunningInstance.Builder.class);
   }

   @Override
   public String getLaunchId() {
      Object var1 = this.launchId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.launchId_ = var3;
      return var3;
   }

   @Override
   public ByteString getLaunchIdBytes() {
      Object var1 = this.launchId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.launchId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasMinecraftVersion() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public MinecraftVersion getMinecraftVersion() {
      return this.minecraftVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.minecraftVersion_;
   }

   @Override
   public MinecraftVersionOrBuilder getMinecraftVersionOrBuilder() {
      return this.minecraftVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.minecraftVersion_;
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
   public boolean hasModpack() {
      return (this.bitField0_ & 2) != 0;
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
   public boolean hasLocation() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public Location getLocation() {
      return this.location_ == null ? Location.getDefaultInstance() : this.location_;
   }

   @Override
   public LocationOrBuilder getLocationOrBuilder() {
      return this.location_ == null ? Location.getDefaultInstance() : this.location_;
   }

   @Override
   public boolean hasLoader() {
      return (this.bitField0_ & 8) != 0;
   }

   @Override
   public RunningInstanceLoader getLoader() {
      return this.loader_ == null ? RunningInstanceLoader.getDefaultInstance() : this.loader_;
   }

   @Override
   public RunningInstanceLoaderOrBuilder getLoaderOrBuilder() {
      return this.loader_ == null ? RunningInstanceLoader.getDefaultInstance() : this.loader_;
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
      if (!GeneratedMessageV3.isStringEmpty(this.launchId_)) {
         GeneratedMessageV3.writeString(var1, 1, this.launchId_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getMinecraftVersion());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.module_)) {
         GeneratedMessageV3.writeString(var1, 3, this.module_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(4, this.getModpack());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(5, this.getLocation());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeMessage(6, this.getLoader());
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
      if (!GeneratedMessageV3.isStringEmpty(this.launchId_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.launchId_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getMinecraftVersion());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.module_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.module_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getModpack());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(5, this.getLocation());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1 += CodedOutputStream.computeMessageSize(6, this.getLoader());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RunningInstance)) {
         return super.equals(var1);
      } else {
         RunningInstance var2 = (RunningInstance)var1;
         if (!this.getLaunchId().equals(var2.getLaunchId())) {
            return false;
         } else if (this.hasMinecraftVersion() != var2.hasMinecraftVersion()) {
            return false;
         } else if (this.hasMinecraftVersion() && !this.getMinecraftVersion().equals(var2.getMinecraftVersion())) {
            return false;
         } else if (!this.getModule().equals(var2.getModule())) {
            return false;
         } else if (this.hasModpack() != var2.hasModpack()) {
            return false;
         } else if (this.hasModpack() && !this.getModpack().equals(var2.getModpack())) {
            return false;
         } else if (this.hasLocation() != var2.hasLocation()) {
            return false;
         } else if (this.hasLocation() && !this.getLocation().equals(var2.getLocation())) {
            return false;
         } else if (this.hasLoader() != var2.hasLoader()) {
            return false;
         } else {
            return this.hasLoader() && !this.getLoader().equals(var2.getLoader()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getLaunchId().hashCode();
      if (this.hasMinecraftVersion()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getMinecraftVersion().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getModule().hashCode();
      if (this.hasModpack()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getModpack().hashCode();
      }

      if (this.hasLocation()) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getLocation().hashCode();
      }

      if (this.hasLoader()) {
         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + this.getLoader().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RunningInstance parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RunningInstance parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RunningInstance parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RunningInstance parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RunningInstance parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RunningInstance parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RunningInstance parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RunningInstance parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RunningInstance parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RunningInstance parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RunningInstance parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RunningInstance parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RunningInstance.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RunningInstance.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RunningInstance.Builder newBuilder(RunningInstance var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RunningInstance.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RunningInstance.Builder() : new RunningInstance.Builder().mergeFrom(this);
   }

   protected RunningInstance.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RunningInstance.Builder(var1);
   }

   public static RunningInstance getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RunningInstance> parser() {
      return PARSER;
   }

   @Override
   public Parser<RunningInstance> getParserForType() {
      return PARSER;
   }

   public RunningInstance getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RunningInstance.Builder> implements RunningInstanceOrBuilder {
      private int bitField0_;
      private Object launchId_ = "";
      private MinecraftVersion minecraftVersion_;
      private SingleFieldBuilderV3<MinecraftVersion, MinecraftVersion.Builder, MinecraftVersionOrBuilder> minecraftVersionBuilder_;
      private Object module_ = "";
      private PlayerModpack modpack_;
      private SingleFieldBuilderV3<PlayerModpack, PlayerModpack.Builder, PlayerModpackOrBuilder> modpackBuilder_;
      private Location location_;
      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> locationBuilder_;
      private RunningInstanceLoader loader_;
      private SingleFieldBuilderV3<RunningInstanceLoader, RunningInstanceLoader.Builder, RunningInstanceLoaderOrBuilder> loaderBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_RunningInstance_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_RunningInstance_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RunningInstance.class, RunningInstance.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (RunningInstance.alwaysUseFieldBuilders) {
            this.getMinecraftVersionFieldBuilder();
            this.getModpackFieldBuilder();
            this.getLocationFieldBuilder();
            this.getLoaderFieldBuilder();
         }
      }

      public RunningInstance.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.launchId_ = "";
         this.minecraftVersion_ = null;
         if (this.minecraftVersionBuilder_ != null) {
            this.minecraftVersionBuilder_.dispose();
            this.minecraftVersionBuilder_ = null;
         }

         this.module_ = "";
         this.modpack_ = null;
         if (this.modpackBuilder_ != null) {
            this.modpackBuilder_.dispose();
            this.modpackBuilder_ = null;
         }

         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.loader_ = null;
         if (this.loaderBuilder_ != null) {
            this.loaderBuilder_.dispose();
            this.loaderBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_RunningInstance_descriptor;
      }

      public RunningInstance getDefaultInstanceForType() {
         return RunningInstance.getDefaultInstance();
      }

      public RunningInstance build() {
         RunningInstance var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RunningInstance buildPartial() {
         RunningInstance var1 = new RunningInstance(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RunningInstance var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.launchId_ = this.launchId_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.minecraftVersion_ = this.minecraftVersionBuilder_ == null ? this.minecraftVersion_ : this.minecraftVersionBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            var1.module_ = this.module_;
         }

         if ((var2 & 8) != 0) {
            var1.modpack_ = this.modpackBuilder_ == null ? this.modpack_ : this.modpackBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 16) != 0) {
            var1.location_ = this.locationBuilder_ == null ? this.location_ : this.locationBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 32) != 0) {
            var1.loader_ = this.loaderBuilder_ == null ? this.loader_ : this.loaderBuilder_.build();
            var3 |= 8;
         }

         RunningInstance var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public RunningInstance.Builder clone() {
         return (RunningInstance.Builder)super.clone();
      }

      public RunningInstance.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RunningInstance.Builder)super.setField(var1, var2);
      }

      public RunningInstance.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RunningInstance.Builder)super.clearField(var1);
      }

      public RunningInstance.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RunningInstance.Builder)super.clearOneof(var1);
      }

      public RunningInstance.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RunningInstance.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RunningInstance.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RunningInstance.Builder)super.addRepeatedField(var1, var2);
      }

      public RunningInstance.Builder mergeFrom(Message var1) {
         if (var1 instanceof RunningInstance) {
            return this.mergeFrom((RunningInstance)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RunningInstance.Builder mergeFrom(RunningInstance var1) {
         if (var1 == RunningInstance.getDefaultInstance()) {
            return this;
         }

         if (!var1.getLaunchId().isEmpty()) {
            this.launchId_ = var1.launchId_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.hasMinecraftVersion()) {
            this.mergeMinecraftVersion(var1.getMinecraftVersion());
         }

         if (!var1.getModule().isEmpty()) {
            this.module_ = var1.module_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         if (var1.hasModpack()) {
            this.mergeModpack(var1.getModpack());
         }

         if (var1.hasLocation()) {
            this.mergeLocation(var1.getLocation());
         }

         if (var1.hasLoader()) {
            this.mergeLoader(var1.getLoader());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RunningInstance.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.launchId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getMinecraftVersionFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.module_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     var1.readMessage(this.getModpackFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     var1.readMessage(this.getLocationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     var1.readMessage(this.getLoaderFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 32;
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
      public String getLaunchId() {
         Object var1 = this.launchId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.launchId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getLaunchIdBytes() {
         Object var1 = this.launchId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.launchId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public RunningInstance.Builder setLaunchId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.launchId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RunningInstance.Builder clearLaunchId() {
         this.launchId_ = RunningInstance.getDefaultInstance().getLaunchId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public RunningInstance.Builder setLaunchIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         RunningInstance.checkByteStringIsUtf8(var1);
         this.launchId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasMinecraftVersion() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public MinecraftVersion getMinecraftVersion() {
         if (this.minecraftVersionBuilder_ == null) {
            return this.minecraftVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.minecraftVersion_;
         } else {
            return this.minecraftVersionBuilder_.getMessage();
         }
      }

      public RunningInstance.Builder setMinecraftVersion(MinecraftVersion var1) {
         if (this.minecraftVersionBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.minecraftVersion_ = var1;
         } else {
            this.minecraftVersionBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public RunningInstance.Builder setMinecraftVersion(MinecraftVersion.Builder var1) {
         if (this.minecraftVersionBuilder_ == null) {
            this.minecraftVersion_ = var1.build();
         } else {
            this.minecraftVersionBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public RunningInstance.Builder mergeMinecraftVersion(MinecraftVersion var1) {
         if (this.minecraftVersionBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.minecraftVersion_ != null && this.minecraftVersion_ != MinecraftVersion.getDefaultInstance()) {
               this.getMinecraftVersionBuilder().mergeFrom(var1);
            } else {
               this.minecraftVersion_ = var1;
            }
         } else {
            this.minecraftVersionBuilder_.mergeFrom(var1);
         }

         if (this.minecraftVersion_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public RunningInstance.Builder clearMinecraftVersion() {
         this.bitField0_ &= -3;
         this.minecraftVersion_ = null;
         if (this.minecraftVersionBuilder_ != null) {
            this.minecraftVersionBuilder_.dispose();
            this.minecraftVersionBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public MinecraftVersion.Builder getMinecraftVersionBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getMinecraftVersionFieldBuilder().getBuilder();
      }

      @Override
      public MinecraftVersionOrBuilder getMinecraftVersionOrBuilder() {
         if (this.minecraftVersionBuilder_ != null) {
            return this.minecraftVersionBuilder_.getMessageOrBuilder();
         } else {
            return this.minecraftVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.minecraftVersion_;
         }
      }

      private SingleFieldBuilderV3<MinecraftVersion, MinecraftVersion.Builder, MinecraftVersionOrBuilder> getMinecraftVersionFieldBuilder() {
         if (this.minecraftVersionBuilder_ == null) {
            this.minecraftVersionBuilder_ = new SingleFieldBuilderV3<>(this.getMinecraftVersion(), this.getParentForChildren(), this.isClean());
            this.minecraftVersion_ = null;
         }

         return this.minecraftVersionBuilder_;
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

      public RunningInstance.Builder setModule(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.module_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public RunningInstance.Builder clearModule() {
         this.module_ = RunningInstance.getDefaultInstance().getModule();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public RunningInstance.Builder setModuleBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         RunningInstance.checkByteStringIsUtf8(var1);
         this.module_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasModpack() {
         return (this.bitField0_ & 8) != 0;
      }

      @Override
      public PlayerModpack getModpack() {
         if (this.modpackBuilder_ == null) {
            return this.modpack_ == null ? PlayerModpack.getDefaultInstance() : this.modpack_;
         } else {
            return this.modpackBuilder_.getMessage();
         }
      }

      public RunningInstance.Builder setModpack(PlayerModpack var1) {
         if (this.modpackBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.modpack_ = var1;
         } else {
            this.modpackBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public RunningInstance.Builder setModpack(PlayerModpack.Builder var1) {
         if (this.modpackBuilder_ == null) {
            this.modpack_ = var1.build();
         } else {
            this.modpackBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public RunningInstance.Builder mergeModpack(PlayerModpack var1) {
         if (this.modpackBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0 && this.modpack_ != null && this.modpack_ != PlayerModpack.getDefaultInstance()) {
               this.getModpackBuilder().mergeFrom(var1);
            } else {
               this.modpack_ = var1;
            }
         } else {
            this.modpackBuilder_.mergeFrom(var1);
         }

         if (this.modpack_ != null) {
            this.bitField0_ |= 8;
            this.onChanged();
         }

         return this;
      }

      public RunningInstance.Builder clearModpack() {
         this.bitField0_ &= -9;
         this.modpack_ = null;
         if (this.modpackBuilder_ != null) {
            this.modpackBuilder_.dispose();
            this.modpackBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public PlayerModpack.Builder getModpackBuilder() {
         this.bitField0_ |= 8;
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

      @Override
      public boolean hasLocation() {
         return (this.bitField0_ & 16) != 0;
      }

      @Override
      public Location getLocation() {
         if (this.locationBuilder_ == null) {
            return this.location_ == null ? Location.getDefaultInstance() : this.location_;
         } else {
            return this.locationBuilder_.getMessage();
         }
      }

      public RunningInstance.Builder setLocation(Location var1) {
         if (this.locationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
         } else {
            this.locationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public RunningInstance.Builder setLocation(Location.Builder var1) {
         if (this.locationBuilder_ == null) {
            this.location_ = var1.build();
         } else {
            this.locationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public RunningInstance.Builder mergeLocation(Location var1) {
         if (this.locationBuilder_ == null) {
            if ((this.bitField0_ & 16) != 0 && this.location_ != null && this.location_ != Location.getDefaultInstance()) {
               this.getLocationBuilder().mergeFrom(var1);
            } else {
               this.location_ = var1;
            }
         } else {
            this.locationBuilder_.mergeFrom(var1);
         }

         if (this.location_ != null) {
            this.bitField0_ |= 16;
            this.onChanged();
         }

         return this;
      }

      public RunningInstance.Builder clearLocation() {
         this.bitField0_ &= -17;
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Location.Builder getLocationBuilder() {
         this.bitField0_ |= 16;
         this.onChanged();
         return this.getLocationFieldBuilder().getBuilder();
      }

      @Override
      public LocationOrBuilder getLocationOrBuilder() {
         if (this.locationBuilder_ != null) {
            return this.locationBuilder_.getMessageOrBuilder();
         } else {
            return this.location_ == null ? Location.getDefaultInstance() : this.location_;
         }
      }

      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> getLocationFieldBuilder() {
         if (this.locationBuilder_ == null) {
            this.locationBuilder_ = new SingleFieldBuilderV3<>(this.getLocation(), this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         return this.locationBuilder_;
      }

      @Override
      public boolean hasLoader() {
         return (this.bitField0_ & 32) != 0;
      }

      @Override
      public RunningInstanceLoader getLoader() {
         if (this.loaderBuilder_ == null) {
            return this.loader_ == null ? RunningInstanceLoader.getDefaultInstance() : this.loader_;
         } else {
            return this.loaderBuilder_.getMessage();
         }
      }

      public RunningInstance.Builder setLoader(RunningInstanceLoader var1) {
         if (this.loaderBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.loader_ = var1;
         } else {
            this.loaderBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public RunningInstance.Builder setLoader(RunningInstanceLoader.Builder var1) {
         if (this.loaderBuilder_ == null) {
            this.loader_ = var1.build();
         } else {
            this.loaderBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public RunningInstance.Builder mergeLoader(RunningInstanceLoader var1) {
         if (this.loaderBuilder_ == null) {
            if ((this.bitField0_ & 32) != 0 && this.loader_ != null && this.loader_ != RunningInstanceLoader.getDefaultInstance()) {
               this.getLoaderBuilder().mergeFrom(var1);
            } else {
               this.loader_ = var1;
            }
         } else {
            this.loaderBuilder_.mergeFrom(var1);
         }

         if (this.loader_ != null) {
            this.bitField0_ |= 32;
            this.onChanged();
         }

         return this;
      }

      public RunningInstance.Builder clearLoader() {
         this.bitField0_ &= -33;
         this.loader_ = null;
         if (this.loaderBuilder_ != null) {
            this.loaderBuilder_.dispose();
            this.loaderBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public RunningInstanceLoader.Builder getLoaderBuilder() {
         this.bitField0_ |= 32;
         this.onChanged();
         return this.getLoaderFieldBuilder().getBuilder();
      }

      @Override
      public RunningInstanceLoaderOrBuilder getLoaderOrBuilder() {
         if (this.loaderBuilder_ != null) {
            return this.loaderBuilder_.getMessageOrBuilder();
         } else {
            return this.loader_ == null ? RunningInstanceLoader.getDefaultInstance() : this.loader_;
         }
      }

      private SingleFieldBuilderV3<RunningInstanceLoader, RunningInstanceLoader.Builder, RunningInstanceLoaderOrBuilder> getLoaderFieldBuilder() {
         if (this.loaderBuilder_ == null) {
            this.loaderBuilder_ = new SingleFieldBuilderV3<>(this.getLoader(), this.getParentForChildren(), this.isClean());
            this.loader_ = null;
         }

         return this.loaderBuilder_;
      }

      public final RunningInstance.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RunningInstance.Builder)super.setUnknownFields(var1);
      }

      public final RunningInstance.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RunningInstance.Builder)super.mergeUnknownFields(var1);
      }
   }
}
