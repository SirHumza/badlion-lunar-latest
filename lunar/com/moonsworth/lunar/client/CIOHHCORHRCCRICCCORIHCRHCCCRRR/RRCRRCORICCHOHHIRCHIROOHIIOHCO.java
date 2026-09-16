package com.moonsworth.lunar.client.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import org.lwjgl.system.FunctionProvider;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO implements FunctionProvider {
   private static Class<?> IHCCRHIROHHOIIOHHOIOHRHIOORIHR;
   private final Method IRHOCRIOIIHRORCCOORHOCIRROOHRC;

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
      try {
         this.IRHOCRIOIIHRORCCOORHOCIRROOHRC = IHCCRHIROHHOIIOHHOIOHRHIOORIHR.getDeclaredMethod("getFunctionAddress", String.class);
         this.IRHOCRIOIIHRORCCOORHOCIRROOHRC.setAccessible(true);
      } catch (Exception var2) {
         throw new RuntimeException(var2);
      }
   }

   public long getFunctionAddress(CharSequence var1) {
      try {
         return (Long)this.IRHOCRIOIIHRORCCOORHOCIRROOHRC.invoke(null, var1.toString());
      } catch (Exception var3) {
         throw new RuntimeException(var3);
      }
   }

   public long getFunctionAddress(ByteBuffer var1) {
      throw new UnsupportedOperationException();
   }

   static {
      if (!(RRCRRCORICCHOHHIRCHIROOHIIOHCO.class.getClassLoader() instanceof com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH)) {
         try {
            IHCCRHIROHHOIIOHHOIOHRHIOORIHR = Class.forName("org.lwjgl.opengl.GLContext", true, RRCRRCORICCHOHHIRCHIROOHIIOHCO.class.getClassLoader());
         } catch (ReflectiveOperationException var1) {
            throw new RuntimeException(var1);
         }
      }
   }
}
