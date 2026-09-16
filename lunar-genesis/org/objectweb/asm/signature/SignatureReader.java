package org.objectweb.asm.signature;

public class SignatureReader {
   private final String signatureValue;

   public SignatureReader(String var1) {
      this.signatureValue = var1;
   }

   public void accept(SignatureVisitor var1) {
      String var2 = this.signatureValue;
      int var3 = var2.length();
      int var7;
      if (var2.charAt(0) == '<') {
         var7 = 2;

         char var11;
         do {
            int var6 = var2.indexOf(58, var7);
            var1.visitFormalTypeParameter(var2.substring(var7 - 1, var6));
            var7 = var6 + 1;
            var11 = var2.charAt(var7);
            if (var11 == 'L' || var11 == '[' || var11 == 'T') {
               var7 = parseType(var2, var7, var1.visitClassBound());
            }

            while ((var11 = var2.charAt(var7++)) == ':') {
               var7 = parseType(var2, var7, var1.visitInterfaceBound());
            }
         } while (var11 != '>');
      } else {
         var7 = 0;
      }

      if (var2.charAt(var7) == '(') {
         var7++;

         while (var2.charAt(var7) != ')') {
            var7 = parseType(var2, var7, var1.visitParameterType());
         }

         var7 = parseType(var2, var7 + 1, var1.visitReturnType());

         while (var7 < var3) {
            var7 = parseType(var2, var7 + 1, var1.visitExceptionType());
         }
      } else {
         var7 = parseType(var2, var7, var1.visitSuperclass());

         while (var7 < var3) {
            var7 = parseType(var2, var7, var1.visitInterface());
         }
      }
   }

   public void acceptType(SignatureVisitor var1) {
      parseType(this.signatureValue, 0, var1);
   }

   private static int parseType(String var0, int var1, SignatureVisitor var2) {
      int var3 = var1;
      char var4 = var0.charAt(var3++);
      switch (var4) {
         case 'B':
         case 'C':
         case 'D':
         case 'F':
         case 'I':
         case 'J':
         case 'S':
         case 'V':
         case 'Z':
            var2.visitBaseType(var4);
            return var3;
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
         case 'U':
         case 'W':
         case 'X':
         case 'Y':
         default:
            throw new IllegalArgumentException();
         case 'L':
            int var6 = var3;
            boolean var7 = false;
            boolean var8 = false;

            while (true) {
               var4 = var0.charAt(var3++);
               if (var4 != '.' && var4 != ';') {
                  if (var4 == '<') {
                     String var13 = var0.substring(var6, var3 - 1);
                     if (var8) {
                        var2.visitInnerClassType(var13);
                     } else {
                        var2.visitClassType(var13);
                     }

                     var7 = true;

                     while ((var4 = var0.charAt(var3)) != '>') {
                        switch (var4) {
                           case '*':
                              var3++;
                              var2.visitTypeArgument();
                              break;
                           case '+':
                           case '-':
                              var3 = parseType(var0, var3 + 1, var2.visitTypeArgument(var4));
                              break;
                           case ',':
                           default:
                              var3 = parseType(var0, var3, var2.visitTypeArgument('='));
                        }
                     }
                  }
               } else {
                  if (!var7) {
                     String var9 = var0.substring(var6, var3 - 1);
                     if (var8) {
                        var2.visitInnerClassType(var9);
                     } else {
                        var2.visitClassType(var9);
                     }
                  }

                  if (var4 == ';') {
                     var2.visitEnd();
                     return var3;
                  }

                  var6 = var3;
                  var7 = false;
                  var8 = true;
               }
            }
         case 'T':
            int var5 = var0.indexOf(59, var3);
            var2.visitTypeVariable(var0.substring(var3, var5));
            return var5 + 1;
         case '[':
            return parseType(var0, var3, var2.visitArrayType());
      }
   }
}
