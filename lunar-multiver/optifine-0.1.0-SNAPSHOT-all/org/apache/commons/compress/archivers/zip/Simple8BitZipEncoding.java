package org.apache.commons.compress.archivers.zip;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Simple8BitZipEncoding implements ZipEncoding {
   private final char[] highChars;
   private final List<Simple8BitZipEncoding.Simple8BitChar> reverseMapping;

   public Simple8BitZipEncoding(char[] var1) {
      this.highChars = (char[])var1.clone();
      ArrayList var2 = new ArrayList(this.highChars.length);
      byte var3 = 127;

      for (char var7 : this.highChars) {
         var2.add(new Simple8BitZipEncoding.Simple8BitChar(++var3, var7));
      }

      Collections.sort(var2);
      this.reverseMapping = Collections.unmodifiableList(var2);
   }

   public char decodeByte(byte var1) {
      return var1 >= 0 ? (char)var1 : this.highChars[128 + var1];
   }

   public boolean canEncodeChar(char var1) {
      if (var1 >= 0 && var1 < 128) {
         return true;
      }

      Simple8BitZipEncoding.Simple8BitChar var2 = this.encodeHighChar(var1);
      return var2 != null;
   }

   public boolean pushEncodedChar(ByteBuffer var1, char var2) {
      if (var2 >= 0 && var2 < 128) {
         var1.put((byte)var2);
         return true;
      }

      Simple8BitZipEncoding.Simple8BitChar var3 = this.encodeHighChar(var2);
      if (var3 == null) {
         return false;
      }

      var1.put(var3.code);
      return true;
   }

   private Simple8BitZipEncoding.Simple8BitChar encodeHighChar(char var1) {
      int var2 = 0;
      int var3 = this.reverseMapping.size();

      while (var3 > var2) {
         int var4 = var2 + (var3 - var2) / 2;
         Simple8BitZipEncoding.Simple8BitChar var5 = this.reverseMapping.get(var4);
         if (var5.unicode == var1) {
            return var5;
         }

         if (var5.unicode < var1) {
            var2 = var4 + 1;
         } else {
            var3 = var4;
         }
      }

      if (var2 >= this.reverseMapping.size()) {
         return null;
      }

      Simple8BitZipEncoding.Simple8BitChar var6 = this.reverseMapping.get(var2);
      return var6.unicode != var1 ? null : var6;
   }

   @Override
   public boolean canEncode(String var1) {
      for (int var2 = 0; var2 < var1.length(); var2++) {
         char var3 = var1.charAt(var2);
         if (!this.canEncodeChar(var3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ByteBuffer encode(String var1) {
      ByteBuffer var2 = ByteBuffer.allocate(var1.length() + 6 + (var1.length() + 1) / 2);

      for (int var3 = 0; var3 < var1.length(); var3++) {
         char var4 = var1.charAt(var3);
         if (var2.remaining() < 6) {
            var2 = ZipEncodingHelper.growBuffer(var2, var2.position() + 6);
         }

         if (!this.pushEncodedChar(var2, var4)) {
            ZipEncodingHelper.appendSurrogate(var2, var4);
         }
      }

      ((Buffer)var2).limit(var2.position());
      ((Buffer)var2).rewind();
      return var2;
   }

   @Override
   public String decode(byte[] var1) {
      char[] var2 = new char[var1.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2[var3] = this.decodeByte(var1[var3]);
      }

      return new String(var2);
   }

   private static final class Simple8BitChar implements Comparable<Simple8BitZipEncoding.Simple8BitChar> {
      public final char unicode;
      public final byte code;

      Simple8BitChar(byte var1, char var2) {
         this.code = var1;
         this.unicode = var2;
      }

      public int compareTo(Simple8BitZipEncoding.Simple8BitChar var1) {
         return this.unicode - var1.unicode;
      }

      @Override
      public String toString() {
         return "0x" + Integer.toHexString(65535 & this.unicode) + "->0x" + Integer.toHexString(255 & this.code);
      }

      @Override
      public boolean equals(Object var1) {
         if (!(var1 instanceof Simple8BitZipEncoding.Simple8BitChar)) {
            return false;
         }

         Simple8BitZipEncoding.Simple8BitChar var2 = (Simple8BitZipEncoding.Simple8BitChar)var1;
         return this.unicode == var2.unicode && this.code == var2.code;
      }

      @Override
      public int hashCode() {
         return this.unicode;
      }
   }
}
