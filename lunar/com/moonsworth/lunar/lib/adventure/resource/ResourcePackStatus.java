package com.moonsworth.lunar.lib.adventure.resource;

public enum ResourcePackStatus {
   ACCEPTED(true),
   DECLINED(false),
   INVALID_URL(false),
   FAILED_DOWNLOAD(false),
   DOWNLOADED(true),
   FAILED_RELOAD(false),
   DISCARDED(false),
   SUCCESSFULLY_LOADED(false);

   private final boolean intermediate;

   ResourcePackStatus(boolean var3) {
      this.intermediate = var3;
   }

   public boolean intermediate() {
      return this.intermediate;
   }
}
