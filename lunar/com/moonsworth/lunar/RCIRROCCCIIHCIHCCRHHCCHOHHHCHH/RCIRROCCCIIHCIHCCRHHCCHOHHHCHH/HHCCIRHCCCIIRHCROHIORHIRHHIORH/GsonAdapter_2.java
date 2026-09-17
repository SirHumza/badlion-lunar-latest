package com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CORCOCICIRIOHROHROIIOOHICCHCRR
   extends com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements Serializable {
   private static final Logger OIIHROORCRORRRCOICCCHIOIHIHHRC = Logger.getLogger(CORCOCICIRIOHROHROIIOOHICCHCRR.class.getName());
   public static final Map<String, Class<?>> HCRCROOHOHOHOHCOCRCCHRIHCORRIO = new HashMap<>();

   public CORCOCICIRIOHROHROIIOOHICCHCRR() {
      super("anyOf", Boolean.FALSE);
   }

   public CORCOCICIRIOHROHROIIOOHICCHCRR(Object var1) {
      super("anyOf", Boolean.FALSE);
      this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
   }

   @Override
   public Map<String, Class<?>> OCIROOIHIHRHOCCHIIIROOCRIIOCRR() {
      return HCRCROOHOHOHOHCOCRCCHRIHCORRIO;
   }

   @Override
   public void RRCRRCORICCHOHHIRCHIROOHIIOHCO(Object var1) {
      if (var1 instanceof CRICCOOHHHCHOORCICOCOHIHOIRHOO) {
         super.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
      } else if (var1 instanceof IHHCHHHCRIHOOCOIOOCRIIICIOROIR) {
         super.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
      } else if (var1 instanceof RHOCHHIRRCHHHOHOIRROIROHHHIHIO) {
         super.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
      } else if (var1 instanceof ICICIOCHHHIHOCHCOHORIHRCOHHOCR) {
         super.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
      } else if (var1 instanceof RIRHOCHIORCCIIOIIRHOCCCRHHCHHH) {
         super.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
      } else if (var1 instanceof IOIICIRIICICIIOORHCIIIIRRIHRHI) {
         super.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
      } else if (var1 instanceof OCOHORHCROHICRRIHCIHHRRCIHICRI) {
         super.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
      } else {
         throw new RuntimeException(
            "Invalid instance type. Must be GameBlogPostInteractionEvent, GameFailedParseEvent, GamePromotionInteractionEvent, GameRewindEditorSessionEvent, GameRewindLayerAddEvent, GameRewindProjectExportEvent, GameRewindRecordingEvent"
         );
      }
   }

   @Override
   public Object HRCOCHHHCCIORCORCHIOOOCCCCHICH() {
      return super.HRCOCHHHCCIORCORCHIOOOCCCCHICH();
   }

   public CRICCOOHHHCHOORCICOCOHIHOIRHOO HIHCCHCCOCOHRICOICHRCOIHIIRIHO() {
      return (CRICCOOHHHCHOORCICOCOHIHOIRHOO)super.HRCOCHHHCCIORCORCHIOOOCCCCHICH();
   }

   public IHHCHHHCRIHOOCOIOOCRIIICIOROIR OOHRIIOOHROIOHCIRIHRHRRICRRHOI() {
      return (IHHCHHHCRIHOOCOIOOCRIIICIOROIR)super.HRCOCHHHCCIORCORCHIOOOCCCCHICH();
   }

   public RHOCHHIRRCHHHOHOIRROIROHHHIHIO RHHIOCHRCICCHOHCIHOOHOIHCCHRCO() {
      return (RHOCHHIRRCHHHOHOIRROIROHHHIHIO)super.HRCOCHHHCCIORCORCHIOOOCCCCHICH();
   }

   public ICICIOCHHHIHOCHCOHORIHRCOHHOCR OCIOROHIHRROROOIRRHRRCCHHRRRHI() {
      return (ICICIOCHHHIHOCHCOHORIHRCOHHOCR)super.HRCOCHHHCCIORCORCHIOOOCCCCHICH();
   }

   public RIRHOCHIORCCIIOIIRHOCCCRHHCHHH RHRCRCIOIOICRHRCCROIICCRRCOOOI() {
      return (RIRHOCHIORCCIIOIIRHOCCCRHHCHHH)super.HRCOCHHHCCIORCORCHIOOOCCCCHICH();
   }

   public IOIICIRIICICIIOORHCIIIIRRIHRHI HORHCHIIOCRROHOHRCORCCICCRCCHO() {
      return (IOIICIRIICICIIOORHCIIIIRRIHRHI)super.HRCOCHHHCCIORCORCHIOOOCCCCHICH();
   }

   public OCOHORHCROHICRRIHCIHHRRCIHICRI CIHCOICOOICHOCCHICIHRCOCIHRIOC() {
      return (OCOHORHCROHICRRIHCIHHRRCIHICRI)super.HRCOCHHHCCIORCORCHIOOOCCCCHICH();
   }

   public static void validateJsonElement(JsonElement var0) {
      ArrayList var1 = new ArrayList();

      try {
         CRICCOOHHHCHOORCICOCOHIHOIRHOO.validateJsonElement(var0);
      } catch (Exception var9) {
         var1.add(String.format("Deserialization for GameBlogPostInteractionEvent failed with `%s`.", var9.getMessage()));

         try {
            IHHCHHHCRIHOOCOIOOCRIIICIOROIR.validateJsonElement(var0);
         } catch (Exception var8) {
            var1.add(String.format("Deserialization for GamePromotionInteractionEvent failed with `%s`.", var8.getMessage()));

            try {
               RHOCHHIRRCHHHOHOIRROIROHHHIHIO.validateJsonElement(var0);
            } catch (Exception var7) {
               var1.add(String.format("Deserialization for GameRewindEditorSessionEvent failed with `%s`.", var7.getMessage()));

               try {
                  ICICIOCHHHIHOCHCOHORIHRCOHHOCR.validateJsonElement(var0);
               } catch (Exception var6) {
                  var1.add(String.format("Deserialization for GameRewindProjectExportEvent failed with `%s`.", var6.getMessage()));

                  try {
                     RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.validateJsonElement(var0);
                  } catch (Exception var5) {
                     var1.add(String.format("Deserialization for GameRewindRecordingEvent failed with `%s`.", var5.getMessage()));

                     try {
                        IOIICIRIICICIIOORHCIIIIRRIHRHI.validateJsonElement(var0);
                     } catch (Exception var4) {
                        var1.add(String.format("Deserialization for GameRewindLayerAddEvent failed with `%s`.", var4.getMessage()));

                        try {
                           OCOHORHCROHICRRIHCIHHRRCIHICRI.validateJsonElement(var0);
                        } catch (Exception var3) {
                           var1.add(String.format("Deserialization for GameFailedParseEvent failed with `%s`.", var3.getMessage()));
                           throw new IOException(
                              String.format(
                                 "The JSON string is invalid for GameBatchEvent with anyOf schemas: GameBlogPostInteractionEvent, GameFailedParseEvent, GamePromotionInteractionEvent, GameRewindEditorSessionEvent, GameRewindLayerAddEvent, GameRewindProjectExportEvent, GameRewindRecordingEvent. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s",
                                 var1,
                                 var0.toString()
                              )
                           );
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public static CORCOCICIRIOHROHROIIOOHICCHCRR COIOORHCRHCRCOROOHCHIRRIIOIOHR(String var0) {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .fromJson(var0, CORCOCICIRIOHROHROIIOOHICCHCRR.class);
   }

   public String IOHOOIOHCHICOCHIICHCICCOHRCIII() {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .toJson(this);
   }

   static {
      HCRCROOHOHOHOHCOCRCCHRIHCORRIO.put("GameBlogPostInteractionEvent", CRICCOOHHHCHOORCICOCOHIHOIRHOO.class);
      HCRCROOHOHOHOHCOCRCCHRIHCORRIO.put("GamePromotionInteractionEvent", IHHCHHHCRIHOOCOIOOCRIIICIOROIR.class);
      HCRCROOHOHOHOHCOCRCCHRIHCORRIO.put("GameRewindEditorSessionEvent", RHOCHHIRRCHHHOHOIRROIROHHHIHIO.class);
      HCRCROOHOHOHOHCOCRCCHRIHCORRIO.put("GameRewindProjectExportEvent", ICICIOCHHHIHOCHCOHORIHRCOHHOCR.class);
      HCRCROOHOHOHOHCOCRCCHRIHCORRIO.put("GameRewindRecordingEvent", RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.class);
      HCRCROOHOHOHOHCOCRCCHRIHCORRIO.put("GameRewindLayerAddEvent", IOIICIRIICICIIOORHCIIIIRRIHRHI.class);
      HCRCROOHOHOHOHCOCRCCHRIHCORRIO.put("GameFailedParseEvent", OCOHORHCROHICRRIHCIHHRRCIHICRI.class);
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements TypeAdapterFactory {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         if (!CORCOCICIRIOHROHROIIOOHICCHCRR.class.isAssignableFrom(var2.getRawType())) {
            return null;
         }

         final TypeAdapter var3 = var1.getAdapter(JsonElement.class);
         final TypeAdapter var4 = var1.getDelegateAdapter(this, TypeToken.get(CRICCOOHHHCHOORCICOCOHIHOIRHOO.class));
         final TypeAdapter var5 = var1.getDelegateAdapter(this, TypeToken.get(IHHCHHHCRIHOOCOIOOCRIIICIOROIR.class));
         final TypeAdapter var6 = var1.getDelegateAdapter(this, TypeToken.get(RHOCHHIRRCHHHOHOIRROIROHHHIHIO.class));
         final TypeAdapter var7 = var1.getDelegateAdapter(this, TypeToken.get(ICICIOCHHHIHOCHCOHORIHRCOHHOCR.class));
         final TypeAdapter var8 = var1.getDelegateAdapter(this, TypeToken.get(RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.class));
         final TypeAdapter var9 = var1.getDelegateAdapter(this, TypeToken.get(IOIICIRIICICIIOORHCIIIIRRIHRHI.class));
         final TypeAdapter var10 = var1.getDelegateAdapter(this, TypeToken.get(OCOHORHCROHICRRIHCIHHRRCIHICRI.class));
         return (TypeAdapter<T>)(new TypeAdapter<CORCOCICIRIOHROHROIIOOHICCHCRR>() {
               public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, CORCOCICIRIOHROHROIIOOHICCHCRR var2x) {
                  if (var2x == null || var2x.HRCOCHHHCCIORCORCHIOOOCCCCHICH() == null) {
                     var3.write(var1, null);
                  } else if (var2x.HRCOCHHHCCIORCORCHIOOOCCCCHICH() instanceof CRICCOOHHHCHOORCICOCOHIHOIRHOO) {
                     JsonElement var9x = var4.toJsonTree((CRICCOOHHHCHOORCICOCOHIHOIRHOO)var2x.HRCOCHHHCCIORCORCHIOOOCCCCHICH());
                     var3.write(var1, var9x);
                  } else if (var2x.HRCOCHHHCCIORCORCHIOOOCCCCHICH() instanceof IHHCHHHCRIHOOCOIOOCRIIICIOROIR) {
                     JsonElement var8x = var5.toJsonTree((IHHCHHHCRIHOOCOIOOCRIIICIOROIR)var2x.HRCOCHHHCCIORCORCHIOOOCCCCHICH());
                     var3.write(var1, var8x);
                  } else if (var2x.HRCOCHHHCCIORCORCHIOOOCCCCHICH() instanceof RHOCHHIRRCHHHOHOIRROIROHHHIHIO) {
                     JsonElement var7x = var6.toJsonTree((RHOCHHIRRCHHHOHOIRROIROHHHIHIO)var2x.HRCOCHHHCCIORCORCHIOOOCCCCHICH());
                     var3.write(var1, var7x);
                  } else if (var2x.HRCOCHHHCCIORCORCHIOOOCCCCHICH() instanceof ICICIOCHHHIHOCHCOHORIHRCOHHOCR) {
                     JsonElement var6x = var7.toJsonTree((ICICIOCHHHIHOCHCOHORIHRCOHHOCR)var2x.HRCOCHHHCCIORCORCHIOOOCCCCHICH());
                     var3.write(var1, var6x);
                  } else if (var2x.HRCOCHHHCCIORCORCHIOOOCCCCHICH() instanceof RIRHOCHIORCCIIOIIRHOCCCRHHCHHH) {
                     JsonElement var5x = var8.toJsonTree((RIRHOCHIORCCIIOIIRHOCCCRHHCHHH)var2x.HRCOCHHHCCIORCORCHIOOOCCCCHICH());
                     var3.write(var1, var5x);
                  } else if (var2x.HRCOCHHHCCIORCORCHIOOOCCCCHICH() instanceof IOIICIRIICICIIOORHCIIIIRRIHRHI) {
                     JsonElement var4x = var9.toJsonTree((IOIICIRIICICIIOORHCIIIIRRIHRHI)var2x.HRCOCHHHCCIORCORCHIOOOCCCCHICH());
                     var3.write(var1, var4x);
                  } else if (var2x.HRCOCHHHCCIORCORCHIOOOCCCCHICH() instanceof OCOHORHCROHICRRIHCIHHRRCIHICRI) {
                     JsonElement var3x = var10.toJsonTree((OCOHORHCROHICRRIHCIHHRRCIHICRI)var2x.HRCOCHHHCCIORCORCHIOOOCCCCHICH());
                     var3.write(var1, var3x);
                  } else {
                     throw new IOException(
                        "Failed to serialize as the type doesn't match anyOf schemas: GameBlogPostInteractionEvent, GameFailedParseEvent, GamePromotionInteractionEvent, GameRewindEditorSessionEvent, GameRewindLayerAddEvent, GameRewindProjectExportEvent, GameRewindRecordingEvent"
                     );
                  }
               }

               public CORCOCICIRIOHROHROIIOOHICCHCRR CRICCOOHHHCHOORCICOCOHIHOIRHOO(JsonReader var1) {
                  Object var2x = null;
                  JsonElement var3x = (JsonElement)var3.read(var1);
                  ArrayList var4x = new ArrayList();
                  TypeAdapter var5x = var3;

                  try {
                     CRICCOOHHHCHOORCICOCOHIHOIRHOO.validateJsonElement(var3x);
                     var5x = var4;
                     CORCOCICIRIOHROHROIIOOHICCHCRR var26 = new CORCOCICIRIOHROHROIIOOHICCHCRR();
                     var26.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var5x.fromJsonTree(var3x));
                     return var26;
                  } catch (Exception var13) {
                     var4x.add(String.format("Deserialization for GameBlogPostInteractionEvent failed with `%s`.", var13.getMessage()));
                     CORCOCICIRIOHROHROIIOOHICCHCRR.OIIHROORCRORRRCOICCCHIOIHIHHRC
                        .log(Level.FINER, "Input data does not match schema 'GameBlogPostInteractionEvent'", var13);

                     try {
                        IHHCHHHCRIHOOCOIOOCRIIICIOROIR.validateJsonElement(var3x);
                        var5x = var5;
                        CORCOCICIRIOHROHROIIOOHICCHCRR var25 = new CORCOCICIRIOHROHROIIOOHICCHCRR();
                        var25.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var5x.fromJsonTree(var3x));
                        return var25;
                     } catch (Exception var12) {
                        var4x.add(String.format("Deserialization for GamePromotionInteractionEvent failed with `%s`.", var12.getMessage()));
                        CORCOCICIRIOHROHROIIOOHICCHCRR.OIIHROORCRORRRCOICCCHIOIHIHHRC
                           .log(Level.FINER, "Input data does not match schema 'GamePromotionInteractionEvent'", var12);

                        try {
                           RHOCHHIRRCHHHOHOIRROIROHHHIHIO.validateJsonElement(var3x);
                           var5x = var6;
                           CORCOCICIRIOHROHROIIOOHICCHCRR var24 = new CORCOCICIRIOHROHROIIOOHICCHCRR();
                           var24.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var5x.fromJsonTree(var3x));
                           return var24;
                        } catch (Exception var11) {
                           var4x.add(String.format("Deserialization for GameRewindEditorSessionEvent failed with `%s`.", var11.getMessage()));
                           CORCOCICIRIOHROHROIIOOHICCHCRR.OIIHROORCRORRRCOICCCHIOIHIHHRC
                              .log(Level.FINER, "Input data does not match schema 'GameRewindEditorSessionEvent'", var11);

                           try {
                              ICICIOCHHHIHOCHCOHORIHRCOHHOCR.validateJsonElement(var3x);
                              var5x = var7;
                              CORCOCICIRIOHROHROIIOOHICCHCRR var23 = new CORCOCICIRIOHROHROIIOOHICCHCRR();
                              var23.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var5x.fromJsonTree(var3x));
                              return var23;
                           } catch (Exception var10x) {
                              var4x.add(String.format("Deserialization for GameRewindProjectExportEvent failed with `%s`.", var10x.getMessage()));
                              CORCOCICIRIOHROHROIIOOHICCHCRR.OIIHROORCRORRRCOICCCHIOIHIHHRC
                                 .log(Level.FINER, "Input data does not match schema 'GameRewindProjectExportEvent'", var10x);

                              try {
                                 RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.validateJsonElement(var3x);
                                 var5x = var8;
                                 CORCOCICIRIOHROHROIIOOHICCHCRR var22 = new CORCOCICIRIOHROHROIIOOHICCHCRR();
                                 var22.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var5x.fromJsonTree(var3x));
                                 return var22;
                              } catch (Exception var9x) {
                                 var4x.add(String.format("Deserialization for GameRewindRecordingEvent failed with `%s`.", var9x.getMessage()));
                                 CORCOCICIRIOHROHROIIOOHICCHCRR.OIIHROORCRORRRCOICCCHIOIHIHHRC
                                    .log(Level.FINER, "Input data does not match schema 'GameRewindRecordingEvent'", var9x);

                                 try {
                                    IOIICIRIICICIIOORHCIIIIRRIHRHI.validateJsonElement(var3x);
                                    var5x = var9;
                                    CORCOCICIRIOHROHROIIOOHICCHCRR var21 = new CORCOCICIRIOHROHROIIOOHICCHCRR();
                                    var21.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var5x.fromJsonTree(var3x));
                                    return var21;
                                 } catch (Exception var8x) {
                                    var4x.add(String.format("Deserialization for GameRewindLayerAddEvent failed with `%s`.", var8x.getMessage()));
                                    CORCOCICIRIOHROHROIIOOHICCHCRR.OIIHROORCRORRRCOICCCHIOIHIHHRC
                                       .log(Level.FINER, "Input data does not match schema 'GameRewindLayerAddEvent'", var8x);

                                    try {
                                       OCOHORHCROHICRRIHCIHHRRCIHICRI.validateJsonElement(var3x);
                                       var5x = var10;
                                       CORCOCICIRIOHROHROIIOOHICCHCRR var6x = new CORCOCICIRIOHROHROIIOOHICCHCRR();
                                       var6x.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var5x.fromJsonTree(var3x));
                                       return var6x;
                                    } catch (Exception var7x) {
                                       var4x.add(String.format("Deserialization for GameFailedParseEvent failed with `%s`.", var7x.getMessage()));
                                       CORCOCICIRIOHROHROIIOOHICCHCRR.OIIHROORCRORRRCOICCCHIOIHIHHRC
                                          .log(Level.FINER, "Input data does not match schema 'GameFailedParseEvent'", var7x);
                                       throw new IOException(
                                          String.format(
                                             "Failed deserialization for GameBatchEvent: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s",
                                             var4x,
                                             var3x.toString()
                                          )
                                       );
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            })
            .nullSafe();
      }
   }
}
