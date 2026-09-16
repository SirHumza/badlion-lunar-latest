package com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.eliotlash.molang.ast.Evaluator;
import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.ast.Stmt;
import java.util.List;
import lombok.Generated;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends Evaluator {
   private com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH CIIIRCIIRHOCIIHCCOORORCRHORHIC;

   @Override
   public double evaluate(List<Stmt> var1) {
      try {
         return this.CIIIRCIIRHOCIIHCCOORORCRHORHIC.evaluate(var1);
      } catch (Exception var3) {
         com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, "Molang JIT");
         return 0.0;
      }
   }

   @Override
   public Double evaluate(Expr var1) {
      try {
         return var1 instanceof Expr.Constant var2 ? var2.value() : this.CIIIRCIIRHOCIIHCCOORORCRHORHIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
      } catch (Exception var3) {
         com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, "Molang JIT");
         return 0.0;
      }
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      this.CIIIRCIIRHOCIIHCCOORORCRHORHIC = var1;
   }
}
