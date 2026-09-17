package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IICRCOCCHCORCRHHHOIHROCHIROIHH;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
final class IIOIROIHIHHCCRICRCOOCHIICHRCOI<L> {
   private static final Logger IOIRCHCHHHHIIOIHORRIHOCHCOORHO = Logger.getLogger(IIOIROIHIHHCCRICRCOOCHIICHRCOI.class.getName());
   private final List<IIOIROIHIHHCCRICRCOOCHIICHRCOI.IRCIIHHICIHRCOCRROCOICRIHHCCHH<L>> OHICOCOCRIHOCRCHIROHIICIHHRIRO = Collections.synchronizedList(
      new ArrayList<>()
   );

   public void addListener(L var1, Executor var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1, "listener"
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2, "executor"
      );
      this.OHICOCOCRIHOCRCHIROHIICIHHRIRO.add(new IIOIROIHIHHCCRICRCOOCHIICHRCOI.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>((L)var1, var2));
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IIOIROIHIHHCCRICRCOOCHIICHRCOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<L> var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IIOIROIHIHHCCRICRCOOCHIICHRCOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<L> var1, String var2) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, (Object)var2);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IIOIROIHIHHCCRICRCOOCHIICHRCOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<L> var1, Object var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1, "event"
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2, "label"
      );
      synchronized (this.OHICOCOCRIHOCRCHIROHIICIHHRIRO) {
         for (IIOIROIHIHHCCRICRCOOCHIICHRCOI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 : this.OHICOCOCRIHOCRCHIROHIICIHHRIRO) {
            var5.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2);
         }
      }
   }

   public void dispatch() {
      for (int var1 = 0; var1 < this.OHICOCOCRIHOCRCHIROHIICIHHRIRO.size(); var1++) {
         this.OHICOCOCRIHOCRCHIROHIICIHHRIRO.get(var1).dispatch();
      }
   }

   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH<L> implements Runnable {
      final L ORCRIIHOCROIOHHCIIICOORCCHOCHO;
      final Executor HRHIHHICHHROIHCRRRHOOHCHHOIOHO;
      @GuardedBy("this")
      final Queue<IIOIROIHIHHCCRICRCOOCHIICHRCOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<L>> RHHOIIORIIOCIHRCICOHCOHIHOHOOC = IICRCOCCHCORCRHHHOIHROCHIROIHH.newArrayDeque();
      @GuardedBy("this")
      final Queue<Object> OICOOOCHRHHOOCIIOCCRRRRCHIROHR = IICRCOCCHCORCRHHHOIHROCHIROIHH.newArrayDeque();
      @GuardedBy("this")
      boolean isThreadScheduled;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(L var1, Executor var2) {
         this.ORCRIIHOCROIOHHCIIICOORCCHOCHO = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            (L)var1
         );
         this.HRHIHHICHHROIHCRRRHOOHCHHOIOHO = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var2
         );
      }

      synchronized void IRCIIHHICIHRCOCRROCOICRIHHCCHH(IIOIROIHIHHCCRICRCOOCHIICHRCOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<L> var1, Object var2) {
         this.RHHOIIORIIOCIHRCICOHCOHIHOHOOC.add(var1);
         this.OICOOOCHRHHOOCIIOCCRRRRCHIROHR.add(var2);
      }

      void dispatch() {
         boolean var1 = false;
         synchronized (this) {
            if (!this.isThreadScheduled) {
               this.isThreadScheduled = true;
               var1 = true;
            }
         }

         if (var1) {
            try {
               this.HRHIHHICHHROIHCRRRHOOHCHHOIOHO.execute(this);
            } catch (RuntimeException var6) {
               synchronized (this) {
                  this.isThreadScheduled = false;
               }

               IIOIROIHIHHCCRICRCOOCHIICHRCOI.IOIRCHCHHHHIIOIHORRIHOCHCOORHO
                  .log(
                     Level.SEVERE,
                     "Exception while running callbacks for " + this.ORCRIIHOCROIOHHCIIICOORCCHOCHO + " on " + this.HRHIHHICHHROIHCRRRHOOHCHHOIOHO,
                     var6
                  );
               throw var6;
            }
         }
      }

      @Override
      public void run() {
         boolean var1 = true;

         try {
            while (true) {
               IIOIROIHIHHCCRICRCOOCHIICHRCOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2;
               Object var3;
               synchronized (this) {
                  com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
                     this.isThreadScheduled
                  );
                  var2 = this.RHHOIIORIIOCIHRCICOHCOHIHOHOOC.poll();
                  var3 = this.OICOOOCHRHHOOCIIOCCRRRRCHIROHR.poll();
                  if (var2 == null) {
                     this.isThreadScheduled = false;
                     var1 = false;
                     return;
                  }
               }

               try {
                  var2.call(this.ORCRIIHOCROIOHHCIIICOORCCHOCHO);
               } catch (RuntimeException var16) {
                  IIOIROIHIHHCCRICRCOOCHIICHRCOI.IOIRCHCHHHHIIOIHORRIHOCHCOORHO
                     .log(Level.SEVERE, "Exception while executing callback: " + this.ORCRIIHOCROIOHHCIIICOORCCHOCHO + " " + var3, var16);
               }
            }
         } finally {
            if (var1) {
               synchronized (this) {
                  this.isThreadScheduled = false;
               }
            }
         }
      }
   }

   interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<L> {
      void call(L var1);
   }
}
