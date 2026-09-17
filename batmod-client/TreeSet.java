import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class meHA0q9h31f9sxQpXbFowatjmiepChVjMJ9SLC0WPRFT7IGZH4L6qp886aWC86NA4z4IFoGgB4qCdiJkgpBtjNKnjxf1ihkAr6p9 extends TreeSet {
   private u78ZFnNTGnUWOu0AHQpJzOux3MDwTEyj8xh3gWL2e9SnoKHBb1bv0jmUEWiXK5mtQzBxs48CU9IrHApFZg1s9X15jKnyBXYnG83d BatModClient = new u78ZFnNTGnUWOu0AHQpJzOux3MDwTEyj8xh3gWL2e9SnoKHBb1bv0jmUEWiXK5mtQzBxs48CU9IrHApFZg1s9X15jKnyBXYnG83d();
   private int Button = Integer.MIN_VALUE;
   private int CustomSpinner = Integer.MIN_VALUE;
   private int ButtonAction = Integer.MIN_VALUE;
   private int Spinner = Integer.MIN_VALUE;
   private static final int Checkbox = Integer.MIN_VALUE;

   public meHA0q9h31f9sxQpXbFowatjmiepChVjMJ9SLC0WPRFT7IGZH4L6qp886aWC86NA4z4IFoGgB4qCdiJkgpBtjNKnjxf1ihkAr6p9(Set var1) {
      for (Object var3 : var1) {
         this.add(var3);
      }
   }

   @Override
   public boolean contains(Object var1) {
      if (!(var1 instanceof c5yjVoYlQQ2rPK2XYckKiKNAaBdIPJ7B2WWxur0KUr3NMhMScmaRIHc1OAnmAJ1NYGzVEtEsax72BjPSab83VALHft6aNBSVhQgC)) {
         return false;
      }

      c5yjVoYlQQ2rPK2XYckKiKNAaBdIPJ7B2WWxur0KUr3NMhMScmaRIHc1OAnmAJ1NYGzVEtEsax72BjPSab83VALHft6aNBSVhQgC var2 = (c5yjVoYlQQ2rPK2XYckKiKNAaBdIPJ7B2WWxur0KUr3NMhMScmaRIHc1OAnmAJ1NYGzVEtEsax72BjPSab83VALHft6aNBSVhQgC)var1;
      Set var3 = this.BatModClient(var2, false);
      return var3 == null ? false : var3.contains(var2);
   }

   @Override
   public boolean add(Object var1) {
      if (!(var1 instanceof c5yjVoYlQQ2rPK2XYckKiKNAaBdIPJ7B2WWxur0KUr3NMhMScmaRIHc1OAnmAJ1NYGzVEtEsax72BjPSab83VALHft6aNBSVhQgC)) {
         return false;
      } else {
         c5yjVoYlQQ2rPK2XYckKiKNAaBdIPJ7B2WWxur0KUr3NMhMScmaRIHc1OAnmAJ1NYGzVEtEsax72BjPSab83VALHft6aNBSVhQgC var2 = (c5yjVoYlQQ2rPK2XYckKiKNAaBdIPJ7B2WWxur0KUr3NMhMScmaRIHc1OAnmAJ1NYGzVEtEsax72BjPSab83VALHft6aNBSVhQgC)var1;
         if (var2 == null) {
            return false;
         } else {
            Set var3 = this.BatModClient(var2, true);
            boolean var4 = var3.add(var2);
            boolean var5 = super.add(var1);
            if (var4 != var5) {
               throw new IllegalStateException("Added: " + var4 + ", addedParent: " + var5);
            } else {
               return var5;
            }
         }
      }
   }

   @Override
   public boolean remove(Object var1) {
      if (!(var1 instanceof c5yjVoYlQQ2rPK2XYckKiKNAaBdIPJ7B2WWxur0KUr3NMhMScmaRIHc1OAnmAJ1NYGzVEtEsax72BjPSab83VALHft6aNBSVhQgC)) {
         return false;
      } else {
         c5yjVoYlQQ2rPK2XYckKiKNAaBdIPJ7B2WWxur0KUr3NMhMScmaRIHc1OAnmAJ1NYGzVEtEsax72BjPSab83VALHft6aNBSVhQgC var2 = (c5yjVoYlQQ2rPK2XYckKiKNAaBdIPJ7B2WWxur0KUr3NMhMScmaRIHc1OAnmAJ1NYGzVEtEsax72BjPSab83VALHft6aNBSVhQgC)var1;
         Set var3 = this.BatModClient(var2, false);
         if (var3 == null) {
            return false;
         } else {
            boolean var4 = var3.remove(var2);
            boolean var5 = super.remove(var2);
            if (var4 != var5) {
               throw new IllegalStateException("Added: " + var4 + ", addedParent: " + var5);
            } else {
               return var5;
            }
         }
      }
   }

   private Set BatModClient(
      c5yjVoYlQQ2rPK2XYckKiKNAaBdIPJ7B2WWxur0KUr3NMhMScmaRIHc1OAnmAJ1NYGzVEtEsax72BjPSab83VALHft6aNBSVhQgC var1, boolean var2
   ) {
      if (var1 == null) {
         return null;
      }

      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3 = var1.BatModClient;
      int var4 = var3.BatModProgressBar() >> 4;
      int var5 = var3.IntegerSpinner() >> 4;
      return this.BatModClient(var4, var5, var2);
   }

   private Set BatModClient(int var1, int var2, boolean var3) {
      long var4 = mfkVofzbwMv5rqykHfGmleyzSuDdktrfvFBPe0KI9e5yQJTHFwIUKLhJqWutPqyXke1YkCJbTeGe5ZPtfhBgUxTVaM6Aux3WGvyH.BatModClient(
         var1, var2
      );
      HashSet var6 = (HashSet)this.BatModClient
         .BatModClient(var4);
      if (var6 == null && var3) {
         var6 = new HashSet();
         this.BatModClient
            .BatModClient(var4, var6);
      }

      return var6;
   }

   @Override
   public Iterator iterator() {
      if (this.Button == Integer.MIN_VALUE) {
         return super.iterator();
      }

      if (this.size() <= 0) {
         return Iterators.emptyIterator();
      }

      int var1 = this.Button >> 4;
      int var2 = this.CustomSpinner >> 4;
      int var3 = this.ButtonAction >> 4;
      int var4 = this.Spinner >> 4;
      ArrayList var5 = new ArrayList();

      for (int var6 = var1; var6 <= var3; var6++) {
         for (int var7 = var2; var7 <= var4; var7++) {
            Set var8 = this.BatModClient(var6, var7, false);
            if (var8 != null) {
               var5.add(var8.iterator());
            }
         }
      }

      if (var5.size() <= 0) {
         return Iterators.emptyIterator();
      } else {
         return var5.size() == 1 ? (Iterator)var5.get(0) : Iterators.concat(var5.iterator());
      }
   }

   public void BatModClient(int var1, int var2, int var3, int var4) {
      this.Button = Math.min(var1, var3);
      this.CustomSpinner = Math.min(var2, var4);
      this.ButtonAction = Math.max(var1, var3);
      this.Spinner = Math.max(var2, var4);
   }

   public void BatModClient() {
      this.Button = Integer.MIN_VALUE;
      this.CustomSpinner = Integer.MIN_VALUE;
      this.ButtonAction = Integer.MIN_VALUE;
      this.Spinner = Integer.MIN_VALUE;
   }
}
