package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Modifier;

public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   protected IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
   }

   public abstract <A extends Annotation> A getAnnotation(Class<A> var1);

   public abstract boolean hasAnnotation(Class<?> var1);

   public abstract boolean RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Class<? extends Annotation>[] var1);

   public abstract AnnotatedElement RHCHIIHIHIRCRIRHRCIRIIOROOOHOC();

   protected abstract int getModifiers();

   public boolean isPublic() {
      return Modifier.isPublic(this.getModifiers());
   }

   public abstract String getName();

   public abstract com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI getType();

   public abstract Class<?> getRawType();

   @Deprecated
   public abstract Iterable<Annotation> OIIOOORRHCOOHOORIOCIHOOCCHHROI();

   @Override
   public abstract boolean equals(Object var1);

   @Override
   public abstract int hashCode();

   @Override
   public abstract String toString();
}
