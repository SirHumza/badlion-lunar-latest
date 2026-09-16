package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigIncludeContext;
import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigParseOptions;
import com.typesafe.config.ConfigSyntax;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

final class ConfigParser {
   static AbstractConfigValue parse(ConfigNodeRoot var0, ConfigOrigin var1, ConfigParseOptions var2, ConfigIncludeContext var3) {
      ConfigParser.ParseContext var4 = new ConfigParser.ParseContext(var2.getSyntax(), var1, var0, SimpleIncluder.makeFull(var2.getIncluder()), var3);
      return var4.parse();
   }

   private static final class ParseContext {
      private int lineNumber = 1;
      private final ConfigNodeRoot document;
      private final FullIncluder includer;
      private final ConfigIncludeContext includeContext;
      private final ConfigSyntax flavor;
      private final ConfigOrigin baseOrigin;
      private final LinkedList<Path> pathStack;
      int arrayCount;

      ParseContext(ConfigSyntax var1, ConfigOrigin var2, ConfigNodeRoot var3, FullIncluder var4, ConfigIncludeContext var5) {
         this.document = var3;
         this.flavor = var1;
         this.baseOrigin = var2;
         this.includer = var4;
         this.includeContext = var5;
         this.pathStack = new LinkedList<>();
         this.arrayCount = 0;
      }

      private AbstractConfigValue parseConcatenation(ConfigNodeConcatenation var1) {
         if (this.flavor == ConfigSyntax.JSON) {
            throw new ConfigException.BugOrBroken("Found a concatenation node in JSON");
         }

         ArrayList var2 = new ArrayList(var1.children().size());

         for (AbstractConfigNode var4 : var1.children()) {
            Object var5 = null;
            if (var4 instanceof AbstractConfigNodeValue) {
               var5 = this.parseValue((AbstractConfigNodeValue)var4, null);
               var2.add(var5);
            }
         }

         return ConfigConcatenation.concatenate(var2);
      }

      private SimpleConfigOrigin lineOrigin() {
         return ((SimpleConfigOrigin)this.baseOrigin).withLineNumber(this.lineNumber);
      }

      private ConfigException parseError(String var1) {
         return this.parseError(var1, null);
      }

      private ConfigException parseError(String var1, Throwable var2) {
         return new ConfigException.Parse(this.lineOrigin(), var1, var2);
      }

      private Path fullCurrentPath() {
         if (this.pathStack.isEmpty()) {
            throw new ConfigException.BugOrBroken("Bug in parser; tried to get current path when at root");
         } else {
            return new Path(this.pathStack.descendingIterator());
         }
      }

      private AbstractConfigValue parseValue(AbstractConfigNodeValue var1, List<String> var2) {
         int var4 = this.arrayCount;
         AbstractConfigValue var3;
         if (var1 instanceof ConfigNodeSimpleValue) {
            var3 = ((ConfigNodeSimpleValue)var1).value();
         } else if (var1 instanceof ConfigNodeObject) {
            var3 = this.parseObject((ConfigNodeObject)var1);
         } else if (var1 instanceof ConfigNodeArray) {
            var3 = this.parseArray((ConfigNodeArray)var1);
         } else {
            if (!(var1 instanceof ConfigNodeConcatenation)) {
               throw this.parseError("Expecting a value but got wrong node type: " + var1.getClass());
            }

            var3 = this.parseConcatenation((ConfigNodeConcatenation)var1);
         }

         if (var2 != null && !var2.isEmpty()) {
            var3 = var3.withOrigin(var3.origin().prependComments(new ArrayList<>(var2)));
            var2.clear();
         }

         if (this.arrayCount != var4) {
            throw new ConfigException.BugOrBroken("Bug in config parser: unbalanced array count");
         } else {
            return var3;
         }
      }

      private static AbstractConfigObject createValueUnderPath(Path var0, AbstractConfigValue var1) {
         ArrayList var2 = new ArrayList();
         String var3 = var0.first();

         for (Path var4 = var0.remainder(); var3 != null; var4 = var4.remainder()) {
            var2.add(var3);
            if (var4 == null) {
               break;
            }

            var3 = var4.first();
         }

         ListIterator var5 = var2.listIterator(var2.size());
         String var6 = (String)var5.previous();
         SimpleConfigObject var7 = new SimpleConfigObject(var1.origin().withComments(null), Collections.singletonMap(var6, var1));

         while (var5.hasPrevious()) {
            Map var8 = Collections.singletonMap(var5.previous(), var7);
            var7 = new SimpleConfigObject(var1.origin().withComments(null), var8);
         }

         return var7;
      }

