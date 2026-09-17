package com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import lombok.Generated;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   private final List<Consumer<MethodVisitor>> HCROOROCHRIOHCORCIHOCOCIOHIRRO = new ArrayList<>();
   private final List<Type> HIOROHHCOHCIIOOIRROOHHOCCRROOR = new ArrayList<>();
   private final List<Object> RROIOHHCHHRCICCHICHOICCICOCRCI = new ArrayList<>();
   private int RHIIHIHCCHIHCCOHOHHCHIICHIIIHR = 0;

   public String OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(Object var1) {
      for (int var2 = 0; var2 < this.HIOROHHCOHCIIOOIRROOHHOCCRROOR.size(); var2++) {
         if (this.RROIOHHCHHRCICCHICHOICCICOCRCI.get(var2) == var1) {
            return "_" + var2;
         }
      }

      this.HIOROHHCOHCIIOOIRROOHHOCCRROOR.add(Type.getType(var1.getClass()));
      this.RROIOHHCHHRCICCHICHOICCICOCRCI.add(var1);
      return "_" + this.RHIIHIHCCHIHCCOHOHHCHIICHIIIHR++;
   }

   public void OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(Consumer<MethodVisitor> var1) {
      this.HCROOROCHRIOHCORCIHOCOCIOHIRRO.add(var1);
   }

   @Generated
   public List<Consumer<MethodVisitor>> OCIHIRIHRHOOHOHRHRORRCOOIIHORH() {
      return this.HCROOROCHRIOHCORCIHOCOCIOHIRRO;
   }

   @Generated
   public List<Type> IOROCOIRHORCCOIORIHHIOOOIHOORO() {
      return this.HIOROHHCOHCIIOOIRROOHHOCCRROOR;
   }

   @Generated
   public List<Object> OIRRCCOIRIOIHHRCOIHOCRIOIOIICO() {
      return this.RROIOHHCHHRCICCHICHOICCICOCRCI;
   }
}
