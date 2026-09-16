package org.lwjgl.actually3;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import sun.misc.Unsafe;

public class PointerDefault {
   protected static final Unsafe UNSAFE = getUnsafeInstance();
   protected static final long ADDRESS;
   protected static final long BUFFER_CONTAINER;
   protected static final long BUFFER_MARK;
   protected static final long BUFFER_POSITION;
   protected static final long BUFFER_LIMIT;
   protected static final long BUFFER_CAPACITY;
   protected long address;

   private static Unsafe getUnsafeInstance() {
      Field[] var0 = Unsafe.class.getDeclaredFields();
      Field[] var1 = var0;
      int var2 = var0.length;

      for (int var3 = 0; var3 < var2; var3++) {
         Field var4 = var1[var3];
         if (var4.getType().equals(Unsafe.class)) {
            int var5 = var4.getModifiers();
            if (Modifier.isStatic(var5) && Modifier.isFinal(var5)) {
               try {
                  var4.setAccessible(true);
                  return (Unsafe)var4.get(null);
               } catch (Exception var7) {
                  break;
               }
            }
         }
      }

      throw new UnsupportedOperationException("LWJGL requires sun.misc.Unsafe to be available.");
   }

   protected PointerDefault(long var1) {
      if (Checks.CHECKS && var1 == 0L) {
         throw new NullPointerException();
      }

      this.address = var1;
   }

   public long address() {
      return this.address;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof PointerDefault var2) ? false : this.address == var2.address();
      }
   }

   @Override
   public int hashCode() {
      return (int)(this.address ^ this.address >>> 32);
   }

   @Override
   public String toString() {
      return String.format("%s pointer [0x%X]", this.getClass().getSimpleName(), this.address);
   }

   protected static <T extends CustomBuffer<?>> T wrap(Class<? extends T> var0, long var1, int var3) {
      CustomBuffer var4;
      try {
         var4 = (CustomBuffer)UNSAFE.allocateInstance(var0);
      } catch (InstantiationException var7) {
         throw new UnsupportedOperationException(var7);
      }

      UNSAFE.putLong(var4, ADDRESS, var1);
      UNSAFE.putInt(var4, BUFFER_MARK, -1);
      UNSAFE.putInt(var4, BUFFER_LIMIT, var3);
      UNSAFE.putInt(var4, BUFFER_CAPACITY, var3);
      return (T)var4;
   }

   protected static <S extends CustomBuffer<?>, T extends CustomBuffer<?>> T wrap(Class<T> var0, S var1) {
      try {
         return wrap(var0, var1.address(), var1.remaining(), (ByteBuffer)var1.getClass().getDeclaredField("container").get(var1));
      } catch (Exception var3) {
         throw new RuntimeException(var3);
      }
   }

   protected static <T extends CustomBuffer<?>> T wrap(Class<? extends T> var0, long var1, int var3, ByteBuffer var4) {
      CustomBuffer var5;
      try {
         var5 = (CustomBuffer)UNSAFE.allocateInstance(var0);
      } catch (InstantiationException var8) {
         throw new UnsupportedOperationException(var8);
      }

      UNSAFE.putLong(var5, ADDRESS, var1);
      UNSAFE.putInt(var5, BUFFER_MARK, -1);
      UNSAFE.putInt(var5, BUFFER_LIMIT, var3);
      UNSAFE.putInt(var5, BUFFER_CAPACITY, var3);
      UNSAFE.putObject(var5, BUFFER_CONTAINER, var4);
      return (T)var5;
   }

   static {
      try {
         ADDRESS = UNSAFE.objectFieldOffset(PointerDefault.class.getDeclaredField("address"));
         BUFFER_CONTAINER = UNSAFE.objectFieldOffset(CustomBuffer.class.getDeclaredField("container"));
         BUFFER_MARK = UNSAFE.objectFieldOffset(CustomBuffer.class.getDeclaredField("mark"));
         BUFFER_POSITION = UNSAFE.objectFieldOffset(CustomBuffer.class.getDeclaredField("position"));
         BUFFER_LIMIT = UNSAFE.objectFieldOffset(CustomBuffer.class.getDeclaredField("limit"));
         BUFFER_CAPACITY = UNSAFE.objectFieldOffset(CustomBuffer.class.getDeclaredField("capacity"));
      } catch (Throwable var2) {
         throw new UnsupportedOperationException(var2);
      }
   }
}
