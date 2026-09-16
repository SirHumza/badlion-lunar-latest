package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.HashMap;
import java.util.Map;

public class RHCHRCOCCOIIIHCHRHIRCORHRHRICR implements RORCHCIIICOHIRROOORHOCCCCIOCCI {
   protected Map<CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, Object> IRRIIIOHHRRCOOIRHRIORHRHHCROHO;

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, Object var2) {
      if (this.IRRIIIOHHRRCOOIRHRIORHRHHCROHO == null) {
         this.IRRIIIOHHRRCOOIRHRIORHRHHCROHO = new HashMap<>();
      } else {
         Object var3 = this.IRRIIIOHHRRCOOIRHRIORHRHHCROHO.get(var1);
         if (var3 != null) {
            if (var3 == var2) {
               return;
            }

            throw new IllegalStateException("Already had POJO for id (" + var1.CIHIOICICHIHOCHIIHOIOCRCRIHCCC.getClass().getName() + ") [" + var1 + "]");
         }
      }

      this.IRRIIIOHHRRCOOIRHRIORHRHHCROHO.put(var1, var2);
   }

   @Override
   public Object RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      return this.IRRIIIOHHRRCOOIRHRIORHRHHCROHO == null ? null : this.IRRIIIOHHRRCOOIRHRIORHRHHCROHO.get(var1);
   }

   @Override
   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RORCHCIIICOHIRROOORHOCCCCIOCCI var1) {
      return var1.getClass() == this.getClass();
   }

   @Override
   public RORCHCIIICOHIRROOORHOCCCCIOCCI OIRCRCOOHCOHHCIHHIROIOCHCIHOHH(Object var1) {
      return new RHCHRCOCCOIIIHCHRHIRCORHRHRICR();
   }
}
