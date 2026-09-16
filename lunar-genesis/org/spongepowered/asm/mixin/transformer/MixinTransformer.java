package org.spongepowered.asm.mixin.transformer;

import java.lang.reflect.Constructor;
import java.util.List;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.throwables.MixinException;
import org.spongepowered.asm.mixin.transformer.ext.Extensions;
import org.spongepowered.asm.mixin.transformer.ext.IExtensionRegistry;
import org.spongepowered.asm.mixin.transformer.ext.IHotSwap;
import org.spongepowered.asm.transformers.TreeTransformer;
import org.spongepowered.asm.util.asm.ASM;

final class MixinTransformer extends TreeTransformer implements IMixinTransformer {
   private final SyntheticClassRegistry syntheticClassRegistry;
   private final Extensions extensions;
   private final IHotSwap hotSwapper;
   private final MixinCoprocessorNestHost nestHostCoprocessor;
   private final MixinProcessor processor;
   private final MixinClassGenerator generator;

   MixinTransformer() {
      MixinEnvironment var1 = MixinEnvironment.getCurrentEnvironment();
      Object var2 = var1.getActiveTransformer();
      if (var2 instanceof IMixinTransformer) {
         throw new MixinException("Terminating MixinTransformer instance " + this);
      }

      var1.setActiveTransformer(this);
      this.syntheticClassRegistry = new SyntheticClassRegistry();
      this.extensions = new Extensions(this.syntheticClassRegistry);
      this.hotSwapper = this.initHotSwapper(var1);
      this.nestHostCoprocessor = new MixinCoprocessorNestHost();
      this.processor = new MixinProcessor(var1, this.extensions, this.hotSwapper, this.nestHostCoprocessor);
      this.generator = new MixinClassGenerator(var1, this.extensions);
      DefaultExtensions.create(var1, this.extensions, this.syntheticClassRegistry, this.nestHostCoprocessor);
   }

   private IHotSwap initHotSwapper(MixinEnvironment var1) {
      if (!var1.getOption(MixinEnvironment.Option.HOT_SWAP)) {
         return null;
      }

      try {
         MixinProcessor.logger.info("Attempting to load Hot-Swap agent");
         Class var2 = Class.forName("org.spongepowered.tools.agent.MixinAgent");
         Constructor var3 = var2.getDeclaredConstructor(IMixinTransformer.class);
         return (IHotSwap)var3.newInstance(this);
      } catch (Throwable var4) {
         MixinProcessor.logger
            .info("Hot-swap agent could not be loaded, hot swapping of mixins won't work. {}: {}", var4.getClass().getSimpleName(), var4.getMessage());
         return null;
      }
   }

   @Override
   public IExtensionRegistry getExtensions() {
      return this.extensions;
   }

   @Override
   public String getName() {
      return this.getClass().getName();
   }

   @Override
   public boolean isDelegationExcluded() {
      return true;
   }

   @Override
   public void audit(MixinEnvironment var1) {
      this.processor.audit(var1);
   }

   @Override
   public List<String> reload(String var1, ClassNode var2) {
      return this.processor.reload(var1, var2);
   }

   @Override
   public byte[] transformClassBytes(String var1, String var2, byte[] var3) {
      if (var2 == null) {
         return var3;
      }

      MixinEnvironment var4 = MixinEnvironment.getCurrentEnvironment();
      return var3 == null ? this.generateClass(var4, var2) : this.transformClass(var4, var2, var3);
   }

   @Override
   public boolean computeFramesForClass(MixinEnvironment var1, String var2, ClassNode var3) {
      return false;
   }

   @Override
   public synchronized byte[] transformClass(MixinEnvironment var1, String var2, byte[] var3) {
      if (!this.couldTransformClass(var1, var2)) {
         return var3;
      }

      ClassNode var4 = this.readClass(var2, var3);
      return this.processor.applyMixins(var1, var2, var4) ? this.writeClass(var4) : var3;
   }

   @Override
   public synchronized boolean transformClass(MixinEnvironment var1, String var2, ClassNode var3) {
      return this.processor.applyMixins(var1, var2, var3);
   }

   @Override
   public synchronized boolean couldTransformClass(MixinEnvironment var1, String var2) {
      return this.processor.couldTransformClass(var1, var2);
   }

   @Override
   public synchronized byte[] generateClass(MixinEnvironment var1, String var2) {
      ClassNode var3 = createEmptyClass(var2);
      return this.generator.generateClass(var1, var2, var3) ? this.writeClass(var3) : null;
   }

   @Override
   public synchronized boolean generateClass(MixinEnvironment var1, String var2, ClassNode var3) {
      return this.generator.generateClass(var1, var2, var3);
   }

   private static ClassNode createEmptyClass(String var0) {
      ClassNode var1 = new ClassNode(ASM.API_VERSION);
      var1.name = var0.replace('.', '/');
      var1.version = MixinEnvironment.getCompatibilityLevel().getClassVersion();
      var1.superName = "java/lang/Object";
      return var1;
   }

   static class Factory implements IMixinTransformerFactory {
      @Override
      public IMixinTransformer createTransformer() {
         return new MixinTransformer();
      }
   }
}
