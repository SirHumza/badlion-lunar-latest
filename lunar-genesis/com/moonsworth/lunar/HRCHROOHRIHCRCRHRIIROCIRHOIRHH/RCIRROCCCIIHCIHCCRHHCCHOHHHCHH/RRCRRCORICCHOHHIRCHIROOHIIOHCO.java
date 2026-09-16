package com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.Collection;

public record RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
   private final String HRIHIIHHIICIIRHORRCOIRHIHCIHCR;
   private final String RRHHHCIHCRRHCIRHICOCRRHICRIIHR;
   public static final String CCOCRCHOHHICOHCCCHRROIOCROHHCO = "mcVer";
   public static final String OCCIIOOHICRIOHRHCCRROROOCHIOIH = "mcId";
   public static final String CCCIRIICHHCOHCIHCIOIRCHICCHIIR = "mcpVer";
   public static final String CHCCOCRORRHROHIHCHOCIORHRORCRC = "parchmentVer";
   public static final String ICOROOHHCHOOOHIIRICOOIHRORIOHR = "parchmentMcVer";
   public static final String ICOCHCIRHRHHCIHHICIICORRCIRORI = "computeFrames";

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(String var1, String var2) {
      this.HRIHIIHHIICIIRHORRCOIRHIHCIHCR = var1;
      this.RRHHHCIHCRRHCIRHICOCRRHICRIIHR = var2;
   }

   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var0
   ) {
      return new RRCRRCORICCHOHHIRCHIROOHIIOHCO("mcVer", var0.getId());
   }

   public String key() {
      return this.HRIHIIHHIICIIRHORRCOIRHIHCIHCR;
   }

   public String value() {
      return this.RRHHHCIHCRRHCIRHICOCRRHICRIIHR;
   }

   public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      Collection<RRCRRCORICCHOHHIRCHIROOHIIOHCO> OCHOCOOCROIICOIIHIHHHCICCHIICO();

      default String CCRCRRIRHROHHCIHRCCIOCRCRCHHOH(String var1) {
         if (var1 != null && !var1.isEmpty()) {
            for (RRCRRCORICCHOHHIRCHIROOHIIOHCO var3 : this.OCHOCOOCROIICOIIHIHHHCICCHIICO()) {
               String var4 = var3.value();
               if (var4 == null) {
                  var4 = "null";
               }

               var1 = var1.replace("${" + var3.key() + "}", var4);
            }

            return var1;
         } else {
            return var1;
         }
      }
   }
}
