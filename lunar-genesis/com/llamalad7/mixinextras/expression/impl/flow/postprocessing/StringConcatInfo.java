package com.llamalad7.mixinextras.expression.impl.flow.postprocessing;

import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;

public class StringConcatInfo {
   public final boolean isFirstConcat;
   public final boolean isBuilder;
   public final FlowValue initialComponent;
   public final FlowValue toStringCall;

   public StringConcatInfo(boolean var1, boolean var2, FlowValue var3, FlowValue var4) {
      this.isFirstConcat = var1;
      this.isBuilder = var2;
      this.initialComponent = var3;
      this.toStringCall = var4;
   }
}
