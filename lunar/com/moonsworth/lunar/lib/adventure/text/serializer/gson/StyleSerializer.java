package com.moonsworth.lunar.lib.adventure.text.serializer.gson;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.event.ClickEvent;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent;
import com.moonsworth.lunar.lib.adventure.text.format.ShadowColor;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import com.moonsworth.lunar.lib.adventure.text.serializer.json.JSONOptions;
import com.moonsworth.lunar.lib.adventure.util.Codec;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Map.Entry;
import org.jetbrains.annotations.Nullable;

final class StyleSerializer extends TypeAdapter<Style> {
   private static final TextDecoration[] DECORATIONS = new TextDecoration[]{
      TextDecoration.BOLD, TextDecoration.ITALIC, TextDecoration.UNDERLINED, TextDecoration.STRIKETHROUGH, TextDecoration.OBFUSCATED
   };
   private static final String FALLBACK_URL_PROTOCOL = "https://";
   private final com.moonsworth.lunar.lib.adventure.text.serializer.json.LegacyHoverEventSerializer legacyHover;
   private final boolean emitValueFieldHover;
   private final boolean emitCamelCaseHover;
   private final boolean emitSnakeCaseHover;
   private final boolean emitCamelCaseClick;
   private final boolean emitSnakeCaseClick;
   private final boolean strictEventValues;
   private final boolean emitShadowColor;
   private final boolean emitStringPage;
   private final boolean emitClickUrlHttps;
   private final Gson gson;

   static TypeAdapter<Style> create(@Nullable LegacyHoverEventSerializer var0, RRCRRCORICCHOHHIRCHIROOHIIOHCO var1, Gson var2) {
      JSONOptions.HoverEventValueMode var3 = var1.value(JSONOptions.EMIT_HOVER_EVENT_TYPE);
      JSONOptions.ClickEventValueMode var4 = var1.value(JSONOptions.EMIT_CLICK_EVENT_TYPE);
      return new StyleSerializer(
            var0,
            var3 == JSONOptions.HoverEventValueMode.VALUE_FIELD || var3 == JSONOptions.HoverEventValueMode.ALL,
            var3 == JSONOptions.HoverEventValueMode.CAMEL_CASE || var3 == JSONOptions.HoverEventValueMode.ALL,
            var3 == JSONOptions.HoverEventValueMode.SNAKE_CASE || var3 == JSONOptions.HoverEventValueMode.ALL,
            var4 == JSONOptions.ClickEventValueMode.CAMEL_CASE || var4 == JSONOptions.ClickEventValueMode.BOTH,
            var4 == JSONOptions.ClickEventValueMode.SNAKE_CASE || var4 == JSONOptions.ClickEventValueMode.BOTH,
            var1.value(JSONOptions.VALIDATE_STRICT_EVENTS),
            var1.value(JSONOptions.SHADOW_COLOR_MODE) != JSONOptions.ShadowColorEmitMode.NONE,
            var1.value(JSONOptions.EMIT_CHANGE_PAGE_CLICK_EVENT_PAGE_AS_STRING),
            var1.value(JSONOptions.EMIT_CLICK_URL_HTTPS),
            var2
         )
         .nullSafe();
   }

   private StyleSerializer(
      @Nullable LegacyHoverEventSerializer var1,
      boolean var2,
      boolean var3,
      boolean var4,
      boolean var5,
      boolean var6,
      boolean var7,
      boolean var8,
      boolean var9,
      boolean var10,
      Gson var11
   ) {
      this.legacyHover = var1;
      this.emitValueFieldHover = var2;
      this.emitCamelCaseHover = var3;
      this.emitSnakeCaseHover = var4;
      this.emitCamelCaseClick = var5;
      this.emitSnakeCaseClick = var6;
      this.strictEventValues = var7;
      this.emitShadowColor = var8;
      this.emitStringPage = var9;
      this.emitClickUrlHttps = var10;
      this.gson = var11;
   }

