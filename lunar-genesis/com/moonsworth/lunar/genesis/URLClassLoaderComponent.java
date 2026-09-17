package com.moonsworth.lunar.genesis;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends URLClassLoader {
   private static final Set<String> RICCIRRRHRHRCHOOHHCIRHCCOCHCCH = new HashSet<>();
   private final String IHIRCHROHCOCCOHOCOHCOCHOIHHRCR;
   private final ClassLoader OOHOIORHRRHOOORHHCCHHCOIOOCROH;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, URL[] var2, ClassLoader var3) {
      super(var2, var3.getParent());
      this.IHIRCHROHCOCCOHOCOHCOCHOIHHRCR = "Bootstrap#" + var1;
      this.OOHOIORHRRHOOORHHCCHHCOIOOCROH = var3;
   }

   @Override
   public void addURL(URL var1) {
      super.addURL(var1);
   }

   public <In, Out, F extends Function<In, Out>> Out IRCIIHHICIHRCOCRROCOICRIHHCCHH(Class<F> var1, In var2) {
      try {
         Class var3 = var2.getClass();
         Class var4 = Class.forName(var1.getName(), true, this);
         Object var5 = var4.getConstructor().newInstance();
         Class var6 = Class.forName(var2.getClass().getName(), true, this);
         Method var7 = var4.getMethod("apply", var6);
         ArrayList var8 = new ArrayList();

         for (Field var12 : var3.getDeclaredFields()) {
            Method var13 = var3.getMethod(var12.getName());
            var8.add(var13.invoke(var2));
         }

         Constructor var16 = var6.getConstructors()[0];
         var2 = var16.newInstance(var8.toArray());
         return (Out)var7.invoke(var5, var2);
      } catch (Throwable var14) {
         throw var14;
      }
   }

   @Override
   protected Class<?> findClass(String var1) {
      try {
         return RICCIRRRHRHRCHOOHHCIRHCCOCHCCH.contains(var1) ? this.OOHOIORHRRHOOORHHCCHHCOIOOCROH.loadClass(var1) : super.findClass(var1);
      } catch (Throwable var3) {
         throw var3;
      }
   }

   @Override
   public String getName() {
      return this.IHIRCHROHCOCCOHOCOHCOCHOIHHRCR;
   }

   static {
      RICCIRRRHRHRCHOOHHCIRHCCOCHCCH.add(IRCIIHHICIHRCOCRROCOICRIHHCCHH.class.getName());
   }
}
