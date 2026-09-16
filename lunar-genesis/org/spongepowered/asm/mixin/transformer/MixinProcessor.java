package org.spongepowered.asm.mixin.transformer;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.UUID;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.logging.Level;
import org.spongepowered.asm.mixin.FabricUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.extensibility.IMixinConfig;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinErrorHandler;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorDynamic;
import org.spongepowered.asm.mixin.throwables.ClassAlreadyLoadedException;
import org.spongepowered.asm.mixin.throwables.MixinApplyError;
import org.spongepowered.asm.mixin.throwables.MixinException;
import org.spongepowered.asm.mixin.transformer.ext.Extensions;
import org.spongepowered.asm.mixin.transformer.ext.IHotSwap;
import org.spongepowered.asm.mixin.transformer.ext.extensions.ExtensionClassExporter;
import org.spongepowered.asm.mixin.transformer.throwables.IllegalClassLoadError;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;
import org.spongepowered.asm.mixin.transformer.throwables.MixinTransformerError;
import org.spongepowered.asm.mixin.transformer.throwables.ReEntrantTransformerError;
import org.spongepowered.asm.service.IMixinAuditTrail;
import org.spongepowered.asm.service.IMixinService;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.PrettyPrinter;
import org.spongepowered.asm.util.ReEntranceLock;
import org.spongepowered.asm.util.perf.Profiler;

class MixinProcessor {
   static final ILogger logger = MixinService.getService().getLogger("mixin");
   private final IMixinService service = MixinService.getService();
   private final List<MixinConfig> configs = new ArrayList<>();
   private final List<MixinConfig> pendingConfigs = new ArrayList<>();
   private final ReEntranceLock lock;
   private final String sessionId = UUID.randomUUID().toString();
   private final Extensions extensions;
   private final IHotSwap hotSwapper;
   private final MixinCoprocessors coprocessors = new MixinCoprocessors();
   private final Profiler profiler;
   private final IMixinAuditTrail auditTrail;
   private MixinEnvironment currentEnvironment;
   private Level verboseLoggingLevel = Level.DEBUG;
   private boolean errorState = false;
   private int transformedCount = 0;

   MixinProcessor(MixinEnvironment var1, Extensions var2, IHotSwap var3, MixinCoprocessorNestHost var4) {
      this.lock = this.service.getReEntranceLock();
      this.extensions = var2;
      this.hotSwapper = var3;
      this.coprocessors.add(new MixinCoprocessorPassthrough());
      this.coprocessors.add(new MixinCoprocessorAccessor(this.sessionId));
      this.coprocessors.add(var4);
      this.profiler = Profiler.getProfiler("mixin");
      this.auditTrail = this.service.getAuditTrail();
   }

   public void audit(MixinEnvironment var1) {
      HashSet var2 = new HashSet();

      for (MixinConfig var4 : this.configs) {
         var2.addAll(var4.getUnhandledTargets());
      }

      ILogger var10 = MixinService.getService().getLogger("mixin.audit");

      for (String var5 : var2) {
         try {
            var10.info("Force-loading class {}", var5);
            this.service.getClassProvider().findClass(var5, false);
         } catch (ClassNotFoundException var9) {
            var10.error("Could not force-load " + var5, var9);
         }
      }

      for (MixinConfig var13 : this.configs) {
         for (String var7 : var13.getUnhandledTargets()) {
            ClassAlreadyLoadedException var8 = new ClassAlreadyLoadedException(var7 + " was already classloaded");
            var10.error("Could not force-load " + var7, var8);
         }
      }

      if (var1.getOption(MixinEnvironment.Option.DEBUG_PROFILER)) {
         Profiler.printAuditSummary();
      }
   }

