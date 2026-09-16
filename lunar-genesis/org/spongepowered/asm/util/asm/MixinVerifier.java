package org.spongepowered.asm.util.asm;

import java.util.List;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.analysis.BasicValue;
import org.objectweb.asm.tree.analysis.SimpleVerifier;
import org.spongepowered.asm.mixin.transformer.ClassInfo;

public class MixinVerifier extends SimpleVerifier {
   private static final Type OBJECT_TYPE = Type.getType(Object.class);

   public MixinVerifier(int var1, Type var2, Type var3, List<Type> var4, boolean var5) {
      super(var1, var2, var3, var4, var5);
   }

   @Override
   protected boolean isInterface(Type var1) {
      return var1.getSort() != 10 ? false : ClassInfo.forType(var1, ClassInfo.TypeLookup.DECLARED_TYPE).isInterface();
   }

   @Override
   protected boolean isSubTypeOf(BasicValue var1, BasicValue var2) {
      Type var3 = var2.getType();
      Type var4 = var1.getType();
      switch (var3.getSort()) {
         case 5:
         case 6:
         case 7:
         case 8:
            return var4.equals(var3);
         case 9:
         case 10:
            if (var4.equals(NULL_TYPE)) {
               return true;
            } else if (var4.getSort() != 10 && var4.getSort() != 9) {
               return false;
            } else if (this.isAssignableFrom(var3, var4)) {
               return true;
            } else {
               if (var3.getSort() == 9) {
                  if (var4.getSort() != 9) {
                     return false;
                  }

                  int var5 = var3.getDimensions();
                  var3 = var3.getElementType();
                  if (var5 > var4.getDimensions() || var3.getSort() != 10) {
                     return false;
                  }

                  var4 = Type.getType(var4.getDescriptor().substring(var5));
               }

               if (this.isInterface(var3)) {
                  return var4.getSort() >= 9;
               }

               return false;
            }
         default:
            throw new AssertionError();
      }
   }

   @Override
   protected boolean isAssignableFrom(Type var1, Type var2) {
      return var1.equals(getCommonSupertype(var1, var2));
   }

   @Override
   public BasicValue merge(BasicValue var1, BasicValue var2) {
      if (var1.equals(var2)) {
         return var1;
      } else if (!var1.equals(BasicValue.UNINITIALIZED_VALUE) && !var2.equals(BasicValue.UNINITIALIZED_VALUE)) {
         Type var3 = getCommonSupertype(var1.getType(), var2.getType());
         return this.newValue(var3);
      } else {
         return BasicValue.UNINITIALIZED_VALUE;
      }
   }

   private static Type getCommonSupertype(Type var0, Type var1) {
      if (var0.equals(var1) || var1.equals(NULL_TYPE)) {
         return var0;
      }

      if (var0.equals(NULL_TYPE)) {
         return var1;
      }

      if (var0.getSort() < 9 || var1.getSort() < 9) {
         return null;
      }

      if (var0.getSort() == 9 && var1.getSort() == 9) {
         int var2 = var0.getDimensions();
         Type var3 = var0.getElementType();
         int var4 = var1.getDimensions();
         Type var5 = var1.getElementType();
         if (var2 != var4) {
            int var7;
            Type var8;
            if (var2 < var4) {
               var8 = var3;
               var7 = var2 - 1;
            } else {
               var8 = var5;
               var7 = var4 - 1;
            }

            if (var8.getSort() == 10) {
               var7++;
            }

            return arrayType(OBJECT_TYPE, var7);
         } else {
            Type var6;
            if (var3.equals(var5)) {
               var6 = var3;
            } else {
               if (var3.getSort() != 10 || var5.getSort() != 10) {
                  return arrayType(OBJECT_TYPE, var2 - 1);
               }

               var6 = getCommonSupertype(var3, var5);
            }

            return arrayType(var6, var2);
         }
      } else {
         return (var0.getSort() != 9 || var1.getSort() != 10) && (var1.getSort() != 9 || var0.getSort() != 10)
            ? ClassInfo.getCommonSuperClass(var0, var1).getType()
            : OBJECT_TYPE;
      }
   }

   private static Type arrayType(Type var0, int var1) {
      if (var1 == 0) {
         return var0;
      }

      StringBuilder var2 = new StringBuilder();

      for (int var3 = 0; var3 < var1; var3++) {
         var2.append('[');
      }

      var2.append(var0.getDescriptor());
      return Type.getType(var2.toString());
   }

   @Override
   protected Class<?> getClass(Type var1) {
      throw new UnsupportedOperationException(String.format("Live-loading of %s attempted by MixinVerifier! This should never happen!", var1.getClassName()));
   }
}
