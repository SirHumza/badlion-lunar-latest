package org.spongepowered.asm.service.modlauncher;

import cpw.mods.modlauncher.serviceapi.ILaunchPluginService.Phase;
import java.util.EnumSet;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.launch.IClassProcessor;
import org.spongepowered.asm.launch.Phases;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.transformer.IMixinTransformer;
import org.spongepowered.asm.mixin.transformer.IMixinTransformerFactory;
import org.spongepowered.asm.service.ISyntheticClassRegistry;
import org.spongepowered.include.com.google.common.base.Preconditions;

public class MixinTransformationHandler implements IClassProcessor {
   private IMixinTransformerFactory transformerFactory;
   private IMixinTransformer transformer;
   private ISyntheticClassRegistry registry;

   void offer(IMixinTransformerFactory var1) {
      Preconditions.checkNotNull(var1, "transformerFactory");
      this.transformerFactory = var1;
   }

   @Override
   public EnumSet<Phase> handlesClass(Type var1, boolean var2, String var3) {
      if (!var2) {
         return Phases.AFTER_ONLY;
      } else if (this.registry == null) {
         return null;
      } else {
         return this.generatesClass(var1) ? Phases.AFTER_ONLY : null;
      }
   }

   @Override
   public boolean generatesClass(Type var1) {
      return this.registry.findSyntheticClass(var1.getClassName()) != null;
   }

   @Override
   public synchronized boolean processClass(Phase var1, ClassNode var2, Type var3, String var4) {
      if (var1 == Phase.BEFORE) {
         return false;
      }

      if (this.transformer == null) {
         if (this.transformerFactory == null) {
            throw new IllegalStateException("processClass called before transformer factory offered to transformation handler");
         }

         this.transformer = this.transformerFactory.createTransformer();
         this.registry = this.transformer.getExtensions().getSyntheticClassRegistry();
      }

      if ("mixin".equals(var4)) {
         return false;
      }

      if (this.generatesClass(var3)) {
         return this.generateClass(var3, var2);
      }

      MixinEnvironment var5 = MixinEnvironment.getCurrentEnvironment();
      return "computing_frames".equals(var4)
         ? this.transformer.computeFramesForClass(var5, var3.getClassName(), var2)
         : this.transformer.transformClass(var5, var3.getClassName(), var2);
   }

   @Override
   public boolean generateClass(Type var1, ClassNode var2) {
      return this.transformer.generateClass(MixinEnvironment.getCurrentEnvironment(), var1.getClassName(), var2);
   }
}
