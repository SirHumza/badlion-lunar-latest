package com.google.protobuf;

import java.io.InputStream;
import java.io.OutputStream;

@CheckReturnValue
public interface MessageLite extends MessageLiteOrBuilder {
   void writeTo(CodedOutputStream var1);

   int getSerializedSize();

   Parser<? extends MessageLite> getParserForType();

   ByteString toByteString();

   byte[] toByteArray();

   void writeTo(OutputStream var1);

   void writeDelimitedTo(OutputStream var1);

   MessageLite.Builder newBuilderForType();

   MessageLite.Builder toBuilder();

   interface Builder extends MessageLiteOrBuilder, Cloneable {
      @CanIgnoreReturnValue
      MessageLite.Builder clear();

      MessageLite build();

      MessageLite buildPartial();

      MessageLite.Builder clone();

      @CanIgnoreReturnValue
      MessageLite.Builder mergeFrom(CodedInputStream var1);

      @CanIgnoreReturnValue
      MessageLite.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2);

      @CanIgnoreReturnValue
      MessageLite.Builder mergeFrom(ByteString var1);

      @CanIgnoreReturnValue
      MessageLite.Builder mergeFrom(ByteString var1, ExtensionRegistryLite var2);

      @CanIgnoreReturnValue
      MessageLite.Builder mergeFrom(byte[] var1);

      @CanIgnoreReturnValue
      MessageLite.Builder mergeFrom(byte[] var1, int var2, int var3);

      @CanIgnoreReturnValue
      MessageLite.Builder mergeFrom(byte[] var1, ExtensionRegistryLite var2);

      @CanIgnoreReturnValue
      MessageLite.Builder mergeFrom(byte[] var1, int var2, int var3, ExtensionRegistryLite var4);

      @CanIgnoreReturnValue
      MessageLite.Builder mergeFrom(InputStream var1);

      @CanIgnoreReturnValue
      MessageLite.Builder mergeFrom(InputStream var1, ExtensionRegistryLite var2);

      @CanIgnoreReturnValue
      MessageLite.Builder mergeFrom(MessageLite var1);

      boolean mergeDelimitedFrom(InputStream var1);

      boolean mergeDelimitedFrom(InputStream var1, ExtensionRegistryLite var2);
   }
}
