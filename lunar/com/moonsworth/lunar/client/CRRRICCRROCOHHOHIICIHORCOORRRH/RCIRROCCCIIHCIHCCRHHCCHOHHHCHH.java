package com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import lombok.Generated;

public final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static final String RRIRIIICIRRIIRICRRORCCRCOHIHIO;
   public static final String OOCRRHCRORRCCCIRHOIORIHRIIHOOC;
   public static final String RCICHOOCICHRIIIHHROHCRHHROOHIO;
   public static final boolean HHRRICCIOIHROCCOIIORROIROCIIOR;
   public static final String COCRROCCIRHOIOHIOHRCRIIHRHRHOO;
   public static final String ORORCHIOOOCIOHHOROHICHOHHCCHIO;
   public static final String OOHOROHRCOHIIRCHHOHOCIRHROOOHR;
   public static final String HIHIROOIICRIICOROCRCRCCIHCICIC;

   static {
      com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var0 = com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.values();
      HashMap var1 = new HashMap();
      InputStream var2 = com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class
         .getClassLoader()
         .getResourceAsStream("lunarBuildData.txt");
      if (var2 != null) {
         try (var2) {
            String[] var4 = new String(var2.readAllBytes()).split("\n");

            for (String var8 : var4) {
               var8 = var8.trim();
               int var9 = var8.indexOf(61);
               if (var9 != -1) {
                  String var10 = var8.substring(0, var9);
                  String var11 = var8.substring(var9 + 1);

                  for (com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var15 : var0) {
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

         for (com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var22 : var0) {
            if (!var1.containsKey(var22)) {
               throw new RuntimeException("\"" + var22.getId() + "\" couldn't be found in lunarBuildData.txt");
            }
         }

         RRIRIIICIRRIIRICRRORCCRCOHIHIO = (String)var1.get(
            com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.BRANCH
         );
         OOCRRHCRORRCCCIRHOIORIHRIIHOOC = (String)var1.get(
            com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.GIT_HASH
         );
         RCICHOOCICHRIIIHHROHCRHHROOHIO = (String)var1.get(
            com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.FULL_GIT_HASH
         );
         HHRRICCIOIHROCCOIIORROIROCIIOR = Boolean.parseBoolean(
            (String)var1.get(
               com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PRODUCTION
            )
         );
         COCRROCCIRHOIOHIOHRCRIIHRHRHOO = (String)var1.get(
            com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PROGUARD_UUID
         );
         ORORCHIOOOCIOHHOROHICHOHHCCHIO = (String)var1.get(
            com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.LUNAR_VERSION
         );
         OOHOROHRCOHIIRCHHOHOCIRHROOOHR = (String)var1.get(
            com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.UI_BRANCH
         );
         HIHIROOIICRIICOROCRCRCCIHCICIC = (String)var1.get(
            com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.UI_GIT_HASH
         );
      } else {
         throw new RuntimeException("Couldn't find stream for lunarBuildData.txt??");
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
