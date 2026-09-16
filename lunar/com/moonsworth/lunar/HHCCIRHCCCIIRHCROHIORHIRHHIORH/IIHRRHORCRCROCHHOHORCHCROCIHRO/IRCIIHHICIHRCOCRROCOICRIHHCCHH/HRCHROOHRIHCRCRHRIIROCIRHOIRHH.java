package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import java.util.Optional;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH implements CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final Type ORROOOCICOIIRRRIRIRRCHCCHCCCOH = Type.getType(Optional.class);
   private static final String ICROHCCHHORIIOIRIIICCCCOHRIRCH = ORROOOCICOIIRRRIRIRRCHCCHCCCOH.getInternalName();
   private static final Type RHCCHRRHCHOHHOCRCOHOHHROOOOCCC = Type.getType(Object.class);

   @Override
   public com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      InsnList var3
   ) {
      CRICCOOHHHCHOORCICOCOHIHOIRHOO var4 = var1.IICRHRIOIROIOHRICHHHHHIHIOOICI();
      CRICCOOHHHCHOORCICOCOHIHOIRHOO var5 = var2.IICRHRIOIROIOHRICHHHHHIHIOOICI();
      if (!(var4 instanceof com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH)
         || !((com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var4).name().equals(ICROHCCHHORIIOIRIIICCCCOHRIRCH)) {
         return var1;
      } else if (var5 instanceof com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH
         && ((com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var5).name().equals(ICROHCCHHORIIOIRIIICCCCOHRIRCH)) {
         return var1;
      } else if (var1.getParams() != null && !var1.getParams().isEmpty()) {
         com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var6 = (com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR)var1.getParams()
            .get(0);
         var3.add(new InsnNode(1));
         var3.add(
            new MethodInsnNode(
               182,
               ICROHCCHHORIIOIRIIICCCCOHRIRCH,
               "orElse",
               Type.getMethodDescriptor(RHCCHRRHCHOHHOCRCOHOHHROOOOCCC, new Type[]{RHCCHRRHCHOHHOCRCOHOHHROOOOCCC}),
               false
            )
         );
         var3.add(
            new TypeInsnNode(
               192, ((com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var6.IICRHRIOIROIOHRICHHHHHIHIOOICI()).name()
            )
         );
         return var6;
      } else {
         throw new IllegalStateException("Optional type must have a specified generic parameter!");
      }
   }

   @Override
   public com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      InsnList var3
   ) {
      CRICCOOHHHCHOORCICOCOHIHOIRHOO var4 = var1.IICRHRIOIROIOHRICHHHHHIHIOOICI();
      CRICCOOHHHCHOORCICOCOHIHOIRHOO var5 = var2.IICRHRIOIROIOHRICHHHHHIHIOOICI();
      if (var4 instanceof com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH
         && ((com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var4).name().equals(ICROHCCHHORIIOIRIIICCCCOHRIRCH)) {
         return var2;
      } else if (!(var5 instanceof com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH)
         || !((com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var5).name().equals(ICROHCCHHORIIOIRIIICCCCOHRIRCH)) {
         return var2;
      } else if (var2.getParams() != null && !var2.getParams().isEmpty()) {
         com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var6 = (com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR)var2.getParams()
            .get(0);
         var3.add(
            new MethodInsnNode(
               184,
               ICROHCCHHORIIOIRIIICCCCOHRIRCH,
               "ofNullable",
               Type.getMethodDescriptor(ORROOOCICOIIRRRIRIRRCHCCHCCCOH, new Type[]{RHCCHRRHCHOHHOCRCOHOHHROOOOCCC}),
               false
            )
         );
         return var6;
      } else {
         throw new IllegalStateException("Optional type must have a specified generic parameter!");
      }
   }
}
