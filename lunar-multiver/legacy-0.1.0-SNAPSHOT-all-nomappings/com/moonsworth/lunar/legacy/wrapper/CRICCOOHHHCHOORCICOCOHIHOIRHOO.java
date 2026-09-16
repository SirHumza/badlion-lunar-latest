package com.moonsworth.lunar.legacy.wrapper;

import org.lwjgl.opengl.GL32;
import org.lwjgl.opengl.GLSync;

public class CRICCOOHHHCHOORCICOCOHIHOIRHOO
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public Object IIRHCHHOICHRICOOCRORCCIOOIHOIR(int var1, int var2) {
      return GL32.glFenceSync(var1, var2);
   }

   public void CIOHHCORHRCCRICCCORIHCRHCCCRRR(Object var1) {
      GL32.glDeleteSync((GLSync)var1);
   }

   public int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Object var1, int var2, long var3) {
      return GL32.glClientWaitSync((GLSync)var1, var2, var3);
   }
}
