package org.mozilla.universalchardet;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import org.mozilla.universalchardet.prober.CharsetProber;
import org.mozilla.universalchardet.prober.EscCharsetProber;
import org.mozilla.universalchardet.prober.Latin1Prober;
import org.mozilla.universalchardet.prober.MBCSGroupProber;
import org.mozilla.universalchardet.prober.SBCSGroupProber;

public class UniversalDetector {
   public static final float SHORTCUT_THRESHOLD = 0.95F;
   public static final float MINIMUM_THRESHOLD = 0.2F;
   private UniversalDetector.InputState inputState;
   private boolean done;
   private boolean start;
   private boolean gotData;
   private boolean onlyPrintableASCII = true;
   private byte lastChar;
   private String detectedCharset;
   private CharsetProber[] probers;
   private CharsetProber escCharsetProber;
   private CharsetListener listener;

   public UniversalDetector() {
      this(null);
   }

   public UniversalDetector(CharsetListener var1) {
      this.listener = var1;
      this.escCharsetProber = null;
      this.probers = new CharsetProber[3];
      this.reset();
   }

   public boolean isDone() {
      return this.done;
   }

   public String getDetectedCharset() {
      return this.detectedCharset;
   }

   public void setListener(CharsetListener var1) {
      this.listener = var1;
   }

   public CharsetListener getListener() {
      return this.listener;
   }

   public void handleData(byte[] var1) {
      this.handleData(var1, 0, var1.length);
   }

   public void handleData(byte[] var1, int var2, int var3) {
      if (!this.done) {
         if (var3 > 0) {
            this.gotData = true;
         }

         if (this.start) {
            this.start = false;
            if (var3 > 3) {
               String var4 = detectCharsetFromBOM(var1, var2);
               if (var4 != null) {
                  this.detectedCharset = var4;
                  this.done = true;
                  return;
               }
            }
         }

         int var7 = var2 + var3;

         for (int var5 = var2; var5 < var7; var5++) {
            int var6 = var1[var5] & 255;
            if ((var6 & 128) != 0 && var6 != 160) {
               if (this.inputState != UniversalDetector.InputState.HIGHBYTE) {
                  this.inputState = UniversalDetector.InputState.HIGHBYTE;
                  if (this.escCharsetProber != null) {
                     this.escCharsetProber = null;
                  }

                  if (this.probers[0] == null) {
                     this.probers[0] = new MBCSGroupProber();
                  }

                  if (this.probers[1] == null) {
                     this.probers[1] = new SBCSGroupProber();
                  }

                  if (this.probers[2] == null) {
                     this.probers[2] = new Latin1Prober();
                  }
               }
            } else {
               if (this.inputState == UniversalDetector.InputState.PURE_ASCII && (var6 == 27 || var6 == 123 && this.lastChar == 126)) {
                  this.inputState = UniversalDetector.InputState.ESC_ASCII;
               }

               if (this.inputState == UniversalDetector.InputState.PURE_ASCII && this.onlyPrintableASCII) {
                  this.onlyPrintableASCII = var6 >= 32 && var6 <= 126 || var6 == 10 || var6 == 13 || var6 == 9;
               }

               this.lastChar = var1[var5];
            }
         }

         if (this.inputState == UniversalDetector.InputState.ESC_ASCII) {
            if (this.escCharsetProber == null) {
               this.escCharsetProber = new EscCharsetProber();
            }

            CharsetProber.ProbingState var8 = this.escCharsetProber.handleData(var1, var2, var3);
            if (var8 == CharsetProber.ProbingState.FOUND_IT) {
               this.done = true;
               this.detectedCharset = this.escCharsetProber.getCharSetName();
            }
         } else if (this.inputState == UniversalDetector.InputState.HIGHBYTE) {
            for (int var10 = 0; var10 < this.probers.length; var10++) {
               CharsetProber.ProbingState var9 = this.probers[var10].handleData(var1, var2, var3);
               if (var9 == CharsetProber.ProbingState.FOUND_IT) {
                  this.done = true;
                  this.detectedCharset = this.probers[var10].getCharSetName();
                  return;
               }
            }
         }
      }
   }

