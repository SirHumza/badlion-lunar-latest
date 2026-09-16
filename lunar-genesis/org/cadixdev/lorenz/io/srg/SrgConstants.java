package org.cadixdev.lorenz.io.srg;

import java.util.regex.Pattern;

public final class SrgConstants {
   private static final Pattern HASH_COMMENT = Pattern.compile("#.*");
   public static final String STANDARD_EXTENSION = "srg";

   public static String removeComments(String var0) {
      return HASH_COMMENT.matcher(var0).replaceAll("");
   }

   private SrgConstants() {
   }

   public static final class CSrg {
      public static final String STANDARD_EXTENSION = "csrg";

      private CSrg() {
      }
   }

   public static final class TSrg {
      public static final String STANDARD_EXTENSION = "tsrg";

      private TSrg() {
      }
   }

   public static final class XSrg {
      public static final String STANDARD_EXTENSION = "xsrg";

      private XSrg() {
      }
   }
}
