package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
final class ICICIOCHHHIHOCHCOHORIHRCOHHOCR {
   private static final Logger HIRHRHOHRIIICHICCRHIHRORCOCHCR = Logger.getLogger(ICICIOCHHHIHOCHCOHORIHRCOHHOCR.class.getName());
   private static final IHCRORHRORIICHRHRCHRRIRRHHOCOO CCHRORRCOIRIOOHHIRCIIIIRHIIRRI = RCIOCOHHCCRIOHOHCRICIRHRCCOROR();

   private ICICIOCHHHIHOCHCOHORIHRCOHHOCR() {
   }

   static long systemNanoTime() {
      return System.nanoTime();
   }

   static RRCRRCORICCHOHHIRCHIROOHIIOHCO HHCCIRHCCCIIRHCROHIORHIRHHIORH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var0) {
      return var0.HCROOOIHRIORCOCOCROHCHCRCCIOOR();
   }

   static <T extends Enum<T>> ORHIOICIOCRRHOOCOHRORIHICHRCRR<T> CRRRICCRROCOHHOHIICIHORCOORRRH(Class<T> var0, String var1) {
      WeakReference var2 = HICHRCOHCCRHOHCICOOCHOIHCCHIRI.getEnumConstants(var0).get(var1);
      return var2 == null
         ? ORHIOICIOCRRHOOCOHRORIHICHRCRR.IHIRCRORCOOROROHHRRIIOOOOCCHRH()
         : ORHIOICIOCRRHOOCOHRORIHICHRCRR.COIRRRCIORROCHIROCHROCHICCICIC((T)var0.cast(var2.get()));
   }

   static String formatCompact4Digits(double var0) {
      return String.format(Locale.ROOT, "%.4g", var0);
   }

   static boolean stringIsNullOrEmpty(@Nullable String var0) {
      return var0 == null || var0.isEmpty();
   }

   static String nullToEmpty(@Nullable String var0) {
      return var0 == null ? "" : var0;
   }

   static String emptyToNull(@Nullable String var0) {
      return stringIsNullOrEmpty(var0) ? null : var0;
   }

   static OOROOCCIRCCRHOIOIORIHCHHOOCCOR IIHCOICHRCCCCOHHRHHIRIOICHCHHO(String var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      return CCHRORRCOIRIOOHHIRCIIIIRHIIRRI.IIOIIRRHOIHRRORHCROICRRRHIHOCO(var0);
   }

   static boolean patternCompilerIsPcreLike() {
      return CCHRORRCOIRIOOHHIRCIIIIRHIIRRI.isPcreLike();
   }

   private static IHCRORHRORIICHRHRCHRRIRRHHOCOO RCIOCOHHCCRIOHOHCRICIRHRCCOROR() {
      return new ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   private static void logPatternCompilerError(ServiceConfigurationError var0) {
      HIRHRHOHRIIICHICCRHIHRORCOCHCR.log(Level.WARNING, "Error loading regex compiler, falling back to next option", var0);
   }

   static void checkGwtRpcEnabled() {
      String var0 = "guava.gwt.emergency_reenable_rpc";
      if (!Boolean.parseBoolean(System.getProperty(var0, "false"))) {
         throw new UnsupportedOperationException(
            IHICORCROOROHCIHIHCOIHRRHICICO.lenientFormat(
               "We are removing GWT-RPC support for Guava types. You can temporarily reenable support by setting the system property %s to true. For more about system properties, see %s. For more about Guava's GWT-RPC support, see %s.",
               var0,
               "https://stackoverflow.com/q/5189914/28465",
               "https://groups.google.com/d/msg/guava-announce/zHZTFg7YF3o/rQNnwdHeEwAJ"
            )
         );
      }

      HIRHRHOHRIIICHICCRHIHRORCOCHCR.log(
         Level.WARNING,
         "Later in 2020, we will remove GWT-RPC support for Guava types. You are seeing this warning because you are sending a Guava type over GWT-RPC, which will break. You can identify which type by looking at the class name in the attached stack trace.",
         new Throwable()
      );
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements IHCRORHRORIICHRHRCHRRIRRHHOCOO {
      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      @Override
      public OOROOCCIRCCRHOIOIORIHCHHOOCCOR IIOIIRRHOIHRRORHCROICRRRHIHOCO(String var1) {
         return new RIROICHCRROROHCCROOCCCCOCHCCRI(Pattern.compile(var1));
      }

      @Override
      public boolean isPcreLike() {
         return true;
      }
   }
}
