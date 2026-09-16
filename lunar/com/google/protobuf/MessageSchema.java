package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

@CheckReturnValue
final class MessageSchema<T> implements Schema<T> {
   private static final int INTS_PER_FIELD = 3;
   private static final int OFFSET_BITS = 20;
   private static final int OFFSET_MASK = 1048575;
   private static final int FIELD_TYPE_MASK = 267386880;
   private static final int REQUIRED_MASK = 268435456;
   private static final int ENFORCE_UTF8_MASK = 536870912;
   private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
   private static final int NO_PRESENCE_SENTINEL = 1048575;
   private static final int[] EMPTY_INT_ARRAY = new int[0];
   private static final int REQUIRED_BIT = 256;
   private static final int UTF8_CHECK_BIT = 512;
   private static final int CHECK_INITIALIZED_BIT = 1024;
   private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
   private static final int HAS_HAS_BIT = 4096;
   static final int ONEOF_TYPE_OFFSET = 51;
   private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();
   private final int[] buffer;
   private final Object[] objects;
   private final int minFieldNumber;
   private final int maxFieldNumber;
   private final MessageLite defaultInstance;
   private final boolean hasExtensions;
   private final boolean lite;
   private final ProtoSyntax syntax;
   private final boolean useCachedSizeField;
   private final int[] intArray;
   private final int checkInitializedCount;
   private final int repeatedFieldOffsetStart;
   private final NewInstanceSchema newInstanceSchema;
   private final ListFieldSchema listFieldSchema;
   private final UnknownFieldSchema<?, ?> unknownFieldSchema;
   private final ExtensionSchema<?> extensionSchema;
   private final MapFieldSchema mapFieldSchema;

   private MessageSchema(
      int[] var1,
      Object[] var2,
      int var3,
      int var4,
      MessageLite var5,
      ProtoSyntax var6,
      boolean var7,
      int[] var8,
      int var9,
      int var10,
      NewInstanceSchema var11,
      ListFieldSchema var12,
      UnknownFieldSchema<?, ?> var13,
      ExtensionSchema<?> var14,
      MapFieldSchema var15
   ) {
      this.buffer = var1;
      this.objects = var2;
      this.minFieldNumber = var3;
      this.maxFieldNumber = var4;
      this.lite = var5 instanceof GeneratedMessageLite;
      this.syntax = var6;
      this.hasExtensions = var14 != null && var14.hasExtensions(var5);
      this.useCachedSizeField = var7;
      this.intArray = var8;
      this.checkInitializedCount = var9;
      this.repeatedFieldOffsetStart = var10;
      this.newInstanceSchema = var11;
      this.listFieldSchema = var12;
      this.unknownFieldSchema = var13;
      this.extensionSchema = var14;
      this.defaultInstance = var5;
      this.mapFieldSchema = var15;
   }

   static <T> MessageSchema<T> newSchema(
      Class<T> var0,
      MessageInfo var1,
      NewInstanceSchema var2,
      ListFieldSchema var3,
      UnknownFieldSchema<?, ?> var4,
      ExtensionSchema<?> var5,
      MapFieldSchema var6
   ) {
      return var1 instanceof RawMessageInfo
         ? newSchemaForRawMessageInfo((RawMessageInfo)var1, var2, var3, var4, var5, var6)
         : newSchemaForMessageInfo((StructuralMessageInfo)var1, var2, var3, var4, var5, var6);
   }

   static <T> MessageSchema<T> newSchemaForRawMessageInfo(
      RawMessageInfo var0, NewInstanceSchema var1, ListFieldSchema var2, UnknownFieldSchema<?, ?> var3, ExtensionSchema<?> var4, MapFieldSchema var5
   ) {
      String var6 = var0.getStringInfo();
      int var7 = var6.length();
      int var8 = 0;
      int var9 = var6.charAt(var8++);
      if (var9 >= 55296) {
         int var10 = var9 & 8191;

         byte var11;
         for (var11 = 13; (var9 = var6.charAt(var8++)) >= '\ud800'; var11 += 13) {
            var10 |= (var9 & 8191) << var11;
         }

         var9 = var10 | var9 << var11;
      }

      var9 = var6.charAt(var8++);
      if (var9 >= 55296) {
         int var81 = var9 & 8191;

         byte var12;
         for (var12 = 13; (var56 = var6.charAt(var8++)) >= '\ud800'; var12 += 13) {
            var81 |= (var56 & 8191) << var12;
         }

         var9 = var81 | var56 << var12;
      }

      int var82 = var9;
      int var14;
      int var15;
      int var16;
      int var17;
      int var19;
      int[] var20;
      int var21;
      int var83;
      if (var82 == 0) {
         var83 = 0;
         boolean var13 = false;
         var14 = 0;
         var15 = 0;
         var16 = 0;
         var17 = 0;
         boolean var18 = false;
         var19 = 0;
         var20 = EMPTY_INT_ARRAY;
         var21 = 0;
      } else {
         var9 = var6.charAt(var8++);
         if (var9 >= 55296) {
            int var22 = var9 & 8191;

            byte var23;
            for (var23 = 13; (var58 = var6.charAt(var8++)) >= '\ud800'; var23 += 13) {
               var22 |= (var58 & 8191) << var23;
            }

            var9 = var22 | var58 << var23;
         }

         var83 = var9;
         var9 = var6.charAt(var8++);
         if (var9 >= 55296) {
            int var86 = var9 & 8191;

            byte var94;
            for (var94 = 13; (var60 = var6.charAt(var8++)) >= '\ud800'; var94 += 13) {
               var86 |= (var60 & 8191) << var94;
            }

            var9 = var86 | var60 << var94;
         }

         int var84 = var9;
         var9 = var6.charAt(var8++);
         if (var9 >= 55296) {
            int var87 = var9 & 8191;

            byte var95;
            for (var95 = 13; (var62 = var6.charAt(var8++)) >= '\ud800'; var95 += 13) {
               var87 |= (var62 & 8191) << var95;
            }

            var9 = var87 | var62 << var95;
         }

         var14 = var9;
         var9 = var6.charAt(var8++);
         if (var9 >= 55296) {
            int var88 = var9 & 8191;

            byte var96;
            for (var96 = 13; (var64 = var6.charAt(var8++)) >= '\ud800'; var96 += 13) {
               var88 |= (var64 & 8191) << var96;
            }

            var9 = var88 | var64 << var96;
         }

         var15 = var9;
         var9 = var6.charAt(var8++);
         if (var9 >= 55296) {
            int var89 = var9 & 8191;

            byte var97;
            for (var97 = 13; (var66 = var6.charAt(var8++)) >= '\ud800'; var97 += 13) {
               var89 |= (var66 & 8191) << var97;
            }

            var9 = var89 | var66 << var97;
         }

         var16 = var9;
         var9 = var6.charAt(var8++);
         if (var9 >= 55296) {
            int var90 = var9 & 8191;

            byte var98;
            for (var98 = 13; (var68 = var6.charAt(var8++)) >= '\ud800'; var98 += 13) {
               var90 |= (var68 & 8191) << var98;
            }

            var9 = var90 | var68 << var98;
         }

         var17 = var9;
         var9 = var6.charAt(var8++);
         if (var9 >= 55296) {
            int var91 = var9 & 8191;

            byte var99;
            for (var99 = 13; (var70 = var6.charAt(var8++)) >= '\ud800'; var99 += 13) {
               var91 |= (var70 & 8191) << var99;
            }

            var9 = var91 | var70 << var99;
         }

         int var85 = var9;
         var9 = var6.charAt(var8++);
         if (var9 >= 55296) {
            int var92 = var9 & 8191;

            byte var100;
            for (var100 = 13; (var72 = var6.charAt(var8++)) >= '\ud800'; var100 += 13) {
               var92 |= (var72 & 8191) << var100;
            }

            var9 = var92 | var72 << var100;
         }

         var19 = var9;
         var20 = new int[var19 + var17 + var85];
         var21 = var83 * 2 + var84;
      }

      Unsafe var93 = UNSAFE;
      Object[] var101 = var0.getObjects();
      int var24 = 0;
      Class var25 = var0.getDefaultInstance().getClass();
      int[] var26 = new int[var16 * 3];
      Object[] var27 = new Object[var16 * 2];
      int var28 = var19;
      int var29 = var19 + var17;
      int var30 = 0;

      while (var8 < var7) {
         var9 = var6.charAt(var8++);
         if (var9 >= 55296) {
            int var34 = var9 & 8191;

            byte var35;
            for (var35 = 13; (var74 = var6.charAt(var8++)) >= '\ud800'; var35 += 13) {
               var34 |= (var74 & 8191) << var35;
            }

            var9 = var34 | var74 << var35;
         }

         int var31 = var9;
         var9 = var6.charAt(var8++);
         if (var9 >= 55296) {
            int var104 = var9 & 8191;

            byte var106;
            for (var106 = 13; (var76 = var6.charAt(var8++)) >= '\ud800'; var106 += 13) {
               var104 |= (var76 & 8191) << var106;
            }

            var9 = var104 | var76 << var106;
         }

         int var32 = var9;
         int var33 = var32 & 0xFF;
         if ((var32 & 1024) != 0) {
            var20[var24++] = var30;
         }

         int var36;
         int var105;
         int var107;
         if (var33 >= 51) {
            var9 = var6.charAt(var8++);
            if (var9 >= 55296) {
               int var108 = var9 & 8191;

               byte var110;
               for (var110 = 13; (var80 = var6.charAt(var8++)) >= '\ud800'; var110 += 13) {
                  var108 |= (var80 & 8191) << var110;
               }

               var9 = var108 | var80 << var110;
            }

            int var109 = var9;
            int var111 = var33 - 51;
            if (var111 == 9 || var111 == 17) {
               var27[var30 / 3 * 2 + 1] = var101[var21++];
            } else if (var111 == 12 && (var0.getSyntax().equals(ProtoSyntax.PROTO2) || (var32 & 2048) != 0)) {
               var27[var30 / 3 * 2 + 1] = var101[var21++];
            }

            int var115 = var109 * 2;
            Object var117 = var101[var115];
            java.lang.reflect.Field var113;
            if (var117 instanceof java.lang.reflect.Field) {
               var113 = (java.lang.reflect.Field)var117;
            } else {
               var113 = reflectField(var25, (String)var117);
               var101[var115] = var113;
            }

            var105 = (int)var93.objectFieldOffset(var113);
            var117 = var101[++var115];
            java.lang.reflect.Field var119;
            if (var117 instanceof java.lang.reflect.Field) {
               var119 = (java.lang.reflect.Field)var117;
            } else {
               var119 = reflectField(var25, (String)var117);
               var101[var115] = var119;
            }

            var36 = (int)var93.objectFieldOffset(var119);
            var107 = 0;
         } else {
            java.lang.reflect.Field var37 = reflectField(var25, (String)var101[var21++]);
            if (var33 == 9 || var33 == 17) {
               var27[var30 / 3 * 2 + 1] = var37.getType();
            } else if (var33 == 27 || var33 == 49) {
               var27[var30 / 3 * 2 + 1] = var101[var21++];
            } else if (var33 == 12 || var33 == 30 || var33 == 44) {
               if (var0.getSyntax() == ProtoSyntax.PROTO2 || (var32 & 2048) != 0) {
                  var27[var30 / 3 * 2 + 1] = var101[var21++];
               }
            } else if (var33 == 50) {
               var20[var28++] = var30;
               var27[var30 / 3 * 2] = var101[var21++];
               if ((var32 & 2048) != 0) {
                  var27[var30 / 3 * 2 + 1] = var101[var21++];
               }
            }

            var105 = (int)var93.objectFieldOffset(var37);
            boolean var38 = (var32 & 4096) != 0;
            if (var38 && var33 <= 17) {
               var9 = var6.charAt(var8++);
               if (var9 >= 55296) {
                  int var39 = var9 & 8191;

                  byte var40;
                  for (var40 = 13; (var78 = var6.charAt(var8++)) >= '\ud800'; var40 += 13) {
                     var39 |= (var78 & 8191) << var40;
                  }

                  var9 = var39 | var78 << var40;
               }

               int var112 = var9;
               int var41 = var83 * 2 + var112 / 32;
               Object var42 = var101[var41];
               java.lang.reflect.Field var114;
               if (var42 instanceof java.lang.reflect.Field) {
                  var114 = (java.lang.reflect.Field)var42;
               } else {
                  var114 = reflectField(var25, (String)var42);
                  var101[var41] = var114;
               }

               var36 = (int)var93.objectFieldOffset(var114);
               var107 = var112 % 32;
            } else {
               var36 = 1048575;
               var107 = 0;
            }

            if (var33 >= 18 && var33 <= 49) {
               var20[var29++] = var105;
            }
         }

         var26[var30++] = var31;
         var26[var30++] = ((var32 & 512) != 0 ? 536870912 : 0)
            | ((var32 & 256) != 0 ? 268435456 : 0)
            | ((var32 & 2048) != 0 ? Integer.MIN_VALUE : 0)
            | var33 << 20
            | var105;
         var26[var30++] = var107 << 20 | var36;
      }

      return new MessageSchema<>(
         var26, var27, var14, var15, var0.getDefaultInstance(), var0.getSyntax(), false, var20, var19, var19 + var17, var1, var2, var3, var4, var5
      );
   }

   private static java.lang.reflect.Field reflectField(Class<?> var0, String var1) {
      try {
         return var0.getDeclaredField(var1);
      } catch (NoSuchFieldException var8) {
         java.lang.reflect.Field[] var3 = var0.getDeclaredFields();

         for (java.lang.reflect.Field var7 : var3) {
            if (var1.equals(var7.getName())) {
               return var7;
            }
         }

         throw new RuntimeException("Field " + var1 + " for " + var0.getName() + " not found. Known fields are " + Arrays.toString(var3));
      }
   }

   static <T> MessageSchema<T> newSchemaForMessageInfo(
      StructuralMessageInfo var0, NewInstanceSchema var1, ListFieldSchema var2, UnknownFieldSchema<?, ?> var3, ExtensionSchema<?> var4, MapFieldSchema var5
   ) {
      FieldInfo[] var6 = var0.getFields();
      int var7;
      int var8;
      if (var6.length == 0) {
         var7 = 0;
         var8 = 0;
      } else {
         var7 = var6[0].getFieldNumber();
         var8 = var6[var6.length - 1].getFieldNumber();
      }

      int var9 = var6.length;
      int[] var10 = new int[var9 * 3];
      Object[] var11 = new Object[var9 * 2];
      int var12 = 0;
      int var13 = 0;

      for (FieldInfo var17 : var6) {
         if (var17.getType() == FieldType.MAP) {
            var12++;
         } else if (var17.getType().id() >= 18 && var17.getType().id() <= 49) {
            var13++;
         }
      }

      int[] var24 = var12 > 0 ? new int[var12] : null;
      int[] var25 = var13 > 0 ? new int[var13] : null;
      var12 = 0;
      var13 = 0;
      int[] var26 = var0.getCheckInitialized();
      if (var26 == null) {
         var26 = EMPTY_INT_ARRAY;
      }

      int var27 = 0;
      int var18 = 0;

      for (byte var19 = 0; var18 < var6.length; var19 += 3) {
         FieldInfo var20 = var6[var18];
         int var21 = var20.getFieldNumber();
         storeFieldData(var20, var10, var19, var11);
         if (var27 < var26.length && var26[var27] == var21) {
            var26[var27++] = var19;
         }

         if (var20.getType() == FieldType.MAP) {
            var24[var12++] = var19;
         } else if (var20.getType().id() >= 18 && var20.getType().id() <= 49) {
            var25[var13++] = (int)UnsafeUtil.objectFieldOffset(var20.getField());
         }

         var18++;
      }

      if (var24 == null) {
         var24 = EMPTY_INT_ARRAY;
      }

      if (var25 == null) {
         var25 = EMPTY_INT_ARRAY;
      }

      int[] var28 = new int[var26.length + var24.length + var25.length];
      System.arraycopy(var26, 0, var28, 0, var26.length);
      System.arraycopy(var24, 0, var28, var26.length, var24.length);
      System.arraycopy(var25, 0, var28, var26.length + var24.length, var25.length);
      return new MessageSchema<>(
         var10,
         var11,
         var7,
         var8,
         var0.getDefaultInstance(),
         var0.getSyntax(),
         true,
         var28,
         var26.length,
         var26.length + var24.length,
         var1,
         var2,
         var3,
         var4,
         var5
      );
   }

