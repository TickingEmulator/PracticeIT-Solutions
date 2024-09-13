int[][] table = new int[5][10];
for (int i = 0; i < table.length; i++) {
  for (int i2 = 0; i2 < table[0].length; i2++) {
    table[i][i2] = i * i2;
  }
}