   public Style read(JsonReader var1) {
      var1.beginObject();
      Style.Builder var2 = Style.style();

      while (var1.hasNext()) {
         String var3 = var1.nextName();
         if (var3.equals("font")) {
            var2.font(this.gson.fromJson(var1, SerializerFactory.KEY_TYPE));
         } else if (var3.equals("color")) {
            TextColorWrapper var12 = this.gson.fromJson(var1, SerializerFactory.COLOR_WRAPPER_TYPE);
            if (var12.color != null) {
               var2.color(var12.color);
            } else if (var12.decoration != null) {
               var2.decoration(var12.decoration, TextDecoration.State.TRUE);
            }
         } else if (var3.equals("shadow_color")) {
            var2.shadowColor(this.gson.fromJson(var1, SerializerFactory.SHADOW_COLOR_TYPE));
         } else if (TextDecoration.NAMES.keys().contains(var3)) {
            var2.decoration(TextDecoration.NAMES.value(var3), GsonHacks.readBoolean(var1));
         } else if (var3.equals("insertion")) {
            var2.insertion(var1.nextString());
         } else if (!var3.equals("click_event") && !var3.equals("clickEvent")) {
            if (!var3.equals("hover_event") && !var3.equals("hoverEvent")) {
               var1.skipValue();
            } else {
               JsonObject var11 = this.gson.fromJson(var1, JsonObject.class);
               if (var11 != null) {
                  JsonPrimitive var13 = var11.getAsJsonPrimitive("action");
                  if (var13 != null) {
                     HoverEvent.Action var14 = this.gson.fromJson(var13, SerializerFactory.HOVER_ACTION_TYPE);
                     if (var14.readable()) {
                        Class var16 = var14.type();
                        Object var15;
                        if (var11.has("contents")) {
                           JsonElement var9 = var11.get("contents");
                           if (GsonHacks.isNullOrEmpty(var9)) {
                              if (this.strictEventValues) {
                                 throw ComponentSerializerImpl.notSureHowToDeserialize(var9);
                              }

                              var15 = null;
                           } else if (SerializerFactory.COMPONENT_TYPE.isAssignableFrom(var16)) {
                              var15 = this.gson.fromJson(var9, SerializerFactory.COMPONENT_TYPE);
                           } else if (SerializerFactory.SHOW_ITEM_TYPE.isAssignableFrom(var16)) {
                              var15 = this.gson.fromJson(var9, SerializerFactory.SHOW_ITEM_TYPE);
                           } else if (SerializerFactory.SHOW_ENTITY_TYPE.isAssignableFrom(var16)) {
                              var15 = this.gson.fromJson(var9, SerializerFactory.SHOW_ENTITY_TYPE);
                           } else {
                              var15 = null;
                           }
                        } else if (var11.has("value")) {
                           JsonElement var17 = var11.get("value");
                           if (GsonHacks.isNullOrEmpty(var17)) {
                              if (this.strictEventValues) {
                                 throw ComponentSerializerImpl.notSureHowToDeserialize(var17);
                              }

                              var15 = null;
                           } else if (SerializerFactory.COMPONENT_TYPE.isAssignableFrom(var16)) {
                              Component var10 = this.gson.fromJson(var17, SerializerFactory.COMPONENT_TYPE);
                              var15 = this.legacyHoverEventContents(var14, var10);
                           } else if (SerializerFactory.STRING_TYPE.isAssignableFrom(var16)) {
                              var15 = this.gson.fromJson(var17, SerializerFactory.STRING_TYPE);
                           } else {
                              var15 = null;
                           }
                        } else if (SerializerFactory.SHOW_ITEM_TYPE.isAssignableFrom(var16)) {
                           var15 = this.gson.fromJson(var11, SerializerFactory.SHOW_ITEM_TYPE);
                        } else if (SerializerFactory.SHOW_ENTITY_TYPE.isAssignableFrom(var16)) {
                           var15 = this.gson.fromJson(var11, SerializerFactory.SHOW_ENTITY_TYPE);
                        } else {
                           if (this.strictEventValues) {
                              throw ComponentSerializerImpl.notSureHowToDeserialize(var11);
                           }

                           var15 = null;
                        }

                        if (var15 != null) {
                           var2.hoverEvent(HoverEvent.hoverEvent(var14, var15));
                        }
                     }
                  }
               }
            }
         } else {
            var1.beginObject();
            ClickEvent.Action var4 = null;
            String var5 = null;
            Key var6 = null;
            Integer var7 = null;

            while (var1.hasNext()) {
               String var8 = var1.nextName();
               if (var8.equals("action")) {
                  var4 = this.gson.fromJson(var1, SerializerFactory.CLICK_ACTION_TYPE);
               } else if (var8.equals("page")) {
                  if (var1.peek() == JsonToken.NUMBER) {
                     var7 = var1.nextInt();
                  } else if (var1.peek() == JsonToken.STRING) {
                     var7 = Integer.parseInt(var1.nextString());
                  } else {
                     if (var1.peek() == JsonToken.NULL) {
                        throw ComponentSerializerImpl.notSureHowToDeserialize(var8);
                     }

                     var1.skipValue();
                  }
               } else if (var8.equals("value") || var8.equals("url") || var8.equals("path") || var8.equals("command") || var8.equals("payload")) {
                  if (var1.peek() == JsonToken.NULL) {
                     if (this.strictEventValues) {
                        throw ComponentSerializerImpl.notSureHowToDeserialize(var8);
                     }

                     var1.nextNull();
                  } else {
                     var5 = var1.nextString();
                  }
               } else if (var8.equals("id")) {
                  var6 = Key.key(var1.nextString());
               } else {
                  var1.skipValue();
               }
            }

            if (var4 != null && var4.readable()) {
               switch (var4) {
                  case OPEN_URL:
                     if (var5 != null) {
                        var2.clickEvent(ClickEvent.openUrl(var5));
                     }
                     break;
                  case RUN_COMMAND:
                     if (var5 != null) {
                        var2.clickEvent(ClickEvent.runCommand(var5));
                     }
                     break;
                  case SUGGEST_COMMAND:
                     if (var5 != null) {
                        var2.clickEvent(ClickEvent.suggestCommand(var5));
                     }
                     break;
                  case CHANGE_PAGE:
                     if (var7 != null) {
                        var2.clickEvent(ClickEvent.changePage(var7));
                     }
                     break;
                  case COPY_TO_CLIPBOARD:
                     if (var5 != null) {
                        var2.clickEvent(ClickEvent.copyToClipboard(var5));
                     }
                     break;
                  case CUSTOM:
                     if (var6 != null && var5 != null) {
                        var2.clickEvent(ClickEvent.custom(var6, var5));
                     }
                  case SHOW_DIALOG:
                  case OPEN_FILE:
               }
            }

            var1.endObject();
         }
      }

      var1.endObject();
      return var2.build();
   }

