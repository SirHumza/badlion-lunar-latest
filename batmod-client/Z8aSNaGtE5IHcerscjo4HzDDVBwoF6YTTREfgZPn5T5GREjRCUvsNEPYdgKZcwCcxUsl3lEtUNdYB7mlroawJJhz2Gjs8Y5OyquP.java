import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class Z8aSNaGtE5IHcerscjo4HzDDVBwoF6YTTREfgZPn5T5GREjRCUvsNEPYdgKZcwCcxUsl3lEtUNdYB7mlroawJJhz2Gjs8Y5OyquP
   implements uAWrt2GkGcRp9rQq85uUZN6bXvPWoPKZrZ3rMiiStFamdJjzXsTR4StJIlA9dpholfs4P9jHYUBf9Ja3BtBF5UqfSwNLmJM10wUX {
   private final EXjtsFjsusGQtkC5tiXXlF5JNOlFhlzmATIsNWzTmAhwhdfUkQPMDJBII0jBxC0CVIq4nImYPd3tbTKFWExSX0tpGkkBVTAjoneC BatModClient;
   private final sZDEP6t4IsLak2NXGih7CmabMDZ6FBEx8w4YeUqkEVAcThDTPtQENNYNRgjSLTxAr5b4AlgYmcFSKf2CarODG3ohxMiwcWtJHVzD Button;
   private final Map CustomSpinner = Maps.newHashMap();
   private final Map ButtonAction = Maps.newHashMap();
   private final Map Spinner = Maps.newHashMap();
   private double Checkbox;
   private boolean ProgressBar = true;
   private double BatModProgressBar;

   public Z8aSNaGtE5IHcerscjo4HzDDVBwoF6YTTREfgZPn5T5GREjRCUvsNEPYdgKZcwCcxUsl3lEtUNdYB7mlroawJJhz2Gjs8Y5OyquP(
      EXjtsFjsusGQtkC5tiXXlF5JNOlFhlzmATIsNWzTmAhwhdfUkQPMDJBII0jBxC0CVIq4nImYPd3tbTKFWExSX0tpGkkBVTAjoneC var1,
      sZDEP6t4IsLak2NXGih7CmabMDZ6FBEx8w4YeUqkEVAcThDTPtQENNYNRgjSLTxAr5b4AlgYmcFSKf2CarODG3ohxMiwcWtJHVzD var2
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      this.Checkbox = var2.Button();

      for (int var3 = 0; var3 < 3; var3++) {
         this.CustomSpinner.put(var3, Sets.newHashSet());
      }
   }

   @Override
   public sZDEP6t4IsLak2NXGih7CmabMDZ6FBEx8w4YeUqkEVAcThDTPtQENNYNRgjSLTxAr5b4AlgYmcFSKf2CarODG3ohxMiwcWtJHVzD BatModClient() {
      return this.Button;
   }

   @Override
   public double Button() {
      return this.Checkbox;
   }

   @Override
   public void BatModClient(double var1) {
      if (var1 != this.Button()) {
         this.Checkbox = var1;
         this.Checkbox();
      }
   }

   @Override
   public Collection BatModClient(int var1) {
      return (Collection)this.CustomSpinner.get(var1);
   }

   @Override
   public Collection CustomSpinner() {
      HashSet var1 = Sets.newHashSet();

      for (int var2 = 0; var2 < 3; var2++) {
         var1.addAll(this.BatModClient(var2));
      }

      return var1;
   }

   @Override
   public kT9lV1jpqd4tlAa84NGN5SIufoeuYrV5ZEfW1Ufa8hmBzd1H18bErxZEzA0wbbBss101fGCqNdkhXHetWVg7ALC7bFPIiaRWKKR7 BatModClient(
      UUID var1
   ) {
      return (kT9lV1jpqd4tlAa84NGN5SIufoeuYrV5ZEfW1Ufa8hmBzd1H18bErxZEzA0wbbBss101fGCqNdkhXHetWVg7ALC7bFPIiaRWKKR7)this.Spinner
         .get(var1);
   }

   @Override
   public boolean BatModClient(
      kT9lV1jpqd4tlAa84NGN5SIufoeuYrV5ZEfW1Ufa8hmBzd1H18bErxZEzA0wbbBss101fGCqNdkhXHetWVg7ALC7bFPIiaRWKKR7 var1
   ) {
      return this.Spinner
            .get(var1.BatModClient())
         != null;
   }

   @Override
   public void Button(
      kT9lV1jpqd4tlAa84NGN5SIufoeuYrV5ZEfW1Ufa8hmBzd1H18bErxZEzA0wbbBss101fGCqNdkhXHetWVg7ALC7bFPIiaRWKKR7 var1
   ) {
      if (this.BatModClient(
            var1.BatModClient()
         )
         != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      }

      Set var2 = (Set)this.ButtonAction
         .get(var1.Button());
      if (var2 == null) {
         var2 = Sets.newHashSet();
         this.ButtonAction
            .put(var1.Button(), var2);
      }

      ((Set)this.CustomSpinner
            .get(var1.CustomSpinner()))
         .add(var1);
      var2.add(var1);
      this.Spinner
         .put(var1.BatModClient(), var1);
      this.Checkbox();
   }

   protected void Checkbox() {
      this.ProgressBar = true;
      this.BatModClient
         .BatModClient(this);
   }

   @Override
   public void CustomSpinner(
      kT9lV1jpqd4tlAa84NGN5SIufoeuYrV5ZEfW1Ufa8hmBzd1H18bErxZEzA0wbbBss101fGCqNdkhXHetWVg7ALC7bFPIiaRWKKR7 var1
   ) {
      for (int var2 = 0; var2 < 3; var2++) {
         Set var3 = (Set)this.CustomSpinner.get(var2);
         var3.remove(var1);
      }

      Set var4 = (Set)this.ButtonAction
         .get(var1.Button());
      if (var4 != null) {
         var4.remove(var1);
         if (var4.isEmpty()) {
            this.ButtonAction
               .remove(var1.Button());
         }
      }

      this.Spinner
         .remove(var1.BatModClient());
      this.Checkbox();
   }

   @Override
   public void ButtonAction() {
      Collection var1 = this.CustomSpinner();
      if (var1 != null) {
         for (kT9lV1jpqd4tlAa84NGN5SIufoeuYrV5ZEfW1Ufa8hmBzd1H18bErxZEzA0wbbBss101fGCqNdkhXHetWVg7ALC7bFPIiaRWKKR7 var3 : Lists.newArrayList(var1)) {
            this.CustomSpinner(var3);
         }
      }
   }

   @Override
   public double Spinner() {
      if (this.ProgressBar) {
         this.BatModProgressBar = this.ProgressBar();
         this.ProgressBar = false;
      }

      return this.BatModProgressBar;
   }

   private double ProgressBar() {
      double var1 = this.Button();

      for (kT9lV1jpqd4tlAa84NGN5SIufoeuYrV5ZEfW1Ufa8hmBzd1H18bErxZEzA0wbbBss101fGCqNdkhXHetWVg7ALC7bFPIiaRWKKR7 var4 : this.Button(
         0
      )) {
         var1 += var4.ButtonAction();
      }

      double var7 = var1;

      for (kT9lV1jpqd4tlAa84NGN5SIufoeuYrV5ZEfW1Ufa8hmBzd1H18bErxZEzA0wbbBss101fGCqNdkhXHetWVg7ALC7bFPIiaRWKKR7 var6 : this.Button(
         1
      )) {
         var7 += var1 * var6.ButtonAction();
      }

      for (kT9lV1jpqd4tlAa84NGN5SIufoeuYrV5ZEfW1Ufa8hmBzd1H18bErxZEzA0wbbBss101fGCqNdkhXHetWVg7ALC7bFPIiaRWKKR7 var9 : this.Button(
         2
      )) {
         var7 *= 1.0 + var9.ButtonAction();
      }

      return this.Button
         .BatModClient(var7);
   }

   private Collection Button(int var1) {
      HashSet var2 = Sets.newHashSet(this.BatModClient(var1));

      for (sZDEP6t4IsLak2NXGih7CmabMDZ6FBEx8w4YeUqkEVAcThDTPtQENNYNRgjSLTxAr5b4AlgYmcFSKf2CarODG3ohxMiwcWtJHVzD var3 = this.Button
            .ButtonAction();
         var3 != null;
         var3 = var3.ButtonAction()
      ) {
         uAWrt2GkGcRp9rQq85uUZN6bXvPWoPKZrZ3rMiiStFamdJjzXsTR4StJIlA9dpholfs4P9jHYUBf9Ja3BtBF5UqfSwNLmJM10wUX var4 = this.BatModClient
            .BatModClient(var3);
         if (var4 != null) {
            var2.addAll(var4.BatModClient(var1));
         }
      }

      return var2;
   }
}
