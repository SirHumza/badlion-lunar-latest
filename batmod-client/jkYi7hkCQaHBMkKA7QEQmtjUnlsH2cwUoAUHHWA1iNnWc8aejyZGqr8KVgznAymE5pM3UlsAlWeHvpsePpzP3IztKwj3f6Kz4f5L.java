import java.util.Random;

public class jkYi7hkCQaHBMkKA7QEQmtjUnlsH2cwUoAUHHWA1iNnWc8aejyZGqr8KVgznAymE5pM3UlsAlWeHvpsePpzP3IztKwj3f6Kz4f5L {
   protected int BatModClient = 8;
   protected Random Button = new Random();
   protected xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY CustomSpinner;

   public void BatModClient(
      bAva0O5lvjKFS9u6Hmx1etuPcYsJC5HWM9TTHhZ49bFRnzKK87SKrkAolO24hZsAByXOhEQ6G5C6Y5DtqtkskDNVv5QXTYPWB4RM var1,
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var2,
      int var3,
      int var4,
      Z7u3kXmE1Z1La5wuW43LvM3MqXi2h2heVDrb5yErQvVFes5dvNjvuTD4vtNVaxJ74kxMHODIIL6qJ5Q6XSDm9TINzbpL91BffMM7 var5
   ) {
      int var6 = this.BatModClient;
      this.CustomSpinner = var2;
      this.Button
         .setSeed(var2.ExitCode());
      long var7 = this.Button.nextLong();
      long var9 = this.Button.nextLong();

      for (int var11 = var3 - var6; var11 <= var3 + var6; var11++) {
         for (int var12 = var4 - var6; var12 <= var4 + var6; var12++) {
            long var13 = var11 * var7;
            long var15 = var12 * var9;
            this.Button
               .setSeed(var13 ^ var15 ^ var2.ExitCode());
            this.BatModClient(var2, var11, var12, var3, var4, var5);
         }
      }
   }

   protected void BatModClient(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1,
      int var2,
      int var3,
      int var4,
      int var5,
      Z7u3kXmE1Z1La5wuW43LvM3MqXi2h2heVDrb5yErQvVFes5dvNjvuTD4vtNVaxJ74kxMHODIIL6qJ5Q6XSDm9TINzbpL91BffMM7 var6
   ) {
   }
}
