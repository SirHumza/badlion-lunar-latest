package com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import lombok.Generated;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private String IRRHHOCRRRCIROHOCIRRICIRHIHRHC;
   private Boolean CRRCHHRIIOORRCHIOCOROIIOCROOIC;
   private Long RCIRCRIOIOHICOIOHHOCCRRRRCORCH;

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2)) {
         return false;
      } else {
         if (!var2.canEqual(this)) {
            return false;
         }

         Boolean var3 = this.RRCHHHIIIRIRRHIHHHIIHRORIICCRC();
         Boolean var4 = var2.RRCHHHIIIRIRRHIHHHIIHRORIICCRC();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            Long var5 = this.RCOHOOOORIOICHHHHRCOCORROOHIOI();
            Long var6 = var2.RCOHOOOORIOICHHHHRCOCORROOHIOI();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               String var7 = this.COIHRHHHRRHHCRHIIICHOOCHICRORH();
               String var8 = var2.COIHRHHHRRHHCRHIIICHOOCHICRORH();
               return var7 == null ? var8 == null : var7.equals(var8);
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      Boolean var3 = this.RRCHHHIIIRIRRHIHHHIIHRORIICCRC();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      Long var4 = this.RCOHOOOORIOICHHHHRCOCORROOHIOI();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      String var5 = this.COIHRHHHRRHHCRHIIICHOOCHICRORH();
      return var2 * 59 + (var5 == null ? 43 : var5.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "AnimationState(animation="
         + this.COIHRHHHRRHHCRHIIICHOOCHICRORH()
         + ", isDefault="
         + this.RRCHHHIIIRIRRHIHHHIIHRORIICCRC()
         + ", timer="
         + this.RCOHOOOORIOICHHHHRCOCORROOHIOI()
         + ")";
   }

   @ORHIOICIOCRRHOOCOHRORIHICHRCRR("animation")
   @Generated
   public String COIHRHHHRRHHCRHIIICHOOCHICRORH() {
      return this.IRRHHOCRRRCIROHOCIRRICIRHIHRHC;
   }

   @ORHIOICIOCRRHOOCOHRORIHICHRCRR("animation")
   @Generated
   public void ICOIRCCIRRCHHOHHOOOICOCCIRROCC(String var1) {
      this.IRRHHOCRRRCIROHOCIRRICIRHIHRHC = var1;
   }

   @ORHIOICIOCRRHOOCOHRORIHICHRCRR("is_default")
   @Generated
   public Boolean RRCHHHIIIRIRRHIHHHIIHRORIICCRC() {
      return this.CRRCHHRIIOORRCHIOCOROIIOCROOIC;
   }

   @ORHIOICIOCRRHOOCOHRORIHICHRCRR("is_default")
   @Generated
   public void RHCHRCOCCOIIIHCHRHIRCORHRHRICR(Boolean var1) {
      this.CRRCHHRIIOORRCHIOCOROIIOCROOIC = var1;
   }

   @ORHIOICIOCRRHOOCOHRORIHICHRCRR("timer")
   @Generated
   public Long RCOHOOOORIOICHHHHRCOCORROOHIOI() {
      return this.RCIRCRIOIOHICOIOHHOCCRRRRCORCH;
   }

   @ORHIOICIOCRRHOOCOHRORIHICHRCRR("timer")
   @Generated
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(Long var1) {
      this.RCIRCRIOIOHICOIOHHOCCRRRRCORCH = var1;
   }
}
