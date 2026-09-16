package org.objectweb.asm.tree.analysis;

import java.util.List;
import org.objectweb.asm.Type;

public class SimpleVerifier extends BasicVerifier {
   private static final Type OBJECT_TYPE = Type.getObjectType("java/lang/Object");
   private final Type currentClass;
   private final Type currentSuperClass;
   private final List<Type> currentClassInterfaces;
   private final boolean isInterface;
   private ClassLoader loader = this.getClass().getClassLoader();

   public SimpleVerifier() {
      this(null, null, false);
   }

   public SimpleVerifier(Type var1, Type var2, boolean var3) {
      this(var1, var2, null, var3);
   }

   public SimpleVerifier(Type var1, Type var2, List<Type> var3, boolean var4) {
      this(589824, var1, var2, var3, var4);
      if (this.getClass() != SimpleVerifier.class) {
         throw new IllegalStateException();
      }
   }

   protected SimpleVerifier(int var1, Type var2, Type var3, List<Type> var4, boolean var5) {
      super(var1);
      this.currentClass = var2;
      this.currentSuperClass = var3;
      this.currentClassInterfaces = var4;
      this.isInterface = var5;
   }

   public void setClassLoader(ClassLoader var1) {
      this.loader = var1;
   }

   @Override
   public BasicValue newValue(Type var1) {
      if (var1 == null) {
         return BasicValue.UNINITIALIZED_VALUE;
      }

      boolean var2 = var1.getSort() == 9;
      if (var2) {
         switch (var1.getElementType().getSort()) {
            case 1:
            case 2:
            case 3:
            case 4:
               return new BasicValue(var1);
         }
      }

      BasicValue var3 = super.newValue(var1);
      if (BasicValue.REFERENCE_VALUE.equals(var3)) {
         if (var2) {
            var3 = this.newValue(var1.getElementType());
            StringBuilder var4 = new StringBuilder();

            for (int var5 = 0; var5 < var1.getDimensions(); var5++) {
               var4.append('[');
            }

            var4.append(var3.getType().getDescriptor());
            var3 = new BasicValue(Type.getType(var4.toString()));
         } else {
            var3 = new BasicValue(var1);
         }
      }

      return var3;
   }

   @Override
   protected boolean isArrayValue(BasicValue var1) {
      Type var2 = var1.getType();
      return var2 != null && (var2.getSort() == 9 || var2.equals(NULL_TYPE));
   }

   @Override
   protected BasicValue getElementValue(BasicValue var1) {
      Type var2 = var1.getType();
      if (var2 != null) {
         if (var2.getSort() == 9) {
            return this.newValue(Type.getType(var2.getDescriptor().substring(1)));
         }

         if (var2.equals(NULL_TYPE)) {
            return var1;
         }
      }

      throw new AssertionError();
   }

   @Override
   protected boolean isSubTypeOf(BasicValue var1, BasicValue var2) {
      Type var3 = var1.getType();
      Type var4 = var2.getType();
      if (var3 != null && var4 != null) {
         if (var3.equals(var4)) {
            return true;
         }

         switch (var4.getSort()) {
            case 5:
            case 6:
            case 7:
            case 8:
               return false;
            case 9:
            case 10:
               if (var3.equals(NULL_TYPE)) {
                  return true;
               } else {
                  int var5 = 0;
                  if (var3.getSort() == 9) {
                     var5 = var3.getDimensions();
                     var3 = var3.getElementType();
                     if (var3.getSort() != 10) {
                        var5--;
                        var3 = OBJECT_TYPE;
                     }
                  }

                  int var6 = 0;
                  if (var4.getSort() == 9) {
                     var6 = var4.getDimensions();
                     var4 = var4.getElementType();
                     if (var4.getSort() != 10) {
                        return false;
                     }
                  }

                  if (var5 < var6) {
                     return false;
                  } else {
                     if (var5 > var6) {
                        var3 = OBJECT_TYPE;
                     }

                     if (this.isAssignableFrom(var4, var3)) {
                        return true;
                     } else {
                        if (this.getClass(var4).isInterface()) {
                           return Object.class.isAssignableFrom(this.getClass(var3));
                        }

                        return false;
                     }
                  }
               }
            default:
               throw new AssertionError();
         }
      } else {
         return var3 == null && var4 == null;
      }
   }

