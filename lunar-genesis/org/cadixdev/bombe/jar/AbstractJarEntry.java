package org.cadixdev.bombe.jar;

import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;

public abstract class AbstractJarEntry {
   public static final int UNVERSIONED = -1;
   private static final String META_INF = "META-INF/";
   private static final String VERSIONS_PREFIX = "META-INF/versions/";
   protected final String name;
   protected final long time;
   private String unversionedName;
   private int version = -1;
   private String packageName;
   private String simpleName;

   protected AbstractJarEntry(int var1, String var2, long var3) {
      if (var1 != -1 && !var2.startsWith("META-INF/")) {
         this.version = var1;
         this.unversionedName = var2;
         this.name = "META-INF/versions/" + var1 + '/' + var2;
      } else {
         this.name = var2;
      }

      this.time = var3;
   }

   protected AbstractJarEntry(String var1, long var2) {
      this.name = var1;
      this.time = var2;
   }

   public final String getName() {
      return this.name;
   }

   public final long getTime() {
      return this.time;
   }

   public final String getUnversionedName() {
      if (this.unversionedName != null) {
         return this.unversionedName;
      }

      if (!this.name.startsWith("META-INF/versions/")) {
         return this.unversionedName = this.name;
      }

      String var1 = this.name.substring("META-INF/versions/".length());
      int var2 = var1.indexOf(47);
      if (var2 == -1) {
         return this.unversionedName = this.name;
      }

      String var3 = var1.substring(0, var2);
      String var4 = var1.substring(var2 + 1);

      try {
         if (!var4.startsWith("META-INF/")) {
            int var5 = Integer.parseInt(var3);
            if (var5 >= 0) {
               this.version = var5;
               return this.unversionedName = var4;
            }
         }
      } catch (NumberFormatException var6) {
      }

      return this.unversionedName = this.name;
   }

   public final String getPackage() {
      if (this.packageName != null) {
         return this.packageName;
      }

      String var1 = this.getUnversionedName();
      int var2 = var1.lastIndexOf(47);
      return var2 == -1 ? (this.packageName = "") : (this.packageName = var1.substring(0, var2));
   }

   public final String getSimpleName() {
      if (this.simpleName != null) {
         return this.simpleName;
      }

      int var1 = this.getPackage().isEmpty() ? -1 : this.getPackage().length();
      int var2 = this.getExtension().isEmpty() ? -1 : this.getExtension().length();
      String var3 = this.getUnversionedName();
      return this.simpleName = var3.substring(var1 + 1, var3.length() - (var2 + 1));
   }

   public int getVersion() {
      if (this.unversionedName != null) {
         return this.version;
      }

      this.getUnversionedName();
      return this.version;
   }

   public abstract String getExtension();

   public abstract byte[] getContents();

   public final void write(JarOutputStream var1) {
      JarEntry var2 = new JarEntry(this.name);
      var2.setTime(this.time);
      var1.putNextEntry(var2);
      var1.write(this.getContents());
      var1.closeEntry();
   }

   public abstract AbstractJarEntry accept(JarEntryTransformer var1);
}
