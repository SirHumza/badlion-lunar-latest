package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import lombok.Generated;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private final File RCCHIRICHIOHCHOCHRIRHCRHCCHHRC = CRICCOOHHHCHOORCICOCOHIHOIRHOO.OCOROOROCICIRRRCRIHHOOOIHOOHRC.resolve("bin/ffmpeg").toFile();
   private Process ROHORORHCOHCCIROCICCIOHHRHOIOO;
   private WritableByteChannel COIRRHICRCCCCHHIHHRRCHHIOCHROR;
   private BufferedOutputStream RCCOHHHICHOHHIHHCIHCRRCOIHRHHH;
   private Thread HIRHIHIIHHRHRHORRIROCRCRRHOOIO;
   private final ArrayBlockingQueue<ByteBuffer> HRHCHOICIHHHIRRHHROCHROIIIHCOR = new ArrayBlockingQueue<>(5);
   private final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH OHIIIOIOIOIROOCRRRIIHRRCOHIROO;
   private File file;
   private final HHCCIRHCCCIIRHCROHIORHIRHHIORH IRRCCHHCORHRHCIRRROCICIIOHOCCH;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      this.OHIIIOIOIOIROOCRRRIIHRRCOHIROO = var1;
      this.IRRCCHHCORHRHCIRRROCICIIOHOCCH = new HHCCIRHCCCIIRHCROHIORHIRHHIORH(this);
      this.IRRCCHHCORHRHCIRRROCICIIOHOCCH.OCIRRCHORHIHICORIRCCICIRIOCOCI();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      File var1,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
   ) {
      int var3 = var2.getWidth();
      int var4 = var2.getHeight();
      this.file = var1;
      this.HIRHIHIIHHRHRHORRIROCRCRRHOOIO = new Thread(() -> {
         while (this.IRIHHHOROHICICOCIOOIHHRRRCOHIO()) {
            try {
               ByteBuffer var1x = this.HRHCHOICIHHHIRRHHROCHROIIIHCOR.take();
               this.COIRRHICRCCCCHHIHHRRCHHIOCHROR.write(var1x);
               this.OHIIIOIOIOIROOCRRRIIHRRCOHIROO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x);
            } catch (InterruptedException var2x) {
            } catch (Exception var3x) {
               throw new RuntimeException(var3x);
            }
         }
      }, "Rewind-Render-IO");
      Thread var5 = new Thread(
         () -> {
            try {
               int var5x = var3 * var4 * 4;
               ArrayList var6 = new ArrayList();
               var6.add(this.RCCHIRICHIOHCHOCHRIRHCRHCCHHRC.getAbsolutePath());
               var6.add("-y");
               var6.add("-f");
               var6.add("rawvideo");
               var6.add("-pix_fmt");
               var6.add("bgra");
               var6.add("-s");
               var6.add(var3 + "x" + var4);
               var6.add("-r");
               var6.add(String.valueOf(var2.ICRCHRIRHCRROORHCROHHICRCCCCHO()));
               var6.add("-i");
               var6.add("-");
               var6.add("-an");
               var6.add("-pix_fmt");
               var6.add("yuv420p");
               var6.add("-vf");
               if (var3 % 2 == 0 && var4 % 2 == 0) {
                  var6.add("vflip");
               } else {
                  var6.add("pad=ceil(iw/2)*2:ceil(ih/2)*2,vflip");
               }

               var6.addAll(
                  var2.HROIOOROOIIHCHHHORCICHHRRCHRCO() == null
                     ? this.IRRCCHHCORHRHCIRRROCICIIOHOCCH
                        .HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2.CHHIROCHCHRCOHHOCRHHHOIHRHHORI())
                        .getArguments(var2.COHHIIOOHRHOOCRHHOROCCHROORRHO())
                     : var2.HROIOOROOIIHCHHHORCICHHRRCHRCO().getArguments(var2.COHHIIOOHRHOOCRHHOROCCHROORRHO())
               );
               var6.add("-f");
               var6.add(var2.OCOHRCROORRHHOHHORHIORIHRCHHOR().id());
               var6.add("-use_editlist");
               var6.add("0");
               var6.add("-movflags");
               var6.add("+frag_keyframe+empty_moov+default_base_moof");
               var6.add(var1.getName());
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  "[Rewind] Starting render process"
               );
               ProcessBuilder var7 = new ProcessBuilder(var6);
               var7.directory(var1.getParentFile());
               File var8 = new File(var1.getParentFile(), "output.log");
               var7.redirectOutput(var8);
               var7.redirectError(Redirect.appendTo(var8));
               this.ROHORORHCOHCCIROCICCIOHHRHOIOO = var7.start();
               this.RCCOHHHICHOHHIHHCIHCRRCOIHRHHH = new BufferedOutputStream(this.ROHORORHCOHCCIROCICCIOHHRHOIOO.getOutputStream(), var5x);
               this.COIRRHICRCCCCHHIHHRRCHHIOCHROR = Channels.newChannel(this.RCCOHHHICHOHHIHHCIHCRRCOIHRHHH);
               this.HIRHIHIIHHRHRHORRIROCRCRRHOOIO.start();
            } catch (Exception var9) {
               com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9, "Rewind");
            }
         },
         "Rewind-FFmpeg"
      );
      var5.start();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      try {
         this.HRHCHOICIHHHIRRHHROCHROIIIHCOR.put(var1.buffer());
      } catch (InterruptedException var3) {
         throw new RuntimeException(var3);
      }
   }

   public void OHHRIOHROOIHOROCIRHCHORIHRRRRI(Runnable var1) {
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "[Rewind] Stopping render process..."
      );

      try {
         for (int var2 = 0; var2 < 300 && (!this.HRHCHOICIHHHIRRHHROCHROIIIHCOR.isEmpty() || !this.OHIIIOIOIOIROOCRRRIIHRRCOHIROO.isFull()); var2++) {
            var1.run();
            Thread.sleep(100L);
         }

         try {
            this.COIRRHICRCCCCHHIHHRRCHHIOCHROR.close();
         } catch (IOException var3) {
         }

         for (int var5 = 0; var5 < 30 && this.ROHORORHCOHCCIROCICCIOHHRHOIOO.isAlive(); var5++) {
            Thread.sleep(100L);
         }

         if (this.ROHORORHCOHCCIROCICCIOHHRHOIOO != null) {
            this.ROHORORHCOHCCIROCICCIOHHRHOIOO.destroy();
         }

         this.HIRHIHIIHHRHRHORRIROCRCRRHOOIO.interrupt();
      } catch (Exception var4) {
         com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, "Rewind");
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      File var1,
      File var2,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
   ) {
      String var4 = var1.getName().substring(var1.getName().lastIndexOf(46));
      File var5 = new File(var1.getParentFile(), "tmp_" + System.currentTimeMillis() + "." + var4);
      ArrayList var6 = new ArrayList<>(List.of(this.RCCHIRICHIOHCHOCHRIRHCRHCCHHRC.getAbsolutePath(), "-y"));
      if (var2 != null && var2.isFile() && var3.OORHHRCIRHCIROCCCRORICIRHHOIOC() && var3.OCOHRCROORRHHOHHORHIORIHRCHHOR().isSupportsAudio()) {
         var6.addAll(
            List.of(
               "-f",
               "s16le",
               "-ar",
               String.valueOf(var3.getFrequency()),
               "-ac",
               var3.OCROHCHHCOIIOCCIIHROHCIRHIORCR() ? "2" : "1",
               "-i",
               var2.getAbsolutePath()
            )
         );
      }

      var6.addAll(
         List.of("-i", var1.getAbsolutePath(), "-c:v", "copy", "-c:a", "aac", "-b:a", "192k", "-movflags", "+faststart", "-shortest", var5.getAbsolutePath())
      );
      File var7 = new File(var5.getParentFile(), "output.log");
      ProcessBuilder var8 = new ProcessBuilder(var6);
      var8.directory(var5.getParentFile());
      var8.redirectOutput(Redirect.appendTo(var7));
      var8.redirectError(Redirect.appendTo(var7));
      Process var9 = var8.start();
      var9.waitFor();
      if (var2 != null) {
         var2.delete();
      }

      var1.delete();
      var5.renameTo(var1);
   }

   public boolean RCIIIOCRRROCRCRROOIOOCCCHCCHCO() {
      return this.RCCHIRICHIOHCHOCHRIRHCRHCCHHRC.isFile() || new File(this.RCCHIRICHIOHCHOCHRIRHCRHCCHHRC.getAbsolutePath() + ".exe").isFile();
   }

   public boolean IRIHHHOROHICICOCIOOIHHRRRCOHIO() {
      return this.ROHORORHCOHCCIROCICCIOHHRHOIOO != null
         && this.ROHORORHCOHCCIROCICCIOHHRHOIOO.isAlive()
         && this.COIRRHICRCCCCHHIHHRRCHHIOCHROR != null
         && this.COIRRHICRCCCCHHIHHRRCHHIOCHROR.isOpen();
   }

   @Generated
   public File HHCOROHRRORHRIOIOOHCIOHRROHCRI() {
      return this.RCCHIRICHIOHCHOCHRIRHCRHCCHHRC;
   }

   @Generated
   public File getFile() {
      return this.file;
   }

   @Generated
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH IRICHHCHHCCROCCCHRHOCCCOHCOICH() {
      return this.IRRCCHHCORHRHCIRRROCICIIOHOCCH;
   }
}
