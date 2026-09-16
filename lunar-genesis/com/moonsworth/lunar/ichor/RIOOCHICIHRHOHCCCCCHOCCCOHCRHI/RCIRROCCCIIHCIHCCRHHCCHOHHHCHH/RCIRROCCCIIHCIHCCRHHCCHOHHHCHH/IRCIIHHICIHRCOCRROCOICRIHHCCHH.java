package com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.util.Annotations;

@OCOHORHCROHICRRIHCIHHRRCIHICRI
public interface IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @CRRRICCRROCOHHOHIICIHORCOORRRH
   default void OCOHORHCROHICRRIHCIHHRRCIHICRI(ClassNode var1, com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
      if (Annotations.getInvisible(var1, Mixin.class) != null) {
         for (MethodNode var4 : var1.methods) {
            AnnotationNode var5 = Annotations.getInvisible(var4, CORCOCICIRIOHROHROIIOOHICCHCRR.class);
            if (var5 != null) {
               if (var4.visibleAnnotations != null) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var4.visibleAnnotations, true);
               }

               if (var4.invisibleAnnotations != null) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var4.invisibleAnnotations, false);
               }
            }
         }

         for (FieldNode var7 : var1.fields) {
            AnnotationNode var8 = Annotations.getInvisible(var7, CORCOCICIRIOHROHROIIOOHICCHCRR.class);
            if (var8 != null) {
               if (var7.visibleAnnotations != null) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var7.visibleAnnotations, true);
               }

               if (var7.invisibleAnnotations != null) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var7.invisibleAnnotations, false);
               }
            }
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(AnnotationNode var1, List<AnnotationNode> var2, boolean var3) {
      String var4 = "smuggled" + (var3 ? "Visible" : "Invisible");
      List var5 = Annotations.getValue(var1, var4);
      if (var5 == null) {
         Annotations.setValue(var1, var4, var5 = new ArrayList());
      }

      if (Annotations.getValue(var1, "smuggle", Boolean.TRUE)) {
         ListIterator var6 = var2.listIterator();

         while (var6.hasNext()) {
            AnnotationNode var7 = (AnnotationNode)var6.next();
            if (!var7.desc.equals(Type.getDescriptor(Shadow.class)) && var7 != var1) {
               var5.add(var7);
               var6.remove();
            }
         }
      }

      if (var3) {
         AnnotationNode var8 = Annotations.getValue(var1, "shadow");
         if (var8 != null) {
            var5.add(var8);
         }
      }
   }
}
