package org.objectweb.asm;

public class Attribute {
   public final String type;
   private ByteVector cachedContent;
   Attribute nextAttribute;

   protected Attribute(String var1) {
      this.type = var1;
   }

   public boolean isUnknown() {
      return true;
   }

   public boolean isCodeAttribute() {
      return false;
   }

   @Deprecated
   protected Label[] getLabels() {
      return new Label[0];
   }

   protected Attribute read(ClassReader var1, int var2, int var3, char[] var4, int var5, Label[] var6) {
      Attribute var7 = new Attribute(this.type);
      var7.cachedContent = new ByteVector(var1.readBytes(var2, var3));
      return var7;
   }

   public static Attribute read(Attribute var0, ClassReader var1, int var2, int var3, char[] var4, int var5, Label[] var6) {
      return var0.read(var1, var2, var3, var4, var5, var6);
   }

   public static Label readLabel(ClassReader var0, int var1, Label[] var2) {
      return var0.readLabel(var1, var2);
   }

   private ByteVector maybeWrite(ClassWriter var1, byte[] var2, int var3, int var4, int var5) {
      if (this.cachedContent == null) {
         this.cachedContent = this.write(var1, var2, var3, var4, var5);
      }

      return this.cachedContent;
   }

   protected ByteVector write(ClassWriter var1, byte[] var2, int var3, int var4, int var5) {
      return this.cachedContent;
   }

   public static byte[] write(Attribute var0, ClassWriter var1, byte[] var2, int var3, int var4, int var5) {
      ByteVector var6 = var0.maybeWrite(var1, var2, var3, var4, var5);
      byte[] var7 = new byte[var6.length];
      System.arraycopy(var6.data, 0, var7, 0, var6.length);
      return var7;
   }

   final int getAttributeCount() {
      int var1 = 0;

      for (Attribute var2 = this; var2 != null; var2 = var2.nextAttribute) {
         var1++;
      }

      return var1;
   }

   final int computeAttributesSize(SymbolTable var1) {
      Object var2 = null;
      boolean var3 = false;
      byte var4 = -1;
      byte var5 = -1;
      return this.computeAttributesSize(var1, (byte[])var2, 0, -1, -1);
   }

   final int computeAttributesSize(SymbolTable var1, byte[] var2, int var3, int var4, int var5) {
      ClassWriter var6 = var1.classWriter;
      int var7 = 0;

      for (Attribute var8 = this; var8 != null; var8 = var8.nextAttribute) {
         var1.addConstantUtf8(var8.type);
         var7 += 6 + var8.maybeWrite(var6, var2, var3, var4, var5).length;
      }

      return var7;
   }

   static int computeAttributesSize(SymbolTable var0, int var1, int var2) {
      byte var3 = 0;
      if ((var1 & 4096) != 0 && var0.getMajorVersion() < 49) {
         var0.addConstantUtf8("Synthetic");
         var3 += 6;
      }

      if (var2 != 0) {
         var0.addConstantUtf8("Signature");
         var3 += 8;
      }

      if ((var1 & 131072) != 0) {
         var0.addConstantUtf8("Deprecated");
         var3 += 6;
      }

      return var3;
   }

   final void putAttributes(SymbolTable var1, ByteVector var2) {
      Object var3 = null;
      boolean var4 = false;
      byte var5 = -1;
      byte var6 = -1;
      this.putAttributes(var1, (byte[])var3, 0, -1, -1, var2);
   }

   final void putAttributes(SymbolTable var1, byte[] var2, int var3, int var4, int var5, ByteVector var6) {
      ClassWriter var7 = var1.classWriter;

      for (Attribute var8 = this; var8 != null; var8 = var8.nextAttribute) {
         ByteVector var9 = var8.maybeWrite(var7, var2, var3, var4, var5);
         var6.putShort(var1.addConstantUtf8(var8.type)).putInt(var9.length);
         var6.putByteArray(var9.data, 0, var9.length);
      }
   }

   static void putAttributes(SymbolTable var0, int var1, int var2, ByteVector var3) {
      if ((var1 & 4096) != 0 && var0.getMajorVersion() < 49) {
         var3.putShort(var0.addConstantUtf8("Synthetic")).putInt(0);
      }

      if (var2 != 0) {
         var3.putShort(var0.addConstantUtf8("Signature")).putInt(2).putShort(var2);
      }

      if ((var1 & 131072) != 0) {
         var3.putShort(var0.addConstantUtf8("Deprecated")).putInt(0);
      }
   }

   static final class Set {
      private static final int SIZE_INCREMENT = 6;
      private int size;
      private Attribute[] data = new Attribute[6];

      void addAttributes(Attribute var1) {
         for (Attribute var2 = var1; var2 != null; var2 = var2.nextAttribute) {
            if (!this.contains(var2)) {
               this.add(var2);
            }
         }
      }

      Attribute[] toArray() {
         Attribute[] var1 = new Attribute[this.size];
         System.arraycopy(this.data, 0, var1, 0, this.size);
         return var1;
      }

      private boolean contains(Attribute var1) {
         for (int var2 = 0; var2 < this.size; var2++) {
            if (this.data[var2].type.equals(var1.type)) {
               return true;
            }
         }

         return false;
      }

      private void add(Attribute var1) {
         if (this.size >= this.data.length) {
            Attribute[] var2 = new Attribute[this.data.length + 6];
            System.arraycopy(this.data, 0, var2, 0, this.size);
            this.data = var2;
         }

         this.data[this.size++] = var1;
      }
   }
}
