package io.sigpipe.jbsdiff.ui;

import io.sigpipe.jbsdiff.DefaultDiffSettings;
import io.sigpipe.jbsdiff.Diff;
import io.sigpipe.jbsdiff.Patch;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileUI {
   public static void diff(File var0, File var1, File var2) {
      diff(var0, var1, var2, "bzip2");
   }

   public static void diff(File var0, File var1, File var2, String var3) {
      FileInputStream var4 = new FileInputStream(var0);
      byte[] var5 = new byte[(int)var0.length()];
      var4.read(var5);
      var4.close();
      FileInputStream var6 = new FileInputStream(var1);
      byte[] var7 = new byte[(int)var1.length()];
      var6.read(var7);
      var6.close();
      FileOutputStream var8 = new FileOutputStream(var2);
      DefaultDiffSettings var9 = new DefaultDiffSettings(var3);
      Diff.diff(var5, var7, var8, var9);
      var8.close();
   }

   public static void patch(File var0, File var1, File var2) {
      FileInputStream var3 = new FileInputStream(var0);
      byte[] var4 = new byte[(int)var0.length()];
      var3.read(var4);
      var3.close();
      FileInputStream var5 = new FileInputStream(var2);
      byte[] var6 = new byte[(int)var2.length()];
      var5.read(var6);
      var5.close();
      FileOutputStream var7 = new FileOutputStream(var1);
      Patch.patch(var4, var6, var7);
      var7.close();
   }
}
