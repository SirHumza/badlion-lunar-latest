package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IOHHOIIOCRHCHHCRORICCOHOHROOIH;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import lombok.Generated;
import org.intellij.lang.annotations.Subst;
import org.jspecify.annotations.Nullable;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Setting extends com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<Setting>, Parent extends RRCRRCORICCHOHHIRCHIROOHIIOHCO<Setting, Parent>>
   implements CRRRICCRROCOHHOHIICIHORCOORRRH<Setting, com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH, Parent> {
   private final com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH<Setting> RIHHIOIHROORCIIIOICHIHRIROHROO;
   private final com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Setting, Parent> RCRCRCHIRICRIHOIHCROOORROCHIRH;
   private final LinkedList<Setting> HOORCHOOIIOCIRRHHRICIIIHCHOHOC = new LinkedList<>();

   @Override
   public Setting HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING_LABELS) String var1,
      Consumer<Parent> var2
   ) {
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1, var2, null
      );
      if (var3 != null) {
         return (Setting)var3;
      }

      HCHRIROHHHCORIOCROOCHRCIOROOCI var4 = IOHHOIIOCRHCHHCRORICCOHOHROOIH.ICORROIIHHHRIICIOORIRIOHHIHOCI(var1).CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var2);
   }

   @Override
   public Setting RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING_LABELS) String var1,
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      Consumer<Parent> var3
   ) {
      if (var2.getType() != com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SOLID) {
         throw new IllegalArgumentException("Category icons must be of type 'solid'");
      }

      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1,
         var3,
         var1x -> {
            if (!com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR) {
               com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2x = var1x.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                  CRICCOOHHHCHOORCICOCOHIHOIRHOO.ROIIHIIRRCCHIRIIOCIORICOHCRIRC
               );
               if (var2x == null || var2x.icon() != var2) {
                  throw new IllegalStateException("Attempting to add new Icon to existing label: " + var1x.getId());
               }
            }
         }
      );
      if (var4 != null) {
         return (Setting)var4;
      }

      HCHRIROHHHCORIOCROOCHRCIOROOCI var5 = IOHHOIIOCRHCHHCRORICCOHOHROOIH.ICORROIIHHHRIICIOORIRIOHHIHOCI(var1)
         .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2)
         .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var3);
   }

   @Override
   public Setting RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Supplier<String> var1, Consumer<Parent> var2) {
      HCHRIROHHHCORIOCROOCHRCIOROOCI var3 = IOHHOIIOCRHCHHCRORICCOHOHROOIH.ICORROIIHHHRIICIOORIRIOHHIHOCI("dynamicCategory")
         .RCOCRROHHROHHOCRCCCHCIROIIOORC(var1)
         .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var2);
   }

   @Override
   public void CRRRICCRROCOHHOHIICIHORCOORRRH(Consumer<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<Setting, Parent>> var1, Consumer<Setting> var2) {
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = new com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(
         this.RIHHIOIHROORCIIIOICHIHRIROHROO, this.RCRCRCHIRICRIHOIHCROOORROCHIRH
      );
      var1.accept(var3);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var2);
   }

   public Setting RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var1, Consumer<Parent> var2) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var1x -> var1x.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1));
   }

   public Setting RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var1, Consumer<Parent> var2, Consumer<Setting> var3) {
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = this.RIHHIOIHROORCIIIOICHIHRIROHROO
         .apply(var1);
      this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC.add((Setting)var4);
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var5 = this.RCRCRCHIRICRIHOIHCROOORROCHIRH
         .apply(
            new com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(
               this.RIHHIOIHROORCIIIOICHIHRIROHROO, this.RCRCRCHIRICRIHOIHCROOORROCHIRH
            ),
            var4
         );
      var2.accept(var5);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var3);
      return (Setting)var4;
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<Setting, ?> var1, Consumer<Setting> var2) {
      for (com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 : var1.OROIHRCCRIHHRIOHOCOCOCHOCRHCOC()) {
         if (var5 instanceof com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6
            && var6.IOOOOCIIHIIRROOOOHCICRRICRIHRR().isEmpty()) {
            var2.accept(var5);
         }

         this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC.add((Setting)var5);
      }
   }

   public Setting HHCCIRHCCCIIRHCROHIORHIRHHIORH(HCHRIROHHHCORIOCROOCHRCIOROOCI<?>... var1) {
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = this.RIHHIOIHROORCIIIOICHIHRIROHROO
         .apply(var1);
      this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC.add(0, (Setting)var2);
      return (Setting)var2;
   }

   public Setting RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var1, HCHRIROHHHCORIOCROOCHRCIOROOCI<?>... var2) {
      for (int var3 = 0; var3 < this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC.size(); var3++) {
         com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC
            .get(var3);
         if (var4 instanceof com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5
            )
          {
            List var6 = var5.RCRIOCCCOOIRICRHHCCIRCIOHRRRIO();

            for (int var7 = 0; var7 < var6.size(); var7++) {
               if (((HCHRIROHHHCORIOCROOCHRCIOROOCI)var6.get(var7)).equals(var1)) {
                  if (var7 == 0) {
                     com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var10 = this.RIHHIOIHROORCIIIOICHIHRIROHROO
                        .apply(var2);
                     this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC.add(var3, (Setting)var10);
                     return (Setting)var10;
                  }

                  com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var8 = (com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var5.CIRRHHHIRCHOHHCRCIHROHHRIOCOHO(
                     var7
                  );
                  this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC.add(var3 + 1, (Setting)var8);
                  com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var9 = this.RIHHIOIHROORCIIIOICHIHRIROHROO
                     .apply(var2);
                  this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC.add(var3 + 1, (Setting)var9);
                  return (Setting)var9;
               }
            }
         }
      }

      return null;
   }

   public Setting IRCIIHHICIHRCOCRROCOICRIHHCCHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var1, HCHRIROHHHCORIOCROOCHRCIOROOCI<?>... var2) {
      for (int var3 = 0; var3 < this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC.size(); var3++) {
         com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC
            .get(var3);
         if (var4 instanceof com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5
            )
          {
            List var6 = var5.RCRIOCCCOOIRICRHHCCIRCIOHRRRIO();

            for (int var7 = 0; var7 < var6.size(); var7++) {
               if (((HCHRIROHHHCORIOCROOCHRCIOROOCI)var6.get(var7)).equals(var1)) {
                  if (var7 == var6.size() - 1) {
                     com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var10 = this.RIHHIOIHROORCIIIOICHIHRIROHROO
                        .apply(var2);
                     this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC.add(var3 + 1, (Setting)var10);
                     return (Setting)var10;
                  }

                  com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var8 = (com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var5.CIRRHHHIRCHOHHCRCIHROHHRIOCOHO(
                     var7 + 1
                  );
                  this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC.add(var3 + 1, (Setting)var8);
                  com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var9 = this.RIHHIOIHROORCIIIOICHIHRIROHROO
                     .apply(var2);
                  this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC.add(var3 + 1, (Setting)var9);
                  return (Setting)var9;
               }
            }
         }
      }

      return null;
   }

   public Setting CRRRICCRROCOHHOHIICIHORCOORRRH(HCHRIROHHHCORIOCROOCHRCIOROOCI<?>... var1) {
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = this.RIHHIOIHROORCIIIOICHIHRIROHROO
         .apply(var1);
      this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC.add((Setting)var2);
      return (Setting)var2;
   }

   public Setting ROHRRRCRRCHRROOOOIOHRCCHRRROOR(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING_LABELS) String var1
   ) {
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = this.RIHHIOIHROORCIIIOICHIHRIROHROO
         .apply(IOHHOIIOCRHCHHCRORICCOHOHROOIH.ICORROIIHHHRIICIOORIRIOHHIHOCI(var1).IHCCIOHIOROICRORCHCIIHHHCRHICR().CHCROCIHRRCHHCIHIICOCOCIIHCCOO());
      this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC.add((Setting)var2);
      return (Setting)var2;
   }

   public Setting HOCRHCOCIHIOHHCRIOOIHRCCCRIRHR() {
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = this.RIHHIOIHROORCIIIOICHIHRIROHROO
         .apply(IOHHOIIOCRHCHHCRORICCOHOHROOIH.ICORROIIHHHRIICIOORIRIOHHIHOCI("").CHCROCIHRRCHHCIHIICOCOCIIHCCOO());
      this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC.add((Setting)var1);
      return (Setting)var1;
   }

   public Setting IIRHHCRORIOCIHIOIHIRHOHCIRIOHI() {
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = this.RIHHIOIHROORCIIIOICHIHRIROHROO
         .apply(IOHHOIIOCRHCHHCRORICCOHOHROOIH.ICORROIIHHHRIICIOORIRIOHHIHOCI("").CCIOHOIROIRRCHIICRCCCCCOHHCCCO().CHCROCIHRRCHHCIHIICOCOCIIHCCOO());
      this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC.add((Setting)var1);
      return (Setting)var1;
   }

   @Override
   public List<Setting> OROIHRCCRIHHRIOHOCOCOCHOCRHCOC() {
      return this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC;
   }

   @Override
   public Setting IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      @Subst("generalOptions") com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = var1.getIcon();
      if (var2.getType() != com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SOLID) {
         throw new IllegalArgumentException("Category icons must be of type 'solid'");
      } else {
         com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1.getName(),
            (Consumer<Parent>)null,
            var1x -> {
               if (!com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR) {
                  com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2x = var1x.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                     CRICCOOHHHCHOORCICOCOHIHOIRHOO.ROIIHIIRRCCHIRIIOCIORICOHCRIRC
                  );
                  if (var2x == null || var2x.icon() != var2) {
                     throw new IllegalStateException("Attempting to add new Icon to existing label: " + var1x.getId());
                  }
               }
            }
         );
         if (var3 != null) {
            var3.CCHHIOROOICROROOCOHHCRRICCOCRO(true);
            return (Setting)var3;
         } else {
            HCHRIROHHHCORIOCROOCHRCIOROOCI var4 = IOHHOIIOCRHCHHCRORICCOHOHROOIH.ICORROIIHHHRIICIOORIRIOHHIHOCI(var1.getName())
               .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2)
               .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
            com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 = this.RIHHIOIHROORCIIIOICHIHRIROHROO
               .apply(var4);
            this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC.add((Setting)var5);
            var5.CCHHIOROOICROROOCOHHCRRICCOCRO(true);
            return (Setting)var5;
         }
      }
   }

   @Override
   public void IHCRORHRORIICHRHRCHRRIRRHHOCOO(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var1) {
      for (com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 : this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC) {
         if (var3 instanceof com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4
            )
          {
            var4.RCRIOCCCOOIRICRHHCCIRCIOHRRRIO().remove(var1);
            var4.IOOOOCIIHIIRROOOOHCICRRICRIHRR().remove(var1);
         }
      }
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var1, HCHRIROHHHCORIOCROOCHRCIOROOCI<?>... var2) {
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = this.RIHHIOIHROORCIIIOICHIHRIROHROO
         .apply(var2);
      var3.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1);
      this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC.add((Setting)var3);
   }

   @Override
   public void CRRRICCRROCOHHOHIICIHORCOORRRH(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var1, HCHRIROHHHCORIOCROOCHRCIOROOCI<?>... var2) {
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = this.RIHHIOIHROORCIIIOICHIHRIROHROO
         .apply(var1);
      var3.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var2);
      this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC.add((Setting)var3);
   }

   private @Nullable Setting RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var1, @Nullable Consumer<Parent> var2, @Nullable Consumer<ROOCOCCCIRHHHIRIOIHHHHRHIICHHR> var3
   ) {
      for (com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 : this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC) {
         if (var5 instanceof com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6
            && var6.IOOOOCIIHIIRROOOOHCICRRICRIHRR().isEmpty()) {
            for (HCHRIROHHHCORIOCROOCHRCIOROOCI var8 : var6.RCRIOCCCOOIRICRHHCCIRCIOHRRRIO()) {
               if (var8 instanceof ROOCOCCCIRHHHIRIOIHHHHRHIICHHR var9 && var9.getId().equals(var1)) {
                  if (var2 != null) {
                     RRCRRCORICCHOHHIRCHIROOHIIOHCO var10 = this.RCRCRCHIRICRIHOIHCROOORROCHIRH
                        .apply(
                           new com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(
                              this.RIHHIOIHROORCIIIOICHIHRIROHROO, this.RCRCRCHIRICRIHOIHCROOORROCHIRH
                           ),
                           var5
                        );
                     var2.accept(var10);
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, var1x -> var1x.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var8));
                  }

                  if (var3 != null) {
                     var3.accept(var9);
                  }

                  return (Setting)var5;
               }
            }
         }
      }

      return null;
   }

   @Override
   public Map<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>, com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> OCRHIOHCOIRRORRCRIRICOIHCCOHRC() {
      LinkedHashMap var1 = new LinkedHashMap();

      for (com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 : this.HOORCHOOIIOCIRRHHRICIIIHCHOHOC) {
         if (var3 instanceof com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4
            )
          {
            ArrayList var5 = new ArrayList();
            List var6 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var4.RCRIOCCCOOIRICRHHCCIRCIOHRRRIO());

            for (HCHRIROHHHCORIOCROOCHRCIOROOCI var8 : var4.IOOOOCIIHIIRROOOOHCICRRICRIHRR()) {
               com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var9 = (com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1.get(
                  var8
               );
               if (var9 == null) {
                  var9 = new com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                     new ArrayList<>(), var8, new ArrayList<>(var6), null, false, false
                  );
                  var1.put(var8, var9);
                  var5.add(var9);
               } else {
                  var9.getChildren().addAll(var6);
                  var5.add(var9);
               }
            }

            for (HCHRIROHHHCORIOCROOCHRCIOROOCI var14 : var4.RCRIOCCCOOIRICRHHCCIRCIOHRRRIO()) {
               com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var16 = (com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1.get(
                  var14
               );
               if (var16 == null) {
                  var1.put(
                     var14,
                     new com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        new ArrayList<>(var5),
                        var14,
                        new ArrayList<>(),
                        var4.HCORHHRCICRCCOOCHOHORHHRICHCII(),
                        var4.IROIOIOOCOCCOICCHIRHROIOCOOOOR(),
                        var4.ICRICHRHCRRRHHCOCROIIORCORICCI()
                     )
                  );
               } else {
                  var16.IOOOOCIIHIIRROOOOHCICRRICRIHRR().addAll(var5);
                  BooleanSupplier var10 = var4.HCORHHRCICRCCOOCHOHORHHRICHCII();
                  if (var10 != null) {
                     BooleanSupplier var11 = var16.HCORHHRCICRCCOOCHOHORHHRICHCII();
                     if (var11 != null) {
                        var16.OCOHORHCROHICRRIHCIHHRRCIHICRI(() -> var10.getAsBoolean() || var11.getAsBoolean());
                     } else {
                        var16.OCOHORHCROHICRRIHCIHHRRCIHICRI(var10);
                     }
                  }

                  var16.HRHICOCCOOHROCCIHHOHORHIHHHHOO(var16.IROIOIOOCOCCOICCHIRHROIOCOOOOR() || var4.IROIOIOOCOCCOICCHIRHROIOCOOOOR());
                  var16.HOCHCOORIOCIICCIRCCHCCOCOIRHRC(var4.ICRICHRHCRRRHHCOCROIIORCORICCI());
               }
            }
         }
      }

      Iterator var12 = var1.values().iterator();

      while (var12.hasNext()) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            (com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var12.next(),
            var12
         );
      }

      return var1;
   }

   protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH param1,
      Iterator<com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> param2
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.OutOfMemoryError: Java heap space
      //   at org.jetbrains.java.decompiler.util.collections.SFormsFastMapDirect.getCopy(SFormsFastMapDirect.java:57)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.VarMapHolder.ofNormal(VarMapHolder.java:34)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.ssaStatements(SFormsConstructor.java:111)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SSAUConstructorSparseEx.splitVariables(SSAUConstructorSparseEx.java:45)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:88)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:43)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:238)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH.ROIRROHRCIRCCOOICHCHOHRRRCOORH ()Lcom/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HCHRIROHHHCORIOCROOCHRCIOROOCI;
      // 004: astore 4
      // 006: aload 4
      // 008: instanceof com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/ROOCOCCCIRHHHIRIOIHHHHRHIICHHR
      // 00b: ifeq 171
      // 00e: aload 4
      // 010: checkcast com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/ROOCOCCCIRHHHIRIOIHHHHRHIICHHR
      // 013: astore 3
      // 014: aload 3
      // 015: invokevirtual com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.getId ()Ljava/lang/String;
      // 018: ldc ""
      // 01a: invokestatic java/util/Objects.equals (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 01d: ifne 171
      // 020: aload 1
      // 021: invokevirtual com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH.getChildren ()Ljava/util/List;
      // 024: astore 4
      // 026: aload 1
      // 027: invokevirtual com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIICIIRHRRRHICHHCRHCOIHCIHRHHO ()Z
      // 02a: ifne 03e
      // 02d: aload 4
      // 02f: invokeinterface java/util/List.isEmpty ()Z 1
      // 034: ifeq 03e
      // 037: aload 2
      // 038: invokeinterface java/util/Iterator.remove ()V 1
      // 03d: return
      // 03e: aload 1
      // 03f: invokevirtual com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCORHHRCICRCCOOCHOHORHHRICHCII ()Ljava/util/function/BooleanSupplier;
      // 042: astore 5
      // 044: bipush 1
      // 045: istore 6
      // 047: bipush 0
      // 048: istore 7
      // 04a: iload 7
      // 04c: aload 4
      // 04e: invokeinterface java/util/List.size ()I 1
      // 053: if_icmpge 096
      // 056: aload 4
      // 058: iload 7
      // 05a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 05f: checkcast com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH
      // 062: astore 8
      // 064: iload 7
      // 066: ifne 078
      // 069: aload 5
      // 06b: ifnonnull 078
      // 06e: aload 8
      // 070: invokevirtual com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCORHHRCICRCCOOCHOHORHHRICHCII ()Ljava/util/function/BooleanSupplier;
      // 073: astore 5
      // 075: goto 090
      // 078: aload 5
      // 07a: ifnull 090
      // 07d: aload 5
      // 07f: aload 8
      // 081: invokevirtual com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCORHHRCICRCCOOCHOHORHHRICHCII ()Ljava/util/function/BooleanSupplier;
      // 084: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 087: ifne 090
      // 08a: bipush 0
      // 08b: istore 6
      // 08d: goto 096
      // 090: iinc 7 1
      // 093: goto 04a
      // 096: iload 6
      // 098: ifeq 0a1
      // 09b: aload 1
      // 09c: aload 5
      // 09e: invokevirtual com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI (Ljava/util/function/BooleanSupplier;)V
      // 0a1: aload 1
      // 0a2: invokevirtual com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH.IOOOOCIIHIIRROOOOHCICRRICRIHRR ()Ljava/util/List;
      // 0a5: invokeinterface java/util/List.isEmpty ()Z 1
      // 0aa: ifne 171
      // 0ad: aconst_null
      // 0ae: astore 7
      // 0b0: aload 1
      // 0b1: invokevirtual com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH.IOOOOCIIHIIRROOOOHCICRRICRIHRR ()Ljava/util/List;
      // 0b4: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0b9: astore 8
      // 0bb: aload 8
      // 0bd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c2: ifeq 147
      // 0c5: aload 8
      // 0c7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0cc: checkcast com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH
      // 0cf: astore 9
      // 0d1: aload 9
      // 0d3: invokevirtual com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH.ROIRROHRCIRCCOOICHCHOHRRRCOORH ()Lcom/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HCHRIROHHHCORIOCROOCHRCIOROOCI;
      // 0d6: astore 10
      // 0d8: aload 10
      // 0da: invokeinterface com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HCHRIROHHHCORIOCROOCHRCIOROOCI.getDefaultValue ()Ljava/lang/Object; 1
      // 0df: instanceof java/lang/Boolean
      // 0e2: ifeq 10c
      // 0e5: aload 10
      // 0e7: astore 11
      // 0e9: aload 7
      // 0eb: ifnonnull 0fa
      // 0ee: aload 11
      // 0f0: invokedynamic getAsBoolean (Lcom/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HCHRIROHHHCORIOCROOCHRCIOROOCI;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HHCCIRHCCCIIRHCROHIORHIRHHIORH/IRCIIHHICIHRCOCRROCOICRIHHCCHH/RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH (Lcom/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HCHRIROHHHCORIOCROOCHRCIOROOCI;)Z, ()Z ]
      // 0f5: astore 7
      // 0f7: goto 109
      // 0fa: aload 7
      // 0fc: astore 12
      // 0fe: aload 11
      // 100: aload 12
      // 102: invokedynamic getAsBoolean (Lcom/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HCHRIROHHHCORIOCROOCHRCIOROOCI;Ljava/util/function/BooleanSupplier;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HHCCIRHCCCIIRHCROHIORHIRHHIORH/IRCIIHHICIHRCOCRROCOICRIHHCCHH/RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH (Lcom/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HCHRIROHHHCORIOCROOCHRCIOROOCI;Ljava/util/function/BooleanSupplier;)Z, ()Z ]
      // 107: astore 7
      // 109: goto 131
      // 10c: aload 7
      // 10e: ifnonnull 122
      // 111: aload 10
      // 113: dup
      // 114: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 117: pop
      // 118: invokedynamic getAsBoolean (Lcom/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HCHRIROHHHCORIOCROOCHRCIOROOCI;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HCHRIROHHHCORIOCROOCHRCIOROOCI.isHidden ()Z, ()Z ]
      // 11d: astore 7
      // 11f: goto 131
      // 122: aload 7
      // 124: astore 11
      // 126: aload 10
      // 128: aload 11
      // 12a: invokedynamic getAsBoolean (Lcom/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HCHRIROHHHCORIOCROOCHRCIOROOCI;Ljava/util/function/BooleanSupplier;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HHCCIRHCCCIIRHCROHIORHIRHHIORH/IRCIIHHICIHRCOCRROCOICRIHHCCHH/RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH (Lcom/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HCHRIROHHHCORIOCROOCHRCIOROOCI;Ljava/util/function/BooleanSupplier;)Z, ()Z ]
      // 12f: astore 7
      // 131: aload 9
      // 133: invokevirtual com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH.getChildren ()Ljava/util/List;
      // 136: aload 1
      // 137: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 13c: pop
      // 13d: aload 8
      // 13f: invokeinterface java/util/Iterator.remove ()V 1
      // 144: goto 0bb
      // 147: aload 1
      // 148: invokevirtual com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCORHHRCICRCCOOCHOHORHHRICHCII ()Ljava/util/function/BooleanSupplier;
      // 14b: astore 9
      // 14d: aload 9
      // 14f: ifnonnull 15b
      // 152: aload 1
      // 153: aload 7
      // 155: invokevirtual com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI (Ljava/util/function/BooleanSupplier;)V
      // 158: goto 171
      // 15b: aload 7
      // 15d: ifnull 171
      // 160: aload 7
      // 162: astore 10
      // 164: aload 1
      // 165: aload 10
      // 167: aload 9
      // 169: invokedynamic getAsBoolean (Ljava/util/function/BooleanSupplier;Ljava/util/function/BooleanSupplier;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HHCCIRHCCCIIRHCROHIORHIRHHIORH/IRCIIHHICIHRCOCRROCOICRIHHCCHH/RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH (Ljava/util/function/BooleanSupplier;Ljava/util/function/BooleanSupplier;)Z, ()Z ]
      // 16e: invokevirtual com/moonsworth/lunar/client/HHRIICOIOORCHCOIICOOIHIRHHICRI/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH/HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI (Ljava/util/function/BooleanSupplier;)V
      // 171: return
   }

   private List<com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Map<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>, com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> var1,
      List<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> var2
   ) {
      ArrayList var3 = new ArrayList();

      for (HCHRIROHHHCORIOCROOCHRCIOROOCI var5 : var2) {
         var3.add(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var5));
      }

      return var3;
   }

   private com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Map<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>, com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> var1,
      HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var2
   ) {
      return var1.computeIfAbsent(
         var2,
         var0 -> new com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            new ArrayList<>(), (HCHRIROHHHCORIOCROOCHRCIOROOCI<?>)var0, new ArrayList<>(), null, false, false
         )
      );
   }

   @Generated
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH<Setting> var1,
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Setting, Parent> var2
   ) {
      this.RIHHIOIHROORCIIIOICHIHRIROHROO = var1;
      this.RCRCRCHIRICRIHOIHCROOORROCHIRH = var2;
   }

   @FunctionalInterface
   public interface IRCIIHHICIHRCOCRROCOICRIHHCCHH<Builder extends com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<Builder>>
      extends Function<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>[], Builder> {
      Builder apply(HCHRIROHHHCORIOCROOCHRCIOROOCI<?>... var1);
   }

   @FunctionalInterface
   public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Setting extends com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<Setting>, Parent extends RRCRRCORICCHOHHIRCHIROOHIIOHCO<Setting, Parent>> {
      Parent apply(
         RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<Setting, Parent> var1,
         com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<?> var2
      );
   }
}
