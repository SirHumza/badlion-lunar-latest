package org.json;

import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;

public class XML {
   public static final Character AMP = '&';
   public static final Character APOS = '\'';
   public static final Character BANG = '!';
   public static final Character EQ = '=';
   public static final Character GT = '>';
   public static final Character LT = '<';
   public static final Character QUEST = '?';
   public static final Character QUOT = '"';
   public static final Character SLASH = '/';

   private static Iterable<Integer> codePointIterator(final String var0) {
      return new Iterable<Integer>() {
         @Override
         public Iterator<Integer> iterator() {
            return new Iterator<Integer>() {
               private int nextIndex = 0;
               private int length = var0.length();

               @Override
               public boolean hasNext() {
                  return this.nextIndex < this.length;
               }

               public Integer next() {
                  int var1 = var0.codePointAt(this.nextIndex);
                  this.nextIndex = this.nextIndex + Character.charCount(var1);
                  return var1;
               }

               @Override
               public void remove() {
                  throw new UnsupportedOperationException();
               }
            };
         }
      };
   }

   public static String escape(String var0) {
      StringBuilder var1 = new StringBuilder(var0.length());

      for (int var3 : codePointIterator(var0)) {
         switch (var3) {
            case 34:
               var1.append("&quot;");
               break;
            case 38:
               var1.append("&amp;");
               break;
            case 39:
               var1.append("&apos;");
               break;
            case 60:
               var1.append("&lt;");
               break;
            case 62:
               var1.append("&gt;");
               break;
            default:
               if (mustEscape(var3)) {
                  var1.append("&#x");
                  var1.append(Integer.toHexString(var3));
                  var1.append(';');
               } else {
                  var1.appendCodePoint(var3);
               }
         }
      }

      return var1.toString();
   }

   private static boolean mustEscape(int var0) {
      return Character.isISOControl(var0) && var0 != 9 && var0 != 10 && var0 != 13
         || (var0 < 32 || var0 > 55295) && (var0 < 57344 || var0 > 65533) && (var0 < 65536 || var0 > 1114111);
   }

   public static String unescape(String var0) {
      StringBuilder var1 = new StringBuilder(var0.length());
      int var2 = 0;

      for (int var3 = var0.length(); var2 < var3; var2++) {
         char var4 = var0.charAt(var2);
         if (var4 == '&') {
            int var5 = var0.indexOf(59, var2);
            if (var5 > var2) {
               String var6 = var0.substring(var2 + 1, var5);
               var1.append(XMLTokener.unescapeEntity(var6));
               var2 += var6.length() + 1;
            } else {
               var1.append(var4);
            }
         } else {
            var1.append(var4);
         }
      }

      return var1.toString();
   }

   public static void noSpace(String var0) {
      int var2 = var0.length();
      if (var2 == 0) {
         throw new JSONException("Empty string.");
      }

      for (int var1 = 0; var1 < var2; var1++) {
         if (Character.isWhitespace(var0.charAt(var1))) {
            throw new JSONException("'" + var0 + "' contains a space character.");
         }
      }
   }

   private static boolean parse(XMLTokener var0, JSONObject var1, String var2, boolean var3) {
      JSONObject var6 = null;
      Object var9 = var0.nextToken();
      if (var9 == BANG) {
         char var4 = var0.next();
         if (var4 == '-') {
            if (var0.next() == '-') {
               var0.skipPast("-->");
               return false;
            }

            var0.back();
         } else if (var4 == '[') {
            var9 = var0.nextToken();
            if ("CDATA".equals(var9) && var0.next() == '[') {
               String var12 = var0.nextCDATA();
               if (var12.length() > 0) {
                  var1.accumulate("content", var12);
               }

               return false;
            }

            throw var0.syntaxError("Expected 'CDATA['");
         }

         int var5 = 1;

         do {
            var9 = var0.nextMeta();
            if (var9 == null) {
               throw var0.syntaxError("Missing '>' after '<!'.");
            }

            if (var9 == LT) {
               var5++;
            } else if (var9 == GT) {
               var5--;
            }
         } while (var5 > 0);

         return false;
      } else {
         if (var9 == QUEST) {
            var0.skipPast("?>");
            return false;
         }

         if (var9 == SLASH) {
            var9 = var0.nextToken();
            if (var2 == null) {
               throw var0.syntaxError("Mismatched close tag " + var9);
            } else if (!var9.equals(var2)) {
               throw var0.syntaxError("Mismatched " + var2 + " and " + var9);
            } else if (var0.nextToken() != GT) {
               throw var0.syntaxError("Misshaped close tag");
            } else {
               return true;
            }
         } else {
            if (var9 instanceof Character) {
               throw var0.syntaxError("Misshaped tag");
            }

            String var8 = (String)var9;
            var9 = null;
            var6 = new JSONObject();

            while (true) {
               if (var9 == null) {
                  var9 = var0.nextToken();
               }

               if (!(var9 instanceof String)) {
                  if (var9 == SLASH) {
                     if (var0.nextToken() != GT) {
                        throw var0.syntaxError("Misshaped tag");
                     }

                     if (var6.length() > 0) {
                        var1.accumulate(var8, var6);
                     } else {
                        var1.accumulate(var8, "");
                     }

                     return false;
                  }

                  if (var9 != GT) {
                     throw var0.syntaxError("Misshaped tag");
                  }

                  while (true) {
                     var9 = var0.nextContent();
                     if (var9 == null) {
                        if (var8 != null) {
                           throw var0.syntaxError("Unclosed tag " + var8);
                        }

                        return false;
                     }

                     if (var9 instanceof String) {
                        String var11 = (String)var9;
                        if (var11.length() > 0) {
                           var6.accumulate("content", var3 ? var11 : stringToValue(var11));
                        }
                     } else if (var9 == LT && parse(var0, var6, var8, var3)) {
                        if (var6.length() == 0) {
                           var1.accumulate(var8, "");
                        } else if (var6.length() == 1 && var6.opt("content") != null) {
                           var1.accumulate(var8, var6.opt("content"));
                        } else {
                           var1.accumulate(var8, var6);
                        }

                        return false;
                     }
                  }
               }

               String var7 = (String)var9;
               var9 = var0.nextToken();
               if (var9 == EQ) {
                  var9 = var0.nextToken();
                  if (!(var9 instanceof String)) {
                     throw var0.syntaxError("Missing value");
                  }

                  var6.accumulate(var7, var3 ? (String)var9 : stringToValue((String)var9));
                  var9 = null;
               } else {
                  var6.accumulate(var7, "");
               }
            }
         }
      }
   }

