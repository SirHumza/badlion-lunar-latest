package org.objectweb.asm.commons;

import java.util.Collections;
import java.util.Map;
import org.objectweb.asm.Handle;

public class SimpleRemapper extends Remapper {
   private final Map<String, String> mapping;

   @Deprecated
   public SimpleRemapper(Map<String, String> var1) {
      this.mapping = var1;
   }

   public SimpleRemapper(int var1, Map<String, String> var2) {
      super(var1);
      this.mapping = var2;
   }

   @Deprecated
   public SimpleRemapper(String var1, String var2) {
      this.mapping = Collections.singletonMap(var1, var2);
   }

   public SimpleRemapper(int var1, String var2, String var3) {
      super(var1);
      this.mapping = Collections.singletonMap(var2, var3);
   }

   @Override
   public String mapMethodName(String var1, String var2, String var3) {
      String var4 = this.map(stringConcat$0(var1, var2, var3));
      return var4 == null ? var2 : var4;
   }

   @Deprecated
   @Override
   public String mapInvokeDynamicMethodName(String var1, String var2) {
      String var3 = this.map(stringConcat$1(var1, var2));
      return var3 == null ? var1 : var3;
   }

   @Override
   public String mapBasicInvokeDynamicMethodName(String var1, String var2, Handle var3, Object... var4) {
      String var5 = this.map(stringConcat$2(var1, var2));
      return var5 == null ? var1 : var5;
   }

   @Override
   public String mapAnnotationAttributeName(String var1, String var2) {
      String var3 = this.map(stringConcat$3(var1, var2));
      return var3 == null ? var2 : var3;
   }

   @Override
   public String mapFieldName(String var1, String var2, String var3) {
      String var4 = this.map(stringConcat$4(var1, var2));
      return var4 == null ? var2 : var4;
   }

   @Override
   public String map(String var1) {
      return this.mapping.get(var1);
   }
}
