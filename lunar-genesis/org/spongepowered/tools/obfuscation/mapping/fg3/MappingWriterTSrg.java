package org.spongepowered.tools.obfuscation.mapping.fg3;

import java.io.PrintWriter;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import org.spongepowered.asm.obfuscation.mapping.common.MappingField;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.tools.obfuscation.ObfuscationType;
import org.spongepowered.tools.obfuscation.mapping.IMappingConsumer;
import org.spongepowered.tools.obfuscation.mapping.mcp.MappingWriterSrg;

public class MappingWriterTSrg extends MappingWriterSrg {
   private final MappingProviderTSrg provider;
   private final boolean mergeExisting;

   public MappingWriterTSrg(Messager var1, Filer var2, MappingProviderTSrg var3, boolean var4) {
      super(var1, var2);
      this.provider = var3;
      this.mergeExisting = var4;
   }

   @Override
   protected PrintWriter openFileWriter(String var1, ObfuscationType var2) {
      return this.openFileWriter(var1, var2 + " composite mappings");
   }

   @Override
   protected void writeHeader(PrintWriter var1) {
      if (this.mergeExisting) {
         for (String var3 : this.provider.getInputMappings()) {
            var1.println(var3);
         }
      }
   }

   @Override
   protected String formatFieldMapping(IMappingConsumer.MappingSet.Pair<MappingField> var1) {
      return String.format("%s %s %s", ((MappingField)var1.from).getOwner(), ((MappingField)var1.from).getSimpleName(), ((MappingField)var1.to).getSimpleName());
   }

   @Override
   protected String formatMethodMapping(IMappingConsumer.MappingSet.Pair<MappingMethod> var1) {
      return String.format(
         "%s %s %s %s",
         ((MappingMethod)var1.from).getOwner(),
         ((MappingMethod)var1.from).getSimpleName(),
         ((MappingMethod)var1.from).getDesc(),
         ((MappingMethod)var1.to).getSimpleName()
      );
   }
}
