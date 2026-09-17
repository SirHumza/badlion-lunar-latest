package com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   private final List<String> OROCORHIHCIHHOCRIICCHOIICOIRCC = new ArrayList<>();
   @Nullable
   private RCIROOOOICRHCCRRCIORHHIRCOIIIC CROCOCOOOIOIHOHHRHIOHOOCCOHOIO;

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(String var1, String var2) {
      this.OROCORHIHCIHHOCRIICCHOIICOIRCC.add(var1);
      if (var1.startsWith("*.")) {
         this.OROCORHIHCIHHOCRIICCHOIICOIRCC.add(var1.substring(2));
      }

      if (var2 != null) {
         try {
            this.CROCOCOOOIOIHOHHRHIOHOOCCOHOIO = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", var2);
         } catch (Exception var4) {
            this.CROCOCOOOIOIHOHHRHIOHOOCCOHOIO = null;
         }
      }

      if (this.CROCOCOOOIOIHOHHRHIOHOOCCOHOIO == null) {
         this.CROCOCOOOIOIHOHHRHIOHOOCCOHOIO = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIRHIRCRCROIOICCCHOIROROCORROO;
      }
   }

   @Generated
   public List<String> HCHIOHCORORROIIOHIIRCHCCIIICIC() {
      return this.OROCORHIHCIHHOCRIICCHOIICOIRCC;
   }

   @Nullable
   @Generated
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC getResource() {
      return this.CROCOCOOOIOIHOHHRHIOHOOCCOHOIO;
   }
}
