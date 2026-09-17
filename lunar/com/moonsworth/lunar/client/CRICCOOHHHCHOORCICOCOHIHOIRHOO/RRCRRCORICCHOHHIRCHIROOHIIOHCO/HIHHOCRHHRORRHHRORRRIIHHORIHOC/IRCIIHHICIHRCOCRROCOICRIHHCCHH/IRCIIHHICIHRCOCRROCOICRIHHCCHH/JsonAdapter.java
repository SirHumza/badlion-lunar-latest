package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipFile;
import javax.annotation.Nullable;
import lombok.Generated;
import org.apache.commons.io.FileUtils;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private static final int HIHHHRCIIRCOIRORRIOHCOCHHCRCHO = 3000;
   private static final int RRCRRCHCHROIHCHRHHOICORHRCIHHR = 10;
   private final ExecutorService OIHRRIORCOIICHIIROHCORHHRIOOOH = Executors.newFixedThreadPool(3, var0 -> {
      Thread var1x = new Thread(var0, "Rewind Packets Worker");
      var1x.setDaemon(true);
      return var1x;
   });
   private final File OIOICROICCICRCHOHHOCIIOOHIORRH;
   private final ZipFile RIROOIROHHHROHOCHOROICHHHCRCOO;
   private final SeekableByteChannel IHRHCICROIRHRROIIICIOOHCHRCHRC;
   private final DataInputStream HRCRIOIICIRROHRCCCIROROCIOHIOH;
   private DataInputStream CIIIHCRRHOROIRIRIOHCICRCCHOCCI;
   private final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OOHHHCCCHHCOIHIHOIHIICICOOIHOC;
   private final boolean HIHCHIHHRIHORCCORIIHCICICICCCO;
   private Queue<CompletableFuture<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>> CHOIOORIOHOOHRHHRHRRRRCOOOROHO = new LinkedList<>();
   private long mark = -1L;
   private boolean closed = false;
   private boolean loaded = false;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(File var1) {
      this.OIOICROICCICRCHOHHOCIIOOHIORRH = var1;
      this.RIROOIROHHHROHOCHOROICHHHCRCOO = new ZipFile(var1, StandardCharsets.UTF_8);
      this.OOHHHCCCHHCOIHIHOIHIICICOOIHOC = IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI
         .fromJson(
            this.RICIORHICRROHOCHRRCRIHCROOCIIC("metadata.json"),
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class
         );
      this.HIHCHIHHRIHORCCORIIHCICICICCCO = this.OOHHHCCCHHCOIHIHOIHIICICOOIHOC.HCROORICIHCOIRHRRHIHIOCCCCRHIC() >= 1;
      FileChannel var2 = FileChannel.open(var1.toPath(), StandardOpenOption.READ);
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var3 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var2, "packets.dat"
      );
      this.IHRHCICROIRHRROIIICIOOHCHRCHRC = new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var2, var3.OICIHCRIHRHICIIHIORRHIICHHCCHH(), var3.CROIRIOIROHIICCRIHIOCCCIIRIHOR()
      );
      this.HRCRIOIICIRROHRCCCIROROCIOHIOH = new DataInputStream(new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IHRHCICROIRHRROIIICIOOHCHRCHRC));
      this.RRIOCCRIRCCROIHROHRIICRRIIOIHC();
   }

   private void RRIOCCRIRCCROIHROHRIICRRIIOIHC() {
      File var1 = new File(CRICCOOHHHCHOORCICOCOHIHOIRHOO.OHHIRCCICCRRCHCHOORHHIOORHRIRO, this.OOHHHCCCHHCOIHIHOIHIICICOOIHOC.getId().toString());
      var1.mkdirs();
      Path var2 = var1.getCanonicalFile().toPath();
      this.RIROOIROHHHROHOCHOROICHHHCRCOO
         .stream()
         .filter(var0 -> var0.getName().startsWith("packs/") && !var0.isDirectory())
         .forEach(
            var3 -> {
               try {
                  File var4 = new File(var1, var3.getName().substring("packs/".length()));
                  if (!var4.getCanonicalFile().toPath().startsWith(var2)) {
                     com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        "Skipping invalid pack entry " + var3.getName()
                     );
                     return;
                  }

                  FileUtils.copyInputStreamToFile(this.RIROOIROHHHROHOCHOROICHHHCRCOO.getInputStream(var3), var4);
                  var4.deleteOnExit();
               } catch (IOException var5) {
                  var5.printStackTrace();
               }
            }
         );
      if (CRICCOOHHHCHOORCICOCOHIHOIRHOO.OHHIRCCICCRRCHCHOORHHIOORHRIRO.isDirectory() && RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isWindows()) {
         Files.setAttribute(CRICCOOHHHCHOORCICOCOHIHOIRHOO.OHHIRCCICCRRCHCHOORHHIOORHRIRO.toPath(), "dos:hidden", true);
      }
   }

   @Nullable
   public synchronized com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CRRRICCRROCOHHOHIICIHORCOORRRH(
      boolean var1, boolean var2
   ) {
      if (!this.loaded) {
         try {
            this.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(0L);
         } catch (IOException var7) {
            throw new RuntimeException(var7);
         }
      }

      byte var3 = 10;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HIROIHOHCHRCCRRCROCIIHOCHICCOO().IIIHCCRHICIROORROCOHCIORRCOIHR().get()) {
         var3 = 1;
      }

      while (this.CHOIOORIOHOOHRHHRHRRRRCOOOROHO.size() < var3) {
         CompletableFuture var4 = this.RCHOIICIHOCIRCIOORIOHRCRHOCRCR(var1);
         if (var4 == null) {
            break;
         }

         this.CHOIOORIOHOOHRHHRHRRRRCOOOROHO.add(var4);
      }

      if (this.CHOIOORIOHOOHRHHRHRRRRCOOOROHO.isEmpty()) {
         return null;
      }

      CompletableFuture var8 = this.CHOIOORIOHOOHRHHRHRRRRCOOOROHO.peek();
      if (var2) {
         return (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var8.join();
      }

      try {
         return (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var8.get(
            100000L, TimeUnit.NANOSECONDS
         );
      } catch (Exception var6) {
         return null;
      }
   }

   private synchronized CompletableFuture<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RCHOIICIHOCIRCIOORIOHRCRHOCRCR(
      boolean var1
   ) {
      try {
         boolean var2 = this.CIIIHCRRHOROIRIRIOHCICRCCHOCCI == this.HRCRIOIICIRROHRCCCIROROCIOHIOH;
         if (this.CIIIHCRRHOROIRIRIOHCICRCCHOCCI.available() == 0) {
            if (!var2 || !var1) {
               if (this.CIIIHCRRHOROIRIRIOHCICRCCHOCCI != this.HRCRIOIICIRROHRCCCIROROCIOHIOH) {
                  this.CIIIHCRRHOROIRIRIOHCICRCCHOCCI = this.HRCRIOIICIRROHRCCCIROROCIOHIOH;
                  return this.RCHOIICIHOCIRCIOORIOHRCRHOCRCR(var1);
               } else {
                  return null;
               }
            }

            if (!this.HIHCHIHHRIHORCCORIIHCICICICCCO) {
               return null;
            }

            this.IHRHCICROIRHRROIIICIOOHCHRCHRC.position(this.mark);
         }

         if (var2 && var1 && this.IHRHCICROIRHRROIIICIOOHCHRCHRC.position() == 0L) {
            return null;
         }

         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = var2
            ? this.OOHHHCCCHHCOIHIHOIHIICICOOIHOC.OOOIICHCCCCIOROHOHCOOCROIHIHRC()
            : this.OOHHHCCCHHCOIHIHOIHIICICOOIHOC.RCRHHCIHHOIHHROHHCOOIOHIRRRHCR();
         this.mark = this.IHRHCICROIRHRROIIICIOOHCHRCHRC.position();
         int var4 = CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this.CIIIHCRRHOROIRIRIOHCICRCCHOCCI);
         int var5;
         if (var3.isStoresUncompressedSize()) {
            var5 = CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this.CIIIHCRRHOROIRIRIOHCICRCCHOCCI);
         } else {
            var5 = -1;
         }

         var3 = var3.getDynamicCompressor().apply(var5);
         byte[] var6 = new byte[var4];
         this.CIIIHCRRHOROIRIRIOHCICRCCHOCCI.readFully(var6);
         if (this.HIHCHIHHRIHORCCORIIHCICICICCCO && (!var2 || !var1)) {
            this.CIIIHCRRHOROIRIRIOHCICRCCHOCCI.skipBytes(2);
         }

         byte[] var7;
         boolean var8;
         if (this.HIHCHIHHRIHORCCORIIHCICICICCCO && var2 && var1) {
            var7 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var3, var5);
            var8 = false;
            this.IHRHCICROIRHRROIIICIOOHCHRCHRC.position(this.mark - 2L);
            int var9 = this.CIIIHCRRHOROIRIRIOHCICRCCHOCCI.readUnsignedShort() + 2;
            this.IHRHCICROIRHRROIIICIOOHCHRCHRC.position(this.IHRHCICROIRHRROIIICIOOHCHRCHRC.position() - var9);
         } else {
            var7 = var6;
            var8 = true;
         }

         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var12 = var3;
         return CompletableFuture.supplyAsync(
            () -> {
               CORCOCICIRIOHROHROIIOOHICCHCRR var5x;
               if (var8) {
                  var5x = new CORCOCICIRIOHROHROIIOOHICCHCRR(IRCIIHHICIHRCOCRROCOICRIHHCCHH(var7, var12, var5));
               } else {
                  var5x = new CORCOCICIRIOHROHROIIOOHICCHCRR(Unpooled.wrappedBuffer(var7));
               }

               int var6x = var5x.readVarInt();

               try {
                  com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7x = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(
                     this.OOHHHCCCHHCOIHIHOIHIICICOOIHOC.OIIRIRORHCHOHHRIRHCIOCICORRCIR(), var6x
                  );
                  var7x.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5x);
                  return var7x;
               } catch (Exception var12x) {
                  var12x.printStackTrace();
                  return new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
               } finally {
                  var5x.release();
               }
            },
            this.OIHRRIORCOIICHIIROHCORHHRIOOOH
         );
      } catch (Exception var10) {
         var10.printStackTrace();
         return CompletableFuture.completedFuture(
            new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH()
         );
      }
   }

   private static byte[] RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      byte[] var0,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      int var2
   ) {
      try {
         return switch (var1) {
            case ZLIB -> HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH(var0);
            case ZSTD -> CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var2);
            case LZ4 -> com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var0, var2
            );
            default -> throw new IllegalStateException("Unexpected value: " + var1);
         };
      } catch (Exception var4) {
         throw new RuntimeException(var4);
      }
   }

   private static ByteBuf IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      byte[] var0,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      int var2
   ) {
      try {
         return switch (var1) {
            case ZSTD -> CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var2);
            case LZ4 -> com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var0, var2
            );
            default -> Unpooled.wrappedBuffer(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2));
         };
      } catch (Exception var4) {
         throw new RuntimeException(var4);
      }
   }

   public synchronized void consume() {
      this.CHOIOORIOHOOHRHHRHRRRRCOOOROHO.poll();
   }

   public synchronized boolean RIOHCOHORIHRHOIORHHRHROOOHCOIO() {
      return !this.CHOIOORIOHOOHRHHRHRRRRCOOOROHO.isEmpty();
   }

   public synchronized boolean HHIOCIRHCHIRHHRIRCHOIRORHCRCRI(boolean var1) {
      if (this.CIIIHCRRHOROIRIRIOHCICRCCHOCCI == null) {
         return true;
      }

      boolean var2 = this.CIIIHCRRHOROIRIRIOHCICRCCHOCCI == this.HRCRIOIICIRROHRCCCIROROCIOHIOH;
      if (!var2) {
         return false;
      }

      if (var1) {
         try {
            return this.IHRHCICROIRHRROIIICIOOHCHRCHRC.position() == 0L;
         } catch (IOException var4) {
            var4.printStackTrace();
            return true;
         }
      } else {
         try {
            return this.CIIIHCRRHOROIRIRIOHCICRCCHOCCI.available() == 0;
         } catch (IOException var5) {
            var5.printStackTrace();
            return true;
         }
      }
   }

   public synchronized void ICRIROCRHORHCHHOHRIORRIROCOOIR(String var1) {
      if (this.closed) {
         throw new IllegalStateException("File is closed");
      }

      if (this.CIIIHCRRHOROIRIRIOHCICRCCHOCCI != null && this.CIIIHCRRHOROIRIRIOHCICRCCHOCCI != this.HRCRIOIICIRROHRCCCIROROCIOHIOH) {
         this.CIIIHCRRHOROIRIRIOHCICRCCHOCCI.close();
      }

      this.CIIIHCRRHOROIRIRIOHCICRCCHOCCI = this.RCHRHOCCORRRCRORCHIIRRIIIRRCRR("snapshots/" + var1 + "/packets.dat");
      String var2 = "snapshots/" + var1 + "/mods.json";
      if (this.RIROOIROHHHROHOCHOROICHHHCRCOO.getEntry(var2) != null) {
         JsonObject var3 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.fromJson(this.HOHHRHCIOCRCHCOOOHORROICORCCCC(var2), JsonObject.class);
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().load(var3);
      }
   }

   public synchronized long RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(long var1) {
      if (this.closed) {
         throw new IllegalStateException("File is closed");
      }

      this.loaded = true;
      if (this.CIIIHCRRHOROIRIRIOHCICRCCHOCCI != null && this.CIIIHCRRHOROIRIRIOHCICRCCHOCCI != this.HRCRIOIICIRROHRCCCIROROCIOHIOH) {
         this.CIIIHCRRHOROIRIRIOHCICRCCHOCCI.close();
      }

      this.CIIIHCRRHOROIRIRIOHCICRCCHOCCI = this.HRCRIOIICIRROHRCCCIROROCIOHIOH;
      this.CHOIOORIOHOOHRHHRHRRRRCOOOROHO.clear();

      try {
         Long var3 = this.HOCHIRHHHIIIIRRORHOOIRRORROHCI().OHRCORIRRIOCCHIHIRHHRHRIOIRCRH().floorKey(var1 - 3000L);
         if (var3 == null) {
            var3 = this.HOCHIRHHHIIIIRRORHOOIRRORROHCI().OHRCORIRRIOCCHIHIRHHRHRIOIRCRH().firstKey();
         }

         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = this.HOCHIRHHHIIIIRRORHOOIRRORROHCI()
            .OHRCORIRRIOCCHIHIRHHRHRIOIRCRH()
            .get(var3);
         this.IHRHCICROIRHRROIIICIOOHCHRCHRC.position(var4.position());
         this.mark = this.IHRHCICROIRHRROIIICIOOHCHRCHRC.position();
         if (!var4.uuid().isEmpty()) {
            this.ICRIROCRHORHCHHOHRIORRIROCOOIR(var4.uuid());
         }

         return var3 - this.HOCHIRHHHIIIIRRORHOOIRRORROHCI().OHRCORIRRIOCCHIHIRHHRHRIOIRCRH().firstKey();
      } catch (Exception var5) {
         return 0L;
      }
   }

   public DataInputStream RCHRHOCCORRRCRORCHIIRRIIIRRCRR(String var1) {
      return new DataInputStream(
         new BufferedInputStream(this.RIROOIROHHHROHOCHOROICHHHCRCOO.getInputStream(this.RIROOIROHHHROHOCHOROICHHHCRCOO.getEntry(var1)))
      );
   }

   public BufferedReader HOHHRHCIOCRCHCOOOHORROICORCCCC(String var1) {
      return new BufferedReader(
         new InputStreamReader(new BufferedInputStream(this.RIROOIROHHHROHOCHOROICHHHCRCOO.getInputStream(this.RIROOIROHHHROHOCHOROICHHHCRCOO.getEntry(var1))))
      );
   }

   public InputStreamReader RICIORHICRROHOCHRRCRIHCROOCIIC(String var1) {
      return new InputStreamReader(
         this.RIROOIROHHHROHOCHOROICHHHCRCOO.getInputStream(this.RIROOIROHHHROHOCHOROICHHHCRCOO.getEntry(var1)), StandardCharsets.UTF_8
      );
   }

   public boolean has(String var1) {
      return this.RIROOIROHHHROHOCHOROICHHHCRCOO.getEntry(var1) != null;
   }

   public synchronized void close() {
      if (this.closed) {
         throw new IllegalStateException("File is closed");
      }

      this.RIROOIROHHHROHOCHOROICHHHCRCOO.close();
      this.IHRHCICROIRHRROIIICIOOHCHRCHRC.close();
      this.closed = true;
   }

   @Generated
   public File getFile() {
      return this.OIOICROICCICRCHOHHOCIIOOHIORRH;
   }

   @Generated
   public com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HOCHIRHHHIIIIRRORHOOIRRORROHCI() {
      return this.OOHHHCCCHHCOIHIHOIHIICICOOIHOC;
   }

   @Generated
   public boolean IIIOIRCOCCHRCHICHIIOHIRIHIOOHR() {
      return this.HIHCHIHHRIHORCCORIIHCICICICCCO;
   }
}
