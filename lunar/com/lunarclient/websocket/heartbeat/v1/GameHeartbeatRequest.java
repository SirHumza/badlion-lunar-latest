package com.lunarclient.websocket.heartbeat.v1;

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
import com.google.protobuf.MapFieldReflectionAccessor;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Map.Entry;

public final class GameHeartbeatRequest extends GeneratedMessageV3 implements GameHeartbeatRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int MODS_FIELD_NUMBER = 1;
   private MapField<String, Boolean> mods_;
   public static final int SERVER_GAME_MODE_FIELD_NUMBER = 2;
   private volatile Object serverGameMode_ = "";
   private byte memoizedIsInitialized = -1;
   private static final GameHeartbeatRequest DEFAULT_INSTANCE = new GameHeartbeatRequest();
   private static final Parser<GameHeartbeatRequest> PARSER = new AbstractParser<GameHeartbeatRequest>() {
      public GameHeartbeatRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         GameHeartbeatRequest.Builder var3 = GameHeartbeatRequest.newBuilder();

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

   private GameHeartbeatRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private GameHeartbeatRequest() {
      this.serverGameMode_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new GameHeartbeatRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_heartbeat_v1_GameHeartbeatRequest_descriptor;
   }

   @Override
   protected MapFieldReflectionAccessor internalGetMapFieldReflection(int var1) {
      switch (var1) {
         case 1:
            return this.internalGetMods();
         default:
            throw new RuntimeException("Invalid map field number: " + var1);
      }
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_heartbeat_v1_GameHeartbeatRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(GameHeartbeatRequest.class, GameHeartbeatRequest.Builder.class);
   }

   private MapField<String, Boolean> internalGetMods() {
      return this.mods_ == null ? MapField.emptyMapField(GameHeartbeatRequest.ModsDefaultEntryHolder.defaultEntry) : this.mods_;
   }

   @Deprecated
   @Override
   public int getModsCount() {
      return this.internalGetMods().getMap().size();
   }

   @Deprecated
   @Override
   public boolean containsMods(String var1) {
      if (var1 == null) {
         throw new NullPointerException("map key");
      } else {
         return this.internalGetMods().getMap().containsKey(var1);
      }
   }

   @Deprecated
   @Override
   public Map<String, Boolean> getMods() {
      return this.getModsMap();
   }

   @Deprecated
   @Override
   public Map<String, Boolean> getModsMap() {
      return this.internalGetMods().getMap();
   }

   @Deprecated
   @Override
   public boolean getModsOrDefault(String var1, boolean var2) {
      if (var1 == null) {
         throw new NullPointerException("map key");
      }

      Map var3 = this.internalGetMods().getMap();
      return var3.containsKey(var1) ? (Boolean)var3.get(var1) : var2;
   }

   @Deprecated
   @Override
   public boolean getModsOrThrow(String var1) {
      if (var1 == null) {
         throw new NullPointerException("map key");
      } else {
         Map var2 = this.internalGetMods().getMap();
         if (!var2.containsKey(var1)) {
            throw new IllegalArgumentException();
         } else {
            return (Boolean)var2.get(var1);
         }
      }
   }

   @Deprecated
   @Override
   public String getServerGameMode() {
      Object var1 = this.serverGameMode_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.serverGameMode_ = var3;
      return var3;
   }

   @Deprecated
   @Override
   public ByteString getServerGameModeBytes() {
      Object var1 = this.serverGameMode_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.serverGameMode_ = var2;
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
      GeneratedMessageV3.serializeStringMapTo(var1, this.internalGetMods(), GameHeartbeatRequest.ModsDefaultEntryHolder.defaultEntry, 1);
      if (!GeneratedMessageV3.isStringEmpty(this.serverGameMode_)) {
         GeneratedMessageV3.writeString(var1, 2, this.serverGameMode_);
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

      for (Entry var3 : this.internalGetMods().getMap().entrySet()) {
         MapEntry var4 = GameHeartbeatRequest.ModsDefaultEntryHolder.defaultEntry
            .newBuilderForType()
            .setKey((String)var3.getKey())
            .setValue((Boolean)var3.getValue())
            .build();
         var1 += CodedOutputStream.computeMessageSize(1, var4);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.serverGameMode_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.serverGameMode_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof GameHeartbeatRequest)) {
         return super.equals(var1);
      } else {
         GameHeartbeatRequest var2 = (GameHeartbeatRequest)var1;
         if (!this.internalGetMods().equals(var2.internalGetMods())) {
            return false;
         } else {
            return !this.getServerGameMode().equals(var2.getServerGameMode()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (!this.internalGetMods().getMap().isEmpty()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.internalGetMods().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getServerGameMode().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static GameHeartbeatRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static GameHeartbeatRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GameHeartbeatRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static GameHeartbeatRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GameHeartbeatRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static GameHeartbeatRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GameHeartbeatRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GameHeartbeatRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static GameHeartbeatRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static GameHeartbeatRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static GameHeartbeatRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GameHeartbeatRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public GameHeartbeatRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static GameHeartbeatRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static GameHeartbeatRequest.Builder newBuilder(GameHeartbeatRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public GameHeartbeatRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new GameHeartbeatRequest.Builder() : new GameHeartbeatRequest.Builder().mergeFrom(this);
   }

   protected GameHeartbeatRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new GameHeartbeatRequest.Builder(var1);
   }

   public static GameHeartbeatRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<GameHeartbeatRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<GameHeartbeatRequest> getParserForType() {
      return PARSER;
   }

   public GameHeartbeatRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<GameHeartbeatRequest.Builder> implements GameHeartbeatRequestOrBuilder {
      private int bitField0_;
      private MapField<String, Boolean> mods_;
      private Object serverGameMode_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_heartbeat_v1_GameHeartbeatRequest_descriptor;
      }

      @Override
      protected MapFieldReflectionAccessor internalGetMapFieldReflection(int var1) {
         switch (var1) {
            case 1:
               return this.internalGetMods();
            default:
               throw new RuntimeException("Invalid map field number: " + var1);
         }
      }

      @Override
      protected MapFieldReflectionAccessor internalGetMutableMapFieldReflection(int var1) {
         switch (var1) {
            case 1:
               return this.internalGetMutableMods();
            default:
               throw new RuntimeException("Invalid map field number: " + var1);
         }
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_heartbeat_v1_GameHeartbeatRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(GameHeartbeatRequest.class, GameHeartbeatRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public GameHeartbeatRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.internalGetMutableMods().clear();
         this.serverGameMode_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_heartbeat_v1_GameHeartbeatRequest_descriptor;
      }

      public GameHeartbeatRequest getDefaultInstanceForType() {
         return GameHeartbeatRequest.getDefaultInstance();
      }

      public GameHeartbeatRequest build() {
         GameHeartbeatRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public GameHeartbeatRequest buildPartial() {
         GameHeartbeatRequest var1 = new GameHeartbeatRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(GameHeartbeatRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.mods_ = this.internalGetMods();
            var1.mods_.makeImmutable();
         }

         if ((var2 & 2) != 0) {
            var1.serverGameMode_ = this.serverGameMode_;
         }
      }

      public GameHeartbeatRequest.Builder clone() {
         return (GameHeartbeatRequest.Builder)super.clone();
      }

      public GameHeartbeatRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GameHeartbeatRequest.Builder)super.setField(var1, var2);
      }

      public GameHeartbeatRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (GameHeartbeatRequest.Builder)super.clearField(var1);
      }

      public GameHeartbeatRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (GameHeartbeatRequest.Builder)super.clearOneof(var1);
      }

      public GameHeartbeatRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (GameHeartbeatRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public GameHeartbeatRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GameHeartbeatRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public GameHeartbeatRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof GameHeartbeatRequest) {
            return this.mergeFrom((GameHeartbeatRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public GameHeartbeatRequest.Builder mergeFrom(GameHeartbeatRequest var1) {
         if (var1 == GameHeartbeatRequest.getDefaultInstance()) {
            return this;
         }

         this.internalGetMutableMods().mergeFrom(var1.internalGetMods());
         this.bitField0_ |= 1;
         if (!var1.getServerGameMode().isEmpty()) {
            this.serverGameMode_ = var1.serverGameMode_;
            this.bitField0_ |= 2;
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

      public GameHeartbeatRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     MapEntry var5 = var1.readMessage(GameHeartbeatRequest.ModsDefaultEntryHolder.defaultEntry.getParserForType(), var2);
                     this.internalGetMutableMods().getMutableMap().put((String)var5.getKey(), (Boolean)var5.getValue());
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.serverGameMode_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
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

      @Deprecated
      private MapField<String, Boolean> internalGetMods() {
         return this.mods_ == null ? MapField.emptyMapField(GameHeartbeatRequest.ModsDefaultEntryHolder.defaultEntry) : this.mods_;
      }

      @Deprecated
      private MapField<String, Boolean> internalGetMutableMods() {
         if (this.mods_ == null) {
            this.mods_ = MapField.newMapField(GameHeartbeatRequest.ModsDefaultEntryHolder.defaultEntry);
         }

         if (!this.mods_.isMutable()) {
            this.mods_ = this.mods_.copy();
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this.mods_;
      }

      @Deprecated
      @Override
      public int getModsCount() {
         return this.internalGetMods().getMap().size();
      }

      @Deprecated
      @Override
      public boolean containsMods(String var1) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         } else {
            return this.internalGetMods().getMap().containsKey(var1);
         }
      }

      @Deprecated
      @Override
      public Map<String, Boolean> getMods() {
         return this.getModsMap();
      }

      @Deprecated
      @Override
      public Map<String, Boolean> getModsMap() {
         return this.internalGetMods().getMap();
      }

      @Deprecated
      @Override
      public boolean getModsOrDefault(String var1, boolean var2) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         }

         Map var3 = this.internalGetMods().getMap();
         return var3.containsKey(var1) ? (Boolean)var3.get(var1) : var2;
      }

      @Deprecated
      @Override
      public boolean getModsOrThrow(String var1) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         } else {
            Map var2 = this.internalGetMods().getMap();
            if (!var2.containsKey(var1)) {
               throw new IllegalArgumentException();
            } else {
               return (Boolean)var2.get(var1);
            }
         }
      }

      @Deprecated
      public GameHeartbeatRequest.Builder clearMods() {
         this.bitField0_ &= -2;
         this.internalGetMutableMods().getMutableMap().clear();
         return this;
      }

      @Deprecated
      public GameHeartbeatRequest.Builder removeMods(String var1) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         }

         this.internalGetMutableMods().getMutableMap().remove(var1);
         return this;
      }

      @Deprecated
      public Map<String, Boolean> getMutableMods() {
         this.bitField0_ |= 1;
         return this.internalGetMutableMods().getMutableMap();
      }

      @Deprecated
      public GameHeartbeatRequest.Builder putMods(String var1, boolean var2) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         }

         this.internalGetMutableMods().getMutableMap().put(var1, var2);
         this.bitField0_ |= 1;
         return this;
      }

      @Deprecated
      public GameHeartbeatRequest.Builder putAllMods(Map<String, Boolean> var1) {
         this.internalGetMutableMods().getMutableMap().putAll(var1);
         this.bitField0_ |= 1;
         return this;
      }

      @Deprecated
      @Override
      public String getServerGameMode() {
         Object var1 = this.serverGameMode_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.serverGameMode_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Deprecated
      @Override
      public ByteString getServerGameModeBytes() {
         Object var1 = this.serverGameMode_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.serverGameMode_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      @Deprecated
      public GameHeartbeatRequest.Builder setServerGameMode(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.serverGameMode_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Deprecated
      public GameHeartbeatRequest.Builder clearServerGameMode() {
         this.serverGameMode_ = GameHeartbeatRequest.getDefaultInstance().getServerGameMode();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      @Deprecated
      public GameHeartbeatRequest.Builder setServerGameModeBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         GameHeartbeatRequest.checkByteStringIsUtf8(var1);
         this.serverGameMode_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public final GameHeartbeatRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (GameHeartbeatRequest.Builder)super.setUnknownFields(var1);
      }

      public final GameHeartbeatRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (GameHeartbeatRequest.Builder)super.mergeUnknownFields(var1);
      }
   }

   private static final class ModsDefaultEntryHolder {
      static final MapEntry<String, Boolean> defaultEntry = MapEntry.newDefaultInstance(
         ServiceProto.internal_static_lunarclient_websocket_heartbeat_v1_GameHeartbeatRequest_ModsEntry_descriptor,
         WireFormat.FieldType.STRING,
         "",
         WireFormat.FieldType.BOOL,
         false
      );
   }
}
