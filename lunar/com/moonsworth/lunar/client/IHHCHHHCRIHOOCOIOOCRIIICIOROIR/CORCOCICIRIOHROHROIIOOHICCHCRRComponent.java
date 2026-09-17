package com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;

import com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.jetbrains.annotations.Nullable;

public interface IRCIIHHICIHRCOCRROCOICRIHHCCHH<Child extends CORCOCICIRIOHROHROIIOOHICCHCRR>
   extends com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Child, Child> {
   <HOLDER extends IRCIIHHICIHRCOCRROCOICRIHHCCHH<Child>> OHHRIOHROOIHOROCIRHCHORIHRRRRI<HOLDER> OCIHORCIRIHROHHCCHIOHCRHHORIOH();

   default void OOCCRCRCOHIIORCCORCRCIRRROIOOR(Consumer<Child> var1) {
      for (CORCOCICIRIOHROHROIIOOHICCHCRR var3 : this.getChildren()) {
         var1.accept(var3);
         IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = var3.IHCRORHRORIICHRHRCHRRIRRHHOCOO(this.OCIHORCIRIHROHHCCHIOHCRHHORIOH());
         if (var4 != null) {
            var4.OOCCRCRCOHIIORCCORCRCIRRROIOOR(var1);
         }
      }
   }

   default void HRCHROOHRIHCRCRHRIIROCIRHOIRHH(Predicate<Child> var1) {
      for (CORCOCICIRIOHROHROIIOOHICCHCRR var3 : this.getChildren()) {
         if (var1.test(var3)) {
            IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = var3.IHCRORHRORIICHRHRCHRRIRRHHOCOO(this.OCIHORCIRIHROHHCCHIOHCRHHORIOH());
            if (var4 != null) {
               var4.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1);
            }
         }
      }
   }

   @Nullable
   default Child OOROOCCIRCCRHOIOIORIHCHHOOCCOR(Predicate<Child> var1) {
      for (CORCOCICIRIOHROHROIIOOHICCHCRR var3 : this.getChildren()) {
         if (var1.test(var3)) {
            return (Child)var3;
         }

         IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = var3.IHCRORHRORIICHRHRCHRRIRRHHOCOO(this.OCIHORCIRIHROHHCCHIOHCRHHORIOH());
         if (var4 != null) {
            CORCOCICIRIOHROHROIIOOHICCHCRR var5 = var4.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1);
            if (var5 != null) {
               return (Child)var5;
            }
         }
      }

      return null;
   }

   default <Build> Build RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Supplier<Build> var1, IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Build, Child> var2) {
      Object var3 = var1.get();

      for (CORCOCICIRIOHROHROIIOOHICCHCRR var5 : this.getChildren()) {
         IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = var5.IHCRORHRORIICHRHRCHRRIRRHHOCOO(this.OCIHORCIRIHROHHCCHIOHCRHHORIOH());
         Object var7;
         if (var6 != null) {
            var7 = var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
         } else {
            var7 = null;
         }

         var2.accept(var3, var5, var7);
      }

      return (Build)var3;
   }

   @FunctionalInterface
   interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Build, Child> {
      void accept(Build var1, Child var2, @Nullable Build var3);
   }
}
