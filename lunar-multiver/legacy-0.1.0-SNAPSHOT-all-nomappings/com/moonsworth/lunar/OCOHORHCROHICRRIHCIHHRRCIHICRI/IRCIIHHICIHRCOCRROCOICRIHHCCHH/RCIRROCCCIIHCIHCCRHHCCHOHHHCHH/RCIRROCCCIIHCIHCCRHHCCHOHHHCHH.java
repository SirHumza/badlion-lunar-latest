package com.moonsworth.lunar.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import java.util.function.Predicate;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;

@IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements IEntitySelector {
   private final Predicate predicate;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Predicate var1) {
      this.predicate = var1;
   }

   public boolean isEntityApplicable(Entity var1) {
      return this.predicate.test(var1);
   }
}
