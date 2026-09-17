package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

public abstract class IIRHCHHOICHRICOOCRORCCIOOIHOIR {
   public static final int OCCCHROHHRHORORCIOOCRCHOOORCIO = 0;
   public static final int CCCOROCHIIIRHRHRRRRHICRIIHIRII = 1;
   public static final int COROIICCIOOHOHICOOHRIOHOIHHRCI = 2;
   protected int _type;
   protected int _index;
   protected int OHIIRCICIOROHRHIOCICCRIOOIHCCC;

   protected IIRHCHHOICHRICOOCRORCCIOOIHOIR() {
   }

   protected IIRHCHHOICHRICOOCRORCCIOOIHOIR(IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      this._type = var1._type;
      this._index = var1._index;
   }

   protected IIRHCHHOICHRICOOCRORCCIOOIHOIR(int var1, int var2) {
      this._type = var1;
      this._index = var2;
   }

   public abstract IIRHCHHOICHRICOOCRORCCIOOIHOIR RHOOHRHOICCCORHOHCIRORICOCHIHC();

   public final boolean IICRICHRCOOHHCCOCIOOIIHROCRRRH() {
      return this._type == 1;
   }

   public final boolean IHIOORIIHRCOOIHCOORICORRCOOOIO() {
      return this._type == 0;
   }

   public final boolean HROOCOCOCIRRHOCCOIHIIHOOOICOHO() {
      return this._type == 2;
   }

   public final int CIROCHHRCRHOICHHIHHCIHCCRCROOC() {
      return this.OHIIRCICIOROHRHIOCICCRIOOIHCCC;
   }

   @Deprecated
   public final String OROOCRHHCIICHOHORROROICCIOORRO() {
      switch (this._type) {
         case 0:
            return "ROOT";
         case 1:
            return "ARRAY";
         case 2:
            return "OBJECT";
         default:
            return "?";
      }
   }

   public String OHOIHIRHIIIOIOROCCOHOROIOCIRCI() {
      switch (this._type) {
         case 0:
            return "root";
         case 1:
            return "Array";
         case 2:
            return "Object";
         default:
            return "?";
      }
   }

   public final int CRCORRIIIHIIHHRICHHOROIOIIIHIR() {
      return this._index + 1;
   }

   public final int CCRIOHCRRICIIIORCROOHCRCOIIORI() {
      return this._index < 0 ? 0 : this._index;
   }

   public boolean CHIHCOORORCOCHIRIOOOHOHRIHCICH() {
      return this._index >= 0;
   }

   public boolean ROROHCHOORHOHIIICOIRHRROIHRHHH() {
      if (this._type == 2) {
         return this.IOHCRHORCHRHIHOOCIHHORHCROHCHI();
      } else {
         return this._type == 1 ? this.CHIHCOORORCOCHIRIOOOHOHRIHCICH() : false;
      }
   }

   public abstract String CIOOORCHHCOOOOIIOOCIOICCRRORCH();

   public boolean IOHCRHORCHRHIHOOCIHHORHCROHCHI() {
      return this.CIOOORCHHCOOOOIIOOCIOICCRRORCH() != null;
   }

   public Object ICOCOHRRRORIIHIRRICICCHCHIIOHI() {
      return null;
   }

   public void IHHCHIIHOOHRROCRRRHHHCOOHCOORC(Object var1) {
   }

   public CIOHHCORHRCCRICCCORIHCRHCCCRRR CHOHIIRHCHOOHHRICCHHOICHCHORIH() {
      return CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, false);
   }

   public CIOHHCORHRCCRICCCORIHCRHCCCRRR IICIIHIHHRCIIRHCRROHIHHOICROIR(boolean var1) {
      return CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1);
   }

   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1
   ) {
      return HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OIOICHIHOORIROOOHRRIHCHHCHHIRC;
   }

   @Deprecated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI OOOOCHIHOOCHCCIHHRRICIRIOHOCRO(Object var1) {
      return HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OIOICHIHOORIROOOHRRIHCHHCHHIRC;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder(64);
      switch (this._type) {
         case 0:
            var1.append("/");
            break;
         case 1:
            var1.append('[');
            var1.append(this.CCRIOHCRRICIIIORCROOHCRCOIIORI());
            var1.append(']');
            break;
         case 2:
         default:
            var1.append('{');
            String var2 = this.CIOOORCHHCOOOOIIOOCIOICCRRORCH();
            if (var2 != null) {
               var1.append('"');
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  var1, var2
               );
               var1.append('"');
            } else {
               var1.append('?');
            }

            var1.append('}');
      }

      return var1.toString();
   }
}
