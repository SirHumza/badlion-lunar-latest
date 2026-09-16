package com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

public abstract class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH[] var1,
      String var2
   ) {
      super(var1, var2);
   }

   @Override
   protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      int var1,
      com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2
   ) {
      if (var2.isNumber()) {
         throw new IllegalStateException("Function " + this.name + " cannot receive number arguments!");
      }
   }

   @Override
   public com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH HHORHRRICIIRIRRCRIORRCIHIOICIR() {
      this.HIHIRCICHRCIROHOOICCHOCCCHOCCR.set(this.stringValue());
      return this.HIHIRCICHRCIROHOOICCHOCCCHOCCR;
   }

   @Override
   public boolean isNumber() {
      return false;
   }

   @Override
   public double doubleValue() {
      return 0.0;
   }

   @Override
   public boolean ICRRRCOCRCCHCIIOHHORHORHRCOCIC() {
      return this.stringValue().equalsIgnoreCase("true");
   }
}
