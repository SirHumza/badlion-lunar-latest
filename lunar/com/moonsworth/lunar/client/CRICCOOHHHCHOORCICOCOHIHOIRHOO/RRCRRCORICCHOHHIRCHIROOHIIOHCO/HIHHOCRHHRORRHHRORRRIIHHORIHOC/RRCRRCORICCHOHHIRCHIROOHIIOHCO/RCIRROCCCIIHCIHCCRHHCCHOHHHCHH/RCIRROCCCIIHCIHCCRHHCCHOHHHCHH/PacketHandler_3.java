package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.util.Wasapi;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.platform.win32.Ole32;
import com.sun.jna.platform.win32.WinNT;
import com.sun.jna.platform.win32.WinNT.HANDLE;
import com.sun.jna.platform.win32.WinNT.HRESULT;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;
import org.lwjgl.actually3.BufferUtils;
import org.lwjgl.util.opus.Opus;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IICHCCICHIOOHHCCICIRRIOHCCOCCR = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.MONO16;
   private final Wasapi.IMMDeviceEnumerator IORIRRCRCICIHHOOIIOCRIRCICHIOH;
   private final Wasapi.IMMDevice IOCHHOOHRRHHOIIRHHHHHOHHIOOORC;
   private final Wasapi.IAudioClient ICIOCCRHOHCIRRIIIIHOOHIOOIOIHC;
   private final Wasapi.IAudioCaptureClient ORIIIHOCOHHOOCOOIHRHOCHIIIROCH;
   private final HANDLE ORHHCHCCIOOIHIHCCHICIICCOCOICO;
   private final Pointer HIIIRIHHICIIICOCCHHOOOCCOROOCO;
   private final Wasapi.WAVEFORMATEX IRRHHIHORCOICCCRORIIOIROOCRHRI;
   private final boolean CHICICRCIHRHRHROHOIRICIIROOCIC;
   private HRESULT HRHIRCCOICIHRIHCHRHIHIRRROOICC = Ole32.INSTANCE.CoInitializeEx(null, 2);

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      if (Objects.equals(this.HRHIRCCOICIHRIHCHRHIHIRRROOICC, WinNT.S_OK)) {
         this.CHICICRCIHRHRHROHOIRICIIROOCIC = true;
      } else {
         if (!Objects.equals(this.HRHIRCCOICIHRIHCHRHIHIRRROOICC, WinNT.S_FALSE)) {
            throw new RuntimeException("CoInitializeEx failed with HRESULT: 0x" + Long.toHexString(this.HRHIRCCOICIHRIHCHRHIHIRRROOICC.longValue()));
         }

         this.CHICICRCIHRHRHROHOIRICIIROOCIC = false;
      }

      this.ORHHCHCCIOOIHIHCCHICIICCOCOICO = Wasapi.Kernel32.INSTANCE.CreateEvent(null, false, false, null);
      if (this.ORHHCHCCIOOIHIHCCHICIICCOCOICO != null && this.ORHHCHCCIOOIHIHCCHICIICCOCOICO.getPointer() != null) {
         PointerByReference var1 = new PointerByReference();
         this.HRHIRCCOICIHRIHCHRHIHIRRROOICC = Ole32.INSTANCE.CoCreateInstance(Wasapi.CLSID_MMDeviceEnumerator, null, 23, Wasapi.IID_IMMDeviceEnumerator, var1);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HRHIRCCOICIHRIHCHRHIHIRRROOICC, "CoCreateInstance");
         this.IORIRRCRCICIHHOOIIOCRIRCICHIOH = new Wasapi.IMMDeviceEnumerator(var1.getValue());
         PointerByReference var2 = new PointerByReference();
         this.HRHIRCCOICIHRIHCHRHIHIRRROOICC = this.IORIRRCRCICIHHOOIIOCRIRCICHIOH.GetDefaultAudioEndpoint(0, 0, var2);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HRHIRCCOICIHRIHCHRHIHIRRROOICC, "GetDefaultAudioEndpoint");
         this.IOCHHOOHRRHHOIIRHHHHHOHHIOOORC = new Wasapi.IMMDevice(var2.getValue());
         PointerByReference var3 = new PointerByReference();
         this.HRHIRCCOICIHRIHCHRHIHIRRROOICC = this.IOCHHOOHRRHHOIIRHHHHHOHHIOOORC.Activate(Wasapi.IID_IAudioClient, 23, null, var3);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HRHIRCCOICIHRIHCHRHIHIRRROOICC, "Activate");
         this.ICIOCCRHOHCIRRIIIIHOOHIOOIOIHC = new Wasapi.IAudioClient(var3.getValue());
         PointerByReference var4 = new PointerByReference();
         this.HRHIRCCOICIHRIHCHRHIHIRRROOICC = this.ICIOCCRHOHCIRRIIIIHOOHIOOIOIHC.GetMixFormat(var4);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HRHIRCCOICIHRIHCHRHIHIRRROOICC, "GetMixFormat");
         this.HIIIRIHHICIIICOCCHHOOOCCOROOCO = var4.getValue();
         this.IRRHHIHORCOICCCRORIIOIROOCRHRI = new Wasapi.WAVEFORMATEX(this.HIIIRIHHICIIICOCCHHOOOCCOROOCO);
         this.IRRHHIHORCOICCCRORIIOIROOCRHRI.read();
         int var5 = 393216;
         this.HRHIRCCOICIHRIHCHRHIHIRRROOICC = this.ICIOCCRHOHCIRRIIIIHOOHIOOIOIHC
            .Initialize(0, var5, 0L, 0L, this.HIIIRIHHICIIICOCCHHOOOCCOROOCO, Guid.IID_NULL);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HRHIRCCOICIHRIHCHRHIHIRRROOICC, "Initialize");
         IntByReference var6 = new IntByReference();
         this.HRHIRCCOICIHRIHCHRHIHIRRROOICC = this.ICIOCCRHOHCIRRIIIIHOOHIOOIOIHC.GetBufferSize(var6);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HRHIRCCOICIHRIHCHRHIHIRRROOICC, "GetBufferSize");
         this.HRHIRCCOICIHRIHCHRHIHIRRROOICC = this.ICIOCCRHOHCIRRIIIIHOOHIOOIOIHC.SetEventHandle(this.ORHHCHCCIOOIHIHCCHICIICCOCOICO);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HRHIRCCOICIHRIHCHRHIHIRRROOICC, "SetEventHandle");
         PointerByReference var7 = new PointerByReference();
         this.HRHIRCCOICIHRIHCHRHIHIRRROOICC = this.ICIOCCRHOHCIRRIIIIHOOHIOOIOIHC.GetService(Wasapi.IID_IAudioCaptureClient, var7);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HRHIRCCOICIHRIHCHRHIHIRRROOICC, "GetService");
         this.ORIIIHOCOHHOOCOOIHRHOCHIIIROCH = new Wasapi.IAudioCaptureClient(var7.getValue());
         this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.HIRIHCORIRIORCCHCOORIHIOIICOIH(IICHCCICHIOOHHCCICIRRIOHCCOCCR.getChannels());
         this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.CRIHRCICOICHCHCHIHRHROCCHCCCII(Math.min(48000, this.IRRHHIHORCOICCCRORIIOIROOCRHRI.nSamplesPerSec));
         this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.setFrameSize((int)(this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.getFrequency() * 0.02));
         this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.HORCRRHOCRRICHROCIOOIORIOHCIHH(IICHCCICHIOOHHCCICIRRIOHCCOCCR.getBytesPerSample());
         this.HRCRRCRCCRCOHCOHCROHIRIHRIHRRO();
      } else {
         throw new RuntimeException("Unable to create event.");
      }
   }

   @Override
   public void start() {
      int var1 = this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.getFrameSize() * this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.getChannels();
      int var2 = var1 * this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.getBytesPerSample();
      ByteBuffer var3 = BufferUtils.createByteBuffer(var2).order(ByteOrder.LITTLE_ENDIAN);
      ByteBuffer var4 = BufferUtils.createByteBuffer(var2).order(ByteOrder.LITTLE_ENDIAN);
      byte[] var5 = new byte[var2];
      double var6 = (double)this.IRRHHIHORCOICCCRORIIOIROOCRHRI.nSamplesPerSec / this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.getFrequency();
      int var8 = (int)(
         this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.getFrameSize()
               * this.IRRHHIHORCOICCCRORIIOIROOCRHRI.nChannels
               * this.IRRHHIHORCOICCCRORIIOIROOCRHRI.wBitsPerSample
            / 8.0
            * var6
      );
      ByteBuffer var9 = BufferUtils.createByteBuffer(var8).order(ByteOrder.LITTLE_ENDIAN);
      ByteBuffer var10 = BufferUtils.createByteBuffer(var8).order(ByteOrder.LITTLE_ENDIAN);
      ShortBuffer var11 = var3.asShortBuffer();
      ByteBuffer var12 = ByteBuffer.allocate(var8 * 3).order(ByteOrder.LITTLE_ENDIAN);
      this.HRHIRCCOICIHRIHCHRHIHIRRROOICC = this.ICIOCCRHOHCIRRIIIIHOOHIOOIOIHC.Start();
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HRHIRCCOICIHRIHCHRHIHIRRROOICC, "Start");
      this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(
         () -> {
            while (!Thread.currentThread().isInterrupted()) {
               int var11x = Wasapi.Kernel32.INSTANCE.WaitForSingleObject(this.ORHHCHCCIOOIHIHCCHICIICCOCOICO, 2000);
               if (var11x == 0) {
                  IntByReference var12x = new IntByReference();
                  this.HRHIRCCOICIHRIHCHRHIHIRRROOICC = this.ORIIIHOCOHHOOCOOIHRHOCHIIIROCH.GetNextPacketSize(var12x);
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HRHIRCCOICIHRIHCHRHIHIRRROOICC, "GetNextPacketSize");

                  while (var12x.getValue() > 0) {
                     PointerByReference var13 = new PointerByReference();
                     IntByReference var14 = new IntByReference();
                     IntByReference var15 = new IntByReference();
                     this.HRHIRCCOICIHRIHCHRHIHIRRROOICC = this.ORIIIHOCOHHOOCOOIHRHOCHIIIROCH.GetBuffer(var13, var14, var15, null, null);
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HRHIRCCOICIHRIHCHRHIHIRRROOICC, "GetBuffer");
                     int var16 = var14.getValue();
                     int var17 = var16 * this.IRRHHIHORCOICCCRORIIOIROOCRHRI.nBlockAlign;
                     if (var17 > 0) {
                        byte[] var18 = var13.getValue().getByteArray(0L, var17);
                        if (!this.CHRHOHORRICRRHRCRCICOORCHHCIOH()) {
                           var12.put(var18);
                        }

                        try {
                           while (var12.position() >= var8) {
                              var12.flip();
                              var10.clear().put(var12.array(), 0, var8).flip();
                              var12.position(var8).compact();
                              if (this.IRRHHIHORCOICCCRORIIOIROOCRHRI.wBitsPerSample == 32) {
                                 var9.clear().put(var10).flip();
                                 var10.clear();
                                 com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                    var9,
                                    var10,
                                    (int)(this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.getFrameSize() * var6),
                                    this.IRRHHIHORCOICCCRORIIOIROOCRHRI.nChannels
                                 );
                              }

                              if (this.IRRHHIHORCOICCCRORIIOIROOCRHRI.nSamplesPerSec != this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.getFrequency()) {
                                 var9.clear().put(var10).flip();
                                 var10.clear();
                                 com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                    var9,
                                    var10,
                                    this.IRRHHIHORCOICCCRORIIOIROOCRHRI.nSamplesPerSec,
                                    this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.getFrequency(),
                                    this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.getChannels(),
                                    this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.getFrameSize() * this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.getBytesPerSample()
                                 );
                              }

                              var3.clear().put(var10).flip();
                              var4.clear();
                              int var19 = Opus.opus_encode(this.HCCOHRHCICCCHOOHCHORIIICOHORHR, var11, this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.getFrameSize(), var4);
                              var4.get(var5, 0, var19);

                              for (DataOutputStream var21 : this.HCIRHIORRHORHIHHORCICRROORHIHO) {
                                 CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var21, var19);
                                 var21.write(var5, 0, var19);
                              }
                           }
                        } catch (IOException var22) {
                           com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                              var22, "Rewind"
                           );
                        }
                     }

                     this.HRHIRCCOICIHRIHCHRHIHIRRROOICC = this.ORIIIHOCOHHOOCOOIHRHOCHIIIROCH.ReleaseBuffer(var14.getValue());
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HRHIRCCOICIHRIHCHRHIHIRRROOICC, "ReleaseBuffer");
                     this.HRHIRCCOICIHRIHCHRHIHIRRROOICC = this.ORIIIHOCOHHOOCOOIHRHOCHIIIROCH.GetNextPacketSize(var12x);
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HRHIRCCOICIHRIHCHRHIHIRRROOICC, "GetNextPacketSize");
                  }
               }
            }
         }
      );
   }

   @Override
   public void stop() {
      super.stop();
      if (this.ICIOCCRHOHCIRRIIIIHOOHIOOIOIHC != null) {
         this.ICIOCCRHOHCIRRIIIIHOOHIOOIOIHC.Stop();
      }

      if (this.ORIIIHOCOHHOOCOOIHRHOCHIIIROCH != null) {
         this.ORIIIHOCOHHOOCOOIHRHOCHIIIROCH.Release();
      }

      if (this.ICIOCCRHOHCIRRIIIIHOOHIOOIOIHC != null) {
         this.ICIOCCRHOHCIRRIIIIHOOHIOOIOIHC.Release();
      }

      if (this.IOCHHOOHRRHHOIIRHHHHHOHHIOOORC != null) {
         this.IOCHHOOHRRHHOIIRHHHHHOHHIOOORC.Release();
      }

      if (this.IORIRRCRCICIHHOOIIOCRIRCICHIOH != null) {
         this.IORIRRCRCICIHHOOIIOCRIRCICHIOH.Release();
      }

      if (this.ORHHCHCCIOOIHIHCCHICIICCOCOICO != null) {
         Wasapi.Kernel32.INSTANCE.CloseHandle(this.ORHHCHCCIOOIHIHCCHICIICCOCOICO);
      }

      if (this.HIIIRIHHICIIICOCCHHOOOCCOROOCO != null) {
         Ole32.INSTANCE.CoTaskMemFree(this.HIIIRIHHICIIICOCCHHOOOCCOROOCO);
      }

      if (this.CHICICRCIHRHRHROHOIRICIIROOCIC) {
         Ole32.INSTANCE.CoUninitialize();
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRESULT var1, String var2) {
      if (!Objects.equals(var1, WinNT.S_OK)) {
         throw new RuntimeException("Function " + var2 + " failed with HRESULT: 0x" + Long.toHexString(var1.longValue()));
      }
   }
}
