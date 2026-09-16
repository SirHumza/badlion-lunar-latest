package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import java.util.Iterator;
import java.util.List;

final class Path {
   private final String first;
   private final Path remainder;

   Path(String var1, Path var2) {
      this.first = var1;
      this.remainder = var2;
   }

   Path(String... var1) {
      if (var1.length == 0) {
         throw new ConfigException.BugOrBroken("empty path");
      }

      this.first = var1[0];
      if (var1.length > 1) {
         PathBuilder var2 = new PathBuilder();

         for (int var3 = 1; var3 < var1.length; var3++) {
            var2.appendKey(var1[var3]);
         }

         this.remainder = var2.result();
      } else {
         this.remainder = null;
      }
   }

   Path(List<Path> var1) {
      this(var1.iterator());
   }

   Path(Iterator<Path> var1) {
      if (!var1.hasNext()) {
         throw new ConfigException.BugOrBroken("empty path");
      }

      Path var2 = (Path)var1.next();
      this.first = var2.first;
      PathBuilder var3 = new PathBuilder();
      if (var2.remainder != null) {
         var3.appendPath(var2.remainder);
      }

      while (var1.hasNext()) {
         var3.appendPath((Path)var1.next());
      }

      this.remainder = var3.result();
   }

   String first() {
      return this.first;
   }

   Path remainder() {
      return this.remainder;
   }

   Path parent() {
      if (this.remainder == null) {
         return null;
      }

      PathBuilder var1 = new PathBuilder();

      for (Path var2 = this; var2.remainder != null; var2 = var2.remainder) {
         var1.appendKey(var2.first);
      }

      return var1.result();
   }

   String last() {
      Path var1 = this;

      while (var1.remainder != null) {
         var1 = var1.remainder;
      }

      return var1.first;
   }

   Path prepend(Path var1) {
      PathBuilder var2 = new PathBuilder();
      var2.appendPath(var1);
      var2.appendPath(this);
      return var2.result();
   }

   int length() {
      int var1 = 1;

      for (Path var2 = this.remainder; var2 != null; var2 = var2.remainder) {
         var1++;
      }

      return var1;
   }

   Path subPath(int var1) {
      int var2 = var1;

      Path var3;
      for (var3 = this; var3 != null && var2 > 0; var3 = var3.remainder) {
         var2--;
      }

      return var3;
   }

   Path subPath(int var1, int var2) {
      if (var2 < var1) {
         throw new ConfigException.BugOrBroken("bad call to subPath");
      }

      Path var3 = this.subPath(var1);
      PathBuilder var4 = new PathBuilder();
      int var5 = var2 - var1;

      while (var5 > 0) {
         var5--;
         var4.appendKey(var3.first());
         var3 = var3.remainder();
         if (var3 == null) {
            throw new ConfigException.BugOrBroken("subPath lastIndex out of range " + var2);
         }
      }

      return var4.result();
   }

   boolean startsWith(Path var1) {
      Path var2 = this;
      Path var3 = var1;
      if (var3.length() <= var2.length()) {
         while (var3 != null) {
            if (!var3.first().equals(var2.first())) {
               return false;
            }

            var2 = var2.remainder();
            var3 = var3.remainder();
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Path)) {
         return false;
      }

      Path var2 = (Path)var1;
      return this.first.equals(var2.first) && ConfigImplUtil.equalsHandlingNull(this.remainder, var2.remainder);
   }

   @Override
   public int hashCode() {
      return 41 * (41 + this.first.hashCode()) + (this.remainder == null ? 0 : this.remainder.hashCode());
   }

   static boolean hasFunkyChars(String var0) {
      int var1 = var0.length();
      if (var1 == 0) {
         return false;
      }

      for (int var2 = 0; var2 < var1; var2++) {
         char var3 = var0.charAt(var2);
         if (!Character.isLetterOrDigit(var3) && var3 != '-' && var3 != '_') {
            return true;
         }
      }

      return false;
   }

   private void appendToStringBuilder(StringBuilder var1) {
      if (!hasFunkyChars(this.first) && !this.first.isEmpty()) {
         var1.append(this.first);
      } else {
         var1.append(ConfigImplUtil.renderJsonString(this.first));
      }

      if (this.remainder != null) {
         var1.append(".");
         this.remainder.appendToStringBuilder(var1);
      }
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Path(");
      this.appendToStringBuilder(var1);
      var1.append(")");
      return var1.toString();
   }

   String render() {
      StringBuilder var1 = new StringBuilder();
      this.appendToStringBuilder(var1);
      return var1.toString();
   }

   static Path newKey(String var0) {
      return new Path(var0, null);
   }

   static Path newPath(String var0) {
      return PathParser.parsePath(var0);
   }
}
