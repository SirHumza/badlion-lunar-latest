package com.google.protobuf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

@CheckReturnValue
final class ExtensionSchemaLite extends ExtensionSchema<GeneratedMessageLite.ExtensionDescriptor> {
   @Override
   boolean hasExtensions(MessageLite var1) {
      return var1 instanceof GeneratedMessageLite.ExtendableMessage;
   }

   @Override
   FieldSet<GeneratedMessageLite.ExtensionDescriptor> getExtensions(Object var1) {
      return ((GeneratedMessageLite.ExtendableMessage)var1).extensions;
   }

   @Override
   void setExtensions(Object var1, FieldSet<GeneratedMessageLite.ExtensionDescriptor> var2) {
      ((GeneratedMessageLite.ExtendableMessage)var1).extensions = var2;
   }

   @Override
   FieldSet<GeneratedMessageLite.ExtensionDescriptor> getMutableExtensions(Object var1) {
      return ((GeneratedMessageLite.ExtendableMessage)var1).ensureExtensionsAreMutable();
   }

   @Override
   void makeImmutable(Object var1) {
      this.getExtensions(var1).makeImmutable();
   }

   @Override
   <UT, UB> UB parseExtension(
      Object var1,
      Reader var2,
      Object var3,
      ExtensionRegistryLite var4,
      FieldSet<GeneratedMessageLite.ExtensionDescriptor> var5,
      UB var6,
      UnknownFieldSchema<UT, UB> var7
   ) {
      GeneratedMessageLite.GeneratedExtension var8 = (GeneratedMessageLite.GeneratedExtension)var3;
      int var9 = var8.getNumber();
      if (var8.descriptor.isRepeated() && var8.descriptor.isPacked()) {
         Object var14 = null;
         switch (var8.getLiteType()) {
            case DOUBLE:
               ArrayList var32 = new ArrayList();
               var2.readDoubleList(var32);
               var14 = var32;
               break;
            case FLOAT:
               ArrayList var31 = new ArrayList();
               var2.readFloatList(var31);
               var14 = var31;
               break;
            case INT64:
               ArrayList var30 = new ArrayList();
               var2.readInt64List(var30);
               var14 = var30;
               break;
            case UINT64:
               ArrayList var29 = new ArrayList();
               var2.readUInt64List(var29);
               var14 = var29;
               break;
            case INT32:
               ArrayList var28 = new ArrayList();
               var2.readInt32List(var28);
               var14 = var28;
               break;
            case FIXED64:
               ArrayList var27 = new ArrayList();
               var2.readFixed64List(var27);
               var14 = var27;
               break;
            case FIXED32:
               ArrayList var26 = new ArrayList();
               var2.readFixed32List(var26);
               var14 = var26;
               break;
            case BOOL:
               ArrayList var25 = new ArrayList();
               var2.readBoolList(var25);
               var14 = var25;
               break;
            case UINT32:
               ArrayList var24 = new ArrayList();
               var2.readUInt32List(var24);
               var14 = var24;
               break;
            case SFIXED32:
               ArrayList var23 = new ArrayList();
               var2.readSFixed32List(var23);
               var14 = var23;
               break;
            case SFIXED64:
               ArrayList var22 = new ArrayList();
               var2.readSFixed64List(var22);
               var14 = var22;
               break;
            case SINT32:
               ArrayList var21 = new ArrayList();
               var2.readSInt32List(var21);
               var14 = var21;
               break;
            case SINT64:
               ArrayList var20 = new ArrayList();
               var2.readSInt64List(var20);
               var14 = var20;
               break;
            case ENUM:
               ArrayList var19 = new ArrayList();
               var2.readEnumList(var19);
               var6 = SchemaUtil.filterUnknownEnumList(var1, var9, var19, var8.descriptor.getEnumType(), var6, var7);
               var14 = var19;
               break;
            default:
               throw new IllegalStateException("Type cannot be packed: " + var8.descriptor.getLiteType());
         }

         var5.setField(var8.descriptor, var14);
      } else {
         Object var10 = null;
         if (var8.getLiteType() == WireFormat.FieldType.ENUM) {
            int var11 = var2.readInt32();
            Internal.EnumLite var12 = var8.descriptor.getEnumType().findValueByNumber(var11);
            if (var12 == null) {
               return SchemaUtil.storeUnknownEnum(var1, var9, var11, (UB)var6, var7);
            }

            var10 = var11;
         } else {
            switch (var8.getLiteType()) {
               case DOUBLE:
                  var10 = var2.readDouble();
                  break;
               case FLOAT:
                  var10 = var2.readFloat();
                  break;
               case INT64:
                  var10 = var2.readInt64();
                  break;
               case UINT64:
                  var10 = var2.readUInt64();
                  break;
               case INT32:
                  var10 = var2.readInt32();
                  break;
               case FIXED64:
                  var10 = var2.readFixed64();
                  break;
               case FIXED32:
                  var10 = var2.readFixed32();
                  break;
               case BOOL:
                  var10 = var2.readBool();
                  break;
               case UINT32:
                  var10 = var2.readUInt32();
                  break;
               case SFIXED32:
                  var10 = var2.readSFixed32();
                  break;
               case SFIXED64:
                  var10 = var2.readSFixed64();
                  break;
               case SINT32:
                  var10 = var2.readSInt32();
                  break;
               case SINT64:
                  var10 = var2.readSInt64();
                  break;
               case ENUM:
                  throw new IllegalStateException("Shouldn't reach here.");
               case BYTES:
                  var10 = var2.readBytes();
                  break;
               case STRING:
                  var10 = var2.readString();
                  break;
               case GROUP:
                  if (!var8.isRepeated()) {
                     Object var17 = var5.getField(var8.descriptor);
                     if (var17 instanceof GeneratedMessageLite) {
                        Schema var34 = Protobuf.getInstance().schemaFor(var17);
                        if (!((GeneratedMessageLite)var17).isMutable()) {
                           Object var35 = var34.newInstance();
                           var34.mergeFrom(var35, var17);
                           var5.setField(var8.descriptor, var35);
                           var17 = var35;
                        }

                        var2.mergeGroupField(var17, var34, var4);
                        return (UB)var6;
                     }
                  }

                  var10 = var2.readGroup(var8.getMessageDefaultInstance().getClass(), var4);
                  break;
               case MESSAGE:
                  if (!var8.isRepeated()) {
                     Object var16 = var5.getField(var8.descriptor);
                     if (var16 instanceof GeneratedMessageLite) {
                        Schema var33 = Protobuf.getInstance().schemaFor(var16);
                        if (!((GeneratedMessageLite)var16).isMutable()) {
                           Object var13 = var33.newInstance();
                           var33.mergeFrom(var13, var16);
                           var5.setField(var8.descriptor, var13);
                           var16 = var13;
                        }

                        var2.mergeMessageField(var16, var33, var4);
                        return (UB)var6;
                     }
                  }

                  var10 = var2.readMessage(var8.getMessageDefaultInstance().getClass(), var4);
            }
         }

         if (var8.isRepeated()) {
            var5.addRepeatedField(var8.descriptor, var10);
         } else {
            switch (var8.getLiteType()) {
               case GROUP:
               case MESSAGE:
                  Object var18 = var5.getField(var8.descriptor);
                  if (var18 != null) {
                     var10 = Internal.mergeMessage(var18, var10);
                  }
               default:
                  var5.setField(var8.descriptor, var10);
            }
         }
      }

      return (UB)var6;
   }

