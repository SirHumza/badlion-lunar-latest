package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import lombok.Generated;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private final String CCOCCCCOIHIIRICCHORCCOCRRRRHCR;
   private final File RCIOOOCIROHHHCIIIIIOICIRHRHCHO;
   private final DataOutputStream IRIROOCHROICIRCRHHCOOIHCOIRCRH;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, File var2, boolean var3) {
      this.CCOCCCCOIHIIRICCHORCCOCRRRRHCR = var1;
      this.RCIOOOCIROHHHCIIIIIOICIRHRHCHO = var2;
      var2.deleteOnExit();
      if (var3) {
         this.IRIROOCHROICIRCRHHCOOIHCOIRCRH = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(var2)));
      } else {
         this.IRIROOCHROICIRCRHHCOOIHCOIRCRH = null;
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.IRIROOCHROICIRCRHHCOOIHCOIRCRH);
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      var1.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this.IRIROOCHROICIRCRHHCOOIHCOIRCRH);
   }

   public void close() {
      if (this.IRIROOCHROICIRCRHHCOOIHCOIRCRH != null) {
         this.IRIROOCHROICIRCRHHCOOIHCOIRCRH.close();
      }
   }

   @Generated
   public String getId() {
      return this.CCOCCCCOIHIIRICCHORCCOCRRRRHCR;
   }

   @Generated
   public File getFile() {
      return this.RCIOOOCIROHHHCIIIIIOICIRHRHCHO;
   }

   @Generated
   public DataOutputStream OIICIOCRCHHORIORCRRCRCICHIHORH() {
      return this.IRIROOCHROICIRCRHHCOOIHCOIRCRH;
   }
}
