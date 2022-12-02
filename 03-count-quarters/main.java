class Main {
  public static int Main(int cents){
        String count = "" + cents;
        count = count.substring(count.length()-2);
        return Integer.parseInt(count)/25;
      }
}
