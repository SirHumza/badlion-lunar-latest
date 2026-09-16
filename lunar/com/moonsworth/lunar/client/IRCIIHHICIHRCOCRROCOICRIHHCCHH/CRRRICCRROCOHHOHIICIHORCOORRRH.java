package com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.util.ICOHIIIRCIORCORHRRROOOOCOOROIC;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import lombok.Generated;

public class CRRRICCRROCOHHOHIICIHORCOORRRH
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private static final DateTimeFormatter CIHCCOIHHHRRHOOOHOOHOCCIRCIORI = DateTimeFormatter.ofPattern("HH:mm:ss");
   private final String OHRCOIHHHCOOOCROHHIOIHOHCORORI;
   private final com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH ICCOHOOCICIIRROCRCCIOOOIIRHROO;
   private final String RHCRCRHICRIOHHIIORHCRCIORCIOHO;
   private final String HOORROCORHRIRIOHIOHIHHHHHIORHH;
   private final List<String> CRRIRRIHCIHRRIHRIRRRRIHCRHCCHR;
   private boolean ORHCIRCCHICHOIIHIIRHCRROHRHOIO;

   public CRRRICCRROCOHHOHIICIHORCOORRRH(com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, String var2) {
      this.ICCOHOOCICIIRROCRCCIOOOIIRHROO = var1;
      this.OHRCOIHHHCOOOCROHHIOIHOHCORORI = LocalDateTime.now().format(CIHCCOIHHHRRHOOOHOOHOCCIRCIORI);
      String var3 = this.OHRCOIHHHCOOOCROHHIOIHOHCORORI + " " + var1.ROCCHOHOIICCCROOHIHHHRORHCCIRI() + ": ";
      this.HOORROCORHRIRIOHIOHIHHHHHIORHH = var2;
      this.RHCRCRHICRIOHHIIORHCRCIORCIOHO = var3 + var2;
      this.CRRIRRIHCIHRRIHRIRRRRIHCRHCCHR = ICOHIIIRCIORCORHRRROOOOCOOROIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextWithoutFormattingCodes(
            this.RHCRCRHICRIOHHIIORHCRCIORCIOHO
         ),
         180.0F,
         true
      );
      this.ORHCIRCCHICHOIIHIIRHCRROHRHOIO = false;
      String var4 = this.getLines().get(0).replaceFirst(var3, "");
      this.CRRIRRIHCIHRRIHRIRRRRIHCRHCCHR.remove(0);
      this.CRRIRRIHCIHRRIHRIRRRRIHCRHCCHR.add(0, var4);
   }

   public void CRCHORHCICOCRCCHOOCICICRIOCOIC() {
      this.ORHCIRCCHICHOIIHIIRHCRROHRHOIO = true;
   }

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("user", this.ICCOHOOCICIIRROCRCCIOOOIIRHROO.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI().toString());
      var1.addProperty("time", this.OHRCOIHHHCOOOCROHHIOIHOHCORORI);
      var1.addProperty("message", this.HOORROCORHRIRIOHIOHIHHHHHIORHH);
      return var1;
   }

   @Generated
   public String IIROIIIIICHCROIIORRHCOOHHHCOHH() {
      return this.OHRCOIHHHCOOOCROHHIOIHOHCORORI;
   }

   @Generated
   public com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH RROHIIOHORHICRHIHCCRRRHIHCHRCC() {
      return this.ICCOHOOCICIIRROCRCCIOOOIIRHROO;
   }

   @Generated
   public String CIRRIOOCOIROROOOIHIRIHOORRRIOO() {
      return this.RHCRCRHICRIOHHIIORHCRCIORCIOHO;
   }

   @Generated
   public List<String> getLines() {
      return this.CRRIRRIHCIHRRIHRIRRRRIHCRHCCHR;
   }

   @Generated
   public boolean HIOIHCRCIHHCIHIHRRCROICIRIIHCR() {
      return this.ORHCIRCCHICHOIIHIIRHCRROHRHOIO;
   }
}
