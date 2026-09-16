package org.tritonus.share.midi;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.Transmitter;

public abstract class TMidiDevice implements MidiDevice {
   private static final Logger logger = System.getLogger("org.tritonus.TraceMidiDevice");
   private javax.sound.midi.MidiDevice.Info m_info;
   private boolean m_bDeviceOpen;
   private boolean m_bUseTransmitter;
   private boolean m_bUseReceiver;
   private final List<Receiver> m_receivers;
   private final List<Transmitter> m_transmitters;

   public TMidiDevice(javax.sound.midi.MidiDevice.Info var1) {
      this(var1, true, true);
   }

   public TMidiDevice(javax.sound.midi.MidiDevice.Info var1, boolean var2, boolean var3) {
      this.m_info = var1;
      this.m_bUseTransmitter = var2;
      this.m_bUseReceiver = var3;
      this.m_bDeviceOpen = false;
      this.m_receivers = new ArrayList<>();
      this.m_transmitters = new ArrayList<>();
   }

   @Override
   public javax.sound.midi.MidiDevice.Info getDeviceInfo() {
      return this.m_info;
   }

   @Override
   public synchronized void open() {
      logger.log(Level.TRACE, "TMidiDevice.open(): begin");
      if (!this.isOpen()) {
         this.openImpl();
         this.m_bDeviceOpen = true;
      }

      logger.log(Level.TRACE, "TMidiDevice.open(): end");
   }

   protected void openImpl() {
      logger.log(Level.TRACE, "TMidiDevice.openImpl(): begin");
      logger.log(Level.TRACE, "TMidiDevice.openImpl(): end");
   }

   @Override
   public synchronized void close() {
      logger.log(Level.TRACE, "TMidiDevice.close(): begin");
      if (this.isOpen()) {
         this.closeImpl();
         this.m_bDeviceOpen = false;
      }

      logger.log(Level.TRACE, "TMidiDevice.close(): end");
   }

   protected void closeImpl() {
      logger.log(Level.TRACE, "TMidiDevice.closeImpl(): begin");
      logger.log(Level.TRACE, "TMidiDevice.closeImpl(): end");
   }

   @Override
   public boolean isOpen() {
      return this.m_bDeviceOpen;
   }

   protected boolean getUseTransmitter() {
      return this.m_bUseTransmitter;
   }

   protected boolean getUseReceiver() {
      return this.m_bUseReceiver;
   }

   @Override
   public long getMicrosecondPosition() {
      return -1L;
   }

   @Override
   public int getMaxReceivers() {
      byte var1 = 0;
      if (this.getUseReceiver()) {
         var1 = -1;
      }

      return var1;
   }

   @Override
   public int getMaxTransmitters() {
      byte var1 = 0;
      if (this.getUseTransmitter()) {
         var1 = -1;
      }

      return var1;
   }

   @Override
   public Receiver getReceiver() {
      if (!this.getUseReceiver()) {
         throw new MidiUnavailableException("Receivers are not supported by this device");
      } else {
         return new TMidiDevice.TReceiver();
      }
   }

   @Override
   public Transmitter getTransmitter() {
      if (!this.getUseTransmitter()) {
         throw new MidiUnavailableException("Transmitters are not supported by this device");
      } else {
         return new TMidiDevice.TTransmitter();
      }
   }

   @Override
   public List<Receiver> getReceivers() {
      return Collections.unmodifiableList(this.m_receivers);
   }

   @Override
   public List<Transmitter> getTransmitters() {
      return Collections.unmodifiableList(this.m_transmitters);
   }

   protected void receive(MidiMessage var1, long var2) {
      logger.log(Level.TRACE, "### [should be overridden] TMidiDevice.receive(): message " + var1);
   }

   protected void addReceiver(Receiver var1) {
      synchronized (this.m_receivers) {
         this.m_receivers.add(var1);
      }
   }

   protected void removeReceiver(Receiver var1) {
      synchronized (this.m_receivers) {
         this.m_receivers.remove(var1);
      }
   }

   protected void addTransmitter(Transmitter var1) {
      synchronized (this.m_transmitters) {
         this.m_transmitters.add(var1);
      }
   }

   protected void removeTransmitter(Transmitter var1) {
      synchronized (this.m_transmitters) {
         this.m_transmitters.remove(var1);
      }
   }

   protected void sendImpl(MidiMessage var1, long var2) {
      logger.log(Level.TRACE, "TMidiDevice.sendImpl(): begin");

      for (Transmitter var5 : this.m_transmitters) {
         TMidiDevice.TTransmitter var6 = (TMidiDevice.TTransmitter)var5;
         MidiMessage var7;
         if (var1 instanceof MetaMessage var8) {
            MetaMessage var9 = new MetaMessage();

            try {
               var9.setMessage(var8.getType(), var8.getData(), var8.getData().length);
            } catch (InvalidMidiDataException var11) {
               logger.log(Level.ERROR, var11.getMessage(), var11);
            }

            var7 = var9;
         } else {
            var7 = (MidiMessage)var1.clone();
         }

         if (var1 instanceof MetaMessage) {
            logger.log(Level.TRACE, "TMidiDevice.sendImpl(): MetaMessage.getData().length (original): " + ((MetaMessage)var1).getData().length);
            logger.log(Level.TRACE, "TMidiDevice.sendImpl(): MetaMessage.getData().length (cloned): " + ((MetaMessage)var7).getData().length);
         }

         var6.send(var7, var2);
      }

      logger.log(Level.TRACE, "TMidiDevice.sendImpl(): end");
   }

   public static class Info extends javax.sound.midi.MidiDevice.Info {
      public Info(String var1, String var2, String var3, String var4) {
         super(var1, var2, var3, var4);
      }
   }

   public class TReceiver implements Receiver {
      private boolean m_bOpen;

      public TReceiver() {
         TMidiDevice.this.addReceiver(this);
         this.m_bOpen = true;
      }

      protected boolean isOpen() {
         return this.m_bOpen;
      }

      @Override
      public void send(MidiMessage var1, long var2) {
         TMidiDevice.logger.log(Level.TRACE, "TMidiDevice.TReceiver.send(): message " + var1);
         if (this.m_bOpen) {
            TMidiDevice.this.receive(var1, var2);
         } else {
            throw new IllegalStateException("receiver is not open");
         }
      }

      @Override
      public void close() {
         TMidiDevice.this.removeReceiver(this);
         this.m_bOpen = false;
      }
   }

   public class TTransmitter implements Transmitter {
      private boolean m_bOpen = true;
      private Receiver m_receiver;

      public TTransmitter() {
         TMidiDevice.this.addTransmitter(this);
      }

      @Override
      public void setReceiver(Receiver var1) {
         synchronized (this) {
            this.m_receiver = var1;
         }
      }

      @Override
      public Receiver getReceiver() {
         return this.m_receiver;
      }

      public void send(MidiMessage var1, long var2) {
         if (this.getReceiver() != null && this.m_bOpen) {
            this.getReceiver().send(var1, var2);
         }
      }

      @Override
      public void close() {
         TMidiDevice.this.removeTransmitter(this);
         this.m_bOpen = false;
      }
   }
}