   synchronized boolean applyMixins(MixinEnvironment var1, String var2, ClassNode var3) {
      if (var2 != null && !this.errorState) {
         Profiler.Section var4 = this.profiler.begin("mixin");

         boolean var5;
         try {
            var5 = this.lockAndSelect(var1, var2);
         } catch (Throwable var19) {
            var4.end();
            throw var19;
         }

         boolean var6 = false;

         try {
            MixinCoprocessor.ProcessResult var7 = this.coprocessors.process(var2, var3);
            var6 |= var7.isTransformed();
            if (var7.isPassthrough()) {
               for (MixinCoprocessor var28 : this.coprocessors) {
                  var6 |= var28.postProcess(var2, var3);
               }

               if (this.auditTrail != null) {
                  this.auditTrail.onPostProcess(var2);
               }

               this.extensions.export(var1, var2, false, var3);
               return var6;
            }

            MixinConfig var8 = null;

            for (MixinConfig var10 : this.configs) {
               if (var10.packageMatch(var2)) {
                  int var11 = var8 != null ? var8.getMixinPackage().length() : 0;
                  if (var10.getMixinPackage().length() > var11) {
                     var8 = var10;
                  }
               }
            }

            if (var8 != null) {
               ClassInfo var27 = ClassInfo.fromClassNode(var3);
               if (!var27.hasSuperClass(InjectionPoint.class) && !var27.hasSuperClass(ITargetSelectorDynamic.class)) {
                  throw new IllegalClassLoadError(this.getInvalidClassError(var2, var3, var8));
               }

               return var6;
            }

            TreeSet var26 = null;

            for (MixinConfig var32 : this.configs) {
               if (var32.hasMixinsFor(var2)) {
                  if (var26 == null) {
                     var26 = new TreeSet();
                  }

                  var26.addAll(var32.getMixinsFor(var2));
               }
            }

            if (var26 != null) {
               if (var5) {
                  ReEntrantTransformerError var31 = new ReEntrantTransformerError("Re-entrance error.");
                  logger.warn("Re-entrance detected, this will cause serious problems.", var31);
                  throw var31;
               }

               if (this.hotSwapper != null) {
                  this.hotSwapper.registerTargetClass(var2, var3);
               }

               try {
                  TargetClassContext var30 = new TargetClassContext(var1, this.extensions, this.sessionId, var2, var3, var26);
                  var30.applyMixins();
                  var6 |= this.coprocessors.postProcess(var2, var3);
                  if (var30.isExported()) {
                     this.extensions.export(var1, var30.getClassName(), var30.isExportForced(), var30.getClassNode());
                  }

                  for (InvalidMixinException var12 : var30.getSuppressedExceptions()) {
                     this.handleMixinApplyError(var30.getClassName(), var12, var1);
                  }

                  this.transformedCount++;
                  var6 = true;
               } catch (InvalidMixinException var20) {
                  this.dumpClassOnFailure(var2, var3, var1);
                  this.handleMixinApplyError(var2, var20, var1);
               }
            } else if (this.coprocessors.postProcess(var2, var3)) {
               var6 = true;
               this.extensions.export(var1, var2, false, var3);
            }
         } catch (MixinTransformerError var21) {
            throw var21;
         } catch (Throwable var22) {
            this.dumpClassOnFailure(var2, var3, var1);
            throw new MixinTransformerError("An unexpected critical error was encountered", var22);
         } finally {
            this.lock.pop();
            var4.end();
         }

         return var6;
      } else {
         return false;
      }
   }

   synchronized boolean couldTransformClass(MixinEnvironment var1, String var2) {
      if (var1 != MixinEnvironment.getCurrentEnvironment()) {
         throw new MixinException("Current environment must match the supplied environment");
      }

      if (var2 != null && !this.errorState) {
         this.lockAndSelect(var1, var2);

         try {
            if (this.coprocessors.processingCouldTransform(var2)) {
               return true;
            }

            for (MixinConfig var4 : this.configs) {
               if (var4.packageMatch(var2)) {
                  return true;
               }
            }

            for (MixinConfig var10 : this.configs) {
               if (var10.hasMixinsFor(var2)) {
                  return true;
               }
            }

            return false;
         } finally {
            this.lock.pop();
         }
      } else {
         return false;
      }
   }

