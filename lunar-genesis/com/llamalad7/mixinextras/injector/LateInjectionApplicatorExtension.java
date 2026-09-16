package com.llamalad7.mixinextras.injector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.transformer.ext.IExtension;
import org.spongepowered.asm.mixin.transformer.ext.ITargetClassContext;

public class LateInjectionApplicatorExtension implements IExtension {
   private static final Map<ITargetClassContext, Map<String, List<Runnable[]>>> QUEUED_INJECTIONS = Collections.synchronizedMap(new HashMap<>());

   static void offerInjection(ITargetClassContext var0, LateApplyingInjectorInfo var1) {
      Map var2 = QUEUED_INJECTIONS.computeIfAbsent(var0, var0x -> initializeMap());
      ((List)var2.get(var1.getLateInjectionType())).add(new Runnable[]{var1::lateInject, var1::latePostInject});
   }

   @Override
   public boolean checkActive(MixinEnvironment var1) {
      return true;
   }

   @Override
   public void preApply(ITargetClassContext var1) {
   }

   @Override
   public void postApply(ITargetClassContext var1) {
      Map var2 = QUEUED_INJECTIONS.get(var1);
      if (var2 != null) {
         for (List var4 : var2.values()) {
            for (Runnable[] var6 : var4) {
               var6[0].run();
            }

            for (Runnable[] var8 : var4) {
               var8[1].run();
            }
         }

         QUEUED_INJECTIONS.remove(var1);
      }
   }

   @Override
   public void export(MixinEnvironment var1, String var2, boolean var3, ClassNode var4) {
   }

   private static Map<String, List<Runnable[]>> initializeMap() {
      LinkedHashMap var0 = new LinkedHashMap();
      var0.put("ModifyExpressionValue", new ArrayList());
      var0.put("WrapWithCondition", new ArrayList());
      var0.put("WrapOperation", new ArrayList());
      return var0;
   }
}
