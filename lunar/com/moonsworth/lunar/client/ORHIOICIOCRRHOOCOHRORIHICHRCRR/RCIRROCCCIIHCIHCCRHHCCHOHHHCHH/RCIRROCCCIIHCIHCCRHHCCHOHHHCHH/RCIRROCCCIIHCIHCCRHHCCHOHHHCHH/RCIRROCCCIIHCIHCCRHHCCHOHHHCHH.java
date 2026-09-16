package com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   protected com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH[] RCIOHOCORRORRRCIOIRIOCIRROICCO;
   protected String name;
   protected com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH HIHIRCICHRCIROHOOICCHOCCCHOCCR = new com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      0.0
   );

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH[] var1,
      String var2
   ) {
      if (var1.length < this.getRequiredArguments()) {
         String var4 = String.format("Function '%s' requires at least %s arguments. %s are given!", this.getName(), this.getRequiredArguments(), var1.length);
         throw new Exception(var4);
      }

      for (int var3 = 0; var3 < var1.length; var3++) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var1[var3]);
      }

      this.RCIOHOCORRORRRCIOIRIOCIRROICCO = var1;
      this.name = var2;
   }

   protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      int var1,
      com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2
   ) {
   }

   @Override
   public void set(double var1) {
   }

   @Override
   public void set(String var1) {
   }

   public com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH ROORRRORCHHOOHIIORIHCORHCIOIHR(
      int var1
   ) {
      if (var1 >= 0 && var1 < this.RCIOHOCORRORRRCIOIRIOCIRROICCO.length) {
         return this.RCIOHOCORRORRRCIOIRIOCIRROICCO[var1].HHORHRRICIIRIRRCRIORRCIHIOICIR();
      } else {
         throw new IllegalStateException(
            "Index should be within the argument's length range! Given " + var1 + ", arguments length: " + this.RCIOHOCORRORRRCIOIRIOCIRROICCO.length
         );
      }
   }

   @Override
   public String toString() {
      String var1 = "";

      for (int var2 = 0; var2 < this.RCIOHOCORRORRRCIOIRIOCIRROICCO.length; var2++) {
         var1 = var1 + this.RCIOHOCORRORRRCIOIRIOCIRROICCO[var2].toString();
         if (var2 < this.RCIOHOCORRORRRCIOIRIOCIRROICCO.length - 1) {
            var1 = var1 + ", ";
         }
      }

      return this.getName() + "(" + var1 + ")";
   }

   public String getName() {
      return this.name;
   }

   public int getRequiredArguments() {
      return 0;
   }
}
