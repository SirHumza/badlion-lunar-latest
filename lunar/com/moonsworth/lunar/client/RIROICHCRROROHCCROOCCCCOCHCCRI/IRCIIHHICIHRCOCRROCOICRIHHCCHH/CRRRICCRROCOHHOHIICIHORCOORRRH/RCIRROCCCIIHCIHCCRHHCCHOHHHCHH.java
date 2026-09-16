package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.common.collect.Range;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.client.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.COIRRRCIORROCHIROCHROCHICCICIC;
import java.util.Optional;
import lombok.Generated;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends com.moonsworth.lunar.client.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   protected boolean RRHOOHCIRCRCHHOORRCRIHRIHIIIRH = false;
   private Range<Float> RRHCRRHCHRICHOOIICOOORCOORIIOC;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var1) {
      super(var1);
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, boolean var2, COIRRRCIORROCHIROCHROCHICCICIC... var3) {
      super(var1, IRCIIHHICIHRCOCRROCOICRIHHCCHH.HEAD, RRCRRCORICCHOHHIRCHIROOHIIOHCO.HATS, var2, var3);
   }

   @Override
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH RHHIRHCIOIORIIRCROOIOIRCIOHIII() {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH.HEAD;
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HOOHRRHIRICHIIIOORCOHCICCICOOH() {
      this.RCOHORRHIIHHOHHOORIHCHRIHOICIO = true;
      return this;
   }

   @Override
   public boolean RICHIIORICCHROCCRIORORHOOIRIRH() {
      return this.HROOIHORIROHIROHCCROIIRCRCCCCH;
   }

   public Optional<Range<Float>> ROIROOICOCHORORRIOOROCOORRICOR() {
      return Optional.ofNullable(this.RRHCRRHCHRICHOOIICOOORCOORIIOC);
   }

   @Override
   public void load(JsonObject var1) {
      super.load(var1);
      if (var1.has("heightOffsetRange") && var1.get("heightOffsetRange").isJsonArray()) {
         JsonArray var2 = var1.get("heightOffsetRange").getAsJsonArray();
         if (var2.size() == 2) {
            this.RRHCRRHCHRICHOOIICOOORCOORIIOC = Range.open(var2.get(0).getAsFloat(), var2.get(1).getAsFloat());
         }
      }
   }

   @Generated
   public boolean IRHIOHRHOCOHRIHIHCRIRRHIHCROOH() {
      return this.RRHOOHCIRCRCHHOORRCRIHRIHIIIRH;
   }
}
