class Main {
  public static void main(String[] args){
    System.out.println("Hello world!");
  }public static void repeatEnd(String a,int b){
    int num=a.length();
    String c=a.substring(num-b);
    for(int i=0;i<b;i++){
      System.out.print(c);
    }System.out.println("");
  }public static String firstHalf(String a){
    int num1=a.length();
    if(num1%2!=0){
      return"Not an even string";
    }else{
      return a.substring(0,num1/2);
    }
  }public static String concat(String b, String c) {
    int bleng=b.length();
    int cleng=c.length();
    if (cleng==0||bleng==0) {
      String word2=b+c;
      return word2;
    }else{
      String first=c.substring(0,1);
      String lastb=b.substring(bleng-1);
      if(lastb.equals(first)){
        String word=b+c.substring(1);
        return word;
      }else{
        String word1=b+c;
        return word1;
      }
    }
  }public static String withoutString(String a, String b){
    return a.replaceAll(b, "");
  }public static int counthi(String str){
    int count=0;
    for(int i=0;i<-str.length()-2;i++){
      if (str.substring(i,i+2).equals("hi")){
        count++;
      }
    }return count;
  }
}
