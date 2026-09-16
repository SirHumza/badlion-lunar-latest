package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends GeneratedMessageLite.Builder<MessageType, BuilderType>>
   extends AbstractMessageLite<MessageType, BuilderType> {
   static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
   private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
   private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
   private int memoizedSerializedSize = -1;
   static final int UNINITIALIZED_HASH_CODE = 0;
   protected UnknownFieldSetLite unknownFields = UnknownFieldSetLite.getDefaultInstance();
   private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap<>();

   boolean isMutable() {
      return (this.memoizedSerializedSize & -2147483648) != 0;
   }

   void markImmutable() {
      this.memoizedSerializedSize &= Integer.MAX_VALUE;
   }

   int getMemoizedHashCode() {
      return this.memoizedHashCode;
   }

   void setMemoizedHashCode(int var1) {
      this.memoizedHashCode = var1;
   }

   void clearMemoizedHashCode() {
      this.memoizedHashCode = 0;
   }

   boolean hashCodeIsNotMemoized() {
      return 0 == this.getMemoizedHashCode();
   }

   @Override
   public final Parser<MessageType> getParserForType() {
      return (Parser<MessageType>)this.dynamicMethod(GeneratedMessageLite.MethodToInvoke.GET_PARSER);
   }

   public final MessageType getDefaultInstanceForType() {
      return (MessageType)this.dynamicMethod(GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE);
   }

   public final BuilderType newBuilderForType() {
      return (BuilderType)this.dynamicMethod(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER);
   }

   MessageType newMutableInstance() {
      return (MessageType)this.dynamicMethod(GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE);
   }

   @Override
   public String toString() {
      return MessageLiteToString.toString(this, super.toString());
   }

   @Override
   public int hashCode() {
      if (this.isMutable()) {
         return this.computeHashCode();
      }

      if (this.hashCodeIsNotMemoized()) {
         this.setMemoizedHashCode(this.computeHashCode());
      }

      return this.getMemoizedHashCode();
   }

   int computeHashCode() {
      return Protobuf.getInstance().schemaFor(this).hashCode(this);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else {
         return this.getClass() != var1.getClass()
            ? false
            : Protobuf.getInstance().schemaFor(this).equals(this, (GeneratedMessageLite<MessageType, BuilderType>)var1);
      }
   }

   private void ensureUnknownFieldsInitialized() {
      if (this.unknownFields == UnknownFieldSetLite.getDefaultInstance()) {
         this.unknownFields = UnknownFieldSetLite.newInstance();
      }
   }

   protected boolean parseUnknownField(int var1, CodedInputStream var2) {
      if (WireFormat.getTagWireType(var1) == 4) {
         return false;
      }

      this.ensureUnknownFieldsInitialized();
      return this.unknownFields.mergeFieldFrom(var1, var2);
   }

   protected void mergeVarintField(int var1, int var2) {
      this.ensureUnknownFieldsInitialized();
      this.unknownFields.mergeVarintField(var1, var2);
   }

   protected void mergeLengthDelimitedField(int var1, ByteString var2) {
      this.ensureUnknownFieldsInitialized();
      this.unknownFields.mergeLengthDelimitedField(var1, var2);
   }

   protected void makeImmutable() {
      Protobuf.getInstance().schemaFor(this).makeImmutable(this);
      this.markImmutable();
   }

   protected final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends GeneratedMessageLite.Builder<MessageType, BuilderType>> BuilderType createBuilder() {
      return (BuilderType)this.dynamicMethod(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER);
   }

   protected final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends GeneratedMessageLite.Builder<MessageType, BuilderType>> BuilderType createBuilder(
      MessageType var1
   ) {
      return (BuilderType)this.createBuilder().mergeFrom((MessageType)var1);
   }

   @Override
   public final boolean isInitialized() {
      return isInitialized(this, Boolean.TRUE);
   }

   public final BuilderType toBuilder() {
      GeneratedMessageLite.Builder var1 = (GeneratedMessageLite.Builder)this.dynamicMethod(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER);
      return (BuilderType)var1.mergeFrom(this);
   }

   protected abstract Object dynamicMethod(GeneratedMessageLite.MethodToInvoke var1, Object var2, Object var3);

   @CanIgnoreReturnValue
   protected Object dynamicMethod(GeneratedMessageLite.MethodToInvoke var1, Object var2) {
      return this.dynamicMethod(var1, var2, null);
   }

   protected Object dynamicMethod(GeneratedMessageLite.MethodToInvoke var1) {
      return this.dynamicMethod(var1, null, null);
   }

   void clearMemoizedSerializedSize() {
      this.setMemoizedSerializedSize(Integer.MAX_VALUE);
   }

   @Override
   int getMemoizedSerializedSize() {
      return this.memoizedSerializedSize & 2147483647;
   }

   @Override
   void setMemoizedSerializedSize(int var1) {
      if (var1 < 0) {
         throw new IllegalStateException("serialized size must be non-negative, was " + var1);
      }

      this.memoizedSerializedSize = this.memoizedSerializedSize & -2147483648 | var1 & 2147483647;
   }

   @Override
   public void writeTo(CodedOutputStream var1) {
      Protobuf.getInstance().schemaFor(this).writeTo(this, CodedOutputStreamWriter.forCodedOutput(var1));
   }

   @Override
   int getSerializedSize(Schema var1) {
      if (this.isMutable()) {
         int var3 = this.computeSerializedSize(var1);
         if (var3 < 0) {
            throw new IllegalStateException("serialized size must be non-negative, was " + var3);
         } else {
            return var3;
         }
      } else {
         if (this.getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return this.getMemoizedSerializedSize();
         }

         int var2 = this.computeSerializedSize(var1);
         this.setMemoizedSerializedSize(var2);
         return var2;
      }
   }

   @Override
   public int getSerializedSize() {
      return this.getSerializedSize(null);
   }

   private int computeSerializedSize(Schema<?> var1) {
      return var1 == null ? Protobuf.getInstance().schemaFor(this).getSerializedSize(this) : var1.getSerializedSize(this);
   }

   Object buildMessageInfo() {
      return this.dynamicMethod(GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO);
   }

   static <T extends GeneratedMessageLite<?, ?>> T getDefaultInstance(Class<T> var0) {
      GeneratedMessageLite var1 = defaultInstanceMap.get(var0);
      if (var1 == null) {
         try {
            Class.forName(var0.getName(), true, var0.getClassLoader());
         } catch (ClassNotFoundException var3) {
            throw new IllegalStateException("Class initialization cannot fail.", var3);
         }

         var1 = defaultInstanceMap.get(var0);
      }

      if (var1 == null) {
         var1 = UnsafeUtil.<GeneratedMessageLite>allocateInstance(var0).getDefaultInstanceForType();
         if (var1 == null) {
            throw new IllegalStateException();
         }

         defaultInstanceMap.put(var0, var1);
      }

      return (T)var1;
   }

   protected static <T extends GeneratedMessageLite<?, ?>> void registerDefaultInstance(Class<T> var0, T var1) {
      var1.markImmutable();
      defaultInstanceMap.put(var0, var1);
   }

   protected static Object newMessageInfo(MessageLite var0, String var1, Object[] var2) {
      return new RawMessageInfo(var0, var1, var2);
   }

   protected final void mergeUnknownFields(UnknownFieldSetLite var1) {
      this.unknownFields = UnknownFieldSetLite.mutableCopyOf(this.unknownFields, var1);
   }

   public static <ContainingType extends MessageLite, Type> GeneratedMessageLite.GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(
      ContainingType var0, Type var1, MessageLite var2, Internal.EnumLiteMap<?> var3, int var4, WireFormat.FieldType var5, Class var6
   ) {
      return new GeneratedMessageLite.GeneratedExtension<>(
         (ContainingType)var0, (Type)var1, var2, new GeneratedMessageLite.ExtensionDescriptor(var3, var4, var5, false, false), var6
      );
   }

   public static <ContainingType extends MessageLite, Type> GeneratedMessageLite.GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(
      ContainingType var0, MessageLite var1, Internal.EnumLiteMap<?> var2, int var3, WireFormat.FieldType var4, boolean var5, Class var6
   ) {
      List var7 = Collections.emptyList();
      return new GeneratedMessageLite.GeneratedExtension<>(
         (ContainingType)var0, (Type)var7, var1, new GeneratedMessageLite.ExtensionDescriptor(var2, var3, var4, true, var5), var6
      );
   }

   static java.lang.reflect.Method getMethodOrDie(Class var0, String var1, Class... var2) {
      try {
         return var0.getMethod(var1, var2);
      } catch (NoSuchMethodException var4) {
         throw new RuntimeException("Generated message class \"" + var0.getName() + "\" missing method \"" + var1 + "\".", var4);
      }
   }

   static Object invokeOrDie(java.lang.reflect.Method var0, Object var1, Object... var2) {
      try {
         return var0.invoke(var1, var2);
      } catch (IllegalAccessException var5) {
         throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", var5);
      } catch (InvocationTargetException var6) {
         Throwable var4 = var6.getCause();
         if (var4 instanceof RuntimeException) {
            throw (RuntimeException)var4;
         } else if (var4 instanceof Error) {
            throw (Error)var4;
         } else {
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", var4);
         }
      }
   }

   private static <MessageType extends GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>, T> GeneratedMessageLite.GeneratedExtension<MessageType, T> checkIsLite(
      ExtensionLite<MessageType, T> var0
   ) {
      if (!var0.isLite()) {
         throw new IllegalArgumentException("Expected a lite extension.");
      } else {
         return (GeneratedMessageLite.GeneratedExtension<MessageType, T>)var0;
      }
   }

   protected static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T var0, boolean var1) {
      byte var2 = (Byte)var0.dynamicMethod(GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED);
      if (var2 == 1) {
         return true;
      }

      if (var2 == 0) {
         return false;
      }

      boolean var3 = Protobuf.getInstance().schemaFor(var0).isInitialized(var0);
      if (var1) {
         Object var4 = var0.dynamicMethod(GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, var3 ? var0 : null);
      }

      return var3;
   }

   protected static Internal.IntList emptyIntList() {
      return IntArrayList.emptyList();
   }

   protected static Internal.IntList mutableCopy(Internal.IntList var0) {
      int var1 = var0.size();
      return var0.mutableCopyWithCapacity(var1 == 0 ? 10 : var1 * 2);
   }

   protected static Internal.LongList emptyLongList() {
      return LongArrayList.emptyList();
   }

   protected static Internal.LongList mutableCopy(Internal.LongList var0) {
      int var1 = var0.size();
      return var0.mutableCopyWithCapacity(var1 == 0 ? 10 : var1 * 2);
   }

   protected static Internal.FloatList emptyFloatList() {
      return FloatArrayList.emptyList();
   }

   protected static Internal.FloatList mutableCopy(Internal.FloatList var0) {
      int var1 = var0.size();
      return var0.mutableCopyWithCapacity(var1 == 0 ? 10 : var1 * 2);
   }

   protected static Internal.DoubleList emptyDoubleList() {
      return DoubleArrayList.emptyList();
   }

   protected static Internal.DoubleList mutableCopy(Internal.DoubleList var0) {
      int var1 = var0.size();
      return var0.mutableCopyWithCapacity(var1 == 0 ? 10 : var1 * 2);
   }

   protected static Internal.BooleanList emptyBooleanList() {
      return BooleanArrayList.emptyList();
   }

   protected static Internal.BooleanList mutableCopy(Internal.BooleanList var0) {
      int var1 = var0.size();
      return var0.mutableCopyWithCapacity(var1 == 0 ? 10 : var1 * 2);
   }

   protected static <E> Internal.ProtobufList<E> emptyProtobufList() {
      return ProtobufArrayList.emptyList();
   }

   protected static <E> Internal.ProtobufList<E> mutableCopy(Internal.ProtobufList<E> var0) {
      int var1 = var0.size();
      return var0.mutableCopyWithCapacity(var1 == 0 ? 10 : var1 * 2);
   }

   static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T var0, CodedInputStream var1, ExtensionRegistryLite var2) {
      GeneratedMessageLite var3 = var0.newMutableInstance();

      try {
         Schema var9 = Protobuf.getInstance().schemaFor(var3);
         var9.mergeFrom(var3, CodedInputStreamReader.forCodedInput(var1), var2);
         var9.makeImmutable(var3);
         return (T)var3;
      } catch (InvalidProtocolBufferException var5) {
         InvalidProtocolBufferException var4 = var5;
         if (var5.getThrownFromInputStream()) {
            var4 = new InvalidProtocolBufferException(var5);
         }

         throw var4.setUnfinishedMessage(var3);
      } catch (UninitializedMessageException var6) {
         throw var6.asInvalidProtocolBufferException().setUnfinishedMessage(var3);
      } catch (IOException var7) {
         if (var7.getCause() instanceof InvalidProtocolBufferException) {
            throw (InvalidProtocolBufferException)var7.getCause();
         } else {
            throw new InvalidProtocolBufferException(var7).setUnfinishedMessage(var3);
         }
      } catch (RuntimeException var8) {
         if (var8.getCause() instanceof InvalidProtocolBufferException) {
            throw (InvalidProtocolBufferException)var8.getCause();
         } else {
            throw var8;
         }
      }
   }

   private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T var0, byte[] var1, int var2, int var3, ExtensionRegistryLite var4) {
      GeneratedMessageLite var5 = var0.newMutableInstance();

      try {
         Schema var11 = Protobuf.getInstance().schemaFor(var5);
         var11.mergeFrom(var5, var1, var2, var2 + var3, new ArrayDecoders.Registers(var4));
         var11.makeImmutable(var5);
         return (T)var5;
      } catch (InvalidProtocolBufferException var7) {
         InvalidProtocolBufferException var6 = var7;
         if (var7.getThrownFromInputStream()) {
            var6 = new InvalidProtocolBufferException(var7);
         }

         throw var6.setUnfinishedMessage(var5);
      } catch (UninitializedMessageException var8) {
         throw var8.asInvalidProtocolBufferException().setUnfinishedMessage(var5);
      } catch (IOException var9) {
         if (var9.getCause() instanceof InvalidProtocolBufferException) {
            throw (InvalidProtocolBufferException)var9.getCause();
         } else {
            throw new InvalidProtocolBufferException(var9).setUnfinishedMessage(var5);
         }
      } catch (IndexOutOfBoundsException var10) {
         throw InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(var5);
      }
   }

   protected static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T var0, CodedInputStream var1) {
      return parsePartialFrom((T)var0, var1, ExtensionRegistryLite.getEmptyRegistry());
   }

   private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T var0) {
      if (var0 != null && !var0.isInitialized()) {
         throw var0.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(var0);
      } else {
         return (T)var0;
      }
   }

   protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T var0, ByteBuffer var1, ExtensionRegistryLite var2) {
      return checkMessageInitialized(parseFrom((T)var0, CodedInputStream.newInstance(var1), var2));
   }

   protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T var0, ByteBuffer var1) {
      return parseFrom((T)var0, var1, ExtensionRegistryLite.getEmptyRegistry());
   }

   protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T var0, ByteString var1) {
      return checkMessageInitialized(parseFrom((T)var0, var1, ExtensionRegistryLite.getEmptyRegistry()));
   }

   protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T var0, ByteString var1, ExtensionRegistryLite var2) {
      return checkMessageInitialized(parsePartialFrom((T)var0, var1, var2));
   }

   private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T var0, ByteString var1, ExtensionRegistryLite var2) {
      CodedInputStream var3 = var1.newCodedInput();
      GeneratedMessageLite var4 = parsePartialFrom(var0, var3, var2);

      try {
         var3.checkLastTagWas(0);
         return (T)var4;
      } catch (InvalidProtocolBufferException var6) {
         throw var6.setUnfinishedMessage(var4);
      }
   }

   protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T var0, byte[] var1) {
      return checkMessageInitialized(parsePartialFrom((T)var0, var1, 0, var1.length, ExtensionRegistryLite.getEmptyRegistry()));
   }

   protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T var0, byte[] var1, ExtensionRegistryLite var2) {
      return checkMessageInitialized(parsePartialFrom((T)var0, var1, 0, var1.length, var2));
   }

   protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T var0, InputStream var1) {
      return checkMessageInitialized(parsePartialFrom((T)var0, CodedInputStream.newInstance(var1), ExtensionRegistryLite.getEmptyRegistry()));
   }

   protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T var0, InputStream var1, ExtensionRegistryLite var2) {
      return checkMessageInitialized(parsePartialFrom((T)var0, CodedInputStream.newInstance(var1), var2));
   }

   protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T var0, CodedInputStream var1) {
      return parseFrom((T)var0, var1, ExtensionRegistryLite.getEmptyRegistry());
   }

   protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T var0, CodedInputStream var1, ExtensionRegistryLite var2) {
      return checkMessageInitialized(parsePartialFrom((T)var0, var1, var2));
   }

   protected static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T var0, InputStream var1) {
      return checkMessageInitialized(parsePartialDelimitedFrom((T)var0, var1, ExtensionRegistryLite.getEmptyRegistry()));
   }

   protected static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T var0, InputStream var1, ExtensionRegistryLite var2) {
      return checkMessageInitialized(parsePartialDelimitedFrom((T)var0, var1, var2));
   }

   private static <T extends GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T var0, InputStream var1, ExtensionRegistryLite var2) {
      int var3;
      try {
         int var11 = var1.read();
         if (var11 == -1) {
            return null;
         }

         var3 = CodedInputStream.readRawVarint32(var11, var1);
      } catch (InvalidProtocolBufferException var9) {
         InvalidProtocolBufferException var4 = var9;
         if (var9.getThrownFromInputStream()) {
            var4 = new InvalidProtocolBufferException(var9);
         }

         throw var4;
      } catch (IOException var10) {
         throw new InvalidProtocolBufferException(var10);
      }

      AbstractMessageLite.Builder.LimitedInputStream var12 = new AbstractMessageLite.Builder.LimitedInputStream(var1, var3);
      CodedInputStream var5 = CodedInputStream.newInstance(var12);
      GeneratedMessageLite var6 = parsePartialFrom(var0, var5, var2);

      try {
         var5.checkLastTagWas(0);
         return (T)var6;
      } catch (InvalidProtocolBufferException var8) {
         throw var8.setUnfinishedMessage(var6);
      }
   }

   public abstract static class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends GeneratedMessageLite.Builder<MessageType, BuilderType>>
      extends AbstractMessageLite.Builder<MessageType, BuilderType> {
      private final MessageType defaultInstance;
      protected MessageType instance;

      protected Builder(MessageType var1) {
         this.defaultInstance = (MessageType)var1;
         if (var1.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
         }

         this.instance = this.newMutableInstance();
      }

      private MessageType newMutableInstance() {
         return this.defaultInstance.newMutableInstance();
      }

      protected final void copyOnWrite() {
         if (!this.instance.isMutable()) {
            this.copyOnWriteInternal();
         }
      }

      protected void copyOnWriteInternal() {
         GeneratedMessageLite var1 = this.newMutableInstance();
         mergeFromInstance(var1, this.instance);
         this.instance = (MessageType)var1;
      }

      @Override
      public final boolean isInitialized() {
         return GeneratedMessageLite.isInitialized(this.instance, false);
      }

      public final BuilderType clear() {
         if (this.defaultInstance.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
         }

         this.instance = this.newMutableInstance();
         return (BuilderType)this;
      }

      public BuilderType clone() {
         GeneratedMessageLite.Builder var1 = this.getDefaultInstanceForType().newBuilderForType();
         var1.instance = this.buildPartial();
         return (BuilderType)var1;
      }

      public MessageType buildPartial() {
         if (!this.instance.isMutable()) {
            return this.instance;
         }

         this.instance.makeImmutable();
         return this.instance;
      }

      public final MessageType build() {
         GeneratedMessageLite var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return (MessageType)var1;
         }
      }

      protected BuilderType internalMergeFrom(MessageType var1) {
         return this.mergeFrom((MessageType)var1);
      }

      public BuilderType mergeFrom(MessageType var1) {
         if (this.getDefaultInstanceForType().equals(var1)) {
            return (BuilderType)this;
         }

         this.copyOnWrite();
         mergeFromInstance(this.instance, var1);
         return (BuilderType)this;
      }

      private static <MessageType> void mergeFromInstance(MessageType var0, MessageType var1) {
         Protobuf.getInstance().schemaFor(var0).mergeFrom(var0, var1);
      }

      public MessageType getDefaultInstanceForType() {
         return this.defaultInstance;
      }

      public BuilderType mergeFrom(byte[] var1, int var2, int var3, ExtensionRegistryLite var4) {
         this.copyOnWrite();

         try {
            Protobuf.getInstance().schemaFor(this.instance).mergeFrom(this.instance, var1, var2, var2 + var3, new ArrayDecoders.Registers(var4));
            return (BuilderType)this;
         } catch (InvalidProtocolBufferException var6) {
            throw var6;
         } catch (IndexOutOfBoundsException var7) {
            throw InvalidProtocolBufferException.truncatedMessage();
         } catch (IOException var8) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", var8);
         }
      }

      public BuilderType mergeFrom(byte[] var1, int var2, int var3) {
         return this.mergeFrom(var1, var2, var3, ExtensionRegistryLite.getEmptyRegistry());
      }

      public BuilderType mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         this.copyOnWrite();

         try {
            Protobuf.getInstance().schemaFor(this.instance).mergeFrom(this.instance, CodedInputStreamReader.forCodedInput(var1), var2);
            return (BuilderType)this;
         } catch (RuntimeException var4) {
            if (var4.getCause() instanceof IOException) {
               throw (IOException)var4.getCause();
            } else {
               throw var4;
            }
         }
      }
   }

   protected static class DefaultInstanceBasedParser<T extends GeneratedMessageLite<T, ?>> extends AbstractParser<T> {
      private final T defaultInstance;

      public DefaultInstanceBasedParser(T var1) {
         this.defaultInstance = (T)var1;
      }

      public T parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         return GeneratedMessageLite.parsePartialFrom(this.defaultInstance, var1, var2);
      }

      public T parsePartialFrom(byte[] var1, int var2, int var3, ExtensionRegistryLite var4) {
         return GeneratedMessageLite.parsePartialFrom(this.defaultInstance, var1, var2, var3, var4);
      }
   }

   public abstract static class ExtendableBuilder<MessageType extends GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>>
      extends GeneratedMessageLite.Builder<MessageType, BuilderType>
      implements GeneratedMessageLite.ExtendableMessageOrBuilder<MessageType, BuilderType> {
      protected ExtendableBuilder(MessageType var1) {
         super((MessageType)var1);
      }

      void internalSetExtensionSet(FieldSet<GeneratedMessageLite.ExtensionDescriptor> var1) {
         this.copyOnWrite();
         ((GeneratedMessageLite.ExtendableMessage)this.instance).extensions = var1;
      }

      @Override
      protected void copyOnWriteInternal() {
         super.copyOnWriteInternal();
         if (((GeneratedMessageLite.ExtendableMessage)this.instance).extensions != FieldSet.emptySet()) {
            ((GeneratedMessageLite.ExtendableMessage)this.instance).extensions = ((GeneratedMessageLite.ExtendableMessage)this.instance).extensions.clone();
         }
      }

      private FieldSet<GeneratedMessageLite.ExtensionDescriptor> ensureExtensionsAreMutable() {
         FieldSet var1 = ((GeneratedMessageLite.ExtendableMessage)this.instance).extensions;
         if (var1.isImmutable()) {
            var1 = var1.clone();
            ((GeneratedMessageLite.ExtendableMessage)this.instance).extensions = var1;
         }

         return var1;
      }

      public final MessageType buildPartial() {
         if (!((GeneratedMessageLite.ExtendableMessage)this.instance).isMutable()) {
            return (MessageType)((GeneratedMessageLite.ExtendableMessage)this.instance);
         }

         ((GeneratedMessageLite.ExtendableMessage)this.instance).extensions.makeImmutable();
         return (MessageType)((GeneratedMessageLite.ExtendableMessage)super.buildPartial());
      }

      private void verifyExtensionContainingType(GeneratedMessageLite.GeneratedExtension<MessageType, ?> var1) {
         if (var1.getContainingTypeDefaultInstance() != this.getDefaultInstanceForType()) {
            throw new IllegalArgumentException(
               "This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings."
            );
         }
      }

      @Override
      public final <Type> boolean hasExtension(ExtensionLite<MessageType, Type> var1) {
         return ((GeneratedMessageLite.ExtendableMessage)this.instance).hasExtension(var1);
      }

      @Override
      public final <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> var1) {
         return ((GeneratedMessageLite.ExtendableMessage)this.instance).getExtensionCount(var1);
      }

      @Override
      public final <Type> Type getExtension(ExtensionLite<MessageType, Type> var1) {
         return ((GeneratedMessageLite.ExtendableMessage)this.instance).getExtension(var1);
      }

      @Override
      public final <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> var1, int var2) {
         return ((GeneratedMessageLite.ExtendableMessage)this.instance).getExtension(var1, var2);
      }

      public final <Type> BuilderType setExtension(ExtensionLite<MessageType, Type> var1, Type var2) {
         GeneratedMessageLite.GeneratedExtension var3 = GeneratedMessageLite.checkIsLite(var1);
         this.verifyExtensionContainingType(var3);
         this.copyOnWrite();
         this.ensureExtensionsAreMutable().setField(var3.descriptor, var3.toFieldSetType(var2));
         return (BuilderType)this;
      }

      public final <Type> BuilderType setExtension(ExtensionLite<MessageType, List<Type>> var1, int var2, Type var3) {
         GeneratedMessageLite.GeneratedExtension var4 = GeneratedMessageLite.checkIsLite(var1);
         this.verifyExtensionContainingType(var4);
         this.copyOnWrite();
         this.ensureExtensionsAreMutable().setRepeatedField(var4.descriptor, var2, var4.singularToFieldSetType(var3));
         return (BuilderType)this;
      }

      public final <Type> BuilderType addExtension(ExtensionLite<MessageType, List<Type>> var1, Type var2) {
         GeneratedMessageLite.GeneratedExtension var3 = GeneratedMessageLite.checkIsLite(var1);
         this.verifyExtensionContainingType(var3);
         this.copyOnWrite();
         this.ensureExtensionsAreMutable().addRepeatedField(var3.descriptor, var3.singularToFieldSetType(var2));
         return (BuilderType)this;
      }

      public final BuilderType clearExtension(ExtensionLite<MessageType, ?> var1) {
         GeneratedMessageLite.GeneratedExtension var2 = GeneratedMessageLite.checkIsLite(var1);
         this.verifyExtensionContainingType(var2);
         this.copyOnWrite();
         this.ensureExtensionsAreMutable().clearField(var2.descriptor);
         return (BuilderType)this;
      }
   }

   public abstract static class ExtendableMessage<MessageType extends GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>>
      extends GeneratedMessageLite<MessageType, BuilderType>
      implements GeneratedMessageLite.ExtendableMessageOrBuilder<MessageType, BuilderType> {
      protected FieldSet<GeneratedMessageLite.ExtensionDescriptor> extensions = FieldSet.emptySet();

      protected final void mergeExtensionFields(MessageType var1) {
         if (this.extensions.isImmutable()) {
            this.extensions = this.extensions.clone();
         }

         this.extensions.mergeFrom(var1.extensions);
      }

      protected <MessageType extends MessageLite> boolean parseUnknownField(MessageType var1, CodedInputStream var2, ExtensionRegistryLite var3, int var4) {
         int var5 = WireFormat.getTagFieldNumber(var4);
         GeneratedMessageLite.GeneratedExtension var6 = var3.findLiteExtensionByNumber(var1, var5);
         return this.parseExtension(var2, var3, var6, var4, var5);
      }

      private boolean parseExtension(CodedInputStream var1, ExtensionRegistryLite var2, GeneratedMessageLite.GeneratedExtension<?, ?> var3, int var4, int var5) {
         int var6 = WireFormat.getTagWireType(var4);
         boolean var7 = false;
         boolean var8 = false;
         if (var3 == null) {
            var7 = true;
         } else if (var6 == FieldSet.getWireFormatForFieldType(var3.descriptor.getLiteType(), false)) {
            var8 = false;
         } else if (var3.descriptor.isRepeated
            && var3.descriptor.type.isPackable()
            && var6 == FieldSet.getWireFormatForFieldType(var3.descriptor.getLiteType(), true)) {
            var8 = true;
         } else {
            var7 = true;
         }

         if (var7) {
            return this.parseUnknownField(var4, var1);
         }

         FieldSet var9 = this.ensureExtensionsAreMutable();
         if (var8) {
            int var10 = var1.readRawVarint32();
            int var11 = var1.pushLimit(var10);
            if (var3.descriptor.getLiteType() == WireFormat.FieldType.ENUM) {
               while (var1.getBytesUntilLimit() > 0) {
                  int var17 = var1.readEnum();
                  Internal.EnumLite var13 = var3.descriptor.getEnumType().findValueByNumber(var17);
                  if (var13 == null) {
                     return true;
                  }

                  this.extensions.addRepeatedField(var3.descriptor, var3.singularToFieldSetType(var13));
               }
            } else {
               while (var1.getBytesUntilLimit() > 0) {
                  Object var12 = FieldSet.readPrimitiveField(var1, var3.descriptor.getLiteType(), false);
                  this.extensions.addRepeatedField(var3.descriptor, var12);
               }
            }

            var1.popLimit(var11);
         } else {
            Object var14;
            switch (var3.descriptor.getLiteJavaType()) {
               case MESSAGE:
                  MessageLite.Builder var16 = null;
                  if (!var3.descriptor.isRepeated()) {
                     MessageLite var18 = (MessageLite)this.extensions.getField(var3.descriptor);
                     if (var18 != null) {
                        var16 = var18.toBuilder();
                     }
                  }

                  if (var16 == null) {
                     var16 = var3.getMessageDefaultInstance().newBuilderForType();
                  }

                  if (var3.descriptor.getLiteType() == WireFormat.FieldType.GROUP) {
                     var1.readGroup(var3.getNumber(), var16, var2);
                  } else {
                     var1.readMessage(var16, var2);
                  }

                  var14 = var16.build();
                  break;
               case ENUM:
                  int var15 = var1.readEnum();
                  var14 = var3.descriptor.getEnumType().findValueByNumber(var15);
                  if (var14 == null) {
                     this.mergeVarintField(var5, var15);
                     return true;
                  }
                  break;
               default:
                  var14 = FieldSet.readPrimitiveField(var1, var3.descriptor.getLiteType(), false);
            }

            if (var3.descriptor.isRepeated()) {
               this.extensions.addRepeatedField(var3.descriptor, var3.singularToFieldSetType(var14));
            } else {
               this.extensions.setField(var3.descriptor, var3.singularToFieldSetType(var14));
            }
         }

         return true;
      }

      protected <MessageType extends MessageLite> boolean parseUnknownFieldAsMessageSet(
         MessageType var1, CodedInputStream var2, ExtensionRegistryLite var3, int var4
      ) {
         if (var4 == WireFormat.MESSAGE_SET_ITEM_TAG) {
            this.mergeMessageSetExtensionFromCodedStream(var1, var2, var3);
            return true;
         } else {
            int var5 = WireFormat.getTagWireType(var4);
            return var5 == 2 ? this.parseUnknownField(var1, var2, var3, var4) : var2.skipField(var4);
         }
      }

      private <MessageType extends MessageLite> void mergeMessageSetExtensionFromCodedStream(
         MessageType var1, CodedInputStream var2, ExtensionRegistryLite var3
      ) {
         int var4 = 0;
         ByteString var5 = null;
         GeneratedMessageLite.GeneratedExtension var6 = null;

         while (true) {
            int var7 = var2.readTag();
            if (var7 == 0) {
               break;
            }

            if (var7 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
               var4 = var2.readUInt32();
               if (var4 != 0) {
                  var6 = var3.findLiteExtensionByNumber(var1, var4);
               }
            } else if (var7 == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
               if (var4 != 0 && var6 != null) {
                  this.eagerlyMergeMessageSetExtension(var2, var6, var3, var4);
                  var5 = null;
               } else {
                  var5 = var2.readBytes();
               }
            } else if (!var2.skipField(var7)) {
               break;
            }
         }

         var2.checkLastTagWas(WireFormat.MESSAGE_SET_ITEM_END_TAG);
         if (var5 != null && var4 != 0) {
            if (var6 != null) {
               this.mergeMessageSetExtensionFromBytes(var5, var3, var6);
            } else if (var5 != null) {
               this.mergeLengthDelimitedField(var4, var5);
            }
         }
      }

      private void eagerlyMergeMessageSetExtension(
         CodedInputStream var1, GeneratedMessageLite.GeneratedExtension<?, ?> var2, ExtensionRegistryLite var3, int var4
      ) {
         int var5 = var4;
         int var6 = WireFormat.makeTag(var4, 2);
         boolean var7 = this.parseExtension(var1, var3, var2, var6, var5);
      }

      private void mergeMessageSetExtensionFromBytes(ByteString var1, ExtensionRegistryLite var2, GeneratedMessageLite.GeneratedExtension<?, ?> var3) {
         MessageLite.Builder var4 = null;
         MessageLite var5 = (MessageLite)this.extensions.getField(var3.descriptor);
         if (var5 != null) {
            var4 = var5.toBuilder();
         }

         if (var4 == null) {
            var4 = var3.getMessageDefaultInstance().newBuilderForType();
         }

         var4.mergeFrom(var1, var2);
         MessageLite var6 = var4.build();
         this.ensureExtensionsAreMutable().setField(var3.descriptor, var3.singularToFieldSetType(var6));
      }

      @CanIgnoreReturnValue
      FieldSet<GeneratedMessageLite.ExtensionDescriptor> ensureExtensionsAreMutable() {
         if (this.extensions.isImmutable()) {
            this.extensions = this.extensions.clone();
         }

         return this.extensions;
      }

      private void verifyExtensionContainingType(GeneratedMessageLite.GeneratedExtension<MessageType, ?> var1) {
         if (var1.getContainingTypeDefaultInstance() != this.getDefaultInstanceForType()) {
            throw new IllegalArgumentException(
               "This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings."
            );
         }
      }

      @Override
      public final <Type> boolean hasExtension(ExtensionLite<MessageType, Type> var1) {
         GeneratedMessageLite.GeneratedExtension var2 = GeneratedMessageLite.checkIsLite(var1);
         this.verifyExtensionContainingType(var2);
         return this.extensions.hasField(var2.descriptor);
      }

      @Override
      public final <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> var1) {
         GeneratedMessageLite.GeneratedExtension var2 = GeneratedMessageLite.checkIsLite(var1);
         this.verifyExtensionContainingType(var2);
         return this.extensions.getRepeatedFieldCount(var2.descriptor);
      }

      @Override
      public final <Type> Type getExtension(ExtensionLite<MessageType, Type> var1) {
         GeneratedMessageLite.GeneratedExtension var2 = GeneratedMessageLite.checkIsLite(var1);
         this.verifyExtensionContainingType(var2);
         Object var3 = this.extensions.getField(var2.descriptor);
         return (Type)(var3 == null ? var2.defaultValue : var2.fromFieldSetType(var3));
      }

      @Override
      public final <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> var1, int var2) {
         GeneratedMessageLite.GeneratedExtension var3 = GeneratedMessageLite.checkIsLite(var1);
         this.verifyExtensionContainingType(var3);
         return (Type)var3.singularFromFieldSetType(this.extensions.getRepeatedField(var3.descriptor, var2));
      }

      protected boolean extensionsAreInitialized() {
         return this.extensions.isInitialized();
      }

      protected GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newExtensionWriter() {
         return new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(false);
      }

      protected GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newMessageSetExtensionWriter() {
         return new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(true);
      }

      protected int extensionsSerializedSize() {
         return this.extensions.getSerializedSize();
      }

      protected int extensionsSerializedSizeAsMessageSet() {
         return this.extensions.getMessageSetSerializedSize();
      }

      protected class ExtensionWriter {
         private final Iterator<Entry<GeneratedMessageLite.ExtensionDescriptor, Object>> iter = ExtendableMessage.this.extensions.iterator();
         private Entry<GeneratedMessageLite.ExtensionDescriptor, Object> next;
         private final boolean messageSetWireFormat;

         private ExtensionWriter(boolean var2) {
            if (this.iter.hasNext()) {
               this.next = this.iter.next();
            }

            this.messageSetWireFormat = var2;
         }

         public void writeUntil(int var1, CodedOutputStream var2) {
            while (this.next != null && this.next.getKey().getNumber() < var1) {
               GeneratedMessageLite.ExtensionDescriptor var3 = this.next.getKey();
               if (this.messageSetWireFormat && var3.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !var3.isRepeated()) {
                  var2.writeMessageSetExtension(var3.getNumber(), (MessageLite)this.next.getValue());
               } else {
                  FieldSet.writeField(var3, this.next.getValue(), var2);
               }

               if (this.iter.hasNext()) {
                  this.next = this.iter.next();
               } else {
                  this.next = null;
               }
            }
         }
      }
   }

   public interface ExtendableMessageOrBuilder<MessageType extends GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>>
      extends MessageLiteOrBuilder {
      <Type> boolean hasExtension(ExtensionLite<MessageType, Type> var1);

      <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> var1);

      <Type> Type getExtension(ExtensionLite<MessageType, Type> var1);

      <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> var1, int var2);
   }

   static final class ExtensionDescriptor implements FieldSet.FieldDescriptorLite<GeneratedMessageLite.ExtensionDescriptor> {
      final Internal.EnumLiteMap<?> enumTypeMap;
      final int number;
      final WireFormat.FieldType type;
      final boolean isRepeated;
      final boolean isPacked;

      ExtensionDescriptor(Internal.EnumLiteMap<?> var1, int var2, WireFormat.FieldType var3, boolean var4, boolean var5) {
         this.enumTypeMap = var1;
         this.number = var2;
         this.type = var3;
         this.isRepeated = var4;
         this.isPacked = var5;
      }

      @Override
      public int getNumber() {
         return this.number;
      }

      @Override
      public WireFormat.FieldType getLiteType() {
         return this.type;
      }

      @Override
      public WireFormat.JavaType getLiteJavaType() {
         return this.type.getJavaType();
      }

      @Override
      public boolean isRepeated() {
         return this.isRepeated;
      }

      @Override
      public boolean isPacked() {
         return this.isPacked;
      }

      @Override
      public Internal.EnumLiteMap<?> getEnumType() {
         return this.enumTypeMap;
      }

      @Override
      public MessageLite.Builder internalMergeFrom(MessageLite.Builder var1, MessageLite var2) {
         return ((GeneratedMessageLite.Builder)var1).mergeFrom((MessageType)var2);
      }

      public int compareTo(GeneratedMessageLite.ExtensionDescriptor var1) {
         return this.number - var1.number;
      }
   }

   public static class GeneratedExtension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {
      final ContainingType containingTypeDefaultInstance;
      final Type defaultValue;
      final MessageLite messageDefaultInstance;
      final GeneratedMessageLite.ExtensionDescriptor descriptor;

      GeneratedExtension(ContainingType var1, Type var2, MessageLite var3, GeneratedMessageLite.ExtensionDescriptor var4, Class var5) {
         if (var1 == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
         }

         if (var4.getLiteType() == WireFormat.FieldType.MESSAGE && var3 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
         }

         this.containingTypeDefaultInstance = (ContainingType)var1;
         this.defaultValue = (Type)var2;
         this.messageDefaultInstance = var3;
         this.descriptor = var4;
      }

      public ContainingType getContainingTypeDefaultInstance() {
         return this.containingTypeDefaultInstance;
      }

      @Override
      public int getNumber() {
         return this.descriptor.getNumber();
      }

      @Override
      public MessageLite getMessageDefaultInstance() {
         return this.messageDefaultInstance;
      }

      Object fromFieldSetType(Object var1) {
         if (!this.descriptor.isRepeated()) {
            return this.singularFromFieldSetType(var1);
         }

         if (this.descriptor.getLiteJavaType() != WireFormat.JavaType.ENUM) {
            return var1;
         }

         ArrayList var2 = new ArrayList();

         for (Object var4 : (List)var1) {
            var2.add(this.singularFromFieldSetType(var4));
         }

         return var2;
      }

      Object singularFromFieldSetType(Object var1) {
         return this.descriptor.getLiteJavaType() == WireFormat.JavaType.ENUM ? this.descriptor.enumTypeMap.findValueByNumber((Integer)var1) : var1;
      }

      Object toFieldSetType(Object var1) {
         if (!this.descriptor.isRepeated()) {
            return this.singularToFieldSetType(var1);
         }

         if (this.descriptor.getLiteJavaType() != WireFormat.JavaType.ENUM) {
            return var1;
         }

         ArrayList var2 = new ArrayList();

         for (Object var4 : (List)var1) {
            var2.add(this.singularToFieldSetType(var4));
         }

         return var2;
      }

      Object singularToFieldSetType(Object var1) {
         return this.descriptor.getLiteJavaType() == WireFormat.JavaType.ENUM ? ((Internal.EnumLite)var1).getNumber() : var1;
      }

      @Override
      public WireFormat.FieldType getLiteType() {
         return this.descriptor.getLiteType();
      }

      @Override
      public boolean isRepeated() {
         return this.descriptor.isRepeated;
      }

      @Override
      public Type getDefaultValue() {
         return this.defaultValue;
      }
   }

   public enum MethodToInvoke {
      GET_MEMOIZED_IS_INITIALIZED,
      SET_MEMOIZED_IS_INITIALIZED,
      BUILD_MESSAGE_INFO,
      NEW_MUTABLE_INSTANCE,
      NEW_BUILDER,
      GET_DEFAULT_INSTANCE,
      GET_PARSER;
   }

   protected static final class SerializedForm implements Serializable {
      private static final long serialVersionUID = 0L;
      private final Class<?> messageClass;
      private final String messageClassName;
      private final byte[] asBytes;

      public static GeneratedMessageLite.SerializedForm of(MessageLite var0) {
         return new GeneratedMessageLite.SerializedForm(var0);
      }

      SerializedForm(MessageLite var1) {
         this.messageClass = var1.getClass();
         this.messageClassName = var1.getClass().getName();
         this.asBytes = var1.toByteArray();
      }

      protected Object readResolve() {
         try {
            Class var1 = this.resolveMessageClass();
            java.lang.reflect.Field var2 = var1.getDeclaredField("DEFAULT_INSTANCE");
            var2.setAccessible(true);
            MessageLite var3 = (MessageLite)var2.get(null);
            return var3.newBuilderForType().mergeFrom(this.asBytes).buildPartial();
         } catch (ClassNotFoundException var4) {
            throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, var4);
         } catch (NoSuchFieldException var5) {
            return this.readResolveFallback();
         } catch (SecurityException var6) {
            throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.messageClassName, var6);
         } catch (IllegalAccessException var7) {
            throw new RuntimeException("Unable to call parsePartialFrom", var7);
         } catch (InvalidProtocolBufferException var8) {
            throw new RuntimeException("Unable to understand proto buffer", var8);
         }
      }

      @Deprecated
      private Object readResolveFallback() {
         try {
            Class var1 = this.resolveMessageClass();
            java.lang.reflect.Field var2 = var1.getDeclaredField("defaultInstance");
            var2.setAccessible(true);
            MessageLite var3 = (MessageLite)var2.get(null);
            return var3.newBuilderForType().mergeFrom(this.asBytes).buildPartial();
         } catch (ClassNotFoundException var4) {
            throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, var4);
         } catch (NoSuchFieldException var5) {
            throw new RuntimeException("Unable to find defaultInstance in " + this.messageClassName, var5);
         } catch (SecurityException var6) {
            throw new RuntimeException("Unable to call defaultInstance in " + this.messageClassName, var6);
         } catch (IllegalAccessException var7) {
            throw new RuntimeException("Unable to call parsePartialFrom", var7);
         } catch (InvalidProtocolBufferException var8) {
            throw new RuntimeException("Unable to understand proto buffer", var8);
         }
      }

      private Class<?> resolveMessageClass() {
         return this.messageClass != null ? this.messageClass : Class.forName(this.messageClassName);
      }
   }
}
