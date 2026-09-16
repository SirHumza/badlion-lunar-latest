package com.google.protobuf;

@CheckReturnValue
interface Schema<T> {
   void writeTo(T var1, Writer var2);

   void mergeFrom(T var1, Reader var2, ExtensionRegistryLite var3);

   void mergeFrom(T var1, byte[] var2, int var3, int var4, ArrayDecoders.Registers var5);

   void makeImmutable(T var1);

   boolean isInitialized(T var1);

   T newInstance();

   boolean equals(T var1, T var2);

   int hashCode(T var1);

   void mergeFrom(T var1, T var2);

   int getSerializedSize(T var1);
}
