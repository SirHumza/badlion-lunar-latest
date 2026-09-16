package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.module.vignette.Vignette;
import com.lunarclient.apollo.vignette.v1.DisplayVignetteMessage;
import com.lunarclient.apollo.vignette.v1.ResetVignetteMessage;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import java.util.Set;
import lombok.Generated;

public class RIRHOCHIORCCIIOIIRHOCCCRHHCHHH
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private Vignette RCORHIHICHCOORRRHCHCRICCHICOOO;
   private RCIROOOOICRHCCRRCIORHHIRCOIIIC RORIHRIIOOHOCHRICCHOOOCRIOOHHC;
   private boolean RRRCORIOCCCIOIIHRRCRHIHOROHRCR;

   public RIRHOCHIORCCIIOIIRHOCCCRHHCHHH() {
      super("vignette", "Vignette");
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(DisplayVignetteMessage.class, ResetVignetteMessage.class);
   }

   @Override
   protected void onEnable() {
      this.IIHCOICHRCCCCOHHRHHIRIOICHCHHO();
   }

   @Override
   protected void onDisable() {
      this.IIHCOICHRCCCCOHHRHHIRIOICHCHHO();
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(DisplayVignetteMessage.class, var1x -> {
         this.RRRCORIOCCCIOIIHRRCRHIHOROHRCR = false;
         this.RCORHIHICHCOORRRHCHCRICCHICOOO = Vignette.builder().resourceLocation(var1x.getResourceLocation()).opacity(var1x.getOpacity()).build();
         this.RORIHRIIOOHOCHRICCHOOOCRIOOHHC = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(this.RCORHIHICHCOORRRHCHCRICCHICOOO.getResourceLocation());
      });
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetVignetteMessage.class, var1x -> this.IIHCOICHRCCCCOHHRHHIRIOICHCHHO());
   }

   public void IIHCOICHRCCCCOHHRHHIRIOICHCHHO() {
      this.RRRCORIOCCCIOIIHRRCRHIHOROHRCR = false;
      this.RCORHIHICHCOORRRHCHCRICCHICOOO = null;
      this.RORIHRIIOOHOCHRICCHOOOCRIOOHHC = null;
   }

   @Generated
   public Vignette OOOIICCOIOROHOOORHOIIOIICRHIII() {
      return this.RCORHIHICHCOORRRHCHCRICCHICOOO;
   }

   @Generated
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC HHHIOIOICHIIHICIHRRRRCROIOOCCI() {
      return this.RORIHRIIOOHOCHRICCHOOOCRIOOHHC;
   }

   @Generated
   public boolean IRHICRIRRHCRCCOOORCHHORCRRCIRO() {
      return this.RRRCORIOCCCIOIIHRRCRHIHOROHRCR;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Vignette var1) {
      this.RCORHIHICHCOORRRHCHCRICCHICOOO = var1;
   }

   @Generated
   public void IHICORCROOROHCIHIHCOIHRRHICICO(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
      this.RORIHRIIOOHOCHRICCHOOOCRIOOHHC = var1;
   }

   @Generated
   public void ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(boolean var1) {
      this.RRRCORIOCCCIOIIHRRCRHIHOROHRCR = var1;
   }
}
