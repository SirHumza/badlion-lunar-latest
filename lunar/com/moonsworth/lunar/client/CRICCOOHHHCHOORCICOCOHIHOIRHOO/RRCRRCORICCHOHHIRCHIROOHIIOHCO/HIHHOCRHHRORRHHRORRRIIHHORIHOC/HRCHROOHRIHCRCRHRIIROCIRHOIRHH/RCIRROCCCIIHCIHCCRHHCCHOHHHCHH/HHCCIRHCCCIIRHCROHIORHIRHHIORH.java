package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.common.hash.Hashing;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioFormat.Encoding;
import lombok.Generated;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends IRCIIHHICIHRCOCRROCOICRIHHCCHH<AudioInputStream> {
   private final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH ICOCOHRRCCOIHOIHICIROHHOIIORHH;
   private final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH CCHOOOIRHRRCCRRCCCIORIIOOCCHOI;
   private AudioFormat HCRROORIHHHRORRORHIIHHRRRRHRCO;
   private byte[] data;
   private final File COCCCORHHRIICIROCCCOHCRCIICROO;
   private boolean supported = true;
   private long duration;
   private long position = 0L;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      File var1,
      String var2,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5
   ) {
      super(var1, var2, var3);
      this.ICOCOHRRCCOIHOIHICIROHHOIIORHH = var4;
      this.CCHOOOIRHRRCCRRCCCIORIIOOCCHOI = var5;
      File var6 = var4.RCCCROCHCICCROHCOCCRRROCIIHCCH(UUID.fromString(this.IORCRHHOIOHORRCOHORCCICOICICRI));
      if (var5.CIHRIRCOIROOCHCCRHOIHHIICRIRRC().contains(var6.getName())) {
         this.COCCCORHHRIICIROCCCOHCRCIICROO = new File(var5.IICHCHRCOCCCICCIIHIHRROOOOOIRH(), var6.getName());
      } else {
         this.COCCCORHHRIICIROCCCOHCRCIICROO = var6;
      }

      this.init();
      this.RCHCORHROIIHHOCROIRHICHCOHICIR();
   }

   @Override
   public void HIRHCRIHHRCCIICCRHRHRCRRRCRIOC(String var1) {
      boolean var2 = !Objects.equals(this.key, var1);
      super.HIRHCRIHHRCCIICCRHRHRCRRRCRIOC(var1);
      if (var2) {
         try {
            this.RCHCORHROIIHHOCROIRHICHCOHICIR();
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HCOCRCHORROORHOHHRHOCCOHORHIIR();
            this.play();
         } catch (IOException var4) {
            throw new RuntimeException(var4);
         }
      }
   }

   @Override
   public String getName() {
      return this.COCCCORHHRIICIROCCCOHCRCIICROO.getName();
   }

   @Override
   public boolean isValid() {
      return this.supported && this.COCCCORHHRIICIROCCCOHCRCIICROO != null && this.COCCCORHHRIICIROCCCOHCRCIICROO.isFile();
   }

   @Override
   protected void createSource() {
      super.createSource();
   }

   private void IIOIROIHIHHCCRICRCOOCHIICHRCOI(Supplier<AudioInputStream> var1) {
      File var2 = new File(this.IOCRIIROIORICRHHIICCIHIOIRIOOO, "audio_cache");
      var2.mkdirs();
      File var3 = new File(var2, this.getHash() + ".json");
      if (var3.isFile()) {
         try (FileReader var17 = new FileReader(var3)) {
            JsonObject var19 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.fromJson(var17, JsonObject.class);
            this.duration = var19.get("duration").getAsLong();
         }
      } else {
         try (AudioInputStream var4 = (AudioInputStream)var1.get()) {
            float var5 = this.HCRROORIHHHRORRORHIIHHRRRRHRCO.getFrameRate() / 1000.0F;
            long var6 = 0L;
            if (var4.getFrameLength() != -1L) {
               this.duration = (long)((double)var4.getFrameLength() / var5);
            } else {
               byte[] var8 = new byte[4096];

               int var9;
               while ((var9 = var4.read(var8)) != -1) {
                  var6 += var9;
               }

               this.duration = (long)(
                  (double)var6 / this.OCIIOOCHCRHICHOHRIHHRHOIHROCOR.getChannels() / this.OCIIOOCHCRHICHOHRIHHRHOIHROCOR.getBytesPerSample() / var5
               );
            }
         }

         JsonObject var16 = new JsonObject();
         var16.addProperty("duration", this.duration);

         try (FileWriter var18 = new FileWriter(var3)) {
            IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.toJson(var16, var18);
         }
      }
   }

   @Override
   protected void init() {
      super.init();
      if (this.isValid()) {
         this.data = new byte[this.frameSize
            * this.HCRROORIHHHRORRORHIIHHRRRRHRCO.getChannels()
            * (this.HCRROORIHHHRORRORHIIHHRRRRHRCO.getSampleSizeInBits() / 8)];
         this.IIOIROIHIHHCCRICRCOOCHIICHRCOI(this::OCIHIRIHHCOHRRHCRHCCRIHOOHIOHH);
      }
   }

   protected AudioInputStream OCIHIRIHHCOHRRHCRHCCRIHOOHIOHH() {
      try {
         AudioInputStream var1 = AudioSystem.getAudioInputStream(this.COCCCORHHRIICIROCCCOHCRCIICROO);
         this.HCRROORIHHHRORRORHIIHHRRRRHRCO = var1.getFormat();
         if (this.HCRROORIHHHRORRORHIIHHRRRRHRCO.getEncoding() != Encoding.PCM_SIGNED
            || this.HCRROORIHHHRORRORHIIHHRRRRHRCO.isBigEndian()
            || this.HCRROORIHHHRORRORHIIHHRRRRHRCO.getSampleSizeInBits() > 16) {
            int var2 = this.HCRROORIHHHRORRORHIIHHRRRRHRCO.getChannels() == -1 ? 2 : this.HCRROORIHHHRORRORHIIHHRRRRHRCO.getChannels();
            this.HCRROORIHHHRORRORHIIHHRRRRHRCO = new AudioFormat(
               Encoding.PCM_SIGNED,
               this.HCRROORIHHHRORRORHIIHHRRRRHRCO.getSampleRate(),
               16,
               var2,
               var2 * 2,
               this.HCRROORIHHHRORRORHIIHHRRRRHRCO.getSampleRate(),
               false
            );
            var1 = AudioSystem.getAudioInputStream(this.HCRROORIHHHRORRORHIIHHRRRRHRCO, var1);
         }

         this.position = 0L;
         return var1;
      } catch (Exception var3) {
         this.supported = false;
         throw new RuntimeException(var3);
      }
   }

   @Override
   protected com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CIOOCOCIIOCROCHOIRIOIHOIHOIHRC() {
      return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.getFormat(
         this.HCRROORIHHHRORRORHIIHHRRRRHRCO.getChannels(), this.HCRROORIHHHRORRORHIIHHRRRRHRCO.getSampleSizeInBits() / 8
      );
   }

   @Override
   protected int IIHOICCRCIRHOOCCIRRORCCIROIIRO() {
      return (int)this.HCRROORIHHHRORRORHIIHHRRRRHRCO.getSampleRate();
   }

   @Override
   protected int OHCOICRCICRHIICOIROOHCCOCCRCHO() {
      return 1024;
   }

   @Override
   protected String OHRHRHCRHCRIIIHOHOCIORHCIIIICO() {
      byte[] var1 = this.IORCRHHOIOHORRCOHORCCICOICICRI.getBytes(StandardCharsets.UTF_8);
      byte[] var2 = new byte[(int)Math.min(4096L, this.COCCCORHHRIICIROCCCOHCRCIICROO.length()) + var1.length];
      System.arraycopy(var1, 0, var2, 0, var1.length);

      try (FileInputStream var3 = new FileInputStream(this.COCCCORHHRIICIROCCCOHCRCIICROO)) {
         var3.read(var2, var1.length, var2.length - var1.length);
      }

      return Hashing.md5().hashBytes(var2).toString();
   }

   protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(AudioInputStream var1) {
      long var2 = this.data.length;
      long var4 = 0L;

      while (var4 < var2) {
         int var6 = (int)Math.min(this.data.length, var2 - var4);
         int var7 = var1.read(this.data, 0, var6);
         if (var7 == -1) {
            this.CHRHCRCCIICRORCOHCORHRROIHRCHO(true);
            break;
         }

         var4 += var7;
      }

      this.position += var4;
   }

   protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(AudioInputStream var1, ByteBuffer var2, ShortBuffer var3) {
      int var4 = var1.read(this.data);
      if (var4 == -1) {
         this.CHRHCRCCIICRORCOHCORHRROIHRCHO(true);
      } else {
         this.position += var4;
         if (this.key != null) {
            Random var5 = new Random(this.key.hashCode() + this.position);

            for (int var6 = 0; var6 < this.data.length; var6++) {
               this.data[var6] = (byte)(this.data[var6] + var5.nextInt(256) - 128);
            }
         }

         var2.clear();
         var2.put(this.data);
         var2.flip();
         var3.clear();
         var3.put(var2.asShortBuffer());
         var3.flip();
      }
   }

   @Override
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH<AudioInputStream> OCHRHCIIOCRRCHHIIROHCIOROOCHRC() {
      return new HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         this.IOCRIIROIORICRHHIICCIHIOIRIOOO,
         this.ICCOOHHCCHCHHOHOIRCHCOHRIOCCRO,
         this.HIHHCRRHHORCOHOCIRCRHHICCCIIHO,
         this.ICOCOHRRCCOIHOIHICIROHHOIIORHH,
         this.CCHOOOIRHRRCCRRCCCIORIIOOCCHOI
      );
   }

   @Generated
   @Override
   public long CHCRRCICCCHRHCCHICOCIIIHRORHIC() {
      return this.duration;
   }
}
