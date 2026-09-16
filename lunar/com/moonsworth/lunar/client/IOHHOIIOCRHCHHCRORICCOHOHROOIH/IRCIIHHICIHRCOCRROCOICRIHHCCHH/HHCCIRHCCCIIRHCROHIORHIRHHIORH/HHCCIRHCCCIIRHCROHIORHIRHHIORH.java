package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.common.collect.ImmutableSet;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.webosr.input.Mouse;
import com.moonsworth.webosr.wrappers.Browser;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements Browser.Listener {
   private static final Set<String> HHCCRRIRRICCICCROIOHRORICCIIIH = ImmutableSet.of(
      "lunarclientprod.com",
      "lunarclientdev.com",
      "lunarclientcdn.com",
      "lunarclient.com",
      "moonsworth.com",
      "moonsworth.store",
      new String[]{
         "mymoonsworth.store",
         "mcstats.com",
         "mcstats.cloud",
         "gstatic.com",
         "ingest.sentry.io",
         "googletagmanager.com",
         "googleoptimize.com",
         "fonts.googleapis.com",
         "moonsworthllc.workers.dev",
         "sky.shiiyu.moe",
         "nmsr.nickac.dev",
         "klipy.com",
         "cdn.jsdelivr.net",
         "cdn.discordapp.com",
         "pbs.twimg.com",
         "static-cdn.jtvnw.net",
         "yt3.googleusercontent.com",
         "yt3.ggpht.com"
      }
   );
   private static final Map<Browser, Mouse.Cursor> ORIOCIRRROIIOOIRHOCCIICOIRHHII = new HashMap<>();

   @Override
   public void onBeginLoad(Browser var1, long var2, boolean var4, String var5) {
      Browser.Listener.super.onBeginLoad(var1, var2, var4, var5);
   }

   @Override
   public void onFinishLoad(Browser var1, long var2, boolean var4, String var5) {
      Browser.Listener.super.onFinishLoad(var1, var2, var4, var5);
   }

   @Override
   public void onFailLoading(Browser var1, long var2, boolean var4, String var5, String var6, String var7, int var8) {
      Browser.Listener.super.onFailLoading(var1, var2, var4, var5, var6, var7, var8);
   }

   @Override
   public void onWindowObjectReady(Browser var1, long var2, boolean var4, String var5) {
      if (var5.startsWith(com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getUrl())) {
         com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
            .HCCCORIHOHHHOCCCCOCHIRHIICICHI()
            .set(false);
         com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
            .RIOHROIOCHOICOOIOCHHOCCCCICCOI(false);
      }
   }

   @Override
   public void onDocumentReady(Browser var1, long var2, boolean var4, String var5) {
      if (var5.startsWith(com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getUrl())) {
         var1.evalNoResult(
            "    (function() {\n        let eventBus = document.createElement(\"b\"); // Ultralight doesn't like constructing EventTarget directly\n\n        window.lunarInternalAccept = function(name, data) {\n            eventBus.dispatchEvent(new CustomEvent(name, {detail: data}));\n        };\n        window.lunarReady = {READY};\n        window.lunar = new Proxy({\n                subscribe(name, cb) {\n                    eventBus.addEventListener(name, cb);\n                },\n                unsubscribe(name, cb) {\n                    eventBus.removeEventListener(name, cb);\n                }\n            }, {\n                get(obj, prop) {\n                    if (obj.hasOwnProperty(prop)) return obj[prop];\n                    return async (...args) => {\n                        let val = window[`lunarInternalInvoke`](prop, ...args);\n                        if (typeof val === 'symbol') return \"\";\n                        return val;\n                    };\n                }\n            });\n    })();\n"
               .replace("{READY}", IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IIIOHRRCOOORCCICORHROCCHCRRRIR() ? "true" : "false")
         );
         com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
            .RCICROIRRIICIROHRHIOHRCHHROIII()
            .set(IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IIIOHRRCOOORCCICORHROCCHCRRRIR());
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "WebOSR", "Lunar Context Created"
         );
         this.HHIIOCIOCCICORHIOCRHIICIRCRHRO();
      }
   }

   protected void HHIIOCIOCCICORHIOCRHIICIRCRHRO() {
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
         .HCCCORIHOHHHOCCCCOCHIRHIICICHI()
         .set(true);
   }

   @Override
   public void onUpdateHistory(Browser var1) {
      Browser.Listener.super.onUpdateHistory(var1);
   }

   @Override
   public boolean onNetworkRequest(Browser var1, String var2, String var3, String var4, String var5, String var6, String var7) {
      try {
         if (com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOOIHCIIHOOHCRIRRHOCRROIICICCC()
            )
          {
            return true;
         }

         if (var2.startsWith("file:")) {
            return true;
         }

         String var8 = new URL(var2).getAuthority();
         if (HHCCRRIRRICCICCROIOHRORICCIIIH.stream().anyMatch(var1x -> var8.equals(var1x) || var8.endsWith("." + var1x))) {
            return true;
         }

         if (com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.isDebug()
            && var8.equals("localhost:3000")) {
            return true;
         }

         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "WebOSR", "Load filter blocked: (%s)[%s]", var8, var2
         );
         return false;
      } catch (Exception var9) {
         var9.printStackTrace();
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "WebOSR", "Load filter error: %s", var2
         );
         return false;
      }
   }

   @Override
   public String onEnforcePublicKey(Browser var1, String var2, String var3, String var4, String var5, String var6, String var7) {
      return Browser.Listener.super.onEnforcePublicKey(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public void onChangeTitle(Browser var1, String var2) {
      Browser.Listener.super.onChangeTitle(var1, var2);
   }

   @Override
   public void onChangeURL(Browser var1, String var2) {
      Browser.Listener.super.onChangeURL(var1, var2);
   }

   @Override
   public void onChangeTooltip(Browser var1, String var2) {
      Browser.Listener.super.onChangeTooltip(var1, var2);
   }

   @Override
   public void onRequestClose(Browser var1) {
      Browser.Listener.super.onRequestClose(var1);
   }

   @Override
   public void onCursorChange(Browser var1, Mouse.Cursor var2) {
      if (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
         .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
         .RIHHHIRRHCCRRRIRHCIRRIIIICOOCH()
         .get()) {
         com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC();
         boolean var4 = var3.OOHIORICCROCHCRCHCICRHCIOROICR().CROICROIRIRRCCCRHIRIRCROCCOOIC()
            || var3.HOCOHOIICRHCHHIROHCIICCHHCRCRH() != null && var3.HOCOHOIICRHCHHIROHCIICCHHCRCRH().CROICROIRIRRCCCRHIRIRCROCCOOIC();
         if (var4) {
            ORIOCIRRROIIOOIRHOCCIICOIRHHII.put(var1, var2);
         } else {
            ORIOCIRRROIIOOIRHOCCIICOIRHHII.put(var1, Mouse.Cursor.PASS_THROUGH);
         }

         Mouse.Cursor var5 = ORIOCIRRROIIOOIRHOCCIICOIRHHII.values()
            .stream()
            .filter(var1x -> !this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x))
            .findFirst()
            .orElse(var4 && IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 5 ? Mouse.Cursor.POINTER : Mouse.Cursor.PASS_THROUGH);
         com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.setCursor(var5);
      } else {
         ORIOCIRRROIIOOIRHOCCIICOIRHHII.clear();
      }
   }

   private boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Mouse.Cursor var1) {
      return var1 == Mouse.Cursor.PASS_THROUGH || var1 == Mouse.Cursor.POINTER;
   }
}