   private boolean lockAndSelect(MixinEnvironment var1, String var2) {
      boolean var3 = this.lock.push().check();
      if (var3) {
         for (MixinConfig var5 : this.pendingConfigs) {
            if (var5.hasPendingMixinsFor(var2)) {
               ReEntrantTransformerError var6 = new ReEntrantTransformerError("Re-entrance error.");
               logger.warn("Re-entrance detected during prepare phase, this will cause serious problems.", var6);
               throw var6;
            }
         }
      } else {
         try {
            this.checkSelect(var1);
         } catch (Exception var7) {
            this.lock.pop();
            throw new MixinException(var7);
         }
      }

      return var3;
   }

   private String getInvalidClassError(String var1, ClassNode var2, MixinConfig var3) {
      if (var3.getClasses().contains(var1)) {
         return String.format("Illegal classload request for %s. Mixin is defined in %s and cannot be referenced directly", var1, var3);
      }

      AnnotationNode var4 = Annotations.getInvisible(var2, Mixin.class);
      if (var4 != null) {
         MixinInfo.Variant var5 = MixinInfo.getVariant(var2);
         if (var5 == MixinInfo.Variant.ACCESSOR) {
            return String.format(
               "Illegal classload request for accessor mixin %s. The mixin is missing from %s which owns package %s* and the mixin has not been applied.",
               var1,
               var3,
               var3.getMixinPackage()
            );
         }
      }

      return String.format("%s is in a defined mixin package %s* owned by %s and cannot be referenced directly", var1, var3.getMixinPackage(), var3);
   }

   public List<String> reload(String var1, ClassNode var2) {
      if (this.lock.getDepth() > 0) {
         throw new MixinApplyError("Cannot reload mixin if re-entrant lock entered");
      }

      ArrayList var3 = new ArrayList();

      for (MixinConfig var5 : this.configs) {
         var3.addAll(var5.reloadMixin(var1, var2));
      }

      return var3;
   }

   private void checkSelect(MixinEnvironment var1) {
      if (this.currentEnvironment != var1) {
         this.select(var1);
      } else {
         int var2 = Mixins.getUnvisitedCount();
         if (var2 > 0 && this.transformedCount == 0) {
            this.select(var1);
         }
      }
   }

   private void select(MixinEnvironment var1) {
      this.verboseLoggingLevel = var1.getOption(MixinEnvironment.Option.DEBUG_VERBOSE) ? Level.INFO : Level.DEBUG;
      if (this.transformedCount > 0) {
         logger.log(this.verboseLoggingLevel, "Ending {}, applied {} mixins", this.currentEnvironment, this.transformedCount);
      }

      String var2 = this.currentEnvironment == var1 ? "Checking for additional" : "Preparing";
      logger.log(this.verboseLoggingLevel, "{} mixins for {}", var2, var1);
      Profiler.setActive(true);
      this.profiler.mark(var1.getPhase().toString() + ":prepare");
      Profiler.Section var3 = this.profiler.begin("prepare");
      this.selectConfigs(var1);
      this.extensions.select(var1);
      int var4 = this.prepareConfigs(var1, this.extensions);
      this.currentEnvironment = var1;
      this.transformedCount = 0;
      var3.end();
      long var5 = var3.getTime();
      double var7 = var3.getSeconds();
      if (var7 > 0.25) {
         long var9 = this.profiler.get("class.load").getTime();
         long var11 = this.profiler.get("class.transform").getTime();
         long var13 = this.profiler.get("mixin.plugin").getTime();
         String var15 = new DecimalFormat("###0.000").format(var7);
         String var16 = new DecimalFormat("###0.0").format((double)var5 / var4);
         logger.log(
            this.verboseLoggingLevel,
            "Prepared {} mixins in {} sec ({}ms avg) ({}ms load, {}ms transform, {}ms plugin)",
            var4,
            var15,
            var16,
            var9,
            var11,
            var13
         );
      }

      this.profiler.mark(var1.getPhase().toString() + ":apply");
      Profiler.setActive(var1.getOption(MixinEnvironment.Option.DEBUG_PROFILER));
   }

   private void selectConfigs(MixinEnvironment var1) {
      Iterator var2 = Mixins.getConfigs().iterator();

      while (var2.hasNext()) {
         Config var3 = (Config)var2.next();

         try {
            MixinConfig var4 = var3.get();
            if (var4.select(var1)) {
               var2.remove();
               logger.log(this.verboseLoggingLevel, "Selecting config {}", var4);
               var4.onSelect();
               this.pendingConfigs.add(var4);
            }
         } catch (Exception var5) {
            logger.warn(String.format("Failed to select mixin config: %s", var3), var5);
         }
      }

      Collections.sort(this.pendingConfigs);
   }

