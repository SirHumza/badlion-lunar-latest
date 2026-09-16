package org.tritonus.share;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventObject;
import java.util.List;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;

public class TNotifier extends Thread {
   private static final Logger logger = System.getLogger("org.tritonus.TraceAllExceptions");
   public static TNotifier notifier = new TNotifier();
   private final List<TNotifier.NotifyEntry> m_entries = new ArrayList<>();

   public TNotifier() {
      super("Tritonus Notifier");
   }

   public void addEntry(EventObject var1, Collection<LineListener> var2) {
      synchronized (this.m_entries) {
         this.m_entries.add(new TNotifier.NotifyEntry(var1, var2));
         this.m_entries.notifyAll();
      }
   }

   @Override
   public void run() {
      while (true) {
         TNotifier.NotifyEntry var1;
         synchronized (this.m_entries) {
            while (this.m_entries.isEmpty()) {
               try {
                  this.m_entries.wait();
               } catch (InterruptedException var5) {
                  logger.log(Level.TRACE, var5);
               }
            }

            var1 = this.m_entries.remove(0);
         }

         var1.deliver();
      }
   }

   static {
      notifier.setDaemon(true);
      notifier.start();
   }

   public static class NotifyEntry {
      private EventObject m_event;
      private List<LineListener> m_listeners;

      public NotifyEntry(EventObject var1, Collection<LineListener> var2) {
         this.m_event = var1;
         this.m_listeners = new ArrayList<>(var2);
      }

      public void deliver() {
         for (LineListener var2 : this.m_listeners) {
            var2.update((LineEvent)this.m_event);
         }
      }
   }
}
