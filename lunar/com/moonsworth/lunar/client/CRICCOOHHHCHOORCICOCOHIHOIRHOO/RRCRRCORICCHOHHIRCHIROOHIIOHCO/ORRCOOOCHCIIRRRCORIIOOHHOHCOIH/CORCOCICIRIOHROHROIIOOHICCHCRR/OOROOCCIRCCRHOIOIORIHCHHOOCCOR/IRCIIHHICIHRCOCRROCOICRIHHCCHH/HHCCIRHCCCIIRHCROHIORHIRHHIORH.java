package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.annotations.SerializedName;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public record HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
   @SerializedName("name")
   private final String OIHHCOICRIHCRCHCIHORRCRIOHCOCC;
   @SerializedName("displayName")
   private final String RRCRRICOHCCCHIHCOCIHORCOCIIHOH;
   @SerializedName("maxLevel")
   private final int RCOOCHOHCCOHIIHHOCOCOHRHHHIOIC;
   @SerializedName("hypermaxLevel")
   private final int IHIRCRRIHICOHHCCOIHRHOORRIIIHC;
   @SerializedName("abbreviation")
   private final String OOHOCROIHRIIRCCHCIIOHHOHIHICOO;
   public static final Pattern OIIRHHHCIRHCRRIRCIRHHHORHOOCHR = Pattern.compile("(?<enchantName>[[a-zA-Z-] ]+) ([0-9IVXLCDM]+)(?:,|$)");

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, String var2, int var3, int var4, String var5) {
      this.OIHHCOICRIHCRCHCIHORRCRIOHCOCC = var1;
      this.RRCRRICOHCCCHIHCOCIHORCOCIIHOH = var2;
      this.RCOOCHOHCCOHIIHHOCOCOHRHHHIOIC = var3;
      this.IHIRCRRIHICOHHCCOIHRHOORRIIIHC = var4;
      this.OOHOCROIHRIIRCCHCIIOHHOHIHICOO = var5;
   }

   @Nullable
   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH HHROIRCCROHOCROOHCIOOCIROOHRIH(String var0) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IHIIROIOIHOHCHICOIIIHOHHCOIOCI()
         .ORICRIRORRCHHHRRHOORHIRCICHCCO();
      Map var2 = var1.HHOIIIIHHCROCRCCCOOHIHCIRHHIOI();
      return var2 == null ? null : (HHCCIRHCCCIIRHCROHIORHIRHHIORH)var2.get(var0);
   }

   public boolean CIRRIOOIHOHHRICCICOOCOROHCROCI() {
      return this.OIHHCOICRIHCRCHCIHORRCRIOHCOCC.startsWith("ULTIMATE_");
   }

   @SerializedName("name")
   public String name() {
      return this.OIHHCOICRIHCRCHCIHORRCRIOHCOCC;
   }

   @SerializedName("displayName")
   public String displayName() {
      return this.RRCRRICOHCCCHIHCOCIHORCOCIIHOH;
   }

   @SerializedName("maxLevel")
   public int RORCRICRCCROIIOHOHIIROIOOOOICC() {
      return this.RCOOCHOHCCOHIIHHOCOCOHRHHHIOIC;
   }

   @SerializedName("hypermaxLevel")
   public int OIRIRRCCIICHIIHOHRCRRRCRIOIOOR() {
      return this.IHIRCRRIHICOHHCCOIHRHOORRIIIHC;
   }

   @SerializedName("abbreviation")
   public String COHIOCRCIROCIHIOOOHICRIHHICHHC() {
      return this.OOHOCROIHRIIRCCHCIIOHHOHIHICOO;
   }
}
