package net.coffeebunny.rpc.util;

import com.sun.jna.Native;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import net.coffeebunny.rpc.DiscordRPC;

public class UtilRPC {
   private static String localPath;
   private static String tempPath;

   public static String getLocalPath() {
      return localPath;
   }

   public static String getTempPath() {
      return tempPath;
   }

   public static DiscordRPC initialize() {
      loadDLL();
      return (DiscordRPC)Native.loadLibrary("discord-rpc", DiscordRPC.class);
   }

   private static void loadDLL() {
      String name = System.mapLibraryName("discord-rpc");
      String tempPath;
      String dir;
      if (UtilOS.isMac()) {
         File homeDir = new File(System.getProperty("user.home") + File.separator + "Library" + File.separator + "Application Support" + File.separator);
         dir = "darwin";
         tempPath = homeDir + File.separator + "discord-rpc" + File.separator + name;
      } else if (UtilOS.isWindows()) {
         File homeDir = new File(System.getenv("TEMP"));
         dir = System.getProperty("sun.arch.data.model").equals("64") ? "win32-x86-64" : "win32-x86";
         tempPath = homeDir + File.separator + "discord-rpc" + File.separator + name;
      } else {
         File homeDir = new File(System.getProperty("user.home"), ".discord-rpc");
         dir = "linux-x86-64";
         tempPath = homeDir + File.separator + name;
      }

      String localPath = "/" + dir + "/" + name;
      UtilRPC.localPath = localPath;
      UtilRPC.tempPath = tempPath;
      File file = new File(tempPath);

      try (
         InputStream in = DiscordRPC.class.getResourceAsStream(localPath);
         OutputStream out = openOutputStream(file);
      ) {
         copyFile(in, out);
         file.deleteOnExit();
      } catch (IOException e) {
         e.printStackTrace();
      }

      System.load(file.getAbsolutePath());
   }

   private static void copyFile(InputStream input, OutputStream output) throws IOException {
      byte[] buffer = new byte[4096];

      int n;
      while (-1 != (n = input.read(buffer))) {
         output.write(buffer, 0, n);
      }
   }

   private static FileOutputStream openOutputStream(File file) throws IOException {
      if (file.exists()) {
         if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
         }

         if (!file.canWrite()) {
            throw new IOException("File '" + file + "' cannot be written to");
         }
      } else {
         File parent = file.getParentFile();
         if (parent != null && !parent.mkdirs() && !parent.isDirectory()) {
            throw new IOException("Directory '" + parent + "' could not be created");
         }
      }

      return new FileOutputStream(file);
   }
}
