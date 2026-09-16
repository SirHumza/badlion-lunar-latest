package org.apache.commons.cli;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class TypeHandler {
   public static Object createValue(String var0, Object var1) {
      return createValue(var0, (Class)var1);
   }

   public static Object createValue(String var0, Class var1) {
      if (PatternOptionBuilder.STRING_VALUE == var1) {
         return var0;
      } else if (PatternOptionBuilder.OBJECT_VALUE == var1) {
         return createObject(var0);
      } else if (PatternOptionBuilder.NUMBER_VALUE == var1) {
         return createNumber(var0);
      } else if (PatternOptionBuilder.DATE_VALUE == var1) {
         return createDate(var0);
      } else if (PatternOptionBuilder.CLASS_VALUE == var1) {
         return createClass(var0);
      } else if (PatternOptionBuilder.FILE_VALUE == var1) {
         return createFile(var0);
      } else if (PatternOptionBuilder.EXISTING_FILE_VALUE == var1) {
         return createFile(var0);
      } else if (PatternOptionBuilder.FILES_VALUE == var1) {
         return createFiles(var0);
      } else {
         return PatternOptionBuilder.URL_VALUE == var1 ? createURL(var0) : null;
      }
   }

   public static Object createObject(String var0) {
      Class var1 = null;

      try {
         var1 = Class.forName(var0);
      } catch (ClassNotFoundException var5) {
         throw new ParseException("Unable to find the class: " + var0);
      }

      Object var2 = null;

      try {
         return var1.newInstance();
      } catch (Exception var4) {
         throw new ParseException(var4.getClass().getName() + "; Unable to create an instance of: " + var0);
      }
   }

   public static Number createNumber(String var0) {
      try {
         return var0.indexOf(46) != -1 ? Double.valueOf(var0) : Long.valueOf(var0);
      } catch (NumberFormatException var2) {
         throw new ParseException(var2.getMessage());
      }
   }

   public static Class createClass(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         throw new ParseException("Unable to find the class: " + var0);
      }
   }

   public static Date createDate(String var0) {
      throw new UnsupportedOperationException("Not yet implemented");
   }

   public static URL createURL(String var0) {
      try {
         return new URL(var0);
      } catch (MalformedURLException var2) {
         throw new ParseException("Unable to parse the URL: " + var0);
      }
   }

   public static File createFile(String var0) {
      return new File(var0);
   }

   public static File[] createFiles(String var0) {
      throw new UnsupportedOperationException("Not yet implemented");
   }
}
