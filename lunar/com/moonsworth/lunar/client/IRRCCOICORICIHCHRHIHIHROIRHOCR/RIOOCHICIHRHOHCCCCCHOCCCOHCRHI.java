package com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR;

public abstract class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI implements IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private int RROORRCIIRCRCRROOCRHIRIIIIOROH = 0;

   protected abstract void onEnable();

   protected abstract void onDisable();

   @Override
   public void RCHOIICOHORCIHHIIOOHHCCOIIIOHC() {
      this.RROORRCIIRCRCRROOCRHIRIIIIOROH++;
      if (this.RROORRCIIRCRCRROOCRHIRIIIIOROH == 1) {
         this.onEnable();
      }
   }

   @Override
   public void HOCCOCRCOHORCHOHCHIROIHCOHOIRR() {
      this.RROORRCIIRCRCRROOCRHIRIIIIOROH--;
      if (this.RROORRCIIRCRCRROOCRHIRIIIIOROH == 0) {
         this.onDisable();
      }
   }
}
