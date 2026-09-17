package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import io.leangen.geantyref.TypeToken;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.StringUtils;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final List<IRCIIHHICIHRCOCRROCOICRIHHCCHH> IRHCROHOIIRCORRHHCOROIRICIOHCC = new ArrayList<>();

   @Override
   public Optional<String> parseTargetName(
      String var1,
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      String var3 = var2.HOHOCHHHOIHRRHOCRRRIRRRCOIHOCO();
      if (!StringUtils.isEmpty(var3) && !StringUtils.isWhitespace(var3)) {
         boolean var4 = com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HYPIXEL
         );
         String var5 = com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IOHHHHCRRIRRCHHICHOHHIRCIOORRH
            .RRRCHORHHHIHOCIOCRICCOIOOHHCOO()
            .HRCOCIRHOIRHCHRCOHHIROHIORRRIH;
         return this.IRHCROHOIIRCORRHHCOROIRICIOHCC
            .stream()
            .filter(var2x -> var2x.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var4, var5))
            .map(var2x -> var2x.ORHIOICIOCRRHOOCOHRORIHICHRCRR(var1, var3))
            .flatMap(Optional::stream)
            .findFirst();
      } else {
         return Optional.empty();
      }
   }

   public void HRROOHOOROHCOHCCRIROHOCRHHHRCO() {
      try {
         this.IRHCROHOIIRCORRHHCOROIRICIOHCC.clear();
         Path var1 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.HHIRHHICRHCCHRHIIIOIRRROCRHRIH.resolve("kill-sound-chat-patterns.json");
         String var2 = Files.readString(var1);
         TypeToken var3 = new TypeToken<List<IRCIIHHICIHRCOCRROCOICRIHHCCHH>>() {};
         this.IRHCROHOIIRCORRHHCOROIRICIOHCC.addAll(IIRHCHHOICHRICOOCRORCCIOOIHOIR.CRCCROROOHROIRIHCICROOIHHOOICI.fromJson(var2, var3.getType()));
      } catch (Exception var4) {
         com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var4, "Loading KillSounds chat patterns"
         );
      }
   }
}
