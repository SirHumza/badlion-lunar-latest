package org.objectweb.asm;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ClassReader {
   public static final int SKIP_CODE = 1;
   public static final int SKIP_DEBUG = 2;
   public static final int SKIP_FRAMES = 4;
   public static final int EXPAND_FRAMES = 8;
   static final int EXPAND_ASM_INSNS = 256;
   private static final int MAX_BUFFER_SIZE = 1048576;
   private static final int INPUT_STREAM_DATA_CHUNK_SIZE = 4096;
   @Deprecated
   public final byte[] b;
   public final int header;
   final byte[] classFileBuffer;
   private final int[] cpInfoOffsets;
   private final String[] constantUtf8Values;
   private final ConstantDynamic[] constantDynamicValues;
   private final int[] bootstrapMethodOffsets;
   private final int maxStringLength;

   public ClassReader(byte[] var1) {
      this(var1, 0, var1.length);
   }

   public ClassReader(byte[] var1, int var2, int var3) {
      this(var1, var2, true);
   }

   ClassReader(byte[] var1, int var2, boolean var3) {
      this.classFileBuffer = var1;
      this.b = var1;
      if (var3 && this.readShort(var2 + 6) > 71) {
         throw new IllegalArgumentException(stringConcat$0(this.readShort(var2 + 6)));
      }

      int var4 = this.readUnsignedShort(var2 + 8);
      this.cpInfoOffsets = new int[var4];
      this.constantUtf8Values = new String[var4];
      int var5 = 1;
      int var6 = var2 + 10;
      int var7 = 0;
      boolean var8 = false;
      boolean var9 = false;

      while (var5 < var4) {
         this.cpInfoOffsets[var5++] = var6 + 1;
         int var10;
         switch (var1[var6]) {
            case 1:
               var10 = 3 + this.readUnsignedShort(var6 + 1);
               if (var10 > var7) {
                  var7 = var10;
               }
               break;
            case 2:
            case 13:
            case 14:
            default:
               throw new IllegalArgumentException();
            case 3:
            case 4:
            case 9:
            case 10:
            case 11:
            case 12:
               var10 = 5;
               break;
            case 5:
            case 6:
               var10 = 9;
               var5++;
               break;
            case 7:
            case 8:
            case 16:
            case 19:
            case 20:
               var10 = 3;
               break;
            case 15:
               var10 = 4;
               break;
            case 17:
               var10 = 5;
               var8 = true;
               var9 = true;
               break;
            case 18:
               var10 = 5;
               var8 = true;
         }

         var6 += var10;
      }

      this.maxStringLength = var7;
      this.header = var6;
      this.constantDynamicValues = var9 ? new ConstantDynamic[var4] : null;
      this.bootstrapMethodOffsets = var8 ? this.readBootstrapMethodsAttribute(var7) : null;
   }

   public ClassReader(InputStream var1) {
      this(readStream(var1, false));
   }

   public ClassReader(String var1) {
      this(readStream(ClassLoader.getSystemResourceAsStream(stringConcat$1(var1.replace('.', '/'))), true));
   }

   private static byte[] readStream(InputStream var0, boolean var1) {
      if (var0 == null) {
         throw new IOException("Class not found");
      }

      int var2 = computeBufferSize(var0);

      byte[] var15;
      try {
         ByteArrayOutputStream var3 = new ByteArrayOutputStream();

         label119: {
            try {
               byte[] var4 = new byte[var2];

               int var5;
               int var6;
               for (var6 = 0; (var5 = var0.read(var4, 0, var2)) != -1; var6++) {
                  var3.write(var4, 0, var5);
               }

               var3.flush();
               if (var6 == 1) {
                  var15 = var4;
                  break label119;
               }

               var15 = var3.toByteArray();
            } catch (Throwable var13) {
               try {
                  var3.close();
               } catch (Throwable var12) {
               }

               throw var13;
            }

            var3.close();
            return var15;
         }

         var3.close();
      } finally {
         if (var1) {
            var0.close();
         }
      }

      return var15;
   }

   private static int computeBufferSize(InputStream var0) {
      int var1 = var0.available();
      return var1 < 256 ? 4096 : Math.min(var1, 1048576);
   }

   public int getAccess() {
      return this.readUnsignedShort(this.header);
   }

   public String getClassName() {
      return this.readClass(this.header + 2, new char[this.maxStringLength]);
   }

   public String getSuperName() {
      return this.readClass(this.header + 4, new char[this.maxStringLength]);
   }

   public String[] getInterfaces() {
      int var1 = this.header + 6;
      int var2 = this.readUnsignedShort(var1);
      String[] var3 = new String[var2];
      if (var2 > 0) {
         char[] var4 = new char[this.maxStringLength];

         for (int var5 = 0; var5 < var2; var5++) {
            var1 += 2;
            var3[var5] = this.readClass(var1, var4);
         }
      }

      return var3;
   }

   public void accept(ClassVisitor var1, int var2) {
      this.accept(var1, new Attribute[0], var2);
   }

   public void accept(ClassVisitor var1, Attribute[] var2, int var3) {
      Context var4 = new Context();
      var4.attributePrototypes = var2;
      var4.parsingOptions = var3;
      var4.charBuffer = new char[this.maxStringLength];
      char[] var5 = var4.charBuffer;
      int var6 = this.header;
      int var7 = this.readUnsignedShort(var6);
      String var8 = this.readClass(var6 + 2, var5);
      String var9 = this.readClass(var6 + 4, var5);
      String[] var10 = new String[this.readUnsignedShort(var6 + 6)];
      var6 += 8;

      for (int var11 = 0; var11 < var10.length; var11++) {
         var10[var11] = this.readClass(var6, var5);
         var6 += 2;
      }

      int var36 = 0;
      int var12 = 0;
      String var13 = null;
      String var14 = null;
      String var15 = null;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      int var20 = 0;
      int var21 = 0;
      String var22 = null;
      String var23 = null;
      int var24 = 0;
      int var25 = 0;
      int var26 = 0;
      Attribute var27 = null;
      int var28 = this.getFirstAttributeOffset();

      for (int var29 = this.readUnsignedShort(var28 - 2); var29 > 0; var29--) {
         String var30 = this.readUTF8(var28, var5);
         int var31 = this.readInt(var28 + 2);
         var28 += 6;
         if ("SourceFile".equals(var30)) {
            var14 = this.readUTF8(var28, var5);
         } else if ("InnerClasses".equals(var30)) {
            var36 = var28;
         } else if ("EnclosingMethod".equals(var30)) {
            var12 = var28;
         } else if ("NestHost".equals(var30)) {
            var23 = this.readClass(var28, var5);
         } else if ("NestMembers".equals(var30)) {
            var24 = var28;
         } else if ("PermittedSubclasses".equals(var30)) {
            var25 = var28;
         } else if ("Signature".equals(var30)) {
            var13 = this.readUTF8(var28, var5);
         } else if ("RuntimeVisibleAnnotations".equals(var30)) {
            var16 = var28;
         } else if ("RuntimeVisibleTypeAnnotations".equals(var30)) {
            var18 = var28;
         } else if ("Deprecated".equals(var30)) {
            var7 |= 131072;
         } else if ("Synthetic".equals(var30)) {
            var7 |= 4096;
         } else if ("SourceDebugExtension".equals(var30)) {
            if (var31 > this.classFileBuffer.length - var28) {
               throw new IllegalArgumentException();
            }

            var15 = this.readUtf(var28, var31, new char[var31]);
         } else if ("RuntimeInvisibleAnnotations".equals(var30)) {
            var17 = var28;
         } else if ("RuntimeInvisibleTypeAnnotations".equals(var30)) {
            var19 = var28;
         } else if ("Record".equals(var30)) {
            var26 = var28;
            var7 |= 65536;
         } else if ("Module".equals(var30)) {
            var20 = var28;
         } else if ("ModuleMainClass".equals(var30)) {
            var22 = this.readClass(var28, var5);
         } else if ("ModulePackages".equals(var30)) {
            var21 = var28;
         } else if (!"BootstrapMethods".equals(var30)) {
            Attribute var32 = this.readAttribute(var2, var30, var28, var31, var5, -1, null);
            var32.nextAttribute = var27;
            var27 = var32;
         }

         var28 += var31;
      }

      var1.visit(this.readInt(this.cpInfoOffsets[1] - 7), var7, var8, var13, var9, var10);
      if ((var3 & 2) == 0 && (var14 != null || var15 != null)) {
         var1.visitSource(var14, var15);
      }

      if (var20 != 0) {
         this.readModuleAttributes(var1, var4, var20, var21, var22);
      }

      if (var23 != null) {
         var1.visitNestHost(var23);
      }

      if (var12 != 0) {
         String var39 = this.readClass(var12, var5);
         int var50 = this.readUnsignedShort(var12 + 2);
         String var65 = var50 == 0 ? null : this.readUTF8(this.cpInfoOffsets[var50], var5);
         String var70 = var50 == 0 ? null : this.readUTF8(this.cpInfoOffsets[var50] + 2, var5);
         var1.visitOuterClass(var39, var65, var70);
      }

      if (var16 != 0) {
         int var40 = this.readUnsignedShort(var16);
         int var51 = var16 + 2;

         while (var40-- > 0) {
            String var66 = this.readUTF8(var51, var5);
            var51 += 2;
            var51 = this.readElementValues(var1.visitAnnotation(var66, true), var51, true, var5);
         }
      }

      if (var17 != 0) {
         int var41 = this.readUnsignedShort(var17);
         int var53 = var17 + 2;

         while (var41-- > 0) {
            String var67 = this.readUTF8(var53, var5);
            var53 += 2;
            var53 = this.readElementValues(var1.visitAnnotation(var67, false), var53, true, var5);
         }
      }

      if (var18 != 0) {
         int var42 = this.readUnsignedShort(var18);
         int var55 = var18 + 2;

         while (var42-- > 0) {
            var55 = this.readTypeAnnotationTarget(var4, var55);
            String var68 = this.readUTF8(var55, var5);
            var55 += 2;
            var55 = this.readElementValues(
               var1.visitTypeAnnotation(var4.currentTypeAnnotationTarget, var4.currentTypeAnnotationTargetPath, var68, true), var55, true, var5
            );
         }
      }

      if (var19 != 0) {
         int var43 = this.readUnsignedShort(var19);
         int var58 = var19 + 2;

         while (var43-- > 0) {
            var58 = this.readTypeAnnotationTarget(var4, var58);
            String var69 = this.readUTF8(var58, var5);
            var58 += 2;
            var58 = this.readElementValues(
               var1.visitTypeAnnotation(var4.currentTypeAnnotationTarget, var4.currentTypeAnnotationTargetPath, var69, false), var58, true, var5
            );
         }
      }

      while (var27 != null) {
         Attribute var44 = var27.nextAttribute;
         var27.nextAttribute = null;
         var1.visitAttribute(var27);
         var27 = var44;
      }

      if (var24 != 0) {
         int var45 = this.readUnsignedShort(var24);

         for (int var61 = var24 + 2; var45-- > 0; var61 += 2) {
            var1.visitNestMember(this.readClass(var61, var5));
         }
      }

      if (var25 != 0) {
         int var46 = this.readUnsignedShort(var25);

         for (int var62 = var25 + 2; var46-- > 0; var62 += 2) {
            var1.visitPermittedSubclass(this.readClass(var62, var5));
         }
      }

      if (var36 != 0) {
         int var47 = this.readUnsignedShort(var36);

         for (int var63 = var36 + 2; var47-- > 0; var63 += 8) {
            var1.visitInnerClass(
               this.readClass(var63, var5), this.readClass(var63 + 2, var5), this.readUTF8(var63 + 4, var5), this.readUnsignedShort(var63 + 6)
            );
         }
      }

      if (var26 != 0) {
         int var48 = this.readUnsignedShort(var26);
         var26 += 2;

         while (var48-- > 0) {
            var26 = this.readRecordComponent(var1, var4, var26);
         }
      }

      int var49 = this.readUnsignedShort(var6);
      var6 += 2;

      while (var49-- > 0) {
         var6 = this.readField(var1, var4, var6);
      }

      int var64 = this.readUnsignedShort(var6);
      var6 += 2;

      while (var64-- > 0) {
         var6 = this.readMethod(var1, var4, var6);
      }

      var1.visitEnd();
   }

   private void readModuleAttributes(ClassVisitor var1, Context var2, int var3, int var4, String var5) {
      char[] var6 = var2.charBuffer;
      int var7 = var3;
      String var8 = this.readModule(var7, var6);
      int var9 = this.readUnsignedShort(var7 + 2);
      String var10 = this.readUTF8(var7 + 4, var6);
      var7 += 6;
      ModuleVisitor var11 = var1.visitModule(var8, var9, var10);
      if (var11 != null) {
         if (var5 != null) {
            var11.visitMainClass(var5);
         }

         if (var4 != 0) {
            int var12 = this.readUnsignedShort(var4);

            for (int var13 = var4 + 2; var12-- > 0; var13 += 2) {
               var11.visitPackage(this.readPackage(var13, var6));
            }
         }

         int var27 = this.readUnsignedShort(var7);
         var7 += 2;

         while (var27-- > 0) {
            String var28 = this.readModule(var7, var6);
            int var14 = this.readUnsignedShort(var7 + 2);
            String var15 = this.readUTF8(var7 + 4, var6);
            var7 += 6;
            var11.visitRequire(var28, var14, var15);
         }

         int var29 = this.readUnsignedShort(var7);
         var7 += 2;

         while (var29-- > 0) {
            String var30 = this.readPackage(var7, var6);
            int var32 = this.readUnsignedShort(var7 + 2);
            int var16 = this.readUnsignedShort(var7 + 4);
            var7 += 6;
            String[] var17 = null;
            if (var16 != 0) {
               var17 = new String[var16];

               for (int var18 = 0; var18 < var16; var18++) {
                  var17[var18] = this.readModule(var7, var6);
                  var7 += 2;
               }
            }

            var11.visitExport(var30, var32, var17);
         }

         int var31 = this.readUnsignedShort(var7);
         var7 += 2;

         while (var31-- > 0) {
            String var33 = this.readPackage(var7, var6);
            int var35 = this.readUnsignedShort(var7 + 2);
            int var37 = this.readUnsignedShort(var7 + 4);
            var7 += 6;
            String[] var39 = null;
            if (var37 != 0) {
               var39 = new String[var37];

               for (int var19 = 0; var19 < var37; var19++) {
                  var39[var19] = this.readModule(var7, var6);
                  var7 += 2;
               }
            }

            var11.visitOpen(var33, var35, var39);
         }

         int var34 = this.readUnsignedShort(var7);

         for (var7 += 2; var34-- > 0; var7 += 2) {
            var11.visitUse(this.readClass(var7, var6));
         }

         int var36 = this.readUnsignedShort(var7);
         var7 += 2;

         while (var36-- > 0) {
            String var38 = this.readClass(var7, var6);
            int var40 = this.readUnsignedShort(var7 + 2);
            var7 += 4;
            String[] var41 = new String[var40];

            for (int var20 = 0; var20 < var40; var20++) {
               var41[var20] = this.readClass(var7, var6);
               var7 += 2;
            }

            var11.visitProvide(var38, var41);
         }

         var11.visitEnd();
      }
   }

   private int readRecordComponent(ClassVisitor var1, Context var2, int var3) {
      char[] var4 = var2.charBuffer;
      int var5 = var3;
      String var6 = this.readUTF8(var5, var4);
      String var7 = this.readUTF8(var5 + 2, var4);
      var5 += 4;
      String var8 = null;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      Attribute var13 = null;
      int var14 = this.readUnsignedShort(var5);
      var5 += 2;

      while (var14-- > 0) {
         String var15 = this.readUTF8(var5, var4);
         int var16 = this.readInt(var5 + 2);
         var5 += 6;
         if ("Signature".equals(var15)) {
            var8 = this.readUTF8(var5, var4);
         } else if ("RuntimeVisibleAnnotations".equals(var15)) {
            var9 = var5;
         } else if ("RuntimeVisibleTypeAnnotations".equals(var15)) {
            var11 = var5;
         } else if ("RuntimeInvisibleAnnotations".equals(var15)) {
            var10 = var5;
         } else if ("RuntimeInvisibleTypeAnnotations".equals(var15)) {
            var12 = var5;
         } else {
            Attribute var17 = this.readAttribute(var2.attributePrototypes, var15, var5, var16, var4, -1, null);
            var17.nextAttribute = var13;
            var13 = var17;
         }

         var5 += var16;
      }

      RecordComponentVisitor var22 = var1.visitRecordComponent(var6, var7, var8);
      if (var22 == null) {
         return var5;
      }

      if (var9 != 0) {
         int var23 = this.readUnsignedShort(var9);
         int var28 = var9 + 2;

         while (var23-- > 0) {
            String var18 = this.readUTF8(var28, var4);
            var28 += 2;
            var28 = this.readElementValues(var22.visitAnnotation(var18, true), var28, true, var4);
         }
      }

      if (var10 != 0) {
         int var24 = this.readUnsignedShort(var10);
         int var30 = var10 + 2;

         while (var24-- > 0) {
            String var38 = this.readUTF8(var30, var4);
            var30 += 2;
            var30 = this.readElementValues(var22.visitAnnotation(var38, false), var30, true, var4);
         }
      }

      if (var11 != 0) {
         int var25 = this.readUnsignedShort(var11);
         int var32 = var11 + 2;

         while (var25-- > 0) {
            var32 = this.readTypeAnnotationTarget(var2, var32);
            String var39 = this.readUTF8(var32, var4);
            var32 += 2;
            var32 = this.readElementValues(
               var22.visitTypeAnnotation(var2.currentTypeAnnotationTarget, var2.currentTypeAnnotationTargetPath, var39, true), var32, true, var4
            );
         }
      }

      if (var12 != 0) {
         int var26 = this.readUnsignedShort(var12);
         int var35 = var12 + 2;

         while (var26-- > 0) {
            var35 = this.readTypeAnnotationTarget(var2, var35);
            String var40 = this.readUTF8(var35, var4);
            var35 += 2;
            var35 = this.readElementValues(
               var22.visitTypeAnnotation(var2.currentTypeAnnotationTarget, var2.currentTypeAnnotationTargetPath, var40, false), var35, true, var4
            );
         }
      }

      while (var13 != null) {
         Attribute var27 = var13.nextAttribute;
         var13.nextAttribute = null;
         var22.visitAttribute(var13);
         var13 = var27;
      }

      var22.visitEnd();
      return var5;
   }

   private int readField(ClassVisitor var1, Context var2, int var3) {
      char[] var4 = var2.charBuffer;
      int var5 = var3;
      int var6 = this.readUnsignedShort(var5);
      String var7 = this.readUTF8(var5 + 2, var4);
      String var8 = this.readUTF8(var5 + 4, var4);
      var5 += 6;
      Object var9 = null;
      String var10 = null;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      Attribute var15 = null;
      int var16 = this.readUnsignedShort(var5);
      var5 += 2;

      while (var16-- > 0) {
         String var17 = this.readUTF8(var5, var4);
         int var18 = this.readInt(var5 + 2);
         var5 += 6;
         if ("ConstantValue".equals(var17)) {
            int var19 = this.readUnsignedShort(var5);
            var9 = var19 == 0 ? null : this.readConst(var19, var4);
         } else if ("Signature".equals(var17)) {
            var10 = this.readUTF8(var5, var4);
         } else if ("Deprecated".equals(var17)) {
            var6 |= 131072;
         } else if ("Synthetic".equals(var17)) {
            var6 |= 4096;
         } else if ("RuntimeVisibleAnnotations".equals(var17)) {
            var11 = var5;
         } else if ("RuntimeVisibleTypeAnnotations".equals(var17)) {
            var13 = var5;
         } else if ("RuntimeInvisibleAnnotations".equals(var17)) {
            var12 = var5;
         } else if ("RuntimeInvisibleTypeAnnotations".equals(var17)) {
            var14 = var5;
         } else {
            Attribute var30 = this.readAttribute(var2.attributePrototypes, var17, var5, var18, var4, -1, null);
            var30.nextAttribute = var15;
            var15 = var30;
         }

         var5 += var18;
      }

      FieldVisitor var24 = var1.visitField(var6, var7, var8, var10, var9);
      if (var24 == null) {
         return var5;
      }

      if (var11 != 0) {
         int var25 = this.readUnsignedShort(var11);
         int var31 = var11 + 2;

         while (var25-- > 0) {
            String var20 = this.readUTF8(var31, var4);
            var31 += 2;
            var31 = this.readElementValues(var24.visitAnnotation(var20, true), var31, true, var4);
         }
      }

      if (var12 != 0) {
         int var26 = this.readUnsignedShort(var12);
         int var33 = var12 + 2;

         while (var26-- > 0) {
            String var41 = this.readUTF8(var33, var4);
            var33 += 2;
            var33 = this.readElementValues(var24.visitAnnotation(var41, false), var33, true, var4);
         }
      }

      if (var13 != 0) {
         int var27 = this.readUnsignedShort(var13);
         int var35 = var13 + 2;

         while (var27-- > 0) {
            var35 = this.readTypeAnnotationTarget(var2, var35);
            String var42 = this.readUTF8(var35, var4);
            var35 += 2;
            var35 = this.readElementValues(
               var24.visitTypeAnnotation(var2.currentTypeAnnotationTarget, var2.currentTypeAnnotationTargetPath, var42, true), var35, true, var4
            );
         }
      }

      if (var14 != 0) {
         int var28 = this.readUnsignedShort(var14);
         int var38 = var14 + 2;

         while (var28-- > 0) {
            var38 = this.readTypeAnnotationTarget(var2, var38);
            String var43 = this.readUTF8(var38, var4);
            var38 += 2;
            var38 = this.readElementValues(
               var24.visitTypeAnnotation(var2.currentTypeAnnotationTarget, var2.currentTypeAnnotationTargetPath, var43, false), var38, true, var4
            );
         }
      }

      while (var15 != null) {
         Attribute var29 = var15.nextAttribute;
         var15.nextAttribute = null;
         var24.visitAttribute(var15);
         var15 = var29;
      }

      var24.visitEnd();
      return var5;
   }

   private int readMethod(ClassVisitor var1, Context var2, int var3) {
      char[] var4 = var2.charBuffer;
      int var5 = var3;
      var2.currentMethodAccessFlags = this.readUnsignedShort(var5);
      var2.currentMethodName = this.readUTF8(var5 + 2, var4);
      var2.currentMethodDescriptor = this.readUTF8(var5 + 4, var4);
      var5 += 6;
      int var6 = 0;
      int var7 = 0;
      String[] var8 = null;
      boolean var9 = false;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      Attribute var19 = null;
      int var20 = this.readUnsignedShort(var5);
      var5 += 2;

      while (var20-- > 0) {
         String var21 = this.readUTF8(var5, var4);
         int var22 = this.readInt(var5 + 2);
         var5 += 6;
         if ("Code".equals(var21)) {
            if ((var2.parsingOptions & 1) == 0) {
               var6 = var5;
            }
         } else if ("Exceptions".equals(var21)) {
            var7 = var5;
            var8 = new String[this.readUnsignedShort(var7)];
            int var37 = var7 + 2;

            for (int var24 = 0; var24 < var8.length; var24++) {
               var8[var24] = this.readClass(var37, var4);
               var37 += 2;
            }
         } else if ("Signature".equals(var21)) {
            var10 = this.readUnsignedShort(var5);
         } else if ("Deprecated".equals(var21)) {
            var2.currentMethodAccessFlags |= 131072;
         } else if ("RuntimeVisibleAnnotations".equals(var21)) {
            var11 = var5;
         } else if ("RuntimeVisibleTypeAnnotations".equals(var21)) {
            var15 = var5;
         } else if ("AnnotationDefault".equals(var21)) {
            var17 = var5;
         } else if ("Synthetic".equals(var21)) {
            var9 = true;
            var2.currentMethodAccessFlags |= 4096;
         } else if ("RuntimeInvisibleAnnotations".equals(var21)) {
            var12 = var5;
         } else if ("RuntimeInvisibleTypeAnnotations".equals(var21)) {
            var16 = var5;
         } else if ("RuntimeVisibleParameterAnnotations".equals(var21)) {
            var13 = var5;
         } else if ("RuntimeInvisibleParameterAnnotations".equals(var21)) {
            var14 = var5;
         } else if ("MethodParameters".equals(var21)) {
            var18 = var5;
         } else {
            Attribute var23 = this.readAttribute(var2.attributePrototypes, var21, var5, var22, var4, -1, null);
            var23.nextAttribute = var19;
            var19 = var23;
         }

         var5 += var22;
      }

      MethodVisitor var28 = var1.visitMethod(
         var2.currentMethodAccessFlags, var2.currentMethodName, var2.currentMethodDescriptor, var10 == 0 ? null : this.readUtf(var10, var4), var8
      );
      if (var28 == null) {
         return var5;
      }

      if (var28 instanceof MethodWriter) {
         MethodWriter var29 = (MethodWriter)var28;
         if (var29.canCopyMethodAttributes(this, var9, (var2.currentMethodAccessFlags & 131072) != 0, this.readUnsignedShort(var3 + 4), var10, var7)) {
            var29.setMethodAttributesSource(var3, var5 - var3);
            return var5;
         }
      }

      if (var18 != 0 && (var2.parsingOptions & 2) == 0) {
         int var30 = this.readByte(var18);

         for (int var38 = var18 + 1; var30-- > 0; var38 += 4) {
            var28.visitParameter(this.readUTF8(var38, var4), this.readUnsignedShort(var38 + 2));
         }
      }

      if (var17 != 0) {
         AnnotationVisitor var31 = var28.visitAnnotationDefault();
         this.readElementValue(var31, var17, null, var4);
         if (var31 != null) {
            var31.visitEnd();
         }
      }

      if (var11 != 0) {
         int var32 = this.readUnsignedShort(var11);
         int var39 = var11 + 2;

         while (var32-- > 0) {
            String var49 = this.readUTF8(var39, var4);
            var39 += 2;
            var39 = this.readElementValues(var28.visitAnnotation(var49, true), var39, true, var4);
         }
      }

      if (var12 != 0) {
         int var33 = this.readUnsignedShort(var12);
         int var41 = var12 + 2;

         while (var33-- > 0) {
            String var50 = this.readUTF8(var41, var4);
            var41 += 2;
            var41 = this.readElementValues(var28.visitAnnotation(var50, false), var41, true, var4);
         }
      }

      if (var15 != 0) {
         int var34 = this.readUnsignedShort(var15);
         int var43 = var15 + 2;

         while (var34-- > 0) {
            var43 = this.readTypeAnnotationTarget(var2, var43);
            String var51 = this.readUTF8(var43, var4);
            var43 += 2;
            var43 = this.readElementValues(
               var28.visitTypeAnnotation(var2.currentTypeAnnotationTarget, var2.currentTypeAnnotationTargetPath, var51, true), var43, true, var4
            );
         }
      }

      if (var16 != 0) {
         int var35 = this.readUnsignedShort(var16);
         int var46 = var16 + 2;

         while (var35-- > 0) {
            var46 = this.readTypeAnnotationTarget(var2, var46);
            String var52 = this.readUTF8(var46, var4);
            var46 += 2;
            var46 = this.readElementValues(
               var28.visitTypeAnnotation(var2.currentTypeAnnotationTarget, var2.currentTypeAnnotationTargetPath, var52, false), var46, true, var4
            );
         }
      }

      if (var13 != 0) {
         this.readParameterAnnotations(var28, var2, var13, true);
      }

      if (var14 != 0) {
         this.readParameterAnnotations(var28, var2, var14, false);
      }

      while (var19 != null) {
         Attribute var36 = var19.nextAttribute;
         var19.nextAttribute = null;
         var28.visitAttribute(var19);
         var19 = var36;
      }

      if (var6 != 0) {
         var28.visitCode();
         this.readCode(var28, var2, var6);
      }

      var28.visitEnd();
      return var5;
   }

   private void readCode(MethodVisitor var1, Context var2, int var3) {
      int var4 = var3;
      byte[] var5 = this.classFileBuffer;
      char[] var6 = var2.charBuffer;
      int var7 = this.readUnsignedShort(var4);
      int var8 = this.readUnsignedShort(var4 + 2);
      int var9 = this.readInt(var4 + 4);
      var4 += 8;
      if (var9 > this.classFileBuffer.length - var4) {
         throw new IllegalArgumentException();
      }

      int var10 = var4;
      int var11 = var4 + var9;
      Label[] var12 = var2.currentMethodLabels = new Label[var9 + 1];

      while (var4 < var11) {
         int var13 = var4 - var10;
         int var14 = var5[var4] & 255;
         switch (var14) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
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
            case 50:
            case 51:
            case 52:
            case 53:
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
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 190:
            case 191:
            case 194:
            case 195:
               var4++;
               break;
            case 16:
            case 18:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 169:
            case 188:
               var4 += 2;
               break;
            case 17:
            case 19:
            case 20:
            case 132:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 187:
            case 189:
            case 192:
            case 193:
               var4 += 3;
               break;
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 198:
            case 199:
               this.createLabel(var13 + this.readShort(var4 + 1), var12);
               var4 += 3;
               break;
            case 170:
               var4 += 4 - (var13 & 3);
               this.createLabel(var13 + this.readInt(var4), var12);
               int var15 = this.readInt(var4 + 8) - this.readInt(var4 + 4) + 1;

               for (var4 += 12; var15-- > 0; var4 += 4) {
                  this.createLabel(var13 + this.readInt(var4), var12);
               }
               break;
            case 171:
               var4 += 4 - (var13 & 3);
               this.createLabel(var13 + this.readInt(var4), var12);
               int var16 = this.readInt(var4 + 4);

               for (var4 += 8; var16-- > 0; var4 += 8) {
                  this.createLabel(var13 + this.readInt(var4 + 4), var12);
               }
               break;
            case 185:
            case 186:
               var4 += 5;
               break;
            case 196:
               switch (var5[var4 + 1] & 0xFF) {
                  case 21:
                  case 22:
                  case 23:
                  case 24:
                  case 25:
                  case 54:
                  case 55:
                  case 56:
                  case 57:
                  case 58:
                  case 169:
                     var4 += 4;
                     continue;
                  case 132:
                     var4 += 6;
                     continue;
                  default:
                     throw new IllegalArgumentException();
               }
            case 197:
               var4 += 4;
               break;
            case 200:
            case 201:
            case 220:
               this.createLabel(var13 + this.readInt(var4 + 1), var12);
               var4 += 5;
               break;
            case 202:
            case 203:
            case 204:
            case 205:
            case 206:
            case 207:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case 217:
            case 218:
            case 219:
               this.createLabel(var13 + this.readUnsignedShort(var4 + 1), var12);
               var4 += 3;
               break;
            default:
               throw new IllegalArgumentException();
         }
      }

      int var56 = this.readUnsignedShort(var4);
      var4 += 2;

      while (var56-- > 0) {
         Label var57 = this.createLabel(this.readUnsignedShort(var4), var12);
         Label var59 = this.createLabel(this.readUnsignedShort(var4 + 2), var12);
         Label var61 = this.createLabel(this.readUnsignedShort(var4 + 4), var12);
         String var17 = this.readUTF8(this.cpInfoOffsets[this.readUnsignedShort(var4 + 6)], var6);
         var4 += 8;
         var1.visitTryCatchBlock(var57, var59, var61, var17);
      }

      int var58 = 0;
      int var60 = 0;
      boolean var62 = true;
      int var63 = 0;
      int var18 = 0;
      int[] var19 = null;
      int[] var20 = null;
      Attribute var21 = null;
      int var22 = this.readUnsignedShort(var4);
      var4 += 2;

      while (var22-- > 0) {
         String var23 = this.readUTF8(var4, var6);
         int var24 = this.readInt(var4 + 2);
         var4 += 6;
         if ("LocalVariableTable".equals(var23)) {
            if ((var2.parsingOptions & 2) == 0) {
               var63 = var4;
               int var69 = var4;
               int var73 = this.readUnsignedShort(var69);

               for (int var70 = var69 + 2; var73-- > 0; var70 += 10) {
                  int var75 = this.readUnsignedShort(var70);
                  this.createDebugLabel(var75, var12);
                  int var77 = this.readUnsignedShort(var70 + 2);
                  this.createDebugLabel(var75 + var77, var12);
               }
            }
         } else if ("LocalVariableTypeTable".equals(var23)) {
            var18 = var4;
         } else if ("LineNumberTable".equals(var23)) {
            if ((var2.parsingOptions & 2) == 0) {
               int var67 = var4;
               int var26 = this.readUnsignedShort(var67);
               var67 += 2;

               while (var26-- > 0) {
                  int var27 = this.readUnsignedShort(var67);
                  int var28 = this.readUnsignedShort(var67 + 2);
                  var67 += 4;
                  this.createDebugLabel(var27, var12);
                  var12[var27].addLineNumber(var28);
               }
            }
         } else if ("RuntimeVisibleTypeAnnotations".equals(var23)) {
            var19 = this.readTypeAnnotations(var1, var2, var4, true);
         } else if ("RuntimeInvisibleTypeAnnotations".equals(var23)) {
            var20 = this.readTypeAnnotations(var1, var2, var4, false);
         } else if ("StackMapTable".equals(var23)) {
            if ((var2.parsingOptions & 4) == 0) {
               var58 = var4 + 2;
               var60 = var4 + var24;
            }
         } else if ("StackMap".equals(var23)) {
            if ((var2.parsingOptions & 4) == 0) {
               var58 = var4 + 2;
               var60 = var4 + var24;
               var62 = false;
            }
         } else {
            Attribute var25 = this.readAttribute(var2.attributePrototypes, var23, var4, var24, var6, var3, var12);
            var25.nextAttribute = var21;
            var21 = var25;
         }

         var4 += var24;
      }

      boolean var64 = (var2.parsingOptions & 8) != 0;
      if (var58 != 0) {
         var2.currentFrameOffset = -1;
         var2.currentFrameType = 0;
         var2.currentFrameLocalCount = 0;
         var2.currentFrameLocalCountDelta = 0;
         var2.currentFrameLocalTypes = new Object[var8];
         var2.currentFrameStackCount = 0;
         var2.currentFrameStackTypes = new Object[var7];
         if (var64) {
            this.computeImplicitFrame(var2);
         }

         for (int var65 = var58; var65 < var60 - 2; var65++) {
            if (var5[var65] == 8) {
               int var71 = this.readUnsignedShort(var65 + 1);
               if (var71 >= 0 && var71 < var9 && (var5[var10 + var71] & 255) == 187) {
                  this.createLabel(var71, var12);
               }
            }
         }
      }

      if (var64 && (var2.parsingOptions & 256) != 0) {
         var1.visitFrame(-1, var8, null, 0, null);
      }

      int var66 = 0;
      int var72 = this.getTypeAnnotationBytecodeOffset(var19, 0);
      int var74 = 0;
      int var76 = this.getTypeAnnotationBytecodeOffset(var20, 0);
      boolean var78 = false;
      int var29 = (var2.parsingOptions & 256) == 0 ? 33 : 0;
      var4 = var10;

      while (var4 < var11) {
         int var30 = var4 - var10;
         this.readBytecodeInstructionOffset(var30);
         Label var31 = var12[var30];
         if (var31 != null) {
            var31.accept(var1, (var2.parsingOptions & 2) == 0);
         }

         while (var58 != 0 && (var2.currentFrameOffset == var30 || var2.currentFrameOffset == -1)) {
            if (var2.currentFrameOffset != -1) {
               if (var62 && !var64) {
                  var1.visitFrame(
                     var2.currentFrameType,
                     var2.currentFrameLocalCountDelta,
                     var2.currentFrameLocalTypes,
                     var2.currentFrameStackCount,
                     var2.currentFrameStackTypes
                  );
               } else {
                  var1.visitFrame(-1, var2.currentFrameLocalCount, var2.currentFrameLocalTypes, var2.currentFrameStackCount, var2.currentFrameStackTypes);
               }

               var78 = false;
            }

            if (var58 < var60) {
               var58 = this.readStackMapFrame(var58, var62, var64, var2);
            } else {
               var58 = 0;
            }
         }

         if (var78) {
            if ((var2.parsingOptions & 8) != 0) {
               var1.visitFrame(256, 0, null, 0, null);
            }

            var78 = false;
         }

         int var32 = var5[var4] & 255;
         switch (var32) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 190:
            case 191:
            case 194:
            case 195:
               var1.visitInsn(var32);
               var4++;
               break;
            case 16:
            case 188:
               var1.visitIntInsn(var32, var5[var4 + 1]);
               var4 += 2;
               break;
            case 17:
               var1.visitIntInsn(var32, this.readShort(var4 + 1));
               var4 += 3;
               break;
            case 18:
               var1.visitLdcInsn(this.readConst(var5[var4 + 1] & 255, var6));
               var4 += 2;
               break;
            case 19:
            case 20:
               var1.visitLdcInsn(this.readConst(this.readUnsignedShort(var4 + 1), var6));
               var4 += 3;
               break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 169:
               var1.visitVarInsn(var32, var5[var4 + 1] & 255);
               var4 += 2;
               break;
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
               var32 -= 26;
               var1.visitVarInsn(21 + (var32 >> 2), var32 & 3);
               var4++;
               break;
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
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
               var32 -= 59;
               var1.visitVarInsn(54 + (var32 >> 2), var32 & 3);
               var4++;
               break;
            case 132:
               var1.visitIincInsn(var5[var4 + 1] & 255, var5[var4 + 2]);
               var4 += 3;
               break;
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 198:
            case 199:
               var1.visitJumpInsn(var32, var12[var30 + this.readShort(var4 + 1)]);
               var4 += 3;
               break;
            case 170:
               var4 += 4 - (var30 & 3);
               Label var100 = var12[var30 + this.readInt(var4)];
               int var111 = this.readInt(var4 + 4);
               int var119 = this.readInt(var4 + 8);
               var4 += 12;
               Label[] var125 = new Label[var119 - var111 + 1];

               for (int var130 = 0; var130 < var125.length; var130++) {
                  var125[var130] = var12[var30 + this.readInt(var4)];
                  var4 += 4;
               }

               var1.visitTableSwitchInsn(var111, var119, var100, var125);
               break;
            case 171:
               var4 += 4 - (var30 & 3);
               Label var99 = var12[var30 + this.readInt(var4)];
               int var110 = this.readInt(var4 + 4);
               var4 += 8;
               int[] var118 = new int[var110];
               Label[] var124 = new Label[var110];

               for (int var129 = 0; var129 < var110; var129++) {
                  var118[var129] = this.readInt(var4);
                  var124[var129] = var12[var30 + this.readInt(var4 + 4)];
                  var4 += 8;
               }

               var1.visitLookupSwitchInsn(var99, var118, var124);
               break;
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
               int var98 = this.cpInfoOffsets[this.readUnsignedShort(var4 + 1)];
               int var109 = this.cpInfoOffsets[this.readUnsignedShort(var98 + 2)];
               String var117 = this.readClass(var98, var6);
               String var123 = this.readUTF8(var109, var6);
               String var128 = this.readUTF8(var109 + 2, var6);
               if (var32 < 182) {
                  var1.visitFieldInsn(var32, var117, var123, var128);
               } else {
                  boolean var132 = var5[var98 - 1] == 11;
                  var1.visitMethodInsn(var32, var117, var123, var128, var132);
               }

               if (var32 == 185) {
                  var4 += 5;
               } else {
                  var4 += 3;
               }
               break;
            case 186:
               int var97 = this.cpInfoOffsets[this.readUnsignedShort(var4 + 1)];
               int var108 = this.cpInfoOffsets[this.readUnsignedShort(var97 + 2)];
               String var35 = this.readUTF8(var108, var6);
               String var36 = this.readUTF8(var108 + 2, var6);
               int var37 = this.bootstrapMethodOffsets[this.readUnsignedShort(var97)];
               Handle var38 = (Handle)this.readConst(this.readUnsignedShort(var37), var6);
               Object[] var39 = new Object[this.readUnsignedShort(var37 + 2)];
               var37 += 4;

               for (int var40 = 0; var40 < var39.length; var40++) {
                  var39[var40] = this.readConst(this.readUnsignedShort(var37), var6);
                  var37 += 2;
               }

               var1.visitInvokeDynamicInsn(var35, var36, var38, var39);
               var4 += 5;
               break;
            case 187:
            case 189:
            case 192:
            case 193:
               var1.visitTypeInsn(var32, this.readClass(var4 + 1, var6));
               var4 += 3;
               break;
            case 196:
               var32 = var5[var4 + 1] & 255;
               if (var32 == 132) {
                  var1.visitIincInsn(this.readUnsignedShort(var4 + 2), this.readShort(var4 + 4));
                  var4 += 6;
               } else {
                  var1.visitVarInsn(var32, this.readUnsignedShort(var4 + 2));
                  var4 += 4;
               }
               break;
            case 197:
               var1.visitMultiANewArrayInsn(this.readClass(var4 + 1, var6), var5[var4 + 3] & 255);
               var4 += 4;
               break;
            case 200:
            case 201:
               var1.visitJumpInsn(var32 - var29, var12[var30 + this.readInt(var4 + 1)]);
               var4 += 5;
               break;
            case 202:
            case 203:
            case 204:
            case 205:
            case 206:
            case 207:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case 217:
            case 218:
            case 219:
               var32 = var32 < 218 ? var32 - 49 : var32 - 20;
               Label var33 = var12[var30 + this.readUnsignedShort(var4 + 1)];
               if (var32 != 167 && var32 != 168) {
                  var32 = var32 < 167 ? (var32 + 1 ^ 1) - 1 : var32 ^ 1;
                  Label var34 = this.createLabel(var30 + 3, var12);
                  var1.visitJumpInsn(var32, var34);
                  var1.visitJumpInsn(200, var33);
                  var78 = true;
               } else {
                  var1.visitJumpInsn(var32 + 33, var33);
               }

               var4 += 3;
               break;
            case 220:
               var1.visitJumpInsn(200, var12[var30 + this.readInt(var4 + 1)]);
               var78 = true;
               var4 += 5;
               break;
            default:
               throw new AssertionError();
         }

         for (; var19 != null && var66 < var19.length && var72 <= var30; var72 = this.getTypeAnnotationBytecodeOffset(var19, ++var66)) {
            if (var72 == var30) {
               int var101 = this.readTypeAnnotationTarget(var2, var19[var66]);
               String var112 = this.readUTF8(var101, var6);
               var101 += 2;
               this.readElementValues(
                  var1.visitInsnAnnotation(var2.currentTypeAnnotationTarget, var2.currentTypeAnnotationTargetPath, var112, true), var101, true, var6
               );
            }
         }

         for (; var20 != null && var74 < var20.length && var76 <= var30; var76 = this.getTypeAnnotationBytecodeOffset(var20, ++var74)) {
            if (var76 == var30) {
               int var103 = this.readTypeAnnotationTarget(var2, var20[var74]);
               String var113 = this.readUTF8(var103, var6);
               var103 += 2;
               this.readElementValues(
                  var1.visitInsnAnnotation(var2.currentTypeAnnotationTarget, var2.currentTypeAnnotationTargetPath, var113, false), var103, true, var6
               );
            }
         }
      }

      if (var12[var9] != null) {
         var1.visitLabel(var12[var9]);
      }

      if (var63 != 0 && (var2.parsingOptions & 2) == 0) {
         int[] var79 = null;
         if (var18 != 0) {
            var79 = new int[this.readUnsignedShort(var18) * 3];
            var4 = var18 + 2;

            for (int var83 = var79.length; var83 > 0; var4 += 10) {
               var79[--var83] = var4 + 6;
               var79[--var83] = this.readUnsignedShort(var4 + 8);
               var79[--var83] = this.readUnsignedShort(var4);
            }
         }

         int var86 = this.readUnsignedShort(var63);
         var4 = var63 + 2;

         while (var86-- > 0) {
            int var94 = this.readUnsignedShort(var4);
            int var105 = this.readUnsignedShort(var4 + 2);
            String var114 = this.readUTF8(var4 + 4, var6);
            String var120 = this.readUTF8(var4 + 6, var6);
            int var126 = this.readUnsignedShort(var4 + 8);
            var4 += 10;
            String var131 = null;
            if (var79 != null) {
               for (byte var133 = 0; var133 < var79.length; var133 += 3) {
                  if (var79[var133] == var94 && var79[var133 + 1] == var126) {
                     var131 = this.readUTF8(var79[var133 + 2], var6);
                     break;
                  }
               }
            }

            var1.visitLocalVariable(var114, var120, var131, var12[var94], var12[var94 + var105], var126);
         }
      }

      if (var19 != null) {
         for (int var106 : var19) {
            int var115 = this.readByte(var106);
            if (var115 == 64 || var115 == 65) {
               var4 = this.readTypeAnnotationTarget(var2, var106);
               String var121 = this.readUTF8(var4, var6);
               var4 += 2;
               this.readElementValues(
                  var1.visitLocalVariableAnnotation(
                     var2.currentTypeAnnotationTarget,
                     var2.currentTypeAnnotationTargetPath,
                     var2.currentLocalVariableAnnotationRangeStarts,
                     var2.currentLocalVariableAnnotationRangeEnds,
                     var2.currentLocalVariableAnnotationRangeIndices,
                     var121,
                     true
                  ),
                  var4,
                  true,
                  var6
               );
            }
         }
      }

      if (var20 != null) {
         for (int var107 : var20) {
            int var116 = this.readByte(var107);
            if (var116 == 64 || var116 == 65) {
               var4 = this.readTypeAnnotationTarget(var2, var107);
               String var122 = this.readUTF8(var4, var6);
               var4 += 2;
               this.readElementValues(
                  var1.visitLocalVariableAnnotation(
                     var2.currentTypeAnnotationTarget,
                     var2.currentTypeAnnotationTargetPath,
                     var2.currentLocalVariableAnnotationRangeStarts,
                     var2.currentLocalVariableAnnotationRangeEnds,
                     var2.currentLocalVariableAnnotationRangeIndices,
                     var122,
                     false
                  ),
                  var4,
                  true,
                  var6
               );
            }
         }
      }

      while (var21 != null) {
         Attribute var82 = var21.nextAttribute;
         var21.nextAttribute = null;
         var1.visitAttribute(var21);
         var21 = var82;
      }

      var1.visitMaxs(var7, var8);
   }

   protected void readBytecodeInstructionOffset(int var1) {
   }

   protected Label readLabel(int var1, Label[] var2) {
      if (var2[var1] == null) {
         var2[var1] = new Label();
      }

      return var2[var1];
   }

   private Label createLabel(int var1, Label[] var2) {
      Label var3 = this.readLabel(var1, var2);
      var3.flags = (short)(var3.flags & -2);
      return var3;
   }

   private void createDebugLabel(int var1, Label[] var2) {
      if (var2[var1] == null) {
         Label var10000 = this.readLabel(var1, var2);
         var10000.flags = (short)(var10000.flags | 1);
      }
   }

   private int[] readTypeAnnotations(MethodVisitor var1, Context var2, int var3, boolean var4) {
      char[] var5 = var2.charBuffer;
      int var6 = var3;
      int[] var7 = new int[this.readUnsignedShort(var6)];
      var6 += 2;

      for (int var8 = 0; var8 < var7.length; var8++) {
         var7[var8] = var6;
         int var9 = this.readInt(var6);
         switch (var9 >>> 24) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            case 20:
            case 21:
            case 22:
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
            case 50:
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
            default:
               throw new IllegalArgumentException();
            case 16:
            case 17:
            case 18:
            case 23:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
               var6 += 3;
               break;
            case 64:
            case 65:
               int var10 = this.readUnsignedShort(var6 + 1);
               var6 += 3;

               while (var10-- > 0) {
                  int var11 = this.readUnsignedShort(var6);
                  int var12 = this.readUnsignedShort(var6 + 2);
                  var6 += 6;
                  this.createLabel(var11, var2.currentMethodLabels);
                  this.createLabel(var11 + var12, var2.currentMethodLabels);
               }
               break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
               var6 += 4;
         }

         int var18 = this.readByte(var6);
         if (var9 >>> 24 == 66) {
            TypePath var19 = var18 == 0 ? null : new TypePath(this.classFileBuffer, var6);
            var6 += 1 + 2 * var18;
            String var20 = this.readUTF8(var6, var5);
            var6 += 2;
            var6 = this.readElementValues(var1.visitTryCatchAnnotation(var9 & -256, var19, var20, var4), var6, true, var5);
         } else {
            var6 += 3 + 2 * var18;
            var6 = this.readElementValues(null, var6, true, var5);
         }
      }

      return var7;
   }

   private int getTypeAnnotationBytecodeOffset(int[] var1, int var2) {
      return var1 != null && var2 < var1.length && this.readByte(var1[var2]) >= 67 ? this.readUnsignedShort(var1[var2] + 1) : -1;
   }

   private int readTypeAnnotationTarget(Context var1, int var2) {
      int var3 = var2;
      int var4 = this.readInt(var2);
      switch (var4 >>> 24) {
         case 0:
         case 1:
         case 22:
            var4 &= -65536;
            var3 += 2;
            break;
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
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
         case 50:
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
         default:
            throw new IllegalArgumentException();
         case 16:
         case 17:
         case 18:
         case 23:
         case 66:
            var4 &= -256;
            var3 += 3;
            break;
         case 19:
         case 20:
         case 21:
            var4 &= -16777216;
            var3++;
            break;
         case 64:
         case 65:
            var4 &= -16777216;
            int var5 = this.readUnsignedShort(var3 + 1);
            var3 += 3;
            var1.currentLocalVariableAnnotationRangeStarts = new Label[var5];
            var1.currentLocalVariableAnnotationRangeEnds = new Label[var5];
            var1.currentLocalVariableAnnotationRangeIndices = new int[var5];

            for (int var6 = 0; var6 < var5; var6++) {
               int var7 = this.readUnsignedShort(var3);
               int var8 = this.readUnsignedShort(var3 + 2);
               int var9 = this.readUnsignedShort(var3 + 4);
               var3 += 6;
               var1.currentLocalVariableAnnotationRangeStarts[var6] = this.createLabel(var7, var1.currentMethodLabels);
               var1.currentLocalVariableAnnotationRangeEnds[var6] = this.createLabel(var7 + var8, var1.currentMethodLabels);
               var1.currentLocalVariableAnnotationRangeIndices[var6] = var9;
            }
            break;
         case 67:
         case 68:
         case 69:
         case 70:
            var4 &= -16777216;
            var3 += 3;
            break;
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
            var4 &= -16776961;
            var3 += 4;
      }

      var1.currentTypeAnnotationTarget = var4;
      int var12 = this.readByte(var3);
      var1.currentTypeAnnotationTargetPath = var12 == 0 ? null : new TypePath(this.classFileBuffer, var3);
      return var3 + 1 + 2 * var12;
   }

   private void readParameterAnnotations(MethodVisitor var1, Context var2, int var3, boolean var4) {
      int var5 = var3;
      int var6 = this.classFileBuffer[var5++] & 255;
      var1.visitAnnotableParameterCount(var6, var4);
      char[] var7 = var2.charBuffer;

      for (int var8 = 0; var8 < var6; var8++) {
         int var9 = this.readUnsignedShort(var5);
         var5 += 2;

         while (var9-- > 0) {
            String var10 = this.readUTF8(var5, var7);
            var5 += 2;
            var5 = this.readElementValues(var1.visitParameterAnnotation(var8, var10, var4), var5, true, var7);
         }
      }
   }

   private int readElementValues(AnnotationVisitor var1, int var2, boolean var3, char[] var4) {
      int var5 = var2;
      int var6 = this.readUnsignedShort(var5);
      var5 += 2;
      if (var3) {
         while (var6-- > 0) {
            String var7 = this.readUTF8(var5, var4);
            var5 = this.readElementValue(var1, var5 + 2, var7, var4);
         }
      } else {
         while (var6-- > 0) {
            var5 = this.readElementValue(var1, var5, null, var4);
         }
      }

      if (var1 != null) {
         var1.visitEnd();
      }

      return var5;
   }

   private int readElementValue(AnnotationVisitor var1, int var2, String var3, char[] var4) {
      int var5 = var2;
      if (var1 == null) {
         switch (this.classFileBuffer[var5] & 0xFF) {
            case 64:
               return this.readElementValues(null, var5 + 3, true, var4);
            case 91:
               return this.readElementValues(null, var5 + 1, false, var4);
            case 101:
               return var5 + 5;
            default:
               return var5 + 3;
         }
      } else {
         switch (this.classFileBuffer[var5++] & 0xFF) {
            case 64:
               var5 = this.readElementValues(var1.visitAnnotation(var3, this.readUTF8(var5, var4)), var5 + 2, true, var4);
               break;
            case 65:
            case 69:
            case 71:
            case 72:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 100:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            default:
               throw new IllegalArgumentException();
            case 66:
               var1.visit(var3, (byte)this.readInt(this.cpInfoOffsets[this.readUnsignedShort(var5)]));
               var5 += 2;
               break;
            case 67:
               var1.visit(var3, (char)this.readInt(this.cpInfoOffsets[this.readUnsignedShort(var5)]));
               var5 += 2;
               break;
            case 68:
            case 70:
            case 73:
            case 74:
               var1.visit(var3, this.readConst(this.readUnsignedShort(var5), var4));
               var5 += 2;
               break;
            case 83:
               var1.visit(var3, (short)this.readInt(this.cpInfoOffsets[this.readUnsignedShort(var5)]));
               var5 += 2;
               break;
            case 90:
               var1.visit(var3, this.readInt(this.cpInfoOffsets[this.readUnsignedShort(var5)]) == 0 ? Boolean.FALSE : Boolean.TRUE);
               var5 += 2;
               break;
            case 91:
               int var6 = this.readUnsignedShort(var5);
               var5 += 2;
               if (var6 == 0) {
                  return this.readElementValues(var1.visitArray(var3), var5 - 2, false, var4);
               }

               switch (this.classFileBuffer[var5] & 0xFF) {
                  case 66:
                     byte[] var7 = new byte[var6];

                     for (int var18 = 0; var18 < var6; var18++) {
                        var7[var18] = (byte)this.readInt(this.cpInfoOffsets[this.readUnsignedShort(var5 + 1)]);
                        var5 += 3;
                     }

                     var1.visit(var3, var7);
                     return var5;
                  case 67:
                     char[] var20 = new char[var6];

                     for (int var21 = 0; var21 < var6; var21++) {
                        var20[var21] = (char)this.readInt(this.cpInfoOffsets[this.readUnsignedShort(var5 + 1)]);
                        var5 += 3;
                     }

                     var1.visit(var3, var20);
                     return var5;
                  case 68:
                     double[] var24 = new double[var6];

                     for (int var15 = 0; var15 < var6; var15++) {
                        var24[var15] = Double.longBitsToDouble(this.readLong(this.cpInfoOffsets[this.readUnsignedShort(var5 + 1)]));
                        var5 += 3;
                     }

                     var1.visit(var3, var24);
                     return var5;
                  case 69:
                  case 71:
                  case 72:
                  case 75:
                  case 76:
                  case 77:
                  case 78:
                  case 79:
                  case 80:
                  case 81:
                  case 82:
                  case 84:
                  case 85:
                  case 86:
                  case 87:
                  case 88:
                  case 89:
                  default:
                     var5 = this.readElementValues(var1.visitArray(var3), var5 - 2, false, var4);
                     return var5;
                  case 70:
                     float[] var23 = new float[var6];

                     for (int var14 = 0; var14 < var6; var14++) {
                        var23[var14] = Float.intBitsToFloat(this.readInt(this.cpInfoOffsets[this.readUnsignedShort(var5 + 1)]));
                        var5 += 3;
                     }

                     var1.visit(var3, var23);
                     return var5;
                  case 73:
                     int[] var11 = new int[var6];

                     for (int var22 = 0; var22 < var6; var22++) {
                        var11[var22] = this.readInt(this.cpInfoOffsets[this.readUnsignedShort(var5 + 1)]);
                        var5 += 3;
                     }

                     var1.visit(var3, var11);
                     return var5;
                  case 74:
                     long[] var12 = new long[var6];

                     for (int var13 = 0; var13 < var6; var13++) {
                        var12[var13] = this.readLong(this.cpInfoOffsets[this.readUnsignedShort(var5 + 1)]);
                        var5 += 3;
                     }

                     var1.visit(var3, var12);
                     return var5;
                  case 83:
                     short[] var19 = new short[var6];

                     for (int var10 = 0; var10 < var6; var10++) {
                        var19[var10] = (short)this.readInt(this.cpInfoOffsets[this.readUnsignedShort(var5 + 1)]);
                        var5 += 3;
                     }

                     var1.visit(var3, var19);
                     return var5;
                  case 90:
                     boolean[] var8 = new boolean[var6];

                     for (int var9 = 0; var9 < var6; var9++) {
                        var8[var9] = this.readInt(this.cpInfoOffsets[this.readUnsignedShort(var5 + 1)]) != 0;
                        var5 += 3;
                     }

                     var1.visit(var3, var8);
                     return var5;
               }
            case 99:
               var1.visit(var3, Type.getType(this.readUTF8(var5, var4)));
               var5 += 2;
               break;
            case 101:
               var1.visitEnum(var3, this.readUTF8(var5, var4), this.readUTF8(var5 + 2, var4));
               var5 += 4;
               break;
            case 115:
               var1.visit(var3, this.readUTF8(var5, var4));
               var5 += 2;
         }

         return var5;
      }
   }

   private void computeImplicitFrame(Context var1) {
      String var2 = var1.currentMethodDescriptor;
      Object[] var3 = var1.currentFrameLocalTypes;
      int var4 = 0;
      if ((var1.currentMethodAccessFlags & 8) == 0) {
         if ("<init>".equals(var1.currentMethodName)) {
            var3[var4++] = Opcodes.UNINITIALIZED_THIS;
         } else {
            var3[var4++] = this.readClass(this.header + 2, var1.charBuffer);
         }
      }

      int var5 = 1;

      while (true) {
         int var6 = var5;
         switch (var2.charAt(var5++)) {
            case 'B':
            case 'C':
            case 'I':
            case 'S':
            case 'Z':
               var3[var4++] = Opcodes.INTEGER;
               break;
            case 'D':
               var3[var4++] = Opcodes.DOUBLE;
               break;
            case 'E':
            case 'G':
            case 'H':
            case 'K':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            default:
               var1.currentFrameLocalCount = var4;
               return;
            case 'F':
               var3[var4++] = Opcodes.FLOAT;
               break;
            case 'J':
               var3[var4++] = Opcodes.LONG;
               break;
            case 'L':
               while (var2.charAt(var5) != ';') {
                  var5++;
               }

               var3[var4++] = var2.substring(var6 + 1, var5++);
               break;
            case '[':
               while (var2.charAt(var5) == '[') {
                  var5++;
               }

               if (var2.charAt(var5) == 'L') {
                  var5++;

                  while (var2.charAt(var5) != ';') {
                     var5++;
                  }
               }

               var3[var4++] = var2.substring(var6, ++var5);
         }
      }
   }

   private int readStackMapFrame(int var1, boolean var2, boolean var3, Context var4) {
      int var5 = var1;
      char[] var6 = var4.charBuffer;
      Label[] var7 = var4.currentMethodLabels;
      int var8;
      if (var2) {
         var8 = this.classFileBuffer[var5++] & 255;
      } else {
         var8 = 255;
         var4.currentFrameOffset = -1;
      }

      var4.currentFrameLocalCountDelta = 0;
      int var9;
      if (var8 < 64) {
         var9 = var8;
         var4.currentFrameType = 3;
         var4.currentFrameStackCount = 0;
      } else if (var8 < 128) {
         var9 = var8 - 64;
         var5 = this.readVerificationTypeInfo(var5, var4.currentFrameStackTypes, 0, var6, var7);
         var4.currentFrameType = 4;
         var4.currentFrameStackCount = 1;
      } else {
         if (var8 < 247) {
            throw new IllegalArgumentException();
         }

         var9 = this.readUnsignedShort(var5);
         var5 += 2;
         if (var8 == 247) {
            var5 = this.readVerificationTypeInfo(var5, var4.currentFrameStackTypes, 0, var6, var7);
            var4.currentFrameType = 4;
            var4.currentFrameStackCount = 1;
         } else if (var8 >= 248 && var8 < 251) {
            var4.currentFrameType = 2;
            var4.currentFrameLocalCountDelta = 251 - var8;
            var4.currentFrameLocalCount = var4.currentFrameLocalCount - var4.currentFrameLocalCountDelta;
            var4.currentFrameStackCount = 0;
         } else if (var8 == 251) {
            var4.currentFrameType = 3;
            var4.currentFrameStackCount = 0;
         } else if (var8 < 255) {
            int var10 = var3 ? var4.currentFrameLocalCount : 0;

            for (int var11 = var8 - 251; var11 > 0; var11--) {
               var5 = this.readVerificationTypeInfo(var5, var4.currentFrameLocalTypes, var10++, var6, var7);
            }

            var4.currentFrameType = 1;
            var4.currentFrameLocalCountDelta = var8 - 251;
            var4.currentFrameLocalCount = var4.currentFrameLocalCount + var4.currentFrameLocalCountDelta;
            var4.currentFrameStackCount = 0;
         } else {
            int var14 = this.readUnsignedShort(var5);
            var5 += 2;
            var4.currentFrameType = 0;
            var4.currentFrameLocalCountDelta = var14;
            var4.currentFrameLocalCount = var14;

            for (int var15 = 0; var15 < var14; var15++) {
               var5 = this.readVerificationTypeInfo(var5, var4.currentFrameLocalTypes, var15, var6, var7);
            }

            int var16 = this.readUnsignedShort(var5);
            var5 += 2;
            var4.currentFrameStackCount = var16;

            for (int var12 = 0; var12 < var16; var12++) {
               var5 = this.readVerificationTypeInfo(var5, var4.currentFrameStackTypes, var12, var6, var7);
            }
         }
      }

      var4.currentFrameOffset += var9 + 1;
      this.createLabel(var4.currentFrameOffset, var7);
      return var5;
   }

   private int readVerificationTypeInfo(int var1, Object[] var2, int var3, char[] var4, Label[] var5) {
      int var6 = var1;
      int var7 = this.classFileBuffer[var6++] & 255;
      switch (var7) {
         case 0:
            var2[var3] = Opcodes.TOP;
            break;
         case 1:
            var2[var3] = Opcodes.INTEGER;
            break;
         case 2:
            var2[var3] = Opcodes.FLOAT;
            break;
         case 3:
            var2[var3] = Opcodes.DOUBLE;
            break;
         case 4:
            var2[var3] = Opcodes.LONG;
            break;
         case 5:
            var2[var3] = Opcodes.NULL;
            break;
         case 6:
            var2[var3] = Opcodes.UNINITIALIZED_THIS;
            break;
         case 7:
            var2[var3] = this.readClass(var6, var4);
            var6 += 2;
            break;
         case 8:
            var2[var3] = this.createLabel(this.readUnsignedShort(var6), var5);
            var6 += 2;
            break;
         default:
            throw new IllegalArgumentException();
      }

      return var6;
   }

   final int getFirstAttributeOffset() {
      int var1 = this.header + 8 + this.readUnsignedShort(this.header + 6) * 2;
      int var2 = this.readUnsignedShort(var1);
      var1 += 2;

      while (var2-- > 0) {
         int var3 = this.readUnsignedShort(var1 + 6);
         var1 += 8;

         while (var3-- > 0) {
            var1 += 6 + this.readInt(var1 + 2);
         }
      }

      int var7 = this.readUnsignedShort(var1);
      var1 += 2;

      while (var7-- > 0) {
         int var4 = this.readUnsignedShort(var1 + 6);
         var1 += 8;

         while (var4-- > 0) {
            var1 += 6 + this.readInt(var1 + 2);
         }
      }

      return var1 + 2;
   }

   private int[] readBootstrapMethodsAttribute(int var1) {
      char[] var2 = new char[var1];
      int var3 = this.getFirstAttributeOffset();

      for (int var4 = this.readUnsignedShort(var3 - 2); var4 > 0; var4--) {
         String var5 = this.readUTF8(var3, var2);
         int var6 = this.readInt(var3 + 2);
         var3 += 6;
         if ("BootstrapMethods".equals(var5)) {
            int[] var7 = new int[this.readUnsignedShort(var3)];
            int var8 = var3 + 2;

            for (int var9 = 0; var9 < var7.length; var9++) {
               var7[var9] = var8;
               var8 += 4 + this.readUnsignedShort(var8 + 2) * 2;
            }

            return var7;
         }

         var3 += var6;
      }

      throw new IllegalArgumentException();
   }

   private Attribute readAttribute(Attribute[] var1, String var2, int var3, int var4, char[] var5, int var6, Label[] var7) {
      if (var4 > this.classFileBuffer.length - var3) {
         throw new IllegalArgumentException();
      }

      for (Attribute var11 : var1) {
         if (var11.type.equals(var2)) {
            return var11.read(this, var3, var4, var5, var6, var7);
         }
      }

      return new Attribute(var2).read(this, var3, var4, null, -1, null);
   }

   public int getItemCount() {
      return this.cpInfoOffsets.length;
   }

   public int getItem(int var1) {
      return this.cpInfoOffsets[var1];
   }

   public int getMaxStringLength() {
      return this.maxStringLength;
   }

   public int readByte(int var1) {
      return this.classFileBuffer[var1] & 0xFF;
   }

   public byte[] readBytes(int var1, int var2) {
      byte[] var3 = new byte[var2];
      System.arraycopy(this.classFileBuffer, var1, var3, 0, var2);
      return var3;
   }

   public int readUnsignedShort(int var1) {
      byte[] var2 = this.classFileBuffer;
      return (var2[var1] & 0xFF) << 8 | var2[var1 + 1] & 0xFF;
   }

   public short readShort(int var1) {
      byte[] var2 = this.classFileBuffer;
      return (short)((var2[var1] & 255) << 8 | var2[var1 + 1] & 0xFF);
   }

   public int readInt(int var1) {
      byte[] var2 = this.classFileBuffer;
      return (var2[var1] & 0xFF) << 24 | (var2[var1 + 1] & 0xFF) << 16 | (var2[var1 + 2] & 0xFF) << 8 | var2[var1 + 3] & 0xFF;
   }

   public long readLong(int var1) {
      long var2 = this.readInt(var1);
      long var4 = this.readInt(var1 + 4) & 4294967295L;
      return var2 << 32 | var4;
   }

   public String readUTF8(int var1, char[] var2) {
      int var3 = this.readUnsignedShort(var1);
      return var1 != 0 && var3 != 0 ? this.readUtf(var3, var2) : null;
   }

   final String readUtf(int var1, char[] var2) {
      String var3 = this.constantUtf8Values[var1];
      if (var3 != null) {
         return var3;
      }

      int var4 = this.cpInfoOffsets[var1];
      return this.constantUtf8Values[var1] = this.readUtf(var4 + 2, this.readUnsignedShort(var4), var2);
   }

   private String readUtf(int var1, int var2, char[] var3) {
      int var4 = var1;
      int var5 = var4 + var2;
      int var6 = 0;
      byte[] var7 = this.classFileBuffer;

      while (var4 < var5) {
         byte var8 = var7[var4++];
         if ((var8 & 128) == 0) {
            var3[var6++] = (char)(var8 & 127);
         } else if ((var8 & 224) == 192) {
            var3[var6++] = (char)(((var8 & 31) << 6) + (var7[var4++] & 63));
         } else {
            var3[var6++] = (char)(((var8 & 15) << 12) + ((var7[var4++] & 63) << 6) + (var7[var4++] & 63));
         }
      }

      return new String(var3, 0, var6);
   }

   private String readStringish(int var1, char[] var2) {
      return this.readUTF8(this.cpInfoOffsets[this.readUnsignedShort(var1)], var2);
   }

   public String readClass(int var1, char[] var2) {
      return this.readStringish(var1, var2);
   }

   public String readModule(int var1, char[] var2) {
      return this.readStringish(var1, var2);
   }

   public String readPackage(int var1, char[] var2) {
      return this.readStringish(var1, var2);
   }

   private ConstantDynamic readConstantDynamic(int var1, char[] var2) {
      ConstantDynamic var3 = this.constantDynamicValues[var1];
      if (var3 != null) {
         return var3;
      }

      int var4 = this.cpInfoOffsets[var1];
      int var5 = this.cpInfoOffsets[this.readUnsignedShort(var4 + 2)];
      String var6 = this.readUTF8(var5, var2);
      String var7 = this.readUTF8(var5 + 2, var2);
      int var8 = this.bootstrapMethodOffsets[this.readUnsignedShort(var4)];
      Handle var9 = (Handle)this.readConst(this.readUnsignedShort(var8), var2);
      Object[] var10 = new Object[this.readUnsignedShort(var8 + 2)];
      var8 += 4;

      for (int var11 = 0; var11 < var10.length; var11++) {
         var10[var11] = this.readConst(this.readUnsignedShort(var8), var2);
         var8 += 2;
      }

      return this.constantDynamicValues[var1] = new ConstantDynamic(var6, var7, var9, var10);
   }

   public Object readConst(int var1, char[] var2) {
      int var3 = this.cpInfoOffsets[var1];
      switch (this.classFileBuffer[var3 - 1]) {
         case 3:
            return this.readInt(var3);
         case 4:
            return Float.intBitsToFloat(this.readInt(var3));
         case 5:
            return this.readLong(var3);
         case 6:
            return Double.longBitsToDouble(this.readLong(var3));
         case 7:
            return Type.getObjectType(this.readUTF8(var3, var2));
         case 8:
            return this.readUTF8(var3, var2);
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         default:
            throw new IllegalArgumentException();
         case 15:
            int var4 = this.readByte(var3);
            int var5 = this.cpInfoOffsets[this.readUnsignedShort(var3 + 1)];
            int var6 = this.cpInfoOffsets[this.readUnsignedShort(var5 + 2)];
            String var7 = this.readClass(var5, var2);
            String var8 = this.readUTF8(var6, var2);
            String var9 = this.readUTF8(var6 + 2, var2);
            boolean var10 = this.classFileBuffer[var5 - 1] == 11;
            return new Handle(var4, var7, var8, var9, var10);
         case 16:
            return Type.getMethodType(this.readUTF8(var3, var2));
         case 17:
            return this.readConstantDynamic(var1, var2);
      }
   }
}