   @Override
   int extensionNumber(Entry<?, ?> var1) {
      GeneratedMessageLite.ExtensionDescriptor var2 = (GeneratedMessageLite.ExtensionDescriptor)var1.getKey();
      return var2.getNumber();
   }

   @Override
   void serializeExtension(Writer var1, Entry<?, ?> var2) {
      GeneratedMessageLite.ExtensionDescriptor var3 = (GeneratedMessageLite.ExtensionDescriptor)var2.getKey();
      if (var3.isRepeated()) {
         switch (var3.getLiteType()) {
            case DOUBLE:
               SchemaUtil.writeDoubleList(var3.getNumber(), (List<Double>)var2.getValue(), var1, var3.isPacked());
               break;
            case FLOAT:
               SchemaUtil.writeFloatList(var3.getNumber(), (List<Float>)var2.getValue(), var1, var3.isPacked());
               break;
            case INT64:
               SchemaUtil.writeInt64List(var3.getNumber(), (List<Long>)var2.getValue(), var1, var3.isPacked());
               break;
            case UINT64:
               SchemaUtil.writeUInt64List(var3.getNumber(), (List<Long>)var2.getValue(), var1, var3.isPacked());
               break;
            case INT32:
               SchemaUtil.writeInt32List(var3.getNumber(), (List<Integer>)var2.getValue(), var1, var3.isPacked());
               break;
            case FIXED64:
               SchemaUtil.writeFixed64List(var3.getNumber(), (List<Long>)var2.getValue(), var1, var3.isPacked());
               break;
            case FIXED32:
               SchemaUtil.writeFixed32List(var3.getNumber(), (List<Integer>)var2.getValue(), var1, var3.isPacked());
               break;
            case BOOL:
               SchemaUtil.writeBoolList(var3.getNumber(), (List<Boolean>)var2.getValue(), var1, var3.isPacked());
               break;
            case UINT32:
               SchemaUtil.writeUInt32List(var3.getNumber(), (List<Integer>)var2.getValue(), var1, var3.isPacked());
               break;
            case SFIXED32:
               SchemaUtil.writeSFixed32List(var3.getNumber(), (List<Integer>)var2.getValue(), var1, var3.isPacked());
               break;
            case SFIXED64:
               SchemaUtil.writeSFixed64List(var3.getNumber(), (List<Long>)var2.getValue(), var1, var3.isPacked());
               break;
            case SINT32:
               SchemaUtil.writeSInt32List(var3.getNumber(), (List<Integer>)var2.getValue(), var1, var3.isPacked());
               break;
            case SINT64:
               SchemaUtil.writeSInt64List(var3.getNumber(), (List<Long>)var2.getValue(), var1, var3.isPacked());
               break;
            case ENUM:
               SchemaUtil.writeInt32List(var3.getNumber(), (List<Integer>)var2.getValue(), var1, var3.isPacked());
               break;
            case BYTES:
               SchemaUtil.writeBytesList(var3.getNumber(), (List<ByteString>)var2.getValue(), var1);
               break;
            case STRING:
               SchemaUtil.writeStringList(var3.getNumber(), (List<String>)var2.getValue(), var1);
               break;
            case GROUP:
               List var5 = (List)var2.getValue();
               if (var5 != null && !var5.isEmpty()) {
                  SchemaUtil.writeGroupList(var3.getNumber(), (List<?>)var2.getValue(), var1, Protobuf.getInstance().schemaFor(var5.get(0).getClass()));
               }
               break;
            case MESSAGE:
               List var4 = (List)var2.getValue();
               if (var4 != null && !var4.isEmpty()) {
                  SchemaUtil.writeMessageList(var3.getNumber(), (List<?>)var2.getValue(), var1, Protobuf.getInstance().schemaFor(var4.get(0).getClass()));
               }
         }
      } else {
         switch (var3.getLiteType()) {
            case DOUBLE:
               var1.writeDouble(var3.getNumber(), (Double)var2.getValue());
               break;
            case FLOAT:
               var1.writeFloat(var3.getNumber(), (Float)var2.getValue());
               break;
            case INT64:
               var1.writeInt64(var3.getNumber(), (Long)var2.getValue());
               break;
            case UINT64:
               var1.writeUInt64(var3.getNumber(), (Long)var2.getValue());
               break;
            case INT32:
               var1.writeInt32(var3.getNumber(), (Integer)var2.getValue());
               break;
            case FIXED64:
               var1.writeFixed64(var3.getNumber(), (Long)var2.getValue());
               break;
            case FIXED32:
               var1.writeFixed32(var3.getNumber(), (Integer)var2.getValue());
               break;
            case BOOL:
               var1.writeBool(var3.getNumber(), (Boolean)var2.getValue());
               break;
            case UINT32:
               var1.writeUInt32(var3.getNumber(), (Integer)var2.getValue());
               break;
            case SFIXED32:
               var1.writeSFixed32(var3.getNumber(), (Integer)var2.getValue());
               break;
            case SFIXED64:
               var1.writeSFixed64(var3.getNumber(), (Long)var2.getValue());
               break;
            case SINT32:
               var1.writeSInt32(var3.getNumber(), (Integer)var2.getValue());
               break;
            case SINT64:
               var1.writeSInt64(var3.getNumber(), (Long)var2.getValue());
               break;
            case ENUM:
               var1.writeInt32(var3.getNumber(), (Integer)var2.getValue());
               break;
            case BYTES:
               var1.writeBytes(var3.getNumber(), (ByteString)var2.getValue());
               break;
            case STRING:
               var1.writeString(var3.getNumber(), (String)var2.getValue());
               break;
            case GROUP:
               var1.writeGroup(var3.getNumber(), var2.getValue(), Protobuf.getInstance().schemaFor(var2.getValue().getClass()));
               break;
            case MESSAGE:
               var1.writeMessage(var3.getNumber(), var2.getValue(), Protobuf.getInstance().schemaFor(var2.getValue().getClass()));
         }
      }
   }

