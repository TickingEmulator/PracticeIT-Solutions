int b = -6;
int amount = 0;
for (int i = 0; i < 45; i++) {
  if (!(b % 2 == 0)) {
    amount++;
  }
  b++;
}
int[] odds = new int[amount];
int c = -6;
int n = 0;
for (int i = 0; i < 45; i++) {
  if (!(c % 2 == 0)) {
    odds[n] = c;
    n++;
  }
  c++;
}
