package com.lunarclient.apollo.util;

import lombok.Generated;

public enum ConfigTarget {
   GENERAL_SETTINGS("config.yml", "General and module specific settings. https://lunarclient.dev/apollo/server-owners/config", new String[]{"modules"}),
   MOD_SETTINGS("mods.yml", "Lunar Client mod option overrides. https://lunarclient.dev/apollo/server-owners/config", new String[0]);

   private final String fileName;
   private final String headerComment;
   private final String[] modulesNode;

   @Generated
   public String getFileName() {
      return this.fileName;
   }

   @Generated
   public String getHeaderComment() {
      return this.headerComment;
   }

   @Generated
   public String[] getModulesNode() {
      return this.modulesNode;
   }

   @Generated
   ConfigTarget(String var3, String var4, String[] var5) {
      this.fileName = var3;
      this.headerComment = var4;
      this.modulesNode = var5;
   }
}
