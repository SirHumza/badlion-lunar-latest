package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.google.gson.JsonArray;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.Generated;
import org.apache.commons.io.FilenameUtils;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH HHIIIIIOOCOHORIIORHCCROIRHIIOO = new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH();

   public void RRIHIHHCHRCHROIHOHCCIHROHROCHH() {
      File var1 = com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR.CRHIIROORHCIHCHRIHHROOHRRIOHIH.toFile();
      if (var1.exists()) {
         File[] var2 = var1.listFiles();
         if (var2 == null) {
            return;
         }

         Set var3 = this.OHHRCRIOOCIORORHIOHRICRHHORCIH()
            .stream()
            .map(com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::getHash)
            .collect(Collectors.toSet());

         for (File var7 : var2) {
            String var8 = FilenameUtils.removeExtension(var7.getName());
            if (!var3.contains(var8) && var7.delete()) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  "Blog Posts", "Removed cached blog post image: %s", var8
               );
            }
         }
      }
   }

   public void ICOICCOIOCHOOOORHOHHRHHHORIIRO() {
      Path var1 = com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR.CRHIIROORHCIHCHRIHHROOHRRIOHIH;

      try {
         Files.createDirectories(var1);
      } catch (IOException var8) {
         com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, "Loading BlogImages");
         return;
      }

      File[] var2 = var1.toFile().listFiles();
      if (var2 != null) {
         ArrayList var3 = new ArrayList();

         for (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 : this.OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
            String var6 = var5.getHash();
            String var7 = var6
               + "."
               + com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIIOIOCRHCOHHCROOIIROICRCCIHHC
                  .subtype();
            if (Arrays.stream(var2).noneMatch(var1x -> var1x.getName().equals(var7))) {
               var3.add(var5);
            } else {
               var5.HROICORRORCIOIHHOROICROHIOCHIO(var7);
            }
         }

         this.IRCCIIIOCIRCCCROHOHOROORRHOHHI();
         if (!var3.isEmpty()) {
            new Thread(new com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3))
               .start();
         }
      }
   }

   @Override
   protected Set<com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> ORRHHOHHRICCROHHICIOOHOOCRRRCC() {
      return new LinkedHashSet<>();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      this.OHHRCRIOOCIORORHIOHRICRHHORCIH().add(var1);
      this.IRCCIIIOCIRCCCROHOHOROORRHOHHI();
   }

   public void IRCCIIIOCIRCCCROHOHOROORRHOHHI() {
      JsonArray var1 = new JsonArray();

      for (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 : this.OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
         var1.add(var3.provide());
      }

      this.HHIIIIIOOCOHORIIORHCCROIRHIIOO.IIHRRHORCRCROCHHOHORCHCROCIHRO("blogPosts", var1);
   }

   @Generated
   @Override
   public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH CORROIRHRRIHCRHIROHHORCCHIIRCO() {
      return this.HHIIIIIOOCOHORIIORHCCROIRHIIOO;
   }
}
