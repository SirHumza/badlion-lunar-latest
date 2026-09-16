package org.objectweb.asm.commons;

import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Type;
import org.objectweb.asm.signature.SignatureReader;
import org.objectweb.asm.signature.SignatureVisitor;
import org.objectweb.asm.signature.SignatureWriter;

public abstract class Remapper {
   private static final String LAMBDA_FACTORY_CLASSNAME = "java/lang/invoke/LambdaMetafactory";
   private static final String LAMBDA_FACTORY_METAFACTORY = "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;";
   private static final String LAMBDA_FACTORY_ALTMETAFACTORY = "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;";
   final int api;

   @Deprecated
   protected Remapper() {
      this.api = 0;
   }

   protected Remapper(int var1) {
      if (var1 != 589824 && var1 != 524288 && var1 != 458752 && var1 != 393216 && var1 != 327680 && var1 != 262144 && var1 != 17432576) {
         throw new IllegalArgumentException(stringConcat$0(var1));
      }

      this.api = var1;
   }

   public String mapDesc(String var1) {
      return this.mapType(Type.getType(var1)).getDescriptor();
   }

   private Type mapType(Type var1) {
      switch (var1.getSort()) {
         case 9:
            StringBuilder var2 = new StringBuilder();

            for (int var4 = 0; var4 < var1.getDimensions(); var4++) {
               var2.append('[');
            }

            var2.append(this.mapType(var1.getElementType()).getDescriptor());
            return Type.getType(var2.toString());
         case 10:
            String var3 = this.map(var1.getInternalName());
            return var3 != null ? Type.getObjectType(var3) : var1;
         case 11:
            return Type.getMethodType(this.mapMethodDesc(var1.getDescriptor()));
         default:
            return var1;
      }
   }

   public String mapType(String var1) {
      return var1 == null ? null : this.mapType(Type.getObjectType(var1)).getInternalName();
   }

   public String[] mapTypes(String[] var1) {
      String[] var2 = null;

      for (int var3 = 0; var3 < var1.length; var3++) {
         String var4 = var1[var3];
         String var5 = this.mapType(var4);
         if (var5 != null) {
            if (var2 == null) {
               var2 = (String[])var1.clone();
            }

            var2[var3] = var5;
         }
      }

      return var2 != null ? var2 : var1;
   }

   public String mapMethodDesc(String var1) {
      if ("()V".equals(var1)) {
         return var1;
      }

      StringBuilder var2 = new StringBuilder("(");

      for (Type var6 : Type.getArgumentTypes(var1)) {
         var2.append(this.mapType(var6).getDescriptor());
      }

      Type var7 = Type.getReturnType(var1);
      if (var7 == Type.VOID_TYPE) {
         var2.append(")V");
      } else {
         var2.append(')').append(this.mapType(var7).getDescriptor());
      }

      return var2.toString();
   }

   public Object mapValue(Object var1) {
      if (var1 instanceof Type) {
         return this.mapType((Type)var1);
      }

      if (var1 instanceof Handle) {
         Handle var10 = (Handle)var1;
         boolean var12 = var10.getTag() <= 4;
         return new Handle(
            var10.getTag(),
            this.mapType(var10.getOwner()),
            var12
               ? this.mapFieldName(var10.getOwner(), var10.getName(), var10.getDesc())
               : this.mapMethodName(var10.getOwner(), var10.getName(), var10.getDesc()),
            var12 ? this.mapDesc(var10.getDesc()) : this.mapMethodDesc(var10.getDesc()),
            var10.isInterface()
         );
      }

      if (!(var1 instanceof ConstantDynamic)) {
         return var1;
      }

      ConstantDynamic var2 = (ConstantDynamic)var1;
      String var3 = var2.getName();
      String var4 = var2.getDescriptor();
      Handle var5 = var2.getBootstrapMethod();
      int var6 = var2.getBootstrapMethodArgumentCount();
      Object[] var7 = new Object[var6];
      Object[] var8 = new Object[var6];

      for (int var9 = 0; var9 < var6; var9++) {
         var7[var9] = var2.getBootstrapMethodArgument(var9);
         var8[var9] = this.mapValue(var7[var9]);
      }

      if (this.api == 0) {
         var3 = this.mapInvokeDynamicMethodName(var3, var4);
      } else {
         var3 = this.mapInvokeDynamicMethodName(var3, var4, var5, var7);
      }

      return new ConstantDynamic(var3, this.mapDesc(var4), (Handle)this.mapValue(var5), var8);
   }

   public String mapSignature(String var1, boolean var2) {
      if (var1 == null) {
         return null;
      }

      SignatureReader var3 = new SignatureReader(var1);
      SignatureWriter var4 = new SignatureWriter();
      SignatureVisitor var5 = this.createSignatureRemapper(var4);
      if (var2) {
         var3.acceptType(var5);
      } else {
         var3.accept(var5);
      }

      return var4.toString();
   }

   @Deprecated
   protected SignatureVisitor createRemappingSignatureAdapter(SignatureVisitor var1) {
      return this.createSignatureRemapper(var1);
   }

   protected SignatureVisitor createSignatureRemapper(SignatureVisitor var1) {
      return new SignatureRemapper(var1, this);
   }

   public String mapAnnotationAttributeName(String var1, String var2) {
      return var2;
   }

   public String mapInnerClassName(String var1, String var2, String var3) {
      String var4 = this.mapType(var1);
      if (var4.equals(var1)) {
         return var3;
      }

      int var5 = var1.lastIndexOf(47);
      int var6 = var4.lastIndexOf(47);
      if (var5 != -1 && var6 != -1 && var1.substring(var5).equals(var4.substring(var6))) {
         return var3;
      }

      if (!var4.contains("$")) {
         return var3;
      }

      var5 = var4.lastIndexOf(36) + 1;

      while (var5 < var4.length() && Character.isDigit(var4.charAt(var5))) {
         var5++;
      }

      return var4.substring(var5);
   }

   public String mapMethodName(String var1, String var2, String var3) {
      return var2;
   }

   @Deprecated
   public String mapInvokeDynamicMethodName(String var1, String var2) {
      return var1;
   }

   public String mapInvokeDynamicMethodName(String var1, String var2, Handle var3, Object... var4) {
      String var5 = this.mapWellKnownInvokeDynamicMethodName(var1, var2, var3, var4);
      return var5 != null ? var5 : this.mapBasicInvokeDynamicMethodName(var1, var2, var3, var4);
   }

   public String mapWellKnownInvokeDynamicMethodName(String var1, String var2, Handle var3, Object... var4) {
      if ("java/lang/invoke/LambdaMetafactory".equals(var3.getOwner()) && var3.getTag() == 6) {
         boolean var5 = false;
         var5 |= "metafactory".equals(var3.getName())
            && "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;"
               .equals(var3.getDesc());
         var5 |= "altMetafactory".equals(var3.getName())
            && "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;"
               .equals(var3.getDesc());
         if (var5) {
            return this.mapMethodName(Type.getReturnType(var2).getInternalName(), var1, var4[0].toString());
         }
      }

      return null;
   }

   public String mapBasicInvokeDynamicMethodName(String var1, String var2, Handle var3, Object... var4) {
      return var1;
   }

   public String mapRecordComponentName(String var1, String var2, String var3) {
      return var2;
   }

   public String mapFieldName(String var1, String var2, String var3) {
      return var2;
   }

   public String mapPackageName(String var1) {
      return var1;
   }

   public String mapModuleName(String var1) {
      return var1;
   }

   public String map(String var1) {
      return var1;
   }
}
