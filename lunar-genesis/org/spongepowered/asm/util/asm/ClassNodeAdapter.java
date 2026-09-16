package org.spongepowered.asm.util.asm;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.tree.ClassNode;

public final class ClassNodeAdapter {
   private static final Field fdNestHost = getField("nestHostClass");
   private static final Field fdNestMembers = getField("nestMembers");
   private static boolean notSupported = false;

   private ClassNodeAdapter() {
   }

   public static String getNestHostClass(ClassNode var0) {
      if (ASM.isAtLeastVersion(7)) {
         return var0.nestHostClass;
      }

      if (fdNestHost != null && !notSupported) {
         try {
            return (String)fdNestHost.get(var0);
         } catch (ReflectiveOperationException var2) {
            notSupported = true;
            return null;
         }
      } else {
         return null;
      }
   }

   public static void setNestHostClass(ClassNode var0, String var1) {
      if (ASM.isAtLeastVersion(7)) {
         var0.nestHostClass = var1;
      }

      if (fdNestHost != null && !notSupported) {
         try {
            fdNestHost.set(var0, var1);
         } catch (ReflectiveOperationException var3) {
            notSupported = true;
         }
      }
   }

   public static List<String> getNestMembers(ClassNode var0) {
      if (ASM.isAtLeastVersion(7)) {
         return var0.nestMembers;
      }

      if (fdNestMembers != null && !notSupported) {
         try {
            return (List<String>)fdNestMembers.get(var0);
         } catch (ReflectiveOperationException var2) {
            notSupported = true;
            return null;
         }
      } else {
         return null;
      }
   }

   public static List<String> getNestMembersAsList(ClassNode var0) {
      List var1 = getNestMembers(var0);
      if (var1 == null) {
         var1 = new ArrayList();
         setNestMembers(var0, var1);
      }

      return var1;
   }

   public static void setNestMembers(ClassNode var0, List<String> var1) {
      if (ASM.isAtLeastVersion(7)) {
         var0.nestMembers = var1;
      } else if (fdNestMembers != null && !notSupported) {
         try {
            fdNestMembers.set(var0, var1);
         } catch (ReflectiveOperationException var3) {
            notSupported = true;
         }
      }
   }

   private static Field getField(String var0) {
      try {
         return ClassNode.class.getDeclaredField(var0);
      } catch (NoSuchFieldException var4) {
         try {
            return ClassNode.class.getDeclaredField(var0 + "Experimental");
         } catch (NoSuchFieldException var3) {
            notSupported = true;
            return null;
         }
      }
   }
}