   private static void storeFieldData(FieldInfo var0, int[] var1, int var2, Object[] var3) {
      OneofInfo var8 = var0.getOneof();
      int var4;
      int var5;
      int var6;
      int var7;
      if (var8 != null) {
         var5 = var0.getType().id() + 51;
         var4 = (int)UnsafeUtil.objectFieldOffset(var8.getValueField());
         var7 = (int)UnsafeUtil.objectFieldOffset(var8.getCaseField());
         var6 = 0;
      } else {
         FieldType var9 = var0.getType();
         var4 = (int)UnsafeUtil.objectFieldOffset(var0.getField());
         var5 = var9.id();
         if (!var9.isList() && !var9.isMap()) {
            java.lang.reflect.Field var10 = var0.getPresenceField();
            if (var10 == null) {
               var7 = 1048575;
            } else {
               var7 = (int)UnsafeUtil.objectFieldOffset(var10);
            }

            var6 = Integer.numberOfTrailingZeros(var0.getPresenceMask());
         } else if (var0.getCachedSizeField() == null) {
            var7 = 0;
            var6 = 0;
         } else {
            var7 = (int)UnsafeUtil.objectFieldOffset(var0.getCachedSizeField());
            var6 = 0;
         }
      }

      var1[var2] = var0.getFieldNumber();
      var1[var2 + 1] = (var0.isEnforceUtf8() ? 536870912 : 0) | (var0.isRequired() ? 268435456 : 0) | var5 << 20 | var4;
      var1[var2 + 2] = var6 << 20 | var7;
      Class var11 = var0.getMessageFieldClass();
      if (var0.getMapDefaultEntry() != null) {
         var3[var2 / 3 * 2] = var0.getMapDefaultEntry();
         if (var11 != null) {
            var3[var2 / 3 * 2 + 1] = var11;
         } else if (var0.getEnumVerifier() != null) {
            var3[var2 / 3 * 2 + 1] = var0.getEnumVerifier();
         }
      } else if (var11 != null) {
         var3[var2 / 3 * 2 + 1] = var11;
      } else if (var0.getEnumVerifier() != null) {
         var3[var2 / 3 * 2 + 1] = var0.getEnumVerifier();
      }
   }

   @Override
   public T newInstance() {
      return (T)this.newInstanceSchema.newInstance(this.defaultInstance);
   }

   @Override
   public boolean equals(T var1, T var2) {
      int var3 = this.buffer.length;

      for (byte var4 = 0; var4 < var3; var4 += 3) {
         if (!this.equals((T)var1, (T)var2, var4)) {
            return false;
         }
      }

      Object var8 = this.unknownFieldSchema.getFromMessage(var1);
      Object var5 = this.unknownFieldSchema.getFromMessage(var2);
      if (!var8.equals(var5)) {
         return false;
      } else if (this.hasExtensions) {
         FieldSet var6 = this.extensionSchema.getExtensions(var1);
         FieldSet var7 = this.extensionSchema.getExtensions(var2);
         return var6.equals(var7);
      } else {
         return true;
      }
   }

   private boolean equals(T var1, T var2, int var3) {
      int var4 = this.typeAndOffsetAt(var3);
      long var5 = offset(var4);
      switch (type(var4)) {
         case 0:
            return this.arePresentForEquals((T)var1, (T)var2, var3)
               && Double.doubleToLongBits(UnsafeUtil.getDouble(var1, var5)) == Double.doubleToLongBits(UnsafeUtil.getDouble(var2, var5));
         case 1:
            return this.arePresentForEquals((T)var1, (T)var2, var3)
               && Float.floatToIntBits(UnsafeUtil.getFloat(var1, var5)) == Float.floatToIntBits(UnsafeUtil.getFloat(var2, var5));
         case 2:
            return this.arePresentForEquals((T)var1, (T)var2, var3) && UnsafeUtil.getLong(var1, var5) == UnsafeUtil.getLong(var2, var5);
         case 3:
            return this.arePresentForEquals((T)var1, (T)var2, var3) && UnsafeUtil.getLong(var1, var5) == UnsafeUtil.getLong(var2, var5);
         case 4:
            return this.arePresentForEquals((T)var1, (T)var2, var3) && UnsafeUtil.getInt(var1, var5) == UnsafeUtil.getInt(var2, var5);
         case 5:
            return this.arePresentForEquals((T)var1, (T)var2, var3) && UnsafeUtil.getLong(var1, var5) == UnsafeUtil.getLong(var2, var5);
         case 6:
            return this.arePresentForEquals((T)var1, (T)var2, var3) && UnsafeUtil.getInt(var1, var5) == UnsafeUtil.getInt(var2, var5);
         case 7:
            return this.arePresentForEquals((T)var1, (T)var2, var3) && UnsafeUtil.getBoolean(var1, var5) == UnsafeUtil.getBoolean(var2, var5);
         case 8:
            return this.arePresentForEquals((T)var1, (T)var2, var3)
               && SchemaUtil.safeEquals(UnsafeUtil.getObject(var1, var5), UnsafeUtil.getObject(var2, var5));
         case 9:
            return this.arePresentForEquals((T)var1, (T)var2, var3)
               && SchemaUtil.safeEquals(UnsafeUtil.getObject(var1, var5), UnsafeUtil.getObject(var2, var5));
         case 10:
            return this.arePresentForEquals((T)var1, (T)var2, var3)
               && SchemaUtil.safeEquals(UnsafeUtil.getObject(var1, var5), UnsafeUtil.getObject(var2, var5));
         case 11:
            return this.arePresentForEquals((T)var1, (T)var2, var3) && UnsafeUtil.getInt(var1, var5) == UnsafeUtil.getInt(var2, var5);
         case 12:
            return this.arePresentForEquals((T)var1, (T)var2, var3) && UnsafeUtil.getInt(var1, var5) == UnsafeUtil.getInt(var2, var5);
         case 13:
            return this.arePresentForEquals((T)var1, (T)var2, var3) && UnsafeUtil.getInt(var1, var5) == UnsafeUtil.getInt(var2, var5);
         case 14:
            return this.arePresentForEquals((T)var1, (T)var2, var3) && UnsafeUtil.getLong(var1, var5) == UnsafeUtil.getLong(var2, var5);
         case 15:
            return this.arePresentForEquals((T)var1, (T)var2, var3) && UnsafeUtil.getInt(var1, var5) == UnsafeUtil.getInt(var2, var5);
         case 16:
            return this.arePresentForEquals((T)var1, (T)var2, var3) && UnsafeUtil.getLong(var1, var5) == UnsafeUtil.getLong(var2, var5);
         case 17:
            return this.arePresentForEquals((T)var1, (T)var2, var3)
               && SchemaUtil.safeEquals(UnsafeUtil.getObject(var1, var5), UnsafeUtil.getObject(var2, var5));
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
            return SchemaUtil.safeEquals(UnsafeUtil.getObject(var1, var5), UnsafeUtil.getObject(var2, var5));
         case 50:
            return SchemaUtil.safeEquals(UnsafeUtil.getObject(var1, var5), UnsafeUtil.getObject(var2, var5));
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         case 64:
         case 65:
         case 66:
         case 67:
         case 68:
            return this.isOneofCaseEqual((T)var1, (T)var2, var3) && SchemaUtil.safeEquals(UnsafeUtil.getObject(var1, var5), UnsafeUtil.getObject(var2, var5));
         default:
            return true;
      }
   }

