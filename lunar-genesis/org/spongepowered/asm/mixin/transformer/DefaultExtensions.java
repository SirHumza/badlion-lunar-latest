package org.spongepowered.asm.mixin.transformer;

import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.injection.invoke.arg.ArgsClassGenerator;
import org.spongepowered.asm.mixin.transformer.ext.Extensions;
import org.spongepowered.asm.mixin.transformer.ext.extensions.ExtensionCheckClass;
import org.spongepowered.asm.mixin.transformer.ext.extensions.ExtensionCheckInterfaces;
import org.spongepowered.asm.mixin.transformer.ext.extensions.ExtensionClassExporter;
import org.spongepowered.asm.mixin.transformer.ext.extensions.ExtensionLVTCleaner;
import org.spongepowered.asm.service.ISyntheticClassInfo;
import org.spongepowered.asm.util.IConsumer;

final class DefaultExtensions {
   static void create(MixinEnvironment var0, Extensions var1, final SyntheticClassRegistry var2, MixinCoprocessorNestHost var3) {
      IConsumer var4 = new IConsumer<ISyntheticClassInfo>() {
         public void accept(ISyntheticClassInfo var1) {
            var2.registerSyntheticClass(var1);
         }
      };
      var1.add(new ArgsClassGenerator(var4));
      var1.add(new InnerClassGenerator(var4, var3));
      var1.add(new ExtensionClassExporter(var0));
      var1.add(new ExtensionLVTCleaner());
      var1.add(new ExtensionCheckClass());
      var1.add(new ExtensionCheckInterfaces());
   }
}
