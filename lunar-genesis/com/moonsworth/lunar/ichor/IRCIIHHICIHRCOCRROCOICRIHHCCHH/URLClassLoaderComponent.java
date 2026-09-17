package com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import org.cadixdev.bombe.provider.ClassProvider;

public class CRRRICCRROCOHHOHIICIHORCOORRRH implements HHCCIRHCCCIIRHCROHIORHIRHHIORH, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI, ClassProvider {
   private static CRRRICCRROCOHHOHIICIHORCOORRRH HCHIIHCCCIIHRHIOHOCHCIIRIOOIRR = null;
   private final CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HCRCROIOIIHCRHOIRIHHCOHOHHOICC;

   private CRRRICCRROCOHHOHIICIHORCOORRRH(ClassLoader var1) {
      this.HCRCROIOIIHCRHOIRIHHCOHOHHOICC = new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new URL[0], var1);
   }

   @Override
   public void loadIchor(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
   }

   @Override
   public byte[] get(String var1) {
      try {
         String var2 = var1.concat(".class");

         try (InputStream var3 = this.HCRCROIOIIHCRHOIRIHHCOHOHHOICC.getResourceAsStream(var2)) {
            return var3 == null ? null : var3.readAllBytes();
         }
      } catch (Exception var8) {
         return null;
      }
   }

   @Override
   public InputStream getResourceAsStream(String var1) {
      return this.HCRCROIOIIHCRHOIRIHHCOHOHHOICC.getResourceAsStream(var1);
   }

   @Override
   public URL findResource(String var1) {
      return this.HCRCROIOIIHCRHOIRIHHCOHOHHOICC.findResource(var1);
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ClassLoader var0, OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, URL var2) {
      if (HCHIIHCCCIIHRHIOHOCHCIIRIOOIRR == null) {
         HCHIIHCCCIIHRHIOHOCHCIIRIOOIRR = new CRRRICCRROCOHHOHIICIHORCOORRRH(var0);
         var1.HHCCIRHCCCIIRHCROHIORHIRHHIORH(HCHIIHCCCIIHRHIOHOCHCIIRIOOIRR);
      }

      HCHIIHCCCIIHRHIOHOCHCIIRIOOIRR.HCRCROIOIIHCRHOIRIHHCOHOHHOICC.addURL(var2);
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends URLClassLoader {
      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(URL[] var1, ClassLoader var2) {
         super(var1, var2);
      }

      @Override
      public void addURL(URL var1) {
         super.addURL(var1);
      }
   }
}