   private Object legacyHoverEventContents(HoverEvent.Action<?> var1, Component var2) {
      if (var1 == HoverEvent.Action.SHOW_TEXT) {
         return var2;
      }

      if (this.legacyHover != null) {
         try {
            if (var1 == HoverEvent.Action.SHOW_ENTITY) {
               return this.legacyHover.deserializeShowEntity(var2, this.decoder());
            }

            if (var1 == HoverEvent.Action.SHOW_ITEM) {
               return this.legacyHover.deserializeShowItem(var2);
            }
         } catch (IOException var4) {
            throw new JsonParseException(var4);
         }
      }

      throw new UnsupportedOperationException();
   }

   private Codec.Decoder<Component, String, JsonParseException> decoder() {
      return var1 -> this.gson.fromJson(var1, SerializerFactory.COMPONENT_TYPE);
   }

   private Codec.Encoder<Component, String, JsonParseException> encoder() {
      return var1 -> this.gson.toJson(var1, SerializerFactory.COMPONENT_TYPE);
   }

   public void write(JsonWriter var1, Style var2) {
      var1.beginObject();
      int var3 = 0;

      for (int var4 = DECORATIONS.length; var3 < var4; var3++) {
         TextDecoration var5 = DECORATIONS[var3];
         TextDecoration.State var6 = var2.decoration(var5);
         if (var6 != TextDecoration.State.NOT_SET) {
            String var7 = TextDecoration.NAMES.key(var5);
            assert var7 != null;
            var1.name(var7);
            var1.value(var6 == TextDecoration.State.TRUE);
         }
      }

      TextColor var11 = var2.color();
      if (var11 != null) {
         var1.name("color");
         this.gson.toJson(var11, SerializerFactory.COLOR_TYPE, var1);
      }

      ShadowColor var12 = var2.shadowColor();
      if (var12 != null && this.emitShadowColor) {
         var1.name("shadow_color");
         this.gson.toJson(var12, SerializerFactory.SHADOW_COLOR_TYPE, var1);
      }

      String var13 = var2.insertion();
      if (var13 != null) {
         var1.name("insertion");
         var1.value(var13);
      }

      ClickEvent var14 = var2.clickEvent();
      if (var14 != null) {
         ClickEvent.Action var15 = var14.action();
         if (this.emitSnakeCaseClick) {
            var1.name("click_event");
            var1.beginObject();
            var1.name("action");
            this.gson.toJson(var15, SerializerFactory.CLICK_ACTION_TYPE, var1);
            if (var15.readable()) {
               ClickEvent.Payload var8 = var14.payload();
               if (var8 instanceof ClickEvent.Payload.Text) {
                  switch (var15) {
                     case OPEN_URL:
                        var1.name("url");
                        break;
                     case RUN_COMMAND:
                     case SUGGEST_COMMAND:
                        var1.name("command");
                     case CHANGE_PAGE:
                     default:
                        break;
                     case COPY_TO_CLIPBOARD:
                        var1.name("value");
                  }

                  String var9 = ((ClickEvent.Payload.Text)var8).value();
                  if (var15 == ClickEvent.Action.OPEN_URL && this.emitClickUrlHttps && !isValidUrlScheme(var9)) {
                     var9 = "https://" + var9;
                  }

                  var1.value(var9);
               } else if (var8 instanceof ClickEvent.Payload.Custom) {
                  ClickEvent.Payload.Custom var20 = (ClickEvent.Payload.Custom)var8;
                  var1.name("id");
                  this.gson.toJson(var20.key(), SerializerFactory.KEY_TYPE, var1);
                  var1.name("payload");
                  var1.value(var20.data());
               } else if (var8 instanceof ClickEvent.Payload.Int) {
                  ClickEvent.Payload.Int var21 = (ClickEvent.Payload.Int)var8;
                  var1.name("page");
                  if (this.emitStringPage) {
                     var1.value(String.valueOf(var21.integer()));
                  } else {
                     var1.value(var21.integer());
                  }
               }
            }

            var1.endObject();
         }

         if (this.emitCamelCaseClick && var15.payloadType() == ClickEvent.Payload.Text.class) {
            var1.name("clickEvent");
            var1.beginObject();
            var1.name("action");
            this.gson.toJson(var15, SerializerFactory.CLICK_ACTION_TYPE, var1);
            var1.name("value");
            String var17 = var14.value();
            if (var15 == ClickEvent.Action.OPEN_URL && this.emitClickUrlHttps && !isValidUrlScheme(var17)) {
               var17 = "https://" + var17;
            }

            var1.value(var17);
            var1.endObject();
         }
      }

      HoverEvent var16 = var2.hoverEvent();
      if (var16 != null
         && ((this.emitSnakeCaseHover || this.emitCamelCaseHover) && var16.action() != HoverEvent.Action.SHOW_ACHIEVEMENT || this.emitValueFieldHover)) {
         HoverEvent.Action var18 = var16.action();
         if (this.emitSnakeCaseHover && var18 != HoverEvent.Action.SHOW_ACHIEVEMENT) {
            var1.name("hover_event");
            var1.beginObject();
            var1.name("action");
            this.gson.toJson(var18, SerializerFactory.HOVER_ACTION_TYPE, var1);
            if (var18 == HoverEvent.Action.SHOW_ITEM) {
               for (Entry var10 : this.gson.toJsonTree(var16.value(), SerializerFactory.SHOW_ITEM_TYPE).getAsJsonObject().entrySet()) {
                  var1.name((String)var10.getKey());
                  this.gson.toJson((JsonElement)var10.getValue(), var1);
               }
            } else if (var18 == HoverEvent.Action.SHOW_ENTITY) {
               for (Entry var24 : this.gson.toJsonTree(var16.value(), SerializerFactory.SHOW_ENTITY_TYPE).getAsJsonObject().entrySet()) {
                  var1.name((String)var24.getKey());
                  this.gson.toJson((JsonElement)var24.getValue(), var1);
               }
            } else {
               if (var18 != HoverEvent.Action.SHOW_TEXT) {
                  throw new JsonParseException("Don't know how to serialize " + var16.value());
               }

               var1.name("value");
               this.gson.toJson(var16.value(), SerializerFactory.COMPONENT_TYPE, var1);
            }

            var1.endObject();
         }

         if (this.emitCamelCaseHover || this.emitValueFieldHover) {
            var1.name("hoverEvent");
            var1.beginObject();
            var1.name("action");
            this.gson.toJson(var18, SerializerFactory.HOVER_ACTION_TYPE, var1);
            if (this.emitCamelCaseHover && var18 != HoverEvent.Action.SHOW_ACHIEVEMENT) {
               var1.name("contents");
               if (var18 == HoverEvent.Action.SHOW_ITEM) {
                  this.gson.toJson(var16.value(), SerializerFactory.SHOW_ITEM_TYPE, var1);
               } else if (var18 == HoverEvent.Action.SHOW_ENTITY) {
                  this.gson.toJson(var16.value(), SerializerFactory.SHOW_ENTITY_TYPE, var1);
               } else {
                  if (var18 != HoverEvent.Action.SHOW_TEXT) {
                     throw new JsonParseException("Don't know how to serialize " + var16.value());
                  }

                  this.gson.toJson(var16.value(), SerializerFactory.COMPONENT_TYPE, var1);
               }
            }

            if (this.emitValueFieldHover) {
               var1.name("value");
               this.serializeLegacyHoverEvent(var16, var1);
            }

            var1.endObject();
         }
      }

      Key var19 = var2.font();
      if (var19 != null) {
         var1.name("font");
         this.gson.toJson(var19, SerializerFactory.KEY_TYPE, var1);
      }

      var1.endObject();
   }

