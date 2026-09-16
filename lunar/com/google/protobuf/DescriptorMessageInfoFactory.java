package com.google.protobuf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

final class DescriptorMessageInfoFactory implements MessageInfoFactory {
   private static final String GET_DEFAULT_INSTANCE_METHOD_NAME = "getDefaultInstance";
   private static final DescriptorMessageInfoFactory instance = new DescriptorMessageInfoFactory();
   private static final Set<String> specialFieldNames = new HashSet<>(
      Arrays.asList(
         "Class",
         "DefaultInstanceForType",
         "ParserForType",
         "SerializedSize",
         "AllFields",
         "DescriptorForType",
         "InitializationErrorString",
         "UnknownFields",
         "CachedSize"
      )
   );
   private static DescriptorMessageInfoFactory.IsInitializedCheckAnalyzer isInitializedCheckAnalyzer = new DescriptorMessageInfoFactory.IsInitializedCheckAnalyzer();

   private DescriptorMessageInfoFactory() {
   }

   public static DescriptorMessageInfoFactory getInstance() {
      return instance;
   }

   @Override
   public boolean isSupported(Class<?> var1) {
      return GeneratedMessageV3.class.isAssignableFrom(var1);
   }

   @Override
   public MessageInfo messageInfoFor(Class<?> var1) {
      if (!GeneratedMessageV3.class.isAssignableFrom(var1)) {
         throw new IllegalArgumentException("Unsupported message type: " + var1.getName());
      } else {
         return convert(var1, descriptorForType(var1));
      }
   }

   private static Message getDefaultInstance(Class<?> var0) {
      try {
         java.lang.reflect.Method var1 = var0.getDeclaredMethod("getDefaultInstance");
         return (Message)var1.invoke(null);
      } catch (Exception var2) {
         throw new IllegalArgumentException("Unable to get default instance for message class " + var0.getName(), var2);
      }
   }

   private static Descriptors.Descriptor descriptorForType(Class<?> var0) {
      return getDefaultInstance(var0).getDescriptorForType();
   }

   private static ProtoSyntax convertSyntax(Descriptors.FileDescriptor.Syntax var0) {
      switch (var0) {
         case PROTO2:
            return ProtoSyntax.PROTO2;
         case PROTO3:
            return ProtoSyntax.PROTO3;
         case EDITIONS:
            return ProtoSyntax.EDITIONS;
         default:
            throw new IllegalArgumentException("Unsupported syntax: " + var0);
      }
   }

