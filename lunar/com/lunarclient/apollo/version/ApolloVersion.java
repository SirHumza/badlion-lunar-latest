package com.lunarclient.apollo.version;

import lombok.Generated;

public class ApolloVersion {
   private final int major;
   private final int minor;
   private final int patch;

   public ApolloVersion(String var1) {
      String[] var2 = var1.replaceAll("[^0-9.]", "").split("\\.");
      if (var2.length != 3) {
         throw new RuntimeException("Failed to parse Apollo version.");
      }

      try {
         this.major = Integer.parseInt(var2[0]);
         this.minor = Integer.parseInt(var2[1]);
         this.patch = Integer.parseInt(var2[2]);
      } catch (NumberFormatException var4) {
         throw new RuntimeException("Failed to parse Apollo version.");
      }
   }

   public boolean isUpdateAvailable(ApolloVersion var1) {
      if (var1.getMajor() > this.major) {
         return true;
      } else if (var1.getMajor() < this.major) {
         return false;
      } else if (var1.getMinor() > this.minor) {
         return true;
      } else {
         return var1.getMinor() < this.minor ? false : var1.getPatch() > this.patch;
      }
   }

   @Generated
   public int getMajor() {
      return this.major;
   }

   @Generated
   public int getMinor() {
      return this.minor;
   }

   @Generated
   public int getPatch() {
      return this.patch;
   }
}
