package com.google.protobuf;

import java.util.List;
import java.util.Map;

@CheckReturnValue
interface Reader {
   int READ_DONE = Integer.MAX_VALUE;
   int TAG_UNKNOWN = 0;

   boolean shouldDiscardUnknownFields();

   int getFieldNumber();

   int getTag();

   boolean skipField();

   double readDouble();

   float readFloat();

   long readUInt64();

   long readInt64();

   int readInt32();

   long readFixed64();

   int readFixed32();

   boolean readBool();

   String readString();

   String readStringRequireUtf8();

   <T> T readMessageBySchemaWithCheck(Schema<T> var1, ExtensionRegistryLite var2);

   <T> T readMessage(Class<T> var1, ExtensionRegistryLite var2);

   @Deprecated
   <T> T readGroup(Class<T> var1, ExtensionRegistryLite var2);

   @Deprecated
   <T> T readGroupBySchemaWithCheck(Schema<T> var1, ExtensionRegistryLite var2);

   <T> void mergeMessageField(T var1, Schema<T> var2, ExtensionRegistryLite var3);

   <T> void mergeGroupField(T var1, Schema<T> var2, ExtensionRegistryLite var3);

   ByteString readBytes();

   int readUInt32();

   int readEnum();

   int readSFixed32();

   long readSFixed64();

   int readSInt32();

   long readSInt64();

   void readDoubleList(List<Double> var1);

   void readFloatList(List<Float> var1);

   void readUInt64List(List<Long> var1);

   void readInt64List(List<Long> var1);

   void readInt32List(List<Integer> var1);

   void readFixed64List(List<Long> var1);

   void readFixed32List(List<Integer> var1);

   void readBoolList(List<Boolean> var1);

   void readStringList(List<String> var1);

   void readStringListRequireUtf8(List<String> var1);

   <T> void readMessageList(List<T> var1, Schema<T> var2, ExtensionRegistryLite var3);

   <T> void readMessageList(List<T> var1, Class<T> var2, ExtensionRegistryLite var3);

   @Deprecated
   <T> void readGroupList(List<T> var1, Class<T> var2, ExtensionRegistryLite var3);

   @Deprecated
   <T> void readGroupList(List<T> var1, Schema<T> var2, ExtensionRegistryLite var3);

   void readBytesList(List<ByteString> var1);

   void readUInt32List(List<Integer> var1);

   void readEnumList(List<Integer> var1);

   void readSFixed32List(List<Integer> var1);

   void readSFixed64List(List<Long> var1);

   void readSInt32List(List<Integer> var1);

   void readSInt64List(List<Long> var1);

   <K, V> void readMap(Map<K, V> var1, MapEntryLite.Metadata<K, V> var2, ExtensionRegistryLite var3);
}
