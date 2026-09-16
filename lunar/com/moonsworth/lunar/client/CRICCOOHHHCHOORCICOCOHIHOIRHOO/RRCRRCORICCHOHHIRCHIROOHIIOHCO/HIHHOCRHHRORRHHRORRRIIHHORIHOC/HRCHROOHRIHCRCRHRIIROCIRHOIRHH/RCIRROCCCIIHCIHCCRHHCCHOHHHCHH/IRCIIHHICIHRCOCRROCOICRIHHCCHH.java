package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.io.EOFException;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.Generated;
import org.lwjgl.actually3.BufferUtils;
import org.lwjgl.openal.AL10;

public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH<T extends InputStream> {
   private static final int OHCIIIOIRICIRRIORIOIOIOOOHCOOC = 4;
   private int CHROCHHCRRIOOCRHCICRIRCCRIROOO;
   private final int[] IHORCHCOCOIRHICRIHOORRCCCRRRCO = new int[4];
   protected final String ICCOOHHCCHCHHOHOIRCHCOHRIOCCRO;
   protected final String IORCRHHOIOHORRCOHORCCICOICICRI;
   protected final File IOCRIIROIORICRHHIICCIHIOIRIOOO;
   protected T RORHICOHHCHIHHHHCRIROIRHCRHRRC;
   protected com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OCIIOOCHCRHICHOHRIHHRHOIHROCOR;
   protected int frequency;
   protected int frameSize;
   private long time = 0L;
   private long ROHCCOIHHICOOHHOHOCRIRIHIHOCHC = 0L;
   private double IHIHRRRCCROIRRCCCIIHIHIOIRIOHC = 1.0;
   private boolean paused = false;
   protected ByteBuffer CIOHOCIHRRHOHOIRIHCCRCHIICIHOR;
   protected ShortBuffer IOICRIORHCHCIOHRHRROORHCCRIOOR;
   protected ShortBuffer OIHCRRRHIRROIIOORHCCOHOCROIICC;
   private List<Float> HHOICCCRHIIOIHIHHHRIROIHOROIHI;
   protected final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HIHHCRRHHORCOHOCIRCRHHICCCIIHO;
   private String hash;
   protected String key;
   private boolean IIHHHCIIIIIHIHORIIOHHHCHOROCRI = false;
   private boolean eof = false;
   private float volume = 1.0F;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      File var1,
      String var2,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
   ) {
      this.IOCRIIROIORICRHHIICCIHIOIRIOOO = var1;
      this.ICCOOHHCCHCHHOHOIRCHCOHRIOCCRO = var2;
      this.IORCRHHOIOHORRCOHORCCICOICICRI = var2.split("://")[1];
      this.HIHHCRRHHORCOHOCIRCRHHICCCIIHO = var3;
   }

   public boolean isValid() {
      return true;
   }

   protected void init() {
      if (this.isValid()) {
         try {
            this.RORHICOHHCHIHHHHCRIROIRHCRHRRC = this.OCCOHOOIIROIRCCORHHCHHCICOCCRH();
         } catch (RuntimeException var2) {
            return;
         }

         this.OCIIOOCHCRHICHOHRIHHRHOIHROCOR = this.CIOOCOCIIOCROCHOIRIOIHOIHOIHRC();
         this.frequency = this.IIHOICCRCIRHOOCCIRRORCCIROIIRO();
         this.frameSize = this.OHCOICRCICRHIICOIROOHCCOCCRCHO();
         this.hash = this.OHRHRHCRHCRIIIHOHOCIORHCIIIICO();
         this.CHRHCRCCIICRORCOHCORHRROIHRCHO(false);
         int var1 = this.frameSize * this.OCIIOOCHCRHICHOHRIHHRHOIHROCOR.getChannels() * this.OCIIOOCHCRHICHOHRIHHRHOIHROCOR.getBytesPerSample();
         this.CIOHOCIHRRHOHOIRIHCCRCHIICIHOR = BufferUtils.createByteBuffer(var1);
         this.IOICRIORHCHCIOHRHRROORHCCRIOOR = BufferUtils.createShortBuffer(var1);
         this.OIHCRRRHIRROIIOORHCCOHOCROIICC = BufferUtils.createShortBuffer(var1);
      }
   }

   protected void RCHCORHROIIHHOCROIRHICHCOHICIR() {
      if (this.isValid()) {
         this.HHOICCCRHIIOIHIHHHRIROIHOROIHI = this.HIHHCRRHHORCOHOCIRCRHHICCCIIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.hash, this);
      }
   }

   public List<Float> RIHOORCROICHOCRCICIRIRRRCCRRCO() {
      try (InputStream var1 = this.OCCOHOOIIROIRCCORHHCHHCICOCCRH()) {
         ArrayList var2 = new ArrayList();
         float var3 = (float)Math.pow(2.0, this.OCIIOOCHCRHICHOHRIHHRHOIHROCOR.getBytesPerSample() * 8 - 1);

         while (true) {
            try {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((T)var1, this.CIOHOCIHRRHOHOIRIHCCRCHIICIHOR, this.IOICRIORHCHCIOHRHRROORHCCRIOOR);
            } catch (EOFException var10) {
               break;
            }

            long var4 = 0L;
            long var6 = this.IOICRIORHCHCIOHRHRROORHCCRIOOR.remaining();
            if (var6 <= 0L) {
               break;
            }

            for (int var8 = 0; var8 < var6; var8++) {
               var4 += Math.abs(this.IOICRIORHCHCIOHRHRROORHCCRIOOR.get());
            }

            float var13 = (float)var4 / (float)var6;
            var2.add(var13 / var3);
         }

         return var2;
      }
   }

   static void OHIRHOCHICCIIHIRCCCOOOHORRRHOO() {
      int var0 = AL10.alGetError();
      if (var0 != 0) {
         throw new RuntimeException(AL10.alGetString(var0));
      }
   }

   protected void createSource() {
      this.CHROCHHCRRIOOCRHCICRIRCCRIROOO = AL10.alGenSources();
      OHIRHOCHICCIIHIRCCCOOOHORRRHOO();

      for (int var1 = 0; var1 < 4; var1++) {
         this.IHORCHCOCOIRHICRIHOORRCCCRRRCO[var1] = AL10.alGenBuffers();
         OHIRHOCHICCIIHIRCCCOOOHORRRHOO();
      }
   }

   protected abstract T OCCOHOOIIROIRCCORHHCHHCICOCCRH();

   protected abstract com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CIOOCOCIIOCROCHOIRIOIHOIHOIHRC();

   protected abstract int IIHOICCRCIRHOOCCIRRORCCIROIIRO();

   protected abstract int OHCOICRCICRHIICOIROOHCCOCCRCHO();

   protected abstract String OHRHRHCRHCRIIIHOHOCIORHCIIIICO();

   public abstract long CHCRRCICCCHRHCCHICOCIIIHRORHIC();

   public abstract String getName();

   public float RORHHHHIOOCHIRCHOOIOOOCIHCICIH() {
      return (float)this.frequency / this.frameSize;
   }

   public void CHHIICHRIIROIOHIHIIROICOCCROCI(float var1) {
      this.volume = var1;
      if (this.CHROCHHCRRIOOCRHCICRIRCCRIROOO != 0) {
         AL10.alSourcef(this.CHROCHHCRRIOOCRHCICRIRCCRIROOO, 4106, Math.min(1.0F, var1));
      }
   }

   public void OIHCOHRCICCCRHRCROOCIOIRRHHHIH(double var1) {
      if (this.CHROCHHCRRIOOCRHCICRIRCCRIROOO != 0 && this.IHIHRRRCCROIRRCCCIIHIHIOIRIOHC != var1) {
         this.IHIHRRRCCROIRRCCCIIHIHIOIRIOHC = var1;
         AL10.alSourcef(this.CHROCHHCRRIOOCRHCICRIRCCRIROOO, 4099, (float)var1);
      }
   }

   public void play() {
      if (this.isValid()) {
         if (this.CIOHOCIHRRHOHOIRIHCCRCHIICIHOR == null) {
            this.init();
         }

         if (this.CHROCHHCRRIOOCRHCICRIRCCRIROOO == 0) {
            this.createSource();
         }

         if (this.RORHICOHHCHIHHHHCRIROIRHCRHRRC != null) {
            this.RORHICOHHCHIHHHHCRIROIRHCRHRRC.close();
         }

         try {
            this.RORHICOHHCHIHHHHCRIROIRHCRHRRC = this.OCCOHOOIIROIRCCORHHCHHCICOCCRH();
         } catch (RuntimeException var2) {
            var2.printStackTrace();
            return;
         }

         this.CHRHCRCCIICRORCOHCORHRROIHRCHO(false);
         this.time = 0L;
         this.ROHCCOIHHICOOHHOHOCRIRIHIHOCHC = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getRealSystemTime();
         this.IHIHRRRCCROIRRCCCIIHIHIOIRIOHC = 1.0;
         AL10.alSourcei(this.CHROCHHCRRIOOCRHCICRIRCCRIROOO, 514, 1);
         AL10.alDistanceModel(0);
         AL10.alListener3f(4100, 0.0F, 0.0F, 0.0F);
         AL10.alSourcef(this.CHROCHHCRRIOOCRHCICRIRCCRIROOO, 4110, 1.0F);
         AL10.alSourcef(this.CHROCHHCRRIOOCRHCICRIRCCRIROOO, 4106, 0.0F);
         this.paused = true;
      }
   }

   public void stop() {
      if (this.RORHICOHHCHIHHHHCRIROIRHCRHRRC != null) {
         AL10.alSourceStop(this.CHROCHHCRRIOOCRHCICRIRCCRIROOO);
         int var1 = AL10.alGetSourcei(this.CHROCHHCRRIOOCRHCICRIRCCRIROOO, 4118);

         for (int var2 = 0; var2 < var1; var2++) {
            AL10.alSourceUnqueueBuffers(this.CHROCHHCRRIOOCRHCICRIRCCRIROOO);
         }

         this.RORHICOHHCHIHHHHCRIROIRHCRHRRC.close();
         this.RORHICOHHCHIHHHHCRIROIRHCRHRRC = null;
         this.CHRHCRCCIICRORCOHCORHRROIHRCHO(true);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2,
      boolean var3
   ) {
      if (this.CHROCHHCRRIOOCRHCICRIRCCRIROOO != 0 && this.RORHICOHHCHIHHHHCRIROIRHCRHRRC != null) {
         if (var3) {
            this.paused = false;
            if (!var2.RHCHIOHOIHHCIROCRCIRIOCRRHROII().OORHHRCIRHCIROCCCRORICIRHHOIOC()) {
               return;
            }
         } else {
            boolean var4 = var2.CHRHOHORRICRRHRCRCICOORCHHCIOH()
               || var1.OCCOIHHIIICROCOOOOIIHHRCHCOCIC()
               || com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HOCRCHOHOICOCOIORIIRRHHOHRHOCR();
            if (this.paused != var4) {
               this.paused = var4;
               if (this.paused) {
                  AL10.alSourcePause(this.CHROCHHCRRIOOCRHCICRIRCCRIROOO);
               } else {
                  AL10.alSourcePlay(this.CHROCHHCRRIOOCRHCICRIRCCRIROOO);
               }
            }
         }

         int var11 = AL10.alGetSourcei(this.CHROCHHCRRIOOCRHCICRIRCCRIROOO, 4112);
         if (var11 != 4114 && !this.paused && !this.eof) {
            AL10.alSourcePlay(this.CHROCHHCRRIOOCRHCICRIRCCRIROOO);
         } else if (this.eof && var11 == 4114) {
            AL10.alSourceStop(this.CHROCHHCRRIOOCRHCICRIRCCRIROOO);
         }

         this.RHIHRRICIHORIHHIHHOIIOHHRCIIIH(true);
         if (!var3) {
            long var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getRealSystemTime();
            if (this.paused) {
               this.ROHCCOIHHICOOHHOHOCRIRIHIHOCHC = var5;
               return;
            }

            this.OOCCRCRCOHIIORCCORCRCIRRROIOOR((long)((var5 - this.ROHCCOIHHICOOHHOHOCRIRIHIHOCHC) * this.IHIHRRRCCROIRRCCCIIHIHIOIRIOHC));
         }

         int var12 = AL10.alGetSourcei(this.CHROCHHCRRIOOCRHCICRIRCCRIROOO, 4118);

         for (int var6 = 0; var6 < var12; var6++) {
            this.CHRHCRCCIICRORCOHCORHRROIHRCHO(AL10.alSourceUnqueueBuffers(this.CHROCHHCRRIOOCRHCICRIRCCRIROOO));
         }

         int var13 = AL10.alGetSourcei(this.CHROCHHCRRIOOCRHCICRIRCCRIROOO, 4117);
         if (var13 == 0) {
            for (int var10 : this.IHORCHCOCOIRHICRIHOORRCCCRRRCO) {
               this.CHRHCRCCIICRORCOHCORHRROIHRCHO(var10);
            }
         }
      }
   }

   public void OOCCRCRCOHIIORCCORCRCIRRROIOOR(long var1) {
      this.time += var1;
      this.ROHCCOIHHICOOHHOHOCRIRIHIHOCHC = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getRealSystemTime();
   }

   public void skip(long var1) {
      if (!this.eof && this.RORHICOHHCHIHHHHCRIROIRHCRHRRC != null) {
         this.time += var1;
         long var3 = var1 * this.frequency / 1000L;
         long var5 = 0L;

         while (var5 <= var3 - this.frameSize && !this.eof) {
            var5 += this.frameSize;

            try {
               this.CRRRICCRROCOHHOHIICIHORCOORRRH(this.RORHICOHHCHIHHHHCRIROIRHCRHRRC);
            } catch (EOFException var8) {
               this.CHRHCRCCIICRORCOHCORHRROIHRCHO(true);
               return;
            }
         }
      }
   }

   protected abstract void CRRRICCRROCOHHOHIICIHORCOORRRH(T var1);

   private void CHRHCRCCIICRORCOHCORHRROIHRCHO(int var1) {
      if (!this.eof) {
         try {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.RORHICOHHCHIHHHHCRIROIRHCRHRRC, this.CIOHOCIHRRHOHOIRIHCCRCHIICIHOR, this.IOICRIORHCHCIOHRHRROORHCCRIOOR);
         } catch (EOFException var5) {
            this.CHRHCRCCIICRORCOHCORHRROIHRCHO(true);
            return;
         }

         ShortBuffer var2 = this.IOICRIORHCHCIOHRHRROORHCCRIOOR;
         if (this.volume > 1.0F) {
            while (var2.remaining() >= 1) {
               short var3 = var2.get();
               int var4 = (int)(var3 * this.volume);
               if (var4 > 32767) {
                  var4 = 32767;
               } else if (var4 < -32768) {
                  var4 = -32768;
               }

               this.OIHCRRRHIRROIIOORHCCOHOCROIICC.put((short)var4);
            }

            var2.flip();
            this.OIHCRRRHIRROIIOORHCCOHOCROIICC.flip();
            var2 = this.OIHCRRRHIRROIIOORHCCOHOCROIICC;
         }

         AL10.alBufferData(var1, this.OCIIOOCHCRHICHOHRIHHRHOIHROCOR.getAlFormat(), var2, this.frequency);
         OHIRHOCHICCIIHIRCCCOOOHORRRHOO();
         AL10.alSourceQueueBuffers(this.CHROCHHCRRIOOCRHCICRIRCCRIROOO, var1);
         OHIRHOCHICCIIHIRCCCOOOHORRRHOO();
      }
   }

   protected abstract void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(T var1, ByteBuffer var2, ShortBuffer var3);

   public void cleanup() {
      if (this.RORHICOHHCHIHHHHCRIROIRHCRHRRC != null) {
         this.stop();
         AL10.alDeleteSources(this.CHROCHHCRRIOOCRHCICRIRCCRIROOO);

         for (int var4 : this.IHORCHCOCOIRHICRIHOORRCCCRRRCO) {
            AL10.alDeleteBuffers(var4);
         }

         this.CHROCHHCRRIOOCRHCICRIRCCRIROOO = 0;
      }
   }

   public abstract IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> OCHRHCIIOCRRCHHIIROHCIOROOCHRC();

   public void reload() {
      this.CHROCHHCRRIOOCRHCICRIRCCRIROOO = 0;
      this.play();
   }

   @Generated
   public long getTime() {
      return this.time;
   }

   @Generated
   public double IHHIRIIRHRHCIICIHOOOCICRIHOHCO() {
      return this.IHIHRRRCCROIRRCCCIIHIHIOIRIOHC;
   }

   @Generated
   public List<Float> HCRHRHHRRIRRCRCIHOIIRIROIHHCHO() {
      return this.HHOICCCRHIIOIHIHHHRIROIHOROIHI;
   }

   @Generated
   public String getHash() {
      return this.hash;
   }

   @Generated
   public String getKey() {
      return this.key;
   }

   @Generated
   public void HIRHCRIHHRCCIICCRHRHRCRRRCRIOC(String var1) {
      this.key = var1;
   }

   @Generated
   public void RHIHRRICIHORIHHIHHOIIOHHRCIIIH(boolean var1) {
      this.IIHHHCIIIIIHIHORIIOHHHCHOROCRI = var1;
   }

   @Generated
   public boolean HICRCOROIHRRCCIRIRRCRCRORCRHOR() {
      return this.IIHHHCIIIIIHIHORIIOHHHCHOROCRI;
   }

   @Generated
   public void CHRHCRCCIICRORCOHCORHRROIHRCHO(boolean var1) {
      this.eof = var1;
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends TypeAdapter<IRCIIHHICIHRCOCRROCOICRIHHCCHH<?>> {
      private final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RIIRRHICCRIOOIIRHOOHOOIIRRIOCO;

      public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, IRCIIHHICIHRCOCRROCOICRIHHCCHH<?> var2) {
         var1.value(var2.ICCOOHHCCHCHHOHOIRCHCOHRIOCCRO);
      }

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH<?> RHOORRIIOCHIRRHOHOOHIROHCRICRO(JsonReader var1) {
         String var2 = var1.nextString();
         String var3 = var2.split("://")[0];
         return var3.equals("media")
            ? new HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               this.RIIRRHICCRIOOIIRHOOHOOIIRRIOCO.IIOCOIROCRRRHICCRIICCRICCHHIRR(),
               var2,
               this.RIIRRHICCRIOOIIRHOOHOOIIRRIOCO.HHHCCHCCOHROOHHIRHHCRRHCHCCRHR(),
               this.RIIRRHICCRIOOIIRHOOHOOIIRRIOCO.OHORIIHICICROHHOCRCHOCOCROIIHR().HRCHIOCHOCOHHHHHIRHIHICOIIOROC(),
               this.RIIRRHICCRIOOIIRHOOHOOIIRRIOCO.RCIIHIRCRCOCIICOHICIOIOHHCHIOI()
            )
            : new CRRRICCRROCOHHOHIICIHORCOORRRH(
               this.RIIRRHICCRIOOIIRHOOHOOIIRRIOCO.IIOCOIROCRRRHICCRIICCRICCHHIRR(),
               var2,
               this.RIIRRHICCRIOOIIRHOOHOOIIRRIOCO.HHHCCHCCOHROOHHIRHHCRRHCHCCRHR(),
               this.RIIRRHICCRIOOIIRHOOHOOIIRRIOCO.RICRIRRCOHRCOCRRHHCRHRROOIOHHR(UUID.fromString(var3))
            );
      }

      @Generated
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
      ) {
         this.RIIRRHICCRIOOIIRHOOHOOIIRRIOCO = var1;
      }
   }
}
