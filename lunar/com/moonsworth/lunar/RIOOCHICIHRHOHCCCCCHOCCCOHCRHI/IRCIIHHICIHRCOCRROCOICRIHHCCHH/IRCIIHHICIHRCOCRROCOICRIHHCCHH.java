package com.moonsworth.lunar.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH;
import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.util.function.Supplier;
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWImage;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final DoubleBuffer ROOHOORIIIORRRORIHRCRHHICRROHR = BufferUtils.createDoubleBuffer(1);
   private long OIHHRCOROHICOHIRHHRIHRORIHCIRC = -1L;

   @Override
   public boolean OIHCOHRCICCCRHRCROOCIOIRRHHHIH(int var1) {
      int var2 = GLFW.glfwGetMouseButton(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHRCROHROHOCCHIHOHRROHOCOIRHIO().bridge$getWindowId(), var1
      );
      return var2 == 1;
   }

   @Override
   public int getX() {
      GLFW.glfwGetCursorPos(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHRCROHROHOCCHIHOHRROHOCOIRHIO().bridge$getWindowId(),
         ROOHOORIIIORRRORIHRCRHHICRROHR,
         null
      );
      return (int)ROOHOORIIIORRRORIHRCRHHICRROHR.get(0);
   }

   @Override
   public int getY() {
      GLFW.glfwGetCursorPos(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHRCROHROHOCCHIHOHRROHOCOIRHIO().bridge$getWindowId(),
         null,
         ROOHOORIIIORRRORIHRCRHHICRROHR
      );
      return (int)ROOHOORIIIORRRORIHRCRHHICRROHR.get(0);
   }

   public Long HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var1, Supplier<BufferedImage> var2, int var3, int var4) {
      return switch (var1) {
         case 0 -> GLFW.glfwCreateStandardCursor(212994);
         case 1 -> GLFW.glfwCreateStandardCursor(221187);
         case 2 -> GLFW.glfwCreateStandardCursor(221186);
         case 3 -> GLFW.glfwCreateStandardCursor(221188);
         case 4 -> GLFW.glfwCreateStandardCursor(221189);
         case 5 -> GLFW.glfwCreateStandardCursor(221190);
         default -> {
            BufferedImage var5 = (BufferedImage)var2.get();
            if (var5 == null) {
               yield null;
            } else {
               ByteBuffer var6 = BufferUtils.createByteBuffer(4 * var5.getWidth() * var5.getHeight());

               for (int var7 = 0; var7 < var5.getWidth(); var7++) {
                  for (int var8 = 0; var8 < var5.getHeight(); var8++) {
                     var6.putInt(var5.getRGB(var7, var5.getHeight() - 1 - var8));
                  }
               }

               var6.flip();
               GLFWImage var9 = GLFWImage.create().width(var5.getWidth()).height(var5.getHeight()).pixels(var6);
               yield GLFW.glfwCreateCursor(var9, var3, var4);
            }
         }
      };
   }

   @Override
   public void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(Object var1) {
      GLFW.glfwSetCursor(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHRCROHROHOCCHIHOHRROHOCOIRHIO().bridge$getWindowId(), (Long)var1
      );
   }

   @Override
   public void ORRIOIICRHIRHICIHHRRIHOICCHHCI() {
      if (this.OIHHRCOROHICOHIRHHRIHRORIHCIRC == -1L) {
         this.OIHHRCOROHICOHIRHHRIHRORIHCIRC = GLFW.glfwCreateStandardCursor(221185);
      }

      GLFW.glfwSetCursor(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHRCROHROHOCCHIHOHRROHOCOIRHIO().bridge$getWindowId(),
         this.OIHHRCOROHICOHIRHHRIHRORIHCIRC
      );
   }
}
