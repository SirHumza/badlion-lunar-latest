package com.google.protobuf;

import java.io.InputStream;

@CheckReturnValue
public interface Message extends MessageLite, MessageOrBuilder {
   @Override
   Parser<? extends Message> getParserForType();

   @Override
   boolean equals(Object var1);

   @Override
   int hashCode();

   @Override
   String toString();

   Message.Builder newBuilderForType();

   Message.Builder toBuilder();

   interface Builder extends MessageLite.Builder, MessageOrBuilder {
      @CanIgnoreReturnValue
      Message.Builder clear();

      @CanIgnoreReturnValue
      Message.Builder mergeFrom(Message var1);

      Message build();

      Message buildPartial();

      Message.Builder clone();

      @CanIgnoreReturnValue
      Message.Builder mergeFrom(CodedInputStream var1);

      @CanIgnoreReturnValue
      Message.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2);

      @Override
      Descriptors.Descriptor getDescriptorForType();

      Message.Builder newBuilderForField(Descriptors.FieldDescriptor var1);

      Message.Builder getFieldBuilder(Descriptors.FieldDescriptor var1);

      Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor var1, int var2);

      @CanIgnoreReturnValue
      Message.Builder setField(Descriptors.FieldDescriptor var1, Object var2);

      @CanIgnoreReturnValue
      Message.Builder clearField(Descriptors.FieldDescriptor var1);

      @CanIgnoreReturnValue
      Message.Builder clearOneof(Descriptors.OneofDescriptor var1);

      @CanIgnoreReturnValue
      Message.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3);

      @CanIgnoreReturnValue
      Message.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2);

      @CanIgnoreReturnValue
      Message.Builder setUnknownFields(UnknownFieldSet var1);

      @CanIgnoreReturnValue
      Message.Builder mergeUnknownFields(UnknownFieldSet var1);

      @CanIgnoreReturnValue
      Message.Builder mergeFrom(ByteString var1);

      @CanIgnoreReturnValue
      Message.Builder mergeFrom(ByteString var1, ExtensionRegistryLite var2);

      @CanIgnoreReturnValue
      Message.Builder mergeFrom(byte[] var1);

      @CanIgnoreReturnValue
      Message.Builder mergeFrom(byte[] var1, int var2, int var3);

      @CanIgnoreReturnValue
      Message.Builder mergeFrom(byte[] var1, ExtensionRegistryLite var2);

      @CanIgnoreReturnValue
      Message.Builder mergeFrom(byte[] var1, int var2, int var3, ExtensionRegistryLite var4);

      @CanIgnoreReturnValue
      Message.Builder mergeFrom(InputStream var1);

      @CanIgnoreReturnValue
      Message.Builder mergeFrom(InputStream var1, ExtensionRegistryLite var2);

      @Override
      boolean mergeDelimitedFrom(InputStream var1);

      @Override
      boolean mergeDelimitedFrom(InputStream var1, ExtensionRegistryLite var2);
   }
}