   public static Object stringToValue(String var0) {
      if (var0.equals("")) {
         return var0;
      }

      if (var0.equalsIgnoreCase("true")) {
         return Boolean.TRUE;
      }

      if (var0.equalsIgnoreCase("false")) {
         return Boolean.FALSE;
      }

      if (var0.equalsIgnoreCase("null")) {
         return JSONObject.NULL;
      }

      char var1 = var0.charAt(0);
      if (var1 >= '0' && var1 <= '9' || var1 == '-') {
         try {
            if (var0.indexOf(46) <= -1 && var0.indexOf(101) <= -1 && var0.indexOf(69) <= -1 && !"-0".equals(var0)) {
               Long var4 = Long.valueOf(var0);
               if (var0.equals(var4.toString())) {
                  if (var4 == var4.intValue()) {
                     return var4.intValue();
                  }

                  return var4;
               }
            } else {
               Double var2 = Double.valueOf(var0);
               if (!var2.isInfinite() && !var2.isNaN()) {
                  return var2;
               }
            }
         } catch (Exception var3) {
         }
      }

      return var0;
   }

   public static JSONObject toJSONObject(String var0) {
      return toJSONObject(var0, false);
   }

   public static JSONObject toJSONObject(Reader var0) {
      return toJSONObject(var0, false);
   }

   public static JSONObject toJSONObject(Reader var0, boolean var1) {
      JSONObject var2 = new JSONObject();
      XMLTokener var3 = new XMLTokener(var0);

      while (var3.more()) {
         var3.skipPast("<");
         if (var3.more()) {
            parse(var3, var2, null, var1);
         }
      }

      return var2;
   }

   public static JSONObject toJSONObject(String var0, boolean var1) {
      return toJSONObject(new StringReader(var0), var1);
   }

   public static String toString(Object var0) {
      return toString(var0, null);
   }

   public static String toString(Object var0, String var1) {
      StringBuilder var2 = new StringBuilder();
      if (var0 instanceof JSONObject) {
         if (var1 != null) {
            var2.append('<');
            var2.append(var1);
            var2.append('>');
         }

         JSONObject var4 = (JSONObject)var0;

         for (String var15 : var4.keySet()) {
            Object var16 = var4.opt(var15);
            if (var16 == null) {
               var16 = "";
            } else if (var16.getClass().isArray()) {
               var16 = new JSONArray(var16);
            }

            if ("content".equals(var15)) {
               if (var16 instanceof JSONArray) {
                  JSONArray var13 = (JSONArray)var16;
                  int var17 = var13.length();

                  for (int var18 = 0; var18 < var17; var18++) {
                     if (var18 > 0) {
                        var2.append('\n');
                     }

                     Object var19 = var13.opt(var18);
                     var2.append(escape(var19.toString()));
                  }
               } else {
                  var2.append(escape(var16.toString()));
               }
            } else if (var16 instanceof JSONArray) {
               JSONArray var12 = (JSONArray)var16;
               int var9 = var12.length();

               for (int var10 = 0; var10 < var9; var10++) {
                  Object var11 = var12.opt(var10);
                  if (var11 instanceof JSONArray) {
                     var2.append('<');
                     var2.append(var15);
                     var2.append('>');
                     var2.append(toString(var11));
                     var2.append("</");
                     var2.append(var15);
                     var2.append('>');
                  } else {
                     var2.append(toString(var11, var15));
                  }
               }
            } else if ("".equals(var16)) {
               var2.append('<');
               var2.append(var15);
               var2.append("/>");
            } else {
               var2.append(toString(var16, var15));
            }
         }

         if (var1 != null) {
            var2.append("</");
            var2.append(var1);
            var2.append('>');
         }

         return var2.toString();
      } else {
         if (var0 == null || !(var0 instanceof JSONArray) && !var0.getClass().isArray()) {
            String var5 = var0 == null ? "null" : escape(var0.toString());
            return var1 == null ? "\"" + var5 + "\"" : (var5.length() == 0 ? "<" + var1 + "/>" : "<" + var1 + ">" + var5 + "</" + var1 + ">");
         }

         JSONArray var3;
         if (var0.getClass().isArray()) {
            var3 = new JSONArray(var0);
         } else {
            var3 = (JSONArray)var0;
         }

         int var6 = var3.length();

         for (int var7 = 0; var7 < var6; var7++) {
            Object var8 = var3.opt(var7);
            var2.append(toString(var8, var1 == null ? "array" : var1));
         }

         return var2.toString();
      }
   }
}
