import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class nzxNUl5fIZNnOGAQQfTu6s8WQmtIQTpjoTqq6Q6VSS75dM355jQpELlaiotDEsI2S54J0DUiXf5qpkaJEHkptZdt0hkTHiGEE0M {
   private static final Set BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = Sets.newHashSet(
      new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD[]{
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/water_flow"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/water_still"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/lava_flow"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/lava_still"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/destroy_stage_0"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/destroy_stage_1"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/destroy_stage_2"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/destroy_stage_3"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/destroy_stage_4"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/destroy_stage_5"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/destroy_stage_6"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/destroy_stage_7"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/destroy_stage_8"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/destroy_stage_9"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("items/empty_armor_slot_helmet"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("items/empty_armor_slot_chestplate"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("items/empty_armor_slot_leggings"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("items/empty_armor_slot_boots")
      }
   );
   private static final Logger vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5 = LogManager.getLogger();
   protected static final dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = new dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI(
      "builtin/missing", "missing"
   );
   private static final Map PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u = Maps.newHashMap();
   private static final Joiner uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590 = Joiner.on(" -> ");
   private final nLK7ggr72JCMQAkNhlEZI1loJkpbLeNtbvky2vwkTBBwzYOIDypvHnBT7HlGQKJlFC4smVv14MzvvHNuiQ2ntsWFYuxyYaPA3iI8 QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0;
   private final Map kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ = Maps.newHashMap();
   private final Map y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY = Maps.newLinkedHashMap();
   private final Map sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9 = Maps.newLinkedHashMap();
   private final seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ;
   private final net.minecraft.client.renderer.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9 agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x;
   private final rUj2pIufbwUN7G0b1guaQ9NFaOBlO2vI9BkgLMPtzKEF8H0OTLCvddOEHlWxRhto93PUjvgR1IN7iryQGQXgnc6nndMxjzYy0nEJ uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk = new rUj2pIufbwUN7G0b1guaQ9NFaOBlO2vI9BkgLMPtzKEF8H0OTLCvddOEHlWxRhto93PUjvgR1IN7iryQGQXgnc6nndMxjzYy0nEJ();
   private final LQyxdTfpxsy50G5YZRcbFZXUOP4CtFST3Jj0kedQtLCgeGPnOwlQYDXMz468iXU68yglK0h219WdznbpBbwNzDWWmCRawQLqcKtw Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ = new LQyxdTfpxsy50G5YZRcbFZXUOP4CtFST3Jj0kedQtLCgeGPnOwlQYDXMz468iXU68yglK0h219WdznbpBbwNzDWWmCRawQLqcKtw();
   private kIEmAXkGWrKa6WgAaD9RdUxNmBgFErVhqQxlhumSQcw69apmdFXdlXgb4cDsQ09Z872QbEqnhZQ8kH3N4EizIv89IiQWvxa1HJm3 aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = new kIEmAXkGWrKa6WgAaD9RdUxNmBgFErVhqQxlhumSQcw69apmdFXdlXgb4cDsQ09Z872QbEqnhZQ8kH3N4EizIv89IiQWvxa1HJm3();
   private static final arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN = arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      "{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}"
   );
   private static final arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr = arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      "{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}"
   );
   private static final arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF = arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      "{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}"
   );
   private static final arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ = arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      "{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}"
   );
   private Map RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB = Maps.newLinkedHashMap();
   private final Map J1VLLIBCcZYqsaZhGKUiJoLcHFU1EJaCZvLl4QFMTqn7fzHDGkkCKNDFKU4XbeFyk8njwMcgfY6j93jLeZs8jAC6Xw2vjgswnn40 = Maps.newHashMap();
   private Map zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t = Maps.newIdentityHashMap();

   public nzxNUl5fIZNnOGAQQfTu6s8WQmtIQTpjoTqq6Q6VSS75dM355jQpELlaiotDEsI2S54J0DUiXf5qpkaJEHkptZdt0hkTHiGEE0M(
      nLK7ggr72JCMQAkNhlEZI1loJkpbLeNtbvky2vwkTBBwzYOIDypvHnBT7HlGQKJlFC4smVv14MzvvHNuiQ2ntsWFYuxyYaPA3iI8 var1,
      seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs var2,
      net.minecraft.client.renderer.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9 var3
   ) {
      this.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0 = var1;
      this.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ = var2;
      this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x = var3;
   }

   public MIhWEF0Lmu8kDXveHvHNGS6xXNmLbQ5tjSM7NVwSiEnKHSAiP2xxi3lLXjXjqCrcMwicGQBy2oEg2vFgNCvcmVnOAd8JCgS95Gj Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I() {
      this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW();
      this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY();
      this.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ();
      this.uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk();
      this.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0();
      return this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA;
   }

   private void BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW() {
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
            .values()
      );
      this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
         .put(
            Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I,
            new L3ImoMdOhVpFPzo8eDStKvBALCrWZBJecSgI0e0960HNwnV8YlejO5PT78bpt8NXwAdN7PbMR9Yvmaf0cYa1kVi2t2LEqED3gZm2(
               Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(),
               Lists.newArrayList(
                  new lCdpQOIF3jvmVeAEx0SvyQ4xJcZ91eluCpbvhNBoYkOj3UTuN07aclHt47NFWOIT3sCDHsiIxWrDdaLClLAVIcxNObiwnrcjY3kA[]{
                     new lCdpQOIF3jvmVeAEx0SvyQ4xJcZ91eluCpbvhNBoYkOj3UTuN07aclHt47NFWOIT3sCDHsiIxWrDdaLClLAVIcxNObiwnrcjY3kA(
                        new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
                           Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
                        ),
                        AiUEuRfoUKx67rczH5DuXQgU5gndY0YCLglkoTdbPzsws79svyFJFQvcjsWn5yFBr5XMqNpJevZ5CwI4uep07DNLzilP7I7YOQgi.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I,
                        false,
                        1
                     )
                  }
               )
            )
         );
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1 = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
         "item_frame"
      );
      NHmY67TZ9yaidO2OYen7B10KFqW5CCCuxldmi7Q2qCKwFygbNVSigGKjNM9U3wasEED3XL6nHOe6jhnl8qXWriP6dicRcnYI5bc0 var2 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var1
      );
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var2, new dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI(var1, "normal")
      );
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var2, new dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI(var1, "map")
      );
      this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5();
      this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
   }

   private void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Collection var1) {
      for (dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI var3 : var1) {
         try {
            NHmY67TZ9yaidO2OYen7B10KFqW5CCCuxldmi7Q2qCKwFygbNVSigGKjNM9U3wasEED3XL6nHOe6jhnl8qXWriP6dicRcnYI5bc0 var4 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               var3
            );

            try {
               this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var4, var3);
            } catch (Exception var6) {
               vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5.warn(
                  "Unable to load variant: "
                     + var3.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
                     + " from "
                     + var3
               );
            }
         } catch (Exception var7) {
            vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5.warn("Unable to load definition " + var3, var7);
         }
      }
   }

   private void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      NHmY67TZ9yaidO2OYen7B10KFqW5CCCuxldmi7Q2qCKwFygbNVSigGKjNM9U3wasEED3XL6nHOe6jhnl8qXWriP6dicRcnYI5bc0 var1,
      dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI var2
   ) {
      this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
         .put(
            var2,
            var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               var2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
            )
         );
   }

   private NHmY67TZ9yaidO2OYen7B10KFqW5CCCuxldmi7Q2qCKwFygbNVSigGKjNM9U3wasEED3XL6nHOe6jhnl8qXWriP6dicRcnYI5bc0 Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1
   ) {
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var2 = this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
         var1
      );
      NHmY67TZ9yaidO2OYen7B10KFqW5CCCuxldmi7Q2qCKwFygbNVSigGKjNM9U3wasEED3XL6nHOe6jhnl8qXWriP6dicRcnYI5bc0 var3 = (NHmY67TZ9yaidO2OYen7B10KFqW5CCCuxldmi7Q2qCKwFygbNVSigGKjNM9U3wasEED3XL6nHOe6jhnl8qXWriP6dicRcnYI5bc0)this.J1VLLIBCcZYqsaZhGKUiJoLcHFU1EJaCZvLl4QFMTqn7fzHDGkkCKNDFKU4XbeFyk8njwMcgfY6j93jLeZs8jAC6Xw2vjgswnn40
         .get(var2);
      if (var3 == null) {
         ArrayList var4 = Lists.newArrayList();

         try {
            for (DSvwIKwrrGZ1BkBmKtrbfLE5EhjZsDw2g3BdecJEn9Ycnl7Em5YdmiYZ9kKzSqppkDW8RicbwBMVSDYtXdf0ODWZzkJjJivCWz7m var6 : this.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0
               .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var2)) {
               InputStream var7 = null;

               try {
                  var7 = var6.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW();
                  NHmY67TZ9yaidO2OYen7B10KFqW5CCCuxldmi7Q2qCKwFygbNVSigGKjNM9U3wasEED3XL6nHOe6jhnl8qXWriP6dicRcnYI5bc0 var8 = NHmY67TZ9yaidO2OYen7B10KFqW5CCCuxldmi7Q2qCKwFygbNVSigGKjNM9U3wasEED3XL6nHOe6jhnl8qXWriP6dicRcnYI5bc0.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     new InputStreamReader(var7, Charsets.UTF_8)
                  );
                  var4.add(var8);
               } catch (Exception var13) {
                  throw new RuntimeException(
                     "Encountered an exception when loading model definition of '"
                        + var1
                        + "' from: '"
                        + var6.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
                        + "' in resourcepack: '"
                        + var6.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()
                        + "'",
                     var13
                  );
               } finally {
                  IOUtils.closeQuietly(var7);
               }
            }
         } catch (IOException var15) {
            throw new RuntimeException("Encountered an exception when loading model definition of model " + var2.toString(), var15);
         }

         var3 = new NHmY67TZ9yaidO2OYen7B10KFqW5CCCuxldmi7Q2qCKwFygbNVSigGKjNM9U3wasEED3XL6nHOe6jhnl8qXWriP6dicRcnYI5bc0(var4);
         this.J1VLLIBCcZYqsaZhGKUiJoLcHFU1EJaCZvLl4QFMTqn7fzHDGkkCKNDFKU4XbeFyk8njwMcgfY6j93jLeZs8jAC6Xw2vjgswnn40.put(var2, var3);
      }

      return var3;
   }

   private p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1
   ) {
      return new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
         var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(),
         "blockstates/" + var1.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW() + ".json"
      );
   }

   private void vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5() {
      for (dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI var2 : this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
         .keySet()) {
         for (lCdpQOIF3jvmVeAEx0SvyQ4xJcZ91eluCpbvhNBoYkOj3UTuN07aclHt47NFWOIT3sCDHsiIxWrDdaLClLAVIcxNObiwnrcjY3kA var4 : ((L3ImoMdOhVpFPzo8eDStKvBALCrWZBJecSgI0e0960HNwnV8YlejO5PT78bpt8NXwAdN7PbMR9Yvmaf0cYa1kVi2t2LEqED3gZm2)this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
               .get(var2))
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()) {
            p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var5 = var4.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
            if (this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY.get(var5) == null) {
               try {
                  arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var6 = this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
                     var5
                  );
                  this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY.put(var5, var6);
               } catch (Exception var7) {
                  vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5.warn(
                     "Unable to load block model: '" + var5 + "' for variant: '" + var2 + "'", var7
                  );
               }
            }
         }
      }
   }

   private arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1
   ) {
      String var2 = var1.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW();
      if ("builtin/generated".equals(var2)) {
         return LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN;
      }

      if ("builtin/compass".equals(var2)) {
         return G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr;
      }

      if ("builtin/clock".equals(var2)) {
         return iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF;
      }

      if ("builtin/entity".equals(var2)) {
         return bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ;
      }

      Reader var3;
      if (var2.startsWith("builtin/")) {
         String var4 = var2.substring("builtin/".length());
         String var5 = (String)PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u.get(var4);
         if (var5 == null) {
            throw new FileNotFoundException(var1.toString());
         }

         var3 = new StringReader(var5);
      } else {
         DSvwIKwrrGZ1BkBmKtrbfLE5EhjZsDw2g3BdecJEn9Ycnl7Em5YdmiYZ9kKzSqppkDW8RicbwBMVSDYtXdf0ODWZzkJjJivCWz7m var9 = this.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(var1)
            );
         var3 = new InputStreamReader(
            var9.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(), Charsets.UTF_8
         );
      }

      arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var10;
      try {
         arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var11 = arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var3
         );
         var11.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = var1.toString();
         var10 = var11;
      } finally {
         var3.close();
      }

      return var10;
   }

   private p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1
   ) {
      return new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
         var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(),
         "models/" + var1.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW() + ".json"
      );
   }

   private void PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u() {
      this.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590();

      for (q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2 var2 : q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I) {
         for (String var4 : this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2)) {
            p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var5 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               var4
            );
            this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB.put(var4, var5);
            if (this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY.get(var5) == null) {
               try {
                  arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var6 = this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
                     var5
                  );
                  this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY.put(var5, var6);
               } catch (Exception var7) {
                  vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5.warn(
                     "Unable to load item model: '"
                        + var5
                        + "' for item: '"
                        + q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
                           .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var2)
                        + "'",
                     var7
                  );
               }
            }
         }
      }
   }

   private void uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590() {
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW
            ),
            Lists.newArrayList(new String[]{"stone", "granite", "granite_smooth", "diorite", "diorite_smooth", "andesite", "andesite_smooth"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u
            ),
            Lists.newArrayList(new String[]{"dirt", "coarse_dirt", "podzol"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0
            ),
            Lists.newArrayList(new String[]{"oak_planks", "spruce_planks", "birch_planks", "jungle_planks", "acacia_planks", "dark_oak_planks"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ
            ),
            Lists.newArrayList(new String[]{"oak_sapling", "spruce_sapling", "birch_sapling", "jungle_sapling", "acacia_sapling", "dark_oak_sapling"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ
            ),
            Lists.newArrayList(new String[]{"sand", "red_sand"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ
            ),
            Lists.newArrayList(new String[]{"oak_log", "spruce_log", "birch_log", "jungle_log"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.J1VLLIBCcZYqsaZhGKUiJoLcHFU1EJaCZvLl4QFMTqn7fzHDGkkCKNDFKU4XbeFyk8njwMcgfY6j93jLeZs8jAC6Xw2vjgswnn40
            ),
            Lists.newArrayList(new String[]{"oak_leaves", "spruce_leaves", "birch_leaves", "jungle_leaves"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
            ),
            Lists.newArrayList(new String[]{"sponge", "sponge_wet"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
            ),
            Lists.newArrayList(new String[]{"sandstone", "chiseled_sandstone", "smooth_sandstone"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.rh7QDOSFg05fyydW5Gz5bwQnsrzM4KKmWUYAblghq24rfoLdGbX36bDfT2c90YOYYsaUm5iZJUPvplKrZ9BWqLfVdpJy4eWDaPHB
            ),
            Lists.newArrayList(new String[]{"red_sandstone", "chiseled_red_sandstone", "smooth_red_sandstone"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb
            ),
            Lists.newArrayList(new String[]{"dead_bush", "tall_grass", "fern"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee
            ),
            Lists.newArrayList(new String[]{"dead_bush"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj
            ),
            Lists.newArrayList(
               new String[]{
                  "black_wool",
                  "red_wool",
                  "green_wool",
                  "brown_wool",
                  "blue_wool",
                  "purple_wool",
                  "cyan_wool",
                  "silver_wool",
                  "gray_wool",
                  "pink_wool",
                  "lime_wool",
                  "yellow_wool",
                  "light_blue_wool",
                  "magenta_wool",
                  "orange_wool",
                  "white_wool"
               }
            )
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o
            ),
            Lists.newArrayList(new String[]{"dandelion"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt
            ),
            Lists.newArrayList(
               new String[]{"poppy", "blue_orchid", "allium", "houstonia", "red_tulip", "orange_tulip", "white_tulip", "pink_tulip", "oxeye_daisy"}
            )
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.lXnIKHX4LL4UVZqpHxViO6OjyXkTlTDY0epCVxu6ttLtuKke8pmpW0wcG0kcTCIzpgn9rnvQu9HzpRoIlINbDt0LmkQkzj7PO192
            ),
            Lists.newArrayList(
               new String[]{"stone_slab", "sandstone_slab", "cobblestone_slab", "brick_slab", "stone_brick_slab", "nether_brick_slab", "quartz_slab"}
            )
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.DaGs7jfRV6yB84LcCwIMMaZ5ZL0gmDAndQH71Jj593tqqmFJ2w0ynJ5BPu3ziTWmZC19w2LyhcJLwS5nlpmF10gXEuKOVhyZWB2
            ),
            Lists.newArrayList(new String[]{"red_sandstone_slab"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.MykRe6qTpuK4jON2utrfM6s84uSojw5EnqRTkG0BoUd3ijtw5q6TCFcB51VRt26zQNVEf2GBgaQ67gOT7WMdbTbTLkZsLZpyfudM
            ),
            Lists.newArrayList(
               new String[]{
                  "black_stained_glass",
                  "red_stained_glass",
                  "green_stained_glass",
                  "brown_stained_glass",
                  "blue_stained_glass",
                  "purple_stained_glass",
                  "cyan_stained_glass",
                  "silver_stained_glass",
                  "gray_stained_glass",
                  "pink_stained_glass",
                  "lime_stained_glass",
                  "yellow_stained_glass",
                  "light_blue_stained_glass",
                  "magenta_stained_glass",
                  "orange_stained_glass",
                  "white_stained_glass"
               }
            )
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.LTQwE0DrNKFDjmvx0fe8LpzggEMbyrNsjGxF9MSkTuiCRDJkRIuJ7MTRryUkPshBnTbPg4NTBAjHSn2k3rTwfLgb6HE9s7OE5rZP
            ),
            Lists.newArrayList(
               new String[]{
                  "stone_monster_egg",
                  "cobblestone_monster_egg",
                  "stone_brick_monster_egg",
                  "mossy_brick_monster_egg",
                  "cracked_brick_monster_egg",
                  "chiseled_brick_monster_egg"
               }
            )
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.PHC3PfXHfxNGhxr8qlmbwBgtFDAWis9MAjn8V7e7oXLSmezow4dZwTzrRYSwXzSWMtUii0JBu08E1JkvATKm8VH3vWAEeRNxaDVG
            ),
            Lists.newArrayList(new String[]{"stonebrick", "mossy_stonebrick", "cracked_stonebrick", "chiseled_stonebrick"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.s857KWyIDojH7xVL6faaCWAtRKSQY0DoYMS6voW8nIorimo6R2cstMCxoXgTjzjSuep34Kboj3ZGRJrLRjMaHCMtoH5RHXSI2Htj
            ),
            Lists.newArrayList(new String[]{"oak_slab", "spruce_slab", "birch_slab", "jungle_slab", "acacia_slab", "dark_oak_slab"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.Z8zyajFHGKd16lbI3cME4a5v6Xk8mrrhC7wUevpdvWivCblw1ULgEU8julxgqWsfC33PgtAA6DuofRNn5iXQ13jfeZIvhLDoNEuv
            ),
            Lists.newArrayList(new String[]{"cobblestone_wall", "mossy_cobblestone_wall"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.spKz6Mi5xqQI6JvJCkVWBVyFUEf6R5VQYuAh8hN67QteSi5fGxq3k4GLUhcuUlkhIJphTtNmIIHDnYmmH1hWP7Wq8qe3nIUNGzJv
            ),
            Lists.newArrayList(new String[]{"anvil_intact", "anvil_slightly_damaged", "anvil_very_damaged"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.WZYwnEmMeJly4ZCK06YCG4FOYNhwxSHZKxZk2vu44J3hxMriq3YGZi5vzBZKAACP45lDwpt4is0m69vMkOJuVa8TGSWlkNnj1AFd
            ),
            Lists.newArrayList(new String[]{"quartz_block", "chiseled_quartz_block", "quartz_column"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.vi6ZoxPFtBAYfPzYPuP5xJvSB09JzfFrtyDr1gVxTJ4bZ46hsVZLuUedPuVtDM4vqDigpJsouFBiNufhwqZU7X4t5siQEO3kPYSh
            ),
            Lists.newArrayList(
               new String[]{
                  "black_stained_hardened_clay",
                  "red_stained_hardened_clay",
                  "green_stained_hardened_clay",
                  "brown_stained_hardened_clay",
                  "blue_stained_hardened_clay",
                  "purple_stained_hardened_clay",
                  "cyan_stained_hardened_clay",
                  "silver_stained_hardened_clay",
                  "gray_stained_hardened_clay",
                  "pink_stained_hardened_clay",
                  "lime_stained_hardened_clay",
                  "yellow_stained_hardened_clay",
                  "light_blue_stained_hardened_clay",
                  "magenta_stained_hardened_clay",
                  "orange_stained_hardened_clay",
                  "white_stained_hardened_clay"
               }
            )
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.lnzPjQSErJQ4iahgz4RPvwCjSQw60dL384yvifbAEFLyFvKk2HAFMhMT3ZEmtWJQTHJIhG5hUr59C5xnyML45Iuozv3fvU0ZCxIZ
            ),
            Lists.newArrayList(
               new String[]{
                  "black_stained_glass_pane",
                  "red_stained_glass_pane",
                  "green_stained_glass_pane",
                  "brown_stained_glass_pane",
                  "blue_stained_glass_pane",
                  "purple_stained_glass_pane",
                  "cyan_stained_glass_pane",
                  "silver_stained_glass_pane",
                  "gray_stained_glass_pane",
                  "pink_stained_glass_pane",
                  "lime_stained_glass_pane",
                  "yellow_stained_glass_pane",
                  "light_blue_stained_glass_pane",
                  "magenta_stained_glass_pane",
                  "orange_stained_glass_pane",
                  "white_stained_glass_pane"
               }
            )
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
            ),
            Lists.newArrayList(new String[]{"acacia_leaves", "dark_oak_leaves"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB
            ),
            Lists.newArrayList(new String[]{"acacia_log", "dark_oak_log"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.b4KmEzzl9MbF4jUAb2Z6l6JN0EIRbzQEPFWtSCAK3QmiDn7JtHvMDeGyGrqfrfZvyiYdmDdusyY6zPQh7jyEAD0dE169gAbeU5FT
            ),
            Lists.newArrayList(new String[]{"prismarine", "prismarine_bricks", "dark_prismarine"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.FOJK2onwcI9NcuZ3vd3WlIO6WDdoPP0P8hYkyc9ERGcQGDV9qk2HYFJdZuJYOlBz0qJlbZ28LqXqQbNVnDuyqm75bQqfYbWCO4oJ
            ),
            Lists.newArrayList(
               new String[]{
                  "black_carpet",
                  "red_carpet",
                  "green_carpet",
                  "brown_carpet",
                  "blue_carpet",
                  "purple_carpet",
                  "cyan_carpet",
                  "silver_carpet",
                  "gray_carpet",
                  "pink_carpet",
                  "lime_carpet",
                  "yellow_carpet",
                  "light_blue_carpet",
                  "magenta_carpet",
                  "orange_carpet",
                  "white_carpet"
               }
            )
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.ZBg3eOo6s8AWIxitZfOJ3Z1qMA6la1qc6Ei6eXBO1d4aTj3nMc13WCzbjLNMZp0Pr4wsuCTUY8VIfNLvAvDaGAvn5TlwSAotOF13
            ),
            Lists.newArrayList(new String[]{"sunflower", "syringa", "double_grass", "double_fern", "double_rose", "paeonia"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0,
            Lists.newArrayList(new String[]{"bow", "bow_pulling_0", "bow_pulling_1", "bow_pulling_2"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY,
            Lists.newArrayList(new String[]{"coal", "charcoal"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.MWJ5r0gWxnrbQRERdHbEQ5btSE0IJdkSsk2GnILdqWqHlkelEHOvMcIsZmqRcrfRhRPSkf9W8NYEpkpnCZbZuQADYJQ7o4DriIXN,
            Lists.newArrayList(new String[]{"fishing_rod", "fishing_rod_cast"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68,
            Lists.newArrayList(new String[]{"cod", "salmon", "clownfish", "pufferfish"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.hSMlYe7503LeA7CbbVALz1jC9M8HB8zgNQY4LHkAnfyLgjvXzBsumpLcUY5Rcsl1recYw4lCY6oIVOA5xVfKlGQzbM1m6WJ9Zuae,
            Lists.newArrayList(new String[]{"cooked_cod", "cooked_salmon"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.A9tYVs0tKN6mpnVVz6eiPoVfhvRx7x9U01ako5iiwg5MLVmY1KT6hRAMFXDOvejzhT51PyqZxfcjNrNnDF6aAbbO0ugM7CbXcdvX,
            Lists.newArrayList(
               new String[]{
                  "dye_black",
                  "dye_red",
                  "dye_green",
                  "dye_brown",
                  "dye_blue",
                  "dye_purple",
                  "dye_cyan",
                  "dye_silver",
                  "dye_gray",
                  "dye_pink",
                  "dye_lime",
                  "dye_yellow",
                  "dye_light_blue",
                  "dye_magenta",
                  "dye_orange",
                  "dye_white"
               }
            )
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.kzTirpjGBxF6lMXnU3OtSQut8uc2l77qvnA8ubdIFDZhFGEdeA5pNXRls2AFRAdjJOPlXmmIolAi7gqMVppUpc9wEXGNY3nXOehO,
            Lists.newArrayList(new String[]{"bottle_drinkable", "bottle_splash"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.Y2eSY64r61E45dd0u1KEApLKH5W0lfB2BwtaVU9ZonTT3MG9EtFGOEc3PfdOwYRxX6ZefazMMcbCcmxhovFzfRUIyMDbN7xU1Z,
            Lists.newArrayList(new String[]{"skull_skeleton", "skull_wither", "skull_zombie", "skull_char", "skull_creeper"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.KDe6INcxEYKNrZGHvl1lDGLTayJSHG1iAclQNWn4siLuw53uoVA0OEJ01AARm9IeLGQsuTLpBsBl2kdDJyJ4vLBtamTw5iBfwM7
            ),
            Lists.newArrayList(new String[]{"oak_fence_gate"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.tRQaYXSNntij6PV4DcSlupxEkxcVsOBLXFv4nOK3Ol9pSA4cNxTlBkPP8sq20V2QKgHsBqlNwlCA2DuXXPBdDvFX73z7oxq5m5m5
            ),
            Lists.newArrayList(new String[]{"oak_fence"})
         );
      this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t
         .put(
            PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.AhJmxLgoYUHtXqEsXuAO10GGPI1adOTRWWQW3c9ENa2fWdAVPasdqyNzQGetsLHGzC9GIpZXvmI22tJBxqoZw7u1SGfguYwRKd0I,
            Lists.newArrayList(new String[]{"oak_door"})
         );
   }

   private List Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2 var1
   ) {
      List var2 = (List)this.zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t.get(var1);
      if (var2 == null) {
         var2 = Collections.singletonList(
            ((p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD)q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
                  .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var1))
               .toString()
         );
      }

      return var2;
   }

   private p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      String var1
   ) {
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var2 = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
         var1
      );
      return new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
         var2.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(),
         "item/" + var2.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
      );
   }

   private void QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0() {
      for (dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI var2 : this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
         .keySet()) {
         oMAThCBReleWgnSq98Gc5IaGhSfLUGHE2wXPR2FqLhhJNE5mDIQFpUeCFZxdKoNRChSVpeCQWDo9ittbkWvlyQwOWVFUKZy7aM3V var3 = new oMAThCBReleWgnSq98Gc5IaGhSfLUGHE2wXPR2FqLhhJNE5mDIQFpUeCFZxdKoNRChSVpeCQWDo9ittbkWvlyQwOWVFUKZy7aM3V();
         int var4 = 0;

         for (lCdpQOIF3jvmVeAEx0SvyQ4xJcZ91eluCpbvhNBoYkOj3UTuN07aclHt47NFWOIT3sCDHsiIxWrDdaLClLAVIcxNObiwnrcjY3kA var6 : ((L3ImoMdOhVpFPzo8eDStKvBALCrWZBJecSgI0e0960HNwnV8YlejO5PT78bpt8NXwAdN7PbMR9Yvmaf0cYa1kVi2t2LEqED3gZm2)this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
               .get(var2))
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()) {
            arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var7 = (arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir)this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
               .get(var6.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I());
            if (var7 != null && var7.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()) {
               var4++;
               var3.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     var7,
                     var6.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(),
                     var6.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()
                  ),
                  var6.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()
               );
            } else {
               vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5.warn("Missing model for: " + var2);
            }
         }

         if (var4 == 0) {
            vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5.warn("No weighted models for: " + var2);
         } else if (var4 == 1) {
            this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var2, var3.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
               );
         } else {
            this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var2, var3.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
               );
         }
      }

      for (Entry var9 : this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB.entrySet()) {
         p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var10 = (p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD)var9.getValue();
         dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI var11 = new dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI(
            (String)var9.getKey(), "inventory"
         );
         arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var12 = (arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir)this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
            .get(var10);
         if (var12 == null || !var12.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()) {
            vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5.warn("Missing model for: " + var10);
         } else if (this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(var12)) {
            this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var11,
                  new Cocf3krpTwowJzCApOnPBlaMM5RS5PhQs10CQcGqZH9vGUFDvVtOIfRShT2LR9vnnwK4mMaQ5kxRfubmLMUK8myLFNj5AlN8vPBP(
                     var12.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ()
                  )
               );
         } else {
            this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var11,
                  this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     var12,
                     AiUEuRfoUKx67rczH5DuXQgU5gndY0YCLglkoTdbPzsws79svyFJFQvcjsWn5yFBr5XMqNpJevZ5CwI4uep07DNLzilP7I7YOQgi.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I,
                     false
                  )
               );
         }
      }
   }

   private Set kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ() {
      HashSet var1 = Sets.newHashSet();
      ArrayList var2 = Lists.newArrayList(this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9.keySet());
      Collections.sort(var2, new UkzrFgmhB6R9lxxikJmV6kePIJvvr4f570r3n0JNf0dLmM9SxDHyTltR2RwXtwr6ezu8SJtHeEaoz7iPFZNTnnRqYmvSwAFh8LK1(this));

      for (dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI var4 : var2) {
         L3ImoMdOhVpFPzo8eDStKvBALCrWZBJecSgI0e0960HNwnV8YlejO5PT78bpt8NXwAdN7PbMR9Yvmaf0cYa1kVi2t2LEqED3gZm2 var5 = (L3ImoMdOhVpFPzo8eDStKvBALCrWZBJecSgI0e0960HNwnV8YlejO5PT78bpt8NXwAdN7PbMR9Yvmaf0cYa1kVi2t2LEqED3gZm2)this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
            .get(var4);

         for (lCdpQOIF3jvmVeAEx0SvyQ4xJcZ91eluCpbvhNBoYkOj3UTuN07aclHt47NFWOIT3sCDHsiIxWrDdaLClLAVIcxNObiwnrcjY3kA var7 : var5.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()) {
            arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var8 = (arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir)this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
               .get(var7.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I());
            if (var8 == null) {
               vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5.warn("Missing model for: " + var4);
            } else {
               var1.addAll(this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var8));
            }
         }
      }

      var1.addAll(BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW);
      return var1;
   }

   private jvIJM9vM80hBbNUlysk0Wp04jlfKkYwMZ0GeUi2djv2tvIrUEMMzWpOzBzGHTUa8NB1SsXXVQL4Uzk5XcUVMYFxH4zRLJmtPMAjv Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var1,
      AiUEuRfoUKx67rczH5DuXQgU5gndY0YCLglkoTdbPzsws79svyFJFQvcjsWn5yFBr5XMqNpJevZ5CwI4uep07DNLzilP7I7YOQgi var2,
      boolean var3
   ) {
      NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD var4 = (NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD)this.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ
         .get(
            new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
               var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5("particle")
            )
         );
      HTP6SoUdyppZR22lgFUKo9QPBxAZMMdVhK8iZjUZIxhNyi6YA6yQF3a6mrQJZZxmvNmb7JRkjDkDi4tdXiy4p52MwOVf4cly1oBm var5 = new HTP6SoUdyppZR22lgFUKo9QPBxAZMMdVhK8iZjUZIxhNyi6YA6yQF3a6mrQJZZxmvNmb7JRkjDkDi4tdXiy4p52MwOVf4cly1oBm(
            var1
         )
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var4);

      for (aYRi21YNpTmxaDUuHMqczMc6UGQr7kkknFfOueaoAgH0SGLM1lT7ofBbs8LfxQrqmB1u2rjjiZE6ZMVizHQzJ51GvCkdYjR9LWLM var7 : var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()) {
         for (NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var9 : var7.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
            .keySet()) {
            q1yjJRUICkA9ePz2QIcXFQwi7yA5av6bI7ToQAngVMcAShJkfUYll7DwFOPB2HoDWQ0R1UjypmRd20s8U1QfGf0mJvEJRaqZH5z3 var10 = (q1yjJRUICkA9ePz2QIcXFQwi7yA5av6bI7ToQAngVMcAShJkfUYll7DwFOPB2HoDWQ0R1UjypmRd20s8U1QfGf0mJvEJRaqZH5z3)var7.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
               .get(var9);
            NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD var11 = (NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD)this.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ
               .get(
                  new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
                     var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
                        var10.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u
                     )
                  )
               );
            if (var10.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW == null) {
               var5.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     var7, var10, var11, var9, var2, var3
                  )
               );
            } else {
               var5.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     var10.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW
                  ),
                  this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     var7, var10, var11, var9, var2, var3
                  )
               );
            }
         }
      }

      return var5.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
   }

   private AyN6yj2ttkv5bCiwav1cDlfG2l1QAUn5cKfRDW5YGccZDGWSMZGld5i4NDzMSCGvNHOn7IwIbkQ9ybWbfHV4VIzrOh6oQy2as5Rk Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      aYRi21YNpTmxaDUuHMqczMc6UGQr7kkknFfOueaoAgH0SGLM1lT7ofBbs8LfxQrqmB1u2rjjiZE6ZMVizHQzJ51GvCkdYjR9LWLM var1,
      q1yjJRUICkA9ePz2QIcXFQwi7yA5av6bI7ToQAngVMcAShJkfUYll7DwFOPB2HoDWQ0R1UjypmRd20s8U1QfGf0mJvEJRaqZH5z3 var2,
      NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD var3,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var4,
      AiUEuRfoUKx67rczH5DuXQgU5gndY0YCLglkoTdbPzsws79svyFJFQvcjsWn5yFBr5XMqNpJevZ5CwI4uep07DNLzilP7I7YOQgi var5,
      boolean var6
   ) {
      return this.uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I,
            var1.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW,
            var2,
            var3,
            var4,
            var5,
            var1.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u,
            var6,
            var1.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590
         );
   }

   private void y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY() {
      this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9();

      for (arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var2 : this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
         .values()) {
         var2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
         );
      }

      arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
         this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
      );
   }

   private void sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9() {
      ArrayDeque var1 = Queues.newArrayDeque();
      HashSet var2 = Sets.newHashSet();

      for (p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var4 : this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
         .keySet()) {
         var2.add(var4);
         p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var5 = ((arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir)this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
               .get(var4))
            .uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590();
         if (var5 != null) {
            var1.add(var5);
         }
      }

      while (!var1.isEmpty()) {
         p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var7 = (p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD)var1.pop();

         try {
            if (this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY.get(var7) != null) {
               continue;
            }

            arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var8 = this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
               var7
            );
            this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY.put(var7, var8);
            p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var9 = var8.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590();
            if (var9 != null && !var2.contains(var9)) {
               var1.add(var9);
            }
         } catch (Exception var6) {
            vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5.warn(
               "In parent chain: "
                  + uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590.join(
                     this.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(var7)
                  )
                  + "; unable to load model: '"
                  + var7
                  + "'",
               var6
            );
         }

         var2.add(var7);
      }
   }

   private List uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1
   ) {
      ArrayList var2 = Lists.newArrayList(new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD[]{var1});
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var3 = var1;

      while ((var3 = this.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0(var3)) != null) {
         var2.add(0, var3);
      }

      return var2;
   }

   private p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1
   ) {
      for (Entry var3 : this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY.entrySet()) {
         arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var4 = (arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir)var3.getValue();
         if (var4 != null && var1.equals(var4.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590())) {
            return (p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD)var3.getKey();
         }
      }

      return null;
   }

   private Set Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var1
   ) {
      HashSet var2 = Sets.newHashSet();

      for (aYRi21YNpTmxaDUuHMqczMc6UGQr7kkknFfOueaoAgH0SGLM1lT7ofBbs8LfxQrqmB1u2rjjiZE6ZMVizHQzJ51GvCkdYjR9LWLM var4 : var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()) {
         for (q1yjJRUICkA9ePz2QIcXFQwi7yA5av6bI7ToQAngVMcAShJkfUYll7DwFOPB2HoDWQ0R1UjypmRd20s8U1QfGf0mJvEJRaqZH5z3 var6 : var4.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
            .values()) {
            p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var7 = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
               var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
                  var6.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u
               )
            );
            var2.add(var7);
         }
      }

      var2.add(
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
            var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5("particle")
         )
      );
      return var2;
   }

   private void lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ() {
      Set var1 = this.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ();
      var1.addAll(this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x());
      var1.remove(
         seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
      );
      PagMBzfJAjvktuSRL9gc0ico2hJio6BOuzKeoYtPKyTMENv7Hpl31s8hEYNnUx7BWkd8Vumub7miAFNpQKE1QwqVFQIxXRwpAdsg var2 = new PagMBzfJAjvktuSRL9gc0ico2hJio6BOuzKeoYtPKyTMENv7Hpl31s8hEYNnUx7BWkd8Vumub7miAFNpQKE1QwqVFQIxXRwpAdsg(
         this, var1
      );
      this.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            this.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0, var2
         );
      this.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ
         .put(
            new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("missingno"),
            this.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ
               .kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ()
         );
   }

   private Set agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x() {
      HashSet var1 = Sets.newHashSet();

      for (p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var3 : this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB
         .values()) {
         arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var4 = (arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir)this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
            .get(var3);
         if (var4 != null) {
            var1.add(
               new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
                  var4.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5("particle")
               )
            );
            if (this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var4)) {
               for (String var11 : LQyxdTfpxsy50G5YZRcbFZXUOP4CtFST3Jj0kedQtLCgeGPnOwlQYDXMz468iXU68yglK0h219WdznbpBbwNzDWWmCRawQLqcKtw.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I) {
                  p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var12 = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
                     var4.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(var11)
                  );
                  if (var4.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0()
                        == G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                     && !seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
                        .equals(var12)) {
                     NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
                        var12.toString()
                     );
                  } else if (var4.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0()
                        == iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF
                     && !seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
                        .equals(var12)) {
                     NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var12.toString()
                     );
                  }

                  var1.add(var12);
               }
            } else if (!this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(var4)) {
               for (aYRi21YNpTmxaDUuHMqczMc6UGQr7kkknFfOueaoAgH0SGLM1lT7ofBbs8LfxQrqmB1u2rjjiZE6ZMVizHQzJ51GvCkdYjR9LWLM var6 : var4.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()) {
                  for (q1yjJRUICkA9ePz2QIcXFQwi7yA5av6bI7ToQAngVMcAShJkfUYll7DwFOPB2HoDWQ0R1UjypmRd20s8U1QfGf0mJvEJRaqZH5z3 var8 : var6.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
                     .values()) {
                     p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var9 = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
                        var4.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
                           var8.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u
                        )
                     );
                     var1.add(var9);
                  }
               }
            }
         }
      }

      return var1;
   }

   private boolean BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
      arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var1
   ) {
      if (var1 == null) {
         return false;
      }

      arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var2 = var1.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0();
      return var2 == LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
         || var2 == G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
         || var2 == iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF;
   }

   private boolean vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
      arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var1
   ) {
      if (var1 == null) {
         return false;
      }

      arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var2 = var1.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0();
      return var2 == bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ;
   }

   private void uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk() {
      for (p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var2 : this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB
         .values()) {
         arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var3 = (arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir)this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
            .get(var2);
         if (this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var3)) {
            arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var4 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(
               var3
            );
            if (var4 != null) {
               var4.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = var2.toString();
            }

            this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY.put(var2, var4);
         } else if (this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(var3)) {
            this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY.put(var2, var3);
         }
      }

      for (NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD var6 : this.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ
         .values()) {
         if (!var6.Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ()) {
            var6.uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk();
         }
      }
   }

   private arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(
      arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var1
   ) {
      return this.Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            this.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ, var1
         );
   }

   static {
      PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u.put(
         "missing",
         "{ \"textures\": {   \"particle\": \"missingno\",   \"missingno\": \"missingno\"}, \"elements\": [ {     \"from\": [ 0, 0, 0 ],     \"to\": [ 16, 16, 16 ],     \"faces\": {         \"down\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"down\", \"texture\": \"#missingno\" },         \"up\":    { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"up\", \"texture\": \"#missingno\" },         \"north\": { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"north\", \"texture\": \"#missingno\" },         \"south\": { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"south\", \"texture\": \"#missingno\" },         \"west\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"west\", \"texture\": \"#missingno\" },         \"east\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"east\", \"texture\": \"#missingno\" }    }}]}"
      );
      LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = "generation marker";
      G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = "compass generation marker";
      iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = "class generation marker";
      bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = "block entity marker";
   }
}