   @Override
   Object findExtensionByNumber(ExtensionRegistryLite var1, MessageLite var2, int var3) {
      return var1.findLiteExtensionByNumber(var2, var3);
   }

   @Override
   void parseLengthPrefixedMessageSetItem(Reader var1, Object var2, ExtensionRegistryLite var3, FieldSet<GeneratedMessageLite.ExtensionDescriptor> var4) {
      GeneratedMessageLite.GeneratedExtension var5 = (GeneratedMessageLite.GeneratedExtension)var2;
      Object var6 = var1.readMessage(var5.getMessageDefaultInstance().getClass(), var3);
      var4.setField(var5.descriptor, var6);
   }

   @Override
   void parseMessageSetItem(ByteString var1, Object var2, ExtensionRegistryLite var3, FieldSet<GeneratedMessageLite.ExtensionDescriptor> var4) {
      GeneratedMessageLite.GeneratedExtension var5 = (GeneratedMessageLite.GeneratedExtension)var2;
      MessageLite.Builder var6 = var5.getMessageDefaultInstance().newBuilderForType();
      CodedInputStream var7 = var1.newCodedInput();
      var6.mergeFrom(var7, var3);
      var4.setField(var5.descriptor, var6.buildPartial());
      var7.checkLastTagWas(0);
   }
}