   private static MessageInfo convert(Class<?> var0, Descriptors.Descriptor var1) {
      List var2 = var1.getFields();
      StructuralMessageInfo.Builder var3 = StructuralMessageInfo.newBuilder(var2.size());
      var3.withDefaultInstance(getDefaultInstance(var0));
      var3.withSyntax(convertSyntax(var1.getFile().getSyntax()));
      var3.withMessageSetWireFormat(var1.getOptions().getMessageSetWireFormat());
      DescriptorMessageInfoFactory.OneofState var4 = new DescriptorMessageInfoFactory.OneofState();
      int var5 = 0;
      byte var6 = 1;
      java.lang.reflect.Field var7 = null;

      for (int var8 = 0; var8 < var2.size(); var8++) {
         final Descriptors.FieldDescriptor var9 = (Descriptors.FieldDescriptor)var2.get(var8);
         boolean var10 = var9.needsUtf8Check();
         Internal.EnumVerifier var11 = null;
         if (var9.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM && var9.legacyEnumFieldTreatedAsClosed()) {
            var11 = new Internal.EnumVerifier() {
               @Override
               public boolean isInRange(int var1) {
                  return var9.getEnumType().findValueByNumber(var1) != null;
               }
            };
         }

         if (var9.getRealContainingOneof() != null) {
            var3.withField(buildOneofMember(var0, var9, var4, var10, var11));
         } else {
            java.lang.reflect.Field var12 = field(var0, var9);
            int var13 = var9.getNumber();
            FieldType var14 = getFieldType(var9);
            if (!var9.hasPresence()) {
               FieldInfo var15;
               if (var9.isMapField()) {
                  final Descriptors.FieldDescriptor var16 = var9.getMessageType().findFieldByNumber(2);
                  if (var16.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM && var16.legacyEnumFieldTreatedAsClosed()) {
                     var11 = new Internal.EnumVerifier() {
                        @Override
                        public boolean isInRange(int var1) {
                           return var16.getEnumType().findValueByNumber(var1) != null;
                        }
                     };
                  }

                  var15 = FieldInfo.forMapField(var12, var13, SchemaUtil.getMapDefaultEntry(var0, var9.getName()), var11);
               } else if (var9.isRepeated() && var9.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                  var15 = FieldInfo.forRepeatedMessageField(var12, var13, var14, getTypeForRepeatedMessageField(var0, var9));
               } else if (var9.isPacked()) {
                  if (var11 != null) {
                     var15 = FieldInfo.forPackedFieldWithEnumVerifier(var12, var13, var14, var11, cachedSizeField(var0, var9));
                  } else {
                     var15 = FieldInfo.forPackedField(var12, var13, var14, cachedSizeField(var0, var9));
                  }
               } else if (var11 != null) {
                  var15 = FieldInfo.forFieldWithEnumVerifier(var12, var13, var14, var11);
               } else {
                  var15 = FieldInfo.forField(var12, var13, var14, var10);
               }

               var3.withField(var15);
            } else {
               if (var7 == null) {
                  var7 = bitField(var0, var5);
               }

               FieldInfo var22;
               if (var9.isRequired()) {
                  var22 = FieldInfo.forLegacyRequiredField(var12, var13, var14, var7, var6, var10, var11);
               } else {
                  var22 = FieldInfo.forExplicitPresenceField(var12, var13, var14, var7, var6, var10, var11);
               }

               var3.withField(var22);
               var6 <<= 1;
               if (var6 == 0) {
                  var7 = null;
                  var6 = 1;
                  var5++;
               }
            }
         }
      }

      ArrayList var17 = new ArrayList();

      for (int var18 = 0; var18 < var2.size(); var18++) {
         Descriptors.FieldDescriptor var20 = (Descriptors.FieldDescriptor)var2.get(var18);
         if (var20.isRequired() || var20.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE && needsIsInitializedCheck(var20.getMessageType())) {
            var17.add(var20.getNumber());
         }
      }

      int[] var19 = new int[var17.size()];

      for (int var21 = 0; var21 < var17.size(); var21++) {
         var19[var21] = (Integer)var17.get(var21);
      }

      if (var19.length > 0) {
         var3.withCheckInitialized(var19);
      }

      return var3.build();
   }

   private static boolean needsIsInitializedCheck(Descriptors.Descriptor var0) {
      return isInitializedCheckAnalyzer.needsIsInitializedCheck(var0);
   }

   private static FieldInfo buildOneofMember(
      Class<?> var0, Descriptors.FieldDescriptor var1, DescriptorMessageInfoFactory.OneofState var2, boolean var3, Internal.EnumVerifier var4
   ) {
      OneofInfo var5 = var2.getOneof(var0, var1.getContainingOneof());
      FieldType var6 = getFieldType(var1);
      Class var7 = getOneofStoredType(var0, var1, var6);
      return FieldInfo.forOneofMemberField(var1.getNumber(), var6, var5, var7, var3, var4);
   }

   private static Class<?> getOneofStoredType(Class<?> var0, Descriptors.FieldDescriptor var1, FieldType var2) {
      switch (var2.getJavaType()) {
         case BOOLEAN:
            return Boolean.class;
         case BYTE_STRING:
            return ByteString.class;
         case DOUBLE:
            return Double.class;
         case FLOAT:
            return Float.class;
         case ENUM:
         case INT:
            return Integer.class;
         case LONG:
            return Long.class;
         case STRING:
            return String.class;
         case MESSAGE:
            return getOneofStoredTypeForMessage(var0, var1);
         default:
            throw new IllegalArgumentException("Invalid type for oneof: " + var2);
      }
   }

