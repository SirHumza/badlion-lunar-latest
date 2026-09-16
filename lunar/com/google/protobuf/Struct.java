package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Map.Entry;

public final class Struct extends GeneratedMessageV3 implements StructOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int FIELDS_FIELD_NUMBER = 1;
   private MapField<String, Value> fields_;
   private byte memoizedIsInitialized = -1;
   private static final Struct DEFAULT_INSTANCE = new Struct();
   private static final Parser<Struct> PARSER = new AbstractParser<Struct>() {
      public Struct parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Struct.Builder var3 = Struct.newBuilder();

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

   private Struct(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Struct() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Struct();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return StructProto.internal_static_google_protobuf_Struct_descriptor;
   }

   @Override
   protected MapFieldReflectionAccessor internalGetMapFieldReflection(int var1) {
      switch (var1) {
         case 1:
            return this.internalGetFields();
         default:
            throw new RuntimeException("Invalid map field number: " + var1);
      }
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return StructProto.internal_static_google_protobuf_Struct_fieldAccessorTable.ensureFieldAccessorsInitialized(Struct.class, Struct.Builder.class);
   }

   private MapField<String, Value> internalGetFields() {
      return this.fields_ == null ? MapField.emptyMapField(Struct.FieldsDefaultEntryHolder.defaultEntry) : this.fields_;
   }

   @Override
   public int getFieldsCount() {
      return this.internalGetFields().getMap().size();
   }

   @Override
   public boolean containsFields(String var1) {
      if (var1 == null) {
         throw new NullPointerException("map key");
      } else {
         return this.internalGetFields().getMap().containsKey(var1);
      }
   }

   @Deprecated
   @Override
   public Map<String, Value> getFields() {
      return this.getFieldsMap();
   }

   @Override
   public Map<String, Value> getFieldsMap() {
      return this.internalGetFields().getMap();
   }

   @Override
   public Value getFieldsOrDefault(String var1, Value var2) {
      if (var1 == null) {
         throw new NullPointerException("map key");
      }

      Map var3 = this.internalGetFields().getMap();
      return var3.containsKey(var1) ? (Value)var3.get(var1) : var2;
   }

   @Override
   public Value getFieldsOrThrow(String var1) {
      if (var1 == null) {
         throw new NullPointerException("map key");
      } else {
         Map var2 = this.internalGetFields().getMap();
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
      GeneratedMessageV3.serializeStringMapTo(var1, this.internalGetFields(), Struct.FieldsDefaultEntryHolder.defaultEntry, 1);
      this.getUnknownFields().writeTo(var1);
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      var1 = 0;

      for (Entry var3 : this.internalGetFields().getMap().entrySet()) {
         MapEntry var4 = Struct.FieldsDefaultEntryHolder.defaultEntry
            .newBuilderForType()
            .setKey((String)var3.getKey())
            .setValue((Value)var3.getValue())
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

      if (!(var1 instanceof Struct)) {
         return super.equals(var1);
      }

      Struct var2 = (Struct)var1;
      return !this.internalGetFields().equals(var2.internalGetFields()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (!this.internalGetFields().getMap().isEmpty()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.internalGetFields().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Struct parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Struct parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Struct parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Struct parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Struct parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Struct parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Struct parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Struct parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Struct parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Struct parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Struct parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Struct parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Struct.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Struct.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Struct.Builder newBuilder(Struct var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Struct.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Struct.Builder() : new Struct.Builder().mergeFrom(this);
   }

   protected Struct.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Struct.Builder(var1);
   }

   public static Struct getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Struct> parser() {
      return PARSER;
   }

   @Override
   public Parser<Struct> getParserForType() {
      return PARSER;
   }

   public Struct getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Struct.Builder> implements StructOrBuilder {
      private int bitField0_;
      private static final Struct.Builder.FieldsConverter fieldsConverter = new Struct.Builder.FieldsConverter();
      private MapFieldBuilder<String, ValueOrBuilder, Value, Value.Builder> fields_;

      public static final Descriptors.Descriptor getDescriptor() {
         return StructProto.internal_static_google_protobuf_Struct_descriptor;
      }

      @Override
      protected MapFieldReflectionAccessor internalGetMapFieldReflection(int var1) {
         switch (var1) {
            case 1:
               return this.internalGetFields();
            default:
               throw new RuntimeException("Invalid map field number: " + var1);
         }
      }

      @Override
      protected MapFieldReflectionAccessor internalGetMutableMapFieldReflection(int var1) {
         switch (var1) {
            case 1:
               return this.internalGetMutableFields();
            default:
               throw new RuntimeException("Invalid map field number: " + var1);
         }
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StructProto.internal_static_google_protobuf_Struct_fieldAccessorTable.ensureFieldAccessorsInitialized(Struct.class, Struct.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public Struct.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.internalGetMutableFields().clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return StructProto.internal_static_google_protobuf_Struct_descriptor;
      }

      public Struct getDefaultInstanceForType() {
         return Struct.getDefaultInstance();
      }

      public Struct build() {
         Struct var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Struct buildPartial() {
         Struct var1 = new Struct(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Struct var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.fields_ = this.internalGetFields().build(Struct.FieldsDefaultEntryHolder.defaultEntry);
         }
      }

      public Struct.Builder clone() {
         return (Struct.Builder)super.clone();
      }

      public Struct.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Struct.Builder)super.setField(var1, var2);
      }

      public Struct.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Struct.Builder)super.clearField(var1);
      }

      public Struct.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Struct.Builder)super.clearOneof(var1);
      }

      public Struct.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Struct.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Struct.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Struct.Builder)super.addRepeatedField(var1, var2);
      }

      public Struct.Builder mergeFrom(Message var1) {
         if (var1 instanceof Struct) {
            return this.mergeFrom((Struct)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Struct.Builder mergeFrom(Struct var1) {
         if (var1 == Struct.getDefaultInstance()) {
            return this;
         }

         this.internalGetMutableFields().mergeFrom(var1.internalGetFields());
         this.bitField0_ |= 1;
         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public Struct.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     MapEntry var5 = var1.readMessage(Struct.FieldsDefaultEntryHolder.defaultEntry.getParserForType(), var2);
                     this.internalGetMutableFields().ensureBuilderMap().put((String)var5.getKey(), (ValueOrBuilder)var5.getValue());
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

      private MapFieldBuilder<String, ValueOrBuilder, Value, Value.Builder> internalGetFields() {
         return this.fields_ == null ? new MapFieldBuilder<>(fieldsConverter) : this.fields_;
      }

      private MapFieldBuilder<String, ValueOrBuilder, Value, Value.Builder> internalGetMutableFields() {
         if (this.fields_ == null) {
            this.fields_ = new MapFieldBuilder<>(fieldsConverter);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this.fields_;
      }

      @Override
      public int getFieldsCount() {
         return this.internalGetFields().ensureBuilderMap().size();
      }

      @Override
      public boolean containsFields(String var1) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         } else {
            return this.internalGetFields().ensureBuilderMap().containsKey(var1);
         }
      }

      @Deprecated
      @Override
      public Map<String, Value> getFields() {
         return this.getFieldsMap();
      }

      @Override
      public Map<String, Value> getFieldsMap() {
         return this.internalGetFields().getImmutableMap();
      }

      @Override
      public Value getFieldsOrDefault(String var1, Value var2) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         }

         Map var3 = this.internalGetMutableFields().ensureBuilderMap();
         return var3.containsKey(var1) ? fieldsConverter.build((ValueOrBuilder)var3.get(var1)) : var2;
      }

      @Override
      public Value getFieldsOrThrow(String var1) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         } else {
            Map var2 = this.internalGetMutableFields().ensureBuilderMap();
            if (!var2.containsKey(var1)) {
               throw new IllegalArgumentException();
            } else {
               return fieldsConverter.build((ValueOrBuilder)var2.get(var1));
            }
         }
      }

      public Struct.Builder clearFields() {
         this.bitField0_ &= -2;
         this.internalGetMutableFields().clear();
         return this;
      }

      public Struct.Builder removeFields(String var1) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         }

         this.internalGetMutableFields().ensureBuilderMap().remove(var1);
         return this;
      }

      @Deprecated
      public Map<String, Value> getMutableFields() {
         this.bitField0_ |= 1;
         return this.internalGetMutableFields().ensureMessageMap();
      }

      public Struct.Builder putFields(String var1, Value var2) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         }

         if (var2 == null) {
            throw new NullPointerException("map value");
         }

         this.internalGetMutableFields().ensureBuilderMap().put(var1, var2);
         this.bitField0_ |= 1;
         return this;
      }

      public Struct.Builder putAllFields(Map<String, Value> var1) {
         for (Entry var3 : var1.entrySet()) {
            if (var3.getKey() == null || var3.getValue() == null) {
               throw new NullPointerException();
            }
         }

         this.internalGetMutableFields().ensureBuilderMap().putAll(var1);
         this.bitField0_ |= 1;
         return this;
      }

      public Value.Builder putFieldsBuilderIfAbsent(String var1) {
         Map var2 = this.internalGetMutableFields().ensureBuilderMap();
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

      public final Struct.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Struct.Builder)super.setUnknownFields(var1);
      }

      public final Struct.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Struct.Builder)super.mergeUnknownFields(var1);
      }

      private static final class FieldsConverter implements MapFieldBuilder.Converter<String, ValueOrBuilder, Value> {
         private FieldsConverter() {
         }

         public Value build(ValueOrBuilder var1) {
            return var1 instanceof Value ? (Value)var1 : ((Value.Builder)var1).build();
         }

         @Override
         public MapEntry<String, Value> defaultEntry() {
            return Struct.FieldsDefaultEntryHolder.defaultEntry;
         }
      }
   }

   private static final class FieldsDefaultEntryHolder {
      static final MapEntry<String, Value> defaultEntry = MapEntry.newDefaultInstance(
         StructProto.internal_static_google_protobuf_Struct_FieldsEntry_descriptor,
         WireFormat.FieldType.STRING,
         "",
         WireFormat.FieldType.MESSAGE,
         Value.getDefaultInstance()
      );
   }
}