   private int prepareConfigs(MixinEnvironment var1, Extensions var2) {
      int var3 = 0;
      final IHotSwap var4 = this.hotSwapper;

      for (MixinConfig var6 : this.pendingConfigs) {
         for (MixinCoprocessor var8 : this.coprocessors) {
            var6.addListener(var8);
         }

         var6.addListener(MixinInheritanceTracker.INSTANCE);
         if (var4 != null) {
            var6.addListener(new MixinConfig.IListener() {
               @Override
               public void onPrepare(MixinInfo var1) {
                  var4.registerMixinClass(var1.getClassName());
               }

               @Override
               public void onInit(MixinInfo var1) {
               }
            });
         }
      }

      for (MixinConfig var18 : this.pendingConfigs) {
         try {
            logger.log(this.verboseLoggingLevel, "Preparing {} ({})", var18, var18.getDeclaredMixinCount());
            var18.prepare(var2);
            var3 += var18.getMixinCount();
         } catch (InvalidMixinException var13) {
            this.handleMixinPrepareError(var18, var13, var1);
         } catch (Exception var14) {
            String var22 = var14.getMessage();
            logger.error(
               "Error encountered whilst initialising mixin config '" + var18.getName() + "' from mod '" + FabricUtil.getModId(var18) + "': " + var22, var14
            );
         }
      }

      for (MixinConfig var19 : this.pendingConfigs) {
         IMixinConfigPlugin var21 = var19.getPlugin();
         if (var21 != null) {
            HashSet var23 = new HashSet();

            for (MixinConfig var10 : this.pendingConfigs) {
               if (!var10.equals(var19)) {
                  var23.addAll(var10.getTargets());
               }
            }

            var21.acceptTargets(var19.getTargetsSet(), Collections.unmodifiableSet(var23));
         }
      }

      for (MixinConfig var20 : this.pendingConfigs) {
         try {
            var20.postInitialise(this.extensions);
         } catch (InvalidMixinException var11) {
            this.handleMixinPrepareError(var20, var11, var1);
         } catch (Exception var12) {
            String var24 = var12.getMessage();
            logger.error(
               "Error encountered during mixin config postInit step '" + var20.getName() + "' from mod '" + FabricUtil.getModId(var20) + "': " + var24, var12
            );
         }
      }

      this.configs.addAll(this.pendingConfigs);
      Collections.sort(this.configs);
      this.pendingConfigs.clear();
      return var3;
   }

   private void handleMixinPrepareError(MixinConfig var1, InvalidMixinException var2, MixinEnvironment var3) {
      this.handleMixinError(var1.getName(), var2, var3, MixinProcessor.ErrorPhase.PREPARE);
   }

   private void handleMixinApplyError(String var1, InvalidMixinException var2, MixinEnvironment var3) {
      this.handleMixinError(var1, var2, var3, MixinProcessor.ErrorPhase.APPLY);
   }

