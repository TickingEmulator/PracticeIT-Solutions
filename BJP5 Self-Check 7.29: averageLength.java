public double averageLength(String[] array) {
  double a = 0.0;
  for (int i = 0; i < array.length; i++) {
    a += array[i].length();
  }
  a /= array.length;
  return a;
}
