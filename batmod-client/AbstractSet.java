import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TVcUgaRmMSxV8nzp5N7epWp1tIz2OKuxgvhGopcjercOOCFnVjBmtpeEC2Qup9LmFAYEJM33T4NQAq1rFp4bWcnoAVlJ65CZPRO extends AbstractSet {
   private static final Set BatModClient = Sets.newHashSet();
   private final Map Button = Maps.newHashMap();
   private final Set CustomSpinner = Sets.newIdentityHashSet();
   private final Class ButtonAction;
   private final List Spinner = Lists.newArrayList();

   public TVcUgaRmMSxV8nzp5N7epWp1tIz2OKuxgvhGopcjercOOCFnVjBmtpeEC2Qup9LmFAYEJM33T4NQAq1rFp4bWcnoAVlJ65CZPRO(Class var1) {
      this.ButtonAction = var1;
      this.CustomSpinner.add(var1);
      this.Button
         .put(var1, this.Spinner);

      for (Class var3 : BatModClient) {
         this.BatModClient(var3);
      }
   }

   protected void BatModClient(Class var1) {
      BatModClient.add(var1);

      for (Object var3 : this.Spinner) {
         if (var1.isAssignableFrom(var3.getClass())) {
            this.BatModClient(var3, var1);
         }
      }

      this.CustomSpinner.add(var1);
   }

   protected Class Button(Class var1) {
      if (this.ButtonAction.isAssignableFrom(var1)) {
         if (!this.CustomSpinner.contains(var1)) {
            this.BatModClient(var1);
         }

         return var1;
      } else {
         throw new IllegalArgumentException("Don't know how to search for " + var1);
      }
   }

   @Override
   public boolean add(Object var1) {
      for (Class var3 : this.CustomSpinner) {
         if (var3.isAssignableFrom(var1.getClass())) {
            this.BatModClient(var1, var3);
         }
      }

      return true;
   }

   private void BatModClient(Object var1, Class var2) {
      List var3 = (List)this.Button.get(var2);
      if (var3 == null) {
         this.Button
            .put(var2, Lists.newArrayList(new Object[]{var1}));
      } else {
         var3.add(var1);
      }
   }

   @Override
   public boolean remove(Object var1) {
      Object var2 = var1;
      boolean var3 = false;

      for (Class var5 : this.CustomSpinner) {
         if (var5.isAssignableFrom(var2.getClass())) {
            List var6 = (List)this.Button.get(var5);
            if (var6 != null && var6.remove(var2)) {
               var3 = true;
            }
         }
      }

      return var3;
   }

   @Override
   public boolean contains(Object var1) {
      return Iterators.contains(
         this.CustomSpinner(var1.getClass()).iterator(), var1
      );
   }

   public Iterable CustomSpinner(Class var1) {
      return new IdlUnFC2hJVjFSHhr8bs9RuFBQetQbfBuQqqlC8skRrdZ2p6Y18qAWJUfikONhP9XcoE794fQXcixQvDFT1Rmz26DxUgdG11xAer(this, var1);
   }

   @Override
   public Iterator iterator() {
      return this.Spinner.isEmpty()
         ? Iterators.emptyIterator()
         : Iterators.unmodifiableIterator(this.Spinner.iterator());
   }

   @Override
   public int size() {
      return this.Spinner.size();
   }
}
