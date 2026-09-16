package com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.JsonObject;
import com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   protected String key;
   protected String version;
   protected CORCOCICIRIOHROHROIIOOHICCHCRR RCICCHIIRHCRROCICOCIIOOCRHCCCC;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, String var2, CORCOCICIRIOHROHROIIOOHICCHCRR var3) {
      this.key = var1;
      this.version = var2;
      this.RCICCHIIRHCRROCICOCIIOOCRHCCCC = var3;
   }

   public String getKey() {
      return this.key;
   }

   public String getId() {
      return this.getKey();
   }

   @Nullable
   public String getVersion() {
      return this.version;
   }

   protected List<String> HHCCIRHCCCIIRHCROHIORHIRHHIORH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      return List.of();
   }

   public List<JsonObject> CRRRICCRROCOHHOHIICIHORCOORRRH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      return List.of();
   }

   public Optional<Path> RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
      return var1.OHIROHHCCHRIIORCHRCOIICOHOOCOO(this.getKey());
   }

   protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH var1, OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
   }

   @Override
   public void loadIchor(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      var1.CCOICROHIIHCCRRRRCCICIRCCHCHRO().add(new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH());
   }

   public boolean CRICCOOHHHCHOORCICOCOHIHOIRHOO() {
      return false;
   }

   public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO {
      @Override
      public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         CORCOCICIRIOHROHROIIOOHICCHCRR var1,
         com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH var2,
         com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3
      ) {
         if (var1 == IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.RCICCHIIRHCRROCICOCIIOOCRHCCCC) {
            var2.registerMixins(IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var3.CHIOHRROCCRCCHHCCRRHCROOOICCOI()));
            IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3.IHIRRIIORRHORHRORIHOROIRCORCOO());
         }
      }
   }
}
