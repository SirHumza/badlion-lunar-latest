package io.sentry.util;

import io.sentry.ISpan;
import io.sentry.protocol.Request;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class UrlUtils {
   @NotNull
   public static final String SENSITIVE_DATA_SUBSTITUTE = "[Filtered]";
   @NotNull
   private static final Pattern AUTH_REGEX = Pattern.compile("(.+://)(.*@)(.*)");

   @Nullable
   public static UrlUtils.UrlDetails parseNullable(@Nullable String var0) {
      return var0 == null ? null : parse(var0);
   }

   @NotNull
   public static UrlUtils.UrlDetails parse(@NotNull String var0) {
      return isAbsoluteUrl(var0) ? splitAbsoluteUrl(var0) : splitRelativeUrl(var0);
   }

   private static boolean isAbsoluteUrl(@NotNull String var0) {
      return var0.contains("://");
   }

   @NotNull
   private static UrlUtils.UrlDetails splitRelativeUrl(@NotNull String var0) {
      int var1 = var0.indexOf("?");
      int var2 = var0.indexOf("#");
      String var3 = extractBaseUrl(var0, var1, var2);
      String var4 = extractQuery(var0, var1, var2);
      String var5 = extractFragment(var0, var2);
      return new UrlUtils.UrlDetails(var3, var4, var5);
   }

   @Nullable
   private static String extractBaseUrl(@NotNull String var0, int var1, int var2) {
      if (var1 >= 0) {
         return var0.substring(0, var1).trim();
      } else {
         return var2 >= 0 ? var0.substring(0, var2).trim() : var0;
      }
   }

   @Nullable
   private static String extractQuery(@NotNull String var0, int var1, int var2) {
      if (var1 > 0) {
         return var2 > 0 && var2 > var1 ? var0.substring(var1 + 1, var2).trim() : var0.substring(var1 + 1).trim();
      } else {
         return null;
      }
   }

   @Nullable
   private static String extractFragment(@NotNull String var0, int var1) {
      return var1 > 0 ? var0.substring(var1 + 1).trim() : null;
   }

   @NotNull
   private static UrlUtils.UrlDetails splitAbsoluteUrl(@NotNull String var0) {
      try {
         String var1 = urlWithAuthRemoved(var0);
         URL var2 = new URL(var0);
         String var3 = baseUrlOnly(var1);
         if (var3.contains("#")) {
            return new UrlUtils.UrlDetails(null, null, null);
         }

         String var4 = var2.getQuery();
         String var5 = var2.getRef();
         return new UrlUtils.UrlDetails(var3, var4, var5);
      } catch (MalformedURLException var6) {
         return new UrlUtils.UrlDetails(null, null, null);
      }
   }

   @NotNull
   private static String urlWithAuthRemoved(@NotNull String var0) {
      Matcher var1 = AUTH_REGEX.matcher(var0);
      if (var1.matches() && var1.groupCount() == 3) {
         String var2 = var1.group(2);
         String var3 = var2.contains(":") ? "[Filtered]:[Filtered]@" : "[Filtered]@";
         return var1.group(1) + var3 + var1.group(3);
      } else {
         return var0;
      }
   }

   @NotNull
   private static String baseUrlOnly(@NotNull String var0) {
      int var1 = var0.indexOf("?");
      if (var1 >= 0) {
         return var0.substring(0, var1).trim();
      }

      int var2 = var0.indexOf("#");
      return var2 >= 0 ? var0.substring(0, var2).trim() : var0;
   }

   public static final class UrlDetails {
      @Nullable
      private final String url;
      @Nullable
      private final String query;
      @Nullable
      private final String fragment;

      public UrlDetails(@Nullable String var1, @Nullable String var2, @Nullable String var3) {
         this.url = var1;
         this.query = var2;
         this.fragment = var3;
      }

      @Nullable
      public String getUrl() {
         return this.url;
      }

      @NotNull
      public String getUrlOrFallback() {
         return this.url == null ? "unknown" : this.url;
      }

      @Nullable
      public String getQuery() {
         return this.query;
      }

      @Nullable
      public String getFragment() {
         return this.fragment;
      }

      public void applyToRequest(@Nullable Request var1) {
         if (var1 != null) {
            var1.setUrl(this.url);
            var1.setQueryString(this.query);
            var1.setFragment(this.fragment);
         }
      }

      public void applyToSpan(@Nullable ISpan var1) {
         if (var1 != null) {
            if (this.query != null) {
               var1.setData("http.query", this.query);
            }

            if (this.fragment != null) {
               var1.setData("http.fragment", this.fragment);
            }
         }
      }
   }
}
