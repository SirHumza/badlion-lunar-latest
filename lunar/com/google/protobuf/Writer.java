package com.google.protobuf;

import java.util.List;
import java.util.Map;

@CheckReturnValue
interface Writer {
   Writer.FieldOrder fieldOrder();

   void writeSFixed32(int var1, int var2);

   void writeInt64(int var1, long var2);

   void writeSFixed64(int var1, long var2);

   void writeFloat(int var1, float var2);

   void writeDouble(int var1, double var2);

   void writeEnum(int var1, int var2);

   void writeUInt64(int var1, long var2);

   void writeInt32(int var1, int var2);

   void writeFixed64(int var1, long var2);

   void writeFixed32(int var1, int var2);

   void writeBool(int var1, boolean var2);

   void writeString(int var1, String var2);

   void writeBytes(int var1, ByteString var2);

   void writeUInt32(int var1, int var2);

   void writeSInt32(int var1, int var2);

   void writeSInt64(int var1, long var2);

   void writeMessage(int var1, Object var2);

   void writeMessage(int var1, Object var2, Schema var3);

   @Deprecated
   void writeGroup(int var1, Object var2);

   @Deprecated
   void writeGroup(int var1, Object var2, Schema var3);

   @Deprecated
   void writeStartGroup(int var1);

   @Deprecated
   void writeEndGroup(int var1);

   void writeInt32List(int var1, List<Integer> var2, boolean var3);

   void writeFixed32List(int var1, List<Integer> var2, boolean var3);

   void writeInt64List(int var1, List<Long> var2, boolean var3);

   void writeUInt64List(int var1, List<Long> var2, boolean var3);

   void writeFixed64List(int var1, List<Long> var2, boolean var3);

   void writeFloatList(int var1, List<Float> var2, boolean var3);

   void writeDoubleList(int var1, List<Double> var2, boolean var3);

   void writeEnumList(int var1, List<Integer> var2, boolean var3);

   void writeBoolList(int var1, List<Boolean> var2, boolean var3);

   void writeStringList(int var1, List<String> var2);

   void writeBytesList(int var1, List<ByteString> var2);

   void writeUInt32List(int var1, List<Integer> var2, boolean var3);

   void writeSFixed32List(int var1, List<Integer> var2, boolean var3);

   void writeSFixed64List(int var1, List<Long> var2, boolean var3);

   void writeSInt32List(int var1, List<Integer> var2, boolean var3);

   void writeSInt64List(int var1, List<Long> var2, boolean var3);

   void writeMessageList(int var1, List<?> var2);

   void writeMessageList(int var1, List<?> var2, Schema var3);

   @Deprecated
   void writeGroupList(int var1, List<?> var2);

   @Deprecated
   void writeGroupList(int var1, List<?> var2, Schema var3);

   void writeMessageSetItem(int var1, Object var2);

   <K, V> void writeMap(int var1, MapEntryLite.Metadata<K, V> var2, Map<K, V> var3);

   enum FieldOrder {
      ASCENDING,
      DESCENDING;
   }
}
