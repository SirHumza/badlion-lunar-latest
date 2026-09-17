package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.moonsworth.lunar.client.util.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import org.jetbrains.annotations.NotNull;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 8)
public class RRCRRCORICCHOHHIRCHIROOHIIOHCO<ID> extends CRRRICCRROCOHHOHIICIHORCOORRRH<ID> implements RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<ID> {
   private final Set<ID> COCCIORIHHRHHRCHCHOHOOOOOHIRCO = new HashSet<>();

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<ID> var1
   ) {
      super(var1);
   }

   @NotNull
   @Override
   public Iterator<ID> iterator() {
      return new RCIROOOOICRHCCRRCIORHHIRCOIIIC<>(super.iterator(), var1 -> !this.COCCIORIHHRHHRCHCHOHOOOOOHIRCO.contains(var1));
   }

   @Override
   public void IHCHCOCCRRRCCHHCRHRRRHOIOROHCO() {
      this.HIOOCROCCCOCIROIHOOROORIRHOIRI();
   }

   protected void HIOOCROCCCOCIROIHOOROORIRHOIRI() {
      this.COCCIORIHHRHHRCHCHOHOOOOOHIRCO.clear();
   }

   @Override
   public void IHIIIRHOOCHRCCCCIORIROCOIRRHCC(ID var1) {
      this.COCCIORIHHRHHRCHCHOHOOOOOHIRCO.add((ID)var1);
   }

   @Override
   public void HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(ID var1) {
      this.COCCIORIHHRHHRCHCHOHOOOOOHIRCO.remove(var1);
   }

   @Override
   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ID var1, Predicate<ID> var2) {
      if (this.COCCIORIHHRHHRCHCHOHOOOOOHIRCO.contains(var1)) {
         return true;
      } else if (var2.test(var1)) {
         this.COCCIORIHHRHHRCHCHOHOOOOOHIRCO.add((ID)var1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean HRRHRCCOOIOIIIRORIOOORORHOORIH(ID var1) {
      return this.COCCIORIHHRHHRCHCHOHOOOOOHIRCO.contains(var1);
   }

   @Override
   public void clear() {
      super.clear();
      this.COCCIORIHHRHHRCHCHOHOOOOOHIRCO.clear();
   }

   @Override
   public void RICRIHOOHROHICCHHIIHRHCORHIOHR(ID var1) {
      super.RICRIHOOHROHICCHHIIHRHCORHIOHR((ID)var1);
      this.COCCIORIHHRHHRCHCHOHOOOOOHIRCO.remove(var1);
   }

   @Override
   public void RIIHIHHCRHCHRCICHOROHCHIIHCICH(ID var1) {
      super.RIIHIHHCRHCHRCICHOROHCHIIHCICH((ID)var1);
      this.COCCIORIHHRHHRCHCHOHOOOOOHIRCO.remove(var1);
   }
}