   private void handleMixinError(String var1, InvalidMixinException var2, MixinEnvironment var3, MixinProcessor.ErrorPhase var4) {
      this.errorState = true;
      IMixinInfo var5 = var2.getMixin();
      if (var5 == null) {
         logger.error("InvalidMixinException has no mixin!", var2);
         throw var2;
      }

      IMixinConfig var6 = var5.getConfig();
      MixinEnvironment.Phase var7 = var5.getPhase();
      IMixinErrorHandler.ErrorAction var8 = var6.isRequired() ? IMixinErrorHandler.ErrorAction.ERROR : IMixinErrorHandler.ErrorAction.WARN;
      if (var3.getOption(MixinEnvironment.Option.DEBUG_VERBOSE)) {
         new PrettyPrinter()
            .wrapTo(160)
            .add("Invalid Mixin")
            .centre()
            .hr('-')
            .kvWidth(10)
            .kv("Action", var4.name())
            .kv("Mixin", var5.getClassName())
            .kv("Config", var6.getName())
            .kv("ModId", FabricUtil.getModId(var6))
            .kv("Phase", var7)
            .hr('-')
            .add("    %s", var2.getClass().getName())
            .hr('-')
            .addWrapped("    %s", var2.getMessage())
            .hr('-')
            .add(var2, 8)
            .log(var8.logLevel);
      }

      for (IMixinErrorHandler var10 : this.getErrorHandlers(var5.getPhase())) {
         IMixinErrorHandler.ErrorAction var11 = var4.onError(var10, var1, var2, var5, var8);
         if (var11 != null) {
            var8 = var11;
         }
      }

      logger.log(var8.logLevel, var4.getLogMessage(var1, var2, var5), var2);
      this.errorState = false;
      if (var8 == IMixinErrorHandler.ErrorAction.ERROR) {
         throw new MixinApplyError(var4.getErrorMessage(var5, var6, var7), var2);
      }
   }

   private List<IMixinErrorHandler> getErrorHandlers(MixinEnvironment.Phase var1) {
      ArrayList var2 = new ArrayList();

      for (String var4 : Mixins.getErrorHandlerClasses()) {
         try {
            logger.info("Instancing error handler class {}", var4);
            Class var5 = this.service.getClassProvider().findClass(var4, true);
            IMixinErrorHandler var6 = (IMixinErrorHandler)var5.getDeclaredConstructor().newInstance();
            if (var6 != null) {
               var2.add(var6);
            }
         } catch (Throwable var7) {
         }
      }

      return var2;
   }

   private void dumpClassOnFailure(String var1, ClassNode var2, MixinEnvironment var3) {
      if (var3.getOption(MixinEnvironment.Option.DUMP_TARGET_ON_FAILURE)) {
         ExtensionClassExporter var4 = this.extensions.getExtension(ExtensionClassExporter.class);
         var4.dumpClass(var1.replace('.', '/') + ".target", var2);
      }
   }

   enum ErrorPhase {
      PREPARE {
         @Override
         IMixinErrorHandler.ErrorAction onError(
            IMixinErrorHandler var1, String var2, InvalidMixinException var3, IMixinInfo var4, IMixinErrorHandler.ErrorAction var5
         ) {
            try {
               return var1.onPrepareError(var4.getConfig(), var3, var4, var5);
            } catch (AbstractMethodError var7) {
               return var5;
            }
         }

         @Override
         protected String getContext(IMixinInfo var1, String var2) {
            return String.format("preparing %s in %s", var1.getName(), var2);
         }
      },
      APPLY {
         @Override
         IMixinErrorHandler.ErrorAction onError(
            IMixinErrorHandler var1, String var2, InvalidMixinException var3, IMixinInfo var4, IMixinErrorHandler.ErrorAction var5
         ) {
            try {
               return var1.onApplyError(var2, var3, var4, var5);
            } catch (AbstractMethodError var7) {
               return var5;
            }
         }

         @Override
         protected String getContext(IMixinInfo var1, String var2) {
            return String.format("%s -> %s", var1, var2);
         }
      };

      private final String text = this.name().toLowerCase(Locale.ROOT);

      ErrorPhase() {
      }

      abstract IMixinErrorHandler.ErrorAction onError(
         IMixinErrorHandler var1, String var2, InvalidMixinException var3, IMixinInfo var4, IMixinErrorHandler.ErrorAction var5
      );

      protected abstract String getContext(IMixinInfo var1, String var2);

      public String getLogMessage(String var1, InvalidMixinException var2, IMixinInfo var3) {
         return String.format(
            "Mixin %s for mod %s failed %s: %s %s",
            this.text,
            FabricUtil.getModId(var3.getConfig()),
            this.getContext(var3, var1),
            var2.getClass().getName(),
            var2.getMessage()
         );
      }

      public String getErrorMessage(IMixinInfo var1, IMixinConfig var2, MixinEnvironment.Phase var3) {
         return String.format("Mixin [%s] from phase [%s] in config [%s] FAILED during %s", var1, var3, var2, this.name());
      }
   }
}
