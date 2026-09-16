package com.lunarclient.apollo.client.version;

import lombok.Generated;

public final class LunarClientVersion {
   String gitBranch;
   String gitCommit;
   String semVer;

   @Generated
   LunarClientVersion(String var1, String var2, String var3) {
      this.gitBranch = var1;
      this.gitCommit = var2;
      this.semVer = var3;
   }

   @Generated
   public static LunarClientVersion.LunarClientVersionBuilder builder() {
      return new LunarClientVersion.LunarClientVersionBuilder();
   }

   @Generated
   public String getGitBranch() {
      return this.gitBranch;
   }

   @Generated
   public String getGitCommit() {
      return this.gitCommit;
   }

   @Generated
   public String getSemVer() {
      return this.semVer;
   }

   @Generated
   public static class LunarClientVersionBuilder {
      @Generated
      private String gitBranch;
      @Generated
      private String gitCommit;
      @Generated
      private String semVer;

      @Generated
      LunarClientVersionBuilder() {
      }

      @Generated
      public LunarClientVersion.LunarClientVersionBuilder gitBranch(String var1) {
         this.gitBranch = var1;
         return this;
      }

      @Generated
      public LunarClientVersion.LunarClientVersionBuilder gitCommit(String var1) {
         this.gitCommit = var1;
         return this;
      }

      @Generated
      public LunarClientVersion.LunarClientVersionBuilder semVer(String var1) {
         this.semVer = var1;
         return this;
      }

      @Generated
      public LunarClientVersion build() {
         return new LunarClientVersion(this.gitBranch, this.gitCommit, this.semVer);
      }

      @Generated
      @Override
      public String toString() {
         return "LunarClientVersion.LunarClientVersionBuilder(gitBranch=" + this.gitBranch + ", gitCommit=" + this.gitCommit + ", semVer=" + this.semVer + ")";
      }
   }
}
