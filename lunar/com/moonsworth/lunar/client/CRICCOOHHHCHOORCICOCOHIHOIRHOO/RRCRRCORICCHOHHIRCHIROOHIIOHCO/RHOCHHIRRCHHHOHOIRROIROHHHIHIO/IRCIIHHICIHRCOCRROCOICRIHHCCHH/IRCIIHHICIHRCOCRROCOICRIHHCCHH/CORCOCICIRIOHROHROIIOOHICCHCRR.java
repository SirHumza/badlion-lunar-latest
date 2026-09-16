package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public class CORCOCICIRIOHROHROIIOOHICCHCRR
   implements com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Override
   public String name() {
      return "profile-data";
   }

   @Override
   public boolean HCRCCCICHHRRHROCHIOOHCHCRORCCO() {
      return true;
   }

   @Override
   public Duration HHOICRCRCROCOIROOCROOROOOORHRR() {
      return Duration.ofMillis(100L);
   }

   @Override
   public com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ROOOCCORIHOOROIOIRHCRRIRCCIIHC() {
      return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PRE_COLLECT;
   }

   @Override
   public Future<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> RIIOIHHIHRHOHCORCRHHRHCHICCHOR() {
      return CompletableFuture.supplyAsync(
         () -> {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0 = new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
            com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .RCCIROHIHIOOOIOOCIRORHCRROIROR()
               .IHHHHRRIICCICIIHIRHOORRICCHROO();
            if (var1 != null && var1.getFile() != null) {
               Path var2 = var1.getFile().toPath();
               if (!Files.isDirectory(var2)) {
                  return var0;
               }

               try (Stream var3 = Files.walk(var2)) {
                  var3.filter(var0x -> Files.isRegularFile(var0x)).forEach(var2x -> {
                     try {
                        String var3x = var2.relativize(var2x).toString().replace('\\', '/');
                        var0.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("profile/" + var3x, Files.readAllBytes(var2x));
                     } catch (IOException var4) {
                        var0.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("Failed to read profile file " + var2x, var4);
                     }
                  });
               } catch (IOException var8) {
                  var0.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("Failed to walk profile directory " + var2, var8);
               }

               return var0;
            } else {
               return var0;
            }
         }
      );
   }
}
