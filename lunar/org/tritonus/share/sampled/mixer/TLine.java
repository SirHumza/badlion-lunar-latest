package org.tritonus.share.sampled.mixer;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.sound.sampled.Control;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.Line.Info;
import javax.sound.sampled.LineEvent.Type;
import org.tritonus.share.TNotifier;

public abstract class TLine implements Line {
   private static final Logger logger = System.getLogger("org.tritonus.TraceLine");
   private static final Control[] EMPTY_CONTROL_ARRAY = new Control[0];
   private Info m_info;
   private boolean m_bOpen;
   private final List<Control> m_controls;
   private final Set<LineListener> m_lineListeners;
   private TMixer m_mixer;

   protected TLine(TMixer var1, Info var2) {
      this.setLineInfo(var2);
      this.setOpen(false);
      this.m_controls = new ArrayList<>();
      this.m_lineListeners = new HashSet<>();
      this.m_mixer = var1;
   }

   protected TLine(TMixer var1, Info var2, Collection<Control> var3) {
      this(var1, var2);
      this.m_controls.addAll(var3);
   }

   protected TMixer getMixer() {
      return this.m_mixer;
   }

   @Override
   public Info getLineInfo() {
      return this.m_info;
   }

   protected void setLineInfo(Info var1) {
      logger.log(Level.TRACE, "TLine.setLineInfo(): setting: " + var1);
      synchronized (this) {
         this.m_info = var1;
      }
   }

   @Override
   public void open() {
      logger.log(Level.TRACE, "TLine.open(): called");
      if (!this.isOpen()) {
         logger.log(Level.TRACE, "TLine.open(): opening");
         this.openImpl();
         if (this.getMixer() != null) {
            this.getMixer().registerOpenLine(this);
         }

         this.setOpen(true);
      } else {
         logger.log(Level.TRACE, "TLine.open(): already open");
      }
   }

   protected void openImpl() {
      logger.log(Level.TRACE, "TLine.openImpl(): called");
   }

   @Override
   public void close() {
      logger.log(Level.TRACE, "TLine.close(): called");
      if (this.isOpen()) {
         logger.log(Level.TRACE, "TLine.close(): closing");
         if (this.getMixer() != null) {
            this.getMixer().unregisterOpenLine(this);
         }

         this.closeImpl();
         this.setOpen(false);
      } else {
         logger.log(Level.TRACE, "TLine.close(): not open");
      }
   }

   protected void closeImpl() {
      logger.log(Level.TRACE, "TLine.closeImpl(): called");
   }

   @Override
   public boolean isOpen() {
      return this.m_bOpen;
   }

   protected void setOpen(boolean var1) {
      logger.log(Level.TRACE, "TLine.setOpen(): called, value: " + var1);
      boolean var2 = this.isOpen();
      this.m_bOpen = var1;
      if (var2 != this.isOpen()) {
         if (this.isOpen()) {
            logger.log(Level.TRACE, "TLine.setOpen(): opened");
            this.notifyLineEvent(Type.OPEN);
         } else {
            logger.log(Level.TRACE, "TLine.setOpen(): closed");
            this.notifyLineEvent(Type.CLOSE);
         }
      }
   }

   protected void addControl(Control var1) {
      synchronized (this.m_controls) {
         this.m_controls.add(var1);
      }
   }

   protected void removeControl(Control var1) {
      synchronized (this.m_controls) {
         this.m_controls.remove(var1);
      }
   }

   @Override
   public Control[] getControls() {
      synchronized (this.m_controls) {
         return this.m_controls.toArray(EMPTY_CONTROL_ARRAY);
      }
   }

   @Override
   public Control getControl(javax.sound.sampled.Control.Type var1) {
      synchronized (this.m_controls) {
         for (Control var4 : this.m_controls) {
            if (var4.getType().equals(var1)) {
               return var4;
            }
         }

         throw new IllegalArgumentException("no control of type " + var1);
      }
   }

   @Override
   public boolean isControlSupported(javax.sound.sampled.Control.Type var1) {
      try {
         return this.getControl(var1) != null;
      } catch (IllegalArgumentException var3) {
         logger.log(Level.ERROR, var3.getMessage(), var3);
         return false;
      }
   }

   @Override
   public void addLineListener(LineListener var1) {
      synchronized (this.m_lineListeners) {
         this.m_lineListeners.add(var1);
      }
   }

   @Override
   public void removeLineListener(LineListener var1) {
      synchronized (this.m_lineListeners) {
         this.m_lineListeners.remove(var1);
      }
   }

   private Set<LineListener> getLineListeners() {
      synchronized (this.m_lineListeners) {
         return new HashSet<>(this.m_lineListeners);
      }
   }

   protected void notifyLineEvent(Type var1) {
      this.notifyLineEvent(new LineEvent(this, var1, -1L));
   }

   protected void notifyLineEvent(LineEvent var1) {
      TNotifier.notifier.addEntry(var1, this.getLineListeners());
   }
}
