package com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.functions.Function;
import com.eliotlash.molang.variables.ExecutionContext;
import com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR;
import org.jetbrains.annotations.NotNull;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO
   extends Function
   implements com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   private final boolean IHCOIOICIIHHORROHRCOCHHOROORRH;
   @NotNull
   private final String HRIICICHIOORIIRIRICCIRCRCIORHC;
   private final com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH CICHICHCICCOIRCRCOCORCOHOHOOHR;

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      String var1,
      boolean var2,
      @NotNull String var3,
      com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4
   ) {
      super(var1);
      this.IHCOIOICIIHHORROHRCOCHHOROORRH = var2;
      this.HRIICICHIOORIIRIRICCIRCRCIORHC = var3;
      this.CICHICHCICCOIRCRCOCORCOHOHOOHR = var4;
   }

   @Override
   public boolean ICRCOOIHHHRCCROCCRIRCIOCIRIHIH(int var1) {
      return var1 == 0;
   }

   @Override
   public boolean IIRIIICCOORHIRHCIIROIHOROCICCC(int var1) {
      return true;
   }

   @CORCOCICIRIOHROHROIIOOHICCHCRR
   public double call() {
      com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1 = this.IHCOIOICIIHHORROHRCOCHHOROORRH
         ? this.CICHICHCICCOIRCRCOCORCOHOHOOHR.HROCIHRIOCRCRHCCCHRHRCRCRHHRCH()
         : this.CICHICHCICCOIRCRCOCORCOHOHOOHR.OCHORRRCHIRHRCHHOIHCOOCOCROIOC();
      if (var1 == null) {
         return 0.0;
      } else {
         return this.HRIICICHIOORIIRIRICCIRCRCIORHC.equalsIgnoreCase(var1.getId()) ? 1.0 : 0.0;
      }
   }

   @Override
   public double _evaluate(Expr[] var1, ExecutionContext var2) {
      return this.call();
   }

   @Override
   public double evaluate(Expr[] var1, ExecutionContext var2) {
      return this.call();
   }
}