   @Override
   public BasicValue merge(BasicValue var1, BasicValue var2) {
      Type var3 = var1.getType();
      Type var4 = var2.getType();
      if (var3 == null || var4 == null) {
         return BasicValue.UNINITIALIZED_VALUE;
      }

      if (var3.equals(var4)) {
         return var1;
      }

      if (var3.getSort() != 10 && var3.getSort() != 9) {
         return BasicValue.UNINITIALIZED_VALUE;
      }

      if (var4.getSort() != 10 && var4.getSort() != 9) {
         return BasicValue.UNINITIALIZED_VALUE;
      }

      if (var3.equals(NULL_TYPE)) {
         return var2;
      }

      if (var4.equals(NULL_TYPE)) {
         return var1;
      }

      int var5 = 0;
      if (var3.getSort() == 9) {
         var5 = var3.getDimensions();
         var3 = var3.getElementType();
         if (var3.getSort() != 10) {
            var5--;
            var3 = OBJECT_TYPE;
         }
      }

      int var6 = 0;
      if (var4.getSort() == 9) {
         var6 = var4.getDimensions();
         var4 = var4.getElementType();
         if (var4.getSort() != 10) {
            var6--;
            var4 = OBJECT_TYPE;
         }
      }

      if (var5 != var6) {
         return this.newArrayValue(OBJECT_TYPE, Math.min(var5, var6));
      }

      if (this.isAssignableFrom(var3, var4)) {
         return this.newArrayValue(var3, var5);
      }

      if (this.isAssignableFrom(var4, var3)) {
         return this.newArrayValue(var4, var5);
      }

      if (!this.isInterface(var3)) {
         while (!var3.equals(OBJECT_TYPE)) {
            var3 = this.getSuperClass(var3);
            if (this.isAssignableFrom(var3, var4)) {
               return this.newArrayValue(var3, var5);
            }
         }
      }

      return this.newArrayValue(OBJECT_TYPE, var5);
   }

   private BasicValue newArrayValue(Type var1, int var2) {
      if (var2 == 0) {
         return this.newValue(var1);
      }

      StringBuilder var3 = new StringBuilder();

      for (int var4 = 0; var4 < var2; var4++) {
         var3.append('[');
      }

      var3.append(var1.getDescriptor());
      return this.newValue(Type.getType(var3.toString()));
   }

   protected boolean isInterface(Type var1) {
      return this.currentClass != null && this.currentClass.equals(var1) ? this.isInterface : this.getClass(var1).isInterface();
   }

   protected Type getSuperClass(Type var1) {
      if (this.currentClass != null && this.currentClass.equals(var1)) {
         return this.currentSuperClass;
      }

      Class var2 = this.getClass(var1).getSuperclass();
      return var2 == null ? null : Type.getType(var2);
   }

   protected boolean isAssignableFrom(Type var1, Type var2) {
      if (var1.equals(var2)) {
         return true;
      }

      if (this.currentClass != null && this.currentClass.equals(var1)) {
         Type var5 = this.getSuperClass(var2);
         if (var5 == null) {
            return false;
         } else {
            return !this.isInterface ? this.isAssignableFrom(var1, var5) : var2.getSort() == 10 || var2.getSort() == 9;
         }
      } else {
         if (this.currentClass == null || !this.currentClass.equals(var2)) {
            return this.getClass(var1).isAssignableFrom(this.getClass(var2));
         }

         if (this.isAssignableFrom(var1, this.currentSuperClass)) {
            return true;
         }

         if (this.currentClassInterfaces != null) {
            for (Type var4 : this.currentClassInterfaces) {
               if (this.isAssignableFrom(var1, var4)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   protected Class<?> getClass(Type var1) {
      try {
         return var1.getSort() == 9
            ? Class.forName(var1.getDescriptor().replace('/', '.'), false, this.loader)
            : Class.forName(var1.getClassName(), false, this.loader);
      } catch (ClassNotFoundException var3) {
         throw new TypeNotPresentException(var3.toString(), var3);
      }
   }
}
