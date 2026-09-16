package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import java.util.HashMap;
import java.util.Map;
import lombok.Generated;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private ORHIOICIOCRRHOOCOHRORIHICHRCRR RRRHICCIOOIIHOCIHORCIROICRRRHI;
   private int ORCOOICOHOIHRRCOCRIIRHHHHHOOIO;
   private int x;
   private int RIROOIHRIROIRIICRHCIHIIICRCHRR;
   private int y;
   private OCOHORHCROHICRRIHCIHHRRCIHICRI HCCIIHHCHCHCOICIRCIIHOROHHCROH = OCOHORHCROHICRRIHCIHHRRCIHICRI.CENTER;
   private OCOHORHCROHICRRIHCIHHRRCIHICRI HOCCRIHHIOHHRCCHOROICOROOHHOHC = OCOHORHCROHICRRIHCIHHRRCIHICRI.CENTER;
   private boolean HOROCIHRCICROORRIIOHICOROHCCCR;
   private boolean COOIOOHOHIIROORHIRROORORHIRHOI;
   private final Map<Integer, Boolean> OCCOCOOOCOIORORRHOCHIRIOCRHCCO = new HashMap<>();

   public void CRICCOOHHHCHOORCICOCOHIHOIRHOO(ORHIOICIOCRRHOOCOHRORIHICHRCRR var1) {
      this.RRRHICCIOOIIHOCIHORCIROICRRRHI = var1;
      this.OCCOCOOOCOIORORRHOCHIRIOCRHCCO.clear();
   }

   public void OOCCRCRCOHIIORCCORCRCIRRROIOOR(int var1, int var2) {
      this.ORCOOICOHOIHRRCOCRIIRHHHHHOOIO = this.x;
      this.RIROOIHRIROIRIICRHCIHIIICRCHRR = this.y;
      this.x = var1;
      this.y = var2;
   }

   public int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(float var1, int var2) {
      int var3 = this.HCCIIHHCHCHCOICIRCIIHOROHHCROH.apply(this.ORCOOICOHOIHRRCOCRIIRHHHHHOOIO, var2);
      int var4 = this.HCCIIHHCHCHCOICIRCIIHOROHHCROH.apply(this.x, var2);
      return Math.round(var3 + (var4 - var3) * var1);
   }

   public int IRCIIHHICIHRCOCRROCOICRIHHCCHH(float var1, int var2) {
      int var3 = this.HOCCRIHHIOHHRCCHOROICOROOHHOHC.apply(this.RIROOIHRIROIRIICRHCIHIIICRCHRR, var2);
      int var4 = this.HOCCRIHHIOHHRCCHOROICOROOHHOHC.apply(this.y, var2);
      return Math.round(var3 + (var4 - var3) * var1);
   }

   @Generated
   public ORHIOICIOCRRHOOCOHRORIHICHRCRR RCORHIHICHCOORRRHCHCRICCHICOOO() {
      return this.RRRHICCIOOIIHOCIHORCIROICRRRHI;
   }

   @Generated
   public int RHIIRRIIIOHIOIOCRHCRRCOIIHIOOO() {
      return this.ORCOOICOHOIHRRCOCRIIRHHHHHOOIO;
   }

   @Generated
   public int getX() {
      return this.x;
   }

   @Generated
   public int CIRRIRRICIHRHCHORIHOIHOOIICCHR() {
      return this.RIROOIHRIROIRIICRHCIHIIICRCHRR;
   }

   @Generated
   public int getY() {
      return this.y;
   }

   @Generated
   public OCOHORHCROHICRRIHCIHHRRCIHICRI ORIOIHROOHIRIICORIHHCCRIIOCCIC() {
      return this.HCCIIHHCHCHCOICIRCIIHOROHHCROH;
   }

   @Generated
   public OCOHORHCROHICRRIHCIHHRRCIHICRI HROCIOHROOROHRCHOOHORCIIORCRRO() {
      return this.HOCCRIHHIOHHRCCHOROICOROOHHOHC;
   }

   @Generated
   public boolean ICROCROOIRCCCHHROIHIIOORCROHOC() {
      return this.HOROCIHRCICROORRIIOHICOROHCCCR;
   }

   @Generated
   public boolean ORCIOCHCIHOOCCCIOHCIRIOIOOIOHO() {
      return this.COOIOOHOHIIROORHIRROORORHIRHOI;
   }

   @Generated
   public Map<Integer, Boolean> CCOICCOORIIROIRIORIOORRICHCOCR() {
      return this.OCCOCOOOCOIORORRHOCHIRIOCRHCCO;
   }

   @Generated
   public void IOHCCIRCCICICHHHIOIOHCICICROIO(int var1) {
      this.ORCOOICOHOIHRRCOCRIIRHHHHHOOIO = var1;
   }

   @Generated
   public void OHRRHHOCROROCCIRROIHOCCHCIHCIR(int var1) {
      this.x = var1;
   }

   @Generated
   public void IOIHHIORCICCHIIHOIOIOHHRICRHIO(int var1) {
      this.RIROOIHRIROIRIICRHCIHIIICRCHRR = var1;
   }

   @Generated
   public void RCOCRROHHROHHOCRCCCHCIROIIOORC(int var1) {
      this.y = var1;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1) {
      this.HCCIIHHCHCHCOICIRCIIHOROHHCROH = var1;
   }

   @Generated
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1) {
      this.HOCCRIHHIOHHRCCHOROICOROOHHOHC = var1;
   }

   @Generated
   public void IOHCCIRCCICICHHHIOIOHCICICROIO(boolean var1) {
      this.HOROCIHRCICROORRIIOHICOROHCCCR = var1;
   }

   @Generated
   public void IOIHHIORCICCHIIHOIOIOHHRICRHIO(boolean var1) {
      this.COOIOOHOHIIROORHIRROORORHIRHOI = var1;
   }

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

         if (this.RHIIRRIIIOHIOIOCRHCRRCOIIHIOOO() != var2.RHIIRRIIIOHIOIOCRHCRRCOIIHIOOO()) {
            return false;
         }

         if (this.getX() != var2.getX()) {
            return false;
         }

         if (this.CIRRIRRICIHRHCHORIHOIHOOIICCHR() != var2.CIRRIRRICIHRHCHORIHOIHOOIICCHR()) {
            return false;
         }

         if (this.getY() != var2.getY()) {
            return false;
         }

         if (this.ICROCROOIRCCCHHROIHIIOORCROHOC() != var2.ICROCROOIRCCCHHROIHIIOORCROHOC()) {
            return false;
         }

         if (this.ORCIOCHCIHOOCCCIOHCIRIOIOOIOHO() != var2.ORCIOCHCIHOOCCCIOHCIRIOIOOIOHO()) {
            return false;
         }

         ORHIOICIOCRRHOOCOHRORIHICHRCRR var3 = this.RCORHIHICHCOORRRHCHCRICCHICOOO();
         ORHIOICIOCRRHOOCOHRORIHICHRCRR var4 = var2.RCORHIHICHCOORRRHCHCRICCHICOOO();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            OCOHORHCROHICRRIHCIHHRRCIHICRI var5 = this.ORIOIHROOHIRIICORIHHCCRIIOCCIC();
            OCOHORHCROHICRRIHCIHHRRCIHICRI var6 = var2.ORIOIHROOHIRIICORIHHCCRIIOCCIC();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               OCOHORHCROHICRRIHCIHHRRCIHICRI var7 = this.HROCIOHROOROHRCHOOHORCIIORCRRO();
               OCOHORHCROHICRRIHCIHHRRCIHICRI var8 = var2.HROCIOHROOROHRCHOOHORCIIORCRRO();
               if (var7 == null ? var8 == null : var7.equals(var8)) {
                  Map var9 = this.CCOICCOORIIROIRIORIOORRICHCOCR();
                  Map var10 = var2.CCOICCOORIIROIRIORIOORRICHCOCR();
                  return var9 == null ? var10 == null : var9.equals(var10);
               } else {
                  return false;
               }
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
      var2 = var2 * 59 + this.RHIIRRIIIOHIOIOCRHCRRCOIIHIOOO();
      var2 = var2 * 59 + this.getX();
      var2 = var2 * 59 + this.CIRRIRRICIHRHCHORIHOIHOOIICCHR();
      var2 = var2 * 59 + this.getY();
      var2 = var2 * 59 + (this.ICROCROOIRCCCHHROIHIIOORCROHOC() ? 79 : 97);
      var2 = var2 * 59 + (this.ORCIOCHCIHOOCCCIOHCIRIOIOOIOHO() ? 79 : 97);
      ORHIOICIOCRRHOOCOHRORIHICHRCRR var3 = this.RCORHIHICHCOORRRHCHCRICCHICOOO();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      OCOHORHCROHICRRIHCIHHRRCIHICRI var4 = this.ORIOIHROOHIRIICORIHHCCRIIOCCIC();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      OCOHORHCROHICRRIHCIHHRRCIHICRI var5 = this.HROCIOHROOROHRCHOOHORCIIORCRRO();
      var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
      Map var6 = this.CCOICCOORIIROIRIORIOORRICHCOCR();
      return var2 * 59 + (var6 == null ? 43 : var6.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "GuiScreenContext(guiScreen="
         + this.RCORHIHICHCOORRRHCHCRICCHICOOO()
         + ", prevX="
         + this.RHIIRRIIIOHIOIOCRHCRRCOIIHIOOO()
         + ", x="
         + this.getX()
         + ", prevY="
         + this.CIRRIRRICIHRHCHORIHOIHOOIICCHR()
         + ", y="
         + this.getY()
         + ", xAnchor="
         + this.ORIOIHROOHIRIICORIHHCCRIIOCCIC()
         + ", yAnchor="
         + this.HROCIOHROOROHRCHOOHORCIIORCRRO()
         + ", isShiftDown="
         + this.ICROCROOIRCCCHHROIHIIOORCROHOC()
         + ", isCtrlDown="
         + this.ORCIOCHCIHOOCCCIOHCIRIOIOOIOHO()
         + ", mouseButtons="
         + this.CCOICCOORIIROIRIORIOORRICHCOCR()
         + ")";
   }
}
