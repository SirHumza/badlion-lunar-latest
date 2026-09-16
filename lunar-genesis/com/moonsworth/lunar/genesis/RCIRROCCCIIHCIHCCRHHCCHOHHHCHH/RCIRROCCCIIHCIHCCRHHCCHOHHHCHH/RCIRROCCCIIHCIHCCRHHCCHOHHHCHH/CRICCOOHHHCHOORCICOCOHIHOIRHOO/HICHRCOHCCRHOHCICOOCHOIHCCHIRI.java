package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.MustBeClosed;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.COIRRRCIORROCHIROCHROCHICCICIC;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCHOIICIHOCIRCIOORIOHRCRHOCRCR;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RHCHHROCORIHCIORRRIIOHIRHCRIOH;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.Stream;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public abstract class HICHRCOHCCRHOHCICOOCHOIHCCHIRI {
   protected HICHRCOHCCRHOHCICOOCHOIHCCHIRI() {
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH RRCRRCORICCHOHHIRCHIROOHIIOHCO(Charset var1) {
      return new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
   }

   public abstract Reader openStream();

   public BufferedReader openBufferedStream() {
      Reader var1 = this.openStream();
      return var1 instanceof BufferedReader ? (BufferedReader)var1 : new BufferedReader(var1);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @MustBeClosed
   public Stream<String> lines() {
      BufferedReader var1 = this.openBufferedStream();
      return var1.lines().onClose(() -> {
         try {
            var1.close();
         } catch (IOException var2) {
            throw new UncheckedIOException(var2);
         }
      });
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR<Long> OROCORIRIORCRRRRCHRRIRRIRHHIRO() {
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.IHIRCRORCOOROROHHRRIIOOOOCCHRH();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public long length() {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR var1 = this.OROCORIRIORCRRRRCHRRIRRIRHHIRO();
      if (var1.isPresent()) {
         return (Long)var1.get();
      }

      CIOHHCORHRCCRICCCORIHCRHCCCRRR var2 = CIOHHCORHRCCRICCCORIHCRHCCCRRR.IIOCRRHRHOHIOIHRHHRRCIRCOIIIII();

      try {
         Reader var3 = var2.register(this.openStream());
         return this.countBySkipping(var3);
      } catch (Throwable var9) {
         throw var2.rethrow(var9);
      } finally {
         var2.close();
      }
   }

   private long countBySkipping(Reader var1) {
      long var2 = 0L;

      long var4;
      while ((var4 = var1.skip(Long.MAX_VALUE)) != 0L) {
         var2 += var4;
      }

      return var2;
   }

   @CanIgnoreReturnValue
   public long copyTo(Appendable var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var2 = CIOHHCORHRCCRICCCORIHCRHCCCRRR.IIOCRRHRHOHIOIHRHHRRCIRCOIIIII();

      try {
         Reader var3 = var2.register(this.openStream());
         return IIHRRHORCRCROCHHOHORCHCROCIHRO.copy(var3, var1);
      } catch (Throwable var9) {
         throw var2.rethrow(var9);
      } finally {
         var2.close();
      }
   }

   @CanIgnoreReturnValue
   public long IRCIIHHICIHRCOCRROCOICRIHHCCHH(CRICCOOHHHCHOORCICOCOHIHOIRHOO var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var2 = CIOHHCORHRCCRICCCORIHCRHCCCRRR.IIOCRRHRHOHIOIHRHHRRCIRCOIIIII();

      try {
         Reader var3 = var2.register(this.openStream());
         Writer var4 = var2.register(var1.openStream());
         return IIHRRHORCRCROCHHOHORCHCROCIHRO.copy(var3, var4);
      } catch (Throwable var10) {
         throw var2.rethrow(var10);
      } finally {
         var2.close();
      }
   }

   public String read() {
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var1 = CIOHHCORHRCCRICCCORIHCRHCCCRRR.IIOCRRHRHOHIOIHRHHRRCIRCOIIIII();

      try {
         Reader var2 = var1.register(this.openStream());
         return IIHRRHORCRCROCHHOHORCHCROCIHRO.toString(var2);
      } catch (Throwable var7) {
         throw var1.rethrow(var7);
      } finally {
         var1.close();
      }
   }

   public @Nullable String readFirstLine() {
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var1 = CIOHHCORHRCCRICCCORIHCRHCCCRRR.IIOCRRHRHOHIOIHRHHRRCIRCOIIIII();

      try {
         BufferedReader var2 = var1.register(this.openBufferedStream());
         return var2.readLine();
      } catch (Throwable var7) {
         throw var1.rethrow(var7);
      } finally {
         var1.close();
      }
   }

   public COIRRRCIORROCHIROCHROCHICCICIC<String> OCORORHCCIHOCOCRROCOOOCHHRCRRR() {
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var1 = CIOHHCORHRCCRICCCORIHCRHCCCRRR.IIOCRRHRHOHIOIHRHHRRCIRCOIIIII();

      try {
         BufferedReader var2 = var1.register(this.openBufferedStream());
         ArrayList var3 = RCHOIICIHOCIRCIOORIOHRCRHOCRCR.newArrayList();

         String var4;
         while ((var4 = var2.readLine()) != null) {
            var3.add(var4);
         }

         return COIRRRCIORROCHIROCHROCHICCICIC.RIROICHCRROROHCCROOCCCCOCHCCRI(var3);
      } catch (Throwable var9) {
         throw var1.rethrow(var9);
      } finally {
         var1.close();
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @CanIgnoreReturnValue
   public <T> T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IHIRRIIORRHORHRORIHOROIRCORCOO<T> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var2 = CIOHHCORHRCCRICCCORIHCRHCCCRRR.IIOCRRHRHOHIOIHRHHRRCIRCOIIIII();

      try {
         Reader var3 = var2.register(this.openStream());
         return IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var1);
      } catch (Throwable var8) {
         throw var2.rethrow(var8);
      } finally {
         var2.close();
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public void forEachLine(Consumer<? super String> var1) {
      try (Stream var2 = this.lines()) {
         var2.forEachOrdered(var1);
      } catch (UncheckedIOException var15) {
         throw var15.getCause();
      }
   }

   public boolean isEmpty() {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR var1 = this.OROCORIRIORCRRRRCHRRIRRIRHHIRO();
      if (var1.isPresent()) {
         return (Long)var1.get() == 0L;
      }

      CIOHHCORHRCCRICCCORIHCRHCCCRRR var2 = CIOHHCORHRCCRICCCORIHCRHCCCRRR.IIOCRRHRHOHIOIHRHHRRCIRCOIIIII();

      try {
         Reader var3 = var2.register(this.openStream());
         return var3.read() == -1;
      } catch (Throwable var8) {
         throw var2.rethrow(var8);
      } finally {
         var2.close();
      }
   }

   public static HICHRCOHCCRHOHCICOOCHOIHCCHIRI HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(Iterable<? extends HICHRCOHCCRHOHCICOOCHOIHCCHIRI> var0) {
      return new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0);
   }

   public static HICHRCOHCCRHOHCICOOCHOIHCCHIRI RHOCHHIRRCHHHOHOIRROIROHHHIHIO(Iterator<? extends HICHRCOHCCRHOHCICOOCHOIHCCHIRI> var0) {
      return HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(COIRRRCIORROCHIROCHROCHICCICIC.CRRRICCRROCOHHOHIICIHORCOORRRH(var0));
   }

   public static HICHRCOHCCRHOHCICOOCHOIHCCHIRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HICHRCOHCCRHOHCICOOCHOIHCCHIRI... var0) {
      return HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(COIRRRCIORROCHIROCHROCHICCICIC.IRRCCOICORICIHCHRHIHIHROIRHOCR(var0));
   }

   public static HICHRCOHCCRHOHCICOOCHOIHCCHIRI HICHRCOHCCRHOHCICOOCHOIHCCHIRI(CharSequence var0) {
      return var0 instanceof String
         ? new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO((String)var0)
         : new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0);
   }

   public static HICHRCOHCCRHOHCICOOCHOIHCCHIRI ORRIROCRIOOIICHRHCOHIOCCHCHIHC() {
      return HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.IHICHIORHIRRCHCHCORIHCORCOIOIC;
   }

   private static final class CRRRICCRROCOHHOHIICIHORCOORRRH extends HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO {
      private static final HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH IHICHIORHIRRCHCHCORIHCORCOIOIC = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH();

      private CRRRICCRROCOHHOHIICIHORCOORRRH() {
         super("");
      }

      @Override
      public String toString() {
         return "CharSource.empty()";
      }
   }

   private static final class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends HICHRCOHCCRHOHCICOOCHOIHCCHIRI {
      private final Iterable<? extends HICHRCOHCCRHOHCICOOCHOIHCCHIRI> CCHCOIICOHICRROCICIOIIRIIHRRCO;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(Iterable<? extends HICHRCOHCCRHOHCICOOCHOIHCCHIRI> var1) {
         this.CCHCOIICOHICRROCICIOIIRIIHRRCO = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
      }

      @Override
      public Reader openStream() {
         return new ICICIOCHHHIHOCHCOHORIHRCOHHOCR(this.CCHCOIICOHICRROCICIOIIRIIHRRCO.iterator());
      }

      @Override
      public boolean isEmpty() {
         for (HICHRCOHCCRHOHCICOOCHOIHCCHIRI var2 : this.CCHCOIICOHICRROCICIOIIRIIHRRCO) {
            if (!var2.isEmpty()) {
               return false;
            }
         }

         return true;
      }

      @Override
      public com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR<Long> OROCORIRIORCRRRRCHRRIRRIRHHIRO() {
         long var1 = 0L;

         for (HICHRCOHCCRHOHCICOOCHOIHCCHIRI var4 : this.CCHCOIICOHICRROCICIOIIRIIHRRCO) {
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR var5 = var4.OROCORIRIORCRRRRCHRRIRRIRHHIRO();
            if (!var5.isPresent()) {
               return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.IHIRCRORCOOROROHHRRIIOOOOCCHRH();
            }

            var1 += var5.get();
         }

         return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.COIRRRCIORROCHIROCHROCHICCICIC(
            var1
         );
      }

      @Override
      public long length() {
         long var1 = 0L;

         for (HICHRCOHCCRHOHCICOOCHOIHCCHIRI var4 : this.CCHCOIICOHICRROCICIOIIRIIHRRCO) {
            var1 += var4.length();
         }

         return var1;
      }

      @Override
      public String toString() {
         return "CharSource.concat(" + this.CCHCOIICOHICRROCICIOIIRIIHRRCO + ")";
      }
   }

   private static class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends HICHRCOHCCRHOHCICOOCHOIHCCHIRI {
      private static final RCIROOOOICRHCCRRCIORHHIRCOIIIC CIIHOHHRIHROCRIHHOROCCOCCOHCHR = RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRHICRIRRHCRCCOOORCHHORCRRCIRO(
         "\r\n|\n|\r"
      );
      protected final CharSequence RIRHIROCHHRHHCIHCIHRRHRIHORRHH;

      protected IRCIIHHICIHRCOCRROCOICRIHHCCHH(CharSequence var1) {
         this.RIRHIROCHHRHHCIHCIHRRHRIHORRHH = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
      }

      @Override
      public Reader openStream() {
         return new CORCOCICIRIOHROHROIIOOHICCHCRR(this.RIRHIROCHHRHHCIHCIHRRHRIHORRHH);
      }

      @Override
      public String read() {
         return this.RIRHIROCHHRHHCIHCIHRRHRIHORRHH.toString();
      }

      @Override
      public boolean isEmpty() {
         return this.RIRHIROCHHRHHCIHCIHRRHRIHORRHH.length() == 0;
      }

      @Override
      public long length() {
         return this.RIRHIROCHHRHHCIHCIHRRHRIHORRHH.length();
      }

      @Override
      public com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR<Long> OROCORIRIORCRRRRCHRRIRRIRHHIRO() {
         return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.COIRRRCIORROCHIROCHROCHICCICIC(
            (long)this.RIRHIROCHHRHHCIHCIHRRHRIHORRHH.length()
         );
      }

      private Iterator<String> linesIterator() {
         return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<String>(
            
         ) {
            Iterator<String> lines = HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIIHOHHRIHROCRIHHOROCCOCCOHCHR
               .split(IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.RIRHIROCHHRHHCIHCIHRRHRIHORRHH)
               .iterator();

            protected String computeNext() {
               if (this.lines.hasNext()) {
                  String var1 = this.lines.next();
                  if (this.lines.hasNext() || !var1.isEmpty()) {
                     return var1;
                  }
               }

               return this.ROCOROCOICRHOICORCIIRRRROCOHOC();
            }
         };
      }

      @Override
      public Stream<String> lines() {
         return RHCHHROCORIHCIORRRIIOHIRHCRIOH.stream(this.linesIterator());
      }

      @Override
      public String readFirstLine() {
         Iterator var1 = this.linesIterator();
         return var1.hasNext() ? (String)var1.next() : null;
      }

      @Override
      public COIRRRCIORROCHIROCHROCHICCICIC<String> OCORORHCCIHOCOCRROCOOOCHHRCRRR() {
         return COIRRRCIORROCHIROCHROCHICCICIC.CRRRICCRROCOHHOHIICIHORCOORRRH(this.linesIterator());
      }

      @Override
      public <T> T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IHIRRIIORRHORHRORIHOROIRCORCOO<T> var1) {
         Iterator var2 = this.linesIterator();

         while (var2.hasNext() && var1.processLine((String)var2.next())) {
         }

         return (T)var1.getResult();
      }

      @Override
      public String toString() {
         return "CharSource.wrap("
            + com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.truncate(
               this.RIRHIROCHHRHHCIHCIHRRHRIHORRHH, 30, "..."
            )
            + ")";
      }
   }

   private final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
      final Charset COIORRCIRIHHHOCIOCICHICCCOOOIO;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Charset var2) {
         this.COIORRCIRIHHHOCIOCICHICCCOOOIO = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var2
         );
      }

      @Override
      public HICHRCOHCCRHOHCICOOCHOIHCCHIRI CRRRICCRROCOHHOHIICIHORCOORRRH(Charset var1) {
         return var1.equals(this.COIORRCIRIHHHOCIOCICHICCCOOOIO) ? HICHRCOHCCRHOHCICOOCHOIHCCHIRI.this : super.CRRRICCRROCOHHOHIICIHORCOORRRH(var1);
      }

      @Override
      public InputStream openStream() {
         return new RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.this.openStream(), this.COIORRCIRIHHHOCIOCICHICCCOOOIO, 8192);
      }

      @Override
      public String toString() {
         return HICHRCOHCCRHOHCICOOCHOIHCCHIRI.this.toString() + ".asByteSource(" + this.COIORRCIRIHHHOCIOCICHICCCOOOIO + ")";
      }
   }

   private static class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      protected RRCRRCORICCHOHHIRCHIROOHIIOHCO(String var1) {
         super(var1);
      }

      @Override
      public Reader openStream() {
         return new StringReader((String)this.RIRHIROCHHRHHCIHCIHRRHRIHORRHH);
      }

      @Override
      public long copyTo(Appendable var1) {
         var1.append(this.RIRHIROCHHRHHCIHCIHRRHRIHORRHH);
         return this.RIRHIROCHHRHHCIHCIHRRHRIHORRHH.length();
      }

      @Override
      public long IRCIIHHICIHRCOCRROCOICRIHHCCHH(CRICCOOHHHCHOORCICOCOHIHOIRHOO var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         CIOHHCORHRCCRICCCORIHCRHCCCRRR var2 = CIOHHCORHRCCRICCCORIHCRHCCCRRR.IIOCRRHRHOHIOIHRHHRRCIRCOIIIII();

         try {
            Writer var3 = var2.register(var1.openStream());
            var3.write((String)this.RIRHIROCHHRHHCIHCIHRRHRIHORRHH);
            return this.RIRHIROCHHRHHCIHCIHRRHRIHORRHH.length();
         } catch (Throwable var9) {
            throw var2.rethrow(var9);
         } finally {
            var2.close();
         }
      }
   }
}
