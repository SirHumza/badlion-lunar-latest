package org.objectweb.asm.commons;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;

public class SerialVersionUIDAdder extends ClassVisitor {
   private static final String CLINIT = "<clinit>";
   private boolean computeSvuid;
   private boolean hasSvuid;
   private int access;
   private String name;
   private String[] interfaces;
   private Collection<SerialVersionUIDAdder.Item> svuidFields;
   private boolean hasStaticInitializer;
   private Collection<SerialVersionUIDAdder.Item> svuidConstructors;
   private Collection<SerialVersionUIDAdder.Item> svuidMethods;

   public SerialVersionUIDAdder(ClassVisitor var1) {
      this(589824, var1);
      if (this.getClass() != SerialVersionUIDAdder.class) {
         throw new IllegalStateException();
      }
   }

   protected SerialVersionUIDAdder(int var1, ClassVisitor var2) {
      super(var1, var2);
   }

   @Override
   public void visit(int var1, int var2, String var3, String var4, String var5, String[] var6) {
      this.computeSvuid = (var2 & 16384) == 0;
      if (this.computeSvuid) {
         this.name = var3;
         this.access = var2;
         this.interfaces = (String[])var6.clone();
         this.svuidFields = new ArrayList<>();
         this.svuidConstructors = new ArrayList<>();
         this.svuidMethods = new ArrayList<>();
      }

      super.visit(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public MethodVisitor visitMethod(int var1, String var2, String var3, String var4, String[] var5) {
      if (this.computeSvuid) {
         if ("<clinit>".equals(var2)) {
            this.hasStaticInitializer = true;
         }

         int var6 = var1 & 3391;
         if ((var1 & 2) == 0) {
            if ("<init>".equals(var2)) {
               this.svuidConstructors.add(new SerialVersionUIDAdder.Item(var2, var6, var3));
            } else if (!"<clinit>".equals(var2)) {
               this.svuidMethods.add(new SerialVersionUIDAdder.Item(var2, var6, var3));
            }
         }
      }

      return super.visitMethod(var1, var2, var3, var4, var5);
   }

   @Override
   public FieldVisitor visitField(int var1, String var2, String var3, String var4, Object var5) {
      if (this.computeSvuid) {
         if ("serialVersionUID".equals(var2)) {
            this.computeSvuid = false;
            this.hasSvuid = true;
         }

         if ((var1 & 2) == 0 || (var1 & 136) == 0) {
            int var6 = var1 & 223;
            this.svuidFields.add(new SerialVersionUIDAdder.Item(var2, var6, var3));
         }
      }

      return super.visitField(var1, var2, var3, var4, var5);
   }

   @Override
   public void visitInnerClass(String var1, String var2, String var3, int var4) {
      if (this.name != null && this.name.equals(var1)) {
         this.access = var4;
      }

      super.visitInnerClass(var1, var2, var3, var4);
   }

   @Override
   public void visitEnd() {
      if (this.computeSvuid && !this.hasSvuid) {
         try {
            this.addSVUID(this.computeSVUID());
         } catch (IOException var2) {
            throw new IllegalStateException(stringConcat$0(this.name), var2);
         }
      }

      super.visitEnd();
   }

   public boolean hasSVUID() {
      return this.hasSvuid;
   }

   protected void addSVUID(long var1) {
      FieldVisitor var3 = super.visitField(24, "serialVersionUID", "J", null, var1);
      if (var3 != null) {
         var3.visitEnd();
      }
   }

   protected long computeSVUID() {
      long var1 = 0L;
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();

      try {
         DataOutputStream var4 = new DataOutputStream(var3);

         try {
            var4.writeUTF(this.name.replace('/', '.'));
            int var5 = this.access;
            if ((var5 & 512) != 0) {
               var5 = this.svuidMethods.isEmpty() ? var5 & -1025 : var5 | 1024;
            }

            var4.writeInt(var5 & 1553);
            Arrays.sort(this.interfaces);

            for (String var9 : this.interfaces) {
               var4.writeUTF(var9.replace('/', '.'));
            }

            writeItems(this.svuidFields, var4, false);
            if (this.hasStaticInitializer) {
               var4.writeUTF("<clinit>");
               var4.writeInt(8);
               var4.writeUTF("()V");
            }

            writeItems(this.svuidConstructors, var4, true);
            writeItems(this.svuidMethods, var4, true);
            var4.flush();
            byte[] var14 = this.computeSHAdigest(var3.toByteArray());

            for (int var15 = Math.min(var14.length, 8) - 1; var15 >= 0; var15--) {
               var1 = var1 << 8 | var14[var15] & 0xFF;
            }
         } catch (Throwable var12) {
            try {
               var4.close();
            } catch (Throwable var11) {
            }

            throw var12;
         }

         var4.close();
      } catch (Throwable var13) {
         try {
            var3.close();
         } catch (Throwable var10) {
         }

         throw var13;
      }

      var3.close();
      return var1;
   }

   protected byte[] computeSHAdigest(byte[] var1) {
      try {
         return MessageDigest.getInstance("SHA-1").digest(var1);
      } catch (NoSuchAlgorithmException var3) {
         throw new UnsupportedOperationException(var3);
      }
   }

   private static void writeItems(Collection<SerialVersionUIDAdder.Item> var0, DataOutput var1, boolean var2) {
      SerialVersionUIDAdder.Item[] var3 = var0.toArray(new SerialVersionUIDAdder.Item[0]);
      Arrays.sort(var3);

      for (SerialVersionUIDAdder.Item var7 : var3) {
         var1.writeUTF(var7.name);
         var1.writeInt(var7.access);
         var1.writeUTF(var2 ? var7.descriptor.replace('/', '.') : var7.descriptor);
      }
   }

   private static final class Item implements Comparable<SerialVersionUIDAdder.Item> {
      final String name;
      final int access;
      final String descriptor;

      Item(String var1, int var2, String var3) {
         this.name = var1;
         this.access = var2;
         this.descriptor = var3;
      }

      public int compareTo(SerialVersionUIDAdder.Item var1) {
         int var2 = this.name.compareTo(var1.name);
         if (var2 == 0) {
            var2 = this.descriptor.compareTo(var1.descriptor);
         }

         return var2;
      }

      @Override
      public boolean equals(Object var1) {
         return var1 instanceof SerialVersionUIDAdder.Item ? this.compareTo((SerialVersionUIDAdder.Item)var1) == 0 : false;
      }

      @Override
      public int hashCode() {
         return this.name.hashCode() ^ this.descriptor.hashCode();
      }
   }
}
