package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TranslatableComponent;
import com.moonsworth.lunar.lib.adventure.text.serializer.plain.PlainTextComponentSerializer;
import java.util.List;
import java.util.Optional;

public class CRRRICCRROCOHHOHIICIHORCOORRRH implements RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Override
   public Optional<String> parseTargetName(
      String var1,
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      if (var2.OIOORCCOCHRRIRRORRICOCOCROICII() instanceof TranslatableComponent var4) {
         String var5 = var4.key();
         List var6 = var4.arguments();
         if (var5.startsWith("death.")
            && var6.size() >= 2
            && var4.arguments().get(0).value() instanceof Component var7
            && var4.arguments().get(1).value() instanceof Component var8) {
            String var12 = PlainTextComponentSerializer.plainText().serialize(var8);
            if (var1.equals(var12)) {
               String var10 = PlainTextComponentSerializer.plainText().serialize(var7);
               return Optional.of(var10);
            }
         }
      }

      return Optional.empty();
   }
}
