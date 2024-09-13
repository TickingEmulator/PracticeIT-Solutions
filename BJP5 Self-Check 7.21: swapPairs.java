public static void swapPairs(String[] iv) {
  String value1 = "";
  String value2 = "";
  for (int i = 0; i < iv.length - 1; i++) {
    value1 = iv[i];
    value2 = iv[i + 1];
    iv[i] = value2;
    iv[i + 1] = value1;
    i++;
  }
}
