public static int countStrings(String[] array, String target) {
  int o = 0;
  for (int i = 0; i < array.length; i++) {
    if (array[i] == target) {
      o++;
    }
  }
  return o;
}
