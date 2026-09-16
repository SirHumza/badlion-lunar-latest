package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class HICRRICCHCCROOHHCHOCOCCHOIHHOC<T> implements Closeable, Iterator<T> {
   protected static final HICRRICCHCCROOHHCHOCOCCHOIHHOC<?> RHCIRRHICHCHRORRIIOCOCHHCIORHI = new HICRRICCHCCROOHHCHOCOCCHOIHHOC(
      null, null, null, null, false, null
   );
   protected static final int CRICOHOOIIRHRCIICCIOIHOIRHIIII = 0;
   protected static final int OORIRRCROHIROIIRHOCIOIOIIICRCC = 1;
   protected static final int CRRCOICRIROROCCHHCHHICIOOOHHOI = 2;
   protected static final int CIIIHIHHCHIHHHIHCROOCHHHRHIOIO = 3;
   protected final OCOHORHCROHICRRIHCIHHRRCIHICRI ORHRRRRHRHHIHCRHRRRIOCRIRCHOII;
   protected final OOROOCCIRCCRHOIOIORIHCHHOOCCOR RCIHIOOIHHIHOORIRIHCHCIHCCIHRC;
   protected final CIOHHCORHRCCRICCCORIHCRHCCCRRR<T> CHRCHCCRIRIIRORCOHORIIOOOIIOHO;
   protected final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI RCROHHIOOCIHIHCCHIHIHHOHOHIOOR;
   protected final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR IOHRHHROHIRIORRHOHHCCIIIRCHHCI;
   protected final T OIHOOOHCHOCHOCOOIRCROCRCRCOICC;
   protected final boolean HHRCCCCROCRICCICHCHHROORRHIRRR;
   protected int HOOHRIHICRIRCOIOOCRRHOIROHOCOC;

   protected HICRRICCHCCROOHHCHOCOCCHOIHHOC(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var2,
      OOROOCCIRCCRHOIOIORIHCHHOOCCOR var3,
      CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> var4,
      boolean var5,
      Object var6
   ) {
      this.ORHRRRRHRHHIHCRHRRRIOCRIRCHOII = var1;
      this.RCROHHIOOCIHIHCCHIHIHHOHOHIOOR = var2;
      this.RCIHIOOIHHIHOORIRIHCHCIHCCIHRC = var3;
      this.CHRCHCCRIRIIRORCOHORIIOOOIIOHO = var4;
      this.HHRCCCCROCRICCICHCHHROORRHIRRR = var5;
      if (var6 == null) {
         this.OIHOOOHCHOCHOCOOIRCROCRCRCOICC = null;
      } else {
         this.OIHOOOHCHOCHOCOOIRCROCRCRCOICC = (T)var6;
      }

      if (var2 == null) {
         this.IOHRHHROHIRIORRHOHHCCIIIRCHHCI = null;
         this.HOOHRIHICRIRCOIOOCRRHOIROHOCOC = 0;
      } else {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR var7 = var2.CCOCHROROIROCOCCRRIOIHRCCOOICI();
         if (var5 && var2.CHIOIROOIOCOCCORRHCIOOORHCRHHR()) {
            var2.RHICIRCCHCRHOOOCCCIIOOIRRIORHO();
         } else {
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI var8 = var2.COCHOCOHRICCHIIIHIOORCIIRROOHI();
            if (var8 == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_OBJECT
               || var8 == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_ARRAY) {
               var7 = var7.RHOOHRHOICCCORHOHCIRORICOCHIHC();
            }
         }

         this.IOHRHHROHIRIORRHOHHCCIIIRCHHCI = var7;
         this.HOOHRIHICRIRCOIOOCRRHOIROHOCOC = 2;
      }
   }

   public static <T> HICRRICCHCCROOHHCHOCOCCHOIHHOC<T> HICCHROCRROIOHHHRCRCRCCHHRORCR() {
      return (HICRRICCHCCROOHHCHOCOCCHOIHHOC<T>)RHCIRRHICHCHRORRIIOCOCHHCIORHI;
   }

   @Override
   public boolean hasNext() {
      try {
         return this.OCHCOIHOORHCHHCOOCOCHRROOOOROC();
      } catch (IHHCHHHCRIHOOCOIOOCRIIICIOROIR var2) {
         return this.<Boolean>RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
      } catch (IOException var3) {
         return this.<Boolean>IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3);
      }
   }

   @Override
   public T next() {
      try {
         return this.nextValue();
      } catch (IHHCHHHCRIHOOCOIOOCRIIICIOROIR var2) {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
      } catch (IOException var3) {
         return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3);
      }
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   @Override
   public void close() {
      if (this.HOOHRIHICRIRCOIOOCRRHOIROHOCOC != 0) {
         this.HOOHRIHICRIRCOIOOCRRHOIROHOCOC = 0;
         if (this.RCROHHIOOCIHIHCCHIHIHHOHOHIOOR != null) {
            this.RCROHHIOOCIHIHCCHIHIHHOHOHIOOR.close();
         }
      }
   }

   public boolean OCHCOIHOORHCHHCOOCOCHRROOOOROC() {
      switch (this.HOOHRIHICRIRCOIOOCRRHOIROHOCOC) {
         case 0:
            return false;
         case 1:
            this.ICCCCRHCIOOCICOHOORHICOIIHCHCH();
         case 2:
            if (this.RCROHHIOOCIHIHCCHIHIHHOHOHIOOR == null) {
               return false;
            } else {
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI var1 = this.RCROHHIOOCIHIHCCHIHIHHOHOHIOOR
                  .COCHOCOHRICCHIIIHIOORCIIRROOHI();
               if (var1 == null) {
                  var1 = this.RCROHHIOOCIHIHCCHIHIHHOHOHIOOR.OHHCRICRRCCHOHIRIRIHOIRHIROOIC();
                  if (var1 == null
                     || var1 == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.END_ARRAY
                     )
                   {
                     this.HOOHRIHICRIRCOIOOCRRHOIROHOCOC = 0;
                     if (this.HHRCCCCROCRICCICHCHHROORRHIRRR) {
                        this.RCROHHIOOCIHIHCCHIHIHHOHOHIOOR.close();
                     }

                     return false;
                  }
               }

               this.HOOHRIHICRIRCOIOOCRRHOIROHOCOC = 3;
               return true;
            }
         case 3:
         default:
            return true;
      }
   }

   public T nextValue() {
      switch (this.HOOHRIHICRIRCOIOOCRRHOIROHOCOC) {
         case 0:
            return this.OROIHOOCICCROIHCHCCRHHCHRIORII();
         case 1:
         case 2:
            if (!this.OCHCOIHOORHCHHCOOCOCHRROOOOROC()) {
               return this.OROIHOOCICCROIHCHCCRHHCHRIORII();
            }
         case 3:
         default:
            byte var1 = 1;

            try {
               Object var2;
               if (this.OIHOOOHCHOCHOCOOIRCROCRCRCOICC == null) {
                  var2 = this.CHRCHCCRIRIIRORCOHORIIOOOIIOHO.deserialize(this.RCROHHIOOCIHIHCCHIHIHHOHOHIOOR, this.RCIHIOOIHHIHOORIRIHCHCIHCCIHRC);
               } else {
                  this.CHRCHCCRIRIIRORCOHORIIOOOIIOHO
                     .deserialize(this.RCROHHIOOCIHIHCCHIHIHHOHOHIOOR, this.RCIHIOOIHHIHOORIRIHCHCIHCCIHRC, this.OIHOOOHCHOCHOCOOIRCROCRCRCOICC);
                  var2 = this.OIHOOOHCHOCHOCOOIRCROCRCRCOICC;
               }

               var1 = 2;
               return (T)var2;
            } finally {
               this.HOOHRIHICRIRCOIOOCRRHOIROHOCOC = var1;
               this.RCROHHIOOCIHIHCCHIHIHHOHOHIOOR.RHICIRCCHCRHOOOCCCIIOOIRRIORHO();
            }
      }
   }

   public List<T> ORCRROIROHCCOCOCOOHOOHIHIRHCIR() {
      return this.HCCCIIHICHIROIHHIIHCIIICCORCCR(new ArrayList<>());
   }

   public <L extends List<? super T>> L HCCCIIHICHIROIHHIIHCIIICCORCCR(L var1) {
      while (this.OCHCOIHOORHCHHCOOCOCHRROOOOROC()) {
         var1.add(this.nextValue());
      }

      return (L)var1;
   }

   public <C extends Collection<? super T>> C CRHROHHHCIHHCOHCOORCRIHHIICROR(C var1) {
      while (this.OCHCOIHOORHCHHCOOCOCHRROOOOROC()) {
         var1.add(this.nextValue());
      }

      return (C)var1;
   }

   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI IHICOOIOCRHRCHIIOHRHICRIOHHIOR() {
      return this.RCROHHIOOCIHIHCCHIHIHHOHOHIOOR;
   }

   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH HIRIIRCOCIRIHRCCOORCRICHOOROIO() {
      return this.RCROHHIOOCIHIHCCHIHIHHOHOHIOOR.HCHHOOORIICCROCICCOIRRHHHOIHRC();
   }

   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI COIIOIOCCIOCOOIROHCCHHRHCICIHI() {
      return this.RCROHHIOOCIHIHCCHIHIHHOHOHIOOR.COIIOIOCCIOCOOIROHCCHHRHCICIHI();
   }

   protected void ICCCCRHCIOOCICOHOORHICOIIHCHCH() {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1 = this.RCROHHIOOCIHIHCCHIHIHHOHOHIOOR;
      if (var1.CCOCHROROIROCOCCRRIOIHRCCOOICI() != this.IOHRHHROHIRIORRHOHHCCIIIRCHHCI) {
         while (true) {
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI var2 = var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC();
            if (var2 != com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.END_ARRAY
               && var2 != com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.END_OBJECT) {
               if (var2 != com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_ARRAY
                  && var2 != com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_OBJECT
                  )
                {
                  if (var2 == null) {
                     return;
                  }
               } else {
                  var1.CIHCRICOCCRRHOOCCCIROOOHHROORC();
               }
            } else if (var1.CCOCHROROIROCOCCRRIOIHRCCOOICI() == this.IOHRHHROHIRIORRHOHHCCIIIRCHHCI) {
               var1.RHICIRCCHCRHOOOCCCIIOOIRRIORHO();
               return;
            }
         }
      }
   }

   protected <R> R OROIHOOCICCROIHCHCCRHHCHRIORII() {
      throw new NoSuchElementException();
   }

   protected <R> R RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IHHCHHHCRIHOOCOIOOCRIIICIOROIR var1) {
      throw new RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(var1.getMessage(), var1);
   }

   protected <R> R IRCIIHHICIHRCOCRROCOICRIHHCCHH(IOException var1) {
      throw new RuntimeException(var1.getMessage(), var1);
   }
}
