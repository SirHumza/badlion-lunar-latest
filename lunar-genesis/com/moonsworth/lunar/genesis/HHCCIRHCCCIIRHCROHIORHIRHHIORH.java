package com.moonsworth.lunar.genesis;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import lombok.Generated;

public final class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   public static final String OOIHCRHIIHIHCRIRRHOROCIICROIOC;
   public static final String HIRIICICCIOHIIROHIHCOCORORRRCI;
   public static final String HOOCICHHOCOOIIIORRIOCCHHHRCRCI;
   public static final boolean RORHOOOCCRROOORROIOIRCHIIOCOOI;
   public static final String RHORHHIRCHOHCOIROHRCHRRORIIOCI;
   public static final String IRIORROIIRHIRHRHHRIOCCCIIOIHHC;
   public static final String HCOHRRRCRRRRORCHOIIIIRICIRHCII;
   public static final String CCCRRHIORRROHOCORCORCCCIORRRHI;

   static {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var0 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.values();
      HashMap var1 = new HashMap();
      InputStream var2 = Genesis.class.getClassLoader().getResourceAsStream("lunarBuildData.txt");
      if (var2 != null) {
         try (var2) {
            String[] var4 = new String(var2.readAllBytes()).split("\n");

            for (String var8 : var4) {
               var8 = var8.trim();
               int var9 = var8.indexOf(61);
               if (var9 != -1) {
                  String var10 = var8.substring(0, var9);
                  String var11 = var8.substring(var9 + 1);

                  for (HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var15 : var0) {
                     if (var15.getId().equals(var10)) {
                        var1.put(var15, var11);
                        break;
                     }
                  }
               }
            }
         } catch (IOException var18) {
            throw new RuntimeException("Couldn't find lunarBuildData.txt??", var18);
         }

         for (HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var22 : var0) {
            if (!var1.containsKey(var22)) {
               throw new RuntimeException("\"" + var22.getId() + "\" couldn't be found in lunarBuildData.txt");
            }
         }

         OOIHCRHIIHIHCRIRRHOROCIICROIOC = (String)var1.get(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.BRANCH);
         HIRIICICCIOHIIROHIHCOCORORRRCI = (String)var1.get(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.GIT_HASH);
         HOOCICHHOCOOIIIORRIOCCHHHRCRCI = (String)var1.get(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.FULL_GIT_HASH);
         RORHOOOCCRROOORROIOIRCHIIOCOOI = Boolean.parseBoolean((String)var1.get(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PRODUCTION));
         RHORHHIRCHOHCOIROHRCHRRORIIOCI = (String)var1.get(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PROGUARD_UUID);
         IRIORROIIRHIRHRHHRIOCCCIIOIHHC = (String)var1.get(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.LUNAR_VERSION);
         HCOHRRRCRRRRORCHOIIIIRICIRHCII = (String)var1.get(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.UI_BRANCH);
         CCCRRHIORRROHOCORCORCCCIORRRHI = (String)var1.get(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.UI_GIT_HASH);
      } else {
         Genesis.LOGGER.warn("Couldn't find stream for lunarBuildData.txt??");
         OOIHCRHIIHIHCRIRRHOROCIICROIOC = "unknown";
         HIRIICICCIOHIIROHIHCOCORORRRCI = "unknown";
         HOOCICHHOCOOIIIORRIOCCHHHRCRCI = "unknown";
         RORHOOOCCRROOORROIOIRCHIIOCOOI = false;
         RHORHHIRCHOHCOIROHRCHRRORIIOCI = "unknown";
         IRIORROIIRHIRHRHHRIOCCCIIOIHHC = "unknown";
         HCOHRRRCRRRRORCHOIIIIRICIRHCII = "unknown";
         CCCRRHIORRROHOCORCORCCCIORRRHI = "unknown";
      }
   }

   private enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      BRANCH("gitBranch"),
      GIT_HASH("gitHash"),
      FULL_GIT_HASH("fullGitHash"),
      PRODUCTION("production"),
      PROGUARD_UUID("proguardUuid"),
      LUNAR_VERSION("lunarVersion"),
      UI_BRANCH("uiBranch"),
      UI_GIT_HASH("uiGitHash");

      private final String id;

      @Generated
      public String getId() {
         return this.id;
      }

      @Generated
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3) {
         this.id = var3;
      }
   }
}
