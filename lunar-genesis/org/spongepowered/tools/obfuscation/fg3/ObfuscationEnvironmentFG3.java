package org.spongepowered.tools.obfuscation.fg3;

import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import org.spongepowered.tools.obfuscation.ObfuscationEnvironment;
import org.spongepowered.tools.obfuscation.ObfuscationType;
import org.spongepowered.tools.obfuscation.mapping.IMappingProvider;
import org.spongepowered.tools.obfuscation.mapping.IMappingWriter;
import org.spongepowered.tools.obfuscation.mapping.fg3.MappingProviderTSrg;
import org.spongepowered.tools.obfuscation.mapping.fg3.MappingWriterTSrg;

public class ObfuscationEnvironmentFG3 extends ObfuscationEnvironment {
   private MappingProviderTSrg provider;

   protected ObfuscationEnvironmentFG3(ObfuscationType var1) {
      super(var1);
   }

   @Override
   protected IMappingProvider getMappingProvider(Messager var1, Filer var2) {
      return this.provider = new MappingProviderTSrg(var1, var2);
   }

   @Override
   protected IMappingWriter getMappingWriter(Messager var1, Filer var2) {
      String var3 = this.ap.getOption("mergeBehaviour");
      return new MappingWriterTSrg(var1, var2, this.provider, var3 != null && var3.equalsIgnoreCase("merge"));
   }
}
