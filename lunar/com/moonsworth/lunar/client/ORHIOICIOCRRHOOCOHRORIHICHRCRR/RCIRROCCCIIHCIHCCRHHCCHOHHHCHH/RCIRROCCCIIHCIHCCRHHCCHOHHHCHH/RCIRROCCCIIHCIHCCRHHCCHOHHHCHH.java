package com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private double doubleValue;
   private String HOHCOCIIHRIRHRRHRHRRICRHORICCR;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double var1) {
      this.doubleValue = var1;
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1) {
      this.HOHCOCIIHRIRHRRHRHRRICRHORICCR = var1;
   }

   @Override
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH HHORHRRICIIRIRRCRIORRCIHIOICIR() {
      return this;
   }

   @Override
   public boolean isNumber() {
      return this.HOHCOCIIHRIRHRRHRHRRICRHORICCR == null;
   }

   @Override
   public void set(double var1) {
      this.doubleValue = var1;
      this.HOHCOCIIHRIRHRRHRHRRICRHORICCR = null;
   }

   @Override
   public void set(String var1) {
      this.doubleValue = 0.0;
      this.HOHCOCIIHRIRHRRHRHRRICRHORICCR = var1;
   }

   @Override
   public double doubleValue() {
      return this.doubleValue;
   }

   @Override
   public boolean ICRRRCOCRCCHCIIOHHORHORHRCOCIC() {
      return this.isNumber() ? HRCHROOHRIHCRCRHRIIROCIRHOIRHH.isTrue(this.doubleValue) : this.HOHCOCIIHRIRHRRHRHRRICRHORICCR.equalsIgnoreCase("true");
   }

   @Override
   public String stringValue() {
      return this.HOHCOCIIHRIRHRRHRHRRICRHORICCR;
   }

   @Override
   public String toString() {
      return this.HOHCOCIIHRIRHRRHRHRRICRHORICCR == null ? String.valueOf(this.doubleValue) : "\"" + this.HOHCOCIIHRIRHRRHRHRRICRHORICCR + "\"";
   }
}
