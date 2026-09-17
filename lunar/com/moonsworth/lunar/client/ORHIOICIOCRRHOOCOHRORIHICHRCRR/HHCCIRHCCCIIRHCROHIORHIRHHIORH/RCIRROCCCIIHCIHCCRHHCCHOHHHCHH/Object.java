package com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.io.File;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   public static long lastUpdate;
   public Map<String, RRCRRCORICCHOHHIRCHIROOHIIOHCO> CRCHHORHCORRORCCHHHICHRRHRIIOH = new HashMap<>();
   public Map<String, RRCRRCORICCHOHHIRCHIROOHIIOHCO> HIICORHIOCORRCCCCRORCIHRORCORC = new HashMap<>();
   public File IHRRCIOCORRCRIIHOCICOICIOHCIIR;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(File var1) {
      this.IHRRCIOCORRCRIIHOCICOICIOHCIIR = var1;
      this.IHRRCIOCORRCRIIHOCICOICIOHCIIR.mkdirs();
      this.RHIHORHIRIICORCIIRRRICRORIOIIR("default_fire");
      this.RHIHORHIRIICORCIIRRRICRORIOIIR("default_magic");
      this.RHIHORHIRIICORCIIRRRICRORIOIIR("default_rain");
      this.RHIHORHIRIICORCIIRRRICRORIOIIR("default_snow");
   }

   public File OHCHOCIHHOIRIORHRHHHROHHOHRHRR(String var1) {
      return new File(this.IHRRCIOCORRCRIIHOCICOICIOHCIIR, var1 + ".json");
   }

   public boolean CHORRICHHOHRRRHHHHHICCOHRIHCCC(String var1) {
      return this.OHCHOCIHHOIRIORHRHHHROHHOHRHRR(var1).isFile();
   }

   public void reload() {
      this.CRCHHORHCORRORCCHHHICHRRHRIIOH.clear();
      this.CRCHHORHCORRORCCHHHICHRRHRIIOH.putAll(this.HIICORHIOCORRCCCCRORCIHRORCORC);

      for (File var4 : this.IHRRCIOCORRCRIIHOCICOICIOHCIIR.listFiles()) {
         if (var4.isFile() && var4.getName().endsWith(".json")) {
            this.HHRIICOIOORCHCOIICOOIHIRHHICRI(var4);
         }
      }
   }

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO OCRICOCRROCRRHRHRHCHRHRRRRCROR(String var1) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = this.ORHIOICIOCRRHOOCOHRORIHICHRCRR(this.OHCHOCIHHOIRIORHRHHHROHHOHRHRR(var1));
      return var2 != null ? var2 : this.CRHHHCHIOHRIOHHCOHRRRCHCOIIOOO(var1);
   }

   private void HHRIICOIOORCHCOIICOOIHIRHHICRI(File var1) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = this.ORHIOICIOCRRHOOCOHRORIHICHRCRR(var1);
      if (var2 != null) {
         String var3 = var1.getName();
         this.CRCHHORHCORRORCCHHHICHRRHRIIOH.put(var3.substring(0, var3.indexOf(".json")), var2);
      }
   }

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO ORHIOICIOCRRHOOCOHRORIHICHRCRR(File var1) {
      if (!var1.exists()) {
         return null;
      }

      try {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOHHROCHCORCRHCOOHIOCRRICCHHOI(FileUtils.readFileToString(var1, Charset.defaultCharset()));
      } catch (Exception var3) {
         var3.printStackTrace();
         return null;
      }
   }

   private void RHIHORHIRIICORCIIRRRICRORIOIIR(String var1) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = this.CRHHHCHIOHRIOHHCOHRRRCHCOIIOOO(var1);
      if (var2 != null) {
         this.HIICORHIOCORRCCCCRORCIHRORCORC.put(var1, var2);
      }
   }

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO CRHHHCHIOHRIOHHCOHRRRCHCOIIOOO(String var1) {
      try {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOHHROCHCORCRHCOOHIOCRRICCHHOI(
               IOUtils.toString(
                  this.getClass().getClassLoader().getResourceAsStream("assets/blockbuster/particles/" + var1 + ".json"), Charset.defaultCharset()
               )
            )
            .CHCCIROOIHCCRCIHCIOIHRIIHROIRO(true);
      } catch (Exception var3) {
         var3.printStackTrace();
         return null;
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, RRCRRCORICCHOHHIRCHIROOHIIOHCO var2) {
      String var3 = com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.jsonToPretty(
         RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2)
      );
      File var4 = this.OHCHOCIHHOIRIORHRHHHROHHOHRHRR(var1);

      try {
         FileUtils.writeStringToFile(var4, var3, Charset.defaultCharset());
      } catch (Exception var6) {
      }

      this.HHRIICOIOORCHCOIICOOIHIRHHICRI(var4);
      lastUpdate = System.currentTimeMillis();
   }
}
