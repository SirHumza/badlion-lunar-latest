package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class DynamicMessage extends AbstractMessage {
   private final Descriptors.Descriptor type;
   private final FieldSet<Descriptors.FieldDescriptor> fields;
   private final Descriptors.FieldDescriptor[] oneofCases;
   private final UnknownFieldSet unknownFields;
   private int memoizedSize = -1;

   DynamicMessage(Descriptors.Descriptor var1, FieldSet<Descriptors.FieldDescriptor> var2, Descriptors.FieldDescriptor[] var3, UnknownFieldSet var4) {
      this.type = var1;
      this.fields = var2;
      this.oneofCases = var3;
      this.unknownFields = var4;
   }

   public static DynamicMessage getDefaultInstance(Descriptors.Descriptor var0) {
      int var1 = var0.toProto().getOneofDeclCount();
      Descriptors.FieldDescriptor[] var2 = new Descriptors.FieldDescriptor[var1];
      return new DynamicMessage(var0, FieldSet.emptySet(), var2, UnknownFieldSet.getDefaultInstance());
   }

   public static DynamicMessage parseFrom(Descriptors.Descriptor var0, CodedInputStream var1) {
      return newBuilder(var0).mergeFrom(var1).buildParsed();
   }

   public static DynamicMessage parseFrom(Descriptors.Descriptor var0, CodedInputStream var1, ExtensionRegistry var2) {
      return newBuilder(var0).mergeFrom(var1, var2).buildParsed();
   }

   public static DynamicMessage parseFrom(Descriptors.Descriptor var0, ByteString var1) {
      return newBuilder(var0).mergeFrom(var1).buildParsed();
   }

   public static DynamicMessage parseFrom(Descriptors.Descriptor var0, ByteString var1, ExtensionRegistry var2) {
      return newBuilder(var0).mergeFrom(var1, var2).buildParsed();
   }

   public static DynamicMessage parseFrom(Descriptors.Descriptor var0, byte[] var1) {
      return newBuilder(var0).mergeFrom(var1).buildParsed();
   }

   public static DynamicMessage parseFrom(Descriptors.Descriptor var0, byte[] var1, ExtensionRegistry var2) {
      return newBuilder(var0).mergeFrom(var1, var2).buildParsed();
   }

   public static DynamicMessage parseFrom(Descriptors.Descriptor var0, InputStream var1) {
      return newBuilder(var0).mergeFrom(var1).buildParsed();
   }

   public static DynamicMessage parseFrom(Descriptors.Descriptor var0, InputStream var1, ExtensionRegistry var2) {
      return newBuilder(var0).mergeFrom(var1, var2).buildParsed();
   }

   public static DynamicMessage.Builder newBuilder(Descriptors.Descriptor var0) {
      return new DynamicMessage.Builder(var0);
   }

   public static DynamicMessage.Builder newBuilder(Message var0) {
      return new DynamicMessage.Builder(var0.getDescriptorForType()).mergeFrom(var0);
   }

   @Override
   public Descriptors.Descriptor getDescriptorForType() {
      return this.type;
   }

   public DynamicMessage getDefaultInstanceForType() {
      return getDefaultInstance(this.type);
   }

   @Override
   public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
      return this.fields.getAllFields();
   }

   @Override
   public boolean hasOneof(Descriptors.OneofDescriptor var1) {
      this.verifyOneofContainingType(var1);
      Descriptors.FieldDescriptor var2 = this.oneofCases[var1.getIndex()];
      return var2 != null;
   }

   @Override
   public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor var1) {
      this.verifyOneofContainingType(var1);
      return this.oneofCases[var1.getIndex()];
   }

   @Override
   public boolean hasField(Descriptors.FieldDescriptor var1) {
      this.verifyContainingType(var1);
      return this.fields.hasField(var1);
   }

   @Override
   public Object getField(Descriptors.FieldDescriptor var1) {
      this.verifyContainingType(var1);
      Object var2 = this.fields.getField(var1);
      if (var2 == null) {
         if (var1.isRepeated()) {
            var2 = Collections.emptyList();
         } else if (var1.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            var2 = getDefaultInstance(var1.getMessageType());
         } else {
            var2 = var1.getDefaultValue();
         }
      }

      return var2;
   }

   @Override
   public int getRepeatedFieldCount(Descriptors.FieldDescriptor var1) {
      this.verifyContainingType(var1);
      return this.fields.getRepeatedFieldCount(var1);
   }

   @Override
   public Object getRepeatedField(Descriptors.FieldDescriptor var1, int var2) {
      this.verifyContainingType(var1);
      return this.fields.getRepeatedField(var1, var2);
   }

   @Override
   public UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   static boolean isInitialized(Descriptors.Descriptor var0, FieldSet<Descriptors.FieldDescriptor> var1) {
      for (Descriptors.FieldDescriptor var3 : var0.getFields()) {
         if (var3.isRequired() && !var1.hasField(var3)) {
            return false;
         }
      }

      return var1.isInitialized();
   }

   @Override
   public boolean isInitialized() {
      return isInitialized(this.type, this.fields);
   }

   @Override
   public void writeTo(CodedOutputStream var1) {
      if (this.type.getOptions().getMessageSetWireFormat()) {
         this.fields.writeMessageSetTo(var1);
         this.unknownFields.writeAsMessageSetTo(var1);
      } else {
         this.fields.writeTo(var1);
         this.unknownFields.writeTo(var1);
      }
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      if (this.type.getOptions().getMessageSetWireFormat()) {
         var1 = this.fields.getMessageSetSerializedSize();
         var1 += this.unknownFields.getSerializedSizeAsMessageSet();
      } else {
         var1 = this.fields.getSerializedSize();
         var1 += this.unknownFields.getSerializedSize();
      }

      this.memoizedSize = var1;
      return var1;
   }

   public DynamicMessage.Builder newBuilderForType() {
      return new DynamicMessage.Builder(this.type);
   }

   public DynamicMessage.Builder toBuilder() {
      return this.newBuilderForType().mergeFrom(this);
   }

   @Override
   public Parser<DynamicMessage> getParserForType() {
      return new AbstractParser<DynamicMessage>() {
         public DynamicMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            DynamicMessage.Builder var3 = DynamicMessage.newBuilder(DynamicMessage.this.type);

            try {
               var3.mergeFrom(var1, var2);
            } catch (InvalidProtocolBufferException var5) {
               throw var5.setUnfinishedMessage(var3.buildPartial());
            } catch (IOException var6) {
               throw new InvalidProtocolBufferException(var6).setUnfinishedMessage(var3.buildPartial());
            }

            return var3.buildPartial();
         }
      };
   }

   private void verifyContainingType(Descriptors.FieldDescriptor var1) {
      if (var1.getContainingType() != this.type) {
         throw new IllegalArgumentException("FieldDescriptor does not match message type.");
      }
   }

   private void verifyOneofContainingType(Descriptors.OneofDescriptor var1) {
      if (var1.getContainingType() != this.type) {
         throw new IllegalArgumentException("OneofDescriptor does not match message type.");
      }
   }

   public static final class Builder extends AbstractMessage.Builder<DynamicMessage.Builder> {
      private final Descriptors.Descriptor type;
      private FieldSet.Builder<Descriptors.FieldDescriptor> fields;
      private final Descriptors.FieldDescriptor[] oneofCases;
      private UnknownFieldSet unknownFields;

      private Builder(Descriptors.Descriptor var1) {
         this.type = var1;
         this.fields = FieldSet.newBuilder();
         this.unknownFields = UnknownFieldSet.getDefaultInstance();
         this.oneofCases = new Descriptors.FieldDescriptor[var1.toProto().getOneofDeclCount()];
      }

      public DynamicMessage.Builder clear() {
         this.fields = FieldSet.newBuilder();
         this.unknownFields = UnknownFieldSet.getDefaultInstance();
         return this;
      }

      public DynamicMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof DynamicMessage) {
            DynamicMessage var2 = (DynamicMessage)var1;
            if (var2.type != this.type) {
               throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
            }

            this.fields.mergeFrom(var2.fields);
            this.mergeUnknownFields(var2.unknownFields);

            for (int var3 = 0; var3 < this.oneofCases.length; var3++) {
               if (this.oneofCases[var3] == null) {
                  this.oneofCases[var3] = var2.oneofCases[var3];
               } else if (var2.oneofCases[var3] != null && this.oneofCases[var3] != var2.oneofCases[var3]) {
                  this.fields.clearField(this.oneofCases[var3]);
                  this.oneofCases[var3] = var2.oneofCases[var3];
               }
            }

            return this;
         } else {
            return (DynamicMessage.Builder)super.mergeFrom(var1);
         }
      }

      public DynamicMessage build() {
         if (!this.isInitialized()) {
            throw newUninitializedMessageException(
               new DynamicMessage(this.type, this.fields.build(), Arrays.copyOf(this.oneofCases, this.oneofCases.length), this.unknownFields)
            );
         } else {
            return this.buildPartial();
         }
      }

      private DynamicMessage buildParsed() {
         if (!this.isInitialized()) {
            throw newUninitializedMessageException(
                  new DynamicMessage(this.type, this.fields.build(), Arrays.copyOf(this.oneofCases, this.oneofCases.length), this.unknownFields)
               )
               .asInvalidProtocolBufferException();
         } else {
            return this.buildPartial();
         }
      }

      public DynamicMessage buildPartial() {
         if (this.type.getOptions().getMapEntry()) {
            for (Descriptors.FieldDescriptor var2 : this.type.getFields()) {
               if (var2.isOptional() && !this.fields.hasField(var2)) {
                  if (var2.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                     this.fields.setField(var2, DynamicMessage.getDefaultInstance(var2.getMessageType()));
                  } else {
                     this.fields.setField(var2, var2.getDefaultValue());
                  }
               }
            }
         }

         return new DynamicMessage(this.type, this.fields.buildPartial(), Arrays.copyOf(this.oneofCases, this.oneofCases.length), this.unknownFields);
      }

      public DynamicMessage.Builder clone() {
         DynamicMessage.Builder var1 = new DynamicMessage.Builder(this.type);
         var1.fields.mergeFrom(this.fields.build());
         var1.mergeUnknownFields(this.unknownFields);
         System.arraycopy(this.oneofCases, 0, var1.oneofCases, 0, this.oneofCases.length);
         return var1;
      }

      @Override
      public boolean isInitialized() {
         for (Descriptors.FieldDescriptor var2 : this.type.getFields()) {
            if (var2.isRequired() && !this.fields.hasField(var2)) {
               return false;
            }
         }

         return this.fields.isInitialized();
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return this.type;
      }

      public DynamicMessage getDefaultInstanceForType() {
         return DynamicMessage.getDefaultInstance(this.type);
      }

      @Override
      public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
         return this.fields.getAllFields();
      }

      public DynamicMessage.Builder newBuilderForField(Descriptors.FieldDescriptor var1) {
         this.verifyContainingType(var1);
         if (var1.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            throw new IllegalArgumentException("newBuilderForField is only valid for fields with message type.");
         } else {
            return new DynamicMessage.Builder(var1.getMessageType());
         }
      }

      @Override
      public boolean hasOneof(Descriptors.OneofDescriptor var1) {
         this.verifyOneofContainingType(var1);
         Descriptors.FieldDescriptor var2 = this.oneofCases[var1.getIndex()];
         return var2 != null;
      }

      @Override
      public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor var1) {
         this.verifyOneofContainingType(var1);
         return this.oneofCases[var1.getIndex()];
      }

      public DynamicMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         this.verifyOneofContainingType(var1);
         Descriptors.FieldDescriptor var2 = this.oneofCases[var1.getIndex()];
         if (var2 != null) {
            this.clearField(var2);
         }

         return this;
      }

      @Override
      public boolean hasField(Descriptors.FieldDescriptor var1) {
         this.verifyContainingType(var1);
         return this.fields.hasField(var1);
      }

      @Override
      public Object getField(Descriptors.FieldDescriptor var1) {
         this.verifyContainingType(var1);
         Object var2 = this.fields.getField(var1);
         if (var2 == null) {
            if (var1.isRepeated()) {
               var2 = Collections.emptyList();
            } else if (var1.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
               var2 = DynamicMessage.getDefaultInstance(var1.getMessageType());
            } else {
               var2 = var1.getDefaultValue();
            }
         }

         return var2;
      }

      public DynamicMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         this.verifyContainingType(var1);
         this.verifyType(var1, var2);
         Descriptors.OneofDescriptor var3 = var1.getContainingOneof();
         if (var3 != null) {
            int var4 = var3.getIndex();
            Descriptors.FieldDescriptor var5 = this.oneofCases[var4];
            if (var5 != null && var5 != var1) {
               this.fields.clearField(var5);
            }

            this.oneofCases[var4] = var1;
         } else if (!var1.hasPresence() && !var1.isRepeated() && var2.equals(var1.getDefaultValue())) {
            this.fields.clearField(var1);
            return this;
         }

         this.fields.setField(var1, var2);
         return this;
      }

      public DynamicMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         this.verifyContainingType(var1);
         Descriptors.OneofDescriptor var2 = var1.getContainingOneof();
         if (var2 != null) {
            int var3 = var2.getIndex();
            if (this.oneofCases[var3] == var1) {
               this.oneofCases[var3] = null;
            }
         }

         this.fields.clearField(var1);
         return this;
      }

      @Override
      public int getRepeatedFieldCount(Descriptors.FieldDescriptor var1) {
         this.verifyContainingType(var1);
         return this.fields.getRepeatedFieldCount(var1);
      }

      @Override
      public Object getRepeatedField(Descriptors.FieldDescriptor var1, int var2) {
         this.verifyContainingType(var1);
         return this.fields.getRepeatedField(var1, var2);
      }

      public DynamicMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         this.verifyContainingType(var1);
         this.verifySingularValueType(var1, var3);
         this.fields.setRepeatedField(var1, var2, var3);
         return this;
      }

      public DynamicMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         this.verifyContainingType(var1);
         this.verifySingularValueType(var1, var2);
         this.fields.addRepeatedField(var1, var2);
         return this;
      }

      @Override
      public UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      public DynamicMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         this.unknownFields = var1;
         return this;
      }

      public DynamicMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         this.unknownFields = UnknownFieldSet.newBuilder(this.unknownFields).mergeFrom(var1).build();
         return this;
      }

      private void verifyContainingType(Descriptors.FieldDescriptor var1) {
         if (var1.getContainingType() != this.type) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
         }
      }

      private void verifyOneofContainingType(Descriptors.OneofDescriptor var1) {
         if (var1.getContainingType() != this.type) {
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
         }
      }

      private void verifySingularValueType(Descriptors.FieldDescriptor var1, Object var2) {
         switch (var1.getType()) {
            case ENUM:
               Internal.checkNotNull(var2);
               if (!(var2 instanceof Descriptors.EnumValueDescriptor)) {
                  throw new IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
               }
               break;
            case MESSAGE:
               if (var2 instanceof Message.Builder) {
                  throw new IllegalArgumentException(
                     String.format(
                        "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n",
                        var1.getNumber(),
                        var1.getLiteType().getJavaType(),
                        var2.getClass().getName()
                     )
                  );
               }
         }
      }

      private void verifyType(Descriptors.FieldDescriptor var1, Object var2) {
         if (var1.isRepeated()) {
            for (Object var4 : (List)var2) {
               this.verifySingularValueType(var1, var4);
            }
         } else {
            this.verifySingularValueType(var1, var2);
         }
      }

      @Override
      public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor var1) {
         this.verifyContainingType(var1);
         if (var1.isMapField()) {
            throw new UnsupportedOperationException("Nested builder not supported for map fields.");
         }

         if (var1.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
         }

         Object var2 = this.fields.getFieldAllowBuilders(var1);
         Message.Builder var3 = var2 == null ? new DynamicMessage.Builder(var1.getMessageType()) : toMessageBuilder(var2);
         this.fields.setField(var1, var3);
         return var3;
      }

      @Override
      public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor var1, int var2) {
         this.verifyContainingType(var1);
         if (var1.isMapField()) {
            throw new UnsupportedOperationException("Map fields cannot be repeated");
         }

         if (var1.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
         }

         Message.Builder var3 = toMessageBuilder(this.fields.getRepeatedFieldAllowBuilders(var1, var2));
         this.fields.setRepeatedField(var1, var2, var3);
         return var3;
      }

      private static Message.Builder toMessageBuilder(Object var0) {
         if (var0 instanceof Message.Builder) {
            return (Message.Builder)var0;
         }

         if (var0 instanceof LazyField) {
            var0 = ((LazyField)var0).getValue();
         }

         if (var0 instanceof Message) {
            return ((Message)var0).toBuilder();
         } else {
            throw new IllegalArgumentException(String.format("Cannot convert %s to Message.Builder", var0.getClass()));
         }
      }
   }
}
