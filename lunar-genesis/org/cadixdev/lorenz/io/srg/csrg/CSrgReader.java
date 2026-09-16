package org.cadixdev.lorenz.io.srg.csrg;

import java.io.Reader;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.io.TextMappingsReader;
import org.cadixdev.lorenz.io.srg.SrgConstants;

public class CSrgReader extends TextMappingsReader {
   public CSrgReader(Reader var1) {
      super(var1, CSrgReader.Processor::new);
   }

   public static class Processor extends TextMappingsReader.Processor {
      private static final int CLASS_MAPPING_ELEMENT_COUNT = 2;
      private static final int FIELD_MAPPING_ELEMENT_COUNT = 3;
      private static final int METHOD_MAPPING_ELEMENT_COUNT = 4;

      public Processor(MappingSet var1) {
         super(var1);
      }

      public Processor() {
         this(MappingSet.create());
      }

      public void accept(String var1) {
         String var2 = SrgConstants.removeComments(var1).trim();
         if (!var2.isEmpty()) {
            if (var2.length() < 4) {
               throw new IllegalArgumentException("Faulty CSRG mapping encountered: `" + var2 + "`!");
            }

            String[] var3 = SPACE.split(var2);
            int var4 = var3.length;
            if (var4 == 2) {
               String var5 = var3[0];
               String var6 = var3[1];
               if (!var5.endsWith("/")) {
                  this.mappings.getOrCreateClassMapping(var5).setDeobfuscatedName(var6);
               }
            } else if (var4 == 3) {
               String var9 = var3[0];
               String var11 = var3[1];
               String var7 = var3[2];
               this.mappings.getOrCreateClassMapping(var9).getOrCreateFieldMapping(var11).setDeobfuscatedName(var7);
            } else {
               if (var4 != 4) {
                  throw new IllegalArgumentException("Failed to process line: `" + var2 + "`!");
               }

               String var10 = var3[0];
               String var12 = var3[1];
               String var13 = var3[2];
               String var8 = var3[3];
               this.mappings.getOrCreateClassMapping(var10).getOrCreateMethodMapping(var12, var13).setDeobfuscatedName(var8);
            }
         }
      }
   }
}
