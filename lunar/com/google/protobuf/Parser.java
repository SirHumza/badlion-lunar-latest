package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

public interface Parser<MessageType> {
   MessageType parseFrom(CodedInputStream var1);

   MessageType parseFrom(CodedInputStream var1, ExtensionRegistryLite var2);

   MessageType parsePartialFrom(CodedInputStream var1);

   MessageType parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2);

   MessageType parseFrom(ByteBuffer var1);

   MessageType parseFrom(ByteBuffer var1, ExtensionRegistryLite var2);

   MessageType parseFrom(ByteString var1);

   MessageType parseFrom(ByteString var1, ExtensionRegistryLite var2);

   MessageType parsePartialFrom(ByteString var1);

   MessageType parsePartialFrom(ByteString var1, ExtensionRegistryLite var2);

   MessageType parseFrom(byte[] var1, int var2, int var3);

   MessageType parseFrom(byte[] var1, int var2, int var3, ExtensionRegistryLite var4);

   MessageType parseFrom(byte[] var1);

   MessageType parseFrom(byte[] var1, ExtensionRegistryLite var2);

   MessageType parsePartialFrom(byte[] var1, int var2, int var3);

   MessageType parsePartialFrom(byte[] var1, int var2, int var3, ExtensionRegistryLite var4);

   MessageType parsePartialFrom(byte[] var1);

   MessageType parsePartialFrom(byte[] var1, ExtensionRegistryLite var2);

   MessageType parseFrom(InputStream var1);

   MessageType parseFrom(InputStream var1, ExtensionRegistryLite var2);

   MessageType parsePartialFrom(InputStream var1);

   MessageType parsePartialFrom(InputStream var1, ExtensionRegistryLite var2);

   MessageType parseDelimitedFrom(InputStream var1);

   MessageType parseDelimitedFrom(InputStream var1, ExtensionRegistryLite var2);

   MessageType parsePartialDelimitedFrom(InputStream var1);

   MessageType parsePartialDelimitedFrom(InputStream var1, ExtensionRegistryLite var2);
}
