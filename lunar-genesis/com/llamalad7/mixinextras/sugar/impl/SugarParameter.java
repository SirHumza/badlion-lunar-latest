package com.llamalad7.mixinextras.sugar.impl;

import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;

public class SugarParameter {
   public final AnnotationNode sugar;
   public final Type type;
   public final Type genericType;
   public final int lvtIndex;
   public final int paramIndex;

   SugarParameter(AnnotationNode var1, Type var2, Type var3, int var4, int var5) {
      this.sugar = var1;
      this.type = var2;
      this.genericType = var3;
      this.lvtIndex = var4;
      this.paramIndex = var5;
   }
}
