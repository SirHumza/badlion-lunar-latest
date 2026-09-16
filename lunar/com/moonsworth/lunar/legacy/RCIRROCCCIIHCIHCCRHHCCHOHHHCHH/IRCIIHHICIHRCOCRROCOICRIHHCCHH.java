package com.moonsworth.lunar.legacy.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH;
import java.awt.image.BufferedImage;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.IntBuffer;
import java.util.function.Supplier;
import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Cursor;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final MethodHandle HIHHORIHRIIHIOROHRRCROOIHRRHOO;
   private static final MethodHandle CHOOOIHHRCRIIIOORCOCHHHOOROICO;
   private static final MethodHandle OCICRHIICCRIOHCRRCIOOIHIOHHCOC;

   @Override
   public boolean OIHCOHRCICCCRHRCROOCIOIRRHHHIH(int var1) {
      return Mouse.isButtonDown(var1);
   }

   @Override
   public int getX() {
      return Mouse.getX();
   }

   @Override
   public int getY() {
      return Mouse.getY();
   }

   public static int CHOOOHOIIRRCRCIHRORHIOOCIHHOHC() {
      byte var0 = 0;
      if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
         var0 |= 1;
      }

      if (Keyboard.isKeyDown(29) || Keyboard.isKeyDown(157)) {
         var0 |= 2;
      }

      if (Keyboard.isKeyDown(56) || Keyboard.isKeyDown(184)) {
         var0 |= 4;
      }

      return var0;
   }

   @Override
   public void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(int var1, int var2, int var3) {
      try {
         HIHHORIHRIIHIOROHRRCROOIHRRHOO.invokeExact((int)var1);
         CHOOOIHHRCRIIIOORCOCHHHOOROICO.invokeExact((int)var2);
         OCICRHIICCRIOHCRRCIOOIHIOHHCOC.invokeExact((int)var3);
      } catch (Throwable var5) {
         throw new RuntimeException(var5);
      }
   }

   public Cursor IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1, Supplier<BufferedImage> var2, int var3, int var4) {
      try {
         BufferedImage var5 = (BufferedImage)var2.get();
         if (var5 == null) {
            return null;
         }

         int var6 = Cursor.getMaxCursorSize();
         if (var6 > 64) {
            var6 = 64;
         }

         IntBuffer var7 = BufferUtils.createIntBuffer(var6 * var6);

         for (int var8 = 0; var8 < var6 * var6; var8++) {
            int var9 = var8 % var6;
            int var10 = var8 / var6;
            if (var9 < var5.getWidth() && var10 < var5.getHeight()) {
               var7.put(var5.getRGB(var9, var5.getHeight() - 1 - var10));
            } else {
               var7.put(0);
            }
         }

         var7.flip();
         return new Cursor(var6, var6, var3, var4, 1, var7, null);
      } catch (LWJGLException var11) {
         var11.printStackTrace();
         return null;
      }
   }

   @Override
   public void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(Object var1) {
      try {
         Mouse.setNativeCursor((Cursor)var1);
      } catch (LWJGLException var3) {
         var3.printStackTrace();
      }
   }

   @Override
   public void ORRIOIICRHIRHICIHHRRIHOICCHHCI() {
      try {
         Mouse.setNativeCursor(null);
      } catch (LWJGLException var2) {
         var2.printStackTrace();
      }
   }

   static {
      try {
         Lookup var0 = MethodHandles.privateLookupIn(Mouse.class, MethodHandles.lookup());
         HIHHORIHRIIHIOROHRRCROOIHRRHOO = var0.findStaticSetter(Mouse.class, "event_dx", int.class);
         CHOOOIHHRCRIIIOORCOCHHHOOROICO = var0.findStaticSetter(Mouse.class, "event_dy", int.class);
         OCICRHIICCRIOHCRRCIOOIHIOHHCOC = var0.findStaticSetter(Mouse.class, "event_dwheel", int.class);
      } catch (NoSuchFieldException | IllegalAccessException var1) {
         throw new ExceptionInInitializerError(var1);
      }
   }
}