      private void parseInclude(Map<String, AbstractConfigValue> var1, ConfigNodeInclude var2) {
         boolean var3 = var2.isRequired();
         ConfigIncludeContext var4 = this.includeContext.setParseOptions(this.includeContext.parseOptions().setAllowMissing(!var3));
         AbstractConfigObject var5;
         switch (var2.kind()) {
            case URL:
               URL var6;
               try {
                  var6 = new URL(var2.name());
               } catch (MalformedURLException var10) {
                  throw this.parseError("include url() specifies an invalid URL: " + var2.name(), var10);
               }

               var5 = (AbstractConfigObject)this.includer.includeURL(var4, var6);
               break;
            case FILE:
               var5 = (AbstractConfigObject)this.includer.includeFile(var4, new File(var2.name()));
               break;
            case CLASSPATH:
               var5 = (AbstractConfigObject)this.includer.includeResources(var4, var2.name());
               break;
            case HEURISTIC:
               var5 = (AbstractConfigObject)this.includer.include(var4, var2.name());
               break;
            default:
               throw new ConfigException.BugOrBroken("should not be reached");
         }

         if (this.arrayCount > 0 && var5.resolveStatus() != ResolveStatus.RESOLVED) {
            throw this.parseError(
               "Due to current limitations of the config parser, when an include statement is nested inside a list value, ${} substitutions inside the included file cannot be resolved correctly. Either move the include outside of the list value or remove the ${} statements from the included file."
            );
         }

         if (!this.pathStack.isEmpty()) {
            Path var11 = this.fullCurrentPath();
            var5 = var5.relativized(var11);
         }

         for (String var7 : var5.keySet()) {
            AbstractConfigValue var8 = var5.get(var7);
            AbstractConfigValue var9 = (AbstractConfigValue)var1.get(var7);
            if (var9 != null) {
               var1.put(var7, var8.withFallback(var9));
            } else {
               var1.put(var7, var8);
            }
         }
      }

      private AbstractConfigObject parseObject(ConfigNodeObject var1) {
         HashMap var2 = new HashMap();
         SimpleConfigOrigin var3 = this.lineOrigin();
         boolean var4 = false;
         ArrayList var5 = new ArrayList<>(var1.children());
         ArrayList var6 = new ArrayList();

         for (int var7 = 0; var7 < var5.size(); var7++) {
            AbstractConfigNode var8 = (AbstractConfigNode)var5.get(var7);
            if (var8 instanceof ConfigNodeComment) {
               var4 = false;
               var6.add(((ConfigNodeComment)var8).commentText());
            } else if (var8 instanceof ConfigNodeSingleToken && Tokens.isNewline(((ConfigNodeSingleToken)var8).token())) {
               this.lineNumber++;
               if (var4) {
                  var6.clear();
               }

               var4 = true;
            } else if (this.flavor != ConfigSyntax.JSON && var8 instanceof ConfigNodeInclude) {
               this.parseInclude(var2, (ConfigNodeInclude)var8);
               var4 = false;
            } else if (var8 instanceof ConfigNodeField) {
               var4 = false;
               Path var9 = ((ConfigNodeField)var8).path().value();
               var6.addAll(((ConfigNodeField)var8).comments());
               this.pathStack.push(var9);
               if (((ConfigNodeField)var8).separator() == Tokens.PLUS_EQUALS) {
                  if (this.arrayCount > 0) {
                     throw this.parseError(
                        "Due to current limitations of the config parser, += does not work nested inside a list. += expands to a ${} substitution and the path in ${} cannot currently refer to list elements. You might be able to move the += outside of the list and then refer to it from inside the list with ${}."
                     );
                  }

                  this.arrayCount++;
               }

               AbstractConfigNodeValue var10 = ((ConfigNodeField)var8).value();
               AbstractConfigValue var11 = this.parseValue(var10, var6);
               if (((ConfigNodeField)var8).separator() == Tokens.PLUS_EQUALS) {
                  this.arrayCount--;
                  ArrayList var12 = new ArrayList(2);
                  ConfigReference var13 = new ConfigReference(var11.origin(), new SubstitutionExpression(this.fullCurrentPath(), true));
                  SimpleConfigList var14 = new SimpleConfigList(var11.origin(), Collections.singletonList(var11));
                  var12.add(var13);
                  var12.add(var14);
                  var11 = ConfigConcatenation.concatenate(var12);
               }

               if (var7 < var5.size() - 1) {
                  var7++;

                  while (var7 < var5.size()) {
                     if (var5.get(var7) instanceof ConfigNodeComment) {
                        ConfigNodeComment var17 = (ConfigNodeComment)var5.get(var7);
                        var11 = var11.withOrigin(var11.origin().appendComments(Collections.singletonList(var17.commentText())));
                        break;
                     }

                     if (!(var5.get(var7) instanceof ConfigNodeSingleToken)) {
                        var7--;
                        break;
                     }

                     ConfigNodeSingleToken var16 = (ConfigNodeSingleToken)var5.get(var7);
                     if (var16.token() != Tokens.COMMA && !Tokens.isIgnoredWhitespace(var16.token())) {
                        var7--;
                        break;
                     }

                     var7++;
                  }
               }

               this.pathStack.pop();
               String var18 = var9.first();
               Path var19 = var9.remainder();
               if (var19 == null) {
                  AbstractConfigValue var20 = (AbstractConfigValue)var2.get(var18);
                  if (var20 != null) {
                     if (this.flavor == ConfigSyntax.JSON) {
                        throw this.parseError("JSON does not allow duplicate fields: '" + var18 + "' was already seen at " + var20.origin().description());
                     }

                     var11 = var11.withFallback(var20);
                  }

                  var2.put(var18, var11);
               } else {
                  if (this.flavor == ConfigSyntax.JSON) {
                     throw new ConfigException.BugOrBroken("somehow got multi-element path in JSON mode");
                  }

                  AbstractConfigObject var21 = createValueUnderPath(var19, var11);
                  AbstractConfigValue var15 = (AbstractConfigValue)var2.get(var18);
                  if (var15 != null) {
                     var21 = var21.withFallback(var15);
                  }

                  var2.put(var18, var21);
               }
            }
         }

         return new SimpleConfigObject(var3, var2);
      }

