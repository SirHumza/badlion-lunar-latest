package io.sentry.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class HttpUtils {
   public static final String COOKIE_HEADER_NAME = "Cookie";
   private static final List<String> SENSITIVE_HEADERS = Arrays.asList(
      "X-FORWARDED-FOR",
      "AUTHORIZATION",
      "COOKIE",
      "SET-COOKIE",
      "X-API-KEY",
      "X-REAL-IP",
      "REMOTE-ADDR",
      "FORWARDED",
      "PROXY-AUTHORIZATION",
      "X-CSRF-TOKEN",
      "X-CSRFTOKEN",
      "X-XSRF-TOKEN"
   );
   private static final List<String> SECURITY_COOKIES = Arrays.asList(
      "JSESSIONID", "JSESSIONIDSSO", "JSSOSESSIONID", "SESSIONID", "SID", "CSRFTOKEN", "XSRF-TOKEN"
   );

   public static boolean containsSensitiveHeader(@NotNull String var0) {
      return SENSITIVE_HEADERS.contains(var0.toUpperCase(Locale.ROOT));
   }

   @Nullable
   public static List<String> filterOutSecurityCookiesFromHeader(@Nullable Enumeration<String> var0, @Nullable String var1, @Nullable List<String> var2) {
      return var0 == null ? null : filterOutSecurityCookiesFromHeader(Collections.list(var0), var1, var2);
   }

   @Nullable
   public static List<String> filterOutSecurityCookiesFromHeader(@Nullable List<String> var0, @Nullable String var1, @Nullable List<String> var2) {
      if (var0 == null) {
         return null;
      }

      if (var1 != null && !"Cookie".equalsIgnoreCase(var1)) {
         return var0;
      }

      ArrayList var3 = new ArrayList();

      for (String var5 : var0) {
         var3.add(filterOutSecurityCookies(var5, var2));
      }

      return var3;
   }

   @Nullable
   public static String filterOutSecurityCookies(@Nullable String var0, @Nullable List<String> var1) {
      if (var0 == null) {
         return null;
      }

      try {
         String[] var2 = var0.split(";", -1);
         StringBuilder var3 = new StringBuilder();
         boolean var4 = true;

         for (String var8 : var2) {
            if (!var4) {
               var3.append(";");
            }

            String[] var9 = var8.split("=", -1);
            String var10 = var9[0];
            if (isSecurityCookie(var10.trim(), var1)) {
               var3.append(var10 + "=" + "[Filtered]");
            } else {
               var3.append(var8);
            }

            var4 = false;
         }

         return var3.toString();
      } catch (Throwable var11) {
         return null;
      }
   }

   public static boolean isSecurityCookie(@NotNull String var0, @Nullable List<String> var1) {
      String var2 = var0.toUpperCase(Locale.ROOT);
      if (SECURITY_COOKIES.contains(var2)) {
         return true;
      }

      if (var1 != null) {
         for (String var4 : var1) {
            if (var4.toUpperCase(Locale.ROOT).equals(var2)) {
               return true;
            }
         }
      }

      return false;
   }
}
