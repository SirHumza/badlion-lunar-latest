package com.llamalad7.mixinextras.expression.impl.flow.postprocessing;

import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import org.objectweb.asm.Type;

public class InstantiationInfo {
   public final Type type;
   public final FlowValue initCall;

   public InstantiationInfo(Type var1, FlowValue var2) {
      this.type = var1;
      this.initCall = var2;
   }
}
