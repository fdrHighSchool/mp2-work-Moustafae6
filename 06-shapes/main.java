class Main {
  public static void main(String[] args) {
    rec(2, 4);
    tri1(3);

  }

  public static void tri1(int s) {
    String star = "* ";
    for (int row = 0; row < s; row++) {
      for (int col = 0; col < 1; col++) {
        System.out.println(star);
      }
      star += "* ";
    }
  }

  public static void rec(int l, int h) {
    for (int row = 0; row < l; row++) {
      for (int col = 0; col < h; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }

  }
}
