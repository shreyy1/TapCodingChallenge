import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Day1{
    static void One(Scanner sc)
    {
        int input = sc.nextInt();
        if (input % 3 == 0 && input % 5 == 0) {
            System.out.println("FULLSTACK");
        } else if (input % 5 == 0) {
            System.out.println("ACAD");
        } else if (input % 3 == 0) {
            System.out.println("TAP");
        } else {
            System.out.println(input);
        }
    }
}
class Day2{
    static void Two(Scanner sc){
        int input = sc.nextInt();
        for(int i=1;i<=input;i++)
        {
            if(input%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
class Day3{
        public static void Three(Scanner sc){
            int input = sc.nextInt();
        boolean flag=true;
        if(input==1||input==0)
        {
        flag=false;
        }
        for(int i=2;i<input/2;i++)
        {
       if(input%i==0){
           flag =false;
       }
        }
        if(flag)
        {
            System.out.println("prime");
        }else{
            System.out.println("Not prime");
        }
}
}
class Day4{
    public static void commonFactor()
    {
        Scanner sc =new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        for(int i=1;i<=input1&&i<=input2;i++)
        {
            if(input1%i==0&&input2%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
class Day5{
    public static void commonMultiple()
    {
        Scanner sc=new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int y = sc.nextInt();
        for(int i = 1; i<= y; i++)
        {
            System.out.println(input1 * input2 *i);
        }
    }
}
class Day6{
    public static void highestCommon(){
        Scanner sc= new Scanner(System.in);
        int gcd =-1;
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        for(int i=1;i<=input1||i<=input2;i++)
        {
            if(input1%i==0 && input2%i==0) {
                 gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
class Day7{
    public static void palindrome(int n)
    {
        Scanner sc= new Scanner(System.in);
       int input = sc.nextInt();
    }
}
class Day8{
    public static void largestElement()
    {
        Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] =sc.nextInt();
        }
       int largest =Integer.MIN_VALUE;
       for(int i=0;i<n;i++)
       {
           if(a[i]>largest)
           {
               largest = a[i];
           }
       }
        System.out.println(largest);
    }
}
class Day9{
    public static void sumElement()
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i] =sc.nextInt();
            sum += a[i];
        }
        System.out.println(sum);
    }
}
class Day10{
    public static void Occurance()
    {
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println("Enter the Element of Occurence:");
            int input = sc.nextInt();
            int count=0;
            System.out.println("Enter the Array");
            int a[] = new int[n];
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }
            for(int arr:a)
            {
                if(input==arr)
                {
                    count++;
                }
            }
        System.out.println(count);

    }
}
class Day11 {
    public static void makePair() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                System.out.print("("+a[i]+","+a[j]+"),");
            }
            System.out.print("");
        }

    }
}
class Day12{
    public static void printPairOfDiffk(){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        System.out.println("Enter the size of the array");
        int ar[] = new int[n];
        for(int i=0;i<ar.length;i++){
             ar[i] = scan.nextInt();
        }
        System.out.println("Enter the Difference ");
        int k = scan.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ar[i]-ar[j]==k)
                {
                    System.out.println(ar[i]+","+ar[j]);
                }
            }
        }
    }
}
class Day14{
    public static void occuranceOfElement(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the size of the array");
                int n= scan.nextInt();
                int c =0;
            int ar[] = new int[n];
           HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
            for(int i=0;i<ar.length;i++){
                ar[i]=scan.nextInt();
            }
            for (int i=0; i<n; i++)
            {
                if(map.containsKey(ar[i]))
                {
                   c= map.get(ar[i]);
                   map.put(ar[i],c+1);
                }else{
                    map.put(ar[i] ,1);
            }
            }
        System.out.println(map);

    }
}
class Day15 {
    public static void uniqueElement() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scan.nextInt();
        int c = 0;
        int ar[] = new int[n];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (map.containsKey(ar[i])) {
                c = map.get(ar[i]);
                map.put(ar[i], c + 1);
            } else {
                map.put(ar[i], 1);
            }
        }

        {
        System.out.println("Unique elements are:" + map.keySet());
         }
}
}
class Day16{
    public static void printAllPossibleSubArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= scan.nextInt();

