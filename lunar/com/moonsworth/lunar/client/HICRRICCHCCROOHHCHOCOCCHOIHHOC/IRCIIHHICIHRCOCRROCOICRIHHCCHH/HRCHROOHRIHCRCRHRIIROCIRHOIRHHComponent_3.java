package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private final int RRRCCOCHRCHHIOHCOHCHOCROIICCOI;
   private final String HHCOHCCHORRRHIHCHRCROOOCOHRHIR;
   private final String HCHRRCRRRIHRCHCHCORCCRHRRCCCOC;
   private final String HCRRCOIHIIHIHIRHRROIHICRCHRHRR;
   private final String IOCCRHCRIRHCROCCOIIIIHHOIRORHC;
   private final String link;
   private final boolean CCOROROCOOROICRRIHOIHHHCIHCCRO;
   private final RCIROOOOICRHCCRRCIORHHIRCOIIIC RIRIOOHCRIIRRORRHROHIRIHRIIRRO;
   private static final Pattern IRCRRORROIOOHIRROCCCCICRRCCCCC = Pattern.compile("\\{COUNTDOWN:(.*?)\\}");

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, String var2, String var3, String var4, String var5, String var6, boolean var7) {
      this.RRRCCOCHRCHHIOHCOHCHOCROIICCOI = var1;
      this.HHCOHCCHORRRHIHCHRCROOOCOHRHIR = var2;
      this.HCHRRCRRRIHRCHCHCORCCRHRRCCCOC = var3;
      this.HCRRCOIHIIHIHIRHRROIHICRCHRHRR = var4;
      this.IOCCRHCRIRHCROCCOIIIIHHOIRORHC = var5;
      this.link = var6;
      this.CCOROROCOOROICRRIHOIHHHCIHCCRO = var7;
      this.RIRIOOHCRIIRRORRHROHIRIHRIIRRO = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
         "lunar", "icons/alerts/" + this.IOCCRHCRIRHCROCCOIIIIHHOIRORHC.toLowerCase() + ".webp"
      );
   }

   public String IOCICORRHIRHRORROIRORORCCROCHR() {
      Matcher var1 = IRCRRORROIOOHIRROCCCCICRRCCCCC.matcher(this.HCHRRCRRRIHRCHCHCORCCRHRRCCCOC);
      String var2 = "";
      if (var1.find()) {
         long var3 = Integer.parseInt(var1.group(1).trim());
         long var5 = System.currentTimeMillis() / 1000L;
         var2 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3, var5);
      }

      return this.HCHRRCRRRIHRCHCHCORCCRHRRCCCOC.replaceAll(IRCRRORROIOOHIRROCCCCICRRCCCCC.pattern(), var2);
   }

   private static String IRCIIHHICIHRCOCRROCOICRIHHCCHH(long var0, long var2) {
      String var4 = "now";
      if (var0 > var2) {
         long var5 = var0 - var2;
         int var7 = Math.round((float)var5 / 86400.0F);
         int var8 = Math.round((float)var5 % 86400.0F / 3600.0F);
         int var9 = Math.round((float)var5 % 3600.0F / 60.0F);
         int var10 = Math.round((float)(var5 % 60L));
         var4 = var7 + "d " + var8 + "h " + var9 + "m " + var10 + "s";
      }

      return var4;
   }

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("id", this.RRRCCOCHRCHHIOHCOHCHOCROIICCOI);
      var1.addProperty("name", this.HHCOHCCHORRRHIHCHRCROOOCOHRHIR);
      var1.addProperty("text", this.IOCICORRHIRHRORROIRORORCCROCHR());
      var1.addProperty("color", this.HCRRCOIHIIHIHIRHRROIHICRCHRHRR);
      var1.addProperty("icon", this.IOCCRHCRIRHCROCCOIIIIHHOIRORHC.toLowerCase());
      var1.addProperty("link", this.link);
      var1.addProperty("dismissible", this.CCOROROCOOROICRRIHOIHHHCIHCCRO);
      return var1;
   }

   @Generated
   public int getId() {
      return this.RRRCCOCHRCHHIOHCOHCHOCROIICCOI;
   }

   @Generated
   public String getName() {
      return this.HHCOHCCHORRRHIHCHRCROOOCOHRHIR;
   }

   @Generated
   public String getText() {
      return this.HCHRRCRRRIHRCHCHCORCCRHRRCCCOC;
   }

   @Generated
   public String getColor() {
      return this.HCRRCOIHIIHIHIRHRROIHICRCHRHRR;
   }

   @Generated
   public String getIcon() {
      return this.IOCCRHCRIRHCROCCOIIIIHHOIRORHC;
   }

   @Generated
   public String HROIRIROCICIROHHHRRCRHCHCHCCOI() {
      return this.link;
   }

   @Generated
   public boolean OIRCOHRIIRHHHCICOHCRCOHOOIIOHR() {
      return this.CCOROROCOOROICRRIHOIHHHCIHCCRO;
   }

   @Generated
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC RROIHRRCHOHRIHOIOHORRRORHCOOHR() {
      return this.RIRIOOHCRIIRRORRHROHIRIHRIIRRO;
   }
}
