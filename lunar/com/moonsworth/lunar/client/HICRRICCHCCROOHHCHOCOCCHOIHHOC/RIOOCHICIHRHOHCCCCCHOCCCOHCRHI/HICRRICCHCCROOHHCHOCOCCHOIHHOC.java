package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.lunarclient.websocket.liveexperience.v1.LiveExperience;
import com.lunarclient.websocket.liveexperience.v1.LoadLiveExperienceRequest;
import com.lunarclient.websocket.liveexperience.v1.LoadLiveExperienceResponse;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import lombok.Generated;

public class HICRRICCHCCROOHHCHOCOCCHOIHHOC
   implements com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI,
   com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private LiveExperience HIOHOIRCOHOOCORRHICCRHOHHIHIRI = null;
   private boolean HORCRHCOOICHIRCOIIIHICCOIOIIIR = false;
   private boolean RHOCOOHRCORCOHRROOOOIRRRHIIOOI = false;

   public HICRRICCHCCROOHHCHOCOCCHOIHHOC() {
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.class,
         var1 -> this.HORCRHCOOICHIRCOIIIHICCOIOIIIR = false
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.class,
         var1 -> this.HORCRHCOOICHIRCOIIIHICCOIOIIIR = false
      );
   }

   @Override
   public void close() {
   }

   @Override
   public void init() {
      if (this.HIOHOIRCOHOOCORRHICCRHOHHIHIRI == null) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
            .ifPresent(
               var1 -> var1.OHORCIHORHOCIRIIIRCCRHRCOCCHCH()
                  .loadLiveExperience(null, LoadLiveExperienceRequest.getDefaultInstance(), this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)
            );
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(LoadLiveExperienceResponse var1) {
      if (!var1.hasExperience()) {
         this.HIOHOIRCOHOOCORRHICCRHOHHIHIRI = null;
      } else {
         this.HIOHOIRCOHOOCORRHICCRHOHHIHIRI = var1.getExperience();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$submit(() -> {});
      }
   }

   @Generated
   public LiveExperience IICCIOOIOIORRRORCRRRHORRIHIROO() {
      return this.HIOHOIRCOHOOCORRHICCRHOHHIHIRI;
   }

   @Generated
   public boolean HHIIIOIICICOCCIHRCHIOOOIOHOHRO() {
      return this.HORCRHCOOICHIRCOIIIHICCOIOIIIR;
   }

   @Generated
   public boolean ROCICOOHOIOHIIRRROHOCIOOHHIHIH() {
      return this.RHOCOOHRCORCOHRROOOOIRRRHIIOOI;
   }

   @Generated
   public void RRICRRCHRHCCOOHCHHCRCCIRRICRHO(boolean var1) {
      this.HORCRHCOOICHIRCOIIIHICCOIOIIIR = var1;
   }

   @Generated
   public void OHIROCOCCHORRCCHIOICOCOHRHORCC(boolean var1) {
      this.RHOCOOHRCORCOHRROOOOIRRRHIIOOI = var1;
   }
}
