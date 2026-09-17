package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BooleanSupplier;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements IRCIIHHICIHRCOCRROCOICRIHHCCHH<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> {
   private final List<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> RIICIHIRROIIOOCRRIIHCHRCIRHCII;
   private final List<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> HHHCRIICOIROHRHIIHICCIORCOIRRO = new ArrayList<>();
   @Nullable
   private BooleanSupplier RROHHHROOIOORRHHIRHCCIHRRHCOCC = null;
   private boolean ORIHHHCHCOOOROCCIIHOOHORIIICIO;
   private boolean HIIRCOHROHORHIHHCIOOHROIHHOCHR;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<?>[] var1) {
      this.RIICIHIRROIIOOCRRIIHCHRCIRHCII = new LinkedList<>(List.of(var1));
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CORCOCICIRIOHROHROIIOOHICCHCRR(HCHRIROHHHCORIOCROOCHRCIOROOCI<?>... var1) {
      this.HHHCRIICOIROHRHIIHICCIORCOIRRO.addAll(Arrays.asList(var1));
      return this;
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CIOHHCORHRCCRICCCORIHCRHCCCRRR(@NotNull BooleanSupplier var1) {
      if (this.RROHHHROOIOORRHHIRHCCIHRRHCOCC == null) {
         this.RROHHHROOIOORRHHIRHCCIHRRHCOCC = var1;
      } else {
         BooleanSupplier var2 = this.RROHHHROOIOORRHHIRHCCIHRRHCOCC;
         this.RROHHHROOIOORRHHIRHCCIHRRHCOCC = () -> var2.getAsBoolean() || var1.getAsBoolean();
      }

      return this;
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IHHCHHHCRIHOOCOIOOCRIIICIOROIR(@NotNull BooleanSupplier var1) {
      if (var1.getAsBoolean()) {
         this.ORIHHHCHCOOOROCCIIHOOHORIIICIO = true;
      }

      return this;
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OCOHIOCHOCHRCCROORRIIIHIOHOIIR(boolean var1) {
      this.HIIRCOHROHORHIHHCIOOHROIHHOCHR = var1;
      return this;
   }

   @TestOnly
   @Override
   public void HRHICOCCOOHROCCIHHOHORHIHHHHOO(boolean var1) {
      this.ORIHHHCHCOOOROCCIIHOOHORIIICIO |= var1;
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHRIICOIOORCHCOIICOOIHIRHHICRI(int... var1) {
      for (int var5 : var1) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == var5) {
            return this;
         }
      }

      this.ORIHHHCHCOOOROCCIIHOOHORIIICIO = true;
      return this;
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ORHIOICIOCRRHOOCOHRORIHICHRCRR(int... var1) {
      for (int var5 : var1) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == var5) {
            this.ORIHHHCHCOOOROCCIIHOOHORIIICIO = true;
            break;
         }
      }

      return this;
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OIHCOHRCICCCRHRCROOCIOIRRHHHIH(String... var1) {
      for (String var5 : var1) {
         if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.hasModule(var5)) {
            this.ORIHHHCHCOOOROCCIIHOOHORIIICIO = true;
            break;
         }
      }

      return this;
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(String... var1) {
      for (String var5 : var1) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.hasModule(var5)) {
            this.ORIHHHCHCOOOROCCIIHOOHORIIICIO = true;
            break;
         }
      }

      return this;
   }

   @Override
   public boolean ICRICHRHCRRRHHCOCROIIORCORICCI() {
      return this.HIIRCOHROHORHIHHCIOOHROIHHOCHR;
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RIORIIRCCCOCIHCHOIICORIOROOHRC(int var1) {
      ArrayList var2 = new ArrayList(this.RIICIHIRROIIOOCRRIIHCHRCIRHCII.size() - var1);

      for (int var3 = var1; var3 < this.RIICIHIRROIIOOCRRIIHCHRCIRHCII.size(); var3++) {
         var2.add(this.RIICIHIRROIIOOCRRIIHCHRCIRHCII.remove(var1));
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
      var4.HHHCRIICOIROHRHIIHICCIORCOIRRO.addAll(this.HHHCRIICOIROHRHIIHICCIORCOIRRO);
      var4.RROHHHROOIOORRHHIRHCCIHRRHCOCC = this.RROHHHROOIOORRHHIRHCCIHRRHCOCC;
      var4.ORIHHHCHCOOOROCCIIHOOHORIIICIO = this.ORIHHHCHCOOOROCCIIHOOHORIIICIO;
      return var4;
   }

   @Generated
   @Override
   public List<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> RCRIOCCCOOIRICRHHCCIRCIOHRRRIO() {
      return this.RIICIHIRROIIOOCRRIIHCHRCIRHCII;
   }

   @Generated
   @Override
   public List<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> IOOOOCIIHIIRROOOOHCICRRICRIHRR() {
      return this.HHHCRIICOIROHRHIIHICCIORCOIRRO;
   }

   @Nullable
   @Generated
   @Override
   public BooleanSupplier HCORHHRCICRCCOOCHOHORHHRICHCII() {
      return this.RROHHHROOIOORRHHIRHCCIHRRHCOCC;
   }

   @Generated
   @Override
   public boolean IROIOIOOCOCCOICCHIRHROIOCOOOOR() {
      return this.ORIHHHCHCOOOROCCIIHOOHORIIICIO;
   }

   @Generated
   public boolean IIICIIRHRRRHICHHCRHCOIHCIHRHHO() {
      return this.HIIRCOHROHORHIHHCIOOHROIHHOCHR;
   }

   @Generated
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(List<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> var1) {
      this.RIICIHIRROIIOOCRRIIHCHRCIRHCII = var1;
   }
}
