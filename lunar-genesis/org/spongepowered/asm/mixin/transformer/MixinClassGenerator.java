package org.spongepowered.asm.mixin.transformer;

import java.util.Locale;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.transformer.ext.Extensions;
import org.spongepowered.asm.mixin.transformer.ext.IClassGenerator;
import org.spongepowered.asm.service.IMixinAuditTrail;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.perf.Profiler;

public class MixinClassGenerator {
   static final ILogger logger = MixinService.getService().getLogger("mixin");
   private final Extensions extensions;
   private final Profiler profiler;
   private final IMixinAuditTrail auditTrail;

   MixinClassGenerator(MixinEnvironment var1, Extensions var2) {
      this.extensions = var2;
      this.profiler = Profiler.getProfiler("generator");
      this.auditTrail = MixinService.getService().getAuditTrail();
   }

   synchronized boolean generateClass(MixinEnvironment var1, String var2, ClassNode var3) {
      if (var2 == null) {
         logger.warn("MixinClassGenerator tried to generate a class with no name!");
         return false;
      }

      for (IClassGenerator var5 : this.extensions.getGenerators()) {
         Profiler.Section var6 = this.profiler.begin("generator", var5.getClass().getSimpleName().toLowerCase(Locale.ROOT));
         boolean var7 = var5.generate(var2, var3);
         var6.end();
         if (var7) {
            if (this.auditTrail != null) {
               this.auditTrail.onGenerate(var2, var5.getName());
            }

            this.extensions.export(var1, var2.replace('.', '/'), false, var3);
            return true;
         }
      }

      return false;
   }
}
