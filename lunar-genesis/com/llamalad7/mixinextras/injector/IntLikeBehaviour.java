package com.llamalad7.mixinextras.injector;

import com.llamalad7.mixinextras.expression.impl.utils.ExpressionASMUtils;
import com.llamalad7.mixinextras.utils.CompatibilityHelper;
import java.util.Arrays;
import org.objectweb.asm.Type;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;

public abstract class IntLikeBehaviour {
   private IntLikeBehaviour() {
   }

   public Type transform(InjectionInfo var1, Type var2, Type var3) {
      return !var2.getDescriptor().contains(ExpressionASMUtils.INTLIKE_TYPE.getDescriptor()) ? var2 : this.transformImpl(var1, var2, var3);
   }

   protected abstract Type transformImpl(InjectionInfo var1, Type var2, Type var3);

   protected Type replaceIntLike(InjectionInfo var1, Type var2, Type var3) {
      if (!ExpressionASMUtils.isIntLike(var3)) {
         throw CompatibilityHelper.makeInvalidInjectionException(var1, String.format("Expected int-like type (boolean, byte, char, short, int), got %s", var3));
      }

      Type var4 = var2.getReturnType();
      if (var4.equals(ExpressionASMUtils.INTLIKE_TYPE)) {
         var4 = var3;
      }

      Type[] var5 = Arrays.stream(var2.getArgumentTypes()).map(var1x -> var1x.equals(ExpressionASMUtils.INTLIKE_TYPE) ? var3 : var1x).toArray(Type[]::new);
      return Type.getMethodType(var4, var5);
   }

   public static class MatchArgType extends IntLikeBehaviour {
      private final int index;

      public MatchArgType(int var1) {
         this.index = var1;
      }

      @Override
      public Type transformImpl(InjectionInfo var1, Type var2, Type var3) {
         if (this.index >= var3.getArgumentTypes().length) {
            throw CompatibilityHelper.makeInvalidInjectionException(
               var1, String.format("Expected int-like type for arg %s (boolean, byte, char, short, int), signature was %s", this.index, var3.getDescriptor())
            );
         } else {
            return this.replaceIntLike(var1, var2, var3.getArgumentTypes()[this.index]);
         }
      }
   }

   public static class MatchReturnType extends IntLikeBehaviour {
      public static final IntLikeBehaviour.MatchReturnType INSTANCE = new IntLikeBehaviour.MatchReturnType();

      @Override
      public Type transformImpl(InjectionInfo var1, Type var2, Type var3) {
         return this.replaceIntLike(var1, var2, var3.getReturnType());
      }
   }
}
