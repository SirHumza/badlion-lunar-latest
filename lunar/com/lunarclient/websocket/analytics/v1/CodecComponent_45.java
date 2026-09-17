package com.lunarclient.websocket.analytics.v1;

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

public final class RecordEnabledModsRequest extends GeneratedMessageV3 implements RecordEnabledModsRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int MODS_FIELD_NUMBER = 1;
   private MapField<String, Boolean> mods_;
   private byte memoizedIsInitialized = -1;
   private static final RecordEnabledModsRequest DEFAULT_INSTANCE = new RecordEnabledModsRequest();
   private static final Parser<RecordEnabledModsRequest> PARSER = new AbstractParser<RecordEnabledModsRequest>() {
      public RecordEnabledModsRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RecordEnabledModsRequest.Builder var3 = RecordEnabledModsRequest.newBuilder();

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

   private RecordEnabledModsRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RecordEnabledModsRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RecordEnabledModsRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_analytics_v1_RecordEnabledModsRequest_descriptor;
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
      return ServiceProto.internal_static_lunarclient_websocket_analytics_v1_RecordEnabledModsRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RecordEnabledModsRequest.class, RecordEnabledModsRequest.Builder.class);
   }

   private MapField<String, Boolean> internalGetMods() {
      return this.mods_ == null ? MapField.emptyMapField(RecordEnabledModsRequest.ModsDefaultEntryHolder.defaultEntry) : this.mods_;
   }

   @Override
   public int getModsCount() {
      return this.internalGetMods().getMap().size();
   }

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

   @Override
   public Map<String, Boolean> getModsMap() {
      return this.internalGetMods().getMap();
   }

   @Override
   public boolean getModsOrDefault(String var1, boolean var2) {
      if (var1 == null) {
         throw new NullPointerException("map key");
      }

      Map var3 = this.internalGetMods().getMap();
      return var3.containsKey(var1) ? (Boolean)var3.get(var1) : var2;
   }

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
      GeneratedMessageV3.serializeStringMapTo(var1, this.internalGetMods(), RecordEnabledModsRequest.ModsDefaultEntryHolder.defaultEntry, 1);
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
         MapEntry var4 = RecordEnabledModsRequest.ModsDefaultEntryHolder.defaultEntry
            .newBuilderForType()
            .setKey((String)var3.getKey())
            .setValue((Boolean)var3.getValue())
            .build();
         var1 += CodedOutputStream.computeMessageSize(1, var4);
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

      if (!(var1 instanceof RecordEnabledModsRequest)) {
         return super.equals(var1);
      }

      RecordEnabledModsRequest var2 = (RecordEnabledModsRequest)var1;
      return !this.internalGetMods().equals(var2.internalGetMods()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RecordEnabledModsRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RecordEnabledModsRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RecordEnabledModsRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RecordEnabledModsRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RecordEnabledModsRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RecordEnabledModsRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RecordEnabledModsRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RecordEnabledModsRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RecordEnabledModsRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RecordEnabledModsRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RecordEnabledModsRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RecordEnabledModsRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RecordEnabledModsRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RecordEnabledModsRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RecordEnabledModsRequest.Builder newBuilder(RecordEnabledModsRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RecordEnabledModsRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RecordEnabledModsRequest.Builder() : new RecordEnabledModsRequest.Builder().mergeFrom(this);
   }

   protected RecordEnabledModsRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RecordEnabledModsRequest.Builder(var1);
   }

   public static RecordEnabledModsRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RecordEnabledModsRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<RecordEnabledModsRequest> getParserForType() {
      return PARSER;
   }

   public RecordEnabledModsRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RecordEnabledModsRequest.Builder> implements RecordEnabledModsRequestOrBuilder {
      private int bitField0_;
      private MapField<String, Boolean> mods_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_analytics_v1_RecordEnabledModsRequest_descriptor;
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
         return ServiceProto.internal_static_lunarclient_websocket_analytics_v1_RecordEnabledModsRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RecordEnabledModsRequest.class, RecordEnabledModsRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RecordEnabledModsRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.internalGetMutableMods().clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_analytics_v1_RecordEnabledModsRequest_descriptor;
      }

      public RecordEnabledModsRequest getDefaultInstanceForType() {
         return RecordEnabledModsRequest.getDefaultInstance();
      }

      public RecordEnabledModsRequest build() {
         RecordEnabledModsRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RecordEnabledModsRequest buildPartial() {
         RecordEnabledModsRequest var1 = new RecordEnabledModsRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RecordEnabledModsRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.mods_ = this.internalGetMods();
            var1.mods_.makeImmutable();
         }
      }

      public RecordEnabledModsRequest.Builder clone() {
         return (RecordEnabledModsRequest.Builder)super.clone();
      }

      public RecordEnabledModsRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RecordEnabledModsRequest.Builder)super.setField(var1, var2);
      }

      public RecordEnabledModsRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RecordEnabledModsRequest.Builder)super.clearField(var1);
      }

      public RecordEnabledModsRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RecordEnabledModsRequest.Builder)super.clearOneof(var1);
      }

      public RecordEnabledModsRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RecordEnabledModsRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RecordEnabledModsRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RecordEnabledModsRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public RecordEnabledModsRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof RecordEnabledModsRequest) {
            return this.mergeFrom((RecordEnabledModsRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RecordEnabledModsRequest.Builder mergeFrom(RecordEnabledModsRequest var1) {
         if (var1 == RecordEnabledModsRequest.getDefaultInstance()) {
            return this;
         }

         this.internalGetMutableMods().mergeFrom(var1.internalGetMods());
         this.bitField0_ |= 1;
         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RecordEnabledModsRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     MapEntry var5 = var1.readMessage(RecordEnabledModsRequest.ModsDefaultEntryHolder.defaultEntry.getParserForType(), var2);
                     this.internalGetMutableMods().getMutableMap().put((String)var5.getKey(), (Boolean)var5.getValue());
                     this.bitField0_ |= 1;
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

      private MapField<String, Boolean> internalGetMods() {
         return this.mods_ == null ? MapField.emptyMapField(RecordEnabledModsRequest.ModsDefaultEntryHolder.defaultEntry) : this.mods_;
      }

      private MapField<String, Boolean> internalGetMutableMods() {
         if (this.mods_ == null) {
            this.mods_ = MapField.newMapField(RecordEnabledModsRequest.ModsDefaultEntryHolder.defaultEntry);
         }

         if (!this.mods_.isMutable()) {
            this.mods_ = this.mods_.copy();
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this.mods_;
      }

      @Override
      public int getModsCount() {
         return this.internalGetMods().getMap().size();
      }

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

      @Override
      public Map<String, Boolean> getModsMap() {
         return this.internalGetMods().getMap();
      }

      @Override
      public boolean getModsOrDefault(String var1, boolean var2) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         }

         Map var3 = this.internalGetMods().getMap();
         return var3.containsKey(var1) ? (Boolean)var3.get(var1) : var2;
      }

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

      public RecordEnabledModsRequest.Builder clearMods() {
         this.bitField0_ &= -2;
         this.internalGetMutableMods().getMutableMap().clear();
         return this;
      }

      public RecordEnabledModsRequest.Builder removeMods(String var1) {
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

      public RecordEnabledModsRequest.Builder putMods(String var1, boolean var2) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         }

         this.internalGetMutableMods().getMutableMap().put(var1, var2);
         this.bitField0_ |= 1;
         return this;
      }

      public RecordEnabledModsRequest.Builder putAllMods(Map<String, Boolean> var1) {
         this.internalGetMutableMods().getMutableMap().putAll(var1);
         this.bitField0_ |= 1;
         return this;
      }

      public final RecordEnabledModsRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RecordEnabledModsRequest.Builder)super.setUnknownFields(var1);
      }

      public final RecordEnabledModsRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RecordEnabledModsRequest.Builder)super.mergeUnknownFields(var1);
      }
   }

   private static final class ModsDefaultEntryHolder {
      static final MapEntry<String, Boolean> defaultEntry = MapEntry.newDefaultInstance(
         ServiceProto.internal_static_lunarclient_websocket_analytics_v1_RecordEnabledModsRequest_ModsEntry_descriptor,
         WireFormat.FieldType.STRING,
         "",
         WireFormat.FieldType.BOOL,
         false
      );
   }
}
