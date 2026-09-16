import com.google.common.base.Predicate;
import java.util.Map;
import java.util.Map.Entry;

final class OpfQGq2k67gH5RddixnlqZPM9NMUoNYYJbSLObjs2aM7trTRarjk43DNndTIxFJLxODNELLzUZfY7mQ39VxtmI6BXR2xbVm3zFzI implements Predicate {
   OpfQGq2k67gH5RddixnlqZPM9NMUoNYYJbSLObjs2aM7trTRarjk43DNndTIxFJLxODNELLzUZfY7mQ39VxtmI6BXR2xbVm3zFzI(Map var1) {
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = var1;
   }

   public boolean Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var1
   ) {
      mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT var2 = TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(0)
         .WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o();

      for (Entry var4 : this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I.entrySet()) {
         String var5 = (String)var4.getKey();
         boolean var6 = false;
         if (var5.endsWith("_min") && var5.length() > 4) {
            var6 = true;
            var5 = var5.substring(0, var5.length() - 4);
         }

         fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var7 = var2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var5
         );
         if (var7 == null) {
            return false;
         }

         String var8 = var1 instanceof egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS
            ? var1.C_()
            : var1.syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB().toString();
         if (!var2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var8, var7)) {
            return false;
         }

         ZhRj8RKC0PyYCls0TxJeTRGUZyqZsaQuB7RgHP3jy5mPjX3N01IWunAS0rVVrZNRXGQ28MwKnmknGO4b0xMvALlnxMrQW8lckb4h var9 = var2.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
            var8, var7
         );
         int var10 = var9.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW();
         if (var10 < (Integer)var4.getValue() && var6) {
            return false;
         }

         if (var10 > (Integer)var4.getValue() && !var6) {
            return false;
         }
      }

      return true;
   }
}
