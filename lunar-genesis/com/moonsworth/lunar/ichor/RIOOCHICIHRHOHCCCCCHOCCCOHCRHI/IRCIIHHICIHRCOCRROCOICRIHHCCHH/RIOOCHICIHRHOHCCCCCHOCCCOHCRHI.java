package com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.util.HashMap;
import java.util.Map;
import org.spongepowered.asm.service.IGlobalPropertyService;
import org.spongepowered.asm.service.IPropertyKey;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI implements IGlobalPropertyService {
   private final Map<String, Object> blackboard = new HashMap<>();

   @Override
   public IPropertyKey resolveKey(String var1) {
      return new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
   }

   @Override
   public <T> T getProperty(IPropertyKey var1) {
      return (T)this.blackboard.get(var1.toString());
   }

   @Override
   public void setProperty(IPropertyKey var1, Object var2) {
      this.blackboard.put(var1.toString(), var2);
   }

   @Override
   public <T> T getProperty(IPropertyKey var1, T var2) {
      return (T)this.blackboard.getOrDefault(var1.toString(), var2);
   }

   @Override
   public String getPropertyString(IPropertyKey var1, String var2) {
      return this.getProperty(var1, var2);
   }

   static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements IPropertyKey {
      private final String RIOHROCOHIOCRHORHHCCRCOHCOCRRO;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1) {
         this.RIOHROCOHIOCRHORHHCCRCOHCOCRRO = var1;
      }

      @Override
      public String toString() {
         return this.RIOHROCOHIOCRHORHHCCRCOHCOCRRO;
      }
   }
}
