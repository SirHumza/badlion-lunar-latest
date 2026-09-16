package com.lunarclient.websocket.server.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.MinecraftVersion;
import com.lunarclient.common.v1.MinecraftVersionOrBuilder;
import com.lunarclient.common.v1.PlayerModpack;
import com.lunarclient.common.v1.PlayerModpackOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ServerRecommendations extends GeneratedMessageV3 implements ServerRecommendationsOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int MODPACK_FIELD_NUMBER = 1;
   private PlayerModpack modpack_;
   public static final int IP_ADDRESSES_FIELD_NUMBER = 2;
   private LazyStringArrayList ipAddresses_ = LazyStringArrayList.emptyList();
   public static final int VERSIONS_FIELD_NUMBER = 3;
   private List<MinecraftVersion> versions_;
   private byte memoizedIsInitialized = -1;
   private static final ServerRecommendations DEFAULT_INSTANCE = new ServerRecommendations();
   private static final Parser<ServerRecommendations> PARSER = new AbstractParser<ServerRecommendations>() {
      public ServerRecommendations parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ServerRecommendations.Builder var3 = ServerRecommendations.newBuilder();

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

   private ServerRecommendations(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ServerRecommendations() {
      this.ipAddresses_ = LazyStringArrayList.emptyList();
      this.versions_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ServerRecommendations();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_server_v1_ServerRecommendations_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_server_v1_ServerRecommendations_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ServerRecommendations.class, ServerRecommendations.Builder.class);
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

   public ProtocolStringList getIpAddressesList() {
      return this.ipAddresses_;
   }

   @Override
   public int getIpAddressesCount() {
      return this.ipAddresses_.size();
   }

   @Override
   public String getIpAddresses(int var1) {
      return this.ipAddresses_.get(var1);
   }

   @Override
   public ByteString getIpAddressesBytes(int var1) {
      return this.ipAddresses_.getByteString(var1);
   }

   @Override
   public List<MinecraftVersion> getVersionsList() {
      return this.versions_;
   }

   @Override
   public List<? extends MinecraftVersionOrBuilder> getVersionsOrBuilderList() {
      return this.versions_;
   }

   @Override
   public int getVersionsCount() {
      return this.versions_.size();
   }

   @Override
   public MinecraftVersion getVersions(int var1) {
      return this.versions_.get(var1);
   }

   @Override
   public MinecraftVersionOrBuilder getVersionsOrBuilder(int var1) {
      return this.versions_.get(var1);
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
         var1.writeMessage(1, this.getModpack());
      }

      for (int var2 = 0; var2 < this.ipAddresses_.size(); var2++) {
         GeneratedMessageV3.writeString(var1, 2, this.ipAddresses_.getRaw(var2));
      }

      for (int var3 = 0; var3 < this.versions_.size(); var3++) {
         var1.writeMessage(3, this.versions_.get(var3));
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getModpack());
      }

      int var2 = 0;

      for (int var3 = 0; var3 < this.ipAddresses_.size(); var3++) {
         var2 += computeStringSizeNoTag(this.ipAddresses_.getRaw(var3));
      }

      var1 += var2;
      var1 += 1 * this.getIpAddressesList().size();

      for (int var8 = 0; var8 < this.versions_.size(); var8++) {
         var1 += CodedOutputStream.computeMessageSize(3, this.versions_.get(var8));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ServerRecommendations)) {
         return super.equals(var1);
      } else {
         ServerRecommendations var2 = (ServerRecommendations)var1;
         if (this.hasModpack() != var2.hasModpack()) {
            return false;
         } else if (this.hasModpack() && !this.getModpack().equals(var2.getModpack())) {
            return false;
         } else if (!this.getIpAddressesList().equals(var2.getIpAddressesList())) {
            return false;
         } else {
            return !this.getVersionsList().equals(var2.getVersionsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasModpack()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getModpack().hashCode();
      }

      if (this.getIpAddressesCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getIpAddressesList().hashCode();
      }

      if (this.getVersionsCount() > 0) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getVersionsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ServerRecommendations parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerRecommendations parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerRecommendations parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerRecommendations parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerRecommendations parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerRecommendations parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerRecommendations parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ServerRecommendations parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ServerRecommendations parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ServerRecommendations parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ServerRecommendations parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ServerRecommendations parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ServerRecommendations.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ServerRecommendations.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ServerRecommendations.Builder newBuilder(ServerRecommendations var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ServerRecommendations.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ServerRecommendations.Builder() : new ServerRecommendations.Builder().mergeFrom(this);
   }

   protected ServerRecommendations.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ServerRecommendations.Builder(var1);
   }

   public static ServerRecommendations getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ServerRecommendations> parser() {
      return PARSER;
   }

   @Override
   public Parser<ServerRecommendations> getParserForType() {
      return PARSER;
   }

   public ServerRecommendations getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ServerRecommendations.Builder> implements ServerRecommendationsOrBuilder {
      private int bitField0_;
      private PlayerModpack modpack_;
      private SingleFieldBuilderV3<PlayerModpack, PlayerModpack.Builder, PlayerModpackOrBuilder> modpackBuilder_;
      private LazyStringArrayList ipAddresses_ = LazyStringArrayList.emptyList();
      private List<MinecraftVersion> versions_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<MinecraftVersion, MinecraftVersion.Builder, MinecraftVersionOrBuilder> versionsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_server_v1_ServerRecommendations_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_server_v1_ServerRecommendations_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ServerRecommendations.class, ServerRecommendations.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ServerRecommendations.alwaysUseFieldBuilders) {
            this.getModpackFieldBuilder();
            this.getVersionsFieldBuilder();
         }
      }

      public ServerRecommendations.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.modpack_ = null;
         if (this.modpackBuilder_ != null) {
            this.modpackBuilder_.dispose();
            this.modpackBuilder_ = null;
         }

         this.ipAddresses_ = LazyStringArrayList.emptyList();
         if (this.versionsBuilder_ == null) {
            this.versions_ = Collections.emptyList();
         } else {
            this.versions_ = null;
            this.versionsBuilder_.clear();
         }

         this.bitField0_ &= -5;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_server_v1_ServerRecommendations_descriptor;
      }

      public ServerRecommendations getDefaultInstanceForType() {
         return ServerRecommendations.getDefaultInstance();
      }

      public ServerRecommendations build() {
         ServerRecommendations var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ServerRecommendations buildPartial() {
         ServerRecommendations var1 = new ServerRecommendations(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(ServerRecommendations var1) {
         if (this.versionsBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0) {
               this.versions_ = Collections.unmodifiableList(this.versions_);
               this.bitField0_ &= -5;
            }

            var1.versions_ = this.versions_;
         } else {
            var1.versions_ = this.versionsBuilder_.build();
         }
      }

      private void buildPartial0(ServerRecommendations var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.modpack_ = this.modpackBuilder_ == null ? this.modpack_ : this.modpackBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            this.ipAddresses_.makeImmutable();
            var1.ipAddresses_ = this.ipAddresses_;
         }

         ServerRecommendations var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ServerRecommendations.Builder clone() {
         return (ServerRecommendations.Builder)super.clone();
      }

      public ServerRecommendations.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ServerRecommendations.Builder)super.setField(var1, var2);
      }

      public ServerRecommendations.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ServerRecommendations.Builder)super.clearField(var1);
      }

      public ServerRecommendations.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ServerRecommendations.Builder)super.clearOneof(var1);
      }

      public ServerRecommendations.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ServerRecommendations.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ServerRecommendations.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ServerRecommendations.Builder)super.addRepeatedField(var1, var2);
      }

      public ServerRecommendations.Builder mergeFrom(Message var1) {
         if (var1 instanceof ServerRecommendations) {
            return this.mergeFrom((ServerRecommendations)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ServerRecommendations.Builder mergeFrom(ServerRecommendations var1) {
         if (var1 == ServerRecommendations.getDefaultInstance()) {
            return this;
         }

         if (var1.hasModpack()) {
            this.mergeModpack(var1.getModpack());
         }

         if (!var1.ipAddresses_.isEmpty()) {
            if (this.ipAddresses_.isEmpty()) {
               this.ipAddresses_ = var1.ipAddresses_;
               this.bitField0_ |= 2;
            } else {
               this.ensureIpAddressesIsMutable();
               this.ipAddresses_.addAll(var1.ipAddresses_);
            }

            this.onChanged();
         }

         if (this.versionsBuilder_ == null) {
            if (!var1.versions_.isEmpty()) {
               if (this.versions_.isEmpty()) {
                  this.versions_ = var1.versions_;
                  this.bitField0_ &= -5;
               } else {
                  this.ensureVersionsIsMutable();
                  this.versions_.addAll(var1.versions_);
               }

               this.onChanged();
            }
         } else if (!var1.versions_.isEmpty()) {
            if (this.versionsBuilder_.isEmpty()) {
               this.versionsBuilder_.dispose();
               this.versionsBuilder_ = null;
               this.versions_ = var1.versions_;
               this.bitField0_ &= -5;
               this.versionsBuilder_ = ServerRecommendations.alwaysUseFieldBuilders ? this.getVersionsFieldBuilder() : null;
            } else {
               this.versionsBuilder_.addAllMessages(var1.versions_);
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

      public ServerRecommendations.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getModpackFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     String var11 = var1.readStringRequireUtf8();
                     this.ensureIpAddressesIsMutable();
                     this.ipAddresses_.add(var11);
                     break;
                  case 26:
                     MinecraftVersion var5 = var1.readMessage(MinecraftVersion.parser(), var2);
                     if (this.versionsBuilder_ == null) {
                        this.ensureVersionsIsMutable();
                        this.versions_.add(var5);
                     } else {
                        this.versionsBuilder_.addMessage(var5);
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
      public boolean hasModpack() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public PlayerModpack getModpack() {
         if (this.modpackBuilder_ == null) {
            return this.modpack_ == null ? PlayerModpack.getDefaultInstance() : this.modpack_;
         } else {
            return this.modpackBuilder_.getMessage();
         }
      }

      public ServerRecommendations.Builder setModpack(PlayerModpack var1) {
         if (this.modpackBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.modpack_ = var1;
         } else {
            this.modpackBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ServerRecommendations.Builder setModpack(PlayerModpack.Builder var1) {
         if (this.modpackBuilder_ == null) {
            this.modpack_ = var1.build();
         } else {
            this.modpackBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ServerRecommendations.Builder mergeModpack(PlayerModpack var1) {
         if (this.modpackBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.modpack_ != null && this.modpack_ != PlayerModpack.getDefaultInstance()) {
               this.getModpackBuilder().mergeFrom(var1);
            } else {
               this.modpack_ = var1;
            }
         } else {
            this.modpackBuilder_.mergeFrom(var1);
         }

         if (this.modpack_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public ServerRecommendations.Builder clearModpack() {
         this.bitField0_ &= -2;
         this.modpack_ = null;
         if (this.modpackBuilder_ != null) {
            this.modpackBuilder_.dispose();
            this.modpackBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public PlayerModpack.Builder getModpackBuilder() {
         this.bitField0_ |= 1;
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

      private void ensureIpAddressesIsMutable() {
         if (!this.ipAddresses_.isModifiable()) {
            this.ipAddresses_ = new LazyStringArrayList(this.ipAddresses_);
         }

         this.bitField0_ |= 2;
      }

      public ProtocolStringList getIpAddressesList() {
         this.ipAddresses_.makeImmutable();
         return this.ipAddresses_;
      }

      @Override
      public int getIpAddressesCount() {
         return this.ipAddresses_.size();
      }

      @Override
      public String getIpAddresses(int var1) {
         return this.ipAddresses_.get(var1);
      }

      @Override
      public ByteString getIpAddressesBytes(int var1) {
         return this.ipAddresses_.getByteString(var1);
      }

      public ServerRecommendations.Builder setIpAddresses(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureIpAddressesIsMutable();
         this.ipAddresses_.set(var1, var2);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ServerRecommendations.Builder addIpAddresses(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureIpAddressesIsMutable();
         this.ipAddresses_.add(var1);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ServerRecommendations.Builder addAllIpAddresses(Iterable<String> var1) {
         this.ensureIpAddressesIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.ipAddresses_);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ServerRecommendations.Builder clearIpAddresses() {
         this.ipAddresses_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public ServerRecommendations.Builder addIpAddressesBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerRecommendations.checkByteStringIsUtf8(var1);
         this.ensureIpAddressesIsMutable();
         this.ipAddresses_.add(var1);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      private void ensureVersionsIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.versions_ = new ArrayList<>(this.versions_);
            this.bitField0_ |= 4;
         }
      }

      @Override
      public List<MinecraftVersion> getVersionsList() {
         return this.versionsBuilder_ == null ? Collections.unmodifiableList(this.versions_) : this.versionsBuilder_.getMessageList();
      }

      @Override
      public int getVersionsCount() {
         return this.versionsBuilder_ == null ? this.versions_.size() : this.versionsBuilder_.getCount();
      }

      @Override
      public MinecraftVersion getVersions(int var1) {
         return this.versionsBuilder_ == null ? this.versions_.get(var1) : this.versionsBuilder_.getMessage(var1);
      }

      public ServerRecommendations.Builder setVersions(int var1, MinecraftVersion var2) {
         if (this.versionsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureVersionsIsMutable();
            this.versions_.set(var1, var2);
            this.onChanged();
         } else {
            this.versionsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public ServerRecommendations.Builder setVersions(int var1, MinecraftVersion.Builder var2) {
         if (this.versionsBuilder_ == null) {
            this.ensureVersionsIsMutable();
            this.versions_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.versionsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public ServerRecommendations.Builder addVersions(MinecraftVersion var1) {
         if (this.versionsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureVersionsIsMutable();
            this.versions_.add(var1);
            this.onChanged();
         } else {
            this.versionsBuilder_.addMessage(var1);
         }

         return this;
      }

      public ServerRecommendations.Builder addVersions(int var1, MinecraftVersion var2) {
         if (this.versionsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureVersionsIsMutable();
            this.versions_.add(var1, var2);
            this.onChanged();
         } else {
            this.versionsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public ServerRecommendations.Builder addVersions(MinecraftVersion.Builder var1) {
         if (this.versionsBuilder_ == null) {
            this.ensureVersionsIsMutable();
            this.versions_.add(var1.build());
            this.onChanged();
         } else {
            this.versionsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public ServerRecommendations.Builder addVersions(int var1, MinecraftVersion.Builder var2) {
         if (this.versionsBuilder_ == null) {
            this.ensureVersionsIsMutable();
            this.versions_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.versionsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public ServerRecommendations.Builder addAllVersions(Iterable<? extends MinecraftVersion> var1) {
         if (this.versionsBuilder_ == null) {
            this.ensureVersionsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.versions_);
            this.onChanged();
         } else {
            this.versionsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public ServerRecommendations.Builder clearVersions() {
         if (this.versionsBuilder_ == null) {
            this.versions_ = Collections.emptyList();
            this.bitField0_ &= -5;
            this.onChanged();
         } else {
            this.versionsBuilder_.clear();
         }

         return this;
      }

      public ServerRecommendations.Builder removeVersions(int var1) {
         if (this.versionsBuilder_ == null) {
            this.ensureVersionsIsMutable();
            this.versions_.remove(var1);
            this.onChanged();
         } else {
            this.versionsBuilder_.remove(var1);
         }

         return this;
      }

      public MinecraftVersion.Builder getVersionsBuilder(int var1) {
         return this.getVersionsFieldBuilder().getBuilder(var1);
      }

      @Override
      public MinecraftVersionOrBuilder getVersionsOrBuilder(int var1) {
         return this.versionsBuilder_ == null ? this.versions_.get(var1) : this.versionsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends MinecraftVersionOrBuilder> getVersionsOrBuilderList() {
         return this.versionsBuilder_ != null ? this.versionsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.versions_);
      }

      public MinecraftVersion.Builder addVersionsBuilder() {
         return this.getVersionsFieldBuilder().addBuilder(MinecraftVersion.getDefaultInstance());
      }

      public MinecraftVersion.Builder addVersionsBuilder(int var1) {
         return this.getVersionsFieldBuilder().addBuilder(var1, MinecraftVersion.getDefaultInstance());
      }

      public List<MinecraftVersion.Builder> getVersionsBuilderList() {
         return this.getVersionsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<MinecraftVersion, MinecraftVersion.Builder, MinecraftVersionOrBuilder> getVersionsFieldBuilder() {
         if (this.versionsBuilder_ == null) {
            this.versionsBuilder_ = new RepeatedFieldBuilderV3<>(this.versions_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
            this.versions_ = null;
         }

         return this.versionsBuilder_;
      }

      public final ServerRecommendations.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ServerRecommendations.Builder)super.setUnknownFields(var1);
      }

      public final ServerRecommendations.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ServerRecommendations.Builder)super.mergeUnknownFields(var1);
      }
   }
}
