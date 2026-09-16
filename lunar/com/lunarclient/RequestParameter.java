package com.lunarclient;

public record RequestParameter() {
   private final String name;
   private final String value;

   public RequestParameter(String var1, String var2) {
      this.name = var1;
      this.value = var2;
   }

   public String getUrlComponent(int var1) {
      return var1 == 0 ? "?" + this.name + "=" + this.value : "&" + this.name + "=" + this.value;
   }
}
