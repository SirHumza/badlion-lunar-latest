package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public record RIOOCHICIHRHOHCCCCCHOCCCOHCRHI() {
   @SerializedName("coins")
   private final int ORRRHOOHCCCCCICRHIHHOIHOIOCHOR;
   @SerializedName("barbarian")
   private final Map<String, Integer> IIRHHCRHORHOCRIOIRIIRHCHCOORRI;
   @SerializedName("mage")
   private final Map<String, Integer> HHHORCOOROCOHOIHRRORHOIOROCOIO;
   @SerializedName("common")
   private final Map<String, Integer> IHCHCRCIIOCOICCCCIRICCROIIOHCI;

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(int var1, Map<String, Integer> var2, Map<String, Integer> var3, Map<String, Integer> var4) {
      this.ORRRHOOHCCCCCICRHIHHOIHOIOCHOR = var1;
      this.IIRHHCRHORHOCRIOIRIIRHCHCOORRI = var2;
      this.HHHORCOOROCOHOIHRRORHOIOROCOIO = var3;
      this.IHCHCRCIIOCOICCCCIRICCROIIOHCI = var4;
   }

   @SerializedName("coins")
   public int IHIOOOHROOHOHIHRHHOHHHCOOHRHIO() {
      return this.ORRRHOOHCCCCCICRHIHHOIHOIOCHOR;
   }

   @SerializedName("barbarian")
   public Map<String, Integer> ROICOHORCIIRIRIHRRCIOHCHCOHCIC() {
      return this.IIRHHCRHORHOCRIOIRIIRHCHCOORRI;
   }

   @SerializedName("mage")
   public Map<String, Integer> RRCHOHCCCRIRIOIRIORCIHCCHRCORR() {
      return this.HHHORCOOROCOHOIHRRORHOIOROCOIO;
   }

   @SerializedName("common")
   public Map<String, Integer> CCROIICIHOCRCCCHOCOCRRIHCRRRCH() {
      return this.IHCHCRCIIOCOICCCCIRICCROIIOHCI;
   }
}
