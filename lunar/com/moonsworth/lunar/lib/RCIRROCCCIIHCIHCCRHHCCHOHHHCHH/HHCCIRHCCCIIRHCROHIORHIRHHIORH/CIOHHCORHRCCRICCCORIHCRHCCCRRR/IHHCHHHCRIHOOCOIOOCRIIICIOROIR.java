package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IOIICIRIICICIIOORHCIIIIRRIHRHI;
import java.io.Serializable;
import java.lang.annotation.Annotation;

public abstract class IHHCHHHCRIHOOCOIOOCRIIICIOROIR extends IOIICIRIICICIIOORHCIIIIRRIHRHI implements Serializable {
   private static final long serialVersionUID = 1L;

   protected IHHCHHHCRIHOOCOIOOCRIIICIOROIR(RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO var1) {
      super(var1);
   }

   protected IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HICRRICCHCCROOHHCHOCOCCHOIHHOC var1
   ) {
      super(var1.getMetadata());
   }

   protected IHHCHHHCRIHOOCOIOOCRIIICIOROIR(IHHCHHHCRIHOOCOIOOCRIIICIOROIR var1) {
      super(var1);
   }

   @Override
   public abstract String getName();

   @Override
   public abstract IHCRORHRORIICHRHRCHRRIRRHHOCOO getFullName();

   public <A extends Annotation> A findAnnotation(Class<A> var1) {
      Annotation var2 = this.getAnnotation(var1);
      if (var2 == null) {
         var2 = this.getContextAnnotation(var1);
      }

      return (A)var2;
   }

   @Override
   public abstract <A extends Annotation> A getAnnotation(Class<A> var1);

   @Override
   public abstract <A extends Annotation> A getContextAnnotation(Class<A> var1);

   public abstract void serializeAsField(
      Object var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var2,
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var3
   );

   public abstract void serializeAsOmittedField(
      Object var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var2,
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var3
   );

   public abstract void serializeAsElement(
      Object var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var2,
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var3
   );

   public abstract void serializeAsPlaceholder(
      Object var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var2,
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var3
   );

   @Override
   public abstract void depositSchemaProperty(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.IIHRRHORCRCROCHHOHORCHCROCIHRO var1,
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var2
   );

   @Deprecated
   public abstract void depositSchemaProperty(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.HICRRICCHCCROOHHCHOCOCCHOIHHOC var1,
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var2
   );
}
