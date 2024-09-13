public double stdev(int[] array) {
  double v = 0, avg = 0.0;
  for (int i = 0; i < array.length; i++) {
    avg += (array[i]);
  }
  avg /= array.length;
  for (int i2 = 0; i2 < array.length; i2++) {
    v += Math.pow(array[i2] - avg, 2);
  }
  return Math.sqrt((v / (array.length - 1)));
}
