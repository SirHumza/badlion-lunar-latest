package com.llamalad7.mixinextras.expression.impl.flow.postprocessing;

import org.objectweb.asm.Handle;

public class LMFInfo {
   public final Handle impl;
   public final LMFInfo.Type type;

   public LMFInfo(Handle var1, LMFInfo.Type var2) {
      this.impl = var1;
      this.type = var2;
   }

   public enum Type {
      FREE_METHOD,
      BOUND_METHOD,
      INSTANTIATION;
   }
}