   private void serializeLegacyHoverEvent(HoverEvent<?> var1, JsonWriter var2) {
      if (var1.action() == HoverEvent.Action.SHOW_TEXT) {
         this.gson.toJson(var1.value(), SerializerFactory.COMPONENT_TYPE, var2);
      } else if (var1.action() == HoverEvent.Action.SHOW_ACHIEVEMENT) {
         this.gson.toJson(var1.value(), String.class, var2);
      } else if (this.legacyHover != null) {
         Component var3 = null;

         try {
            if (var1.action() == HoverEvent.Action.SHOW_ENTITY) {
               var3 = this.legacyHover.serializeShowEntity((HoverEvent.ShowEntity)var1.value(), this.encoder());
            } else if (var1.action() == HoverEvent.Action.SHOW_ITEM) {
               var3 = this.legacyHover.serializeShowItem((HoverEvent.ShowItem)var1.value());
            }
         } catch (IOException var5) {
            throw new JsonSyntaxException(var5);
         }

         if (var3 != null) {
            this.gson.toJson(var3, SerializerFactory.COMPONENT_TYPE, var2);
         } else {
            var2.nullValue();
         }
      } else {
         var2.nullValue();
      }
   }

   private static boolean isValidUrlScheme(String var0) {
      return var0.startsWith("http://") || var0.startsWith("https://");
   }

   static {
      EnumSet var0 = EnumSet.allOf(TextDecoration.class);

      for (TextDecoration var4 : DECORATIONS) {
         var0.remove(var4);
      }

      if (!var0.isEmpty()) {
         throw new IllegalStateException("Gson serializer is missing some text decorations: " + var0);
      }
   }
}