   @Override
   public int hashCode(T var1) {
      int var2 = 0;
      int var3 = this.buffer.length;

      for (byte var4 = 0; var4 < var3; var4 += 3) {
         int var5 = this.typeAndOffsetAt(var4);
         int var6 = this.numberAt(var4);
         long var7 = offset(var5);
         switch (type(var5)) {
            case 0:
               var2 = var2 * 53 + Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(var1, var7)));
               break;
            case 1:
               var2 = var2 * 53 + Float.floatToIntBits(UnsafeUtil.getFloat(var1, var7));
               break;
            case 2:
               var2 = var2 * 53 + Internal.hashLong(UnsafeUtil.getLong(var1, var7));
               break;
            case 3:
               var2 = var2 * 53 + Internal.hashLong(UnsafeUtil.getLong(var1, var7));
               break;
            case 4:
               var2 = var2 * 53 + UnsafeUtil.getInt(var1, var7);
               break;
            case 5:
               var2 = var2 * 53 + Internal.hashLong(UnsafeUtil.getLong(var1, var7));
               break;
            case 6:
               var2 = var2 * 53 + UnsafeUtil.getInt(var1, var7);
               break;
            case 7:
               var2 = var2 * 53 + Internal.hashBoolean(UnsafeUtil.getBoolean(var1, var7));
               break;
            case 8:
               var2 = var2 * 53 + ((String)UnsafeUtil.getObject(var1, var7)).hashCode();
               break;
            case 9:
               int var14 = 37;
               Object var15 = UnsafeUtil.getObject(var1, var7);
               if (var15 != null) {
                  var14 = var15.hashCode();
               }

               var2 = 53 * var2 + var14;
               break;
            case 10:
               var2 = var2 * 53 + UnsafeUtil.getObject(var1, var7).hashCode();
               break;
            case 11:
               var2 = var2 * 53 + UnsafeUtil.getInt(var1, var7);
               break;
            case 12:
               var2 = var2 * 53 + UnsafeUtil.getInt(var1, var7);
               break;
            case 13:
               var2 = var2 * 53 + UnsafeUtil.getInt(var1, var7);
               break;
            case 14:
               var2 = var2 * 53 + Internal.hashLong(UnsafeUtil.getLong(var1, var7));
               break;
            case 15:
               var2 = var2 * 53 + UnsafeUtil.getInt(var1, var7);
               break;
            case 16:
               var2 = var2 * 53 + Internal.hashLong(UnsafeUtil.getLong(var1, var7));
               break;
            case 17:
               int var13 = 37;
               Object var10 = UnsafeUtil.getObject(var1, var7);
               if (var10 != null) {
                  var13 = var10.hashCode();
               }

               var2 = 53 * var2 + var13;
               break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
               var2 = var2 * 53 + UnsafeUtil.getObject(var1, var7).hashCode();
               break;
            case 50:
               var2 = var2 * 53 + UnsafeUtil.getObject(var1, var7).hashCode();
               break;
            case 51:
               if (this.isOneofPresent((T)var1, var6, var4)) {
                  var2 = var2 * 53 + Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(var1, var7)));
               }
               break;
            case 52:
               if (this.isOneofPresent((T)var1, var6, var4)) {
                  var2 = var2 * 53 + Float.floatToIntBits(oneofFloatAt(var1, var7));
               }
               break;
            case 53:
               if (this.isOneofPresent((T)var1, var6, var4)) {
                  var2 = var2 * 53 + Internal.hashLong(oneofLongAt(var1, var7));
               }
               break;
            case 54:
               if (this.isOneofPresent((T)var1, var6, var4)) {
                  var2 = var2 * 53 + Internal.hashLong(oneofLongAt(var1, var7));
               }
               break;
            case 55:
               if (this.isOneofPresent((T)var1, var6, var4)) {
                  var2 = var2 * 53 + oneofIntAt(var1, var7);
               }
               break;
            case 56:
               if (this.isOneofPresent((T)var1, var6, var4)) {
                  var2 = var2 * 53 + Internal.hashLong(oneofLongAt(var1, var7));
               }
               break;
            case 57:
               if (this.isOneofPresent((T)var1, var6, var4)) {
                  var2 = var2 * 53 + oneofIntAt(var1, var7);
               }
               break;
            case 58:
               if (this.isOneofPresent((T)var1, var6, var4)) {
                  var2 = var2 * 53 + Internal.hashBoolean(oneofBooleanAt(var1, var7));
               }
               break;
            case 59:
               if (this.isOneofPresent((T)var1, var6, var4)) {
                  var2 = var2 * 53 + ((String)UnsafeUtil.getObject(var1, var7)).hashCode();
               }
               break;
            case 60:
               if (this.isOneofPresent((T)var1, var6, var4)) {
                  Object var12 = UnsafeUtil.getObject(var1, var7);
                  var2 = 53 * var2 + var12.hashCode();
               }
               break;
            case 61:
               if (this.isOneofPresent((T)var1, var6, var4)) {
                  var2 = var2 * 53 + UnsafeUtil.getObject(var1, var7).hashCode();
               }
               break;
            case 62:
               if (this.isOneofPresent((T)var1, var6, var4)) {
                  var2 = var2 * 53 + oneofIntAt(var1, var7);
               }
               break;
            case 63:
               if (this.isOneofPresent((T)var1, var6, var4)) {
                  var2 = var2 * 53 + oneofIntAt(var1, var7);
               }
               break;
            case 64:
               if (this.isOneofPresent((T)var1, var6, var4)) {
                  var2 = var2 * 53 + oneofIntAt(var1, var7);
               }
               break;
            case 65:
               if (this.isOneofPresent((T)var1, var6, var4)) {
                  var2 = var2 * 53 + Internal.hashLong(oneofLongAt(var1, var7));
               }
               break;
            case 66:
               if (this.isOneofPresent((T)var1, var6, var4)) {
                  var2 = var2 * 53 + oneofIntAt(var1, var7);
               }
               break;
            case 67:
               if (this.isOneofPresent((T)var1, var6, var4)) {
                  var2 = var2 * 53 + Internal.hashLong(oneofLongAt(var1, var7));
               }
               break;
            case 68:
               if (this.isOneofPresent((T)var1, var6, var4)) {
                  Object var9 = UnsafeUtil.getObject(var1, var7);
                  var2 = 53 * var2 + var9.hashCode();
               }
         }
      }

      var2 = var2 * 53 + this.unknownFieldSchema.getFromMessage(var1).hashCode();
      if (this.hasExtensions) {
         var2 = var2 * 53 + this.extensionSchema.getExtensions(var1).hashCode();
      }

      return var2;
   }

   @Override
   public void mergeFrom(T var1, T var2) {
      checkMutable(var1);
      if (var2 == null) {
         throw new NullPointerException();
      }

      for (byte var3 = 0; var3 < this.buffer.length; var3 += 3) {
         this.mergeSingleField((T)var1, (T)var2, var3);
      }

      SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, var1, var2);
      if (this.hasExtensions) {
         SchemaUtil.mergeExtensions(this.extensionSchema, var1, var2);
      }
   }

   private void mergeSingleField(T var1, T var2, int var3) {
      int var4 = this.typeAndOffsetAt(var3);
      long var5 = offset(var4);
      int var7 = this.numberAt(var3);
      switch (type(var4)) {
         case 0:
            if (this.isFieldPresent((T)var2, var3)) {
               UnsafeUtil.putDouble(var1, var5, UnsafeUtil.getDouble(var2, var5));
               this.setFieldPresent((T)var1, var3);
            }
            break;
         case 1:
            if (this.isFieldPresent((T)var2, var3)) {
               UnsafeUtil.putFloat(var1, var5, UnsafeUtil.getFloat(var2, var5));
               this.setFieldPresent((T)var1, var3);
            }
            break;
         case 2:
            if (this.isFieldPresent((T)var2, var3)) {
               UnsafeUtil.putLong(var1, var5, UnsafeUtil.getLong(var2, var5));
               this.setFieldPresent((T)var1, var3);
            }
            break;
         case 3:
            if (this.isFieldPresent((T)var2, var3)) {
               UnsafeUtil.putLong(var1, var5, UnsafeUtil.getLong(var2, var5));
               this.setFieldPresent((T)var1, var3);
            }
            break;
         case 4:
            if (this.isFieldPresent((T)var2, var3)) {
               UnsafeUtil.putInt(var1, var5, UnsafeUtil.getInt(var2, var5));
               this.setFieldPresent((T)var1, var3);
            }
            break;
         case 5:
            if (this.isFieldPresent((T)var2, var3)) {
               UnsafeUtil.putLong(var1, var5, UnsafeUtil.getLong(var2, var5));
               this.setFieldPresent((T)var1, var3);
            }
            break;
         case 6:
            if (this.isFieldPresent((T)var2, var3)) {
               UnsafeUtil.putInt(var1, var5, UnsafeUtil.getInt(var2, var5));
               this.setFieldPresent((T)var1, var3);
            }
            break;
         case 7:
            if (this.isFieldPresent((T)var2, var3)) {
               UnsafeUtil.putBoolean(var1, var5, UnsafeUtil.getBoolean(var2, var5));
               this.setFieldPresent((T)var1, var3);
            }
            break;
         case 8:
            if (this.isFieldPresent((T)var2, var3)) {
               UnsafeUtil.putObject(var1, var5, UnsafeUtil.getObject(var2, var5));
               this.setFieldPresent((T)var1, var3);
            }
            break;
         case 9:
            this.mergeMessage((T)var1, (T)var2, var3);
            break;
         case 10:
            if (this.isFieldPresent((T)var2, var3)) {
               UnsafeUtil.putObject(var1, var5, UnsafeUtil.getObject(var2, var5));
               this.setFieldPresent((T)var1, var3);
            }
            break;
         case 11:
            if (this.isFieldPresent((T)var2, var3)) {
               UnsafeUtil.putInt(var1, var5, UnsafeUtil.getInt(var2, var5));
               this.setFieldPresent((T)var1, var3);
            }
            break;
         case 12:
            if (this.isFieldPresent((T)var2, var3)) {
               UnsafeUtil.putInt(var1, var5, UnsafeUtil.getInt(var2, var5));
               this.setFieldPresent((T)var1, var3);
            }
            break;
         case 13:
            if (this.isFieldPresent((T)var2, var3)) {
               UnsafeUtil.putInt(var1, var5, UnsafeUtil.getInt(var2, var5));
               this.setFieldPresent((T)var1, var3);
            }
            break;
         case 14:
            if (this.isFieldPresent((T)var2, var3)) {
               UnsafeUtil.putLong(var1, var5, UnsafeUtil.getLong(var2, var5));
               this.setFieldPresent((T)var1, var3);
            }
            break;
         case 15:
            if (this.isFieldPresent((T)var2, var3)) {
               UnsafeUtil.putInt(var1, var5, UnsafeUtil.getInt(var2, var5));
               this.setFieldPresent((T)var1, var3);
            }
            break;
         case 16:
            if (this.isFieldPresent((T)var2, var3)) {
               UnsafeUtil.putLong(var1, var5, UnsafeUtil.getLong(var2, var5));
               this.setFieldPresent((T)var1, var3);
            }
            break;
         case 17:
            this.mergeMessage((T)var1, (T)var2, var3);
            break;
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
            this.listFieldSchema.mergeListsAt(var1, var2, var5);
            break;
         case 50:
            SchemaUtil.mergeMap(this.mapFieldSchema, var1, var2, var5);
            break;
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
            if (this.isOneofPresent((T)var2, var7, var3)) {
               UnsafeUtil.putObject(var1, var5, UnsafeUtil.getObject(var2, var5));
               this.setOneofPresent((T)var1, var7, var3);
            }
            break;
         case 60:
            this.mergeOneofMessage((T)var1, (T)var2, var3);
            break;
         case 61:
         case 62:
         case 63:
         case 64:
         case 65:
         case 66:
         case 67:
            if (this.isOneofPresent((T)var2, var7, var3)) {
               UnsafeUtil.putObject(var1, var5, UnsafeUtil.getObject(var2, var5));
               this.setOneofPresent((T)var1, var7, var3);
            }
            break;
         case 68:
            this.mergeOneofMessage((T)var1, (T)var2, var3);
      }
   }

   private void mergeMessage(T var1, T var2, int var3) {
      if (this.isFieldPresent(var2, var3)) {
         int var4 = this.typeAndOffsetAt(var3);
         long var5 = offset(var4);
         Object var7 = UNSAFE.getObject(var2, var5);
         if (var7 == null) {
            throw new IllegalStateException("Source subfield " + this.numberAt(var3) + " is present but null: " + var2);
         }

         Schema var8 = this.getMessageFieldSchema(var3);
         if (!this.isFieldPresent((T)var1, var3)) {
            if (!isMutable(var7)) {
               UNSAFE.putObject(var1, var5, var7);
            } else {
               Object var11 = var8.newInstance();
               var8.mergeFrom(var11, var7);
               UNSAFE.putObject(var1, var5, var11);
            }

            this.setFieldPresent((T)var1, var3);
         } else {
            Object var9 = UNSAFE.getObject(var1, var5);
            if (!isMutable(var9)) {
               Object var10 = var8.newInstance();
               var8.mergeFrom(var10, var9);
               UNSAFE.putObject(var1, var5, var10);
               var9 = var10;
            }

            var8.mergeFrom(var9, var7);
         }
      }
   }

   private void mergeOneofMessage(T var1, T var2, int var3) {
      int var4 = this.numberAt(var3);
      if (this.isOneofPresent(var2, var4, var3)) {
         long var5 = offset(this.typeAndOffsetAt(var3));
         Object var7 = UNSAFE.getObject(var2, var5);
         if (var7 == null) {
            throw new IllegalStateException("Source subfield " + this.numberAt(var3) + " is present but null: " + var2);
         }

         Schema var8 = this.getMessageFieldSchema(var3);
         if (!this.isOneofPresent((T)var1, var4, var3)) {
            if (!isMutable(var7)) {
               UNSAFE.putObject(var1, var5, var7);
            } else {
               Object var11 = var8.newInstance();
               var8.mergeFrom(var11, var7);
               UNSAFE.putObject(var1, var5, var11);
            }

            this.setOneofPresent((T)var1, var4, var3);
         } else {
            Object var9 = UNSAFE.getObject(var1, var5);
            if (!isMutable(var9)) {
               Object var10 = var8.newInstance();
               var8.mergeFrom(var10, var9);
               UNSAFE.putObject(var1, var5, var10);
               var9 = var10;
            }

            var8.mergeFrom(var9, var7);
         }
      }
   }

   @Override
   public int getSerializedSize(T var1) {
      int var2 = 0;
      Unsafe var3 = UNSAFE;
      int var4 = 1048575;
      byte var5 = 0;

      for (byte var6 = 0; var6 < this.buffer.length; var6 += 3) {
         int var7 = this.typeAndOffsetAt(var6);
         int var8 = type(var7);
         int var9 = this.numberAt(var6);
         int var10 = 0;
         int var11 = this.buffer[var6 + 2];
         int var12 = var11 & 1048575;
         if (var8 <= 17) {
            if (var12 != var4) {
               var4 = var12;
               var5 = (byte)(var4 == 1048575 ? 0 : var3.getInt(var1, var4));
            }

            var10 = 1 << (var11 >>> 20);
         }

         long var13 = offset(var7);
         int var15 = var8 >= FieldType.DOUBLE_LIST_PACKED.id() && var8 <= FieldType.SINT64_LIST_PACKED.id() ? var12 : 0;
         switch (var8) {
            case 0:
               if (this.isFieldPresent((T)var1, var6, var4, var5, var10)) {
                  var2 += CodedOutputStream.computeDoubleSize(var9, 0.0);
               }
               break;
            case 1:
               if (this.isFieldPresent((T)var1, var6, var4, var5, var10)) {
                  var2 += CodedOutputStream.computeFloatSize(var9, 0.0F);
               }
               break;
            case 2:
               if (this.isFieldPresent((T)var1, var6, var4, var5, var10)) {
                  var2 += CodedOutputStream.computeInt64Size(var9, var3.getLong(var1, var13));
               }
               break;
            case 3:
               if (this.isFieldPresent((T)var1, var6, var4, var5, var10)) {
                  var2 += CodedOutputStream.computeUInt64Size(var9, var3.getLong(var1, var13));
               }
               break;
            case 4:
               if (this.isFieldPresent((T)var1, var6, var4, var5, var10)) {
                  var2 += CodedOutputStream.computeInt32Size(var9, var3.getInt(var1, var13));
               }
               break;
            case 5:
               if (this.isFieldPresent((T)var1, var6, var4, var5, var10)) {
                  var2 += CodedOutputStream.computeFixed64Size(var9, 0L);
               }
               break;
            case 6:
               if (this.isFieldPresent((T)var1, var6, var4, var5, var10)) {
                  var2 += CodedOutputStream.computeFixed32Size(var9, 0);
               }
               break;
            case 7:
               if (this.isFieldPresent((T)var1, var6, var4, var5, var10)) {
                  var2 += CodedOutputStream.computeBoolSize(var9, true);
               }
               break;
            case 8:
               if (this.isFieldPresent((T)var1, var6, var4, var5, var10)) {
                  Object var35 = var3.getObject(var1, var13);
                  if (var35 instanceof ByteString) {
                     var2 += CodedOutputStream.computeBytesSize(var9, (ByteString)var35);
                  } else {
                     var2 += CodedOutputStream.computeStringSize(var9, (String)var35);
                  }
               }
               break;
            case 9:
               if (this.isFieldPresent((T)var1, var6, var4, var5, var10)) {
                  Object var34 = var3.getObject(var1, var13);
                  var2 += SchemaUtil.computeSizeMessage(var9, var34, this.getMessageFieldSchema(var6));
               }
               break;
            case 10:
               if (this.isFieldPresent((T)var1, var6, var4, var5, var10)) {
                  ByteString var33 = (ByteString)var3.getObject(var1, var13);
                  var2 += CodedOutputStream.computeBytesSize(var9, var33);
               }
               break;
            case 11:
               if (this.isFieldPresent((T)var1, var6, var4, var5, var10)) {
                  var2 += CodedOutputStream.computeUInt32Size(var9, var3.getInt(var1, var13));
               }
               break;
            case 12:
               if (this.isFieldPresent((T)var1, var6, var4, var5, var10)) {
                  var2 += CodedOutputStream.computeEnumSize(var9, var3.getInt(var1, var13));
               }
               break;
            case 13:
               if (this.isFieldPresent((T)var1, var6, var4, var5, var10)) {
                  var2 += CodedOutputStream.computeSFixed32Size(var9, 0);
               }
               break;
            case 14:
               if (this.isFieldPresent((T)var1, var6, var4, var5, var10)) {
                  var2 += CodedOutputStream.computeSFixed64Size(var9, 0L);
               }
               break;
            case 15:
               if (this.isFieldPresent((T)var1, var6, var4, var5, var10)) {
                  var2 += CodedOutputStream.computeSInt32Size(var9, var3.getInt(var1, var13));
               }
               break;
            case 16:
               if (this.isFieldPresent((T)var1, var6, var4, var5, var10)) {
                  var2 += CodedOutputStream.computeSInt64Size(var9, var3.getLong(var1, var13));
               }
               break;
            case 17:
               if (this.isFieldPresent((T)var1, var6, var4, var5, var10)) {
                  var2 += CodedOutputStream.computeGroupSize(var9, (MessageLite)var3.getObject(var1, var13), this.getMessageFieldSchema(var6));
               }
               break;
            case 18:
               var2 += SchemaUtil.computeSizeFixed64List(var9, (List<?>)var3.getObject(var1, var13), false);
               break;
            case 19:
               var2 += SchemaUtil.computeSizeFixed32List(var9, (List<?>)var3.getObject(var1, var13), false);
               break;
            case 20:
               var2 += SchemaUtil.computeSizeInt64List(var9, (List<Long>)var3.getObject(var1, var13), false);
               break;
            case 21:
               var2 += SchemaUtil.computeSizeUInt64List(var9, (List<Long>)var3.getObject(var1, var13), false);
               break;
            case 22:
               var2 += SchemaUtil.computeSizeInt32List(var9, (List<Integer>)var3.getObject(var1, var13), false);
               break;
            case 23:
               var2 += SchemaUtil.computeSizeFixed64List(var9, (List<?>)var3.getObject(var1, var13), false);
               break;
            case 24:
               var2 += SchemaUtil.computeSizeFixed32List(var9, (List<?>)var3.getObject(var1, var13), false);
               break;
            case 25:
               var2 += SchemaUtil.computeSizeBoolList(var9, (List<?>)var3.getObject(var1, var13), false);
               break;
            case 26:
               var2 += SchemaUtil.computeSizeStringList(var9, (List<?>)var3.getObject(var1, var13));
               break;
            case 27:
               var2 += SchemaUtil.computeSizeMessageList(var9, (List<?>)var3.getObject(var1, var13), this.getMessageFieldSchema(var6));
               break;
            case 28:
               var2 += SchemaUtil.computeSizeByteStringList(var9, (List<ByteString>)var3.getObject(var1, var13));
               break;
            case 29:
               var2 += SchemaUtil.computeSizeUInt32List(var9, (List<Integer>)var3.getObject(var1, var13), false);
               break;
            case 30:
               var2 += SchemaUtil.computeSizeEnumList(var9, (List<Integer>)var3.getObject(var1, var13), false);
               break;
            case 31:
               var2 += SchemaUtil.computeSizeFixed32List(var9, (List<?>)var3.getObject(var1, var13), false);
               break;
            case 32:
               var2 += SchemaUtil.computeSizeFixed64List(var9, (List<?>)var3.getObject(var1, var13), false);
               break;
            case 33:
               var2 += SchemaUtil.computeSizeSInt32List(var9, (List<Integer>)var3.getObject(var1, var13), false);
               break;
            case 34:
               var2 += SchemaUtil.computeSizeSInt64List(var9, (List<Long>)var3.getObject(var1, var13), false);
               break;
            case 35:
               int var32 = SchemaUtil.computeSizeFixed64ListNoTag((List<?>)var3.getObject(var1, var13));
               if (var32 > 0) {
                  if (this.useCachedSizeField) {
                     var3.putInt(var1, var15, var32);
                  }

                  var2 += CodedOutputStream.computeTagSize(var9) + CodedOutputStream.computeUInt32SizeNoTag(var32) + var32;
               }
               break;
            case 36:
               int var31 = SchemaUtil.computeSizeFixed32ListNoTag((List<?>)var3.getObject(var1, var13));
               if (var31 > 0) {
                  if (this.useCachedSizeField) {
                     var3.putInt(var1, var15, var31);
                  }

                  var2 += CodedOutputStream.computeTagSize(var9) + CodedOutputStream.computeUInt32SizeNoTag(var31) + var31;
               }
               break;
            case 37:
               int var30 = SchemaUtil.computeSizeInt64ListNoTag((List<Long>)var3.getObject(var1, var13));
               if (var30 > 0) {
                  if (this.useCachedSizeField) {
                     var3.putInt(var1, var15, var30);
                  }

                  var2 += CodedOutputStream.computeTagSize(var9) + CodedOutputStream.computeUInt32SizeNoTag(var30) + var30;
               }
               break;
            case 38:
               int var29 = SchemaUtil.computeSizeUInt64ListNoTag((List<Long>)var3.getObject(var1, var13));
               if (var29 > 0) {
                  if (this.useCachedSizeField) {
                     var3.putInt(var1, var15, var29);
                  }

                  var2 += CodedOutputStream.computeTagSize(var9) + CodedOutputStream.computeUInt32SizeNoTag(var29) + var29;
               }
               break;
            case 39:
               int var28 = SchemaUtil.computeSizeInt32ListNoTag((List<Integer>)var3.getObject(var1, var13));
               if (var28 > 0) {
                  if (this.useCachedSizeField) {
                     var3.putInt(var1, var15, var28);
                  }

                  var2 += CodedOutputStream.computeTagSize(var9) + CodedOutputStream.computeUInt32SizeNoTag(var28) + var28;
               }
               break;
            case 40:
               int var27 = SchemaUtil.computeSizeFixed64ListNoTag((List<?>)var3.getObject(var1, var13));
               if (var27 > 0) {
                  if (this.useCachedSizeField) {
                     var3.putInt(var1, var15, var27);
                  }

                  var2 += CodedOutputStream.computeTagSize(var9) + CodedOutputStream.computeUInt32SizeNoTag(var27) + var27;
               }
               break;
            case 41:
               int var26 = SchemaUtil.computeSizeFixed32ListNoTag((List<?>)var3.getObject(var1, var13));
               if (var26 > 0) {
                  if (this.useCachedSizeField) {
                     var3.putInt(var1, var15, var26);
                  }

                  var2 += CodedOutputStream.computeTagSize(var9) + CodedOutputStream.computeUInt32SizeNoTag(var26) + var26;
               }
               break;
            case 42:
               int var25 = SchemaUtil.computeSizeBoolListNoTag((List<?>)var3.getObject(var1, var13));
               if (var25 > 0) {
                  if (this.useCachedSizeField) {
                     var3.putInt(var1, var15, var25);
                  }

                  var2 += CodedOutputStream.computeTagSize(var9) + CodedOutputStream.computeUInt32SizeNoTag(var25) + var25;
               }
               break;
            case 43:
               int var24 = SchemaUtil.computeSizeUInt32ListNoTag((List<Integer>)var3.getObject(var1, var13));
               if (var24 > 0) {
                  if (this.useCachedSizeField) {
                     var3.putInt(var1, var15, var24);
                  }

                  var2 += CodedOutputStream.computeTagSize(var9) + CodedOutputStream.computeUInt32SizeNoTag(var24) + var24;
               }
               break;
            case 44:
               int var23 = SchemaUtil.computeSizeEnumListNoTag((List<Integer>)var3.getObject(var1, var13));
               if (var23 > 0) {
                  if (this.useCachedSizeField) {
                     var3.putInt(var1, var15, var23);
                  }

                  var2 += CodedOutputStream.computeTagSize(var9) + CodedOutputStream.computeUInt32SizeNoTag(var23) + var23;
               }
               break;
            case 45:
               int var22 = SchemaUtil.computeSizeFixed32ListNoTag((List<?>)var3.getObject(var1, var13));
               if (var22 > 0) {
                  if (this.useCachedSizeField) {
                     var3.putInt(var1, var15, var22);
                  }

                  var2 += CodedOutputStream.computeTagSize(var9) + CodedOutputStream.computeUInt32SizeNoTag(var22) + var22;
               }
               break;
            case 46:
               int var21 = SchemaUtil.computeSizeFixed64ListNoTag((List<?>)var3.getObject(var1, var13));
               if (var21 > 0) {
                  if (this.useCachedSizeField) {
                     var3.putInt(var1, var15, var21);
                  }

                  var2 += CodedOutputStream.computeTagSize(var9) + CodedOutputStream.computeUInt32SizeNoTag(var21) + var21;
               }
               break;
            case 47:
               int var20 = SchemaUtil.computeSizeSInt32ListNoTag((List<Integer>)var3.getObject(var1, var13));
               if (var20 > 0) {
                  if (this.useCachedSizeField) {
                     var3.putInt(var1, var15, var20);
                  }

                  var2 += CodedOutputStream.computeTagSize(var9) + CodedOutputStream.computeUInt32SizeNoTag(var20) + var20;
               }
               break;
            case 48:
               int var19 = SchemaUtil.computeSizeSInt64ListNoTag((List<Long>)var3.getObject(var1, var13));
               if (var19 > 0) {
                  if (this.useCachedSizeField) {
                     var3.putInt(var1, var15, var19);
                  }

                  var2 += CodedOutputStream.computeTagSize(var9) + CodedOutputStream.computeUInt32SizeNoTag(var19) + var19;
               }
               break;
            case 49:
               var2 += SchemaUtil.computeSizeGroupList(var9, (List<MessageLite>)var3.getObject(var1, var13), this.getMessageFieldSchema(var6));
               break;
            case 50:
               var2 += this.mapFieldSchema.getSerializedSize(var9, var3.getObject(var1, var13), this.getMapFieldDefaultEntry(var6));
               break;
            case 51:
               if (this.isOneofPresent((T)var1, var9, var6)) {
                  var2 += CodedOutputStream.computeDoubleSize(var9, 0.0);
               }
               break;
            case 52:
               if (this.isOneofPresent((T)var1, var9, var6)) {
                  var2 += CodedOutputStream.computeFloatSize(var9, 0.0F);
               }
               break;
            case 53:
               if (this.isOneofPresent((T)var1, var9, var6)) {
                  var2 += CodedOutputStream.computeInt64Size(var9, oneofLongAt(var1, var13));
               }
               break;
            case 54:
               if (this.isOneofPresent((T)var1, var9, var6)) {
                  var2 += CodedOutputStream.computeUInt64Size(var9, oneofLongAt(var1, var13));
               }
               break;
            case 55:
               if (this.isOneofPresent((T)var1, var9, var6)) {
                  var2 += CodedOutputStream.computeInt32Size(var9, oneofIntAt(var1, var13));
               }
               break;
            case 56:
               if (this.isOneofPresent((T)var1, var9, var6)) {
                  var2 += CodedOutputStream.computeFixed64Size(var9, 0L);
               }
               break;
            case 57:
               if (this.isOneofPresent((T)var1, var9, var6)) {
                  var2 += CodedOutputStream.computeFixed32Size(var9, 0);
               }
               break;
            case 58:
               if (this.isOneofPresent((T)var1, var9, var6)) {
                  var2 += CodedOutputStream.computeBoolSize(var9, true);
               }
               break;
            case 59:
               if (this.isOneofPresent((T)var1, var9, var6)) {
                  Object var18 = var3.getObject(var1, var13);
                  if (var18 instanceof ByteString) {
                     var2 += CodedOutputStream.computeBytesSize(var9, (ByteString)var18);
                  } else {
                     var2 += CodedOutputStream.computeStringSize(var9, (String)var18);
                  }
               }
               break;
            case 60:
               if (this.isOneofPresent((T)var1, var9, var6)) {
                  Object var16 = var3.getObject(var1, var13);
                  var2 += SchemaUtil.computeSizeMessage(var9, var16, this.getMessageFieldSchema(var6));
               }
               break;
            case 61:
               if (this.isOneofPresent((T)var1, var9, var6)) {
                  var2 += CodedOutputStream.computeBytesSize(var9, (ByteString)var3.getObject(var1, var13));
               }
               break;
            case 62:
               if (this.isOneofPresent((T)var1, var9, var6)) {
                  var2 += CodedOutputStream.computeUInt32Size(var9, oneofIntAt(var1, var13));
               }
               break;
            case 63:
               if (this.isOneofPresent((T)var1, var9, var6)) {
                  var2 += CodedOutputStream.computeEnumSize(var9, oneofIntAt(var1, var13));
               }
               break;
            case 64:
               if (this.isOneofPresent((T)var1, var9, var6)) {
                  var2 += CodedOutputStream.computeSFixed32Size(var9, 0);
               }
               break;
            case 65:
               if (this.isOneofPresent((T)var1, var9, var6)) {
                  var2 += CodedOutputStream.computeSFixed64Size(var9, 0L);
               }
               break;
            case 66:
               if (this.isOneofPresent((T)var1, var9, var6)) {
                  var2 += CodedOutputStream.computeSInt32Size(var9, oneofIntAt(var1, var13));
               }
               break;
            case 67:
               if (this.isOneofPresent((T)var1, var9, var6)) {
                  var2 += CodedOutputStream.computeSInt64Size(var9, oneofLongAt(var1, var13));
               }
               break;
            case 68:
               if (this.isOneofPresent((T)var1, var9, var6)) {
                  var2 += CodedOutputStream.computeGroupSize(var9, (MessageLite)var3.getObject(var1, var13), this.getMessageFieldSchema(var6));
               }
         }
      }

      var2 += this.getUnknownFieldsSerializedSize(this.unknownFieldSchema, (T)var1);
      if (this.hasExtensions) {
         var2 += this.extensionSchema.getExtensions(var1).getSerializedSize();
      }

      return var2;
   }

   private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> var1, T var2) {
      Object var3 = var1.getFromMessage(var2);
      return var1.getSerializedSize(var3);
   }

   @Override
   public void writeTo(T var1, Writer var2) {
      if (var2.fieldOrder() == Writer.FieldOrder.DESCENDING) {
         this.writeFieldsInDescendingOrder((T)var1, var2);
      } else {
         this.writeFieldsInAscendingOrder((T)var1, var2);
      }
   }

   private void writeFieldsInAscendingOrder(T var1, Writer var2) {
      Iterator var3 = null;
      Entry var4 = null;
      if (this.hasExtensions) {
         FieldSet var5 = this.extensionSchema.getExtensions(var1);
         if (!var5.isEmpty()) {
            var3 = var5.iterator();
            var4 = (Entry)var3.next();
         }
      }

      int var17 = 1048575;
      byte var6 = 0;
      int var7 = this.buffer.length;
      Unsafe var8 = UNSAFE;

      for (byte var9 = 0; var9 < var7; var9 += 3) {
         int var10 = this.typeAndOffsetAt(var9);
         int var11 = this.numberAt(var9);
         int var12 = type(var10);
         int var13 = 0;
         if (var12 <= 17) {
            int var14 = this.buffer[var9 + 2];
            int var15 = var14 & 1048575;
            if (var15 != var17) {
               var17 = var15;
               var6 = (byte)(var17 == 1048575 ? 0 : var8.getInt(var1, var15));
            }

            var13 = 1 << (var14 >>> 20);
         }

         while (var4 != null && this.extensionSchema.extensionNumber(var4) <= var11) {
            this.extensionSchema.serializeExtension(var2, var4);
            var4 = var3.hasNext() ? (Entry)var3.next() : null;
         }

         long var18 = offset(var10);
         switch (var12) {
            case 0:
               if (this.isFieldPresent((T)var1, var9, var17, var6, var13)) {
                  var2.writeDouble(var11, doubleAt(var1, var18));
               }
               break;
            case 1:
               if (this.isFieldPresent((T)var1, var9, var17, var6, var13)) {
                  var2.writeFloat(var11, floatAt(var1, var18));
               }
               break;
            case 2:
               if (this.isFieldPresent((T)var1, var9, var17, var6, var13)) {
                  var2.writeInt64(var11, var8.getLong(var1, var18));
               }
               break;
            case 3:
               if (this.isFieldPresent((T)var1, var9, var17, var6, var13)) {
                  var2.writeUInt64(var11, var8.getLong(var1, var18));
               }
               break;
            case 4:
               if (this.isFieldPresent((T)var1, var9, var17, var6, var13)) {
                  var2.writeInt32(var11, var8.getInt(var1, var18));
               }
               break;
            case 5:
               if (this.isFieldPresent((T)var1, var9, var17, var6, var13)) {
                  var2.writeFixed64(var11, var8.getLong(var1, var18));
               }
               break;
            case 6:
               if (this.isFieldPresent((T)var1, var9, var17, var6, var13)) {
                  var2.writeFixed32(var11, var8.getInt(var1, var18));
               }
               break;
            case 7:
               if (this.isFieldPresent((T)var1, var9, var17, var6, var13)) {
                  var2.writeBool(var11, booleanAt(var1, var18));
               }
               break;
            case 8:
               if (this.isFieldPresent((T)var1, var9, var17, var6, var13)) {
                  this.writeString(var11, var8.getObject(var1, var18), var2);
               }
               break;
            case 9:
               if (this.isFieldPresent((T)var1, var9, var17, var6, var13)) {
                  Object var19 = var8.getObject(var1, var18);
                  var2.writeMessage(var11, var19, this.getMessageFieldSchema(var9));
               }
               break;
            case 10:
               if (this.isFieldPresent((T)var1, var9, var17, var6, var13)) {
                  var2.writeBytes(var11, (ByteString)var8.getObject(var1, var18));
               }
               break;
            case 11:
               if (this.isFieldPresent((T)var1, var9, var17, var6, var13)) {
                  var2.writeUInt32(var11, var8.getInt(var1, var18));
               }
               break;
            case 12:
               if (this.isFieldPresent((T)var1, var9, var17, var6, var13)) {
                  var2.writeEnum(var11, var8.getInt(var1, var18));
               }
               break;
            case 13:
               if (this.isFieldPresent((T)var1, var9, var17, var6, var13)) {
                  var2.writeSFixed32(var11, var8.getInt(var1, var18));
               }
               break;
            case 14:
               if (this.isFieldPresent((T)var1, var9, var17, var6, var13)) {
                  var2.writeSFixed64(var11, var8.getLong(var1, var18));
               }
               break;
            case 15:
               if (this.isFieldPresent((T)var1, var9, var17, var6, var13)) {
                  var2.writeSInt32(var11, var8.getInt(var1, var18));
               }
               break;
            case 16:
               if (this.isFieldPresent((T)var1, var9, var17, var6, var13)) {
                  var2.writeSInt64(var11, var8.getLong(var1, var18));
               }
               break;
            case 17:
               if (this.isFieldPresent((T)var1, var9, var17, var6, var13)) {
                  var2.writeGroup(var11, var8.getObject(var1, var18), this.getMessageFieldSchema(var9));
               }
               break;
            case 18:
               SchemaUtil.writeDoubleList(this.numberAt(var9), (List<Double>)var8.getObject(var1, var18), var2, false);
               break;
            case 19:
               SchemaUtil.writeFloatList(this.numberAt(var9), (List<Float>)var8.getObject(var1, var18), var2, false);
               break;
            case 20:
               SchemaUtil.writeInt64List(this.numberAt(var9), (List<Long>)var8.getObject(var1, var18), var2, false);
               break;
            case 21:
               SchemaUtil.writeUInt64List(this.numberAt(var9), (List<Long>)var8.getObject(var1, var18), var2, false);
               break;
            case 22:
               SchemaUtil.writeInt32List(this.numberAt(var9), (List<Integer>)var8.getObject(var1, var18), var2, false);
               break;
            case 23:
               SchemaUtil.writeFixed64List(this.numberAt(var9), (List<Long>)var8.getObject(var1, var18), var2, false);
               break;
            case 24:
               SchemaUtil.writeFixed32List(this.numberAt(var9), (List<Integer>)var8.getObject(var1, var18), var2, false);
               break;
            case 25:
               SchemaUtil.writeBoolList(this.numberAt(var9), (List<Boolean>)var8.getObject(var1, var18), var2, false);
               break;
            case 26:
               SchemaUtil.writeStringList(this.numberAt(var9), (List<String>)var8.getObject(var1, var18), var2);
               break;
            case 27:
               SchemaUtil.writeMessageList(this.numberAt(var9), (List<?>)var8.getObject(var1, var18), var2, this.getMessageFieldSchema(var9));
               break;
            case 28:
               SchemaUtil.writeBytesList(this.numberAt(var9), (List<ByteString>)var8.getObject(var1, var18), var2);
               break;
            case 29:
               SchemaUtil.writeUInt32List(this.numberAt(var9), (List<Integer>)var8.getObject(var1, var18), var2, false);
               break;
            case 30:
               SchemaUtil.writeEnumList(this.numberAt(var9), (List<Integer>)var8.getObject(var1, var18), var2, false);
               break;
            case 31:
               SchemaUtil.writeSFixed32List(this.numberAt(var9), (List<Integer>)var8.getObject(var1, var18), var2, false);
               break;
            case 32:
               SchemaUtil.writeSFixed64List(this.numberAt(var9), (List<Long>)var8.getObject(var1, var18), var2, false);
               break;
            case 33:
               SchemaUtil.writeSInt32List(this.numberAt(var9), (List<Integer>)var8.getObject(var1, var18), var2, false);
               break;
            case 34:
               SchemaUtil.writeSInt64List(this.numberAt(var9), (List<Long>)var8.getObject(var1, var18), var2, false);
               break;
            case 35:
               SchemaUtil.writeDoubleList(this.numberAt(var9), (List<Double>)var8.getObject(var1, var18), var2, true);
               break;
            case 36:
               SchemaUtil.writeFloatList(this.numberAt(var9), (List<Float>)var8.getObject(var1, var18), var2, true);
               break;
            case 37:
               SchemaUtil.writeInt64List(this.numberAt(var9), (List<Long>)var8.getObject(var1, var18), var2, true);
               break;
            case 38:
               SchemaUtil.writeUInt64List(this.numberAt(var9), (List<Long>)var8.getObject(var1, var18), var2, true);
               break;
            case 39:
               SchemaUtil.writeInt32List(this.numberAt(var9), (List<Integer>)var8.getObject(var1, var18), var2, true);
               break;
            case 40:
               SchemaUtil.writeFixed64List(this.numberAt(var9), (List<Long>)var8.getObject(var1, var18), var2, true);
               break;
            case 41:
               SchemaUtil.writeFixed32List(this.numberAt(var9), (List<Integer>)var8.getObject(var1, var18), var2, true);
               break;
            case 42:
               SchemaUtil.writeBoolList(this.numberAt(var9), (List<Boolean>)var8.getObject(var1, var18), var2, true);
               break;
            case 43:
               SchemaUtil.writeUInt32List(this.numberAt(var9), (List<Integer>)var8.getObject(var1, var18), var2, true);
               break;
            case 44:
               SchemaUtil.writeEnumList(this.numberAt(var9), (List<Integer>)var8.getObject(var1, var18), var2, true);
               break;
            case 45:
               SchemaUtil.writeSFixed32List(this.numberAt(var9), (List<Integer>)var8.getObject(var1, var18), var2, true);
               break;
            case 46:
               SchemaUtil.writeSFixed64List(this.numberAt(var9), (List<Long>)var8.getObject(var1, var18), var2, true);
               break;
            case 47:
               SchemaUtil.writeSInt32List(this.numberAt(var9), (List<Integer>)var8.getObject(var1, var18), var2, true);
               break;
            case 48:
               SchemaUtil.writeSInt64List(this.numberAt(var9), (List<Long>)var8.getObject(var1, var18), var2, true);
               break;
            case 49:
               SchemaUtil.writeGroupList(this.numberAt(var9), (List<?>)var8.getObject(var1, var18), var2, this.getMessageFieldSchema(var9));
               break;
            case 50:
               this.writeMapHelper(var2, var11, var8.getObject(var1, var18), var9);
               break;
            case 51:
               if (this.isOneofPresent((T)var1, var11, var9)) {
                  var2.writeDouble(var11, oneofDoubleAt(var1, var18));
               }
               break;
            case 52:
               if (this.isOneofPresent((T)var1, var11, var9)) {
                  var2.writeFloat(var11, oneofFloatAt(var1, var18));
               }
               break;
            case 53:
               if (this.isOneofPresent((T)var1, var11, var9)) {
                  var2.writeInt64(var11, oneofLongAt(var1, var18));
               }
               break;
            case 54:
               if (this.isOneofPresent((T)var1, var11, var9)) {
                  var2.writeUInt64(var11, oneofLongAt(var1, var18));
               }
               break;
            case 55:
               if (this.isOneofPresent((T)var1, var11, var9)) {
                  var2.writeInt32(var11, oneofIntAt(var1, var18));
               }
               break;
            case 56:
               if (this.isOneofPresent((T)var1, var11, var9)) {
                  var2.writeFixed64(var11, oneofLongAt(var1, var18));
               }
               break;
            case 57:
               if (this.isOneofPresent((T)var1, var11, var9)) {
                  var2.writeFixed32(var11, oneofIntAt(var1, var18));
               }
               break;
            case 58:
               if (this.isOneofPresent((T)var1, var11, var9)) {
                  var2.writeBool(var11, oneofBooleanAt(var1, var18));
               }
               break;
            case 59:
               if (this.isOneofPresent((T)var1, var11, var9)) {
                  this.writeString(var11, var8.getObject(var1, var18), var2);
               }
               break;
            case 60:
               if (this.isOneofPresent((T)var1, var11, var9)) {
                  Object var16 = var8.getObject(var1, var18);
                  var2.writeMessage(var11, var16, this.getMessageFieldSchema(var9));
               }
               break;
            case 61:
               if (this.isOneofPresent((T)var1, var11, var9)) {
                  var2.writeBytes(var11, (ByteString)var8.getObject(var1, var18));
               }
               break;
            case 62:
               if (this.isOneofPresent((T)var1, var11, var9)) {
                  var2.writeUInt32(var11, oneofIntAt(var1, var18));
               }
               break;
            case 63:
               if (this.isOneofPresent((T)var1, var11, var9)) {
                  var2.writeEnum(var11, oneofIntAt(var1, var18));
               }
               break;
            case 64:
               if (this.isOneofPresent((T)var1, var11, var9)) {
                  var2.writeSFixed32(var11, oneofIntAt(var1, var18));
               }
               break;
            case 65:
               if (this.isOneofPresent((T)var1, var11, var9)) {
                  var2.writeSFixed64(var11, oneofLongAt(var1, var18));
               }
               break;
            case 66:
               if (this.isOneofPresent((T)var1, var11, var9)) {
                  var2.writeSInt32(var11, oneofIntAt(var1, var18));
               }
               break;
            case 67:
               if (this.isOneofPresent((T)var1, var11, var9)) {
                  var2.writeSInt64(var11, oneofLongAt(var1, var18));
               }
               break;
            case 68:
               if (this.isOneofPresent((T)var1, var11, var9)) {
                  var2.writeGroup(var11, var8.getObject(var1, var18), this.getMessageFieldSchema(var9));
               }
         }
      }

      while (var4 != null) {
         this.extensionSchema.serializeExtension(var2, var4);
         var4 = var3.hasNext() ? (Entry)var3.next() : null;
      }

      this.writeUnknownInMessageTo(this.unknownFieldSchema, (T)var1, var2);
   }

   private void writeFieldsInDescendingOrder(T var1, Writer var2) {
      this.writeUnknownInMessageTo(this.unknownFieldSchema, (T)var1, var2);
      Iterator var3 = null;
      Entry var4 = null;
      if (this.hasExtensions) {
         FieldSet var5 = this.extensionSchema.getExtensions(var1);
         if (!var5.isEmpty()) {
            var3 = var5.descendingIterator();
            var4 = (Entry)var3.next();
         }
      }

      for (int var9 = this.buffer.length - 3; var9 >= 0; var9 -= 3) {
         int var6 = this.typeAndOffsetAt(var9);

         int var7;
         for (var7 = this.numberAt(var9); var4 != null && this.extensionSchema.extensionNumber(var4) > var7; var4 = var3.hasNext() ? (Entry)var3.next() : null) {
            this.extensionSchema.serializeExtension(var2, var4);
         }

         switch (type(var6)) {
            case 0:
               if (this.isFieldPresent((T)var1, var9)) {
                  var2.writeDouble(var7, doubleAt(var1, offset(var6)));
               }
               break;
            case 1:
               if (this.isFieldPresent((T)var1, var9)) {
                  var2.writeFloat(var7, floatAt(var1, offset(var6)));
               }
               break;
            case 2:
               if (this.isFieldPresent((T)var1, var9)) {
                  var2.writeInt64(var7, longAt(var1, offset(var6)));
               }
               break;
            case 3:
               if (this.isFieldPresent((T)var1, var9)) {
                  var2.writeUInt64(var7, longAt(var1, offset(var6)));
               }
               break;
            case 4:
               if (this.isFieldPresent((T)var1, var9)) {
                  var2.writeInt32(var7, intAt(var1, offset(var6)));
               }
               break;
            case 5:
               if (this.isFieldPresent((T)var1, var9)) {
                  var2.writeFixed64(var7, longAt(var1, offset(var6)));
               }
               break;
            case 6:
               if (this.isFieldPresent((T)var1, var9)) {
                  var2.writeFixed32(var7, intAt(var1, offset(var6)));
               }
               break;
            case 7:
               if (this.isFieldPresent((T)var1, var9)) {
                  var2.writeBool(var7, booleanAt(var1, offset(var6)));
               }
               break;
            case 8:
               if (this.isFieldPresent((T)var1, var9)) {
                  this.writeString(var7, UnsafeUtil.getObject(var1, offset(var6)), var2);
               }
               break;
            case 9:
               if (this.isFieldPresent((T)var1, var9)) {
                  Object var10 = UnsafeUtil.getObject(var1, offset(var6));
                  var2.writeMessage(var7, var10, this.getMessageFieldSchema(var9));
               }
               break;
            case 10:
               if (this.isFieldPresent((T)var1, var9)) {
                  var2.writeBytes(var7, (ByteString)UnsafeUtil.getObject(var1, offset(var6)));
               }
               break;
            case 11:
               if (this.isFieldPresent((T)var1, var9)) {
                  var2.writeUInt32(var7, intAt(var1, offset(var6)));
               }
               break;
            case 12:
               if (this.isFieldPresent((T)var1, var9)) {
                  var2.writeEnum(var7, intAt(var1, offset(var6)));
               }
               break;
            case 13:
               if (this.isFieldPresent((T)var1, var9)) {
                  var2.writeSFixed32(var7, intAt(var1, offset(var6)));
               }
               break;
            case 14:
               if (this.isFieldPresent((T)var1, var9)) {
                  var2.writeSFixed64(var7, longAt(var1, offset(var6)));
               }
               break;
            case 15:
               if (this.isFieldPresent((T)var1, var9)) {
                  var2.writeSInt32(var7, intAt(var1, offset(var6)));
               }
               break;
            case 16:
               if (this.isFieldPresent((T)var1, var9)) {
                  var2.writeSInt64(var7, longAt(var1, offset(var6)));
               }
               break;
            case 17:
               if (this.isFieldPresent((T)var1, var9)) {
                  var2.writeGroup(var7, UnsafeUtil.getObject(var1, offset(var6)), this.getMessageFieldSchema(var9));
               }
               break;
            case 18:
               SchemaUtil.writeDoubleList(this.numberAt(var9), (List<Double>)UnsafeUtil.getObject(var1, offset(var6)), var2, false);
               break;
            case 19:
               SchemaUtil.writeFloatList(this.numberAt(var9), (List<Float>)UnsafeUtil.getObject(var1, offset(var6)), var2, false);
               break;
            case 20:
               SchemaUtil.writeInt64List(this.numberAt(var9), (List<Long>)UnsafeUtil.getObject(var1, offset(var6)), var2, false);
               break;
            case 21:
               SchemaUtil.writeUInt64List(this.numberAt(var9), (List<Long>)UnsafeUtil.getObject(var1, offset(var6)), var2, false);
               break;
            case 22:
               SchemaUtil.writeInt32List(this.numberAt(var9), (List<Integer>)UnsafeUtil.getObject(var1, offset(var6)), var2, false);
               break;
            case 23:
               SchemaUtil.writeFixed64List(this.numberAt(var9), (List<Long>)UnsafeUtil.getObject(var1, offset(var6)), var2, false);
               break;
            case 24:
               SchemaUtil.writeFixed32List(this.numberAt(var9), (List<Integer>)UnsafeUtil.getObject(var1, offset(var6)), var2, false);
               break;
            case 25:
               SchemaUtil.writeBoolList(this.numberAt(var9), (List<Boolean>)UnsafeUtil.getObject(var1, offset(var6)), var2, false);
               break;
            case 26:
               SchemaUtil.writeStringList(this.numberAt(var9), (List<String>)UnsafeUtil.getObject(var1, offset(var6)), var2);
               break;
            case 27:
               SchemaUtil.writeMessageList(this.numberAt(var9), (List<?>)UnsafeUtil.getObject(var1, offset(var6)), var2, this.getMessageFieldSchema(var9));
               break;
            case 28:
               SchemaUtil.writeBytesList(this.numberAt(var9), (List<ByteString>)UnsafeUtil.getObject(var1, offset(var6)), var2);
               break;
            case 29:
               SchemaUtil.writeUInt32List(this.numberAt(var9), (List<Integer>)UnsafeUtil.getObject(var1, offset(var6)), var2, false);
               break;
            case 30:
               SchemaUtil.writeEnumList(this.numberAt(var9), (List<Integer>)UnsafeUtil.getObject(var1, offset(var6)), var2, false);
               break;
            case 31:
               SchemaUtil.writeSFixed32List(this.numberAt(var9), (List<Integer>)UnsafeUtil.getObject(var1, offset(var6)), var2, false);
               break;
            case 32:
               SchemaUtil.writeSFixed64List(this.numberAt(var9), (List<Long>)UnsafeUtil.getObject(var1, offset(var6)), var2, false);
               break;
            case 33:
               SchemaUtil.writeSInt32List(this.numberAt(var9), (List<Integer>)UnsafeUtil.getObject(var1, offset(var6)), var2, false);
               break;
            case 34:
               SchemaUtil.writeSInt64List(this.numberAt(var9), (List<Long>)UnsafeUtil.getObject(var1, offset(var6)), var2, false);
               break;
            case 35:
               SchemaUtil.writeDoubleList(this.numberAt(var9), (List<Double>)UnsafeUtil.getObject(var1, offset(var6)), var2, true);
               break;
            case 36:
               SchemaUtil.writeFloatList(this.numberAt(var9), (List<Float>)UnsafeUtil.getObject(var1, offset(var6)), var2, true);
               break;
            case 37:
               SchemaUtil.writeInt64List(this.numberAt(var9), (List<Long>)UnsafeUtil.getObject(var1, offset(var6)), var2, true);
               break;
            case 38:
               SchemaUtil.writeUInt64List(this.numberAt(var9), (List<Long>)UnsafeUtil.getObject(var1, offset(var6)), var2, true);
               break;
            case 39:
               SchemaUtil.writeInt32List(this.numberAt(var9), (List<Integer>)UnsafeUtil.getObject(var1, offset(var6)), var2, true);
               break;
            case 40:
               SchemaUtil.writeFixed64List(this.numberAt(var9), (List<Long>)UnsafeUtil.getObject(var1, offset(var6)), var2, true);
               break;
            case 41:
               SchemaUtil.writeFixed32List(this.numberAt(var9), (List<Integer>)UnsafeUtil.getObject(var1, offset(var6)), var2, true);
               break;
            case 42:
               SchemaUtil.writeBoolList(this.numberAt(var9), (List<Boolean>)UnsafeUtil.getObject(var1, offset(var6)), var2, true);
               break;
            case 43:
               SchemaUtil.writeUInt32List(this.numberAt(var9), (List<Integer>)UnsafeUtil.getObject(var1, offset(var6)), var2, true);
               break;
            case 44:
               SchemaUtil.writeEnumList(this.numberAt(var9), (List<Integer>)UnsafeUtil.getObject(var1, offset(var6)), var2, true);
               break;
            case 45:
               SchemaUtil.writeSFixed32List(this.numberAt(var9), (List<Integer>)UnsafeUtil.getObject(var1, offset(var6)), var2, true);
               break;
            case 46:
               SchemaUtil.writeSFixed64List(this.numberAt(var9), (List<Long>)UnsafeUtil.getObject(var1, offset(var6)), var2, true);
               break;
            case 47:
               SchemaUtil.writeSInt32List(this.numberAt(var9), (List<Integer>)UnsafeUtil.getObject(var1, offset(var6)), var2, true);
               break;
            case 48:
               SchemaUtil.writeSInt64List(this.numberAt(var9), (List<Long>)UnsafeUtil.getObject(var1, offset(var6)), var2, true);
               break;
            case 49:
               SchemaUtil.writeGroupList(this.numberAt(var9), (List<?>)UnsafeUtil.getObject(var1, offset(var6)), var2, this.getMessageFieldSchema(var9));
               break;
            case 50:
               this.writeMapHelper(var2, var7, UnsafeUtil.getObject(var1, offset(var6)), var9);
               break;
            case 51:
               if (this.isOneofPresent((T)var1, var7, var9)) {
                  var2.writeDouble(var7, oneofDoubleAt(var1, offset(var6)));
               }
               break;
            case 52:
               if (this.isOneofPresent((T)var1, var7, var9)) {
                  var2.writeFloat(var7, oneofFloatAt(var1, offset(var6)));
               }
               break;
            case 53:
               if (this.isOneofPresent((T)var1, var7, var9)) {
                  var2.writeInt64(var7, oneofLongAt(var1, offset(var6)));
               }
               break;
            case 54:
               if (this.isOneofPresent((T)var1, var7, var9)) {
                  var2.writeUInt64(var7, oneofLongAt(var1, offset(var6)));
               }
               break;
            case 55:
               if (this.isOneofPresent((T)var1, var7, var9)) {
                  var2.writeInt32(var7, oneofIntAt(var1, offset(var6)));
               }
               break;
            case 56:
               if (this.isOneofPresent((T)var1, var7, var9)) {
                  var2.writeFixed64(var7, oneofLongAt(var1, offset(var6)));
               }
               break;
            case 57:
               if (this.isOneofPresent((T)var1, var7, var9)) {
                  var2.writeFixed32(var7, oneofIntAt(var1, offset(var6)));
               }
               break;
            case 58:
               if (this.isOneofPresent((T)var1, var7, var9)) {
                  var2.writeBool(var7, oneofBooleanAt(var1, offset(var6)));
               }
               break;
            case 59:
               if (this.isOneofPresent((T)var1, var7, var9)) {
                  this.writeString(var7, UnsafeUtil.getObject(var1, offset(var6)), var2);
               }
               break;
            case 60:
               if (this.isOneofPresent((T)var1, var7, var9)) {
                  Object var8 = UnsafeUtil.getObject(var1, offset(var6));
                  var2.writeMessage(var7, var8, this.getMessageFieldSchema(var9));
               }
               break;
            case 61:
               if (this.isOneofPresent((T)var1, var7, var9)) {
                  var2.writeBytes(var7, (ByteString)UnsafeUtil.getObject(var1, offset(var6)));
               }
               break;
            case 62:
               if (this.isOneofPresent((T)var1, var7, var9)) {
                  var2.writeUInt32(var7, oneofIntAt(var1, offset(var6)));
               }
               break;
            case 63:
               if (this.isOneofPresent((T)var1, var7, var9)) {
                  var2.writeEnum(var7, oneofIntAt(var1, offset(var6)));
               }
               break;
            case 64:
               if (this.isOneofPresent((T)var1, var7, var9)) {
                  var2.writeSFixed32(var7, oneofIntAt(var1, offset(var6)));
               }
               break;
            case 65:
               if (this.isOneofPresent((T)var1, var7, var9)) {
                  var2.writeSFixed64(var7, oneofLongAt(var1, offset(var6)));
               }
               break;
            case 66:
               if (this.isOneofPresent((T)var1, var7, var9)) {
                  var2.writeSInt32(var7, oneofIntAt(var1, offset(var6)));
               }
               break;
            case 67:
               if (this.isOneofPresent((T)var1, var7, var9)) {
                  var2.writeSInt64(var7, oneofLongAt(var1, offset(var6)));
               }
               break;
            case 68:
               if (this.isOneofPresent((T)var1, var7, var9)) {
                  var2.writeGroup(var7, UnsafeUtil.getObject(var1, offset(var6)), this.getMessageFieldSchema(var9));
               }
         }
      }

      while (var4 != null) {
         this.extensionSchema.serializeExtension(var2, var4);
         var4 = var3.hasNext() ? (Entry)var3.next() : null;
      }
   }

   private <K, V> void writeMapHelper(Writer var1, int var2, Object var3, int var4) {
      if (var3 != null) {
         var1.writeMap(var2, this.mapFieldSchema.forMapMetadata(this.getMapFieldDefaultEntry(var4)), this.mapFieldSchema.forMapData(var3));
      }
   }

   private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> var1, T var2, Writer var3) {
      var1.writeTo(var1.getFromMessage(var2), var3);
   }

   @Override
   public void mergeFrom(T var1, Reader var2, ExtensionRegistryLite var3) {
      if (var3 == null) {
         throw new NullPointerException();
      }

      checkMutable(var1);
      this.mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, (T)var1, var2, var3);
   }

   private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(
      UnknownFieldSchema<UT, UB> var1, ExtensionSchema<ET> var2, T var3, Reader var4, ExtensionRegistryLite var5
   ) {
      Object var6 = null;
      FieldSet var7 = null;

      while (true) {
         try {
            int var8 = var4.getFieldNumber();
            int var9 = this.positionForFieldNumber(var8);
            if (var9 >= 0) {
               int var19 = this.typeAndOffsetAt(var9);

               try {
                  switch (type(var19)) {
                     case 0:
                        UnsafeUtil.putDouble(var3, offset(var19), var4.readDouble());
                        this.setFieldPresent((T)var3, var9);
                        break;
                     case 1:
                        UnsafeUtil.putFloat(var3, offset(var19), var4.readFloat());
                        this.setFieldPresent((T)var3, var9);
                        break;
                     case 2:
                        UnsafeUtil.putLong(var3, offset(var19), var4.readInt64());
                        this.setFieldPresent((T)var3, var9);
                        break;
                     case 3:
                        UnsafeUtil.putLong(var3, offset(var19), var4.readUInt64());
                        this.setFieldPresent((T)var3, var9);
                        break;
                     case 4:
                        UnsafeUtil.putInt(var3, offset(var19), var4.readInt32());
                        this.setFieldPresent((T)var3, var9);
                        break;
                     case 5:
                        UnsafeUtil.putLong(var3, offset(var19), var4.readFixed64());
                        this.setFieldPresent((T)var3, var9);
                        break;
                     case 6:
                        UnsafeUtil.putInt(var3, offset(var19), var4.readFixed32());
                        this.setFieldPresent((T)var3, var9);
                        break;
                     case 7:
                        UnsafeUtil.putBoolean(var3, offset(var19), var4.readBool());
                        this.setFieldPresent((T)var3, var9);
                        break;
                     case 8:
                        this.readString(var3, var19, var4);
                        this.setFieldPresent((T)var3, var9);
                        break;
                     case 9:
                        MessageLite var26 = (MessageLite)this.mutableMessageFieldForMerge((T)var3, var9);
                        var4.mergeMessageField(var26, this.getMessageFieldSchema(var9), var5);
                        this.storeMessageField((T)var3, var9, var26);
                        break;
                     case 10:
                        UnsafeUtil.putObject(var3, offset(var19), var4.readBytes());
                        this.setFieldPresent((T)var3, var9);
                        break;
                     case 11:
                        UnsafeUtil.putInt(var3, offset(var19), var4.readUInt32());
                        this.setFieldPresent((T)var3, var9);
                        break;
                     case 12:
                        int var25 = var4.readEnum();
                        Internal.EnumVerifier var27 = this.getEnumFieldVerifier(var9);
                        if (var27 != null && !var27.isInRange(var25)) {
                           var6 = SchemaUtil.storeUnknownEnum(var3, var8, var25, var6, var1);
                           break;
                        }

                        UnsafeUtil.putInt(var3, offset(var19), var25);
                        this.setFieldPresent((T)var3, var9);
                        break;
                     case 13:
                        UnsafeUtil.putInt(var3, offset(var19), var4.readSFixed32());
                        this.setFieldPresent((T)var3, var9);
                        break;
                     case 14:
                        UnsafeUtil.putLong(var3, offset(var19), var4.readSFixed64());
                        this.setFieldPresent((T)var3, var9);
                        break;
                     case 15:
                        UnsafeUtil.putInt(var3, offset(var19), var4.readSInt32());
                        this.setFieldPresent((T)var3, var9);
                        break;
                     case 16:
                        UnsafeUtil.putLong(var3, offset(var19), var4.readSInt64());
                        this.setFieldPresent((T)var3, var9);
                        break;
                     case 17:
                        MessageLite var24 = (MessageLite)this.mutableMessageFieldForMerge((T)var3, var9);
                        var4.mergeGroupField(var24, this.getMessageFieldSchema(var9), var5);
                        this.storeMessageField((T)var3, var9, var24);
                        break;
                     case 18:
                        var4.readDoubleList(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 19:
                        var4.readFloatList(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 20:
                        var4.readInt64List(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 21:
                        var4.readUInt64List(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 22:
                        var4.readInt32List(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 23:
                        var4.readFixed64List(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 24:
                        var4.readFixed32List(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 25:
                        var4.readBoolList(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 26:
                        this.readStringList(var3, var19, var4);
                        break;
                     case 27:
                        this.readMessageList(var3, var19, var4, this.getMessageFieldSchema(var9), var5);
                        break;
                     case 28:
                        var4.readBytesList(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 29:
                        var4.readUInt32List(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 30:
                        List var23 = this.listFieldSchema.mutableListAt(var3, offset(var19));
                        var4.readEnumList(var23);
                        var6 = SchemaUtil.filterUnknownEnumList(var3, var8, var23, this.getEnumFieldVerifier(var9), var6, var1);
                        break;
                     case 31:
                        var4.readSFixed32List(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 32:
                        var4.readSFixed64List(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 33:
                        var4.readSInt32List(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 34:
                        var4.readSInt64List(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 35:
                        var4.readDoubleList(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 36:
                        var4.readFloatList(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 37:
                        var4.readInt64List(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 38:
                        var4.readUInt64List(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 39:
                        var4.readInt32List(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 40:
                        var4.readFixed64List(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 41:
                        var4.readFixed32List(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 42:
                        var4.readBoolList(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 43:
                        var4.readUInt32List(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 44:
                        List var22 = this.listFieldSchema.mutableListAt(var3, offset(var19));
                        var4.readEnumList(var22);
                        var6 = SchemaUtil.filterUnknownEnumList(var3, var8, var22, this.getEnumFieldVerifier(var9), var6, var1);
                        break;
                     case 45:
                        var4.readSFixed32List(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 46:
                        var4.readSFixed64List(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 47:
                        var4.readSInt32List(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 48:
                        var4.readSInt64List(this.listFieldSchema.mutableListAt(var3, offset(var19)));
                        break;
                     case 49:
                        this.readGroupList(var3, offset(var19), var4, this.getMessageFieldSchema(var9), var5);
                        break;
                     case 50:
                        this.mergeMap(var3, var9, this.getMapFieldDefaultEntry(var9), var5, var4);
                        break;
                     case 51:
                        UnsafeUtil.putObject(var3, offset(var19), var4.readDouble());
                        this.setOneofPresent((T)var3, var8, var9);
                        break;
                     case 52:
                        UnsafeUtil.putObject(var3, offset(var19), var4.readFloat());
                        this.setOneofPresent((T)var3, var8, var9);
                        break;
                     case 53:
                        UnsafeUtil.putObject(var3, offset(var19), var4.readInt64());
                        this.setOneofPresent((T)var3, var8, var9);
                        break;
                     case 54:
                        UnsafeUtil.putObject(var3, offset(var19), var4.readUInt64());
                        this.setOneofPresent((T)var3, var8, var9);
                        break;
                     case 55:
                        UnsafeUtil.putObject(var3, offset(var19), var4.readInt32());
                        this.setOneofPresent((T)var3, var8, var9);
                        break;
                     case 56:
                        UnsafeUtil.putObject(var3, offset(var19), var4.readFixed64());
                        this.setOneofPresent((T)var3, var8, var9);
                        break;
                     case 57:
                        UnsafeUtil.putObject(var3, offset(var19), var4.readFixed32());
                        this.setOneofPresent((T)var3, var8, var9);
                        break;
                     case 58:
                        UnsafeUtil.putObject(var3, offset(var19), var4.readBool());
                        this.setOneofPresent((T)var3, var8, var9);
                        break;
                     case 59:
                        this.readString(var3, var19, var4);
                        this.setOneofPresent((T)var3, var8, var9);
                        break;
                     case 60:
                        MessageLite var21 = (MessageLite)this.mutableOneofMessageFieldForMerge((T)var3, var8, var9);
                        var4.mergeMessageField(var21, this.getMessageFieldSchema(var9), var5);
                        this.storeOneofMessageField((T)var3, var8, var9, var21);
                        break;
                     case 61:
                        UnsafeUtil.putObject(var3, offset(var19), var4.readBytes());
                        this.setOneofPresent((T)var3, var8, var9);
                        break;
                     case 62:
                        UnsafeUtil.putObject(var3, offset(var19), var4.readUInt32());
                        this.setOneofPresent((T)var3, var8, var9);
                        break;
                     case 63:
                        int var20 = var4.readEnum();
                        Internal.EnumVerifier var12 = this.getEnumFieldVerifier(var9);
                        if (var12 != null && !var12.isInRange(var20)) {
                           var6 = SchemaUtil.storeUnknownEnum(var3, var8, var20, var6, var1);
                           break;
                        }

                        UnsafeUtil.putObject(var3, offset(var19), var20);
                        this.setOneofPresent((T)var3, var8, var9);
                        break;
                     case 64:
                        UnsafeUtil.putObject(var3, offset(var19), var4.readSFixed32());
                        this.setOneofPresent((T)var3, var8, var9);
                        break;
                     case 65:
                        UnsafeUtil.putObject(var3, offset(var19), var4.readSFixed64());
                        this.setOneofPresent((T)var3, var8, var9);
                        break;
                     case 66:
                        UnsafeUtil.putObject(var3, offset(var19), var4.readSInt32());
                        this.setOneofPresent((T)var3, var8, var9);
                        break;
                     case 67:
                        UnsafeUtil.putObject(var3, offset(var19), var4.readSInt64());
                        this.setOneofPresent((T)var3, var8, var9);
                        break;
                     case 68:
                        MessageLite var11 = (MessageLite)this.mutableOneofMessageFieldForMerge((T)var3, var8, var9);
                        var4.mergeGroupField(var11, this.getMessageFieldSchema(var9), var5);
                        this.storeOneofMessageField((T)var3, var8, var9, var11);
                        break;
                     default:
                        if (var6 == null) {
                           var6 = var1.getBuilderFromMessage(var3);
                        }

                        if (!var1.mergeOneFieldFrom(var6, var4)) {
                           return;
                        }
                  }
               } catch (InvalidProtocolBufferException.InvalidWireTypeException var17) {
                  if (!var1.shouldDiscardUnknownFields(var4)) {
                     if (var6 == null) {
                        var6 = var1.getBuilderFromMessage(var3);
                     }

                     if (!var1.mergeOneFieldFrom(var6, var4)) {
                        return;
                     }
                  } else {
                     if (var4.skipField()) {
                        return;
                     }

                     return;
                  }
               }
            } else {
               if (var8 == Integer.MAX_VALUE) {
                  return;
               }

               Object var10 = !this.hasExtensions ? null : var2.findExtensionByNumber(var5, this.defaultInstance, var8);
               if (var10 != null) {
                  if (var7 == null) {
                     var7 = var2.getMutableExtensions(var3);
                  }

                  var6 = var2.parseExtension(var3, var4, var10, var5, var7, var6, var1);
               } else if (var1.shouldDiscardUnknownFields(var4)) {
                  if (var4.skipField()) {
                     return;
                  }

                  return;
               } else {
                  if (var6 == null) {
                     var6 = var1.getBuilderFromMessage(var3);
                  }

                  if (!var1.mergeOneFieldFrom(var6, var4)) {
                     return;
                  }
               }
            }
         } finally {
            for (int var14 = this.checkInitializedCount; var14 < this.repeatedFieldOffsetStart; var14++) {
               var6 = this.filterMapUnknownEnumValues(var3, this.intArray[var14], var6, var1, var3);
            }

            if (var6 != null) {
               var1.setBuilderToMessage(var3, var6);
            }
         }
      }
   }

   static UnknownFieldSetLite getMutableUnknownFields(Object var0) {
      UnknownFieldSetLite var1 = ((GeneratedMessageLite)var0).unknownFields;
      if (var1 == UnknownFieldSetLite.getDefaultInstance()) {
         var1 = UnknownFieldSetLite.newInstance();
         ((GeneratedMessageLite)var0).unknownFields = var1;
      }

      return var1;
   }

   private int decodeMapEntryValue(byte[] var1, int var2, int var3, WireFormat.FieldType var4, Class<?> var5, ArrayDecoders.Registers var6) {
      switch (var4) {
         case BOOL:
            var2 = ArrayDecoders.decodeVarint64(var1, var2, var6);
            var6.object1 = var6.long1 != 0L;
            break;
         case BYTES:
            var2 = ArrayDecoders.decodeBytes(var1, var2, var6);
            break;
         case DOUBLE:
            var6.object1 = ArrayDecoders.decodeDouble(var1, var2);
            var2 += 8;
            break;
         case FIXED32:
         case SFIXED32:
            var6.object1 = ArrayDecoders.decodeFixed32(var1, var2);
            var2 += 4;
            break;
         case FIXED64:
         case SFIXED64:
            var6.object1 = ArrayDecoders.decodeFixed64(var1, var2);
            var2 += 8;
            break;
         case FLOAT:
            var6.object1 = ArrayDecoders.decodeFloat(var1, var2);
            var2 += 4;
            break;
         case ENUM:
         case INT32:
         case UINT32:
            var2 = ArrayDecoders.decodeVarint32(var1, var2, var6);
            var6.object1 = var6.int1;
            break;
         case INT64:
         case UINT64:
            var2 = ArrayDecoders.decodeVarint64(var1, var2, var6);
            var6.object1 = var6.long1;
            break;
         case MESSAGE:
            var2 = ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor(var5), var1, var2, var3, var6);
            break;
         case SINT32:
            var2 = ArrayDecoders.decodeVarint32(var1, var2, var6);
            var6.object1 = CodedInputStream.decodeZigZag32(var6.int1);
            break;
         case SINT64:
            var2 = ArrayDecoders.decodeVarint64(var1, var2, var6);
            var6.object1 = CodedInputStream.decodeZigZag64(var6.long1);
            break;
         case STRING:
            var2 = ArrayDecoders.decodeStringRequireUtf8(var1, var2, var6);
            break;
         default:
            throw new RuntimeException("unsupported field type.");
      }

      return var2;
   }

   private <K, V> int decodeMapEntry(byte[] var1, int var2, int var3, MapEntryLite.Metadata<K, V> var4, Map<K, V> var5, ArrayDecoders.Registers var6) {
      var2 = ArrayDecoders.decodeVarint32(var1, var2, var6);
      int var7 = var6.int1;
      if (var7 >= 0 && var7 <= var3 - var2) {
         int var8 = var2 + var7;
         Object var9 = var4.defaultKey;
         Object var10 = var4.defaultValue;

         while (var2 < var8) {
            int var11 = var1[var2++];
            if (var11 < 0) {
               var2 = ArrayDecoders.decodeVarint32(var11, var1, var2, var6);
               var11 = var6.int1;
            }

            int var12 = var11 >>> 3;
            int var13 = var11 & 7;
            switch (var12) {
               case 1:
                  if (var13 == var4.keyType.getWireType()) {
                     var2 = this.decodeMapEntryValue(var1, var2, var3, var4.keyType, null, var6);
                     var9 = var6.object1;
                     continue;
                  }
                  break;
               case 2:
                  if (var13 == var4.valueType.getWireType()) {
                     var2 = this.decodeMapEntryValue(var1, var2, var3, var4.valueType, var4.defaultValue.getClass(), var6);
                     var10 = var6.object1;
                     continue;
                  }
            }

            var2 = ArrayDecoders.skipField(var11, var1, var2, var3, var6);
         }

         if (var2 != var8) {
            throw InvalidProtocolBufferException.parseFailure();
         }

         var5.put(var9, var10);
         return var8;
      } else {
         throw InvalidProtocolBufferException.truncatedMessage();
      }
   }

   private int parseRepeatedField(
      T var1, byte[] var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, int var11, long var12, ArrayDecoders.Registers var14
   ) {
      Internal.ProtobufList var15 = (Internal.ProtobufList)UNSAFE.getObject(var1, var12);
      if (!var15.isModifiable()) {
         int var16 = var15.size();
         var15 = var15.mutableCopyWithCapacity(var16 == 0 ? 10 : var16 * 2);
         UNSAFE.putObject(var1, var12, var15);
      }

      switch (var11) {
         case 18:
         case 35:
            if (var7 == 2) {
               var3 = ArrayDecoders.decodePackedDoubleList(var2, var3, var15, var14);
            } else if (var7 == 1) {
               var3 = ArrayDecoders.decodeDoubleList(var5, var2, var3, var4, var15, var14);
            }
            break;
         case 19:
         case 36:
            if (var7 == 2) {
               var3 = ArrayDecoders.decodePackedFloatList(var2, var3, var15, var14);
            } else if (var7 == 5) {
               var3 = ArrayDecoders.decodeFloatList(var5, var2, var3, var4, var15, var14);
            }
            break;
         case 20:
         case 21:
         case 37:
         case 38:
            if (var7 == 2) {
               var3 = ArrayDecoders.decodePackedVarint64List(var2, var3, var15, var14);
            } else if (var7 == 0) {
               var3 = ArrayDecoders.decodeVarint64List(var5, var2, var3, var4, var15, var14);
            }
            break;
         case 22:
         case 29:
         case 39:
         case 43:
            if (var7 == 2) {
               var3 = ArrayDecoders.decodePackedVarint32List(var2, var3, var15, var14);
            } else if (var7 == 0) {
               var3 = ArrayDecoders.decodeVarint32List(var5, var2, var3, var4, var15, var14);
            }
            break;
         case 23:
         case 32:
         case 40:
         case 46:
            if (var7 == 2) {
               var3 = ArrayDecoders.decodePackedFixed64List(var2, var3, var15, var14);
            } else if (var7 == 1) {
               var3 = ArrayDecoders.decodeFixed64List(var5, var2, var3, var4, var15, var14);
            }
            break;
         case 24:
         case 31:
         case 41:
         case 45:
            if (var7 == 2) {
               var3 = ArrayDecoders.decodePackedFixed32List(var2, var3, var15, var14);
            } else if (var7 == 5) {
               var3 = ArrayDecoders.decodeFixed32List(var5, var2, var3, var4, var15, var14);
            }
            break;
         case 25:
         case 42:
            if (var7 == 2) {
               var3 = ArrayDecoders.decodePackedBoolList(var2, var3, var15, var14);
            } else if (var7 == 0) {
               var3 = ArrayDecoders.decodeBoolList(var5, var2, var3, var4, var15, var14);
            }
            break;
         case 26:
            if (var7 == 2) {
               if ((var9 & 536870912L) == 0L) {
                  var3 = ArrayDecoders.decodeStringList(var5, var2, var3, var4, var15, var14);
               } else {
                  var3 = ArrayDecoders.decodeStringListRequireUtf8(var5, var2, var3, var4, var15, var14);
               }
            }
            break;
         case 27:
            if (var7 == 2) {
               var3 = ArrayDecoders.decodeMessageList(this.getMessageFieldSchema(var8), var5, var2, var3, var4, var15, var14);
            }
            break;
         case 28:
            if (var7 == 2) {
               var3 = ArrayDecoders.decodeBytesList(var5, var2, var3, var4, var15, var14);
            }
            break;
         case 30:
         case 44:
            if (var7 == 2) {
               var3 = ArrayDecoders.decodePackedVarint32List(var2, var3, var15, var14);
            } else {
               if (var7 != 0) {
                  break;
               }

               var3 = ArrayDecoders.decodeVarint32List(var5, var2, var3, var4, var15, var14);
            }

            SchemaUtil.filterUnknownEnumList(var1, var6, var15, this.getEnumFieldVerifier(var8), null, this.unknownFieldSchema);
            break;
         case 33:
         case 47:
            if (var7 == 2) {
               var3 = ArrayDecoders.decodePackedSInt32List(var2, var3, var15, var14);
            } else if (var7 == 0) {
               var3 = ArrayDecoders.decodeSInt32List(var5, var2, var3, var4, var15, var14);
            }
            break;
         case 34:
         case 48:
            if (var7 == 2) {
               var3 = ArrayDecoders.decodePackedSInt64List(var2, var3, var15, var14);
            } else if (var7 == 0) {
               var3 = ArrayDecoders.decodeSInt64List(var5, var2, var3, var4, var15, var14);
            }
            break;
         case 49:
            if (var7 == 3) {
               var3 = ArrayDecoders.decodeGroupList(this.getMessageFieldSchema(var8), var5, var2, var3, var4, var15, var14);
            }
      }

      return var3;
   }

   private <K, V> int parseMapField(T var1, byte[] var2, int var3, int var4, int var5, long var6, ArrayDecoders.Registers var8) {
      Unsafe var9 = UNSAFE;
      Object var10 = this.getMapFieldDefaultEntry(var5);
      Object var11 = var9.getObject(var1, var6);
      if (this.mapFieldSchema.isImmutable(var11)) {
         Object var12 = var11;
         var11 = this.mapFieldSchema.newMapField(var10);
         this.mapFieldSchema.mergeFrom(var11, var12);
         var9.putObject(var1, var6, var11);
      }

      return this.decodeMapEntry(var2, var3, var4, this.mapFieldSchema.forMapMetadata(var10), this.mapFieldSchema.forMutableMapData(var11), var8);
   }

   private int parseOneofField(
      T var1, byte[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, ArrayDecoders.Registers var13
   ) {
      Unsafe var14 = UNSAFE;
      long var15 = this.buffer[var12 + 2] & 1048575;
      switch (var9) {
         case 51:
            if (var7 == 1) {
               var14.putObject(var1, var10, ArrayDecoders.decodeDouble(var2, var3));
               var3 += 8;
               var14.putInt(var1, var15, var6);
            }
            break;
         case 52:
            if (var7 == 5) {
               var14.putObject(var1, var10, ArrayDecoders.decodeFloat(var2, var3));
               var3 += 4;
               var14.putInt(var1, var15, var6);
            }
            break;
         case 53:
         case 54:
            if (var7 == 0) {
               var3 = ArrayDecoders.decodeVarint64(var2, var3, var13);
               var14.putObject(var1, var10, var13.long1);
               var14.putInt(var1, var15, var6);
            }
            break;
         case 55:
         case 62:
            if (var7 == 0) {
               var3 = ArrayDecoders.decodeVarint32(var2, var3, var13);
               var14.putObject(var1, var10, var13.int1);
               var14.putInt(var1, var15, var6);
            }
            break;
         case 56:
         case 65:
            if (var7 == 1) {
               var14.putObject(var1, var10, ArrayDecoders.decodeFixed64(var2, var3));
               var3 += 8;
               var14.putInt(var1, var15, var6);
            }
            break;
         case 57:
         case 64:
            if (var7 == 5) {
               var14.putObject(var1, var10, ArrayDecoders.decodeFixed32(var2, var3));
               var3 += 4;
               var14.putInt(var1, var15, var6);
            }
            break;
         case 58:
            if (var7 == 0) {
               var3 = ArrayDecoders.decodeVarint64(var2, var3, var13);
               var14.putObject(var1, var10, var13.long1 != 0L);
               var14.putInt(var1, var15, var6);
            }
            break;
         case 59:
            if (var7 == 2) {
               var3 = ArrayDecoders.decodeVarint32(var2, var3, var13);
               int var21 = var13.int1;
               if (var21 == 0) {
                  var14.putObject(var1, var10, "");
               } else {
                  if ((var8 & 536870912) != 0 && !Utf8.isValidUtf8(var2, var3, var3 + var21)) {
                     throw InvalidProtocolBufferException.invalidUtf8();
                  }

                  String var23 = new String(var2, var3, var21, Internal.UTF_8);
                  var14.putObject(var1, var10, var23);
                  var3 += var21;
               }

               var14.putInt(var1, var15, var6);
            }
            break;
         case 60:
            if (var7 == 2) {
               Object var20 = this.mutableOneofMessageFieldForMerge((T)var1, var6, var12);
               var3 = ArrayDecoders.mergeMessageField(var20, this.getMessageFieldSchema(var12), var2, var3, var4, var13);
               this.storeOneofMessageField((T)var1, var6, var12, var20);
            }
            break;
         case 61:
            if (var7 == 2) {
               var3 = ArrayDecoders.decodeBytes(var2, var3, var13);
               var14.putObject(var1, var10, var13.object1);
               var14.putInt(var1, var15, var6);
            }
            break;
         case 63:
            if (var7 == 0) {
               var3 = ArrayDecoders.decodeVarint32(var2, var3, var13);
               int var19 = var13.int1;
               Internal.EnumVerifier var22 = this.getEnumFieldVerifier(var12);
               if (var22 != null && !var22.isInRange(var19)) {
                  getMutableUnknownFields(var1).storeField(var5, (long)var19);
               } else {
                  var14.putObject(var1, var10, var19);
                  var14.putInt(var1, var15, var6);
               }
            }
            break;
         case 66:
            if (var7 == 0) {
               var3 = ArrayDecoders.decodeVarint32(var2, var3, var13);
               var14.putObject(var1, var10, CodedInputStream.decodeZigZag32(var13.int1));
               var14.putInt(var1, var15, var6);
            }
            break;
         case 67:
            if (var7 == 0) {
               var3 = ArrayDecoders.decodeVarint64(var2, var3, var13);
               var14.putObject(var1, var10, CodedInputStream.decodeZigZag64(var13.long1));
               var14.putInt(var1, var15, var6);
            }
            break;
         case 68:
            if (var7 == 3) {
               Object var17 = this.mutableOneofMessageFieldForMerge((T)var1, var6, var12);
               int var18 = var5 & -8 | 4;
               var3 = ArrayDecoders.mergeGroupField(var17, this.getMessageFieldSchema(var12), var2, var3, var4, var18, var13);
               this.storeOneofMessageField((T)var1, var6, var12, var17);
            }
      }

      return var3;
   }

   private Schema getMessageFieldSchema(int var1) {
      int var2 = var1 / 3 * 2;
      Schema var3 = (Schema)this.objects[var2];
      if (var3 != null) {
         return var3;
      }

      var3 = Protobuf.getInstance().schemaFor((Class<T>)this.objects[var2 + 1]);
      this.objects[var2] = var3;
      return var3;
   }

   private Object getMapFieldDefaultEntry(int var1) {
      return this.objects[var1 / 3 * 2];
   }

   private Internal.EnumVerifier getEnumFieldVerifier(int var1) {
      return (Internal.EnumVerifier)this.objects[var1 / 3 * 2 + 1];
   }

   @CanIgnoreReturnValue
   int parseMessage(T var1, byte[] var2, int var3, int var4, int var5, ArrayDecoders.Registers var6) {
      checkMutable(var1);
      Unsafe var7 = UNSAFE;
      int var8 = 1048575;
      int var9 = 0;
      int var10 = 0;
      int var11 = -1;
      int var12 = 0;

      while (var3 < var4) {
         var10 = var2[var3++];
         if (var10 < 0) {
            var3 = ArrayDecoders.decodeVarint32(var10, var2, var3, var6);
            var10 = var6.int1;
         }

         int var13 = var10 >>> 3;
         int var14 = var10 & 7;
         if (var13 > var11) {
            var12 = this.positionForFieldNumber(var13, var12 / 3);
         } else {
            var12 = this.positionForFieldNumber(var13);
         }

         var11 = var13;
         if (var12 == -1) {
            var12 = 0;
         } else {
            int var15 = this.buffer[var12 + 1];
            int var16 = type(var15);
            long var17 = offset(var15);
            if (var16 <= 17) {
               int var19 = this.buffer[var12 + 2];
               int var20 = 1 << (var19 >>> 20);
               int var21 = var19 & 1048575;
               if (var21 != var8) {
                  if (var8 != 1048575) {
                     var7.putInt(var1, var8, var9);
                  }

                  var8 = var21;
                  var9 = var21 == 1048575 ? 0 : var7.getInt(var1, var21);
               }

               switch (var16) {
                  case 0:
                     if (var14 == 1) {
                        UnsafeUtil.putDouble(var1, var17, ArrayDecoders.decodeDouble(var2, var3));
                        var3 += 8;
                        var9 |= var20;
                        continue;
                     }
                     break;
                  case 1:
                     if (var14 == 5) {
                        UnsafeUtil.putFloat(var1, var17, ArrayDecoders.decodeFloat(var2, var3));
                        var3 += 4;
                        var9 |= var20;
                        continue;
                     }
                     break;
                  case 2:
                  case 3:
                     if (var14 == 0) {
                        var3 = ArrayDecoders.decodeVarint64(var2, var3, var6);
                        var7.putLong(var1, var17, var6.long1);
                        var9 |= var20;
                        continue;
                     }
                     break;
                  case 4:
                  case 11:
                     if (var14 == 0) {
                        var3 = ArrayDecoders.decodeVarint32(var2, var3, var6);
                        var7.putInt(var1, var17, var6.int1);
                        var9 |= var20;
                        continue;
                     }
                     break;
                  case 5:
                  case 14:
                     if (var14 == 1) {
                        var7.putLong(var1, var17, ArrayDecoders.decodeFixed64(var2, var3));
                        var3 += 8;
                        var9 |= var20;
                        continue;
                     }
                     break;
                  case 6:
                  case 13:
                     if (var14 == 5) {
                        var7.putInt(var1, var17, ArrayDecoders.decodeFixed32(var2, var3));
                        var3 += 4;
                        var9 |= var20;
                        continue;
                     }
                     break;
                  case 7:
                     if (var14 == 0) {
                        var3 = ArrayDecoders.decodeVarint64(var2, var3, var6);
                        UnsafeUtil.putBoolean(var1, var17, var6.long1 != 0L);
                        var9 |= var20;
                        continue;
                     }
                     break;
                  case 8:
                     if (var14 == 2) {
                        if (isEnforceUtf8(var15)) {
                           var3 = ArrayDecoders.decodeStringRequireUtf8(var2, var3, var6);
                        } else {
                           var3 = ArrayDecoders.decodeString(var2, var3, var6);
                        }

                        var7.putObject(var1, var17, var6.object1);
                        var9 |= var20;
                        continue;
                     }
                     break;
                  case 9:
                     if (var14 == 2) {
                        Object var32 = this.mutableMessageFieldForMerge((T)var1, var12);
                        var3 = ArrayDecoders.mergeMessageField(var32, this.getMessageFieldSchema(var12), var2, var3, var4, var6);
                        this.storeMessageField((T)var1, var12, var32);
                        var9 |= var20;
                        continue;
                     }
                     break;
                  case 10:
                     if (var14 == 2) {
                        var3 = ArrayDecoders.decodeBytes(var2, var3, var6);
                        var7.putObject(var1, var17, var6.object1);
                        var9 |= var20;
                        continue;
                     }
                     break;
                  case 12:
                     if (var14 == 0) {
                        var3 = ArrayDecoders.decodeVarint32(var2, var3, var6);
                        int var31 = var6.int1;
                        Internal.EnumVerifier var33 = this.getEnumFieldVerifier(var12);
                        if (isLegacyEnumIsClosed(var15) && var33 != null && !var33.isInRange(var31)) {
                           getMutableUnknownFields(var1).storeField(var10, (long)var31);
                           continue;
                        }

                        var7.putInt(var1, var17, var31);
                        var9 |= var20;
                        continue;
                     }
                     break;
                  case 15:
                     if (var14 == 0) {
                        var3 = ArrayDecoders.decodeVarint32(var2, var3, var6);
                        var7.putInt(var1, var17, CodedInputStream.decodeZigZag32(var6.int1));
                        var9 |= var20;
                        continue;
                     }
                     break;
                  case 16:
                     if (var14 == 0) {
                        var3 = ArrayDecoders.decodeVarint64(var2, var3, var6);
                        var7.putLong(var1, var17, CodedInputStream.decodeZigZag64(var6.long1));
                        var9 |= var20;
                        continue;
                     }
                     break;
                  case 17:
                     if (var14 == 3) {
                        Object var22 = this.mutableMessageFieldForMerge((T)var1, var12);
                        int var23 = var13 << 3 | 4;
                        var3 = ArrayDecoders.mergeGroupField(var22, this.getMessageFieldSchema(var12), var2, var3, var4, var23, var6);
                        this.storeMessageField((T)var1, var12, var22);
                        var9 |= var20;
                        continue;
                     }
               }
            } else if (var16 == 27) {
               if (var14 == 2) {
                  Internal.ProtobufList var26 = (Internal.ProtobufList)var7.getObject(var1, var17);
                  if (!var26.isModifiable()) {
                     int var30 = var26.size();
                     var26 = var26.mutableCopyWithCapacity(var30 == 0 ? 10 : var30 * 2);
                     var7.putObject(var1, var17, var26);
                  }

                  var3 = ArrayDecoders.decodeMessageList(this.getMessageFieldSchema(var12), var10, var2, var3, var4, var26, var6);
                  continue;
               }
            } else if (var16 <= 49) {
               int var27 = var3;
               var3 = this.parseRepeatedField((T)var1, var2, var3, var4, var10, var13, var14, var12, var15, var16, var17, var6);
               if (var3 != var27) {
                  continue;
               }
            } else if (var16 == 50) {
               if (var14 == 2) {
                  int var28 = var3;
                  var3 = this.parseMapField((T)var1, var2, var3, var4, var12, var17, var6);
                  if (var3 != var28) {
                     continue;
                  }
               }
            } else {
               int var29 = var3;
               var3 = this.parseOneofField((T)var1, var2, var3, var4, var10, var13, var14, var15, var16, var17, var12, var6);
               if (var3 != var29) {
                  continue;
               }
            }
         }

         if (var10 == var5 && var5 != 0) {
            break;
         }

         if (this.hasExtensions && var6.extensionRegistry != ExtensionRegistryLite.getEmptyRegistry()) {
            var3 = ArrayDecoders.decodeExtensionOrUnknownField(
               var10, var2, var3, var4, var1, this.defaultInstance, (UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite>)this.unknownFieldSchema, var6
            );
         } else {
            var3 = ArrayDecoders.decodeUnknownField(var10, var2, var3, var4, getMutableUnknownFields(var1), var6);
         }
      }

      if (var8 != 1048575) {
         var7.putInt(var1, var8, var9);
      }

      UnknownFieldSetLite var24 = null;

      for (int var25 = this.checkInitializedCount; var25 < this.repeatedFieldOffsetStart; var25++) {
         var24 = this.filterMapUnknownEnumValues(var1, this.intArray[var25], var24, (UnknownFieldSchema<?, UnknownFieldSetLite>)this.unknownFieldSchema, var1);
      }

      if (var24 != null) {
         ((UnknownFieldSchema<?, UnknownFieldSetLite>)this.unknownFieldSchema).setBuilderToMessage(var1, var24);
      }

      if (var5 == 0) {
         if (var3 != var4) {
            throw InvalidProtocolBufferException.parseFailure();
         }
      } else if (var3 > var4 || var10 != var5) {
         throw InvalidProtocolBufferException.parseFailure();
      }

      return var3;
   }

   private Object mutableMessageFieldForMerge(T var1, int var2) {
      Schema var3 = this.getMessageFieldSchema(var2);
      long var4 = offset(this.typeAndOffsetAt(var2));
      if (!this.isFieldPresent((T)var1, var2)) {
         return var3.newInstance();
      }

      Object var6 = UNSAFE.getObject(var1, var4);
      if (isMutable(var6)) {
         return var6;
      }

      Object var7 = var3.newInstance();
      if (var6 != null) {
         var3.mergeFrom(var7, var6);
      }

      return var7;
   }

   private void storeMessageField(T var1, int var2, Object var3) {
      UNSAFE.putObject(var1, offset(this.typeAndOffsetAt(var2)), var3);
      this.setFieldPresent((T)var1, var2);
   }

   private Object mutableOneofMessageFieldForMerge(T var1, int var2, int var3) {
      Schema var4 = this.getMessageFieldSchema(var3);
      if (!this.isOneofPresent((T)var1, var2, var3)) {
         return var4.newInstance();
      }

      Object var5 = UNSAFE.getObject(var1, offset(this.typeAndOffsetAt(var3)));
      if (isMutable(var5)) {
         return var5;
      }

      Object var6 = var4.newInstance();
      if (var5 != null) {
         var4.mergeFrom(var6, var5);
      }

      return var6;
   }

   private void storeOneofMessageField(T var1, int var2, int var3, Object var4) {
      UNSAFE.putObject(var1, offset(this.typeAndOffsetAt(var3)), var4);
      this.setOneofPresent((T)var1, var2, var3);
   }

   @Override
   public void mergeFrom(T var1, byte[] var2, int var3, int var4, ArrayDecoders.Registers var5) {
      this.parseMessage((T)var1, var2, var3, var4, 0, var5);
   }

   @Override
   public void makeImmutable(T var1) {
      if (isMutable(var1)) {
         if (var1 instanceof GeneratedMessageLite) {
            GeneratedMessageLite var2 = (GeneratedMessageLite)var1;
            var2.clearMemoizedSerializedSize();
            var2.clearMemoizedHashCode();
            var2.markImmutable();
         }

         int var8 = this.buffer.length;

         for (byte var3 = 0; var3 < var8; var3 += 3) {
            int var4 = this.typeAndOffsetAt(var3);
            long var5 = offset(var4);
            switch (type(var4)) {
               case 9:
               case 17:
                  if (this.isFieldPresent((T)var1, var3)) {
                     this.getMessageFieldSchema(var3).makeImmutable(UNSAFE.getObject(var1, var5));
                  }
               case 10:
               case 11:
               case 12:
               case 13:
               case 14:
               case 15:
               case 16:
               case 51:
               case 52:
               case 53:
               case 54:
               case 55:
               case 56:
               case 57:
               case 58:
               case 59:
               case 61:
               case 62:
               case 63:
               case 64:
               case 65:
               case 66:
               case 67:
               default:
                  break;
               case 18:
               case 19:
               case 20:
               case 21:
               case 22:
               case 23:
               case 24:
               case 25:
               case 26:
               case 27:
               case 28:
               case 29:
               case 30:
               case 31:
               case 32:
               case 33:
               case 34:
               case 35:
               case 36:
               case 37:
               case 38:
               case 39:
               case 40:
               case 41:
               case 42:
               case 43:
               case 44:
               case 45:
               case 46:
               case 47:
               case 48:
               case 49:
                  this.listFieldSchema.makeImmutableListAt(var1, var5);
                  break;
               case 50:
                  Object var7 = UNSAFE.getObject(var1, var5);
                  if (var7 != null) {
                     UNSAFE.putObject(var1, var5, this.mapFieldSchema.toImmutable(var7));
                  }
                  break;
               case 60:
               case 68:
                  if (this.isOneofPresent((T)var1, this.numberAt(var3), var3)) {
                     this.getMessageFieldSchema(var3).makeImmutable(UNSAFE.getObject(var1, var5));
                  }
            }
         }

         this.unknownFieldSchema.makeImmutable(var1);
         if (this.hasExtensions) {
            this.extensionSchema.makeImmutable(var1);
         }
      }
   }

   private final <K, V> void mergeMap(Object var1, int var2, Object var3, ExtensionRegistryLite var4, Reader var5) {
      long var6 = offset(this.typeAndOffsetAt(var2));
      Object var8 = UnsafeUtil.getObject(var1, var6);
      if (var8 == null) {
         var8 = this.mapFieldSchema.newMapField(var3);
         UnsafeUtil.putObject(var1, var6, var8);
      } else if (this.mapFieldSchema.isImmutable(var8)) {
         Object var9 = var8;
         var8 = this.mapFieldSchema.newMapField(var3);
         this.mapFieldSchema.mergeFrom(var8, var9);
         UnsafeUtil.putObject(var1, var6, var8);
      }

      var5.readMap(this.mapFieldSchema.forMutableMapData(var8), this.mapFieldSchema.forMapMetadata(var3), var4);
   }

   private <UT, UB> UB filterMapUnknownEnumValues(Object var1, int var2, UB var3, UnknownFieldSchema<UT, UB> var4, Object var5) {
      int var6 = this.numberAt(var2);
      long var7 = offset(this.typeAndOffsetAt(var2));
      Object var9 = UnsafeUtil.getObject(var1, var7);
      if (var9 == null) {
         return (UB)var3;
      }

      Internal.EnumVerifier var10 = this.getEnumFieldVerifier(var2);
      if (var10 == null) {
         return (UB)var3;
      }

      Map var11 = this.mapFieldSchema.forMutableMapData(var9);
      return this.filterUnknownEnumMap(var2, var6, var11, var10, (UB)var3, var4, var5);
   }

   private <K, V, UT, UB> UB filterUnknownEnumMap(
      int var1, int var2, Map<K, V> var3, Internal.EnumVerifier var4, UB var5, UnknownFieldSchema<UT, UB> var6, Object var7
   ) {
      MapEntryLite.Metadata var8 = this.mapFieldSchema.forMapMetadata(this.getMapFieldDefaultEntry(var1));
      Iterator var9 = var3.entrySet().iterator();

      while (var9.hasNext()) {
         Entry var10 = (Entry)var9.next();
         if (!var4.isInRange((Integer)var10.getValue())) {
            if (var5 == null) {
               var5 = var6.getBuilderFromMessage(var7);
            }

            int var11 = MapEntryLite.computeSerializedSize(var8, var10.getKey(), var10.getValue());
            ByteString.CodedBuilder var12 = ByteString.newCodedBuilder(var11);
            CodedOutputStream var13 = var12.getCodedOutput();

            try {
               MapEntryLite.writeTo(var13, var8, var10.getKey(), var10.getValue());
            } catch (IOException var15) {
               throw new RuntimeException(var15);
            }

            var6.addLengthDelimited(var5, var2, var12.build());
            var9.remove();
         }
      }

      return (UB)var5;
   }

   @Override
   public final boolean isInitialized(T var1) {
      int var2 = 1048575;
      int var3 = 0;

      for (int var4 = 0; var4 < this.checkInitializedCount; var4++) {
         int var5 = this.intArray[var4];
         int var6 = this.numberAt(var5);
         int var7 = this.typeAndOffsetAt(var5);
         int var8 = this.buffer[var5 + 2];
         int var9 = var8 & 1048575;
         int var10 = 1 << (var8 >>> 20);
         if (var9 != var2) {
            var2 = var9;
            if (var2 != 1048575) {
               var3 = UNSAFE.getInt(var1, var9);
            }
         }

         if (isRequired(var7) && !this.isFieldPresent((T)var1, var5, var2, var3, var10)) {
            return false;
         }

         switch (type(var7)) {
            case 9:
            case 17:
               if (this.isFieldPresent((T)var1, var5, var2, var3, var10) && !isInitialized(var1, var7, this.getMessageFieldSchema(var5))) {
                  return false;
               }
               break;
            case 27:
            case 49:
               if (!this.isListInitialized(var1, var7, var5)) {
                  return false;
               }
               break;
            case 50:
               if (!this.isMapInitialized((T)var1, var7, var5)) {
                  return false;
               }
               break;
            case 60:
            case 68:
               if (this.isOneofPresent((T)var1, var6, var5) && !isInitialized(var1, var7, this.getMessageFieldSchema(var5))) {
                  return false;
               }
         }
      }

      return !this.hasExtensions || this.extensionSchema.getExtensions(var1).isInitialized();
   }

   private static boolean isInitialized(Object var0, int var1, Schema var2) {
      Object var3 = UnsafeUtil.getObject(var0, offset(var1));
      return var2.isInitialized(var3);
   }

   private <N> boolean isListInitialized(Object var1, int var2, int var3) {
      List var4 = (List)UnsafeUtil.getObject(var1, offset(var2));
      if (var4.isEmpty()) {
         return true;
      }

      Schema var5 = this.getMessageFieldSchema(var3);

      for (int var6 = 0; var6 < var4.size(); var6++) {
         Object var7 = var4.get(var6);
         if (!var5.isInitialized(var7)) {
            return false;
         }
      }

      return true;
   }

   private boolean isMapInitialized(T var1, int var2, int var3) {
      Map var4 = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(var1, offset(var2)));
      if (var4.isEmpty()) {
         return true;
      }

      Object var5 = this.getMapFieldDefaultEntry(var3);
      MapEntryLite.Metadata var6 = this.mapFieldSchema.forMapMetadata(var5);
      if (var6.valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
         return true;
      }

      Schema var7 = null;

      for (Object var9 : var4.values()) {
         if (var7 == null) {
            var7 = Protobuf.getInstance().schemaFor(var9.getClass());
         }

         if (!var7.isInitialized(var9)) {
            return false;
         }
      }

      return true;
   }

   private void writeString(int var1, Object var2, Writer var3) {
      if (var2 instanceof String) {
         var3.writeString(var1, (String)var2);
      } else {
         var3.writeBytes(var1, (ByteString)var2);
      }
   }

   private void readString(Object var1, int var2, Reader var3) {
      if (isEnforceUtf8(var2)) {
         UnsafeUtil.putObject(var1, offset(var2), var3.readStringRequireUtf8());
      } else if (this.lite) {
         UnsafeUtil.putObject(var1, offset(var2), var3.readString());
      } else {
         UnsafeUtil.putObject(var1, offset(var2), var3.readBytes());
      }
   }

   private void readStringList(Object var1, int var2, Reader var3) {
      if (isEnforceUtf8(var2)) {
         var3.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(var1, offset(var2)));
      } else {
         var3.readStringList(this.listFieldSchema.mutableListAt(var1, offset(var2)));
      }
   }

   private <E> void readMessageList(Object var1, int var2, Reader var3, Schema<E> var4, ExtensionRegistryLite var5) {
      long var6 = offset(var2);
      var3.readMessageList(this.listFieldSchema.mutableListAt(var1, var6), var4, var5);
   }

   private <E> void readGroupList(Object var1, long var2, Reader var4, Schema<E> var5, ExtensionRegistryLite var6) {
      var4.readGroupList(this.listFieldSchema.mutableListAt(var1, var2), var5, var6);
   }

   private int numberAt(int var1) {
      return this.buffer[var1];
   }

   private int typeAndOffsetAt(int var1) {
      return this.buffer[var1 + 1];
   }

   private int presenceMaskAndOffsetAt(int var1) {
      return this.buffer[var1 + 2];
   }

   private static int type(int var0) {
      return (var0 & 267386880) >>> 20;
   }

   private static boolean isRequired(int var0) {
      return (var0 & 268435456) != 0;
   }

   private static boolean isEnforceUtf8(int var0) {
      return (var0 & 536870912) != 0;
   }

   private static boolean isLegacyEnumIsClosed(int var0) {
      return (var0 & -2147483648) != 0;
   }

   private static long offset(int var0) {
      return var0 & 1048575;
   }

   private static boolean isMutable(Object var0) {
      if (var0 == null) {
         return false;
      } else {
         return var0 instanceof GeneratedMessageLite ? ((GeneratedMessageLite)var0).isMutable() : true;
      }
   }

   private static void checkMutable(Object var0) {
      if (!isMutable(var0)) {
         throw new IllegalArgumentException("Mutating immutable message: " + var0);
      }
   }

   private static <T> double doubleAt(T var0, long var1) {
      return UnsafeUtil.getDouble(var0, var1);
   }

   private static <T> float floatAt(T var0, long var1) {
      return UnsafeUtil.getFloat(var0, var1);
   }

   private static <T> int intAt(T var0, long var1) {
      return UnsafeUtil.getInt(var0, var1);
   }

   private static <T> long longAt(T var0, long var1) {
      return UnsafeUtil.getLong(var0, var1);
   }

   private static <T> boolean booleanAt(T var0, long var1) {
      return UnsafeUtil.getBoolean(var0, var1);
   }

   private static <T> double oneofDoubleAt(T var0, long var1) {
      return (Double)UnsafeUtil.getObject(var0, var1);
   }

   private static <T> float oneofFloatAt(T var0, long var1) {
      return (Float)UnsafeUtil.getObject(var0, var1);
   }

   private static <T> int oneofIntAt(T var0, long var1) {
      return (Integer)UnsafeUtil.getObject(var0, var1);
   }

   private static <T> long oneofLongAt(T var0, long var1) {
      return (Long)UnsafeUtil.getObject(var0, var1);
   }

   private static <T> boolean oneofBooleanAt(T var0, long var1) {
      return (Boolean)UnsafeUtil.getObject(var0, var1);
   }

   private boolean arePresentForEquals(T var1, T var2, int var3) {
      return this.isFieldPresent((T)var1, var3) == this.isFieldPresent((T)var2, var3);
   }

   private boolean isFieldPresent(T var1, int var2, int var3, int var4, int var5) {
      return var3 == 1048575 ? this.isFieldPresent((T)var1, var2) : (var4 & var5) != 0;
   }

   private boolean isFieldPresent(T var1, int var2) {
      int var3 = this.presenceMaskAndOffsetAt(var2);
      long var4 = var3 & 1048575;
      if (var4 == 1048575L) {
         int var10 = this.typeAndOffsetAt(var2);
         long var7 = offset(var10);
         switch (type(var10)) {
            case 0:
               return Double.doubleToRawLongBits(UnsafeUtil.getDouble(var1, var7)) != 0L;
            case 1:
               return Float.floatToRawIntBits(UnsafeUtil.getFloat(var1, var7)) != 0;
            case 2:
               return UnsafeUtil.getLong(var1, var7) != 0L;
            case 3:
               return UnsafeUtil.getLong(var1, var7) != 0L;
            case 4:
               return UnsafeUtil.getInt(var1, var7) != 0;
            case 5:
               return UnsafeUtil.getLong(var1, var7) != 0L;
            case 6:
               return UnsafeUtil.getInt(var1, var7) != 0;
            case 7:
               return UnsafeUtil.getBoolean(var1, var7);
            case 8:
               Object var9 = UnsafeUtil.getObject(var1, var7);
               if (var9 instanceof String) {
                  return !((String)var9).isEmpty();
               } else {
                  if (var9 instanceof ByteString) {
                     return !ByteString.EMPTY.equals(var9);
                  }

                  throw new IllegalArgumentException();
               }
            case 9:
               return UnsafeUtil.getObject(var1, var7) != null;
            case 10:
               return !ByteString.EMPTY.equals(UnsafeUtil.getObject(var1, var7));
            case 11:
               return UnsafeUtil.getInt(var1, var7) != 0;
            case 12:
               return UnsafeUtil.getInt(var1, var7) != 0;
            case 13:
               return UnsafeUtil.getInt(var1, var7) != 0;
            case 14:
               return UnsafeUtil.getLong(var1, var7) != 0L;
            case 15:
               return UnsafeUtil.getInt(var1, var7) != 0;
            case 16:
               return UnsafeUtil.getLong(var1, var7) != 0L;
            case 17:
               return UnsafeUtil.getObject(var1, var7) != null;
            default:
               throw new IllegalArgumentException();
         }
      } else {
         int var6 = 1 << (var3 >>> 20);
         return (UnsafeUtil.getInt(var1, var3 & 1048575) & var6) != 0;
      }
   }

   private void setFieldPresent(T var1, int var2) {
      int var3 = this.presenceMaskAndOffsetAt(var2);
      long var4 = var3 & 1048575;
      if (var4 != 1048575L) {
         int var6 = 1 << (var3 >>> 20);
         UnsafeUtil.putInt(var1, var4, UnsafeUtil.getInt(var1, var4) | var6);
      }
   }

   private boolean isOneofPresent(T var1, int var2, int var3) {
      int var4 = this.presenceMaskAndOffsetAt(var3);
      return UnsafeUtil.getInt(var1, var4 & 1048575) == var2;
   }

   private boolean isOneofCaseEqual(T var1, T var2, int var3) {
      int var4 = this.presenceMaskAndOffsetAt(var3);
      return UnsafeUtil.getInt(var1, var4 & 1048575) == UnsafeUtil.getInt(var2, var4 & 1048575);
   }

   private void setOneofPresent(T var1, int var2, int var3) {
      int var4 = this.presenceMaskAndOffsetAt(var3);
      UnsafeUtil.putInt(var1, var4 & 1048575, var2);
   }

   private int positionForFieldNumber(int var1) {
      return var1 >= this.minFieldNumber && var1 <= this.maxFieldNumber ? this.slowPositionForFieldNumber(var1, 0) : -1;
   }

   private int positionForFieldNumber(int var1, int var2) {
      return var1 >= this.minFieldNumber && var1 <= this.maxFieldNumber ? this.slowPositionForFieldNumber(var1, var2) : -1;
   }

   private int slowPositionForFieldNumber(int var1, int var2) {
      int var3 = this.buffer.length / 3 - 1;

      while (var2 <= var3) {
         int var4 = var3 + var2 >>> 1;
         int var5 = var4 * 3;
         int var6 = this.numberAt(var5);
         if (var1 == var6) {
            return var5;
         }

         if (var1 < var6) {
            var3 = var4 - 1;
         } else {
            var2 = var4 + 1;
         }
      }

      return -1;
   }

   int getSchemaSize() {
      return this.buffer.length * 3;
   }
}
