package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public abstract class HRCHROOHRIHCRCRHRIIROCIRHOIRHH extends RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   protected final Class<?> HCCIOIHIICRIIHOIHICHIRRIOCOHHH;
   protected final String RCOIHCOCOICOHOCHIICICIRHIRHRCI;
   protected final Collection<Object> RHIHIHCHRORCOCHRICCROOIIIIRHCO;
   protected transient String HCIOCOCHIHCHHRCCOHRRRICIRRHRHI;
   private static final int CRCIRCCCIICRCHOIOICRROHHIHCOIR = 1000;

   protected HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1, String var2, HICHRCOHCCRHOHCICOOCHOIHCCHIRI var3, Class<?> var4, String var5, Collection<Object> var6
   ) {
      super(var1, var2, var3);
      this.HCCIOIHIICRIIHOIHICHIRRIOCOHHH = var4;
      this.RCOIHCOCOICOHOCHIICICIRHIRHRCI = var5;
      this.RHIHIHCHRORCOCHRICCROOIIIIRHCO = var6;
   }

   @Deprecated
   protected HRCHROOHRIHCRCRHRIIROCIRHOIRHH(String var1, HICHRCOHCCRHOHCICOOCHOIHCCHIRI var2, Class<?> var3, String var4, Collection<Object> var5) {
      this(null, var1, var2, var3, var4, var5);
   }

   @Override
   public String ROHOORRCIORHOROOCIOICRRIRHOORR() {
      String var1 = this.HCIOCOCHIHCHHRCCOHRRRICIRRHRHI;
      if (var1 == null && this.RHIHIHCHRORCOCHRICCROOIIIIRHCO != null) {
         StringBuilder var2 = new StringBuilder(100);
         int var3 = this.RHIHIHCHRORCOCHRICCROOIIIIRHCO.size();
         if (var3 == 1) {
            var2.append(" (one known property: \"");
            var2.append(String.valueOf(this.RHIHIHCHRORCOCHRICCROOIIIIRHCO.iterator().next()));
            var2.append('"');
         } else {
            var2.append(" (").append(var3).append(" known properties: ");
            Iterator var4 = this.RHIHIHCHRORCOCHRICCROOIIIIRHCO.iterator();

            while (var4.hasNext()) {
               var2.append('"');
               var2.append(String.valueOf(var4.next()));
               var2.append('"');
               if (var2.length() > 1000) {
                  var2.append(" [truncated]");
                  break;
               }

               if (var4.hasNext()) {
                  var2.append(", ");
               }
            }
         }

         var2.append("])");
         this.HCIOCOCHIHCHHRCCOHRRRICIRRHRHI = var1 = var2.toString();
      }

      return var1;
   }

   public Class<?> HRRIRRIIOHHIHOCHCIRCOHIHRRHRRC() {
      return this.HCCIOIHIICRIIHOIHICHIRRIOCOHHH;
   }

   public String HCOCORHRRHOCRCCRCHRIICIIORROOR() {
      return this.RCOIHCOCOICOHOCHIICICIRHIRHRCI;
   }

   public Collection<Object> OOROCOIOCRHOIOOOIHOIIIHOHOHROI() {
      return this.RHIHIHCHRORCOCHRICCROOIIIIRHCO == null ? null : Collections.unmodifiableCollection(this.RHIHIHCHRORCOCHRICCROOIIIIRHCO);
   }
}
