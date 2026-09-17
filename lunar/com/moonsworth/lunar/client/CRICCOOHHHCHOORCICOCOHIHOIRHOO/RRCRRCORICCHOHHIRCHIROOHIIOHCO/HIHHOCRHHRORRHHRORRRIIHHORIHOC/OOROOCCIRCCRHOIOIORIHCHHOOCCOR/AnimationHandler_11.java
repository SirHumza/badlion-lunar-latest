package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR;
import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.Dialog.ModalityType;
import java.awt.Window.Type;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.util.tinyfd.TinyFileDialogs;

public class CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final String[] COOOCHHRIIOOICRIIHIROCOOCOICRH = new String[]{"zenity", "kdialog", "yad", "qarma", "matedialog", "shellementary"};
   private static Boolean OHORRIICHHRRROICOOICIROIICHCHO;

   private static String IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var0, String[] var1) {
      if (var0 != null && var1.length != 0) {
         StringBuilder var2 = new StringBuilder();
         var2.append(var0).append(" (");

         for (int var3 = 0; var3 < var1.length; var3++) {
            var2.append("*.").append(var1[var3]);
            if (var3 != var1.length - 1) {
               var2.append(", ");
            }
         }

         var2.append(")");
         return var2.toString();
      } else {
         return var0;
      }
   }

   private static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, File var1, String var2, String[] var3, boolean var4, boolean var5) {
      var2 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, var3);

      try {
         MemoryStack var6 = MemoryStack.stackPush();

         String var17;
         label83: {
            try {
               Object var7;
               if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().OOICHHIHHIHROCCRRRIIIIRIRICCIH()) {
                  var7 = BufferUtils.createPointerBuffer(var3.length);
               } else {
                  var7 = org.lwjgl.actually3.BufferUtils.createPointerBuffer(var3.length);
               }

               for (String var11 : var3) {
                  var7.getClass().getDeclaredMethod("put", ByteBuffer.class).invoke(var7, var6.UTF8("*." + var11));
               }

               var7.getClass().getMethod("flip").invoke(var7);
               if (var5) {
                  var17 = (String)TinyFileDialogs.class
                     .getDeclaredMethod("tinyfd_saveFileDialog", CharSequence.class, CharSequence.class, var7.getClass(), CharSequence.class)
                     .invoke(null, var0, var1 == null ? null : var1.getAbsolutePath() + (var1.isDirectory() ? "/" : ""), var7, var2);
                  break label83;
               }

               var17 = (String)TinyFileDialogs.class
                  .getDeclaredMethod("tinyfd_openFileDialog", CharSequence.class, CharSequence.class, var7.getClass(), CharSequence.class, boolean.class)
                  .invoke(null, var0, var1 == null ? null : var1.getAbsolutePath() + (var1.isDirectory() ? "/" : ""), var7, var2, var4);
            } catch (Throwable var13) {
               if (var6 != null) {
                  try {
                     var6.close();
                  } catch (Throwable var12) {
                     var13.addSuppressed(var12);
                  }
               }

               throw var13;
            }

            if (var6 != null) {
               var6.close();
            }

            return var17;
         }

         if (var6 != null) {
            var6.close();
         }

         return var17;
      } catch (Exception var14) {
         throw new RuntimeException(var14);
      }
   }

   private static boolean OORHIRCRHHOCHRROROOCOIICHOCOHO() {
      if (!RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isLinux()) {
         return true;
      }

      if (OHORRIICHHRRROICOOICIROIICHCHO == null) {
         OHORRIICHHRRROICOOICIROIICHCHO = ROIIICHRIICCIROCCCOIIIIIIIHRIR();
      }

      return OHORRIICHHRRROICOOICIROIICHCHO;
   }

   private static boolean ROIIICHRIICCIROCCCOIIIIIIIHRIR() {
      String var0 = System.getenv("PATH");
      if (var0 == null) {
         return false;
      }

      for (String var4 : var0.split(File.pathSeparator)) {
         if (!var4.isEmpty()) {
            for (String var8 : COOOCHHRIIOOICRIIHIROCOOCOICRH) {
               if (new File(var4, var8).canExecute()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private static File[] IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var0, File var1, String var2, String[] var3, boolean var4, boolean var5) {
      if (GraphicsEnvironment.isHeadless()) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "No file dialog available: TinyFD has no usable backend and AWT is headless"
         );
         RCORRCRRRHCHOCHHHCHHOOOIRCHCHH();
         return null;
      }

      AtomicReference var6 = new AtomicReference();

      try {
         EventQueue.invokeAndWait(() -> {
            Frame var6x = new Frame();
            var6x.setType(Type.UTILITY);
            var6x.setUndecorated(true);
            var6x.setAlwaysOnTop(true);
            var6x.setFocusableWindowState(true);
            var6x.setLocationRelativeTo(null);
            var6x.setVisible(true);
            var6x.toFront();
            var6x.requestFocus();
            final FileDialog var7 = new FileDialog(var6x, var0, var5 ? 1 : 0);
            var7.setModalityType(ModalityType.APPLICATION_MODAL);
            var7.setMultipleMode(var4);
            var7.setAutoRequestFocus(true);
            var7.setAlwaysOnTop(true);
            if (var1 != null) {
               var7.setDirectory(var1.isDirectory() ? var1.getAbsolutePath() : var1.getParent());
            }

            if (var3.length > 0) {
               var7.setFilenameFilter((var1xx, var2xx) -> {
                  String var3xx = var2xx.toLowerCase();

                  for (String var7x : var3) {
                     if (var3xx.endsWith("." + var7x.toLowerCase())) {
                        return true;
                     }
                  }

                  return false;
               });
            }

            var7.addWindowListener(new WindowAdapter() {
               @Override
               public void windowOpened(WindowEvent var1) {
                  var7.toFront();
                  var7.requestFocus();
               }
            });
            var7.setVisible(true);
            File[] var8x = var7.getFiles();
            var6.set(var8x != null && var8x.length != 0 ? var8x : null);
            var6x.dispose();
         });
      } catch (Throwable var8) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.warn("AWT file dialog fallback failed", var8);
         RCORRCRRRHCHOCHHHCHHOOOIRCHCHH();
         var6.set(null);
      }

      return (File[])var6.get();
   }

   private static void RCORRCRRRHCHOCHHHCHHOOOIRCHCHH() {
      if (RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isLinux()) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$schedule(
               () -> IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR,
                     "Lunar Client",
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("popups", "fileDialogUnavailable")
                  )
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.BOTTOM_RIGHT
                  )
            );
      }
   }

   public static File RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, File var1, String var2, String... var3) {
      String var4;
      try {
         if (!OORHIRCRHHOCHRROROOCOIICHOCOHO()) {
            throw new UnsupportedOperationException("TinyFD has no usable backend");
         }

         var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2, var3, false, false);
      } catch (Throwable var7) {
         File[] var6 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1, var2, var3, false, false);
         return var6 != null && var6.length > 0 ? var6[0] : null;
      }

      return var4 == null ? null : new File(var4);
   }

   public static File[] IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var0, File var1, String var2, String... var3) {
      String var4;
      try {
         if (!OORHIRCRHHOCHRROROOCOIICHOCOHO()) {
            throw new UnsupportedOperationException("TinyFD has no usable backend");
         }

         var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2, var3, true, false);
      } catch (Throwable var8) {
         return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1, var2, var3, true, false);
      }

      if (var4 == null) {
         return null;
      }

      String[] var5 = var4.split("\\|");
      File[] var6 = new File[var5.length];

      for (int var7 = 0; var7 < var5.length; var7++) {
         var6[var7] = new File(var5[var7]);
      }

      return var6;
   }

   public static File HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var0, File var1, String var2, String... var3) {
      String var4;
      try {
         if (!OORHIRCRHHOCHRROROOCOIICHOCOHO()) {
            throw new UnsupportedOperationException("TinyFD has no usable backend");
         }

         var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2, var3, false, true);
      } catch (Throwable var7) {
         File[] var6 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1, var2, var3, false, true);
         return var6 != null && var6.length > 0 ? var6[0] : null;
      }

      return var4 == null ? null : new File(var4);
   }
}
