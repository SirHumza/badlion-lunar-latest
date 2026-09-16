package org.cadixdev.lorenz.io.srg.xsrg;

import java.io.Reader;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.io.TextMappingsReader;
import org.cadixdev.lorenz.io.srg.SrgConstants;

public class XSrgReader extends TextMappingsReader {
   public XSrgReader(Reader var1) {
      super(var1, XSrgReader.Processor::new);
   }

   public static class Processor extends TextMappingsReader.Processor {
      private static final String PACKAGE_MAPPING_KEY = "PK:";
      private static final String CLASS_MAPPING_KEY = "CL:";
      private static final String FIELD_MAPPING_KEY = "FD:";
      private static final String METHOD_MAPPING_KEY = "MD:";
      private static final int PACKAGE_MAPPING_ELEMENT_COUNT = 3;
      private static final int CLASS_MAPPING_ELEMENT_COUNT = 3;
      private static final int FIELD_MAPPING_ELEMENT_COUNT = 5;
      private static final int METHOD_MAPPING_ELEMENT_COUNT = 5;

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
               throw new IllegalArgumentException("Faulty XSRG mapping encountered: `" + var2 + "`!");
            }

            String[] var3 = SPACE.split(var2);
            int var4 = var3.length;
            String var5 = var3[0];
            if (var5.equals("CL:") && var4 == 3) {
               String var15 = var3[1];
               String var17 = var3[2];
               this.mappings.getOrCreateClassMapping(var15).setDeobfuscatedName(var17);
            } else if (var5.equals("FD:") && var4 == 5) {
               String var14 = var3[1];
               String var16 = var3[2];
               String var18 = var3[3];
               String var19 = var3[4];
               int var20 = var14.lastIndexOf(47);
               String var21 = var14.substring(0, var20);
               String var22 = var14.substring(var20 + 1);
               String var23 = var18.substring(var18.lastIndexOf(47) + 1);
               this.mappings.getOrCreateClassMapping(var21).getOrCreateFieldMapping(var22, var16).setDeobfuscatedName(var23);
            } else if (var5.equals("MD:") && var4 == 5) {
               String var6 = var3[1];
               String var7 = var3[2];
               String var8 = var3[3];
               String var9 = var3[4];
               int var10 = var6.lastIndexOf(47);
               String var11 = var6.substring(0, var10);
               String var12 = var6.substring(var10 + 1);
               String var13 = var8.substring(var8.lastIndexOf(47) + 1);
               this.mappings.getOrCreateClassMapping(var11).getOrCreateMethodMapping(var12, var7).setDeobfuscatedName(var13);
            } else if (!var5.equals("PK:") || var4 != 3) {
               throw new IllegalArgumentException("Failed to process line: `" + var2 + "`!");
            }
         }
      }
   }
}
