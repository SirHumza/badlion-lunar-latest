package org.yaml.snakeyaml;

import java.util.Map;
import java.util.TimeZone;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.serializer.AnchorGenerator;
import org.yaml.snakeyaml.serializer.NumberAnchorGenerator;

public class DumperOptions {
   private DumperOptions.ScalarStyle defaultStyle = DumperOptions.ScalarStyle.PLAIN;
   private DumperOptions.FlowStyle defaultFlowStyle = DumperOptions.FlowStyle.AUTO;
   private boolean canonical = false;
   private boolean allowUnicode = true;
   private boolean allowReadOnlyProperties = false;
   private int indent = 2;
   private int indicatorIndent = 0;
   private boolean indentWithIndicator = false;
   private int bestWidth = 80;
   private boolean splitLines = true;
   private DumperOptions.LineBreak lineBreak = DumperOptions.LineBreak.UNIX;
   private boolean explicitStart = false;
   private boolean explicitEnd = false;
   private TimeZone timeZone = null;
   private int maxSimpleKeyLength = 128;
   private boolean processComments = false;
   private DumperOptions.NonPrintableStyle nonPrintableStyle = DumperOptions.NonPrintableStyle.BINARY;
   private DumperOptions.Version version = null;
   private Map<String, String> tags = null;
   private Boolean prettyFlow = false;
   private AnchorGenerator anchorGenerator = new NumberAnchorGenerator(0);

   public boolean isAllowUnicode() {
      return this.allowUnicode;
   }

   public void setAllowUnicode(boolean var1) {
      this.allowUnicode = var1;
   }

   public DumperOptions.ScalarStyle getDefaultScalarStyle() {
      return this.defaultStyle;
   }

   public void setDefaultScalarStyle(DumperOptions.ScalarStyle var1) {
      if (var1 == null) {
         throw new NullPointerException("Use ScalarStyle enum.");
      }

      this.defaultStyle = var1;
   }

   public void setIndent(int var1) {
      if (var1 < 1) {
         throw new YAMLException("Indent must be at least 1");
      }

      if (var1 > 10) {
         throw new YAMLException("Indent must be at most 10");
      }

      this.indent = var1;
   }

   public int getIndent() {
      return this.indent;
   }

   public void setIndicatorIndent(int var1) {
      if (var1 < 0) {
         throw new YAMLException("Indicator indent must be non-negative.");
      }

      if (var1 > 9) {
         throw new YAMLException("Indicator indent must be at most Emitter.MAX_INDENT-1: 9");
      }

      this.indicatorIndent = var1;
   }

   public int getIndicatorIndent() {
      return this.indicatorIndent;
   }

   public boolean getIndentWithIndicator() {
      return this.indentWithIndicator;
   }

   public void setIndentWithIndicator(boolean var1) {
      this.indentWithIndicator = var1;
   }

   public void setVersion(DumperOptions.Version var1) {
      this.version = var1;
   }

   public DumperOptions.Version getVersion() {
      return this.version;
   }

   public void setCanonical(boolean var1) {
      this.canonical = var1;
   }

   public boolean isCanonical() {
      return this.canonical;
   }

   public void setPrettyFlow(boolean var1) {
      this.prettyFlow = var1;
   }

   public boolean isPrettyFlow() {
      return this.prettyFlow;
   }

   public void setWidth(int var1) {
      this.bestWidth = var1;
   }

   public int getWidth() {
      return this.bestWidth;
   }

   public void setSplitLines(boolean var1) {
      this.splitLines = var1;
   }

   public boolean getSplitLines() {
      return this.splitLines;
   }

   public DumperOptions.LineBreak getLineBreak() {
      return this.lineBreak;
   }

   public void setDefaultFlowStyle(DumperOptions.FlowStyle var1) {
      if (var1 == null) {
         throw new NullPointerException("Use FlowStyle enum.");
      }

      this.defaultFlowStyle = var1;
   }

   public DumperOptions.FlowStyle getDefaultFlowStyle() {
      return this.defaultFlowStyle;
   }

   public void setLineBreak(DumperOptions.LineBreak var1) {
      if (var1 == null) {
         throw new NullPointerException("Specify line break.");
      }

      this.lineBreak = var1;
   }

   public boolean isExplicitStart() {
      return this.explicitStart;
   }

