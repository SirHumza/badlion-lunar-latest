package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.util.IIOCHOIICCIORCOROIROHICCHIOHIC;
import java.util.List;
import java.util.function.BooleanSupplier;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Child> implements IRCIIHHICIHRCOCRROCOICRIHHCCHH<Child> {
   @Nullable
   private final String IRRHHHRCOHRHRRIRIRHCRHHIRRRRCC;
   private final List<Child> CHHHHIOHIRCRROHCIIHCCCRHROOIRH;
   @Nullable
   private BooleanSupplier RROHHHROOIOORRHHIRHCCIHRRHCOCC;
   private boolean CHOIORORCRRORRRRRICCRIROOICCOR;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable String var1, List<Child> var2, @Nullable BooleanSupplier var3) {
      this.IRRHHHRCOHRHRRIRIRHCRHHIRRRRCC = var1;
      this.CHHHHIOHIRCRROHCIIHCCCRHROOIRH = var2;
      this.RROHHHROOIOORRHHIRHCCIHRRHCOCC = var3;
      this.CHOIORORCRRORRRRRICCRIROOICCOR = var3 != null;
   }

   @NotNull
   @Override
   public List<Child> getChildren() {
      return this.CHHHHIOHIRCRROHCIIHCCCRHROOIRH == null ? List.of() : this.CHHHHIOHIRCRROHCIIHCCCRHROOIRH;
   }

   public boolean RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var1) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, true);
   }

   @VisibleForTesting
   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var1, boolean var2) {
      if (this.RROHHHROOIOORRHHIRHCCIHRRHCOCC != null) {
         boolean var3 = this.RROHHHROOIOORRHHIRHCCIHRRHCOCC.getAsBoolean();
         if (this.CHOIORORCRRORRRRRICCRIROOICCOR != var3) {
            this.CHOIORORCRRORRRRRICCRIROOICCOR = var3;
            if (var2) {
               IIOCHOIICCIORCOROIROHICCHIOHIC.IIHOCRCHOOCROHIICOCIROOORHIOIR();
            }
         }

         return var3
            || var1.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(CRICCOOHHHCHOORCICOCOHIHOIRHOO.COIIHHRHOCRHHHCICCIHOHHOCICORR)
               .flatMap(CRRRICCRROCOHHOHIICIHORCOORRRH::RROOOOIIOCRRHIOHCHRIOIIIHCHCCH)
               .isPresent();
      } else {
         return var1.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(CRICCOOHHHCHOORCICOCOHIHOIRHOO.COIIHHRHOCRHHHCICCIHOHHOCICORR)
            .flatMap(CRRRICCRROCOHHOHIICIHORCOORRRH::RROOOOIIOCRRHIOHCHRIOIIIHCHCCH)
            .isPresent();
      }
   }

   @Nullable
   @Generated
   public String getFeatureId() {
      return this.IRRHHHRCOHRHRRIRIRHCRHHIRRRRCC;
   }

   @Nullable
   @Generated
   @Override
   public BooleanSupplier HCORHHRCICRCCOOCHOHORHHRICHCII() {
      return this.RROHHHROOIOORRHHIRHCCIHRRHCOCC;
   }

   @Generated
   public boolean IROCHOCCRRICIICRCOHCIOCCOIIIOI() {
      return this.CHOIORORCRRORRRRRICCRIROOICCOR;
   }

   @Generated
   public void OCOHORHCROHICRRIHCIHHRRCIHICRI(@Nullable BooleanSupplier var1) {
      this.RROHHHROOIOORRHHIRHCCIHRRHCOCC = var1;
   }
}
