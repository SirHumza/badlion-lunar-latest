package com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Interceptor.Chain;
import okhttp3.OkHttpClient.Builder;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import okio.Buffer;
import okio.BufferedSink;
import okio.Okio;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private String basePath = "https://analytics.lunarclientprod.com";
   protected List<HICHRCOHCCRHOHCICOOCHOIHCCHIRI> servers = new ArrayList<>(
      Arrays.asList(
         new HICHRCOHCCRHOHCICOOCHOIHCCHIRI("https://analytics.lunarclientprod.com", "Production", new HashMap<>()),
         new HICHRCOHCCRHOHCICOOCHOIHCCHIRI("https://analytics.lunarclientdev.com", "Development", new HashMap<>())
      )
   );
   protected Integer IIHHICHCCCOHCHROIRIHICCHHOROCR = 0;
   protected Map<String, String> IIIIRHIHROIRCROHHROIHIIHRCRRHO = null;
   private boolean RRRHHIRORHCHHCOOCIHOICORHHCHHO = false;
   private Map<String, String> ORIOHRCIHRCOOHICCCRIIIHCRHHIHI = new HashMap<>();
   private Map<String, String> CHHIICHRIIROIOHIHIIROICOCCROCI = new HashMap<>();
   private String COOCCHICCCIIICRHIOCOCIOOORCOCC = null;
   private Map<String, com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> RIHOOCIHRICOCHRHCOOCCOIHOCHRCR;
   private DateFormat ORRCOOOCHCIIRRRCORIIOOHHOHCOIH;
   private DateFormat HRHIHIRHRCHHRORRRCORHOCIRHRIOR;
   private boolean OCOROCROIRCHIHIHHOOIRIIIRRCRHI;
   private int IOCIIROIRCOHIRHHHROHCOOHIICIHI;
   private InputStream CCRHOICIRORRHOOOCIHHHHCHCICHOH;
   private boolean CCHORHIOORICCIRIHRIIHIICORIORO;
   private KeyManager[] OCIIROIOORRIOIIIRHIRRCCIIRRROH;
   private OkHttpClient HRHRORCIRICHCCCCCHICOOICIRHRIO;
   private HRCHROOHRIHCRCRHRIIROCIRHOIRHH ROHHHCHRIHHOOHCHIIIHOOCIIRROIO;
   private HttpLoggingInterceptor HOHCCHOIOHOHHOROHOIIHOOHORRHRO;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      this.init();
      this.CCIHHRIOOOOCOHRCIHOHROOICIORCC();
      this.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR = Collections.unmodifiableMap(this.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR);
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(OkHttpClient var1) {
      this.init();
      this.HRHRORCIRICHCCCCCHICOOICIRHRIO = var1;
      this.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR = Collections.unmodifiableMap(this.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR);
   }

   private void CCIHHRIOOOOCOHRCIHOHROOICIORCC() {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Collections.emptyList());
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(List<Interceptor> var1) {
      Builder var2 = new Builder();
      var2.addNetworkInterceptor(this.IIOCHOIICCIORCOROIROHICCHIOHIC());

      for (Interceptor var4 : var1) {
         var2.addInterceptor(var4);
      }

      this.HRHRORCIRICHCCCCCHICOOICIRHRIO = var2.build();
   }

   private void init() {
      this.CCHORHIOORICCIRIHRIIHIICORIORO = true;
      this.ROHHHCHRIHHOOHCHIIIHOOCIIRROIO = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH();
      this.OCOHORHCROHICRRIHCIHHRRCIHICRI("OpenAPI-Generator/0.1.0-SNAPSHOT/java");
      this.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR = new HashMap<>();
   }

   public String getBasePath() {
      return this.basePath;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH HRCHROOHRIHCRCRHRIIROCIRHOIRHH(String var1) {
      this.basePath = var1;
      this.IIHHICHCCCOHCHROIRIHICCHHOROCR = null;
      return this;
   }

   public List<HICHRCOHCCRHOHCICOOCHOIHCCHIRI> CRHROHHHCIHHCOHCOORCRIHHIICROR() {
      return this.servers;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(List<HICHRCOHCCRHOHCICOOCHOIHCCHIRI> var1) {
      this.servers = var1;
      return this;
   }

   public Integer RORCHCIIICOHIRROOORHOCCCCIOCCI() {
      return this.IIHHICHCCCOHCHROIRIHICCHHOROCR;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Integer var1) {
      this.IIHHICHCCCOHCHROIRIHICCHHOROCR = var1;
      return this;
   }

   public Map<String, String> IOHHOIIOCRHCHHCRORICCOHOHROOIH() {
      return this.IIIIRHIHROIRCROHHROIHIIHRCRRHO;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Map<String, String> var1) {
      this.IIIIRHIHROIRCROHHROIHIIHRCRRHO = var1;
      return this;
   }

   public OkHttpClient IIHRHCCOOHOOOOCHRRCOROOIOHCOOO() {
      return this.HRHRORCIRICHCCCCCHICOOICIRHRIO;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OkHttpClient var1) {
      this.HRHRORCIRICHCCCCCHICOOICIRHRIO = Objects.requireNonNull(var1, "HttpClient must not be null!");
      return this;
   }

   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH RHCHRCOCCOIIIHCHRHIRCORHRHRICR() {
      return this.ROHHHCHRIHHOOHCHIIIHOOCIIRROIO;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1) {
      this.ROHHHCHRIHHOOHCHIIIHOOCIIRROIO = var1;
      return this;
   }

   public boolean RCCCROCHCICCROHCOCCRRROCIIHCCH() {
      return this.CCHORHIOORICCIRIHRIIHIICORIORO;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean var1) {
      this.CCHORHIOORICCIRIHRIIHIICORIORO = var1;
      this.RICRIHOOHROHICCHHIIHRHCORHIOHR();
      return this;
   }

   public InputStream OOOOCCOOOHCHCIIHOIHCRIIOOROHRC() {
      return this.CCRHOICIRORRHOOOCIHHHHCHCICHOH;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(InputStream var1) {
      this.CCRHOICIRORRHOOOCIHHHHCHCICHOH = var1;
      this.RICRIHOOHROHICCHHIIHRHCORHIOHR();
      return this;
   }

   public KeyManager[] RHRRHOHCRCHCCRRHOHHIRCCHOCICHC() {
      return this.OCIIROIOORRIOIIIRHIRRCCIIRRROH;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(KeyManager[] var1) {
      this.OCIIROIOORRIOIIIRHIRRCCIIRRROH = var1;
      this.RICRIHOOHROHICCHHIIHRHCORHIOHR();
      return this;
   }

   public DateFormat getDateFormat() {
      return this.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(DateFormat var1) {
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
      return this;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(DateFormat var1) {
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH(var1);
      return this;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(DateTimeFormatter var1) {
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
      return this;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(DateTimeFormatter var1) {
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH(var1);
      return this;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(boolean var1) {
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH(var1);
      return this;
   }

   public Map<String, com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> IIOIROIHIHHCCRICRCOOCHIICHRCOI() {
      return this.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR;
   }

   public com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
      String var1
   ) {
      return this.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.get(var1);
   }

   public void setUsername(String var1) {
      for (com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : this.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR
         .values()) {
         if (var3 instanceof com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
            )
          {
            ((com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var3)
               .setUsername(var1);
            return;
         }
      }

      throw new RuntimeException("No HTTP basic authentication configured!");
   }

   public void CORCOCICIRIOHROHROIIOOHICCHCRR(String var1) {
      for (com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : this.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR
         .values()) {
         if (var3 instanceof com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
            )
          {
            ((com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var3)
               .CORCOCICIRIOHROHROIIOOHICCHCRR(var1);
            return;
         }
      }

      throw new RuntimeException("No HTTP basic authentication configured!");
   }

   public void CRICCOOHHHCHOORCICOCOHIHOIRHOO(String var1) {
      for (com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : this.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR
         .values()) {
         if (var3 instanceof com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
            )
          {
            ((com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var3)
               .CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1);
            return;
         }
      }

      throw new RuntimeException("No API key authentication configured!");
   }

   public void HICHRCOHCCRHOHCICOOCHOIHCCHIRI(String var1) {
      for (com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : this.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR
         .values()) {
         if (var3 instanceof com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
            )
          {
            ((com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var3)
               .HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1);
            return;
         }
      }

      throw new RuntimeException("No API key authentication configured!");
   }

   public void IIHRRHORCRCROCHHOHORCHCROCIHRO(String var1) {
      throw new RuntimeException("No OAuth2 authentication configured!");
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2, String var3, String var4) {
      throw new RuntimeException("No AWS4 authentication configured!");
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2, String var3, String var4, String var5) {
      throw new RuntimeException("No AWS4 authentication configured!");
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH OCOHORHCROHICRRIHCIHHRRCIHICRI(String var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("User-Agent", var1);
      return this;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2) {
      this.ORIOHRCIHRCOOHICCCRIIIHCRHHIHI.put(var1, var2);
      return this;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, String var2) {
      this.CHHIICHRIIROIOHIHIIROICOCCROCI.put(var1, var2);
      return this;
   }

   public boolean RHOORRIIOCHIRRHOHOOHIROHCRICRO() {
      return this.RRRHHIRORHCHHCOOCIHOICORHHCHHO;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(boolean var1) {
      if (var1 != this.RRRHHIRORHCHHCOOCIHOICORHHCHHO) {
         if (var1) {
            this.HOHCCHOIOHOHHOROHOIIHOOHORRHRO = new HttpLoggingInterceptor();
            this.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.setLevel(Level.BODY);
            this.HRHRORCIRICHCCCCCHICOOICIRHRIO = this.HRHRORCIRICHCCCCCHICOOICIRHRIO.newBuilder().addInterceptor(this.HOHCCHOIOHOHHOROHOIIHOOHORRHRO).build();
         } else {
            Builder var2 = this.HRHRORCIRICHCCCCCHICOOICIRHRIO.newBuilder();
            var2.interceptors().remove(this.HOHCCHOIOHOHHOROHOIIHOOHORRHRO);
            this.HRHRORCIRICHCCCCCHICOOICIRHRIO = var2.build();
            this.HOHCCHOIOHOHHOROHOIIHOOHORRHRO = null;
         }
      }

      this.RRRHHIRORHCHHCOOCIHOICORHHCHHO = var1;
      return this;
   }

   public String CCHHCIRHICHHHHRRIHIORCCORCCIHR() {
      return this.COOCCHICCCIIICRHIOCOCIOOORCOCC;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH CIOHHCORHRCCRICCCORIHCRHCCCRRR(String var1) {
      this.COOCCHICCCIIICRHIOCOCIOOORCOCC = var1;
      return this;
   }

   public int COIHORRCHRRCHOCIRHHRRIOIHRIHCC() {
      return this.HRHRORCIRICHCCCCCHICOOICIRHRIO.connectTimeoutMillis();
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1) {
      this.HRHRORCIRICHCCCCCHICOOICIRHRIO = this.HRHRORCIRICHCCCCCHICOOICIRHRIO.newBuilder().connectTimeout(var1, TimeUnit.MILLISECONDS).build();
      return this;
   }

   public int OHCIIOCHHOHOHCOHHCRRHHCRHOIICC() {
      return this.HRHRORCIRICHCCCCCHICOOICIRHRIO.readTimeoutMillis();
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1) {
      this.HRHRORCIRICHCCCCCHICOOICIRHRIO = this.HRHRORCIRICHCCCCCHICOOICIRHRIO.newBuilder().readTimeout(var1, TimeUnit.MILLISECONDS).build();
      return this;
   }

   public int IOIOHIORIROHRRCOOOHCROHORCOIIH() {
      return this.HRHRORCIRICHCCCCCHICOOICIRHRIO.writeTimeoutMillis();
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var1) {
      this.HRHRORCIRICHCCCCCHICOOICIRHRIO = this.HRHRORCIRICHCCCCCHICOOICIRHRIO.newBuilder().writeTimeout(var1, TimeUnit.MILLISECONDS).build();
      return this;
   }

   public String HHCCIRHCCCIIRHCROHIORHIRHHIORH(Object var1) {
      if (var1 == null) {
         return "";
      }

      if (!(var1 instanceof Date) && !(var1 instanceof OffsetDateTime) && !(var1 instanceof LocalDate)) {
         if (var1 instanceof Collection) {
            StringBuilder var5 = new StringBuilder();

            for (Object var4 : (Collection)var1) {
               if (var5.length() > 0) {
                  var5.append(",");
               }

               var5.append(var4);
            }

            return var5.toString();
         } else {
            return String.valueOf(var1);
         }
      } else {
         String var2 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH(var1);
         return var2.substring(1, var2.length() - 1);
      }
   }

   public List<OOROOCCIRCCRHOIOIORIHCHHOOCCOR> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, Object var2) {
      ArrayList var3 = new ArrayList();
      if (var1 != null && !var1.isEmpty() && var2 != null && !(var2 instanceof Collection)) {
         var3.add(new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1, this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2)));
         return var3;
      } else {
         return var3;
      }
   }

   public List<OOROOCCIRCCRHOIOIORIHCHHOOCCOR> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2, Collection var3) {
      ArrayList var4 = new ArrayList();
      if (var2 == null || var2.isEmpty() || var3 == null || var3.isEmpty()) {
         return var4;
      }

      if ("multi".equals(var1)) {
         for (Object var10 : var3) {
            var4.add(new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var2, this.escapeString(this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var10))));
         }

         return var4;
      } else {
         String var5 = ",";
         if ("ssv".equals(var1)) {
            var5 = this.escapeString(" ");
         } else if ("tsv".equals(var1)) {
            var5 = this.escapeString("\t");
         } else if ("pipes".equals(var1)) {
            var5 = this.escapeString("|");
         }

         StringBuilder var6 = new StringBuilder();

         for (Object var8 : var3) {
            var6.append(var5);
            var6.append(this.escapeString(this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var8)));
         }

         var4.add(new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var2, var6.substring(var5.length())));
         return var4;
      }
   }

   public String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, Collection var2) {
      if ("multi".equals(var1)) {
         return this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2);
      }

      String var3 = ",";
      if ("ssv".equals(var1)) {
         var3 = " ";
      } else if ("tsv".equals(var1)) {
         var3 = "\t";
      } else if ("pipes".equals(var1)) {
         var3 = "|";
      }

      StringBuilder var4 = new StringBuilder();

      for (Object var6 : var2) {
         var4.append(var3);
         var4.append(this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var6));
      }

      return var4.substring(var3.length());
   }

   public String IHHCHHHCRIHOOCOIOOCRIIICIOROIR(String var1) {
      return var1.replaceAll(".*[/\\\\]", "");
   }

   public boolean IIRHCHHOICHRICOOCRORCCIOOIHOIR(String var1) {
      String var2 = "(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$";
      return var1 != null && (var1.matches(var2) || var1.equals("*/*"));
   }

   public String IRCIIHHICIHRCOCRROCOICRIHHCCHH(String[] var1) {
      if (var1.length == 0) {
         return null;
      }

      for (String var5 : var1) {
         if (this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var5)) {
            return var5;
         }
      }

      return OCOHORHCROHICRRIHCIHHRRCIHICRI.join(var1, ",");
   }

   public String HHCCIRHCCCIIRHCROHIORHIRHHIORH(String[] var1) {
      if (var1.length == 0) {
         return null;
      }

      if (var1[0].equals("*/*")) {
         return "application/json";
      }

      for (String var5 : var1) {
         if (this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var5)) {
            return var5;
         }
      }

      return var1[0];
   }

   public String escapeString(String var1) {
      try {
         return URLEncoder.encode(var1, "utf8").replaceAll("\\+", "%20");
      } catch (UnsupportedEncodingException var3) {
         return var1;
      }
   }

   public <T> T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Response var1, Type var2) {
      if (var1 == null || var2 == null) {
         return null;
      }

      if ("byte[]".equals(var2.toString())) {
         try {
            return (T)var1.body().bytes();
         } catch (IOException var5) {
            throw new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var5);
         }
      } else {
         if (var2.equals(File.class)) {
            return (T)this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
         }

         String var3;
         try {
            if (var1.body() != null) {
               var3 = var1.body().string();
            } else {
               var3 = null;
            }
         } catch (IOException var6) {
            throw new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var6);
         }

         if (var3 != null && !"".equals(var3)) {
            String var4 = var1.headers().get("Content-Type");
            if (var4 == null) {
               var4 = "application/json";
            }

            if (this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var4)) {
               return HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var2);
            } else if (var2.equals(String.class)) {
               return (T)var3;
            } else {
               throw new HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  "Content type \"" + var4 + "\" is not supported for type: " + var2, var1.code(), var1.headers().toMultimap(), var3
               );
            }
         } else {
            return null;
         }
      }
   }

   public RequestBody RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Object var1, String var2) {
      if (var1 instanceof byte[]) {
         return RequestBody.create(MediaType.parse(var2), (byte[])var1);
      }

      if (var1 instanceof File) {
         return RequestBody.create(MediaType.parse(var2), (File)var1);
      }

      if ("text/plain".equals(var2) && var1 instanceof String) {
         return RequestBody.create(MediaType.parse(var2), (String)var1);
      }

      if (this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var2)) {
         String var3;
         if (var1 != null) {
            var3 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH(var1);
         } else {
            var3 = "";
         }

         return RequestBody.create(MediaType.parse(var2), var3);
      } else if (var1 instanceof String) {
         return RequestBody.create(MediaType.parse(var2), (String)var1);
      } else {
         throw new HHCCIRHCCCIIRHCROHIORHIRHHIORH("Content type \"" + var2 + "\" is not supported");
      }
   }

   public File RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Response var1) {
      try {
         File var2 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
         BufferedSink var3 = Okio.buffer(Okio.sink(var2));
         var3.writeAll(var1.body().source());
         var3.close();
         return var2;
      } catch (IOException var4) {
         throw new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var4);
      }
   }

   public File IRCIIHHICIHRCOCRROCOICRIHHCCHH(Response var1) {
      String var2 = null;
      String var3 = var1.header("Content-Disposition");
      if (var3 != null && !"".equals(var3)) {
         Pattern var4 = Pattern.compile("filename=['\"]?([^'\"\\s]+)['\"]?");
         Matcher var5 = var4.matcher(var3);
         if (var5.find()) {
            var2 = this.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var5.group(1));
         }
      }

      String var7 = null;
      String var9 = null;
      if (var2 == null) {
         var7 = "download-";
         var9 = "";
      } else {
         int var6 = var2.lastIndexOf(".");
         if (var6 == -1) {
            var7 = var2 + "-";
         } else {
            var7 = var2.substring(0, var6) + "-";
            var9 = var2.substring(var6);
         }

         if (var7.length() < 3) {
            var7 = "download-";
         }
      }

      return this.COOCCHICCCIIICRHIOCOCIOOORCOCC == null
         ? Files.createTempFile(var7, var9).toFile()
         : Files.createTempFile(Paths.get(this.COOCCHICCCIIICRHIOCOCIOOORCOCC), var7, var9).toFile();
   }

   public <T> CRRRICCRROCOHHOHIICIHORCOORRRH<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Call var1) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, (Type)null);
   }

   public <T> CRRRICCRROCOHHOHIICIHORCOORRRH<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Call var1, Type var2) {
      try {
         Response var3 = var1.execute();
         Object var4 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3, var2);
         return new CRRRICCRROCOHHOHIICIHORCOORRRH<>(var3.code(), var3.headers().toMultimap(), (T)var4);
      } catch (IOException var5) {
         throw new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var5);
      }
   }

   public <T> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Call var1, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> var2) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, null, var2);
   }

   public <T> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Call var1, final Type var2, final RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> var3) {
      var1.enqueue(new Callback() {
         public void onFailure(Call var1, IOException var2x) {
            var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2x), 0, null);
         }

         public void onResponse(Call var1, Response var2x) {
            Object var3x;
            try {
               var3x = IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2x, var2);
            } catch (HHCCIRHCCCIIRHCROHIORHIRHHIORH var5) {
               var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var2x.code(), var2x.headers().toMultimap());
               return;
            } catch (Exception var6) {
               var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var6), var2x.code(), var2x.headers().toMultimap());
               return;
            }

            var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3x, var2x.code(), var2x.headers().toMultimap());
         }
      });
   }

   public <T> T IRCIIHHICIHRCOCRROCOICRIHHCCHH(Response var1, Type var2) {
      if (var1.isSuccessful()) {
         if (var2 != null && var1.code() != 204) {
            return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
         }

         if (var1.body() != null) {
            try {
               var1.body().close();
            } catch (Exception var5) {
               throw new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1.message(), var5, var1.code(), var1.headers().toMultimap());
            }
         }

         return null;
      } else {
         String var3 = null;
         if (var1.body() != null) {
            try {
               var3 = var1.body().string();
            } catch (IOException var6) {
               throw new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1.message(), var6, var1.code(), var1.headers().toMultimap());
            }
         }

         throw new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1.message(), var1.code(), var1.headers().toMultimap(), var3);
      }
   }

   public Call RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var1,
      String var2,
      String var3,
      List<OOROOCCIRCCRHOIOIORIHCHHOOCCOR> var4,
      List<OOROOCCIRCCRHOIOIORIHCHHOOCCOR> var5,
      Object var6,
      Map<String, String> var7,
      Map<String, String> var8,
      Map<String, Object> var9,
      String[] var10,
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11
   ) {
      Request var12 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      return this.HRHRORCIRICHCCCCCHICOOICIRHRIO.newCall(var12);
   }

   public Request IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      String var1,
      String var2,
      String var3,
      List<OOROOCCIRCCRHOIOIORIHCHHOOCCOR> var4,
      List<OOROOCCIRCCRHOIOIORIHCHHOOCCOR> var5,
      Object var6,
      Map<String, String> var7,
      Map<String, String> var8,
      Map<String, Object> var9,
      String[] var10,
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11
   ) {
      ArrayList var12 = new ArrayList(var4);
      var12.addAll(var5);
      String var13 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var4, var5);
      String var15 = (String)var7.get("Content-Type");
      String var16 = var15;
      if (var16 != null && var16.contains(";")) {
         var16 = var15.substring(0, var15.indexOf(";"));
      }

      RequestBody var14;
      if (!HttpMethod.permitsRequestBody(var3)) {
         var14 = null;
      } else if ("application/x-www-form-urlencoded".equals(var16)) {
         var14 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var9);
      } else if ("multipart/form-data".equals(var16)) {
         var14 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var9);
      } else if (var6 == null) {
         if ("DELETE".equals(var3)) {
            var14 = null;
         } else {
            var14 = RequestBody.create(var15 == null ? null : MediaType.parse(var15), "");
         }
      } else {
         var14 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var15);
      }

      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, var12, var7, var8, this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var14), var3, URI.create(var13));
      okhttp3.Request.Builder var17 = new okhttp3.Request.Builder().url(var13);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var17);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var8, var17);
      var17.tag(var11);
      Request var18 = null;
      if (var11 != null && var14 != null) {
         CORCOCICIRIOHROHROIIOOHICCHCRR var19 = new CORCOCICIRIOHROHROIIOOHICCHCRR(var14, var11);
         var18 = var17.method(var3, var19).build();
      } else {
         var18 = var17.method(var3, var14).build();
      }

      return var18;
   }

   public String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2, List<OOROOCCIRCCRHOIOIORIHCHHOOCCOR> var3, List<OOROOCCIRCCRHOIOIORIHCHHOOCCOR> var4) {
      StringBuilder var5 = new StringBuilder();
      if (var1 != null) {
         var5.append(var1).append(var2);
      } else {
         String var6;
         if (this.IIHHICHCCCOHCHROIRIHICCHHOROCR != null) {
            if (this.IIHHICHCCCOHCHROIRIHICCHHOROCR < 0 || this.IIHHICHCCCOHCHROIRIHICCHHOROCR >= this.servers.size()) {
               throw new ArrayIndexOutOfBoundsException(
                  String.format(
                     "Invalid index %d when selecting the host settings. Must be less than %d", this.IIHHICHCCCOHCHROIRIHICCHHOROCR, this.servers.size()
                  )
               );
            }

            var6 = this.servers.get(this.IIHHICHCCCOHCHROIRIHICCHHOROCR).CRRRICCRROCOHHOHIICIHORCOORRRH(this.IIIIRHIHROIRCROHHROIHIIHRCRRHO);
         } else {
            var6 = this.basePath;
         }

         var5.append(var6).append(var2);
      }

      if (var3 != null && !var3.isEmpty()) {
         String var10 = var2.contains("?") ? "&" : "?";

         for (OOROOCCIRCCRHOIOIORIHCHHOOCCOR var8 : var3) {
            if (var8.getValue() != null) {
               if (var10 != null) {
                  var5.append(var10);
                  var10 = null;
               } else {
                  var5.append("&");
               }

               String var9 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var8.getValue());
               var5.append(this.escapeString(var8.getName())).append("=").append(this.escapeString(var9));
            }
         }
      }

      if (var4 != null && !var4.isEmpty()) {
         String var11 = var5.toString().contains("?") ? "&" : "?";

         for (OOROOCCIRCCRHOIOIORIHCHHOOCCOR var13 : var4) {
            if (var13.getValue() != null) {
               if (var11 != null) {
                  var5.append(var11);
                  var11 = null;
               } else {
                  var5.append("&");
               }

               String var14 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var13.getValue());
               var5.append(this.escapeString(var13.getName())).append("=").append(var14);
            }
         }
      }

      return var5.toString();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Map<String, String> var1, okhttp3.Request.Builder var2) {
      for (Entry var4 : var1.entrySet()) {
         var2.header((String)var4.getKey(), this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var4.getValue()));
      }

      for (Entry var6 : this.ORIOHRCIHRCOOHICCCRIIIHCRHHIHI.entrySet()) {
         if (!var1.containsKey(var6.getKey())) {
            var2.header((String)var6.getKey(), this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var6.getValue()));
         }
      }
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(Map<String, String> var1, okhttp3.Request.Builder var2) {
      for (Entry var4 : var1.entrySet()) {
         var2.addHeader("Cookie", String.format("%s=%s", var4.getKey(), var4.getValue()));
      }

      for (Entry var6 : this.CHHIICHRIIROIOHIHIIROICOCCROCI.entrySet()) {
         if (!var1.containsKey(var6.getKey())) {
            var2.addHeader("Cookie", String.format("%s=%s", var6.getKey(), var6.getValue()));
         }
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String[] var1, List<OOROOCCIRCCRHOIOIORIHCHHOOCCOR> var2, Map<String, String> var3, Map<String, String> var4, String var5, String var6, URI var7
   ) {
      for (String var11 : var1) {
         com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var12 = this.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR
            .get(var11);
         if (var12 == null) {
            throw new RuntimeException("Authentication undefined: " + var11);
         }

         var12.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3, var4, var5, var6, var7);
      }
   }

   public RequestBody IRCIIHHICIHRCOCRROCOICRIHHCCHH(Map<String, Object> var1) {
      okhttp3.FormBody.Builder var2 = new okhttp3.FormBody.Builder();

      for (Entry var4 : var1.entrySet()) {
         var2.add((String)var4.getKey(), this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var4.getValue()));
      }

      return var2.build();
   }

   public RequestBody HHCCIRHCCCIIRHCROHIORHIRHHIORH(Map<String, Object> var1) {
      okhttp3.MultipartBody.Builder var2 = new okhttp3.MultipartBody.Builder().setType(MultipartBody.FORM);

      for (Entry var4 : var1.entrySet()) {
         if (var4.getValue() instanceof File) {
            File var8 = (File)var4.getValue();
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, (String)var4.getKey(), var8);
         } else if (var4.getValue() instanceof List) {
            for (Object var7 : (List)var4.getValue()) {
               if (var7 instanceof File) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, (String)var4.getKey(), (File)var7);
               } else {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, (String)var4.getKey(), var4.getValue());
               }
            }
         } else {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, (String)var4.getKey(), var4.getValue());
         }
      }

      return var2.build();
   }

   public String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(File var1) {
      String var2 = URLConnection.guessContentTypeFromName(var1.getName());
      return var2 == null ? "application/octet-stream" : var2;
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(okhttp3.MultipartBody.Builder var1, String var2, File var3) {
      Headers var4 = Headers.of(new String[]{"Content-Disposition", "form-data; name=\"" + var2 + "\"; filename=\"" + var3.getName() + "\""});
      MediaType var5 = MediaType.parse(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3));
      var1.addPart(var4, RequestBody.create(var5, var3));
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(okhttp3.MultipartBody.Builder var1, String var2, Object var3) {
      RequestBody var4;
      if (var3 instanceof String) {
         var4 = RequestBody.create(MediaType.parse("text/plain"), (String)var3);
      } else {
         String var5;
         if (var3 != null) {
            var5 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH(var3);
         } else {
            var5 = null;
         }

         var4 = RequestBody.create(MediaType.parse("application/json"), var5);
      }

      Headers var6 = Headers.of(new String[]{"Content-Disposition", "form-data; name=\"" + var2 + "\""});
      var1.addPart(var6, var4);
   }

   private Interceptor IIOCHOIICCIORCOROIROHICCHIOHIC() {
      return new Interceptor() {
         public Response intercept(Chain var1) {
            Request var2 = var1.request();
            Response var3 = var1.proceed(var2);
            if (var2.tag() instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH) {
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.tag();
               return var3.newBuilder().body(new CRICCOOHHHCHOORCICOCOHIHOIRHOO(var3.body(), var4)).build();
            } else {
               return var3;
            }
         }
      };
   }

   private void RICRIHOOHROHICCHHIIHRHCORHIOHR() {
      try {
         TrustManager[] var1;
         Object var2;
         if (!this.CCHORHIOORICCIRIHRIIHIICORIORO) {
            var1 = new TrustManager[]{new X509TrustManager() {
               @Override
               public void checkClientTrusted(X509Certificate[] var1, String var2x) {
               }

               @Override
               public void checkServerTrusted(X509Certificate[] var1, String var2x) {
               }

               @Override
               public X509Certificate[] getAcceptedIssuers() {
                  return new X509Certificate[0];
               }
            }};
            var2 = new HostnameVerifier() {
               @Override
               public boolean verify(String var1, SSLSession var2x) {
                  return true;
               }
            };
         } else {
            TrustManagerFactory var3 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            if (this.CCRHOICIRORRHOOOCIHHHHCHCICHOH == null) {
               var3.init((KeyStore)null);
            } else {
               Object var4 = null;
               CertificateFactory var5 = CertificateFactory.getInstance("X.509");
               Collection var6 = var5.generateCertificates(this.CCRHOICIRORRHOOOCIHHHHCHCICHOH);
               if (var6.isEmpty()) {
                  throw new IllegalArgumentException("expected non-empty set of trusted certificates");
               }

               KeyStore var7 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((char[])var4);
               int var8 = 0;

               for (Certificate var10 : var6) {
                  String var11 = "ca" + var8++;
                  var7.setCertificateEntry(var11, var10);
               }

               var3.init(var7);
            }

            var1 = var3.getTrustManagers();
            var2 = OkHostnameVerifier.INSTANCE;
         }

         SSLContext var13 = SSLContext.getInstance("TLS");
         var13.init(this.OCIIROIOORRIOIIIRHIRRCCIIRRROH, var1, new SecureRandom());
         this.HRHRORCIRICHCCCCCHICOOICIRHRIO = this.HRHRORCIRICHCCCCCHICOOICIRHRIO
            .newBuilder()
            .sslSocketFactory(var13.getSocketFactory(), (X509TrustManager)var1[0])
            .hostnameVerifier((HostnameVerifier)var2)
            .build();
      } catch (GeneralSecurityException var12) {
         throw new RuntimeException(var12);
      }
   }

   private KeyStore RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(char[] var1) {
      try {
         KeyStore var2 = KeyStore.getInstance(KeyStore.getDefaultType());
         var2.load(null, var1);
         return var2;
      } catch (IOException var3) {
         throw new AssertionError(var3);
      }
   }

   private String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RequestBody var1) {
      if (var1 != null) {
         try {
            Buffer var2 = new Buffer();
            var1.writeTo(var2);
            return var2.readUtf8();
         } catch (IOException var3) {
            throw new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var3);
         }
      } else {
         return "";
      }
   }
}
