package com.moonsworth.lunar.ichor.util;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.commons.JSRInlinerAdapter;

public class IIRHCHHOICHRICOOCRORCCIOOIHOIR extends ClassVisitor {
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR(int var1, ClassVisitor var2) {
      super(var1, var2);
   }

   @Override
   public MethodVisitor visitMethod(int var1, String var2, String var3, String var4, String[] var5) {
      return new JSRInlinerAdapter(super.visitMethod(var1, var2, var3, var4, var5), var1, var2, var3, var4, var5);
   }
}
