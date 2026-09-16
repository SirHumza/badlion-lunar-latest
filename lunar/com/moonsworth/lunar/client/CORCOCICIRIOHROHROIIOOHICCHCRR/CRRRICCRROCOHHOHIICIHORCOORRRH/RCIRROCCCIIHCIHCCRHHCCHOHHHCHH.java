package com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.lang.reflect.Constructor;
import javax.annotation.Nullable;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static final String CRHHORHRRIHCIOCCRHOOCRHRCCCOCI = "com.terraformersmc.modmenu.gui.ModsScreen";
   @Nullable
   public static Class<?> OIRHHRHOOHICCRCIIRIIOIOIOOCHIC;
   @Nullable
   public static Constructor<?> ORCOIOCCICHHCCRIHOHIOOIIHCCCCR;

   public static boolean IHICHIIOCRICOOROCOHIOORRIIRIII() {
      if (ORCOIOCCICHHCCRIHOHIOOIIHCCCCR == null) {
         return false;
      }

      try {
         Object var0 = ORCOIOCCICHHCCRIHOHIOOIIHCCCCR.newInstance(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentScreen());
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$displayScreen((ORHIOICIOCRRHOOCOHRORIHICHRCRR)var0);
         return true;
      } catch (Throwable var1) {
         var1.printStackTrace();
         return false;
      }
   }

   public static boolean RHHHORCOOHOCRHIHRRCOOCCHICOCHH() {
      return OIRHHRHOOHICCRCIIRIIOIOIOOCHIC != null;
   }

   static {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 6) {
         try {
            Class var0;
            try {
               var0 = Class.forName("net.minecraft.client.gui.screens.Screen");
            } catch (Throwable var2) {
               var0 = Class.forName("net.minecraft.class_437");
            }

            OIRHHRHOOHICCRCIIRIIOIOIOOCHIC = Class.forName("com.terraformersmc.modmenu.gui.ModsScreen");
            ORCOIOCCICHHCCRIHOHIOOIIHCCCCR = OIRHHRHOOHICCRCIIRIIOIOIOOCHIC.getConstructor(var0);
         } catch (Throwable var3) {
         }
      }
   }
}