   private static FieldType getFieldType(Descriptors.FieldDescriptor var0) {
      switch (var0.getType()) {
         case BOOL:
            if (!var0.isRepeated()) {
               return FieldType.BOOL;
            }

            return var0.isPacked() ? FieldType.BOOL_LIST_PACKED : FieldType.BOOL_LIST;
         case BYTES:
            return var0.isRepeated() ? FieldType.BYTES_LIST : FieldType.BYTES;
         case DOUBLE:
            if (!var0.isRepeated()) {
               return FieldType.DOUBLE;
            }

            return var0.isPacked() ? FieldType.DOUBLE_LIST_PACKED : FieldType.DOUBLE_LIST;
         case ENUM:
            if (!var0.isRepeated()) {
               return FieldType.ENUM;
            }

            return var0.isPacked() ? FieldType.ENUM_LIST_PACKED : FieldType.ENUM_LIST;
         case FIXED32:
            if (!var0.isRepeated()) {
               return FieldType.FIXED32;
            }

            return var0.isPacked() ? FieldType.FIXED32_LIST_PACKED : FieldType.FIXED32_LIST;
         case FIXED64:
            if (!var0.isRepeated()) {
               return FieldType.FIXED64;
            }

            return var0.isPacked() ? FieldType.FIXED64_LIST_PACKED : FieldType.FIXED64_LIST;
         case FLOAT:
            if (!var0.isRepeated()) {
               return FieldType.FLOAT;
            }

            return var0.isPacked() ? FieldType.FLOAT_LIST_PACKED : FieldType.FLOAT_LIST;
         case GROUP:
            return var0.isRepeated() ? FieldType.GROUP_LIST : FieldType.GROUP;
         case INT32:
            if (!var0.isRepeated()) {
               return FieldType.INT32;
            }

            return var0.isPacked() ? FieldType.INT32_LIST_PACKED : FieldType.INT32_LIST;
         case INT64:
            if (!var0.isRepeated()) {
               return FieldType.INT64;
            }

            return var0.isPacked() ? FieldType.INT64_LIST_PACKED : FieldType.INT64_LIST;
         case MESSAGE:
            if (var0.isMapField()) {
               return FieldType.MAP;
            }

            return var0.isRepeated() ? FieldType.MESSAGE_LIST : FieldType.MESSAGE;
         case SFIXED32:
            if (!var0.isRepeated()) {
               return FieldType.SFIXED32;
            }

            return var0.isPacked() ? FieldType.SFIXED32_LIST_PACKED : FieldType.SFIXED32_LIST;
         case SFIXED64:
            if (!var0.isRepeated()) {
               return FieldType.SFIXED64;
            }

            return var0.isPacked() ? FieldType.SFIXED64_LIST_PACKED : FieldType.SFIXED64_LIST;
         case SINT32:
            if (!var0.isRepeated()) {
               return FieldType.SINT32;
            }

            return var0.isPacked() ? FieldType.SINT32_LIST_PACKED : FieldType.SINT32_LIST;
         case SINT64:
            if (!var0.isRepeated()) {
               return FieldType.SINT64;
            }

            return var0.isPacked() ? FieldType.SINT64_LIST_PACKED : FieldType.SINT64_LIST;
         case STRING:
            return var0.isRepeated() ? FieldType.STRING_LIST : FieldType.STRING;
         case UINT32:
            if (!var0.isRepeated()) {
               return FieldType.UINT32;
            }

            return var0.isPacked() ? FieldType.UINT32_LIST_PACKED : FieldType.UINT32_LIST;
         case UINT64:
            if (!var0.isRepeated()) {
               return FieldType.UINT64;
            }

            return var0.isPacked() ? FieldType.UINT64_LIST_PACKED : FieldType.UINT64_LIST;
         default:
            throw new IllegalArgumentException("Unsupported field type: " + var0.getType());
      }
   }

   private static java.lang.reflect.Field bitField(Class<?> var0, int var1) {
      return field(var0, "bitField" + var1 + "_");
   }

   private static java.lang.reflect.Field field(Class<?> var0, Descriptors.FieldDescriptor var1) {
      return field(var0, getFieldName(var1));
   }

   private static java.lang.reflect.Field cachedSizeField(Class<?> var0, Descriptors.FieldDescriptor var1) {
      return field(var0, getCachedSizeFieldName(var1));
   }

