package com.lunarclient.adventure.utils;

public class BooleanHolder {
   private boolean bool;

   public BooleanHolder(boolean var1) {
      this.bool = var1;
   }

   public boolean get() {
      return this.bool;
   }

   public boolean isTrue() {
      return this.bool;
   }

   public boolean isFalse() {
      return !this.bool;
   }

   public void set(boolean var1) {
      this.bool = var1;
   }

   public void setFalse() {
      this.bool = false;
   }

   public void setTrue() {
      this.bool = true;
   }
}