   public static String detectCharsetFromBOM(byte[] var0) {
      return detectCharsetFromBOM(var0, 0);
   }

   private static String detectCharsetFromBOM(byte[] var0, int var1) {
      if (var0.length > var1 + 3) {
         int var2 = var0[var1] & 255;
         int var3 = var0[var1 + 1] & 255;
         int var4 = var0[var1 + 2] & 255;
         int var5 = var0[var1 + 3] & 255;
         switch (var2) {
            case 0:
               if (var3 == 0 && var4 == 254 && var5 == 255) {
                  return Constants.CHARSET_UTF_32BE;
               }

               if (var3 == 0 && var4 == 255 && var5 == 254) {
                  return Constants.CHARSET_X_ISO_10646_UCS_4_2143;
               }
               break;
            case 239:
               if (var3 == 187 && var4 == 191) {
                  return Constants.CHARSET_UTF_8;
               }
               break;
            case 254:
               if (var3 == 255 && var4 == 0 && var5 == 0) {
                  return Constants.CHARSET_X_ISO_10646_UCS_4_3412;
               }

               if (var3 == 255) {
                  return Constants.CHARSET_UTF_16BE;
               }
               break;
            case 255:
               if (var3 == 254 && var4 == 0 && var5 == 0) {
                  return Constants.CHARSET_UTF_32LE;
               }

               if (var3 == 254) {
                  return Constants.CHARSET_UTF_16LE;
               }
         }
      }

      return null;
   }

   public void dataEnd() {
      if (this.gotData) {
         if (this.detectedCharset != null) {
            this.done = true;
            if (this.listener != null) {
               this.listener.report(this.detectedCharset);
            }
         } else {
            if (this.inputState == UniversalDetector.InputState.HIGHBYTE) {
               float var2 = 0.0F;
               int var3 = 0;

               for (int var4 = 0; var4 < this.probers.length; var4++) {
                  float var1 = this.probers[var4].getConfidence();
                  if (var1 > var2) {
                     var2 = var1;
                     var3 = var4;
                  }
               }

               if (var2 > 0.2F) {
                  this.detectedCharset = this.probers[var3].getCharSetName();
                  if (this.listener != null) {
                     this.listener.report(this.detectedCharset);
                  }
               }
            } else if (this.inputState != UniversalDetector.InputState.ESC_ASCII
               && this.inputState == UniversalDetector.InputState.PURE_ASCII
               && this.onlyPrintableASCII) {
               this.detectedCharset = Constants.CHARSET_US_ASCCI;
            }
         }
      }
   }

   public final void reset() {
      this.done = false;
      this.start = true;
      this.detectedCharset = null;
      this.gotData = false;
      this.inputState = UniversalDetector.InputState.PURE_ASCII;
      this.lastChar = 0;
      if (this.escCharsetProber != null) {
         this.escCharsetProber.reset();
      }

      for (int var1 = 0; var1 < this.probers.length; var1++) {
         if (this.probers[var1] != null) {
            this.probers[var1].reset();
         }
      }
   }

   public static String detectCharset(File var0) {
      return detectCharset(var0.toPath());
   }

   public static String detectCharset(Path var0) {
      try (BufferedInputStream var1 = new BufferedInputStream(Files.newInputStream(var0))) {
         return detectCharset(var1);
      }
   }

   public static String detectCharset(InputStream var0) {
      byte[] var1 = new byte[4096];
      UniversalDetector var2 = new UniversalDetector(null);

      int var3;
      while ((var3 = var0.read(var1)) > 0 && !var2.isDone()) {
         var2.handleData(var1, 0, var3);
      }

      var2.dataEnd();
      String var4 = var2.getDetectedCharset();
      var2.reset();
      return var4;
   }

   public enum InputState {
      PURE_ASCII,
      ESC_ASCII,
      HIGHBYTE;
   }
}
