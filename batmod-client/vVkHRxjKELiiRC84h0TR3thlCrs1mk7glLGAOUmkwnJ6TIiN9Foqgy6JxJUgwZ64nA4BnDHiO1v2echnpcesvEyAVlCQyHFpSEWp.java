import com.google.common.collect.Maps;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.UUID;
import java.util.Map.Entry;

public class vVkHRxjKELiiRC84h0TR3thlCrs1mk7glLGAOUmkwnJ6TIiN9Foqgy6JxJUgwZ64nA4BnDHiO1v2echnpcesvEyAVlCQyHFpSEWp {
   private final Map BatModClient = Maps.newHashMap();
   private final Map Button = Maps.newHashMap();
   private final String CustomSpinner = UUID.randomUUID().toString();
   private final URL ButtonAction;
   private final Hvt3tL5RewqdYe21NL5JbMSOs62hwKrSvdB7jl0uvAhzP6SJLwHAQD5Rt6Gsorexba6pVLP4VHYVgowlewCY0RJmGWjauTqDrepX Spinner;
   private final Timer Checkbox = new Timer("Snooper Timer", true);
   private final Object ProgressBar = new Object();
   private final long BatModProgressBar;
   private boolean ColorChooser;
   private int IntegerSpinner;

   public vVkHRxjKELiiRC84h0TR3thlCrs1mk7glLGAOUmkwnJ6TIiN9Foqgy6JxJUgwZ64nA4BnDHiO1v2echnpcesvEyAVlCQyHFpSEWp(
      String var1, Hvt3tL5RewqdYe21NL5JbMSOs62hwKrSvdB7jl0uvAhzP6SJLwHAQD5Rt6Gsorexba6pVLP4VHYVgowlewCY0RJmGWjauTqDrepX var2, long var3
   ) {
      try {
         this.ButtonAction = new URL(
            "http://snoop.minecraft.net/" + var1 + "?version=" + 2
         );
      } catch (MalformedURLException var6) {
         throw new IllegalArgumentException();
      }

      this.Spinner = var2;
      this.BatModProgressBar = var3;
   }

   public void BatModClient() {
      if (!this.ColorChooser) {
         this.ColorChooser = true;
         this.BatModProgressBar();
         this.Checkbox
            .schedule(new BEmIGcupyvuUaGhv0AeqeNyo3fuUtheGizrkVw2aCqdBQJNsvAlk0xqCjlSqgvOumMjzFquioKG57Rkl7qijstdCnOw1zGKMdd9N(this), 0L, 900000L);
      }
   }

   private void BatModProgressBar() {
      this.ColorChooser();
      this.BatModClient(
         "snooper_token", this.CustomSpinner
      );
      this.Button(
         "snooper_token", this.CustomSpinner
      );
      this.Button("os_name", System.getProperty("os.name"));
      this.Button("os_version", System.getProperty("os.version"));
      this.Button(
         "os_architecture", System.getProperty("os.arch")
      );
      this.Button(
         "java_version", System.getProperty("java.version")
      );
      this.BatModClient("version", "1.8.8");
      this.Spinner
         .Button(this);
   }

   private void ColorChooser() {
      RuntimeMXBean var1 = ManagementFactory.getRuntimeMXBean();
      List var2 = var1.getInputArguments();
      int var3 = 0;

      for (String var5 : var2) {
         if (var5.startsWith("-X")) {
            this.BatModClient("jvm_arg[" + var3++ + "]", var5);
         }
      }

      this.BatModClient("jvm_args", var3);
   }

   public void Button() {
      this.Button(
         "memory_total", Runtime.getRuntime().totalMemory()
      );
      this.Button("memory_max", Runtime.getRuntime().maxMemory());
      this.Button(
         "memory_free", Runtime.getRuntime().freeMemory()
      );
      this.Button(
         "cpu_cores", Runtime.getRuntime().availableProcessors()
      );
      this.Spinner
         .BatModClient(this);
   }

   public void BatModClient(String var1, Object var2) {
      synchronized (this.ProgressBar) {
         this.Button.put(var1, var2);
      }
   }

   public void Button(String var1, Object var2) {
      synchronized (this.ProgressBar) {
         this.BatModClient.put(var1, var2);
      }
   }

   public Map CustomSpinner() {
      LinkedHashMap var1 = Maps.newLinkedHashMap();
      synchronized (this.ProgressBar) {
         this.Button();

         for (Entry var4 : this.BatModClient.entrySet()) {
            var1.put(var4.getKey(), var4.getValue().toString());
         }

         for (Entry var8 : this.Button.entrySet()) {
            var1.put(var8.getKey(), var8.getValue().toString());
         }

         return var1;
      }
   }

   public boolean ButtonAction() {
      return this.ColorChooser;
   }

   public void Spinner() {
      this.Checkbox.cancel();
   }

   public String Checkbox() {
      return this.CustomSpinner;
   }

   public long ProgressBar() {
      return this.BatModProgressBar;
   }
}
