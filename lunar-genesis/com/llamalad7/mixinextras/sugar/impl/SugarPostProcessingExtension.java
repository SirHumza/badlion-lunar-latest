package com.llamalad7.mixinextras.sugar.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.transformer.ext.IExtension;
import org.spongepowered.asm.mixin.transformer.ext.ITargetClassContext;

public class SugarPostProcessingExtension implements IExtension {
   private static final Map<String, List<SugarPostProcessingExtension.Task>> POST_PROCESSING_TASKS = new HashMap<>();

   static void enqueuePostProcessing(SugarApplicator var0, Runnable var1) {
      POST_PROCESSING_TASKS.computeIfAbsent(var0.info.getClassNode().name, var0x -> new ArrayList<>())
         .add(new SugarPostProcessingExtension.Task(var0.postProcessingPriority(), var1));
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
      String var2 = var1.getClassNode().name;
      List var3 = POST_PROCESSING_TASKS.remove(var2);
      if (var3 != null) {
         Collections.sort(var3);
         var3.forEach(SugarPostProcessingExtension.Task::run);
      }
   }

   @Override
   public void export(MixinEnvironment var1, String var2, boolean var3, ClassNode var4) {
   }

   private static class Task implements Comparable<SugarPostProcessingExtension.Task> {
      private final int priority;
      private final Runnable body;

      public Task(int var1, Runnable var2) {
         this.priority = var1;
         this.body = var2;
      }

      public void run() {
         this.body.run();
      }

      public int compareTo(SugarPostProcessingExtension.Task var1) {
         return Integer.compare(this.priority, var1.priority);
      }
   }
}
