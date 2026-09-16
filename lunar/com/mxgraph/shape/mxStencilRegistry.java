package com.mxgraph.shape;

import java.util.HashMap;
import java.util.Map;

public class mxStencilRegistry {
   protected static Map<String, mxStencil> stencils = new HashMap<>();

   public static void addStencil(String var0, mxStencil var1) {
      stencils.put(var0, var1);
   }

   public static mxStencil getStencil(String var0) {
      return stencils.get(var0);
   }
}
