public enum sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr
   implements EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj {
   Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I,
   BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW,
   vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5,
   PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u,
   uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590,
   QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0;

   sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr() {
   }

   static String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(String var0, String var1) {
      StringBuilder var2 = new StringBuilder();
      int var3 = 0;

      for (int var4 = var0.length(); var3 < var4; var3++) {
         char var5 = var0.charAt(var3);
         if (Character.isUpperCase(var5) && var2.length() != 0) {
            var2.append(var1);
         }

         var2.append(var5);
      }

      return var2.toString();
   }

   static String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(String var0) {
      int var1 = 0;
      int var2 = var0.length() - 1;

      while (!Character.isLetter(var0.charAt(var1)) && var1 < var2) {
         var1++;
      }

      char var3 = var0.charAt(var1);
      if (Character.isUpperCase(var3)) {
         return var0;
      }

      char var4 = Character.toUpperCase(var3);
      return var1 == 0 ? var4 + var0.substring(1) : var0.substring(0, var1) + var4 + var0.substring(var1 + 1);
   }
}
