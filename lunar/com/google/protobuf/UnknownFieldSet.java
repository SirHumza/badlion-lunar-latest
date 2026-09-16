package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public final class UnknownFieldSet implements MessageLite {
   private final TreeMap<Integer, UnknownFieldSet.Field> fields;
   private static final UnknownFieldSet defaultInstance = new UnknownFieldSet(new TreeMap<>());
   private static final UnknownFieldSet.Parser PARSER = new UnknownFieldSet.Parser();

   private UnknownFieldSet(TreeMap<Integer, UnknownFieldSet.Field> var1) {
      this.fields = var1;
   }

   public static UnknownFieldSet.Builder newBuilder() {
      return UnknownFieldSet.Builder.create();
   }

   public static UnknownFieldSet.Builder newBuilder(UnknownFieldSet var0) {
      return newBuilder().mergeFrom(var0);
   }

   public static UnknownFieldSet getDefaultInstance() {
      return defaultInstance;
   }

   public UnknownFieldSet getDefaultInstanceForType() {
      return defaultInstance;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof UnknownFieldSet && this.fields.equals(((UnknownFieldSet)var1).fields);
   }

   @Override
   public int hashCode() {
      return this.fields.isEmpty() ? 0 : this.fields.hashCode();
   }

   public Map<Integer, UnknownFieldSet.Field> asMap() {
      return (Map<Integer, UnknownFieldSet.Field>)this.fields.clone();
   }

   public boolean hasField(int var1) {
      return this.fields.containsKey(var1);
   }

   public UnknownFieldSet.Field getField(int var1) {
      UnknownFieldSet.Field var2 = this.fields.get(var1);
      return var2 == null ? UnknownFieldSet.Field.getDefaultInstance() : var2;
   }

   @Override
   public void writeTo(CodedOutputStream var1) {
      for (Entry var3 : this.fields.entrySet()) {
         UnknownFieldSet.Field var4 = (UnknownFieldSet.Field)var3.getValue();
         var4.writeTo((Integer)var3.getKey(), var1);
      }
   }

   @Override
   public String toString() {
      return TextFormat.printer().printToString(this);
   }

   @Override
   public ByteString toByteString() {
      try {
         ByteString.CodedBuilder var1 = ByteString.newCodedBuilder(this.getSerializedSize());
         this.writeTo(var1.getCodedOutput());
         return var1.build();
      } catch (IOException var2) {
         throw new RuntimeException("Serializing to a ByteString threw an IOException (should never happen).", var2);
      }
   }

   @Override
   public byte[] toByteArray() {
      try {
         byte[] var1 = new byte[this.getSerializedSize()];
         CodedOutputStream var2 = CodedOutputStream.newInstance(var1);
         this.writeTo(var2);
         var2.checkNoSpaceLeft();
         return var1;
      } catch (IOException var3) {
         throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", var3);
      }
   }

   @Override
   public void writeTo(OutputStream var1) {
      CodedOutputStream var2 = CodedOutputStream.newInstance(var1);
      this.writeTo(var2);
      var2.flush();
   }

   @Override
   public void writeDelimitedTo(OutputStream var1) {
      CodedOutputStream var2 = CodedOutputStream.newInstance(var1);
      var2.writeUInt32NoTag(this.getSerializedSize());
      this.writeTo(var2);
      var2.flush();
   }

   @Override
   public int getSerializedSize() {
      int var1 = 0;
      if (!this.fields.isEmpty()) {
         for (Entry var3 : this.fields.entrySet()) {
            var1 += ((UnknownFieldSet.Field)var3.getValue()).getSerializedSize((Integer)var3.getKey());
         }
      }

      return var1;
   }

   public void writeAsMessageSetTo(CodedOutputStream var1) {
      for (Entry var3 : this.fields.entrySet()) {
         ((UnknownFieldSet.Field)var3.getValue()).writeAsMessageSetExtensionTo((Integer)var3.getKey(), var1);
      }
   }

   void writeTo(Writer var1) {
      if (var1.fieldOrder() == Writer.FieldOrder.DESCENDING) {
         for (Entry var3 : this.fields.descendingMap().entrySet()) {
            ((UnknownFieldSet.Field)var3.getValue()).writeTo((Integer)var3.getKey(), var1);
         }
      } else {
         for (Entry var5 : this.fields.entrySet()) {
            ((UnknownFieldSet.Field)var5.getValue()).writeTo((Integer)var5.getKey(), var1);
         }
      }
   }

   void writeAsMessageSetTo(Writer var1) {
      if (var1.fieldOrder() == Writer.FieldOrder.DESCENDING) {
         for (Entry var3 : this.fields.descendingMap().entrySet()) {
            ((UnknownFieldSet.Field)var3.getValue()).writeAsMessageSetExtensionTo((Integer)var3.getKey(), var1);
         }
      } else {
         for (Entry var5 : this.fields.entrySet()) {
            ((UnknownFieldSet.Field)var5.getValue()).writeAsMessageSetExtensionTo((Integer)var5.getKey(), var1);
         }
      }
   }

   public int getSerializedSizeAsMessageSet() {
      int var1 = 0;

      for (Entry var3 : this.fields.entrySet()) {
         var1 += ((UnknownFieldSet.Field)var3.getValue()).getSerializedSizeAsMessageSetExtension((Integer)var3.getKey());
      }

      return var1;
   }

   @Override
   public boolean isInitialized() {
      return true;
   }

   public static UnknownFieldSet parseFrom(CodedInputStream var0) {
      return newBuilder().mergeFrom(var0).build();
   }

   public static UnknownFieldSet parseFrom(ByteString var0) {
      return newBuilder().mergeFrom(var0).build();
   }

   public static UnknownFieldSet parseFrom(byte[] var0) {
      return newBuilder().mergeFrom(var0).build();
   }

   public static UnknownFieldSet parseFrom(InputStream var0) {
      return newBuilder().mergeFrom(var0).build();
   }

   public UnknownFieldSet.Builder newBuilderForType() {
      return newBuilder();
   }

   public UnknownFieldSet.Builder toBuilder() {
      return newBuilder().mergeFrom(this);
   }

   public final UnknownFieldSet.Parser getParserForType() {
      return PARSER;
   }

   public static final class Builder implements MessageLite.Builder {
      private TreeMap<Integer, UnknownFieldSet.Field.Builder> fieldBuilders = new TreeMap<>();

      private Builder() {
      }

      private static UnknownFieldSet.Builder create() {
         return new UnknownFieldSet.Builder();
      }

      private UnknownFieldSet.Field.Builder getFieldBuilder(int var1) {
         if (var1 == 0) {
            return null;
         }

         UnknownFieldSet.Field.Builder var2 = this.fieldBuilders.get(var1);
         if (var2 == null) {
            var2 = UnknownFieldSet.Field.newBuilder();
            this.fieldBuilders.put(var1, var2);
         }

         return var2;
      }

      public UnknownFieldSet build() {
         UnknownFieldSet var1;
         if (this.fieldBuilders.isEmpty()) {
            var1 = UnknownFieldSet.getDefaultInstance();
         } else {
            TreeMap var2 = new TreeMap();

            for (Entry var4 : this.fieldBuilders.entrySet()) {
               var2.put((Integer)var4.getKey(), ((UnknownFieldSet.Field.Builder)var4.getValue()).build());
            }

            var1 = new UnknownFieldSet(var2);
         }

         return var1;
      }

      public UnknownFieldSet buildPartial() {
         return this.build();
      }

      public UnknownFieldSet.Builder clone() {
         UnknownFieldSet.Builder var1 = UnknownFieldSet.newBuilder();

         for (Entry var3 : this.fieldBuilders.entrySet()) {
            Integer var4 = (Integer)var3.getKey();
            UnknownFieldSet.Field.Builder var5 = (UnknownFieldSet.Field.Builder)var3.getValue();
            var1.fieldBuilders.put(var4, var5.clone());
         }

         return var1;
      }

      public UnknownFieldSet getDefaultInstanceForType() {
         return UnknownFieldSet.getDefaultInstance();
      }

      public UnknownFieldSet.Builder clear() {
         this.fieldBuilders = new TreeMap<>();
         return this;
      }

      public UnknownFieldSet.Builder clearField(int var1) {
         if (var1 <= 0) {
            throw new IllegalArgumentException(var1 + " is not a valid field number.");
         }

         if (this.fieldBuilders.containsKey(var1)) {
            this.fieldBuilders.remove(var1);
         }

         return this;
      }

      public UnknownFieldSet.Builder mergeFrom(UnknownFieldSet var1) {
         if (var1 != UnknownFieldSet.getDefaultInstance()) {
            for (Entry var3 : var1.fields.entrySet()) {
               this.mergeField((Integer)var3.getKey(), (UnknownFieldSet.Field)var3.getValue());
            }
         }

         return this;
      }

      public UnknownFieldSet.Builder mergeField(int var1, UnknownFieldSet.Field var2) {
         if (var1 <= 0) {
            throw new IllegalArgumentException(var1 + " is not a valid field number.");
         }

         if (this.hasField(var1)) {
            this.getFieldBuilder(var1).mergeFrom(var2);
         } else {
            this.addField(var1, var2);
         }

         return this;
      }

      public UnknownFieldSet.Builder mergeVarintField(int var1, int var2) {
         if (var1 <= 0) {
            throw new IllegalArgumentException(var1 + " is not a valid field number.");
         }

         this.getFieldBuilder(var1).addVarint(var2);
         return this;
      }

      public UnknownFieldSet.Builder mergeLengthDelimitedField(int var1, ByteString var2) {
         if (var1 <= 0) {
            throw new IllegalArgumentException(var1 + " is not a valid field number.");
         }

         this.getFieldBuilder(var1).addLengthDelimited(var2);
         return this;
      }

      public boolean hasField(int var1) {
         return this.fieldBuilders.containsKey(var1);
      }

      public UnknownFieldSet.Builder addField(int var1, UnknownFieldSet.Field var2) {
         if (var1 <= 0) {
            throw new IllegalArgumentException(var1 + " is not a valid field number.");
         }

         this.fieldBuilders.put(var1, UnknownFieldSet.Field.newBuilder(var2));
         return this;
      }

      public Map<Integer, UnknownFieldSet.Field> asMap() {
         TreeMap var1 = new TreeMap();

         for (Entry var3 : this.fieldBuilders.entrySet()) {
            var1.put((Integer)var3.getKey(), ((UnknownFieldSet.Field.Builder)var3.getValue()).build());
         }

         return Collections.unmodifiableMap(var1);
      }

      public UnknownFieldSet.Builder mergeFrom(CodedInputStream var1) {
         int var2;
         do {
            var2 = var1.readTag();
         } while (var2 != 0 && this.mergeFieldFrom(var2, var1));

         return this;
      }

      public boolean mergeFieldFrom(int var1, CodedInputStream var2) {
         int var3 = WireFormat.getTagFieldNumber(var1);
         switch (WireFormat.getTagWireType(var1)) {
            case 0:
               this.getFieldBuilder(var3).addVarint(var2.readInt64());
               return true;
            case 1:
               this.getFieldBuilder(var3).addFixed64(var2.readFixed64());
               return true;
            case 2:
               this.getFieldBuilder(var3).addLengthDelimited(var2.readBytes());
               return true;
            case 3:
               UnknownFieldSet.Builder var4 = UnknownFieldSet.newBuilder();
               var2.readGroup(var3, var4, ExtensionRegistry.getEmptyRegistry());
               this.getFieldBuilder(var3).addGroup(var4.build());
               return true;
            case 4:
               return false;
            case 5:
               this.getFieldBuilder(var3).addFixed32(var2.readFixed32());
               return true;
            default:
               throw InvalidProtocolBufferException.invalidWireType();
         }
      }

      public UnknownFieldSet.Builder mergeFrom(ByteString var1) {
         try {
            CodedInputStream var2 = var1.newCodedInput();
            this.mergeFrom(var2);
            var2.checkLastTagWas(0);
            return this;
         } catch (InvalidProtocolBufferException var3) {
            throw var3;
         } catch (IOException var4) {
            throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", var4);
         }
      }

      public UnknownFieldSet.Builder mergeFrom(byte[] var1) {
         try {
            CodedInputStream var2 = CodedInputStream.newInstance(var1);
            this.mergeFrom(var2);
            var2.checkLastTagWas(0);
            return this;
         } catch (InvalidProtocolBufferException var3) {
            throw var3;
         } catch (IOException var4) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", var4);
         }
      }

      public UnknownFieldSet.Builder mergeFrom(InputStream var1) {
         CodedInputStream var2 = CodedInputStream.newInstance(var1);
         this.mergeFrom(var2);
         var2.checkLastTagWas(0);
         return this;
      }

      @Override
      public boolean mergeDelimitedFrom(InputStream var1) {
         int var2 = var1.read();
         if (var2 == -1) {
            return false;
         }

         int var3 = CodedInputStream.readRawVarint32(var2, var1);
         AbstractMessageLite.Builder.LimitedInputStream var4 = new AbstractMessageLite.Builder.LimitedInputStream(var1, var3);
         this.mergeFrom(var4);
         return true;
      }

      @Override
      public boolean mergeDelimitedFrom(InputStream var1, ExtensionRegistryLite var2) {
         return this.mergeDelimitedFrom(var1);
      }

      public UnknownFieldSet.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         return this.mergeFrom(var1);
      }

      public UnknownFieldSet.Builder mergeFrom(ByteString var1, ExtensionRegistryLite var2) {
         return this.mergeFrom(var1);
      }

      public UnknownFieldSet.Builder mergeFrom(byte[] var1, int var2, int var3) {
         try {
            CodedInputStream var4 = CodedInputStream.newInstance(var1, var2, var3);
            this.mergeFrom(var4);
            var4.checkLastTagWas(0);
            return this;
         } catch (InvalidProtocolBufferException var5) {
            throw var5;
         } catch (IOException var6) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", var6);
         }
      }

      public UnknownFieldSet.Builder mergeFrom(byte[] var1, ExtensionRegistryLite var2) {
         return this.mergeFrom(var1);
      }

      public UnknownFieldSet.Builder mergeFrom(byte[] var1, int var2, int var3, ExtensionRegistryLite var4) {
         return this.mergeFrom(var1, var2, var3);
      }

      public UnknownFieldSet.Builder mergeFrom(InputStream var1, ExtensionRegistryLite var2) {
         return this.mergeFrom(var1);
      }

      public UnknownFieldSet.Builder mergeFrom(MessageLite var1) {
         if (var1 instanceof UnknownFieldSet) {
            return this.mergeFrom((UnknownFieldSet)var1);
         } else {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
         }
      }

      @Override
      public boolean isInitialized() {
         return true;
      }
   }

   public static final class Field {
      private static final UnknownFieldSet.Field fieldDefaultInstance = newBuilder().build();
      private List<Long> varint;
      private List<Integer> fixed32;
      private List<Long> fixed64;
      private List<ByteString> lengthDelimited;
      private List<UnknownFieldSet> group;

      private Field() {
      }

      public static UnknownFieldSet.Field.Builder newBuilder() {
         return UnknownFieldSet.Field.Builder.create();
      }

      public static UnknownFieldSet.Field.Builder newBuilder(UnknownFieldSet.Field var0) {
         return newBuilder().mergeFrom(var0);
      }

      public static UnknownFieldSet.Field getDefaultInstance() {
         return fieldDefaultInstance;
      }

      public List<Long> getVarintList() {
         return this.varint;
      }

      public List<Integer> getFixed32List() {
         return this.fixed32;
      }

      public List<Long> getFixed64List() {
         return this.fixed64;
      }

      public List<ByteString> getLengthDelimitedList() {
         return this.lengthDelimited;
      }

      public List<UnknownFieldSet> getGroupList() {
         return this.group;
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else {
            return !(var1 instanceof UnknownFieldSet.Field) ? false : Arrays.equals(this.getIdentityArray(), ((UnknownFieldSet.Field)var1).getIdentityArray());
         }
      }

      @Override
      public int hashCode() {
         return Arrays.hashCode(this.getIdentityArray());
      }

      private Object[] getIdentityArray() {
         return new Object[]{this.varint, this.fixed32, this.fixed64, this.lengthDelimited, this.group};
      }

      public ByteString toByteString(int var1) {
         try {
            ByteString.CodedBuilder var2 = ByteString.newCodedBuilder(this.getSerializedSize(var1));
            this.writeTo(var1, var2.getCodedOutput());
            return var2.build();
         } catch (IOException var3) {
            throw new RuntimeException("Serializing to a ByteString should never fail with an IOException", var3);
         }
      }

      public void writeTo(int var1, CodedOutputStream var2) {
         for (long var4 : this.varint) {
            var2.writeUInt64(var1, var4);
         }

         for (int var10 : this.fixed32) {
            var2.writeFixed32(var1, var10);
         }

         for (long var11 : this.fixed64) {
            var2.writeFixed64(var1, var11);
         }

         for (ByteString var12 : this.lengthDelimited) {
            var2.writeBytes(var1, var12);
         }

         for (UnknownFieldSet var13 : this.group) {
            var2.writeGroup(var1, var13);
         }
      }

      public int getSerializedSize(int var1) {
         int var2 = 0;

         for (long var4 : this.varint) {
            var2 += CodedOutputStream.computeUInt64Size(var1, var4);
         }

         for (int var10 : this.fixed32) {
            var2 += CodedOutputStream.computeFixed32Size(var1, var10);
         }

         for (long var11 : this.fixed64) {
            var2 += CodedOutputStream.computeFixed64Size(var1, var11);
         }

         for (ByteString var12 : this.lengthDelimited) {
            var2 += CodedOutputStream.computeBytesSize(var1, var12);
         }

         for (UnknownFieldSet var13 : this.group) {
            var2 += CodedOutputStream.computeGroupSize(var1, var13);
         }

         return var2;
      }

      public void writeAsMessageSetExtensionTo(int var1, CodedOutputStream var2) {
         for (ByteString var4 : this.lengthDelimited) {
            var2.writeRawMessageSetExtension(var1, var4);
         }
      }

      void writeTo(int var1, Writer var2) {
         var2.writeInt64List(var1, this.varint, false);
         var2.writeFixed32List(var1, this.fixed32, false);
         var2.writeFixed64List(var1, this.fixed64, false);
         var2.writeBytesList(var1, this.lengthDelimited);
         if (var2.fieldOrder() == Writer.FieldOrder.ASCENDING) {
            for (int var3 = 0; var3 < this.group.size(); var3++) {
               var2.writeStartGroup(var1);
               this.group.get(var3).writeTo(var2);
               var2.writeEndGroup(var1);
            }
         } else {
            for (int var4 = this.group.size() - 1; var4 >= 0; var4--) {
               var2.writeEndGroup(var1);
               this.group.get(var4).writeTo(var2);
               var2.writeStartGroup(var1);
            }
         }
      }

      private void writeAsMessageSetExtensionTo(int var1, Writer var2) {
         if (var2.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            ListIterator var3 = this.lengthDelimited.listIterator(this.lengthDelimited.size());

            while (var3.hasPrevious()) {
               var2.writeMessageSetItem(var1, var3.previous());
            }
         } else {
            for (ByteString var4 : this.lengthDelimited) {
               var2.writeMessageSetItem(var1, var4);
            }
         }
      }

      public int getSerializedSizeAsMessageSetExtension(int var1) {
         int var2 = 0;

         for (ByteString var4 : this.lengthDelimited) {
            var2 += CodedOutputStream.computeRawMessageSetExtensionSize(var1, var4);
         }

         return var2;
      }

      public static final class Builder {
         private UnknownFieldSet.Field result = new UnknownFieldSet.Field();

         private Builder() {
         }

         private static UnknownFieldSet.Field.Builder create() {
            return new UnknownFieldSet.Field.Builder();
         }

         public UnknownFieldSet.Field.Builder clone() {
            UnknownFieldSet.Field var1 = new UnknownFieldSet.Field();
            if (this.result.varint == null) {
               var1.varint = null;
            } else {
               var1.varint = new ArrayList<>(this.result.varint);
            }

            if (this.result.fixed32 == null) {
               var1.fixed32 = null;
            } else {
               var1.fixed32 = new ArrayList<>(this.result.fixed32);
            }

            if (this.result.fixed64 == null) {
               var1.fixed64 = null;
            } else {
               var1.fixed64 = new ArrayList<>(this.result.fixed64);
            }

            if (this.result.lengthDelimited == null) {
               var1.lengthDelimited = null;
            } else {
               var1.lengthDelimited = new ArrayList<>(this.result.lengthDelimited);
            }

            if (this.result.group == null) {
               var1.group = null;
            } else {
               var1.group = new ArrayList<>(this.result.group);
            }

            UnknownFieldSet.Field.Builder var2 = new UnknownFieldSet.Field.Builder();
            var2.result = var1;
            return var2;
         }

         public UnknownFieldSet.Field build() {
            UnknownFieldSet.Field var1 = new UnknownFieldSet.Field();
            if (this.result.varint == null) {
               var1.varint = Collections.emptyList();
            } else {
               var1.varint = Collections.unmodifiableList(new ArrayList<>(this.result.varint));
            }

            if (this.result.fixed32 == null) {
               var1.fixed32 = Collections.emptyList();
            } else {
               var1.fixed32 = Collections.unmodifiableList(new ArrayList<>(this.result.fixed32));
            }

            if (this.result.fixed64 == null) {
               var1.fixed64 = Collections.emptyList();
            } else {
               var1.fixed64 = Collections.unmodifiableList(new ArrayList<>(this.result.fixed64));
            }

            if (this.result.lengthDelimited == null) {
               var1.lengthDelimited = Collections.emptyList();
            } else {
               var1.lengthDelimited = Collections.unmodifiableList(new ArrayList<>(this.result.lengthDelimited));
            }

            if (this.result.group == null) {
               var1.group = Collections.emptyList();
            } else {
               var1.group = Collections.unmodifiableList(new ArrayList<>(this.result.group));
            }

            return var1;
         }

         public UnknownFieldSet.Field.Builder clear() {
            this.result = new UnknownFieldSet.Field();
            return this;
         }

         public UnknownFieldSet.Field.Builder mergeFrom(UnknownFieldSet.Field var1) {
            if (!var1.varint.isEmpty()) {
               if (this.result.varint == null) {
                  this.result.varint = new ArrayList<>();
               }

               this.result.varint.addAll(var1.varint);
            }

            if (!var1.fixed32.isEmpty()) {
               if (this.result.fixed32 == null) {
                  this.result.fixed32 = new ArrayList<>();
               }

               this.result.fixed32.addAll(var1.fixed32);
            }

            if (!var1.fixed64.isEmpty()) {
               if (this.result.fixed64 == null) {
                  this.result.fixed64 = new ArrayList<>();
               }

               this.result.fixed64.addAll(var1.fixed64);
            }

            if (!var1.lengthDelimited.isEmpty()) {
               if (this.result.lengthDelimited == null) {
                  this.result.lengthDelimited = new ArrayList<>();
               }

               this.result.lengthDelimited.addAll(var1.lengthDelimited);
            }

            if (!var1.group.isEmpty()) {
               if (this.result.group == null) {
                  this.result.group = new ArrayList<>();
               }

               this.result.group.addAll(var1.group);
            }

            return this;
         }

         public UnknownFieldSet.Field.Builder addVarint(long var1) {
            if (this.result.varint == null) {
               this.result.varint = new ArrayList<>();
            }

            this.result.varint.add(var1);
            return this;
         }

         public UnknownFieldSet.Field.Builder addFixed32(int var1) {
            if (this.result.fixed32 == null) {
               this.result.fixed32 = new ArrayList<>();
            }

            this.result.fixed32.add(var1);
            return this;
         }

         public UnknownFieldSet.Field.Builder addFixed64(long var1) {
            if (this.result.fixed64 == null) {
               this.result.fixed64 = new ArrayList<>();
            }

            this.result.fixed64.add(var1);
            return this;
         }

         public UnknownFieldSet.Field.Builder addLengthDelimited(ByteString var1) {
            if (this.result.lengthDelimited == null) {
               this.result.lengthDelimited = new ArrayList<>();
            }

            this.result.lengthDelimited.add(var1);
            return this;
         }

         public UnknownFieldSet.Field.Builder addGroup(UnknownFieldSet var1) {
            if (this.result.group == null) {
               this.result.group = new ArrayList<>();
            }

            this.result.group.add(var1);
            return this;
         }
      }
   }

   public static final class Parser extends AbstractParser<UnknownFieldSet> {
      public UnknownFieldSet parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UnknownFieldSet.Builder var3 = UnknownFieldSet.newBuilder();

         try {
            var3.mergeFrom(var1);
         } catch (InvalidProtocolBufferException var5) {
            throw var5.setUnfinishedMessage(var3.buildPartial());
         } catch (IOException var6) {
            throw new InvalidProtocolBufferException(var6).setUnfinishedMessage(var3.buildPartial());
         }

         return var3.buildPartial();
      }
   }
}
