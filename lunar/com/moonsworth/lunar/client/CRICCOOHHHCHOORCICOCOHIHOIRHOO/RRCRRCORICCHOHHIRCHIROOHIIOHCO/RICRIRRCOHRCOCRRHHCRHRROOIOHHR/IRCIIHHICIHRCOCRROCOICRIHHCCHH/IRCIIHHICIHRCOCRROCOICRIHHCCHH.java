package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.function.Consumer;

public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   public static final int HRRRCOHOIIOCIRCRIIIHRICROCCOHC = 242;
   public static final int HOHHOIHOOIOCOCHRHHHRIRICRHIRIO = 52;
   private final int[] values;
   private final String label;
   protected int OIOROIRHRRIRCHIIORCCCCCCCHCHCO = 0;
   protected int IRHROROCOIIRCOOOCOCICOIIIOOIHO = 0;
   protected String IOOCOOIHOHRHRRHOHCRICHIRCIIIHO;
   private long HHRRRORIICOCHCOOOORHHOOHHIOHHI = 0L;
   private int valueIndex = -1;
   private boolean HOOHHCICCHCRCHHCOHHICCCOOHHCIH = false;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1, String var2) {
      this.values = new int[var1];
      this.label = var2;
   }

   public void ICRIOOCICRHOIRORHHHROHRIOHCOHC() {
      this.valueIndex = -1;
      this.HOOHHCICCHCRCHHCOHHICCCOOHHCIH = false;
      this.IRHROROCOIIRCOOOCOCICOIIIOOIHO = 0;
      this.HHRRRORIICOCHCOOOORHHOOHHIOHHI = 0L;
   }

   public void forEach(Consumer<Integer> var1) {
      for (int var2 = this.valueIndex; var2 >= 0; var2--) {
         var1.accept(this.values[var2]);
      }

      if (this.HOOHHCICCHCRCHHCOHHICCCOOHHCIH) {
         for (int var3 = this.values.length - 1; var3 > this.valueIndex; var3--) {
            var1.accept(this.values[var3]);
         }
      }
   }

   public void IOHOOIOHCHICOCHIICHCICCOHRCIII(int var1) {
      this.valueIndex++;
      if (this.valueIndex >= this.values.length) {
         this.valueIndex = 0;
         this.HOOHHCICCHCRCHHCOHHICCCOOHHCIH = true;
      }

      if (this.HOOHHCICCHCRCHHCOHHICCCOOHHCIH) {
         int var2 = this.values[this.valueIndex];
         this.HHRRRORIICOCHCOOOORHHOOHHIOHHI -= var2;
         if (var2 == this.IRHROROCOIIRCOOOCOCICOIIIOOIHO && var1 < this.IRHROROCOIIRCOOOCOCICOIIIOOIHO) {
            this.IHORRHOROHHHIORCCHRCRIRRHHCCCO(this.valueIndex);
         }
      }

      this.values[this.valueIndex] = var1;
      this.HHRRRORIICOCHCOOOORHHOOHHIOHHI += var1;
      if (var1 > this.IRHROROCOIIRCOOOCOCICOIIIOOIHO) {
         this.IRHROROCOIIRCOOOCOCICOIIIOOIHO = var1;
      }
   }

   protected void IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1, String var2) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < var1) {
         this.IOOCOOIHOHRHRRHOHCRICHIRCIIIHO = var2;
      }
   }

   private void IHORRHOROHHHIORCCHRCRIRRHHCCCO(int var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < this.values.length; var3++) {
         if (var3 != var1 && this.values[var3] > var2) {
            var2 = this.values[var3];
         }
      }

      this.IRHROROCOIIRCOOOCOCICOIIIOOIHO = var2;
   }

   public int IRRHIHORRHHRHIIOCCRCIIHHCRCCIC() {
      return this.HOOHHCICCHCRCHHCOHHICCCOOHHCIH ? this.values.length : this.valueIndex + 1;
   }

   public double OHRHCCOHROOORCOHRCOIHIRIROIICO() {
      int var1 = this.IRRHIHORRHHRHIIOCCRCIIHHCRCCIC();
      return var1 == 0 ? 0.0 : (double)this.HHRRRORIICOCHCOOOORHHOOHHIOHHI / var1;
   }

   public int OORHIRCHHHCCOIIOHOIRIHRHCHICIC() {
      return this.valueIndex == -1 ? 0 : this.values[this.valueIndex];
   }

   protected int[] RCRIOCHCIOHHRICORCOOOIHIIRCRRH() {
      return null;
   }

   public int CHICIOOHIRRHRICHOOHCHOHOIHICRR() {
      return Math.max(this.IRHROROCOIIRCOOOCOCICOIIIOOIHO, this.OIOROIRHRRIRCHIIORCCCCCCCHCHCO);
   }

   public boolean OHRRHCRRCROIOORHRORORHCOCROHOI() {
      return this.IOOCOOIHOHRHRRHOHCRICHIRCIIIHO != null;
   }

   public abstract String IHROCRRIRIROCCCRCRRROCRRCRIIHH(int var1);

   protected int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      int var1,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2
   ) {
      return var2.OORCORROOCRHIHHIIRCHIRHCRIRHHC().IIHRCCCOORHICRRHCROICHOHOIOICO.CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(0.0F);
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2,
      float var3,
      float var4,
      boolean var5
   ) {
      if (this.OHRRHCRRCROIOORHRORORHCOCROHOI() && !var5) {
         return false;
      }

      byte var6 = 50;
      short var7 = 240;
      var3++;
      var4++;
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = var2.OORCORROOCRHIHHIIRCHIRHCRIRHHC();
      int var9 = var8.HIRRCORIHCHHRCIHHIIRHRRCHHRCIH.CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(0.0F);
      int var10 = var2.OORCORROOCRHIHHIIRCHIRHCRIRHHC().IIHRCCCOORHICRRHCROICHOHOIOICO.CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(0.0F);
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var11 = var1.RCHHRIOCRHHIHIROCIRCRHRIOOOCOO();
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var11, (int)var3 - 1, (int)var4 - 1, var7 + 2, var6 + 2, var9);
      int var12 = var7 / this.values.length;
      int var13 = this.CHICIOOHIRRHRICHOOHCHOHOIHICRR();
      if (!this.OHRRHCRRCROIOORHRORORHCOCROHOI()) {
         int[] var14 = new int[this.IRRHIHORRHHRHIIOCCRCIIHHCRCCIC()];
         int var15 = var14.length;

         for (int var16 = this.valueIndex; var16 >= 0; var16--) {
            var14[--var15] = this.values[var16];
         }

         if (this.HOOHHCICCHCRCHHCOHHICCCOOHHCIH) {
            for (int var34 = this.values.length - 1; var34 > this.valueIndex; var34--) {
               var14[--var15] = this.values[var34];
            }
         }

         int var35 = (int)(var3 + var7 - var14.length * var12);
         var11.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var35, var4, var12, var6, var10, var14, var13);
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var32 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR();
      boolean var33 = var8.HCORRRCRCIOOIOOOROIIICIRIIORHH.get();
      if (this.label != null && !this.label.isEmpty()) {
         float var36 = var32.bridge$getStringWidth(this.label);
         var11.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var32, this.label, (int)(var3 + var7 - var36 - 1.0F), (int)(var4 + 1.0F), var9, var33);
      }

      if (this.OHRRHCRRCROIOORHRORORHCOCROHOI()) {
         var3 += 121.0F;
         var4 += 26.0F;
         String var38 = "This chart is not available for";
         String var39 = "versions lower than " + this.IOOCOOIHOHRHRRHOHCRICHIRCIIIHO;
         int var40 = var32.OHRCIORHOCHOORCRHHOHRRRCCOICCO();
         var4 -= var40 / 2.0F + 1.0F;
         var11.CRRRICCRROCOHHOHIICIHORCOORRRH(var32, var38, (int)var3, (int)var4, -43691, var33);
         var4 += var40;
         var11.CRRRICCRROCOHHOHIICIHORCOORRRH(var32, var39, (int)var3, (int)var4, -43691, var33);
         return true;
      }

      String var37 = this.IHROCRRIRIROCCCRCRRROCRRCRIIHH(var13);
      var11.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var32, var37, (int)var3 + 1, (int)var4 + 1, var9, var33);
      int[] var17 = this.RCRIOCHCIOHHRICORCOOOIHIIRCRRH();
      if (var17 == null) {
         return true;
      }

      for (int var22 : var17) {
         double var23 = (double)var22 / var13;
         float var18 = (float)(var4 + var6 - var23 * var6);
         var11.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((int)var3, (int)var18, (int)(var3 + var7), (int)(var18 + 1.0F), var9);
         String var25 = this.IHROCRRIRIROCCCRCRRROCRRCRIIHH(var22);
         var11.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var32, var25, (int)var3 + 1, (int)var18 + 2, var9, var33);
      }

      return true;
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6
   ) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3, var2 + var4, var3 + 1, var6);
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3, var2 + 1, var3 + var5, var6);
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2 + var4 - 1, var3, var2 + var4, var3 + var5, var6);
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3 + var5 - 1, var2 + var4, var3 + var5, var6);
   }
}
