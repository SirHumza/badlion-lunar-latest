package net.sourceforge.lame.mp3;

import java.io.CharArrayWriter;
import java.io.PrintWriter;

public class Version {
   private static final String LAME_URL = "http://www.mp3dev.org/";
   private static final int LAME_MAJOR_VERSION = 3;
   private static final int LAME_MINOR_VERSION = 98;
   private static final int LAME_PATCH_VERSION = 4;
   private static final int PSY_MAJOR_VERSION = 0;
   private static final int PSY_MINOR_VERSION = 93;

   public final String getLameVersion() {
      return "3.98.4";
   }

   public final String getLameShortVersion() {
      return "3.98.4";
   }

   public final String getLameVeryShortVersion() {
      return "LAME3.98r";
   }

   public final String getPsyVersion() {
      return "0.93";
   }

   public final String getVersion() {
      CharArrayWriter var1 = new CharArrayWriter();
      PrintWriter var2 = new PrintWriter(var1);
      var2.printf("LAME 32bit version %s (%s)", this.getLameVersion(), "http://www.mp3dev.org/");
      return var1.toString();
   }
}
