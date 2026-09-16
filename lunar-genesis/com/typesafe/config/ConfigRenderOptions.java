package com.typesafe.config;

public final class ConfigRenderOptions {
   private final boolean originComments;
   private final boolean comments;
   private final boolean formatted;
   private final boolean json;

   private ConfigRenderOptions(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.originComments = var1;
      this.comments = var2;
      this.formatted = var3;
      this.json = var4;
   }

   public static ConfigRenderOptions defaults() {
      return new ConfigRenderOptions(true, true, true, true);
   }

   public static ConfigRenderOptions concise() {
      return new ConfigRenderOptions(false, false, false, true);
   }

   public ConfigRenderOptions setComments(boolean var1) {
      return var1 == this.comments ? this : new ConfigRenderOptions(this.originComments, var1, this.formatted, this.json);
   }

   public boolean getComments() {
      return this.comments;
   }

   public ConfigRenderOptions setOriginComments(boolean var1) {
      return var1 == this.originComments ? this : new ConfigRenderOptions(var1, this.comments, this.formatted, this.json);
   }

   public boolean getOriginComments() {
      return this.originComments;
   }

   public ConfigRenderOptions setFormatted(boolean var1) {
      return var1 == this.formatted ? this : new ConfigRenderOptions(this.originComments, this.comments, var1, this.json);
   }

   public boolean getFormatted() {
      return this.formatted;
   }

   public ConfigRenderOptions setJson(boolean var1) {
      return var1 == this.json ? this : new ConfigRenderOptions(this.originComments, this.comments, this.formatted, var1);
   }

   public boolean getJson() {
      return this.json;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder("ConfigRenderOptions(");
      if (this.originComments) {
         var1.append("originComments,");
      }

      if (this.comments) {
         var1.append("comments,");
      }

      if (this.formatted) {
         var1.append("formatted,");
      }

      if (this.json) {
         var1.append("json,");
      }

      if (var1.charAt(var1.length() - 1) == ',') {
         var1.setLength(var1.length() - 1);
      }

      var1.append(")");
      return var1.toString();
   }
}
