public class Main {
    public static void main(String[] args){
        char harf = 'm';
        switch(harf){
            case'a':
            case 'e':
            case 'ı':
            case 'i':
            case 'o':
            case 'u':
            case 'ü':
                System.out.println(harf+" sesli harftir");
                break;
            default:
                System.out.println(harf+" sesli harf değildir");
                break;
        }

        System.out.println("---------------------------");

        char[] harfler = {'a','e','ı','i','o','ö','u','ü'};
        for(char harff:harfler){
            System.out.println(harff+" sesli harftir");
        }


    }
}
