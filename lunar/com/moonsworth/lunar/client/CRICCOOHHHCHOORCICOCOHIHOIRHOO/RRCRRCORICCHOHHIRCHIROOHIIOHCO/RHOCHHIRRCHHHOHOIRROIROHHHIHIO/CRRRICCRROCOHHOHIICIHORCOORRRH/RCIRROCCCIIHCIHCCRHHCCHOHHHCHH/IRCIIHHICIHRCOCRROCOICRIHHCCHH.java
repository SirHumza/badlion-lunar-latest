package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.common.collect.ImmutableList;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IOHHOIIOCRHCHHCRORICCOHOHROOIH;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RIROICHCRROROHCCROOCCCCOCHCCRI;
import java.util.List;
import java.util.function.LongFunction;
import lombok.Generated;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   protected final RIROICHCRROROHCCROOCCCCOCHCCRI<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> ROROHRHRICIHRIIOOIHCIRIICRRORH = IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "memoryFormat",
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.MB
      )
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      super(false);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCICHOCCRIHORROHIOCRROCCIICO, CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH(var1)
      );
   }

   @Override
   public String getId() {
      return "MEMORY_DEBUG_CHILD_MOD";
   }

   @Override
   protected com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH IROROHHHHRORIRHHRHRCOIHCHOCRIC() {
      return new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         0.0F, 24.0F, "Memory"
      );
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      super.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTINGS,
         var1x -> var1x.CRRRICCRROCOHHOHIICIHORCOORRRH(this.ROROHRHRICIHRIIOOIHCIRIICRRORH)
      );
   }

   @Override
   protected List<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> CIIOCCOOIIOIRCRIIOHIOIOOCRCOCI() {
      return ImmutableList.of(
         new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            
         ) {
            @Override
            public long HCROCRCOHORCCHHHHRROOORICOIOHI() {
               return Runtime.getRuntime().maxMemory();
            }

            @Override
            public long getValue() {
               Runtime var1 = Runtime.getRuntime();
               return var1.totalMemory() - var1.freeMemory();
            }

            @Override
            public float OHOHCHCCORORRIRHIIHOOOHIHOCCRC() {
               Runtime var1 = Runtime.getRuntime();
               long var2 = var1.totalMemory() - var1.freeMemory();
               return 1.0F - (int)(var2 * 100L / var1.maxMemory()) / 100.0F;
            }

            @Override
            public boolean CRRROHROCCIHHRRIIIOCRCHCRIHOHI() {
               return true;
            }
         },
         new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            
         ) {
            @Override
            public long HCROCRCOHORCCHHHHRROOORICOIOHI() {
               return Runtime.getRuntime().maxMemory();
            }

            @Override
            public long getValue() {
               return Runtime.getRuntime().totalMemory();
            }

            @Override
            public int getColor() {
               return -872349697;
            }
         }
      );
   }

   @Override
   protected String RHOCHHIRRCHHHOHOIRROIROHHHIHIO(long var1) {
      return this.ROROHRHRICIHRIIOOIHCIRIICRRORH.get().getFormat().apply(var1);
   }

   public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
      KB("1234567kb", var0 -> var0 + "kb"),
      MB("1234.57mb", var0 -> String.format("%.2fmb", (float)var0 / 1048576.0F)),
      GB("1.234gb", var0 -> String.format("%.3fgb", (float)var0 / 1.0737418E9F));

      private final String display;
      private final LongFunction<String> format;

      @Override
      public String id() {
         return this.name();
      }

      @Override
      public String toString() {
         return this.display;
      }

      @Generated
      public String getDisplay() {
         return this.display;
      }

      @Generated
      public LongFunction<String> getFormat() {
         return this.format;
      }

      @Generated
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3, LongFunction<String> var4) {
         this.display = var3;
         this.format = var4;
      }
   }
}
