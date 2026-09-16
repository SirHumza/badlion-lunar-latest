package com.llamalad7.mixinextras.expression.impl.flow.postprocessing;

import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;

public enum MethodCallType {
   NORMAL,
   SUPER,
   STATIC;

   public boolean matches(FlowValue var1) {
      return var1.getDecoration("methodCallType") == this;
   }
}