      private SimpleConfigList parseArray(ConfigNodeArray var1) {
         this.arrayCount++;
         SimpleConfigOrigin var2 = this.lineOrigin();
         ArrayList var3 = new ArrayList();
         boolean var4 = false;
         ArrayList var5 = new ArrayList();
         AbstractConfigValue var6 = null;

         for (AbstractConfigNode var8 : var1.children()) {
            if (var8 instanceof ConfigNodeComment) {
               var5.add(((ConfigNodeComment)var8).commentText());
               var4 = false;
            } else if (var8 instanceof ConfigNodeSingleToken && Tokens.isNewline(((ConfigNodeSingleToken)var8).token())) {
               this.lineNumber++;
               if (var4 && var6 == null) {
                  var5.clear();
               } else if (var6 != null) {
                  var3.add(var6.withOrigin(var6.origin().appendComments(new ArrayList<>(var5))));
                  var5.clear();
                  var6 = null;
               }

               var4 = true;
            } else if (var8 instanceof AbstractConfigNodeValue) {
               var4 = false;
               if (var6 != null) {
                  var3.add(var6.withOrigin(var6.origin().appendComments(new ArrayList<>(var5))));
                  var5.clear();
               }

               var6 = this.parseValue((AbstractConfigNodeValue)var8, var5);
            }
         }

         if (var6 != null) {
            var3.add(var6.withOrigin(var6.origin().appendComments(new ArrayList<>(var5))));
         }

         this.arrayCount--;
         return new SimpleConfigList(var2, var3);
      }

      AbstractConfigValue parse() {
         AbstractConfigValue var1 = null;
         ArrayList var2 = new ArrayList();
         boolean var3 = false;

         for (AbstractConfigNode var5 : this.document.children()) {
            if (var5 instanceof ConfigNodeComment) {
               var2.add(((ConfigNodeComment)var5).commentText());
               var3 = false;
            } else if (var5 instanceof ConfigNodeSingleToken) {
               Token var6 = ((ConfigNodeSingleToken)var5).token();
               if (Tokens.isNewline(var6)) {
                  this.lineNumber++;
                  if (var3 && var1 == null) {
                     var2.clear();
                  } else if (var1 != null) {
                     var1 = var1.withOrigin(var1.origin().appendComments(new ArrayList<>(var2)));
                     var2.clear();
                     break;
                  }

                  var3 = true;
               }
            } else if (var5 instanceof ConfigNodeComplexValue) {
               var1 = this.parseValue((ConfigNodeComplexValue)var5, var2);
               var3 = false;
            }
         }

         return var1;
      }
   }
}
