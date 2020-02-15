package simpletasks;

public class Task105_PairsInArrays {

    public static void main(String[] args) {
        
        int a[] = {2, 2, 3, 4, 5, 6, 7, 8, 1, 2};
        
        System.out.println("Does the array contain the same numbers in first and last pair of numbers?: " + solution(a));
    }
    
    public static boolean solution(int a[]) {
        
        return (a[0] == a[a.length - 2] && a[1] == a[a.length - 1]);
    }
}
