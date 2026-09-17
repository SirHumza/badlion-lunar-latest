package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.lunarclient.dfu.serialization.Codec;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import java.util.Objects;
import java.util.function.BooleanSupplier;
import lombok.Generated;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

public class HICHRCOHCCRHOHCICOOCHOIHCCHIRI extends com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private boolean OCRIIHRCIHOIHHIIOHHRRRHRCROIOO = false;

   protected HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1,
      Codec<Boolean> var2,
      Boolean var3
   ) {
      super(var1, var2, var3);
   }

   @Override
   protected com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<?> CIOHHCORHRCCRICCCORIHCRHCCCRRR(
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      return !this.getChildren().isEmpty()
         ? new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
            this, var1
         )
         : new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR(
            this, var1
         );
   }

   @Generated
   public boolean IHICHICHCHCRROIRCROHOHHHIIIHIH() {
      return this.OCRIIHRCIHOIHHIIOHHRRRHRCROIOO;
   }

   @Generated
   public void IOOORHIIOIRRCRIHHCHIRCCHCRRCCR(boolean var1) {
      this.OCRIIHRCIHOIHHIIOHHRRRHRCROIOO = var1;
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      extends com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, HICHRCOHCCRHOHCICOOCHOIHCCHIRI> {
      @Nullable
      private BooleanSupplier COHOCRCOOCROCIOHIRHRIHOCOHRORC;

      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1
      ) {
         super(var1);
      }

      @Override
      protected boolean IORHHRCHIORRIRCCICOHCICICRCIHR() {
         return true;
      }

      @Contract("_->this")
      public HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HRCHROOHRIHCRCRHRIIROCIRHOIRHH(BooleanSupplier var1) {
         this.COHOCRCOOCROCIOHIRHRIHOCOHRORC = var1;
         return this;
      }

      protected HICHRCOHCCRHOHCICOOCHOIHCCHIRI CRICCOOHHHCHOORCICOCOHIHOIRHOO(HICHRCOHCCRHOHCICOOCHOIHCCHIRI var1) {
         super.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var1);
         if (this.COHOCRCOOCROCIOHIRHRIHOCOHRORC != null) {
            com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var2 = var1.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
               com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.COIIHHRHOCRHHHCICCIHOHHOCICORR
            );
            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.COIIHHRHOCRHHHCICCIHOHHOCICORR,
               new com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(
                  var2, this.COHOCRCOOCROCIOHIRHRIHOCOHRORC, true
               )
            );
         }

         return var1;
      }

      protected HICHRCOHCCRHOHCICOOCHOIHCCHIRI CIRHIOCHHCOIIOHIHOCIRROOIHIOCR() {
         return new HICHRCOHCCRHOHCICOOCHOIHCCHIRI(this.RROHIIOCCIOHRHHIIRIOIRHHIOCRRO, this.codec, this.CRIORHRHCCOCIRORORRHHRCHOORCCC);
      }

      public HICHRCOHCCRHOHCICOOCHOIHCCHIRI IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(final String var1, final boolean var2) {
         return this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(
            new HICHRCOHCCRHOHCICOOCHOIHCCHIRI(this.RROHIIOCCIOHRHHIIRIOIRHHIOCRRO, this.codec, this.CRIORHRHCCOCIRORORRHHRCHOORCCC) {
               public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Boolean var1x, boolean var2x) {
                  if (var2x || !Objects.equals(this.CICRIIIRCRCHOIROOIRHIIRHOCHCRR(), var1x)) {
                     System.out.println("[DEBUG] " + var1 + ": update(" + var1x + ", " + var2x + ")");
                     if (var2) {
                        Thread.dumpStack();
                     }
                  }

                  super.CRRRICCRROCOHHOHIICIHORCOORRRH(var1x, var2x);
               }

               public void CHHIICHRIIROIOHIHIIROICOCCROCI(Boolean var1x) {
                  if (!Objects.equals(this.CICRIIIRCRCHOIROOIRHIIRHOCHCRR(), var1x)) {
                     System.out.println("[DEBUG] " + var1 + ": silentUpdate(" + var1x + ")");
                     if (var2) {
                        Thread.dumpStack();
                     }
                  }

                  super.RRHOOOORORHHOOIHRCCHIIHHIIIIOH(var1x);
               }

               @Override
               public void HIHHOCRHHRORRHHRORRRIIHHORIHOC(Object var1x) {
                  if (var1x instanceof HCHRIROHHHCORIOCROOCHRCIOROOCI var2x) {
                     var1x = var2x.get();
                  }

                  if (var1x.getClass().isInstance(this.CICRIIIRCRCHOIROOIRHIIRHOCHCRR())) {
                     System.out.println("[DEBUG] " + var1 + ": silentUpdateNoSave(" + var1x + ")");
                     if (var2) {
                        Thread.dumpStack();
                     }
                  }

                  super.HIHHOCRHHRORRHHRORRRIIHHORIHOC(var1x);
               }
            }
         );
      }
   }
}
