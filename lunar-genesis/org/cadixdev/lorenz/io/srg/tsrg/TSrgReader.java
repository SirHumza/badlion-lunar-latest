package org.cadixdev.lorenz.io.srg.tsrg;

import java.io.Reader;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.io.TextMappingsReader;
import org.cadixdev.lorenz.io.srg.SrgConstants;
import org.cadixdev.lorenz.model.ClassMapping;

public class TSrgReader extends TextMappingsReader {
   public TSrgReader(Reader var1) {
      super(var1, TSrgReader.Processor::new);
   }

   public static class Processor extends TextMappingsReader.Processor {
      private static final int CLASS_MAPPING_ELEMENT_COUNT = 2;
      private static final int FIELD_MAPPING_ELEMENT_COUNT = 2;
      private static final int METHOD_MAPPING_ELEMENT_COUNT = 3;
      private ClassMapping currentClass;

      public Processor(MappingSet var1) {
         super(var1);
      }

      public Processor() {
         this(MappingSet.create());
      }

      public void accept(String var1) {
         String var2 = SrgConstants.removeComments(var1);
         if (!var2.isEmpty()) {
            if (var2.length() < 3) {
               throw new IllegalArgumentException("Faulty TSRG mapping encountered: `" + var2 + "`!");
            }

            String[] var3 = SPACE.split(var2);
            int var4 = var3.length;
            if (!var3[0].startsWith("\t") && var4 == 2) {
               String var8 = var3[0];
               String var10 = var3[1];
               if (!var8.endsWith("/")) {
                  this.currentClass = this.mappings.getOrCreateClassMapping(var8);
                  this.currentClass.setDeobfuscatedName(var10);
               }
            } else {
               if (!var3[0].startsWith("\t") || this.currentClass == null) {
                  throw new IllegalArgumentException("Failed to process line: `" + var2 + "`!");
               }

               String var5 = var3[0].replace("\t", "");
               if (var4 == 2) {
                  String var6 = var3[1];
                  this.currentClass.getOrCreateFieldMapping(var5).setDeobfuscatedName(var6);
               } else if (var4 == 3) {
                  String var9 = var3[1];
                  String var7 = var3[2];
                  this.currentClass.getOrCreateMethodMapping(var5, var9).setDeobfuscatedName(var7);
               }
            }
         }
      }
   }
}
