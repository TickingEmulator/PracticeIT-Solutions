int[][] jagged = new int[5][];
int c = 1;
for (int i = 0; i < jagged.length; i++) {
  jagged[i] = new int[i + 1];
  for (int i2 = 0; i2 < jagged[i].length; i2++) {
    jagged[i][i2] = c;
    c++;
  }
}
