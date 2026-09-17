package com.lunarclient.apollo.player.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.MapFieldBuilder;
import com.google.protobuf.MapFieldReflectionAccessor;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Value;
import com.google.protobuf.ValueOrBuilder;
import com.google.protobuf.WireFormat;
import com.lunarclient.apollo.common.v1.LunarClientVersion;
import com.lunarclient.apollo.common.v1.LunarClientVersionOrBuilder;
import com.lunarclient.apollo.common.v1.MinecraftVersion;
import com.lunarclient.apollo.common.v1.MinecraftVersionOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class PlayerHandshakeMessage extends GeneratedMessageV3 implements PlayerHandshakeMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int MINECRAFT_VERSION_FIELD_NUMBER = 1;
   private MinecraftVersion minecraftVersion_;
   public static final int LUNAR_CLIENT_VERSION_FIELD_NUMBER = 2;
   private LunarClientVersion lunarClientVersion_;
   public static final int INSTALLED_MODS_FIELD_NUMBER = 3;
   private List<ModMessage> installedMods_;
   public static final int EMBEDDED_CHECKOUT_SUPPORT_FIELD_NUMBER = 4;
   private int embeddedCheckoutSupport_ = 0;
   public static final int MOD_STATUS_FIELD_NUMBER = 5;
   private MapField<String, Value> modStatus_;
   private byte memoizedIsInitialized = -1;
   private static final PlayerHandshakeMessage DEFAULT_INSTANCE = new PlayerHandshakeMessage();
   private static final Parser<PlayerHandshakeMessage> PARSER = new AbstractParser<PlayerHandshakeMessage>() {
      public PlayerHandshakeMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PlayerHandshakeMessage.Builder var3 = PlayerHandshakeMessage.newBuilder();

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

   private PlayerHandshakeMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PlayerHandshakeMessage() {
      this.installedMods_ = Collections.emptyList();
      this.embeddedCheckoutSupport_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PlayerHandshakeMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return HandshakeProto.internal_static_lunarclient_apollo_player_v1_PlayerHandshakeMessage_descriptor;
   }

   @Override
   protected MapFieldReflectionAccessor internalGetMapFieldReflection(int var1) {
      switch (var1) {
         case 5:
            return this.internalGetModStatus();
         default:
            throw new RuntimeException("Invalid map field number: " + var1);
      }
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return HandshakeProto.internal_static_lunarclient_apollo_player_v1_PlayerHandshakeMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PlayerHandshakeMessage.class, PlayerHandshakeMessage.Builder.class);
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
   public boolean hasLunarClientVersion() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public LunarClientVersion getLunarClientVersion() {
      return this.lunarClientVersion_ == null ? LunarClientVersion.getDefaultInstance() : this.lunarClientVersion_;
   }

   @Override
   public LunarClientVersionOrBuilder getLunarClientVersionOrBuilder() {
      return this.lunarClientVersion_ == null ? LunarClientVersion.getDefaultInstance() : this.lunarClientVersion_;
   }

   @Deprecated
   @Override
   public List<ModMessage> getInstalledModsList() {
      return this.installedMods_;
   }

   @Deprecated
   @Override
   public List<? extends ModMessageOrBuilder> getInstalledModsOrBuilderList() {
      return this.installedMods_;
   }

   @Deprecated
   @Override
   public int getInstalledModsCount() {
      return this.installedMods_.size();
   }

   @Deprecated
   @Override
   public ModMessage getInstalledMods(int var1) {
      return this.installedMods_.get(var1);
   }

   @Deprecated
   @Override
   public ModMessageOrBuilder getInstalledModsOrBuilder(int var1) {
      return this.installedMods_.get(var1);
   }

   @Override
   public int getEmbeddedCheckoutSupportValue() {
      return this.embeddedCheckoutSupport_;
   }

   @Override
   public EmbeddedCheckoutSupport getEmbeddedCheckoutSupport() {
      EmbeddedCheckoutSupport var1 = EmbeddedCheckoutSupport.forNumber(this.embeddedCheckoutSupport_);
      return var1 == null ? EmbeddedCheckoutSupport.UNRECOGNIZED : var1;
   }

   private MapField<String, Value> internalGetModStatus() {
      return this.modStatus_ == null ? MapField.emptyMapField(PlayerHandshakeMessage.ModStatusDefaultEntryHolder.defaultEntry) : this.modStatus_;
   }

   @Override
   public int getModStatusCount() {
      return this.internalGetModStatus().getMap().size();
   }

   @Override
   public boolean containsModStatus(String var1) {
      if (var1 == null) {
         throw new NullPointerException("map key");
      } else {
         return this.internalGetModStatus().getMap().containsKey(var1);
      }
   }

   @Deprecated
   @Override
   public Map<String, Value> getModStatus() {
      return this.getModStatusMap();
   }

   @Override
   public Map<String, Value> getModStatusMap() {
      return this.internalGetModStatus().getMap();
   }

   @Override
   public Value getModStatusOrDefault(String var1, Value var2) {
      if (var1 == null) {
         throw new NullPointerException("map key");
      }

      Map var3 = this.internalGetModStatus().getMap();
      return var3.containsKey(var1) ? (Value)var3.get(var1) : var2;
   }

   @Override
   public Value getModStatusOrThrow(String var1) {
      if (var1 == null) {
         throw new NullPointerException("map key");
      } else {
         Map var2 = this.internalGetModStatus().getMap();
         if (!var2.containsKey(var1)) {
            throw new IllegalArgumentException();
         } else {
            return (Value)var2.get(var1);
         }
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
         var1.writeMessage(1, this.getMinecraftVersion());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getLunarClientVersion());
      }

      for (int var2 = 0; var2 < this.installedMods_.size(); var2++) {
         var1.writeMessage(3, this.installedMods_.get(var2));
      }

      if (this.embeddedCheckoutSupport_ != EmbeddedCheckoutSupport.EMBEDDED_CHECKOUT_SUPPORT_UNSPECIFIED.getNumber()) {
         var1.writeEnum(4, this.embeddedCheckoutSupport_);
      }

      GeneratedMessageV3.serializeStringMapTo(var1, this.internalGetModStatus(), PlayerHandshakeMessage.ModStatusDefaultEntryHolder.defaultEntry, 5);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getMinecraftVersion());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getLunarClientVersion());
      }

      for (int var2 = 0; var2 < this.installedMods_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(3, this.installedMods_.get(var2));
      }

      if (this.embeddedCheckoutSupport_ != EmbeddedCheckoutSupport.EMBEDDED_CHECKOUT_SUPPORT_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(4, this.embeddedCheckoutSupport_);
      }

      for (Entry var3 : this.internalGetModStatus().getMap().entrySet()) {
         MapEntry var4 = PlayerHandshakeMessage.ModStatusDefaultEntryHolder.defaultEntry
            .newBuilderForType()
            .setKey((String)var3.getKey())
            .setValue((Value)var3.getValue())
            .build();
         var1 += CodedOutputStream.computeMessageSize(5, var4);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PlayerHandshakeMessage)) {
         return super.equals(var1);
      } else {
         PlayerHandshakeMessage var2 = (PlayerHandshakeMessage)var1;
         if (this.hasMinecraftVersion() != var2.hasMinecraftVersion()) {
            return false;
         } else if (this.hasMinecraftVersion() && !this.getMinecraftVersion().equals(var2.getMinecraftVersion())) {
            return false;
         } else if (this.hasLunarClientVersion() != var2.hasLunarClientVersion()) {
            return false;
         } else if (this.hasLunarClientVersion() && !this.getLunarClientVersion().equals(var2.getLunarClientVersion())) {
            return false;
         } else if (!this.getInstalledModsList().equals(var2.getInstalledModsList())) {
            return false;
         } else if (this.embeddedCheckoutSupport_ != var2.embeddedCheckoutSupport_) {
            return false;
         } else {
            return !this.internalGetModStatus().equals(var2.internalGetModStatus()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasMinecraftVersion()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getMinecraftVersion().hashCode();
      }

      if (this.hasLunarClientVersion()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getLunarClientVersion().hashCode();
      }

      if (this.getInstalledModsCount() > 0) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getInstalledModsList().hashCode();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.embeddedCheckoutSupport_;
      if (!this.internalGetModStatus().getMap().isEmpty()) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.internalGetModStatus().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PlayerHandshakeMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerHandshakeMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerHandshakeMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerHandshakeMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerHandshakeMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerHandshakeMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerHandshakeMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayerHandshakeMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PlayerHandshakeMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PlayerHandshakeMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PlayerHandshakeMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayerHandshakeMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PlayerHandshakeMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PlayerHandshakeMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PlayerHandshakeMessage.Builder newBuilder(PlayerHandshakeMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PlayerHandshakeMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PlayerHandshakeMessage.Builder() : new PlayerHandshakeMessage.Builder().mergeFrom(this);
   }

   protected PlayerHandshakeMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PlayerHandshakeMessage.Builder(var1);
   }

   public static PlayerHandshakeMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PlayerHandshakeMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<PlayerHandshakeMessage> getParserForType() {
      return PARSER;
   }

   public PlayerHandshakeMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PlayerHandshakeMessage.Builder> implements PlayerHandshakeMessageOrBuilder {
      private int bitField0_;
      private MinecraftVersion minecraftVersion_;
      private SingleFieldBuilderV3<MinecraftVersion, MinecraftVersion.Builder, MinecraftVersionOrBuilder> minecraftVersionBuilder_;
      private LunarClientVersion lunarClientVersion_;
      private SingleFieldBuilderV3<LunarClientVersion, LunarClientVersion.Builder, LunarClientVersionOrBuilder> lunarClientVersionBuilder_;
      private List<ModMessage> installedMods_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<ModMessage, ModMessage.Builder, ModMessageOrBuilder> installedModsBuilder_;
      private int embeddedCheckoutSupport_ = 0;
      private static final PlayerHandshakeMessage.Builder.ModStatusConverter modStatusConverter = new PlayerHandshakeMessage.Builder.ModStatusConverter();
      private MapFieldBuilder<String, ValueOrBuilder, Value, Value.Builder> modStatus_;

      public static final Descriptors.Descriptor getDescriptor() {
         return HandshakeProto.internal_static_lunarclient_apollo_player_v1_PlayerHandshakeMessage_descriptor;
      }

      @Override
      protected MapFieldReflectionAccessor internalGetMapFieldReflection(int var1) {
         switch (var1) {
            case 5:
               return this.internalGetModStatus();
            default:
               throw new RuntimeException("Invalid map field number: " + var1);
         }
      }

      @Override
      protected MapFieldReflectionAccessor internalGetMutableMapFieldReflection(int var1) {
         switch (var1) {
            case 5:
               return this.internalGetMutableModStatus();
            default:
               throw new RuntimeException("Invalid map field number: " + var1);
         }
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HandshakeProto.internal_static_lunarclient_apollo_player_v1_PlayerHandshakeMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PlayerHandshakeMessage.class, PlayerHandshakeMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (PlayerHandshakeMessage.alwaysUseFieldBuilders) {
            this.getMinecraftVersionFieldBuilder();
            this.getLunarClientVersionFieldBuilder();
            this.getInstalledModsFieldBuilder();
         }
      }

      public PlayerHandshakeMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.minecraftVersion_ = null;
         if (this.minecraftVersionBuilder_ != null) {
            this.minecraftVersionBuilder_.dispose();
            this.minecraftVersionBuilder_ = null;
         }

         this.lunarClientVersion_ = null;
         if (this.lunarClientVersionBuilder_ != null) {
            this.lunarClientVersionBuilder_.dispose();
            this.lunarClientVersionBuilder_ = null;
         }

         if (this.installedModsBuilder_ == null) {
            this.installedMods_ = Collections.emptyList();
         } else {
            this.installedMods_ = null;
            this.installedModsBuilder_.clear();
         }

         this.bitField0_ &= -5;
         this.embeddedCheckoutSupport_ = 0;
         this.internalGetMutableModStatus().clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return HandshakeProto.internal_static_lunarclient_apollo_player_v1_PlayerHandshakeMessage_descriptor;
      }

      public PlayerHandshakeMessage getDefaultInstanceForType() {
         return PlayerHandshakeMessage.getDefaultInstance();
      }

      public PlayerHandshakeMessage build() {
         PlayerHandshakeMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PlayerHandshakeMessage buildPartial() {
         PlayerHandshakeMessage var1 = new PlayerHandshakeMessage(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(PlayerHandshakeMessage var1) {
         if (this.installedModsBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0) {
               this.installedMods_ = Collections.unmodifiableList(this.installedMods_);
               this.bitField0_ &= -5;
            }

            var1.installedMods_ = this.installedMods_;
         } else {
            var1.installedMods_ = this.installedModsBuilder_.build();
         }
      }

      private void buildPartial0(PlayerHandshakeMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.minecraftVersion_ = this.minecraftVersionBuilder_ == null ? this.minecraftVersion_ : this.minecraftVersionBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.lunarClientVersion_ = this.lunarClientVersionBuilder_ == null ? this.lunarClientVersion_ : this.lunarClientVersionBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 8) != 0) {
            var1.embeddedCheckoutSupport_ = this.embeddedCheckoutSupport_;
         }

         if ((var2 & 16) != 0) {
            var1.modStatus_ = this.internalGetModStatus().build(PlayerHandshakeMessage.ModStatusDefaultEntryHolder.defaultEntry);
         }

         PlayerHandshakeMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public PlayerHandshakeMessage.Builder clone() {
         return (PlayerHandshakeMessage.Builder)super.clone();
      }

      public PlayerHandshakeMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayerHandshakeMessage.Builder)super.setField(var1, var2);
      }

      public PlayerHandshakeMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PlayerHandshakeMessage.Builder)super.clearField(var1);
      }

      public PlayerHandshakeMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PlayerHandshakeMessage.Builder)super.clearOneof(var1);
      }

      public PlayerHandshakeMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PlayerHandshakeMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PlayerHandshakeMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayerHandshakeMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public PlayerHandshakeMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof PlayerHandshakeMessage) {
            return this.mergeFrom((PlayerHandshakeMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PlayerHandshakeMessage.Builder mergeFrom(PlayerHandshakeMessage var1) {
         if (var1 == PlayerHandshakeMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.hasMinecraftVersion()) {
            this.mergeMinecraftVersion(var1.getMinecraftVersion());
         }

         if (var1.hasLunarClientVersion()) {
            this.mergeLunarClientVersion(var1.getLunarClientVersion());
         }

         if (this.installedModsBuilder_ == null) {
            if (!var1.installedMods_.isEmpty()) {
               if (this.installedMods_.isEmpty()) {
                  this.installedMods_ = var1.installedMods_;
                  this.bitField0_ &= -5;
               } else {
                  this.ensureInstalledModsIsMutable();
                  this.installedMods_.addAll(var1.installedMods_);
               }

               this.onChanged();
            }
         } else if (!var1.installedMods_.isEmpty()) {
            if (this.installedModsBuilder_.isEmpty()) {
               this.installedModsBuilder_.dispose();
               this.installedModsBuilder_ = null;
               this.installedMods_ = var1.installedMods_;
               this.bitField0_ &= -5;
               this.installedModsBuilder_ = PlayerHandshakeMessage.alwaysUseFieldBuilders ? this.getInstalledModsFieldBuilder() : null;
            } else {
               this.installedModsBuilder_.addAllMessages(var1.installedMods_);
            }
         }

         if (var1.embeddedCheckoutSupport_ != 0) {
            this.setEmbeddedCheckoutSupportValue(var1.getEmbeddedCheckoutSupportValue());
         }

         this.internalGetMutableModStatus().mergeFrom(var1.internalGetModStatus());
         this.bitField0_ |= 16;
         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public PlayerHandshakeMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getMinecraftVersionFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getLunarClientVersionFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     ModMessage var11 = var1.readMessage(ModMessage.parser(), var2);
                     if (this.installedModsBuilder_ == null) {
                        this.ensureInstalledModsIsMutable();
                        this.installedMods_.add(var11);
                     } else {
                        this.installedModsBuilder_.addMessage(var11);
                     }
                     break;
                  case 32:
                     this.embeddedCheckoutSupport_ = var1.readEnum();
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     MapEntry var5 = var1.readMessage(PlayerHandshakeMessage.ModStatusDefaultEntryHolder.defaultEntry.getParserForType(), var2);
                     this.internalGetMutableModStatus().ensureBuilderMap().put((String)var5.getKey(), (ValueOrBuilder)var5.getValue());
                     this.bitField0_ |= 16;
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
      public boolean hasMinecraftVersion() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public MinecraftVersion getMinecraftVersion() {
         if (this.minecraftVersionBuilder_ == null) {
            return this.minecraftVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.minecraftVersion_;
         } else {
            return this.minecraftVersionBuilder_.getMessage();
         }
      }

      public PlayerHandshakeMessage.Builder setMinecraftVersion(MinecraftVersion var1) {
         if (this.minecraftVersionBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.minecraftVersion_ = var1;
         } else {
            this.minecraftVersionBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PlayerHandshakeMessage.Builder setMinecraftVersion(MinecraftVersion.Builder var1) {
         if (this.minecraftVersionBuilder_ == null) {
            this.minecraftVersion_ = var1.build();
         } else {
            this.minecraftVersionBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PlayerHandshakeMessage.Builder mergeMinecraftVersion(MinecraftVersion var1) {
         if (this.minecraftVersionBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.minecraftVersion_ != null && this.minecraftVersion_ != MinecraftVersion.getDefaultInstance()) {
               this.getMinecraftVersionBuilder().mergeFrom(var1);
            } else {
               this.minecraftVersion_ = var1;
            }
         } else {
            this.minecraftVersionBuilder_.mergeFrom(var1);
         }

         if (this.minecraftVersion_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public PlayerHandshakeMessage.Builder clearMinecraftVersion() {
         this.bitField0_ &= -2;
         this.minecraftVersion_ = null;
         if (this.minecraftVersionBuilder_ != null) {
            this.minecraftVersionBuilder_.dispose();
            this.minecraftVersionBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public MinecraftVersion.Builder getMinecraftVersionBuilder() {
         this.bitField0_ |= 1;
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
      public boolean hasLunarClientVersion() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public LunarClientVersion getLunarClientVersion() {
         if (this.lunarClientVersionBuilder_ == null) {
            return this.lunarClientVersion_ == null ? LunarClientVersion.getDefaultInstance() : this.lunarClientVersion_;
         } else {
            return this.lunarClientVersionBuilder_.getMessage();
         }
      }

      public PlayerHandshakeMessage.Builder setLunarClientVersion(LunarClientVersion var1) {
         if (this.lunarClientVersionBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.lunarClientVersion_ = var1;
         } else {
            this.lunarClientVersionBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PlayerHandshakeMessage.Builder setLunarClientVersion(LunarClientVersion.Builder var1) {
         if (this.lunarClientVersionBuilder_ == null) {
            this.lunarClientVersion_ = var1.build();
         } else {
            this.lunarClientVersionBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PlayerHandshakeMessage.Builder mergeLunarClientVersion(LunarClientVersion var1) {
         if (this.lunarClientVersionBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.lunarClientVersion_ != null && this.lunarClientVersion_ != LunarClientVersion.getDefaultInstance()) {
               this.getLunarClientVersionBuilder().mergeFrom(var1);
            } else {
               this.lunarClientVersion_ = var1;
            }
         } else {
            this.lunarClientVersionBuilder_.mergeFrom(var1);
         }

         if (this.lunarClientVersion_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public PlayerHandshakeMessage.Builder clearLunarClientVersion() {
         this.bitField0_ &= -3;
         this.lunarClientVersion_ = null;
         if (this.lunarClientVersionBuilder_ != null) {
            this.lunarClientVersionBuilder_.dispose();
            this.lunarClientVersionBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public LunarClientVersion.Builder getLunarClientVersionBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getLunarClientVersionFieldBuilder().getBuilder();
      }

      @Override
      public LunarClientVersionOrBuilder getLunarClientVersionOrBuilder() {
         if (this.lunarClientVersionBuilder_ != null) {
            return this.lunarClientVersionBuilder_.getMessageOrBuilder();
         } else {
            return this.lunarClientVersion_ == null ? LunarClientVersion.getDefaultInstance() : this.lunarClientVersion_;
         }
      }

      private SingleFieldBuilderV3<LunarClientVersion, LunarClientVersion.Builder, LunarClientVersionOrBuilder> getLunarClientVersionFieldBuilder() {
         if (this.lunarClientVersionBuilder_ == null) {
            this.lunarClientVersionBuilder_ = new SingleFieldBuilderV3<>(this.getLunarClientVersion(), this.getParentForChildren(), this.isClean());
            this.lunarClientVersion_ = null;
         }

         return this.lunarClientVersionBuilder_;
      }

      private void ensureInstalledModsIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.installedMods_ = new ArrayList<>(this.installedMods_);
            this.bitField0_ |= 4;
         }
      }

      @Deprecated
      @Override
      public List<ModMessage> getInstalledModsList() {
         return this.installedModsBuilder_ == null ? Collections.unmodifiableList(this.installedMods_) : this.installedModsBuilder_.getMessageList();
      }

      @Deprecated
      @Override
      public int getInstalledModsCount() {
         return this.installedModsBuilder_ == null ? this.installedMods_.size() : this.installedModsBuilder_.getCount();
      }

      @Deprecated
      @Override
      public ModMessage getInstalledMods(int var1) {
         return this.installedModsBuilder_ == null ? this.installedMods_.get(var1) : this.installedModsBuilder_.getMessage(var1);
      }

      @Deprecated
      public PlayerHandshakeMessage.Builder setInstalledMods(int var1, ModMessage var2) {
         if (this.installedModsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureInstalledModsIsMutable();
            this.installedMods_.set(var1, var2);
            this.onChanged();
         } else {
            this.installedModsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      @Deprecated
      public PlayerHandshakeMessage.Builder setInstalledMods(int var1, ModMessage.Builder var2) {
         if (this.installedModsBuilder_ == null) {
            this.ensureInstalledModsIsMutable();
            this.installedMods_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.installedModsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      @Deprecated
      public PlayerHandshakeMessage.Builder addInstalledMods(ModMessage var1) {
         if (this.installedModsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureInstalledModsIsMutable();
            this.installedMods_.add(var1);
            this.onChanged();
         } else {
            this.installedModsBuilder_.addMessage(var1);
         }

         return this;
      }

      @Deprecated
      public PlayerHandshakeMessage.Builder addInstalledMods(int var1, ModMessage var2) {
         if (this.installedModsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureInstalledModsIsMutable();
            this.installedMods_.add(var1, var2);
            this.onChanged();
         } else {
            this.installedModsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      @Deprecated
      public PlayerHandshakeMessage.Builder addInstalledMods(ModMessage.Builder var1) {
         if (this.installedModsBuilder_ == null) {
            this.ensureInstalledModsIsMutable();
            this.installedMods_.add(var1.build());
            this.onChanged();
         } else {
            this.installedModsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      @Deprecated
      public PlayerHandshakeMessage.Builder addInstalledMods(int var1, ModMessage.Builder var2) {
         if (this.installedModsBuilder_ == null) {
            this.ensureInstalledModsIsMutable();
            this.installedMods_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.installedModsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      @Deprecated
      public PlayerHandshakeMessage.Builder addAllInstalledMods(Iterable<? extends ModMessage> var1) {
         if (this.installedModsBuilder_ == null) {
            this.ensureInstalledModsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.installedMods_);
            this.onChanged();
         } else {
            this.installedModsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      @Deprecated
      public PlayerHandshakeMessage.Builder clearInstalledMods() {
         if (this.installedModsBuilder_ == null) {
            this.installedMods_ = Collections.emptyList();
            this.bitField0_ &= -5;
            this.onChanged();
         } else {
            this.installedModsBuilder_.clear();
         }

         return this;
      }

      @Deprecated
      public PlayerHandshakeMessage.Builder removeInstalledMods(int var1) {
         if (this.installedModsBuilder_ == null) {
            this.ensureInstalledModsIsMutable();
            this.installedMods_.remove(var1);
            this.onChanged();
         } else {
            this.installedModsBuilder_.remove(var1);
         }

         return this;
      }

      @Deprecated
      public ModMessage.Builder getInstalledModsBuilder(int var1) {
         return this.getInstalledModsFieldBuilder().getBuilder(var1);
      }

      @Deprecated
      @Override
      public ModMessageOrBuilder getInstalledModsOrBuilder(int var1) {
         return this.installedModsBuilder_ == null ? this.installedMods_.get(var1) : this.installedModsBuilder_.getMessageOrBuilder(var1);
      }

      @Deprecated
      @Override
      public List<? extends ModMessageOrBuilder> getInstalledModsOrBuilderList() {
         return this.installedModsBuilder_ != null ? this.installedModsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.installedMods_);
      }

      @Deprecated
      public ModMessage.Builder addInstalledModsBuilder() {
         return this.getInstalledModsFieldBuilder().addBuilder(ModMessage.getDefaultInstance());
      }

      @Deprecated
      public ModMessage.Builder addInstalledModsBuilder(int var1) {
         return this.getInstalledModsFieldBuilder().addBuilder(var1, ModMessage.getDefaultInstance());
      }

      @Deprecated
      public List<ModMessage.Builder> getInstalledModsBuilderList() {
         return this.getInstalledModsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<ModMessage, ModMessage.Builder, ModMessageOrBuilder> getInstalledModsFieldBuilder() {
         if (this.installedModsBuilder_ == null) {
            this.installedModsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.installedMods_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean()
            );
            this.installedMods_ = null;
         }

         return this.installedModsBuilder_;
      }

      @Override
      public int getEmbeddedCheckoutSupportValue() {
         return this.embeddedCheckoutSupport_;
      }

      public PlayerHandshakeMessage.Builder setEmbeddedCheckoutSupportValue(int var1) {
         this.embeddedCheckoutSupport_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public EmbeddedCheckoutSupport getEmbeddedCheckoutSupport() {
         EmbeddedCheckoutSupport var1 = EmbeddedCheckoutSupport.forNumber(this.embeddedCheckoutSupport_);
         return var1 == null ? EmbeddedCheckoutSupport.UNRECOGNIZED : var1;
      }

      public PlayerHandshakeMessage.Builder setEmbeddedCheckoutSupport(EmbeddedCheckoutSupport var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 8;
         this.embeddedCheckoutSupport_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public PlayerHandshakeMessage.Builder clearEmbeddedCheckoutSupport() {
         this.bitField0_ &= -9;
         this.embeddedCheckoutSupport_ = 0;
         this.onChanged();
         return this;
      }

      private MapFieldBuilder<String, ValueOrBuilder, Value, Value.Builder> internalGetModStatus() {
         return this.modStatus_ == null ? new MapFieldBuilder<>(modStatusConverter) : this.modStatus_;
      }

      private MapFieldBuilder<String, ValueOrBuilder, Value, Value.Builder> internalGetMutableModStatus() {
         if (this.modStatus_ == null) {
            this.modStatus_ = new MapFieldBuilder<>(modStatusConverter);
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this.modStatus_;
      }

      @Override
      public int getModStatusCount() {
         return this.internalGetModStatus().ensureBuilderMap().size();
      }

      @Override
      public boolean containsModStatus(String var1) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         } else {
            return this.internalGetModStatus().ensureBuilderMap().containsKey(var1);
         }
      }

      @Deprecated
      @Override
      public Map<String, Value> getModStatus() {
         return this.getModStatusMap();
      }

      @Override
      public Map<String, Value> getModStatusMap() {
         return this.internalGetModStatus().getImmutableMap();
      }

      @Override
      public Value getModStatusOrDefault(String var1, Value var2) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         }

         Map var3 = this.internalGetMutableModStatus().ensureBuilderMap();
         return var3.containsKey(var1) ? modStatusConverter.build((ValueOrBuilder)var3.get(var1)) : var2;
      }

      @Override
      public Value getModStatusOrThrow(String var1) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         } else {
            Map var2 = this.internalGetMutableModStatus().ensureBuilderMap();
            if (!var2.containsKey(var1)) {
               throw new IllegalArgumentException();
            } else {
               return modStatusConverter.build((ValueOrBuilder)var2.get(var1));
            }
         }
      }

      public PlayerHandshakeMessage.Builder clearModStatus() {
         this.bitField0_ &= -17;
         this.internalGetMutableModStatus().clear();
         return this;
      }

      public PlayerHandshakeMessage.Builder removeModStatus(String var1) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         }

         this.internalGetMutableModStatus().ensureBuilderMap().remove(var1);
         return this;
      }

      @Deprecated
      public Map<String, Value> getMutableModStatus() {
         this.bitField0_ |= 16;
         return this.internalGetMutableModStatus().ensureMessageMap();
      }

      public PlayerHandshakeMessage.Builder putModStatus(String var1, Value var2) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         }

         if (var2 == null) {
            throw new NullPointerException("map value");
         }

         this.internalGetMutableModStatus().ensureBuilderMap().put(var1, var2);
         this.bitField0_ |= 16;
         return this;
      }

      public PlayerHandshakeMessage.Builder putAllModStatus(Map<String, Value> var1) {
         for (Entry var3 : var1.entrySet()) {
            if (var3.getKey() == null || var3.getValue() == null) {
               throw new NullPointerException();
            }
         }

         this.internalGetMutableModStatus().ensureBuilderMap().putAll(var1);
         this.bitField0_ |= 16;
         return this;
      }

      public Value.Builder putModStatusBuilderIfAbsent(String var1) {
         Map var2 = this.internalGetMutableModStatus().ensureBuilderMap();
         ValueOrBuilder var3 = (ValueOrBuilder)var2.get(var1);
         if (var3 == null) {
            var3 = Value.newBuilder();
            var2.put(var1, var3);
         }

         if (var3 instanceof Value) {
            var3 = ((Value)var3).toBuilder();
            var2.put(var1, var3);
         }

         return (Value.Builder)var3;
      }

      public final PlayerHandshakeMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PlayerHandshakeMessage.Builder)super.setUnknownFields(var1);
      }

      public final PlayerHandshakeMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PlayerHandshakeMessage.Builder)super.mergeUnknownFields(var1);
      }

      private static final class ModStatusConverter implements MapFieldBuilder.Converter<String, ValueOrBuilder, Value> {
         private ModStatusConverter() {
         }

         public Value build(ValueOrBuilder var1) {
            return var1 instanceof Value ? (Value)var1 : ((Value.Builder)var1).build();
         }

         @Override
         public MapEntry<String, Value> defaultEntry() {
            return PlayerHandshakeMessage.ModStatusDefaultEntryHolder.defaultEntry;
         }
      }
   }

   private static final class ModStatusDefaultEntryHolder {
      static final MapEntry<String, Value> defaultEntry = MapEntry.newDefaultInstance(
         HandshakeProto.internal_static_lunarclient_apollo_player_v1_PlayerHandshakeMessage_ModStatusEntry_descriptor,
         WireFormat.FieldType.STRING,
         "",
         WireFormat.FieldType.MESSAGE,
         Value.getDefaultInstance()
      );
   }
}