        int ar[] = new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i] = scan.nextInt();
        }
        for(int i=0; i<n ; i++){
            for(int j=i; j<n ; j++){
                for(int k=i ;k<j ;k++){
                    System.out.print(ar[k]);
                }
                System.out.println();
            }
        }
}
}
class Day17{
    public static void maxSubArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= scan.nextInt();
        System.out.println("Enter the Array");
        int ar[] = new int[n];
        for(int i=0 ; i<ar.length ; i++){
            ar[i] = scan.nextInt();
        }
        System.out.println("Enter the K");
        int sum = scan.nextInt();
        int findTotal = 0;
        for(int i=0 ; i<n ; i++){
            for(int j=i ; j<n ; j++){
                for(int k=i ; k<j ;k++){
                    findTotal += ar[k];
                    if(findTotal == sum)
                    {
                        System.out.print(ar[k]+" ");
                    }
                    else {
                        findTotal = 0;
                    }
                }

            }
            findTotal = 0;
        }

    }
}
class Day19 {
    public static void reverseString(Scanner sc){
        System.out.println("Enter the String");
        String input =sc.next();
        String output="";
        for(int i=input.length()-1 ; i>=0 ; i--)
        {
            char ch =input.charAt(i);
            output += ch;
        }
        System.out.println(output);
    }
}
class Day20{
    public static void palindromeOrNot(Scanner sc)
    {
        System.out.println("Enter the String to check wheathr palindrome or not");
        String input = sc.next();
        String output ="";
        for(int i = input.length()-1 ; i>=0 ; i--)
        {
            char ch = input.charAt(i);
            output += ch;
        }
        if(input.equals(output)){
            System.out.println("Entered String is Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
class Day21 {
    public static void countVowel(Scanner sc) {
        System.out.println("Enter the String");
        String input = sc.next();
        int count = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == '0' || ch == 'o' || ch == 'u' || ch == 'U')
                count = count + 1;
        }
        System.out.println("Number of Vowels = " + count);


    }
}

class Day22 {
    public static void removeSpecialChar(Scanner sc) {
        System.out.println("Enter the String");
        String input = sc.next();
        String output ="";
        for (int i = 0; i <=input.length()-1; i++) {
            char ch = input.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
                output = output + ch;
            }
        }
        System.out.println(output);
    }
}
class Day23 {
    public static void swapCases(Scanner sc) {
        System.out.println("Enter the String");
        String input = sc.next();
        String output = "";
        for (int i = 0; i <= input.length() - 1; i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                output += (char)(ch - 32);
            } else if (ch >= 'A' && ch <= 'Z') {
                output += (char)(ch + 32);
            }
        }
        System.out.println(output);

    }
}
class Day24 {
    public static void replaceBeforeVowel(Scanner sc) {
        System.out.println("Enter the String");
        String input = sc.nextLine();
        int count = 0;
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == '0' || ch == 'o' || ch == 'u' || ch == 'U') {
                output =  output + "#"+ ch ;
            } else {
                output += ch;
            }
        }
        System.out.println(output);
    }
}

class Day25 {
    public static void printCharIndex(Scanner sc) {
        System.out.println("String: ");
        String input = sc.nextLine();
        System.out.println("Character: ");
        char find = sc.next().charAt(0);
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == find) {
                System.out.println("Index"+i);
                break;
            }
        }
    }
}
class Day26{
    public static void printCharLastIndex(Scanner sc) {
        System.out.println("String: ");
        String input = sc.nextLine();
        System.out.println("Character: ");
        char find = sc.next().charAt(0);
        String output = "";
        for (int i = input.length()-1; i >=0; i--) {
            char ch = input.charAt(i);
            if (ch == find) {
                System.out.println("Last Index: "+i);
                break;
            }
        }
    }

}
class Day27{
    public static void printSubstrings(Scanner sc) {
        System.out.println(" String:");
        String input = sc.nextLine();
        int n =input.length();
        for (int i = 0; i < n; i++) {
                for(int j = i ; j < n; j++){
                    for(int k=i ; k <= j ; k++){
                        char ch = input.charAt(k);
                        System.out.print("\" "+ ch + "\"");
                }
                    System.out.print(" ,");
            }
        }
        }

}
class Day28{
    public static void isEqualString(Scanner sc)
    {
        System.out.println("String 1:");
        String in1 = sc.next();
        System.out.println("String 2:");
        String in2 = sc.next();
        boolean flag = false;

        if(in1.length()!=in2.length())
        {
            flag = false;

        }
        for(int i=0 ; i<in1.length() ; i++)
        {
                if(in1.charAt(i)!=in2.charAt(i))
            {
                flag =false;
                break;
            }else {
                flag = true;
            }
        }
        if(flag)
        {
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }

    }
}
class Day30 {
    static void countCharacter(Scanner sc) {
        System.out.println("Input: ");
        String input = sc.next();
        HashMap<Character, Integer> map = new LinkedHashMap<>();

        int c = 0;
        for (int i = 0; i < input.length(); i++) {
            if (map.containsKey(input.charAt(i))) {
                c = map.get(input.charAt(i));
                map.put(input.charAt(i), c + 1);
            } else {
                map.put(input.charAt(i), 1);
            }
        }
        for (char ch : map.keySet()) {
            System.out.print(ch + " - " + map.get(ch)+", ");
        }
    }
}
 public class TapCodingChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        Day1.One(sc);
//        Day2.Two(sc);
//        Day3.Three(sc);
//        Day4.commonFactor();
//        Day5.commonMultiple();
//        Day6.highestCommon();
//        Day8.largestElement();
//        Day9.sumElement();
//        Day10.Occurance();
//        Day11.makePair();
//        Day12.printPairOfDiffk();
//        Day14.occuranceOfElement();
//        Day15.uniqueElement();
//        Day16.printAllPossibleSubArray();
//        Day17.maxSubArray();
//        Day19.reverseString(sc);
//        Day20.palindromeOrNot(sc);
//        Day21.countVowel(sc);
//        Day22.removeSpecialChar(sc);
//        Day23.swapCases(sc);
//        Day24.replaceBeforeVowel(sc);
//        Day25.printCharIndex(sc);
//        Day26.printCharLastIndex(sc);
//        Day27.printSubstrings(sc);
//        Day28.isEqualString(sc);
        Day30.countCharacter(sc);
    }
}