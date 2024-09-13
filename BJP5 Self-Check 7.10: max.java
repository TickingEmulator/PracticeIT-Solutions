public static int max(int[] array) {
  int maxValue = array[0];
  for (int i = 0; i < array.length; i++) {
    if (array[i] > maxValue) {
      maxValue = array[i];
    }
  }
  return maxValue;
}
