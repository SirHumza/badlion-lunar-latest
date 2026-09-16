package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import lombok.Generated;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private final Map<String, Map<String, IRCIIHHICIHRCOCRROCOICRIHHCCHH>> IOCCORHCCCHRIRHROCHROCCCOOCRRH = new HashMap<>();
   private int ROCHCRHROHHCIHHRORCIRRIHHROOHC = 0;
   private final Set<String> CROICIROORIIRIIHOCRIRIIIROHCOH = new HashSet<>();
   private String IHCRCOIOCIIOCHCRRROOHCOCIIRCII = null;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      super(var1);
   }

   @Override
   public void start() {
      this.ROCHCRHROHHCIHHRORCIRRIHHROOHC = 0;
      this.CROICIROORIIRIIHOCRIRIIIROHCOH.clear();
   }

   @Override
   public void end() {
      Map var1 = this.IOCCORHCCCHRIRHROCHROCCCOOCRRH.get(this.IIHCCIRHCCICIRHICOCHCCRIHIIOHC());
      if (var1 != null) {
         ArrayList var2 = new ArrayList();

         for (String var4 : var1.keySet()) {
            if (!this.CROICIROORIIRIIHOCRIRIIIROHCOH.contains(var4)) {
               var2.add(var4);
            }
         }

         for (String var6 : var2) {
            ((IRCIIHHICIHRCOCRROCOICRIHHCCHH)var1.remove(var6)).delete();
         }
      }
   }

   public void ICIOIHRIHCHCIRRHROHOCOCCRHIHHH(String var1) {
      Map var2 = this.IOCCORHCCCHRIRHROCHROCCCOOCRRH.get(var1);
      if (var2 != null) {
         for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : var2.values()) {
            var4.delete();
         }
      }

      this.IOCCORHCCCHRIRHROCHROCCCOOCRRH.remove(var1);
   }

   public void RHOORRIIOCHIRRHOHOOHIROHCRICRO(String var1, String var2) {
      Map var3 = this.IOCCORHCCCHRIRHROCHROCCCOOCRRH.get(var1);
      if (var3 != null) {
         IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = (IRCIIHHICIHRCOCRROCOICRIHHCCHH)var3.get(var2);
         if (var4 != null) {
            var4.delete();
            var3.remove(var1);
         }
      }
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH CROHOOOIIOCCRHIIIRHICIIHRRRCCC(String var1) {
      Map var2 = this.IOCCORHCCCHRIRHROCHROCCCOOCRRH.computeIfAbsent(this.IIHCCIRHCCICIRHICOCHCCRIHIIOHC(), var0 -> new HashMap<>());
      return (IRCIIHHICIHRCOCRROCOICRIHHCCHH)var2.get(var1);
   }

   private IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, int var2, int var3, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4) {
      this.CROICIROORIIRIIHOCRIRIIIROHCOH.add(var1);
      Map var5 = this.IOCCORHCCCHRIRHROCHROCCCOOCRRH.computeIfAbsent(this.IIHCCIRHCCICIRHICOCHCCRIHIIOHC(), var0 -> new HashMap<>());
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = (IRCIIHHICIHRCOCRROCOICRIHHCCHH)var5.get(var1);
      if (var6 == null) {
         var6 = new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var3, var4);
         var5.put(var1, var6);
      }

      return var6;
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, int var2, int var3, int var4, int var5) {
      if (this.isSupported()) {
         if (!this.HIIRHRRHIIOCIOCROCHCOIHCCCRIHO().RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var2, var3, var4, var5)) {
            this.IHCRCOIOCIIOCHCRRROOHCOCIIRCII = var1;
            if (this.ROCHCRHROHHCIHHRORCIRRIHHROOHC++ <= 1) {
               IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var4, var5, this);
               var6.IRRCCOICORICIHCHRHIHIHROIRHOCR(var2, var3, var4, var5);
               this.IHOOIORIHHOOCIHHOIIOOHOIRIORIO.RRROICRCRIRHIRRRIIIRCROHIOHIOI();
               if (!var6.isDirty) {
                  this.IHOOIORIHHOOCIHHOIIOOHOIRIORIO.COOOIIOHIRCRCHIHRHHICOOHIOORRR(false);
               } else {
                  this.HIIRHRRHIIOCIOCROCHCOIHCCCRIHO().update();
                  var6.RORIHIRIIHICIHIROCRRIICHIICRHC();
                  this.IHOOIORIHHOOCIHHOIIOOHOIRIORIO.ROIHROCROORRCCOIRRIHHORCROOORO(false);
               }
            }
         }
      }
   }

   private boolean isSupported() {
      return false;
   }

   public void OOOCHHHRCHRRIHCRICCIIOCHOCIHOC(String var1) {
      if (this.isSupported()) {
         if (var1.equals(this.IHCRCOIOCIIOCHCRRROOHCOCIIRCII)) {
            this.IHCRCOIOCIIOCHCRRROOHCOCIIRCII = null;
            if (this.ROCHCRHROHHCIHHRORCIRRIHHROOHC-- <= 1) {
               IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = this.CROHOOOIIOCCRHIIIRHICIIHRRRCCC(var1);
               if (var2.isDirty) {
                  var2.RRCRRRCCIIIHIORHOIOHROOIHORROO();
                  var2.isDirty = false;
               }

               this.IHOOIORIHHOOCIHHOIIOOHOIRIORIO.HOCIOOIOHOHRRCCOROHCRRHORICCCH();
               var2.ICIRORCCIIOCCROCCCOHHCHROOHIRI();
            }
         }
      }
   }

   public void OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(String var1, String var2) {
      Map var3 = this.IOCCORHCCCHRIRHROCHROCCCOOCRRH.get(var1);
      if (var3 != null) {
         IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = (IRCIIHHICIHRCOCRROCOICRIHHCCHH)var3.get(var2);
         if (var4 != null) {
            var4.isDirty = true;
         }
      }
   }

   public void OHCRORHCICHHOORIRHHIORRHRCOCCR(String var1) {
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = this.CROHOOOIIOCCRHIIIRHICIIHRRRCCC(var1);
      if (var2 != null) {
         var2.isDirty = true;
      }
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH IOROCHHROHOCIHIIIICRHCROHCRIOC() {
      return this.OHRHHRCRORICRHRCHROHRROCRIIHRR();
   }

   @Generated
   public int OCICOCROIHIHCCOHIOCOIIRORHCOCH() {
      return this.ROCHCRHROHHCIHHRORCIRRIHHROOHC;
   }
}
