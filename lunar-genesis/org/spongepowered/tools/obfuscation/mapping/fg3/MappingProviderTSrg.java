package org.spongepowered.tools.obfuscation.mapping.fg3;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import org.spongepowered.asm.obfuscation.mapping.common.MappingField;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.asm.obfuscation.mapping.mcp.MappingFieldSrg;
import org.spongepowered.include.com.google.common.base.Strings;
import org.spongepowered.include.com.google.common.collect.BiMap;
import org.spongepowered.include.com.google.common.io.Files;
import org.spongepowered.tools.obfuscation.mapping.common.MappingProvider;

public class MappingProviderTSrg extends MappingProvider {
   private List<String> inputMappings = new ArrayList<>();

   public MappingProviderTSrg(Messager var1, Filer var2) {
      super(var1, var2);
   }

   @Override
   public void read(File var1) {
      BiMap var2 = this.packageMap;
      BiMap var3 = this.classMap;
      BiMap var4 = this.fieldMap;
      BiMap var5 = this.methodMap;
      String var6 = null;
      String var7 = null;
      this.inputMappings.addAll(Files.readLines(var1, Charset.defaultCharset()));

      for (String var9 : this.inputMappings) {
         if (!Strings.isNullOrEmpty(var9) && !var9.startsWith("#") && !var9.startsWith("tsrg2") && !var9.startsWith("\t\t")) {
            String[] var10 = var9.split(" ");
            if (var9.startsWith("\t")) {
               if (var6 == null) {
                  throw new IllegalStateException("Error parsing TSRG file, found member declaration with no class: " + var9);
               }

               var10[0] = var10[0].substring(1);
               if (var10.length == 2) {
                  var4.forcePut(new MappingField(var6, var10[0]), new MappingField(var7, var10[1]));
               } else {
                  if (var10.length != 3) {
                     throw new IllegalStateException("Error parsing TSRG file, too many arguments: " + var9);
                  }

                  var5.forcePut(new MappingMethod(var6, var10[0], var10[1]), new MappingMethodLazy(var7, var10[2], var10[1], this));
               }
            } else {
               if (var10.length <= 1) {
                  throw new IllegalStateException("Error parsing TSRG, unrecognised directive: " + var9);
               }

               String var11 = var10[0];
               if (var10.length == 2) {
                  String var12 = var10[1];
                  if (var11.endsWith("/")) {
                     var2.forcePut(var11.substring(0, var11.length() - 1), var12.substring(0, var12.length() - 1));
                  } else {
                     var3.forcePut(var11, var12);
                     var6 = var11;
                     var7 = var12;
                  }
               } else if (var10.length > 2) {
                  String var13 = (String)var3.get(var11);
                  if (var13 == null) {
                     throw new IllegalStateException("Error parsing TSRG file, found inline member before class mapping: " + var9);
                  }

                  if (var10.length == 3) {
                     var4.forcePut(new MappingField(var11, var10[1]), new MappingField(var13, var10[2]));
                  } else {
                     if (var10.length != 4) {
                        throw new IllegalStateException("Error parsing TSRG file, too many arguments: " + var9);
                     }

                     var5.forcePut(new MappingMethod(var11, var10[1], var10[2]), new MappingMethodLazy(var13, var10[3], var10[2], this));
                  }
               }
            }
         }
      }
   }

   @Override
   public MappingField getFieldMapping(MappingField var1) {
      if (var1.getDesc() != null) {
         var1 = new MappingFieldSrg(var1);
      }

      return this.fieldMap.get(var1);
   }

   List<String> getInputMappings() {
      return this.inputMappings;
   }
}