   private static java.lang.reflect.Field field(Class<?> var0, String var1) {
      try {
         return var0.getDeclaredField(var1);
      } catch (Exception var3) {
         throw new IllegalArgumentException("Unable to find field " + var1 + " in message class " + var0.getName());
      }
   }

   static String getFieldName(Descriptors.FieldDescriptor var0) {
      String var1 = var0.getType() == Descriptors.FieldDescriptor.Type.GROUP ? var0.getMessageType().getName() : var0.getName();
      String var2 = snakeCaseToUpperCamelCase(var1);
      String var3;
      if (specialFieldNames.contains(var2)) {
         var3 = "__";
      } else {
         var3 = "_";
      }

      return snakeCaseToLowerCamelCase(var1) + var3;
   }

   private static String getCachedSizeFieldName(Descriptors.FieldDescriptor var0) {
      return snakeCaseToLowerCamelCase(var0.getName()) + "MemoizedSerializedSize";
   }

   private static String snakeCaseToLowerCamelCase(String var0) {
      return snakeCaseToCamelCase(var0, false);
   }

   private static String snakeCaseToUpperCamelCase(String var0) {
      return snakeCaseToCamelCase(var0, true);
   }

   private static String snakeCaseToCamelCase(String var0, boolean var1) {
      StringBuilder var2 = new StringBuilder(var0.length() + 1);
      boolean var3 = var1;

      for (int var4 = 0; var4 < var0.length(); var4++) {
         char var5 = var0.charAt(var4);
         if (var5 == '_') {
            var3 = true;
         } else if (Character.isDigit(var5)) {
            var2.append(var5);
            var3 = true;
         } else if (var3) {
            var2.append(Character.toUpperCase(var5));
            var3 = false;
         } else if (var4 == 0) {
            var2.append(Character.toLowerCase(var5));
         } else {
            var2.append(var5);
         }
      }

      return var2.toString();
   }

   private static Class<?> getOneofStoredTypeForMessage(Class<?> var0, Descriptors.FieldDescriptor var1) {
      try {
         String var2 = var1.getType() == Descriptors.FieldDescriptor.Type.GROUP ? var1.getMessageType().getName() : var1.getName();
         java.lang.reflect.Method var3 = var0.getDeclaredMethod(getterForField(var2));
         return var3.getReturnType();
      } catch (Exception var4) {
         throw new RuntimeException(var4);
      }
   }

   private static Class<?> getTypeForRepeatedMessageField(Class<?> var0, Descriptors.FieldDescriptor var1) {
      try {
         String var2 = var1.getType() == Descriptors.FieldDescriptor.Type.GROUP ? var1.getMessageType().getName() : var1.getName();
         java.lang.reflect.Method var3 = var0.getDeclaredMethod(getterForField(var2), int.class);
         return var3.getReturnType();
      } catch (Exception var4) {
         throw new RuntimeException(var4);
      }
   }

   private static String getterForField(String var0) {
      String var1 = snakeCaseToLowerCamelCase(var0);
      StringBuilder var2 = new StringBuilder("get");
      var2.append(Character.toUpperCase(var1.charAt(0)));
      var2.append(var1.substring(1, var1.length()));
      return var2.toString();
   }

   static class IsInitializedCheckAnalyzer {
      private final Map<Descriptors.Descriptor, Boolean> resultCache = new ConcurrentHashMap<>();
      private int index = 0;
      private final Stack<DescriptorMessageInfoFactory.IsInitializedCheckAnalyzer.Node> stack = new Stack<>();
      private final Map<Descriptors.Descriptor, DescriptorMessageInfoFactory.IsInitializedCheckAnalyzer.Node> nodeCache = new HashMap<>();

      public boolean needsIsInitializedCheck(Descriptors.Descriptor var1) {
         Boolean var2 = this.resultCache.get(var1);
         if (var2 != null) {
            return var2;
         }

         synchronized (this) {
            var2 = this.resultCache.get(var1);
            return var2 != null ? var2 : this.dfs(var1).component.needsIsInitializedCheck;
         }
      }

