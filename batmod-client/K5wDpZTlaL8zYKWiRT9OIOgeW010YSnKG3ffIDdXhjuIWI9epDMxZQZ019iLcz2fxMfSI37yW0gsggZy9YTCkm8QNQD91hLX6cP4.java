import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class K5wDpZTlaL8zYKWiRT9OIOgeW010YSnKG3ffIDdXhjuIWI9epDMxZQZ019iLcz2fxMfSI37yW0gsggZy9YTCkm8QNQD91hLX6cP4 {
   public static final File Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = new File(
      "banned-players.json"
   );
   public static final File BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = new File("banned-ips.json");
   public static final File vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5 = new File("ops.json");
   public static final File PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u = new File("whitelist.json");
   private static final Logger QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0 = LogManager.getLogger();
   private static final SimpleDateFormat kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ = new SimpleDateFormat(
      "yyyy-MM-dd 'at' HH:mm:ss z"
   );
   private final TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY;
   private final List sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9 = Lists.newArrayList();
   private final Map lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ = Maps.newHashMap();
   private final IL2UTDNWUanExOapXazSGnDGxsF8fMQvkBKuxocrIISsux6Y5DBKve7gWvIvfjrBiOM0fIaMRZb14xXEyrFrx7IicwqxHyM0BSzI agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x = new IL2UTDNWUanExOapXazSGnDGxsF8fMQvkBKuxocrIISsux6Y5DBKve7gWvIvfjrBiOM0fIaMRZb14xXEyrFrx7IicwqxHyM0BSzI(
      Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
   );
   private final MuhQ3ofzEsGUkhssjOc0pR4F5CmsLjSdDXfF7huE4FJpM7znHyzCwppCFeTowiDrs8pre9nDG6d9waO3rR5h9CTRo1ArrxpP3lih uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk = new MuhQ3ofzEsGUkhssjOc0pR4F5CmsLjSdDXfF7huE4FJpM7znHyzCwppCFeTowiDrs8pre9nDG6d9waO3rR5h9CTRo1ArrxpP3lih(
      BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW
   );
   private final NWlfKOxwaMTImXvxpKmdCljyflavCiujjkYFZAoXA5MRpHdeh3SsejvqHkP9vyCVHtwQ00XIkKNeu8OyZNjsQbcB0LRdgl6mKIHy Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ = new NWlfKOxwaMTImXvxpKmdCljyflavCiujjkYFZAoXA5MRpHdeh3SsejvqHkP9vyCVHtwQ00XIkKNeu8OyZNjsQbcB0LRdgl6mKIHy(
      vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
   );
   private final IVs6B5tH6x0aYLTSiIvNS6sf1JmBfWBMenGQi9Uvlg7bystsTpueRfJulgVLScIWStEWxHe5kIvSl0aoOLiXyrgOlpi3WAJgO96N aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = new IVs6B5tH6x0aYLTSiIvNS6sf1JmBfWBMenGQi9Uvlg7bystsTpueRfJulgVLScIWStEWxHe5kIvSl0aoOLiXyrgOlpi3WAJgO96N(
      PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u
   );
   private final Map LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN = Maps.newHashMap();
   private hzmaJc5xZSuB44Ya2IggREPbO44AxnQhimxx16jMKnbe2xLSjEu9JaDFuuH2THsv6pOt6nGV2unZ3P169nsSNmL6PeFvKfCmtd0s G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr;
   private boolean iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF;
   protected int uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590;
   private int bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ;
   private UE2PeEzLtwZJcfzzlceXydgXnldouotmhx7JTtb6WqAGU2xPCPSZgAOBNhie6Cs6Odaif0TEaKk2LwldBMtSoKHVJEQelXiXYBqc RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB;
   private boolean J1VLLIBCcZYqsaZhGKUiJoLcHFU1EJaCZvLl4QFMTqn7fzHDGkkCKNDFKU4XbeFyk8njwMcgfY6j93jLeZs8jAC6Xw2vjgswnn40;
   private int zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t;

   public K5wDpZTlaL8zYKWiRT9OIOgeW010YSnKG3ffIDdXhjuIWI9epDMxZQZ019iLcz2fxMfSI37yW0gsggZy9YTCkm8QNQD91hLX6cP4(
      TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD var1
   ) {
      this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY = var1;
      this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(false);
      this.uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(false);
      this.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590 = 8;
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      fAs5KLOOmwUcVodVl3FCZBbWUdYlZXFBVyIMCxKQwU7bmWE8yO6HgaePXLQjMD7xMv8xLYSBB8SfoWbOyu2N6CKhX7GsYcvgaATS var1,
      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var2
   ) {
      GameProfile var3 = var2.mRFNfHc3kblqdqWsLwzqRGIU02m0p9aXYDFmGNsAIxA7DlTNJQQ7y31t5ejW8Afe9z2InSkbKDnci9jD6eSnC1Tpsb6h3uVe4NBB();
      PEOBG8If3G8o4gPpc2dCmsCzcolpje8tGBE6KVbBgs2PH8lGmAptMKkdQW6OgEwjYRWPhGicLKjkMb9qjH2pI2GgtuBZvRl3NsB var4 = this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
         .H5AfuPi6A5dR1CMugDXgAoLQyJOF06VOkDTd7xZhA4PQTQa65SGEWInSjIFDT4he5MqClJs80ceNMzYDIqSK0srjcdqq9co84vr();
      GameProfile var5 = var4.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var3.getId());
      String var6 = var5 == null ? var3.getName() : var5.getName();
      var4.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var3);
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var7 = this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
         var2
      );
      var2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               var2.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o
            )
      );
      var2.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            (hFZJAH3yIqfwCBV3b79FNqw6s6MptXUmJFkvggZ1hAcG7kdcmKvpDqxghz0xajK8jKFWyzGVF58QgJ3BGULiOg2PZcvuX82DqXK3)var2.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY
         );
      String var8 = "local";
      if (var1.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW() != null) {
         var8 = var1.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW().toString();
      }

      QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0.info(
         var2.C_()
            + "["
            + var8
            + "] logged in with entity id "
            + var2.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb()
            + " at ("
            + var2.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
            + ", "
            + var2.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
            + ", "
            + var2.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
            + ")"
      );
      hFZJAH3yIqfwCBV3b79FNqw6s6MptXUmJFkvggZ1hAcG7kdcmKvpDqxghz0xajK8jKFWyzGVF58QgJ3BGULiOg2PZcvuX82DqXK3 var9 = this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var2.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o
         );
      KitVScYE9kT111hKrLPkEwp7zG3KSm9e3NBwqloD0cWi3xqPVuWeW5wgEZsUOSSFuyDI5vihOc1q1MDgkBoUdUsYT0oFWcNPr7oC var10 = var9.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL();
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var11 = var9.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8();
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var2, (egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS)null, var9
      );
      kQQItZtzHM13COdz0yjBdSIydu9rZKudQOwfPIiopuFUvmyOH8aeu4S3Yyed3dD3l4NmKQ9m8jhaoQCTEb4qkYgJcXlIxMlYuc8J var12 = new kQQItZtzHM13COdz0yjBdSIydu9rZKudQOwfPIiopuFUvmyOH8aeu4S3Yyed3dD3l4NmKQ9m8jhaoQCTEb4qkYgJcXlIxMlYuc8J(
         this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY, var1, var2
      );
      var12.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         new jeoIsG9ZdyPghp5H3qUOWeu8EBZIKXKVyKToJqz5mILUt3RpI5jMoUWu5CHhY0niaAYP5FEKrMUzRm7y4pMrLymrB7NWLdTTJcw(
            var2.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb(),
            var2.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(),
            var10.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB(),
            var9.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF(),
            var9.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt(),
            this.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF(),
            var10.J1VLLIBCcZYqsaZhGKUiJoLcHFU1EJaCZvLl4QFMTqn7fzHDGkkCKNDFKU4XbeFyk8njwMcgfY6j93jLeZs8jAC6Xw2vjgswnn40(),
            var9.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr()
               .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW("reducedDebugInfo")
         )
      );
      var12.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         new wzHSiLlwxwPmIS7PvcF39PGD5dZWnIczHQE1bTYq9BWy1z1DLxdTDoEnBwWSumYGReZjzK0Z2rJzkYPrrTR2d4f7NjRK7ZRSLmQZ(
            "MC|Brand",
            new LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx(Unpooled.buffer())
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()
                     .EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj()
               )
         )
      );
      var12.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         new DhrJRh946nOBZOOWg862zGULYk7q295t4EcbU7DTBYvo4fOIXCElXlVue7d6KslIgLrVQYcAuWWlzxe6R3coEBjKWwZL4x99Gnq3(
            var10.CLN0iQxTW30J248Fxg16Bugujy6a3ZiEgudmbjRU3IbkRT7YZU3jIYed7LCKoRRICKjJIVig9YZZItorQ2IeFMP2gWElNbTNVZgl(),
            var10.HEycvLXuxJtqnm1Q22Ov3jPFXiY9uV7PHxZL3mxyhegWr71nFjdNmThCqfwtAatIAo5zb7RQ0HbwXhvMNWmPD7lI7R6v8rrgROSU()
         )
      );
      var12.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         new niNSFz9e7WpC8htPnTVyQKN6WrYP7VPjq0r3JOGLPXnHJQ2WJlyyIPDTGkO1KLiv0uMBOrlFJqL8qXJh5L1DQOD89gt5gCTKOsUv(var11)
      );
      var12.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         new ofInTcag4rlAjs1LMGdeJNlNHZAcu0O7X9qexN2GiLvGWFO7ja3U9X65yADZ1SQOfnBX74Ul4NFXfPZzPoAoLWBsO7qFBGeFuD3N(
            var2.CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0
         )
      );
      var12.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         new SAdPij1hP2qghLmpYYFic71g5uXEJtfv6YfM09sZ8ref2svKY5K50bpcONfH4xzKCHmhpMp62lipiAlk5BlcTmfJT35T7S1VzgAA(
            var2.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
         )
      );
      var2.NZVtMZSkmHhpRsktkfvGU6AzjRMXV6Zy5dCYKetAOLX2hlQvbqzHsVoKbZtWRJQ33NB1mbsQrvYD7xyLmf3JTnTNvGB2Lhkjxtc9()
         .PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
      var2.NZVtMZSkmHhpRsktkfvGU6AzjRMXV6Zy5dCYKetAOLX2hlQvbqzHsVoKbZtWRJQ33NB1mbsQrvYD7xyLmf3JTnTNvGB2Lhkjxtc9()
         .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var2);
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         (D0iuziZRCtz3GN8EWBXxSmkUaVyuwlhC5zNtwxAsbWDuXK8VviJtY0jJeqqUUrUV8oNV9dLJrUWVvTnOabYH8L18duTbEKHLRe4c)var9.WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o(),
         var2
      );
      this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
         .U6YdgALLoLmkuNoSN8o2dRLyN7wSv1wvyjFCXyN8OBYuTUbKZPvqEjwcaMZLS8aIvONsZmtJWdQ2wVtMDU7OVlNurFC162XCTuFi();
      emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01 var13;
      if (!var2.C_().equalsIgnoreCase(var6)) {
         var13 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
            "multiplayer.player.joined.renamed",
            var2.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(),
            var6
         );
      } else {
         var13 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
            "multiplayer.player.joined", var2.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()
         );
      }

      var13.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ()
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
         );
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var13);
      this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(var2);
      var12.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var2.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8,
         var2.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa,
         var2.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4,
         var2.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF,
         var2.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb
      );
      this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var2, var9);
      if (this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
            .zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3()
            .length()
         > 0) {
         var2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
               .zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3(),
            this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
               .TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ()
         );
      }

      for (Vh7hQbBPS72k8EM0hg01W4cU79DjSwdIWjh8U37Ozd2ALBjThi1P2PD0mISh9o6Q7PIhiyBdspisZbvXngtkpaH1RGfSdZz0LTOn var15 : var2.jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD()) {
         var12.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            new kMtJFbQ5JlyXthgav1PA5GMloT6f7yufGNaSQfti5Dj48ArpmhmOJOffiaCrOZVW4AHepbHGj9KkomfjBQ91OTuhflEUVR7qUeFC(
               var2.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb(), var15
            )
         );
      }

      var2.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY();
      if (var7 != null && var7.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW("Riding", 10)) {
         Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var16 = hKPBOe3585WEzG4DP150uJQPNGxACsB5sNJBGIeVlmG7aFifjWp9gTp4sNfskpb6eHYTPSj8yHrMYptqaEgctEBusNqgap6lpZxA.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var7.Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ("Riding"), var9
         );
         if (var16 != null) {
            var16.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM = true;
            var9.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var16);
            var2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var16);
            var16.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM = false;
         }
      }
   }

   protected void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      D0iuziZRCtz3GN8EWBXxSmkUaVyuwlhC5zNtwxAsbWDuXK8VviJtY0jJeqqUUrUV8oNV9dLJrUWVvTnOabYH8L18duTbEKHLRe4c var1,
      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var2
   ) {
      HashSet var3 = Sets.newHashSet();

      for (hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I var5 : var1.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590()) {
         var2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               new oY4dTRNgiVX7NxJz7QlA23c4Ww3LF6DN8TyFKbg81Fky9aP3ZNFuNw0y6mTlHizxNCuoAHv8NOgvOJdSm6bTgLojBvybAaxX7X62(var5, 0)
            );
      }

      for (int var8 = 0; var8 < 19; var8++) {
         fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var9 = var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var8
         );
         if (var9 != null && !var3.contains(var9)) {
            for (fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM var7 : var1.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0(
               var9
            )) {
               var2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
                  .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var7);
            }

            var3.add(var9);
         }
      }
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      hFZJAH3yIqfwCBV3b79FNqw6s6MptXUmJFkvggZ1hAcG7kdcmKvpDqxghz0xajK8jKFWyzGVF58QgJ3BGULiOg2PZcvuX82DqXK3[] var1
   ) {
      this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr = var1[0]
         .o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4()
         .uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590();
      var1[0]
         .dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11()
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            new ZwwECT3HgsIHA4zj242I8AznENt7DFQSHvavVJ1YsRWPPPGFrqjP97QJf4N5QXGtXOGX5lVgWHH3PGBoh1nxG3JuTMqlM4btmVsI(this)
         );
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var1,
      hFZJAH3yIqfwCBV3b79FNqw6s6MptXUmJFkvggZ1hAcG7kdcmKvpDqxghz0xajK8jKFWyzGVF58QgJ3BGULiOg2PZcvuX82DqXK3 var2
   ) {
      hFZJAH3yIqfwCBV3b79FNqw6s6MptXUmJFkvggZ1hAcG7kdcmKvpDqxghz0xajK8jKFWyzGVF58QgJ3BGULiOg2PZcvuX82DqXK3 var3 = var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4();
      if (var2 != null) {
         var2.SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj()
            .vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(var1);
      }

      var3.SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj()
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1);
      var3.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr
         .vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            (int)var1.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8 >> 4,
            (int)var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4 >> 4
         );
   }

   public int PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u() {
      return Md9SQKZUoM6mpqIBC0Vq4Tu9gxQiUrUwjHtxulky0GOuyQ724EE7Cv7zvaICI3wNK9NVjhzGCGytdaxWurYJ4tMujttY7DDQ1V6v.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
         this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB()
      );
   }

   public YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var1
   ) {
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var2 = this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
            .PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u[0]
         .K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL()
         .sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9();
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var3;
      if (var1.C_()
            .equals(
               this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
                  .ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu()
            )
         && var2 != null) {
         var1.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0(var2);
         var3 = var2;
         QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0.debug("loading single player");
      } else {
         var3 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var1);
      }

      return var3;
   }

   protected void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var1
   ) {
      this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1);
      VdXRQj2pBYkYAVjy4IaWxt31U10xn4h7TcirTDjk7sHOD7vEvp9AgtdQRNxaWfkMT3oVryT9imgczBe5xzAkcg51coFDtSqioT3h var2 = (VdXRQj2pBYkYAVjy4IaWxt31U10xn4h7TcirTDjk7sHOD7vEvp9AgtdQRNxaWfkMT3oVryT9imgczBe5xzAkcg51coFDtSqioT3h)this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
         .get(var1.syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB());
      if (var2 != null) {
         var2.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW();
      }
   }

   public void vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var1
   ) {
      this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9.add(var1);
      this.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ
         .put(var1.syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB(), var1);
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         new mPPW3XCTNjEWnfX8fdzJmJIsB1WwvUnKUGSUYxh357IVnT2L1janqVVkpqXiJem0ai6HNY9k7j8IYzZyN5AxpLhhJPKAJhSN8H9(
            tXiV6vwqTJDJIbUR2bNlI32oZIev3QwUObJ7VT4gh0ybiH42ByjNCpR0xq6gaX5bFIiVe1PPoZST8CpUAQRZaqyVSgKH9aakfSjK.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I,
            var1
         )
      );
      hFZJAH3yIqfwCBV3b79FNqw6s6MptXUmJFkvggZ1hAcG7kdcmKvpDqxghz0xajK8jKFWyzGVF58QgJ3BGULiOg2PZcvuX82DqXK3 var2 = this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var1.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o
         );
      var2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1);
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var1, (hFZJAH3yIqfwCBV3b79FNqw6s6MptXUmJFkvggZ1hAcG7kdcmKvpDqxghz0xajK8jKFWyzGVF58QgJ3BGULiOg2PZcvuX82DqXK3)null
      );

      for (int var3 = 0; var3 < this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9.size(); var3++) {
         egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var4 = (egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS)this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
            .get(var3);
         var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               new mPPW3XCTNjEWnfX8fdzJmJIsB1WwvUnKUGSUYxh357IVnT2L1janqVVkpqXiJem0ai6HNY9k7j8IYzZyN5AxpLhhJPKAJhSN8H9(
                  tXiV6vwqTJDJIbUR2bNlI32oZIev3QwUObJ7VT4gh0ybiH42ByjNCpR0xq6gaX5bFIiVe1PPoZST8CpUAQRZaqyVSgKH9aakfSjK.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I,
                  var4
               )
            );
      }
   }

   public void PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(
      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var1
   ) {
      var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4()
         .SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj()
         .PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(var1);
   }

   public void uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(
      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var1
   ) {
      var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         hWMBbe1tOjEiAImIBH6FPljeGzgFkqwimOGmEMw740rfhtpEXwJTHpMWqJPXXtJXwCgg1q0TFBxFrqTzIEHfI11cHALyYAP79erU.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0
      );
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1);
      hFZJAH3yIqfwCBV3b79FNqw6s6MptXUmJFkvggZ1hAcG7kdcmKvpDqxghz0xajK8jKFWyzGVF58QgJ3BGULiOg2PZcvuX82DqXK3 var2 = var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4();
      if (var1.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t != null) {
         var2.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0(
            var1.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         );
         QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0.debug("removing player mount");
      }

      var2.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var1);
      var2.SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj()
         .vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(var1);
      this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9.remove(var1);
      UUID var3 = var1.syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB();
      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var4 = (egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS)this.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ
         .get(var3);
      if (var4 == var1) {
         this.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ.remove(var3);
         this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN.remove(var3);
      }

      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         new mPPW3XCTNjEWnfX8fdzJmJIsB1WwvUnKUGSUYxh357IVnT2L1janqVVkpqXiJem0ai6HNY9k7j8IYzZyN5AxpLhhJPKAJhSN8H9(
            tXiV6vwqTJDJIbUR2bNlI32oZIev3QwUObJ7VT4gh0ybiH42ByjNCpR0xq6gaX5bFIiVe1PPoZST8CpUAQRZaqyVSgKH9aakfSjK.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590,
            var1
         )
      );
   }

   public String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(SocketAddress var1, GameProfile var2) {
      if (this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2)) {
         hDM28ZquUeShDo4n4jcDPlQKOS0yKGD9MMxyswNxXaV7MMCWIkqFu3u4xkCPbRCqdTMVFYUogqgEK20vrtUpCDCqCBGFSAym6Nde var5 = (hDM28ZquUeShDo4n4jcDPlQKOS0yKGD9MMxyswNxXaV7MMCWIkqFu3u4xkCPbRCqdTMVFYUogqgEK20vrtUpCDCqCBGFSAym6Nde)this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2);
         String var6 = "You are banned from this server!\nReason: "
            + var5.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW();
         if (var5.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I() != null) {
            var6 = var6
               + "\nYour ban will be removed on "
               + kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ.format(
                  var5.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
               );
         }

         return var6;
      } else {
         if (!this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(var2)) {
            return "You are not white-listed on this server!";
         }

         if (this.uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1)) {
            PMVdqvhEjSYcdsVh63G267wwLNYRT3RSekHRImgBxvxMczp0BDianQVq5ltV1wpTdaTCHM9v3FLea5bMpWAvKS7dWThF4AKkMQ6b var3 = this.uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk
               .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var1);
            String var4 = "Your IP address is banned from this server!\nReason: "
               + var3.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW();
            if (var3.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I() != null) {
               var4 = var4
                  + "\nYour ban will be removed on "
                  + kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ.format(
                     var3.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
                  );
            }

            return var4;
         } else {
            return this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9.size()
                     >= this.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590
                  && !this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY(var2)
               ? "The server is full!"
               : null;
         }
      }
   }

   public egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      GameProfile var1
   ) {
      UUID var2 = EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var1
      );
      ArrayList var3 = Lists.newArrayList();

      for (int var4 = 0; var4 < this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9.size(); var4++) {
         egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var5 = (egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS)this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
            .get(var4);
         if (var5.syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB().equals(var2)) {
            var3.add(var5);
         }
      }

      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var7 = (egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS)this.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ
         .get(var1.getId());
      if (var7 != null && !var3.contains(var7)) {
         var3.add(var7);
      }

      for (egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var6 : var3) {
         var6.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I("You logged in from another location");
      }

      uiNrnIgsHuPBwt80RSvqkxZ93Qpqr1UJaZoATXGroBwZ1aFnHdgb6IQxcxCMD8wMA7Vo8BCF0HsGxY7SNAJBe4cm1W49G9pdGxO var9;
      if (this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
         .mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv()) {
         var9 = new wz6zHoHHAHNHilx0kvhf9y1xCgMkmWh0ERyElWoSPBYmbxYJgv18rpNLtCMEpoIg5YPiLZ46ykzALIPlMUwfN8m3BUR5XFdFyWic(
            this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(0)
         );
      } else {
         var9 = new uiNrnIgsHuPBwt80RSvqkxZ93Qpqr1UJaZoATXGroBwZ1aFnHdgb6IQxcxCMD8wMA7Vo8BCF0HsGxY7SNAJBe4cm1W49G9pdGxO(
            this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(0)
         );
      }

      return new egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS(
         this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY,
         this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(0),
         var1,
         var9
      );
   }

   public egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var1, int var2, boolean var3
   ) {
      var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4()
         .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
         .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var1);
      var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4()
         .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
         .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
            (Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM)var1
         );
      var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4()
         .SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj()
         .vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(var1);
      this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9.remove(var1);
      this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var1.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o
         )
         .QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0(var1);
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var4 = var1.jjkuV1HwQ5MnHWlymwOyACAG5WDldp5g6GlndD8c4S82SIU85mQCIn7S5vML3lh80FZXsgJueLhB59wIx6EiYwc4545L3gcwusb2();
      boolean var5 = var1.avIx9Z1GrWIa0z1gxAQZthC65WWr6UkFWqtJD2718QqJTWUtPP69vneu2NglhF5gFqt2MCtxb16VXl2MgBqthLbKrCYpy2FClIlq();
      var1.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o = var2;
      uiNrnIgsHuPBwt80RSvqkxZ93Qpqr1UJaZoATXGroBwZ1aFnHdgb6IQxcxCMD8wMA7Vo8BCF0HsGxY7SNAJBe4cm1W49G9pdGxO var6;
      if (this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
         .mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv()) {
         var6 = new wz6zHoHHAHNHilx0kvhf9y1xCgMkmWh0ERyElWoSPBYmbxYJgv18rpNLtCMEpoIg5YPiLZ46ykzALIPlMUwfN8m3BUR5XFdFyWic(
            this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var1.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o
               )
         );
      } else {
         var6 = new uiNrnIgsHuPBwt80RSvqkxZ93Qpqr1UJaZoATXGroBwZ1aFnHdgb6IQxcxCMD8wMA7Vo8BCF0HsGxY7SNAJBe4cm1W49G9pdGxO(
            this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var1.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o
               )
         );
      }

      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var7 = new egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS(
         this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY,
         this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               var1.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o
            ),
         var1.mRFNfHc3kblqdqWsLwzqRGIU02m0p9aXYDFmGNsAIxA7DlTNJQQ7y31t5ejW8Afe9z2InSkbKDnci9jD6eSnC1Tpsb6h3uVe4NBB(),
         var6
      );
      var7.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I;
      var7.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1, var3);
      var7.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(
         var1.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb()
      );
      var7.uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk(var1);
      hFZJAH3yIqfwCBV3b79FNqw6s6MptXUmJFkvggZ1hAcG7kdcmKvpDqxghz0xajK8jKFWyzGVF58QgJ3BGULiOg2PZcvuX82DqXK3 var8 = this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var1.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o
         );
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var7, var1, var8);
      if (var4 != null) {
         q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var9 = EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var1.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o
               ),
            var4,
            var5
         );
         if (var9 != null) {
            var7.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
               var9.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY() + 0.5F,
               var9.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9() + 0.1F,
               var9.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ() + 0.5F,
               0.0F,
               0.0F
            );
            var7.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var4, var5);
         } else {
            var7.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  new KKTbr4YAhF6NEtr2T2tEBd2P57A9cMrzTyuEKN7rrA9Itc22BhNcwbXKTewsC3Y0ME7fHgaehWAJ7cVnV0jHDgTzfYyH34ej34Yb(0, 0.0F)
               );
         }
      }

      var8.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr
         .vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            (int)var7.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8 >> 4,
            (int)var7.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4 >> 4
         );

      while (
         !var8.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var7, var7.tRQaYXSNntij6PV4DcSlupxEkxcVsOBLXFv4nOK3Ol9pSA4cNxTlBkPP8sq20V2QKgHsBqlNwlCA2DuXXPBdDvFX73z7oxq5m5m5()
               )
               .isEmpty()
            && var7.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa < 256.0
      ) {
         var7.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
            var7.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8,
            var7.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa + 1.0,
            var7.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
         );
      }

      var7.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            new LfOz5buye7AxJxZv8h4WG31f9I1HfEwhL3WwCKW78K7ZLaIypQFMFZ1nxV6M435CIFT2RX8b3fHL7owvGg3WKTAe9jcoTIj9aCX3(
               var7.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o,
               var7.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY
                  .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt(),
               var7.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY
                  .K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL()
                  .J1VLLIBCcZYqsaZhGKUiJoLcHFU1EJaCZvLl4QFMTqn7fzHDGkkCKNDFKU4XbeFyk8njwMcgfY6j93jLeZs8jAC6Xw2vjgswnn40(),
               var7.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
                  .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
            )
         );
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var10 = var8.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8();
      var7.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var7.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8,
            var7.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa,
            var7.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4,
            var7.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF,
            var7.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb
         );
      var7.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            new niNSFz9e7WpC8htPnTVyQKN6WrYP7VPjq0r3JOGLPXnHJQ2WJlyyIPDTGkO1KLiv0uMBOrlFJqL8qXJh5L1DQOD89gt5gCTKOsUv(var10)
         );
      var7.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            new vGWSmuGtaHEcQtuvhrlu4nWzuYkpp0NNV9TzvbB8ChSPGJlhbxDnoAHT7QD9d1B7YybnzWJcqM4JxASHh7UJ47S5TpyAIl92gzPy(
               var7.g9grDpgp9Q2L4fyYFWCzIBwHil9xF6vb7mzmmd03cP4YwRaNZn58LxrZPCtISHYOHFoge9IrFn06Wru29OLvzhbOMA4rf7o3nbza,
               var7.WG5ncRD8g8g6NorTXxWQM402xSBZyMIxlkwYemdIYKsd88vmaVDD0pjYmiQzRLBia394jYSCDpju8uaXpZwxFfsaFRksE7wWOeGl,
               var7.S8GLXLm5KazhYzi6YG4eZRFbep3nPU8AfQS0GEyFo8GZV2b49sjJWYH9MohJFtlZesTTdbPjPReu6KiQcdERSN1d7jRRmIjb62g1
            )
         );
      this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var7, var8);
      var8.SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj()
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var7);
      var8.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var7);
      this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9.add(var7);
      this.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ
         .put(var7.syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB(), var7);
      var7.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY();
      var7.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x(
         var7.eXbgCpP5lUfFvUJWyVafz7sS9inkbzm9IJb10VzFRCYMC7CBeSWi0iiNHVGA5maCFjQTXOW3pR7NfCrRgHhlld6tBTrZBa125e9u()
      );
      return var7;
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var1, int var2
   ) {
      int var3 = var1.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o;
      hFZJAH3yIqfwCBV3b79FNqw6s6MptXUmJFkvggZ1hAcG7kdcmKvpDqxghz0xajK8jKFWyzGVF58QgJ3BGULiOg2PZcvuX82DqXK3 var4 = this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var1.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o
         );
      var1.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o = var2;
      hFZJAH3yIqfwCBV3b79FNqw6s6MptXUmJFkvggZ1hAcG7kdcmKvpDqxghz0xajK8jKFWyzGVF58QgJ3BGULiOg2PZcvuX82DqXK3 var5 = this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var1.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o
         );
      var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            new LfOz5buye7AxJxZv8h4WG31f9I1HfEwhL3WwCKW78K7ZLaIypQFMFZ1nxV6M435CIFT2RX8b3fHL7owvGg3WKTAe9jcoTIj9aCX3(
               var1.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o,
               var1.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY
                  .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt(),
               var1.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY
                  .K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL()
                  .J1VLLIBCcZYqsaZhGKUiJoLcHFU1EJaCZvLl4QFMTqn7fzHDGkkCKNDFKU4XbeFyk8njwMcgfY6j93jLeZs8jAC6Xw2vjgswnn40(),
               var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
                  .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
            )
         );
      var4.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0(var1);
      var1.ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu = false;
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1, var3, var4, var5);
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1, var4);
      var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var1.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8,
            var1.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa,
            var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4,
            var1.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF,
            var1.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb
         );
      var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var5);
      this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var1, var5);
      this.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0(var1);

      for (Vh7hQbBPS72k8EM0hg01W4cU79DjSwdIWjh8U37Ozd2ALBjThi1P2PD0mISh9o6Q7PIhiyBdspisZbvXngtkpaH1RGfSdZz0LTOn var7 : var1.jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD()) {
         var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               new kMtJFbQ5JlyXthgav1PA5GMloT6f7yufGNaSQfti5Dj48ArpmhmOJOffiaCrOZVW4AHepbHGj9KkomfjBQ91OTuhflEUVR7qUeFC(
                  var1.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb(), var7
               )
            );
      }
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var1,
      int var2,
      hFZJAH3yIqfwCBV3b79FNqw6s6MptXUmJFkvggZ1hAcG7kdcmKvpDqxghz0xajK8jKFWyzGVF58QgJ3BGULiOg2PZcvuX82DqXK3 var3,
      hFZJAH3yIqfwCBV3b79FNqw6s6MptXUmJFkvggZ1hAcG7kdcmKvpDqxghz0xajK8jKFWyzGVF58QgJ3BGULiOg2PZcvuX82DqXK3 var4
   ) {
      double var5 = var1.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8;
      double var7 = var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4;
      double var9 = 8.0;
      float var11 = var1.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF;
      var3.CLN0iQxTW30J248Fxg16Bugujy6a3ZiEgudmbjRU3IbkRT7YZU3jIYed7LCKoRRICKjJIVig9YZZItorQ2IeFMP2gWElNbTNVZgl
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I("moving");
      if (var1.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o == -1) {
         var5 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var5 / var9,
            var4.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11()
                  .PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()
               + 16.0,
            var4.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11()
                  .QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0()
               - 16.0
         );
         var7 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var7 / var9,
            var4.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11()
                  .uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590()
               + 16.0,
            var4.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11()
                  .kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ()
               - 16.0
         );
         var1.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
            var5,
            var1.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa,
            var7,
            var1.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF,
            var1.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb
         );
         if (var1.Cg2oCTxHXPp28ppSuJJV9GWg6aduGKf1avntN6JebEnu4gm3oT3O7gDbjvCTmsSkieYdMi9CVQz2TxvBZ5Bx07QxIz2MP7UVyFI()) {
            var3.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1, false);
         }
      } else if (var1.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o == 0) {
         var5 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var5 * var9,
            var4.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11()
                  .PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()
               + 16.0,
            var4.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11()
                  .QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0()
               - 16.0
         );
         var7 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var7 * var9,
            var4.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11()
                  .uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590()
               + 16.0,
            var4.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11()
                  .kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ()
               - 16.0
         );
         var1.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
            var5,
            var1.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa,
            var7,
            var1.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF,
            var1.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb
         );
         if (var1.Cg2oCTxHXPp28ppSuJJV9GWg6aduGKf1avntN6JebEnu4gm3oT3O7gDbjvCTmsSkieYdMi9CVQz2TxvBZ5Bx07QxIz2MP7UVyFI()) {
            var3.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1, false);
         }
      } else {
         q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var12;
         if (var2 == 1) {
            var12 = var4.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8();
         } else {
            var12 = var4.xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02();
         }

         var5 = var12.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY();
         var1.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa = var12.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9();
         var7 = var12.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ();
         var1.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
            var5, var1.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa, var7, 90.0F, 0.0F
         );
         if (var1.Cg2oCTxHXPp28ppSuJJV9GWg6aduGKf1avntN6JebEnu4gm3oT3O7gDbjvCTmsSkieYdMi9CVQz2TxvBZ5Bx07QxIz2MP7UVyFI()) {
            var3.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1, false);
         }
      }

      var3.CLN0iQxTW30J248Fxg16Bugujy6a3ZiEgudmbjRU3IbkRT7YZU3jIYed7LCKoRRICKjJIVig9YZZItorQ2IeFMP2gWElNbTNVZgl
         .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW();
      if (var2 != 1) {
         var3.CLN0iQxTW30J248Fxg16Bugujy6a3ZiEgudmbjRU3IbkRT7YZU3jIYed7LCKoRRICKjJIVig9YZZItorQ2IeFMP2gWElNbTNVZgl
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I("placing");
         var5 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            (int)var5, -29999872, 29999872
         );
         var7 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            (int)var7, -29999872, 29999872
         );
         if (var1.Cg2oCTxHXPp28ppSuJJV9GWg6aduGKf1avntN6JebEnu4gm3oT3O7gDbjvCTmsSkieYdMi9CVQz2TxvBZ5Bx07QxIz2MP7UVyFI()) {
            var1.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
               var5,
               var1.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa,
               var7,
               var1.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF,
               var1.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb
            );
            var4.amn2nKWHy3tKP1me3vWZAo3kCxxPLsyRXVgXMbtDm2IVfNnNvbVZG9g76zrNiHKMhz8BB70vWV6eB6u7sCEWciPBDCHg1XecGpY()
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1, var11);
            var4.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1);
            var4.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1, false);
         }

         var3.CLN0iQxTW30J248Fxg16Bugujy6a3ZiEgudmbjRU3IbkRT7YZU3jIYed7LCKoRRICKjJIVig9YZZItorQ2IeFMP2gWElNbTNVZgl
            .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW();
      }

      var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var4);
   }

   public void uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590() {
      if (++this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t > 600) {
         this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            new mPPW3XCTNjEWnfX8fdzJmJIsB1WwvUnKUGSUYxh357IVnT2L1janqVVkpqXiJem0ai6HNY9k7j8IYzZyN5AxpLhhJPKAJhSN8H9(
               tXiV6vwqTJDJIbUR2bNlI32oZIev3QwUObJ7VT4gh0ybiH42ByjNCpR0xq6gaX5bFIiVe1PPoZST8CpUAQRZaqyVSgKH9aakfSjK.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5,
               this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
            )
         );
         this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t = 0;
      }
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM var1
   ) {
      for (int var2 = 0; var2 < this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9.size(); var2++) {
         ((egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS)this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
               .get(var2))
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1);
      }
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM var1, int var2
   ) {
      for (int var3 = 0; var3 < this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9.size(); var3++) {
         egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var4 = (egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS)this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
            .get(var3);
         if (var4.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o == var2) {
            var4.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1);
         }
      }
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var1,
      WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var2
   ) {
      nkZ2LEdPKII0cv7VetNuVbL8COdy8CmUZo7KwtV7VZkEEe3RqCXmXMfHyitqZb01HIFR3w1WOgourQDDqGNkutCVZbryTQU0D3W6 var3 = var1.DjdSwbSu3B544IpZcuAXHO8OGNZSIuUxcywlmbZ41naAZIP13jBxDCGk37dVqtqtQ2xPOKQZeXvKTyh9pkdAPCbQlATdVMZcwv7p();
      if (var3 != null) {
         for (String var5 : var3.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()) {
            egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var6 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               var5
            );
            if (var6 != null && var6 != var1) {
               var6.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2);
            }
         }
      }
   }

   public void BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var1,
      WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var2
   ) {
      nkZ2LEdPKII0cv7VetNuVbL8COdy8CmUZo7KwtV7VZkEEe3RqCXmXMfHyitqZb01HIFR3w1WOgourQDDqGNkutCVZbryTQU0D3W6 var3 = var1.DjdSwbSu3B544IpZcuAXHO8OGNZSIuUxcywlmbZ41naAZIP13jBxDCGk37dVqtqtQ2xPOKQZeXvKTyh9pkdAPCbQlATdVMZcwv7p();
      if (var3 == null) {
         this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2);
      } else {
         for (int var4 = 0; var4 < this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9.size(); var4++) {
            egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var5 = (egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS)this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
               .get(var4);
            if (var5.DjdSwbSu3B544IpZcuAXHO8OGNZSIuUxcywlmbZ41naAZIP13jBxDCGk37dVqtqtQ2xPOKQZeXvKTyh9pkdAPCbQlATdVMZcwv7p() != var3) {
               var5.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2);
            }
         }
      }
   }

   public String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(boolean var1) {
      String var2 = "";
      ArrayList var3 = Lists.newArrayList(this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9);

      for (int var4 = 0; var4 < var3.size(); var4++) {
         if (var4 > 0) {
            var2 = var2 + ", ";
         }

         var2 = var2 + ((egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS)var3.get(var4)).C_();
         if (var1) {
            var2 = var2
               + " ("
               + ((egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS)var3.get(var4))
                  .syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB()
                  .toString()
               + ")";
         }
      }

      return var2;
   }

   public String[] QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0() {
      String[] var1 = new String[this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9.size()];

      for (int var2 = 0; var2 < this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9.size(); var2++) {
         var1[var2] = ((egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS)this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
               .get(var2))
            .C_();
      }

      return var1;
   }

   public GameProfile[] kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ() {
      GameProfile[] var1 = new GameProfile[this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9.size()];

      for (int var2 = 0; var2 < this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9.size(); var2++) {
         var1[var2] = ((egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS)this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
               .get(var2))
            .mRFNfHc3kblqdqWsLwzqRGIU02m0p9aXYDFmGNsAIxA7DlTNJQQ7y31t5ejW8Afe9z2InSkbKDnci9jD6eSnC1Tpsb6h3uVe4NBB();
      }

      return var1;
   }

   public IL2UTDNWUanExOapXazSGnDGxsF8fMQvkBKuxocrIISsux6Y5DBKve7gWvIvfjrBiOM0fIaMRZb14xXEyrFrx7IicwqxHyM0BSzI y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY() {
      return this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x;
   }

   public MuhQ3ofzEsGUkhssjOc0pR4F5CmsLjSdDXfF7huE4FJpM7znHyzCwppCFeTowiDrs8pre9nDG6d9waO3rR5h9CTRo1ArrxpP3lih sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9() {
      return this.uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk;
   }

   public void BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(GameProfile var1) {
      this.Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            new f95YjYzHBT7OhPsVTZ0C2NjlFiC1kIm2bzCS3mPvlgc5SeUYozUJjnj9a0XxYP5CcJdkfHr98FmcheWggMVL7tWRNx1EoLIlnNF7(
               var1,
               this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
                  .bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ(),
               this.Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ
                  .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1)
            )
         );
   }

   public void vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(GameProfile var1) {
      this.Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ
         .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var1);
   }

   public boolean PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(GameProfile var1) {
      return !this.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF
         || this.Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ
            .PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(var1)
         || this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
            .PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(var1);
   }

   public boolean uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(GameProfile var1) {
      return this.Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ
            .PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(var1)
         || this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
               .ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV()
            && this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u[0]
               .K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL()
               .zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t()
            && this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
               .ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu()
               .equalsIgnoreCase(var1.getName())
         || this.J1VLLIBCcZYqsaZhGKUiJoLcHFU1EJaCZvLl4QFMTqn7fzHDGkkCKNDFKU4XbeFyk8njwMcgfY6j93jLeZs8jAC6Xw2vjgswnn40;
   }

   public egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      String var1
   ) {
      for (egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var3 : this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9) {
         if (var3.C_().equalsIgnoreCase(var1)) {
            return var3;
         }
      }

      return null;
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      double var1,
      double var3,
      double var5,
      double var7,
      int var9,
      fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM var10
   ) {
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         (EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u)null, var1, var3, var5, var7, var9, var10
      );
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var1,
      double var2,
      double var4,
      double var6,
      double var8,
      int var10,
      fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM var11
   ) {
      for (int var12 = 0; var12 < this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9.size(); var12++) {
         egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var13 = (egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS)this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
            .get(var12);
         if (var13 != var1 && var13.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o == var10) {
            double var14 = var2 - var13.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8;
            double var16 = var4 - var13.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa;
            double var18 = var6 - var13.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4;
            if (var14 * var14 + var16 * var16 + var18 * var18 < var8 * var8) {
               var13.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
                  .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var11);
            }
         }
      }
   }

   public void lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ() {
      for (int var1 = 0; var1 < this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9.size(); var1++) {
         this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            (egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS)this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
               .get(var1)
         );
      }
   }

   public void QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0(GameProfile var1) {
      this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            new FPwOTHqpIFa0pOIUPKFBFMz8B8Q8lXryJPt2yK9FIb5Ok3mpAM5e3MIzKCoAev9t0CYHvEW5JKDkLaVRRirTs0NapwdXnSei6fHo(var1)
         );
   }

   public void kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ(GameProfile var1) {
      this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
         .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var1);
   }

   public IVs6B5tH6x0aYLTSiIvNS6sf1JmBfWBMenGQi9Uvlg7bystsTpueRfJulgVLScIWStEWxHe5kIvSl0aoOLiXyrgOlpi3WAJgO96N agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x() {
      return this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA;
   }

   public String[] uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk() {
      return this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
         .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW();
   }

   public NWlfKOxwaMTImXvxpKmdCljyflavCiujjkYFZAoXA5MRpHdeh3SsejvqHkP9vyCVHtwQ00XIkKNeu8OyZNjsQbcB0LRdgl6mKIHy Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ() {
      return this.Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ;
   }

   public String[] aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA() {
      return this.Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ
         .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW();
   }

   public void LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN() {
   }

   public void BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var1,
      hFZJAH3yIqfwCBV3b79FNqw6s6MptXUmJFkvggZ1hAcG7kdcmKvpDqxghz0xajK8jKFWyzGVF58QgJ3BGULiOg2PZcvuX82DqXK3 var2
   ) {
      iL9DMubSJAcTZxqaOwpybtlSRVLtmD9ZvxkTuVp126kpYWECDLGjfieR0jHXh8lhKYz1pOKOXVv54oy1hzwdxFmcVWt5UJgpSRT var3 = this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
            .PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u[0]
         .dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11();
      var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            new cSOL5Q5qkjmHoR0tAXKEJo1LcFCjxrYAfLgrN7Jrb0Y4BkIDe8egB1X430rCtzrFlWzseDTjLOJKwK1cfmvb7OC0RtvG8TrbWPW(
               var3,
               OoAOuWpaNMXDJn4JYCaCNAtSaWSPhARHIjMsJfe9ZoHkRn8wHCvH3rsOkXDEvR8Pw3RJr36LMBSlhm4EFM06InIj5yLEtfL8quwX.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u
            )
         );
      var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            new aiutL4S02sRQK8W7LwGYrDGp3rKgqqbZ0eIYEqC23nTKBUhRaejJhbs0ZaLsVpEPvUTqLGochNspzoJM52tsc0rQooZV860kju(
               var2.HEycvLXuxJtqnm1Q22Ov3jPFXiY9uV7PHxZL3mxyhegWr71nFjdNmThCqfwtAatIAo5zb7RQ0HbwXhvMNWmPD7lI7R6v8rrgROSU(),
               var2.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP(),
               var2.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr()
                  .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW("doDaylightCycle")
            )
         );
      if (var2.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb()) {
         var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               new KKTbr4YAhF6NEtr2T2tEBd2P57A9cMrzTyuEKN7rrA9Itc22BhNcwbXKTewsC3Y0ME7fHgaehWAJ7cVnV0jHDgTzfYyH34ej34Yb(1, 0.0F)
            );
         var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               new KKTbr4YAhF6NEtr2T2tEBd2P57A9cMrzTyuEKN7rrA9Itc22BhNcwbXKTewsC3Y0ME7fHgaehWAJ7cVnV0jHDgTzfYyH34ej34Yb(
                  7, var2.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ(1.0F)
               )
            );
         var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               new KKTbr4YAhF6NEtr2T2tEBd2P57A9cMrzTyuEKN7rrA9Itc22BhNcwbXKTewsC3Y0ME7fHgaehWAJ7cVnV0jHDgTzfYyH34ej34Yb(
                  8, var2.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY(1.0F)
               )
            );
      }
   }

   public void QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0(
      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var1
   ) {
      var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var1.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
      );
      var1.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8();
      var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            new SAdPij1hP2qghLmpYYFic71g5uXEJtfv6YfM09sZ8ref2svKY5K50bpcONfH4xzKCHmhpMp62lipiAlk5BlcTmfJT35T7S1VzgAA(
               var1.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
            )
         );
   }

   public int G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr() {
      return this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9.size();
   }

   public int iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF() {
      return this.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590;
   }

   public String[] bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ() {
      return this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u[0]
         .o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4()
         .uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590()
         .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW();
   }

   public void BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(boolean var1) {
      this.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF = var1;
   }

   public List BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(String var1) {
      ArrayList var2 = Lists.newArrayList();

      for (egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var4 : this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9) {
         if (var4.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL().equals(var1)) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public int RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB() {
      return this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ;
   }

   public TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5() {
      return this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY;
   }

   public YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW() {
      return null;
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      UE2PeEzLtwZJcfzzlceXydgXnldouotmhx7JTtb6WqAGU2xPCPSZgAOBNhie6Cs6Odaif0TEaKk2LwldBMtSoKHVJEQelXiXYBqc var1
   ) {
      this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB = var1;
   }

   private void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var1,
      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var2,
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var3
   ) {
      if (var2 != null) {
         var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               var2.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
                  .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
            );
      } else if (this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB != null) {
         var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB
            );
      }

      var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
         .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
            var3.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL()
               .iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF()
         );
   }

   public void vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(boolean var1) {
      this.J1VLLIBCcZYqsaZhGKUiJoLcHFU1EJaCZvLl4QFMTqn7fzHDGkkCKNDFKU4XbeFyk8njwMcgfY6j93jLeZs8jAC6Xw2vjgswnn40 = var1;
   }

   public void J1VLLIBCcZYqsaZhGKUiJoLcHFU1EJaCZvLl4QFMTqn7fzHDGkkCKNDFKU4XbeFyk8njwMcgfY6j93jLeZs8jAC6Xw2vjgswnn40() {
      for (int var1 = 0; var1 < this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9.size(); var1++) {
         ((egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS)this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
               .get(var1))
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I("Server closed");
      }
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var1, boolean var2
   ) {
      this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1);
      byte var3 = (byte)(var2 ? 1 : 0);
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         new vMsnOiJLKaMYXmT4GEfVE0YjeAkEqlisc9H6IDmZ4z8eFNqGWds3zgsvl13Neme3Q7OfAVdcjBkief6QxMeFMDYWDsuU2qVqmVIe(var1, var3)
      );
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var1
   ) {
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1, true);
   }

   public VdXRQj2pBYkYAVjy4IaWxt31U10xn4h7TcirTDjk7sHOD7vEvp9AgtdQRNxaWfkMT3oVryT9imgczBe5xzAkcg51coFDtSqioT3h Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var1
   ) {
      UUID var2 = var1.syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB();
      VdXRQj2pBYkYAVjy4IaWxt31U10xn4h7TcirTDjk7sHOD7vEvp9AgtdQRNxaWfkMT3oVryT9imgczBe5xzAkcg51coFDtSqioT3h var3 = var2 == null
         ? null
         : (VdXRQj2pBYkYAVjy4IaWxt31U10xn4h7TcirTDjk7sHOD7vEvp9AgtdQRNxaWfkMT3oVryT9imgczBe5xzAkcg51coFDtSqioT3h)this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
            .get(var2);
      if (var3 == null) {
         File var4 = new File(
            this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(0)
               .o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4()
               .QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0(),
            "stats"
         );
         File var5 = new File(var4, var2.toString() + ".json");
         if (!var5.exists()) {
            File var6 = new File(var4, var1.C_() + ".json");
            if (var6.exists() && var6.isFile()) {
               var6.renameTo(var5);
            }
         }

         var3 = new VdXRQj2pBYkYAVjy4IaWxt31U10xn4h7TcirTDjk7sHOD7vEvp9AgtdQRNxaWfkMT3oVryT9imgczBe5xzAkcg51coFDtSqioT3h(
            this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY, var5
         );
         var3.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
         this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN.put(var2, var3);
      }

      return var3;
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(int var1) {
      this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ = var1;
      if (this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u
         != null) {
         for (hFZJAH3yIqfwCBV3b79FNqw6s6MptXUmJFkvggZ1hAcG7kdcmKvpDqxghz0xajK8jKFWyzGVF58QgJ3BGULiOg2PZcvuX82DqXK3 var5 : this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
            .PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u) {
            if (var5 != null) {
               var5.SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj()
                  .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1);
            }
         }
      }
   }

   public List zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t() {
      return this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9;
   }

   public egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      UUID var1
   ) {
      return (egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS)this.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ
         .get(var1);
   }

   public boolean y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY(GameProfile var1) {
      return false;
   }
}
