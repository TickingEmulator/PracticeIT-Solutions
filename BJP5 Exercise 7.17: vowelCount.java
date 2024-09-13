public static int[] vowelCount(String s) {
  String[] c = {"a", "e", "i", "o", "u"};
  int[] cc = new int[5];
  for (int i = 0; i < s.length(); i++) {
    for (int i2 = 0; i2 < c.length; i2++) {
      if ((s.substring(i, (i + 1))).equals(c[i2])) {
        cc[i2]++;
        break;
      }
    }
  }
  return cc;
}