   public void setExplicitStart(boolean var1) {
      this.explicitStart = var1;
   }

   public boolean isExplicitEnd() {
      return this.explicitEnd;
   }

   public void setExplicitEnd(boolean var1) {
      this.explicitEnd = var1;
   }

   public Map<String, String> getTags() {
      return this.tags;
   }

   public void setTags(Map<String, String> var1) {
      this.tags = var1;
   }

   public boolean isAllowReadOnlyProperties() {
      return this.allowReadOnlyProperties;
   }

   public void setAllowReadOnlyProperties(boolean var1) {
      this.allowReadOnlyProperties = var1;
   }

   public TimeZone getTimeZone() {
      return this.timeZone;
   }

   public void setTimeZone(TimeZone var1) {
      this.timeZone = var1;
   }

   public AnchorGenerator getAnchorGenerator() {
      return this.anchorGenerator;
   }

   public void setAnchorGenerator(AnchorGenerator var1) {
      this.anchorGenerator = var1;
   }

   public int getMaxSimpleKeyLength() {
      return this.maxSimpleKeyLength;
   }

   public void setMaxSimpleKeyLength(int var1) {
      if (var1 > 1024) {
         throw new YAMLException("The simple key must not span more than 1024 stream characters. See https://yaml.org/spec/1.1/#id934537");
      }

      this.maxSimpleKeyLength = var1;
   }

   public void setProcessComments(boolean var1) {
      this.processComments = var1;
   }

   public boolean isProcessComments() {
      return this.processComments;
   }

   public DumperOptions.NonPrintableStyle getNonPrintableStyle() {
      return this.nonPrintableStyle;
   }

   public void setNonPrintableStyle(DumperOptions.NonPrintableStyle var1) {
      this.nonPrintableStyle = var1;
   }

   public enum FlowStyle {
      FLOW(Boolean.TRUE),
      BLOCK(Boolean.FALSE),
      AUTO(null);

      private final Boolean styleBoolean;

      FlowStyle(Boolean var3) {
         this.styleBoolean = var3;
      }

      @Override
      public String toString() {
         return "Flow style: '" + this.styleBoolean + "'";
      }
   }

   public enum LineBreak {
      WIN("\r\n"),
      MAC("\r"),
      UNIX("\n");

      private final String lineBreak;

      LineBreak(String var3) {
         this.lineBreak = var3;
      }

      public String getString() {
         return this.lineBreak;
      }

      @Override
      public String toString() {
         return "Line break: " + this.name();
      }

      public static DumperOptions.LineBreak getPlatformLineBreak() {
         String var0 = System.getProperty("line.separator");

         for (DumperOptions.LineBreak var4 : values()) {
            if (var4.lineBreak.equals(var0)) {
               return var4;
            }
         }

         return UNIX;
      }
   }

   public enum NonPrintableStyle {
      BINARY,
      ESCAPE;
   }

   public enum ScalarStyle {
      DOUBLE_QUOTED('"'),
      SINGLE_QUOTED('\''),
      LITERAL('|'),
      FOLDED('>'),
      PLAIN(null);

      private final Character styleChar;

      ScalarStyle(Character var3) {
         this.styleChar = var3;
      }

      public Character getChar() {
         return this.styleChar;
      }

      @Override
      public String toString() {
         return "Scalar style: '" + this.styleChar + "'";
      }

      public static DumperOptions.ScalarStyle createStyle(Character var0) {
         if (var0 == null) {
            return PLAIN;
         }

         switch (var0) {
            case '"':
               return DOUBLE_QUOTED;
            case '\'':
               return SINGLE_QUOTED;
            case '>':
               return FOLDED;
            case '|':
               return LITERAL;
            default:
               throw new YAMLException("Unknown scalar style character: " + var0);
         }
      }
   }

   public enum Version {
      V1_0(new Integer[]{1, 0}),
      V1_1(new Integer[]{1, 1});

      private final Integer[] version;

      Version(Integer[] var3) {
         this.version = var3;
      }

      public int major() {
         return this.version[0];
      }

      public int minor() {
         return this.version[1];
      }

      public String getRepresentation() {
         return this.version[0] + "." + this.version[1];
      }

      @Override
      public String toString() {
         return "Version: " + this.getRepresentation();
      }
   }
}
