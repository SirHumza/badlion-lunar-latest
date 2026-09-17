package com.batmod.installer;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class BatModInstaller {
   private static final SimpleDateFormat CustomSpinner = new SimpleDateFormat(
      "HH:mm:ss"
   );
   public static final String BatModInstaller = "1.0";
   public static final String Button = "BatModInstaller/1.0";
   private static Logger ButtonAction;
   private ExitCode Spinner;
   private InstallationLogger Checkbox;
   private Logger ProgressBar;

   public static String BatModInstaller() {
      return CustomSpinner.format(new Date());
   }

   public static void BatModInstaller(String var0) {
      System.out.println("[" + BatModInstaller() + "] [INFO] " + var0);
   }

   public static void Button(String var0) {
      System.out.println("[" + BatModInstaller() + "] [WARN] " + var0);
   }

   public static void CustomSpinner(String var0) {
      System.out.println("[" + BatModInstaller() + "] [ERROR] " + var0);
   }

   public BatModInstaller() {
      ButtonAction = this;
      this.Checkbox();
   }

   private void Checkbox() {
      this.Spinner = new ExitCode();
      this.Checkbox = new InstallationLogger();
      this.BatModInstaller(
         new IntegerSpinner()
      );
   }

   public static BatModInstaller Button() {
      return ButtonAction;
   }

   public BatModInstaller CustomSpinner() {
      return this.ProgressBar;
   }

   public ExitCode ButtonAction() {
      return this.Spinner;
   }

   public InstallationLogger Spinner() {
      return this.Checkbox;
   }

   public void BatModInstaller(
      BatModInstaller var1
   ) {
      try {
         this.ProgressBar = var1;
         var1.BatModInstaller();
         var1.Button().repaint();
         var1.Button().setVisible(true);
      } catch (Exception var3) {
         var3.printStackTrace();
         BatModInstaller(1, var3);
      }
   }

   public static void BatModInstaller(int var0) {
      BatModInstaller(var0, null);
   }

   public static void BatModInstaller(int var0, Exception var1) {
      BatModInstaller var2 = Button()
         .CustomSpinner();
      if (var0 == 0) {
         int var3 = JOptionPane.showConfirmDialog(
            var2.Button(),
            "Are you sure you want to quit BatMod Installer?",
            "BatMod Installer",
            0
         );
         if (var3 == 1) {
            return;
         }
      }

      if (var0 == 1) {
         if (var2 != null) {
            var2.Button().setVisible(false);
         }

         String var6 = var1.getClass().getName();
         String var4 = var1.getLocalizedMessage();
         int var5 = JOptionPane.showConfirmDialog(
            var2 == null ? null : var2.Button(),
            "<html>Could not install BatMod for Minecraft.<br>Please contact support with the following information:<br><br>Exit Code: "
               + var0
               + "<br>Exception: "
               + (var4 != null ? var6 + ": " + var4 : var6)
               + "<br><br><a href=\"https://batmod.com/support\">www.batmod.com/support</a></html>",
            "BatMod Installer",
            -1,
            0
         );
         if (var5 == -1 && var2 != null) {
            var2.Button().dispose();
         }
      }

      System.exit(var0);
   }
}
