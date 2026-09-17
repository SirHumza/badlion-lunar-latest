package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import lombok.Generated;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private final Stack<HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RIIOOOOICRIORRHRIOORCCCCCCRCHC = new Stack<>();
   private final Stack<HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HOIOCHRCHCOOHIOIOHOHOCOROHOOOH = new Stack<>();
   private List<HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> ROCCHICCHIHHOCCIRHRHCHRRRORIRC = null;
   private boolean running = false;

   public void OIRICCRROORRCCICIIOIHHRICOHCIR() {
      if (!this.running) {
         this.ROCCHICCHIHHOCCIRHRHCHRRRORIRC = new ArrayList<>();
      }
   }

   public void endBatch() {
      if (!this.running) {
         if (this.ROCCHICCHIHHOCCIRHRHCHRRRORIRC != null) {
            if (!this.ROCCHICCHIHHOCCIRHRHCHRRRORIRC.isEmpty()) {
               this.RIIOOOOICRIORRHRIOORCCCCCCRCHC.push(new HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.ROCCHICCHIHHOCCIRHRHCHRRRORIRC));
               this.HOIOCHRCHCOOHIOIOHOHOCOROHOOOH.clear();
            }

            this.ROCCHICCHIHHOCCIRHRHCHRRRORIRC = null;
         }
      }
   }

   public void CRRROCIIOHROOOIOCHROCCRHCCOCOC() {
      if (!this.running && this.HRCIOHCRICORROOIIHIHOIIICIOOCO()) {
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            this.ROCCHICCHIHHOCCIRHRHCHRRRORIRC
         );
         this.ROCCHICCHIHHOCCIRHRHCHRRRORIRC = null;
         this.running = true;

         try {
            var1.IIICOHORORRCROHCHOROOCCCIRIRRC.run();
         } finally {
            this.running = false;
         }
      }
   }

   public boolean HRCIOHCRICORROOIIHIHOIIICIOOCO() {
      return this.ROCCHICCHIHHOCCIRHRHCHRRRORIRC != null;
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(Runnable var1, Runnable var2) {
      if (!this.running) {
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
         if (this.HRCIOHCRICORROOIIHIHOIIICIOOCO()) {
            this.ROCCHICCHIHHOCCIRHRHCHRRRORIRC.add(var3);
         } else {
            this.RIIOOOOICRIORRHRIOORCCCCCCRCHC.push(var3);
            this.HOIOCHRCHCOOHIOIOHOHOCOROHOOOH.clear();
         }

         if (this.RIIOOOOICRIORRHRIOORCCCCCCRCHC.size() > 50) {
            this.RIIOOOOICRIORRHRIOORCCCCCCRCHC.remove(0);
         }
      }
   }

   public void undo() {
      if (!this.RIIOOOOICRIORRHRIOORCCCCCCRCHC.isEmpty()) {
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = this.RIIOOOOICRIORRHRIOORCCCCCCRCHC.pop();
         this.running = true;
         var1.IIICOHORORRCROHCHOROOCCCIRIRRC.run();
         this.running = false;
         this.HOIOCHRCHCOOHIOIOHOHOCOROHOOOH.push(var1);
      }
   }

   public void redo() {
      if (!this.HOIOCHRCHCOOHIOIOHOHOCOROHOOOH.isEmpty()) {
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = this.HOIOCHRCHCOOHIOIOHOHOCOROHOOOH.pop();
         this.running = true;
         var1.CHIHHROCIHRROCOIOROOOOROIHCIOR.run();
         this.running = false;
         this.RIIOOOOICRIORRHRIOORCCCCCCRCHC.push(var1);
      }
   }

   public void clear() {
      this.RIIOOOOICRIORRHRIOORCCCCCCRCHC.clear();
      this.HOIOCHRCHCOOHIOIOHOHOCOROHOOOH.clear();
   }

   public boolean canUndo() {
      return !this.RIIOOOOICRIORRHRIOORCCCCCCRCHC.isEmpty();
   }

   public boolean canRedo() {
      return !this.HOIOCHRCHCOOHIOIOHOHOCOROHOOOH.isEmpty();
   }

   @Generated
   public void setRunning(boolean var1) {
      this.running = var1;
   }

   public static class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(List<HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1) {
         super(() -> {
            for (int var1x = var1.size() - 1; var1x >= 0; var1x--) {
               ((HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1.get(var1x)).IIICOHORORRCROHCHOROOCCCIRIRRC.run();
            }
         }, () -> {
            for (HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 : var1) {
               var2.CHIHHROCIHRROCOIOROOOOROIHCIOR.run();
            }
         });
      }
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final Runnable IIICOHORORRCROHCHOROOCCCIRIRRC;
      private final Runnable CHIHHROCIHRROCOIOROOOOROIHCIOR;

      @Generated
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Runnable var1, Runnable var2) {
         this.IIICOHORORRCROHCHOROOCCCIRIRRC = var1;
         this.CHIHHROCIHRROCOIOROOOOROIHCIOR = var2;
      }
   }
}
