package org.spongepowered.asm.launch;

import cpw.mods.modlauncher.api.IEnvironment;
import cpw.mods.modlauncher.api.ITransformationService;
import cpw.mods.modlauncher.api.ITransformer;
import cpw.mods.modlauncher.api.ITransformationService.OptionResult;
import cpw.mods.modlauncher.serviceapi.ILaunchPluginService;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionSpecBuilder;
import org.spongepowered.include.com.google.common.collect.ImmutableList;

public abstract class MixinTransformationServiceAbstract implements ITransformationService {
   private ArgumentAcceptingOptionSpec<String> mixinsArgument;
   private List<String> commandLineMixins = new ArrayList<>();
   private MixinLaunchPluginLegacy plugin;

   public String name() {
      return "mixin";
   }

   public void arguments(BiFunction<String, String, OptionSpecBuilder> var1) {
      this.mixinsArgument = ((OptionSpecBuilder)var1.apply("config", "a mixin config to load")).withRequiredArg().ofType(String.class);
   }

   public void argumentValues(OptionResult var1) {
      this.commandLineMixins.addAll(var1.values(this.mixinsArgument));
   }

   public void onLoad(IEnvironment var1, Set<String> var2) {
   }

   public void initialize(IEnvironment var1) {
      Optional var2 = var1.findLaunchPlugin("mixin");
      if (!var2.isPresent()) {
         throw new MixinInitialisationError("Mixin Launch Plugin Service could not be located");
      }

      ILaunchPluginService var3 = (ILaunchPluginService)var2.get();
      if (!(var3 instanceof MixinLaunchPluginLegacy)) {
         throw new MixinInitialisationError("Mixin Launch Plugin Service is present but not compatible");
      }

      this.plugin = (MixinLaunchPluginLegacy)var3;
      MixinBootstrap.start();
      this.plugin.init(var1, this.commandLineMixins);
   }

   public List<Entry<String, Path>> runScan(IEnvironment var1) {
      return Collections.emptyList();
   }

   public List<ITransformer> transformers() {
      return ImmutableList.of();
   }
}
