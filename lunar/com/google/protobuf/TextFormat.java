package com.google.protobuf;

import java.io.IOException;
import java.lang.Character.UnicodeBlock;
import java.math.BigInteger;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class TextFormat {
   private static final Logger logger = Logger.getLogger(TextFormat.class.getName());
   private static final String DEBUG_STRING_SILENT_MARKER = "\t ";
   private static final TextFormat.Parser PARSER = TextFormat.Parser.newBuilder().build();

   private TextFormat() {
   }

   @Deprecated
   @InlineMe(replacement = "TextFormat.printer().print(message, output)", imports = "com.google.protobuf.TextFormat")
   public static void print(MessageOrBuilder var0, Appendable var1) {
      printer().print(var0, var1);
   }

   @Deprecated
   public static void print(UnknownFieldSet var0, Appendable var1) {
      printer().print(var0, var1);
   }

   @Deprecated
   @InlineMe(replacement = "TextFormat.printer().escapingNonAscii(false).print(message, output)", imports = "com.google.protobuf.TextFormat")
   public static void printUnicode(MessageOrBuilder var0, Appendable var1) {
      printer().escapingNonAscii(false).print(var0, var1);
   }

   @Deprecated
   public static void printUnicode(UnknownFieldSet var0, Appendable var1) {
      printer().escapingNonAscii(false).print(var0, var1);
   }

   public static String shortDebugString(MessageOrBuilder var0) {
      return printer().shortDebugString(var0);
   }

   @Deprecated
   public static String shortDebugString(Descriptors.FieldDescriptor var0, Object var1) {
      return printer().shortDebugString(var0, var1);
   }

   @Deprecated
   public static String shortDebugString(UnknownFieldSet var0) {
      return printer().shortDebugString(var0);
   }

   @Deprecated
   @InlineMe(replacement = "TextFormat.printer().printToString(message)", imports = "com.google.protobuf.TextFormat")
   public static String printToString(MessageOrBuilder var0) {
      return printer().printToString(var0);
   }

   @Deprecated
   public static String printToString(UnknownFieldSet var0) {
      return printer().printToString(var0);
   }

   @Deprecated
   @InlineMe(replacement = "TextFormat.printer().escapingNonAscii(false).printToString(message)", imports = "com.google.protobuf.TextFormat")
   public static String printToUnicodeString(MessageOrBuilder var0) {
      return printer().escapingNonAscii(false).printToString(var0);
   }

   @Deprecated
   public static String printToUnicodeString(UnknownFieldSet var0) {
      return printer().escapingNonAscii(false).printToString(var0);
   }

   @Deprecated
   public static void printField(Descriptors.FieldDescriptor var0, Object var1, Appendable var2) {
      printer().printField(var0, var1, var2);
   }

   @Deprecated
   public static String printFieldToString(Descriptors.FieldDescriptor var0, Object var1) {
      return printer().printFieldToString(var0, var1);
   }

   @Deprecated
   public static void printUnicodeFieldValue(Descriptors.FieldDescriptor var0, Object var1, Appendable var2) {
      printer().escapingNonAscii(false).printFieldValue(var0, var1, var2);
   }

   @Deprecated
   @InlineMe(replacement = "TextFormat.printer().printFieldValue(field, value, output)", imports = "com.google.protobuf.TextFormat")
   public static void printFieldValue(Descriptors.FieldDescriptor var0, Object var1, Appendable var2) {
      printer().printFieldValue(var0, var1, var2);
   }

   public static void printUnknownFieldValue(int var0, Object var1, Appendable var2) {
      printUnknownFieldValue(var0, var1, multiLineOutput(var2));
   }

   private static void printUnknownFieldValue(int var0, Object var1, TextFormat.TextGenerator var2) {
      switch (WireFormat.getTagWireType(var0)) {
         case 0:
            var2.print(unsignedToString((Long)var1));
            break;
         case 1:
            var2.print(String.format((Locale)null, "0x%016x", (Long)var1));
            break;
         case 2:
            try {
               UnknownFieldSet var3 = UnknownFieldSet.parseFrom((ByteString)var1);
               var2.print("{");
               var2.eol();
               var2.indent();
               TextFormat.Printer.printUnknownFields(var3, var2);
               var2.outdent();
               var2.print("}");
            } catch (InvalidProtocolBufferException var4) {
               var2.print("\"");
               var2.print(escapeBytes((ByteString)var1));
               var2.print("\"");
            }
            break;
         case 3:
            TextFormat.Printer.printUnknownFields((UnknownFieldSet)var1, var2);
            break;
         case 4:
         default:
            throw new IllegalArgumentException("Bad tag: " + var0);
         case 5:
            var2.print(String.format((Locale)null, "0x%08x", (Integer)var1));
      }
   }

   public static TextFormat.Printer printer() {
      return TextFormat.Printer.DEFAULT;
   }

   public static String unsignedToString(int var0) {
      return var0 >= 0 ? Integer.toString(var0) : Long.toString(var0 & 4294967295L);
   }

   public static String unsignedToString(long var0) {
      return var0 >= 0L ? Long.toString(var0) : BigInteger.valueOf(var0 & Long.MAX_VALUE).setBit(63).toString();
   }

   private static TextFormat.TextGenerator multiLineOutput(Appendable var0) {
      return new TextFormat.TextGenerator(var0, false);
   }

   private static TextFormat.TextGenerator singleLineOutput(Appendable var0) {
      return new TextFormat.TextGenerator(var0, true);
   }

   public static TextFormat.Parser getParser() {
      return PARSER;
   }

   public static void merge(Readable var0, Message.Builder var1) {
      PARSER.merge(var0, var1);
   }

   public static void merge(CharSequence var0, Message.Builder var1) {
      PARSER.merge(var0, var1);
   }

   public static <T extends Message> T parse(CharSequence var0, Class<T> var1) {
      Message.Builder var2 = Internal.<Message>getDefaultInstance(var1).newBuilderForType();
      merge(var0, var2);
      return (T)var2.build();
   }

   public static void merge(Readable var0, ExtensionRegistry var1, Message.Builder var2) {
      PARSER.merge(var0, var1, var2);
   }

   public static void merge(CharSequence var0, ExtensionRegistry var1, Message.Builder var2) {
      PARSER.merge(var0, var1, var2);
   }

   public static <T extends Message> T parse(CharSequence var0, ExtensionRegistry var1, Class<T> var2) {
      Message.Builder var3 = Internal.<Message>getDefaultInstance(var2).newBuilderForType();
      merge(var0, var1, var3);
      return (T)var3.build();
   }

   public static String escapeBytes(ByteString var0) {
      return TextFormatEscaper.escapeBytes(var0);
   }

   public static String escapeBytes(byte[] var0) {
      return TextFormatEscaper.escapeBytes(var0);
   }

   public static ByteString unescapeBytes(CharSequence var0) {
      ByteString var1 = ByteString.copyFromUtf8(var0.toString());
      byte[] var2 = new byte[var1.size()];
      int var3 = 0;

      for (int var4 = 0; var4 < var1.size(); var4++) {
         byte var5 = var1.byteAt(var4);
         if (var5 != 92) {
            var2[var3++] = var5;
         } else {
            if (var4 + 1 >= var1.size()) {
               throw new TextFormat.InvalidEscapeSequenceException("Invalid escape sequence: '\\' at end of string.");
            }

            var5 = var1.byteAt(++var4);
            if (isOctal(var5)) {
               int var15 = digitValue(var5);
               if (var4 + 1 < var1.size() && isOctal(var1.byteAt(var4 + 1))) {
                  var15 = var15 * 8 + digitValue(var1.byteAt(++var4));
               }

               if (var4 + 1 < var1.size() && isOctal(var1.byteAt(var4 + 1))) {
                  var15 = var15 * 8 + digitValue(var1.byteAt(++var4));
               }

               var2[var3++] = (byte)var15;
            } else {
               switch (var5) {
                  case 34:
                     var2[var3++] = 34;
                     break;
                  case 39:
                     var2[var3++] = 39;
                     break;
                  case 63:
                     var2[var3++] = 63;
                     break;
                  case 85:
                     if (++var4 + 7 >= var1.size()) {
                        throw new TextFormat.InvalidEscapeSequenceException("Invalid escape sequence: '\\U' with too few hex chars");
                     }

                     int var16 = 0;

                     for (int var17 = var4; var17 < var4 + 8; var17++) {
                        byte var9 = var1.byteAt(var17);
                        if (!isHex(var9)) {
                           throw new TextFormat.InvalidEscapeSequenceException("Invalid escape sequence: '\\U' with too few hex chars");
                        }

                        var16 = var16 << 4 | digitValue(var9);
                     }

                     if (!Character.isValidCodePoint(var16)) {
                        throw new TextFormat.InvalidEscapeSequenceException(
                           "Invalid escape sequence: '\\U" + var1.substring(var4, var4 + 8).toStringUtf8() + "' is not a valid code point value"
                        );
                     }

                     UnicodeBlock var18 = UnicodeBlock.of(var16);
                     if (var18 != null
                        && (
                           var18.equals(UnicodeBlock.LOW_SURROGATES)
                              || var18.equals(UnicodeBlock.HIGH_SURROGATES)
                              || var18.equals(UnicodeBlock.HIGH_PRIVATE_USE_SURROGATES)
                        )) {
                        throw new TextFormat.InvalidEscapeSequenceException(
                           "Invalid escape sequence: '\\U" + var1.substring(var4, var4 + 8).toStringUtf8() + "' refers to a surrogate code unit"
                        );
                     }

                     int[] var19 = new int[]{var16};
                     byte[] var10 = new String(var19, 0, 1).getBytes(Internal.UTF_8);
                     System.arraycopy(var10, 0, var2, var3, var10.length);
                     var3 += var10.length;
                     var4 += 7;
                     break;
                  case 92:
                     var2[var3++] = 92;
                     break;
                  case 97:
                     var2[var3++] = 7;
                     break;
                  case 98:
                     var2[var3++] = 8;
                     break;
                  case 102:
                     var2[var3++] = 12;
                     break;
                  case 110:
                     var2[var3++] = 10;
                     break;
                  case 114:
                     var2[var3++] = 13;
                     break;
                  case 116:
                     var2[var3++] = 9;
                     break;
                  case 117:
                     var4++;
                     if (var4 + 3 >= var1.size()
                        || !isHex(var1.byteAt(var4))
                        || !isHex(var1.byteAt(var4 + 1))
                        || !isHex(var1.byteAt(var4 + 2))
                        || !isHex(var1.byteAt(var4 + 3))) {
                        throw new TextFormat.InvalidEscapeSequenceException("Invalid escape sequence: '\\u' with too few hex chars");
                     }

                     char var7 = (char)(
                        digitValue(var1.byteAt(var4)) << 12
                           | digitValue(var1.byteAt(var4 + 1)) << 8
                           | digitValue(var1.byteAt(var4 + 2)) << 4
                           | digitValue(var1.byteAt(var4 + 3))
                     );
                     if (var7 >= '\ud800' && var7 <= '\udfff') {
                        throw new TextFormat.InvalidEscapeSequenceException("Invalid escape sequence: '\\u' refers to a surrogate");
                     }

                     byte[] var8 = Character.toString(var7).getBytes(Internal.UTF_8);
                     System.arraycopy(var8, 0, var2, var3, var8.length);
                     var3 += var8.length;
                     var4 += 3;
                     break;
                  case 118:
                     var2[var3++] = 11;
                     break;
                  case 120:
                     int var6 = 0;
                     if (var4 + 1 >= var1.size() || !isHex(var1.byteAt(var4 + 1))) {
                        throw new TextFormat.InvalidEscapeSequenceException("Invalid escape sequence: '\\x' with no digits");
                     }

                     var6 = digitValue(var1.byteAt(++var4));
                     if (var4 + 1 < var1.size() && isHex(var1.byteAt(var4 + 1))) {
                        var6 = var6 * 16 + digitValue(var1.byteAt(++var4));
                     }

                     var2[var3++] = (byte)var6;
                     break;
                  default:
                     throw new TextFormat.InvalidEscapeSequenceException("Invalid escape sequence: '\\" + (char)var5 + '\'');
               }
            }
         }
      }

      return var2.length == var3 ? ByteString.wrap(var2) : ByteString.copyFrom(var2, 0, var3);
   }

   static String escapeText(String var0) {
      return escapeBytes(ByteString.copyFromUtf8(var0));
   }

   public static String escapeDoubleQuotesAndBackslashes(String var0) {
      return TextFormatEscaper.escapeDoubleQuotesAndBackslashes(var0);
   }

   static String unescapeText(String var0) {
      return unescapeBytes(var0).toStringUtf8();
   }

   private static boolean isOctal(byte var0) {
      return 48 <= var0 && var0 <= 55;
   }

   private static boolean isHex(byte var0) {
      return 48 <= var0 && var0 <= 57 || 97 <= var0 && var0 <= 102 || 65 <= var0 && var0 <= 70;
   }

   private static int digitValue(byte var0) {
      if (48 <= var0 && var0 <= 57) {
         return var0 - 48;
      } else {
         return 97 <= var0 && var0 <= 122 ? var0 - 97 + 10 : var0 - 65 + 10;
      }
   }

   static int parseInt32(String var0) {
      return (int)parseInteger(var0, true, false);
   }

   static int parseUInt32(String var0) {
      return (int)parseInteger(var0, false, false);
   }

   static long parseInt64(String var0) {
      return parseInteger(var0, true, true);
   }

   static long parseUInt64(String var0) {
      return parseInteger(var0, false, true);
   }

   private static long parseInteger(String var0, boolean var1, boolean var2) {
      int var3 = 0;
      boolean var4 = false;
      if (var0.startsWith("-", var3)) {
         if (!var1) {
            throw new NumberFormatException("Number must be positive: " + var0);
         }

         var3++;
         var4 = true;
      }

      byte var5 = 10;
      if (var0.startsWith("0x", var3)) {
         var3 += 2;
         var5 = 16;
      } else if (var0.startsWith("0", var3)) {
         var5 = 8;
      }

      String var6 = var0.substring(var3);
      long var7 = 0L;
      if (var6.length() < 16) {
         var7 = Long.parseLong(var6, var5);
         if (var4) {
            var7 = -var7;
         }

         if (!var2) {
            if (var1) {
               if (var7 > 2147483647L || var7 < -2147483648L) {
                  throw new NumberFormatException("Number out of range for 32-bit signed integer: " + var0);
               }
            } else if (var7 >= 4294967296L || var7 < 0L) {
               throw new NumberFormatException("Number out of range for 32-bit unsigned integer: " + var0);
            }
         }
      } else {
         BigInteger var9 = new BigInteger(var6, var5);
         if (var4) {
            var9 = var9.negate();
         }

         if (!var2) {
            if (var1) {
               if (var9.bitLength() > 31) {
                  throw new NumberFormatException("Number out of range for 32-bit signed integer: " + var0);
               }
            } else if (var9.bitLength() > 32) {
               throw new NumberFormatException("Number out of range for 32-bit unsigned integer: " + var0);
            }
         } else if (var1) {
            if (var9.bitLength() > 63) {
               throw new NumberFormatException("Number out of range for 64-bit signed integer: " + var0);
            }
         } else if (var9.bitLength() > 64) {
            throw new NumberFormatException("Number out of range for 64-bit unsigned integer: " + var0);
         }

         var7 = var9.longValue();
      }

      return var7;
   }

   public static class InvalidEscapeSequenceException extends IOException {
      private static final long serialVersionUID = -8164033650142593304L;

      InvalidEscapeSequenceException(String var1) {
         super(var1);
      }
   }

   public static class ParseException extends IOException {
      private static final long serialVersionUID = 3196188060225107702L;
      private final int line;
      private final int column;

      public ParseException(String var1) {
         this(-1, -1, var1);
      }

      public ParseException(int var1, int var2, String var3) {
         super(Integer.toString(var1) + ":" + var2 + ": " + var3);
         this.line = var1;
         this.column = var2;
      }

      public int getLine() {
         return this.line;
      }

      public int getColumn() {
         return this.column;
      }
   }

   public static class Parser {
      private final TypeRegistry typeRegistry;
      private final boolean allowUnknownFields;
      private final boolean allowUnknownEnumValues;
      private final boolean allowUnknownExtensions;
      private final TextFormat.Parser.SingularOverwritePolicy singularOverwritePolicy;
      private TextFormatParseInfoTree.Builder parseInfoTreeBuilder;
      private final int recursionLimit;
      private static final int BUFFER_SIZE = 4096;

      private void detectSilentMarker(TextFormat.Tokenizer var1, Descriptors.Descriptor var2, String var3) {
      }

      private Parser(
         TypeRegistry var1,
         boolean var2,
         boolean var3,
         boolean var4,
         TextFormat.Parser.SingularOverwritePolicy var5,
         TextFormatParseInfoTree.Builder var6,
         int var7
      ) {
         this.typeRegistry = var1;
         this.allowUnknownFields = var2;
         this.allowUnknownEnumValues = var3;
         this.allowUnknownExtensions = var4;
         this.singularOverwritePolicy = var5;
         this.parseInfoTreeBuilder = var6;
         this.recursionLimit = var7;
      }

      public static TextFormat.Parser.Builder newBuilder() {
         return new TextFormat.Parser.Builder();
      }

      public void merge(Readable var1, Message.Builder var2) {
         this.merge(var1, ExtensionRegistry.getEmptyRegistry(), var2);
      }

      public void merge(CharSequence var1, Message.Builder var2) {
         this.merge(var1, ExtensionRegistry.getEmptyRegistry(), var2);
      }

      public void merge(Readable var1, ExtensionRegistry var2, Message.Builder var3) {
         this.merge(toStringBuilder(var1), var2, var3);
      }

      private static StringBuilder toStringBuilder(Readable var0) {
         StringBuilder var1 = new StringBuilder();
         CharBuffer var2 = CharBuffer.allocate(4096);

         while (true) {
            int var3 = var0.read(var2);
            if (var3 == -1) {
               return var1;
            }

            Java8Compatibility.flip(var2);
            var1.append(var2, 0, var3);
         }
      }

      private void checkUnknownFields(List<TextFormat.Parser.UnknownField> var1) {
         if (!var1.isEmpty()) {
            StringBuilder var2 = new StringBuilder("Input contains unknown fields and/or extensions:");

            for (TextFormat.Parser.UnknownField var4 : var1) {
               var2.append('\n').append(var4.message);
            }

            if (this.allowUnknownFields) {
               TextFormat.logger.warning(var2.toString());
            } else {
               int var7 = 0;
               if (this.allowUnknownExtensions) {
                  boolean var8 = true;

                  for (TextFormat.Parser.UnknownField var6 : var1) {
                     if (var6.type == TextFormat.Parser.UnknownField.Type.FIELD) {
                        var8 = false;
                        break;
                     }

                     var7++;
                  }

                  if (var8) {
                     TextFormat.logger.warning(var2.toString());
                     return;
                  }
               }

               String[] var9 = ((TextFormat.Parser.UnknownField)var1.get(var7)).message.split(":");
               throw new TextFormat.ParseException(Integer.parseInt(var9[0]), Integer.parseInt(var9[1]), var2.toString());
            }
         }
      }

      public void merge(CharSequence var1, ExtensionRegistry var2, Message.Builder var3) {
         TextFormat.Tokenizer var4 = new TextFormat.Tokenizer(var1);
         MessageReflection.BuilderAdapter var5 = new MessageReflection.BuilderAdapter(var3);
         ArrayList var6 = new ArrayList();

         while (!var4.atEnd()) {
            this.mergeField(var4, var2, var5, var6, this.recursionLimit);
         }

         this.checkUnknownFields(var6);
      }

      private void mergeField(
         TextFormat.Tokenizer var1, ExtensionRegistry var2, MessageReflection.MergeTarget var3, List<TextFormat.Parser.UnknownField> var4, int var5
      ) {
         this.mergeField(var1, var2, var3, this.parseInfoTreeBuilder, var4, var5);
      }

      private void mergeField(
         TextFormat.Tokenizer var1,
         ExtensionRegistry var2,
         MessageReflection.MergeTarget var3,
         TextFormatParseInfoTree.Builder var4,
         List<TextFormat.Parser.UnknownField> var5,
         int var6
      ) {
         Descriptors.FieldDescriptor var7 = null;
         int var9 = var1.getLine();
         int var10 = var1.getColumn();
         Descriptors.Descriptor var11 = var3.getDescriptorForType();
         ExtensionRegistry.ExtensionInfo var12 = null;
         if ("google.protobuf.Any".equals(var11.getFullName()) && var1.tryConsume("[")) {
            if (var6 < 1) {
               throw var1.parseException("Message is nested too deep");
            }

            this.mergeAnyFieldValue(var1, var2, var3, var4, var5, var11, var6 - 1);
         } else {
            String var8;
            if (var1.tryConsume("[")) {
               StringBuilder var13 = new StringBuilder(var1.consumeIdentifier());

               while (var1.tryConsume(".")) {
                  var13.append('.');
                  var13.append(var1.consumeIdentifier());
               }

               var8 = var13.toString();
               var12 = var3.findExtensionByName(var2, var8);
               if (var12 == null) {
                  String var14 = var1.getPreviousLine() + 1 + ":" + (var1.getPreviousColumn() + 1) + ":\t" + var11.getFullName() + ".[" + var8 + "]";
                  var5.add(new TextFormat.Parser.UnknownField(var14, TextFormat.Parser.UnknownField.Type.EXTENSION));
               } else {
                  if (var12.descriptor.getContainingType() != var11) {
                     throw var1.parseExceptionPreviousToken("Extension \"" + var8 + "\" does not extend message type \"" + var11.getFullName() + "\".");
                  }

                  var7 = var12.descriptor;
               }

               var1.consume("]");
            } else {
               var8 = var1.consumeIdentifier();
               var7 = var11.findFieldByName(var8);
               if (var7 == null) {
                  String var15 = var8.toLowerCase(Locale.US);
                  var7 = var11.findFieldByName(var15);
                  if (var7 != null && var7.getType() != Descriptors.FieldDescriptor.Type.GROUP) {
                     var7 = null;
                  }
               }

               if (var7 != null && var7.getType() == Descriptors.FieldDescriptor.Type.GROUP && !var7.getMessageType().getName().equals(var8)) {
                  var7 = null;
               }

               if (var7 == null) {
                  String var16 = var1.getPreviousLine() + 1 + ":" + (var1.getPreviousColumn() + 1) + ":\t" + var11.getFullName() + "." + var8;
                  var5.add(new TextFormat.Parser.UnknownField(var16, TextFormat.Parser.UnknownField.Type.FIELD));
               }
            }

            if (var7 == null) {
               this.detectSilentMarker(var1, var11, var8);
               this.guessFieldTypeAndSkip(var1, var11, var6);
            } else {
               if (var7.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                  this.detectSilentMarker(var1, var11, var7.getFullName());
                  var1.tryConsume(":");
                  if (var4 != null) {
                     TextFormatParseInfoTree.Builder var17 = var4.getBuilderForSubMessageField(var7);
                     this.consumeFieldValues(var1, var2, var3, var7, var12, var17, var5, var6);
                  } else {
                     this.consumeFieldValues(var1, var2, var3, var7, var12, var4, var5, var6);
                  }
               } else {
                  this.detectSilentMarker(var1, var11, var7.getFullName());
                  var1.consume(":");
                  this.consumeFieldValues(var1, var2, var3, var7, var12, var4, var5, var6);
               }

               if (var4 != null) {
                  var4.setLocation(var7, TextFormatParseLocation.create(var9, var10));
               }

               if (!var1.tryConsume(";")) {
                  var1.tryConsume(",");
               }
            }
         }
      }

      private String consumeFullTypeName(TextFormat.Tokenizer var1) {
         if (!var1.tryConsume("[")) {
            return var1.consumeIdentifier();
         }

         String var2 = var1.consumeIdentifier();

         while (var1.tryConsume(".")) {
            var2 = var2 + "." + var1.consumeIdentifier();
         }

         if (var1.tryConsume("/")) {
            var2 = var2 + "/" + var1.consumeIdentifier();

            while (var1.tryConsume(".")) {
               var2 = var2 + "." + var1.consumeIdentifier();
            }
         }

         var1.consume("]");
         return var2;
      }

      private void consumeFieldValues(
         TextFormat.Tokenizer var1,
         ExtensionRegistry var2,
         MessageReflection.MergeTarget var3,
         Descriptors.FieldDescriptor var4,
         ExtensionRegistry.ExtensionInfo var5,
         TextFormatParseInfoTree.Builder var6,
         List<TextFormat.Parser.UnknownField> var7,
         int var8
      ) {
         if (var4.isRepeated() && var1.tryConsume("[")) {
            if (!var1.tryConsume("]")) {
               while (true) {
                  this.consumeFieldValue(var1, var2, var3, var4, var5, var6, var7, var8);
                  if (var1.tryConsume("]")) {
                     break;
                  }

                  var1.consume(",");
               }
            }
         } else {
            this.consumeFieldValue(var1, var2, var3, var4, var5, var6, var7, var8);
         }
      }

      private void consumeFieldValue(
         TextFormat.Tokenizer var1,
         ExtensionRegistry var2,
         MessageReflection.MergeTarget var3,
         Descriptors.FieldDescriptor var4,
         ExtensionRegistry.ExtensionInfo var5,
         TextFormatParseInfoTree.Builder var6,
         List<TextFormat.Parser.UnknownField> var7,
         int var8
      ) {
         if (this.singularOverwritePolicy == TextFormat.Parser.SingularOverwritePolicy.FORBID_SINGULAR_OVERWRITES && !var4.isRepeated()) {
            if (var3.hasField(var4)) {
               throw var1.parseExceptionPreviousToken("Non-repeated field \"" + var4.getFullName() + "\" cannot be overwritten.");
            }

            if (var4.getContainingOneof() != null && var3.hasOneof(var4.getContainingOneof())) {
               Descriptors.OneofDescriptor var13 = var4.getContainingOneof();
               throw var1.parseExceptionPreviousToken(
                  "Field \""
                     + var4.getFullName()
                     + "\" is specified along with field \""
                     + var3.getOneofFieldDescriptor(var13).getFullName()
                     + "\", another member of oneof \""
                     + var13.getName()
                     + "\"."
               );
            }
         }

         Object var9 = null;
         if (var4.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            if (var8 < 1) {
               throw var1.parseException("Message is nested too deep");
            }

            String var10;
            if (var1.tryConsume("<")) {
               var10 = ">";
            } else {
               var1.consume("{");
               var10 = "}";
            }

            Message var11 = var5 == null ? null : var5.defaultInstance;
            MessageReflection.MergeTarget var12 = var3.newMergeTargetForField(var4, var11);

            while (!var1.tryConsume(var10)) {
               if (var1.atEnd()) {
                  throw var1.parseException("Expected \"" + var10 + "\".");
               }

               this.mergeField(var1, var2, var12, var6, var7, var8 - 1);
            }

            var9 = var12.finish();
         } else {
            switch (var4.getType()) {
               case INT32:
               case SINT32:
               case SFIXED32:
                  var9 = var1.consumeInt32();
                  break;
               case INT64:
               case SINT64:
               case SFIXED64:
                  var9 = var1.consumeInt64();
                  break;
               case BOOL:
                  var9 = var1.consumeBoolean();
                  break;
               case FLOAT:
                  var9 = var1.consumeFloat();
                  break;
               case DOUBLE:
                  var9 = var1.consumeDouble();
                  break;
               case UINT32:
               case FIXED32:
                  var9 = var1.consumeUInt32();
                  break;
               case UINT64:
               case FIXED64:
                  var9 = var1.consumeUInt64();
                  break;
               case STRING:
                  var9 = var1.consumeString();
                  break;
               case BYTES:
                  var9 = var1.consumeByteString();
                  break;
               case ENUM:
                  Descriptors.EnumDescriptor var14 = var4.getEnumType();
                  if (var1.lookingAtInteger()) {
                     int var15 = var1.consumeInt32();
                     var9 = var14.findValueByNumber(var15);
                     if (var9 == null) {
                        String var17 = "Enum type \"" + var14.getFullName() + "\" has no value with number " + var15 + '.';
                        if (this.allowUnknownEnumValues) {
                           TextFormat.logger.warning(var17);
                           return;
                        }

                        throw var1.parseExceptionPreviousToken("Enum type \"" + var14.getFullName() + "\" has no value with number " + var15 + '.');
                     }
                  } else {
                     String var16 = var1.consumeIdentifier();
                     var9 = var14.findValueByName(var16);
                     if (var9 == null) {
                        String var18 = "Enum type \"" + var14.getFullName() + "\" has no value named \"" + var16 + "\".";
                        if (this.allowUnknownEnumValues) {
                           TextFormat.logger.warning(var18);
                           return;
                        }

                        throw var1.parseExceptionPreviousToken(var18);
                     }
                  }
                  break;
               case MESSAGE:
               case GROUP:
                  throw new RuntimeException("Can't get here.");
            }
         }

         if (var4.isRepeated()) {
            var3.addRepeatedField(var4, var9);
         } else {
            var3.setField(var4, var9);
         }
      }

      private void mergeAnyFieldValue(
         TextFormat.Tokenizer var1,
         ExtensionRegistry var2,
         MessageReflection.MergeTarget var3,
         TextFormatParseInfoTree.Builder var4,
         List<TextFormat.Parser.UnknownField> var5,
         Descriptors.Descriptor var6,
         int var7
      ) {
         StringBuilder var8 = new StringBuilder();

         while (true) {
            var8.append(var1.consumeIdentifier());
            if (var1.tryConsume("]")) {
               this.detectSilentMarker(var1, var6, var8.toString());
               var1.tryConsume(":");
               String var9;
               if (var1.tryConsume("<")) {
                  var9 = ">";
               } else {
                  var1.consume("{");
                  var9 = "}";
               }

               String var10 = var8.toString();
               Descriptors.Descriptor var11 = null;

               try {
                  var11 = this.typeRegistry.getDescriptorForTypeUrl(var10);
               } catch (InvalidProtocolBufferException var14) {
                  throw var1.parseException("Invalid valid type URL. Found: " + var10);
               }

               if (var11 == null) {
                  throw var1.parseException(
                     "Unable to parse Any of type: " + var10 + ". Please make sure that the TypeRegistry contains the descriptors for the given types."
                  );
               }

               DynamicMessage.Builder var12 = DynamicMessage.getDefaultInstance(var11).newBuilderForType();
               MessageReflection.BuilderAdapter var13 = new MessageReflection.BuilderAdapter(var12);

               while (!var1.tryConsume(var9)) {
                  this.mergeField(var1, var2, var13, var4, var5, var7);
               }

               var3.setField(var6.findFieldByName("type_url"), var8.toString());
               var3.setField(var6.findFieldByName("value"), var12.build().toByteString());
               return;
            }

            if (var1.tryConsume("/")) {
               var8.append("/");
            } else {
               if (!var1.tryConsume(".")) {
                  throw var1.parseExceptionPreviousToken("Expected a valid type URL.");
               }

               var8.append(".");
            }
         }
      }

      private void skipField(TextFormat.Tokenizer var1, Descriptors.Descriptor var2, int var3) {
         String var4 = this.consumeFullTypeName(var1);
         this.detectSilentMarker(var1, var2, var4);
         this.guessFieldTypeAndSkip(var1, var2, var3);
         if (!var1.tryConsume(";")) {
            var1.tryConsume(",");
         }
      }

      private void skipFieldMessage(TextFormat.Tokenizer var1, Descriptors.Descriptor var2, int var3) {
         String var4;
         if (var1.tryConsume("<")) {
            var4 = ">";
         } else {
            var1.consume("{");
            var4 = "}";
         }

         while (!var1.lookingAt(">") && !var1.lookingAt("}")) {
            this.skipField(var1, var2, var3);
         }

         var1.consume(var4);
      }

      private void skipFieldValue(TextFormat.Tokenizer var1) {
         if (!var1.tryConsumeByteString()
            && !var1.tryConsumeIdentifier()
            && !var1.tryConsumeInt64()
            && !var1.tryConsumeUInt64()
            && !var1.tryConsumeDouble()
            && !var1.tryConsumeFloat()) {
            throw var1.parseException("Invalid field value: " + var1.currentToken);
         }
      }

      private void guessFieldTypeAndSkip(TextFormat.Tokenizer var1, Descriptors.Descriptor var2, int var3) {
         boolean var4 = var1.tryConsume(":");
         if (var1.lookingAt("[")) {
            this.skipFieldShortFormedRepeated(var1, var4, var2, var3);
         } else if (var4 && !var1.lookingAt("{") && !var1.lookingAt("<")) {
            this.skipFieldValue(var1);
         } else {
            if (var3 < 1) {
               throw var1.parseException("Message is nested too deep");
            }

            this.skipFieldMessage(var1, var2, var3 - 1);
         }
      }

      private void skipFieldShortFormedRepeated(TextFormat.Tokenizer var1, boolean var2, Descriptors.Descriptor var3, int var4) {
         if (var1.tryConsume("[") && !var1.tryConsume("]")) {
            while (true) {
               if (!var1.lookingAt("{") && !var1.lookingAt("<")) {
                  if (!var2) {
                     throw var1.parseException("Invalid repeated scalar field: missing \":\" before \"[\".");
                  }

                  this.skipFieldValue(var1);
               } else {
                  if (var4 < 1) {
                     throw var1.parseException("Message is nested too deep");
                  }

                  this.skipFieldMessage(var1, var3, var4 - 1);
               }

               if (var1.tryConsume("]")) {
                  return;
               }

               var1.consume(",");
            }
         }
      }

      public static class Builder {
         private boolean allowUnknownFields = false;
         private boolean allowUnknownEnumValues = false;
         private boolean allowUnknownExtensions = false;
         private TextFormat.Parser.SingularOverwritePolicy singularOverwritePolicy = TextFormat.Parser.SingularOverwritePolicy.ALLOW_SINGULAR_OVERWRITES;
         private TextFormatParseInfoTree.Builder parseInfoTreeBuilder = null;
         private TypeRegistry typeRegistry = TypeRegistry.getEmptyTypeRegistry();
         private int recursionLimit = 100;

         public TextFormat.Parser.Builder setTypeRegistry(TypeRegistry var1) {
            this.typeRegistry = var1;
            return this;
         }

         public TextFormat.Parser.Builder setAllowUnknownFields(boolean var1) {
            this.allowUnknownFields = var1;
            return this;
         }

         public TextFormat.Parser.Builder setAllowUnknownExtensions(boolean var1) {
            this.allowUnknownExtensions = var1;
            return this;
         }

         public TextFormat.Parser.Builder setSingularOverwritePolicy(TextFormat.Parser.SingularOverwritePolicy var1) {
            this.singularOverwritePolicy = var1;
            return this;
         }

         public TextFormat.Parser.Builder setParseInfoTreeBuilder(TextFormatParseInfoTree.Builder var1) {
            this.parseInfoTreeBuilder = var1;
            return this;
         }

         public TextFormat.Parser.Builder setRecursionLimit(int var1) {
            this.recursionLimit = var1;
            return this;
         }

         public TextFormat.Parser build() {
            return new TextFormat.Parser(
               this.typeRegistry,
               this.allowUnknownFields,
               this.allowUnknownEnumValues,
               this.allowUnknownExtensions,
               this.singularOverwritePolicy,
               this.parseInfoTreeBuilder,
               this.recursionLimit
            );
         }
      }

      public enum SingularOverwritePolicy {
         ALLOW_SINGULAR_OVERWRITES,
         FORBID_SINGULAR_OVERWRITES;
      }

      static final class UnknownField {
         final String message;
         final TextFormat.Parser.UnknownField.Type type;

         UnknownField(String var1, TextFormat.Parser.UnknownField.Type var2) {
            this.message = var1;
            this.type = var2;
         }

         enum Type {
            FIELD,
            EXTENSION;
         }
      }
   }

   public static final class Printer {
      private static final TextFormat.Printer DEFAULT = new TextFormat.Printer(true, TypeRegistry.getEmptyTypeRegistry());
      private final boolean escapeNonAscii;
      private final TypeRegistry typeRegistry;

      private Printer(boolean var1, TypeRegistry var2) {
         this.escapeNonAscii = var1;
         this.typeRegistry = var2;
      }

      public TextFormat.Printer escapingNonAscii(boolean var1) {
         return new TextFormat.Printer(var1, this.typeRegistry);
      }

      public TextFormat.Printer usingTypeRegistry(TypeRegistry var1) {
         if (this.typeRegistry != TypeRegistry.getEmptyTypeRegistry()) {
            throw new IllegalArgumentException("Only one typeRegistry is allowed.");
         } else {
            return new TextFormat.Printer(this.escapeNonAscii, var1);
         }
      }

      public void print(MessageOrBuilder var1, Appendable var2) {
         this.print(var1, TextFormat.multiLineOutput(var2));
      }

      public void print(UnknownFieldSet var1, Appendable var2) {
         printUnknownFields(var1, TextFormat.multiLineOutput(var2));
      }

      private void print(MessageOrBuilder var1, TextFormat.TextGenerator var2) {
         if (!var1.getDescriptorForType().getFullName().equals("google.protobuf.Any") || !this.printAny(var1, var2)) {
            this.printMessage(var1, var2);
         }
      }

      private boolean printAny(MessageOrBuilder var1, TextFormat.TextGenerator var2) {
         Descriptors.Descriptor var3 = var1.getDescriptorForType();
         Descriptors.FieldDescriptor var4 = var3.findFieldByNumber(1);
         Descriptors.FieldDescriptor var5 = var3.findFieldByNumber(2);
         if (var4 != null
            && var4.getType() == Descriptors.FieldDescriptor.Type.STRING
            && var5 != null
            && var5.getType() == Descriptors.FieldDescriptor.Type.BYTES) {
            String var6 = (String)var1.getField(var4);
            if (var6.isEmpty()) {
               return false;
            }

            Object var7 = var1.getField(var5);
            DynamicMessage.Builder var8 = null;

            try {
               Descriptors.Descriptor var9 = this.typeRegistry.getDescriptorForTypeUrl(var6);
               if (var9 == null) {
                  return false;
               }

               var8 = DynamicMessage.getDefaultInstance(var9).newBuilderForType();
               var8.mergeFrom((ByteString)var7);
            } catch (InvalidProtocolBufferException var10) {
               return false;
            }

            var2.print("[");
            var2.print(var6);
            var2.print("] {");
            var2.eol();
            var2.indent();
            this.print(var8, var2);
            var2.outdent();
            var2.print("}");
            var2.eol();
            return true;
         } else {
            return false;
         }
      }

      public String printFieldToString(Descriptors.FieldDescriptor var1, Object var2) {
         try {
            StringBuilder var3 = new StringBuilder();
            this.printField(var1, var2, var3);
            return var3.toString();
         } catch (IOException var4) {
            throw new IllegalStateException(var4);
         }
      }

      public void printField(Descriptors.FieldDescriptor var1, Object var2, Appendable var3) {
         this.printField(var1, var2, TextFormat.multiLineOutput(var3));
      }

      private void printField(Descriptors.FieldDescriptor var1, Object var2, TextFormat.TextGenerator var3) {
         if (var1.isMapField()) {
            ArrayList var4 = new ArrayList();

            for (Object var6 : (List)var2) {
               var4.add(new TextFormat.Printer.MapEntryAdapter(var6, var1));
            }

            Collections.sort(var4);

            for (TextFormat.Printer.MapEntryAdapter var10 : var4) {
               this.printSingleField(var1, var10.getEntry(), var3);
            }
         } else if (var1.isRepeated()) {
            for (Object var9 : (List)var2) {
               this.printSingleField(var1, var9, var3);
            }
         } else {
            this.printSingleField(var1, var2, var3);
         }
      }

      public void printFieldValue(Descriptors.FieldDescriptor var1, Object var2, Appendable var3) {
         this.printFieldValue(var1, var2, TextFormat.multiLineOutput(var3));
      }

      private void printFieldValue(Descriptors.FieldDescriptor var1, Object var2, TextFormat.TextGenerator var3) {
         switch (var1.getType()) {
            case INT32:
            case SINT32:
            case SFIXED32:
               var3.print(((Integer)var2).toString());
               break;
            case INT64:
            case SINT64:
            case SFIXED64:
               var3.print(((Long)var2).toString());
               break;
            case BOOL:
               var3.print(((Boolean)var2).toString());
               break;
            case FLOAT:
               var3.print(((Float)var2).toString());
               break;
            case DOUBLE:
               var3.print(((Double)var2).toString());
               break;
            case UINT32:
            case FIXED32:
               var3.print(TextFormat.unsignedToString((Integer)var2));
               break;
            case UINT64:
            case FIXED64:
               var3.print(TextFormat.unsignedToString((Long)var2));
               break;
            case STRING:
               var3.print("\"");
               var3.print(
                  this.escapeNonAscii
                     ? TextFormatEscaper.escapeText((String)var2)
                     : TextFormat.escapeDoubleQuotesAndBackslashes((String)var2).replace("\n", "\\n")
               );
               var3.print("\"");
               break;
            case BYTES:
               var3.print("\"");
               if (var2 instanceof ByteString) {
                  var3.print(TextFormat.escapeBytes((ByteString)var2));
               } else {
                  var3.print(TextFormat.escapeBytes((byte[])var2));
               }

               var3.print("\"");
               break;
            case ENUM:
               var3.print(((Descriptors.EnumValueDescriptor)var2).getName());
               break;
            case MESSAGE:
            case GROUP:
               this.print((MessageOrBuilder)var2, var3);
         }
      }

      public String printToString(MessageOrBuilder var1) {
         try {
            StringBuilder var2 = new StringBuilder();
            this.print(var1, var2);
            return var2.toString();
         } catch (IOException var3) {
            throw new IllegalStateException(var3);
         }
      }

      public String printToString(UnknownFieldSet var1) {
         try {
            StringBuilder var2 = new StringBuilder();
            this.print(var1, var2);
            return var2.toString();
         } catch (IOException var3) {
            throw new IllegalStateException(var3);
         }
      }

      public String shortDebugString(MessageOrBuilder var1) {
         try {
            StringBuilder var2 = new StringBuilder();
            this.print(var1, TextFormat.singleLineOutput(var2));
            return var2.toString();
         } catch (IOException var3) {
            throw new IllegalStateException(var3);
         }
      }

      public String shortDebugString(Descriptors.FieldDescriptor var1, Object var2) {
         try {
            StringBuilder var3 = new StringBuilder();
            this.printField(var1, var2, TextFormat.singleLineOutput(var3));
            return var3.toString();
         } catch (IOException var4) {
            throw new IllegalStateException(var4);
         }
      }

      public String shortDebugString(UnknownFieldSet var1) {
         try {
            StringBuilder var2 = new StringBuilder();
            printUnknownFields(var1, TextFormat.singleLineOutput(var2));
            return var2.toString();
         } catch (IOException var3) {
            throw new IllegalStateException(var3);
         }
      }

      private static void printUnknownFieldValue(int var0, Object var1, TextFormat.TextGenerator var2) {
         switch (WireFormat.getTagWireType(var0)) {
            case 0:
               var2.print(TextFormat.unsignedToString((Long)var1));
               break;
            case 1:
               var2.print(String.format((Locale)null, "0x%016x", (Long)var1));
               break;
            case 2:
               try {
                  UnknownFieldSet var3 = UnknownFieldSet.parseFrom((ByteString)var1);
                  var2.print("{");
                  var2.eol();
                  var2.indent();
                  printUnknownFields(var3, var2);
                  var2.outdent();
                  var2.print("}");
               } catch (InvalidProtocolBufferException var4) {
                  var2.print("\"");
                  var2.print(TextFormat.escapeBytes((ByteString)var1));
                  var2.print("\"");
               }
               break;
            case 3:
               printUnknownFields((UnknownFieldSet)var1, var2);
               break;
            case 4:
            default:
               throw new IllegalArgumentException("Bad tag: " + var0);
            case 5:
               var2.print(String.format((Locale)null, "0x%08x", (Integer)var1));
         }
      }

      private void printMessage(MessageOrBuilder var1, TextFormat.TextGenerator var2) {
         for (Entry var4 : var1.getAllFields().entrySet()) {
            this.printField((Descriptors.FieldDescriptor)var4.getKey(), var4.getValue(), var2);
         }

         printUnknownFields(var1.getUnknownFields(), var2);
      }

      private void printSingleField(Descriptors.FieldDescriptor var1, Object var2, TextFormat.TextGenerator var3) {
         if (var1.isExtension()) {
            var3.print("[");
            if (var1.getContainingType().getOptions().getMessageSetWireFormat()
               && var1.getType() == Descriptors.FieldDescriptor.Type.MESSAGE
               && var1.isOptional()
               && var1.getExtensionScope() == var1.getMessageType()) {
               var3.print(var1.getMessageType().getFullName());
            } else {
               var3.print(var1.getFullName());
            }

            var3.print("]");
         } else if (var1.getType() == Descriptors.FieldDescriptor.Type.GROUP) {
            var3.print(var1.getMessageType().getName());
         } else {
            var3.print(var1.getName());
         }

         if (var1.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            var3.print(" {");
            var3.eol();
            var3.indent();
         } else {
            var3.print(": ");
         }

         this.printFieldValue(var1, var2, var3);
         if (var1.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            var3.outdent();
            var3.print("}");
         }

         var3.eol();
      }

      private static void printUnknownFields(UnknownFieldSet var0, TextFormat.TextGenerator var1) {
         for (Entry var3 : var0.asMap().entrySet()) {
            int var4 = (Integer)var3.getKey();
            UnknownFieldSet.Field var5 = (UnknownFieldSet.Field)var3.getValue();
            printUnknownField(var4, 0, var5.getVarintList(), var1);
            printUnknownField(var4, 5, var5.getFixed32List(), var1);
            printUnknownField(var4, 1, var5.getFixed64List(), var1);
            printUnknownField(var4, 2, var5.getLengthDelimitedList(), var1);

            for (UnknownFieldSet var7 : var5.getGroupList()) {
               var1.print(((Integer)var3.getKey()).toString());
               var1.print(" {");
               var1.eol();
               var1.indent();
               printUnknownFields(var7, var1);
               var1.outdent();
               var1.print("}");
               var1.eol();
            }
         }
      }

      private static void printUnknownField(int var0, int var1, List<?> var2, TextFormat.TextGenerator var3) {
         for (Object var5 : var2) {
            var3.print(String.valueOf(var0));
            var3.print(": ");
            printUnknownFieldValue(var1, var5, var3);
            var3.eol();
         }
      }

      private static class MapEntryAdapter implements Comparable<TextFormat.Printer.MapEntryAdapter> {
         private Object entry;
         private MapEntry mapEntry;
         private final Descriptors.FieldDescriptor.JavaType fieldType;

         MapEntryAdapter(Object var1, Descriptors.FieldDescriptor var2) {
            if (var1 instanceof MapEntry) {
               this.mapEntry = (MapEntry)var1;
            } else {
               this.entry = var1;
            }

            this.fieldType = extractFieldType(var2);
         }

         private static Descriptors.FieldDescriptor.JavaType extractFieldType(Descriptors.FieldDescriptor var0) {
            return var0.getMessageType().getFields().get(0).getJavaType();
         }

         Object getKey() {
            return this.mapEntry != null ? this.mapEntry.getKey() : null;
         }

         Object getEntry() {
            return this.mapEntry != null ? this.mapEntry : this.entry;
         }

         public int compareTo(TextFormat.Printer.MapEntryAdapter var1) {
            if (this.getKey() != null && var1.getKey() != null) {
               switch (this.fieldType) {
                  case BOOLEAN:
                     return Boolean.valueOf((Boolean)this.getKey()).compareTo((Boolean)var1.getKey());
                  case LONG:
                     return Long.valueOf((Long)this.getKey()).compareTo((Long)var1.getKey());
                  case INT:
                     return Integer.valueOf((Integer)this.getKey()).compareTo((Integer)var1.getKey());
                  case STRING:
                     String var2 = (String)this.getKey();
                     String var3 = (String)var1.getKey();
                     if (var2 == null && var3 == null) {
                        return 0;
                     } else if (var2 == null && var3 != null) {
                        return -1;
                     } else {
                        if (var2 != null && var3 == null) {
                           return 1;
                        }

                        return var2.compareTo(var3);
                     }
                  default:
                     return 0;
               }
            } else {
               TextFormat.logger.info("Invalid key for map field.");
               return -1;
            }
         }
      }
   }

   private static final class TextGenerator {
      private final Appendable output;
      private final StringBuilder indent = new StringBuilder();
      private final boolean singleLineMode;
      private boolean atStartOfLine = false;

      private TextGenerator(Appendable var1, boolean var2) {
         this.output = var1;
         this.singleLineMode = var2;
      }

      public void indent() {
         this.indent.append("  ");
      }

      public void outdent() {
         int var1 = this.indent.length();
         if (var1 == 0) {
            throw new IllegalArgumentException(" Outdent() without matching Indent().");
         }

         this.indent.setLength(var1 - 2);
      }

      public void print(CharSequence var1) {
         if (this.atStartOfLine) {
            this.atStartOfLine = false;
            this.output.append(this.singleLineMode ? " " : this.indent);
         }

         this.output.append(var1);
      }

      public void eol() {
         if (!this.singleLineMode) {
            this.output.append("\n");
         }

         this.atStartOfLine = true;
      }
   }

   private static final class Tokenizer {
      private final CharSequence text;
      private final Matcher matcher;
      private String currentToken;
      private int pos = 0;
      private int line = 0;
      private int column = 0;
      private int previousLine = 0;
      private int previousColumn = 0;
      private static final Pattern WHITESPACE = Pattern.compile("(\\s|(#.*$))++", 8);
      private static final Pattern TOKEN = Pattern.compile(
         "[a-zA-Z_][0-9a-zA-Z_+-]*+|[.]?[0-9+-][0-9a-zA-Z_.+-]*+|\"([^\"\n\\\\]|\\\\.)*+(\"|\\\\?$)|'([^'\n\\\\]|\\\\.)*+('|\\\\?$)", 8
      );
      private static final Pattern DOUBLE_INFINITY = Pattern.compile("-?inf(inity)?", 2);
      private static final Pattern FLOAT_INFINITY = Pattern.compile("-?inf(inity)?f?", 2);
      private static final Pattern FLOAT_NAN = Pattern.compile("nanf?", 2);
      private boolean containsSilentMarkerAfterCurrentToken = false;
      private boolean containsSilentMarkerAfterPrevToken = false;

      private Tokenizer(CharSequence var1) {
         this.text = var1;
         this.matcher = WHITESPACE.matcher(var1);
         this.skipWhitespace();
         this.nextToken();
      }

      int getPreviousLine() {
         return this.previousLine;
      }

      int getPreviousColumn() {
         return this.previousColumn;
      }

      int getLine() {
         return this.line;
      }

      int getColumn() {
         return this.column;
      }

      boolean getContainsSilentMarkerAfterCurrentToken() {
         return this.containsSilentMarkerAfterCurrentToken;
      }

      boolean getContainsSilentMarkerAfterPrevToken() {
         return this.containsSilentMarkerAfterPrevToken;
      }

      boolean atEnd() {
         return this.currentToken.length() == 0;
      }

      void nextToken() {
         this.previousLine = this.line;

         for (this.previousColumn = this.column; this.pos < this.matcher.regionStart(); this.pos++) {
            if (this.text.charAt(this.pos) == '\n') {
               this.line++;
               this.column = 0;
            } else {
               this.column++;
            }
         }

         if (this.matcher.regionStart() == this.matcher.regionEnd()) {
            this.currentToken = "";
         } else {
            this.matcher.usePattern(TOKEN);
            if (this.matcher.lookingAt()) {
               this.currentToken = this.matcher.group();
               this.matcher.region(this.matcher.end(), this.matcher.regionEnd());
            } else {
               this.currentToken = String.valueOf(this.text.charAt(this.pos));
               this.matcher.region(this.pos + 1, this.matcher.regionEnd());
            }

            this.skipWhitespace();
         }
      }

      private void skipWhitespace() {
         this.matcher.usePattern(WHITESPACE);
         if (this.matcher.lookingAt()) {
            this.matcher.region(this.matcher.end(), this.matcher.regionEnd());
         }
      }

      boolean tryConsume(String var1) {
         if (this.currentToken.equals(var1)) {
            this.nextToken();
            return true;
         } else {
            return false;
         }
      }

      void consume(String var1) {
         if (!this.tryConsume(var1)) {
            throw this.parseException("Expected \"" + var1 + "\".");
         }
      }

      boolean lookingAtInteger() {
         if (this.currentToken.length() == 0) {
            return false;
         }

         char var1 = this.currentToken.charAt(0);
         return '0' <= var1 && var1 <= '9' || var1 == '-' || var1 == '+';
      }

      boolean lookingAt(String var1) {
         return this.currentToken.equals(var1);
      }

      String consumeIdentifier() {
         for (int var1 = 0; var1 < this.currentToken.length(); var1++) {
            char var2 = this.currentToken.charAt(var1);
            if (('a' > var2 || var2 > 'z') && ('A' > var2 || var2 > 'Z') && ('0' > var2 || var2 > '9') && var2 != '_' && var2 != '.') {
               throw this.parseException("Expected identifier. Found '" + this.currentToken + "'");
            }
         }

         String var3 = this.currentToken;
         this.nextToken();
         return var3;
      }

      boolean tryConsumeIdentifier() {
         try {
            this.consumeIdentifier();
            return true;
         } catch (TextFormat.ParseException var2) {
            return false;
         }
      }

      int consumeInt32() {
         try {
            int var1 = TextFormat.parseInt32(this.currentToken);
            this.nextToken();
            return var1;
         } catch (NumberFormatException var2) {
            throw this.integerParseException(var2);
         }
      }

      int consumeUInt32() {
         try {
            int var1 = TextFormat.parseUInt32(this.currentToken);
            this.nextToken();
            return var1;
         } catch (NumberFormatException var2) {
            throw this.integerParseException(var2);
         }
      }

      long consumeInt64() {
         try {
            long var1 = TextFormat.parseInt64(this.currentToken);
            this.nextToken();
            return var1;
         } catch (NumberFormatException var3) {
            throw this.integerParseException(var3);
         }
      }

      boolean tryConsumeInt64() {
         try {
            this.consumeInt64();
            return true;
         } catch (TextFormat.ParseException var2) {
            return false;
         }
      }

      long consumeUInt64() {
         try {
            long var1 = TextFormat.parseUInt64(this.currentToken);
            this.nextToken();
            return var1;
         } catch (NumberFormatException var3) {
            throw this.integerParseException(var3);
         }
      }

      public boolean tryConsumeUInt64() {
         try {
            this.consumeUInt64();
            return true;
         } catch (TextFormat.ParseException var2) {
            return false;
         }
      }

      public double consumeDouble() {
         if (DOUBLE_INFINITY.matcher(this.currentToken).matches()) {
            boolean var4 = this.currentToken.startsWith("-");
            this.nextToken();
            return var4 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
         }

         if (this.currentToken.equalsIgnoreCase("nan")) {
            this.nextToken();
            return Double.NaN;
         }

         try {
            double var1 = Double.parseDouble(this.currentToken);
            this.nextToken();
            return var1;
         } catch (NumberFormatException var3) {
            throw this.floatParseException(var3);
         }
      }

      public boolean tryConsumeDouble() {
         try {
            this.consumeDouble();
            return true;
         } catch (TextFormat.ParseException var2) {
            return false;
         }
      }

      public float consumeFloat() {
         if (FLOAT_INFINITY.matcher(this.currentToken).matches()) {
            boolean var3 = this.currentToken.startsWith("-");
            this.nextToken();
            return var3 ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
         }

         if (FLOAT_NAN.matcher(this.currentToken).matches()) {
            this.nextToken();
            return Float.NaN;
         }

         try {
            float var1 = Float.parseFloat(this.currentToken);
            this.nextToken();
            return var1;
         } catch (NumberFormatException var2) {
            throw this.floatParseException(var2);
         }
      }

      public boolean tryConsumeFloat() {
         try {
            this.consumeFloat();
            return true;
         } catch (TextFormat.ParseException var2) {
            return false;
         }
      }

      public boolean consumeBoolean() {
         if (this.currentToken.equals("true") || this.currentToken.equals("True") || this.currentToken.equals("t") || this.currentToken.equals("1")) {
            this.nextToken();
            return true;
         }

         if (!this.currentToken.equals("false") && !this.currentToken.equals("False") && !this.currentToken.equals("f") && !this.currentToken.equals("0")) {
            throw this.parseException("Expected \"true\" or \"false\". Found \"" + this.currentToken + "\".");
         }

         this.nextToken();
         return false;
      }

      public String consumeString() {
         return this.consumeByteString().toStringUtf8();
      }

      @CanIgnoreReturnValue
      ByteString consumeByteString() {
         ArrayList var1 = new ArrayList();
         this.consumeByteString(var1);

         while (this.currentToken.startsWith("'") || this.currentToken.startsWith("\"")) {
            this.consumeByteString(var1);
         }

         return ByteString.copyFrom(var1);
      }

      boolean tryConsumeByteString() {
         try {
            this.consumeByteString();
            return true;
         } catch (TextFormat.ParseException var2) {
            return false;
         }
      }

      private void consumeByteString(List<ByteString> var1) {
         char var2 = this.currentToken.length() > 0 ? this.currentToken.charAt(0) : '\u0000';
         if (var2 != '"' && var2 != '\'') {
            throw this.parseException("Expected string.");
         }

         if (this.currentToken.length() >= 2 && this.currentToken.charAt(this.currentToken.length() - 1) == var2) {
            try {
               String var3 = this.currentToken.substring(1, this.currentToken.length() - 1);
               ByteString var4 = TextFormat.unescapeBytes(var3);
               this.nextToken();
               var1.add(var4);
            } catch (TextFormat.InvalidEscapeSequenceException var5) {
               throw this.parseException(var5.getMessage());
            }
         } else {
            throw this.parseException("String missing ending quote.");
         }
      }

      TextFormat.ParseException parseException(String var1) {
         return new TextFormat.ParseException(this.line + 1, this.column + 1, var1);
      }

      TextFormat.ParseException parseExceptionPreviousToken(String var1) {
         return new TextFormat.ParseException(this.previousLine + 1, this.previousColumn + 1, var1);
      }

      private TextFormat.ParseException integerParseException(NumberFormatException var1) {
         return this.parseException("Couldn't parse integer: " + var1.getMessage());
      }

      private TextFormat.ParseException floatParseException(NumberFormatException var1) {
         return this.parseException("Couldn't parse number: " + var1.getMessage());
      }
   }

   public static class UnknownFieldParseException extends TextFormat.ParseException {
      private final String unknownField;

      public UnknownFieldParseException(String var1) {
         this(-1, -1, "", var1);
      }

      public UnknownFieldParseException(int var1, int var2, String var3, String var4) {
         super(var1, var2, var4);
         this.unknownField = var3;
      }

      public String getUnknownField() {
         return this.unknownField;
      }
   }
}
