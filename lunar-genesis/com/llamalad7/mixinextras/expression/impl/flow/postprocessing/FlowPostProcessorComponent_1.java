package com.llamalad7.mixinextras.expression.impl.flow.postprocessing;

import com.llamalad7.mixinextras.expression.impl.flow.DummyFlowValue;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.lib.apache.commons.tuple.Pair;
import java.util.ArrayList;

public class SplitNodeRemovalPostProcessor implements FlowPostProcessor {
   @Override
   public void process(FlowValue var1, FlowPostProcessor.OutputSink var2) {
      if (var1.getNext().size() > 1) {
         DummyFlowValue var3 = new DummyFlowValue(var1.getType());

         for (Pair var5 : new ArrayList<>(var1.getNext())) {
            FlowValue var6 = (FlowValue)var5.getLeft();
            int var7 = (Integer)var5.getRight();
            var6.setParent(var7, var3);
         }
      }
   }
}
