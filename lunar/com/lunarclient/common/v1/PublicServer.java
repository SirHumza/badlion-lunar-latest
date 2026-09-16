package com.lunarclient.common.v1;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class PublicServer extends GeneratedMessageV3 implements PublicServerOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int SERVER_MAPPINGS_ID_FIELD_NUMBER = 1;
   private volatile Object serverMappingsId_ = "";
   public static final int NAME_FIELD_NUMBER = 2;
   private volatile Object name_ = "";
   public static final int LOGO_URL_FIELD_NUMBER = 8;
   private volatile Object logoUrl_ = "";
   public static final int PRIMARY_ADDRESS_FIELD_NUMBER = 3;
   private volatile Object primaryAddress_ = "";
   public static final int COLORS_FIELD_NUMBER = 4;
   private PublicServerColors colors_;
   public static final int VERSIONS_FIELD_NUMBER = 5;
   private PublicServerVersions versions_;
   public static final int SUPPORTS_DISCORD_RICH_PRESENCE_FIELD_NUMBER = 6;
   private boolean supportsDiscordRichPresence_ = false;
   public static final int RICH_STATUS_FIELD_NUMBER = 7;
   private ServerRichStatus richStatus_;
   private byte memoizedIsInitialized = -1;
   private static final PublicServer DEFAULT_INSTANCE = new PublicServer();
   private static final Parser<PublicServer> PARSER = new AbstractParser<PublicServer>() {
      public PublicServer parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PublicServer.Builder var3 = PublicServer.newBuilder();

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

   private PublicServer(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PublicServer() {
      this.serverMappingsId_ = "";
      this.name_ = "";
      this.logoUrl_ = "";
      this.primaryAddress_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PublicServer();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return LocationProto.internal_static_lunarclient_common_v1_PublicServer_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return LocationProto.internal_static_lunarclient_common_v1_PublicServer_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PublicServer.class, PublicServer.Builder.class);
   }

   @Override
   public String getServerMappingsId() {
      Object var1 = this.serverMappingsId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.serverMappingsId_ = var3;
      return var3;
   }

   @Override
   public ByteString getServerMappingsIdBytes() {
      Object var1 = this.serverMappingsId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.serverMappingsId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
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
   public String getLogoUrl() {
      Object var1 = this.logoUrl_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.logoUrl_ = var3;
      return var3;
   }

   @Override
   public ByteString getLogoUrlBytes() {
      Object var1 = this.logoUrl_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.logoUrl_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getPrimaryAddress() {
      Object var1 = this.primaryAddress_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.primaryAddress_ = var3;
      return var3;
   }

   @Override
   public ByteString getPrimaryAddressBytes() {
      Object var1 = this.primaryAddress_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.primaryAddress_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasColors() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public PublicServerColors getColors() {
      return this.colors_ == null ? PublicServerColors.getDefaultInstance() : this.colors_;
   }

   @Override
   public PublicServerColorsOrBuilder getColorsOrBuilder() {
      return this.colors_ == null ? PublicServerColors.getDefaultInstance() : this.colors_;
   }

   @Override
   public boolean hasVersions() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public PublicServerVersions getVersions() {
      return this.versions_ == null ? PublicServerVersions.getDefaultInstance() : this.versions_;
   }

   @Override
   public PublicServerVersionsOrBuilder getVersionsOrBuilder() {
      return this.versions_ == null ? PublicServerVersions.getDefaultInstance() : this.versions_;
   }

   @Deprecated
   @Override
   public boolean getSupportsDiscordRichPresence() {
      return this.supportsDiscordRichPresence_;
   }

   @Override
   public boolean hasRichStatus() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public ServerRichStatus getRichStatus() {
      return this.richStatus_ == null ? ServerRichStatus.getDefaultInstance() : this.richStatus_;
   }

   @Override
   public ServerRichStatusOrBuilder getRichStatusOrBuilder() {
      return this.richStatus_ == null ? ServerRichStatus.getDefaultInstance() : this.richStatus_;
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
      if (!GeneratedMessageV3.isStringEmpty(this.serverMappingsId_)) {
         GeneratedMessageV3.writeString(var1, 1, this.serverMappingsId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         GeneratedMessageV3.writeString(var1, 2, this.name_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.primaryAddress_)) {
         GeneratedMessageV3.writeString(var1, 3, this.primaryAddress_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(4, this.getColors());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(5, this.getVersions());
      }

      if (this.supportsDiscordRichPresence_) {
         var1.writeBool(6, this.supportsDiscordRichPresence_);
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(7, this.getRichStatus());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.logoUrl_)) {
         GeneratedMessageV3.writeString(var1, 8, this.logoUrl_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.serverMappingsId_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.serverMappingsId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.name_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.primaryAddress_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.primaryAddress_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getColors());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(5, this.getVersions());
      }

      if (this.supportsDiscordRichPresence_) {
         var1 += CodedOutputStream.computeBoolSize(6, this.supportsDiscordRichPresence_);
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(7, this.getRichStatus());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.logoUrl_)) {
         var1 += GeneratedMessageV3.computeStringSize(8, this.logoUrl_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PublicServer)) {
         return super.equals(var1);
      } else {
         PublicServer var2 = (PublicServer)var1;
         if (!this.getServerMappingsId().equals(var2.getServerMappingsId())) {
            return false;
         } else if (!this.getName().equals(var2.getName())) {
            return false;
         } else if (!this.getLogoUrl().equals(var2.getLogoUrl())) {
            return false;
         } else if (!this.getPrimaryAddress().equals(var2.getPrimaryAddress())) {
            return false;
         } else if (this.hasColors() != var2.hasColors()) {
            return false;
         } else if (this.hasColors() && !this.getColors().equals(var2.getColors())) {
            return false;
         } else if (this.hasVersions() != var2.hasVersions()) {
            return false;
         } else if (this.hasVersions() && !this.getVersions().equals(var2.getVersions())) {
            return false;
         } else if (this.getSupportsDiscordRichPresence() != var2.getSupportsDiscordRichPresence()) {
            return false;
         } else if (this.hasRichStatus() != var2.hasRichStatus()) {
            return false;
         } else {
            return this.hasRichStatus() && !this.getRichStatus().equals(var2.getRichStatus()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getServerMappingsId().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getName().hashCode();
      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + this.getLogoUrl().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getPrimaryAddress().hashCode();
      if (this.hasColors()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getColors().hashCode();
      }

      if (this.hasVersions()) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getVersions().hashCode();
      }

      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + Internal.hashBoolean(this.getSupportsDiscordRichPresence());
      if (this.hasRichStatus()) {
         var1 = 37 * var1 + 7;
         var1 = 53 * var1 + this.getRichStatus().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PublicServer parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PublicServer parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PublicServer parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PublicServer parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PublicServer parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PublicServer parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PublicServer parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PublicServer parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PublicServer parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PublicServer parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PublicServer parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PublicServer parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PublicServer.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PublicServer.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PublicServer.Builder newBuilder(PublicServer var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PublicServer.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PublicServer.Builder() : new PublicServer.Builder().mergeFrom(this);
   }

   protected PublicServer.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PublicServer.Builder(var1);
   }

   public static PublicServer getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PublicServer> parser() {
      return PARSER;
   }

   @Override
   public Parser<PublicServer> getParserForType() {
      return PARSER;
   }

   public PublicServer getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PublicServer.Builder> implements PublicServerOrBuilder {
      private int bitField0_;
      private Object serverMappingsId_ = "";
      private Object name_ = "";
      private Object logoUrl_ = "";
      private Object primaryAddress_ = "";
      private PublicServerColors colors_;
      private SingleFieldBuilderV3<PublicServerColors, PublicServerColors.Builder, PublicServerColorsOrBuilder> colorsBuilder_;
      private PublicServerVersions versions_;
      private SingleFieldBuilderV3<PublicServerVersions, PublicServerVersions.Builder, PublicServerVersionsOrBuilder> versionsBuilder_;
      private boolean supportsDiscordRichPresence_;
      private ServerRichStatus richStatus_;
      private SingleFieldBuilderV3<ServerRichStatus, ServerRichStatus.Builder, ServerRichStatusOrBuilder> richStatusBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return LocationProto.internal_static_lunarclient_common_v1_PublicServer_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LocationProto.internal_static_lunarclient_common_v1_PublicServer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PublicServer.class, PublicServer.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (PublicServer.alwaysUseFieldBuilders) {
            this.getColorsFieldBuilder();
            this.getVersionsFieldBuilder();
            this.getRichStatusFieldBuilder();
         }
      }

      public PublicServer.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.serverMappingsId_ = "";
         this.name_ = "";
         this.logoUrl_ = "";
         this.primaryAddress_ = "";
         this.colors_ = null;
         if (this.colorsBuilder_ != null) {
            this.colorsBuilder_.dispose();
            this.colorsBuilder_ = null;
         }

         this.versions_ = null;
         if (this.versionsBuilder_ != null) {
            this.versionsBuilder_.dispose();
            this.versionsBuilder_ = null;
         }

         this.supportsDiscordRichPresence_ = false;
         this.richStatus_ = null;
         if (this.richStatusBuilder_ != null) {
            this.richStatusBuilder_.dispose();
            this.richStatusBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return LocationProto.internal_static_lunarclient_common_v1_PublicServer_descriptor;
      }

      public PublicServer getDefaultInstanceForType() {
         return PublicServer.getDefaultInstance();
      }

      public PublicServer build() {
         PublicServer var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PublicServer buildPartial() {
         PublicServer var1 = new PublicServer(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(PublicServer var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.serverMappingsId_ = this.serverMappingsId_;
         }

         if ((var2 & 2) != 0) {
            var1.name_ = this.name_;
         }

         if ((var2 & 4) != 0) {
            var1.logoUrl_ = this.logoUrl_;
         }

         if ((var2 & 8) != 0) {
            var1.primaryAddress_ = this.primaryAddress_;
         }

         byte var3 = 0;
         if ((var2 & 16) != 0) {
            var1.colors_ = this.colorsBuilder_ == null ? this.colors_ : this.colorsBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 32) != 0) {
            var1.versions_ = this.versionsBuilder_ == null ? this.versions_ : this.versionsBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 64) != 0) {
            var1.supportsDiscordRichPresence_ = this.supportsDiscordRichPresence_;
         }

         if ((var2 & 128) != 0) {
            var1.richStatus_ = this.richStatusBuilder_ == null ? this.richStatus_ : this.richStatusBuilder_.build();
            var3 |= 4;
         }

         PublicServer var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public PublicServer.Builder clone() {
         return (PublicServer.Builder)super.clone();
      }

      public PublicServer.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PublicServer.Builder)super.setField(var1, var2);
      }

      public PublicServer.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PublicServer.Builder)super.clearField(var1);
      }

      public PublicServer.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PublicServer.Builder)super.clearOneof(var1);
      }

      public PublicServer.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PublicServer.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PublicServer.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PublicServer.Builder)super.addRepeatedField(var1, var2);
      }

      public PublicServer.Builder mergeFrom(Message var1) {
         if (var1 instanceof PublicServer) {
            return this.mergeFrom((PublicServer)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PublicServer.Builder mergeFrom(PublicServer var1) {
         if (var1 == PublicServer.getDefaultInstance()) {
            return this;
         }

         if (!var1.getServerMappingsId().isEmpty()) {
            this.serverMappingsId_ = var1.serverMappingsId_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getName().isEmpty()) {
            this.name_ = var1.name_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getLogoUrl().isEmpty()) {
            this.logoUrl_ = var1.logoUrl_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         if (!var1.getPrimaryAddress().isEmpty()) {
            this.primaryAddress_ = var1.primaryAddress_;
            this.bitField0_ |= 8;
            this.onChanged();
         }

         if (var1.hasColors()) {
            this.mergeColors(var1.getColors());
         }

         if (var1.hasVersions()) {
            this.mergeVersions(var1.getVersions());
         }

         if (var1.getSupportsDiscordRichPresence()) {
            this.setSupportsDiscordRichPresence(var1.getSupportsDiscordRichPresence());
         }

         if (var1.hasRichStatus()) {
            this.mergeRichStatus(var1.getRichStatus());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public PublicServer.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.serverMappingsId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.name_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.primaryAddress_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 8;
                     break;
                  case 34:
                     var1.readMessage(this.getColorsFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 16;
                     break;
                  case 42:
                     var1.readMessage(this.getVersionsFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 32;
                     break;
                  case 48:
                     this.supportsDiscordRichPresence_ = var1.readBool();
                     this.bitField0_ |= 64;
                     break;
                  case 58:
                     var1.readMessage(this.getRichStatusFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 128;
                     break;
                  case 66:
                     this.logoUrl_ = var1.readStringRequireUtf8();
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
      public String getServerMappingsId() {
         Object var1 = this.serverMappingsId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.serverMappingsId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getServerMappingsIdBytes() {
         Object var1 = this.serverMappingsId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.serverMappingsId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public PublicServer.Builder setServerMappingsId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.serverMappingsId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PublicServer.Builder clearServerMappingsId() {
         this.serverMappingsId_ = PublicServer.getDefaultInstance().getServerMappingsId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public PublicServer.Builder setServerMappingsIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         PublicServer.checkByteStringIsUtf8(var1);
         this.serverMappingsId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
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

      public PublicServer.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PublicServer.Builder clearName() {
         this.name_ = PublicServer.getDefaultInstance().getName();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public PublicServer.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         PublicServer.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getLogoUrl() {
         Object var1 = this.logoUrl_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.logoUrl_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getLogoUrlBytes() {
         Object var1 = this.logoUrl_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.logoUrl_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public PublicServer.Builder setLogoUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.logoUrl_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public PublicServer.Builder clearLogoUrl() {
         this.logoUrl_ = PublicServer.getDefaultInstance().getLogoUrl();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public PublicServer.Builder setLogoUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         PublicServer.checkByteStringIsUtf8(var1);
         this.logoUrl_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public String getPrimaryAddress() {
         Object var1 = this.primaryAddress_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.primaryAddress_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getPrimaryAddressBytes() {
         Object var1 = this.primaryAddress_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.primaryAddress_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public PublicServer.Builder setPrimaryAddress(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.primaryAddress_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public PublicServer.Builder clearPrimaryAddress() {
         this.primaryAddress_ = PublicServer.getDefaultInstance().getPrimaryAddress();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      public PublicServer.Builder setPrimaryAddressBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         PublicServer.checkByteStringIsUtf8(var1);
         this.primaryAddress_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasColors() {
         return (this.bitField0_ & 16) != 0;
      }

      @Override
      public PublicServerColors getColors() {
         if (this.colorsBuilder_ == null) {
            return this.colors_ == null ? PublicServerColors.getDefaultInstance() : this.colors_;
         } else {
            return this.colorsBuilder_.getMessage();
         }
      }

      public PublicServer.Builder setColors(PublicServerColors var1) {
         if (this.colorsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.colors_ = var1;
         } else {
            this.colorsBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public PublicServer.Builder setColors(PublicServerColors.Builder var1) {
         if (this.colorsBuilder_ == null) {
            this.colors_ = var1.build();
         } else {
            this.colorsBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public PublicServer.Builder mergeColors(PublicServerColors var1) {
         if (this.colorsBuilder_ == null) {
            if ((this.bitField0_ & 16) != 0 && this.colors_ != null && this.colors_ != PublicServerColors.getDefaultInstance()) {
               this.getColorsBuilder().mergeFrom(var1);
            } else {
               this.colors_ = var1;
            }
         } else {
            this.colorsBuilder_.mergeFrom(var1);
         }

         if (this.colors_ != null) {
            this.bitField0_ |= 16;
            this.onChanged();
         }

         return this;
      }

      public PublicServer.Builder clearColors() {
         this.bitField0_ &= -17;
         this.colors_ = null;
         if (this.colorsBuilder_ != null) {
            this.colorsBuilder_.dispose();
            this.colorsBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public PublicServerColors.Builder getColorsBuilder() {
         this.bitField0_ |= 16;
         this.onChanged();
         return this.getColorsFieldBuilder().getBuilder();
      }

      @Override
      public PublicServerColorsOrBuilder getColorsOrBuilder() {
         if (this.colorsBuilder_ != null) {
            return this.colorsBuilder_.getMessageOrBuilder();
         } else {
            return this.colors_ == null ? PublicServerColors.getDefaultInstance() : this.colors_;
         }
      }

      private SingleFieldBuilderV3<PublicServerColors, PublicServerColors.Builder, PublicServerColorsOrBuilder> getColorsFieldBuilder() {
         if (this.colorsBuilder_ == null) {
            this.colorsBuilder_ = new SingleFieldBuilderV3<>(this.getColors(), this.getParentForChildren(), this.isClean());
            this.colors_ = null;
         }

         return this.colorsBuilder_;
      }

      @Override
      public boolean hasVersions() {
         return (this.bitField0_ & 32) != 0;
      }

      @Override
      public PublicServerVersions getVersions() {
         if (this.versionsBuilder_ == null) {
            return this.versions_ == null ? PublicServerVersions.getDefaultInstance() : this.versions_;
         } else {
            return this.versionsBuilder_.getMessage();
         }
      }

      public PublicServer.Builder setVersions(PublicServerVersions var1) {
         if (this.versionsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.versions_ = var1;
         } else {
            this.versionsBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public PublicServer.Builder setVersions(PublicServerVersions.Builder var1) {
         if (this.versionsBuilder_ == null) {
            this.versions_ = var1.build();
         } else {
            this.versionsBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public PublicServer.Builder mergeVersions(PublicServerVersions var1) {
         if (this.versionsBuilder_ == null) {
            if ((this.bitField0_ & 32) != 0 && this.versions_ != null && this.versions_ != PublicServerVersions.getDefaultInstance()) {
               this.getVersionsBuilder().mergeFrom(var1);
            } else {
               this.versions_ = var1;
            }
         } else {
            this.versionsBuilder_.mergeFrom(var1);
         }

         if (this.versions_ != null) {
            this.bitField0_ |= 32;
            this.onChanged();
         }

         return this;
      }

      public PublicServer.Builder clearVersions() {
         this.bitField0_ &= -33;
         this.versions_ = null;
         if (this.versionsBuilder_ != null) {
            this.versionsBuilder_.dispose();
            this.versionsBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public PublicServerVersions.Builder getVersionsBuilder() {
         this.bitField0_ |= 32;
         this.onChanged();
         return this.getVersionsFieldBuilder().getBuilder();
      }

      @Override
      public PublicServerVersionsOrBuilder getVersionsOrBuilder() {
         if (this.versionsBuilder_ != null) {
            return this.versionsBuilder_.getMessageOrBuilder();
         } else {
            return this.versions_ == null ? PublicServerVersions.getDefaultInstance() : this.versions_;
         }
      }

      private SingleFieldBuilderV3<PublicServerVersions, PublicServerVersions.Builder, PublicServerVersionsOrBuilder> getVersionsFieldBuilder() {
         if (this.versionsBuilder_ == null) {
            this.versionsBuilder_ = new SingleFieldBuilderV3<>(this.getVersions(), this.getParentForChildren(), this.isClean());
            this.versions_ = null;
         }

         return this.versionsBuilder_;
      }

      @Deprecated
      @Override
      public boolean getSupportsDiscordRichPresence() {
         return this.supportsDiscordRichPresence_;
      }

      @Deprecated
      public PublicServer.Builder setSupportsDiscordRichPresence(boolean var1) {
         this.supportsDiscordRichPresence_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      @Deprecated
      public PublicServer.Builder clearSupportsDiscordRichPresence() {
         this.bitField0_ &= -65;
         this.supportsDiscordRichPresence_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasRichStatus() {
         return (this.bitField0_ & 128) != 0;
      }

      @Override
      public ServerRichStatus getRichStatus() {
         if (this.richStatusBuilder_ == null) {
            return this.richStatus_ == null ? ServerRichStatus.getDefaultInstance() : this.richStatus_;
         } else {
            return this.richStatusBuilder_.getMessage();
         }
      }

      public PublicServer.Builder setRichStatus(ServerRichStatus var1) {
         if (this.richStatusBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.richStatus_ = var1;
         } else {
            this.richStatusBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public PublicServer.Builder setRichStatus(ServerRichStatus.Builder var1) {
         if (this.richStatusBuilder_ == null) {
            this.richStatus_ = var1.build();
         } else {
            this.richStatusBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public PublicServer.Builder mergeRichStatus(ServerRichStatus var1) {
         if (this.richStatusBuilder_ == null) {
            if ((this.bitField0_ & 128) != 0 && this.richStatus_ != null && this.richStatus_ != ServerRichStatus.getDefaultInstance()) {
               this.getRichStatusBuilder().mergeFrom(var1);
            } else {
               this.richStatus_ = var1;
            }
         } else {
            this.richStatusBuilder_.mergeFrom(var1);
         }

         if (this.richStatus_ != null) {
            this.bitField0_ |= 128;
            this.onChanged();
         }

         return this;
      }

      public PublicServer.Builder clearRichStatus() {
         this.bitField0_ &= -129;
         this.richStatus_ = null;
         if (this.richStatusBuilder_ != null) {
            this.richStatusBuilder_.dispose();
            this.richStatusBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ServerRichStatus.Builder getRichStatusBuilder() {
         this.bitField0_ |= 128;
         this.onChanged();
         return this.getRichStatusFieldBuilder().getBuilder();
      }

      @Override
      public ServerRichStatusOrBuilder getRichStatusOrBuilder() {
         if (this.richStatusBuilder_ != null) {
            return this.richStatusBuilder_.getMessageOrBuilder();
         } else {
            return this.richStatus_ == null ? ServerRichStatus.getDefaultInstance() : this.richStatus_;
         }
      }

      private SingleFieldBuilderV3<ServerRichStatus, ServerRichStatus.Builder, ServerRichStatusOrBuilder> getRichStatusFieldBuilder() {
         if (this.richStatusBuilder_ == null) {
            this.richStatusBuilder_ = new SingleFieldBuilderV3<>(this.getRichStatus(), this.getParentForChildren(), this.isClean());
            this.richStatus_ = null;
         }

         return this.richStatusBuilder_;
      }

      public final PublicServer.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PublicServer.Builder)super.setUnknownFields(var1);
      }

      public final PublicServer.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PublicServer.Builder)super.mergeUnknownFields(var1);
      }
   }
}
