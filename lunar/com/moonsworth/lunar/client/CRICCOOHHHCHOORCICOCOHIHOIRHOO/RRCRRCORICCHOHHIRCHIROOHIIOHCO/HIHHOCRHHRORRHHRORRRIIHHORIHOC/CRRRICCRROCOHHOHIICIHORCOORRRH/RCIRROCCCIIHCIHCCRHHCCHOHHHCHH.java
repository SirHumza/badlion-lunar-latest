package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public abstract void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR var1);

   public abstract void IRCIIHHICIHRCOCRROCOICRIHHCCHH(CORCOCICIRIOHROHROIIOOHICCHCRR var1);

   public abstract void IRCIIHHICIHRCOCRROCOICRIHHCCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1);

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      return null;
   }

   public String name() {
      return this.getClass().getSimpleName();
   }

   public String data() {
      return this.HCHRIROHHHCORIOCROOCHRCIOROOCI(this);
   }

   protected String HCHRIROHHHCORIOCROOCHRCIOROOCI(Object var1) {
      StringBuilder var2 = new StringBuilder();
      ArrayList var3 = new ArrayList<>(List.of(var1.getClass().getFields()));

      for (Field var7 : var1.getClass().getDeclaredFields()) {
         if (!var3.contains(var7)) {
            var3.add(var7);
         }
      }

      for (Field var10 : var3) {
         var10.setAccessible(true);

         try {
            if (!var10.getName().toLowerCase().contains("codec")) {
               if (!var2.isEmpty()) {
                  var2.append(", ");
               }

               Object var11 = var10.get(var1);
               if (var11 != null && var11.toString().length() > 50) {
                  var11 = "LARGE_DATA";
               }

               var2.append(var10.getName()).append("=").append(var11);
            }
         } catch (IllegalAccessException var8) {
            var2.append(var10.getName()).append("=ERROR");
         }
      }

      return var2.toString();
   }
}