      private DescriptorMessageInfoFactory.IsInitializedCheckAnalyzer.Node dfs(Descriptors.Descriptor var1) {
         DescriptorMessageInfoFactory.IsInitializedCheckAnalyzer.Node var2 = new DescriptorMessageInfoFactory.IsInitializedCheckAnalyzer.Node(
            var1, this.index++
         );
         this.stack.push(var2);
         this.nodeCache.put(var1, var2);

         for (Descriptors.FieldDescriptor var4 : var1.getFields()) {
            if (var4.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
               DescriptorMessageInfoFactory.IsInitializedCheckAnalyzer.Node var5 = this.nodeCache.get(var4.getMessageType());
               if (var5 == null) {
                  var5 = this.dfs(var4.getMessageType());
                  var2.lowLink = Math.min(var2.lowLink, var5.lowLink);
               } else if (var5.component == null) {
                  var2.lowLink = Math.min(var2.lowLink, var5.lowLink);
               }
            }
         }

         if (var2.index == var2.lowLink) {
            DescriptorMessageInfoFactory.IsInitializedCheckAnalyzer.StronglyConnectedComponent var6 = new DescriptorMessageInfoFactory.IsInitializedCheckAnalyzer.StronglyConnectedComponent(
               
            );

            DescriptorMessageInfoFactory.IsInitializedCheckAnalyzer.Node var7;
            do {
               var7 = this.stack.pop();
               var7.component = var6;
               var6.messages.add(var7.descriptor);
            } while (var7 != var2);

            this.analyze(var6);
         }

         return var2;
      }

      private void analyze(DescriptorMessageInfoFactory.IsInitializedCheckAnalyzer.StronglyConnectedComponent var1) {
         boolean var2 = false;

         label42:
         for (Descriptors.Descriptor var4 : var1.messages) {
            if (var4.isExtendable()) {
               var2 = true;
               break;
            }

            for (Descriptors.FieldDescriptor var6 : var4.getFields()) {
               if (var6.isRequired()) {
                  var2 = true;
                  break label42;
               }

               if (var6.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                  DescriptorMessageInfoFactory.IsInitializedCheckAnalyzer.Node var7 = this.nodeCache.get(var6.getMessageType());
                  if (var7.component != var1 && var7.component.needsIsInitializedCheck) {
                     var2 = true;
                     break label42;
                  }
               }
            }
         }

         var1.needsIsInitializedCheck = var2;

         for (Descriptors.Descriptor var9 : var1.messages) {
            this.resultCache.put(var9, var1.needsIsInitializedCheck);
         }
      }

      private static class Node {
         final Descriptors.Descriptor descriptor;
         final int index;
         int lowLink;
         DescriptorMessageInfoFactory.IsInitializedCheckAnalyzer.StronglyConnectedComponent component;

         Node(Descriptors.Descriptor var1, int var2) {
            this.descriptor = var1;
            this.index = var2;
            this.lowLink = var2;
            this.component = null;
         }
      }

      private static class StronglyConnectedComponent {
         final List<Descriptors.Descriptor> messages = new ArrayList<>();
         boolean needsIsInitializedCheck = false;

         private StronglyConnectedComponent() {
         }
      }
   }

   private static final class OneofState {
      private OneofInfo[] oneofs = new OneofInfo[2];

      private OneofState() {
      }

      OneofInfo getOneof(Class<?> var1, Descriptors.OneofDescriptor var2) {
         int var3 = var2.getIndex();
         if (var3 >= this.oneofs.length) {
            this.oneofs = Arrays.copyOf(this.oneofs, var3 * 2);
         }

         OneofInfo var4 = this.oneofs[var3];
         if (var4 == null) {
            var4 = newInfo(var1, var2);
            this.oneofs[var3] = var4;
         }

         return var4;
      }

      private static OneofInfo newInfo(Class<?> var0, Descriptors.OneofDescriptor var1) {
         String var2 = DescriptorMessageInfoFactory.snakeCaseToLowerCamelCase(var1.getName());
         String var3 = var2 + "_";
         String var4 = var2 + "Case_";
         return new OneofInfo(var1.getIndex(), DescriptorMessageInfoFactory.field(var0, var4), DescriptorMessageInfoFactory.field(var0, var3));
      }
   }
}
