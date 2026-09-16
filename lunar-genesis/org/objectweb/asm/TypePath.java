package org.objectweb.asm;

public final class TypePath {
   public static final int ARRAY_ELEMENT = 0;
   public static final int INNER_TYPE = 1;
   public static final int WILDCARD_BOUND = 2;
   public static final int TYPE_ARGUMENT = 3;
   private final byte[] typePathContainer;
   private final int typePathOffset;

   TypePath(byte[] var1, int var2) {
      this.typePathContainer = var1;
      this.typePathOffset = var2;
   }

   public int getLength() {
      return this.typePathContainer[this.typePathOffset];
   }

   public int getStep(int var1) {
      return this.typePathContainer[this.typePathOffset + 2 * var1 + 1];
   }

   public int getStepArgument(int var1) {
      return this.typePathContainer[this.typePathOffset + 2 * var1 + 2];
   }

   public static TypePath fromString(String var0) {
      if (var0 != null && var0.length() != 0) {
         int var1 = var0.length();
         ByteVector var2 = new ByteVector(var1);
         var2.putByte(0);
         int var3 = 0;

         while (var3 < var1) {
            char var4 = var0.charAt(var3++);
            if (var4 == '[') {
               var2.put11(0, 0);
            } else if (var4 != '.') {
               if (var4 != '*') {
                  if (var4 < '0' || var4 > '9') {
                     throw new IllegalArgumentException();
                  }

                  int var5 = var4 - '0';

                  while (true) {
                     if (var3 < var1) {
                        var4 = var0.charAt(var3++);
                        if (var4 >= '0' && var4 <= '9') {
                           var5 = var5 * 10 + var4 - 48;
                           continue;
                        }

                        if (var4 != ';') {
                           throw new IllegalArgumentException();
                        }
                     }

                     var2.put11(3, var5);
                     break;
                  }
               } else {
                  var2.put11(2, 0);
               }
            } else {
               var2.put11(1, 0);
            }
         }

         var2.data[0] = (byte)(var2.length / 2);
         return new TypePath(var2.data, 0);
      } else {
         return null;
      }
   }

   @Override
   public String toString() {
      int var1 = this.getLength();
      StringBuilder var2 = new StringBuilder(var1 * 2);

      for (int var3 = 0; var3 < var1; var3++) {
         switch (this.getStep(var3)) {
            case 0:
               var2.append('[');
               break;
            case 1:
               var2.append('.');
               break;
            case 2:
               var2.append('*');
               break;
            case 3:
               var2.append(this.getStepArgument(var3)).append(';');
               break;
            default:
               throw new AssertionError();
         }
      }

      return var2.toString();
   }

   static void put(TypePath var0, ByteVector var1) {
      if (var0 == null) {
         var1.putByte(0);
      } else {
         int var2 = var0.typePathContainer[var0.typePathOffset] * 2 + 1;
         var1.putByteArray(var0.typePathContainer, var0.typePathOffset, var2);
      }
   }
}
